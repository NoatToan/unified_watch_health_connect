package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionDataSetCreator")
@SafeParcelable.Reserved({1000})
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzag();

    @SafeParcelable.Field(getter = "getSession", id = 1)
    private final Session a;

    @SafeParcelable.Field(getter = "getDataSet", id = 2)
    private final DataSet b;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1) Session session, @SafeParcelable.Param(id = 2) DataSet dataSet) {
        this.a = session;
        this.b = dataSet;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        return Objects.equal(this.a, zzaeVar.a) && Objects.equal(this.b, zzaeVar.b);
    }

    public final DataSet getDataSet() {
        return this.b;
    }

    public final Session getSession() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(com.google.firebase.crashlytics.internal.settings.b.c, this.a).add("dataSet", this.b).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
