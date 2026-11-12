package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.AuthManager;
import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import com.huawei.wearengine.auth.AuthListener;
import com.huawei.wearengine.auth.Permission;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes46.dex */
public class yhz implements WearEngineBinderClient {
    private static volatile yhz e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53359c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f53357a = {Permission.MOTION_SENSOR.getName(), Permission.WEAR_USER_STATUS.getName(), Permission.DEVICE_SN.getName()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f53358b = new IBinder.DeathRecipient() { // from class: yhz.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            yis.b("AuthServiceProxy", "binderDied enter");
            if (yhz.this.d != null) {
                yhz.this.d.asBinder().unlinkToDeath(yhz.this.f53358b, 0);
                yhz.this.d = null;
            }
        }
    };
    private volatile AuthManager d = null;

    private yhz() {
        c();
    }

    private void a() throws RemoteException {
        synchronized (this.f53359c) {
            if (this.d == null) {
                WearEngineClientInner.c().e();
                IBinder iBinderB = WearEngineClientInner.c().b(5);
                if (iBinderB == null) {
                    yis.d("AuthServiceProxy", "binder == null");
                    throw new yib(2);
                }
                this.d = AuthManager.Stub.asInterface(iBinderB);
                this.d.asBinder().linkToDeath(this.f53358b, 0);
            }
        }
    }

    public static yhz e() {
        if (e == null) {
            synchronized (yhz.class) {
                if (e == null) {
                    e = new yhz();
                }
            }
        }
        return e;
    }

    public int c(AuthListener authListener, Permission[] permissionArr) {
        try {
            a();
            if (!b(permissionArr)) {
                throw new yib(14);
            }
            if (ylk.d("auth_pre_start_auth")) {
                return a(authListener, permissionArr);
            }
            if (this.d != null) {
                return this.d.requestPermission(authListener, permissionArr);
            }
            return 6;
        } catch (RemoteException unused) {
            yis.c("AuthServiceProxy", "requestPermission RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    public boolean a(Permission permission) {
        try {
            a();
            if (!b(new Permission[]{permission})) {
                throw new yib(14);
            }
            if (this.d != null) {
                return this.d.checkPermission(permission);
            }
            throw new yib(6);
        } catch (RemoteException unused) {
            yis.c("AuthServiceProxy", "checkPermission RemoteException");
            throw new yib(12);
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    @Override // com.huawei.wearengine.WearEngineBinderClient
    public void clearBinderProxy() {
        this.d = null;
        yis.b("AuthServiceProxy", "clearBinderProxy");
    }

    private void c() {
        WearEngineClientInner.c().a(new yhv(new WeakReference(this)));
    }

    private int a(AuthListener authListener, Permission[] permissionArr) {
        if (permissionArr == null || permissionArr.length == 0) {
            yis.d("AuthServiceProxy", "startAuth permissions is null or empty");
            return 5;
        }
        try {
            a();
            if (this.d == null) {
                yis.d("AuthServiceProxy", "startAuth mAuthManager is null");
                return 6;
            }
            String strPreStartAuth = this.d.preStartAuth(authListener);
            if (TextUtils.isEmpty(strPreStartAuth)) {
                yis.d("AuthServiceProxy", "startAuth targetJson is empty");
                return 12;
            }
            try {
                Context contextE = ylx.e();
                Intent intentA = ymf.a(contextE, strPreStartAuth, permissionArr);
                if (intentA == null) {
                    return 12;
                }
                yis.a("AuthServiceProxy", "startAuth: start ClientHubActivity");
                contextE.startActivity(intentA);
                return 0;
            } catch (ActivityNotFoundException unused) {
                yis.c("AuthServiceProxy", "startAuth ActivityNotFoundException");
                return 12;
            }
        } catch (RemoteException unused2) {
            yis.c("AuthServiceProxy", "requestPermission RemoteException");
            return 12;
        } catch (IllegalStateException e2) {
            throw yib.d(e2);
        }
    }

    private boolean b(Permission[] permissionArr) {
        yir.d(permissionArr, "isSupportPermissions permissions can not be null.");
        for (Permission permission : permissionArr) {
            yir.d(permission, "isSupportPermissions permission can not be null.");
            if (Arrays.asList(this.f53357a).contains(permission.getName()) && !ylk.d(permission.getName())) {
                return false;
            }
        }
        return true;
    }
}
