package com.xiaomi.fitness.sport_eco.ftp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/FtpDeviceState;", "", "sportHas", "", "sportConnect", "sportName", "", "wearHas", "wearConnect", "wearName", "<init>", "(ZZLjava/lang/String;ZZLjava/lang/String;)V", "getSportHas", "()Z", "setSportHas", "(Z)V", "getSportConnect", "setSportConnect", "getSportName", "()Ljava/lang/String;", "setSportName", "(Ljava/lang/String;)V", "getWearHas", "setWearHas", "getWearConnect", "setWearConnect", "getWearName", "setWearName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FtpDeviceState {
    private boolean sportConnect;
    private boolean sportHas;

    @NotNull
    private String sportName;
    private boolean wearConnect;
    private boolean wearHas;

    @NotNull
    private String wearName;

    public FtpDeviceState() {
        this(false, false, null, false, false, null, 63, null);
    }

    public static /* synthetic */ FtpDeviceState copy$default(FtpDeviceState ftpDeviceState, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ftpDeviceState.sportHas;
        }
        if ((i & 2) != 0) {
            z2 = ftpDeviceState.sportConnect;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = ftpDeviceState.sportName;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z3 = ftpDeviceState.wearHas;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            z4 = ftpDeviceState.wearConnect;
        }
        boolean z7 = z4;
        if ((i & 32) != 0) {
            str2 = ftpDeviceState.wearName;
        }
        return ftpDeviceState.copy(z, z5, str3, z6, z7, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSportHas() {
        return this.sportHas;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSportConnect() {
        return this.sportConnect;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getWearHas() {
        return this.wearHas;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWearConnect() {
        return this.wearConnect;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWearName() {
        return this.wearName;
    }

    @NotNull
    public final FtpDeviceState copy(boolean sportHas, boolean sportConnect, @NotNull String sportName, boolean wearHas, boolean wearConnect, @NotNull String wearName) {
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(wearName, "wearName");
        return new FtpDeviceState(sportHas, sportConnect, sportName, wearHas, wearConnect, wearName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtpDeviceState)) {
            return false;
        }
        FtpDeviceState ftpDeviceState = (FtpDeviceState) other;
        return this.sportHas == ftpDeviceState.sportHas && this.sportConnect == ftpDeviceState.sportConnect && Intrinsics.areEqual(this.sportName, ftpDeviceState.sportName) && this.wearHas == ftpDeviceState.wearHas && this.wearConnect == ftpDeviceState.wearConnect && Intrinsics.areEqual(this.wearName, ftpDeviceState.wearName);
    }

    public final boolean getSportConnect() {
        return this.sportConnect;
    }

    public final boolean getSportHas() {
        return this.sportHas;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }

    public final boolean getWearConnect() {
        return this.wearConnect;
    }

    public final boolean getWearHas() {
        return this.wearHas;
    }

    @NotNull
    public final String getWearName() {
        return this.wearName;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.sportHas) * 31) + Boolean.hashCode(this.sportConnect)) * 31) + this.sportName.hashCode()) * 31) + Boolean.hashCode(this.wearHas)) * 31) + Boolean.hashCode(this.wearConnect)) * 31) + this.wearName.hashCode();
    }

    public final void setSportConnect(boolean z) {
        this.sportConnect = z;
    }

    public final void setSportHas(boolean z) {
        this.sportHas = z;
    }

    public final void setSportName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sportName = str;
    }

    public final void setWearConnect(boolean z) {
        this.wearConnect = z;
    }

    public final void setWearHas(boolean z) {
        this.wearHas = z;
    }

    public final void setWearName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wearName = str;
    }

    @NotNull
    public String toString() {
        return "FtpDeviceState(sportHas=" + this.sportHas + ", sportConnect=" + this.sportConnect + ", sportName=" + this.sportName + ", wearHas=" + this.wearHas + ", wearConnect=" + this.wearConnect + ", wearName=" + this.wearName + ")";
    }

    public FtpDeviceState(boolean z, boolean z2, @NotNull String sportName, boolean z3, boolean z4, @NotNull String wearName) {
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(wearName, "wearName");
        this.sportHas = z;
        this.sportConnect = z2;
        this.sportName = sportName;
        this.wearHas = z3;
        this.wearConnect = z4;
        this.wearName = wearName;
    }

    public /* synthetic */ FtpDeviceState(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? "" : str2);
    }
}
