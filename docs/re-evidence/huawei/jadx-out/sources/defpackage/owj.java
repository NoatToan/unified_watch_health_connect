package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.TrackData;
import com.huawei.pluginachievement.manager.service.OnceMovementReceiver;
import com.huawei.pluginachievement.report.bean.AnnualReportStepResult;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class owj {
    private static volatile owj d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f44917b = new Object();
    private static final Integer[] e = {257, 258, 264, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE), 262, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM), 259};
    private long h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44919c = 0;

    public static int a(long j, long j2) {
        return (int) ((j2 - j) / 8.64E7d);
    }

    private boolean b(int i, int i2, int i3) {
        return (i == 0 && i2 == 0 && i3 != 2) ? false : true;
    }

    private owj(Context context) {
        this.f44918a = context.getApplicationContext();
    }

    public static owj b(Context context) {
        if (d == null) {
            synchronized (f44917b) {
                if (d == null) {
                    d = new owj(context);
                }
            }
        }
        return d;
    }

    public void a(Context context) {
        paz.b(context);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (ost.a()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: owm
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
            return;
        }
        HashMap map = new HashMap(2);
        map.put("timeZone", HiDateUtil.c((String) null));
        otl.b(BaseApplication.b()).a(24, map);
    }

    public void e(Context context) {
        if (e(context, "generateAchieveMedalTime", 43200000L)) {
            return;
        }
        n(context);
        f(context);
    }

    private void f(final Context context) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: owj.1
            @Override // java.lang.Runnable
            public void run() {
                owj.b(context).c(context);
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public void c(Context context) {
        g(context);
        h(context);
        c();
    }

    /* JADX INFO: renamed from: owj$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jP = HiDateUtil.p(owj.this.d());
            long jG = HiDateUtil.g(System.currentTimeMillis());
            LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "dealHistoryThreeCircleData startTime:", Long.valueOf(jP), " endTime:", Long.valueOf(jG));
            qhb.c().c(jP, jG, new ResponseCallback() { // from class: owk
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    owj.AnonymousClass4.e(i, (List) obj);
                }
            });
        }

        static /* synthetic */ void e(int i, List list) {
            if (njy.e(list)) {
                LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealHistoryThreeCircleData dataList isEmpty!");
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthData hiHealthData = (HiHealthData) it.next();
                if (hiHealthData != null) {
                    owj.c(hiHealthData);
                }
            }
        }
    }

    public void c() {
        ThreadPoolManager.c().execute(new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HiHealthData hiHealthData) {
        long startTime = hiHealthData.getStartTime();
        int i = hiHealthData.getInt("calorieGoalValue");
        int i2 = hiHealthData.getInt("calorieUserValue");
        int i3 = hiHealthData.getInt("durationGoalValue");
        int i4 = hiHealthData.getInt("durationUserValue");
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "putThreeCircleData ", Long.valueOf(hiHealthData.getDay()), " cd:", Integer.valueOf(i2), " cg:", Integer.valueOf(i), " wd:", Integer.valueOf(i4), " wg:", Integer.valueOf(i3));
        if (i > 0 && i2 >= i) {
            OnceMovementReceiver.c(c("D1", i2 / i, startTime, String.valueOf(hiHealthData.getDay())));
        }
        if (i3 <= 0 || i4 < i3) {
            return;
        }
        OnceMovementReceiver.c(c("D2", i4 / i3, startTime, String.valueOf(hiHealthData.getDay())));
    }

    private static Bundle c(String str, int i, long j, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("dataType", str);
        bundle.putInt("dataLevel", i);
        bundle.putLong("timestamp", j);
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "getThreeCircleData day:", str2, " type:", str, " ratio:", Integer.valueOf(i), " startTime:", Long.valueOf(j));
        return bundle;
    }

    public void g(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: owj.5
            @Override // java.lang.Runnable
            public void run() {
                if (owj.this.h == 0) {
                    owj.this.i(context);
                }
                PluginAchieveAdapter adapter = oru.a(context).getAdapter();
                if (adapter == null) {
                    LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealHealthMedalDataGenerate achieveAdapter == null.");
                    return;
                }
                LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "TOTAL_SWIM_TYPE takeEffectTime ", Long.valueOf(owj.this.h));
                long jC = pap.c(false, System.currentTimeMillis());
                if (owj.this.h != 0) {
                    owj owjVar = owj.this;
                    owjVar.e(context, adapter, owjVar.h, jC);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context) {
        List<osf> listD = otl.b(context).d(9, new HashMap(2));
        if (njy.e(listD)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "medalConfigInfos isEmpty!");
            return;
        }
        long jD = 0;
        long jD2 = 0;
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                String strAcquireTakeEffectTime = medalConfigInfo.acquireTakeEffectTime();
                if (!TextUtils.isEmpty(strAcquireTakeEffectTime)) {
                    if ("C4".equals(strAcquireMedalType)) {
                        jD = oxi.d(strAcquireTakeEffectTime);
                    }
                    if ("C5".equals(strAcquireMedalType)) {
                        jD2 = oxi.d(strAcquireTakeEffectTime);
                    }
                }
            }
        }
        if (jD != 0) {
            this.h = jD;
        }
        if (jD2 != 0) {
            this.f44919c = jD2;
        }
    }

    public void h(final Context context) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: owj.3
            @Override // java.lang.Runnable
            public void run() {
                if (owj.this.f44919c == 0) {
                    owj.this.i(context);
                }
                PluginAchieveAdapter adapter = oru.a(context).getAdapter();
                if (adapter == null) {
                    LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealHealthMedalDataGenerate achieveAdapter == null.");
                    return;
                }
                LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "TOTAL_SKIP_TYPE takeEffectTime ", Long.valueOf(owj.this.f44919c));
                long jC = pap.c(false, System.currentTimeMillis());
                if (owj.this.f44919c != 0) {
                    owj owjVar = owj.this;
                    owjVar.b(context, adapter, owjVar.f44919c, jC);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context, PluginAchieveAdapter pluginAchieveAdapter, long j, long j2) {
        pluginAchieveAdapter.fetchSequenceDataBySportType(context, j, j2, 283, new AchieveCallback() { // from class: owj.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                owj.this.a(context, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void a(Context context, T t) {
        if (njy.b(t, HiHealthData.class)) {
            d(context, (List<HiHealthData>) t);
        }
    }

    private void d(Context context, List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "SkipRecords records from HiHealth is 0! ");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "SkipRecords size is ", Integer.valueOf(list.size()));
        Iterator<HiHealthData> it = list.iterator();
        int iC = 0;
        while (it.hasNext()) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next().getMetaData(), HiTrackMetaData.class);
                int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
                int duplicated = hiTrackMetaData.getDuplicated();
                if (abnormalTrack == 0 && duplicated == 0) {
                    int sportDataSource = hiTrackMetaData.getSportDataSource();
                    if (sportDataSource == 2) {
                        LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "sportDataSource=", Integer.valueOf(sportDataSource));
                    } else {
                        iC += c(hiTrackMetaData);
                    }
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "trackMetaData is error!");
            }
        }
        if (iC > 0) {
            otl otlVarB = otl.b(context);
            LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "computeSkipTrackInfo skip sum ", Integer.valueOf(iC));
            otj.a(context, iC, otlVarB, "C5");
        }
    }

    private int c(HiTrackMetaData hiTrackMetaData) {
        String str = hiTrackMetaData.getExtendTrackMap().get("skipNum");
        if (str != null) {
            return CommonUtil.j(str);
        }
        return 0;
    }

    private void n(final Context context) {
        if (!Utils.o()) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealLocalMedalDataGenerate is !isOversea().");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: owj.10
                @Override // java.lang.Runnable
                public void run() {
                    owj.b(context).l(context);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Context context) {
        PluginAchieveAdapter adapter = oru.a(context).getAdapter();
        if (adapter == null) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealLocalMedalDataGenerate achieveAdapter == null.");
            return;
        }
        long jC = pap.c(false, System.currentTimeMillis());
        LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealLocalMedalDataGenerate startTime == ", 0L);
        d(context, adapter, 0L, jC);
    }

    public void d(Context context) {
        if (e(context, "generateAchieveTime", 43200000L)) {
            return;
        }
        ory.e(context);
    }

    private void d(Context context, PluginAchieveAdapter pluginAchieveAdapter, long j, long j2) {
        pluginAchieveAdapter.readBestStepDayOfYear(context, j, j2, new AchieveCallback() { // from class: owj.9
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, final Object obj) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: owj.9.5
                    @Override // java.lang.Runnable
                    public void run() {
                        owj.this.a(obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, PluginAchieveAdapter pluginAchieveAdapter, long j, long j2) {
        pluginAchieveAdapter.fetchSequenceDataBySportType(context, j, j2, 262, new AchieveCallback() { // from class: owj.6
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                owj.this.e(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void e(T t) {
        if (t instanceof List) {
            try {
                e((List<HiHealthData>) t);
                return;
            } catch (ClassCastException unused) {
                LogUtil.e("PLGACHIEVE_AchieveLocalDataManager", "getTrackListBySwimType data ClassCastException");
                return;
            }
        }
        LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "getTrackListBySwimType data is not list");
    }

    private void e(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "computeSwimTrackInfo() classificationList is null");
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "enter computeSwimTrackInfo");
        HiTrackMetaData hiTrackMetaData = null;
        int i = 0;
        for (HiHealthData hiHealthData : list) {
            try {
                hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            } catch (JsonSyntaxException unused) {
                LogUtil.e("PLGACHIEVE_AchieveLocalDataManager", "JsonSyntaxException.");
            }
            if (hiTrackMetaData != null) {
                if (oxe.d(hiTrackMetaData)) {
                    LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "computeSwimTrackInfo trackDataIsInvalid");
                } else {
                    int totalDistance = hiTrackMetaData.getTotalDistance();
                    LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "computeSwimTrackInfo totalTrackDis ", Integer.valueOf(totalDistance), " timestamp ", Long.valueOf(hiHealthData.getStartTime()));
                    if (!oxe.e(hiTrackMetaData)) {
                        i += totalDistance;
                    }
                }
            }
        }
        if (i >= 1000) {
            otl otlVarB = otl.b(this.f44918a);
            double dC = paw.c(i);
            LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "computeSwimTrackInfo sumSwimDis(KM) ", Double.valueOf(dC));
            otj.a(this.f44918a, dC, otlVarB, "C4");
        }
    }

    public HiTrackMetaData e(String str) {
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
            if (!b(hiTrackMetaData.getAbnormalTrack(), hiTrackMetaData.getDuplicated(), hiTrackMetaData.getSportDataSource())) {
                return hiTrackMetaData;
            }
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "getHiTrackMetaData trackDataIsInvalid!");
            return null;
        } catch (JsonSyntaxException unused) {
            LogUtil.e("PLGACHIEVE_AchieveLocalDataManager", "trackMetaData is error");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(T t) {
        if (!(t instanceof AnnualReportStepResult)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "dealMedalData Class NotFound!");
            return;
        }
        AnnualReportStepResult annualReportStepResult = (AnnualReportStepResult) t;
        otl otlVarB = otl.b(this.f44918a);
        int iC = c(annualReportStepResult.getReachTimeList());
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "dealMedalData reachDays == ", Integer.valueOf(iC));
        if (iC >= 7) {
            otj.a(this.f44918a, iC, otlVarB, "B");
        }
        int totalSteps = annualReportStepResult.getTotalSteps();
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "dealMedalData value == ", Integer.valueOf(totalSteps));
        if (totalSteps >= 10000) {
            otj.a(this.f44918a, totalSteps, otlVarB, TypeParams.SEARCH_CODE);
        }
    }

    public static int c(List<Long> list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i3 == 0) {
                i = 1;
                i2 = 1;
            } else {
                int i4 = i3 - 1;
                if (a(b(list.get(i4).longValue()), b(list.get(i3).longValue())) == 1) {
                    arrayList.add(list.get(i4));
                    i++;
                } else {
                    if (i > i2) {
                        arrayList2.clear();
                        arrayList.add(list.get(i4));
                        arrayList2.addAll(arrayList);
                    } else {
                        i = i2;
                    }
                    arrayList.clear();
                    i2 = i;
                    i = 1;
                }
            }
        }
        if (i <= i2) {
            i = i2;
        }
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "timeReachList == ", arrayList2.toString());
        return i;
    }

    private static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private boolean e(Context context, String str, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strE = osa.e(context, str);
        if (TextUtils.isEmpty(strE)) {
            osa.b(context, str, String.valueOf(jElapsedRealtime));
            return false;
        }
        try {
            long j2 = Long.parseLong(strE);
            if (Math.abs(jElapsedRealtime - j2) <= j) {
                LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "isInterval ", str, " lastTime = ", Long.valueOf(j2), " currentTime = ", Long.valueOf(jElapsedRealtime), " intervalTime < queryTime, return!");
                return true;
            }
            osa.b(context, str, String.valueOf(jElapsedRealtime));
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveLocalDataManager", "isInterval parse exception ");
            return false;
        }
    }

    public void j(Context context) {
        PluginAchieveAdapter adapter = oru.a(context).getAdapter();
        if (adapter == null) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "toReadSingleTrackData achieveAdapter == null.");
            return;
        }
        long jA = a();
        LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "toReadSingleTrackData startTime ==  ", Long.valueOf(jA));
        adapter.readSingleTrackData(context, jA, System.currentTimeMillis(), new AnonymousClass7(new WeakReference(context)));
    }

    /* JADX INFO: renamed from: owj$7, reason: invalid class name */
    class AnonymousClass7 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference f44924b;

        AnonymousClass7(WeakReference weakReference) {
            this.f44924b = weakReference;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, final Object obj) {
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final WeakReference weakReference = this.f44924b;
            threadPoolManagerC.execute(new Runnable() { // from class: owi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44914a.d(weakReference, obj);
                }
            });
        }

        /* synthetic */ void d(WeakReference weakReference, Object obj) {
            Context context = (Context) GeneralUtil.getReferent(weakReference);
            if (context != null) {
                owj.this.b(context, obj);
            } else {
                LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "onResponse: context is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void b(Context context, T t) {
        if (!njy.b(t, HiHealthData.class)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "readSingleTrackData is null");
            return;
        }
        ArrayList<TrackData> arrayListB = b((List<HiHealthData>) t);
        if (njy.e(arrayListB)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "readSingleTrackData no record!");
        } else {
            LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "toReadSingleTrackData sendTrackData size= ", Integer.valueOf(arrayListB.size()));
            OnceMovementReceiver.d(context, arrayListB);
        }
    }

    private ArrayList<TrackData> b(List<HiHealthData> list) {
        ArrayList<TrackData> arrayList = new ArrayList<>(8);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "the size of records from HiHealth is 0! ");
            return arrayList;
        }
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "single records size is ", Integer.valueOf(list.size()));
        for (HiHealthData hiHealthData : list) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
                int duplicated = hiTrackMetaData.getDuplicated();
                if (abnormalTrack != 0 || duplicated != 0) {
                    LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "AbnormalTrack abnormalResult == ", Integer.valueOf(abnormalTrack), "duplicateResult=", Integer.valueOf(duplicated));
                } else {
                    int sportDataSource = hiTrackMetaData.getSportDataSource();
                    if (sportDataSource == 2 || sportDataSource == 3) {
                        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "sportDataSource=", Integer.valueOf(sportDataSource));
                    } else {
                        TrackData trackDataE = e(hiHealthData, hiTrackMetaData);
                        if (trackDataE != null) {
                            arrayList.add(trackDataE);
                            LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "whole data from hihealth studio is*", Float.valueOf(trackDataE.acquireDistance()), " && num*", Integer.valueOf(trackDataE.acquireTrackNum()), Constants.PARAM_SERVER_SPLIT, Integer.valueOf(hiTrackMetaData.getSportType()), " time ", Long.valueOf(hiHealthData.getStartTime()));
                        }
                    }
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("PLGACHIEVE_AchieveLocalDataManager", "trackMetaData is error");
            }
        }
        return arrayList;
    }

    public TrackData e(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
        String str;
        String str2;
        String str3;
        TrackData trackData = new TrackData();
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        if (extendTrackMap != null && extendTrackMap.size() != 0) {
            str = extendTrackMap.get("skipNum");
            str3 = extendTrackMap.get("maxSkippingTimes");
            str2 = extendTrackMap.get("skipSpeed");
        } else {
            str = "";
            str2 = "";
            str3 = str2;
        }
        int sportType = hiTrackMetaData.getSportType();
        int totalDistance = hiTrackMetaData.getTotalDistance();
        trackData.saveDistance(totalDistance * 1.0f);
        trackData.saveTrackTime(hiHealthData.getStartTime());
        trackData.saveType(sportType);
        trackData.saveEndTime(hiHealthData.getEndTime());
        trackData.savePaceMap(hiTrackMetaData.getPaceMap());
        trackData.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
        trackData.saveBestPace(hiTrackMetaData.getBestPace());
        trackData.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        if (sportType == 283) {
            trackData.saveTrackNum(oun.d(str));
            trackData.setMaxSkippingTimes(oun.d(str3));
            trackData.setSkipSpeed(oun.d(str2));
            trackData.setTotalTime(hiTrackMetaData.getTotalTime());
            return trackData;
        }
        if (!e(sportType) || totalDistance <= 0) {
            return null;
        }
        LogUtil.a("PLGACHIEVE_AchieveLocalDataManager", "isValidType");
        return trackData;
    }

    private boolean e(int i) {
        return Arrays.asList(e).contains(Integer.valueOf(i));
    }

    private long a() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, -30);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, -7);
        return calendar.getTimeInMillis();
    }
}
