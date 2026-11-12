package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.command.data.SleepEvaluateResult;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface orm extends IInterface {

    public static abstract class a extends Binder implements orm {

        /* JADX INFO: renamed from: orm$a$a, reason: collision with other inner class name */
        public static class C1070a implements orm {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f29632a;

            public C1070a(IBinder iBinder) {
                this.f29632a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29632a;
            }

            @Override // defpackage.orm
            public void onFailure(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.SleepResearchEvaluateCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f29632a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.orm
            public void onSuccess(List<SleepEvaluateResult> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.SleepResearchEvaluateCallback");
                    b.b(parcelObtain, list, 0);
                    this.f29632a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static orm s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.SleepResearchEvaluateCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof orm)) ? new C1070a(iBinder) : (orm) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onFailure(String str, int i) throws RemoteException;

    void onSuccess(List<SleepEvaluateResult> list) throws RemoteException;
}
