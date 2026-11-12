package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: p9.d$a$a, reason: collision with other inner class name */
        public static class C2585a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f136440a;

            public C2585a(IBinder iBinder) {
                this.f136440a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f136440a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IDeleteDataRangeCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IDeleteDataRangeCallback");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IDeleteDataRangeCallback");
                return true;
            }
            if (i14 == 1) {
                ((f9.b) this).f69958a.set(Unit.INSTANCE);
            } else {
                if (i14 != 2) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                e9.b bVarCreateFromParcel = parcel.readInt() != 0 ? e9.b.CREATOR.createFromParcel(parcel) : null;
                bVarCreateFromParcel.getClass();
                ((f9.b) this).f69958a.setException(h9.a.a(bVarCreateFromParcel));
            }
            return true;
        }
    }
}
