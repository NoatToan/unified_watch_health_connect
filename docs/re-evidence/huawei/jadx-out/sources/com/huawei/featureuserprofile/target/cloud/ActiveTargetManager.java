package com.huawei.featureuserprofile.target.cloud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.FitnessSummaryRecord;
import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.target.cloud.ActiveTargetManager;
import com.huawei.featureuserprofile.target.js.ActiveTargetService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;
import defpackage.cyf;
import defpackage.cym;
import defpackage.cyo;
import defpackage.cyp;
import defpackage.cyr;
import defpackage.cys;
import defpackage.ddv;
import defpackage.gcn;
import defpackage.lon;
import defpackage.lsl;
import defpackage.njy;
import defpackage.ntx;
import defpackage.oet;
import defpackage.ofe;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ActiveTargetManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5717c;
    private final MessageCenterApi d;
    private final RecordApi f;
    private c g;
    private e i;
    private final HealthDataCloudFactory j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f5716b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f5715a = {0, 1, 2, 3, 4, 5, 6, 7, 100, 103, 105, 107, 200, 203, 206, 306};
    private static volatile ActiveTargetManager e = null;

    /* JADX INFO: loaded from: classes6.dex */
    public interface ManagerCallback {
        void onSuccess(cyp cypVar);
    }

    private boolean b(double d, double d2, double d3) {
        if (d2 == 0.0d) {
            return false;
        }
        if (d3 > d) {
            return d2 <= d;
        }
        return d2 >= d;
    }

    private ActiveTargetManager() {
        this.f5717c = "";
        LogUtil.a("ActiveTargetManager", "ActiveTargetManager");
        this.j = new HealthDataCloudFactory(BaseApplication.b());
        this.f5717c = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        this.f = (RecordApi) Services.b("CoursePlanService", RecordApi.class);
        this.d = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
    }

    public static ActiveTargetManager c() {
        if (e == null) {
            synchronized (f5716b) {
                if (e == null) {
                    e = new ActiveTargetManager();
                }
            }
        }
        return e;
    }

    public boolean e() {
        if (Utils.o() || CommonUtil.ca()) {
            return false;
        }
        String strD = lon.c().d("status_show_active_target");
        LogUtil.a("ActiveTargetManager", "isActiveTargetSwitchOpen , support = ", strD);
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        if (this.g == null) {
            c cVar = new c();
            this.g = cVar;
            ObserverManagerUtil.d(cVar, "observer_sport_list_data_change");
        }
        if ("0".equals(strD)) {
            return true;
        }
        return !CommonUtil.bu() && "1".equals(strD);
    }

    public void b(Context context) {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?from=1");
        builder.addCustomizeJsModule(ArkUIJsApi.MODEL, ddv.b().getCommonJsModule(ArkUIJsApi.MODEL));
        H5ProServiceManager.getInstance().registerService(ActiveTargetService.class);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.my-annual-flag", builder);
    }

    public void c(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("ActiveTargetManager", "enter getActiveTargetStatus");
        ThreadPoolManager.c().execute(new Runnable() { // from class: cyn
            @Override // java.lang.Runnable
            public final void run() {
                this.f31498b.e(iBaseResponseCallback);
            }
        });
    }

    public /* synthetic */ void e(final IBaseResponseCallback iBaseResponseCallback) {
        cym cymVar = new cym();
        cymVar.e("2");
        oet.d().c(cymVar.getUrl(), this.j.getHeaders(), ofe.c(this.j.getBody(cymVar)), cyo.class, new ResultCallback<cyo>() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(cyo cyoVar) {
                ReleaseLogUtil.d("R_ActiveTargetManager", "getActiveTargetStatus onSuccess");
                LogUtil.a("ActiveTargetManager", "getActiveTargetStatus data is ", cyoVar);
                ActiveTargetManager.this.a(cyoVar, iBaseResponseCallback);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("R_ActiveTargetManager", "getActiveTargetStatus throwable ", th.getMessage());
                iBaseResponseCallback.a(-1, -1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(cyo cyoVar, IBaseResponseCallback iBaseResponseCallback) {
        List<cyp> listE = cyoVar.e();
        int iMax = -1;
        if (!njy.e(listE)) {
            for (cyp cypVar : listE) {
                if (c(cypVar)) {
                    iMax = Math.max(0, iMax) + (cypVar.j() == 0 ? 1 : 0);
                }
            }
        }
        iBaseResponseCallback.a(0, Integer.valueOf(iMax));
    }

    public boolean d() {
        int i = 0;
        while (true) {
            int[] iArr = f5715a;
            if (i < iArr.length) {
                String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(iArr[i]));
                LogUtil.a("ActiveTargetManager", f(iArr[i]), ", value = ", strE);
                if (ParamConstants.CallbackMethod.ON_SHOW.equals(strE)) {
                    return true;
                }
                i++;
            } else {
                return ParamConstants.CallbackMethod.ON_SHOW.equals(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), "key_target_red_need_show"));
            }
        }
    }

    public void b() {
        Context contextB = BaseApplication.b();
        int i = 0;
        while (true) {
            int[] iArr = f5715a;
            if (i >= iArr.length) {
                break;
            }
            if (ParamConstants.CallbackMethod.ON_SHOW.equals(SharedPreferenceManager.e(contextB, Integer.toString(10051), f(iArr[i])))) {
                LogUtil.a("ActiveTargetManager", f(iArr[i]), ", value = no");
                SharedPreferenceManager.e(contextB, Integer.toString(10051), f(iArr[i]), "no", new StorageParams());
            }
            i++;
        }
        if (ParamConstants.CallbackMethod.ON_SHOW.equals(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), "key_target_red_need_show"))) {
            LogUtil.a("ActiveTargetManager", "key_target_red_need_show value = no");
            SharedPreferenceManager.e(contextB, Integer.toString(10051), "key_target_red_need_show", "no", new StorageParams());
        }
    }

    public void j() {
        LogUtil.a("ActiveTargetManager", "enter updateActiveTargets");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.3
            @Override // java.lang.Runnable
            public void run() {
                cym cymVar = new cym();
                cymVar.e("2");
                oet.d().c(cymVar.getUrl(), ActiveTargetManager.this.j.getHeaders(), ofe.c(ActiveTargetManager.this.j.getBody(cymVar)), cyo.class, new ResultCallback<cyo>() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.3.5
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(cyo cyoVar) {
                        ReleaseLogUtil.d("R_ActiveTargetManager", "updateActiveTargets success");
                        LogUtil.a("ActiveTargetManager", "updateActiveTargets data is ", cyoVar);
                        List<cyp> listE = cyoVar.e();
                        if (njy.e(listE)) {
                            ActiveTargetManager.this.g();
                        } else {
                            ActiveTargetManager.this.e(listE);
                        }
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        ReleaseLogUtil.e("R_ActiveTargetManager", "updateActiveTargets throwable ", th.getMessage());
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Context contextB = BaseApplication.b();
        if (TextUtils.isEmpty(SharedPreferenceManager.e(contextB, Integer.toString(10051), "key_target_red_need_show"))) {
            SharedPreferenceManager.e(contextB, Integer.toString(10051), "key_target_red_need_show", ParamConstants.CallbackMethod.ON_SHOW, new StorageParams());
        }
    }

    public void a(final ResultCallback<cyo> resultCallback) {
        ReleaseLogUtil.d("R_ActiveTargetManager", "enter getActiveTargets");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.4
            @Override // java.lang.Runnable
            public void run() {
                cym cymVar = new cym();
                cymVar.e("2");
                oet.d().c(cymVar.getUrl(), ActiveTargetManager.this.j.getHeaders(), ofe.c(ActiveTargetManager.this.j.getBody(cymVar)), cyo.class, new ResultCallback<cyo>() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.4.3
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(cyo cyoVar) {
                        ReleaseLogUtil.d("R_ActiveTargetManager", "getActiveTargets onSuccess");
                        List<cyp> listE = cyoVar.e();
                        if (njy.b(listE)) {
                            cyoVar.c(ActiveTargetManager.this.e(listE));
                        }
                        LogUtil.a("ActiveTargetManager", "data is ", cyoVar);
                        resultCallback.onSuccess(cyoVar);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        ReleaseLogUtil.d("R_ActiveTargetManager", "getActiveTargets onFailure");
                        resultCallback.onFailure(th);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<cyp> e(List<cyp> list) {
        final List<cyp> listSynchronizedList = Collections.synchronizedList(new ArrayList(16));
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        a(list, new ManagerCallback() { // from class: cye
            @Override // com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.ManagerCallback
            public final void onSuccess(cyp cypVar) {
                ActiveTargetManager.c(listSynchronizedList, countDownLatch, cypVar);
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            LogUtil.e("ActiveTargetManager", "updateCompleteValue e ", LogAnonymous.b(e2));
        }
        c(listSynchronizedList);
        return listSynchronizedList;
    }

    public static /* synthetic */ void c(List list, CountDownLatch countDownLatch, cyp cypVar) {
        list.add(cypVar);
        countDownLatch.countDown();
    }

    private void c(List<cyp> list) {
        if (TextUtils.isEmpty(this.f5717c)) {
            this.f5717c = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        }
        final String str = this.f5717c + "is_delete_wrong_target_message_finished";
        if (SharedPreferenceManager.b(Integer.toString(10051), str, false)) {
            LogUtil.a("ActiveTargetManager", "delete wrong message finished");
            return;
        }
        if (njy.e(list)) {
            LogUtil.a("ActiveTargetManager", "list is null");
            SharedPreferenceManager.a(Integer.toString(10051), str, true);
            return;
        }
        HashSet hashSet = new HashSet(Arrays.asList(0, 1, 2, 3, 4, 5));
        for (cyp cypVar : list) {
            if (c(cypVar) && cypVar.j() == 1) {
                hashSet.remove(Integer.valueOf(cypVar.d()));
            }
        }
        if (njy.e(hashSet)) {
            LogUtil.a("ActiveTargetManager", "deleteTypeSet is null");
            SharedPreferenceManager.a(Integer.toString(10051), str, true);
            return;
        }
        final HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(iIntValue), "", new StorageParams());
            hashSet2.add(e(iIntValue));
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: cyi
            @Override // java.lang.Runnable
            public final void run() {
                this.f31493c.a(str, hashSet2);
            }
        });
    }

    public /* synthetic */ void a(String str, HashSet hashSet) {
        List<MessageObject> messages = this.d.getMessages(String.valueOf(100), MessageConstant.ACTIVE_TARGET_TYPE);
        if (njy.e(messages)) {
            LogUtil.a("ActiveTargetManager", "deleteWrongMessage messageList is empty");
            SharedPreferenceManager.a(Integer.toString(10051), str, true);
            return;
        }
        for (MessageObject messageObject : messages) {
            if (hashSet.contains(messageObject.getMsgContent()) && lsl.i(messageObject.getCreateTime(), System.currentTimeMillis())) {
                LogUtil.a("ActiveTargetManager", "deleteWrongMessage delete message is ", Boolean.valueOf(this.d.deleteMessage(messageObject.getMsgId())));
            }
        }
        SharedPreferenceManager.a(Integer.toString(10051), str, true);
    }

    private void a(List<cyp> list, ManagerCallback managerCallback) {
        for (cyp cypVar : list) {
            if (!c(cypVar)) {
                if (cypVar.d() == 1 && lsl.ab(cypVar.f(), lsl.a(cypVar.i())) == 2022) {
                    d(cypVar, managerCallback);
                } else {
                    LogUtil.a("ActiveTargetManager", "not current year goalType is ", Integer.valueOf(cypVar.d()), ", status is ", Integer.valueOf(cypVar.j()));
                    managerCallback.onSuccess(cypVar);
                }
            } else if (cypVar.j() == 0) {
                d(cypVar, managerCallback);
            } else if (cypVar.j() == 1) {
                d(cypVar, managerCallback);
            } else {
                LogUtil.a("ActiveTargetManager", "no match patch Type is ", Integer.valueOf(cypVar.d()), ", status is ", Integer.valueOf(cypVar.j()));
                managerCallback.onSuccess(cypVar);
            }
        }
    }

    private void d(cyp cypVar, ManagerCallback managerCallback) {
        int iD = cypVar.d();
        if (iD != 0) {
            if (iD == 1) {
                a(cypVar, managerCallback);
                return;
            }
            if (iD != 2 && iD != 3) {
                if (iD == 4) {
                    b(cypVar, managerCallback);
                    return;
                } else if (iD != 5) {
                    LogUtil.j("ActiveTargetManager", "not support");
                    managerCallback.onSuccess(cypVar);
                    return;
                }
            }
        }
        c(cypVar, b(cypVar.d()), managerCallback);
    }

    private void a(cyp cypVar, ManagerCallback managerCallback) {
        final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        final AtomicReference atomicReference = new AtomicReference(Double.valueOf(0.0d));
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        e(cypVar.f(), cypVar.e(), new ManagerCallback() { // from class: cyg
            @Override // com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.ManagerCallback
            public final void onSuccess(cyp cypVar2) {
                ActiveTargetManager.e(copyOnWriteArrayList, atomicReference, countDownLatch, cypVar2);
            }
        });
        b(lsl.d(cypVar.f(), lsl.a(cypVar.i()), TimeZone.getDefault()), lsl.d(cypVar.e(), lsl.a(cypVar.i()), TimeZone.getDefault()), new AnonymousClass10(copyOnWriteArrayList, atomicReference, countDownLatch));
        try {
            LogUtil.a("ActiveTargetManager", "readLocalFitnessData isOnTime:", Boolean.valueOf(countDownLatch.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.e("ActiveTargetManager", "readLocalFitnessData exception ", LogAnonymous.b(e2));
        }
        double dDoubleValue = ((Double) atomicReference.get()).doubleValue() / 60000.0d;
        List<Long> listD = d(copyOnWriteArrayList);
        b(cypVar, dDoubleValue);
        cypVar.d(dDoubleValue);
        cypVar.e(listD);
        managerCallback.onSuccess(cypVar);
        a(cypVar, dDoubleValue);
    }

    public static /* synthetic */ void e(List list, AtomicReference atomicReference, CountDownLatch countDownLatch, cyp cypVar) {
        list.addAll(cypVar.g());
        atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + cypVar.c()));
        countDownLatch.countDown();
    }

    /* JADX INFO: renamed from: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager$10, reason: invalid class name */
    public class AnonymousClass10 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f5719a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f5721c;
        final /* synthetic */ CountDownLatch e;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass10(List list, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f5719a = list;
            this.f5721c = atomicReference;
            this.e = countDownLatch;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ActiveTargetManager activeTargetManager = ActiveTargetManager.this;
            final List list2 = this.f5719a;
            final AtomicReference atomicReference = this.f5721c;
            final CountDownLatch countDownLatch = this.e;
            activeTargetManager.e(list, new ManagerCallback() { // from class: cyk
                @Override // com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.ManagerCallback
                public final void onSuccess(cyp cypVar) {
                    ActiveTargetManager.AnonymousClass10.a(list2, atomicReference, countDownLatch, cypVar);
                }
            });
        }

        public static /* synthetic */ void a(List list, AtomicReference atomicReference, CountDownLatch countDownLatch, cyp cypVar) {
            list.addAll(cypVar.g());
            atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + cypVar.c()));
            countDownLatch.countDown();
        }
    }

    private List<Long> d(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (!arrayList.contains(l)) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    private void e(long j, long j2, final ManagerCallback managerCallback) {
        this.f.acquireSummaryFitnessRecord(new ntx.d().b(j).d(Math.min(System.currentTimeMillis(), j2)).d(3).a(), new IBaseResponseCallback() { // from class: cya
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(managerCallback, i, obj);
            }
        });
    }

    public /* synthetic */ void a(ManagerCallback managerCallback, int i, Object obj) {
        cyp cypVar = new cyp();
        if (obj == null) {
            LogUtil.j("ActiveTargetManager", "parsingFitnessData objectData is null");
            managerCallback.onSuccess(a(cypVar));
            return;
        }
        if (!njy.b(obj, FitnessTrackRecord.class)) {
            LogUtil.j("ActiveTargetManager", "objectData is not match FitnessTrackRecord");
            managerCallback.onSuccess(a(cypVar));
            return;
        }
        List<FitnessTrackRecord> list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("ActiveTargetManager", "records is empty");
            managerCallback.onSuccess(a(cypVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        double dAcquireSumExerciseTime = 0.0d;
        for (FitnessTrackRecord fitnessTrackRecord : list) {
            arrayList.add(Long.valueOf(fitnessTrackRecord.acquireMonthZeroTime()));
            dAcquireSumExerciseTime += fitnessTrackRecord.acquireSumExerciseTime();
        }
        LogUtil.a("ActiveTargetManager", "sumTime is ", Double.valueOf(dAcquireSumExerciseTime));
        cypVar.d(dAcquireSumExerciseTime);
        cypVar.e(arrayList);
        managerCallback.onSuccess(cypVar);
    }

    private void c(final cyp cypVar, int i, final ManagerCallback managerCallback) {
        c(lsl.d(cypVar.f(), lsl.a(cypVar.i()), TimeZone.getDefault()), lsl.d(cypVar.e(), lsl.a(cypVar.i()), TimeZone.getDefault()), i, new HiAggregateListener() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.6
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                LogUtil.a("ActiveTargetManager", "readLocalData datas errorCode=", Integer.valueOf(i2));
                ActiveTargetManager.this.a(list, cypVar, managerCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, cyp cypVar, ManagerCallback managerCallback) {
        if (njy.e(list)) {
            LogUtil.a("ActiveTargetManager", "parsingData is empty");
            e(cypVar, managerCallback);
            return;
        }
        LogUtil.a("ActiveTargetManager", "parsingData datas size=", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList();
        double d = 0.0d;
        for (HiHealthData hiHealthData : list) {
            arrayList.add(Long.valueOf(hiHealthData.getStartTime()));
            d += hiHealthData.getDouble("Sum");
        }
        if (cypVar.d() == 0 || cypVar.d() == 3 || cypVar.d() == 5) {
            d /= 1000.0d;
        }
        LogUtil.a("ActiveTargetManager", "distance is ", Double.valueOf(d), ", goal type is ", Integer.valueOf(cypVar.d()));
        b(cypVar, d);
        cypVar.d(d);
        cypVar.e(arrayList);
        managerCallback.onSuccess(cypVar);
        a(cypVar, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, ManagerCallback managerCallback) {
        cyp cypVar = new cyp();
        if (njy.e(list)) {
            LogUtil.a("ActiveTargetManager", "parsingFitnessData is empty");
            managerCallback.onSuccess(a(cypVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        double d = 0.0d;
        for (HiHealthData hiHealthData : list) {
            arrayList.add(Long.valueOf(hiHealthData.getStartTime()));
            d += hiHealthData.getDouble("duration_sum");
        }
        LogUtil.a("ActiveTargetManager", "sumTime is ", Double.valueOf(d));
        cypVar.e(arrayList);
        cypVar.d(d);
        managerCallback.onSuccess(cypVar);
    }

    private void b(cyp cypVar, double d) {
        int iD = cypVar.d();
        if (iD != 4 ? d >= cypVar.b() : c(cypVar, d)) {
            cypVar.c(1);
            d(cypVar);
        } else {
            if (!c(cypVar)) {
                cypVar.c(2);
                return;
            }
            if (cypVar.j() == 1) {
                LogUtil.a("ActiveTargetManager", "after delete sport data, remove message, old goal:", cypVar.toString());
                SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(iD), "", new StorageParams());
                a(iD);
            }
            cypVar.c(0);
            LogUtil.a("ActiveTargetManager", "updateActiveStatus status is doing");
        }
    }

    private void b(final cyp cypVar, final ManagerCallback managerCallback) {
        e(lsl.d(cypVar.f(), lsl.a(cypVar.i()), TimeZone.getDefault()), lsl.d(cypVar.e(), lsl.a(cypVar.i()), TimeZone.getDefault()), new HiAggregateListener() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.8
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("ActiveTargetManager", "readWeightData errorCode=", Integer.valueOf(i));
                ActiveTargetManager.this.c(list, cypVar, managerCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list, cyp cypVar, ManagerCallback managerCallback) {
        if (njy.e(list)) {
            LogUtil.j("ActiveTargetManager", "parsingWeightData is empty");
            e(cypVar, managerCallback);
            return;
        }
        LogUtil.a("ActiveTargetManager", "parsingWeightData datas size:", Integer.valueOf(list.size()));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (c(hiHealthData.getDouble("bodyWeight"))) {
                arrayList.add(hiHealthData);
                hashSet.add(Long.valueOf(lsl.r(hiHealthData.getStartTime())));
            }
        }
        double d = ((HiHealthData) arrayList.get(arrayList.size() - 1)).getDouble("bodyWeight");
        LogUtil.a("ActiveTargetManager", "parsingWeightData lastWeight:", Double.valueOf(d), " last data time:", Long.valueOf(((HiHealthData) arrayList.get(arrayList.size() - 1)).getStartTime()));
        b(cypVar, d);
        cypVar.d(d);
        cypVar.e(new ArrayList(hashSet));
        managerCallback.onSuccess(cypVar);
        a(cypVar, d);
    }

    private boolean c(double d) {
        return Double.compare(d, 0.0d) > 0 && Double.compare(d, 250.0d) <= 0;
    }

    private cyp a(cyp cypVar) {
        cypVar.d(0.0d);
        cypVar.e(new ArrayList());
        if (c(cypVar)) {
            cypVar.c(0);
        }
        return cypVar;
    }

    private void e(cyp cypVar, ManagerCallback managerCallback) {
        int iJ = cypVar.j();
        double dC = cypVar.c();
        managerCallback.onSuccess(a(cypVar));
        if (iJ == 1 || dC >= 0.0d) {
            a(cypVar, 0.0d);
        }
        int iD = cypVar.d();
        if (iJ == 1) {
            LogUtil.a("ActiveTargetManager", "processNoDataList, remove message, old goal:", cypVar.toString());
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(iD), "", new StorageParams());
            a(iD);
        }
    }

    private void a(cyp cypVar, double d) {
        cys cysVar = new cys();
        cysVar.a(cypVar.h());
        cysVar.d(d);
        cysVar.b(cypVar.g());
        cysVar.a(cypVar.j());
        LogUtil.a("ActiveTargetManager", "parsingData updateGoal is ", cysVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cysVar);
        d(arrayList, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.9
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                ReleaseLogUtil.d("R_ActiveTargetManager", "updateTargetToCloud success");
                LogUtil.a("ActiveTargetManager", "data is ", cloudCommonReponse);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("R_ActiveTargetManager", "updateTargetToCloud throwable is ", th);
            }
        });
    }

    private boolean c(cyp cypVar, double d) {
        double dA = cypVar.a();
        double dB = cypVar.b();
        double dB2 = cypVar.b();
        if (dA > dB) {
            return d <= dB2;
        }
        return d >= dB2;
    }

    private void d(cyp cypVar) {
        if (!c(cypVar)) {
            LogUtil.j("ActiveTargetManager", "Not current year, don't show point or message");
            return;
        }
        final int iD = cypVar.d();
        LogUtil.a("ActiveTargetManager", "updateShowSharePreference, goalType:", Integer.valueOf(iD));
        ThreadPoolManager.c().b("ActiveTargetManager" + iD, new Runnable() { // from class: cyj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(iD);
            }
        });
    }

    public /* synthetic */ void d(int i) {
        Context contextB = BaseApplication.b();
        if (TextUtils.isEmpty(SharedPreferenceManager.e(contextB, Integer.toString(10051), f(i)))) {
            LogUtil.a("ActiveTargetManager", "updateShowSharePreference serialExecute, goalType:", Integer.valueOf(i));
            SharedPreferenceManager.e(contextB, Integer.toString(10051), f(i), ParamConstants.CallbackMethod.ON_SHOW, new StorageParams());
            h(i);
        }
    }

    private void h(int i) {
        LogUtil.a("ActiveTargetManager", "sendMessage goalType is ", Integer.valueOf(i));
        if (TextUtils.isEmpty(this.f5717c)) {
            this.f5717c = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        }
        Resources resources = BaseApplication.b().getResources();
        MessageObject messageObject = new MessageObject();
        messageObject.setModule(String.valueOf(100));
        messageObject.setType(MessageConstant.ACTIVE_TARGET_TYPE);
        messageObject.setMsgType(1);
        messageObject.setPosition(1);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(this.f5717c);
        messageObject.setMsgContent(e(i));
        messageObject.setMsgFrom(String.valueOf(i));
        String string = resources.getString(R.string.IDS_message_achieve_target);
        messageObject.setMsgTitle(string);
        messageObject.setMetadata(string);
        messageObject.setExpireTime(lsl.d(System.currentTimeMillis()));
        messageObject.setReadFlag(0);
        messageObject.setDetailUri("messagecenter://activeTarget");
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setMsgId(this.d.getMessageId(String.valueOf(100), MessageConstant.ACTIVE_TARGET_TYPE));
        this.d.insertMessage(messageObject);
    }

    private String e(int i) {
        Resources resources = BaseApplication.b().getResources();
        if (i != 100) {
            if (i != 103) {
                if (i != 105) {
                    if (i != 107) {
                        if (i != 200) {
                            if (i != 203) {
                                if (i != 206 && i != 306) {
                                    switch (i) {
                                        case 0:
                                            break;
                                        case 1:
                                            return resources.getString(R.string.IDS_active_target_fitness);
                                        case 2:
                                            return resources.getString(R.string.IDS_active_target_step);
                                        case 3:
                                            break;
                                        case 4:
                                            return resources.getString(R.string.IDS_active_target_weight);
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        case 7:
                                            break;
                                        default:
                                            LogUtil.j("ActiveTargetManager", "getMsgContent goalType is other");
                                            return "";
                                    }
                                }
                                return resources.getString(R.string.IDS_active_target_golf);
                            }
                        }
                    }
                    return resources.getString(R.string.IDS_active_target_skip);
                }
                return resources.getString(R.string.IDS_active_target_swim);
            }
            return resources.getString(R.string.IDS_active_target_ride);
        }
        return resources.getString(R.string.IDS_active_target_run);
    }

    private String f(int i) {
        if (TextUtils.isEmpty(this.f5717c)) {
            this.f5717c = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        }
        return this.f5717c + "key_target_red_need_show" + lsl.ad(System.currentTimeMillis()) + i;
    }

    private void d(final List<cys> list, final ResultCallback<CloudCommonReponse> resultCallback) {
        LogUtil.a("ActiveTargetManager", "enter updateActiveTarget");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.7
            @Override // java.lang.Runnable
            public void run() {
                cyr cyrVar = new cyr();
                cyrVar.e(list);
                oet.d().c(cyrVar.getUrl(), ActiveTargetManager.this.j.getHeaders(), ofe.c(ActiveTargetManager.this.j.getBody(cyrVar)), CloudCommonReponse.class, resultCallback);
            }
        });
    }

    public void a(final int i, final ActiveTargetService.ActiveTargetsCallback activeTargetsCallback) {
        long jAc = lsl.ac(System.currentTimeMillis());
        long jH = lsl.h(System.currentTimeMillis());
        if (i != 0) {
            if (i == 1) {
                d(jAc, jH, activeTargetsCallback);
                return;
            } else if (i != 2 && i != 3) {
                if (i == 4) {
                    e(jAc, jH, new HiAggregateListener() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.1
                        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                        public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
                        }

                        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
                        public void onResult(List<HiHealthData> list, int i2, int i3) {
                            ActiveTargetManager.this.e(list, activeTargetsCallback);
                        }
                    });
                    return;
                } else if (i != 5) {
                    return;
                }
            }
        }
        c(jAc, jH, b(i), new HiAggregateListener() { // from class: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.13
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                ActiveTargetManager.this.a(i, list, activeTargetsCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, List<HiHealthData> list, ActiveTargetService.ActiveTargetsCallback activeTargetsCallback) {
        double d = 0.0d;
        if (njy.e(list)) {
            LogUtil.j("ActiveTargetManager", "parsingData is empty");
            activeTargetsCallback.onSuccess(Double.valueOf(0.0d));
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            d += it.next().getDouble("Sum");
        }
        if (i == 0 || i == 3 || i == 5) {
            d /= 1000.0d;
        }
        LogUtil.a("ActiveTargetManager", "parsingTotalData sum:", Double.valueOf(d));
        activeTargetsCallback.onSuccess(Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, ActiveTargetService.ActiveTargetsCallback activeTargetsCallback) {
        double d = 0.0d;
        if (njy.e(list)) {
            LogUtil.j("ActiveTargetManager", "parsingLastWeightData is empty");
            activeTargetsCallback.onSuccess(Double.valueOf(0.0d));
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            double d2 = list.get(size).getDouble("bodyWeight");
            if (c(d2)) {
                d = d2;
                break;
            }
        }
        LogUtil.a("ActiveTargetManager", "parsingLastWeightData lastWeight:", Double.valueOf(d));
        activeTargetsCallback.onSuccess(Double.valueOf(d));
    }

    private void d(long j, long j2, ActiveTargetService.ActiveTargetsCallback activeTargetsCallback) {
        final AtomicReference atomicReference = new AtomicReference(Double.valueOf(0.0d));
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        this.f.acquireSummaryFitnessRecord(j, j2, new IBaseResponseCallback() { // from class: cyd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ActiveTargetManager.c(atomicReference, countDownLatch, i, obj);
            }
        });
        b(j, j2, new AnonymousClass5(atomicReference, countDownLatch));
        try {
            LogUtil.a("ActiveTargetManager", "getLastYearFitnessData isOnTime:", Boolean.valueOf(countDownLatch.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException e2) {
            LogUtil.e("ActiveTargetManager", "getLastYearFitnessData exception ", LogAnonymous.b(e2));
        }
        activeTargetsCallback.onSuccess(Double.valueOf(((Double) atomicReference.get()).doubleValue() / 60000.0d));
    }

    public static /* synthetic */ void c(AtomicReference atomicReference, CountDownLatch countDownLatch, int i, Object obj) {
        FitnessSummaryRecord fitnessSummaryRecord = obj instanceof FitnessSummaryRecord ? (FitnessSummaryRecord) obj : null;
        if (fitnessSummaryRecord != null) {
            LogUtil.a("ActiveTargetManager", "record.acquireRecordsSumTime() :", Long.valueOf(fitnessSummaryRecord.acquireRecordsSumTime()));
            atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + fitnessSummaryRecord.acquireRecordsSumTime()));
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: renamed from: com.huawei.featureuserprofile.target.cloud.ActiveTargetManager$5, reason: invalid class name */
    public class AnonymousClass5 implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f5728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f5729b;

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        }

        AnonymousClass5(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f5728a = atomicReference;
            this.f5729b = countDownLatch;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            ActiveTargetManager activeTargetManager = ActiveTargetManager.this;
            final AtomicReference atomicReference = this.f5728a;
            final CountDownLatch countDownLatch = this.f5729b;
            activeTargetManager.e(list, new ManagerCallback() { // from class: cyl
                @Override // com.huawei.featureuserprofile.target.cloud.ActiveTargetManager.ManagerCallback
                public final void onSuccess(cyp cypVar) {
                    ActiveTargetManager.AnonymousClass5.c(atomicReference, countDownLatch, cypVar);
                }
            });
        }

        public static /* synthetic */ void c(AtomicReference atomicReference, CountDownLatch countDownLatch, cyp cypVar) {
            atomicReference.set(Double.valueOf(((Double) atomicReference.get()).doubleValue() + cypVar.c()));
            countDownLatch.countDown();
        }
    }

    private void b(long j, long j2, HiAggregateListener hiAggregateListener) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"duration_sum"});
        hiSportStatDataAggregateOption.setType(new int[]{4});
        hiSportStatDataAggregateOption.setAggregateType(0);
        hiSportStatDataAggregateOption.setHiHealthTypes(h());
        hiSportStatDataAggregateOption.setTimeRange(j, j2);
        hiSportStatDataAggregateOption.setGroupUnitType(3);
        HiHealthManager.d(BaseApplication.b()).aggregateSportStatData(hiSportStatDataAggregateOption, hiAggregateListener);
    }

    private void c(long j, long j2, int i, HiAggregateListener hiAggregateListener) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setReadType(0);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Sum"});
        hiSportStatDataAggregateOption.setType(new int[]{i});
        hiSportStatDataAggregateOption.setAggregateType(0);
        hiSportStatDataAggregateOption.setTimeRange(j, j2);
        HiHealthManager.d(BaseApplication.b()).aggregateSportStatData(hiSportStatDataAggregateOption, hiAggregateListener);
    }

    private void e(long j, long j2, HiAggregateListener hiAggregateListener) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setConstantsKey(new String[]{"Sum"});
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setFilter("NULL");
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, hiAggregateListener);
    }

    private int b(int i) {
        if (i == 0) {
            return 42102;
        }
        if (i == 5) {
            return 42202;
        }
        if (i == 2) {
            return 40002;
        }
        if (i == 3) {
            return 42152;
        }
        LogUtil.d("ActiveTargetManager", "getDataType not sport type");
        return i;
    }

    public void e(int i, double d, double d2, double d3) {
        if (i != 4 ? d2 < d : !b(d, d2, d3)) {
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(i), "", new StorageParams());
            a(i);
        } else if (TextUtils.equals(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(i)), "")) {
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10051), f(i), ParamConstants.CallbackMethod.ON_SHOW, new StorageParams());
            h(i);
        }
    }

    private void a(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: cyh
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        List<MessageObject> messages = this.d.getMessages(String.valueOf(100), MessageConstant.ACTIVE_TARGET_TYPE);
        if (njy.e(messages)) {
            LogUtil.a("ActiveTargetManager", "deleteMessage messageList is empty");
            return;
        }
        for (MessageObject messageObject : messages) {
            if (e(i).equals(messageObject.getMsgContent()) && TextUtils.equals(String.valueOf(i), messageObject.getMsgFrom()) && lsl.i(messageObject.getCreateTime(), System.currentTimeMillis())) {
                LogUtil.a("ActiveTargetManager", "deleteMessage delete message is ", Boolean.valueOf(this.d.deleteMessage(messageObject.getMsgId())));
            }
        }
    }

    private int[] h() {
        List<Integer> fitnessSportTypeList = gcn.c().getFitnessSportTypeList("FITNESS_SPORT");
        fitnessSportTypeList.add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT));
        int[] iArr = new int[fitnessSportTypeList.size()];
        return fitnessSportTypeList.stream().mapToInt(new cyf()).toArray();
    }

    private boolean c(cyp cypVar) {
        if (cypVar == null) {
            return false;
        }
        return lsl.d(cypVar.f(), System.currentTimeMillis(), lsl.a(cypVar.i()));
    }

    public void f() {
        LogUtil.a("ActiveTargetManager", "releaseManager");
        if (this.g != null) {
            ObserverManagerUtil.a("observer_sport_list_data_change");
            this.g = null;
        }
    }

    public void a() {
        try {
            if (this.i != null) {
                LogUtil.d("ActiveTargetManager", "mSyncCloudDataReceiver is register");
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("sync_cloud_data_action");
            this.i = new e();
            BroadcastManagerUtil.e(BaseApplication.b(), this.i, intentFilter);
        } catch (Exception unused) {
            LogUtil.e("ActiveTargetManager", "registerSyncCloudDataReceiver Exception");
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("ActiveTargetManager", "SyncCloudDataReceiver onReceive to enter, action = ", intent.getAction());
            String stringExtra = intent.getStringExtra("sync_cloud_data_status");
            if ("sync_cloud_data_finish".equals(stringExtra) || "sync_cloud_data_backstage".equals(stringExtra)) {
                ActiveTargetManager.this.j();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    class c implements Observer {
        private c() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("ActiveTargetManager", "RecordChangedReceiver notify, label = ", str);
            if ("observer_sport_list_data_change".equals(str)) {
                ActiveTargetManager.this.j();
            }
        }
    }

    public void d(long j, long j2, String str, final ResultCallback<List<FitnessTrackRecord>> resultCallback) {
        long jD = lsl.d(j, lsl.a(str), TimeZone.getDefault());
        this.f.acquireSummaryFitnessRecord(new ntx.d().b(jD).d(lsl.d(j2, lsl.a(str), TimeZone.getDefault())).d(3).a(), new IBaseResponseCallback() { // from class: cyc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ActiveTargetManager.e(resultCallback, i, obj);
            }
        });
    }

    public static /* synthetic */ void e(ResultCallback resultCallback, int i, Object obj) {
        if (obj == null) {
            LogUtil.j("ActiveTargetManager", "parsingFitnessData objectData is null");
            resultCallback.onSuccess(null);
        } else {
            if (!njy.b(obj, FitnessTrackRecord.class)) {
                LogUtil.j("ActiveTargetManager", "objectData is not match FitnessTrackRecord");
                resultCallback.onSuccess(null);
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("ActiveTargetManager", "records is empty");
                resultCallback.onSuccess(null);
            } else {
                resultCallback.onSuccess(list);
            }
        }
    }
}
