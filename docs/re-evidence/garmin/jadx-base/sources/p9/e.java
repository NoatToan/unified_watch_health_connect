package p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.health.platform.client.permission.Permission;
import java.util.ArrayList;
import java.util.Iterator;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: p9.e$a$a, reason: collision with other inner class name */
        public static class C2586a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f136441a;

            public C2586a(IBinder iBinder) {
                this.f136441a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f136441a;
            }
        }

        public a() {
            attachInterface(this, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                return true;
            }
            if (i14 == 1) {
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Permission.CREATOR);
                f9.c cVar = (f9.c) this;
                arrayListCreateTypedArrayList.getClass();
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListCreateTypedArrayList, 10));
                Iterator it = arrayListCreateTypedArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Permission) it.next()).f7528b);
                }
                cVar.f69959a.set(h0.g1(arrayList));
            } else {
                if (i14 != 2) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                e9.b bVarCreateFromParcel = parcel.readInt() != 0 ? e9.b.CREATOR.createFromParcel(parcel) : null;
                bVarCreateFromParcel.getClass();
                ((f9.c) this).f69959a.setException(h9.a.a(bVarCreateFromParcel));
            }
            return true;
        }
    }
}
