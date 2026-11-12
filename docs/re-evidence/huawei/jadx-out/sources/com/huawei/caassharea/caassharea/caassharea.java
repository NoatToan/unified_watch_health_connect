package com.huawei.caassharea.caassharea;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes23.dex */
public interface caassharea extends IInterface {
    void caassharea(int i);

    void caassharea(int i, String str);

    /* JADX INFO: renamed from: com.huawei.caassharea.caassharea.caassharea$caassharea, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0065caassharea extends Binder implements caassharea {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: renamed from: com.huawei.caassharea.caassharea.caassharea$caassharea$d */
        static final class d implements caassharea {
            public static caassharea d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5403a;

            @Override // com.huawei.caassharea.caassharea.caassharea
            public final void caassharea(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.caasservice.share.IHwCaasShareCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.f5403a.transact(1, parcelObtain, null, 1) || AbstractBinderC0065caassharea.caassharea() == null) {
                        return;
                    }
                    AbstractBinderC0065caassharea.caassharea().caassharea(i, str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.caassharea.caassharea.caassharea
            public final void caassharea(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.caasservice.share.IHwCaasShareCallback");
                    parcelObtain.writeInt(i);
                    if (this.f5403a.transact(2, parcelObtain, null, 1) || AbstractBinderC0065caassharea.caassharea() == null) {
                        return;
                    }
                    AbstractBinderC0065caassharea.caassharea().caassharea(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f5403a;
            }

            d(IBinder iBinder) {
                this.f5403a = iBinder;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.huawei.caasservice.share.IHwCaasShareCallback");
                caassharea(parcel.readInt(), parcel.readString());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.huawei.caasservice.share.IHwCaasShareCallback");
                caassharea(parcel.readInt());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.huawei.caasservice.share.IHwCaasShareCallback");
            return true;
        }

        public static caassharea caassharea() {
            return d.d;
        }

        public AbstractBinderC0065caassharea() {
            attachInterface(this, "com.huawei.caasservice.share.IHwCaasShareCallback");
        }
    }
}
