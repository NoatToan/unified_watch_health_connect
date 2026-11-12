package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzcb();

    @SafeParcelable.Field(getter = "getTimestampSec", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getConfidence", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getMotion", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getLight", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNoise", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getLightDiff", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getNightOrDay", id = 7)
    private final int zzg;

    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getPresenceConfidence", id = 9)
    private final int zzi;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) int i15, @SafeParcelable.Param(id = 3) int i16, @SafeParcelable.Param(id = 4) int i17, @SafeParcelable.Param(id = 5) int i18, @SafeParcelable.Param(id = 6) int i19, @SafeParcelable.Param(id = 7) int i24, @SafeParcelable.Param(id = 8) boolean z14, @SafeParcelable.Param(id = 9) int i25) {
        this.zza = i14;
        this.zzb = i15;
        this.zzc = i16;
        this.zzd = i17;
        this.zze = i18;
        this.zzf = i19;
        this.zzg = i24;
        this.zzh = z14;
        this.zzi = i25;
    }

    public static List<SleepClassifyEvent> extractEvents(Intent intent) {
        ArrayList arrayList;
        Preconditions.checkNotNull(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                byte[] bArr = (byte[]) arrayList.get(i14);
                Preconditions.checkNotNull(bArr);
                arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.zza) * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public String toString() {
        int i14 = this.zza;
        int i15 = this.zzb;
        int i16 = this.zzc;
        int i17 = this.zzd;
        StringBuilder sb3 = new StringBuilder(65);
        sb3.append(i14);
        sb3.append(" Conf:");
        sb3.append(i15);
        sb3.append(" Motion:");
        sb3.append(i16);
        sb3.append(" Light:");
        sb3.append(i17);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
