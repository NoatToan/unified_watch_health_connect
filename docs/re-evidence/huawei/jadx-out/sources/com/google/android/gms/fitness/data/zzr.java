package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes21.dex */
public final class zzr implements Parcelable.Creator<Goal.FrequencyObjective> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Goal.FrequencyObjective[] newArray(int i) {
        return new Goal.FrequencyObjective[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Goal.FrequencyObjective createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) == 1) {
                i = SafeParcelReader.readInt(parcel, header);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Goal.FrequencyObjective(i);
    }
}
