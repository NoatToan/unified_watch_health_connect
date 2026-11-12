package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwonesdk.datastructure.request.DataType;
import com.huawei.taskplatform.TaskEnum;
import com.huawei.taskplatform.api.TaskPlatformApi;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes33.dex */
public class jyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f39199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile jyc f39200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f39201c;
    private Map<String, Integer> e;
    private int f;
    private BroadcastReceiver g;
    private String h;
    private List<Integer> k;
    private qfj l;
    private List<Integer> n;
    private final Map<String, String> i = new ConcurrentHashMap();
    private final List<Integer> j = new CopyOnWriteArrayList();
    private int d = -1;

    static {
        HashMap map = new HashMap();
        f39201c = map;
        f39199a = new Object();
        map.put("900200007", TaskEnum.ACTIVITY_CALORIES.getTaskId());
        map.put("900200009", TaskEnum.ACTIVITY_HOURS.getTaskId());
        map.put("900200008", TaskEnum.EXERCISE_DURATION.getTaskId());
        map.put("900200006", TaskEnum.STEPS.getTaskId());
    }

    public static jyc c() {
        if (f39200b == null) {
            ReleaseLogUtil.c("R_HealthLifeManager", "getInstance sInstance ", f39200b);
            synchronized (f39199a) {
                ReleaseLogUtil.c("R_HealthLifeManager", "getInstance synchronized sInstance ", f39200b);
                if (f39200b == null) {
                    f39200b = new jyc();
                }
            }
        }
        return f39200b;
    }

    public static void d() {
        jzh.c();
        synchronized (f39199a) {
            ReleaseLogUtil.c("R_HealthLifeManager", "onDestroy sInstance ", f39200b);
            if (f39200b == null) {
                return;
            }
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(f39200b.k, new HiUnSubscribeListener() { // from class: jyl
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.c("R_HealthLifeManager", "onDestroy mSuccessList isSuccess ", Boolean.valueOf(z));
                }
            });
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(f39200b.n, new HiUnSubscribeListener() { // from class: jyk
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.c("R_HealthLifeManager", "onDestroy mRemindSuccessList isSuccess ", Boolean.valueOf(z));
                }
            });
            BroadcastManager.m(f39200b.g);
            f39200b.o();
            f39200b = null;
        }
    }

    private jyc() {
        boolean zT = ffv.t();
        ReleaseLogUtil.c("R_HealthLifeManager", "HealthLifeManager isSupportHealthLife ", Boolean.valueOf(zT));
        if (zT) {
            i();
            k();
            BroadcastManager.a(this.g);
        }
    }

    private void k() {
        if (this.g != null) {
            return;
        }
        this.g = new AnonymousClass5();
    }

    /* JADX INFO: renamed from: jyc$5, reason: invalid class name */
    class AnonymousClass5 extends BroadcastReceiver {
        AnonymousClass5() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("processName");
            boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
            ReleaseLogUtil.c("R_HealthLifeManager", "initProcessBroadcastReceiver processName ", stringExtra, " isRunning ", Boolean.valueOf(booleanExtra), " time ", Long.valueOf(intent.getLongExtra("time", 0L)));
            if (XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra) && booleanExtra) {
                HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(jyc.this.n, new HiUnSubscribeListener() { // from class: jzi
                    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                    public final void onResult(boolean z) {
                        ReleaseLogUtil.c("HealthLifeManager", "initProcessBroadcastReceiver mRemindSuccessList isSuccess ", Boolean.valueOf(z));
                    }
                });
                if (!CollectionUtils.a(jyc.this.n)) {
                    jyc.this.n.clear();
                }
                jyc.this.t();
            }
        }
    }

    public void o() {
        this.i.clear();
        this.l = null;
        this.e = null;
        this.h = "";
        this.f = 0;
        this.d = -1;
    }

    private qfn m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new qfn(b(), DateFormatUtil.a(jCurrentTimeMillis), lsl.q(jCurrentTimeMillis));
    }

    public boolean f() {
        if (!ffv.t()) {
            return false;
        }
        l();
        if (this.d == 0) {
            return false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(b());
        if (!zIsEmpty && jzl.i() <= 0) {
            jzl.b(1);
            ReleaseLogUtil.c("R_HealthLifeManager", "isHealthLife equals show guide page");
        }
        return !zIsEmpty;
    }

    public void c(int i) {
        this.d = i;
        bxp.b().h();
    }

    private void l() {
        if (this.d == -1) {
            this.d = jzl.a();
        }
    }

    public int e() {
        qey qeyVarC;
        if (this.f <= 0 && (qeyVarC = jzl.c()) != null) {
            this.f = qeyVarC.i();
        }
        return this.f;
    }

    public String b() {
        qey qeyVarC;
        if (TextUtils.isEmpty(this.h) && (qeyVarC = jzl.c()) != null) {
            this.h = qeyVarC.h();
        }
        return this.h;
    }

    public final void i() {
        c(true);
    }

    public void c(final boolean z) {
        ReleaseLogUtil.c("R_HealthLifeManager", "init");
        if (ffv.t()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jyq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39222b.e(z);
                }
            });
        }
    }

    /* synthetic */ void e(boolean z) {
        d((ResponseCallback<Boolean>) null);
        b(new ResponseCallback() { // from class: jyx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f39236b.d(i, (List) obj);
            }
        });
        kad.e();
        cee.d();
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            weightApi.scheduleWeightMeasureNextReminder();
        }
        cee.a();
        if (z) {
            bxp.b().h();
        }
    }

    /* synthetic */ void d(int i, List list) {
        LogUtil.b("HealthLifeManager", "init errorCode ", Integer.valueOf(i), " list ", list);
        e(new ResponseCallback() { // from class: jyj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                LogUtil.b("HealthLifeManager", "init resultCode ", Integer.valueOf(i2), " querySchedulesResp ", HiJsonUtil.d((qfj) obj));
            }
        });
    }

    public void d(final ResponseCallback<Boolean> responseCallback) {
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        jzj.c(iA, iA, new ResponseCallback() { // from class: jyw
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f39235c.a(responseCallback, iA, i, (List) obj);
            }
        });
    }

    /* synthetic */ void a(ResponseCallback responseCallback, int i, int i2, List list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HealthLifeManager", "queryHealthLifeVersion list ", list);
            if (responseCallback != null) {
                responseCallback.onResponse(i2, false);
                return;
            }
            return;
        }
        int iD = kad.d(i, list);
        this.d = iD;
        if (responseCallback == null) {
            return;
        }
        responseCallback.onResponse(i2, Boolean.valueOf(iD == 1));
    }

    private void n() {
        if (CollectionUtils.c(kad.a(this.e))) {
            return;
        }
        xkb.c("900300055", new ResponseCallback() { // from class: jyp
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.d(i, (Pair) obj);
            }
        });
    }

    /* synthetic */ void d(int i, Pair pair) {
        LogUtil.b("HealthLifeManager", "queryHealthLifeUserInfo errorCode ", Integer.valueOf(i), " pair ", pair);
        if (pair == null || TextUtils.isEmpty((CharSequence) pair.second)) {
            kad.c((Map<String, Integer>) null);
            return;
        }
        Map<String, Integer> map = (Map) HiJsonUtil.d((String) pair.second, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.healthlife.HealthLifeManager$2
        }.getType());
        this.e = map;
        kad.c(map);
    }

    public void b(ResponseCallback<List<qey>> responseCallback) {
        b(new qev(0, 3, 1), responseCallback);
    }

    public void b(qev qevVar, final ResponseCallback<List<qey>> responseCallback) {
        ReleaseLogUtil.c("R_HealthLifeManager", "queryPlan");
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "queryPlan callback is null");
        } else if (qevVar == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "queryPlan queryPlanReq is null");
            responseCallback.onResponse(-1, Collections.EMPTY_LIST);
        } else {
            ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).queryPlan(qevVar, new ResponseCallback() { // from class: jyy
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f39237c.a(responseCallback, i, (List) obj);
                }
            });
        }
    }

    /* synthetic */ void a(ResponseCallback responseCallback, int i, List list) {
        LogUtil.b("HealthLifeManager", "queryPlan errorCode ", Integer.valueOf(i), " list ", list);
        if (i == 0) {
            this.h = "";
            this.f = 0;
            jzl.a((qey) null);
        }
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HealthLifeManager", "queryPlan list ", list);
            responseCallback.onResponse(i, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qey qeyVar = (qey) it.next();
            if (qeyVar == null) {
                ReleaseLogUtil.d("R_HealthLifeManager", "queryPlan planDetail is null");
            } else if (qeyVar.f() != 1) {
                ReleaseLogUtil.d("R_HealthLifeManager", "queryPlan planDetail ", qeyVar);
            } else {
                this.h = qeyVar.h();
                this.f = qeyVar.i();
                jzl.a(qeyVar);
                break;
            }
        }
        n();
        responseCallback.onResponse(i, list);
    }

    public List<nrh> a(int i, int i2, final ResponseCallback<List<nrh>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "getLeafProgress callback is null");
            return jzl.d();
        }
        int iE = e();
        if (iE <= 0) {
            ReleaseLogUtil.d("R_HealthLifeManager", "getLeafProgress planStartDate ", Integer.valueOf(iE));
            List<nrh> listD = jzl.d();
            responseCallback.onResponse(-1, listD);
            return listD;
        }
        int iC = ccy.c();
        if (iC <= 0) {
            iC = iE;
        }
        final int iMax = Math.max(Math.min(iC, iE), i);
        final int iMin = Math.min(DateFormatUtil.a(System.currentTimeMillis()), i2);
        nqt nqtVar = new nqt();
        nqtVar.a(lsl.r(DateFormatUtil.d(iMax)));
        nqtVar.b(lsl.c(DateFormatUtil.d(iMin)));
        nqtVar.c(Collections.singletonList(new DataType(DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_ACHIEVE.value(), "FOUR_LEAF_ACHIEVEMENT_DATA")));
        final String strD = HiJsonUtil.d(nqtVar);
        nql.d(strD, new nry(), new IBaseResponseCallback() { // from class: jyh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f39217c.d(strD, responseCallback, iMax, iMin, i3, obj);
            }
        });
        return jzl.d();
    }

    /* synthetic */ void d(String str, final ResponseCallback responseCallback, int i, int i2, int i3, Object obj) {
        ReleaseLogUtil.c("R_HealthLifeManager", "getLeafProgress errorCode ", Integer.valueOf(i3), " requestJson ", str);
        if (i3 != 0 || !(obj instanceof String)) {
            List list = (List) HiJsonUtil.d(this.i.get(str), new TypeToken<List<nrh>>() { // from class: com.huawei.healthlife.HealthLifeManager$3
            }.getType());
            if (CollectionUtils.a(list)) {
                ReleaseLogUtil.d("R_HealthLifeManager", "getLeafProgress errorCode ", Integer.valueOf(i3), " object ", obj);
                responseCallback.onResponse(i3, Collections.EMPTY_LIST);
                return;
            } else {
                responseCallback.onResponse(0, list);
                return;
            }
        }
        String str2 = (String) obj;
        if (!TextUtils.isEmpty(str2)) {
            this.i.put(str, str2);
        }
        final List list2 = (List) HiJsonUtil.d(str2, new TypeToken<List<nrh>>() { // from class: com.huawei.healthlife.HealthLifeManager$4
        }.getType());
        final List<Integer> listE = kad.e(i, i2, (List<nrh>) list2);
        ReleaseLogUtil.c("R_HealthLifeManager", "getLeafProgress dateList ", listE);
        if (CollectionUtils.a(listE)) {
            responseCallback.onResponse(i3, list2);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jyv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39232b.b(list2, listE, responseCallback);
                }
            });
        }
    }

    /* synthetic */ void b(List list, List list2, ResponseCallback responseCallback) {
        d((List<nrh>) list, (List<Integer>) list2, (ResponseCallback<List<nrh>>) responseCallback);
    }

    private void d(final List<nrh> list, List<Integer> list2, final ResponseCallback<List<nrh>> responseCallback) {
        jzj.c(list2.get(0).intValue(), list2.get(list2.size() - 1).intValue(), new ResponseCallback() { // from class: jzd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                jyc.d(list, responseCallback, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void d(List list, ResponseCallback responseCallback, int i, List list2) {
        List<Integer> listE = kad.e((List<fer>) list2, 0);
        List<Integer> listE2 = kad.e((List<fer>) list2, 1);
        CountDownLatch countDownLatch = new CountDownLatch(Math.max(listE2.size() + 1, 2));
        kad.c(listE, (List<nrh>) list, countDownLatch);
        kad.b(listE2, list, countDownLatch);
        try {
            ReleaseLogUtil.c("R_HealthLifeManager", "updateArkUiDataList isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.b("R_HealthLifeManager", "updateArkUiDataList exception ", ExceptionUtils.c(e));
        }
        jzl.a((List<nrh>) list);
        responseCallback.onResponse(0, list);
    }

    public qfj g() {
        if (this.l == null) {
            this.l = jzl.f();
        }
        return this.l;
    }

    public void e(int i, List<nrh> list, ResponseCallback<qfj> responseCallback) {
        d(list, new qfn(b(), i, lsl.q(System.currentTimeMillis())), responseCallback);
    }

    public qfj e(ResponseCallback<qfj> responseCallback) {
        return b(Collections.EMPTY_LIST, responseCallback);
    }

    public qfj b(List<String> list, ResponseCallback<qfj> responseCallback) {
        return a("", list, null, m(), responseCallback);
    }

    public qfj d(List<nrh> list, qfn qfnVar, ResponseCallback<qfj> responseCallback) {
        return a("", Collections.EMPTY_LIST, list, qfnVar, responseCallback);
    }

    public qfj a(final String str, final List<String> list, final List<nrh> list2, final qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "querySchedule callback is null");
            return g();
        }
        if (qfnVar == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "querySchedule querySchedulesReq is null");
            responseCallback.onResponse(-1, null);
            return g();
        }
        if (!"gotoHealthLife".equals(str) && !f()) {
            ReleaseLogUtil.d("R_HealthLifeManager", "not health life");
            responseCallback.onResponse(-1, null);
            return g();
        }
        if (TextUtils.isEmpty(qfnVar.a())) {
            qfnVar.a(b());
        }
        ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).querySchedule(qfnVar, new ResponseCallback() { // from class: jyu
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f39230b.d(list, qfnVar, responseCallback, str, list2, i, (qfj) obj);
            }
        });
        return g();
    }

    /* synthetic */ void d(List list, qfn qfnVar, ResponseCallback responseCallback, String str, List list2, int i, qfj qfjVar) {
        ReleaseLogUtil.c("R_HealthLifeManager", "querySchedule errorCode ", Integer.valueOf(i), " taskIdList ", list);
        int iB = qfnVar.b();
        boolean z = DateFormatUtil.a(System.currentTimeMillis()) == iB;
        if (z) {
            this.l = null;
            d(qfjVar);
            jzh.e(qfjVar);
            t();
        }
        if (i != 0 || qfjVar == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "querySchedule errorCode ", Integer.valueOf(i), " querySchedulesResp ", qfjVar);
            responseCallback.onResponse(i, g());
            return;
        }
        int iE = qfjVar.e();
        if (iE != 0) {
            ReleaseLogUtil.d("R_HealthLifeManager", "querySchedule resultCode ", Integer.valueOf(iE));
            responseCallback.onResponse(iE, g());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("date", iB);
        bundle.putString("function", str);
        c(bundle, list, list2, qfjVar, responseCallback);
        if (z) {
            e(qfjVar);
        }
    }

    private void e(qfj qfjVar) {
        String strB = qfjVar.b();
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.d("R_HealthLifeManager", "setScheduleMetadata metadata ", strB);
            return;
        }
        qep qepVar = (qep) HiJsonUtil.d(strB, qep.class);
        if (qepVar == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "setScheduleMetadata metaDataResp is null");
            return;
        }
        qes qesVar = new qes();
        qesVar.a(qepVar.d());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(qesVar);
        qeq qeqVar = new qeq();
        qeqVar.c(arrayList);
        String strD = HiJsonUtil.d(qeqVar);
        jzl.d(strD);
        LogUtil.b("HealthLifeManager", "setScheduleMetadata json ", strD);
    }

    private void d(qfj qfjVar) {
        List<Integer> subscribeTypeList = ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).getSubscribeTypeList(qfjVar);
        if (njy.c(subscribeTypeList, this.j, false)) {
            return;
        }
        if (!CollectionUtils.a(this.k)) {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.k, new HiUnSubscribeListener() { // from class: jze
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.c("R_HealthLifeManager", "subscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        if (CollectionUtils.a(subscribeTypeList)) {
            ReleaseLogUtil.d("R_HealthLifeManager", "subscribeHiHealthData list ", subscribeTypeList, " mLastSubscribeTypeList ", this.j);
            this.j.clear();
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(subscribeTypeList, new b(this));
            ReleaseLogUtil.c("R_HealthLifeManager", "subscribeHiHealthData list ", subscribeTypeList, " mLastSubscribeTypeList ", this.j);
            this.j.clear();
            this.j.addAll(subscribeTypeList);
        }
    }

    private void b(boolean z, qfj qfjVar) {
        if (z) {
            jzl.a(qfjVar);
            this.l = qfjVar;
        }
    }

    public void d(final String str, List<String> list) {
        a(str, list, Collections.EMPTY_LIST, m(), new ResponseCallback() { // from class: jym
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f39219b.c(str, i, (qfj) obj);
            }
        });
    }

    /* synthetic */ void c(String str, int i, qfj qfjVar) {
        ReleaseLogUtil.c("R_HealthLifeManager", "updateSchedule function ", str, " errorCode ", Integer.valueOf(i));
        if ("gotoHealthLife".equals(str)) {
            kbg.d(g());
        }
    }

    private void c(final Bundle bundle, final List<String> list, final List<nrh> list2, final qfj qfjVar, final ResponseCallback<qfj> responseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jza
            @Override // java.lang.Runnable
            public final void run() {
                this.f39241a.d(bundle, list, qfjVar, list2, responseCallback);
            }
        });
    }

    /* synthetic */ void d(final Bundle bundle, final List list, final qfj qfjVar, final List list2, final ResponseCallback responseCallback) {
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        final int i = bundle.getInt("date", iA);
        ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).updateSchedule(i, list, qfjVar, new ResponseCallback() { // from class: jys
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f39224a.d(iA, i, list, list2, qfjVar, responseCallback, bundle, i2, (qfo) obj);
            }
        });
    }

    /* synthetic */ void d(int i, int i2, List list, List list2, qfj qfjVar, ResponseCallback responseCallback, Bundle bundle, int i3, qfo qfoVar) {
        boolean z = i == i2;
        LogUtil.b("HealthLifeManager", "updateSchedule date ", Integer.valueOf(i2), " taskIdList ", list, " arkUiDataList ", list2, " isToday ", Boolean.valueOf(z), " resultCode ", Integer.valueOf(i3), " scheduleResultCreateReq ", HiJsonUtil.d(qfoVar));
        b(z, qfjVar);
        kad.a(i2, (List<String>) list, (List<nrh>) list2, qfjVar, (ResponseCallback<qfj>) responseCallback);
        if (CollectionUtils.a(list)) {
            return;
        }
        c(bundle.getString("function", ""), qfoVar);
    }

    private void c(final String str, final qfo qfoVar) {
        b(qfoVar, new ResponseCallback() { // from class: jzb
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(str, qfoVar, i, (qfr) obj);
            }
        });
    }

    /* synthetic */ void e(String str, qfo qfoVar, int i, qfr qfrVar) {
        LogUtil.b("HealthLifeManager", "updateSchedule function ", str, " scheduleResultCreateReq ", qfoVar, " errorCode ", Integer.valueOf(i), " updateScheduleResp ", HiJsonUtil.d(qfrVar));
        ThreadPoolManager.c().execute(new Runnable() { // from class: jyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f39238a.j();
            }
        });
        if (i == 0 || "createTask".equals(str)) {
            ObserverManagerUtil.e(ObserveLabels.REFRESH_HEALTH_LIFE, new Object[0]);
            kad.a("R_HealthLifeManager", "updateSchedule");
        }
    }

    /* synthetic */ void j() {
        bxp.b().h();
        xkb.a(103L);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(this.j);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
    }

    public void b(final qfo qfoVar, final ResponseCallback<qfr> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateSchedule callback is null");
        } else if (qfoVar == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateSchedule scheduleResultCreateReq is null");
            responseCallback.onResponse(-1, null);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jyi
                @Override // java.lang.Runnable
                public final void run() {
                    ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).updateSchedule(qfoVar, new ResponseCallback() { // from class: jyo
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            jyc.c(responseCallback, i, (qfr) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, qfr qfrVar) {
        LogUtil.b("HealthLifeManager", "updateSchedule errorCode ", Integer.valueOf(i), " updateScheduleResp ", HiJsonUtil.d(qfrVar));
        responseCallback.onResponse(i, qfrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, final String str2) {
        final qfj qfjVarG = g();
        if (qfjVarG == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateTask querySchedulesResp is null");
            return;
        }
        final qfz qfzVarJ = qfjVarG.j(str2);
        if (qfzVarJ == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateTask taskSchedule is null");
        } else {
            qgm.c(str, new IBaseResponseCallback() { // from class: jyt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f39227a.e(qfjVarG, str2, qfzVarJ, i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(qfj qfjVar, String str, qfz qfzVar, int i, Object obj) {
        if (!(obj instanceof Integer)) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateSportTask objData ", obj);
            return;
        }
        String strValueOf = String.valueOf(((Integer) obj).intValue());
        if (strValueOf.equals(qfjVar.e(str))) {
            ReleaseLogUtil.d("R_HealthLifeManager", "goalValue not change");
            return;
        }
        qfu qfuVarA = kbg.a(qfzVar, strValueOf, "sport");
        qfv qfvVar = new qfv();
        qfvVar.b(Collections.singletonList(qfuVarA));
        qfvVar.c(this.h);
        kbg.d(qfvVar, (ResponseCallback<qgc>) new ResponseCallback() { // from class: jyn
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj2) {
                this.d.e(i2, (qgc) obj2);
            }
        });
    }

    /* synthetic */ void e(int i, qgc qgcVar) {
        LogUtil.b("HealthLifeManager", "updateTask errorCode ", Integer.valueOf(i), " queryTasksResp ", qgcVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jyr
            @Override // java.lang.Runnable
            public final void run() {
                this.f39223c.h();
            }
        });
    }

    /* synthetic */ void h() {
        e(new ResponseCallback() { // from class: jzc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ReleaseLogUtil.c("R_HealthLifeManager", "updateSportTask querySchedule status ", Integer.valueOf(i));
            }
        });
    }

    public void b(String str, String str2, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateDietRecord callback is null");
            return;
        }
        qfj qfjVarG = g();
        if (qfjVarG == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateDietRecord querySchedulesResp is null");
            responseCallback.onResponse(-1, "Schedules is null");
            return;
        }
        qfz qfzVarJ = qfjVarG.j(TaskEnum.CALORIES_INTAKE.getTaskId());
        if (qfzVarJ == null) {
            ReleaseLogUtil.d("R_HealthLifeManager", "updateDietRecord taskSchedule is null");
            responseCallback.onResponse(-1, "Schedules is null");
        } else {
            if (!TextUtils.equals(qfjVarG.e(TaskEnum.CALORIES_INTAKE.getTaskId()), str)) {
                qfu qfuVarA = kbg.a(qfzVarJ, str, "diet");
                qfv qfvVar = new qfv();
                qfvVar.b(Collections.singletonList(qfuVarA));
                qfvVar.c(c().b());
                kbg.d(qfvVar, (ResponseCallback<qgc>) new ResponseCallback() { // from class: jyg
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        jyc.e(responseCallback, i, (qgc) obj);
                    }
                });
                return;
            }
            b(Collections.singletonList(TaskEnum.CALORIES_INTAKE.getTaskId()), new ResponseCallback() { // from class: jyf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    jyc.a(responseCallback, i, (qfj) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, qgc qgcVar) {
        LogUtil.b("HealthLifeManager", "updateDietRecord errorCode ", Integer.valueOf(i), " queryTasksResp ", qgcVar);
        responseCallback.onResponse(i, "");
        if (i == 0) {
            kad.a("R_HealthLifeManager", "updateDietRecord");
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, int i, qfj qfjVar) {
        ReleaseLogUtil.c("R_HealthLifeManager", "updateDietRecord status ", Integer.valueOf(i));
        responseCallback.onResponse(0, "");
        kad.a("R_HealthLifeManager", "updateDietRecord");
    }

    static class b implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<jyc> f39202c;

        b(jyc jycVar) {
            this.f39202c = new WeakReference<>(jycVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            jyc jycVar = this.f39202c.get();
            if (jycVar == null) {
                ReleaseLogUtil.d("R_HealthLifeManager", "InnerSubscribeListener onResult manager is null");
                return;
            }
            ReleaseLogUtil.c("R_HealthLifeManager", "InnerSubscribeListener onResult successList ", list, " failList ", list2, " mSuccessList ", jycVar.k);
            if (!CollectionUtils.a(jycVar.k)) {
                HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(jycVar.k, new HiUnSubscribeListener() { // from class: jzg
                    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                    public final void onResult(boolean z) {
                        ReleaseLogUtil.c("R_HealthLifeManager", "InnerSubscribeListener onResult isSuccess ", Boolean.valueOf(z));
                    }
                });
            }
            if (CollectionUtils.a(list)) {
                return;
            }
            jycVar.k = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if ((ArkUIXConstants.INSERT.equals(str) || "latestDataDownload".equals(str) || ArkUIXConstants.DELETE.equals(str)) && 1 != i) {
                jyc jycVar = this.f39202c.get();
                if (jycVar != null) {
                    List<String> taskIdListBySubscribeType = ((TaskPlatformApi) Services.b("TaskPlatform", TaskPlatformApi.class)).getTaskIdListBySubscribeType(jycVar.l, i);
                    ReleaseLogUtil.c("R_HealthLifeManager", "InnerSubscribeListener onChange type ", Integer.valueOf(i), " changeKey ", str, " taskIdList ", taskIdListBySubscribeType);
                    if (CollectionUtils.a(taskIdListBySubscribeType)) {
                        taskIdListBySubscribeType = Collections.singletonList("all");
                    }
                    jycVar.d("InnerSubscribeListener", taskIdListBySubscribeType);
                    return;
                }
                ReleaseLogUtil.d("R_HealthLifeManager", "InnerSubscribeListener onChange manager is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        ReleaseLogUtil.c("R_HealthLifeManager", "subscribeRemindData mRemindSuccessList ", this.n);
        if (CollectionUtils.a(this.n)) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(103);
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE.value()));
            HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new d(this));
        }
    }

    static class d implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<jyc> f39203b;

        d(jyc jycVar) {
            this.f39203b = new WeakReference<>(jycVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            jyc jycVar = this.f39203b.get();
            if (jycVar == null) {
                ReleaseLogUtil.d("R_HealthLifeManager", "RemindInnerSubscribeListener onResult manager is null");
            } else if (!CollectionUtils.a(list)) {
                jycVar.n = list;
            } else {
                ReleaseLogUtil.d("R_HealthLifeManager", "RemindInnerSubscribeListener onResult successList ", list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ReleaseLogUtil.c("R_HealthLifeManager", "RemindInnerSubscribeListener onChange changeKey: ", str, ", type: ", Integer.valueOf(i));
            if (i == 103) {
                if ("900300001".equals(str)) {
                    jyc jycVar = this.f39203b.get();
                    if (jycVar == null) {
                        ReleaseLogUtil.d("R_HealthLifeManager", "RemindInnerSubscribeListener onChange manager is null changeKey ", str);
                        return;
                    }
                    boolean zF = jycVar.f();
                    ReleaseLogUtil.c("R_HealthLifeManager", "RemindInnerSubscribeListener onChange isHealthLife ", Boolean.valueOf(zF));
                    if (zF) {
                        return;
                    }
                    kbg.d(jycVar.g());
                    return;
                }
                if ("900300061".equals(str)) {
                    cee.d();
                    return;
                }
                if (!"900300063".equals(str)) {
                    if (jyc.f39201c.containsKey(str)) {
                        jyc jycVar2 = this.f39203b.get();
                        if (jycVar2 != null) {
                            jycVar2.b(str, (String) jyc.f39201c.get(str));
                            return;
                        } else {
                            ReleaseLogUtil.d("R_HealthLifeManager", "RemindInnerSubscribeListener onChange manager is null changeKey ", str);
                            return;
                        }
                    }
                    if ("900300067".equals(str)) {
                        kad.e();
                        return;
                    }
                    return;
                }
                cee.a();
                return;
            }
            if (i == DicDataTypeUtil.DataType.MEDICATION_RULE.value()) {
                cee.a();
            }
        }
    }
}
