package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.OnItemClickListener;
import com.xiaomi.fitness.health.sleep.rhythm.adapter.SleepRhythmRecordsAdapter;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailFragment;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRecordListFragment;
import com.xiaomi.fitness.health.sleep.rhythm.utils.SleepRhythmExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.watch.face.edit.utils.Source;
import defpackage.c0j;
import defpackage.iji;
import defpackage.jui;
import defpackage.mca;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmRecordListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Lmca;", "", "onDealRecordJournal", "()V", "", Source.TIME_SECOND, "jumpDiaryRecordFragment", "(Ljava/lang/Long;)V", "refreshView", "initRecyclerView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recordRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmRecordsAdapter;", "recordAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/adapter/SleepRhythmRecordsAdapter;", "Landroid/widget/TextView;", "tvNoData", "Landroid/widget/TextView;", "tvOpenMonitor", "tvRecordJournal", "", "hasRhythmReport", "Z", "hasDiaryReport", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmRecordListFragment extends Hilt_SleepRhythmRecordListFragment<SleepRhythmMonitorViewModel, mca> {

    @NotNull
    public static final String TAG = "SleepRhythmRecordListUI";
    private boolean hasDiaryReport;
    private boolean hasRhythmReport;
    private SleepRhythmRecordsAdapter recordAdapter;
    private RecyclerView recordRecyclerView;
    private TextView tvNoData;
    private TextView tvOpenMonitor;
    private TextView tvRecordJournal;

    public SleepRhythmRecordListFragment() {
        super(jui.V0);
    }

    private final void initRecyclerView() {
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter = new SleepRhythmRecordsAdapter();
        this.recordAdapter = sleepRhythmRecordsAdapter;
        sleepRhythmRecordsAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmRecordListFragment.initRecyclerView.1
            @Override // com.xiaomi.fitness.health.sleep.rhythm.adapter.OnItemClickListener
            public void onClick(SleepRhythmReport report) {
                Intrinsics.checkNotNullParameter(report, "report");
                SleepRhythmRecordListFragment sleepRhythmRecordListFragment = SleepRhythmRecordListFragment.this;
                Bundle bundle = new Bundle();
                bundle.putSerializable("report", report);
                bundle.putBoolean(SleepRhythmDetailFragment.PARAM_REPORT_IS_CYCLE, true);
                Unit unit = Unit.INSTANCE;
                BaseFragmentExKt.gotoPage(sleepRhythmRecordListFragment, SleepRhythmDetailFragment.class, bundle);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.recordRecyclerView;
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.recordRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordRecyclerView");
            recyclerView2 = null;
        }
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter3 = this.recordAdapter;
        if (sleepRhythmRecordsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAdapter");
            sleepRhythmRecordsAdapter3 = null;
        }
        recyclerView2.setAdapter(sleepRhythmRecordsAdapter3);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: bvm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRecordListFragment.initRecyclerView$lambda$7(this.f4648a, (CombinedLoadStates) obj);
            }
        };
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter4 = this.recordAdapter;
        if (sleepRhythmRecordsAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAdapter");
        } else {
            sleepRhythmRecordsAdapter2 = sleepRhythmRecordsAdapter4;
        }
        sleepRhythmRecordsAdapter2.addLoadStateListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRecyclerView$lambda$7(SleepRhythmRecordListFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter = this$0.recordAdapter;
        if (sleepRhythmRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAdapter");
            sleepRhythmRecordsAdapter = null;
        }
        this$0.hasRhythmReport = sleepRhythmRecordsAdapter.getItemCount() > 0;
        this$0.refreshView();
        return Unit.INSTANCE;
    }

    private final void jumpDiaryRecordFragment(Long timeSecond) {
        Bundle bundle;
        if (timeSecond == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(SleepDiaryUpdateFragment.INTENT_REQUEST_TIME, timeSecond.longValue());
            bundle = bundle2;
        }
        BaseFragmentExKt.gotoPage(this, SleepDiaryUpdateFragment.class, bundle, true);
    }

    public static /* synthetic */ void jumpDiaryRecordFragment$default(SleepRhythmRecordListFragment sleepRhythmRecordListFragment, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        sleepRhythmRecordListFragment.jumpDiaryRecordFragment(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDealRecordJournal() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).queryJumpDiaryDateLiveData().observe(getViewLifecycleOwner(), new SleepRhythmRecordListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: avm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRecordListFragment.onDealRecordJournal$lambda$5(this.f3493a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDealRecordJournal$lambda$5(SleepRhythmRecordListFragment this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.jumpDiaryRecordFragment(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(final SleepRhythmRecordListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmRecordButtonClick(1);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        SleepRhythmExtKt.checkDeviceSupportEffective(fragmentActivityRequireActivity, new Function1() { // from class: gvm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRecordListFragment.onViewCreated$lambda$1$lambda$0(this.f19376a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(SleepRhythmRecordListFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            BaseFragmentExKt.gotoPage(this$0, SleepRhythmMonitorSettingFragment.class, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SleepRhythmRecordListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTrackHelper.INSTANCE.trackSleepRhythmRecordButtonClick(2);
        this$0.onDealRecordJournal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(SleepRhythmRecordListFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter = this$0.recordAdapter;
        if (sleepRhythmRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAdapter");
            sleepRhythmRecordsAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        sleepRhythmRecordsAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(SleepRhythmRecordListFragment this$0, SleepDiaryReport sleepDiaryReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "queryLatestSleepDiary " + sleepDiaryReport);
        this$0.hasDiaryReport = sleepDiaryReport != null;
        this$0.refreshView();
        SleepRhythmRecordsAdapter sleepRhythmRecordsAdapter = this$0.recordAdapter;
        if (sleepRhythmRecordsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordAdapter");
            sleepRhythmRecordsAdapter = null;
        }
        sleepRhythmRecordsAdapter.refresh();
        return Unit.INSTANCE;
    }

    private final void refreshView() {
        RecyclerView recyclerView = this.recordRecyclerView;
        TextView textView = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recordRecyclerView");
            recyclerView = null;
        }
        boolean z = false;
        ViewExtKt.setVisible(recyclerView, this.hasDiaryReport && this.hasRhythmReport);
        TextView textView2 = this.tvNoData;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvNoData");
            textView2 = null;
        }
        ViewExtKt.setVisible(textView2, (this.hasDiaryReport && this.hasRhythmReport) ? false : true);
        TextView textView3 = this.tvOpenMonitor;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvOpenMonitor");
            textView3 = null;
        }
        ViewExtKt.setVisible(textView3, !this.hasRhythmReport);
        TextView textView4 = this.tvRecordJournal;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRecordJournal");
        } else {
            textView = textView4;
        }
        if (!this.hasDiaryReport && this.hasRhythmReport) {
            z = true;
        }
        ViewExtKt.setVisible(textView, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.ti);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitleBackground(iji.T2);
        this.tvNoData = ((mca) getMBinding()).B;
        this.tvRecordJournal = ((mca) getMBinding()).D;
        TextView textView = ((mca) getMBinding()).C;
        this.tvOpenMonitor = textView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvOpenMonitor");
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: cvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepRhythmRecordListFragment.onViewCreated$lambda$1(this.f14776a, view2);
            }
        });
        TextView textView3 = this.tvRecordJournal;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvRecordJournal");
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: dvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SleepRhythmRecordListFragment.onViewCreated$lambda$2(this.f15976a, view2);
            }
        });
        this.recordRecyclerView = ((mca) getMBinding()).A;
        initRecyclerView();
        ((SleepRhythmMonitorViewModel) getMViewModel()).queryAllSleepRhythmRecordsLiveData().observe(getViewLifecycleOwner(), new SleepRhythmRecordListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: evm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRecordListFragment.onViewCreated$lambda$3(this.f17113a, (PagingData) obj);
            }
        }));
        ((SleepRhythmMonitorViewModel) getMViewModel()).queryLatestSleepDiaryLiveData().observe(getViewLifecycleOwner(), new SleepRhythmRecordListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fvm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmRecordListFragment.onViewCreated$lambda$4(this.f18299a, (SleepDiaryReport) obj);
            }
        }));
    }
}
