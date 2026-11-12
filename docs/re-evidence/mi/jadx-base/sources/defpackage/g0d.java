package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface g0d extends IInterface {
    public static final String u3 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(Typography.dollar, '.');

    public static abstract class a extends Binder implements g0d {
        public a() {
            attachInterface(this, g0d.u3);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = g0d.u3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            A2(f0d.a.s2(parcel.readStrongBinder()));
            return true;
        }
    }

    void A2(f0d f0dVar) throws RemoteException;
}
