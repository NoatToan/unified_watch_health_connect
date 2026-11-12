package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailDiaryView;
import defpackage.c0j;
import defpackage.izb;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "sleepDiaryReport", "", "updateDiaryView", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter;", "mSleepRhythmSleepInDayItemAdapter$delegate", "Lkotlin/Lazy;", "getMSleepRhythmSleepInDayItemAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter;", "mSleepRhythmSleepInDayItemAdapter", "mSleepRhythmMedicationItemAdapter$delegate", "getMSleepRhythmMedicationItemAdapter", "mSleepRhythmMedicationItemAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter;", "mSleepRhythmWakeUpListItemAdapter$delegate", "getMSleepRhythmWakeUpListItemAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmWakeUpListItemAdapter;", "mSleepRhythmWakeUpListItemAdapter", "Lizb;", "mBinding", "Lizb;", "getMBinding", "()Lizb;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepRhythmDetailDiaryView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmDetailDiaryView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1863#2,2:156\n1863#2,2:158\n*S KotlinDebug\n*F\n+ 1 SleepRhythmDetailDiaryView.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailDiaryView\n*L\n49#1:156,2\n72#1:158,2\n*E\n"})
public final class SleepRhythmDetailDiaryView extends ConstraintLayout {

    @NotNull
    private final izb mBinding;

