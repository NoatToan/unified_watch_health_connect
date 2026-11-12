package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes11.dex */
public interface zzc extends IInterface {

    public static abstract class a extends Binder implements zzc {

        /* JADX INFO: renamed from: zzc$a$a, reason: collision with other inner class name */
        public static class C1172a implements zzc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41824a;

            public C1172a(IBinder iBinder) {
                this.f41824a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41824a;
            }
        }

        public static zzc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.milink.discover.aidl.IUDTDiscoverCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zzc)) ? new C1172a(iBinder) : (zzc) iInterfaceQueryLocalInterface;
        }
    }
}
