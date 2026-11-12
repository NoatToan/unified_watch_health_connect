package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes14.dex */
public final class zzcb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        boolean z14 = false;
        int i25 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i18 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i19 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i24 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    i25 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SleepClassifyEvent(i14, i15, i16, i17, i18, i19, i24, z14, i25);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new SleepClassifyEvent[i14];
    }
}
