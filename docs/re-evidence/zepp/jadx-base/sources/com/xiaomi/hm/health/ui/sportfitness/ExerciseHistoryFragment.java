package com.xiaomi.hm.health.ui.sportfitness;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.event.EventIndoorRunCalibated;
import com.huami.moving.ui.sport.detail.tool.ShareFileUtils;
import com.huami.moving.ui.utils.BitmapUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.log.HMLog;
import com.huami.treadmill.eventbus.StatisticsRefreshEvent;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.fragment.BaseFragment;
import com.xiaomi.hm.health.running.SportDetailPageNavigator;
import com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper;
import com.xiaomi.hm.health.ui.sportfitness.ExerciseHistoryFragment;
import com.xiaomi.hm.health.ui.sportfitness.adapter.ExerciseHistoryAdapter;
import com.xiaomi.hm.health.ui.sportfitness.enums.ExerciseTimeFilterType;
import com.xiaomi.hm.health.ui.sportfitness.event.EventUpdateStatUI;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseInfoManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.ExerciseTypeChooseManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseInfo;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatData;
import com.xiaomi.hm.health.ui.sportfitness.model.ExerciseStatSportCountData;
import com.xiaomi.hm.health.ui.sportfitness.model.HistoryRecordSection;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryShareUtils;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseHeaderCount;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseHeaderEmpty;
import com.xiaomi.hm.health.ui.sportfitness.view.ExerciseHeaderSync;
import de.greenrobot.event.EventBus;
import defpackage.cw1;
import defpackage.ll1;
import defpackage.u6;
import io.reactivex.disposables.CompositeDisposable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseHistoryFragment extends BaseFragment {
    private static final String v = "ExerciseHistoryFragment";
    private static final String w = "ARG_FILTER_TYPE";
    private static final String x = "ARG_START_TIME";
    private static final String y = "ARG_END_TIME";
    private SmartRefreshLayout a;
    private RecyclerView b;
    private ExerciseHeaderSync c;
    private ExerciseHeaderCount d;
    private ExerciseHeaderEmpty e;
    private LoadingDialog f;
    private ExerciseHistoryAdapter g;
    private ExerciseTimeFilterType h;
    private Long m;
    private Long n;
    private Subscription o;
    private Subscription p;
    private Subscription q;
    private Subscription r;
    private Context s;
    private boolean t;
    private boolean i = true;
    private boolean j = false;
    private SparseLongArray k = new SparseLongArray();
    private List<HistoryRecord> l = new ArrayList();
    private CompositeDisposable u = new CompositeDisposable();

    public class a extends Subscriber<Void> {
        public a() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Void param) {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            HMLog.i(ExerciseHistoryFragment.v, Log.getStackTraceString(throwable), new Object[0]);
        }
    }

    public class b extends SingleSubscriber<ExerciseStatData> {
        public b() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ExerciseStatData statData) {
            ExerciseHistoryFragment.this.d.resetStatUI(statData.totalCostTime, statData.totalExerciseCount, statData.totalDistance, statData.totalCalorie);
            ExerciseHistoryFragment.this.Z1();
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable error) {
            error.printStackTrace();
            ExerciseHistoryFragment.this.d.resetStatUI();
            ExerciseHistoryFragment.this.Z1();
        }
    }

    public class c extends SingleSubscriber<Long> {
        public c() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Long unSyncedRecordsCount) {
            if (unSyncedRecordsCount.longValue() > 0) {
                ExerciseHistoryFragment.this.c.showRecordUnSynced(unSyncedRecordsCount.longValue());
            } else {
                ExerciseHistoryFragment.this.c.showRecordSyncEnd();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            ExerciseHistoryFragment.this.c.showRecordSyncEnd();
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ExerciseTimeFilterType.values().length];
            a = iArr;
            try {
                iArr[ExerciseTimeFilterType.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ExerciseTimeFilterType.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ExerciseTimeFilterType.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ExerciseTimeFilterType.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class e implements OnRefreshLoadmoreListener {
        public e() {
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
        public void onLoadmore(RefreshLayout refreshLayout) {
            ExerciseHistoryFragment.this.K1();
        }

        @Override // com.scwang.smartrefresh.layout.listener.OnRefreshListener
        public void onRefresh(RefreshLayout refreshLayout) {
            ExerciseHistoryFragment.this.R1();
        }
    }

    public class f implements TrainingHistoryHelper.DeleteTrainingHistoryRecordCallback {
        public final /* synthetic */ HistoryRecord a;

        public f(final HistoryRecord val$historyRecord) {
            this.a = val$historyRecord;
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.DeleteTrainingHistoryRecordCallback
        public void onDeleteFailed() {
            ExerciseHistoryFragment.this.J0();
            ExerciseHistoryFragment.this.X1();
        }

        @Override // com.xiaomi.hm.health.traininglib.util.TrainingHistoryHelper.DeleteTrainingHistoryRecordCallback
        public void onDeleteSuccess() {
            ExerciseHistoryFragment.this.J0();
            ExerciseHistoryFragment.this.Q1(this.a);
        }
    }

    public class g extends SingleSubscriber<Void> {
        public final /* synthetic */ HistoryRecord b;

        public g(final HistoryRecord val$historyRecord) {
            this.b = val$historyRecord;
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void avoid) {
            ExerciseHistoryFragment.this.J0();
            ExerciseHistoryFragment.this.Q1(this.b);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            ExerciseHistoryFragment.this.J0();
            ExerciseHistoryFragment.this.X1();
        }
    }

    public class h extends SingleSubscriber<HistoryRecord> {
        public h() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(HistoryRecord historyRecord) {
            historyRecord.setTrainingNo(historyRecord.getTrainingNo() - 1);
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public class i extends SingleSubscriber<Void> {
        public i() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void avoid) {
            HMLog.d(ExerciseHistoryFragment.v, "forceLoadLocalDataThenWebData() -> onSuccess", new Object[0]);
            if (ExerciseHistoryFragment.this.h == ExerciseTimeFilterType.ALL) {
                ExerciseHistoryFragment.this.v0();
            }
            ExerciseHistoryFragment.this.I0();
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            HMLog.w(ExerciseHistoryFragment.v, "forceLoadLocalDataThenWebData() -> onError : " + throwable.getMessage(), new Object[0]);
            throwable.printStackTrace();
            ExerciseHistoryFragment exerciseHistoryFragment = ExerciseHistoryFragment.this;
            exerciseHistoryFragment.c2(exerciseHistoryFragment.l);
        }
    }

    public class j extends Subscriber<Boolean> {
        public j() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean isLoadSuccess) {
            if (isLoadSuccess.booleanValue()) {
                ExerciseHistoryFragment.this.I0();
            } else {
                ExerciseHistoryFragment.this.H0();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable e) {
            e.printStackTrace();
        }
    }

    public class k extends Subscriber<Boolean> {
        public k() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean param) {
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable throwable) {
        }
    }

    public class l extends SingleSubscriber<List<Object>> {
        public l() {
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            ExerciseHistoryFragment.this.N1();
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(List<Object> groupList) {
            ExerciseHistoryFragment.this.O1(groupList);
        }
    }

    public class m extends SingleSubscriber<Long> {
        public m() {
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Long allRecordCount) {
            if (allRecordCount.longValue() > 0) {
                ExerciseHistoryFragment.this.I1();
            } else {
                ExerciseHistoryFragment.this.w0();
                ExerciseHistoryFragment.this.U1();
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
            ExerciseHistoryFragment.this.w0();
            ExerciseHistoryFragment.this.V1();
        }
    }

    private void A0(final HistoryRecord historyRecord) {
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_DELETE_EXERCISE_RECORD_C).addExtra("id", String.valueOf(historyRecord.getTrainingId())));
        TrainingHistoryHelper.getInstance().deleteTrainingRecord(historyRecord.getTrainingId(), historyRecord.getTrainingStartTime(), historyRecord.getTrainingCreateTime(), new f(historyRecord));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(String str) {
        String str2;
        B0();
        if (getActivity() != null) {
            int i2 = d.a[this.h.ordinal()];
            if (i2 == 1) {
                str2 = "Week";
            } else if (i2 != 2) {
                str2 = i2 != 3 ? "Total" : SportAnalytics.Params.VALUE_YEAR;
            } else {
                str2 = "Month";
            }
            ExerciseHisShareActivity.launch(getActivity(), str, str2);
        }
    }

    private void B0() {
        J0();
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(Throwable th) {
        HMLog.e(v, "Share Failed:", th);
        B0();
        CustomToast.makeText(this.s, R.string.share_fail, 0).show();
    }

    private void C0(View view) {
        this.b = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.a = (SmartRefreshLayout) view.findViewById(R.id.refresh_layout);
    }

    private void D0() {
        t0();
        this.i = true;
        this.a.setLoadmoreFinished(false);
        w0();
        b2();
        v0();
        HMLog.d(v, "forceLoadLocalDataThenWebData() -> 先加载本地数据，并且不更新同步时间", new Object[0]);
        this.o = J1(false).flatMap(new Func1() { // from class: gv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.b1((Boolean) obj);
            }
        }).map(new Func1() { // from class: uv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.c1((Boolean) obj);
            }
        }).observeOn(Schedulers.io()).map(new Func1() { // from class: iv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.e1((Void) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(HistoryRecord historyRecord, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (historyRecord == null) {
            return;
        }
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RECORD_DELETE_HISTORY));
        W1(R.string.sport_delete_record_loading);
        if (historyRecord.isTraining()) {
            A0(historyRecord);
            return;
        }
        z0(historyRecord);
        if (historyRecord.getType().intValue() == 25 || historyRecord.getType().intValue() == 26) {
            EventBus.getDefault().post(new StatisticsRefreshEvent(StatisticsRefreshEvent.SECTION_TREADMILL_RECORD_INFO));
        }
    }

    private Context E0() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List E1(List list) throws Exception {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        Collections.reverse(arrayList);
        ExerciseInfo exerciseInfo = new ExerciseInfo();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof HistoryRecord) {
                HistoryRecord historyRecord = (HistoryRecord) obj;
                exerciseInfo.startTime = historyRecord.getBeginTimeInMilli() / 1000;
                exerciseInfo.count++;
                exerciseInfo.costTime += historyRecord.getConsumeTime();
                exerciseInfo.distance += historyRecord.getDistance() != null ? historyRecord.getDistance().intValue() : 0.0f;
            } else {
                arrayList2.add(exerciseInfo);
                exerciseInfo = new ExerciseInfo();
                exerciseInfo.startTime = 0L;
                exerciseInfo.count = 0;
                exerciseInfo.costTime = 0L;
                exerciseInfo.distance = 0.0f;
            }
        }
        return arrayList2;
    }

    private void F0() {
        G0(this.l).toSingle().observeOn(AndroidSchedulers.mainThread()).subscribe(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void F1(String str, List list) {
        ExerciseInfoManager.getInstance().setExerCharDataMap(str, list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<List<Object>> G0(List<HistoryRecord> allHistoryRecords) {
        return Observable.from(allHistoryRecords).subscribeOn(Schedulers.io()).distinct(ll1.a).collect(new Func0() { // from class: bv1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                return ExerciseHistoryFragment.g1();
            }
        }, new Action2() { // from class: zu1
            @Override // rx.functions.Action2
            public final void call(Object obj, Object obj2) {
                ExerciseHistoryFragment.h1((TreeMap) obj, (HistoryRecord) obj2);
            }
        }).flatMap(new Func1() { // from class: bw1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.i1((TreeMap) obj);
            }
        }).flatMap(new Func1() { // from class: yv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.k1((List) obj);
            }
        }).toList().doOnNext(new Action1() { // from class: wu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExerciseHistoryFragment.l1((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void G1(String str, Throwable th) {
        th.printStackTrace();
        ExerciseInfoManager.getInstance().setExerCharDataMap(str, new ArrayList());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        if (NetUtil.isNetworkConnected(E0())) {
            IconToast.showError(E0(), E0().getString(R.string.network_request_fail));
        } else {
            IconToast.showError(E0(), E0().getString(R.string.no_network_connection));
        }
        HistoryRecordManager.getInstance().getAllLocalHistoryRecordCountInRx().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H1(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        I1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1() {
        J1(true).subscribe((Subscriber<? super Boolean>) new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        LoadingDialog loadingDialog = this.f;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    private Observable<Boolean> J1(final boolean allowUpdateSyncTime) {
        return (this.h == ExerciseTimeFilterType.ALL ? HistoryRecordManager.getInstance().loadLocalDataBySyncTimeInRx(this.k) : HistoryRecordManager.getInstance().loadLocalDataByTimeRangeInRx(this.m, this.n)).observeOn(Schedulers.io()).doOnNext(new Action1() { // from class: qu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.x1((List) obj);
            }
        }).map(new Func1() { // from class: mv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.o1((List) obj);
            }
        }).doOnNext(new Action1() { // from class: vu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExerciseHistoryFragment.p1((List) obj);
            }
        }).flatMap(new Func1() { // from class: lv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.r1((List) obj);
            }
        }).doOnNext(new Action1() { // from class: su1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.s1(allowUpdateSyncTime, (List) obj);
            }
        }).doOnNext(new Action1() { // from class: ru1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.t1((List) obj);
            }
        }).flatMap(new Func1() { // from class: kv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.G0((List) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: ou1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.O1((List) obj);
            }
        }).doOnError(new Action1() { // from class: nu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.u1((Throwable) obj);
            }
        }).onErrorReturn(new Func1() { // from class: vv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.v1((Throwable) obj);
            }
        }).map(new Func1() { // from class: zv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.w1((List) obj);
            }
        });
    }

    private void K0() {
        this.b.setLayoutManager(new LinearLayoutManager(getActivity()));
        ExerciseHistoryAdapter exerciseHistoryAdapter = new ExerciseHistoryAdapter();
        this.g = exerciseHistoryAdapter;
        exerciseHistoryAdapter.bindToRecyclerView(this.b);
        String str = (this.m == null || this.n == null) ? null : String.format(Locale.getDefault(), "%sX%s", TimeUtils.formatDate("yyyy-MM-dd", new Date(this.m.longValue())), TimeUtils.formatDate("yyyy-MM-dd", new Date(this.n.longValue())));
        Context context = getContext();
        FragmentManager childFragmentManager = getChildFragmentManager();
        ExerciseTimeFilterType exerciseTimeFilterType = this.h;
        ExerciseHeaderCount exerciseHeaderCount = new ExerciseHeaderCount(context, childFragmentManager, exerciseTimeFilterType, str, ExerciseHistoryShareUtils.getShareTitleDes(exerciseTimeFilterType, this.m, this.n), ExerciseHistoryShareUtils.getDateRangeDes(this.h, this.m, this.n));
        this.d = exerciseHeaderCount;
        this.g.addHeaderView(exerciseHeaderCount);
        ExerciseHeaderSync exerciseHeaderSync = new ExerciseHeaderSync(getActivity());
        this.c = exerciseHeaderSync;
        this.g.addHeaderView(exerciseHeaderSync);
        ExerciseHeaderEmpty exerciseHeaderEmpty = new ExerciseHeaderEmpty(getActivity(), this.h);
        this.e = exerciseHeaderEmpty;
        this.g.addHeaderView(exerciseHeaderEmpty);
        this.g.setGroupByWeek(this.h == ExerciseTimeFilterType.WEEK);
        this.d.resetStatUI();
        this.g.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ev1
            @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                this.a.m1(baseQuickAdapter, view, i2);
            }
        });
        this.g.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: pv1
            @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                return this.a.n1(baseQuickAdapter, view, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1() {
        this.i = false;
        L1();
    }

    private void L0() {
        this.a.setEnableRefresh(true);
        this.a.setEnableLoadmore(this.h == ExerciseTimeFilterType.ALL);
        this.a.setEnableLoadmoreWhenContentNotFull(true);
        this.a.setEnableAutoLoadmore(true);
        this.a.setOnRefreshLoadmoreListener((OnRefreshLoadmoreListener) new e());
    }

    private void L1() {
        this.p = M1().observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber<? super Boolean>) new j());
    }

    @SuppressLint({"UseSparseArrays"})
    private void M0() {
        this.k.put(-1, -1L);
        this.k.put(-2, -1L);
    }

    private Observable<Boolean> M1() {
        Long lValueOf;
        if (!NetUtil.isNetworkConnected(E0())) {
            return Observable.just(Boolean.FALSE);
        }
        ExerciseTimeFilterType exerciseTimeFilterType = this.h;
        if (exerciseTimeFilterType == ExerciseTimeFilterType.ALL) {
            return HistoryRecordManager.getInstance().loadWebDataBySyncTimeInRx(this.k);
        }
        if (exerciseTimeFilterType == ExerciseTimeFilterType.YEAR) {
            lValueOf = this.m;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.m.longValue());
            calendar.add(2, -1);
            ExerciseHistoryDateUtils.resetCalendarTimeToEarliest(calendar);
            lValueOf = Long.valueOf(calendar.getTimeInMillis());
        }
        return HistoryRecordManager.getInstance().loadWebDataByTimeRangeInRx(lValueOf, this.n, new SimpleDateFormat("yyyy-MM", Locale.getDefault()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(ExerciseStatData exerciseStatData) {
        ExerciseStatData classifyExerciseStatData = ExerciseTypeChooseManager.getInstance().getClassifyExerciseStatData();
        if (classifyExerciseStatData != null) {
            exerciseStatData = classifyExerciseStatData;
        }
        this.d.resetStatUI(exerciseStatData.totalCostTime, exerciseStatData.totalExerciseCount, exerciseStatData.totalDistance, exerciseStatData.totalCalorie);
        Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1() {
        HMLog.i(v, "历史记录列表按日期分组失败.", new Object[0]);
        w0();
        U1();
        Y1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable O0(ExerciseStatData exerciseStatData) {
        return HistoryRecordManager.getInstance().getStatInfoInRx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1(List<Object> dataList) {
        HistoryRecord historyRecord;
        boolean z = false;
        HMLog.i(v, "历史记录列表按日期分组完成，数据个数：" + dataList.size(), new Object[0]);
        boolean z2 = false;
        for (Object obj : dataList) {
            if ((obj instanceof HistoryRecord) && (historyRecord = (HistoryRecord) obj) != null && historyRecord.getSource() != null) {
                if (SportDeviceUtils.isWorkoutSportSource(historyRecord.getSource().intValue())) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
        }
        if (!z || z2) {
            ExerciseTypeChooseManager.getInstance().setWorkoutStrId(R.string.sports_type_free_training);
        } else {
            ExerciseTypeChooseManager.getInstance().setWorkoutStrId(R.string.sports_type_work_out);
        }
        w0();
        a2(dataList);
        Y1(dataList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P0(ExerciseStatData exerciseStatData, HistoryRecord historyRecord) {
        exerciseStatData.totalDistance += historyRecord.isTraining() ? 0.0f : historyRecord.getDistance().intValue();
        exerciseStatData.totalCostTime += historyRecord.getConsumeTime();
        exerciseStatData.totalCalorie += historyRecord.getConsumeCal();
        exerciseStatData.totalExerciseCount++;
    }

    private void P1() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.h = (ExerciseTimeFilterType) arguments.getSerializable(w);
        long j2 = arguments.getLong(x, 0L);
        long j3 = arguments.getLong(y, 0L);
        if (j2 <= 0 || j3 <= 0) {
            return;
        }
        this.m = Long.valueOf(j2);
        this.n = Long.valueOf(j3);
        HMLog.d(v, "parseArguments() ->  mCurrentStartTime : " + TimeUtils.formatDate(E0(), new Date(this.m.longValue())) + ", mCurrentEndTime : " + TimeUtils.formatDate(E0(), new Date(this.n.longValue())), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable Q0(Observable observable, ExerciseStatData exerciseStatData) {
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1(HistoryRecord deletedRecord) {
        ExerciseStatData exerciseStatDataUpdateStatDataWhenDelete = HistoryRecordManager.getInstance().updateStatDataWhenDelete(deletedRecord);
        y0(deletedRecord);
        x0(deletedRecord);
        r0();
        F0();
        u0();
        if (exerciseStatDataUpdateStatDataWhenDelete != null) {
            EventBus.getDefault().post(new EventUpdateStatUI(exerciseStatDataUpdateStatDataWhenDelete));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0() {
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1() {
        this.i = true;
        this.j = true;
        this.a.setLoadmoreFinished(false);
        b2();
        v0();
        L1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(ExerciseStatData exerciseStatData) {
        this.d.updateSportCount(ExerciseHistoryShareUtils.sortStatSportCountData(ExerciseTypeChooseManager.getInstance().getExerciseStatShareSportCountData()));
    }

    private void T1(final HistoryRecord historyRecord) {
        new AlertDialogFragment.Builder(getActivity()).setCancelable(true).setMessage(R.string.running_delete_record_title).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: tu1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: iu1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.D1(historyRecord, dialogInterface, i2);
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable U0(ExerciseStatData exerciseStatData) {
        return Observable.fromCallable(new Func0() { // from class: av1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        FragmentActivity activity = getActivity();
        if (this.h == ExerciseTimeFilterType.ALL && (activity instanceof ExerciseHistoryActivity)) {
            ((ExerciseHistoryActivity) activity).setHasData(false);
        }
        this.g.setNewData(null);
        this.e.showEmptyOrException(true);
        this.e.showEmptyView();
        this.d.resetStatUI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V0(SparseArray sparseArray, HistoryRecord historyRecord) {
        int iIntValue = historyRecord.isTraining() ? -100 : historyRecord.getType().intValue();
        ExerciseStatSportCountData exerciseStatSportCountData = (ExerciseStatSportCountData) sparseArray.get(iIntValue);
        if (exerciseStatSportCountData == null) {
            exerciseStatSportCountData = new ExerciseStatSportCountData(0L, iIntValue);
        }
        exerciseStatSportCountData.setCount(exerciseStatSportCountData.getCount() + 1);
        sparseArray.put(iIntValue, exerciseStatSportCountData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1() {
        this.g.setNewData(null);
        this.e.showEmptyOrException(false);
        this.e.showEmptyView();
    }

    private void W1(@StringRes int msg) {
        LoadingDialog loadingDialog = this.f;
        if (loadingDialog != null) {
            loadingDialog.show();
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(getActivity(), getString(msg));
        this.f = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable X0(final SparseArray sparseArray) {
        return Observable.fromCallable(new Callable() { // from class: dw1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExerciseHistoryShareUtils.convertToStatSportCountData(sparseArray);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1() {
        if (NetUtil.isNetworkConnected(E0())) {
            IconToast.showError(E0(), E0().getString(R.string.running_delete_record_server_result_fail));
        } else {
            IconToast.showError(E0(), E0().getString(R.string.no_network_connection));
        }
    }

    private void Y1(final List<Object> dataList) {
        if (this.h != ExerciseTimeFilterType.ALL) {
            final String str = String.format(Locale.getDefault(), "%sX%s", TimeUtils.formatDate("yyyy-MM-dd", new Date(this.m.longValue())), TimeUtils.formatDate("yyyy-MM-dd", new Date(this.n.longValue())));
            Subscription subscription = this.r;
            if (subscription != null && !subscription.isUnsubscribed()) {
                this.r.unsubscribe();
            }
            this.r = Observable.fromCallable(new Callable() { // from class: fw1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ExerciseHistoryFragment.E1(dataList);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Func1() { // from class: ov1
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return ExerciseHistoryFragment.F1(str, (List) obj);
                }
            }).onErrorReturn(new Func1() { // from class: nv1
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return ExerciseHistoryFragment.G1(str, (Throwable) obj);
                }
            }).subscribe((Subscriber) new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable Z0(ArrayList arrayList) {
        this.d.updateSportCount(arrayList);
        return Observable.fromCallable(new Callable() { // from class: gw1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z1() {
        s0().subscribe(new Action1() { // from class: uu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ExerciseHistoryFragment.H1((Boolean) obj);
            }
        }, u6.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean a1(HistoryRecord historyRecord, HistoryRecord historyRecord2) {
        return Boolean.valueOf(historyRecord2.isTraining() && historyRecord2.getTrainingId() == historyRecord.getTrainingId() && historyRecord2.getTrainingNo() > historyRecord.getTrainingNo());
    }

    private void a2(List<Object> groupDataList) {
        this.g.setNewData(groupDataList);
        this.e.hideEmptyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable b1(Boolean bool) {
        HMLog.d(v, "forceLoadLocalDataThenWebData() -> 本地数据加载完了，不管有没有数据都再加载网络数据", new Object[0]);
        return M1();
    }

    private void b2() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.k.put(-1, jCurrentTimeMillis);
        this.k.put(-2, jCurrentTimeMillis / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void c1(Boolean bool) {
        if (bool.booleanValue()) {
            HMLog.d(v, "forceLoadLocalDataThenWebData() -> 从网络请求运动、训练历史记录数据成功", new Object[0]);
            return null;
        }
        HMLog.w(v, "forceLoadLocalDataThenWebData() -> 从网络请求运动、训练历史记录数据失败", new Object[0]);
        throw new IllegalStateException("从网络请求运动、训练历史记录数据失败");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2(List<HistoryRecord> historyRecords) {
        if (this.h != ExerciseTimeFilterType.ALL) {
            return;
        }
        for (HistoryRecord historyRecord : historyRecords) {
            if (historyRecord.isTraining()) {
                long j2 = this.k.get(-1);
                if (historyRecord.getTrainingStartTime() < j2 || j2 <= 0) {
                    this.k.put(-1, historyRecord.getTrainingStartTime() - 1);
                }
            } else {
                long j3 = this.k.get(-2);
                if (historyRecord.getTrackid().longValue() < j3 || j3 <= 0) {
                    this.k.put(-2, historyRecord.getTrackid().longValue() - 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List d1(List list) {
        return list.size() > 20 ? list.subList(0, 20) : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void e1(Void r10) {
        boolean z;
        if (this.h == ExerciseTimeFilterType.ALL) {
            z = !Observable.sequenceEqual(Observable.from(this.l), Observable.from((List) HistoryRecordManager.getInstance().loadLocalDataBySyncTimeInRx(this.k).map(new Func1() { // from class: xv1
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return ExerciseHistoryFragment.d1((List) obj);
                }
            }).toBlocking().single())).toBlocking().single().booleanValue();
        } else {
            z = HistoryRecordManager.getInstance().getLocalHistoryRecordCountByTimeRange(this.m.longValue(), this.n.longValue()) != ((long) this.l.size());
        }
        if (!z) {
            throw new IllegalStateException("从网络请求运动、训练历史记录数据无变化，无需更新UI");
        }
        HMLog.d(v, "从网络请求运动、训练历史记录数据有变化，更新UI", new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f1(String str, String str2) {
        return Integer.compare(0, str.compareTo(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TreeMap g1() {
        return new TreeMap(new Comparator() { // from class: aw1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ExerciseHistoryFragment.f1((String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h1(TreeMap treeMap, HistoryRecord historyRecord) {
        String date = ExerciseHistoryDateUtils.formatDate(historyRecord.getBeginTimeInMilli());
        List arrayList = (List) treeMap.get(date);
        if (arrayList == null) {
            arrayList = new ArrayList();
            treeMap.put(date, arrayList);
        }
        arrayList.add(historyRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable i1(TreeMap treeMap) {
        return Observable.from(treeMap.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable j1(List list) {
        HistoryRecordSection historyRecordSection = new HistoryRecordSection();
        historyRecordSection.recordStartTime = ((HistoryRecord) list.get(0)).getBeginTimeInMilli();
        return Observable.concat(Observable.just(historyRecordSection), Observable.from(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable k1(List list) {
        return Observable.from(list).toSortedList(cw1.a).flatMap(new Func1() { // from class: wv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.j1((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l1(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("History record list is empty");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        Object item = baseQuickAdapter.getItem(i2);
        if (item instanceof HistoryRecord) {
            HistoryRecord historyRecord = (HistoryRecord) item;
            if (getActivity() != null) {
                SportDetailPageNavigator sportDetailPageNavigator = new SportDetailPageNavigator(getActivity());
                historyRecord.setCf(StatEvent.EventParams.SPORT_LIST);
                sportDetailPageNavigator.jump2DetailPage(historyRecord, getActivity());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean n1(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        Object item = baseQuickAdapter.getItem(i2);
        if (!(item instanceof HistoryRecord)) {
            return false;
        }
        T1((HistoryRecord) item);
        return true;
    }

    public static ExerciseHistoryFragment newInstance(ExerciseTimeFilterType filterType, Long startTime, Long endTime) {
        ExerciseHistoryFragment exerciseHistoryFragment = new ExerciseHistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(w, filterType);
        if (startTime != null && endTime != null) {
            bundle.putLong(x, startTime.longValue());
            bundle.putLong(y, endTime.longValue());
        }
        exerciseHistoryFragment.setArguments(bundle);
        return exerciseHistoryFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o1(List list) {
        if (this.h != ExerciseTimeFilterType.ALL) {
            return list;
        }
        list.removeAll(this.l);
        return list.size() > 20 ? list.subList(0, 20) : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p1(List list) {
        HMLog.d(v, "loadLocalDataInRx() 本页加载出来的数据 ->, filtered historyRecords.size():" + list.size(), new Object[0]);
        for (int i2 = 0; i2 < list.size(); i2++) {
            HMLog.d(v, "loadLocalDataInRx() 本页加载出来的数据 ->[" + i2 + "] " + ((HistoryRecord) list.get(i2)), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(List list) {
        if (!this.i && list.size() == this.l.size()) {
            this.a.setLoadmoreFinished(true);
        }
        HMLog.d(v, "loadLocalDataInRx() 本页与之前的页合并后的数据个数：" + list.size(), new Object[0]);
    }

    private void r0() {
        if (this.h == ExerciseTimeFilterType.ALL) {
            if (this.i) {
                Action1<? super ExerciseStatData> action1 = new Action1() { // from class: ku1
                    @Override // rx.functions.Action1
                    public final void call(Object obj) {
                        this.a.N0((ExerciseStatData) obj);
                    }
                };
                this.q = HistoryRecordManager.getInstance().getLocalStatInfoUseCacheInRx().observeOn(AndroidSchedulers.mainThread()).doOnNext(action1).observeOn(Schedulers.io()).flatMap(new Func1() { // from class: tv1
                    @Override // rx.functions.Func1
                    public final Object call(Object obj) {
                        return ExerciseHistoryFragment.O0((ExerciseStatData) obj);
                    }
                }).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(action1, u6.a);
                return;
            }
            return;
        }
        final Observable observableSubscribeOn = Observable.from(this.l).collect(new Func0() { // from class: dv1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                return new ExerciseStatData();
            }
        }, new Action2() { // from class: yu1
            @Override // rx.functions.Action2
            public final void call(Object obj, Object obj2) {
                ExerciseHistoryFragment.P0((ExerciseStatData) obj, (HistoryRecord) obj2);
            }
        }).subscribeOn(Schedulers.io());
        if (this.j) {
            observableSubscribeOn = HistoryRecordManager.getInstance().getStatInfoInRx().flatMap(new Func1() { // from class: qv1
                @Override // rx.functions.Func1
                public final Object call(Object obj) {
                    return ExerciseHistoryFragment.Q0(observableSubscribeOn, (ExerciseStatData) obj);
                }
            });
        }
        this.q = observableSubscribeOn.observeOn(AndroidSchedulers.mainThread()).toSingle().doOnSubscribe(new Action0() { // from class: hw1
            @Override // rx.functions.Action0
            public final void call() {
                this.a.R0();
            }
        }).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable r1(List list) {
        return Observable.concat(Observable.from(this.l), Observable.from(list)).distinct(ll1.a).toSortedList(cw1.a).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: pu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.q1((List) obj);
            }
        });
    }

    private Observable<Boolean> s0() {
        return this.h == ExerciseTimeFilterType.ALL ? HistoryRecordManager.getInstance().getLocalStatInfoUseCacheInRx().observeOn(AndroidSchedulers.mainThread()).doOnNext(new Action1() { // from class: ju1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.S0((ExerciseStatData) obj);
            }
        }).flatMap(new Func1() { // from class: sv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.U0((ExerciseStatData) obj);
            }
        }) : Observable.from(this.l).collect(new Func0() { // from class: cv1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                return new SparseArray();
            }
        }, new Action2() { // from class: xu1
            @Override // rx.functions.Action2
            public final void call(Object obj, Object obj2) {
                ExerciseHistoryFragment.V0((SparseArray) obj, (HistoryRecord) obj2);
            }
        }).flatMap(new Func1() { // from class: rv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.X0((SparseArray) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).flatMap(new Func1() { // from class: jv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.Z0((ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(boolean z, List list) {
        if (z) {
            c2(list);
        }
    }

    private void t0() {
        Subscription subscription = this.o;
        if (subscription != null && !subscription.isUnsubscribed()) {
            this.o.unsubscribe();
        }
        Subscription subscription2 = this.p;
        if (subscription2 != null && !subscription2.isUnsubscribed()) {
            this.p.unsubscribe();
        }
        Subscription subscription3 = this.q;
        if (subscription3 != null && !subscription3.isUnsubscribed()) {
            this.q.unsubscribe();
        }
        Subscription subscription4 = this.r;
        if (subscription4 != null && !subscription4.isUnsubscribed()) {
            this.r.unsubscribe();
        }
        if (this.u.size() > 0) {
            this.u.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(List list) {
        this.l = list;
        r0();
    }

    private void u0() {
        HistoryRecordManager.getInstance().getAllUnSyncedHistoryRecordCountInRx().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(Throwable th) {
        th.printStackTrace();
        N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        this.l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List v1(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        this.a.finishRefresh();
        this.a.finishLoadmore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean w1(List list) {
        return Boolean.valueOf(list != null);
    }

    private void x0(final HistoryRecord deletedRecord) {
        if (!deletedRecord.isTraining() || this.l.isEmpty()) {
            return;
        }
        Observable.from(this.l).filter(new Func1() { // from class: fv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return ExerciseHistoryFragment.a1(deletedRecord, (HistoryRecord) obj);
            }
        }).toSingle().subscribe(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(List list) {
        if (this.h != ExerciseTimeFilterType.ALL) {
            v0();
        }
    }

    private void y0(HistoryRecord toDeleteRecord) {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            HistoryRecord historyRecord = this.l.get(i2);
            if (historyRecord.isTraining()) {
                if (historyRecord.getTrainingId() == toDeleteRecord.getTrainingId() && historyRecord.getTrainingNo() == toDeleteRecord.getTrainingNo()) {
                    this.l.remove(i2);
                    return;
                }
            } else if (historyRecord.getTrackid().equals(toDeleteRecord.getTrackid()) && historyRecord.getSource().equals(toDeleteRecord.getSource())) {
                this.l.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String y1(String str) throws Exception {
        return str;
    }

    private void z0(final HistoryRecord historyRecord) {
        if (TextUtils.isEmpty(DataTypeSource.RunSource.getSourceByValue(historyRecord.getSource().intValue()))) {
            J0();
            X1();
        } else {
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_DELETE_EXERCISE_RECORD_C).addExtra("id", String.valueOf(historyRecord.getTrackid())));
            HistoryRecordManager.getInstance().deleteRunningHistoryRecord(historyRecord).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new g(historyRecord));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Observable z1(Long l2) throws Throwable {
        final String absolutePath = ShareFileUtils.INSTANCE.getShareCacheFile(this.s, ExerciseHistoryShareUtils.SPORT_HISTORY_SHARE_SHORT).getAbsolutePath();
        BitmapUtils.saveBitmapToFile(absolutePath, this.d.getShareBitmap(), 90);
        return Observable.fromCallable(new Callable() { // from class: ew1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ExerciseHistoryFragment.y1(absolutePath);
            }
        });
    }

    public void S1() {
        W1(R.string.loading);
        Observable.timer(500L, TimeUnit.MILLISECONDS).flatMap(new Func1() { // from class: hv1
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.z1((Long) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: lu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.A1((String) obj);
            }
        }, new Action1() { // from class: mu1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.B1((Throwable) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        u0();
        M0();
        D0();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.s = context.getApplicationContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        P1();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exercise_history, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        B0();
        t0();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventIndoorRunCalibated event) {
        boolean z = true;
        this.t = true;
        if (this.h != ExerciseTimeFilterType.ALL) {
            I1();
            return;
        }
        Iterator<HistoryRecord> it2 = this.l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            HistoryRecord next = it2.next();
            if (next.getDistinctKey().equals(event.recordKey)) {
                next.setDistance(Integer.valueOf(event.distance));
                next.setPace(Float.valueOf(event.pace));
                break;
            }
        }
        if (z) {
            F0();
            r0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.t) {
            u0();
            this.t = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        C0(view);
        L0();
        K0();
    }
}
