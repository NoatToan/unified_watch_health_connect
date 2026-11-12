package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface m extends IInterface {

    public static abstract class a extends Binder implements m {

        /* JADX INFO: renamed from: p9.m$a$a, reason: collision with other inner class name */
        public static class C2588a implements m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f136447a;

            public C2588a(IBinder iBinder) {
                this.f136447a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f136447a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IInsertDataCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IInsertDataCallback");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IInsertDataCallback");
                return true;
            }
            if (i14 == 1) {
                o9.a aVar = (o9.a) (parcel.readInt() != 0 ? o9.a.CREATOR.createFromParcel(parcel) : null);
                aVar.getClass();
                ((f9.d) this).f69960a.set(aVar.f130959b);
                return true;
            }
            if (i14 != 2) {
                return super.onTransact(i14, parcel, parcel2, i15);
            }
            e9.b bVar = (e9.b) (parcel.readInt() != 0 ? e9.b.CREATOR.createFromParcel(parcel) : null);
            bVar.getClass();
            ((f9.d) this).f69960a.setException(h9.a.a(bVar));
            return true;
        }
    }
}
