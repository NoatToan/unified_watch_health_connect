package com.xiaomi.fitness.sport_eco.view.interval;

import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "durationOfEachGroup", "", "", "getDurationOfEachGroup", "()[Ljava/lang/String;", "restDuration", "getRestDuration", "numberOfTrainingGroups", "", "", "getNumberOfTrainingGroups", "()Ljava/util/List;", "intervalDurationData", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalDurationData;", "getIntervalDurationData", "()Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalDurationData;", "setIntervalDurationData", "(Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalDurationData;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getDurationData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntervalTrainingDurationVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTrainingDurationVM.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationVM\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2:90\n36#2,3:91\n37#2:94\n36#2,3:95\n*S KotlinDebug\n*F\n+ 1 IntervalTrainingDurationVM.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationVM\n*L\n34#1:90\n34#1:91,3\n55#1:94\n55#1:95,3\n*E\n"})
public final class IntervalTrainingDurationVM extends AbsViewModel {

    @NotNull
    private final List<Integer> numberOfTrainingGroups = CollectionsKt___CollectionsKt.toList(new IntRange(2, 10));

    @NotNull
    private IntervalDurationData intervalDurationData = new IntervalDurationData(0, 0, 0, 7, null);

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        String key_interval_duration_value = IntervalTrainingPreference.INSTANCE.getKEY_INTERVAL_DURATION_VALUE();
        Logger.i("IntervalTrainingDurationVM", "attach() intervalDurationValue = " + key_interval_duration_value);
        if (TextUtils.isEmpty(key_interval_duration_value)) {
            return;
        }
        Object objF = xpd.f(key_interval_duration_value, IntervalDurationData.class);
        Intrinsics.checkNotNull(objF);
        this.intervalDurationData = (IntervalDurationData) objF;
    }

    @NotNull
    public final List<IntervalSportTarget> getDurationData() {
        ArrayList arrayList = new ArrayList();
        int defaultGroup = this.intervalDurationData.getDefaultGroup();
        for (int i = 0; i < defaultGroup; i++) {
            IntervalSportTarget intervalSportTarget = new IntervalSportTarget();
            SportTarget sportTarget = new SportTarget();
            sportTarget.setType(1);
            sportTarget.setValue(this.intervalDurationData.getDefaultGroupDuration());
            intervalSportTarget.setSportTarget(sportTarget);
            intervalSportTarget.setRestDuration(this.intervalDurationData.getDefaultRestDuration());
            arrayList.add(intervalSportTarget);
        }
        return arrayList;
    }

    @NotNull
    public final String[] getDurationOfEachGroup() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 10;
        while (i < 3) {
            i2 += 10;
            if (i2 >= 60) {
                i++;
                i2 = 0;
            }
            String str = "";
            String str2 = i >= 10 ? "" : "0";
            if (i2 < 10) {
                str = "0";
            }
            arrayList.add("00:" + str2 + i + ":" + str + i2);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public final IntervalDurationData getIntervalDurationData() {
        return this.intervalDurationData;
    }

    @NotNull
    public final List<Integer> getNumberOfTrainingGroups() {
        return this.numberOfTrainingGroups;
    }

    @NotNull
    public final String[] getRestDuration() {
        ArrayList arrayList = new ArrayList();
        int i = 9;
        int i2 = 0;
        while (i2 < 1) {
            i++;
            if (i >= 60) {
                i2++;
                i = 0;
            }
            String str = "";
            String str2 = i2 >= 10 ? "" : "0";
            if (i < 10) {
                str = "0";
            }
            arrayList.add("00:" + str2 + i2 + ":" + str + i);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void setIntervalDurationData(@NotNull IntervalDurationData intervalDurationData) {
        Intrinsics.checkNotNullParameter(intervalDurationData, "<set-?>");
        this.intervalDurationData = intervalDurationData;
    }
}
