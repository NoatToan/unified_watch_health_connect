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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "numberOfEachGroup", "", "", "getNumberOfEachGroup", "()Ljava/util/List;", "restDuration", "", "", "getRestDuration", "()[Ljava/lang/String;", "numberOfTrainingGroups", "getNumberOfTrainingGroups", "intervalNumberData", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalNumberData;", "getIntervalNumberData", "()Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalNumberData;", "setIntervalNumberData", "(Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalNumberData;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getNumberData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntervalTrainingNumberVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTrainingNumberVM.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberVM\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,81:1\n37#2:82\n36#2,3:83\n*S KotlinDebug\n*F\n+ 1 IntervalTrainingNumberVM.kt\ncom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberVM\n*L\n47#1:82\n47#1:83,3\n*E\n"})
public final class IntervalTrainingNumberVM extends AbsViewModel {

    @NotNull
    private final List<Integer> numberOfTrainingGroups = CollectionsKt___CollectionsKt.toList(new IntRange(2, 10));

    @NotNull
    private IntervalNumberData intervalNumberData = new IntervalNumberData(0, 0, 0, 7, null);

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        String key_interval_number_value = IntervalTrainingPreference.INSTANCE.getKEY_INTERVAL_NUMBER_VALUE();
        Logger.i("IntervalTrainingNumberVM", "attach() intervalNumberValue = " + key_interval_number_value);
        if (TextUtils.isEmpty(key_interval_number_value)) {
            return;
        }
        Object objF = xpd.f(key_interval_number_value, IntervalNumberData.class);
        Intrinsics.checkNotNull(objF);
        this.intervalNumberData = (IntervalNumberData) objF;
    }

    @NotNull
    public final IntervalNumberData getIntervalNumberData() {
        return this.intervalNumberData;
    }

    @NotNull
    public final List<IntervalSportTarget> getNumberData() {
        ArrayList arrayList = new ArrayList();
        int defaultGroup = this.intervalNumberData.getDefaultGroup();
        for (int i = 0; i < defaultGroup; i++) {
            IntervalSportTarget intervalSportTarget = new IntervalSportTarget();
            SportTarget sportTarget = new SportTarget();
            sportTarget.setType(6);
            sportTarget.setValue(this.intervalNumberData.getDefaultNumber());
            intervalSportTarget.setSportTarget(sportTarget);
            intervalSportTarget.setRestDuration(this.intervalNumberData.getDefaultRestDuration());
            arrayList.add(intervalSportTarget);
        }
        return arrayList;
    }

    @NotNull
    public final List<Integer> getNumberOfEachGroup() {
        ArrayList arrayList = new ArrayList();
        int i = 40;
        while (i < 200) {
            i += 10;
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
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

    public final void setIntervalNumberData(@NotNull IntervalNumberData intervalNumberData) {
        Intrinsics.checkNotNullParameter(intervalNumberData, "<set-?>");
        this.intervalNumberData = intervalNumberData;
    }
}
