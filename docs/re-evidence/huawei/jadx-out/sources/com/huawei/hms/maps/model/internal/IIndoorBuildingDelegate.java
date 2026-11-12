package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.maps.mai;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public interface IIndoorBuildingDelegate extends IInterface {
    boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate);

    int getActiveLevelIndex();

    int getDefaultLevelIndex();

    List<IBinder> getLevels();

    int hashCodeRemote();

    boolean isUnderground();

    public static abstract class Stub extends Binder implements IIndoorBuildingDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IIndoorBuildingDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14297a;

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public boolean isUnderground() {
                return mai.a(this.f14297a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 4);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public int hashCodeRemote() {
                return mai.c(this.f14297a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public List<IBinder> getLevels() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate");
                    this.f14297a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createBinderArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public int getDefaultLevelIndex() {
                return mai.c(this.f14297a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public int getActiveLevelIndex() {
                return mai.c(this.f14297a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 1);
            }

            @Override // com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate
            public boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                return mai.a(iIndoorBuildingDelegate, this.f14297a, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate", 5);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14297a;
            }

            Proxy(IBinder iBinder) {
                this.f14297a = iBinder;
            }
        }

        public static IIndoorBuildingDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IIndoorBuildingDelegate)) ? new Proxy(iBinder) : (IIndoorBuildingDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate");
        }
    }
}
