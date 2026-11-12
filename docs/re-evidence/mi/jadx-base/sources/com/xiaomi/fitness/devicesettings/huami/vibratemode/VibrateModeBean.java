package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import com.xiaomi.hm.health.bt.sdk.data.VibrateType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "Ljava/io/Serializable;", "name", "", "type", "Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "index", "", "vibrateName", "vibrateId", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;ILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getType", "()Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;", "setType", "(Lcom/xiaomi/hm/health/bt/sdk/data/VibrateType;)V", "getIndex", "()I", "setIndex", "(I)V", "getVibrateName", "setVibrateName", "getVibrateId", "setVibrateId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VibrateModeBean implements Serializable {
    private int index;

    @NotNull
    private String name;

    @NotNull
    private VibrateType type;

    @Nullable
    private String vibrateId;

    @NotNull
    private String vibrateName;

    public VibrateModeBean(@NotNull String name, @NotNull VibrateType type, int i, @NotNull String vibrateName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(vibrateName, "vibrateName");
        this.name = name;
        this.type = type;
        this.index = i;
        this.vibrateName = vibrateName;
        this.vibrateId = str;
    }

    public static /* synthetic */ VibrateModeBean copy$default(VibrateModeBean vibrateModeBean, String str, VibrateType vibrateType, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vibrateModeBean.name;
        }
        if ((i2 & 2) != 0) {
            vibrateType = vibrateModeBean.type;
        }
        VibrateType vibrateType2 = vibrateType;
        if ((i2 & 4) != 0) {
            i = vibrateModeBean.index;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = vibrateModeBean.vibrateName;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = vibrateModeBean.vibrateId;
        }
        return vibrateModeBean.copy(str, vibrateType2, i3, str4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VibrateType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVibrateName() {
        return this.vibrateName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVibrateId() {
        return this.vibrateId;
    }

    @NotNull
    public final VibrateModeBean copy(@NotNull String name, @NotNull VibrateType type, int index, @NotNull String vibrateName, @Nullable String vibrateId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(vibrateName, "vibrateName");
        return new VibrateModeBean(name, type, index, vibrateName, vibrateId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VibrateModeBean)) {
            return false;
        }
        VibrateModeBean vibrateModeBean = (VibrateModeBean) other;
        return Intrinsics.areEqual(this.name, vibrateModeBean.name) && this.type == vibrateModeBean.type && this.index == vibrateModeBean.index && Intrinsics.areEqual(this.vibrateName, vibrateModeBean.vibrateName) && Intrinsics.areEqual(this.vibrateId, vibrateModeBean.vibrateId);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final VibrateType getType() {
        return this.type;
    }

    @Nullable
    public final String getVibrateId() {
        return this.vibrateId;
    }

    @NotNull
    public final String getVibrateName() {
        return this.vibrateName;
    }

    public int hashCode() {
        int iHashCode = ((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + this.vibrateName.hashCode()) * 31;
        String str = this.vibrateId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setType(@NotNull VibrateType vibrateType) {
        Intrinsics.checkNotNullParameter(vibrateType, "<set-?>");
        this.type = vibrateType;
    }

    public final void setVibrateId(@Nullable String str) {
        this.vibrateId = str;
    }

    public final void setVibrateName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vibrateName = str;
    }

    @NotNull
    public String toString() {
        return "VibrateModeBean(name=" + this.name + ", type=" + this.type + ", index=" + this.index + ", vibrateName=" + this.vibrateName + ", vibrateId=" + this.vibrateId + ")";
    }
}
