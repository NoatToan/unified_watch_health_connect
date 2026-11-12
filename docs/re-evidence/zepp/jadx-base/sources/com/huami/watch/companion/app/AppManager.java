package com.huami.watch.companion.app;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.ui.bean.AppInfo;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AppManager {
    public static final String ALIPAY_PACKAGE = "com.eg.android.AlipayGphone";
    public static final String BTCALL_PACKAGE = "com.huami.watch.btcall";
    public static final String CALENDAR_PACKAGE = "com.huami.watch.hmcalendar";
    public static final String COMPASS_PACKAGE = "com.huami.watch.compass";
    public static final String DESKCLOCK_PACKAGE = "com.huami.watch.deskclock";
    public static final String DESKCLOCK_STOPWATCH_PACKAGE = "com.huami.watch.deskclock/com.huami.watch.deskclock.stopwatch.StopWatchLauncherActivity";
    public static final String FILE_TRANSPORT_PACKAGE = "com.huami.watch.file.transport";
    public static final String FIND_WATCH_PACKAGE = "com.huami.watch.find.watch";
    public static final String HEALTH_HEART_PACKAGE = "com.huami.watch.health/com.huami.watch.health.HeartLauncherActivity";
    public static final String HEALTH_PACKAGE = "com.huami.watch.health";
    public static final String HEALTH_PACKAGE_NEW = "com.huami.watch.fitness";
    public static final String HEALTH_SLEEP_PACKAGE = "com.huami.watch.health/com.huami.watch.health.SleepLauncherActivity";
    public static final String HMDESKCLOCK_PACKAGE = "com.huami.watch.deskclock/com.huami.watch.deskclock.countdown.CountdownLauncherActivity";
    public static final String HUA_AI_VOICE_PACKAGE = "com.huami.watch.hmvoice";
    public static final String LAN_REN_TING_SHU = "bubei.tingshu.wear";
    public static final String LVMI_PACKAGE = "com.huami.watch.lvmi";
    public static final String MEDIAPLAYER_PACKAGE = "watch.huami.com.mediaplayer";
    public static final String MESSENGER_PACKAGE = "com.huami.watch.messenger";
    public static final String MIHOME_PACKAGE = "com.huami.smarthome";
    public static final String NFC_PACKAGE = "com.huami.watch.wallet";
    public static final String SETTING_PACKAGE = "com.huami.mobile.watchsettings";
    public static final String SOGOU_MAP_PACKAGE = "com.sogou.map.android.maps";
    public static final String SPORT_LOG_PACKAGE = "com.huami.watch.newsport/com.huami.watch.newsport.ui.history.SportHistoryActivity";
    public static final String SPORT_PACKAGE = "com.huami.watch.newsport";
    public static final String TENCENT_QQ_MUSIC_PACKAGE = "com.tencent.qqmusicwatch";
    public static final String TENCENT_QQ_PACKAGE = "com.tencent.qqlite";
    public static final String TENCENT_TRANSLATOR_PACKAGE = "com.qb.qtranslator";
    public static final String WEATHER_PACKAGE = "com.huami.watch.weather";
    public static final String XMLY_PACKAGE = "com.huami.watch.xmly";
    private static final String a = "com.huami.watch";

    public static Map<String, AppInfo> getAllAppList(Context context) {
        HashMap map = new HashMap();
        map.put(BTCALL_PACKAGE, new AppInfo(BTCALL_PACKAGE, context.getString(R.string.widget_call), R.drawable.xihu_app_icon_call));
        map.put(MESSENGER_PACKAGE, new AppInfo(MESSENGER_PACKAGE, R.drawable.xihu_app_icon_messenger));
        map.put("com.huami.watch.health", new AppInfo("com.huami.watch.health", context.getString(R.string.widget_health), 1, R.drawable.xihu_app_icon_health));
        map.put(HEALTH_HEART_PACKAGE, new AppInfo(HEALTH_HEART_PACKAGE, context.getString(R.string.widget_heartrate), 1, R.drawable.xihu_app_icon_health_heart));
        map.put(HEALTH_SLEEP_PACKAGE, new AppInfo(HEALTH_SLEEP_PACKAGE, R.drawable.xihu_app_icon_health_sleep));
        int i = R.drawable.xihu_app_icon_mihome;
        map.put("com.huami.smarthome", new AppInfo("com.huami.smarthome", i));
        map.put("com.huami.watch.newsport", new AppInfo("com.huami.watch.newsport", context.getString(R.string.sport), 1, R.drawable.xihu_app_icon_sport));
        map.put(SPORT_LOG_PACKAGE, new AppInfo(SPORT_LOG_PACKAGE, R.drawable.xihu_app_icon_sport_log));
        map.put("com.eg.android.AlipayGphone", new AppInfo("com.eg.android.AlipayGphone", R.drawable.xihu_app_icon_alipay));
        map.put(SETTING_PACKAGE, new AppInfo(SETTING_PACKAGE, R.drawable.xihu_app_icon_setting));
        map.put(HUA_AI_VOICE_PACKAGE, new AppInfo(HUA_AI_VOICE_PACKAGE, R.drawable.xihu_app_icon_hmvoice));
        map.put(SOGOU_MAP_PACKAGE, new AppInfo(SOGOU_MAP_PACKAGE, R.drawable.xihu_app_icon_sogo_map));
        if (!GlobalConfig.get().isBuildAmazfit()) {
            map.put(NFC_PACKAGE, new AppInfo(NFC_PACKAGE, context.getString(R.string.nfc_wallet), 1, R.drawable.xihu_app_icon_nfc));
        }
        map.put(WEATHER_PACKAGE, new AppInfo(WEATHER_PACKAGE, context.getString(R.string.widget_weather), 1, R.drawable.xihu_app_icon_weather));
        map.put(COMPASS_PACKAGE, new AppInfo(COMPASS_PACKAGE, R.drawable.xihu_app_icon_compass));
        if (!GlobalConfig.get().isBuildAmazfit()) {
            map.put(XMLY_PACKAGE, new AppInfo(XMLY_PACKAGE, context.getString(R.string.ximalaya), 1, R.drawable.xihu_app_icon_xmlay));
        }
        map.put(FILE_TRANSPORT_PACKAGE, new AppInfo(FILE_TRANSPORT_PACKAGE, context.getString(R.string.file_manager), 1, R.drawable.xihu_app_icon_file_manager));
        map.put(LVMI_PACKAGE, new AppInfo(LVMI_PACKAGE, context.getString(R.string.lvmi_name), 1, i));
        map.put(FIND_WATCH_PACKAGE, new AppInfo(FIND_WATCH_PACKAGE, context.getString(R.string.find_watch), 1, R.drawable.xihu_app_icon_find_watch));
        map.put(HMDESKCLOCK_PACKAGE, new AppInfo(HMDESKCLOCK_PACKAGE, R.drawable.xihu_app_icon_countdown));
        map.put(DESKCLOCK_STOPWATCH_PACKAGE, new AppInfo(DESKCLOCK_STOPWATCH_PACKAGE, R.drawable.xihu_app_icon_deskclock_stopwatch));
        map.put(CALENDAR_PACKAGE, new AppInfo(CALENDAR_PACKAGE, R.drawable.xihu_app_icon_calendar));
        map.put(DESKCLOCK_PACKAGE, new AppInfo(DESKCLOCK_PACKAGE, context.getString(R.string.widget_alarm), 1, R.drawable.xihu_app_icon_alarm));
        map.put(MEDIAPLAYER_PACKAGE, new AppInfo(MEDIAPLAYER_PACKAGE, R.drawable.xihu_app_icon_music));
        map.put(TENCENT_QQ_MUSIC_PACKAGE, new AppInfo(TENCENT_QQ_MUSIC_PACKAGE, R.drawable.xihu_app_icon_tencent_music));
        map.put(TENCENT_TRANSLATOR_PACKAGE, new AppInfo(TENCENT_TRANSLATOR_PACKAGE, R.drawable.xihu_app_icon_tencent_translator));
        map.put("com.tencent.qqlite", new AppInfo("com.tencent.qqlite", R.drawable.xihu_app_icon_tencent_qq));
        map.put(HEALTH_PACKAGE_NEW, new AppInfo(HEALTH_PACKAGE_NEW, context.getString(R.string.widget_activity), 1, R.drawable.xihu_app_icon_health_new));
        map.put(LAN_REN_TING_SHU, new AppInfo(LAN_REN_TING_SHU, context.getString(R.string.widget_lanrentingshu), R.drawable.xihu_app_icon_lanrentingshu));
        return map;
    }

    public static Map<String, AppInfo> getAppSettingList(Context context) {
        Map<String, AppInfo> allAppList = getAllAppList(context);
        if (allAppList.containsKey("com.huami.watch.newsport")) {
            allAppList.get("com.huami.watch.newsport").setIconRes(R.drawable.ic_setting_app_sport);
        }
        if (allAppList.containsKey(WEATHER_PACKAGE)) {
            allAppList.get(WEATHER_PACKAGE).setIconRes(R.drawable.ic_setting_app_weather);
        }
        if (allAppList.containsKey(XMLY_PACKAGE)) {
            allAppList.get(XMLY_PACKAGE).setIconRes(R.drawable.ic_setting_app_xmly);
        }
        if (allAppList.containsKey(DESKCLOCK_PACKAGE)) {
            allAppList.get(DESKCLOCK_PACKAGE).setIconRes(R.drawable.ic_setting_app_alarm);
        }
        if (allAppList.containsKey(FILE_TRANSPORT_PACKAGE)) {
            allAppList.get(FILE_TRANSPORT_PACKAGE).setIconRes(R.drawable.ic_setting_app_file_transport);
        }
        if (allAppList.containsKey(NFC_PACKAGE)) {
            allAppList.get(NFC_PACKAGE).setIconRes(R.drawable.ic_setting_app_bus_card);
        }
        if (allAppList.containsKey(LVMI_PACKAGE)) {
            allAppList.get(LVMI_PACKAGE).setIconRes(R.drawable.ic_setting_app_lvmi);
        }
        if (allAppList.containsKey(FIND_WATCH_PACKAGE)) {
            allAppList.get(FIND_WATCH_PACKAGE).setIconRes(R.drawable.ic_find_watch);
        }
        if (allAppList.containsKey(HEALTH_HEART_PACKAGE)) {
            allAppList.get(HEALTH_HEART_PACKAGE).setIconRes(R.drawable.ic_heart_rate);
        }
        if (allAppList.containsKey("com.huami.watch.health")) {
            allAppList.get("com.huami.watch.health").setIconRes(R.drawable.app_icon_activity_everest);
        }
        if (allAppList.containsKey(HEALTH_PACKAGE_NEW)) {
            allAppList.get(HEALTH_PACKAGE_NEW).setIconRes(R.drawable.app_icon_activity_everest);
        }
        return allAppList;
    }
}
