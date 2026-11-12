package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zzw implements Parcelable.Creator<PaymentDataRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PaymentDataRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayListCreateIntegerList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String strCreateString = null;
        boolean z17 = true;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) SafeParcelReader.createParcelable(parcel, header, CardRequirements.CREATOR);
                    break;
                case 4:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) SafeParcelReader.createParcelable(parcel, header, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayListCreateIntegerList = SafeParcelReader.createIntegerList(parcel, header);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) SafeParcelReader.createParcelable(parcel, header, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) SafeParcelReader.createParcelable(parcel, header, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PaymentDataRequest(z14, z15, cardRequirements, z16, shippingAddressRequirements, arrayListCreateIntegerList, paymentMethodTokenizationParameters, transactionInfo, z17, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PaymentDataRequest[] newArray(int i14) {
        return new PaymentDataRequest[i14];
    }
}
