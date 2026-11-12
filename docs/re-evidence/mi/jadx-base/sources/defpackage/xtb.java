package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class xtb extends wsc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f39453b;

    public xtb(Context context, Executor executor) {
        this.f39452a = context;
        this.f39453b = executor;
    }

    public static /* synthetic */ void q5(usc uscVar) {
        try {
            uscVar.onSuccess(s0a.a());
        } catch (RemoteException e) {
            String.format("HealthDataSdkService#getIsInForeground failed: %s", e.getMessage());
        }
    }

    @Override // defpackage.wsc
    public void a2(String str, final String str2, final lyc lycVar) {
        t5(str);
        this.f39453b.execute(new Runnable() { // from class: ttb
            @Override // java.lang.Runnable
            public final void run() {
                this.f35019a.s5(str2, lycVar);
            }
        });
    }

    @Override // defpackage.wsc
    public void c1(String str, final vsc vscVar) {
        t5(str);
        this.f39453b.execute(new Runnable() { // from class: vtb
            @Override // java.lang.Runnable
            public final void run() {
                this.f37203a.r5(vscVar);
            }
        });
    }

    public final /* synthetic */ void r5(vsc vscVar) {
        try {
            String strA = lsh.a(this.f39452a);
            if (strA == null) {
                strA = "";
            }
            vscVar.onSuccess(strA);
        } catch (RemoteException e) {
            String.format("HealthDataSdkService#getPermissionToken failed: %s", e.getMessage());
        }
    }

    public final /* synthetic */ void s5(String str, lyc lycVar) {
        lsh.c(this.f39452a, str);
        try {
            lycVar.onSuccess();
        } catch (RemoteException e) {
            String.format("HealthDataSdkService#setPermissionToken failed: %s", e.getMessage());
        }
    }

    public final void t5(final String str) {
        String[] packagesForUid = this.f39452a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new Predicate() { // from class: wtb
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals((String) obj);
            }
        })) {
            throw new SecurityException("Invalid package name!");
        }
        if (!"com.google.android.apps.healthdata".equals(str)) {
            throw new SecurityException("Not allowed!");
        }
    }

    @Override // defpackage.wsc
    public void z(String str, final usc uscVar) {
        t5(str);
        this.f39453b.execute(new Runnable() { // from class: utb
            @Override // java.lang.Runnable
            public final void run() {
                xtb.q5(uscVar);
            }
        });
    }
}
