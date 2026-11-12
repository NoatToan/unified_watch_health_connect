package com.huawei.arengine.remoteLoader;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes23.dex */
public interface IObjectWrapper extends IInterface {

    public static abstract class a extends Binder implements IObjectWrapper {
        private static final String DESCRIPTOR = "com.huawei.arengine.remoteLoader.IObjectWrapper";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        public static boolean setDefaultImpl(IObjectWrapper iObjectWrapper) {
            if (d.d != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iObjectWrapper == null) {
                return false;
            }
            d.d = iObjectWrapper;
            return true;
        }

        static class d implements IObjectWrapper {
            public static IObjectWrapper d;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private IBinder f5271c;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5271c;
            }

            d(IBinder iBinder) {
                this.f5271c = iBinder;
            }
        }

        public static IObjectWrapper getDefaultImpl() {
            return d.d;
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IObjectWrapper)) ? new d(iBinder) : (IObjectWrapper) iInterfaceQueryLocalInterface;
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }
    }
}
