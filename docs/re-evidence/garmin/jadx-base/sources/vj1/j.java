package vj1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvj1/j;", "Landroidx/lifecycle/x1$c;", "Lwj1/a;", "data", "Lvj1/b;", "configuration", "Lhl/a;", "screenAccessRole", "<init>", "(Lwj1/a;Lvj1/b;Lhl/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wj1.a f178478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f178479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f178480c;

    public j(wj1.a aVar, b bVar, hl.a aVar2) {
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.f178478a = aVar;
        this.f178479b = bVar;
        this.f178480c = aVar2;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(i.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new i(this.f178478a, this.f178479b, this.f178480c);
    }

    public /* synthetic */ j(wj1.a aVar, b bVar, hl.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, bVar, (i14 & 4) != 0 ? hl.a.c.f84256b : aVar2);
    }
}
