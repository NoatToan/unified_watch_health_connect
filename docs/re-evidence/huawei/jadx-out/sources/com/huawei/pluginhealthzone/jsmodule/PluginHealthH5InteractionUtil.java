package com.huawei.pluginhealthzone.jsmodule;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginhealthzone.jsmodule.callback.PushMessageListener;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager;
import com.huawei.utils.FoundationCommonUtil;
import com.tencent.open.SocialConstants;
import defpackage.gqc;
import defpackage.gqd;
import defpackage.gxt;
import defpackage.iod;
import defpackage.iov;
import defpackage.lpf;
import defpackage.mgg;
import defpackage.npg;
import defpackage.pft;
import defpackage.pfu;
import defpackage.pfx;
import defpackage.pgo;
import defpackage.pgq;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class PluginHealthH5InteractionUtil extends JsBaseModule {
    private static final String AUTHORITIES = "com.android.emergency.EmergencyInfoProvider";
    private static final String CLASS_NAME = "com.android.emergency.view.ViewInfoActivity";
    private static final int DEFAULT_STRING_BUILDER_SIZE = 256;
    private static final String EMERGENCY_METADATA = "android.write_emergency_contact";
    private static final String EMRGENCY_CONTACTS = "android.emergency.EMRGENCY_CONTACTS";
    private static final int FOLLOW_SIZE_MAX = 20;
    private static final String METHOD = "WRITE_EMERGENCY_INFO";
    private static final String PACKAGE_NAME = "com.android.emergency";
    private static final String SCREEN_OFF = "1201";
    private static final String USER_INFO_ACTIVITY = "com.huawei.featureuserprofile.me.UserInfoActivity";
    private ScreenBroadcastReceiver mScreenBroadcastReceiver = null;
    private final List<lpf> mPathFileidList = new ArrayList();
    private final List<String> mListImagePath = new ArrayList();
    private final List<String> mListVideoPath = new ArrayList();
    private boolean mIsVideo = false;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        ScreenBroadcastReceiver screenBroadcastReceiver = new ScreenBroadcastReceiver();
        this.mScreenBroadcastReceiver = screenBroadcastReceiver;
        BroadcastManager.g(screenBroadcastReceiver);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        LogUtil.a(this.TAG, "onDestroy");
        npg.d().c(this.TAG);
        BroadcastManager.q(this.mScreenBroadcastReceiver);
        if (HealthZonePushReceiver.getPushMessageListener() != null) {
            HealthZonePushReceiver.setPushMessageListener(null);
        }
        super.onDestroy();
    }

    @JavascriptInterface
    public void getLocation(final long j) {
        LogUtil.a(this.TAG, "getLocation enter");
        npg.d().a(new ILoactionCallback() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.5
            @Override // com.huawei.hwlocationmgr.model.ILoactionCallback
            public void dispatchLocationChanged(Location location) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(JsbMapKeyNames.H5_LOC_LAT, location.getLatitude());
                    jSONObject.put(JsbMapKeyNames.H5_LOC_LON, location.getLongitude());
                } catch (JSONException unused) {
                    LogUtil.e(PluginHealthH5InteractionUtil.this.TAG, "jsonException");
                }
                PluginHealthH5InteractionUtil.this.onSuccessCallback(j, jSONObject);
                npg.d().c(PluginHealthH5InteractionUtil.this.TAG);
            }
        }, this.TAG);
    }

    public static class ScreenBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("ScreenBroadcastReceiver", "action == null");
                return;
            }
            LogUtil.a("ScreenBroadcastReceiver", "action:", action);
            if (!action.equals("android.intent.action.SCREEN_OFF") || HealthZonePushReceiver.getPushMessageListener() == null) {
                return;
            }
            HealthZonePushReceiver.getPushMessageListener().onChange(PluginHealthH5InteractionUtil.SCREEN_OFF, "");
        }
    }

    @JavascriptInterface
    public void isBackgroundEnabled(long j) {
        LogUtil.a(this.TAG, "isBackgroundEnabled enter");
        boolean zBg = CommonUtil.bg();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", zBg);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "isBackgroundEnabled jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getBaseUrl(long j) {
        LogUtil.a(this.TAG, "getBaseUrl enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("baseUrl", GRSManager.c(this.mContext).getUrl("healthCloudUrl"));
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getBaseUrl jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void registerPushListener(final long j) {
        LogUtil.a(this.TAG, "registerPushListener enter");
        HealthZonePushReceiver.setPushMessageListener(new PushMessageListener() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.4
            @Override // com.huawei.pluginhealthzone.jsmodule.callback.PushMessageListener
            public void onResult(int i) {
                LogUtil.j(PluginHealthH5InteractionUtil.this.TAG, "registerPushListener onResult FAIL");
                PluginHealthH5InteractionUtil.this.onFailureCallback(j, "registerPushListener onResult FAIL", i);
            }

            @Override // com.huawei.pluginhealthzone.jsmodule.callback.PushMessageListener
            public void onChange(String str, String str2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", str);
                    jSONObject.put("value", str2);
                    PluginHealthH5InteractionUtil.this.onSuccessCallback(j, jSONObject);
                } catch (JSONException e) {
                    LogUtil.e(PluginHealthH5InteractionUtil.this.TAG, "registerPushListener jsonException", LogAnonymous.b(e));
                    PluginHealthH5InteractionUtil.this.onFailureCallback(j, LogAnonymous.b(e));
                }
            }
        });
    }

    @JavascriptInterface
    public void getDocumentations(long j) {
        LogUtil.a(this.TAG, "geDocumentations enter");
        GRSManager gRSManagerC = GRSManager.c(this.mContext);
        String noCheckUrl = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdn", gRSManagerC.getCommonCountryCode());
        String url = GRSManager.c(this.mContext).getUrl("domainTipsResDbankcdnNew");
        String url2 = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdnNew");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("backNote", noCheckUrl);
            jSONObject.put("noteUrl", url);
            jSONObject.put("tutorialsUrl", url2);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getDocumentations jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getShareUrl(long j) {
        LogUtil.a(this.TAG, "getShareUrl enter");
        StringBuilder sb = new StringBuilder(256);
        if (CompileParameterUtil.c("SUPPORT_WIFI_QR_URL_TEST", false)) {
            sb.append(CompileParameterUtil.b("WIFI_QRCODE_URL_PRE_TEST", ""));
        } else {
            sb.append(GRSManager.c(BaseApplication.getContext()).getUrl("domainUrlCloudHuawei"));
        }
        String url = GRSManager.c(this.mContext).getUrl("activityUrl");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", url);
            jSONObject.put("qrUrl", sb);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getShareUrl jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getAppSettings(long j) {
        LogUtil.a(this.TAG, "getAppSettings enter");
        pgo pgoVar = new pgo();
        pgoVar.a(UnitUtil.a());
        pgoVar.d(UnitUtil.f());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("settings", HiJsonUtil.d(pgoVar));
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getAppSettings jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getUserAge(long j) {
        LogUtil.a(this.TAG, "getUserAge enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("age", LoginInit.getInstance(this.mContext).getAccountInfo(1004));
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getUserAge jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void goSetMyinfo(long j) {
        LogUtil.a(this.TAG, "goSetMyinfo enter");
        Intent intent = new Intent();
        intent.setClassName(this.mContext, "com.huawei.featureuserprofile.me.UserInfoActivity");
        intent.setPackage(this.mContext.getPackageName());
        intent.addFlags(268435456);
        this.mContext.startActivity(intent);
    }

    @JavascriptInterface
    public void searchHmsAccount(final long j, String str) {
        LogUtil.a(this.TAG, "searchHmsAccount enter");
        try {
            HealthZoneUserManager.e().c(0, new JSONObject(str).optString("data"), new UserInfoCallback<gqd.c>() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.3
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqd.c cVar) {
                    LogUtil.a(PluginHealthH5InteractionUtil.this.TAG, "searchHmsAccount infoCallback");
                    PluginHealthH5InteractionUtil.this.onSuccessCallback(j, cVar.e());
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i) {
                    LogUtil.e(PluginHealthH5InteractionUtil.this.TAG, "errorCallback errorCode is ", Integer.valueOf(i));
                    PluginHealthH5InteractionUtil.this.onFailureCallback(j, "requestFindUserInfo errorCallback FAIL", i);
                }
            });
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "searchHmsAccount jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getOtherUserInfo(final int i, String str) {
        try {
            ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).getOtherUserInfo(new JSONObject(str).optString("data"), new UserInfoCallback<gqc>() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.2
                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void infoCallback(gqc gqcVar) {
                    LogUtil.a(PluginHealthH5InteractionUtil.this.TAG, "getOtherUserInfo infoCallback");
                    PluginHealthH5InteractionUtil.this.onSuccessCallback(i, gqcVar.d().a().c());
                }

                @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
                public void errorCallback(int i2) {
                    LogUtil.e(PluginHealthH5InteractionUtil.this.TAG, "errorCallback errorCode is ", Integer.valueOf(i2));
                    PluginHealthH5InteractionUtil.this.onFailureCallback(i, "getOtherUserInfo errorCallback FAIL", i2);
                }
            });
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getOtherUserInfo jsonException", LogAnonymous.b(e));
            onFailureCallback(i, LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void getMemberNameAndIcon(long j, String str) {
        JSONArray jSONArrayOptJSONArray;
        LogUtil.a(this.TAG, "getMemberNameAndIcon enter, callbackId:", Long.valueOf(j));
        try {
            jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("members");
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getMemberNameAndIcon jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
            jSONArrayOptJSONArray = null;
        }
        List<pgq> listSynchronizedList = Collections.synchronizedList(new ArrayList(20));
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j(this.TAG, "members == null || members.length() == 0");
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                getUserDataFormWhere(Long.parseLong(jSONArrayOptJSONArray.getString(i)), listSynchronizedList, length, j);
            } catch (NumberFormatException | JSONException unused) {
                updateFollowedImage(0L, null, listSynchronizedList, length, j);
            }
        }
    }

    private void getUserDataFormWhere(final long j, final List<pgq> list, final int i, final long j2) {
        LogUtil.a(this.TAG, "getUserImageAndNicknameFromSocial enter");
        HealthZoneUserManager.e().c(2, String.valueOf(j), new UserInfoCallback<gqd.c>() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.1
            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void infoCallback(gqd.c cVar) {
                LogUtil.a(PluginHealthH5InteractionUtil.this.TAG, "getUserImageAndNicknameFromSocial infoCallback");
                PluginHealthH5InteractionUtil.this.updateFollowedImage(j, cVar, list, i, j2);
            }

            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            public void errorCallback(int i2) {
                LogUtil.j(PluginHealthH5InteractionUtil.this.TAG, "getUserImageAndNicknameFromSocial errorCallback errorCode:", Integer.valueOf(i2));
                PluginHealthH5InteractionUtil.this.updateFollowedImage(j, null, list, i, j2);
                PluginHealthH5InteractionUtil.this.onFailureCallback(j2, String.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFollowedImage(long j, gqd.c cVar, List<pgq> list, int i, long j2) {
        LogUtil.a(this.TAG, "updateFollowedImage, callbackId:", Long.valueOf(j2));
        pgq pgqVar = new pgq();
        pgqVar.b(j);
        if (cVar != null) {
            pgqVar.c(cVar.c());
            pgqVar.b(cVar.d());
        }
        list.add(pgqVar);
        LogUtil.a(this.TAG, "imageList.size():", Integer.valueOf(list.size()), ", count:", Integer.valueOf(i));
        if (list.size() == i) {
            onSuccessCallback(j2, HiJsonUtil.d(list));
        }
    }

    @JavascriptInterface
    public void getPreDeviceInfo(long j) {
        LogUtil.a(this.TAG, "getPreDeviceInfo enter");
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceUdid(FoundationCommonUtil.getAndroidId(this.mContext));
        deviceInfo.setDeviceName(Build.MANUFACTURER + " " + Build.PRODUCT);
        DeviceInfo deviceInfoC = mgg.c(this.TAG);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phone", HiJsonUtil.d(deviceInfo));
            jSONObject.put(DeviceTypeConsts.WATCH, HiJsonUtil.d(deviceInfoC));
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "getPreDeviceInfo jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    private Bitmap getAppIcon() {
        Drawable drawableLoadIcon = BaseApplication.getContext().getApplicationInfo().loadIcon(BaseApplication.getContext().getPackageManager());
        if (drawableLoadIcon instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableLoadIcon).getBitmap();
        }
        return null;
    }

    @JavascriptInterface
    public void setMemberListInfo(long j, String str) {
        try {
            LogUtil.a(this.TAG, "setMemberListInfo, param: ", str, ", callbackId: ", Long.valueOf(j));
            FunctionSetBeanHelper.e().b(new JSONObject(str));
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "shareMemberListInfo jsonException", LogAnonymous.b(e));
        }
    }

    @JavascriptInterface
    public void shareLink(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("title");
            String strOptString3 = jSONObject.optString(SocialConstants.PARAM_APP_DESC);
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                shareLink(strOptString, strOptString2, strOptString3, jSONObject.optString("iconUrl"), jSONObject.optBoolean("shareFamily", false));
                onSuccessCallback(j);
                return;
            }
            onFailureCallback(j, "param is invalid");
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "shareLink jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
    }

    private void shareLink(String str, String str2, String str3, String str4, boolean z) {
        Bitmap bitmapString2Bitmap = TextUtils.isEmpty(str4) ? null : string2Bitmap(str4);
        if (bitmapString2Bitmap == null) {
            bitmapString2Bitmap = getAppIcon();
        }
        gxt gxtVar = new gxt(2);
        gxtVar.b(str3);
        gxtVar.d(bitmapString2Bitmap);
        gxtVar.f(str);
        gxtVar.e(str2);
        gxtVar.b(z);
        gxtVar.d(AnalyticsValue.SHARE_1140001.value());
        shareContent(BaseApplication.getActivity(), gxtVar, false);
    }

    private Bitmap string2Bitmap(String str) {
        byte[] bArrDecode = Base64.decode(str.replace("data:image/png;base64,", "").replace("data:image/jpeg;base64,", "").getBytes(Charset.defaultCharset()), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    private static void shareContent(Context context, gxt gxtVar, boolean z) {
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        gxtVar.e(z);
        socialShareCenterApi.exeShare(gxtVar, context);
    }

    @JavascriptInterface
    public void uploadFiles(long j, String str) {
        LogUtil.a(this.TAG, "uploadFiles:", str);
        JSONArray jSONArrayOptJSONArray = null;
        try {
            jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("files");
            LogUtil.a(this.TAG, "uploadFiles files:", jSONArrayOptJSONArray.toString());
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "uploadFiles jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j(this.TAG, "members == null || members.length() == 0");
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                if (!TextUtils.isEmpty(jSONArrayOptJSONArray.getString(i)) && jSONArrayOptJSONArray.getString(i).contains("webp")) {
                    addPath(jSONArrayOptJSONArray.getString(i));
                    getShareImage(this.mListImagePath, 1, j);
                }
                if (!TextUtils.isEmpty(jSONArrayOptJSONArray.getString(i)) && jSONArrayOptJSONArray.getString(i).contains("mp4")) {
                    addPath(jSONArrayOptJSONArray.getString(i));
                    this.mIsVideo = true;
                    getShareVideo(this.mListVideoPath, 3, j);
                }
            } catch (NumberFormatException | JSONException unused) {
                LogUtil.e(this.TAG, "uploadFiles err");
            }
        }
    }

    private void addPath(String str) {
        if (str.contains(".webp")) {
            this.mListImagePath.add(str);
        } else {
            this.mListVideoPath.add(str);
        }
    }

    private void getShareImage(List<String> list, int i, final long j) {
        ReleaseLogUtil.c(this.TAG, "getShareImage listPath is ", list);
        HealthZoneUserManager.e().c(i, list, new HealthZoneUserManager.UploadDataFilesCallback() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.7
            @Override // com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager.UploadDataFilesCallback
            public void infoCallback(List<lpf> list2) {
                PluginHealthH5InteractionUtil.this.updateImageId(list2, j);
            }

            @Override // com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager.UploadDataFilesCallback
            public void errorCallback(int i2) {
                LogUtil.a(PluginHealthH5InteractionUtil.this.TAG, "getShareImage errorCallback errorCode:", Integer.valueOf(i2));
                PluginHealthH5InteractionUtil.this.onFailureCallback(j, String.valueOf(i2));
            }
        });
    }

    private void getShareVideo(List<String> list, int i, final long j) {
        HealthZoneUserManager.e().c(i, list, new HealthZoneUserManager.UploadDataFilesCallback() { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.10
            @Override // com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager.UploadDataFilesCallback
            public void infoCallback(List<lpf> list2) {
                PluginHealthH5InteractionUtil.this.updateVideoId(list2, j);
            }

            @Override // com.huawei.ui.main.stories.healthzone.util.HealthZoneUserManager.UploadDataFilesCallback
            public void errorCallback(int i2) {
                LogUtil.a(PluginHealthH5InteractionUtil.this.TAG, "getShareVideo errorCallback errorCode:", Integer.valueOf(i2));
                PluginHealthH5InteractionUtil.this.onFailureCallback(j, String.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateImageId(List<lpf> list, long j) {
        this.mPathFileidList.addAll(list);
        LogUtil.a(this.TAG, "updateImageId:", HiJsonUtil.d(this.mPathFileidList));
        if (!this.mIsVideo) {
            onSuccessCallback(j, HiJsonUtil.d(this.mPathFileidList));
        } else if (this.mPathFileidList.size() > 1) {
            onSuccessCallback(j, HiJsonUtil.d(this.mPathFileidList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoId(List<lpf> list, long j) {
        this.mPathFileidList.addAll(list);
        LogUtil.a(this.TAG, "updateVideoId:", HiJsonUtil.d(this.mPathFileidList));
        if (this.mPathFileidList.size() > 1) {
            onSuccessCallback(j, HiJsonUtil.d(this.mPathFileidList));
        }
    }

    @JavascriptInterface
    public void setFallDetectionAuthorization(final long j) {
        pft pftVar = new pft();
        pftVar.b(IEventListener.EVENT_ID_DEVICE_RTSP_CONN);
        pfx pfxVar = new pfx();
        pfxVar.e(pftVar);
        LogUtil.a(this.TAG, "sendMsgToDevice ResponseMsgBody = ", HiJsonUtil.d(pfxVar));
        pfu.b().a(new DeviceDataListener() { // from class: pgl
            @Override // com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener
            public final void onResult(int i, pfx pfxVar2) {
                this.f45328a.m1655x458a36dc(j, i, pfxVar2);
            }
        }, IEventListener.EVENT_ID_DEVICE_UPDATE);
        pfu.b().activeSendMsgToDevice(0, pfxVar, new DeviceDataListener() { // from class: pgi
            @Override // com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener
            public final void onResult(int i, pfx pfxVar2) {
                this.f45323b.m1656xe1f8333b(j, i, pfxVar2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setFallDetectionAuthorization$0$com-huawei-pluginhealthzone-jsmodule-PluginHealthH5InteractionUtil, reason: not valid java name */
    public /* synthetic */ void m1655x458a36dc(long j, int i, pfx pfxVar) {
        setResultCode(j, i);
    }

    /* JADX INFO: renamed from: lambda$setFallDetectionAuthorization$1$com-huawei-pluginhealthzone-jsmodule-PluginHealthH5InteractionUtil, reason: not valid java name */
    public /* synthetic */ void m1656xe1f8333b(long j, int i, pfx pfxVar) {
        LogUtil.a(this.TAG, "sendMsgToDevice resultCode = ", Integer.valueOf(i), "ResponseMsgBody = ");
        if (i == -1) {
            setResultCode(j, i);
        }
    }

    private void setResultCode(long j, int i) {
        LogUtil.a(this.TAG, "setResultCode resultCode = ", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e) {
            LogUtil.e(this.TAG, "setFallDetectionAuthorization jsonException", LogAnonymous.b(e));
            onFailureCallback(j, LogAnonymous.b(e));
        }
        pfu.b().a(IEventListener.EVENT_ID_DEVICE_UPDATE);
    }

    @JavascriptInterface
    public void stopFallDetectionAuthorization(long j) {
        pft pftVar = new pft();
        pftVar.b(3009);
        pfx pfxVar = new pfx();
        pfxVar.e(pftVar);
        LogUtil.a(this.TAG, "stopFallDetectionAuthorization ResponseMsgBody = ", HiJsonUtil.d(pfxVar));
        pfu.b().activeSendMsgToDevice(0, pfxVar, new DeviceDataListener() { // from class: pgj
            @Override // com.huawei.pluginhealthzone.devicelink.callback.DeviceDataListener
            public final void onResult(int i, pfx pfxVar2) {
                this.f45324a.m1657xb6bcd3a0(i, pfxVar2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$stopFallDetectionAuthorization$2$com-huawei-pluginhealthzone-jsmodule-PluginHealthH5InteractionUtil, reason: not valid java name */
    public /* synthetic */ void m1657xb6bcd3a0(int i, pfx pfxVar) {
        LogUtil.a(this.TAG, "stopFallDetectionAuthorization resultCode = ", Integer.valueOf(i));
    }

    @JavascriptInterface
    public void saveEmergencyContacts(long j, String str) {
        LogUtil.a(this.TAG, "saveEmergencyContacts enter");
        if (!TextUtils.isEmpty(str)) {
            try {
                iod iodVar = (iod) new Gson().fromJson(str, iod.class);
                LogUtil.a(this.TAG, "contactInfo: ", iodVar.toString());
                boolean zSaveAppEmergencyContacts = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).saveAppEmergencyContacts(iodVar);
                LogUtil.a(this.TAG, "isSave: ", Boolean.valueOf(zSaveAppEmergencyContacts));
                onSuccessCallback(j, Boolean.valueOf(zSaveAppEmergencyContacts));
                return;
            } catch (JsonSyntaxException e) {
                LogUtil.e(this.TAG, "parse contactInformation error:", e.getMessage());
                onFailureCallback(j, "parse contactInformation error");
                return;
            }
        }
        onFailureCallback(j, "contactInformation is null");
    }

    @JavascriptInterface
    public void getAndroidEmergencyContact(long j) {
        LogUtil.a(this.TAG, "getAndroidEmergencyContact enter");
        List<iod> emergencyContact = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyContact();
        LogUtil.a(this.TAG, "emergencyContactSize: ", Integer.valueOf(emergencyContact.size()));
        onSuccessCallback(j, HiJsonUtil.d(emergencyContact));
    }

    @JavascriptInterface
    public void isHarmony(long j) {
        LogUtil.a(this.TAG, "isHarmony enter");
        boolean zHasEmergencyInfoProvider = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider();
        LogUtil.a(this.TAG, "isHarmony: ", Boolean.valueOf(zHasEmergencyInfoProvider));
        onSuccessCallback(j, Boolean.valueOf(zHasEmergencyInfoProvider));
    }

    @JavascriptInterface
    public void getHarmonyEmergencyContacts(long j) {
        LogUtil.a(this.TAG, "getHarmonyEmergencyContacts enter");
        List<String> harmonyEmergencyContactsUri = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getHarmonyEmergencyContactsUri();
        LogUtil.a(this.TAG, "emergencyContactsSize: ", Integer.valueOf(harmonyEmergencyContactsUri.size()));
        onSuccessCallback(j, Integer.valueOf(harmonyEmergencyContactsUri.size()));
    }

    @JavascriptInterface
    public void harmonyEmergencyContactsPage(long j) {
        LogUtil.a(this.TAG, "harmonyEmergencyContactsPage enter");
        try {
            if (getMetaDataFromApp() == 0.0f) {
                Intent intent = new Intent();
                intent.setClassName("com.android.emergency", "com.android.emergency.view.ViewInfoActivity");
                this.mContext.startActivity(intent);
            } else {
                this.mContext.startActivity(new Intent("android.emergency.EMRGENCY_CONTACTS"));
            }
            onSuccessCallback(j, true);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(this.TAG, "Emui110 activityNotFoundException SOS");
            onFailureCallback(j, "Emui110 activityNotFoundException SOS");
        }
    }

    @JavascriptInterface
    public void androidEmergencyContactsPage(long j) {
        LogUtil.a(this.TAG, "androidEmergencyContactsPage enter");
        AppRouter.c("/HWUserProfileMgr/EditContactActivity").b(BaseApplication.getContext());
        onSuccessCallback(j, true);
    }

    @JavascriptInterface
    public void addContactInAddressBook(long j, String str) {
        LogUtil.a(this.TAG, "addContactInAddressBook enter");
        if (!TextUtils.isEmpty(str)) {
            try {
                iod iodVar = (iod) new Gson().fromJson(str, iod.class);
                if (iodVar != null && !TextUtils.isEmpty(iodVar.e()) && !TextUtils.isEmpty(iodVar.b())) {
                    LogUtil.a(this.TAG, "addContactInAddressBook contactInfo: ", iodVar.toString());
                    Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                    intent.setType("vnd.android.cursor.dir/raw_contact");
                    intent.putExtra("name", iodVar.e());
                    intent.putExtra("phone", iodVar.b());
                    iov.d(this.mContext, intent);
                    onSuccessCallback(j, "addContactInAddressBook success go address book");
                    return;
                }
                onFailureCallback(j, "The name or phone number is empty.");
                return;
            } catch (JsonSyntaxException unused) {
                ReleaseLogUtil.b(this.TAG, "addContactInAddressBook parse contactInformation error");
                onFailureCallback(j, "addContactInAddressBook parse contactInformation error");
                return;
            }
        }
        onFailureCallback(j, "addContactInAddressBook contactInformation is null");
    }

    @JavascriptInterface
    public void addContact(final long j, String str) {
        LogUtil.a(this.TAG, "addContact enter");
        if (!TextUtils.isEmpty(str)) {
            try {
                final iod iodVar = (iod) new Gson().fromJson(str, iod.class);
                if (iodVar != null && !TextUtils.isEmpty(iodVar.e()) && !TextUtils.isEmpty(iodVar.b())) {
                    LogUtil.a(this.TAG, "addContact contactInfo: ", iodVar.toString());
                    PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.READ_WRITE_CONTACT, new CustomPermissionAction(this.mContext) { // from class: com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil.6
                        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onGranted() throws Throwable {
                            LogUtil.j(PluginHealthH5InteractionUtil.this.TAG, "addContact permission success");
                            PluginHealthH5InteractionUtil.this.harmonyWriteContacts(j, iodVar);
                        }

                        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onDenied(String str2) {
                            LogUtil.j(PluginHealthH5InteractionUtil.this.TAG, "addContact permission denied");
                            super.onDenied(str2);
                            PluginHealthH5InteractionUtil.this.onFailureCallback(j, "addContact permission denied");
                        }

                        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                            LogUtil.j(PluginHealthH5InteractionUtil.this.TAG, "addContact permission forever denied, show the guide window");
                            super.onForeverDenied(permissionType);
                            PluginHealthH5InteractionUtil.this.onFailureCallback(j, "addContact permission forever denied, show the guide window");
                        }
                    });
                    return;
                }
                onFailureCallback(j, "The name or phone number is empty.");
                return;
            } catch (JsonSyntaxException e) {
                LogUtil.e(this.TAG, "addContact parse contactInformation error:", e.getMessage());
                onFailureCallback(j, "addContact parse contactInformation error");
                return;
            }
        }
        onFailureCallback(j, "addContact contactInformation is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void harmonyWriteContacts(long j, iod iodVar) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Uri uriAddHarmonyContact = addHarmonyContact(iodVar.e(), iodVar.b());
        LogUtil.a(this.TAG, "isContacts: ", uriAddHarmonyContact);
        if (uriAddHarmonyContact == null) {
            onSuccessCallback(j, false);
            return;
        }
        if (getMetaDataFromApp() == 0.0f) {
            LogUtil.a(this.TAG, "Harmony not updated");
            onSuccessCallback(j, true);
            return;
        }
        ContentResolver contentResolver = this.mContext.getContentResolver();
        if (contentResolver == null) {
            LogUtil.j(this.TAG, "harmonyWriteContacts contentResolver is null");
            return;
        }
        LogUtil.a(this.TAG, "The Harmony has been updated.");
        ContentProviderClient contentProviderClient = null;
        try {
            try {
                contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(AUTHORITIES);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        LogUtil.j(this.TAG, "emergencyInfoProviderClient is null");
                        releaseResource(contentProviderClientAcquireUnstableContentProviderClient);
                        return;
                    }
                    Bundle bundleCall = contentResolver.call(AUTHORITIES, METHOD, uriAddHarmonyContact.toString(), (Bundle) null);
                    if (bundleCall != null) {
                        onSuccessCallback(j, bundleCall.get("RESULT"));
                        LogUtil.a(this.TAG, "RESULT: ", bundleCall.get("RESULT"));
                    }
                    releaseResource(contentProviderClientAcquireUnstableContentProviderClient);
                } catch (IllegalArgumentException e) {
                    e = e;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    LogUtil.e(this.TAG, "requestEmergencyInfoProvider getContentResolver call ", LogAnonymous.b(e));
                    onFailureCallback(j, LogAnonymous.b(e));
                    releaseResource(contentProviderClient);
                } catch (Throwable th) {
                    th = th;
                    releaseResource(contentProviderClientAcquireUnstableContentProviderClient);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
        }
    }

    @JavascriptInterface
    public void getHarmonyEmergencyContact(long j) {
        LogUtil.a(this.TAG, "getHarmonyEmergencyContact enter");
        List<iod> emergencyContact = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyContact();
        LogUtil.a(this.TAG, "filteredEmergencyContacts", Integer.valueOf(emergencyContact.size()));
        onSuccessCallback(j, HiJsonUtil.d(emergencyContact));
    }

    @JavascriptInterface
    public void getHarmonyUpdate(long j) {
        LogUtil.a(this.TAG, "getHarmonyUpdate enter");
        onSuccessCallback(j, Boolean.valueOf(getMetaDataFromApp() != 0.0f));
    }

    public Uri addHarmonyContact(String str, String str2) {
        LogUtil.j(this.TAG, "addHarmonyContact");
        ContentValues contentValues = new ContentValues();
        long id = ContentUris.parseId(BaseApplication.getContext().getContentResolver().insert(ContactsContract.RawContacts.CONTENT_URI, contentValues));
        contentValues.clear();
        contentValues.put("raw_contact_id", Long.valueOf(id));
        contentValues.put("mimetype", "vnd.android.cursor.item/name");
        contentValues.put("data2", str);
        BaseApplication.getContext().getContentResolver().insert(ContactsContract.Data.CONTENT_URI, contentValues);
        LogUtil.j(this.TAG, "addHarmonyContact success");
        contentValues.clear();
        contentValues.put("raw_contact_id", Long.valueOf(id));
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues.put("data1", str2);
        contentValues.put("data2", (Integer) 2);
        Uri uriInsert = BaseApplication.getContext().getContentResolver().insert(ContactsContract.Data.CONTENT_URI, contentValues);
        contentValues.clear();
        LogUtil.j(this.TAG, "addHarmonyContact success");
        return uriInsert;
    }

    private float getMetaDataFromApp() {
        try {
            return BaseApplication.getContext().getPackageManager().getApplicationInfo("com.android.emergency", 128).metaData.getFloat("android.write_emergency_contact");
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e(this.TAG, "getMetaDataFromApp NameNotFoundException");
            return 0.0f;
        }
    }

    private void releaseResource(ContentProviderClient contentProviderClient) {
        if (contentProviderClient == null) {
            return;
        }
        try {
            contentProviderClient.close();
        } catch (Exception e) {
            LogUtil.e(this.TAG, "release providerClient failed with exception: ", LogAnonymous.b(e));
        }
    }
}
