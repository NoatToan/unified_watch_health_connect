package u10;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu10/l;", "Landroidx/lifecycle/x1$c;", "Lu10/b;", "connectIQOAuthRepo", "<init>", "(Lu10/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f167762a;

    public /* synthetic */ l(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new b(null, 1, null) : bVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(i.class)) {
            return new i(this.f167762a);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }

    public l(b bVar) {
        bVar.getClass();
        this.f167762a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
