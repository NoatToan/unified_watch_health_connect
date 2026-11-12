package com.xiaomi.fitness.devicesettings.thirdparty;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/thirdparty/PhoneStateData;", "", PhoneStateBroadcastReceiver.PARAMS_SCREEN, "", PhoneStateBroadcastReceiver.PARAMS_HOLD, PhoneStateBroadcastReceiver.PARAMS_TOP_APP, PhoneStateBroadcastReceiver.PARAMS_ORI_COUNT, PhoneStateBroadcastReceiver.PARAMS_ORI_STD, PhoneStateBroadcastReceiver.PARAMS_ORI_MEAN, "ori_cur", "light", "<init>", "(IIIIIIII)V", "getScreen", "()I", "getHold", "getTop_app", "getOri_count", "getOri_std", "getOri_mean", "getOri_cur", "getLight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhoneStateData {
    private final int hold;
    private final int light;
    private final int ori_count;
    private final int ori_cur;
    private final int ori_mean;
    private final int ori_std;
    private final int screen;
    private final int top_app;

    public PhoneStateData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.screen = i;
        this.hold = i2;
        this.top_app = i3;
        this.ori_count = i4;
        this.ori_std = i5;
        this.ori_mean = i6;
        this.ori_cur = i7;
        this.light = i8;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHold() {
        return this.hold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTop_app() {
        return this.top_app;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOri_count() {
        return this.ori_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOri_std() {
        return this.ori_std;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOri_mean() {
        return this.ori_mean;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOri_cur() {
        return this.ori_cur;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLight() {
        return this.light;
    }

    @NotNull
    public final PhoneStateData copy(int screen, int hold, int top_app, int ori_count, int ori_std, int ori_mean, int ori_cur, int light) {
        return new PhoneStateData(screen, hold, top_app, ori_count, ori_std, ori_mean, ori_cur, light);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneStateData)) {
            return false;
        }
        PhoneStateData phoneStateData = (PhoneStateData) other;
        return this.screen == phoneStateData.screen && this.hold == phoneStateData.hold && this.top_app == phoneStateData.top_app && this.ori_count == phoneStateData.ori_count && this.ori_std == phoneStateData.ori_std && this.ori_mean == phoneStateData.ori_mean && this.ori_cur == phoneStateData.ori_cur && this.light == phoneStateData.light;
    }

    public final int getHold() {
        return this.hold;
    }

    public final int getLight() {
        return this.light;
    }

    public final int getOri_count() {
        return this.ori_count;
    }

    public final int getOri_cur() {
        return this.ori_cur;
    }

    public final int getOri_mean() {
        return this.ori_mean;
    }

    public final int getOri_std() {
        return this.ori_std;
    }

    public final int getScreen() {
        return this.screen;
    }

    public final int getTop_app() {
        return this.top_app;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.screen) * 31) + Integer.hashCode(this.hold)) * 31) + Integer.hashCode(this.top_app)) * 31) + Integer.hashCode(this.ori_count)) * 31) + Integer.hashCode(this.ori_std)) * 31) + Integer.hashCode(this.ori_mean)) * 31) + Integer.hashCode(this.ori_cur)) * 31) + Integer.hashCode(this.light);
    }

    @NotNull
    public String toString() {
        return "PhoneStateData(screen=" + this.screen + ", hold=" + this.hold + ", top_app=" + this.top_app + ", ori_count=" + this.ori_count + ", ori_std=" + this.ori_std + ", ori_mean=" + this.ori_mean + ", ori_cur=" + this.ori_cur + ", light=" + this.light + ")";
    }
}
