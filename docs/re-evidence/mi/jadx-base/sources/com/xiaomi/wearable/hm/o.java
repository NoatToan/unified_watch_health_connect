package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.o;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes2.dex */
public interface o extends IInterface {

    public static abstract class a extends Binder implements o {
        static final int TRANSACTION_onChangeInternal = 1;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.o$a$a, reason: collision with other inner class name */
        public static class C0883a implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14405a;

            public C0883a(IBinder iBinder) {
                this.f14405a = iBinder;
            }

            public static /* synthetic */ void h4(Parcel parcel, String str, HuamiDataWrapper huamiDataWrapper) {
                parcel.writeString(str);
                b.d(parcel, huamiDataWrapper, 0);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14405a;
            }

            @Override // com.xiaomi.wearable.hm.o
            public void onChangeInternal(Map<String, HuamiDataWrapper> map) throws RemoteException {
                final Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.IChangeListener");
                    if (map == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(map.size());
                        map.forEach(new BiConsumer() { // from class: xpc
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                o.a.C0883a.h4(parcelObtain, (String) obj, (HuamiDataWrapper) obj2);
                            }
                        });
                    }
                    this.f14405a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.IChangeListener");
        }

        public static o asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.IChangeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new C0883a(iBinder) : (o) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onTransact$0(Parcel parcel, Map map, int i) {
            map.put(parcel.readString(), (HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, final Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.IChangeListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.IChangeListener");
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            final HashMap map = i3 < 0 ? null : new HashMap();
            IntStream.range(0, i3).forEach(new IntConsumer() { // from class: wpc
                @Override // java.util.function.IntConsumer
                public final void accept(int i4) {
                    o.a.lambda$onTransact$0(parcel, map, i4);
                }
            });
            onChangeInternal(map);
            parcel2.writeNoException();
            return true;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onChangeInternal(Map<String, HuamiDataWrapper> map) throws RemoteException;
}
