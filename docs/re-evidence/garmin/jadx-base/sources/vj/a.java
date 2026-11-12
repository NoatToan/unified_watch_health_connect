package vj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import vb.h;
import wj.b;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f178442c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj.a f178443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f178444b;

    /* JADX INFO: renamed from: vj.a$a, reason: collision with other inner class name */
    public enum EnumC3334a {
        /* JADX INFO: Fake field, exist only in values array */
        INVALID(-1),
        CHANNEL_PROVIDER(1),
        /* JADX INFO: Fake field, exist only in values array */
        ADAPTER_PROVIDER(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f178447a;

        static {
            values();
        }

        EnumC3334a(int i14) {
            this.f178447a = i14;
        }
    }

    public a(IBinder iBinder) {
        zj.a c3826a;
        int i14 = zj.a.AbstractBinderC3825a.f204888a;
        if (iBinder == null) {
            c3826a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.dsi.ant.ipc.aidl.IAntServiceAidl");
            c3826a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zj.a)) ? new zj.a.AbstractBinderC3825a.C3826a(iBinder) : (zj.a) iInterfaceQueryLocalInterface;
        }
        this.f178443a = c3826a;
        if (c3826a != null) {
            return;
        }
        h.s("The given service binder does not seem to be for the ANT Radio Service");
        throw null;
    }

    public static int a(Context context) {
        if (context == null) {
            return f178442c;
        }
        try {
            f178442c = context.getPackageManager().getPackageInfo("com.dsi.ant.service.socket", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            f178442c = 0;
        }
        return f178442c;
    }

    public static boolean b() {
        int i14 = f178442c;
        return i14 > 40000 || i14 == -1;
    }
}
