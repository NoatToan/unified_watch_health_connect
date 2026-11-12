package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureCalibrateQuestionActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.CustTimerHelper;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.TimerHelper;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class uey {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f50002c = new byte[1];
    private static uey e;
    private JSONObject ad;
    private HiStressMetaData af;
    private long am;
    private WeakReference<PressureCalibrateQuestionActivity> ar;
    private long g;
    private int j;
    private Intent n;
    private List<Integer> ah = new ArrayList(16);
    private List<Integer> ai = new ArrayList(16);
    private List<JSONObject> ab = new ArrayList(16);
    private boolean t = false;
    private Semaphore ak = new Semaphore(0);
    private Semaphore i = new Semaphore(0);
    private Semaphore ag = new Semaphore(0);
    private int an = 1;
    private int aj = 1;
    private int aa = 0;
    private boolean o = false;
    private boolean r = false;
    private boolean l = false;
    private boolean v = false;
    private boolean u = false;
    private boolean x = false;
    private boolean k = false;
    private boolean q = false;
    private boolean w = false;
    private boolean y = false;
    private boolean z = false;
    private boolean ac = false;
    private TimerHelper h = null;
    private CustTimerHelper f = null;
    private boolean s = false;
    private HiStressMetaData m = null;
    private float[] ae = null;
    private boolean p = false;
    private IBaseResponseCallback al = new IBaseResponseCallback() { // from class: uey.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj == null) {
                LogUtil.j("PressureUtil", "Message is null!");
            } else {
                if (i == 100000) {
                    fks.d().p(uey.this.f50004b);
                    uey.this.m(true);
                    LogUtil.a("PressureUtil", "callback is unRegisterNotificationPress");
                    return;
                }
                LogUtil.j("PressureUtil", "Message is not right!");
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f50004b = new IBaseResponseCallback() { // from class: uey.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj == null) {
                LogUtil.j("PressureUtil", "objData is null");
                return;
            }
            if (i == 0) {
                try {
                    uey.this.ad = new JSONObject((String) obj);
                    LogUtil.a("PressureUtil", "Message is ", uey.this.ad);
                    if (uey.c() - uey.this.v() <= 60000) {
                        uey.this.ab.add(uey.this.ad);
                        LogUtil.a("PressureUtil", "BackList add jsonObject!");
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    LogUtil.e("PressureUtil", "objData change to json not right");
                    return;
                }
            }
            if (i != 125002 && i != 125001 && i != 126008) {
                LogUtil.j("PressureUtil", "IBaseResponseCallback onResponse() = err");
                return;
            }
            LogUtil.a("PressureUtil", "err_code is bad = ", Integer.valueOf(i), " getIsPressureMeasureActivity() = ", Boolean.valueOf(uey.this.n()), " getIsPressureCalibrateActivity() = ", Boolean.valueOf(uey.this.f()));
            if (i == 126008) {
                uey.this.h(126008);
            } else {
                uey.this.h(1000);
                uey.this.h(1001);
            }
            uey.this.aa();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CommonUiBaseResponse f50003a = new CommonUiBaseResponse() { // from class: uey.4
        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            if (obj == null || i != 0) {
                uey.this.k(false);
            } else {
                LogUtil.a("PressureUtil", "data storage success. pressureMeasureDetailInteractor setStressData err_code = ", Integer.valueOf(i));
                uey.this.k(true);
                if (((Integer) obj).intValue() == 2) {
                    uey.this.ak();
                }
                ObserverManagerUtil.e("PRESSURE_MEASURED", new Object[0]);
            }
            uey.this.ag.release();
            LogUtil.a("PressureUtil", "measureSemaphore.release()");
        }
    };
    private Context d = BaseApplication.getContext();

    private int aj() {
        return 1;
    }

    private int al() {
        return 1;
    }

    private uey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        mhs mhsVarA = mhs.a();
        final mbr mbrVarA = mbr.a();
        mhsVarA.getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: uey.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof String)) {
                    if ("true".equals((String) obj)) {
                        mbrVarA.e(1);
                        return;
                    } else {
                        mbrVarA.e(2);
                        return;
                    }
                }
                mbrVarA.e(2);
            }
        });
    }

    public static uey a() {
        uey ueyVar;
        synchronized (f50002c) {
            if (e == null) {
                e = new uey();
            }
            ueyVar = e;
        }
        return ueyVar;
    }

    public List<Integer> r() {
        return this.ai;
    }

    public List<Integer> t() {
        return this.ah;
    }

    public List<JSONObject> k() {
        return this.ab;
    }

    private void l(float[] fArr) {
        if (fArr != null) {
            this.ae = (float[]) fArr.clone();
        } else {
            this.ae = null;
        }
    }

    public float[] s() {
        float[] fArr = this.ae;
        if (fArr != null) {
            return (float[]) fArr.clone();
        }
        return new float[0];
    }

    private void a(long j) {
        this.am = j;
    }

    public long v() {
        return this.am;
    }

    private void b(long j) {
        this.g = j;
    }

    public long d() {
        return this.g;
    }

    public void j(int i) {
        this.an = i;
    }

    public int q() {
        return this.an;
    }

    public void f(int i) {
        this.aj = i;
    }

    public int y() {
        return this.aj;
    }

    public void c(int i) {
        this.aa = i;
    }

    public int p() {
        return this.aa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(boolean z) {
        this.q = z;
    }

    private boolean af() {
        return this.q;
    }

    public void d(boolean z) {
        this.o = z;
    }

    private boolean ab() {
        return this.o;
    }

    public void a(boolean z) {
        this.t = z;
    }

    public boolean g() {
        return this.t;
    }

    public void b(boolean z) {
        this.r = z;
    }

    public boolean j() {
        return this.r;
    }

    public void h(boolean z) {
        this.v = z;
    }

    private boolean ah() {
        return this.v;
    }

    public void i(boolean z) {
        this.u = z;
    }

    private boolean ag() {
        return this.u;
    }

    public void g(boolean z) {
        this.x = z;
    }

    public boolean m() {
        return this.x;
    }

    public void c(boolean z) {
        this.k = z;
    }

    public boolean i() {
        return this.k;
    }

    public void f(boolean z) {
        this.w = z;
    }

    public boolean n() {
        return this.w;
    }

    public void e(boolean z) {
        this.y = z;
    }

    public boolean f() {
        return this.y;
    }

    public void j(boolean z) {
        this.ac = z;
    }

    public boolean l() {
        return this.ac;
    }

    private void l(boolean z) {
        this.s = z;
    }

    public boolean h() {
        return this.s;
    }

    private void n(boolean z) {
        this.l = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ai() {
        return this.l;
    }

    public void w() {
        LogUtil.a("PressureUtil", "removeHelperTimer");
        TimerHelper timerHelper = this.h;
        if (timerHelper == null || timerHelper.b() == null) {
            return;
        }
        this.h.b().cancel();
        this.h = null;
    }

    public void aa() {
        b(c());
        LogUtil.a("PressureUtil", "stopTimer mEndMeasureTime = ", Long.valueOf(d()));
        if (this.f50004b != null) {
            fks.d().p(this.f50004b);
        }
        h(true);
        i(true);
        TimerHelper timerHelper = this.h;
        if (timerHelper != null && timerHelper.b() != null) {
            this.h.b().cancel();
            this.h = null;
        }
        CustTimerHelper custTimerHelper = this.f;
        if (custTimerHelper == null || custTimerHelper.e() == null) {
            return;
        }
        this.f.e().cancel();
        this.f = null;
    }

    public void d(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("PressureUtil", "callback is null");
            return;
        }
        a(c());
        ReleaseLogUtil.d("PressureUtil", "openMeasureOrCalibrate mStartMeasureTime = ", Long.valueOf(v()), " openMeasureOrCalibrate = ", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        this.ad = jSONObject;
        try {
            jSONObject.put("status", 3);
        } catch (JSONException unused) {
            LogUtil.e("PressureUtil", "jsonObject fail");
        }
        fks.d().h(this.f50004b);
        fks.d().c(this.ad, new IBaseResponseCallback() { // from class: uey.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("PressureUtil", "errCode:", Integer.valueOf(i2), "flag: ", Integer.valueOf(i));
                if (obj == null) {
                    LogUtil.j("PressureUtil", "Message is null!");
                } else {
                    iBaseResponseCallback.a(i2, null);
                }
            }
        });
        a(this.ab);
    }

    public void e(int i, final int i2) {
        if (!ab() && ugb.b().k() && !ugb.b().l() && !ugb.b().f()) {
            qpx.b(this.d, this.d.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_question_out_time_notify));
        }
        n(true);
        g(true);
        ad();
        b(c());
        LogUtil.a("PressureUtil", "closeMeasureOrCalibrate mEndMeasureTime = ", Long.valueOf(d()), " closeMeasureOrCalibrate = ", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        this.ad = jSONObject;
        try {
            jSONObject.put("status", i);
            LogUtil.a("PressureUtil", "closeMeasureOrCalibrate jsonObject = ", this.ad);
        } catch (JSONException unused) {
            LogUtil.e("PressureUtil", "closeMeasureOrCalibrate jsonObject fail");
        }
        fks.d().c(this.ad, this.al);
        lsy.a(new Runnable() { // from class: uey.6
            @Override // java.lang.Runnable
            public void run() {
                uey.this.c(i2, true);
                LogUtil.a("PressureUtil", "ThreadPoolUtils startParser!");
            }
        });
        if (af()) {
            return;
        }
        fks.d().p(this.f50004b);
    }

    public boolean c(int i, boolean z) {
        List<JSONObject> list;
        if (h() || (list = this.ab) == null || list.size() < 1) {
            return false;
        }
        a(this.ab, i, z);
        return true;
    }

    private void a(List<JSONObject> list, int i, boolean z) {
        l(true);
        LogUtil.a("PressureUtil", "startParser() isParsered == ", Boolean.valueOf(this.s));
        boolean z2 = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            JSONObject jSONObject = list.get(i2);
            this.ad = jSONObject;
            c(jSONObject);
            if (i2 == list.size() - 1) {
                z2 = true;
            }
        }
        LogUtil.a("PressureUtil", "JsonObject is Parser end!");
        if (ah() || ag()) {
            LogUtil.a("PressureUtil", "STOP_FLAG");
            h(-101010);
            h(-101011);
            h(false);
            i(false);
            return;
        }
        if (z2) {
            LogUtil.a("PressureUtil", "openLibMeasure, json over!");
            if (i == 0) {
                l(d(i));
                LogUtil.a("PressureUtil", "openLibMeasure, MeassureSOBack!");
            } else if (i == 2 && ugb.b().g()) {
                LogUtil.a("PressureUtil", "openLibMeasure, CalibrateSOBack!");
            } else {
                LogUtil.a("PressureUtil", "libType is other type!");
            }
            if (z) {
                h(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        LogUtil.a("PressureUtil", "startBroadcast libType = ", Integer.valueOf(i));
        if (i == 0) {
            d("com.huawei.ui.pressure.measure");
            return;
        }
        if (i == 2) {
            d("com.huawei.ui.pressure.calibrate");
            return;
        }
        if (i == -101010) {
            d("com.huawei.ui.pressure.measure.suddenness");
            return;
        }
        if (i == -101011) {
            d("com.huawei.ui.pressure.measure.calibrate.stop");
            return;
        }
        if (i == 1000) {
            LogUtil.a("PressureUtil", "measure err!");
            a("com.huawei.ui.pressure.measure.err", "mIsFromNoData", "");
        } else if (i == 1001) {
            LogUtil.a("PressureUtil", "calibrate err!");
            a("com.huawei.ui.pressure.calibrate.err", "mIsFromNoData", "");
        } else {
            if (i == 126008) {
                LogUtil.a("PressureUtil", "no privacy err!");
                a("com.huawei.ui.pressure.measure.err", "mIsFromNoData", "no_privacy");
                a("com.huawei.ui.pressure.calibrate.err", "mIsFromNoData", "no_privacy");
                return;
            }
            LogUtil.d("PressureUtil", "libType is no match");
        }
    }

    private void d(String str) {
        a(str, "", "");
    }

    private void a(String str, String str2, String str3) {
        Intent intent = new Intent(str);
        this.n = intent;
        intent.setPackage(this.d.getPackageName());
        if (StringUtils.j(str2)) {
            this.n.putExtra(str2, this.t);
        }
        if (StringUtils.j(str3)) {
            this.n.putExtra(str3, true);
        }
        this.d.sendOrderedBroadcast(this.n, LocalBroadcast.f36595c);
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("rri_list");
            LogUtil.a("PressureUtil", "jsonParser jsonArray: ", jSONArray);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                a(jSONObject2.getInt("rri_value"), jSONObject2.getInt("rri_sqi"));
            }
            LogUtil.a("PressureUtil", "JSON parser Success!");
        } catch (JSONException unused) {
            LogUtil.e("PressureUtil", "JSON parser Fail!");
        }
    }

    private void a(int i, int i2) {
        if (i != 0) {
            this.ah.add(Integer.valueOf(i));
            this.ai.add(Integer.valueOf(i2));
        }
    }

    public float[] d(int i) {
        LogUtil.a("PressureUtil", "start openLibMeasure flag = ", Integer.valueOf(i));
        int iD = ((int) (d() - v())) / 1000;
        LogUtil.a("PressureUtil", "getEndMeasureTime() is ", Long.valueOf(d()), ", getStartMeasureTime is ", Long.valueOf(v()), ", signalTime is ", Integer.valueOf(iD));
        float[] fArrG = g(i);
        LogUtil.a("PressureUtil", "newCalibrateData is ", Arrays.toString(fArrG));
        return mza.e().c(iD, fArrG, t(), r());
    }

    private float[] g(int i) {
        float[] fArr = new float[18];
        LogUtil.a("PressureUtil", "initCalibrateData flag:", Integer.valueOf(i));
        if (i == 0) {
            return a().e(i);
        }
        if (i == 2) {
            e(i, fArr);
            return fArr;
        }
        if (i == 1) {
            e(i, fArr);
            return fArr;
        }
        LogUtil.j("PressureUtil", "initCalibrateData flag is error");
        return fArr;
    }

    private void e(int i, float[] fArr) {
        for (int i2 = 0; i2 < 15; i2++) {
            fArr[i2] = 0.0f;
        }
        if (i == 2) {
            fArr[16] = ugb.b().e();
        } else if (i == 1) {
            fArr[16] = 0.0f;
        } else {
            LogUtil.j("PressureUtil", "createNewCalibrateData flag is error");
        }
        fArr[17] = i;
    }

    public String a(int i) {
        if (i == 1) {
            return this.d.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_1);
        }
        if (i == 2) {
            return this.d.getResources().getString(R.string.IDS_hw_pressure_normal);
        }
        if (i == 3) {
            return this.d.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3);
        }
        if (i == 4) {
            return this.d.getResources().getString(R.string.IDS_hw_pressure_highly);
        }
        LogUtil.d("PressureUtil", "grade is no match!");
        return "";
    }

    public static long c() {
        return System.currentTimeMillis();
    }

    public void e(final int i, int i2, final int i3) {
        LogUtil.a("PressureUtil", "Current Timer start! time === ", Integer.valueOf(i2), ExifInterface.LATITUDE_SOUTH);
        TimerHelper timerHelper = new TimerHelper(i2, 1, i3);
        this.h = timerHelper;
        timerHelper.d(new TimerHelper.OnFinishListener() { // from class: uey.9
            @Override // com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.TimerHelper.OnFinishListener
            public void finish() {
                LogUtil.a("PressureUtil", "setTimer closeMeasureOrCalibrate");
                uey.this.e(i, i3);
                uey.this.g(true);
            }
        });
        this.h.e();
    }

    public void a(int i, Context context, float[] fArr) {
        if (context == null || fArr == null) {
            LogUtil.j("PressureUtil", " context isnull or libRetValue is null !!!");
            return;
        }
        LogUtil.a("PressureUtil", " PressureUtil setDataToData!");
        uis uisVar = new uis();
        if (i == 0) {
            LogUtil.a("PressureUtil", " setDataToData getMeasureHiStressMetaData()!");
            this.af = j(fArr);
        } else if (i != 2) {
            LogUtil.d("PressureUtil", "measure flag is no match");
        } else {
            this.af = f(fArr);
            nkp.a().e(context, this.af);
        }
        if (HwDevicePeriodRriFileManager.isSupportStressTenMinuteValues()) {
            LogUtil.a("PressureUtil", "setDataToData timeType == 1");
            this.af.configStressTimeType(1);
        } else {
            LogUtil.a("PressureUtil", "setDataToData timeType == 0");
            this.af.configStressTimeType(0);
        }
        uisVar.e(this.af, this.f50003a, i);
        try {
            if (this.ag.tryAcquire(2L, TimeUnit.SECONDS)) {
                LogUtil.a("PressureUtil", "measureSemaphore isTryAcquire()");
            } else {
                LogUtil.j("PressureUtil", "measureSemaphore isTryAcquire() fail");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("PressureUtil", "measureSemaphore.tryAcquire InterruptedException");
        }
        if (ae()) {
            return;
        }
        uisVar.e(this.af, this.f50003a, i);
        try {
            if (this.ag.tryAcquire(2L, TimeUnit.SECONDS)) {
                LogUtil.a("PressureUtil", "measureSemaphore tryAcquire2()");
            } else {
                LogUtil.j("PressureUtil", "measureSemaphore tryAcquire2() fail");
            }
        } catch (InterruptedException unused2) {
            LogUtil.e("PressureUtil", "measureSemaphore.tryAcquire2 InterruptedException");
        }
    }

    private HiStressMetaData j(float[] fArr) {
        LogUtil.a("PressureUtil", "getMeasureHiStressMetaData start ");
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        this.af = hiStressMetaData;
        hiStressMetaData.configStressStartTime(v());
        this.af.configStressEndTime(d());
        this.af.configStressAlgorithmVer(g(fArr));
        this.af.configStressDevNo(am());
        this.af.configStressScore(m(fArr));
        this.af.configStressGrade(o(fArr));
        this.af.configStressCalibFlag(n(fArr));
        this.af.configStressMeasureType(0);
        this.af.configStressAccFlag(al());
        this.af.configStressPpgFlag(aj());
        this.af.configStressFeature(h(fArr));
        this.af.configStressFeatureAtts(ac());
        LogUtil.a("PressureUtil", "getMeasureHiStressMetaData end ");
        return this.af;
    }

    private HiStressMetaData f(float[] fArr) {
        LogUtil.a("PressureUtil", "getCalibrateHiStressMetaData");
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        this.af = hiStressMetaData;
        hiStressMetaData.configStressStartTime(v());
        this.af.configStressEndTime(d());
        this.af.configStressAlgorithmVer(g(fArr));
        this.af.configStressDevNo(am());
        this.af.configStressScore(m(fArr));
        this.af.configStressGrade(o(fArr));
        this.af.configStressCalibFlag(n(fArr));
        this.af.configStressMeasureType(2);
        this.af.configStressAccFlag(al());
        this.af.configStressPpgFlag(aj());
        this.af.configStressFeature(h(fArr));
        this.af.configStressFeatureAtts(ac());
        return this.af;
    }

    private int g(float[] fArr) {
        return (int) fArr[10];
    }

    private List<Float> h(float[] fArr) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 12; i++) {
            if (i >= 0 && i < 10) {
                arrayList.add(Float.valueOf(fArr[i]));
            }
            if (i >= 10 && i < 12) {
                arrayList.add(Float.valueOf(0.0f));
            }
        }
        return arrayList;
    }

    private List<String> ac() {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 12; i++) {
            arrayList.add("0");
        }
        return arrayList;
    }

    private int m(float[] fArr) {
        return (int) fArr[15];
    }

    private int o(float[] fArr) {
        return (int) fArr[16];
    }

    private int n(float[] fArr) {
        int i = (int) fArr[17];
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        LogUtil.d("PressureUtil", "StressCalibFlag no match");
        return (int) fArr[17];
    }

    public boolean b() {
        return mgg.c("PressureUtil") != null;
    }

    private int am() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "PressureUtil");
        if (deviceInfo == null) {
            LogUtil.j("PressureUtil", "getStress_dev_no fail");
        } else {
            this.j = deviceInfo.getProductType();
        }
        return this.j;
    }

    public boolean i(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        float f = fArr[18];
        if (f != 1.0f) {
            return false;
        }
        LogUtil.a("PressureUtil", "libRetValue[18] = ", Float.valueOf(f));
        return true;
    }

    public int d(float[] fArr) {
        return (int) fArr[15];
    }

    public int a(float[] fArr) {
        return (int) fArr[16];
    }

    public boolean e(float[] fArr) {
        boolean z = false;
        if (fArr != null && fArr.length > 1 && fArr[18] == 1.0f) {
            float f = fArr[15];
            if (f >= 1.0f && f <= 99.0f) {
                z = true;
            }
            LogUtil.a("PressureUtil", "isCalibrateSucceed =", Boolean.valueOf(z));
        }
        return z;
    }

    public int b(float[] fArr) {
        return (int) fArr[15];
    }

    public int c(float[] fArr) {
        return (int) fArr[16];
    }

    private void e(List<?> list) {
        if (list != null) {
            list.clear();
            LogUtil.a("PressureUtil", "clearList");
        }
    }

    public void b(int i) {
        LogUtil.a("PressureUtil", "closeMeasureOrCalibrateAll");
        JSONObject jSONObject = new JSONObject();
        this.ad = jSONObject;
        try {
            jSONObject.put("status", i);
            LogUtil.a("PressureUtil", this.ad.toString());
        } catch (JSONException unused) {
            LogUtil.e("PressureUtil", "jsonObject fail");
        }
        fks.d().c(this.ad, this.al);
    }

    public float[] e(int i) {
        float[] fArrI;
        synchronized (this) {
            fArrI = i(i);
            if (mza.e().b(fArrI)) {
                LogUtil.a("PressureUtil", "newCalibData first is all 0 ");
                fArrI = i(i);
            }
        }
        return fArrI;
    }

    private float[] i(final int i) {
        final float[] fArr = new float[18];
        nkp.a().b(new IBaseResponseCallback() { // from class: uey.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != 0 || obj == null) {
                    LogUtil.j("PressureUtil", "No data from Datas !");
                } else {
                    LogUtil.a("PressureUtil", "objData == ", obj);
                    uey.this.m = mbs.a((String) obj);
                    uey.this.a(fArr, i);
                }
                uey.this.ak.release();
                LogUtil.a("PressureUtil", "semaphore.release()");
            }
        });
        try {
            if (this.ak.tryAcquire(2L, TimeUnit.SECONDS)) {
                LogUtil.a("PressureUtil", "semaphore isTryAcquire()");
                return fArr;
            }
            LogUtil.a("PressureUtil", "semaphore isTryAcquire() fail");
            return fArr;
        } catch (InterruptedException unused) {
            LogUtil.e("PressureUtil", "semaphore fail");
            return fArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float[] fArr, int i) {
        HiStressMetaData hiStressMetaData = this.m;
        if (hiStressMetaData == null) {
            return;
        }
        List<Float> listFetchStressFeature = hiStressMetaData.fetchStressFeature();
        for (int i2 = 0; i2 < 18; i2++) {
            if (i2 >= 0 && i2 < 10) {
                fArr[i2] = listFetchStressFeature.get(i2).floatValue();
            }
            if (i2 >= 10 && i2 <= 13) {
                fArr[i2] = 0.0f;
            }
            if (i2 > 13 && i2 <= 15) {
                fArr[i2] = 55.0f;
            }
            if (i2 == 16) {
                fArr[i2] = this.m.fetchStressScore();
            }
            if (i2 == 17) {
                fArr[i2] = i;
            }
        }
    }

    private void a(final List<JSONObject> list) {
        LogUtil.a("PressureUtil", "gameOver()");
        CustTimerHelper custTimerHelper = new CustTimerHelper(60, 12);
        this.f = custTimerHelper;
        custTimerHelper.c(new CustTimerHelper.OnFinishListener() { // from class: uey.7
            @Override // com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.helper.CustTimerHelper.OnFinishListener
            public void finish() {
                if (uey.this.ai()) {
                    LogUtil.a("PressureUtil", "mIsCompletedGameOver = ", Boolean.valueOf(uey.this.ai()));
                    uey.this.ad();
                } else if (list.size() < 1) {
                    uey.this.h(-101010);
                    uey.this.h(-101011);
                } else {
                    uey.this.ad();
                }
            }
        });
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        b(this.f);
        LogUtil.a("PressureUtil", "closeGameOver");
    }

    public void u() {
        CustTimerHelper custTimerHelper = this.f;
        if (custTimerHelper != null) {
            if (custTimerHelper.e() != null) {
                this.f.e().cancel();
            }
            this.f = null;
        }
        c(0);
        LogUtil.a("PressureUtil", "Anything is reset!!");
        a(this.h);
        b(this.f);
        if (!af()) {
            fks.d().p(this.f50004b);
        }
        f(1);
        j(false);
        b(0L);
        a(0L);
        d(false);
        j(1);
        n(false);
        f(false);
        e(false);
        g(false);
        h(false);
        i(false);
        c(false);
        a(false);
        b(false);
        l(false);
        m(false);
        e(this.ab);
        e(this.ah);
        e(this.ai);
        this.n = null;
        l((float[]) null);
        ugb.b().w();
    }

    public void x() {
        b(4);
        if (!af()) {
            fks.d().p(this.f50004b);
        }
        a(this.h);
        b(this.f);
        LogUtil.a("PressureUtil", "stopAllTimer");
    }

    private void a(TimerHelper timerHelper) {
        if (timerHelper == null || timerHelper.b() == null) {
            return;
        }
        timerHelper.b().cancel();
        timerHelper.c(null);
    }

    private void b(CustTimerHelper custTimerHelper) {
        if (custTimerHelper != null) {
            if (custTimerHelper.e() != null) {
                custTimerHelper.e().cancel();
                custTimerHelper.c((CountDownTimer) null);
            }
            LogUtil.a("PressureUtil", "helper = null");
        }
    }

    public void a(PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity) {
        this.ar = new WeakReference<>(pressureCalibrateQuestionActivity);
    }

    public PressureCalibrateQuestionActivity e() {
        WeakReference<PressureCalibrateQuestionActivity> weakReference = this.ar;
        if (weakReference == null) {
            LogUtil.e("PressureUtil", "mWeakReference is null");
            return null;
        }
        PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity = weakReference.get();
        if (pressureCalibrateQuestionActivity != null) {
            return pressureCalibrateQuestionActivity;
        }
        LogUtil.e("PressureUtil", "activity is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z) {
        LogUtil.a("PressureUtil", "setIsDataStoredSucceed = ", Boolean.valueOf(z));
        this.p = z;
    }

    private boolean ae() {
        LogUtil.a("PressureUtil", "getIsDataStoredSucceed=", Boolean.valueOf(this.p));
        return this.p;
    }

    public long o() {
        HiStressMetaData hiStressMetaData;
        if (!this.p || (hiStressMetaData = this.af) == null) {
            return 0L;
        }
        this.p = false;
        return hiStressMetaData.fetchStressStartTime();
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("PressureUtil", "readData callback is null");
            return;
        }
        HiAggregateOption hiAggregateOptionZ = z();
        hiAggregateOptionZ.setCount(1);
        hiAggregateOptionZ.setTimeRange(0L, System.currentTimeMillis());
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOptionZ, new HiAggregateListener() { // from class: uey.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (njy.e(list)) {
                    LogUtil.j("PressureUtil", "datas is empty");
                    iBaseResponseCallback.a(100001, new ArrayList());
                } else {
                    LogUtil.a("PressureUtil", "readData data size = ", Integer.valueOf(list.size()));
                    iBaseResponseCallback.a(0, list);
                }
            }
        });
    }

    private static HiAggregateOption z() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{2034});
        hiAggregateOption.setConstantsKey(new String[]{"pressure"});
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }
}
