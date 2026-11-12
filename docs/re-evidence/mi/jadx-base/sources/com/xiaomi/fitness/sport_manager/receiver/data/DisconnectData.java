package com.xiaomi.fitness.sport_manager.receiver.data;

import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/DisconnectData;", "", "step", "", StepsInfo.KEY_CALORIES, "<init>", "(II)V", "getStep", "()I", "setStep", "(I)V", "getCal", "setCal", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DisconnectData {
    private int cal;
    private int step;

    public DisconnectData(int i, int i2) {
        this.step = i;
        this.cal = i2;
    }

    public static /* synthetic */ DisconnectData copy$default(DisconnectData disconnectData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = disconnectData.step;
        }
        if ((i3 & 2) != 0) {
            i2 = disconnectData.cal;
        }
        return disconnectData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCal() {
        return this.cal;
    }

    @NotNull
    public final DisconnectData copy(int step, int cal) {
        return new DisconnectData(step, cal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisconnectData)) {
            return false;
        }
        DisconnectData disconnectData = (DisconnectData) other;
        return this.step == disconnectData.step && this.cal == disconnectData.cal;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        return (Integer.hashCode(this.step) * 31) + Integer.hashCode(this.cal);
    }

    public final void setCal(int i) {
        this.cal = i;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    @NotNull
    public String toString() {
        return "DisconnectData(step=" + this.step + ", cal=" + this.cal + ")";
    }
}
