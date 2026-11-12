package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SavePasswordResultCreator")
public class SavePasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zzk();

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent a;

    @SafeParcelable.Constructor
    public SavePasswordResult(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.a = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SavePasswordResult) {
            return Objects.equal(this.a, ((SavePasswordResult) obj).a);
        }
        return false;
    }

    public PendingIntent getPendingIntent() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
