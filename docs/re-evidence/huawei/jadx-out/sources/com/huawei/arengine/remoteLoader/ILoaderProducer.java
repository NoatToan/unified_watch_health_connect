package com.huawei.arengine.remoteLoader;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes23.dex */
public interface ILoaderProducer extends IInterface {
    IDynamicLoader newDynamicLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    public static abstract class a extends Binder implements ILoaderProducer {

        static class b implements ILoaderProducer {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static ILoaderProducer f5270c;
            private IBinder e;

            @Override // com.huawei.arengine.remoteLoader.ILoaderProducer
            public IDynamicLoader newDynamicLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
                IDynamicLoader iDynamicLoaderA;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.remoteLoader.ILoaderProducer");
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    parcelObtain.writeStrongBinder(iObjectWrapper2 != null ? iObjectWrapper2.asBinder() : null);
                    if (this.e.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iDynamicLoaderA = IDynamicLoader.a.a(parcelObtain2.readStrongBinder());
                    } else {
                        iDynamicLoaderA = a.a().newDynamicLoader(iObjectWrapper, iObjectWrapper2);
                    }
                    return iDynamicLoaderA;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            b(IBinder iBinder) {
                this.e = iBinder;
            }
        }

        public static ILoaderProducer a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.arengine.remoteLoader.ILoaderProducer");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILoaderProducer)) ? new b(iBinder) : (ILoaderProducer) iInterfaceQueryLocalInterface;
        }

        public static ILoaderProducer a() {
            return b.f5270c;
        }
    }
}
