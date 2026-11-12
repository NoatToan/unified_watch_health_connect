package gg;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gg.a f77101a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77102b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77103c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f77104d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f77105e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            gg.a c1558a;
            c cVar = c.this;
            int i14 = gg.a.AbstractBinderC1557a.f77097a;
            if (iBinder == null) {
                c1558a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                c1558a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gg.a)) ? new gg.a.AbstractBinderC1557a.C1558a(iBinder) : (gg.a) iInterfaceQueryLocalInterface;
            }
            cVar.f77101a = c1558a;
            synchronized (c.this.f77104d) {
                c.this.f77104d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            c.this.f77101a = null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f77107a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
    }

    public final String a(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f77102b)) {
            this.f77102b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f77103c)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f77102b, 64).signatures;
            } catch (PackageManager.NameNotFoundException e4) {
                e4.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb3 = new StringBuilder();
                        for (byte b14 : bArrDigest) {
                            sb3.append(Integer.toHexString((b14 & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
                        }
                        string = sb3.toString();
                    }
                } catch (NoSuchAlgorithmException e14) {
                    e14.printStackTrace();
                }
            }
            this.f77103c = string;
        }
        gg.a aVar = this.f77101a;
        String str = this.f77102b;
        String str2 = this.f77103c;
        gg.a.AbstractBinderC1557a.C1558a c1558a = (gg.a.AbstractBinderC1557a.C1558a) aVar;
        c1558a.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            c1558a.f77098a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string2 = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return TextUtils.isEmpty(string2) ? "" : string2;
        } catch (Throwable th3) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th3;
        }
    }
}
