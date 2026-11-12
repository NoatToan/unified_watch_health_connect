package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Observer;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmAllFragment;
import defpackage.c0j;
import defpackage.jui;
import defpackage.ovb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmAllFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lovb;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lovb;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "mSleepRhythmChatListAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmChatListAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "mSleepRhythmChatListAdapter", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "mSleepProjectReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "", "getStartTime", "()J", "startTime", "", "getCycleDay", "()I", "cycleDay", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmAllFragment extends Hilt_SleepRhythmAllFragment<SleepRhythmDetailViewModel, ovb> {

    @NotNull
    public static final String PARAM_RHYTHM_REPORT = "rhythm_report";

    @Nullable
    private SleepRhythmReport mSleepProjectReport;

    /* JADX INFO: renamed from: mSleepRhythmChatListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmChatListAdapter;

    public SleepRhythmAllFragment() {
        super(jui.K3);
        this.mSleepRhythmChatListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: prm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmAllFragment.mSleepRhythmChatListAdapter_delegate$lambda$0();
            }
        });
    }

    private final int getCycleDay() {
        SleepRhythmReport sleepRhythmReport = this.mSleepProjectReport;
        if (sleepRhythmReport != null) {
            return sleepRhythmReport.getCycleDay();
        }
        return 1;
    }

    private final SleepRhythmChatListAdapter getMSleepRhythmChatListAdapter() {
        return (SleepRhythmChatListAdapter) this.mSleepRhythmChatListAdapter.getValue();
    }

    private final long getStartTime() {
        SleepRhythmReport sleepRhythmReport = this.mSleepProjectReport;
        if (sleepRhythmReport != null) {
            return sleepRhythmReport.getTime();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmChatListAdapter mSleepRhythmChatListAdapter_delegate$lambda$0() {
        return new SleepRhythmChatListAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$1(SleepRhythmAllFragment this$0, SleepProjectReport sleepProjectReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sleepProjectReport == null) {
            this$0.hideLoading();
            return;
        }
        List<SleepRhythmChatListAdapter.SleepRhythmChartValue> listConvertBasicSleepData = ((SleepRhythmDetailViewModel) this$0.getMViewModel()).convertBasicSleepData(sleepProjectReport, this$0.getStartTime(), this$0.getCycleDay(), false);
        if (listConvertBasicSleepData.isEmpty()) {
            View sleepRhythmChatEmptyView = ((ovb) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmChatEmptyView, "sleepRhythmChatEmptyView");
            ViewExtKt.visible(sleepRhythmChatEmptyView);
            LinearLayoutCompat chatListRootView = ((ovb) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(chatListRootView, "chatListRootView");
            ViewExtKt.gone(chatListRootView);
        } else {
            View sleepRhythmChatEmptyView2 = ((ovb) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(sleepRhythmChatEmptyView2, "sleepRhythmChatEmptyView");
            ViewExtKt.gone(sleepRhythmChatEmptyView2);
            LinearLayoutCompat chatListRootView2 = ((ovb) this$0.getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(chatListRootView2, "chatListRootView");
            ViewExtKt.visible(chatListRootView2);
            this$0.getMSleepRhythmChatListAdapter().updateDataList(listConvertBasicSleepData, this$0.getStartTime(), this$0.getCycleDay());
        }
        this$0.hideLoading();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull ovb ovbVar) {
        Intrinsics.checkNotNullParameter(ovbVar, "<this>");
        ovbVar.B.setAdapter(getMSleepRhythmChatListAdapter());
        ovbVar.B.addItemDecoration(new SleepDiaryUpdateFragment.SpaceItemDecoration());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.mSleepProjectReport = (SleepRhythmReport) (arguments != null ? arguments.getSerializable("report") : null);
        setTitle(getString(c0j.vi));
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        SleepRhythmDetailViewModel sleepRhythmDetailViewModel = (SleepRhythmDetailViewModel) getMViewModel();
        long startTime = getStartTime();
        long startTime2 = getStartTime() + (((long) (getCycleDay() + 1)) * 86400);
        SleepRhythmReport sleepRhythmReport = this.mSleepProjectReport;
        sleepRhythmDetailViewModel.requestRhythmData(startTime, startTime2, sleepRhythmReport != null ? sleepRhythmReport.getSid() : null);
        ((SleepRhythmDetailViewModel) getMViewModel()).getLocalSleepRhythmDiaryInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: qrm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepRhythmAllFragment.onViewCreated$lambda$1(this.f31779a, (SleepProjectReport) obj);
            }
        });
    }
}
