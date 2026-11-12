package com.huawei.basichealthmodel.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.basichealthmodel.service.SyncService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.bwh;
import defpackage.bwi;
import defpackage.bws;
import defpackage.bwx;
import defpackage.bxd;
import defpackage.byu;
import defpackage.cbg;
import defpackage.ccy;
import defpackage.cfb;
import defpackage.cfn;
import defpackage.cfu;
import defpackage.cfv;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class SyncService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5345c;
    private int d;
    private int e;
    private SparseArray<TaskConfigBean> f;
    private String j;

    public SyncService() {
        super("HL_SyncService");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        LogUtil.a("HL_SyncService", "onStartCommand flags ", Integer.valueOf(i));
        return 2;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        b(intent);
    }

    private boolean f() {
        if (TextUtils.isEmpty(cbg.j())) {
            bwx bwxVarB = bwh.b().b(this.f5344b);
            if (bwxVarB == null || bwxVarB.b() != 0) {
                return false;
            }
            int iD = bwxVarB.d();
            boolean z = iD > DateFormatUtil.a(System.currentTimeMillis());
            if (z) {
                cbg.ak();
            }
            ccy.d("health_model_is_join_future", String.valueOf(z));
            ccy.c(iD, true);
            ccy.a(bwxVarB.c(), true);
            ccy.d("health_model_challenge_join", String.valueOf(bwxVarB.e()));
            cbg.aj();
        }
        return cbg.ac();
    }

    private void e(Intent intent) {
        if (this.f5343a == null) {
            this.f5343a = getApplicationContext();
        }
        if (intent == null) {
            LogUtil.j("HL_SyncService", "initData intent is null");
            return;
        }
        this.d = intent.getIntExtra("sync_starttime", 0);
        this.f5345c = intent.getIntExtra("sync_endtime", 0);
        this.e = intent.getIntExtra("sync_type", 0);
        this.j = intent.getStringExtra("sync_user_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(final Intent intent) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelSyncCloudData_" + this.e, new Runnable() { // from class: caf
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(intent);
                }
            });
            return;
        }
        if (CommonUtil.ab(BaseApplication.b()) && Utils.l()) {
            LogUtil.a("HL_SyncService", "syncCloudData mSyncType ", Integer.valueOf(this.e));
            e(intent);
            this.f5344b = GRSManager.c(BaseApplication.b()).getUrl("achievementUrl");
            if (f()) {
                this.f = byu.c().b();
                int i = this.e;
                if (i == 0) {
                    i();
                    c();
                    ObserverManagerUtil.e("PluginHealthModel", new Object[0]);
                    ReleaseLogUtil.c("HL_SyncService", "syncCloudData SYNC_ALL");
                    return;
                }
                if (i == 1) {
                    i();
                    return;
                }
                if (i == 2) {
                    cfn.c(this.j, false, bwh.b().b(this.f5344b, this.d, this.f5345c), this.f);
                } else if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    cfn.c(this.f5344b, this.j);
                } else {
                    if (this.d == 0) {
                        this.d = cbg.r();
                    }
                    if (this.f5345c == 0) {
                        this.f5345c = DateFormatUtil.a(System.currentTimeMillis());
                    }
                    cfn.d(this.f5344b, this.d, this.f5345c, this.j);
                }
            }
        }
    }

    private void c() {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        if (!e(bwh.b().d(this.f5344b, iA, iA), true, true)) {
            LogUtil.j("HL_SyncService", "parseConfigJsonObject today fail");
        }
        int iA2 = DateFormatUtil.a(lsl.w(DateFormatUtil.d(iA)));
        if (e(bwh.b().d(this.f5344b, iA2, iA2), true, false)) {
            return;
        }
        LogUtil.j("HL_SyncService", "parseConfigJsonObject tomorrow fail");
    }

    private void i() {
        cfb.l();
        g();
        h();
        cfn.d(this.f5344b, cbg.r(), DateFormatUtil.a(System.currentTimeMillis()), this.j);
        cfn.c(this.f5344b, this.j);
        d();
    }

    private void d() {
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        byu.c().a(this.j, iA, new ResponseCallback() { // from class: cag
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                SyncService.c(iA, i, (SparseArray) obj);
            }
        });
    }

    public static /* synthetic */ void c(int i, int i2, SparseArray sparseArray) {
        HealthLifeBean healthLifeBean;
        LogUtil.a("HL_SyncService", "exitChallenge date ", Integer.valueOf(i), " resultCode ", Integer.valueOf(i2), " sparseArray ", sparseArray);
        if (sparseArray == null || (healthLifeBean = (HealthLifeBean) sparseArray.get(1)) == null) {
            return;
        }
        int dataSource = healthLifeBean.getDataSource();
        cbg.m(dataSource);
        if (dataSource == 1) {
            cfv.e().d(new ResponseCallback() { // from class: cac
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i3, Object obj) {
                    LogUtil.a("HL_SyncService", "exitChallenge status=", Integer.valueOf(i3));
                }
            });
        }
    }

    private void h() {
        long jF = qrs.f(ccy.c("health_life_last_version"));
        long jB = b();
        long jC = jF;
        do {
            jC = cfn.c(this.j, true, bwh.b().b(this.f5344b, jC), this.f);
            if (jC == 0 || jC >= jB) {
                break;
            }
        } while (BaseApplication.h());
        LogUtil.a("HL_SyncService", "finish sync health record by version, localVersion=", Long.valueOf(jF), " version=", Long.valueOf(jC));
    }

    private long b() {
        bwi bwiVarC = bwh.b().c(this.f5344b);
        if (bwiVarC == null) {
            return 0L;
        }
        LogUtil.d("HL_SyncService", "getHealthLifeRecordVersion data: ", bwiVarC.toString());
        int iB = bwiVarC.b();
        if (iB != 0) {
            LogUtil.j("HL_SyncService", "syncHealthLifeRecordByVersion resultCode != 0,resultCode=", Integer.valueOf(iB));
            return 0L;
        }
        return bwiVarC.a();
    }

    private void g() {
        int iJ = CommonUtils.j(ccy.c("health_life_last_sync_date"));
        if (iJ <= 0) {
            iJ = cbg.r();
            cbg.l(cbg.r());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.w(jCurrentTimeMillis));
        int i = iJ;
        while (i <= iA2 && BaseApplication.h()) {
            int iA3 = DateFormatUtil.a(lsl.c(DateFormatUtil.d(i), 29));
            bws bwsVarD = bwh.b().d(this.f5344b, i, iA3);
            if (!e(bwsVarD, false, false)) {
                LogUtil.j("HL_SyncService", "syncHealthLifeConfigAll result ", bwsVarD, " endDay ", Integer.valueOf(iA2), " syncDate ", Integer.valueOf(iJ), " tempTimeStart ", Integer.valueOf(i), " endTimeTemp ", Integer.valueOf(iA3));
                break;
            } else {
                if (iA3 <= iA) {
                    cbg.l(iA3);
                }
                i = iA3;
            }
        }
        LogUtil.a("HL_SyncService", "sync health config finish endDay=", Integer.valueOf(iA2));
    }

    private boolean e(bws bwsVar, boolean z, boolean z2) {
        if (bwsVar == null || njy.e(bwsVar.d())) {
            LogUtil.j("HL_SyncService", "parseConfigJsonObject result is null");
            return false;
        }
        LogUtil.a("HL_SyncService", "parseConfigJsonObject result ", bwsVar.toString());
        int iB = bwsVar.b();
        if (iB != 0) {
            LogUtil.e("HL_SyncService", "parseConfigJsonObject resultCode = ", Integer.valueOf(iB));
            return false;
        }
        List<HealthLifeBean> listB = cfu.b(bwsVar.d());
        if (z) {
            cfb.d(b(listB), z2, cfb.a());
        }
        if (!njy.b(listB) || bxd.a(listB, this.j) != -1) {
            return true;
        }
        LogUtil.e("HL_SyncService", "parseConfigJsonObject insertTaskList fail");
        return false;
    }

    private static List<HealthLifeBean> b(List<HealthLifeBean> list) {
        LogUtil.a("HL_SyncService", "getMaxDay old list:", Integer.valueOf(list.size()));
        ArrayList<HealthLifeBean> arrayList = new ArrayList(list.size());
        Iterator<HealthLifeBean> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int recordDay = it.next().getRecordDay();
            if (recordDay >= i) {
                i = recordDay;
            }
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean.getRecordDay() == i) {
                arrayList.add(healthLifeBean);
            }
        }
        ArrayList arrayList2 = new ArrayList(16);
        for (HealthLifeBean healthLifeBean2 : arrayList) {
            if (healthLifeBean2.getId() == 1) {
                arrayList2.addAll(Arrays.asList(healthLifeBean2.getTarget().split(",")));
                break;
            }
        }
        for (HealthLifeBean healthLifeBean3 : arrayList) {
            if (arrayList2.contains(String.valueOf(healthLifeBean3.getId()))) {
                healthLifeBean3.setAddStatus(1);
            }
        }
        LogUtil.a("HL_SyncService", "getMaxDay new list:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static void a() {
        LogUtil.a("HL_SyncService", "syncData");
        if (!Utils.l()) {
            LogUtil.j("HL_SyncService", "syncData() not support HealthModel.");
        } else {
            cbg.c(ThreadPoolManager.c(), "HealthModelSyncData", new Runnable() { // from class: cae
                @Override // java.lang.Runnable
                public final void run() {
                    bys.c().b(cbg.q(), 0, 0, 0);
                }
            });
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        LogUtil.a("HL_SyncService", "DataSyncService onDestroy");
        super.onDestroy();
    }
}
