package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.MapAuthInfo;

/* JADX INFO: loaded from: classes34.dex */
public interface IMapAuthToProvider extends IInterface {
    void notifyProvierAuthInfo(MapAuthInfo mapAuthInfo);

    public static abstract class Stub extends Binder implements IMapAuthToProvider {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IMapAuthToProvider {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14168a;

            @Override // com.huawei.hms.maps.internal.IMapAuthToProvider
            public void notifyProvierAuthInfo(MapAuthInfo mapAuthInfo) {
                mai.a(this.f14168a, "com.huawei.hms.maps.internal.IMapAuthToProvider", 1, mapAuthInfo);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IMapAuthToProvider";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14168a;
            }

            Proxy(IBinder iBinder) {
                this.f14168a = iBinder;
            }
        }

        public static IMapAuthToProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IMapAuthToProvider");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMapAuthToProvider)) ? new Proxy(iBinder) : (IMapAuthToProvider) iInterfaceQueryLocalInterface;
        }
    }
}
