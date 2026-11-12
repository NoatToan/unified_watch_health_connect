package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.maq;

/* JADX INFO: loaded from: classes10.dex */
public interface IMapClientIdentity extends IInterface {
    void regestToProvierIdentity(maq maqVar);

    public static abstract class Stub extends Binder implements IMapClientIdentity {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IMapClientIdentity {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14169a;

            @Override // com.huawei.hms.maps.internal.IMapClientIdentity
            public void regestToProvierIdentity(maq maqVar) {
                mai.a(this.f14169a, "com.huawei.hms.maps.internal.IMapClientIdentity", 1, maqVar);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IMapClientIdentity";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14169a;
            }

            Proxy(IBinder iBinder) {
                this.f14169a = iBinder;
            }
        }

        public static IMapClientIdentity asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapClientIdentity");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMapClientIdentity)) ? new Proxy(iBinder) : (IMapClientIdentity) iInterfaceQueryLocalInterface;
        }
    }
}
