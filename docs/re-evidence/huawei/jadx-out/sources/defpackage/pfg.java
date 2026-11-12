package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginhealthzone.cloud.HttpDataCallback;
import com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes41.dex */
@ApiDefine(uri = FamilyHealthZoneApi.class)
@Singleton
public class pfg implements FamilyHealthZoneApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f45267b = new Object();
    private volatile int d;
    private volatile long e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f45268a = "";

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public Class<? extends JsModuleBase> getCommonJsModule(String str) {
        return PluginHealthH5InteractionUtil.class;
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void getCommonUsedDevices(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("FamilyHealthZoneImpl", "getCommonUsedDevices callback is null!");
        } else {
            pfs.e().getCommonUsedDevices("FAMILY_SPACE", new HttpDataCallback() { // from class: pfg.3
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str) {
                    iBaseResponseCallback.a(i, str);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    iBaseResponseCallback.a(0, jSONObject);
                }
            });
        }
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void setCommonUsedDevices(List<gqb> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("FamilyHealthZoneImpl", "setCommonUsedDevices callback is null!");
        } else {
            pfs.e().setCommonUsedDevices(list, new HttpDataCallback() { // from class: pfg.2
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str) {
                    iBaseResponseCallback.a(i, str);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    iBaseResponseCallback.a(0, jSONObject);
                }
            });
        }
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void notifyMemberCheckHealth(String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("FamilyHealthZoneImpl", "notifyMemberCheckHealth callback is null!");
        } else {
            pfs.e().notifyMemberToCheckHealth(str, new HttpDataCallback() { // from class: pfg.5
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str2) {
                    iBaseResponseCallback.a(i, str2);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject) {
                    iBaseResponseCallback.a(0, jSONObject);
                }
            });
        }
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void gotoFamilyHealth(Context context, String str) {
        if (context == null) {
            LogUtil.j("FamilyHealthZoneImpl", "gotoFamilyHealth context is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("family_health_temp_type", "family_health_temp_type_guide");
        bundle.putString("encryptData", str);
        AppRouter.c("/PluginHealthZone/FamilyHealthTempActivity").d(bundle).b(context);
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void startFamilySpaceH5(Context context, ffz ffzVar) {
        String strB = b("sIsFirstHealth");
        ddv.b().initH5Pro();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.familyspace", new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("healthZoneApi", getCommonJsModule("healthZoneApi")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeArg("from", "3").addCustomizeArg("data", new GsonBuilder().disableHtmlEscaping().create().toJson(ffzVar)).addCustomizeArg("isFirstLoad", strB).addCustomizeArg("isGuestMode", String.valueOf(!LoginInit.getInstance(context).getIsLogined())).setImmerse().showStatusBar().setNeedSoftInputAdapter().setStatusBarTextBlack(true).setForceDarkMode(1).build());
        b();
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void requestFindUserInfo(final int i, final String str, final UserInfoCallback<gqd.c> userInfoCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pfl
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(i, str, userInfoCallback);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (c() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ void b(int i, String str, UserInfoCallback userInfoCallback) {
        if (d()) {
            if (!Utils.o()) {
                LogUtil.a("FamilyHealthZoneImpl", "not oversea, request LoginStatus");
            } else if (fua.l()) {
                LogUtil.a("FamilyHealthZoneImpl", "oversea support family data");
                a(i, str, userInfoCallback);
            } else {
                LogUtil.a("FamilyHealthZoneImpl", "oversea not support family data");
                LogUtil.j("FamilyHealthZoneImpl", "requestFindUserInfo onLoginError");
                userInfoCallback.errorCallback(-1);
            }
        } else {
            LogUtil.a("FamilyHealthZoneImpl", "requestFindUserInfo login success");
            a(i, str, userInfoCallback);
        }
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void getOtherUserInfo(final String str, final UserInfoCallback<gqc> userInfoCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pfj
            @Override // java.lang.Runnable
            public final void run() {
                this.f45279c.e(str, userInfoCallback);
            }
        });
    }

    /* synthetic */ void e(String str, UserInfoCallback userInfoCallback) {
        if (TextUtils.isEmpty(str)) {
            userInfoCallback.errorCallback(-1);
        } else {
            LogUtil.a("FamilyHealthZoneImpl", "findUserInfo");
            a(str, userInfoCallback);
        }
    }

    private gqf c(String str) {
        gqf gqfVar = new gqf();
        gqfVar.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        gqfVar.d(str);
        gqfVar.e(0);
        gqfVar.a(0);
        gqfVar.c(new ArrayList());
        return gqfVar;
    }

    private void a(String str, UserInfoCallback<gqc> userInfoCallback) {
        gqf gqfVarC = c(str);
        LogUtil.d("FamilyHealthZoneImpl", " getOtherUserAllInfo request is ", gqfVarC.toString());
        gqc gqcVarB = vox.d().b(gqfVarC);
        if (gqcVarB.e() == 1002) {
            LogUtil.d("FamilyHealthZoneImpl", "retryOnceOtherUserInfo");
            d(str, userInfoCallback);
            return;
        }
        if (gqcVarB.d() == null) {
            LogUtil.j("FamilyHealthZoneImpl", "response.getResultCode() == null");
            userInfoCallback.errorCallback(-1);
            return;
        }
        LogUtil.a("FamilyHealthZoneImpl", "getOtherUserAllInfo, resultCode: ", Integer.valueOf(gqcVarB.e()));
        if (gqcVarB.e() == 0) {
            userInfoCallback.infoCallback(gqcVarB);
            return;
        }
        LogUtil.j("FamilyHealthZoneImpl", "getOtherUserAllInfo error! resultCode: ", Integer.valueOf(gqcVarB.e()));
        if (userInfoCallback != null) {
            userInfoCallback.errorCallback(gqcVarB.e());
        }
    }

    private void a(int i, String str, UserInfoCallback<gqd.c> userInfoCallback) {
        vod vodVar = new vod();
        try {
            vodVar.e(Long.parseLong(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)));
            vod vodVarE = e(vodVar, i, str);
            LogUtil.d("FamilyHealthZoneImpl", " FindUserV2Request request is ", vodVarE.toString());
            gqd gqdVarD = vox.d().d(vodVarE);
            if (gqdVarD.getResultCode() == null) {
                LogUtil.j("FamilyHealthZoneImpl", "response.getResultCode() == null");
                userInfoCallback.errorCallback(-1);
                return;
            }
            LogUtil.a("FamilyHealthZoneImpl", "requestSocialUserInfo, resultCode: ", gqdVarD.getResultCode());
            if (gqdVarD.getResultCode().intValue() == 1002) {
                LogUtil.d("FamilyHealthZoneImpl", "retryOnceSocialUserInfo");
                e(i, str, userInfoCallback);
                return;
            }
            if (gqdVarD.getResultCode().intValue() != 0) {
                LogUtil.j("FamilyHealthZoneImpl", "requestSocialUserInfo error! resultCode: ", gqdVarD.getResultCode());
                if (userInfoCallback != null) {
                    userInfoCallback.errorCallback(gqdVarD.getResultCode().intValue());
                    return;
                }
                return;
            }
            List<gqd.c> listA = gqdVarD.e().a();
            if (listA != null && listA.size() != 0) {
                LogUtil.a("FamilyHealthZoneImpl", "requestSocialUserInfo findUserRspList size is ", Integer.valueOf(listA.size()));
                if (userInfoCallback != null) {
                    userInfoCallback.infoCallback(listA.get(0));
                    return;
                }
                return;
            }
            userInfoCallback.errorCallback(1005);
            LogUtil.j("FamilyHealthZoneImpl", "requestSocialUserInfo user is not exist");
        } catch (NumberFormatException unused) {
            LogUtil.e("FamilyHealthZoneImpl", "requestUserInfo numberFormatException");
            userInfoCallback.errorCallback(-1);
        }
    }

    private vod e(vod vodVar, int i, String str) {
        vodVar.c(i);
        vodVar.e(str);
        if (i == 0) {
            if (vov.b(str)) {
                vodVar.a(1);
                return vodVar;
            }
            vodVar.a(0);
            vodVar.e(e(str));
        }
        return vodVar;
    }

    private String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("FamilyHealthZoneImpl", "getCodePhone phone is null");
            return str;
        }
        if (Utils.o()) {
            return Marker.ANY_NON_NULL_MARKER + str;
        }
        if (str.startsWith("+86")) {
            return str;
        }
        if (str.startsWith("86")) {
            return Marker.ANY_NON_NULL_MARKER + str;
        }
        return "+86" + str;
    }

    public boolean c() {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        vok vokVar = new vok(BaseApplication.getAppPackage(), "", String.valueOf(45000001), BaseApplication.getAppPackage());
        try {
            vokVar.e(Long.parseLong(loginInit.getAccountInfo(1011)));
            vokVar.d(loginInit.getDeviceId());
            vokVar.b(loginInit.getAccountInfo(1008));
            von vonVarB = vox.d().b(vokVar);
            if (vonVarB.getResultCode() == null) {
                LogUtil.j("FamilyHealthZoneImpl", "response.getResultCode() == null");
                return false;
            }
            if (vonVarB.getResultCode().intValue() != 0) {
                LogUtil.j("FamilyHealthZoneImpl", "requestLoginStatus error! responseCode: ", vonVarB.getResultCode());
                return false;
            }
            this.e = System.currentTimeMillis();
            this.f45268a = loginInit.getAccountInfo(1011);
            von.c cVarA = vonVarB.a();
            this.d = cVarA.c();
            LogUtil.a("FamilyHealthZoneImpl", "requestLoginStatus is true, user is ", Long.valueOf(cVarA.b()), " mSessionValidTime ", Integer.valueOf(this.d));
            return true;
        } catch (NumberFormatException unused) {
            LogUtil.e("FamilyHealthZoneImpl", "requestLoginStatus numberFormatException");
            return false;
        }
    }

    private boolean d() {
        if (!this.f45268a.equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
        long j = (((long) this.d) * 1000) - 360000;
        LogUtil.a("FamilyHealthZoneImpl", "interval is", Long.valueOf(jCurrentTimeMillis), ", validTime: ", Long.valueOf(j));
        return jCurrentTimeMillis > j;
    }

    private void d(String str, UserInfoCallback<gqc> userInfoCallback) {
        LogUtil.a("FamilyHealthZoneImpl", "retryOnce");
        if (c()) {
            a(str, userInfoCallback);
        } else {
            LogUtil.j("FamilyHealthZoneImpl", "requestFindUserInfo onLoginError");
        }
    }

    private void e(int i, String str, UserInfoCallback<gqd.c> userInfoCallback) {
        LogUtil.a("FamilyHealthZoneImpl", "retryOnce");
        if (c()) {
            a(i, str, userInfoCallback);
        } else {
            LogUtil.j("FamilyHealthZoneImpl", "requestFindUserInfo onLoginError");
        }
    }

    private String b(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), str);
    }

    private void b() {
        d("sIsFirstHealth", "1");
    }

    private void d(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(CapabilityStatus.AWA_CAP_CODE_WIFI), str, str2, null);
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void getUserGrpList(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("FamilyHealthZoneImpl", "getUserGrpList callback is null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeZone", HiDateUtil.c((String) null));
            pfk.c("socialCloudRankUrl", "/v2/getUserGrpList", jSONObject, null, new HttpDataCallback() { // from class: pfg.1
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i, String str) {
                    iBaseResponseCallback.a(i, str);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject2) {
                    iBaseResponseCallback.a(0, jSONObject2);
                }
            });
        } catch (JSONException e) {
            LogUtil.e("FamilyHealthZoneImpl", LogAnonymous.b(e));
            iBaseResponseCallback.a(-1, e.getMessage());
        }
    }

    @Override // com.huawei.health.pluginhealthzone.FamilyHealthZoneApi
    public void getUserGrpNotifyList(final IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("FamilyHealthZoneImpl", "getUserGrpList callback is null!");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timeZone", HiDateUtil.c((String) null));
            jSONObject.put("type", i);
            jSONObject.put("withNotifiedList", 0);
            pfk.b("socialCloudRankUrl", "/v2/getUserGrpNotifyList", jSONObject, null, new HttpDataCallback() { // from class: pfg.4
                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onFailure(int i2, String str) {
                    iBaseResponseCallback.a(i2, str);
                }

                @Override // com.huawei.pluginhealthzone.cloud.HttpDataCallback
                public void onSuccess(JSONObject jSONObject2) {
                    iBaseResponseCallback.a(0, jSONObject2);
                }
            }, true);
        } catch (JSONException e) {
            LogUtil.e("FamilyHealthZoneImpl", LogAnonymous.b(e));
            iBaseResponseCallback.a(-1, e.getMessage());
        }
    }
}
