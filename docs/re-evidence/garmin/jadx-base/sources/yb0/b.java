package yb0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyb0/b;", "Landroidx/lifecycle/x1$c;", "Lyb0/c;", "supportedDevicesRepo", "<init>", "(Lyb0/c;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f195680a;

    public b(c cVar) {
        cVar.getClass();
        this.f195680a = cVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(a.class)) {
            return new a(this.f195680a);
        }
        h.s("Incompatible ViewModel class!");
        return null;
    }
}
