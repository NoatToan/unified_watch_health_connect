package com.huawei.hms.findnetwork.ultrasound;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.arch.core.util.Function;
import com.google.gson.reflect.TypeToken;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.SuccessContinuation;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.findnetwork.FindNetworkEngine;
import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;
import com.huawei.hms.findnetwork.comm.request.TextApiCall;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceDetail;
import com.huawei.hms.findnetwork.comm.request.bean.SnRequestBean;
import com.huawei.hms.findnetwork.comm.request.bean.StartNavigateRequestBen;
import com.huawei.hms.findnetwork.comm.request.bean.TagStatus;
import com.huawei.hms.findnetwork.comm.request.bean.UltrasoundSettings;
import com.huawei.hms.findnetwork.comm.request.bean.wear.FidRequestBean;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.ErrorCode;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.sdk.C0424b;
import com.huawei.hms.findnetwork.sdk.InterfaceC0446w;
import com.huawei.hms.findnetwork.sdk.L;
import com.huawei.hms.findnetwork.sdk.T;
import com.huawei.hms.findnetwork.sdk.U;
import com.huawei.hms.findnetwork.sdk.V;
import com.huawei.hms.findnetwork.sdk.r;
import com.huawei.hms.findnetwork.ultrasound.entity.MeasureResult;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.findnetwork.util.PermissionUtil;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import defpackage.yss;

/* JADX INFO: loaded from: classes33.dex */
public class FindExactSdkManager {
    public static volatile FindExactSdkManager d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f13256a = new U();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13257b = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f13255c = {"android.permission.RECORD_AUDIO"};
    public static final Object e = new Object();

    public static class FnResDeviceDetailTypeToken extends TypeToken<FindNetworkResult<DeviceDetail>> {
    }

    public static class FnResTagStatusTypeToken extends TypeToken<FindNetworkResult<TagStatus>> {
    }

    public class c implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f13262a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13263b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FindNetworkCallback f13264c;
        public final /* synthetic */ FindNetworkEngine d;
        public final /* synthetic */ String e;
        public final /* synthetic */ DeviceDetail f;

        public final /* synthetic */ void a(FindNetworkEngine findNetworkEngine, DeviceDetail deviceDetail, FreqParam freqParam, FindNetworkCallback findNetworkCallback) {
            FindExactSdkManager.this.a(findNetworkEngine, deviceDetail, freqParam, findNetworkCallback);
            this.f13262a = null;
        }

