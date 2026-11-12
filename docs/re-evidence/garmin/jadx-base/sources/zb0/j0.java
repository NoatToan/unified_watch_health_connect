package zb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/j0;", "Landroidx/lifecycle/x1$c;", "Lpc0/j;", "deviceRepo", "<init>", "(Lpc0/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f203541a;

    static {
        pc0.j.a aVar = pc0.j.f137223i;
    }

    public /* synthetic */ j0(pc0.j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? pc0.j.a.a(pc0.j.f137223i) : jVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(i0.class)) {
            return new i0(this.f203541a);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }

    public j0(pc0.j jVar) {
        jVar.getClass();
        this.f203541a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
