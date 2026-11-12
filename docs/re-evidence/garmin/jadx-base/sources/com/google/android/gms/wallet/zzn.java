package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zzn implements Parcelable.Creator<IsReadyToPayRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IsReadyToPayRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<Integer> arrayListCreateIntegerList = null;
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList<Integer> arrayListCreateIntegerList2 = null;
        String strCreateString3 = null;
        boolean z14 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 3:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    arrayListCreateIntegerList2 = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 7:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new IsReadyToPayRequest(arrayListCreateIntegerList, strCreateString, strCreateString2, arrayListCreateIntegerList2, z14, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IsReadyToPayRequest[] newArray(int i14) {
        return new IsReadyToPayRequest[i14];
    }
}
