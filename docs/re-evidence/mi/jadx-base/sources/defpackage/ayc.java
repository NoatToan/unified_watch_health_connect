package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface ayc extends IInterface {

    public static abstract class a extends Binder implements ayc {
        public a() {
            attachInterface(this, "com.xiaomi.continuity.channel.ISendResultCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.xiaomi.continuity.channel.ISendResultCallback");
                onResult(parcel.readInt(), parcel.readString());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.xiaomi.continuity.channel.ISendResultCallback");
            return true;
        }
    }

    void onResult(int i, String str);
}
