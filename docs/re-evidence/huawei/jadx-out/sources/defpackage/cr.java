package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import b.d;
import c.c;
import com.huawei.harmonyos.interwork.abilitykit.a;
import com.huawei.harmonyos.interwork.base.bundle.AbilityInfo;
import com.huawei.harmonyos.interwork.base.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class cr implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f31275a;

    public cr(IBinder iBinder) {
        this.f31275a = iBinder;
    }

    public final int a(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.systemserver.servicebus.DefAccessInterface");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(0);
            this.f31275a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31275a;
    }

    public final void d(String str, d dVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.systemserver.servicebus.DefAccessInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(dVar);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(0);
            this.f31275a.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final ArrayList d(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.systemserver.servicebus.DefAccessInterface");
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(0);
            this.f31275a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(AbilityInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void a(String str, d dVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.systemserver.servicebus.DefAccessInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(dVar);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(0);
            this.f31275a.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final int c(Intent intent, a aVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.huawei.systemserver.servicebus.DefAccessInterface");
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongInterface(aVar);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(0);
            this.f31275a.transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
