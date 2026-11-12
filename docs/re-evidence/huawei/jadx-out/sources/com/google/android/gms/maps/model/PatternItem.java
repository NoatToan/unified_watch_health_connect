package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzi();
    private static final String TAG = "PatternItem";
    private final int type;
    private final Float zzdu;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzdu, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public String toString() {
        int i = this.type;
        String strValueOf = String.valueOf(this.zzdu);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int i = this.type;
        return Objects.hashCode(Integer.valueOf(i), this.zzdu);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.type == patternItem.type && Objects.equal(this.zzdu, patternItem.zzdu);
    }

    static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem dot : list) {
            if (dot == null) {
                dot = null;
            } else {
                int i = dot.type;
                if (i == 0) {
                    dash = new Dash(dot.zzdu.floatValue());
                } else if (i == 1) {
                    dot = new Dot();
                } else if (i != 2) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unknown PatternItem type: ");
                    sb.append(i);
                    Log.w(str, sb.toString());
                } else {
                    dash = new Gap(dot.zzdu.floatValue());
                }
                dot = dash;
            }
            arrayList.add(dot);
        }
        return arrayList;
    }

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String strValueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(strValueOf);
        Preconditions.checkArgument(z, sb.toString());
        this.type = i;
        this.zzdu = f;
    }
}
