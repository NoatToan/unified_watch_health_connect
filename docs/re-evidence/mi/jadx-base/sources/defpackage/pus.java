package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pus extends n9s implements cxs {
    public pus() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // defpackage.n9s
    public final boolean s2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle = (Bundle) les.a(parcel, Bundle.CREATOR);
                les.b(parcel);
                C2(i3, bundle);
                return true;
            case 3:
                int i4 = parcel.readInt();
                Bundle bundle2 = (Bundle) les.a(parcel, Bundle.CREATOR);
                les.b(parcel);
                L1(i4, bundle2);
                return true;
            case 4:
                int i5 = parcel.readInt();
                Bundle bundle3 = (Bundle) les.a(parcel, Bundle.CREATOR);
                les.b(parcel);
                R0(i5, bundle3);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                les.b(parcel);
                K2(arrayListCreateTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) les.a(parcel, creator);
                Bundle bundle5 = (Bundle) les.a(parcel, creator);
                les.b(parcel);
                n1(bundle4, bundle5);
                return true;
            case 7:
                Bundle bundle6 = (Bundle) les.a(parcel, Bundle.CREATOR);
                les.b(parcel);
                Y1(bundle6);
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle7 = (Bundle) les.a(parcel, creator2);
                Bundle bundle8 = (Bundle) les.a(parcel, creator2);
                les.b(parcel);
                v1(bundle7, bundle8);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) les.a(parcel, creator3);
                Bundle bundle10 = (Bundle) les.a(parcel, creator3);
                les.b(parcel);
                Y2(bundle9, bundle10);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) les.a(parcel, creator4);
                Bundle bundle12 = (Bundle) les.a(parcel, creator4);
                les.b(parcel);
                g1(bundle11, bundle12);
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle13 = (Bundle) les.a(parcel, creator5);
                Bundle bundle14 = (Bundle) les.a(parcel, creator5);
                les.b(parcel);
                g2(bundle13, bundle14);
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle15 = (Bundle) les.a(parcel, creator6);
                Bundle bundle16 = (Bundle) les.a(parcel, creator6);
                les.b(parcel);
                j3(bundle15, bundle16);
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle17 = (Bundle) les.a(parcel, creator7);
                Bundle bundle18 = (Bundle) les.a(parcel, creator7);
                les.b(parcel);
                e3(bundle17, bundle18);
                return true;
            case 15:
                Bundle bundle19 = (Bundle) les.a(parcel, Bundle.CREATOR);
                les.b(parcel);
                I(bundle19);
                return true;
        }
    }
}
