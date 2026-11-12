package com.huami.watch.companion.app;

import com.google.android.gms.stats.CodePackage;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.ximalaya.XimaCategoryActivity;
import com.huami.watch.transdata.transport.DataTransHelper;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WEATHER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class WatchDefaultWidget {
    private static final /* synthetic */ WatchDefaultWidget[] $VALUES;
    public static final WatchDefaultWidget ACTIVITY;
    public static final WatchDefaultWidget ACTIVITY_EVEREST;
    public static final WatchDefaultWidget ALARM;
    public static final WatchDefaultWidget ALARM_EVEREST;
    public static final WatchDefaultWidget ALIPAY;
    public static final WatchDefaultWidget CALENDER;
    public static final WatchDefaultWidget CALL;
    public static final WatchDefaultWidget COMPASS;
    public static final WatchDefaultWidget COMPASS_EVEREST;
    public static final WatchDefaultWidget FIND_PHONE;
    public static final WatchDefaultWidget HEALTH_QOGIR;
    public static final WatchDefaultWidget HEARTRATE;
    public static final WatchDefaultWidget HEARTRATE_EVEREST;
    public static final WatchDefaultWidget LOCATION;
    public static final WatchDefaultWidget MIHOME;
    public static final WatchDefaultWidget MI_TV_CONTROLLER;
    public static final WatchDefaultWidget MUSIC;
    public static final WatchDefaultWidget MUSIC_EVEREST;
    public static final WatchDefaultWidget PRESSURE;
    public static final WatchDefaultWidget SLEEP;
    public static final WatchDefaultWidget SLEEP_EVEREST;
    public static final WatchDefaultWidget SOGOU_MAP;
    public static final WatchDefaultWidget SPORT;
    public static final WatchDefaultWidget SPORT_HISTORY_EVEREST;
    public static final WatchDefaultWidget SPORT_STATE;
    public static final WatchDefaultWidget STOPWATCH;
    public static final WatchDefaultWidget STOPWATCH_EVEREST;
    public static final WatchDefaultWidget STRESS;
    public static final WatchDefaultWidget TIMER;
    public static final WatchDefaultWidget TIMER_EVEREST;
    public static final WatchDefaultWidget TRAININGCENTER;
    public static final WatchDefaultWidget TRAININGCENTER_EVEREST;
    public static final WatchDefaultWidget WALLET_QOGIR;
    public static final WatchDefaultWidget WEATHER;
    public static final WatchDefaultWidget WEATHER_EVEREST;
    public static final WatchDefaultWidget XIMALAYA;
    private String className;
    private int iconRes;
    private int nameRes;
    private String packageName;

    static {
        int i = R.string.widget_weather;
        WatchDefaultWidget watchDefaultWidget = new WatchDefaultWidget("WEATHER", 0, i, AppManager.WEATHER_PACKAGE, "com.huami.watch.weather.WeatherWidgetView", R.drawable.app_icon_weather);
        WEATHER = watchDefaultWidget;
        WatchDefaultWidget watchDefaultWidget2 = new WatchDefaultWidget(WebConstant.QueryParam.TYPE_ACTIVITY, 1, Config.isLocaleOversea(CompanionApplication.getContext()) ? R.string.widget_activity : R.string.widget_data_center, "com.huami.watch.health", "com.huami.watch.health.widget.StepLauncherView", R.drawable.app_icon_activity);
        ACTIVITY = watchDefaultWidget2;
        int i2 = R.string.widget_heartrate;
        WatchDefaultWidget watchDefaultWidget3 = new WatchDefaultWidget("HEARTRATE", 2, i2, "com.huami.watch.health", "com.huami.watch.health.widget.HeartLauncherView", R.drawable.app_icon_heartrate);
        HEARTRATE = watchDefaultWidget3;
        int i3 = R.string.widget_music;
        WatchDefaultWidget watchDefaultWidget4 = new WatchDefaultWidget("MUSIC", 3, i3, AppManager.MEDIAPLAYER_PACKAGE, "watch.huami.com.mediaplayer.widget.MusicLauncerView", R.drawable.app_icon_music);
        MUSIC = watchDefaultWidget4;
        WatchDefaultWidget watchDefaultWidget5 = new WatchDefaultWidget("ALIPAY", 4, R.string.widget_alipay, "com.alipay.android.hmwatch", "com.alipay.android.hmwatch.hmwidget.PayCodeView", R.drawable.app_icon_alipay);
        ALIPAY = watchDefaultWidget5;
        int i4 = R.string.widget_alarm;
        WatchDefaultWidget watchDefaultWidget6 = new WatchDefaultWidget("ALARM", 5, i4, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.AlarmClockWidget", R.drawable.app_icon_alarm);
        ALARM = watchDefaultWidget6;
        int i5 = R.string.widget_compass;
        WatchDefaultWidget watchDefaultWidget7 = new WatchDefaultWidget("COMPASS", 6, i5, AppManager.COMPASS_PACKAGE, "com.huami.watch.compass.CompassWidgetView", R.drawable.app_icon_compass);
        COMPASS = watchDefaultWidget7;
        int i6 = R.string.widget_timer;
        WatchDefaultWidget watchDefaultWidget8 = new WatchDefaultWidget("STOPWATCH", 7, i6, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.stopwatch.StopWatchWidget", R.drawable.app_icon_timer);
        STOPWATCH = watchDefaultWidget8;
        int i7 = R.string.widget_sleep;
        WatchDefaultWidget watchDefaultWidget9 = new WatchDefaultWidget("SLEEP", 8, i7, "com.huami.watch.health", "com.huami.watch.health.widget.SleepWidgetView", R.drawable.app_icon_sleep);
        SLEEP = watchDefaultWidget9;
        int i8 = R.string.widget_traint;
        WatchDefaultWidget watchDefaultWidget10 = new WatchDefaultWidget("TRAININGCENTER", 9, i8, "com.huami.watch.train", "com.huami.watch.train.ui.activity.launch.TraintLauncherView", R.drawable.app_icon_train);
        TRAININGCENTER = watchDefaultWidget10;
        WatchDefaultWidget watchDefaultWidget11 = new WatchDefaultWidget(XimaCategoryActivity.MAIN_MODULE_TOOL_KEY_NAME, 10, R.string.widget_ximalaya, "com.huami.watch.ximalayasound", "com.huami.watch.ximalayasound.XimalayaLauncherView", R.drawable.app_icon_xmly);
        XIMALAYA = watchDefaultWidget11;
        WatchDefaultWidget watchDefaultWidget12 = new WatchDefaultWidget("MIHOME", 11, R.string.widget_mijia, "com.huami.smarthome", "com.huami.smarthome.widget.SmartHomeLauncherWidget", R.drawable.app_icon_mijia);
        MIHOME = watchDefaultWidget12;
        int i9 = R.string.widget_countdown;
        WatchDefaultWidget watchDefaultWidget13 = new WatchDefaultWidget("TIMER", 12, i9, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.countdown.CountdownWidget", R.drawable.app_icon_countdown);
        TIMER = watchDefaultWidget13;
        WatchDefaultWidget watchDefaultWidget14 = new WatchDefaultWidget("MI_TV_CONTROLLER", 13, R.string.widget_mi_tv_controller, "com.huami.watch.hmtvhelper", "com.huami.watch.hmtvhelper.widget.TvLauncherView", R.drawable.app_icon_tv_controller);
        MI_TV_CONTROLLER = watchDefaultWidget14;
        WatchDefaultWidget watchDefaultWidget15 = new WatchDefaultWidget("WEATHER_EVEREST", 14, i, AppManager.WEATHER_PACKAGE, "com.huami.watch.weather.WeatherWidgetView", R.drawable.app_icon_weather_everest);
        WEATHER_EVEREST = watchDefaultWidget15;
        int i10 = R.string.widget_data_center;
        int i11 = R.drawable.app_icon_activity_everest;
        WatchDefaultWidget watchDefaultWidget16 = new WatchDefaultWidget("ACTIVITY_EVEREST", 15, i10, "com.huami.watch.health", "com.huami.watch.health.widget.StepLauncherView", i11);
        ACTIVITY_EVEREST = watchDefaultWidget16;
        WatchDefaultWidget watchDefaultWidget17 = new WatchDefaultWidget("HEARTRATE_EVEREST", 16, i2, "com.huami.watch.health", "com.huami.watch.health.widget.HeartLauncherView", R.drawable.app_icon_heartrate_everest);
        HEARTRATE_EVEREST = watchDefaultWidget17;
        WatchDefaultWidget watchDefaultWidget18 = new WatchDefaultWidget("MUSIC_EVEREST", 17, i3, AppManager.MEDIAPLAYER_PACKAGE, "watch.huami.com.mediaplayer.widget.MusicLauncerView", R.drawable.app_icon_music_everest);
        MUSIC_EVEREST = watchDefaultWidget18;
        WatchDefaultWidget watchDefaultWidget19 = new WatchDefaultWidget("ALARM_EVEREST", 18, i4, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.AlarmClockWidget", R.drawable.app_icon_alarm_everest);
        ALARM_EVEREST = watchDefaultWidget19;
        WatchDefaultWidget watchDefaultWidget20 = new WatchDefaultWidget("FIND_PHONE", 19, R.string.widget_find_phone, "com.huami.watch.hmdevices", "com.huami.watch.hmdevices.widget.HmDeviceFindLauncherView", R.drawable.ic_find_watch);
        FIND_PHONE = watchDefaultWidget20;
        WatchDefaultWidget watchDefaultWidget21 = new WatchDefaultWidget("COMPASS_EVEREST", 20, i5, AppManager.COMPASS_PACKAGE, "com.huami.watch.compass.CompassWidgetView", R.drawable.app_icon_compass_everest);
        COMPASS_EVEREST = watchDefaultWidget21;
        WatchDefaultWidget watchDefaultWidget22 = new WatchDefaultWidget("STOPWATCH_EVEREST", 21, i6, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.stopwatch.StopWatchWidget", R.drawable.app_icon_timer_everest);
        STOPWATCH_EVEREST = watchDefaultWidget22;
        WatchDefaultWidget watchDefaultWidget23 = new WatchDefaultWidget("SLEEP_EVEREST", 22, i7, "com.huami.watch.health", "com.huami.watch.health.widget.SleepWidgetView", R.drawable.app_icon_sleep_everest);
        SLEEP_EVEREST = watchDefaultWidget23;
        WatchDefaultWidget watchDefaultWidget24 = new WatchDefaultWidget("TRAININGCENTER_EVEREST", 23, i8, "com.huami.watch.train", "com.huami.watch.train.ui.activity.launch.TraintLauncherView", R.drawable.app_icon_train_everest);
        TRAININGCENTER_EVEREST = watchDefaultWidget24;
        WatchDefaultWidget watchDefaultWidget25 = new WatchDefaultWidget("TIMER_EVEREST", 24, i9, AppManager.DESKCLOCK_PACKAGE, "com.huami.watch.deskclock.countdown.CountdownWidget", R.drawable.app_icon_countdown_everest);
        TIMER_EVEREST = watchDefaultWidget25;
        WatchDefaultWidget watchDefaultWidget26 = new WatchDefaultWidget("SPORT_HISTORY_EVEREST", 25, R.string.widget_sport_history, "com.huami.watch.newsport", "com.huami.watch.newsport.widget.SportHistoryWidget", R.drawable.app_icon_sport_history_everest);
        SPORT_HISTORY_EVEREST = watchDefaultWidget26;
        WatchDefaultWidget watchDefaultWidget27 = new WatchDefaultWidget(CodePackage.LOCATION, 26, R.string.widget_location, "com.huami.watch.location", "com.huami.watch.location.ui.widget.LocationWidget", R.drawable.app_icon_location);
        LOCATION = watchDefaultWidget27;
        WatchDefaultWidget watchDefaultWidget28 = new WatchDefaultWidget(DataTransHelper.TYPE_SPORT, 27, R.string.widget_sport, "com.huami.watch.newsport", "com.huami.watch.newsport.widget.SportWidget", R.drawable.app_icon_sport);
        SPORT = watchDefaultWidget28;
        WatchDefaultWidget watchDefaultWidget29 = new WatchDefaultWidget("SOGOU_MAP", 28, R.string.widget_sogou, AppManager.SOGOU_MAP_PACKAGE, "com.sogou.map.android.maps.SplashActivity", R.drawable.app_icon_sogou);
        SOGOU_MAP = watchDefaultWidget29;
        WatchDefaultWidget watchDefaultWidget30 = new WatchDefaultWidget("CALL", 29, R.string.widget_call, AppManager.BTCALL_PACKAGE, "com.huami.btcall.widget.BtCallWidget", R.drawable.app_icon_call);
        CALL = watchDefaultWidget30;
        WatchDefaultWidget watchDefaultWidget31 = new WatchDefaultWidget("CALENDER", 30, R.string.widget_calendar, AppManager.CALENDAR_PACKAGE, "com.huami.watch.hmcalendar.widget.CalendarLauncherView", R.drawable.app_icon_calendar);
        CALENDER = watchDefaultWidget31;
        WatchDefaultWidget watchDefaultWidget32 = new WatchDefaultWidget("HEALTH_QOGIR", 31, R.string.widget_health, "com.huami.watch.health", "com.huami.watch.health.widget.StepLauncherView", i11);
        HEALTH_QOGIR = watchDefaultWidget32;
        WatchDefaultWidget watchDefaultWidget33 = new WatchDefaultWidget("WALLET_QOGIR", 32, R.string.widget_wallet, AppManager.NFC_PACKAGE, "com.huami.watch.wallet.ui.widget.WalletWidget", R.drawable.app_icon_wallet);
        WALLET_QOGIR = watchDefaultWidget33;
        WatchDefaultWidget watchDefaultWidget34 = new WatchDefaultWidget("PRESSURE", 33, R.string.widget_pressure, AppManager.COMPASS_PACKAGE, "com.huami.watch.compass.BarAltitudeWidgetView", R.drawable.app_icon_pressure);
        PRESSURE = watchDefaultWidget34;
        WatchDefaultWidget watchDefaultWidget35 = new WatchDefaultWidget("SPORT_STATE", 34, R.string.widget_sport_state, "com.huami.watch.newsport", "com.huami.watch.newsport.motionstate.widget.SportMotionStateWidget", R.drawable.app_icon_sport_state);
        SPORT_STATE = watchDefaultWidget35;
        WatchDefaultWidget watchDefaultWidget36 = new WatchDefaultWidget("STRESS", 35, R.string.widget_stress, "com.huami.watch.health", "com.huami.watch.health.pressure.widget.PressureWidget", R.drawable.app_icon_stress);
        STRESS = watchDefaultWidget36;
        $VALUES = new WatchDefaultWidget[]{watchDefaultWidget, watchDefaultWidget2, watchDefaultWidget3, watchDefaultWidget4, watchDefaultWidget5, watchDefaultWidget6, watchDefaultWidget7, watchDefaultWidget8, watchDefaultWidget9, watchDefaultWidget10, watchDefaultWidget11, watchDefaultWidget12, watchDefaultWidget13, watchDefaultWidget14, watchDefaultWidget15, watchDefaultWidget16, watchDefaultWidget17, watchDefaultWidget18, watchDefaultWidget19, watchDefaultWidget20, watchDefaultWidget21, watchDefaultWidget22, watchDefaultWidget23, watchDefaultWidget24, watchDefaultWidget25, watchDefaultWidget26, watchDefaultWidget27, watchDefaultWidget28, watchDefaultWidget29, watchDefaultWidget30, watchDefaultWidget31, watchDefaultWidget32, watchDefaultWidget33, watchDefaultWidget34, watchDefaultWidget35, watchDefaultWidget36};
    }

    private WatchDefaultWidget(String str, int i, int i2, String str2, String str3, int i3) {
        super(str, i);
        this.nameRes = i2;
        this.packageName = str2;
        this.className = str3;
        this.iconRes = i3;
    }

    public static WatchDefaultWidget valueOf(String str) {
        return (WatchDefaultWidget) Enum.valueOf(WatchDefaultWidget.class, str);
    }

    public static WatchDefaultWidget[] values() {
        return (WatchDefaultWidget[]) $VALUES.clone();
    }

    public String getClassName() {
        return this.className;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public int getNameRes() {
        return this.nameRes;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getUniqueKey() {
        return this.packageName + " " + this.className + ":" + this.nameRes;
    }
}
