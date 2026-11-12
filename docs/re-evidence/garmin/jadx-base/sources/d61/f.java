package d61;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import c22.a0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld61/f;", "Landroidx/lifecycle/x1$c;", "Lc61/b;", "mapper", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lc61/b;Lc22/a0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c61.b f57996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f57997b;

    public /* synthetic */ f(c61.b bVar, a0 a0Var, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(e.class)) {
            return new e(this.f57996a, this.f57997b);
        }
        h.s("Unknown ViewModel class");
        return null;
    }

    public f(c61.b bVar, a0 a0Var) {
        bVar.getClass();
        a0Var.getClass();
        this.f57996a = bVar;
        this.f57997b = a0Var;
    }
}
