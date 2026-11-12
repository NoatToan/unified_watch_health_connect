package com.xmlywind.devicehelper.oaId.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.xmlywind.devicehelper.oaId.a.a$a, reason: collision with other inner class name */
    public static final class C1057a implements a {
        private IBinder a;

        public C1057a(IBinder iBinder) {
            this.a = iBinder;
        }

        public String a() {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                this.a.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                SigmobLog.e(th.getMessage());
                string = null;
            }
            parcelObtain.recycle();
            parcelObtain2.recycle();
            return string;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }
    }
}