        @Override // com.huawei.hms.findnetwork.sdk.T
        public void a(final FreqParam freqParam) {
            HmsFindSDKLog.i("FindExactSdkManager", "onFreqParamAdjust");
            if (this.f13263b) {
                FindExactSdkManager.this.a(this.d, this.f, freqParam, this.f13264c);
                return;
            }
            final FindNetworkEngine findNetworkEngine = this.d;
            final DeviceDetail deviceDetail = this.f;
            final FindNetworkCallback findNetworkCallback = this.f13264c;
            this.f13262a = new Runnable() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(findNetworkEngine, deviceDetail, freqParam, findNetworkCallback);
                }
            };
        }

        @Override // com.huawei.hms.findnetwork.sdk.T
        public void a(MeasureResult measureResult) {
            if (measureResult == null) {
                HmsFindSDKLog.i("FindExactSdkManager", "receive nearby ultrasound measureResult is null");
                return;
            }
            HmsFindSDKLog.i("FindExactSdkManager", "receive Nearby ultrasound measuring ----");
            FindExactSdkManager.this.f13256a.a(this.f13264c, JsonUtils.object2Json(measureResult));
        }

        public final void a() {
            HmsFindSDKLog.i("FindExactSdkManager", "onNavigateStartCompleted");
            this.f13263b = true;
            Runnable runnable = this.f13262a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // com.huawei.hms.findnetwork.sdk.T
        public void a(int i, String str) {
            FindExactSdkManager.this.a(i, str, this.f13264c, new Runnable() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a();
                }
            }, this.d, this.e);
        }

        public c(FindNetworkCallback findNetworkCallback, FindNetworkEngine findNetworkEngine, String str, DeviceDetail deviceDetail) {
            this.f13264c = findNetworkCallback;
            this.d = findNetworkEngine;
            this.e = str;
            this.f = deviceDetail;
        }
    }

    public final void a(FindNetworkEngine findNetworkEngine, DeviceDetail deviceDetail, FreqParam freqParam, FindNetworkCallback findNetworkCallback) {
        FidRequestBean fidRequestBean = new FidRequestBean();
        fidRequestBean.setFid(deviceDetail.getSn());
        fidRequestBean.setAdditional(JsonUtils.object2Json(freqParam));
        findNetworkEngine.fillRequestBase(fidRequestBean);
        HmsFindSDKLog.w("FindExactSdkManager", "adjustFreqParam2Accessory " + MaskUtil.maskSn(fidRequestBean.getFid()) + fidRequestBean.getAdditional());
        findNetworkEngine.doWrite(new TextApiCall("findnetwork.navigate_freqparam_update", JsonUtils.object2Json(fidRequestBean), a(findNetworkEngine.getAppID(), "findnetwork.navigate_freqparam_update"))).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda6
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                HmsFindSDKLog.e("FindExactSdkManager", "adjustFreqParam2Accessory.onFailed " + exc.getMessage());
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda7
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FindExactSdkManager.a((String) obj);
            }
        });
    }

    public final boolean a(int i) {
        return i == 7 || i == 1;
    }

    public boolean b(Context context, FindNetworkCallback findNetworkCallback) {
        boolean zCheckAppHavePermission = PermissionUtil.checkAppHavePermission(context, context.getPackageName(), f13255c);
        HmsFindSDKLog.i("FindExactSdkManager", "startNavigate findApp hasPermission: " + zCheckAppHavePermission);
        if (!zCheckAppHavePermission) {
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NOT_HAVE_PERMISSION_RECORD_AUDIO, ErrorCode.STR_ERROR_NOT_HAVE_PERMISSION_RECORD_AUDIO);
        }
        return zCheckAppHavePermission;
    }

    public final SnRequestBean a(String str, FindNetworkEngine findNetworkEngine) {
        SnRequestBean snRequestBean = new SnRequestBean();
        findNetworkEngine.fillRequestBase(snRequestBean);
        snRequestBean.setConnectTagSn(str);
        return snRequestBean;
    }

    public final /* synthetic */ Void b(String str) {
        c(str);
        return null;
    }

    public boolean a(Context context, FindNetworkCallback findNetworkCallback) {
        U u;
        int i;
        String str;
        int iA = C0424b.b().a(context, yss.c().b());
        if (iA == 0) {
            return true;
        }
        if (iA == -2) {
            HmsFindSDKLog.i("FindExactSdkManager", "the mic is used");
            u = this.f13256a;
            i = ErrorCode.STATUS_ERROR_MIC_USED;
            str = ErrorCode.STR_ERROR_MIC_USED;
        } else {
            if (iA != -1) {
                return false;
            }
            HmsFindSDKLog.i("FindExactSdkManager", "the audioRecord is not release");
            u = this.f13256a;
            i = ErrorCode.STATUS_ERROR_START_AUDIO_RECORD_FAILED;
            str = ErrorCode.STR_ERROR_START_AUDIO_RECORD_FAILED;
        }
        u.c(findNetworkCallback, i, str);
        return false;
    }

    public final /* synthetic */ void b(FindNetworkCallback findNetworkCallback, Exception exc) {
        String message = exc.getMessage();
        HmsFindSDKLog.w("FindExactSdkManager", message);
        if (exc instanceof ApiException) {
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, message);
        }
    }

    public final void a(int i, String str, final FindNetworkCallback findNetworkCallback, final Runnable runnable, FindNetworkEngine findNetworkEngine, String str2) {
        if (i != 0) {
            String str3 = "startUltrasoundMeasuring onResult: " + i + " " + str;
            HmsFindSDKLog.i("FindExactSdkManager", "startUltrasoundMeasuring msg: " + str3);
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, str3);
            return;
        }
        StartNavigateRequestBen startNavigateRequestBen = new StartNavigateRequestBen();
        findNetworkEngine.fillRequestBase(startNavigateRequestBen);
        startNavigateRequestBen.setConnectTagSn(str2);
        startNavigateRequestBen.setAdditional(str);
        startNavigateRequestBen.setRestart(C0424b.b().d());
        startNavigateRequestBen.setStartRecordTime(C0424b.b().c());
        findNetworkEngine.doWrite(new L(startNavigateRequestBen, new Function() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.a(findNetworkCallback, runnable, (ResponseErrorCode) obj);
            }
        }, new Function() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f$0.b((String) obj);
            }
        }));
        HmsFindSDKLog.i("FindExactSdkManager", "startRecordTime" + C0424b.b().c());
        this.f13256a.c(findNetworkCallback);
    }

    public void b(FindNetworkEngine findNetworkEngine, Context context, DeviceDetail deviceDetail, FindNetworkCallback findNetworkCallback) {
        if (findNetworkEngine == null) {
            HmsFindSDKLog.e("FindExactSdkManager", "startUltrasonicMeasure engine is null");
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, "startUltrasonicMeasure engine is null");
            return;
        }
        V vA = V.a();
        if (vA.c()) {
            vA.e();
        }
        String sn = deviceDetail.getSn();
        UltrasoundSettings ultrasoundSettings = new UltrasoundSettings();
        ultrasoundSettings.setTagStatus(0);
        ultrasoundSettings.setTemperature(0.0f);
        ultrasoundSettings.setUltrasoundTxTime(-1L);
        ultrasoundSettings.setAlpha(2);
        ultrasoundSettings.setStartUltrasoundMeasuringTime(C0424b.b().c());
        vA.a(context, deviceDetail, ultrasoundSettings, new c(findNetworkCallback, findNetworkEngine, sn, deviceDetail));
    }

    public final String a(String str, String str2) {
        return TransactionIdCreater.getId(str, str2);
    }

    public void b() {
        V.a().e();
        this.f13257b.removeCallbacksAndMessages(null);
    }

    public static FindExactSdkManager a() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new FindExactSdkManager();
                }
            }
        }
        return d;
    }

    public boolean a(Context context, String str, int i) {
        return yss.c().b(context, str, i);
    }

    public static /* synthetic */ void a(String str) {
        V vA = V.a();
        if (vA.c()) {
            vA.a(str);
        }
    }

    public final /* synthetic */ Void a(FindNetworkCallback findNetworkCallback, Runnable runnable, ResponseErrorCode responseErrorCode) {
        String str;
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(responseErrorCode.getStatusCode());
        findNetworkResult.setData(null);
        if (findNetworkResult.getRespCode() == 0) {
            findNetworkCallback.onSuccess(findNetworkResult);
            runnable.run();
            str = "callback.onSuccess over";
        } else {
            C0424b.b().f();
            b();
            findNetworkCallback.onFail(findNetworkResult);
            str = " callback.onFail() over";
        }
        HmsFindSDKLog.i("FindExactSdkManager", str);
        return null;
    }

    public final /* synthetic */ void a(FindNetworkCallback findNetworkCallback, Exception exc) {
        String message = exc.getMessage();
        HmsFindSDKLog.w("FindExactSdkManager", message);
        this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, message);
    }

    public final /* synthetic */ Task a(FindNetworkCallback findNetworkCallback, FindNetworkEngine findNetworkEngine, String str, String str2, String str3) {
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str3, new FnResTagStatusTypeToken().getType());
        TagStatus tagStatus = findNetworkResult != null ? (TagStatus) findNetworkResult.getData() : null;
        if (tagStatus == null) {
            String str4 = "invalid resp: " + str3;
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, str4);
            return Tasks.fromException(new FindNetworkException(str4, -1));
        }
        if (a(tagStatus.getStatus())) {
            return findNetworkEngine.doWrite(new TextApiCall("findnetwork.queryDeviceDetail", str, str2));
        }
        String str5 = "Accessory busy: " + tagStatus.getStatus();
        this.f13256a.c(findNetworkCallback, ErrorCode.CODE_DEVICE_BUSY, str5);
        return Tasks.fromException(new FindNetworkException(str5));
    }

    public final /* synthetic */ void a(FindNetworkCallback findNetworkCallback, Context context, FindNetworkEngine findNetworkEngine, String str, String str2) {
        FindNetworkResult findNetworkResult = (FindNetworkResult) JsonUtils.json2Object(str2, new FnResDeviceDetailTypeToken().getType());
        String str3 = "invalid resp: " + str2;
        if (findNetworkResult == null || findNetworkResult.getData() == null) {
            HmsFindSDKLog.w("FindExactSdkManager", str3);
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NEARBY_MEASURERESULT, str3);
            return;
        }
        DeviceDetail deviceDetail = (DeviceDetail) findNetworkResult.getData();
        if (!a(context, deviceDetail.getProductId(), deviceDetail.getSequence())) {
            String str4 = "FindExactSdkManager not support Product." + deviceDetail.getProductId() + " #" + deviceDetail.getSequence();
            HmsFindSDKLog.w("FindExactSdkManager", str4);
            this.f13256a.c(findNetworkCallback, ErrorCode.STATUS_ERROR_NOT_SUPPORT_TAG_CURRENT_VERSION, str4);
        }
        if (a(context, findNetworkCallback)) {
            a(findNetworkEngine, context, deviceDetail, findNetworkCallback);
            r.a().b(str, 16);
        }
    }

    public void a(FindNetworkEngine findNetworkEngine, Context context, DeviceDetail deviceDetail, FindNetworkCallback findNetworkCallback) {
        C0424b.b().a(false);
        C0424b.b().b(new b(findNetworkEngine, context, deviceDetail, findNetworkCallback));
    }

    public void a(final FindNetworkEngine findNetworkEngine, final Context context, final String str, final FindNetworkCallback findNetworkCallback) {
        if (!b(context, findNetworkCallback)) {
            HmsFindSDKLog.w("FindExactSdkManager", "isAppHavePermission false");
            return;
        }
        final String strA = a(findNetworkEngine.getAppID(), "findnetwork.start_navigate");
        final String strObject2Json = JsonUtils.object2Json(a(str, findNetworkEngine));
        HmsFindSDKLog.i("FindExactSdkManager", "startupNavigate." + strA);
        findNetworkEngine.doWrite(new TextApiCall("findnetwork.query_tag_derived_status", strObject2Json, strA)).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda2
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.a(findNetworkCallback, exc);
            }
        }).onSuccessTask(new SuccessContinuation() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda3
            @Override // com.huawei.hmf.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f$0.a(findNetworkCallback, findNetworkEngine, strObject2Json, strA, (String) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda4
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f$0.b(findNetworkCallback, exc);
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: com.huawei.hms.findnetwork.ultrasound.FindExactSdkManager$$ExternalSyntheticLambda5
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f$0.a(findNetworkCallback, context, findNetworkEngine, str, (String) obj);
            }
        });
    }

    public class b implements InterfaceC0446w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FindNetworkEngine f13259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f13260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DeviceDetail f13261c;
        public final /* synthetic */ FindNetworkCallback d;

        @Override // com.huawei.hms.findnetwork.sdk.InterfaceC0446w
        public void onStart() {
            FindExactSdkManager.this.b(this.f13259a, this.f13260b, this.f13261c, this.d);
        }

        @Override // com.huawei.hms.findnetwork.sdk.InterfaceC0446w
        public void a() {
            HmsFindSDKLog.w("FindExactSdkManager", "#OnAudioRecordListener.onStop");
        }

        public b(FindNetworkEngine findNetworkEngine, Context context, DeviceDetail deviceDetail, FindNetworkCallback findNetworkCallback) {
            this.f13259a = findNetworkEngine;
            this.f13260b = context;
            this.f13261c = deviceDetail;
            this.d = findNetworkCallback;
        }
    }

    public void c(String str) {
        V vA = V.a();
        if (vA.c()) {
            this.f13257b.removeMessages(35);
            this.f13257b.sendEmptyMessageDelayed(35, 20000L);
            vA.b(str);
        }
    }

    public class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 35) {
                C0424b.b().a(true);
                C0424b.b().a();
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }
}
