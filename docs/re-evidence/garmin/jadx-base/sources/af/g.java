package af;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/g;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.b f3018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<ye.a<T>> f3021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f3022e;

    public g(Context context, ef.b bVar) {
        context.getClass();
        bVar.getClass();
        this.f3018a = bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f3019b = applicationContext;
        this.f3020c = new Object();
        this.f3021d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t7) {
        synchronized (this.f3020c) {
            T t14 = this.f3022e;
            if (t14 == null || !t14.equals(t7)) {
                this.f3022e = t7;
                this.f3018a.c().execute(new ab.j(1, h0.b1(this.f3021d), this));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
