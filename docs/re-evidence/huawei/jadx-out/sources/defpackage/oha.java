package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class oha {
    public static IBinder c() {
        IBinder iBinderB = b("SamgrService");
        if (iBinderB == null) {
            Log.e("ConnectUtils", "samgr is null");
            return iBinderB;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain.writeInt(403);
        try {
            iBinderB.transact(2, parcelObtain, parcelObtain2, 0);
            return parcelObtain2.readStrongBinder();
        } catch (RemoteException e) {
            Log.e("ConnectUtils", "get system ability occurs exception" + e.getMessage());
            return null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    private static IBinder b(String str) {
        try {
            Object objInvoke = Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, str);
            if (objInvoke instanceof IBinder) {
                return (IBinder) objInvoke;
            }
        } catch (ReflectiveOperationException e) {
            Log.e("ConnectUtils", "getService exception" + e.getMessage());
        }
        return null;
    }
}
