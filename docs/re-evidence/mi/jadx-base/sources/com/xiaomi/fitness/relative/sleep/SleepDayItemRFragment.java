package com.xiaomi.fitness.relative.sleep;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.auto.start.AutoStarterImpl;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepPermissionSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference;
import com.xiaomi.fitness.health.sleep.ui.setting.util.SleepPermissionSettingUtil;
import com.xiaomi.fitness.relative.base.BasicRelativeDataViewModel;
import com.xiaomi.fitness.relative.sleep.SleepDayItemRFragment;
import com.xiaomi.fitness.relative.sleep.sleepadapter.SleepDayRDetailAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k0n;
import defpackage.qba;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001=B\u0007¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J#\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/relative/sleep/SleepDayItemRFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "Lqba;", "", "initPermissionInstructionView", "()V", "updateSleepPermissionSettingInstruction", "initView", "Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "result", "refreshView", "(Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "", "currentPosition", "Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "currentLocalDate", "Lorg/joda/time/LocalDate;", "Landroidx/recyclerview/widget/RecyclerView;", "sleepRecordRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/relative/sleep/sleepadapter/SleepDayRDetailAdapter;", "sleepDayDetailAdapter", "Lcom/xiaomi/fitness/relative/sleep/sleepadapter/SleepDayRDetailAdapter;", "Lk0n;", "sleepTotalDurationEvaluationHolder", "Lk0n;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "containerView", "Landroid/view/View;", "permSettingInstView", "Landroid/widget/TextView;", "permSettingInstTv", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "closePermSettingCross", "Landroidx/appcompat/widget/AppCompatImageView;", "", "relativeUid", "J", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDayItemRFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayItemRFragment.kt\ncom/xiaomi/fitness/relative/sleep/SleepDayItemRFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class SleepDayItemRFragment extends Hilt_SleepDayItemRFragment<BasicRelativeDataViewModel, qba> {

    @NotNull
    public static final String TAG = "SleepDayItemFragment";

    @Nullable
    private AllDaySleepReport allDaySleepReport;
    private AppCompatImageView closePermSettingCross;

    @Nullable
    private View containerView;

    @Nullable
    private LocalDate currentLocalDate;

    @Nullable
    private Integer currentPosition;
    private TextView permSettingInstTv;
    private View permSettingInstView;
    private long relativeUid = -1;
    private SleepDayRDetailAdapter sleepDayDetailAdapter;
    private RecyclerView sleepRecordRecyclerView;
    private k0n sleepTotalDurationEvaluationHolder;

    /* JADX INFO: renamed from: com.xiaomi.fitness.relative.sleep.SleepDayItemRFragment$onViewCreated$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<CloudDataResult<List<? extends DailyBasicReport>>, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, SleepDayItemRFragment.class, "refreshView", "refreshView(Lcom/xiaomi/fit/fitness/export/data/CloudDataResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(CloudDataResult<List<? extends DailyBasicReport>> cloudDataResult) {
            invoke2((CloudDataResult<List<DailyBasicReport>>) cloudDataResult);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CloudDataResult<List<DailyBasicReport>> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SleepDayItemRFragment) this.receiver).refreshView(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPermissionInstructionView() {
        View view = ((qba) getMBinding()).E;
        this.permSettingInstView = view;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view = null;
        }
        this.permSettingInstTv = (TextView) view.findViewById(eri.a8);
        View view3 = this.permSettingInstView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
        } else {
            view2 = view3;
        }
        this.closePermSettingCross = (AppCompatImageView) view2.findViewById(eri.P1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        this.containerView = ((qba) getMBinding()).B;
        setActionBarDisplayable(false);
        this.sleepTotalDurationEvaluationHolder = new k0n(((qba) getMBinding()).A.A, 0);
        this.sleepRecordRecyclerView = ((qba) getMBinding()).D;
        this.sleepDayDetailAdapter = new SleepDayRDetailAdapter();
        RecyclerView recyclerView = this.sleepRecordRecyclerView;
        SleepDayRDetailAdapter sleepDayRDetailAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.sleepRecordRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView2 = null;
        }
        SleepDayRDetailAdapter sleepDayRDetailAdapter2 = this.sleepDayDetailAdapter;
        if (sleepDayRDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
        } else {
            sleepDayRDetailAdapter = sleepDayRDetailAdapter2;
        }
        recyclerView2.setAdapter(sleepDayRDetailAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshView(CloudDataResult<List<DailyBasicReport>> result) {
        Logger.i("MiHealth", "Sleep day onReportResult refreshView");
        RecyclerView recyclerView = null;
        SleepDayRDetailAdapter sleepDayRDetailAdapter = null;
        if (result.getData() == null || ArrayUtils.isEmpty(result.getData())) {
            k0n k0nVar = this.sleepTotalDurationEvaluationHolder;
            if (k0nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepTotalDurationEvaluationHolder");
                k0nVar = null;
            }
            k0nVar.j(null);
            LinearLayout layoutSleepEvaluation = ((qba) getMBinding()).A.A;
            Intrinsics.checkNotNullExpressionValue(layoutSleepEvaluation, "layoutSleepEvaluation");
            ViewExtKt.setVisible(layoutSleepEvaluation, false);
            if (result.isOutSharedData()) {
                ((qba) getMBinding()).C.setText(getString(c0j.I4));
            }
            TextView dataTitleView = ((qba) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(dataTitleView, "dataTitleView");
            ViewExtKt.setVisible(dataTitleView, true);
            RecyclerView recyclerView2 = this.sleepRecordRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        List<DailyBasicReport> data = result.getData();
        Intrinsics.checkNotNull(data);
        for (DailyBasicReport dailyBasicReport : data) {
            if (dailyBasicReport instanceof AllDaySleepReport) {
                this.allDaySleepReport = (AllDaySleepReport) dailyBasicReport;
            }
        }
        TextView dataTitleView2 = ((qba) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(dataTitleView2, "dataTitleView");
        ViewExtKt.setVisible(dataTitleView2, false);
        RecyclerView recyclerView3 = this.sleepRecordRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepRecordRecyclerView");
            recyclerView3 = null;
        }
        ViewExtKt.setVisible(recyclerView3, true);
        k0n k0nVar2 = this.sleepTotalDurationEvaluationHolder;
        if (k0nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepTotalDurationEvaluationHolder");
            k0nVar2 = null;
        }
        k0nVar2.j(this.allDaySleepReport);
        SleepDayRDetailAdapter sleepDayRDetailAdapter2 = this.sleepDayDetailAdapter;
        if (sleepDayRDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sleepDayDetailAdapter");
        } else {
            sleepDayRDetailAdapter = sleepDayRDetailAdapter2;
        }
        sleepDayRDetailAdapter.updateAllDaySleepReport(this.allDaySleepReport);
    }

    private final void updateSleepPermissionSettingInstruction() {
        View view = null;
        if (!RomUtils.isXiaomi()) {
            View view2 = this.permSettingInstView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            } else {
                view = view2;
            }
            ExtUtilKt.gone(view);
            return;
        }
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
        if (sleepTracePermissionGuidePreference.getCLOSE_COUNT() == 1 && TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), sleepTracePermissionGuidePreference.getFIRST_TIME_CLOSED_TIMESTAMP())) {
            View view3 = this.permSettingInstView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            } else {
                view = view3;
            }
            ExtUtilKt.gone(view);
            return;
        }
        View view4 = this.permSettingInstView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view4 = null;
        }
        ExtUtilKt.visible(view4);
        SleepPermissionSettingUtil sleepPermissionSettingUtil = SleepPermissionSettingUtil.INSTANCE;
        boolean autoStartEnabled = sleepPermissionSettingUtil.getAutoStartEnabled();
        BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        String packageName = requireContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Boolean boolIsNoRestrictedLevel = backgroundRestrictionUtil.isNoRestrictedLevel(contextRequireContext, packageName);
        boolean zBooleanValue = boolIsNoRestrictedLevel != null ? boolIsNoRestrictedLevel.booleanValue() : false;
        View view5 = this.permSettingInstView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view5 = null;
        }
        TextView textView = this.permSettingInstTv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstTv");
            textView = null;
        }
        sleepPermissionSettingUtil.updateSleepPermissionSettingInstructionCard(view5, textView, Boolean.valueOf(autoStartEnabled), Boolean.valueOf(zBooleanValue));
        AutoStarterImpl autoStarterImpl = AutoStarterImpl.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Logger.i(TAG, "canAutoStart=" + autoStarterImpl.canAutoStart(fragmentActivityRequireActivity));
        View view6 = this.permSettingInstView;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view6 = null;
        }
        view6.setOnClickListener(new View.OnClickListener() { // from class: gkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SleepDayItemRFragment.updateSleepPermissionSettingInstruction$lambda$2(this.f19088a, view7);
            }
        });
        AppCompatImageView appCompatImageView = this.closePermSettingCross;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closePermSettingCross");
        } else {
            view = appCompatImageView;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: hkm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SleepDayItemRFragment.updateSleepPermissionSettingInstruction$lambda$3(this.f20171a, view7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepPermissionSettingInstruction$lambda$2(SleepDayItemRFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, SleepPermissionSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepPermissionSettingInstruction$lambda$3(SleepDayItemRFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = SleepTracePermissionGuidePreference.INSTANCE;
        sleepTracePermissionGuidePreference.setCLOSE_COUNT(sleepTracePermissionGuidePreference.getCLOSE_COUNT() + 1);
        if (sleepTracePermissionGuidePreference.getCLOSE_COUNT() == 1) {
            sleepTracePermissionGuidePreference.setFIRST_TIME_CLOSED_TIMESTAMP(System.currentTimeMillis());
        }
        View view2 = this$0.permSettingInstView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSettingInstView");
            view2 = null;
        }
        ExtUtilKt.gone(view2);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.L0;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LiveDataBus.INSTANCE.get().with("stop_media").postValue(Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = this.containerView;
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        LocalDate localDateNow;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        Bundle arguments = getArguments();
        this.currentPosition = arguments != null ? Integer.valueOf(arguments.getInt("offset", 0)) : null;
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("key_relative_uid")) : null;
        Intrinsics.checkNotNull(lValueOf);
        this.relativeUid = lValueOf.longValue();
        Integer num = this.currentPosition;
        if (num != null) {
            localDateNow = LocalDate.now().minusDays(num.intValue());
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        } else {
            localDateNow = LocalDate.now();
        }
        this.currentLocalDate = localDateNow;
        Integer num2 = this.currentPosition;
        StringBuilder sb = new StringBuilder();
        sb.append("mCurrentPosition:");
        sb.append(num2);
        sb.append("-mCurrentDate:");
        sb.append(localDateNow);
        BasicRelativeDataViewModel basicRelativeDataViewModel = (BasicRelativeDataViewModel) getMViewModel();
        LocalDate localDate = this.currentLocalDate;
        Intrinsics.checkNotNull(localDate);
        basicRelativeDataViewModel.triggerFetchFitnessReport(ISleepRepository.class, "days", TimeDateUtil.changZeroOfTheDay(localDate), 0, 0, this.relativeUid).observe(getViewLifecycleOwner(), new SleepDayItemRFragment$sam$androidx_lifecycle_Observer$0(new AnonymousClass3(this)));
        initPermissionInstructionView();
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }
}
