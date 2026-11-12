package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class x4t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pbt f38702k = new pbt("AssetPackManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbs f38703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final was f38704b;
    public final r4s c;
    public final eks d;
    public final ihs e;
    public final tds f;
    public final xns g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final i7s i;
    public final i7s j;

    public x4t(tbs tbsVar, i7s i7sVar, was wasVar, r4s r4sVar, eks eksVar, ihs ihsVar, tds tdsVar, i7s i7sVar2, xns xnsVar) {
        this.f38703a = tbsVar;
        this.i = i7sVar;
        this.f38704b = wasVar;
        this.c = r4sVar;
        this.d = eksVar;
        this.e = ihsVar;
        this.f = tdsVar;
        this.j = i7sVar2;
        this.g = xnsVar;
    }

    public final /* synthetic */ void c() {
        Task taskD = ((vgt) this.i.a()).d(this.f38703a.F());
        Executor executor = (Executor) this.j.a();
        final tbs tbsVar = this.f38703a;
        Objects.requireNonNull(tbsVar);
        taskD.addOnSuccessListener(executor, new OnSuccessListener() { // from class: gzs
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                tbsVar.c((List) obj);
            }
        }).addOnFailureListener((Executor) this.j.a(), new OnFailureListener() { // from class: u0t
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                x4t.f38702k.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    public final void d(boolean z) {
        was wasVar = this.f38704b;
        boolean zE = wasVar.e();
        wasVar.c(z);
        if (!z || zE) {
            return;
        }
        e();
    }

    public final void e() {
        ((Executor) this.j.a()).execute(new Runnable() { // from class: jns
            @Override // java.lang.Runnable
            public final void run() {
                this.f22960a.c();
            }
        });
    }
}
