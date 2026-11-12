package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes10.dex */
public interface aabn extends IInterface {

    public static abstract class aab extends Binder implements aabn {

        /* JADX INFO: renamed from: com.huawei.hms.hihealth.aabn$aab$aab, reason: collision with other inner class name */
        static class C0125aab implements aabn {
            private IBinder aab;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            C0125aab(IBinder iBinder) {
                this.aab = iBinder;
            }
        }

        public static aabn aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IHealthRecordsControllerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aabn)) ? new C0125aab(iBinder) : (aabn) iInterfaceQueryLocalInterface;
        }
    }
}
