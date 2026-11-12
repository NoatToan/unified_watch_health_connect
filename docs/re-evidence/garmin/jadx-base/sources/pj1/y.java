package pj1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpj1/y;", "Landroidx/lifecycle/x1$c;", "Lyj1/m;", "configuration", "Lhl/a;", "screenAccessRole", "<init>", "(Lyj1/m;Lhl/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj1.m f138013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl.a f138014b;

    static {
        hl.a.Companion companion = hl.a.INSTANCE;
    }

    public y(yj1.m mVar, hl.a aVar) {
        mVar.getClass();
        aVar.getClass();
        this.f138013a = mVar;
        this.f138014b = aVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(s.class)) {
            return new s(this.f138013a, this.f138014b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
