package com.huawei.ohos.localability;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import defpackage.ogw;
import defpackage.ohb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes12.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.huawei.ohos.localability.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0194a extends Binder implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Log.i("IFormSupplyClient.Stub", "onTransact code:" + i);
            int i3 = 0;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.ohos.localability.IFormSupplyClient");
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                while (i3 < i4) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                    i3++;
                }
                Log.i("AbilityFormSupplyProxy", "onFormVisible called");
                WeakReference<ogw> weakReference = ((ogw.c) this).f44298c;
                if (weakReference == null) {
                    Log.e("AbilityFormSupplyProxy", "weakProxy is null");
                } else {
                    ogw ogwVar = weakReference.get();
                    if (ogwVar != null) {
                        ogwVar.d((List<Long>) arrayList);
                    }
                }
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.huawei.ohos.localability.IFormSupplyClient");
                return true;
            }
            parcel.enforceInterface("com.huawei.ohos.localability.IFormSupplyClient");
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add(parcel.readString());
            }
            ListenerType listenerTypeIntToEnum = ListenerType.intToEnum(i5);
            int i8 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            while (i3 < i8) {
                arrayList3.add(new ohb(parcel.readLong(), parcel.readString(), FormState.intToEnum(parcel.readInt()), parcel.readInt()));
                i3++;
            }
            Log.i("AbilityFormSupplyProxy", "onVisibilityChange called");
            WeakReference<ogw> weakReference2 = ((ogw.c) this).f44298c;
            if (weakReference2 == null) {
                Log.e("AbilityFormSupplyProxy", "weakProxy is null");
            } else {
                ogw ogwVar2 = weakReference2.get();
                if (ogwVar2 != null) {
                    ogwVar2.e(listenerTypeIntToEnum, (List<String>) arrayList2, (List<ohb>) arrayList3);
                }
            }
            parcel2.writeNoException();
            return true;
        }

        public AbstractBinderC0194a() {
            attachInterface(this, "com.huawei.ohos.localability.IFormSupplyClient");
        }
    }
}
