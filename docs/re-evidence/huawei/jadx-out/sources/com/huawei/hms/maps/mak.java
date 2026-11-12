package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes34.dex */
public interface mak extends IInterface {

    public static abstract class maa extends Binder implements mak {

        /* JADX INFO: renamed from: com.huawei.hms.maps.mak$maa$maa, reason: collision with other inner class name */
        static class C0152maa implements mak {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14197a;

            C0152maa(IBinder iBinder) {
                this.f14197a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14197a;
            }
        }

        public static mak a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.search.api.IPlaceDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof mak)) ? new C0152maa(iBinder) : (mak) iInterfaceQueryLocalInterface;
        }
    }
}
