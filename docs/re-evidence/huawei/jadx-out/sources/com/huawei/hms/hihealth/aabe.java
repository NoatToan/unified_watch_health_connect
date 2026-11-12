package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes10.dex */
public interface aabe extends IInterface {

    public static abstract class aab extends Binder implements aabe {

        /* JADX INFO: renamed from: com.huawei.hms.hihealth.aabe$aab$aab, reason: collision with other inner class name */
        static class C0119aab implements aabe {
            private IBinder aab;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            C0119aab(IBinder iBinder) {
                this.aab = iBinder;
            }
        }

        public static aabe aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IAuthControllerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aabe)) ? new C0119aab(iBinder) : (aabe) iInterfaceQueryLocalInterface;
        }
    }
}
