package com.xiaomi.hm.health.lab.webapi;

import android.content.Context;
import android.os.Build;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.lab.activity.BehaviorTaggingSwimmingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import defpackage.r50;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.apache.http.entity.FileEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMUploadDeviceLogAPI {
    private static final String a = "HMUploadFeedbackAPI";
    private static final String b = "huami.health.uploadlogdata.json";
    private static final String c = "appversion";
    private static final String d = "fitfwversion";
    private static final String e = "shoesfwversion";
    private static final String f = "scalefwversion";
    private static final String g = "phonemodel";
    private static final String h = "phonesystem";
    private static final String i = "log_file";
    private static final String j = "log_file_name";
    private static final String k = "contact";
    private static final String l = "content";
    private static final String m = "userid";
    private static final String n = "language";
    private static final String o = "location";
    private static final String p = "sourcelist";
    private static final String q = "appType";
    private static final String r = "release";
    private static final String s = "develop";

    public static class a {
        public static final String a = "legacy/users/%s/apps/%s/fileAccessURIs";
        public static final String b = "logFile";
        public static final String c = "fileInfo";
        public static final String d = "fileType";
        public static final String e = "LOG";
        public static final String f = "fileName";
        private static final String g = "appVersion";
        private static final String h = "appType";
        private static final String i = "fitfwVersion";
        private static final String j = "shoesfwVersion";
        private static final String k = "scalefwversion";
        private static final String l = "phoneModel";
        private static final String m = "phoneSystem";
        private static final String n = "log_file_name";
        private static final String o = "contact";
        private static final String p = "content";
        private static final String q = "language";
        private static final String r = "location";
        private static final String s = "sourcelist";
        private static final String t = "name";
        private static final String u = "additionalInfo";

        private a() {
        }
    }

    private static JSONObject i(Context context, String str, String str2, String str3, File file) {
        String firmwareVersionStr;
        String firmwareVersionStr2;
        String firmwareVersionStr3;
        HMLog.info(a, new Function0() { // from class: fo3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMUploadDeviceLogAPI.k();
            }
        });
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strJ = j();
            String name = "";
            jSONObject2.put(j, file == null ? "" : file.getName());
            HMBaseDevice device = LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.MILI);
            if (device == null || device.getDeviceInfo() == null) {
                HMLog.info(a, new Function0() { // from class: co3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMUploadDeviceLogAPI.l();
                    }
                });
                firmwareVersionStr = "";
            } else {
                firmwareVersionStr = device.getDeviceInfo().getFirmwareVersionStr();
            }
            HMBaseDevice device2 = LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.SHOES);
            if (device2 == null || device2.getDeviceInfo() == null) {
                HMLog.info(a, new Function0() { // from class: go3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMUploadDeviceLogAPI.m();
                    }
                });
                firmwareVersionStr2 = "";
            } else {
                firmwareVersionStr2 = device2.getDeviceInfo().getFirmwareVersionStr();
            }
            HMBaseDevice device3 = LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.WEIGHT);
            if (device3 == null || device3.getDeviceInfo() == null) {
                HMLog.info(a, new Function0() { // from class: eo3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMUploadDeviceLogAPI.n();
                    }
                });
                firmwareVersionStr3 = "";
            } else {
                firmwareVersionStr3 = device3.getDeviceInfo().getFirmwareVersionStr();
            }
            jSONObject2.put("contact", str);
            jSONObject2.put("content", str2);
            jSONObject2.put("fitfwVersion", firmwareVersionStr);
            jSONObject2.put("language", Locale.getDefault().getLanguage());
            jSONObject2.put("location", Language.getDefault());
            jSONObject2.put("phoneModel", Build.MODEL);
            jSONObject2.put("phoneSystem", Build.VERSION.SDK_INT);
            jSONObject2.put(f, firmwareVersionStr3);
            jSONObject2.put("shoesfwVersion", firmwareVersionStr2);
            jSONObject2.put(p, strJ);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", str3);
            jSONObject2.put("additionalInfo", jSONObject3.toString());
            jSONObject.put("fileType", "LOG");
            if (file != null) {
                name = file.getName();
            }
            jSONObject.put("fileName", name);
            jSONObject.put(a.b, jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    private static String j() {
        JSONObject jSONObject = new JSONObject();
        try {
            HMDeviceSource boundDeviceSource = LabCallbackInit.getInitCallBack().getBoundDeviceSource(HMDeviceType.WATCH);
            if (boundDeviceSource != HMDeviceSource.VDEVICE) {
                jSONObject.put("band_watch", boundDeviceSource.getValue());
            } else {
                jSONObject.put("band_watch", LabCallbackInit.getInitCallBack().getBoundDeviceSource(HMDeviceType.MILI).getValue());
            }
            jSONObject.put(StatEvent.SPORT_TP_VALUE_SHOES, LabCallbackInit.getInitCallBack().getBoundDeviceSource(HMDeviceType.SHOES).getValue());
            jSONObject.put(AnimatorViewWrapper.SCALE, LabCallbackInit.getInitCallBack().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue());
        } catch (Exception e2) {
            HMLog.info(a, new r50(e2));
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "start upload logfileblock.....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "cant get miliFwVersion ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "cant get shoeFwVersion ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "cant get weightFwVersion ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "feedback start upload logfileblock.....";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(String str) {
        return "uploadLogFileBlock URL：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(Map map) {
        return "uploadLogFileBlock params：" + map.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(String str, File file) {
        return "url: " + str + "\nfile size: " + file.length();
    }

    public static void uploadLogFileBlockNew(Context context, String str, String str2, String str3, File file, BehaviorTaggingSwimmingActivity.RequestSimpleHttpResponseHandler requestSimpleHttpResponseHandler) {
        HMLog.info(a, new Function0() { // from class: do3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMUploadDeviceLogAPI.o();
            }
        });
        final Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("fileInfo", i(context, str, str2, str3, file).toString());
        final String url = HMServerDef.getUrl(String.format(Locale.getDefault(), "legacy/users/%s/apps/%s/fileAccessURIs", LabCallbackInit.getInitCallBack().getUserId(), HMAppConfig.getPackageName()));
        HMLog.info(a, new Function0() { // from class: zn3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMUploadDeviceLogAPI.p(url);
            }
        });
        HMLog.info(a, new Function0() { // from class: bo3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMUploadDeviceLogAPI.q(systemParams);
            }
        });
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, requestSimpleHttpResponseHandler);
    }

    public static void uploadZipFile(Context context, final String str, final File file, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        HMLog.info(a, new Function0() { // from class: ao3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMUploadDeviceLogAPI.r(str, file);
            }
        });
        new AsyncHttpClient().put(context, str, new FileEntity(file, null), null, asyncHttpResponseHandler);
    }
}
