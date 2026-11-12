package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes21.dex */
public final class zzx implements Parcelable.Creator<Goal.MetricObjective> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Goal.MetricObjective[] newArray(int i) {
        return new Goal.MetricObjective[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Goal.MetricObjective createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 2) {
                d = SafeParcelReader.readDouble(parcel, header);
            } else if (fieldId == 3) {
                d2 = SafeParcelReader.readDouble(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Goal.MetricObjective(strCreateString, d, d2);
    }
}
