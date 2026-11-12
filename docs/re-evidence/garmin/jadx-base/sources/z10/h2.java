package z10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz10/h2;", "Landroidx/lifecycle/x1$c;", "Lhl/a;", "screenAccessRole", "<init>", "(Lhl/a;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h2 implements androidx.lifecycle.x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl.a f201030a;

    static {
        hl.a.Companion companion = hl.a.INSTANCE;
    }

    public /* synthetic */ h2(hl.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? hl.a.c.f84256b : aVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends androidx.lifecycle.u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(d2.class)) {
            return new d2(this.f201030a, e20.a.C1315a.a(e20.a.f62587b));
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }

    public h2(hl.a aVar) {
        aVar.getClass();
        this.f201030a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h2() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
