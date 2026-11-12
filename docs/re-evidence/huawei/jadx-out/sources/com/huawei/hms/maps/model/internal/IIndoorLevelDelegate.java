package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes34.dex */
public interface IIndoorLevelDelegate extends IInterface {
    void activate();

    boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate);

    String getName();

    String getShortName();

    int hashCodeRemote();

    public static abstract class Stub extends Binder implements IIndoorLevelDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IIndoorLevelDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14298a;

            @Override // com.huawei.hms.maps.model.internal.IIndoorLevelDelegate
            public int hashCodeRemote() {
                return mai.c(this.f14298a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 5);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorLevelDelegate
            public String getShortName() {
                return mai.h(this.f14298a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 3);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorLevelDelegate
            public String getName() {
                return mai.h(this.f14298a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 2);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorLevelDelegate
            public boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
                return mai.a(iIndoorLevelDelegate, this.f14298a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 4);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14298a;
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorLevelDelegate
            public void activate() {
                mai.j(this.f14298a, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate", 1);
            }

            Proxy(IBinder iBinder) {
                this.f14298a = iBinder;
            }
        }

        public static IIndoorLevelDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IIndoorLevelDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIndoorLevelDelegate)) ? new Proxy(iBinder) : (IIndoorLevelDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.IIndoorLevelDelegate");
        }
    }
}
