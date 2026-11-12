package ohos.ace.plugin.intlplugin;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.NumberingSystem;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes46.dex */
public class INTLPlugin {
    private static final String DEVICE_TYPE_PHONES = "phones";
    private static final String DEVICE_TYPE_TABLET = "tablet";
    private static final String LOG_TAG = "INTLPlugin";
    private static final int SQUARE = 2;
    private static final int THRESHOLD_DP = 600;
    private static final double THRESHOLD_INCH = 6.9d;
    private Context mContext;

    protected native void nativeInit();

    public INTLPlugin(Context context) {
        this.mContext = context;
        nativeInit();
    }

    public boolean is24HourClock() {
        Context context = this.mContext;
        if (context == null) {
            Log.w(LOG_TAG, "INTLPlugin: context not registered");
            return true;
        }
        return DateFormat.is24HourFormat(context);
    }

    public String getSystemLocale() {
        Locale systemLocaleCompat = getSystemLocaleCompat();
        String str = "";
        if (systemLocaleCompat != null) {
            str = "" + systemLocaleCompat.getLanguage();
            if (systemLocaleCompat.getScript().length() > 0) {
                str = str + Constants.LINK + systemLocaleCompat.getScript();
            }
            if (systemLocaleCompat.getCountry().length() > 0) {
                return str + Constants.LINK + systemLocaleCompat.getCountry();
            }
        }
        return str;
    }

    public String getSystemTimezone() {
        return TimeZone.getDefault().getID();
    }

    public String getSystemCalendar() {
        return Calendar.getInstance().getCalendarType();
    }

    public String getNumberingSystem() {
        return NumberingSystem.getInstance(LocaleList.getDefault().get(0)).getName();
    }

    public String getDeviceType() {
        Context context = this.mContext;
        if (context == null) {
            Log.e(LOG_TAG, "The mContext is null, getDeviceType failed.");
            return DEVICE_TYPE_PHONES;
        }
        if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return DEVICE_TYPE_TABLET;
        }
        return getDeviceTypeByPhysicalSize();
    }

    private String getDeviceTypeByPhysicalSize() {
        Context context = this.mContext;
        if (context == null) {
            Log.e(LOG_TAG, "The mContext is null, getDeviceTypeByPhysicalSize failed.");
            return DEVICE_TYPE_PHONES;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager == null) {
            Log.e(LOG_TAG, "The mContext is null, getDeviceTypeByPhysicalSize failed.");
            return DEVICE_TYPE_PHONES;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            Log.e(LOG_TAG, "The display is null, getDeviceTypeByPhysicalSize failed.");
            return DEVICE_TYPE_PHONES;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= THRESHOLD_INCH ? DEVICE_TYPE_TABLET : DEVICE_TYPE_PHONES;
    }

    private Locale getSystemLocaleCompat() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }
}
