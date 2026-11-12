package jd1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd1/i;", "Landroidx/lifecycle/x1$c;", "Lpd1/a;", "reminderType", "Lpd1/c;", "defaultReminders", "<init>", "(Lpd1/a;Lpd1/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f98460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd1.c f98461b;

    public i(pd1.a aVar, pd1.c cVar) {
        aVar.getClass();
        this.f98460a = aVar;
        this.f98461b = cVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(h.class)) {
            return new h(this.f98460a, this.f98461b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }

    public /* synthetic */ i(pd1.a aVar, pd1.c cVar, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : cVar);
    }
}
