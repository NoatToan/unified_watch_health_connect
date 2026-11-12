package com.huawei.ui.thirdpartservice.syncdata.strava;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.fda;
import defpackage.fdy;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pia;
import defpackage.xca;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class StravaConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29174a;
    private fda j;
    private final Object e = new Object();
    private final Set<String> g = new HashSet(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f29175b = new HashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<StravaCountryCallback> f29176c = new HashSet();
    private Set<StravaEnableCallback> d = new HashSet();

    public interface StravaCountryCallback {
        void onStravaCountryCallback(boolean z);
    }

    public interface StravaEnableCallback {
        void onAbilityCallback(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final Handler handler) {
        LogUtil.a("StravaConfig", "enter updateStravaCountryConfig retryCount = ", Integer.valueOf(i));
        if (i < 0) {
            LogUtil.j("StravaConfig", "updateStravaCountryConfig retryCount < 0");
            a(handler);
            return;
        }
        if (this.j == null) {
            HashMap map = new HashMap();
            map.put("deviceType", "stravaMonitor");
            this.j = new fda("com.huawei.health_common_config", map);
        }
        fdy.d(this.j, "strava_country", 1, new DownloadCallback<File>() { // from class: com.huawei.ui.thirdpartservice.syncdata.strava.StravaConfig.5
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("StravaConfig", "updatePpgConfig onFinish, data is: ", file.toString());
                StravaConfig.this.c(file, handler);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str) {
                LogUtil.a("StravaConfig", "updatePpgConfig onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i2, Throwable th) {
                LogUtil.j("StravaConfig", "updatePpgConfig on Fail: ", th.getMessage());
                StravaConfig.this.a(i - 1, handler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(File file, Handler handler) {
        String strA = pia.a(file);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("StravaConfig", "parseJsonFile urlJsonString is empty");
            if (handler == null) {
                d();
                return;
            } else {
                handler.post(new xca(this));
                return;
            }
        }
        try {
            this.g.clear();
            this.f29175b.clear();
            HashSet hashSet = new HashSet(16);
            JSONArray jSONArray = new JSONArray(strA);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.get(i).toString());
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("countries");
                    if (jSONArrayOptJSONArray != null) {
                        c(strOptString, jSONArrayOptJSONArray);
                    }
                }
            }
            if (this.g.isEmpty()) {
                this.g.addAll(hashSet);
            }
        } catch (JSONException unused) {
            LogUtil.e("StravaConfig", "cache file read error");
        } finally {
            if (handler == null) {
                d();
            } else {
                handler.post(new xca(this));
            }
        }
    }

    private void c(String str, JSONArray jSONArray) {
        int i = 0;
        if ("entrance".equals(str)) {
            while (i < jSONArray.length()) {
                LogUtil.j("StravaConfig", "mEnableCountry content:", jSONArray.optJSONObject(i).optString("countryCode"));
                this.g.add(jSONArray.optJSONObject(i).optString("countryCode"));
                i++;
            }
            return;
        }
        if ("disability".equals(str)) {
            while (i < jSONArray.length()) {
                a aVar = new a();
                aVar.f29178a = jSONArray.optJSONObject(i).optString("countryCode");
                aVar.e = jSONArray.optJSONObject(i).optString("time");
                LogUtil.j("StravaConfig", "mDisabilityCountry content:", jSONArray.optJSONObject(i).toString());
                this.f29175b.put(aVar.f29178a, aVar);
                i++;
            }
            return;
        }
        LogUtil.j("StravaConfig", "name is disable");
    }

    public void b(Handler handler, String str, StravaCountryCallback stravaCountryCallback) {
        LogUtil.a("StravaConfig", "checkCountrySupport ", str);
        this.f29174a = str;
        this.f29176c.add(stravaCountryCallback);
        lsy.a(new e(handler));
    }

    public void d(Handler handler, String str, StravaEnableCallback stravaEnableCallback) {
        LogUtil.a("StravaConfig", "checkAbilitySupport ", str);
        this.f29174a = str;
        this.d.add(stravaEnableCallback);
        if (njy.e(this.f29176c)) {
            lsy.a(new e(handler));
        } else if (handler == null) {
            d();
        } else {
            handler.post(new xca(this));
        }
    }

    private void a(Handler handler) {
        LogUtil.a("StravaConfig", "getDefaultCountry");
        String strD = fdy.d("com.huawei.health_common_config", "strava_country", "json");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("StravaConfig", "DefaultFilePath is null");
            if (handler == null) {
                d();
                return;
            } else {
                handler.post(new xca(this));
                return;
            }
        }
        LogUtil.a("StravaConfig", "DefaultCountry :", strD);
        c(new File(strD), handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.e) {
            Iterator<StravaCountryCallback> it = this.f29176c.iterator();
            while (it.hasNext()) {
                StravaCountryCallback next = it.next();
                it.remove();
                if (next != null) {
                    LogUtil.a("StravaConfig", "onStravaCountryCallback ", Boolean.valueOf(this.g.contains(this.f29174a)), this.f29174a);
                    next.onStravaCountryCallback(this.g.contains(this.f29174a));
                }
            }
            Iterator<StravaEnableCallback> it2 = this.d.iterator();
            while (it2.hasNext()) {
                StravaEnableCallback next2 = it2.next();
                it2.remove();
                if (next2 != null) {
                    LogUtil.a("StravaConfig", "Ability Config ", Boolean.valueOf(this.f29175b.containsKey(this.f29174a)), this.f29174a);
                    if (this.f29175b.containsKey(this.f29174a)) {
                        Date dateC = this.f29175b.get(this.f29174a).c();
                        if (dateC == null) {
                            next2.onAbilityCallback(false);
                        } else {
                            next2.onAbilityCallback(dateC.after(new Date(System.currentTimeMillis())));
                        }
                    } else {
                        next2.onAbilityCallback(true);
                    }
                }
            }
        }
    }

    public void b() {
        LogUtil.a("StravaConfig", "release ");
        this.f29176c.clear();
        this.d.clear();
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<StravaConfig> f29179a;
        private Handler e;

        private e(StravaConfig stravaConfig, Handler handler) {
            this.f29179a = new WeakReference<>(stravaConfig);
            this.e = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            StravaConfig stravaConfig = this.f29179a.get();
            if (stravaConfig == null) {
                return;
            }
            stravaConfig.a(1, this.e);
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29178a;
        private String e;

        private a() {
        }

        public Date c() {
            if (TextUtils.isEmpty(this.e)) {
                return null;
            }
            String[] strArrSplit = this.e.split(Constants.LINK);
            if (strArrSplit.length != 3) {
                return null;
            }
            try {
                return new Date(Integer.parseInt(strArrSplit[0]) - 1900, Integer.parseInt(strArrSplit[1]) - 1, Integer.parseInt(strArrSplit[2]));
            } catch (NumberFormatException e) {
                ReleaseLogUtil.a("StravaConfig", "NumberFormatException", e.getMessage());
                return null;
            }
        }
    }
}
