package com.huami.watch.companion.app;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.WatchWidget;
import com.huami.watch.companion.app.WatchWidgetNewManager;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.event.WidgetResortEvent;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes16.dex */
public final class WatchWidgetNewManager {
    private static final String a = "WatchWidget-Manager";
    private static WatchWidgetNewManager b = null;
    private static final String c = "com.huami.watch.sport";
    private static final String d = "com.huami.watch.sport.ui.view.SportLauncherView";
    private static final String e = "com.huami.watch.newsport";
    private static final String f = "com.huami.watch.newsport.widget.SportLauncherWidget";
    private static final String g = "com.huami.watch.newsport.widget.SportHistoryWidget";
    private static final String h = "com.huami.watch.health";
    private static final String i = "com.huami.watch.health.widget.StepLauncherView";

    private WatchWidgetNewManager() {
    }

    private void b(List<WatchWidget> list, String str) throws JSONException {
        JSONArray jSONArray = new JSONArray(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            WatchWidget watchWidget = new WatchWidget();
            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
            watchWidget.packageName = jSONObject.getString("packageName");
            watchWidget.widgetClass = jSONObject.getString("widgetClass");
            watchWidget.index = jSONObject.getInt("index");
            watchWidget.enable = jSONObject.optBoolean("enable", true);
            watchWidget.title = jSONObject.getString("title");
            watchWidget.type = jSONObject.optInt("type");
            list.add(watchWidget);
        }
    }

