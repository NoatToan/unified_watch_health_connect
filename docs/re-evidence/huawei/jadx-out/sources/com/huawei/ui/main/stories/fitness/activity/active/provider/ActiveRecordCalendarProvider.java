package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.listener.OnCalendarSelectDataCallback;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.threecircle.api.ThreeCircleApi;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider;
import com.huawei.ui.main.stories.fitness.activity.active.writehelper.ThreeCircleDataManager;
import defpackage.ezo;
import defpackage.fsj;
import defpackage.lmf;
import defpackage.lro;
import defpackage.lsl;
import defpackage.njy;
import defpackage.npt;
import defpackage.qdm;
import defpackage.qgm;
import defpackage.qrs;
import defpackage.tuv;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ActiveRecordCalendarProvider extends MajorProvider<fsj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fsj f26533c;
    private e e;
    private SectionBean g;
    private long[] i;
    private boolean j;
    private BroadcastReceiver k;
    private fsj m;
    private BroadcastReceiver o;
    private HealthCalendar d = new HealthCalendar(System.currentTimeMillis());
    private long f = System.currentTimeMillis();
    private List<fsj> l = new CopyOnWriteArrayList();
    private List<fsj> n = new CopyOnWriteArrayList();
    private List<fsj> h = new CopyOnWriteArrayList();

    private float b(float f) {
        return f / 1000.0f;
    }

    private float d(float f) {
        return f / 10.0f;
    }

    private int e(int i, int i2) {
        return i2 > 0 ? i + 1 : i;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.b("SCUI_ActiveRecordCalendarProvider", "enter loadData");
        this.f26532b = ezo.b(this.f);
        this.g = sectionBean;
        this.f26533c = new fsj();
        long[] jArrB = lsl.b(this.f, TimeZone.getDefault(), 2, 0);
        this.i = jArrB;
        this.f26533c.a(jArrB);
        this.g.c(this.f26533c);
        long[] jArr = this.i;
        d(jArr[0], jArr[1]);
    }

    private void a(final CountDownLatch countDownLatch) {
        tuv.c().d(new IBaseResponseCallback() { // from class: tue
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.b(countDownLatch, i, obj);
            }
        });
    }

    public /* synthetic */ void b(CountDownLatch countDownLatch, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            LogUtil.e("SCUI_ActiveRecordCalendarProvider", "queryActiveGoal objData is not instanceof HashMap");
            countDownLatch.countDown();
            return;
        }
        HashMap map = (HashMap) obj;
        int iD = qgm.d(map, "900200008", 25);
        int iD2 = qgm.d(map, "900200009", 12);
        int iD3 = qgm.d(map, "900200007", 270000);
        LogUtil.b("SCUI_ActiveRecordCalendarProvider", "loadData intensityGoalValue ", Integer.valueOf(iD), " standGoalValue ", Integer.valueOf(iD2), " calorieGoalValue ", Integer.valueOf(iD3));
        this.m.a(iD);
        this.m.l(iD2);
        this.m.d(c(iD3));
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.e = new e(this);
        Bundle extra = getExtra();
        this.f26533c = new fsj();
        fsj fsjVar = new fsj();
        this.m = fsjVar;
        fsjVar.e(HiDateUtil.p(System.currentTimeMillis()));
        this.m.n(extra.getInt("current_total_step"));
        this.m.e(extra.getInt("current_total_intensity"));
        this.m.m(Math.min(extra.getInt("current_total_active"), 24));
        this.m.d(b(extra.getInt("current_total_distance")));
        this.m.a(extra.getInt("current_total_calorie") / 1000.0f);
        this.m.e(d(extra.getInt("current_total_floor")));
        this.m.o(extra.getInt("cur_step_goal"));
        this.m.d(c(extra.getInt("cur_calorie_goal")));
        this.m.a(extra.getInt("cur_intensity_goal"));
        this.m.l(extra.getInt("cur_active_goal"));
        this.m.c(lro.d());
        this.j = extra.getBoolean("is_open_calendar");
        i();
        d(qdm.b());
        f();
        ThreadPoolManager.c().execute(new Runnable() { // from class: tua
            @Override // java.lang.Runnable
            public final void run() {
                ActiveRecordCalendarProvider.c();
            }
        });
        qdm.s();
    }

    public static /* synthetic */ void c() {
        ThreeCircleDataManager.a().d();
        ((ThreeCircleApi) Services.b("DailyActivity", ThreeCircleApi.class)).checkUpdateForThreeCircle();
    }

    private void f() {
        if (this.o == null) {
            this.o = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent == null) {
                        ReleaseLogUtil.d("SCUI_ActiveRecordCalendarProvider", "registerThreeGoalBroadcastReceiver onReceive intent is null");
                        return;
                    }
                    String action = intent.getAction();
                    ReleaseLogUtil.c("SCUI_ActiveRecordCalendarProvider", "registerThreeGoalBroadcastReceiver action", action);
                    if ("UPDATE_THREE_GOAL".equals(action) && ActiveRecordCalendarProvider.this.g != null && ThreeCircleConfigUtil.a()) {
                        ReleaseLogUtil.c("SCUI_ActiveRecordCalendarProvider", "loadData by save guide goal");
                        ActiveRecordCalendarProvider.this.b(BaseApplication.getContext(), ActiveRecordCalendarProvider.this.g);
                    }
                }
            };
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.o, new IntentFilter("UPDATE_THREE_GOAL"));
        }
    }

    private void d(final List<Integer> list) {
        if (this.k == null) {
            this.k = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider.4
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (intent == null) {
                        ReleaseLogUtil.d("SCUI_ActiveRecordCalendarProvider", "registerSyncStatusBroadcastReceiver onReceive intent is null");
                        return;
                    }
                    String action = intent.getAction();
                    if (!"com.huawei.hihealth.action_sync_data_result".equals(action)) {
                        ReleaseLogUtil.d("SCUI_ActiveRecordCalendarProvider", "registerSyncStatusBroadcastReceiver onReceive action ", action);
                        return;
                    }
                    boolean booleanExtra = intent.getBooleanExtra("sync_data_result_success", true);
                    String stringExtra = intent.getStringExtra("sync_data_result_type");
                    boolean zC = qdm.c((List<Integer>) list, stringExtra);
                    ReleaseLogUtil.c("SCUI_ActiveRecordCalendarProvider", "registerSyncStatusBroadcastReceiver onReceive isSyncSleepSummaryType ", Boolean.valueOf(zC), " syncDataResultType ", stringExtra, " syncDataTypeList ", list, " isSyncSuccess ", Boolean.valueOf(booleanExtra));
                    if (zC) {
                        ObserverManagerUtil.e("ACTIVE_RECORD_SUMMARY_SYNC_STATUS", Boolean.valueOf(booleanExtra));
                    }
                }
            };
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.k, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
        }
    }

    private int c(float f) {
        return Math.round(f / 1000.0f);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, fsj fsjVar) {
        LogUtil.b("SCUI_ActiveRecordCalendarProvider", "parseParams enter ");
        d(map);
        c(map);
        b(map);
        String strC = this.f26531a;
        if (strC == null) {
            strC = c(System.currentTimeMillis());
        }
        map.put("BAR_CHART_DATE_TEXT", strC);
        map.put("BAR_COMMON_CALENDER_EVENT", this.d);
        map.put("BAR_DATA_INFOS", this.n);
        map.put("BAR_CHART_CURRENT_DAY", Long.valueOf(this.f));
        map.put("CALENDAR_START_DAY", Long.valueOf(Utils.o() ? ThreeCircleDataManager.a().c() : 1530374400000L));
        int i = this.f26532b;
        map.put("IS_DATA_TYPE_DAY", Integer.valueOf(i == 1 ? 7 : i - 1));
        if (this.j) {
            this.j = false;
            d();
        }
    }

    private void i() {
        ObserverManagerUtil.d(new Observer() { // from class: ttx
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.f49670b.a(str, objArr);
            }
        }, "observer_refresh_active_record_provider");
    }

    public /* synthetic */ void a(String str, Object[] objArr) {
        if (this.g != null) {
            b(BaseApplication.getContext(), this.g);
        }
    }

    private void d(HashMap<String, Object> map) {
        map.put("BAR_COMMON_MARK_CHANGE_CALL_BACK", new OnCalendarSelectDataCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider.3
            @Override // com.huawei.health.knit.section.listener.OnCalendarSelectDataCallback
            public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                ActiveRecordCalendarProvider.this.d = healthCalendar;
                ActiveRecordCalendarProvider activeRecordCalendarProvider = ActiveRecordCalendarProvider.this;
                activeRecordCalendarProvider.f26532b = activeRecordCalendarProvider.d.getWeek();
                if (z) {
                    ActiveRecordCalendarProvider.this.l();
                }
            }
        });
    }

    private void b(HashMap<String, Object> map) {
        map.put("BAR_CHART_CALENDAR_CLICK_EVENT", new OnCalendarSelectDataCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider.1
            @Override // com.huawei.health.knit.section.listener.OnCalendarSelectDataCallback
            public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                ActiveRecordCalendarProvider.this.d = healthCalendar;
                ActiveRecordCalendarProvider activeRecordCalendarProvider = ActiveRecordCalendarProvider.this;
                activeRecordCalendarProvider.f26532b = activeRecordCalendarProvider.d.getWeek();
                if (z) {
                    ActiveRecordCalendarProvider.this.l();
                }
            }
        });
    }

    private void c(HashMap<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new View.OnClickListener() { // from class: tub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49675c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (Utils.o()) {
            LogUtil.b("SCUI_ActiveRecordCalendarProvider", "oversea not show");
            return;
        }
        LogUtil.b("SCUI_ActiveRecordCalendarProvider", "setDialogCalendarClickListener up");
        if (qrs.e(view)) {
            LogUtil.b("SCUI_ActiveRecordCalendarProvider", "isFastClick not show");
        } else {
            d();
        }
    }

    private void d() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("calendar", this.d);
        bundle.putParcelable("markDateTrigger", new ActiveDataMarkerTrigger());
        bundle.putInt("lastExtraSpace", BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
        bundle.putInt("extraSpace", 50);
        bundle.putInt("selectedMarkerSize", BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_24dp));
        bundle.putInt("itemVerticalSpace", BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_6dp));
        bundle.putBoolean("isMarkerClickable", true);
        HealthCalendarActivity.c(BaseApplication.getActivity(), bundle, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        long timeInMillis = this.d.transformCalendar().getTimeInMillis();
        this.f26531a = c(timeInMillis);
        SectionBean sectionBean = this.g;
        sectionBean.c(sectionBean.d());
        b(timeInMillis);
    }

    private String c(long j) {
        return UnitUtil.a(new Date(j), 22);
    }

    private void b(long j) {
        this.f = j;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (lsl.aa(this.f)) {
            a(countDownLatch);
            try {
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                o();
            } catch (InterruptedException unused) {
                LogUtil.d("SCUI_ActiveRecordCalendarProvider", "interrupted while waiting for queryActiveGoal");
            }
        }
        long[] jArr = this.i;
        if (j >= jArr[0] && j <= jArr[1]) {
            LogUtil.e("SCUI_ActiveRecordCalendarProvider", "queryData the week data is already response");
            b();
        } else {
            long[] jArrB = lsl.b(j, TimeZone.getDefault(), 2, 0);
            this.i = jArrB;
            d(jArrB[0], jArrB[1]);
        }
    }

    private void d(final long j, long j2) {
        a();
        long jE = lsl.e(j, 2, -1);
        this.n.addAll(a(j));
        this.h.addAll(a(jE));
        ThreeCircleDataManager.a().d(lsl.r(jE), lsl.c(j2), new ResponseCallback() { // from class: tuc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f49676c.d(j, i, (List) obj);
            }
        });
        b(j, (List<HiHealthData>) null);
    }

    public /* synthetic */ void d(long j, int i, List list) {
        b(j, (List<HiHealthData>) list);
    }

    private void a(long j, List<HiHealthData> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("SCUI_ActiveRecordCalendarProvider", "queryWeekData objData is empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData == null) {
                ReleaseLogUtil.c("SCUI_ActiveRecordCalendarProvider", "hiHealthData is null");
            } else {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("SCUI_ActiveRecordCalendarProvider", npt.d("hiHealthData to String", hiHealthData.toString()));
                if (lsl.g(j, hiHealthData.getStartTime())) {
                    a(hiHealthData, this.n);
                } else {
                    a(hiHealthData, this.h);
                }
            }
        }
    }

    private void a(HiHealthData hiHealthData, List<fsj> list) {
        int i = hiHealthData.getInt("durationGoalValue");
        int i2 = hiHealthData.getInt("durationUserValue");
        int i3 = hiHealthData.getInt("activeGoalValue");
        int i4 = hiHealthData.getInt("activeUserValue");
        int i5 = hiHealthData.getInt("stepGoalValue");
        int i6 = hiHealthData.getInt("stepUserValue");
        int iC = c(hiHealthData.getInt("calorieGoalValue"));
        boolean z = hiHealthData.getInt("calorieIsRingNew") == 1;
        float fB = b(hiHealthData.getFloat("sport_distance_sum"));
        float f = hiHealthData.getFloat("sport_calorie_sum") / 1000.0f;
        float fD = d(hiHealthData.getFloat("sport_altitude_offset_sum"));
        int i7 = hiHealthData.getInt("pushesVal");
        for (fsj fsjVar : list) {
            if (HiDateUtil.p(hiHealthData.getStartTime()) == HiDateUtil.p(fsjVar.t())) {
                fsjVar.a(i);
                fsjVar.e(i2);
                fsjVar.l(i3);
                fsjVar.m(Math.min(i4, 24));
                fsjVar.o(i5);
                fsjVar.d(iC);
                fsjVar.n(i6);
                fsjVar.c(lro.d());
                fsjVar.d(fB);
                fsjVar.a(f);
                fsjVar.e(fD);
                fsjVar.e(z);
                fsjVar.g(i7);
                return;
            }
        }
    }

    private List<fsj> a(long j) {
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            fsj fsjVar = new fsj();
            fsjVar.e(lsl.c(j, i));
            fsjVar.d(lsl.a(j, i));
            fsjVar.e(true);
            arrayList.add(fsjVar);
        }
        return arrayList;
    }

    private void a() {
        if (njy.b(this.l)) {
            this.l.clear();
        }
        if (njy.b(this.n)) {
            this.n.clear();
        }
        if (njy.b(this.h)) {
            this.h.clear();
        }
    }

    private void g() {
        for (int i = 0; i < this.n.size(); i++) {
            d(this.n.get(i));
        }
    }

    private void d(fsj fsjVar) {
        if (fsjVar.x() == 0) {
            fsjVar.o(this.m.x());
        }
        if (fsjVar.i() == 0) {
            fsjVar.a(this.m.i());
        }
        if (fsjVar.q() == 0) {
            fsjVar.l(this.m.q());
        }
        if (fsjVar.c() == 0) {
            fsjVar.d(this.m.c());
        }
    }

    private void h() {
        for (fsj fsjVar : this.n) {
            fsjVar.q(b(this.n, 0));
            fsjVar.j(b(this.h, 0));
            fsjVar.r(b(this.n, 1));
            fsjVar.i(b(this.h, 1));
            fsjVar.s(b(this.n, 3));
            fsjVar.h(b(this.h, 3));
            fsjVar.w(Math.min(b(this.l, fsjVar), 24));
            fsjVar.f(Math.min(d(this.l, fsjVar), 24));
            fsjVar.c(b(this.h, 2));
            fsjVar.p(this.m.u());
            fsjVar.t(this.m.g());
            fsjVar.k(this.m.b());
            fsjVar.b(this.m.j());
            fsjVar.c(this.m.h());
            fsjVar.e(d(this.n, 3));
            fsjVar.b(d(this.n, 2));
            fsjVar.c(d(this.n, 1));
            fsjVar.b(b(this.n));
        }
    }

    private int b(List<fsj> list) {
        int i = 0;
        for (fsj fsjVar : list) {
            if (fsjVar.p() >= fsjVar.q()) {
                i++;
            }
        }
        return i;
    }

    private void b() {
        LogUtil.b("SCUI_ActiveRecordCalendarProvider", "enter notifyMinorProvidersDataChange");
        for (fsj fsjVar : this.n) {
            if (lsl.c(this.f, fsjVar.t())) {
                LogUtil.b("SCUI_ActiveRecordCalendarProvider", "notifyMinorProviders data mDayTimeStamp is ", Long.valueOf(this.f));
                fsjVar.c(this.f);
                notifyMinorProviders(fsjVar);
                SectionBean sectionBean = this.g;
                if (sectionBean != null) {
                    sectionBean.c(fsjVar);
                    return;
                }
                return;
            }
        }
    }

    private int b(List<fsj> list, int i) {
        int iU;
        float fD;
        if (njy.e(list)) {
            LogUtil.e("SCUI_ActiveRecordCalendarProvider", "getTrendAverageData list is empty");
            return 0;
        }
        float f = 0.0f;
        int iE = 0;
        for (fsj fsjVar : list) {
            if (fsjVar != null) {
                if (i == 0) {
                    iE = e(iE, fsjVar.u());
                    iU = fsjVar.u();
                } else if (i == 1) {
                    iE = e(iE, fsjVar.g());
                    iU = fsjVar.g();
                } else if (i == 3) {
                    iE = e(iE, fsjVar.b());
                    fD = fsjVar.d();
                    f += fD;
                } else if (i == 2) {
                    iE = e(iE, fsjVar.p());
                    iU = fsjVar.p();
                }
                fD = iU;
                f += fD;
            }
        }
        return (int) UnitUtil.d(iE == 0 ? 0.0d : f / iE, 0);
    }

    private Map<Long, Integer> d(List<fsj> list, int i) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            fsj fsjVar = list.get(i2);
            if (fsjVar != null) {
                if (i == 3) {
                    map.put(Long.valueOf(fsjVar.t()), Integer.valueOf(fsjVar.b()));
                } else if (i == 1) {
                    map.put(Long.valueOf(fsjVar.t()), Integer.valueOf(fsjVar.g()));
                } else if (i == 2) {
                    map.put(Long.valueOf(fsjVar.t()), Integer.valueOf(fsjVar.p()));
                }
            }
        }
        return map;
    }

    private int d(List<fsj> list, fsj fsjVar) {
        long jR = lsl.r(fsjVar.t());
        for (fsj fsjVar2 : list) {
            if (fsjVar2 != null && lsl.a(jR, lsl.r(fsjVar2.t())) == 2) {
                return fsjVar2.p();
            }
        }
        return 0;
    }

    private int b(List<fsj> list, fsj fsjVar) {
        long jR = lsl.r(fsjVar.t());
        for (fsj fsjVar2 : list) {
            if (fsjVar2 != null && jR == lsl.r(fsjVar2.t())) {
                return fsjVar2.p();
            }
        }
        return 0;
    }

    private void e() {
        long[] jArr = this.i;
        if (jArr != null && jArr.length == 2 && jArr[0] == lsl.r(System.currentTimeMillis())) {
            for (fsj fsjVar : this.n) {
                fsjVar.q(b(this.n, 0));
                fsjVar.r(b(this.n, 1));
                fsjVar.s(b(this.n, 3));
            }
        }
    }

    private void o() {
        for (fsj fsjVar : this.n) {
            if (lsl.aa(fsjVar.t())) {
                fsjVar.e(b(fsjVar.g(), this.m.g()));
                fsjVar.m(Math.min(b(fsjVar.p(), this.m.p()), 24));
                fsjVar.n(b(fsjVar.u(), this.m.u()));
                fsjVar.c(fsjVar.o() || this.m.o());
                fsjVar.d(b(fsjVar.j(), this.m.j()));
                fsjVar.e(b(fsjVar.h(), this.m.h()));
                fsjVar.a(b(fsjVar.d(), this.m.d()));
                fsjVar.e(true);
                return;
            }
        }
    }

    private float b(float f, float f2) {
        return Math.max(0.0f, Math.max(f, f2));
    }

    private int b(int i, int i2) {
        return Math.max(0, Math.max(i, i2));
    }

    private void b(final long j, final List<HiHealthData> list) {
        HandlerExecutor.b(new Runnable() { // from class: tuf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(j, list);
            }
        });
    }

    public /* synthetic */ void c(long j, List list) {
        a(j, (List<HiHealthData>) list);
        this.l.addAll(this.n);
        this.l.addAll(this.h);
        g();
        o();
        h();
        e();
        b();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        if (this.k != null) {
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.k);
            this.k = null;
        }
        if (this.o != null) {
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.o);
            this.o = null;
        }
        ObserverManagerUtil.a("observer_refresh_active_record_provider");
        ThreeCircleDataManager.a().clearData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("switchType", 3);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040107.value(), map, 0);
    }

    static class e implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ActiveRecordCalendarProvider> f26538c;

        e(ActiveRecordCalendarProvider activeRecordCalendarProvider) {
            this.f26538c = new WeakReference<>(activeRecordCalendarProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            ActiveRecordCalendarProvider activeRecordCalendarProvider = this.f26538c.get();
            if (activeRecordCalendarProvider == null) {
                LogUtil.e("SCUI_ActiveRecordCalendarProvider", "onResponse: provider is null");
            } else if (i == 1 && (obj instanceof HealthCalendar)) {
                activeRecordCalendarProvider.d = (HealthCalendar) obj;
                activeRecordCalendarProvider.l();
                activeRecordCalendarProvider.j();
            }
        }
    }
}
