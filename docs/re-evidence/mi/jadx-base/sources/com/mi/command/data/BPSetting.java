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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lcom/mi/command/data/BPSetting;", "Landroid/os/Parcelable;", "researchId", "", "did", "caliMorning", "Lcom/mi/command/data/Time;", "caliAfternoon", "reminderFrequence", "<init>", "(IILcom/mi/command/data/Time;Lcom/mi/command/data/Time;I)V", "getResearchId", "()I", "getDid", "getCaliMorning", "()Lcom/mi/command/data/Time;", "getCaliAfternoon", "getReminderFrequence", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BPSetting implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPSetting> CREATOR = new Creator();

    @NotNull
    private final Time caliAfternoon;

    @NotNull
    private final Time caliMorning;
    private final int did;
    private final int reminderFrequence;
    private final int researchId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BPSetting> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BPSetting createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            Parcelable.Creator<Time> creator = Time.CREATOR;
            return new BPSetting(i, i2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BPSetting[] newArray(int i) {
            return new BPSetting[i];
        }
    }

    public BPSetting(int i, int i2, @NotNull Time caliMorning, @NotNull Time caliAfternoon, int i3) {
        Intrinsics.checkNotNullParameter(caliMorning, "caliMorning");
        Intrinsics.checkNotNullParameter(caliAfternoon, "caliAfternoon");
        this.researchId = i;
        this.did = i2;
        this.caliMorning = caliMorning;
        this.caliAfternoon = caliAfternoon;
        this.reminderFrequence = i3;
    }

    public static /* synthetic */ BPSetting copy$default(BPSetting bPSetting, int i, int i2, Time time, Time time2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bPSetting.researchId;
        }
        if ((i4 & 2) != 0) {
            i2 = bPSetting.did;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            time = bPSetting.caliMorning;
        }
        Time time3 = time;
        if ((i4 & 8) != 0) {
            time2 = bPSetting.caliAfternoon;
        }
        Time time4 = time2;
        if ((i4 & 16) != 0) {
            i3 = bPSetting.reminderFrequence;
        }
        return bPSetting.copy(i, i5, time3, time4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResearchId() {
        return this.researchId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Time getCaliMorning() {
        return this.caliMorning;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Time getCaliAfternoon() {
        return this.caliAfternoon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getReminderFrequence() {
        return this.reminderFrequence;
    }

    @NotNull
    public final BPSetting copy(int researchId, int did, @NotNull Time caliMorning, @NotNull Time caliAfternoon, int reminderFrequence) {
        Intrinsics.checkNotNullParameter(caliMorning, "caliMorning");
        Intrinsics.checkNotNullParameter(caliAfternoon, "caliAfternoon");
        return new BPSetting(researchId, did, caliMorning, caliAfternoon, reminderFrequence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BPSetting)) {
            return false;
        }
        BPSetting bPSetting = (BPSetting) other;
        return this.researchId == bPSetting.researchId && this.did == bPSetting.did && Intrinsics.areEqual(this.caliMorning, bPSetting.caliMorning) && Intrinsics.areEqual(this.caliAfternoon, bPSetting.caliAfternoon) && this.reminderFrequence == bPSetting.reminderFrequence;
    }

    @NotNull
    public final Time getCaliAfternoon() {
        return this.caliAfternoon;
    }

    @NotNull
    public final Time getCaliMorning() {
        return this.caliMorning;
    }

    public final int getDid() {
        return this.did;
    }

    public final int getReminderFrequence() {
        return this.reminderFrequence;
    }

    public final int getResearchId() {
        return this.researchId;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.researchId) * 31) + Integer.hashCode(this.did)) * 31) + this.caliMorning.hashCode()) * 31) + this.caliAfternoon.hashCode()) * 31) + Integer.hashCode(this.reminderFrequence);
    }

    @NotNull
    public String toString() {
        return "BPSetting(researchId=" + this.researchId + ", did=" + this.did + ", caliMorning=" + this.caliMorning + ", caliAfternoon=" + this.caliAfternoon + ", reminderFrequence=" + this.reminderFrequence + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.researchId);
        dest.writeInt(this.did);
        this.caliMorning.writeToParcel(dest, flags);
        this.caliAfternoon.writeToParcel(dest, flags);
        dest.writeInt(this.reminderFrequence);
    }
}
