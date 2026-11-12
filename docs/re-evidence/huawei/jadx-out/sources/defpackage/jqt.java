package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.weight.WeightApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public class jqt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38842c;
    private long d;
    private double e;
    private LinearLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private jqp j;
    private float k;
    private HealthTextView l;
    private Handler m = new g(this);
    private float n;
    private HealthTextView o;
    private LinearLayout t;

    static class g extends BaseHandler<jqt> {
        g(jqt jqtVar) {
            super(jqtVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jqt jqtVar, Message message) {
            switch (message.what) {
                case 10001:
                    float f = jqtVar.n + jqtVar.f38841b;
                    LogUtil.a("Track_WeightMeasureDataHelper", "sportTotalDuration：", Float.valueOf(f));
                    if (f <= 2.5f) {
                        jqtVar.h();
                    } else {
                        jqtVar.d(f);
                    }
                    break;
                case 10002:
                    if (!jqt.e(jqtVar.d) && jqtVar.k > 500.0f && jqtVar.e > 24.0d) {
                        jqtVar.a(jqtVar.k);
                    } else {
                        jqtVar.i();
                    }
                    break;
                case 10003:
                    Long l = (Long) message.obj;
                    long jLongValue = l.longValue();
                    LogUtil.a("Track_WeightMeasureDataHelper", "lastBodyShapeTime：", l);
                    if (jqt.c(jLongValue)) {
                        jqtVar.h();
                    } else {
                        jqtVar.a();
                    }
                    break;
                case 10004:
                    jqtVar.h();
                    break;
                default:
                    LogUtil.j("Track_WeightMeasureDataHelper", "WeightMeasureHandler else msg");
                    break;
            }
        }
    }

    public jqt(View view, Context context) {
        this.f38840a = context;
        e(view);
    }

    private void e(View view) {
        this.t = (LinearLayout) view.findViewById(R.id.layout_weight_measurement);
        this.l = (HealthTextView) view.findViewById(R.id.weight_measurement_tips);
        this.o = (HealthTextView) view.findViewById(R.id.weight_measurement_coaching);
        this.h = (HealthTextView) view.findViewById(R.id.track_detail_ECG_measurement);
        this.f = (LinearLayout) view.findViewById(R.id.layout_ECG_measurement);
        this.g = (HealthTextView) view.findViewById(R.id.track_detail_ECG_measurement_coaching);
        this.i = (LinearLayout) view.findViewById(R.id.layout_smart_coach_sport_data_interpretation);
    }

    public void c(jqp jqpVar) {
        this.j = jqpVar;
        if (jqpVar != null) {
            this.f38842c = jqpVar.d().requestStartTime();
        } else {
            this.f38842c = 0L;
        }
        if (a(this.f38842c)) {
            d();
        } else {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        double d2 = f;
        String str = String.format(Locale.ENGLISH, this.f38840a.getResources().getString(R.string.IDS_body_shape_record_reminder_text), this.f38840a.getResources().getQuantityString(R.plurals.IDS_body_shape_record_reminder_unit_text, UnitUtil.e(d2), UnitUtil.e(d2, 1, 1)));
        this.f.setVisibility(8);
        this.t.setVisibility(0);
        this.l.setText(str);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: jqt.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_WeightMeasureDataHelper", "showBodyShapeTips click");
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.ai-body-shape?h5pro=true&isNeedLogin=true&urlType=4&pName=com.huawei.health&from=1"));
                intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
                iov.d(jqt.this.f38840a, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        double d2 = f;
        String str = String.format(Locale.ENGLISH, this.f38840a.getResources().getString(R.string.IDS_weight_record_reminder_text), this.f38840a.getResources().getQuantityString(R.plurals.IDS_weight_record_reminder_unit_text, UnitUtil.e(d2), UnitUtil.e(d2, 1, 0)));
        this.f.setVisibility(8);
        this.t.setVisibility(0);
        this.l.setText(str);
        this.o.setOnClickListener(new View.OnClickListener(this) { // from class: jqt.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_WeightMeasureDataHelper", "showWeightTips click");
                iun.d("", new Bundle());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("Track_WeightMeasureDataHelper", "setEcgMeasurementText");
        this.t.setVisibility(8);
        if (c()) {
            this.f.setVisibility(0);
            this.h.setText(this.f38840a.getResources().getString(R.string.IDS_track_ECG_measurement, 30));
            if (this.h.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
                int iC = (int) qky.c(this.f38840a.getResources().getDimension(R.dimen.textParagraphMarginS));
                if (this.i.getVisibility() == 0) {
                    layoutParams.topMargin = iC;
                } else {
                    layoutParams.topMargin = 0;
                }
                this.h.setLayoutParams(layoutParams);
            }
            g();
            return;
        }
        this.f.setVisibility(8);
    }

    private boolean c() {
        if (this.j == null) {
            LogUtil.a("Track_WeightMeasureDataHelper", "trackDetailDataManager == null");
            return false;
        }
        if (Utils.o()) {
            LogUtil.a("Track_WeightMeasureDataHelper", "setEcgMeasurementText isOversea");
            return false;
        }
        if (ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_WeightMeasureDataHelper") == null) {
            LogUtil.a("Track_WeightMeasureDataHelper", "setEcgMeasurementText deviceInfo is null or deviceInfo != DEVICE_CONNECTED");
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        int iRequestAvgHeartRate = this.j.d().requestAvgHeartRate();
        if (deviceCapabilityC != null) {
            return deviceCapabilityC.isSupportEcgAuth() && iRequestAvgHeartRate >= 120;
        }
        LogUtil.e("Track_WeightMeasureDataHelper", "get deviceInfo is null. please check.");
        return false;
    }

    private void g() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: jqt.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HashMap map = new HashMap();
                map.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SPORT_DETAILS_ECG_MEASUREMENT_2090014.value(), map, 0);
                ddv.b().initH5Pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).showStatusBar().setStatusBarTextBlack(true).setForceDarkMode(0).build();
                String str = efe.a() ? "0" : "1";
                H5ProClient.startH5LightApp(jqt.this.f38840a, EnvironmentHelper.getInstance().getUrl() + "weixinScan/dist/index.html#/measureGuide?support=" + str, h5ProLaunchOptionBuild);
            }
        });
    }

    private void d() {
        LogUtil.a("Track_WeightMeasureDataHelper", "getRecentLastBodyShapeTime");
        nkf.a().a(this.f38840a, new c(this.m));
    }

    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Handler> f38852a;

        c(Handler handler) {
            this.f38852a = new WeakReference<>(handler);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Handler handler = this.f38852a.get();
            if (handler == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "handler == null");
                return;
            }
            if (i != 0 || !(obj instanceof Long)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "LastBodyShapeRecordCallBack datas is error");
                handler.sendEmptyMessage(10004);
                return;
            }
            Long l = (Long) obj;
            l.longValue();
            LogUtil.a("Track_WeightMeasureDataHelper", "LastBodyShapeRecordCallBack:", l);
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 10004;
            messageObtainMessage.obj = obj;
            handler.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Track_WeightMeasureDataHelper", "getMonthDataSportDuration");
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final a aVar = new a(this, countDownLatch);
        final d dVar = new d(this, countDownLatch);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jqt.1
            @Override // java.lang.Runnable
            public void run() {
                long jP = lsl.p(System.currentTimeMillis());
                long jB = lsl.b(System.currentTimeMillis());
                iwn.a(jqt.this.f38840a).e(jP, jB, 5, 0, aVar);
                ((RecordApi) Services.d("CoursePlanService", RecordApi.class)).acquireSummaryFitnessRecord(new ntx.d().b(jP).d(jB).d(5).a(), dVar);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    LogUtil.e("Track_WeightMeasureDataHelper", "interrupted while waiting for getMonthDataSportDuration");
                }
                if (jqt.this.m != null) {
                    Message messageObtainMessage = jqt.this.m.obtainMessage();
                    messageObtainMessage.what = 10001;
                    jqt.this.m.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    static class a implements IBaseResponseCallback {
        private WeakReference<CountDownLatch> d;
        private WeakReference<jqt> e;

        a(jqt jqtVar, CountDownLatch countDownLatch) {
            this.e = new WeakReference<>(jqtVar);
            this.d = new WeakReference<>(countDownLatch);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            jqt jqtVar = this.e.get();
            CountDownLatch countDownLatch = this.d.get();
            if (countDownLatch == null || jqtVar == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "CurrentMonthTrackSportTimeCallBack param is null");
                countDownLatch.countDown();
                return;
            }
            if (!njy.b(obj, HiHealthData.class)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "not match listType");
                countDownLatch.countDown();
                return;
            }
            List<HiHealthData> list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "sumMounthDataList isEmpty");
                countDownLatch.countDown();
                return;
            }
            long j = 0;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData == null) {
                    LogUtil.j("Track_WeightMeasureDataHelper", "hiHealthData == null");
                } else {
                    j += hiHealthData.getLong("Track_Duration_Sum");
                }
            }
            LogUtil.a("Track_WeightMeasureDataHelper", "trackTimeDuration :", Long.valueOf(j));
            float f = j / 3600000.0f;
            LogUtil.a("Track_WeightMeasureDataHelper", "trackTimeHours :", Float.valueOf(f));
            jqtVar.n = f;
            countDownLatch.countDown();
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<jqt> f38853c;
        private WeakReference<CountDownLatch> d;

        d(jqt jqtVar, CountDownLatch countDownLatch) {
            this.f38853c = new WeakReference<>(jqtVar);
            this.d = new WeakReference<>(countDownLatch);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            jqt jqtVar = this.f38853c.get();
            CountDownLatch countDownLatch = this.d.get();
            if (jqtVar == null || countDownLatch == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "CurrentMonthFitnessSportTimeCallBack param is null");
                countDownLatch.countDown();
                return;
            }
            if (!njy.b(obj, FitnessTrackRecord.class)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "not match listType");
                countDownLatch.countDown();
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "fitnessTrackRecordList isEmpty");
                countDownLatch.countDown();
                return;
            }
            FitnessTrackRecord fitnessTrackRecord = (FitnessTrackRecord) list.get(0);
            LogUtil.a("Track_WeightMeasureDataHelper", "mFitnessTimeDuration :", Long.valueOf(fitnessTrackRecord.acquireSumExerciseTime()));
            float fAcquireSumExerciseTime = fitnessTrackRecord.acquireSumExerciseTime() / 3600000.0f;
            LogUtil.a("Track_WeightMeasureDataHelper", "timeDurationHour :", Float.valueOf(fAcquireSumExerciseTime));
            jqtVar.f38841b = fAcquireSumExerciseTime;
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (h(this.f38842c)) {
            b();
        } else {
            i();
        }
    }

    private void b() {
        LogUtil.a("Track_WeightMeasureDataHelper", "getWeightData");
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final b bVar = new b(this, countDownLatch);
        final e eVar = new e(this, countDownLatch);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jqt.2
            @Override // java.lang.Runnable
            public void run() {
                nkf.a().e(jqt.this.f38840a, 0L, System.currentTimeMillis(), 1, bVar);
                jqt.b(jqt.this.f38840a, (IBaseResponseCallback) eVar);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    LogUtil.e("Track_WeightMeasureDataHelper", "interrupted while waiting for getWeightData");
                }
                if (jqt.this.m != null) {
                    Message messageObtainMessage = jqt.this.m.obtainMessage();
                    messageObtainMessage.what = 10002;
                    jqt.this.m.sendMessage(messageObtainMessage);
                }
            }
        });
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<jqt> f38851b;
        private WeakReference<CountDownLatch> d;

        b(jqt jqtVar, CountDownLatch countDownLatch) {
            this.f38851b = new WeakReference<>(jqtVar);
            this.d = new WeakReference<>(countDownLatch);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            jqt jqtVar = this.f38851b.get();
            CountDownLatch countDownLatch = this.d.get();
            if (jqtVar == null || countDownLatch == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "LastWeightCallBack param is null");
                countDownLatch.countDown();
                return;
            }
            if (i != 0 || !(obj instanceof List)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "LastWeightCallBack datas is error");
                countDownLatch.countDown();
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "LastWeightCallBack datas is empty");
                countDownLatch.countDown();
                return;
            }
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            HiHealthData hiHealthData = (HiHealthData) list.get(0);
            jqtVar.e = weightApi.getBmiByHiHealthData(hiHealthData);
            jqtVar.d = hiHealthData.getStartTime();
            LogUtil.a("Track_WeightMeasureDataHelper", "LastWeightCallBack mBmi = ", Double.valueOf(jqtVar.e));
            LogUtil.a("Track_WeightMeasureDataHelper", "LastWeightCallBack mLastWeightTime = ", Long.valueOf(jqtVar.d));
            countDownLatch.countDown();
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<CountDownLatch> f38854b;
        private WeakReference<jqt> d;

        e(jqt jqtVar, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(jqtVar);
            this.f38854b = new WeakReference<>(countDownLatch);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            jqt jqtVar = this.d.get();
            CountDownLatch countDownLatch = this.f38854b.get();
            if (jqtVar == null || countDownLatch == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "helper == null || countDownLatch == null");
                countDownLatch.countDown();
            } else if (i != 0 || !(obj instanceof Float)) {
                LogUtil.j("Track_WeightMeasureDataHelper", "CaloriesDataCallback datas is error");
                countDownLatch.countDown();
            } else {
                jqtVar.k = ((Float) obj).floatValue();
                LogUtil.a("Track_WeightMeasureDataHelper", "caloriesValueSum：", obj);
                countDownLatch.countDown();
            }
        }
    }

    public static void b(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(lsl.e(System.currentTimeMillis(), 2, 0), lsl.c(System.currentTimeMillis()));
        hiDataReadOption.setType(new int[]{40003});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jqt.10
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                jqt.d(obj, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, IBaseResponseCallback iBaseResponseCallback) {
        if (obj == null || !(obj instanceof SparseArray)) {
            LogUtil.j("Track_WeightMeasureDataHelper", "data fail");
            iBaseResponseCallback.a(-1, obj);
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() == 0) {
            LogUtil.j("Track_WeightMeasureDataHelper", "map.size() == 0");
            iBaseResponseCallback.a(-1, obj);
            return;
        }
        Object obj2 = sparseArray.get(40003);
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.j("Track_WeightMeasureDataHelper", "acquireCaloriesDataResult onResult data not instanceof List");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        List<HiHealthData> list = (List) obj2;
        if (njy.e(list)) {
            LogUtil.j("Track_WeightMeasureDataHelper", "healthDataList is empty");
            iBaseResponseCallback.a(-1, obj);
            return;
        }
        int intValue = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                LogUtil.j("Track_WeightMeasureDataHelper", "healthData == null");
            } else {
                intValue += hiHealthData.getIntValue();
            }
        }
        iBaseResponseCallback.a(0, Float.valueOf(intValue / 1000.0f));
    }

    public void e() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private static boolean f(long j) {
        return lsl.o(j) >= 4 && lsl.o(j) <= 6;
    }

    private static boolean i(long j) {
        long jB = lsl.b(j);
        return j >= lsl.c(jB, -2) && j <= jB;
    }

    public static boolean d(long j) {
        return lsl.g(System.currentTimeMillis(), j);
    }

    public static boolean b(long j) {
        return lsl.f(System.currentTimeMillis(), j);
    }

    public static boolean c(long j) {
        return b(j) && i(j);
    }

    public static boolean e(long j) {
        return d(j) && f(j);
    }

    public static boolean a(long j) {
        return b(j) && c(System.currentTimeMillis());
    }

    public static boolean h(long j) {
        return d(j) && e(System.currentTimeMillis());
    }
}
