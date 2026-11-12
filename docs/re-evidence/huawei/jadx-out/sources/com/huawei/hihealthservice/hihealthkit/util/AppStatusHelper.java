package com.huawei.hihealthservice.hihealthkit.util;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.lcw;
import defpackage.lcy;
import defpackage.ldb;
import defpackage.ldj;
import defpackage.ldk;
import defpackage.ldm;
import defpackage.lea;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AppStatusHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12519a;
    private boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedTreeMap<String, lea> f12521c = new LinkedTreeMap<>();
    private LinkedTreeMap<String, lea> f = new LinkedTreeMap<>();
    private LinkedTreeMap<String, Long> e = new LinkedTreeMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f12520b = 0;
    private long h = 0;

    public AppStatusHelper(Context context) {
        this.d = true;
        this.d = !Utils.b(context.getApplicationContext());
        b();
    }

    private void b() {
        try {
            this.f12519a = c();
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "beta_scope");
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "pass_scope");
            String strE3 = SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "beta_User");
            if (a(strE)) {
                this.f12521c = e(strE);
            }
            if (this.f12521c == null) {
                this.f12521c = new LinkedTreeMap<>();
            }
            if (a(strE2)) {
                this.f = e(strE2);
            }
            if (this.f == null) {
                this.f = new LinkedTreeMap<>();
            }
            if (a(strE3)) {
                JSONObject jSONObject = new JSONObject(strE3);
                if (jSONObject.optString("betaUserId", "").equals(this.f12519a)) {
                    this.e = (LinkedTreeMap) new Gson().fromJson(jSONObject.optString("betaUser", "{}"), new TypeToken<LinkedTreeMap<String, Long>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.1
                    }.getType());
                }
                if (this.e == null) {
                    this.e = new LinkedTreeMap<>();
                }
            }
        } catch (JSONException e) {
            ReleaseLogUtil.e("R_HiH_AppStatusHelper", "initHelper JSONException: ", e.getMessage());
        }
    }

    private LinkedTreeMap<String, lea> e(String str) {
        try {
            return (LinkedTreeMap) new Gson().fromJson(str, new TypeToken<LinkedTreeMap<String, lea>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.2
            }.getType());
        } catch (JsonSyntaxException e) {
            String message = e.getMessage();
            ReleaseLogUtil.a("R_HiH_AppStatusHelper", "deserializeFromJson JsonSyntaxException msg=", message);
            if (message == null || !message.contains("duplicate key")) {
                return null;
            }
            try {
                return (LinkedTreeMap) new GsonBuilder().registerTypeAdapter(LinkedTreeMap.class, new JsonDeserializer<LinkedTreeMap<String, lea>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.3
                    @Override // com.google.gson.JsonDeserializer
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public LinkedTreeMap<String, lea> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                        return (LinkedTreeMap) new Gson().fromJson(jsonElement, type);
                    }
                }).create().fromJson(str, new TypeToken<LinkedTreeMap<String, lea>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.4
                }.getType());
            } catch (JsonSyntaxException e2) {
                ReleaseLogUtil.a("R_HiH_AppStatusHelper", "deserializeFromJson JsonSyntaxException msg=", e2.getMessage());
                return null;
            }
        }
    }

    public int a(String str, int i, int i2) {
        if (TextUtils.isEmpty(this.f12519a) || !this.f12519a.equals(c())) {
            ReleaseLogUtil.d("R_HiH_AppStatusHelper", "user changed: ", this.f12519a);
            b();
        }
        ReleaseLogUtil.d("R_HiH_AppStatusHelper", "checkBetaScope");
        if (i == 0 || !this.d) {
            ReleaseLogUtil.d("R_HiH_AppStatusHelper", "not need to check beta scope, return success");
            return 0;
        }
        try {
            if (!d(str, ldm.b(i2, i == 1))) {
                ReleaseLogUtil.d("R_HiH_AppStatusHelper", "isBetaScope: false, callback success");
                return 0;
            }
            return f(str);
        } catch (NetworkErrorException unused) {
            ReleaseLogUtil.a("R_HiH_AppStatusHelper", "checkBetaScope failed, callback ", 1004);
            return 1004;
        }
    }

    private String c() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        LogUtil.a("AppStatusHelper", "getHuid: ", strC);
        return strC;
    }

    private boolean d(String str, List<String> list) throws NetworkErrorException {
        if (!this.f12521c.containsKey(str)) {
            this.f12521c.put(str, new lea());
        }
        if (e(str, list)) {
            ReleaseLogUtil.d("R_HiH_AppStatusHelper", "check scope by cache, result is pass");
            return false;
        }
        if (d(str)) {
            try {
                c(str);
            } catch (InterruptedException e) {
                ReleaseLogUtil.e("R_HiH_AppStatusHelper", "getDataFromHealthKit InterruptedException: ", e.getMessage());
            }
        }
        List<String> scopeList = this.f12521c.get(str).getScopeList();
        for (String str2 : list) {
            if (a(str2) && scopeList.contains(str2)) {
                ReleaseLogUtil.e("R_HiH_AppStatusHelper", "isBetaScope: true");
                return true;
            }
        }
        return false;
    }

    private int f(String str) throws NetworkErrorException {
        if (g(str)) {
            try {
                b(str);
            } catch (InterruptedException e) {
                ReleaseLogUtil.e("R_HiH_AppStatusHelper", "checkUser InterruptedException: ", e.getMessage());
            }
        }
        boolean zContainsKey = this.e.containsKey(str);
        ReleaseLogUtil.d("R_HiH_AppStatusHelper", "isBetaUser: ", Boolean.valueOf(zContainsKey));
        if (zContainsKey) {
            return 0;
        }
        return HiHealthStatusCodes.USER_OF_BETA_APP_EXCEED_RANGE;
    }

    private boolean e(String str, List<String> list) throws NetworkErrorException {
        if (!this.f.containsKey(str)) {
            this.f.put(str, new lea());
        }
        if (h(str)) {
            ReleaseLogUtil.d("R_HiH_AppStatusHelper", "scope cache expired, get scope from cloud");
            try {
                c(str);
            } catch (InterruptedException e) {
                ReleaseLogUtil.a("R_HiH_AppStatusHelper", "getDataFromHealthKit InterruptedException:", e.getMessage());
            }
        }
        List<String> scopeList = this.f.get(str).getScopeList();
        for (String str2 : list) {
            LogUtil.a("AppStatusHelper", "need scope: ", str2);
            if (a(str2) && scopeList.contains(str2)) {
                ReleaseLogUtil.d("R_HiH_AppStatusHelper", "isPassScope: true");
                return true;
            }
        }
        return false;
    }

    private boolean d(String str) {
        if (this.f12521c.containsKey(str)) {
            this.f12520b = this.f12521c.get(str).getUpdateTimeStamp();
        }
        return System.currentTimeMillis() - this.f12520b > 86400000;
    }

    private boolean h(String str) {
        if (this.f.containsKey(str)) {
            this.h = this.f.get(str).getUpdateTimeStamp();
        }
        return System.currentTimeMillis() - this.h > 604800000;
    }

    private boolean g(String str) {
        LinkedTreeMap<String, Long> linkedTreeMap = this.e;
        if (linkedTreeMap == null || linkedTreeMap.get(str) == null) {
            return true;
        }
        return this.e.get(str).longValue() != 0 && System.currentTimeMillis() - this.e.get(str).longValue() > 604800000;
    }

    private void c(final String str) throws NetworkErrorException, InterruptedException {
        ReleaseLogUtil.d("R_HiH_AppStatusHelper", "enter getDataFromHealthKit");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        lcy.d().b(this, new lcw(str).getRequestParamsBuilder().b(true).c(new OnRequestCallBack<ldk>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.5
            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ldk ldkVar) {
                ReleaseLogUtil.d("R_HiH_AppStatusHelper", "getDataFromHealthKit has success response");
                if (ldkVar == null || ldkVar.getAppInfos() == null || ldkVar.getAppInfos().size() == 0) {
                    zArr[0] = true;
                    ReleaseLogUtil.a("R_HiH_AppStatusHelper", "AppInfo is empty :", str);
                    countDownLatch.countDown();
                    return;
                }
                ldj.a appAuditInfo = ldkVar.getAppInfos().get(0).getAppAuditInfo();
                if (appAuditInfo != null) {
                    if (!TextUtils.isEmpty(appAuditInfo.getBetaScopes()) || !TextUtils.isEmpty(appAuditInfo.getPassedScopes())) {
                        if (AppStatusHelper.this.a(appAuditInfo.getBetaScopes()) || AppStatusHelper.this.a(appAuditInfo.getPassedScopes())) {
                            ReleaseLogUtil.d("R_HiH_AppStatusHelper", "save scope in cache");
                            AppStatusHelper.this.a(str, Arrays.asList(appAuditInfo.getBetaScopes().split(",")));
                            AppStatusHelper.this.c(str, Arrays.asList(appAuditInfo.getPassedScopes().split(",")));
                        }
                    } else {
                        ReleaseLogUtil.a("R_HiH_AppStatusHelper", "App scope is empty :", str);
                        zArr[0] = true;
                        countDownLatch.countDown();
                        return;
                    }
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("R_HiH_AppStatusHelper", "App scope fail ", "errorCode:", Integer.valueOf(i), " msg ", th.getMessage());
                zArr[0] = true;
                countDownLatch.countDown();
            }
        }).e());
        ReleaseLogUtil.d("R_HiH_AppStatusHelper", "getDataFromHealthKit on time: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        if (zArr[0]) {
            throw new NetworkErrorException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        return !TextUtils.isEmpty(str);
    }

    private void b(final String str) throws NetworkErrorException, InterruptedException {
        ReleaseLogUtil.d("R_HiH_AppStatusHelper", "enter checkUser");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final boolean[] zArr = {false};
        lcy.d().b(this, new ldb(str, this.f12519a).getRequestParamsBuilder().b(true).c(new OnRequestCallBack<Object>() { // from class: com.huawei.hihealthservice.hihealthkit.util.AppStatusHelper.9
            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onSuccess(Object obj) {
                ReleaseLogUtil.d("R_HiH_AppStatusHelper", "checkUser has success response");
                AppStatusHelper.this.b(str, true);
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealthservice.hihealthkit.cpcheck.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                if (i == 403) {
                    AppStatusHelper.this.b(str, false);
                } else {
                    ReleaseLogUtil.a("R_HiH_AppStatusHelper", "beta user fail ", "errorCode:", Integer.valueOf(i), " msg ", th.getMessage());
                    zArr[0] = true;
                }
                countDownLatch.countDown();
            }
        }).e());
        LogUtil.a("R_HiH_AppStatusHelper", "checkUser on time: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        if (zArr[0]) {
            throw new NetworkErrorException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<String> list) {
        lea leaVar = this.f.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.h = jCurrentTimeMillis;
        leaVar.setUpdateTimeStamp(jCurrentTimeMillis);
        leaVar.getScopeList().clear();
        leaVar.getScopeList().addAll(list);
        this.f.put(str, leaVar);
        String json = new Gson().toJson(this.f);
        LogUtil.a("AppStatusHelper", "savePassScopeCache", json);
        SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "pass_scope", json, new StorageParams(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<String> list) {
        lea leaVar = this.f12521c.get(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12520b = jCurrentTimeMillis;
        leaVar.setUpdateTimeStamp(jCurrentTimeMillis);
        leaVar.getScopeList().clear();
        leaVar.getScopeList().addAll(list);
        this.f12521c.put(str, leaVar);
        String json = new Gson().toJson(this.f12521c);
        LogUtil.a("AppStatusHelper", "saveBetaScopeCache", json);
        SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "beta_scope", json, new StorageParams(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z) {
        try {
            this.e.put(str, Long.valueOf(z ? System.currentTimeMillis() : 0L));
            JSONObject jSONObject = new JSONObject("{}");
            for (Map.Entry<String, Long> entry : this.e.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            JSONObject jSONObject2 = new JSONObject("{}");
            jSONObject2.put("betaUserId", this.f12519a);
            jSONObject2.put("betaUser", jSONObject);
            String string = jSONObject2.toString();
            LogUtil.a("AppStatusHelper", "saveBetaUserCache", string);
            SharedPreferenceManager.e(BaseApplication.getContext(), "AppStatusHelper", "beta_User", string, new StorageParams(0));
        } catch (JSONException e) {
            ReleaseLogUtil.a("R_HiH_AppStatusHelper", "saveBetaUserCache JSONException: ", e.getMessage());
        }
    }
}
