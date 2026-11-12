package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.support.hwid.common.constants.CommonConstant;

/* JADX INFO: loaded from: classes21.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzq();
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    private static final String TAG = "StreetViewSource";
    private final int type;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String toString() {
        String str;
        int i = this.type;
        if (i != 0) {
            str = i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR";
        } else {
            str = CommonConstant.StartQrLoginQrValue.QRSCENE_DEFAULT;
        }
        return String.format("StreetViewSource:%s", str);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.type == ((StreetViewSource) obj).type;
    }

    public StreetViewSource(int i) {
        this.type = i;
    }
}
