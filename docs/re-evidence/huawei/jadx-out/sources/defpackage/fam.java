package defpackage;

import android.content.Context;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.model.AISleepMusicFactory;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.motiontrack.api.ILocationChangeListener;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class fam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f33776a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AISleepMusicFactory f33777c;
    private volatile boolean d;
    private volatile int f;
    private a g;
    private volatile eym h;
    private String i;
    private e j;
    private static final int[] e = {44304, 44305, 44306, DicDataTypeUtil.DataType.EMOTION_STATUS_ALL_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_HAPPY_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_PEACE_COUNT.value(), DicDataTypeUtil.DataType.EMOTION_STATUS_UNHAPPY_COUNT.value(), 46016, 46017, 46020, DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY_RMSSD_MAX.value(), DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY_RMSSD_MIN.value(), DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY_RMSSD_LAST.value()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f33775b = {"stress_min", "stress_max", "stress_avg", "emotion_all_count", "emotion_happy_count", "emotion_peace_count", "emotion_unhappy_count", "heart_rate_max", "heart_rate_min", "heart_rate_last", "hrv_max", "hrv_min", "hrv_last"};

    private fam() {
        this.d = false;
        this.f = -1;
        this.g = new a();
        this.f33777c = new AISleepMusicFactory(BaseApplication.b());
        this.j = new e(Looper.getMainLooper());
    }

    public static fam d() {
        return c.f33783c;
    }

    public AISleepMusicFactory b() {
        return this.f33777c;
    }

    public String c() {
        return this.f33776a;
    }

    public eym h() {
        return this.h;
    }

    public String a() {
        return this.i;
    }

    public void b(eym eymVar) {
        LogUtil.a("SleepMusicController", "setPendingWeather weather is : ", HiJsonUtil.d(eymVar));
        this.h = eymVar;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(final IBaseResponseCallback iBaseResponseCallback, final String str) throws Throwable {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fat
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f33795c.c(iBaseResponseCallback, str);
                }
            });
            return;
        }
        if (TextUtils.equals(this.f33776a, str)) {
            LogUtil.a("SleepMusicController", "stopPlayback remove handler mAudioId is : ", this.f33776a);
            this.f33776a = "";
            this.j.removeMessages(1);
            this.f = -1;
            fai.e(false);
        }
        eyh eyhVar = new eyh();
        eyhVar.a(TextUtils.isEmpty(str) ? this.f33776a : str);
        eyhVar.c(CommonUtil.z());
        String url = eyhVar.getUrl();
        LogUtil.a("SleepMusicController", "stopPlayback url:", url, " audioId:", str);
        Object objE = oet.d().e(url, this.f33777c.getHeaders(), ofe.c(this.f33777c.getBody(eyhVar)), Object.class);
        LogUtil.a("SleepMusicController", "stopPlayback data:", objE);
        if (objE == null) {
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, objE);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final IBaseResponseCallback iBaseResponseCallback, final String str, final int i) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            this.f33776a = str;
        }
        this.f = i;
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fas
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.e.e(iBaseResponseCallback, str, i);
                }
            });
            return;
        }
        fai.e(i != 1);
        eyi eyiVar = new eyi();
        eyiVar.c(i);
        if (TextUtils.isEmpty(str)) {
            str = this.f33776a;
        }
        eyiVar.e(str);
        eyiVar.d(System.currentTimeMillis());
        eyiVar.b(CommonUtil.z());
        String url = eyiVar.getUrl();
        LogUtil.a("SleepMusicController", "playControl url:", url);
        Object objE = oet.d().e(url, this.f33777c.getHeaders(), ofe.c(this.f33777c.getBody(eyiVar)), Object.class);
        LogUtil.a("SleepMusicController", "playControl data:", objE);
        if (objE == null) {
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, objE);
        }
    }

    public void c(IBaseResponseCallback iBaseResponseCallback, String str, boolean z) {
        this.f33776a = str;
        Message message = new Message();
        message.what = 1;
        message.obj = iBaseResponseCallback;
        message.arg1 = z ? 1 : 0;
        this.j.sendMessage(message);
    }

    private void b(Date date, Date date2, final CountDownLatch countDownLatch, final exu exuVar) {
        gwa.c().e(date, date2, new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 7}, new IBaseResponseCallback() { // from class: fam.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (!njy.b(obj, gxq.class)) {
                    countDownLatch.countDown();
                    LogUtil.a("SleepMusicController", "countDownLatch.countDown() 1");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    countDownLatch.countDown();
                    LogUtil.a("SleepMusicController", "countDownLatch.countDown() 2");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fam.this.d((gxq) it.next(), arrayList);
                }
                LogUtil.a("SleepMusicController", "requestSleepData is : ", HiJsonUtil.d(arrayList));
                exuVar.e(arrayList);
                countDownLatch.countDown();
                LogUtil.a("SleepMusicController", "countDownLatch.countDown() 3");
            }
        });
    }

    private void e(Date date, Date date2, final exu exuVar, final CountDownLatch countDownLatch) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f33775b);
        hiAggregateOption.setType(e);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setTimeInterval(DateFormatUtil.e(lsl.r(date.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), DateFormatUtil.e(lsl.c(date2.getTime()), DateFormatUtil.DateFormatType.DATE_FORMAT_MILS), HiDataReadOption.TimeFormatType.DATE_FORMAT_MILLISECONDS);
        HiDataAggregateProOption hiDataAggregateProOptionE = HiDataAggregateProOption.builder().c(hiAggregateOption).e(true).e();
        hiAggregateOption.setReadType(0);
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthDataPro(hiDataAggregateProOptionE, new HiAggregateListener() { // from class: fam.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (i == 0 && !njy.e(list)) {
                    fam.this.e(list, exuVar);
                    fam.this.d(list, exuVar);
                    fam.this.b(list, exuVar);
                    fam.this.a(list, exuVar);
                    countDownLatch.countDown();
                    LogUtil.a("SleepMusicController", "countDownLatch.countDown() 5");
                    return;
                }
                ReleaseLogUtil.a("SleepMusicController", " requestPhysiology error: ", Integer.valueOf(i));
                LogUtil.a("SleepMusicController", "countDownLatch.countDown() 4");
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final exu exuVar, final CountDownLatch countDownLatch) {
        if (!e()) {
            LogUtil.a("SleepMusicController", "requestLocation no Permission");
            f();
        } else {
            gch.b().requestLocationUpdates(new ILocationChangeListener() { // from class: fao
                @Override // com.huawei.health.motiontrack.api.ILocationChangeListener
                public final void onLocationChange(jpg jpgVar) {
                    this.f33788b.b(exuVar, countDownLatch, jpgVar);
                }
            }, 2);
        }
    }

    /* synthetic */ void b(exu exuVar, CountDownLatch countDownLatch, jpg jpgVar) {
        if (exuVar != null) {
            String str = "lon=" + jpgVar.f38787a + ";lat=" + jpgVar.d;
            this.i = str;
            exuVar.d(str);
        }
        LogUtil.a("SleepMusicController", "requestLocation lon=", Double.valueOf(jpgVar.f38787a), ";lat=", Double.valueOf(jpgVar.d));
        lqq lqqVarE = lqh.d().e(false, jpgVar.d, jpgVar.f38787a);
        if (lqqVarE == null || lqqVarE.n() == -99) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            LogUtil.a("SleepMusicController", "requestLocation dataWeather is null or invalid");
            gch.b().removeLocationUpdates();
            return;
        }
        eym eymVar = new eym();
        eymVar.e(Integer.parseInt(lqqVarE.f().replace("%", "")));
        eymVar.c(lqqVarE.d());
        eymVar.a(lqqVarE.n());
        eymVar.b(lqqVarE.m());
        eymVar.e(e(lqqVarE.y()));
        eymVar.d(lqqVarE.j());
        if (exuVar != null) {
            exuVar.e(eymVar);
        }
        b(eymVar);
        gch.b().removeLocationUpdates();
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        LogUtil.a("SleepMusicController", "requestLocation success");
    }

    public exu e(String str, String str2) {
        final exu exuVar = new exu();
        exuVar.b(Integer.parseInt(fxl.d()));
        exuVar.b(str);
        if (!TextUtils.isEmpty(str2)) {
            exuVar.e(str2);
        }
        exuVar.j(String.valueOf(System.currentTimeMillis()));
        exuVar.c(LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1010));
        exuVar.a(CommonUtil.z());
        exuVar.h(HiDateUtil.n(System.currentTimeMillis()));
        Date date = new Date(lsl.d(lsl.r(System.currentTimeMillis()), -6));
        Date date2 = new Date(System.currentTimeMillis());
        CountDownLatch countDownLatch = new CountDownLatch(2);
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        b(date, date2, countDownLatch, exuVar);
        e(date, date2, exuVar, countDownLatch);
        HandlerCenter.a().execute(new Runnable() { // from class: far
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(exuVar, countDownLatch2);
            }
        });
        try {
            ReleaseLogUtil.d("SleepMusicController", "requestLocation isOnTime:", Boolean.valueOf(countDownLatch2.await(1000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_SleepMusicController", "requestLocation InterruptedException error");
        }
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            return exuVar;
        } catch (InterruptedException unused2) {
            ReleaseLogUtil.e("R_SleepMusicController", "InterruptedException error");
            return new exu();
        }
    }

    public exu d(String str) {
        exu exuVar = new exu();
        exuVar.b(Integer.parseInt(fxl.d()));
        exuVar.b(str);
        exuVar.j(String.valueOf(System.currentTimeMillis()));
        exuVar.c(LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1010));
        exuVar.a(CommonUtil.z());
        exuVar.h(lsl.d().getDisplayName());
        Date date = new Date(lsl.d(lsl.r(System.currentTimeMillis()), -6));
        Date date2 = new Date(System.currentTimeMillis());
        CountDownLatch countDownLatch = new CountDownLatch(2);
        b(date, date2, countDownLatch, exuVar);
        e(date, date2, exuVar, countDownLatch);
        try {
            ReleaseLogUtil.d("SleepMusicController", "getAiAudioReqForMarketing isOnTime:", Boolean.valueOf(countDownLatch.await(1000L, TimeUnit.MILLISECONDS)));
            return exuVar;
        } catch (InterruptedException e2) {
            ReleaseLogUtil.a("R_SleepMusicController", "getAiAudioReqForMarketing InterruptedException:", ExceptionUtils.c(e2));
            return new exu();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(final IBaseResponseCallback iBaseResponseCallback, final String str, final String str2) throws Throwable {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fav
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f33797c.d(iBaseResponseCallback, str, str2);
                }
            });
            return;
        }
        this.f = 3;
        b((eym) null);
        get.c().e(this.g);
        exu exuVarE = e(str, str2);
        String url = exuVarE.getUrl();
        LogUtil.a("SleepMusicController", "generateAiAudio url:", url);
        LogUtil.a("SleepMusicController", "generateAiAudio is : ", HiJsonUtil.d(exuVarE));
        Object objE = oet.d().e(url, this.f33777c.getHeaders(), ofe.c(this.f33777c.getBody(exuVarE)), Object.class);
        LogUtil.a("SleepMusicController", "generateAiAudio data:", objE);
        if (objE == null) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        iBaseResponseCallback.a(0, objE);
        try {
            this.f33776a = new JSONObject(HiJsonUtil.d(objE)).optString("audioId", "");
        } catch (JSONException unused) {
            LogUtil.j("SleepMusicController", "JSONException");
        }
        fai.e(true);
    }

    private String e(int i) {
        switch (i) {
            case 1:
                return "NE";
            case 2:
                return ExifInterface.LONGITUDE_EAST;
            case 3:
                return "SE";
            case 4:
                return ExifInterface.LATITUDE_SOUTH;
            case 5:
                return "SW";
            case 6:
                return "W";
            case 7:
                return "NW";
            case 8:
                return "N";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gxq gxqVar, List<eye> list) {
        if (gxqVar.n() != SleepViewConstants.SleepTypeEnum.SCIENCE) {
            return;
        }
        LogUtil.a("SleepMusicController", "handleSleepData originData is : ", HiJsonUtil.d(gxqVar));
        eye eyeVar = new eye();
        eyeVar.a(DateFormatUtil.e(gxqVar.k().j(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
        eyeVar.c(gxqVar.k().l());
        eyeVar.a(((long) gxqVar.k().i()) * 60);
        eyeVar.d(gxqVar.k().aq());
        eyeVar.e(gxqVar.k().u() * 60);
        eyeVar.b(gxqVar.a());
        if (gxqVar.k().ax() == 5) {
            eyeVar.d("[10,30]");
        } else {
            eyeVar.d("[20,60]");
        }
        list.add(eyeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, exu exuVar) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiHealthData.containsKey("stress_min") || hiHealthData.containsKey("stress_max") || hiHealthData.containsKey("stress_avg"))) {
                eyn eynVar = new eyn();
                eynVar.c(hiHealthData.getInt("stress_max"));
                eynVar.d(hiHealthData.getInt("stress_min"));
                eynVar.b(hiHealthData.getInt("stress_avg"));
                eynVar.a(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
                arrayList.add(eynVar);
            }
        }
        exuVar.c(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, exu exuVar) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.containsKey("emotion_all_count") && (hiHealthData.containsKey("emotion_happy_count") || hiHealthData.containsKey("emotion_peace_count") || hiHealthData.containsKey("emotion_unhappy_count"))) {
                eyc eycVar = new eyc();
                eycVar.a(b(hiHealthData.getFloat("emotion_happy_count"), hiHealthData.getFloat("emotion_all_count")));
                eycVar.c(b(hiHealthData.getFloat("emotion_peace_count"), hiHealthData.getFloat("emotion_all_count")));
                eycVar.d(b(hiHealthData.getFloat("emotion_unhappy_count"), hiHealthData.getFloat("emotion_all_count")));
                eycVar.c(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
                arrayList.add(eycVar);
            }
        }
        exuVar.d(arrayList);
    }

    public int b(float f, float f2) {
        if (f2 == 0.0f || f == 0.0f) {
            return 0;
        }
        return Math.round((f / f2) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HiHealthData> list, exu exuVar) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiHealthData.containsKey("heart_rate_max") || hiHealthData.containsKey("heart_rate_min") || hiHealthData.containsKey("heart_rate_last"))) {
                eya eyaVar = new eya();
                eyaVar.d(hiHealthData.getInt("heart_rate_max"));
                eyaVar.a(hiHealthData.getInt("heart_rate_min"));
                eyaVar.c(hiHealthData.getInt("heart_rate_last"));
                eyaVar.b(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
                arrayList.add(eyaVar);
            }
        }
        exuVar.a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, exu exuVar) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (hiHealthData.containsKey("hrv_max") || hiHealthData.containsKey("hrv_min") || hiHealthData.containsKey("hrv_last"))) {
                eyb eybVar = new eyb();
                eybVar.c(hiHealthData.getInt("hrv_max"));
                eybVar.a(hiHealthData.getInt("hrv_min"));
                eybVar.b(hiHealthData.getInt("hrv_last"));
                eybVar.a(DateFormatUtil.e(hiHealthData.getStartTime(), DateFormatUtil.DateFormatType.DATE_FORMAT_8));
                arrayList.add(eybVar);
            }
        }
        exuVar.b(arrayList);
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final fam f33783c = new fam();
    }

    static class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            if (message == null) {
                LogUtil.j("SleepMusicController", "message is null");
                return;
            }
            super.handleMessage(message);
            if (message.what != 1) {
                LogUtil.a("SleepMusicController", "unknow msg: ", Integer.valueOf(message.what));
                return;
            }
            d((IBaseResponseCallback) message.obj, message.arg1 == 1);
            removeMessages(message.what);
            Message message2 = new Message();
            message2.what = message.what;
            message2.obj = message.obj;
            message2.arg1 = 0;
            fam.d().j.sendMessageDelayed(message2, 60000L);
        }

        private void d(final eyg eygVar, final CountDownLatch countDownLatch) {
            LogUtil.a("SleepMusicController", "refreshAudio sync step");
            fga.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).e().c(new IExecuteResult() { // from class: fam.e.3
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    if (!(obj instanceof Bundle)) {
                        LogUtil.e("SleepMusicController", "handleStep healthOpenSdk getTodaySportData is not Bundle ");
                        countDownLatch.countDown();
                    } else {
                        int iMax = Math.max(0, ((Bundle) obj).getInt("step"));
                        LogUtil.a("SleepMusicController", "current step is ", Integer.valueOf(iMax));
                        eygVar.e(iMax);
                        countDownLatch.countDown();
                    }
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    LogUtil.e("SleepMusicController", "handleStep healthOpenSdk getTodaySportData onFailed ");
                    countDownLatch.countDown();
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    LogUtil.e("SleepMusicController", "handleStep healthOpenSdk getTodaySportData onServiceException ");
                    countDownLatch.countDown();
                }
            });
        }

        private void e(final eyg eygVar, final CountDownLatch countDownLatch) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SleepMusicController");
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                LogUtil.j("SleepMusicController", "getConnectDeviceStatus deviceInfo is null");
                countDownLatch.countDown();
                return;
            }
            qec.c().startSynBasicData(new IBaseResponseCallback() { // from class: fam.e.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SleepMusicController", "errorCode is ", Integer.valueOf(i), " objData ", obj);
                }
            });
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setStartTime(0L);
            hiAggregateOption.setEndTime(HiDateUtil.g(System.currentTimeMillis()));
            hiAggregateOption.setCount(1);
            hiAggregateOption.setGroupUnitSize(1);
            hiAggregateOption.setReadType(0);
            hiAggregateOption.setSortOrder(1);
            hiAggregateOption.setGroupUnitType(3);
            hiAggregateOption.setType(new int[]{2002});
            hiAggregateOption.setConstantsKey(new String[]{"real_heart_rate"});
            HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: fam.e.5
                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResult(List<HiHealthData> list, int i, int i2) {
                    if (i != 0 || njy.e(list)) {
                        ReleaseLogUtil.a("SleepMusicController", " requestRealHeartRate error: ", Integer.valueOf(i));
                        countDownLatch.countDown();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (HiHealthData hiHealthData : list) {
                        if (hiHealthData != null && hiHealthData.containsKey("real_heart_rate")) {
                            eyf eyfVar = new eyf();
                            eyfVar.e(hiHealthData.getInt("real_heart_rate"));
                            eyfVar.b(hiHealthData.getStartTime());
                            eyfVar.c(hiHealthData.getEndTime());
                            arrayList.add(eyfVar);
                        }
                    }
                    eygVar.c(arrayList);
                    countDownLatch.countDown();
                }

                @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                    LogUtil.a("SleepMusicController", "getRealHeartRate onResultIntent into");
                    countDownLatch.countDown();
                }
            });
        }

        private void b(eyg eygVar) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SleepMusicController");
            eygVar.c(1);
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                LogUtil.j("SleepMusicController", "getConnectDeviceStatus deviceInfo is null");
                return;
            }
            dmx<?> commonData = ecu.d().getCommonData(deviceInfo, KnitHealthDetailActivity.KEY_SLEEP_STATUS, null);
            if (commonData == null || commonData.a().intValue() != 0 || !(commonData.c() instanceof String)) {
                LogUtil.j("SleepMusicController", "status is ", commonData);
                return;
            }
            LogUtil.a("SleepMusicController", "status data is ", commonData.c());
            try {
                eygVar.c(1 - Integer.parseInt((String) commonData.c()));
            } catch (NumberFormatException unused) {
                LogUtil.j("SleepMusicController", "NumberFormatException");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void d(final IBaseResponseCallback iBaseResponseCallback, final boolean z) throws Throwable {
            if (!HandlerExecutor.c()) {
                if (fam.d().f == 1 && !z) {
                    LogUtil.a("SleepMusicController", "refreshAudio mPlayControl is 1 : ", Boolean.valueOf(fam.d().f == 1));
                    return;
                }
                eyg eygVar = new eyg();
                CountDownLatch countDownLatch = new CountDownLatch(2);
                eygVar.e(fam.d().c());
                eygVar.d(fam.d().a());
                eygVar.b(CommonUtil.z());
                b(eygVar);
                eygVar.d(CommonUtil.ad(com.huawei.hwcommonmodel.application.BaseApplication.getContext()) ? 1 : 2);
                d(eygVar, countDownLatch);
                e(eygVar, countDownLatch);
                if (fam.d().h() != null) {
                    LogUtil.a("SleepMusicController", "RefreshInfoAiAudio getPendingWeather is :", HiJsonUtil.d(fam.d().h()));
                    eygVar.d(fam.d().h());
                } else {
                    LogUtil.a("SleepMusicController", "RefreshInfoAiAudio getPendingWeather is null ");
                    HandlerCenter.a().execute(new Runnable() { // from class: fax
                        @Override // java.lang.Runnable
                        public final void run() {
                            fam.d().b((exu) null, (CountDownLatch) null);
                        }
                    });
                }
                try {
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    LogUtil.j("SleepMusicController", "refreshAudio InterruptedException");
                }
                String url = eygVar.getUrl();
                LogUtil.a("SleepMusicController", "RefreshInfoAiAudio url:", url, " request:", eygVar);
                Object objE = oet.d().e(url, fam.d().b().getHeaders(), ofe.c(fam.d().b().getBody(eygVar)), Object.class);
                LogUtil.a("SleepMusicController", "RefreshInfoAiAudio data:", objE);
                if (objE == null) {
                    iBaseResponseCallback.a(-1, null);
                    return;
                } else {
                    iBaseResponseCallback.a(0, objE);
                    return;
                }
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: fay
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f33799b.d(iBaseResponseCallback, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PlaybackState playbackState) throws Throwable {
        if (playbackState == null) {
            LogUtil.j("SleepMusicController", "onPlaybackStateChanged, state is null ,this should NOT happen...");
            return;
        }
        Bundle extras = playbackState.getExtras();
        String string = extras != null ? extras.getString("mediaId", "") : "";
        if (extras == null || !"generativeSleepMusic".equals(extras.getString("category"))) {
            LogUtil.j("SleepMusicController", "onPlaybackStateChanged not ai sleep music media");
            return;
        }
        LogUtil.a("SleepMusicController", "handleMusicStatus mPlayControl is : ", Integer.valueOf(this.f), "state.getState() is ： ", Integer.valueOf(playbackState.getState()));
        if (playbackState.getState() == 1) {
            this.d = false;
            if (this.f == -1 || get.c().l()) {
                return;
            }
            c(new IBaseResponseCallback() { // from class: fam.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SleepMusicController", "stopPlayback, errorCode is ", Integer.valueOf(i), " response is ", obj);
                }
            }, this.f33776a);
            get.c().a(this.g);
        }
        if (playbackState.getState() == 2) {
            b(string);
        }
        if (playbackState.getState() != 3 || this.f == 2) {
            return;
        }
        e(new IBaseResponseCallback() { // from class: fam.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("SleepMusicController", "playControl, errorCode is ", Integer.valueOf(i), " response is ", obj);
            }
        }, this.f33776a, 2);
    }

    private void b(String str) throws Throwable {
        LogUtil.a("SleepMusicController", "handleMusicStatus MediaCenter.getInstance().isAutoTimeEnd() is : ", Boolean.valueOf(get.c().l()));
        if (get.c().l()) {
            LogUtil.a("SleepMusicController", "handleMusicStatus MediaCenter.getInstance().stop()");
            get.c().r();
        }
        if (!TextUtils.equals(str, this.f33776a)) {
            LogUtil.a("SleepMusicController", "handleMusicStatus mediaId equals mAudioId is true");
        } else if (this.f == 1) {
            LogUtil.a("SleepMusicController", "handleMusicStatus mPlayControl is 1");
        } else {
            e(new IBaseResponseCallback() { // from class: fam.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SleepMusicController", "playControl, errorCode is ", Integer.valueOf(i), " response is ", obj);
                }
            }, this.f33776a, 1);
        }
    }

    static class a extends get.a {
        private a() {
        }

        @Override // get.a
        public void onPlaybackStateChanged(PlaybackState playbackState) throws Throwable {
            LogUtil.a("SleepMusicController", "current state is ", Integer.valueOf(playbackState.getState()));
            fam.d().c(playbackState);
        }
    }

    public boolean e() {
        return PermissionUtil.b(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION"});
    }

    public void f() {
        LogUtil.a("SleepMusicController", "requestLocationPermission mIsRequestLocation is : ", Boolean.valueOf(this.d));
        if (this.d) {
            return;
        }
        PermissionUtil.d(com.huawei.hwcommonmodel.application.BaseApplication.getActivity(), PermissionUtil.PermissionType.COARSE_LOCATION, new AnonymousClass10(com.huawei.hwcommonmodel.application.BaseApplication.getContext()));
        this.d = true;
    }

    /* JADX INFO: renamed from: fam$10, reason: invalid class name */
    class AnonymousClass10 extends CustomPermissionAction {
        AnonymousClass10(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("SleepMusicController", "requestLocationPermission addLocation permission onGranted ");
            HandlerCenter.a().execute(new Runnable() { // from class: fau
                @Override // java.lang.Runnable
                public final void run() {
                    fam.d().b((exu) null, (CountDownLatch) null);
                }
            });
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            LogUtil.a("SleepMusicController", "requestLocationPermission addLocation permission denied ");
            super.onDenied(str);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.a("SleepMusicController", "requestLocationPermission addLocation permission forever denied ");
            super.onForeverDenied(permissionType);
            qrs.b(com.huawei.hwcommonmodel.application.BaseApplication.getActivity(), permissionType, new View.OnClickListener() { // from class: fba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qrs.al(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                }
            }, (View.OnClickListener) null);
        }
    }
}
