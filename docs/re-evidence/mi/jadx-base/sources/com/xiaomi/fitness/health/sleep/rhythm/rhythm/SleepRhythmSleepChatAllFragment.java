package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Observer;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmSleepChatAllFragment;
import defpackage.c0j;
import defpackage.jui;
import defpackage.qvb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepChatAllFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lqvb;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lqvb;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "mSleepRhythmSleepItemAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmSleepItemAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "mSleepRhythmSleepItemAdapter", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "mSleepProjectReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "", "getStartTime", "()J", "startTime", "", "getCycleDay", "()I", "cycleDay", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmSleepChatAllFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmSleepChatAllFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepChatAllFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n216#2:95\n217#2:98\n1863#3,2:96\n1010#3,2:99\n*S KotlinDebug\n*F\n+ 1 SleepRhythmSleepChatAllFragment.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepChatAllFragment\n*L\n54#1:95\n54#1:98\n55#1:96,2\n63#1:99,2\n*E\n"})
public final class SleepRhythmSleepChatAllFragment extends Hilt_SleepRhythmSleepChatAllFragment<SleepRhythmDetailViewModel, qvb> {

    @NotNull
    public static final String PARAM_RHYTHM_REPORT = "rhythm_report";

    @Nullable
    private SleepRhythmReport mSleepProjectReport;

    /* JADX INFO: renamed from: mSleepRhythmSleepItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmSleepItemAdapter;

    public SleepRhythmSleepChatAllFragment() {
        super(jui.L3);
        this.mSleepRhythmSleepItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pvm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmSleepChatAllFragment.mSleepRhythmSleepItemAdapter_delegate$lambda$0();
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

    private final SleepRhythmSleepItemAdapter getMSleepRhythmSleepItemAdapter() {
        return (SleepRhythmSleepItemAdapter) this.mSleepRhythmSleepItemAdapter.getValue();
    }

    private final long getStartTime() {
        SleepRhythmReport sleepRhythmReport = this.mSleepProjectReport;
        if (sleepRhythmReport != null) {
            return sleepRhythmReport.getTime();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSleepItemAdapter mSleepRhythmSleepItemAdapter_delegate$lambda$0() {
        return new SleepRhythmSleepItemAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$4(SleepRhythmSleepChatAllFragment this$0, SleepProjectReport sleepProjectReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sleepProjectReport == null) {
            this$0.hideLoading();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Map<Long, List<SleepSegmentReport>> sleepReport = sleepProjectReport.getSleepReport();
        if (sleepReport != null && !sleepReport.isEmpty()) {
            Map<Long, List<SleepSegmentReport>> sleepReport2 = sleepProjectReport.getSleepReport();
            Intrinsics.checkNotNull(sleepReport2);
            for (Map.Entry<Long, List<SleepSegmentReport>> entry : sleepReport2.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                for (SleepSegmentReport sleepSegmentReport : entry.getValue()) {
                    if (sleepSegmentReport.hasStageData()) {
                        arrayList.add(new SleepRhythmSleepItemAdapter.SleepSegmentReportItem(jLongValue, sleepSegmentReport));
                    }
                }
            }
            if (arrayList.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmSleepChatAllFragment$onViewCreated$lambda$4$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t).getTime()), Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t2).getTime()));
                    }
                });
            }
        }
        if (arrayList.isEmpty()) {
            LinearLayoutCompat sleepDetailChatRootView = ((qvb) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatRootView, "sleepDetailChatRootView");
            ViewExtKt.gone(sleepDetailChatRootView);
            View sleepDetailChatEmptyView = ((qvb) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatEmptyView, "sleepDetailChatEmptyView");
            ViewExtKt.visible(sleepDetailChatEmptyView);
        } else {
            LinearLayoutCompat sleepDetailChatRootView2 = ((qvb) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatRootView2, "sleepDetailChatRootView");
            ViewExtKt.visible(sleepDetailChatRootView2);
            View sleepDetailChatEmptyView2 = ((qvb) this$0.getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(sleepDetailChatEmptyView2, "sleepDetailChatEmptyView");
            ViewExtKt.gone(sleepDetailChatEmptyView2);
        }
        this$0.getMSleepRhythmSleepItemAdapter().updateDataList(arrayList, this$0.getStartTime(), this$0.getCycleDay(), false);
        this$0.hideLoading();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull qvb qvbVar) {
        Intrinsics.checkNotNullParameter(qvbVar, "<this>");
        qvbVar.D.setAdapter(getMSleepRhythmSleepItemAdapter());
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
        ((SleepRhythmDetailViewModel) getMViewModel()).getLocalSleepRhythmDiaryInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: qvm
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepRhythmSleepChatAllFragment.onViewCreated$lambda$4(this.f31891a, (SleepProjectReport) obj);
            }
        });
    }
}
