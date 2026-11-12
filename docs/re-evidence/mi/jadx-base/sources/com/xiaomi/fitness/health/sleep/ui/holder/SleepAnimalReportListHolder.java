package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalInsightReport;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.azb;
import defpackage.c0j;
import defpackage.czb;
import defpackage.kyb;
import defpackage.ni4;
import defpackage.pni;
import defpackage.uyb;
import defpackage.wyb;
import defpackage.yyb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 J2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bH\u0010IJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\r\u001a\u00020\u00022\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010+\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalReportListHolder;", "", "", "initHolder", "()V", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "insightReport", "refreshSleepView", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;)V", "", "", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalIndicator;", "map", "onUpdateAnimalInsightReport", "(Ljava/util/Map;)V", "showExampleReportView", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "requestAnimal", "updateAnimalReport", "(Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;)V", LifecycleConstantKt.ON_RESUME, "", "switch", "updatePressureSwitchStatus", "(Ljava/lang/Boolean;)V", "Lkyb;", "binding", "Lkyb;", "getBinding", "()Lkyb;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;", "sleepInsightInterface", "Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;", "", "animalType", "I", "getAnimalType$annotations", "", "", "sampleDateList", "Ljava/util/List;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/view/View;", "topTitleView", "Landroid/view/View;", "Landroid/widget/TextView;", "topTitleLabel", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "topTitleIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/LinearLayout;", "layoutContent", "Landroid/widget/LinearLayout;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightScheduleHolder;", "scheduleHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightScheduleHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightContinuityHolder;", "continuityHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightContinuityHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightDayNapHolder;", "dayNapHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightDayNapHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStressHolder;", "stressHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStressHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStrengthHolder;", "strengthHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInsightStrengthHolder;", "<init>", "(Lkyb;Lcom/xiaomi/fitness/health/sleep/ui/holder/ISleepInsight;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepAnimalReportListHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalReportListHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalReportListHolder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n216#2,2:120\n*S KotlinDebug\n*F\n+ 1 SleepAnimalReportListHolder.kt\ncom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalReportListHolder\n*L\n61#1:120,2\n*E\n"})
public final class SleepAnimalReportListHolder {

    @NotNull
    public static final String TAG = "SleepAnimalReportListHolder";
    private int animalType;

    @NotNull
    private final kyb binding;
    private final Context context;
    private SleepInsightContinuityHolder continuityHolder;
    private SleepInsightDayNapHolder dayNapHolder;

    @NotNull
    private final LinearLayout layoutContent;

    @NotNull
    private List<Long> sampleDateList;
    private SleepInsightScheduleHolder scheduleHolder;

    @NotNull
    private final ISleepInsight sleepInsightInterface;
    private SleepInsightStrengthHolder strengthHolder;
    private SleepInsightStressHolder stressHolder;

    @NotNull
    private final AppCompatImageView topTitleIcon;

    @NotNull
    private final TextView topTitleLabel;

    @NotNull
    private final View topTitleView;

    public SleepAnimalReportListHolder(@NotNull kyb binding, @NotNull ISleepInsight sleepInsightInterface) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(sleepInsightInterface, "sleepInsightInterface");
        this.binding = binding;
        this.sleepInsightInterface = sleepInsightInterface;
        this.sampleDateList = new ArrayList();
        Context context = binding.getRoot().getContext();
        this.context = context;
        View root = binding.G.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.topTitleView = root;
        TextView tvLabel = binding.G.B;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        this.topTitleLabel = tvLabel;
        AppCompatImageView ivIcon = binding.G.A;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        this.topTitleIcon = ivIcon;
        LinearLayout llContent = binding.H;
        Intrinsics.checkNotNullExpressionValue(llContent, "llContent");
        this.layoutContent = llContent;
        ivIcon.setBackground(ni4.e(context, pni.x));
        tvLabel.setText(context.getString(c0j.Yf));
        tvLabel.setTextSize(18.0f);
        initHolder();
    }

    @SleepAnimalType
    private static /* synthetic */ void getAnimalType$annotations() {
    }

    private final void initHolder() {
        yyb layoutAnimalReportSchedule = this.binding.D;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportSchedule, "layoutAnimalReportSchedule");
        this.scheduleHolder = new SleepInsightScheduleHolder(layoutAnimalReportSchedule);
        uyb layoutAnimalReportContinuity = this.binding.B;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportContinuity, "layoutAnimalReportContinuity");
        this.continuityHolder = new SleepInsightContinuityHolder(layoutAnimalReportContinuity);
        wyb layoutAnimalReportDayNap = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportDayNap, "layoutAnimalReportDayNap");
        this.dayNapHolder = new SleepInsightDayNapHolder(layoutAnimalReportDayNap);
        czb layoutAnimalReportStress = this.binding.F;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportStress, "layoutAnimalReportStress");
        this.stressHolder = new SleepInsightStressHolder(layoutAnimalReportStress, this.sleepInsightInterface);
        azb layoutAnimalReportStrength = this.binding.E;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportStrength, "layoutAnimalReportStrength");
        this.strengthHolder = new SleepInsightStrengthHolder(layoutAnimalReportStrength);
    }

    private final void refreshSleepView(SleepAnimalInsightReport insightReport) {
        SleepInsightScheduleHolder sleepInsightScheduleHolder = this.scheduleHolder;
        SleepInsightDayNapHolder sleepInsightDayNapHolder = null;
        if (sleepInsightScheduleHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleHolder");
            sleepInsightScheduleHolder = null;
        }
        sleepInsightScheduleHolder.refreshSleepSchedule(this.animalType, this.sampleDateList, insightReport.getScheduleMap());
        SleepInsightContinuityHolder sleepInsightContinuityHolder = this.continuityHolder;
        if (sleepInsightContinuityHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("continuityHolder");
            sleepInsightContinuityHolder = null;
        }
        sleepInsightContinuityHolder.refreshSleepContinuity(this.animalType, this.sampleDateList, insightReport.getAwakeCountMap());
        SleepInsightDayNapHolder sleepInsightDayNapHolder2 = this.dayNapHolder;
        if (sleepInsightDayNapHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dayNapHolder");
        } else {
            sleepInsightDayNapHolder = sleepInsightDayNapHolder2;
        }
        sleepInsightDayNapHolder.refreshSleepDayNap(this.sampleDateList, insightReport.getNapMap());
    }

    @NotNull
    public final kyb getBinding() {
        return this.binding;
    }

    public final void onResume() {
        SleepInsightStressHolder sleepInsightStressHolder = this.stressHolder;
        if (sleepInsightStressHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stressHolder");
            sleepInsightStressHolder = null;
        }
        sleepInsightStressHolder.onResume();
    }

    public final void onUpdateAnimalInsightReport(@NotNull Map<String, SleepAnimalInsightReport> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Logger.i(TAG, "onUpdateAnimalReport " + map);
        for (Map.Entry<String, SleepAnimalInsightReport> entry : map.entrySet()) {
            SleepAnimalInsightReport value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            SleepInsightStrengthHolder sleepInsightStrengthHolder = null;
            SleepInsightStressHolder sleepInsightStressHolder = null;
            if (iHashCode != -1899857596) {
                if (iHashCode != 994274193) {
                    if (iHashCode == 1791526567 && key.equals("sleep_indicator")) {
                        refreshSleepView(value);
                    }
                } else if (key.equals("strength_indicator")) {
                    SleepInsightStrengthHolder sleepInsightStrengthHolder2 = this.strengthHolder;
                    if (sleepInsightStrengthHolder2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("strengthHolder");
                    } else {
                        sleepInsightStrengthHolder = sleepInsightStrengthHolder2;
                    }
                    sleepInsightStrengthHolder.refreshSleepStrength(this.sampleDateList, value.getStrengthMap());
                }
            } else if (key.equals("stress_indicator")) {
                SleepInsightStressHolder sleepInsightStressHolder2 = this.stressHolder;
                if (sleepInsightStressHolder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stressHolder");
                } else {
                    sleepInsightStressHolder = sleepInsightStressHolder2;
                }
                sleepInsightStressHolder.refreshSleepStress(this.sampleDateList, value.getStressMap());
            }
        }
    }

    public final void showExampleReportView() {
        this.topTitleLabel.setText(this.context.getString(c0j.Zf));
        this.layoutContent.setAlpha(0.4f);
        this.topTitleView.setAlpha(0.8f);
        SleepInsightScheduleHolder sleepInsightScheduleHolder = this.scheduleHolder;
        SleepInsightStrengthHolder sleepInsightStrengthHolder = null;
        if (sleepInsightScheduleHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scheduleHolder");
            sleepInsightScheduleHolder = null;
        }
        sleepInsightScheduleHolder.showExampleReportView();
        SleepInsightContinuityHolder sleepInsightContinuityHolder = this.continuityHolder;
        if (sleepInsightContinuityHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("continuityHolder");
            sleepInsightContinuityHolder = null;
        }
        sleepInsightContinuityHolder.showExampleReportView();
        SleepInsightDayNapHolder sleepInsightDayNapHolder = this.dayNapHolder;
        if (sleepInsightDayNapHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dayNapHolder");
            sleepInsightDayNapHolder = null;
        }
        sleepInsightDayNapHolder.showExampleReportView();
        SleepInsightStressHolder sleepInsightStressHolder = this.stressHolder;
        if (sleepInsightStressHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stressHolder");
            sleepInsightStressHolder = null;
        }
        sleepInsightStressHolder.showExampleReportView();
        SleepInsightStrengthHolder sleepInsightStrengthHolder2 = this.strengthHolder;
        if (sleepInsightStrengthHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("strengthHolder");
        } else {
            sleepInsightStrengthHolder = sleepInsightStrengthHolder2;
        }
        sleepInsightStrengthHolder.showExampleReportView();
    }

    public final void updateAnimalReport(@NotNull SleepAnimalReport requestAnimal) {
        Intrinsics.checkNotNullParameter(requestAnimal, "requestAnimal");
        AnimalInfo animal = requestAnimal.getAnimal();
        this.animalType = animal != null ? animal.getType() : 0;
        this.sampleDateList.clear();
        this.sampleDateList.addAll(requestAnimal.getSampleDates());
    }

    public final void updatePressureSwitchStatus(@Nullable Boolean bool) {
        SleepInsightStressHolder sleepInsightStressHolder = this.stressHolder;
        if (sleepInsightStressHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stressHolder");
            sleepInsightStressHolder = null;
        }
        sleepInsightStressHolder.onPressureOpenStatusUpdate(bool);
    }
}