    private List<WatchWidget> c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(i(context, WatchDefaultWidget.HEALTH_QOGIR, 0));
        arrayList.add(i(context, WatchDefaultWidget.HEARTRATE_EVEREST, 1));
        arrayList.add(i(context, WatchDefaultWidget.WALLET_QOGIR, 2));
        arrayList.add(i(context, WatchDefaultWidget.ALIPAY, 3));
        arrayList.add(i(context, WatchDefaultWidget.SPORT, 4));
        arrayList.add(i(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST, 5));
        arrayList.add(i(context, WatchDefaultWidget.WEATHER_EVEREST, 6));
        arrayList.add(i(context, WatchDefaultWidget.SLEEP_EVEREST, 7));
        arrayList.add(i(context, WatchDefaultWidget.ALARM_EVEREST, 8));
        arrayList.add(i(context, WatchDefaultWidget.STOPWATCH_EVEREST, 9));
        arrayList.add(i(context, WatchDefaultWidget.TIMER_EVEREST, 10));
        arrayList.add(i(context, WatchDefaultWidget.LOCATION, 11));
        arrayList.add(i(context, WatchDefaultWidget.PRESSURE, 12));
        arrayList.add(i(context, WatchDefaultWidget.COMPASS_EVEREST, 13));
        arrayList.add(i(context, WatchDefaultWidget.FIND_PHONE, 14));
        arrayList.add(i(context, WatchDefaultWidget.MUSIC_EVEREST, 15));
        arrayList.add(i(context, WatchDefaultWidget.XIMALAYA, 16));
        arrayList.add(i(context, WatchDefaultWidget.SPORT_STATE, 17));
        arrayList.add(i(context, WatchDefaultWidget.STRESS, 18));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WatchWidget watchWidget = (WatchWidget) arrayList.get(i2);
            watchWidget.setIndex(i2);
            int i3 = watchWidget.type;
            if (i3 != 0 && i3 != 1) {
                watchWidget.setEnable(false);
            }
        }
        return arrayList;
    }

    private List<WatchWidget> d(Context context) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtil.isCurrentOverseaEdition(context)) {
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.LOCATION));
        } else {
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALIPAY));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.XIMALAYA));
            arrayList.add(h(context, WatchDefaultWidget.MIHOME));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.LOCATION));
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((WatchWidget) arrayList.get(i2)).setIndex(i2);
        }
        return arrayList;
    }

    private List<WatchWidget> e(Context context) {
        ArrayList arrayList = new ArrayList();
        boolean zIsCurrentOverseaEdition = DeviceUtil.isCurrentOverseaEdition(context);
        boolean zIsRomWOS2 = DeviceUtil.isRomWOS2(context);
        if (zIsCurrentOverseaEdition) {
            if (zIsRomWOS2) {
                arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.ACTIVITY_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
                arrayList.add(h(context, WatchDefaultWidget.LOCATION));
            } else {
                arrayList.add(h(context, WatchDefaultWidget.WEATHER));
                arrayList.add(h(context, WatchDefaultWidget.ACTIVITY));
                arrayList.add(h(context, WatchDefaultWidget.HEARTRATE));
                arrayList.add(h(context, WatchDefaultWidget.MUSIC));
                arrayList.add(h(context, WatchDefaultWidget.ALARM));
                arrayList.add(h(context, WatchDefaultWidget.COMPASS));
                arrayList.add(h(context, WatchDefaultWidget.STOPWATCH));
                arrayList.add(h(context, WatchDefaultWidget.SLEEP));
                arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER));
                arrayList.add(h(context, WatchDefaultWidget.TIMER));
            }
        } else if (zIsRomWOS2) {
            arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ACTIVITY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALIPAY));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.XIMALAYA));
            arrayList.add(h(context, WatchDefaultWidget.MIHOME));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MI_TV_CONTROLLER));
            arrayList.add(h(context, WatchDefaultWidget.LOCATION));
        } else {
            arrayList.add(h(context, WatchDefaultWidget.WEATHER));
            arrayList.add(h(context, WatchDefaultWidget.ACTIVITY));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC));
            arrayList.add(h(context, WatchDefaultWidget.ALIPAY));
            arrayList.add(h(context, WatchDefaultWidget.ALARM));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER));
            arrayList.add(h(context, WatchDefaultWidget.XIMALAYA));
            arrayList.add(h(context, WatchDefaultWidget.MIHOME));
            arrayList.add(h(context, WatchDefaultWidget.TIMER));
            arrayList.add(h(context, WatchDefaultWidget.MI_TV_CONTROLLER));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((WatchWidget) arrayList.get(i2)).setIndex(i2);
        }
        return arrayList;
    }

    private List<WatchWidget> f(Context context) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtil.isCurrentOverseaEdition(context)) {
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.LOCATION));
        } else {
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALIPAY));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.TRAININGCENTER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.XIMALAYA));
            arrayList.add(h(context, WatchDefaultWidget.MIHOME));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.LOCATION));
            arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.CALENDER));
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WatchWidget watchWidget = (WatchWidget) arrayList.get(i2);
            watchWidget.setIndex(i2);
            if (i2 < 2) {
                watchWidget.setEnable(true);
            } else {
                watchWidget.setEnable(false);
            }
        }
        return arrayList;
    }

    private List<WatchWidget> g(Context context) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtil.isCurrentOverseaEdition(context)) {
            arrayList.add(h(context, WatchDefaultWidget.HEALTH_QOGIR));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SPORT));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.CALL));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.FIND_PHONE));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
        } else {
            arrayList.add(h(context, WatchDefaultWidget.HEALTH_QOGIR));
            arrayList.add(h(context, WatchDefaultWidget.HEARTRATE_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SPORT));
            arrayList.add(h(context, WatchDefaultWidget.SLEEP_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.SPORT_HISTORY_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.CALL));
            arrayList.add(h(context, WatchDefaultWidget.ALIPAY));
            arrayList.add(h(context, WatchDefaultWidget.WALLET_QOGIR));
            arrayList.add(h(context, WatchDefaultWidget.MIHOME));
            arrayList.add(h(context, WatchDefaultWidget.MUSIC_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.WEATHER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.ALARM_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.FIND_PHONE));
            arrayList.add(h(context, WatchDefaultWidget.TIMER_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.STOPWATCH_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.CALENDER));
            arrayList.add(h(context, WatchDefaultWidget.COMPASS_EVEREST));
            arrayList.add(h(context, WatchDefaultWidget.XIMALAYA));
            arrayList.add(h(context, WatchDefaultWidget.MI_TV_CONTROLLER));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WatchWidget watchWidget = (WatchWidget) arrayList.get(i2);
            watchWidget.setIndex(i2);
            watchWidget.setEnable(false);
        }
        return arrayList;
    }

    public static WatchWidgetNewManager get() {
        synchronized (WatchWidgetNewManager.class) {
            if (b == null) {
                b = new WatchWidgetNewManager();
            }
        }
        return b;
    }

    private WatchWidget h(Context context, WatchDefaultWidget watchDefaultWidget) {
        return new WatchWidget(watchDefaultWidget.getPackageName(), watchDefaultWidget.getClassName(), context.getResources().getString(watchDefaultWidget.getNameRes()), watchDefaultWidget.getIconRes());
    }

    private WatchWidget i(Context context, WatchDefaultWidget watchDefaultWidget, int i2) {
        return new WatchWidget(watchDefaultWidget.getPackageName(), watchDefaultWidget.getClassName(), context.getResources().getString(watchDefaultWidget.getNameRes()), watchDefaultWidget.getIconRes(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int m(WatchWidget watchWidget, WatchWidget watchWidget2) {
        return watchWidget.index - watchWidget2.index;
    }

    private void n(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = UserSettings.getString(contentResolver, UserSettingsKeys.KEY_WIDGET);
        if (!TextUtils.isEmpty(string)) {
            try {
                Object objNextValue = new JSONTokener(string).nextValue();
                if (objNextValue instanceof JSONObject) {
                    JSONObject jSONObject = new JSONObject(string);
                    jSONObject.put(str, "");
                    UserSettings.putString(contentResolver, UserSettingsKeys.KEY_WIDGET, jSONObject.toString());
                } else if (objNextValue instanceof JSONArray) {
                    UserSettings.putString(contentResolver, UserSettingsKeys.KEY_WIDGET, "");
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        Log.d(a, "Reset Widget,model:" + str + "\nwidget:" + UserSettings.getString(contentResolver, UserSettingsKeys.KEY_WIDGET), new Object[0]);
    }

    private List<WatchWidget> o(Context context, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        String string = UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WIDGET);
        StringBuilder sb = new StringBuilder();
        sb.append("WidgetSettings: ");
        if (string == null) {
            str2 = null;
        } else {
            str2 = "\"" + string + "\"";
        }
        sb.append(str2);
        Log.d(a, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(string) || "null".equals(string)) {
            arrayList.addAll(k(context, str));
        } else {
            try {
                Object objNextValue = new JSONTokener(string).nextValue();
                if (objNextValue instanceof JSONObject) {
                    String strOptString = new JSONObject(string).optString(str);
                    if (TextUtils.isEmpty(strOptString)) {
                        arrayList.addAll(k(context, str));
                    } else {
                        b(arrayList, strOptString);
                        r(context, arrayList, str);
                    }
                } else if (objNextValue instanceof JSONArray) {
                    UserSettings.putString(context.getContentResolver(), UserSettingsKeys.KEY_WIDGET, "");
                    b(arrayList, string);
                    r(context, arrayList, str);
                    p(context, arrayList, str);
                    if (DeviceSource.isModelEverest(str)) {
                        arrayList.clear();
                        arrayList.addAll(k(context, str));
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    private String q(List<WatchWidget> list, int i2) {
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < size; i3++) {
            WatchWidget watchWidget = list.get(i3);
            if (watchWidget != null) {
                sb.append("{\"pkg\":\"" + watchWidget.packageName + "\", \"cls\":\"" + watchWidget.widgetClass + "\", \"srl\":\"" + (watchWidget.index + i2) + "\", \"title\":\"" + watchWidget.title + "\", \"enable\":\"" + (watchWidget.enable ? 1 : 0) + "\"}");
                if (i3 != size - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private void r(Context context, List<WatchWidget> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList<WatchWidget> arrayList = new ArrayList();
        List<WatchWidget> listK = k(context, str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= listK.size()) {
                break;
            }
            WatchWidget watchWidget = listK.get(i2);
            for (WatchWidget watchWidget2 : list) {
                if (watchWidget2.getIdentify().equals(watchWidget.getIdentify())) {
                    int i4 = watchWidget2.index;
                    if (i4 != watchWidget.index) {
                        watchWidget.setIndex(i4);
                    }
                    watchWidget.setEnable(watchWidget2.enable);
                    i3++;
                    z = false;
                    break;
                }
            }
            if (z) {
                arrayList.add(watchWidget);
            }
            i2++;
        }
        for (WatchWidget watchWidget3 : arrayList) {
            watchWidget3.setIndex(i3);
            i3++;
            Log.d(a, "New Widget:" + watchWidget3.toString(), new Object[0]);
        }
        list.clear();
        list.addAll(listK);
        Collections.sort(list, new Comparator() { // from class: ql8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return WatchWidgetNewManager.m((WatchWidget) obj, (WatchWidget) obj2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public String getSyncWidgetToWatchJsonStr(Context context, String str) {
        List<WatchWidget> listJ = j(context, str);
        if (listJ == null) {
            return null;
        }
        int i2 = 1;
        if (DeviceSource.isSeriesEverest2(str)) {
            i2 = 0;
        } else if (DeviceSource.isModelEverest(str)) {
            if (DeviceUtil.isSupportWidgetManager2(DeviceManager.getManager(context).findByModel(str))) {
                i2 = 0;
            } else {
                int i3 = R.string.sport;
                listJ.add(0, new WatchWidget(-3, "com.huami.watch.newsport", f, context.getString(i3), null, true));
                listJ.add(1, new WatchWidget(-2, "com.huami.watch.newsport", g, context.getString(i3), null, true));
                listJ.add(2, new WatchWidget(-1, "com.huami.watch.health", i, context.getString(i3), null, true));
                i2 = 3;
            }
        } else if (DeviceSource.isModelQogir(str)) {
            i2 = 0;
        } else if (DeviceUtil.isRomWOS2(context)) {
            listJ.add(0, new WatchWidget(-1, "com.huami.watch.newsport", f, context.getString(R.string.sport), null, true));
        } else {
            listJ.add(0, new WatchWidget(-1, "com.huami.watch.sport", d, context.getString(R.string.sport), null, true));
        }
        String str2 = "{\"data\":[\n" + q(listJ, i2) + "\n]\n}";
        Log.d(a, "Sync widget to watch json:" + str2, new Object[0]);
        return str2;
    }

    public List<WatchWidget> j(Context context, String str) {
        return o(context, str);
    }

    public List<WatchWidget> k(Context context, String str) {
        if (DeviceSource.isSeriesEverest2(str)) {
            return c(context);
        }
        if (DeviceSource.isModelEverest(str)) {
            return DeviceUtil.isSupportWidgetManager2(DeviceManager.getManager(context).findByModel(str)) ? f(context) : d(context);
        }
        return DeviceSource.isModelQogir(str) ? g(context) : e(context);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    public List<SmartWatchProfile.BleWidget> l(Context context, String str) {
        ArrayList arrayList;
        String string = UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WIDGET);
        Log.d(a, "Saved Widgets Json: " + string, new Object[0]);
        if (TextUtils.isEmpty(string)) {
            arrayList = null;
        } else {
            try {
                if (new JSONTokener(string).nextValue() instanceof JSONObject) {
                    String strOptString = new JSONObject(string).optString(str);
                    if (TextUtils.isEmpty(strOptString)) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        try {
                            b(arrayList, strOptString);
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                } else {
                    arrayList = null;
                }
            } catch (JSONException e3) {
                e = e3;
                arrayList = null;
            }
        }
        if (ArraysUtil.isEmpty(arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (WatchWidget watchWidget : arrayList) {
            SmartWatchProfile.BleWidget bleWidget = new SmartWatchProfile.BleWidget();
            bleWidget.enabled = watchWidget.enable;
            bleWidget.index = watchWidget.index;
            bleWidget.type = watchWidget.type;
            arrayList2.add(bleWidget);
        }
        return arrayList2;
    }

    public void p(Context context, List<WatchWidget> list, String str) {
        String string;
        if (list == null || context == null) {
            return;
        }
        String string2 = "";
        try {
            String string3 = UserSettings.getString(context.getContentResolver(), UserSettingsKeys.KEY_WIDGET);
            JSONObject jSONObject = TextUtils.isEmpty(string3) ? new JSONObject() : new JSONObject(string3);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < list.size(); i2++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", list.get(i2).packageName);
                jSONObject2.put("widgetClass", list.get(i2).widgetClass);
                jSONObject2.put("index", list.get(i2).index);
                jSONObject2.put("enable", list.get(i2).enable);
                jSONObject2.put("title", list.get(i2).title);
                jSONObject2.put("type", list.get(i2).type);
                jSONArray.put(jSONObject2);
            }
            string2 = jSONArray.toString();
            jSONObject.put(str, string2);
            string = jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            string = string2;
        }
        Log.d(a, "Save widget : " + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + string, new Object[0]);
        UserSettings.putString(context.getContentResolver(), UserSettingsKeys.KEY_WIDGET, string);
        UserSettingsManager.getManager(context).syncAllToCloudAsync();
    }

    public void resetDefaultWidgetSequence(Context context, String str) {
        Log.d(a, "Reset default widget order", new Object[0]);
        n(context, str);
        RxBus.get().post(new WidgetResortEvent());
    }
}
