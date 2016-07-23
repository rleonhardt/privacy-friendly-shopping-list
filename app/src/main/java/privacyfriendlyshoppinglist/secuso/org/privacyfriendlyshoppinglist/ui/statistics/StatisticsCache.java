package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.statistics;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.TextView;
import com.github.mikephil.charting.charts.BarChart;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.R;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.ui.settings.SettingsKeys;

/**
 * Description:
 * Author: Grebiel Jose Ifill Brito
 * Created: 23.07.16 creation date
 */
public class StatisticsCache
{
    private TextView titleTextView;
    private BarChart chart;
    private TextView totalTextView;
    private TextView currencyTextView;
    private TextView rangeFromTextView;
    private TextView rangeToTextView;
    private Spinner groupBySpinner;
    private AppCompatActivity activity;
    private String datePattern;
    private String dateLanguage;
    private String numberFormat;

    public StatisticsCache(AppCompatActivity activity)
    {
        this.activity = activity;

        titleTextView = (TextView) activity.findViewById(R.id.textview_stats_title);
        chart = (BarChart) activity.findViewById(R.id.chart);
        totalTextView = (TextView) activity.findViewById(R.id.textview_stats_total);

        currencyTextView = (TextView) activity.findViewById(R.id.textview_stats_currency);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
        String currency = prefs.getString(SettingsKeys.CURRENCY, null);
        currencyTextView.setText(currency);

        rangeFromTextView = (TextView) activity.findViewById(R.id.textview_stats_range_from);
        rangeToTextView = (TextView) activity.findViewById(R.id.textview_stats_range_to);
        groupBySpinner = (Spinner) activity.findViewById(R.id.spinner_stats_group_by);

        datePattern = activity.getResources().getString(R.string.date_short_pattern);
        dateLanguage = activity.getResources().getString(R.string.language);
        numberFormat = activity.getResources().getString(R.string.number_format);
    }

    public AppCompatActivity getActivity()
    {
        return activity;
    }

    public TextView getTitleTextView()
    {
        return titleTextView;
    }

    public BarChart getChart()
    {
        return chart;
    }

    public TextView getTotalTextView()
    {
        return totalTextView;
    }

    public TextView getRangeFromTextView()
    {
        return rangeFromTextView;
    }

    public TextView getRangeToTextView()
    {
        return rangeToTextView;
    }

    public Spinner getGroupBySpinner()
    {
        return groupBySpinner;
    }

    public String getDatePattern()
    {
        return datePattern;
    }

    public String getDateLanguage()
    {
        return dateLanguage;
    }

    public String getNumberFormat()
    {
        return numberFormat;
    }
}
