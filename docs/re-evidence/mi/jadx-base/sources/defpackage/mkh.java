package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public class mkh {
    public static void a(Parcel parcel, int i, h64 h64Var) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int iDataPosition2 = parcel.dataPosition();
        h64Var.a(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
