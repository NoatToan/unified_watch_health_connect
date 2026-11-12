package com.xiaomi.fitness.sport.view.lockscreen.entity;

import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import defpackage.x7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/entity/SportDataInstance;", "", "Lx7r;", "wearSportData", "Lx7r;", "getWearSportData", "()Lx7r;", "setWearSportData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "getPhoneSportData", "()Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "setPhoneSportData", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", "", "runLockScreen", "Z", "getRunLockScreen", "()Z", "setRunLockScreen", "(Z)V", "", "sportGoalType", "I", "getSportGoalType", "()I", "setSportGoalType", "(I)V", "", "sportGoalValue", "F", "getSportGoalValue", "()F", "setSportGoalValue", "(F)V", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDataInstance {
    private static float sportGoalValue;

    @NotNull
    public static final SportDataInstance INSTANCE = new SportDataInstance();

    @NotNull
    private static x7r wearSportData = new x7r(0, 0, 0, 0, 0);

    @NotNull
    private static PhoneSportData phoneSportData = new PhoneSportData();
    private static boolean runLockScreen = true;
    private static int sportGoalType = -1;

    private SportDataInstance() {
    }

    @NotNull
    public final PhoneSportData getPhoneSportData() {
        return phoneSportData;
    }

    public final boolean getRunLockScreen() {
        return runLockScreen;
    }

    public final int getSportGoalType() {
        return sportGoalType;
    }

    public final float getSportGoalValue() {
        return sportGoalValue;
    }

    @NotNull
    public final x7r getWearSportData() {
        return wearSportData;
    }

    public final void setPhoneSportData(@NotNull PhoneSportData phoneSportData2) {
        Intrinsics.checkNotNullParameter(phoneSportData2, "<set-?>");
        phoneSportData = phoneSportData2;
    }

    public final void setRunLockScreen(boolean z) {
        runLockScreen = z;
    }

    public final void setSportGoalType(int i) {
        sportGoalType = i;
    }

    public final void setSportGoalValue(float f) {
        sportGoalValue = f;
    }

    public final void setWearSportData(@NotNull x7r x7rVar) {
        Intrinsics.checkNotNullParameter(x7rVar, "<set-?>");
        wearSportData = x7rVar;
    }
}
