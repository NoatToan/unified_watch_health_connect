package com.mi.command.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0003J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006&"}, d2 = {"Lcom/mi/command/data/ResearchApp;", "Landroid/os/Parcelable;", "researchId", "", "type", "enable", "", "timestamp", "timeZone", "<init>", "(IIZII)V", "getResearchId", "()I", "getType", "getEnable", "()Z", "setEnable", "(Z)V", "getTimestamp", "getTimeZone", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResearchApp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ResearchApp> CREATOR = new Creator();
    private boolean enable;
    private final int researchId;
    private final int timeZone;
    private final int timestamp;
    private final int type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResearchApp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResearchApp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResearchApp(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResearchApp[] newArray(int i) {
            return new ResearchApp[i];
        }
    }

    public ResearchApp(int i, int i2, boolean z, int i3, int i4) {
        this.researchId = i;
        this.type = i2;
        this.enable = z;
        this.timestamp = i3;
        this.timeZone = i4;
    }

    public static /* synthetic */ ResearchApp copy$default(ResearchApp researchApp, int i, int i2, boolean z, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = researchApp.researchId;
        }
        if ((i5 & 2) != 0) {
            i2 = researchApp.type;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            z = researchApp.enable;
        }
        boolean z2 = z;
        if ((i5 & 8) != 0) {
            i3 = researchApp.timestamp;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = researchApp.timeZone;
        }
        return researchApp.copy(i, i6, z2, i7, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResearchId() {
        return this.researchId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    public final ResearchApp copy(int researchId, int type, boolean enable, int timestamp, int timeZone) {
        return new ResearchApp(researchId, type, enable, timestamp, timeZone);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchApp)) {
            return false;
        }
        ResearchApp researchApp = (ResearchApp) other;
        return this.researchId == researchApp.researchId && this.type == researchApp.type && this.enable == researchApp.enable && this.timestamp == researchApp.timestamp && this.timeZone == researchApp.timeZone;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getResearchId() {
        return this.researchId;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.researchId) * 31) + Integer.hashCode(this.type)) * 31) + Boolean.hashCode(this.enable)) * 31) + Integer.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.timeZone);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public String toString() {
        return "ResearchApp(researchId=" + this.researchId + ", type=" + this.type + ", enable=" + this.enable + ", timestamp=" + this.timestamp + ", timeZone=" + this.timeZone + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.researchId);
        dest.writeInt(this.type);
        dest.writeInt(this.enable ? 1 : 0);
        dest.writeInt(this.timestamp);
        dest.writeInt(this.timeZone);
    }
}
