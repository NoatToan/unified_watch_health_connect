package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.algorithm.api.BreathTrainApi;
import com.huawei.health.algorithm.api.BreatheWearAppInterface;
import com.huawei.health.breathe.bean.BreatheBean;
import com.huawei.health.breathtrain.BreatheDataProvider;
import com.huawei.health.breathtrain.R;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
@ApiDefine(uri = BreathTrainApi.class)
@Singleton
public class dfv implements BreathTrainApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<JSONObject> f31750b = new ArrayList(16);
    private int[] aa;
    private Vibrator ad;
    private BreatheWearAppInterface h;
    private CustomViewDialog j;
    private List<Integer> x = new ArrayList(16);
    private List<Integer> r = new ArrayList(16);
    private List<float[]> i = new ArrayList(16);
    private List<Integer> v = new ArrayList(16);
    private List<Integer> n = new ArrayList(16);
    private List<Float> e = new ArrayList(16);
    private int m = 0;
    private int p = -1;
    private float[] d = null;
    private boolean t = false;
    private int z = -1;
    private int o = 3;
    private int s = 0;
    private AtomicBoolean k = new AtomicBoolean(false);
    private int ab = 100;
    private boolean q = false;
    private int w = 1;
    private int g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31752c = false;
    private boolean l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31751a = 0;
    private IBaseResponseCallback f = new IBaseResponseCallback() { // from class: dfv.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj != null) {
                dfv.this.a(i, obj);
            } else {
                LogUtil.a("BreathTrainImpl", "mCallBack onResponse objData is null.");
            }
        }
    };
    private final ExtendHandler y = HandlerCenter.b(new a(this), "BreathTrainImpl");
    private e u = new e();

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                LogUtil.a("BreathTrainImpl", "ACTION_SCREEN_OFF");
                dfv.this.f31752c = true;
            }
            LogUtil.a("BreathTrainImpl", "ScreenBroadcastReceiver intent:", intent.getAction());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj) {
        if (i != 0) {
            LogUtil.d("BreathTrainImpl", "checkResponseCode() errCode= ", Integer.valueOf(i));
            this.g = i;
            return;
        }
        try {
            if (f31750b.size() >= this.m / 4) {
                LogUtil.a("BreathTrainImpl", "sListBack.size() = ", Integer.valueOf(f31750b.size()));
                return;
            }
            if (obj instanceof String) {
                JSONObject jSONObject = new JSONObject((String) obj);
                LogUtil.d("BreathTrainImpl", "mCallBack Message is ", jSONObject);
                this.t = true;
                f31750b.add(jSONObject);
                this.x.clear();
                this.r.clear();
                a(jSONObject);
                a();
                c(4);
                a(6);
                d(5);
            }
        } catch (JSONException e2) {
            LogUtil.e("BreathTrainImpl", "mCallBack ", e2.getMessage());
        }
    }

    @Override // com.huawei.health.algorithm.api.BreathTrainApi
    public int canFinish(Activity activity) {
        int i = this.z;
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return 3;
        }
        LogUtil.a("BreathTrainImpl", "show stop breathe_dialog");
        if (activity != null) {
            e(activity);
        }
        return 2;
    }

    private void e(Activity activity) {
        if (this.j == null) {
            b(activity);
        }
        if (activity == null || activity.isFinishing() || this.j.isShowing()) {
            return;
        }
        this.j.show();
    }

    private void b(final Activity activity) {
        View viewInflate = View.inflate(activity, R.layout.pressure_device_connect, null);
        ((HealthTextView) viewInflate.findViewById(R.id.pressure_device_no_connect)).setText(activity.getString(R.string.IDS_plugin_breathe_stop_tip));
        ((LinearLayout) viewInflate.findViewById(R.id.hw_health_agree_dialog_pressure)).setVisibility(8);
        this.j = new CustomViewDialog.Builder(activity).d(viewInflate).a(activity.getString(R.string.IDS_settings_button_ok), new View.OnClickListener() { // from class: dfv.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dfv.this.j = null;
                dcv dcvVar = new dcv();
                dcvVar.d(4);
                dfv.this.breathControl(dcvVar, 0, null);
                activity.finish();
            }
        }).c(activity.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: dfv.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d();
    }

    @Override // com.huawei.health.algorithm.api.BreathTrainApi
    public void registerBreatheCallback(BreatheWearAppInterface breatheWearAppInterface) {
        LogUtil.a("BreathTrainImpl", "registerBreatheCallback() enter");
        this.h = breatheWearAppInterface;
    }

    private void d(int i) {
        float[] fArr = this.d;
        if (fArr == null || i >= fArr.length || i < 0) {
            return;
        }
        float f = fArr[i];
        if (f != 0.0f) {
            this.n.add(Integer.valueOf((int) f));
        }
    }

    private void c(int i) {
        float[] fArr = this.d;
        if (fArr == null || i >= fArr.length || i < 0) {
            return;
        }
        this.v.add(Integer.valueOf((int) fArr[i]));
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rri_list");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            d(jSONObjectOptJSONObject.optInt("rri_value"), jSONObjectOptJSONObject.optInt("rri_sqi"));
        }
    }

    private void a() {
        if (this.x.size() != 0) {
            int i = f31750b.size() != 1 ? 2 : 1;
            LogUtil.a("BreathTrainImpl", " getDataResult mDuration ", Integer.valueOf(this.m), ", mRriValueList.size() ", Integer.valueOf(this.x.size()), ", firstData ", Integer.valueOf(i));
            float[] breatheResultFromAlgorithm = BreatheDataProvider.getBreatheResultFromAlgorithm(this.m, this.x.size(), e(this.x), e(this.r), i);
            this.d = breatheResultFromAlgorithm;
            if (breatheResultFromAlgorithm == null || breatheResultFromAlgorithm.length <= 9 || breatheResultFromAlgorithm[9] == 0.0f) {
                return;
            }
            this.i.add(breatheResultFromAlgorithm);
        }
    }

    private int[] e(List list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    private void d(int i, int i2) {
        if (i != 0) {
            this.x.add(Integer.valueOf(i));
            this.r.add(Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    @Override // com.huawei.health.algorithm.api.BreathTrainApi
    public int getJanusDeviceConnect() {
        List<Integer> list = this.x;
        if (list != null) {
            list.clear();
        } else {
            LogUtil.a("BreathTrainImpl", "getJanusDeviceConnect mRriValueList is null.");
        }
        List<Integer> list2 = this.r;
        if (list2 != null) {
            list2.clear();
        } else {
            LogUtil.a("BreathTrainImpl", "getJanusDeviceConnect mRriSqiList is null.");
        }
        BreatheWearAppInterface breatheWearAppInterface = this.h;
        ?? deviceSupportBreatheReport = breatheWearAppInterface != null ? breatheWearAppInterface.getDeviceSupportBreatheReport() : 0;
        LogUtil.a("BreathTrainImpl", "janus device connected ", Boolean.valueOf((boolean) deviceSupportBreatheReport));
        return deviceSupportBreatheReport;
    }

    @Override // com.huawei.health.algorithm.api.BreathTrainApi
    public void breathControl(dcv dcvVar, int i, IBaseResponseCallback iBaseResponseCallback) {
        this.k.set(false);
        int iA = dcvVar.a();
        this.z = iA;
        this.j = null;
        if (iA == 1) {
            e((IBaseResponseCallback) null);
            this.t = false;
            this.d = null;
            return;
        }
        if (iA == 2) {
            this.aa = dcvVar.e();
            this.q = dcvVar.f();
            this.w = dcvVar.c();
            e(dcvVar.b(), dcvVar.d(), i);
            return;
        }
        if (iA == 3) {
            this.k.set(true);
            a(iBaseResponseCallback);
        } else if (iA == 4) {
            e(iBaseResponseCallback);
        } else {
            e(iBaseResponseCallback);
            LogUtil.a("BreathTrainImpl", "breathControl default");
        }
    }

    private void g() {
        if (HiCommonUtil.e(this.aa)) {
            return;
        }
        if (this.ad == null) {
            Object systemService = BaseApplication.b().getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                this.ad = (Vibrator) systemService;
            }
        }
        Vibrator vibrator = this.ad;
        if (vibrator == null || !vibrator.hasVibrator()) {
            LogUtil.j("BreathTrainImpl", "this phone doesn't have vibrator");
            return;
        }
        LogUtil.a("BreathTrainImpl", "start vibrate");
        int[] iArr = this.aa;
        int length = (iArr.length * 2) + 1;
        long[] jArr = new long[length];
        int[] iArr2 = new int[(iArr.length * 2) + 1];
        jArr[0] = 0;
        iArr2[0] = 0;
        int i = 0;
        while (true) {
            int[] iArr3 = this.aa;
            if (i >= iArr3.length) {
                break;
            }
            int i2 = i * 2;
            int i3 = i2 + 1;
            int i4 = this.ab;
            jArr[i3] = i4;
            iArr2[i3] = 10;
            int i5 = i2 + 2;
            jArr[i5] = iArr3[i] - i4;
            iArr2[i5] = 0;
            i++;
        }
        this.ad.vibrate(VibrationEffect.createWaveform(jArr, iArr2, 0), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
        if (this.y != null) {
            this.f31751a = 0L;
            for (int i6 = 0; i6 < length; i6++) {
                this.f31751a += jArr[i6];
            }
            this.y.sendEmptyMessage(10002, this.f31751a);
        }
        BroadcastManager.g(this.u);
    }

    private void c() {
        Vibrator vibrator = this.ad;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    private void d() {
        if (this.q) {
            LogUtil.d("BreathTrainImpl", "set screen on");
            final Activity activityJ = BaseApplication.j();
            if (activityJ == null) {
                LogUtil.j("BreathTrainImpl", "set screen: activity is null");
            } else {
                activityJ.runOnUiThread(new Runnable() { // from class: dfv.3
                    @Override // java.lang.Runnable
                    public void run() {
                        activityJ.getWindow().addFlags(128);
                    }
                });
            }
        }
    }

    private void b() {
        if (this.q) {
            LogUtil.d("BreathTrainImpl", "unset screen on");
            final Activity activityJ = BaseApplication.j();
            if (activityJ == null) {
                LogUtil.j("BreathTrainImpl", "unset screen: activity is null");
            } else {
                activityJ.runOnUiThread(new Runnable() { // from class: dfv.4
                    @Override // java.lang.Runnable
                    public void run() {
                        activityJ.getWindow().clearFlags(128);
                    }
                });
                this.q = false;
            }
        }
    }

    private void e(IBaseResponseCallback iBaseResponseCallback) {
        if (this.z == 4 && this.m != 0 && iBaseResponseCallback == null) {
            HashMap map = new HashMap(16);
            map.put("keeptime", Integer.valueOf(this.m));
            if (this.s == 1) {
                map.put("serviceSuccess", 1);
            } else {
                map.put("serviceSuccess", 0);
            }
            lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_PRESSUER_NODATA_BREATHEPARENT_KEEPTIME_2160014.value(), map, 0);
            this.m = 0;
            this.p = -1;
        }
        LogUtil.a("BreathTrainImpl", "ZXJ BI -- P3");
        this.x.clear();
        this.r.clear();
        this.v.clear();
        this.n.clear();
        this.e.clear();
        f31750b.clear();
        this.d = null;
        a(iBaseResponseCallback);
        e();
        if (this.z == 1 && this.m != 0) {
            this.s = 1;
        } else {
            this.s = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IBaseResponseCallback iBaseResponseCallback) {
        c();
        b();
        this.aa = null;
        this.w = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 4);
            LogUtil.a("BreathTrainImpl", "breatheClose jsonObject = ", jSONObject);
        } catch (JSONException e2) {
            LogUtil.e("BreathTrainImpl", "breatheClose ", e2.getMessage());
        }
        BreatheWearAppInterface breatheWearAppInterface = this.h;
        if (breatheWearAppInterface != null && this.t && this.w == 1) {
            breatheWearAppInterface.setHeartRateReportStatus(jSONObject, new IBaseResponseCallback() { // from class: dfv.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj == null) {
                        LogUtil.a("BreathTrainImpl", "Message is null!!!");
                    } else if (i == 100000) {
                        dfv.this.t = false;
                        dfv.this.h.unRegisterNotificationPress(dfv.this.f);
                    } else {
                        LogUtil.a("BreathTrainImpl", "Message is not right!!!");
                    }
                }
            });
        }
        this.o = 3;
        if (getJanusDeviceConnect() == 1) {
            if (this.d != null && this.i.size() > 0 && this.g == 0) {
                this.o = 1;
            } else {
                this.o = 2;
            }
        } else if (this.d != null && this.i.size() > 0) {
            this.o = 1;
        }
        d(iBaseResponseCallback);
    }

    private void d(IBaseResponseCallback iBaseResponseCallback) {
        BreatheBean breatheBean = new BreatheBean();
        breatheBean.setDuration(this.m / 60);
        int i = this.p;
        if (i != -1) {
            breatheBean.setRhythm(i);
        }
        JSONObject jSONObject = new JSONObject();
        if (iBaseResponseCallback != null && this.i.size() > 0) {
            try {
                float[] fArr = this.i.get(0);
                List<float[]> list = this.i;
                float[] fArr2 = list.get(list.size() - 1);
                jSONObject.put("breathe_max_heartrate", fArr2[7]);
                jSONObject.put("breathe_min_heartrate", fArr2[8]);
                jSONObject.put("breathe_mean_heartrate", fArr2[9]);
                jSONObject.put("breathe_front_pressure", 40);
                jSONObject.put("breathe_rear_pressure", 20);
                jSONObject.put("breathe_delta_pressure", 20);
                jSONObject.put("breathe_algorithm_ver", 10);
                jSONObject.put("breathe_total_score", fArr2[0]);
                jSONObject.put("breathe_total_grade", fArr2[1]);
                jSONObject.put("before_heartrate", fArr[9]);
                jSONObject.put("after_heartrate", fArr2[9]);
                breatheBean.setTotalScore(fArr2[0]);
                breatheBean.setTotalGrade(fArr2[1]);
                breatheBean.setBeginBpm(fArr[9]);
                breatheBean.setEndBpm(fArr2[9]);
                if (fArr[9] == 0.0f || fArr2[9] == 0.0f || fArr2[1] == 0.0f) {
                    if (getJanusDeviceConnect() == 1) {
                        this.o = 2;
                    } else {
                        this.o = 3;
                    }
                }
                c(iBaseResponseCallback, breatheBean, jSONObject);
                return;
            } catch (JSONException e2) {
                LogUtil.e("BreathTrainImpl", "breatheClose ", e2.getMessage());
                return;
            }
        }
        c(iBaseResponseCallback, breatheBean, jSONObject);
    }

    private void c(IBaseResponseCallback iBaseResponseCallback, BreatheBean breatheBean, JSONObject jSONObject) {
        if (this.k.get()) {
            e(breatheBean, jSONObject.toString(), iBaseResponseCallback);
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(this.o, jSONObject.toString());
        }
        e();
    }

    private void e(BreatheBean breatheBean, final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (breatheBean == null) {
            LogUtil.j("BreathTrainImpl", "insert breatheBean is null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(this.o, str);
                return;
            }
            return;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value());
        hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(BaseApplication.b()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        hiHealthData.setStartTime(jCurrentTimeMillis);
        hiHealthData.setEndTime(jCurrentTimeMillis);
        HashMap map = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN.value()), HiJsonUtil.d(breatheBean));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        final int i = this.o;
        HiHealthNativeApi.a(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: dfv.10
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                LogUtil.a("BreathTrainImpl", "insert onResult errorCode ", Integer.valueOf(i2), " object ", obj, "movement:", Boolean.valueOf(dfv.this.l));
                if (i2 == 0) {
                    ffv.d(5);
                }
                if (iBaseResponseCallback == null) {
                    return;
                }
                if (dfv.this.l) {
                    dfv.this.l = false;
                    iBaseResponseCallback.a(4, new JSONObject().toString());
                } else {
                    iBaseResponseCallback.a(i, str);
                }
            }
        });
    }

    @Override // com.huawei.health.algorithm.api.BreathTrainApi
    public void insert(BreatheBean breatheBean) {
        e(breatheBean, "", (IBaseResponseCallback) null);
    }

    private void a(int i) {
        float[] fArr = this.d;
        if (fArr == null || i <= 0 || i >= fArr.length) {
            return;
        }
        float f = fArr[i];
        if (f != 0.0f) {
            this.e.add(Float.valueOf(f));
        }
    }

    private void e(final int i, int i2, int i3) {
        BreatheWearAppInterface breatheWearAppInterface;
        LogUtil.d("BreathTrainImpl", "breatheOpen = ", Integer.valueOf(i3));
        b(i);
        g();
        d();
        this.x.clear();
        this.r.clear();
        this.v.clear();
        this.n.clear();
        this.e.clear();
        f31750b.clear();
        this.i.clear();
        this.d = null;
        this.m = i == 0 ? 60 : i;
        this.p = i2;
        this.g = 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 3);
        } catch (JSONException e2) {
            LogUtil.e("BreathTrainImpl", " breatheOpen ", e2.getMessage());
        }
        LogUtil.a("BreathTrainImpl", "breatheOpen jsonObject = ", jSONObject);
        if (this.w == 1 && (breatheWearAppInterface = this.h) != null && breatheWearAppInterface.getDeviceSupportBreatheReport()) {
            LogUtil.a("BreathTrainImpl", " breatheOpen send message");
            this.h.setHeartRateReportStatus(jSONObject, new IBaseResponseCallback() { // from class: dfv.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i4, Object obj) {
                    if (obj == null) {
                        LogUtil.a("BreathTrainImpl", "Message is null!!!");
                        return;
                    }
                    ReleaseLogUtil.d("BreathTrainImpl", "errorCode: ", Integer.valueOf(i4));
                    if (i4 == 126007) {
                        dfv.this.l = true;
                    } else if (i4 == 100000) {
                        LogUtil.d("BreathTrainImpl", "breatheOpen()====", Integer.valueOf(i));
                        dfv.this.t = true;
                        dfv.this.h.registerNotificationPress(dfv.this.f);
                    }
                }
            });
        }
    }

    private void b(int i) {
        ExtendHandler extendHandler = this.y;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(10001, (i + 8) * 1000);
        }
    }

    private void e() {
        ExtendHandler extendHandler = this.y;
        if (extendHandler != null) {
            extendHandler.removeMessages(10001);
            this.y.removeMessages(10002);
        } else {
            LogUtil.e("BreathTrainImpl", "cancelStressTimeoutWaiting(), mStressErrorHandler is null");
        }
        BroadcastManager.q(this.u);
    }

    static class a extends BaseHandlerCallback<dfv> {
        a(dfv dfvVar) {
            super(dfvVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(dfv dfvVar, Message message) {
            int i = message.what;
            if (i == 10001) {
                dfvVar.a((IBaseResponseCallback) null);
                return true;
            }
            if (i == 10002) {
                d(dfvVar);
                return true;
            }
            LogUtil.e("BreathTrainImpl", "mStressErrorHandler, unknown error code");
            return false;
        }

        private void d(dfv dfvVar) {
            LogUtil.a("BreathTrainImpl", "breathTrain.isOpenVibrator==", Boolean.valueOf(dfvVar.f31752c));
            if (dfvVar.y != null) {
                dfvVar.y.removeMessages(10002);
                dfvVar.y.sendEmptyMessage(10002, dfvVar.f31751a);
            }
            if (dfvVar.ad != null && dfvVar.ad.hasVibrator()) {
                if (dfvVar.f31752c) {
                    LogUtil.a("BreathTrainImpl", "openVibrator");
                    dfvVar.f31752c = false;
                    if (dfvVar.aa != null) {
                        long[] jArr = new long[(dfvVar.aa.length * 2) + 1];
                        int[] iArr = new int[(dfvVar.aa.length * 2) + 1];
                        jArr[0] = 0;
                        iArr[0] = 0;
                        for (int i = 0; i < dfvVar.aa.length; i++) {
                            int i2 = i * 2;
                            int i3 = i2 + 1;
                            jArr[i3] = dfvVar.ab;
                            iArr[i3] = 10;
                            int i4 = i2 + 2;
                            jArr[i4] = dfvVar.aa[i] - dfvVar.ab;
                            iArr[i4] = 0;
                        }
                        dfvVar.ad.vibrate(VibrationEffect.createWaveform(jArr, iArr, 0), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        return;
                    }
                    LogUtil.j("BreathTrainImpl", "mVibrateDuration == null");
                    return;
                }
                return;
            }
            LogUtil.j("BreathTrainImpl", "this phone doesn't have vibrator");
        }
    }
}
