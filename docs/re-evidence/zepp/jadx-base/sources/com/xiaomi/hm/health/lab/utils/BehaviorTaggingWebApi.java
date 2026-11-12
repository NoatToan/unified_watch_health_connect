package com.xiaomi.hm.health.lab.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.SensorData;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagHistory;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.apache.http.Header;
import org.apache.http.entity.FileEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTaggingWebApi {
    private static final String b = "LAB_WEB_API";
    private OnDeleteItemListener a;

    public interface OnDeleteItemListener {
        void onDeleteFailure();

        void onDeleteSuccess(LabAction labAction);
    }

    public class a extends IHMHttpResponseHandler {
        public static final /* synthetic */ boolean f = false;
        public final /* synthetic */ LabAction a;
        public final /* synthetic */ EventBus b;
        public final /* synthetic */ File c;
        public final /* synthetic */ Context d;

        public a(LabAction labAction, EventBus eventBus, File file, Context context) {
            this.a = labAction;
            this.b = eventBus;
            this.c = file;
            this.d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "labs json提交onCancel";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "labs json提交onCompleted";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(Throwable th) {
            return "labs json提交异常" + th.getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h() {
            return "labs json提交失败";
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.a.e();
                }
            });
            this.a.setUploadStatus(5);
            this.b.post(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.a.f();
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(final Throwable th) {
            th.printStackTrace();
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.a.g(th);
                }
            });
            this.a.setUploadStatus(2);
            this.b.post(this.a);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData != null && hMHttpResponseData.isSuccess()) {
                BehaviorTaggingWebApi.this.A(hMHttpResponseData, this.c, this.d, this.a, this.b);
                return;
            }
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.a.h();
                }
            });
            this.a.setUploadStatus(2);
            this.b.post(this.a);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ File a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ LabAction d;
        public final /* synthetic */ EventBus e;

        public class a extends AsyncHttpResponseHandler {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String d(int i) {
                return "labs 文件上传失败：" + i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String e(int i, int i2) {
                return "labs 文件上传中 bytesWritten：" + i + "   totalSize:" + i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String f(String str) {
                return "labs 文件上传完成：" + str;
            }

            @Override // com.loopj.android.http.AsyncHttpResponseHandler
            public void onFailure(final int i, Header[] headerArr, byte[] bArr, Throwable th) {
                HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BehaviorTaggingWebApi.b.a.d(i);
                    }
                });
                b.this.d.setUploadStatus(2);
                b bVar = b.this;
                bVar.e.post(bVar.d);
                th.printStackTrace();
            }

            @Override // com.loopj.android.http.AsyncHttpResponseHandler
            public void onProgress(final int i, final int i2) {
                HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BehaviorTaggingWebApi.b.a.e(i, i2);
                    }
                });
                super.onProgress(i, i2);
            }

            @Override // com.loopj.android.http.AsyncHttpResponseHandler
            public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
                b.this.d.setUploadStatus(2);
                try {
                    if (i == 200) {
                        try {
                            final String str = new String(bArr, "utf-8");
                            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.g
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return BehaviorTaggingWebApi.b.a.f(str);
                                }
                            });
                            b bVar = b.this;
                            BehaviorTaggingWebApi.this.postBehaviorCount(BehaviorTaggingTools.getBehaviorTagCountJson(bVar.b));
                            b.this.d.setUploadStatus(3);
                            b bVar2 = b.this;
                            BehaviorTaggingWebApi.this.n(bVar2.a);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    b bVar3 = b.this;
                    bVar3.e.post(bVar3.d);
                }
            }
        }

        public b(File file, Context context, String str, LabAction labAction, EventBus eventBus) {
            this.a = file;
            this.b = context;
            this.c = str;
            this.d = labAction;
            this.e = eventBus;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
            asyncHttpClient.setTimeout(30000);
            asyncHttpClient.setMaxRetriesAndTimeout(2, 5000);
            asyncHttpClient.put(this.b, this.c, new FileEntity(this.a, null), null, new a());
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ BehaviorTagHistory a;
        public final /* synthetic */ EventBus b;
        public final /* synthetic */ String c;

        public c(BehaviorTagHistory behaviorTagHistory, EventBus eventBus, String str) {
            this.a = behaviorTagHistory;
            this.b = eventBus;
            this.c = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(int i) {
            return "labs onCancel" + i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "labs onCompleted";
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(final int i) {
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.c.c(i);
                }
            });
            this.a.setRestCode(4);
            this.b.post(this.a);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.c.d();
                }
            });
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            th.printStackTrace();
            this.a.setRestCode(2);
            this.b.post(this.a);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            try {
                JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody(), "utf-8"));
                if (jSONObject.getInt("code") != 1) {
                    this.a.setRestCode(2);
                    this.b.post(this.a);
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        long jOptLong = jSONObject2.optLong("startBehaviorTime");
                        long jOptLong2 = jSONObject2.optLong(g.q);
                        String strOptString = jSONObject2.optString(g.k);
                        String strOptString2 = jSONObject2.optString(g.j);
                        String strOptString3 = jSONObject2.optString("deviceId");
                        LabAction labAction = new LabAction();
                        labAction.setCustomizeBehaviorName(strOptString);
                        labAction.setBehaviorName(strOptString2);
                        labAction.setStartBehaviorTime(Long.valueOf(jOptLong));
                        labAction.setEndBehaviorTime(Long.valueOf(jOptLong2));
                        labAction.setDeviceId(strOptString3);
                        labAction.setUploadStatus(3);
                        labAction.setUserId("" + this.c);
                        arrayList.add(labAction);
                    }
                }
                this.a.setLabActionList(arrayList);
                this.a.setRestCode(1);
                this.b.post(this.a);
            } catch (Exception e) {
                this.a.setRestCode(2);
                this.b.post(this.a);
                e.printStackTrace();
            }
        }
    }

    public class d implements IHMBasicHttpResponseHandler {
        public final /* synthetic */ LabAction a;
        public final /* synthetic */ Context b;

        public d(LabAction labAction, Context context) {
            this.a = labAction;
            this.b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(Throwable th) {
            return "deleteBehaviorTaggingHistory error:" + th.getMessage();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            BehaviorTaggingWebApi.this.a.onDeleteFailure();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(final Throwable th) {
            HMLog.info(BehaviorTaggingWebApi.b, new Function0() { // from class: com.xiaomi.hm.health.lab.utils.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.d.b(th);
                }
            });
            BehaviorTaggingWebApi.this.a.onDeleteFailure();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            BehaviorTaggingWebApi.this.a.onDeleteFailure();
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData) {
            BehaviorTaggingTools.setByJsonData(this.a.getBehaviorName(), this.b);
            BehaviorTaggingWebApi.this.a.onDeleteSuccess(this.a);
        }
    }

    public class e extends IHMSimpleHttpResponseHandler {
        public e() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
        }
    }

    public static class f {
        public static final String a = "legacy/users/%s/sensorData";
        public static final String b = "count";
        public static final String c = "startBehaviorTime";
        public static final String d = "users/%s/sensorData/devices/%s/startBehaviorTime/%s";

        private f() {
        }
    }

    public static class g {
        public static final String a = "legacy/users/%s/apps/%s/fileAccessURIs";
        public static final String b = "sensorData";
        public static final String c = "fileInfo";
        public static final String d = "fileType";
        public static final String e = "SENSOR_DATA";
        public static final String f = "fileName";
        public static final String g = "protocolVersion";
        public static final String h = "deviceId";
        public static final String i = "deviceSource";
        public static final String j = "behaviorName";
        public static final String k = "customizeBehaviorName";
        public static final String l = "productVersion";
        public static final String m = "zipFileName";
        public static final String n = "taggingFiles";
        public static final String o = "timeZone";
        public static final String p = "startBehaviorTime";
        public static final String q = "endBehaviorTime";
        public static final String r = "sensorTypes";
        public static final String s = "sampleRate";
        public static final String t = "startTaggingTime";
        public static final String u = "endTaggingTime";
        public static final String v = "fileName";
        public static final String w = "sensorType";
        public static final String x = "sensitivity";

        private g() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(HMHttpResponseData hMHttpResponseData, File file, Context context, LabAction labAction, EventBus eventBus) {
        HMLog.info(b, new Function0() { // from class: tt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingWebApi.v();
            }
        });
        try {
            JSONObject jSONObject = new JSONObject(new String(hMHttpResponseData.getResponseBody(), "utf-8"));
            if (jSONObject.getInt("code") == 1) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                final String string = jSONObject2.get("fileName").toString();
                HMLog.info(b, new Function0() { // from class: nt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BehaviorTaggingWebApi.w(string);
                    }
                });
                final String string2 = jSONObject2.get("getURI").toString();
                HMLog.info(b, new Function0() { // from class: qt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BehaviorTaggingWebApi.x(string, string2);
                    }
                });
                final String string3 = jSONObject2.get("putURI").toString();
                HMLog.info(b, new Function0() { // from class: pt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BehaviorTaggingWebApi.y(string3);
                    }
                });
                new Handler(Looper.getMainLooper()).post(new b(file, context, string3, labAction, eventBus));
            } else {
                labAction.setUploadStatus(2);
                eventBus.post(labAction);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            labAction.setUploadStatus(2);
            eventBus.post(labAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(File file) {
        return file != null && file.exists() && file.delete();
    }

    @NonNull
    private JSONObject o(LabAction labAction, File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<SensorData> sensorDatas = labAction.getSensorDatas();
        SparseArray sparseArray = new SparseArray();
        long uploadOffsetTime = LabCallbackInit.getInitCallBack().getUploadOffsetTime();
        if (sensorDatas != null && sensorDatas.size() > 0) {
            for (int i = 0; i < sensorDatas.size(); i++) {
                SensorData sensorData = sensorDatas.get(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(g.s, sensorData.getSamplingRate());
                jSONObject3.put(g.t, sensorData.getStartTagTime().longValue() - uploadOffsetTime);
                jSONObject3.put(g.u, sensorData.getEndTagTime().longValue() - uploadOffsetTime);
                jSONObject3.put("fileName", sensorData.getFileName());
                jSONObject3.put(g.w, sensorData.getSensorType());
                jSONObject3.put(g.x, sensorData.getResolution());
                sparseArray.put(sensorData.getSensorType().intValue(), String.valueOf(sensorData.getSensorType()));
                jSONArray.put(jSONObject3);
            }
        }
        jSONObject2.put(g.g, labAction.getProtocolVersion());
        jSONObject2.put("deviceId", labAction.getDeviceId());
        jSONObject2.put("deviceSource", labAction.getDeviceSource());
        jSONObject2.put(g.j, labAction.getBehaviorName());
        jSONObject2.put(g.k, labAction.getCustomizeBehaviorName() == null ? "" : labAction.getCustomizeBehaviorName());
        jSONObject2.put("productVersion", labAction.getProductVersion());
        jSONObject2.put(g.m, labAction.getZipFileName());
        jSONObject2.put("timeZone", labAction.getTimeZone());
        jSONObject2.put("startBehaviorTime", labAction.getStartBehaviorTime().longValue() - uploadOffsetTime);
        jSONObject2.put(g.q, labAction.getEndBehaviorTime().longValue() - uploadOffsetTime);
        jSONObject2.put(g.n, jSONArray);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sb.append((String) sparseArray.valueAt(i2));
            if (i2 != sparseArray.size() - 1) {
                sb.append(AESEncryptionHelper.SEPARATOR);
            }
        }
        jSONObject2.put(g.r, sb.toString());
        jSONObject.put("fileType", "SENSOR_DATA");
        jSONObject.put("fileName", file.getName());
        jSONObject.put(g.b, jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "labs 获取文件失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(String str) {
        return "labs 行为标记历史记录URL：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(Map map) {
        return "labs http包头+json内容：" + map.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s(String str) {
        return "labs 数据上传URL：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t(Map map) {
        return "labs behaviorTaggingDataUpload http包头+json内容：" + map.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return "labs 获取文件失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "labs json提交成功，接下来上传文件";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w(String str) {
        return "labs 文件名称：" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(String str, String str2) {
        return "labs 文件名称：" + str + "           文件下载地址：" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y(String str) {
        return "labs 文件上传地址：" + str;
    }

    private void z(Context context, LabAction labAction, EventBus eventBus) throws JSONException, IOException {
        File labPath = FileUtils.getLabPath(labAction.getZipFileName());
        if (labPath == null || !labPath.exists()) {
            HMLog.info(b, new Function0() { // from class: vt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BehaviorTaggingWebApi.u();
                }
            });
            labAction.setUploadStatus(21);
            eventBus.post(labAction);
            return;
        }
        JSONObject jSONObjectO = o(labAction, labPath);
        final Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("fileInfo", jSONObjectO.toString());
        final String url = getUrl(String.format(Locale.getDefault(), "legacy/users/%s/apps/%s/fileAccessURIs", labAction.getUserId(), !TextUtils.isEmpty(LabCallbackInit.getInitCallBack().getUploadUrlPackageName()) ? LabCallbackInit.getInitCallBack().getUploadUrlPackageName() : HMAppConfig.getPackageName()));
        HMLog.info(b, new Function0() { // from class: ot
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingWebApi.s(url);
            }
        });
        HMLog.info(b, new Function0() { // from class: rt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingWebApi.t(systemParams);
            }
        });
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.POST, new a(labAction, eventBus, labPath, context));
    }

    public void behaviorTaggingDataUpload(Context context, LabAction labAction) {
        EventBus eventBus = EventBus.getDefault();
        if (labAction != null) {
            try {
                labAction.setUploadStatus(1);
                eventBus.post(labAction);
                if (TextUtils.isEmpty(labAction.getZipFileName())) {
                    File fileZipFileByLabAction = TaggingFileUtils.zipFileByLabAction(labAction);
                    labAction.setUploadStatus(0);
                    TaggingFileUtils.updateLabAction(labAction);
                    if (fileZipFileByLabAction == null || !fileZipFileByLabAction.exists()) {
                        HMLog.info(b, new Function0() { // from class: ut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BehaviorTaggingWebApi.p();
                            }
                        });
                        labAction.setUploadStatus(21);
                        eventBus.post(labAction);
                    } else {
                        labAction.setZipFileName(fileZipFileByLabAction.getName());
                        z(context, labAction, eventBus);
                    }
                } else {
                    z(context, labAction, eventBus);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                labAction.setUploadStatus(2);
                eventBus.post(labAction);
            }
        }
    }

    public void deleteBehaviorTaggingHistory(Context context, LabAction labAction) {
        HMWebUtil.doRequest(HMServerDef.getRestfulUrl(f.d, labAction.getUserId(), labAction.getDeviceId(), labAction.getStartBehaviorTime()), HMWebUtil.getSystemParams(), Support.RequestSupport.DELETE, new d(labAction, context));
    }

    public void getBehaviorCount(IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler) {
        HMUserPropertiesAPI.getProperty(new PropertyItem(Property.PROPERTY_BEHAVIOR_TAGS_COUNT), false, iHMBasicHttpResponseHandler);
    }

    public String getUrl(String str) {
        return HMServerDef.getUrl(str);
    }

    public void postBehaviorCount(String str) {
        HMUserPropertiesAPI.postProperty(new PropertyItem(Property.PROPERTY_BEHAVIOR_TAGS_COUNT, str), false, (IHMBasicHttpResponseHandler) new e());
    }

    public void queryBehaviorTaggingHistory(String str, int i, long j, boolean z) {
        EventBus eventBus = EventBus.getDefault();
        final Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("count", Integer.valueOf(i));
        if (j != 0) {
            systemParams.put("startBehaviorTime", Long.valueOf(j));
        }
        final String url = getUrl(String.format(Locale.getDefault(), f.a, str));
        HMLog.info(b, new Function0() { // from class: mt
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingWebApi.q(url);
            }
        });
        HMLog.info(b, new Function0() { // from class: st
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BehaviorTaggingWebApi.r(systemParams);
            }
        });
        HMWebUtil.doRequest(url, systemParams, Support.RequestSupport.GET, new c(new BehaviorTagHistory(z), eventBus, str));
    }

    public void setOnDeleteItemListener(OnDeleteItemListener onDeleteItemListener) {
        this.a = onDeleteItemListener;
    }
}