    /* JADX INFO: renamed from: mSleepRhythmMedicationItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmMedicationItemAdapter;

    /* JADX INFO: renamed from: mSleepRhythmSleepInDayItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmSleepInDayItemAdapter;

    /* JADX INFO: renamed from: mSleepRhythmWakeUpListItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepRhythmWakeUpListItemAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final SleepRhythmBaseItemAdapter getMSleepRhythmMedicationItemAdapter() {
        return (SleepRhythmBaseItemAdapter) this.mSleepRhythmMedicationItemAdapter.getValue();
    }

    private final SleepRhythmBaseItemAdapter getMSleepRhythmSleepInDayItemAdapter() {
        return (SleepRhythmBaseItemAdapter) this.mSleepRhythmSleepInDayItemAdapter.getValue();
    }

    private final SleepRhythmWakeUpListItemAdapter getMSleepRhythmWakeUpListItemAdapter() {
        return (SleepRhythmWakeUpListItemAdapter) this.mSleepRhythmWakeUpListItemAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmBaseItemAdapter mSleepRhythmMedicationItemAdapter_delegate$lambda$1() {
        return new SleepRhythmBaseItemAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmBaseItemAdapter mSleepRhythmSleepInDayItemAdapter_delegate$lambda$0() {
        return new SleepRhythmBaseItemAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmWakeUpListItemAdapter mSleepRhythmWakeUpListItemAdapter_delegate$lambda$2() {
        return new SleepRhythmWakeUpListItemAdapter(new ArrayList());
    }

    @NotNull
    public final izb getMBinding() {
        return this.mBinding;
    }

    public final void updateDiaryView(@NotNull SleepDiaryReport sleepDiaryReport) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(sleepDiaryReport, "sleepDiaryReport");
        this.mBinding.I.setAdapter(getMSleepRhythmSleepInDayItemAdapter());
        this.mBinding.G.setAdapter(getMSleepRhythmMedicationItemAdapter());
        this.mBinding.K.setAdapter(getMSleepRhythmWakeUpListItemAdapter());
        ArrayList arrayList = new ArrayList();
        List<SleepNapSituation> napSituation = sleepDiaryReport.getNapSituation();
        if (napSituation == null || napSituation.isEmpty()) {
            arrayList.add(new SleepRhythmBaseItemAdapter.SleepRhythmBaseItem(ResourceExtKt.getString(c0j.vq), ""));
            getMSleepRhythmSleepInDayItemAdapter().updateDataList(arrayList);
        } else {
            List<SleepNapSituation> napSituation2 = sleepDiaryReport.getNapSituation();
            if (napSituation2 != null) {
                for (SleepNapSituation sleepNapSituation : napSituation2) {
                    long j = 1000;
                    arrayList.add(new SleepRhythmBaseItemAdapter.SleepRhythmBaseItem(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepNapSituation.getBedtime() * j)) + "-" + TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepNapSituation.getWakeUpTime() * j)), ""));
                }
            }
            getMSleepRhythmSleepInDayItemAdapter().updateDataList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        List<SleepMedicationDetail> medicationBeforeBedtime = sleepDiaryReport.getMedicationBeforeBedtime();
        if (medicationBeforeBedtime == null || medicationBeforeBedtime.isEmpty()) {
            arrayList2.add(new SleepRhythmBaseItemAdapter.SleepRhythmBaseItem(ResourceExtKt.getString(c0j.uq), ""));
            getMSleepRhythmMedicationItemAdapter().updateDataList(arrayList2);
        } else {
            List<SleepMedicationDetail> medicationBeforeBedtime2 = sleepDiaryReport.getMedicationBeforeBedtime();
            if (medicationBeforeBedtime2 != null) {
                for (SleepMedicationDetail sleepMedicationDetail : medicationBeforeBedtime2) {
                    arrayList2.add(new SleepRhythmBaseItemAdapter.SleepRhythmBaseItem(sleepMedicationDetail.getMedicationName(), TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(sleepMedicationDetail.getMedicationSchedule() * ((long) 1000))) + "," + ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.Y, sleepMedicationDetail.getMedicationCount(), Integer.valueOf(sleepMedicationDetail.getMedicationCount()))));
                }
            }
            getMSleepRhythmMedicationItemAdapter().updateDataList(arrayList2);
        }
        if (sleepDiaryReport.getPreSleepRoutineTime() != null) {
            TextView textView = this.mBinding.F;
            Long preSleepRoutineTime = sleepDiaryReport.getPreSleepRoutineTime();
            Intrinsics.checkNotNull(preSleepRoutineTime);
            textView.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(preSleepRoutineTime.longValue() * ((long) 1000))));
        } else {
            this.mBinding.F.setText(ResourceExtKt.getString(c0j.Pj));
        }
        if (sleepDiaryReport.getFallAsleepDuration() != null) {
            TextView textView2 = this.mBinding.E;
            Resources resources = getResources();
            int i = qxi.R1;
            Integer fallAsleepDuration = sleepDiaryReport.getFallAsleepDuration();
            Intrinsics.checkNotNull(fallAsleepDuration);
            int iIntValue2 = fallAsleepDuration.intValue();
            Integer fallAsleepDuration2 = sleepDiaryReport.getFallAsleepDuration();
            Intrinsics.checkNotNull(fallAsleepDuration2);
            textView2.setText(resources.getQuantityString(i, iIntValue2, fallAsleepDuration2));
        } else {
            this.mBinding.E.setText(ResourceExtKt.getString(c0j.Pj));
        }
        List<Integer> fallAsleepAgainDuration = sleepDiaryReport.getFallAsleepAgainDuration();
        if (fallAsleepAgainDuration == null || fallAsleepAgainDuration.isEmpty()) {
            RecyclerView healthSleepRhythmWakeUpInNightCountRv = this.mBinding.K;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmWakeUpInNightCountRv, "healthSleepRhythmWakeUpInNightCountRv");
            ViewExtKt.gone(healthSleepRhythmWakeUpInNightCountRv);
            getMSleepRhythmWakeUpListItemAdapter().updateDataList(new ArrayList());
        } else {
            RecyclerView healthSleepRhythmWakeUpInNightCountRv2 = this.mBinding.K;
            Intrinsics.checkNotNullExpressionValue(healthSleepRhythmWakeUpInNightCountRv2, "healthSleepRhythmWakeUpInNightCountRv");
            ViewExtKt.visible(healthSleepRhythmWakeUpInNightCountRv2);
            SleepRhythmWakeUpListItemAdapter mSleepRhythmWakeUpListItemAdapter = getMSleepRhythmWakeUpListItemAdapter();
            List<Integer> fallAsleepAgainDuration2 = sleepDiaryReport.getFallAsleepAgainDuration();
            Intrinsics.checkNotNull(fallAsleepAgainDuration2);
            mSleepRhythmWakeUpListItemAdapter.updateDataList(CollectionsKt___CollectionsKt.toMutableList((Collection) fallAsleepAgainDuration2));
        }
        TextView textView3 = this.mBinding.L;
        List<Integer> fallAsleepAgainDuration3 = sleepDiaryReport.getFallAsleepAgainDuration();
        if (fallAsleepAgainDuration3 != null) {
            iIntValue = fallAsleepAgainDuration3.size();
        } else {
            Integer awakeCount = sleepDiaryReport.getAwakeCount();
            iIntValue = awakeCount != null ? awakeCount.intValue() : 0;
        }
        textView3.setText(String.valueOf(iIntValue));
        if (sleepDiaryReport.getMorningWakeUpTime() != null) {
            TextView textView4 = this.mBinding.D;
            Long morningWakeUpTime = sleepDiaryReport.getMorningWakeUpTime();
            Intrinsics.checkNotNull(morningWakeUpTime);
            textView4.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningWakeUpTime.longValue() * ((long) 1000))));
        } else {
            this.mBinding.D.setText(ResourceExtKt.getString(c0j.Pj));
        }
        if (sleepDiaryReport.getMorningGettingUpTime() != null) {
            TextView textView5 = this.mBinding.C;
            Long morningGettingUpTime = sleepDiaryReport.getMorningGettingUpTime();
            Intrinsics.checkNotNull(morningGettingUpTime);
            textView5.setText(TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(morningGettingUpTime.longValue() * ((long) 1000))));
        } else {
            this.mBinding.C.setText(ResourceExtKt.getString(c0j.Pj));
        }
        if (sleepDiaryReport.getInsomniaDifficulty() != null) {
            this.mBinding.A.setText(String.valueOf(sleepDiaryReport.getInsomniaDifficulty()));
        } else {
            this.mBinding.A.setText(ResourceExtKt.getString(c0j.Pj));
        }
        if (sleepDiaryReport.getSleepQuality() != null) {
            this.mBinding.B.setText(String.valueOf(sleepDiaryReport.getSleepQuality()));
        } else {
            this.mBinding.B.setText(ResourceExtKt.getString(c0j.Pj));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SleepRhythmDetailDiaryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SleepRhythmDetailDiaryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mSleepRhythmSleepInDayItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qsm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailDiaryView.mSleepRhythmSleepInDayItemAdapter_delegate$lambda$0();
            }
        });
        this.mSleepRhythmMedicationItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rsm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailDiaryView.mSleepRhythmMedicationItemAdapter_delegate$lambda$1();
            }
        });
        this.mSleepRhythmWakeUpListItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ssm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepRhythmDetailDiaryView.mSleepRhythmWakeUpListItemAdapter_delegate$lambda$2();
            }
        });
        izb izbVarA0 = izb.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(izbVarA0, "inflate(...)");
        this.mBinding = izbVarA0;
    }
}
