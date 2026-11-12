package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.check.ProviderCheckUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.network.abtest.ABHelper;
import com.huawei.hms.network.conf.api.ConfigAPI;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class j {
    public static final String h = "ConfigManager";
    public static final String i = "content://com.huawei.hms.contentprovider/com.huawei.hms.networkkit/remoteconfig";
    public static final String j = "retCode";
    public static final String k = "retDesc";
    public static final int l = 100301;
    public static final String m = "getConfig";
    public static final String n = "remote_configs";
    public static final int o = 5000;
    public static final int p = 10000;
    public static final int q = 500;
    public static final String u = "_";
    public static final String v = "get_config_time";
    public static final String w = "get_ab_time";
    public static final String y = "share_pre_config";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, m> f14924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f14925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14926c;
    public String d;
    public ExecutorService e;
    public PLSharedPreferences f;
    public volatile CountDownLatch g;
    public static final String s = "profile_base";
    public static final String r = "profile_restful";
    public static final String t = "profile_filemanager";
    public static final List<String> x = Collections.unmodifiableList(Arrays.asList(s, r, t));

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static j f14930a = new j(null);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f.putString(i.f, str);
    }

    public void a(Context context) {
        String str;
        Map<String, ?> all;
        Context appContext = ContextHolder.getAppContext();
        String str2 = this.f14926c;
        if (str2 == null || str2.length() == 0) {
            this.f14926c = appContext != null ? appContext.getPackageName() : context.getPackageName();
        }
        Logger.i(h, "init :" + this.f14926c);
        try {
            if (this.f14926c != null && appContext != null) {
                this.d = appContext.getPackageManager().getPackageInfo(this.f14926c, 0).versionName.replace(".", "_") + "_";
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str = "get app version failed for NameNotFoundException";
            Logger.e(h, str);
        } catch (Exception unused2) {
            str = "get app version failed!";
            Logger.e(h, str);
        }
        k.b();
        if (this.f == null) {
            this.f = new PLSharedPreferences(context, y);
        }
        try {
            all = this.f.getAll();
        } catch (RuntimeException | Exception unused3) {
            a("sharedPreferences get failed", i.h);
            all = null;
        }
        if (all != null) {
            this.f14925b.putAll(all);
            if (h()) {
                for (String str3 : x) {
                    if (this.f14925b.containsKey(str3)) {
                        a(this.f14924a.get(str3), (String) this.f14925b.get(str3));
                        this.f14925b.remove(str3);
                    }
                }
            }
        } else {
            Logger.i(h, "spMap is null");
        }
        Boolean boolA = m4.c().a(NetworkService.Constants.REMOTE_CONFIG_SWITCH);
        if (boolA == null || boolA.booleanValue()) {
            if (this.g == null || this.g.getCount() == 0) {
                this.g = new CountDownLatch(1);
                this.e.execute(new e(context));
            }
        } else {
            Logger.i(h, "remote config has been disabled");
        }
    }

    public Object a(String str) {
        q qVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        Logger.d(h, "getValue:" + str);
        if (str.contains("|")) {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length != 2) {
                return null;
            }
            if (TextUtils.equals(strArrSplit[0], PolicyNetworkService.ProfileConstants.RESTFUL)) {
                str = strArrSplit[1];
                qVar = q.RESTFUL;
            } else if (TextUtils.equals(strArrSplit[0], PolicyNetworkService.ProfileConstants.FILE_MANAGER)) {
                str = strArrSplit[1];
                qVar = q.FILE_MANAGER;
            } else {
                str = strArrSplit[1];
                qVar = q.DEFAULT;
            }
        } else {
            qVar = q.DEFAULT;
        }
        return c(str, qVar);
    }

    public Bundle a(Context context, String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Uri uri = Uri.parse(i);
        if (!ProviderCheckUtil.isValid(uri)) {
            Logger.w(h, "package name is invalid");
            return null;
        }
        bundle.putString(u3.p, "content://com.huawei.hms.networkkit");
        bundle.putString("appversion", this.d);
        try {
            return context.getContentResolver().call(uri, str, str2, bundle);
        } catch (RuntimeException unused) {
            Logger.e(h, "remote config base service kit not exist ");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("retCode", i.g);
            bundle2.putString(k, "cross process call failed");
            return bundle2;
        }
    }

    private void j() {
        this.f.putLong(v, System.currentTimeMillis());
    }

    private void i() {
        Object value = ConfigAPI.getValue(PolicyNetworkService.GlobalConstants.AB_EXPIRED_TIME);
        if (value == null) {
            return;
        }
        ABHelper.getInstance().setAbExpiredTime(StringUtils.stringToLong(String.valueOf(value), 0L));
    }

    private boolean h() {
        Object objC = c(k.e);
        if (objC instanceof String) {
            return Boolean.parseBoolean((String) objC);
        }
        if (objC instanceof Boolean) {
            return ((Boolean) objC).booleanValue();
        }
        return false;
    }

    private boolean g() {
        Object value;
        Object obj = this.f14925b.get(v);
        return obj == null || (value = ConfigAPI.getValue(PolicyNetworkService.GlobalConstants.CONFIG_EXPIRED_TIME)) == null || ((Long) obj).longValue() + (a(value) * 1000) <= System.currentTimeMillis();
    }

    private boolean f() {
        return this.f.getLong(w, -1L) == ABHelper.getInstance().getLastUpdateAbTime();
    }

    public static j e() {
        return d.f14930a;
    }

    private JSONObject d(String str) {
        try {
            return TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (JSONException unused) {
            Logger.e(h, "call method stringToJson occur JSONException");
            return null;
        }
    }

    private Object d(String str, q qVar) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!q.DEFAULT.name().equals(qVar.name()) && this.g != null && this.g.getCount() > 0) {
            try {
                try {
                    if (!this.g.await(1L, TimeUnit.SECONDS)) {
                        Logger.w(h, "Wait timeout!");
                    }
                } catch (InterruptedException unused) {
                    Logger.e(h, "InterruptedException,countDownLatch await error !");
                }
                this.g.countDown();
            } catch (Throwable th) {
                this.g.countDown();
                throw th;
            }
        }
        if (!TextUtils.equals("core_configversion", lowerCase) && h() && d() >= 100301) {
            return b(lowerCase, qVar);
        }
        return c(lowerCase);
    }

    private int d() {
        String str = (String) this.f14925b.get("core_configversion");
        if (str == null) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(str2);
        }
        return Integer.parseInt(sb.toString());
    }

    private void c(Bundle bundle) {
        this.f14924a.clear();
        this.f14924a.put(s, new n(l.REMOTE_AGC));
        this.f14924a.put(r, new p(l.REMOTE_AGC));
        this.f14924a.put(t, new o(l.REMOTE_AGC));
        if (h()) {
            for (String str : x) {
                if (this.f14925b.containsKey(str)) {
                    a(this.f14924a.get(str), (String) this.f14925b.get(str));
                    this.f14925b.remove(str);
                }
            }
            Map<String, m> map = this.f14924a;
            if (map == null || map.size() <= 0) {
                return;
            }
            a();
        }
    }

    private void c() {
        String string = this.f.getString(i.f);
        String string2 = this.f.getString(n);
        long j2 = this.f.getLong(v, -1L);
        long j3 = this.f.getLong(w, -1L);
        this.f.clear();
        b(string);
        this.f.putString(n, string2);
        this.f.putLong(v, j2);
        this.f.putLong(w, j3);
    }

    private Object c(String str, q qVar) {
        try {
            return d(str.toLowerCase(Locale.ENGLISH), qVar);
        } catch (Exception unused) {
            Logger.e(h, "search configs occurs error, return default config");
            return null;
        }
    }

    private Object c(String str) {
        return this.f14925b.get(str);
    }

    private void b(Bundle bundle) {
        this.f14925b.clear();
        for (String str : k.b().a()) {
            Object obj = bundle.get(str);
            if (obj != null && CheckConfigUtils.checkIsCorrect(str, obj)) {
                this.f14925b.put(str, obj);
                Logger.d(h, "put independentConfigs key: %s, value: %s", str, obj);
            }
        }
        Map<String, Object> map = this.f14925b;
        if (map == null || map.size() == 0) {
            return;
        }
        b();
        try {
            for (String str2 : this.f14925b.keySet()) {
                this.f.putString(str2, String.valueOf(this.f14925b.get(str2)));
            }
        } catch (RuntimeException | Exception unused) {
            a("sharedPreferences put failed", i.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        Bundle bundleA;
        boolean zF = true;
        boolean zIsExpired = false;
        boolean z = ReflectionUtils.isAbTestEnable() && ABHelper.getInstance().isInAllowList(String.valueOf(ConfigAPI.getValue(PolicyNetworkService.GlobalConstants.AB_ALLOWED_LIST)));
        boolean zG = g();
        if (z) {
            ABHelper.getInstance().init();
            i();
            zIsExpired = ABHelper.getInstance().isExpired();
            zF = f();
        }
        Logger.i(h, "isAbTestEnable:%s, isRemoteConfigExpired:%s, isAbConfigExpired:%s", Boolean.valueOf(z), Boolean.valueOf(zG), Boolean.valueOf(zIsExpired));
        if (!a(z, zG, zIsExpired, zF)) {
            Logger.i(h, "config is not expired");
            this.g.countDown();
            return;
        }
        if (zG) {
            Logger.i(h, "update configs");
            bundleA = a(context, m, this.f14926c, (Bundle) null);
            this.f.putString(n, BundleUtil.bundleToJson(bundleA));
            j();
        } else {
            bundleA = BundleUtil.jsonToBundle(this.f.getString(n));
        }
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        Logger.v(h, "remoteConfigs:%s", bundleA);
        if (z) {
            Map abParamsMap = ABHelper.getInstance().getAbParamsMap();
            Logger.v(h, "abConfigs:%s", abParamsMap);
            for (String str : abParamsMap.keySet()) {
                bundleA.putString(str, (String) abParamsMap.get(str));
            }
            Logger.v(h, "after the merger remoteConfigs:%s", bundleA);
            this.f.putLong(w, ABHelper.getInstance().getLastUpdateAbTime());
        }
        c();
        b(bundleA);
        c(bundleA);
        this.g.countDown();
        a(bundleA);
        if (z && zIsExpired) {
            InitReport.executeDelay(new b());
        }
    }

    private void b() {
        Object obj = this.f14925b.get("core_connect_timeout");
        Object obj2 = this.f14925b.get("core_concurrent_connect_delay");
        if (obj == null || obj2 == null) {
            return;
        }
        int i2 = 10000;
        int iStringToInteger = StringUtils.stringToInteger(String.valueOf(obj), 10000);
        int i3 = 500;
        int iStringToInteger2 = StringUtils.stringToInteger(String.valueOf(obj2), 500);
        if (iStringToInteger2 >= iStringToInteger) {
            Logger.d(h, "concurrent_connect_delay :" + iStringToInteger2 + ",is not less than connect_timeout: " + iStringToInteger + ",reset the two values to the default values");
        } else {
            i2 = iStringToInteger;
            i3 = iStringToInteger2;
        }
        this.f14925b.put("core_connect_timeout", Integer.valueOf(i2));
        this.f14925b.put("core_concurrent_connect_delay", Integer.valueOf(i3));
    }

    private Object b(String str, q qVar) {
        return a(str, qVar);
    }

    private boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        if (z2) {
            str = "remote config expired";
        } else if (z && z3) {
            str = "ab config expired";
        } else {
            if (!z || z4) {
                return false;
            }
            str = "ab config has not merges";
        }
        Logger.d(h, str);
        return true;
    }

    private void a(String str, int i2) {
        Logger.e(h, str);
        Bundle bundle = new Bundle();
        bundle.putInt("retCode", i2);
        bundle.putString(k, str);
        a(bundle);
    }

    private void a(m mVar, String str) {
        Object obj;
        Logger.d(h, "parseJsonStr: %s", str);
        JSONObject jSONObjectD = d(str);
        if (jSONObjectD != null) {
            Iterator<String> itKeys = jSONObjectD.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    obj = jSONObjectD.get(next);
                } catch (JSONException e2) {
                    Logger.e(h, "JSONException: %s", e2.getMessage());
                    obj = null;
                }
                if (next.startsWith(k.f14961a)) {
                    next = next.substring(11);
                }
                if (CheckConfigUtils.checkIsCorrect(next, obj)) {
                    mVar.a(next, obj);
                    Logger.d(h, "put key: %s, value: %s", next, obj);
                }
            }
        }
    }

    private void a(Bundle bundle) {
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            i iVar = new i();
            iVar.put("error_code", bundle.getInt("retCode"));
            iVar.put(i.d, bundle.getString(k));
            iVar.put("config_version", bundle.getString("core_configversion"));
            String string = this.f.getString(i.f);
            if (!TextUtils.isEmpty(string)) {
                iVar.put(i.f, string);
            }
            InitReport.reportWhenInit(new c(iVar));
            Logger.d(h, "add to init report ConfigHianalyticsData：" + iVar.toString());
        }
    }

    private void a() {
        for (String str : x) {
            m mVar = this.f14924a.get(str);
            Map<String, Object> mapA = mVar.a();
            Object obj = mapA.get("core_connect_timeout");
            Object obj2 = mapA.get("core_concurrent_connect_delay");
            if (obj != null && obj2 != null) {
                int i2 = 10000;
                int iStringToInteger = StringUtils.stringToInteger(String.valueOf(obj), 10000);
                int i3 = 500;
                int iStringToInteger2 = StringUtils.stringToInteger(String.valueOf(obj2), 500);
                if (iStringToInteger2 >= iStringToInteger) {
                    Logger.d(h, "concurrent_connect_delay :" + iStringToInteger2 + ",is not less than connect_timeout: " + iStringToInteger + ",reset the two values to the default values");
                } else {
                    i3 = iStringToInteger2;
                    i2 = iStringToInteger;
                }
                mVar.a("core_connect_timeout", Integer.valueOf(i2));
                mVar.a("core_concurrent_connect_delay", Integer.valueOf(i3));
            }
            this.f14924a.put(str, mVar);
        }
    }

    private Object a(String str, String str2) {
        if (this.f14924a.get(str).d()) {
            return null;
        }
        return this.f14924a.get(str).a(str2);
    }

    private Object a(String str, q qVar) {
        String str2;
        int i2 = a.f14927a[qVar.ordinal()];
        if (i2 == 1) {
            str2 = r;
        } else if (i2 == 2) {
            str2 = t;
        } else {
            if (i2 != 3) {
                return null;
            }
            str2 = s;
        }
        return a(str2, str);
    }

    private long a(Object obj) {
        return StringUtils.stringToLong(String.valueOf(obj), 0L);
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ABHelper.getInstance().fetchABInfo();
        }

        public b() {
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f14929a;

        @Override // java.lang.Runnable
        public void run() {
            Logger.v(j.h, "remote config sdk report data to aiops is: %s", new JSONObject(this.f14929a.get()));
            HianalyticsHelper.getInstance().onEvent(this.f14929a.get(), i.f14890b);
        }

        public c(i iVar) {
            this.f14929a = iVar;
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f14931a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    j.this.b(this.f14931a);
                } catch (Exception unused) {
                    Logger.e(j.h, "updateConfigs has an exception");
                }
            } finally {
                j.this.g.countDown();
            }
        }

        public e(Context context) {
            this.f14931a = context;
        }
    }

    public /* synthetic */ j(a aVar) {
        this();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14927a;

        static {
            int[] iArr = new int[q.values().length];
            f14927a = iArr;
            try {
                iArr[q.RESTFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14927a[q.FILE_MANAGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14927a[q.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j() {
        this.e = ExecutorsUtils.newSingleThreadExecutor("CfgManager");
        this.f14925b = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f14924a = concurrentHashMap;
        concurrentHashMap.put(s, new n(l.REMOTE_AGC));
        this.f14924a.put(r, new p(l.REMOTE_AGC));
        this.f14924a.put(t, new o(l.REMOTE_AGC));
    }
}
