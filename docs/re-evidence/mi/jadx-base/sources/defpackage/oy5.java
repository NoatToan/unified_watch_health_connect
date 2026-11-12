package defpackage;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class oy5 {
    public static final String e = ppe.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jfl f29803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1l f29804b;
    public final h14 c;
    public final Map<String, Runnable> d = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f29805a;

        public a(WorkSpec workSpec) {
            this.f29805a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            ppe.e().a(oy5.e, "Scheduling work " + this.f29805a.id);
            oy5.this.f29803a.b(this.f29805a);
        }
    }

    public oy5(jfl jflVar, h1l h1lVar, h14 h14Var) {
        this.f29803a = jflVar;
        this.f29804b = h1lVar;
        this.c = h14Var;
    }

    public void a(WorkSpec workSpec, long j) {
        Runnable runnableRemove = this.d.remove(workSpec.id);
        if (runnableRemove != null) {
            this.f29804b.a(runnableRemove);
        }
        a aVar = new a(workSpec);
        this.d.put(workSpec.id, aVar);
        this.f29804b.b(j - this.c.currentTimeMillis(), aVar);
    }

    public void b(String str) {
        Runnable runnableRemove = this.d.remove(str);
        if (runnableRemove != null) {
            this.f29804b.a(runnableRemove);
        }
    }
}
