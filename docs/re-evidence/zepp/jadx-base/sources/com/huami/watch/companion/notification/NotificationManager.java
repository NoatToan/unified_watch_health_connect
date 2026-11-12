package com.huami.watch.companion.notification;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import com.huami.watch.companion.cloud.api.AppSettingsAPI;
import com.huami.watch.companion.common.AppSettingsKeys;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationManager {
    public static final boolean ENABLE = true;
    public static final String SELF_PACKAGE_NAME = "com.huami.watch.hmwatchmanager";
    public static final String TAG = "Noti-Manager";
    private static final String i = "AppPkg";
    private static final String j = "AppOn";
    private static final String k = "Pkg";
    private static final String l = "ON";
    private static NotificationManager m;
    private Context b;
    private NotificationSmartFilter g;
    private NotificationKeywordFilter h;
    private final List<NotificationApp> a = new ArrayList();
    private final AtomicBoolean c = new AtomicBoolean();
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean();

    public static class NotificationKeywordFilter {
        private static final String d = "Noti-Manager-KeywordFilter";
        private static final String e = "wechat";
        private static NotificationKeywordFilter f;
        private Context a;
        private final List<String> b = new ArrayList();
        private final AtomicBoolean c = new AtomicBoolean();

        private NotificationKeywordFilter(Context context) {
            this.a = context;
        }

        private void a() {
            this.c.set(c(false));
        }

        private void b() {
            synchronized (this.b) {
                this.b.clear();
                this.b.addAll(d());
            }
        }

        private boolean c(boolean z) {
            if (UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON) == null && UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON_OLD) != null) {
                UserSettings.putBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON, UserSettings.getBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON_OLD, z));
            }
            boolean z2 = UserSettings.getBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON, z);
            Log.d(d, "Read IsKeywordFilterON : " + z2, new Object[0]);
            return z2;
        }

        @NonNull
        private List<String> d() {
            ArrayList arrayList = new ArrayList();
            String str = UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORDS);
            if (TextUtils.isEmpty(str)) {
                str = UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORDS_OLD);
                if (!TextUtils.isEmpty(str)) {
                    UserSettings.putString(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORDS, str);
                }
            }
            if (TextUtils.isEmpty(str)) {
                Log.d(d, "Read Keywords Empty : " + str, new Object[0]);
                return arrayList;
            }
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("wechat");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i));
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            Log.d(d, "Read Keywords, Count: " + arrayList.size(), new Object[0]);
            return arrayList;
        }

        private void e(boolean z) {
            Log.d(d, "Save IsKeywordFilterON : " + z, new Object[0]);
            UserSettings.putBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORD_ON, z);
        }

        private void f(@Nullable List<String> list) {
            JSONObject jSONObject = new JSONObject();
            if (list != null) {
                try {
                    if (list.size() == 0) {
                        Log.d(d, "Save Keywords Empty : " + list, new Object[0]);
                        jSONObject.put("wechat", "");
                    } else {
                        Log.d(d, "Save Keywords, Count: " + list.size(), new Object[0]);
                        JSONArray jSONArray = new JSONArray();
                        Iterator<String> it2 = list.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put(it2.next());
                        }
                        jSONObject.put("wechat", jSONArray);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                Log.d(d, "Save Keywords Empty : " + list, new Object[0]);
                jSONObject.put("wechat", "");
            }
            UserSettings.put(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_FILTER_KEYWORDS, jSONObject.toString());
        }

        public static NotificationKeywordFilter getFilter(Context context) {
            if (f == null) {
                f = new NotificationKeywordFilter(context);
            }
            return f;
        }

        public void addKeyword(String str) {
            Log.d(d, "Add keyword : " + str, new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (this.b) {
                if (!this.b.contains(str)) {
                    this.b.add(str);
                    f(this.b);
                }
            }
        }

        @NonNull
        public List<String> getKeywords() {
            ArrayList arrayList = new ArrayList();
            synchronized (this.b) {
                arrayList.addAll(this.b);
            }
            return arrayList;
        }

        public void init() {
            b();
            a();
        }

        public boolean isFiltered(String str, String[] strArr) {
            boolean z;
            boolean z2;
            if (!NotificationUtil.i(str)) {
                return false;
            }
            boolean zIsKeywordFilterON = isKeywordFilterON();
            Log.d(d, "Is KeywordFilter ON : " + zIsKeywordFilterON, new Object[0]);
            if (!zIsKeywordFilterON) {
                return false;
            }
            if (this.b.size() == 0) {
                Log.d(d, "Is Keywords list Empty!!", new Object[0]);
                return false;
            }
            Iterator<String> it2 = this.b.iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                }
                if (!TextUtils.isEmpty(it2.next())) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                Log.d(d, "Is all Keywords Empty!!", new Object[0]);
                return false;
            }
            if (strArr == null || strArr.length == 0) {
                return false;
            }
            if (Config.isDebug()) {
                Log.d(d, "Is Filter by Keywords : " + Arrays.toString(this.b.toArray()) + ", Contents : " + Arrays.toString(strArr), new Object[0]);
            }
            loop1: for (String str2 : this.b) {
                for (String str3 : strArr) {
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && str3.contains(str2)) {
                        z = false;
                        break loop1;
                    }
                }
            }
            Log.d(d, "Is Filter : " + z, new Object[0]);
            return z;
        }

        public boolean isKeywordFilterON() {
            return this.c.get();
        }

        public void removeKeyword(String str) {
            Log.d(d, "Remove keyword : " + str, new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            synchronized (this.b) {
                if (this.b.contains(str)) {
                    this.b.remove(str);
                    f(this.b);
                }
            }
        }

        public void setKeywordFilterON(boolean z) {
            this.c.set(z);
            e(z);
        }
    }

    public static class NotificationSmartFilter {
        private static final String e = "Noti-Manager-SmartFilter";
        private static NotificationSmartFilter f;
        private Context a;
        private final List<String> b = new ArrayList();
        private final List<String> c = new ArrayList();
        private final AtomicBoolean d = new AtomicBoolean();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                NotificationSmartFilter.this.pullSmartFilterList();
            }
        }

        private NotificationSmartFilter(Context context) {
            this.a = context;
        }

        private List<String> a(String str) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.getJSONObject(i).getString("pkgName"));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return arrayList;
        }

        private void b() {
            synchronized (this.b) {
                this.b.clear();
                this.b.addAll(f());
            }
        }

        private void c() {
            this.d.set(e());
        }

        private void d() {
            synchronized (this.c) {
                this.c.clear();
                this.c.addAll(g());
            }
        }

        private boolean e() {
            boolean z = UserSettings.getBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_ON, true);
            Log.d(e, "Read IsSmartFilterON : " + z, new Object[0]);
            return z;
        }

        private List<String> f() {
            Box box;
            ArrayList arrayList = new ArrayList();
            String string = Box.getBox(this.a, NotificationManager.TAG).getString(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_BLACKLIST);
            if (TextUtils.isEmpty(string) && (box = Box.get()) != null) {
                string = box.getString(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_BLACKLIST);
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string2 = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            Log.d(e, "Read Saved Blacklist Apps : " + string + ", Count : " + arrayList.size(), new Object[0]);
            return arrayList;
        }

        private List<String> g() {
            ArrayList arrayList = new ArrayList();
            String string = Box.getBox(this.a, NotificationManager.TAG).getString(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_WHITELIST);
            if (TextUtils.isEmpty(string)) {
                string = Box.get().getString(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_WHITELIST);
            }
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string2 = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            Log.d(e, "Read Saved Whitelist Apps : " + string + ", Count : " + arrayList.size(), new Object[0]);
            return arrayList;
        }

        public static NotificationSmartFilter getFilter(Context context) {
            if (f == null) {
                f = new NotificationSmartFilter(context.getApplicationContext());
            }
            return f;
        }

        private void h(List<String> list) {
            if (list == null || list.size() == 0) {
                Log.d(e, "Save Blacklist Apps : [], Count : 0", new Object[0]);
                Box.getBox(this.a, NotificationManager.TAG).put(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_BLACKLIST, "");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            String string = jSONArray.toString();
            Log.d(e, "Save Blacklist Apps : , Count : " + list.size(), new Object[0]);
            Box.getBox(this.a, NotificationManager.TAG).put(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_BLACKLIST, string);
        }

        private void i(boolean z) {
            Log.d(e, "Save IsSmartFilterON : " + z, new Object[0]);
            UserSettings.putBoolean(this.a.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_ON, z);
        }

        private void j(List<String> list) {
            if (list == null || list.size() == 0) {
                Log.d(e, "Save Whitelist Apps : [], Count : 0", new Object[0]);
                Box.getBox(this.a, NotificationManager.TAG).put(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_WHITELIST, "");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            String string = jSONArray.toString();
            Log.d(e, "Save Whitelist Apps : , Count : " + list.size(), new Object[0]);
            Box.getBox(this.a, NotificationManager.TAG).put(AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_WHITELIST, string);
        }

        public void asyncPullSmartFilterList() {
            Rx.io(new a()).safeSubscribe();
        }

        public List<String> getAllBlacklistApps() {
            ArrayList arrayList = new ArrayList();
            synchronized (this.b) {
                arrayList.addAll(this.b);
            }
            return arrayList;
        }

        public boolean hasApp(String str) {
            boolean zContains;
            synchronized (this.b) {
                zContains = this.b.contains(str);
            }
            return zContains;
        }

        public boolean hasAppInWhitelist(String str) {
            boolean zContains;
            synchronized (this.c) {
                zContains = this.c.contains(str);
            }
            return zContains;
        }

        public void init() {
            b();
            d();
            c();
        }

        public boolean isSmartFilterON() {
            return this.d.get();
        }

        public void pullSmartFilterList() throws JSONException {
            String appSettings = AppSettingsAPI.getAppSettings(this.a, AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_BLACKLIST);
            if (appSettings != null) {
                List<String> arrayList = new ArrayList<>();
                if (!TextUtils.isEmpty(appSettings)) {
                    arrayList = a(appSettings);
                }
                synchronized (this.b) {
                    this.b.clear();
                    this.b.addAll(arrayList);
                    h(this.b);
                }
            }
            String appSettings2 = AppSettingsAPI.getAppSettings(this.a, AppSettingsKeys.KEY_NOTIFICATION_SMART_FILTER_WHITELIST);
            if (appSettings2 != null) {
                List<String> arrayList2 = new ArrayList<>();
                if (!TextUtils.isEmpty(appSettings2)) {
                    arrayList2 = a(appSettings2);
                }
                synchronized (this.c) {
                    this.c.clear();
                    this.c.addAll(arrayList2);
                    j(this.c);
                }
            }
        }

        public void setSmartFilterON(boolean z) {
            this.d.set(z);
            i(z);
        }
    }

    private NotificationManager(Context context) {
        this.b = context;
        this.g = NotificationSmartFilter.getFilter(context);
        this.h = NotificationKeywordFilter.getFilter(context);
    }

    private void a() {
        b();
        c();
        preloadIsWatchNoDisturbON();
        preloadIsSportSyncSuccessON();
        this.g.init();
        this.h.init();
    }

    private void b() {
        synchronized (this.a) {
            this.a.clear();
            this.a.addAll(f());
        }
    }

    private void c() {
        this.c.set(d());
        g();
    }

    private boolean d() {
        boolean z = UserSettings.getBoolean(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_USER_ON, true);
        Log.d(TAG, "Read IsUserON : " + z, new Object[0]);
        return z;
    }

    private boolean e(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            String strOptString = new JSONObject(str).optString("s.nodisturb");
            if (TextUtils.isEmpty(strOptString)) {
                return z;
            }
            z = Boolean.valueOf(strOptString).booleanValue();
            Log.d(TAG, "Read Is WatchNoDisturb ON : " + z, new Object[0]);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w(TAG, "Parse WatchNoDisturb Err!!", e, new Object[0]);
            return z;
        }
    }

    private List<NotificationApp> f() {
        boolean zOptBoolean;
        ArrayList arrayList = new ArrayList();
        String string = UserSettings.getString(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_BLACKLIST);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    NotificationApp notificationApp = new NotificationApp();
                    String strOptString = jSONObject.optString(i);
                    if (TextUtils.isEmpty(strOptString)) {
                        strOptString = jSONObject.getString(k);
                        zOptBoolean = jSONObject.getBoolean("ON");
                    } else {
                        zOptBoolean = jSONObject.optBoolean(j, false);
                    }
                    notificationApp.packageName = strOptString;
                    notificationApp.on = zOptBoolean;
                    if (!TextUtils.isEmpty(strOptString)) {
                        arrayList.add(notificationApp);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "Read Saved Apps : " + string + ", Count : " + arrayList.size(), new Object[0]);
        return arrayList;
    }

    private void g() {
        String str = UserSettings.get(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION);
        Log.d(TAG, "Read Settings : " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            this.d.set(false);
            return;
        }
        try {
            this.d.set(new JSONObject(str).optBoolean(UserSettingsKeys.SUB_KEY_NOTIFICATION_SCREEN_ON_IGNORE, false));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static List<ApplicationInfo> getInstalledPackages(Context context, int i2) {
        try {
            return context.getPackageManager().getInstalledApplications(i2);
        } catch (Exception e) {
            Log.w(TAG, "GetInstalledApplications Error!!", e, new Object[0]);
            return null;
        }
    }

    public static List<ApplicationInfo> getInstalledPackagesFallback(Context context, int i2) throws Throwable {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("pm list packages");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            arrayList.add(packageManager.getApplicationInfo(line.substring(line.indexOf(58) + 1), i2));
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    processExec.waitFor();
                    bufferedReader2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Exception e4) {
                e = e4;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static NotificationManager getManager(Context context) {
        if (m == null) {
            Log.d(TAG, "Init...", new Object[0]);
            NotificationManager notificationManager = new NotificationManager(context.getApplicationContext());
            m = notificationManager;
            notificationManager.a();
        }
        return m;
    }

    private void h(List<NotificationApp> list) {
        if (list == null || list.size() == 0) {
            Log.d(TAG, "Save Apps : [], Count : 0", new Object[0]);
            UserSettings.putString(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_BLACKLIST, "");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (NotificationApp notificationApp : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(k, notificationApp.packageName);
                jSONObject.put("ON", notificationApp.on);
                jSONArray.put(jSONObject);
            }
            String string = jSONArray.toString();
            Log.d(TAG, "Save Apps : " + string + ", Count : " + list.size(), new Object[0]);
            UserSettings.putString(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_BLACKLIST, string);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void i(boolean z) {
        Log.d(TAG, "Save IsScreenONIgnore : " + z, new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UserSettingsKeys.SUB_KEY_NOTIFICATION_SCREEN_ON_IGNORE, z);
            UserSettings.putString(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void init(Context context) {
        Log.d(TAG, "Init Settings...", new Object[0]);
        if (m == null) {
            getManager(context);
        } else {
            getManager(context).a();
        }
    }

    private void j(boolean z) {
        Log.d(TAG, "Save IsUserON : " + z, new Object[0]);
        UserSettings.putBoolean(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_USER_ON, z);
    }

    public boolean IsSportSyncSuccessON() {
        boolean z = UserSettings.getBoolean(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_SPORT_DATA, true);
        Log.d(TAG, "Read IsSportSyncSuccessON : " + z, new Object[0]);
        return z;
    }

    public void addAllApps(List<NotificationApp> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        synchronized (this.a) {
            for (NotificationApp notificationApp : list) {
                if (!TextUtils.isEmpty(notificationApp.packageName)) {
                    NotificationApp notificationAppFindApp = findApp(notificationApp.packageName);
                    if (notificationAppFindApp != null) {
                        if (notificationAppFindApp.on != notificationApp.on) {
                            this.a.remove(notificationAppFindApp);
                        }
                    }
                    this.a.add(notificationApp);
                }
            }
            h(this.a);
            UserSettingsManager.getManager(this.b).syncAllToCloudAsync();
        }
    }

    public void addApp(NotificationApp notificationApp) {
        if (TextUtils.isEmpty(notificationApp.packageName)) {
            return;
        }
        synchronized (this.a) {
            NotificationApp notificationAppFindApp = findApp(notificationApp.packageName);
            if (notificationAppFindApp != null) {
                if (notificationAppFindApp.on == notificationApp.on) {
                    return;
                } else {
                    this.a.remove(notificationAppFindApp);
                }
            }
            this.a.add(notificationApp);
            h(this.a);
            UserSettingsManager.getManager(this.b).syncAllToCloudAsync();
        }
    }

    public void addKeyword(String str) {
        this.h.addKeyword(str);
    }

    public NotificationApp findApp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.a) {
            for (NotificationApp notificationApp : this.a) {
                if (!TextUtils.isEmpty(notificationApp.packageName) && (str.startsWith(notificationApp.packageName) || notificationApp.packageName.startsWith(str))) {
                    return notificationApp;
                }
            }
            return null;
        }
    }

    public List<NotificationApp> getAllApps() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            arrayList.addAll(this.a);
        }
        return arrayList;
    }

    @NonNull
    public List<String> getAllKeywords() {
        return this.h.getKeywords();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public NotificationApp getApp(int i2) {
        NotificationApp notificationApp;
        synchronized (this.a) {
            if (i2 < 0) {
                notificationApp = null;
            } else if (i2 < this.a.size()) {
                notificationApp = this.a.get(i2);
            } else {
                notificationApp = null;
            }
            throw th;
        }
        return notificationApp;
    }

    public int getAppsCount() {
        int size;
        synchronized (this.a) {
            size = this.a.size();
        }
        return size;
    }

    public NotificationSmartFilter getSmartFilter() {
        return this.g;
    }

    public boolean hasApp(String str) {
        return findApp(str) != null;
    }

    public boolean isAppFiltered(String str, PackageManager packageManager, boolean z) {
        if ("com.huami.watch.hmwatchmanager".equals(str)) {
            boolean zIsInUserBlacklist = isInUserBlacklist(str);
            if (z) {
                Log.d(TAG, "Self is In UserBlacklist : " + zIsInUserBlacklist, new Object[0]);
            }
            return zIsInUserBlacklist;
        }
        boolean zIsInWhitelist = isInWhitelist(str, z);
        boolean zIsInUserBlacklist2 = isInUserBlacklist(str);
        if (z) {
            Log.d(TAG, SearchCriteria.LT + str + "> isInWhitelist : " + zIsInWhitelist + ", isInUserBlacklist : " + zIsInUserBlacklist2, new Object[0]);
        }
        return !zIsInWhitelist || zIsInUserBlacklist2;
    }

    public boolean isDelKeywordDialogDisplayed() {
        return Box.getDelNotiKeyWordDialogDisplayed();
    }

    public boolean isInBlacklist(String str, boolean z) {
        boolean zIsInUserBlacklist = isInUserBlacklist(str);
        boolean zIsInSmartFilterBlacklist = isInSmartFilterBlacklist(str);
        if (z) {
            Log.d(TAG, SearchCriteria.LT + str + "> isInUserBlacklist : " + zIsInUserBlacklist + ", isSmartFilterON : " + isSmartFilterON() + ", isInSmartFilterBlacklist : " + zIsInSmartFilterBlacklist, new Object[0]);
        }
        return zIsInUserBlacklist | zIsInSmartFilterBlacklist;
    }

    public boolean isInSmartFilterBlacklist(String str) {
        return this.g.hasApp(str) & isSmartFilterON();
    }

    public boolean isInSmartFilterWhitelist(String str) {
        return this.g.hasAppInWhitelist(str) & isSmartFilterON();
    }

    public boolean isInUserBlacklist(String str) {
        NotificationApp notificationAppFindApp = findApp(str);
        return (notificationAppFindApp == null || notificationAppFindApp.on) ? false : true;
    }

    public boolean isInUserWhitelist(String str) {
        for (NotificationApp notificationApp : this.a) {
            if (notificationApp.packageName.equals(str) && notificationApp.on) {
                return true;
            }
        }
        return false;
    }

    public boolean isInWhitelist(String str, boolean z) {
        boolean zIsInUserWhitelist = isInUserWhitelist(str);
        boolean zIsInSmartFilterWhitelist = isInSmartFilterWhitelist(str);
        if (z) {
            Log.d(TAG, SearchCriteria.LT + str + "> isInUserWhitelist : " + zIsInUserWhitelist + ", isSmartFilterON : " + isSmartFilterON() + ", isInSmartFilterWhitelist : " + zIsInSmartFilterWhitelist, new Object[0]);
        }
        return zIsInUserWhitelist | zIsInSmartFilterWhitelist;
    }

    public boolean isKeywordFilter(String str, String[] strArr) {
        return this.h.isFiltered(str, strArr);
    }

    public boolean isKeywordFilterON() {
        return this.h.isKeywordFilterON();
    }

    public boolean isNLSAvailable(Context context) {
        return isSystemNLSPermissionEnabled(context) && isUserON();
    }

    public boolean isScreenONIgnore() {
        boolean z = this.d.get();
        Log.d(TAG, "Is ScreenON Ignore : " + z, new Object[0]);
        return z;
    }

    public boolean isSmartFilterON() {
        return this.g.isSmartFilterON();
    }

    public boolean isSystemNLSPermissionEnabled(Context context) {
        return NotificationManagerCompat.getEnabledListenerPackages(context).contains(context.getPackageName());
    }

    public boolean isUserON() {
        return this.c.get();
    }

    public boolean isWatchNoDisturbON() {
        boolean z = this.e.get();
        Log.d(TAG, "Is WatchNoDisturb ON : " + z, new Object[0]);
        return z;
    }

    public void preloadIsSportSyncSuccessON() {
        this.f.set(UserSettings.getBoolean(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_SPORT_DATA));
    }

    public void preloadIsWatchNoDisturbON(String str) {
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(e(str, atomicBoolean.get()));
    }

    public void removeAllApps(List<String> list) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                NotificationApp notificationAppFindApp = findApp(it2.next());
                if (notificationAppFindApp != null) {
                    arrayList.add(notificationAppFindApp);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            this.a.removeAll(arrayList);
            h(this.a);
            UserSettingsManager.getManager(this.b).syncAllToCloudAsync();
        }
    }

    public void removeApp(@NonNull NotificationApp notificationApp) {
        removeApp(notificationApp.packageName);
    }

    public void removeKeyword(String str) {
        this.h.removeKeyword(str);
    }

    public void setDelKeywordDialogDisplayed(boolean z) {
        Box.putDelNotiKeyWordDialogDisplayed(z);
    }

    public void setKeywordFilterON(boolean z) {
        this.h.setKeywordFilterON(z);
    }

    public void setScreenOnIgnore(boolean z) {
        this.d.set(z);
        i(z);
    }

    public void setSmartFilterON(boolean z) {
        this.g.setSmartFilterON(z);
    }

    public void setSportSyncSuccessON(boolean z) {
        Log.d(TAG, "Save IsSportSyncSuccessON : " + z, new Object[0]);
        this.f.set(z);
        UserSettings.putBoolean(this.b.getContentResolver(), UserSettingsKeys.KEY_NOTIFICATION_SPORT_DATA, z);
    }

    public void setUserON(boolean z) {
        this.c.set(z);
        j(z);
    }

    public void updateApp(NotificationApp notificationApp) {
        synchronized (this.a) {
            NotificationApp notificationAppFindApp = findApp(notificationApp.packageName);
            if (notificationAppFindApp == null) {
                return;
            }
            notificationAppFindApp.packageName = notificationApp.packageName;
            notificationAppFindApp.on = notificationApp.on;
            h(this.a);
            UserSettingsManager.getManager(this.b).syncAllToCloudAsync();
        }
    }

    public void removeApp(String str) {
        synchronized (this.a) {
            NotificationApp notificationAppFindApp = findApp(str);
            if (notificationAppFindApp == null) {
                return;
            }
            this.a.remove(notificationAppFindApp);
            h(this.a);
            UserSettingsManager.getManager(this.b).syncAllToCloudAsync();
        }
    }

    public void preloadIsWatchNoDisturbON() {
        preloadIsWatchNoDisturbON(UserSettings.get(this.b.getContentResolver(), UserSettingsKeys.KEY_WATCH_SETTINGS));
    }
}
