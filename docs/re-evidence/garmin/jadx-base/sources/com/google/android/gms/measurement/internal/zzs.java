package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = false;
        int i14 = 0;
        boolean z15 = false;
        boolean z16 = false;
        int i15 = 0;
        int i16 = 0;
        long j8 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        int i17 = 100;
        boolean z17 = true;
        boolean z18 = true;
        long j24 = -2147483648L;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j8 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j24 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z18 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 25:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j17 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 30:
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j18 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 37:
                    j19 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 38:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzr(strCreateString5, strCreateString6, strCreateString7, strCreateString8, j8, j14, strCreateString9, z17, z14, j24, strCreateString10, j15, i14, z18, z15, booleanObject, j16, arrayListCreateStringList, strCreateString, strCreateString2, strCreateString11, z16, j17, i17, strCreateString3, i15, j18, strCreateString12, strCreateString4, j19, i16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i14) {
        return new zzr[i14];
    }
}
