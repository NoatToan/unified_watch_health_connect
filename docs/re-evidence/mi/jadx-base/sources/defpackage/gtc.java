package defpackage;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.aicr.vision.VisionAttribute;
import com.xiaomi.aicr.vision.imagesegment.SegmentResult;

/* JADX INFO: loaded from: classes7.dex */
public interface gtc extends IInterface {

    public static abstract class a extends Binder implements gtc {

        /* JADX INFO: renamed from: gtc$a$a, reason: collision with other inner class name */
        public static class C0946a implements gtc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19316a;

            public C0946a(IBinder iBinder) {
                this.f19316a = iBinder;
            }

            @Override // defpackage.gtc
            public SegmentResult T3(Bitmap bitmap, VisionAttribute visionAttribute) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.plugin.IImageSegmentService");
                    b.d(parcelObtain, bitmap, 0);
                    b.d(parcelObtain, visionAttribute, 0);
                    this.f19316a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (SegmentResult) b.c(parcelObtain2, SegmentResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.gtc
            public int Y() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.plugin.IImageSegmentService");
                    this.f19316a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.gtc
            public int Z4() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.plugin.IImageSegmentService");
                    this.f19316a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19316a;
            }

            @Override // defpackage.gtc
            public int r2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.plugin.IImageSegmentService");
                    this.f19316a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static gtc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.aicr.plugin.IImageSegmentService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gtc)) ? new C0946a(iBinder) : (gtc) iInterfaceQueryLocalInterface;
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

    SegmentResult T3(Bitmap bitmap, VisionAttribute visionAttribute) throws RemoteException;

    int Y() throws RemoteException;

    int Z4() throws RemoteException;

    int r2() throws RemoteException;
}
