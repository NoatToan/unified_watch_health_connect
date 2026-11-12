package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailDiaryListView;
import defpackage.c0j;
import defpackage.gzb;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "sleepDiaryReports", "", "startTime", "", "cycleDay", "", "updateDiaryView", "(Ljava/util/List;JI)V", "Lgzb;", "mBinding", "Lgzb;", "getMBinding", "()Lgzb;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;", "mSleepRhythmDiaryListAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmDiaryListAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;", "mSleepRhythmDiaryListAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmDetailDiaryListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmDetailDiaryListView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryListView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n774#2:86\n865#2,2:87\n1053#2:89\n*S KotlinDebug\n*F\n+ 1 SleepRhythmDetailDiaryListView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryListView\n*L\n37#1:86\n37#1:87,2\n44#1:89\n*E\n"})
public final class SleepRhythmDetailDiaryListView extends ConstraintLayout {

    @NotNull
    private final gzb mBinding;

    /* JADX INFO: renamed from: mSleepRhythmDiaryListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmDiaryListAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryListView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SleepRhythmDiaryListAdapter getMSleepRhythmDiaryListAdapter() {
        return (SleepRhythmDiaryListAdapter) this.mSleepRhythmDiaryListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmDiaryListAdapter mSleepRhythmDiaryListAdapter_delegate$lambda$0() {
        return new SleepRhythmDiaryListAdapter(new ArrayList());
    }

    @NotNull
    public final gzb getMBinding() {
        return this.mBinding;
    }

    public final void updateDiaryView(@NotNull List<SleepDiaryReport> sleepDiaryReports, long startTime, int cycleDay) {
        Intrinsics.checkNotNullParameter(sleepDiaryReports, "sleepDiaryReports");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sleepDiaryReports) {
            SleepDiaryReport sleepDiaryReport = (SleepDiaryReport) obj;
            if (sleepDiaryReport.getTime() != startTime + (((long) (cycleDay + 1)) * 86400) && sleepDiaryReport.getTime() != startTime + (((long) cycleDay) * 86400)) {
                arrayList.add(obj);
            }
        }
        this.mBinding.A.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.mBinding.A.setAdapter(getMSleepRhythmDiaryListAdapter());
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailDiaryListView$updateDiaryView$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepDiaryReport) t).getTime()), Long.valueOf(((SleepDiaryReport) t2).getTime()));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() - 1;
        while (-1 < size) {
            SleepDiaryReport sleepDiaryReport2 = (SleepDiaryReport) arrayList.get(size);
            long time = sleepDiaryReport2.getTime();
            List<SleepNapSituation> napSituation = sleepDiaryReport2.getNapSituation();
            List<SleepMedicationDetail> medicationBeforeBedtime = sleepDiaryReport2.getMedicationBeforeBedtime();
            Long preSleepRoutineTime = sleepDiaryReport2.getPreSleepRoutineTime();
            Integer fallAsleepDuration = sleepDiaryReport2.getFallAsleepDuration();
            Integer awakeCount = sleepDiaryReport2.getAwakeCount();
            List<Integer> fallAsleepAgainDuration = sleepDiaryReport2.getFallAsleepAgainDuration();
            Long morningWakeUpTime = sleepDiaryReport2.getMorningWakeUpTime();
            Long morningGettingUpTime = sleepDiaryReport2.getMorningGettingUpTime();
            ArrayList arrayList3 = arrayList;
            Integer insomniaDifficulty = sleepDiaryReport2.getInsomniaDifficulty();
            Integer sleepQuality = sleepDiaryReport2.getSleepQuality();
            StringBuilder sb = new StringBuilder();
            int i = size;
            sb.append("getSleepDiaryReport = ");
            sb.append(time);
            sb.append(" napSituation ");
            sb.append(napSituation);
            sb.append(" medicationBeforeBedtime ");
            sb.append(medicationBeforeBedtime);
            sb.append(" preSleepRoutineTime");
            sb.append(preSleepRoutineTime);
            sb.append(" fallAsleepDuration");
            sb.append(fallAsleepDuration);
            sb.append(" awakeCount");
            sb.append(awakeCount);
            sb.append(" fallAsleepAgainDuration");
            sb.append(fallAsleepAgainDuration);
            sb.append(" morningWakeUpTime");
            sb.append(morningWakeUpTime);
            sb.append(" morningGettingUpTime");
            sb.append(morningGettingUpTime);
            sb.append(" insomniaDifficulty");
            sb.append(insomniaDifficulty);
            sb.append(" sleepQuality");
            sb.append(sleepQuality);
            Logger.i(SleepDiaryUpdateViewModel.TAG, sb.toString());
            List<Integer> fallAsleepAgainDuration2 = sleepDiaryReport2.getFallAsleepAgainDuration();
            sleepDiaryReport2.setAwakeCount(fallAsleepAgainDuration2 != null ? Integer.valueOf(fallAsleepAgainDuration2.size()) : null);
            arrayList2.add(sleepDiaryReport2);
            size = i - 1;
            arrayList = arrayList3;
        }
        List<SleepRhythmDiaryListAdapter.SleepDiaryTransform> listConvertItemList = SleepRhythmHandle.INSTANCE.convertItemList(arrayList2);
        this.mBinding.D.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.f31938a, cycleDay, Integer.valueOf(cycleDay)));
        long j = 1000;
        this.mBinding.C.setText(TimeUtils.formatDate(ApplicationExtKt.getApplication().getString(c0j.l), Long.valueOf(startTime * j)) + "-" + TimeUtils.formatDate(ApplicationExtKt.getApplication().getString(c0j.l), Long.valueOf((startTime + (((long) (cycleDay - 1)) * 86400)) * j)));
        getMSleepRhythmDiaryListAdapter().updateDataList(listConvertItemList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepRhythmDetailDiaryListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        gzb gzbVarA0 = gzb.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(gzbVarA0, "inflate(...)");
        this.mBinding = gzbVarA0;
        this.mSleepRhythmDiaryListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: psm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailDiaryListView.mSleepRhythmDiaryListAdapter_delegate$lambda$0();
            }
        });
    }
}
