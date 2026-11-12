package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.android.powerkit.PowerKitConnection;
import com.huawei.android.powerkit.Sink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bdi {
    private static volatile bdi d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private bdf f1040c;
    private Context e;

    private bdi(Context context, PowerKitConnection powerKitConnection) {
        this.f1040c = null;
        this.e = context;
        this.f1040c = new bdf(context, powerKitConnection);
    }

    public static bdi d(Context context, PowerKitConnection powerKitConnection) {
        if (d == null) {
            synchronized (bdi.class) {
                if (d == null) {
                    d = new bdi(context, powerKitConnection);
                }
            }
        }
        return d;
    }

    public String d() throws RemoteException {
        return this.f1040c.a(this.e);
    }

    public boolean b(String str, int i, long j, String str2) throws RemoteException {
        return this.f1040c.d(this.e, true, str, i, j, str2);
    }

    public boolean e(String str, int i) throws RemoteException {
        return this.f1040c.d(this.e, false, str, i, -1L, null);
    }

    public boolean a(String str, int i, String str2) throws RemoteException {
        return this.f1040c.d(this.e, false, str, i, -1L, str2);
    }

    public boolean e(Sink sink, int i) throws RemoteException {
        return this.f1040c.c(sink, i);
    }

    public boolean d(Sink sink, int i) throws RemoteException {
        return this.f1040c.e(sink, i);
    }

    public boolean b() throws RemoteException {
        return this.f1040c.b(this.e);
    }

    public boolean a(List<String> list) throws RemoteException {
        return this.f1040c.c(this.e, list, true);
    }

    public boolean b(List<String> list) throws RemoteException {
        return this.f1040c.c(this.e, list, false);
    }
}
