package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: p9.c$a$a, reason: collision with other inner class name */
        public static class C2584a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f136439a;

            public C2584a(IBinder iBinder) {
                this.f136439a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f136439a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IDeleteDataCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IDeleteDataCallback");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IDeleteDataCallback");
                return true;
            }
            if (i14 == 1) {
                ((f9.a) this).f69957a.set(Unit.INSTANCE);
            } else {
                if (i14 != 2) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                e9.b bVarCreateFromParcel = parcel.readInt() != 0 ? e9.b.CREATOR.createFromParcel(parcel) : null;
                bVarCreateFromParcel.getClass();
                ((f9.a) this).f69957a.setException(h9.a.a(bVarCreateFromParcel));
            }
            return true;
        }
    }
}
