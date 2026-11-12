package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class zzg implements Parcelable.Creator<ListSubscriptionsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ListSubscriptionsResult[] newArray(int i) {
        return new ListSubscriptionsResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ListSubscriptionsResult createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        Status status = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, Subscription.CREATOR);
            } else if (fieldId == 2) {
                status = (Status) SafeParcelReader.createParcelable(parcel, header, Status.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ListSubscriptionsResult(arrayListCreateTypedList, status);
    }
}
