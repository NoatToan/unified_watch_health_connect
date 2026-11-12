package y10;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly10/i;", "Landroidx/lifecycle/x1$c;", "Lr10/a;", "connectIQAppSettingsRepo", "<init>", "(Lr10/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.a f193891a;

    public /* synthetic */ i(r10.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new r10.a() : aVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(f.class)) {
            return new f(this.f193891a);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }

    public i(r10.a aVar) {
        aVar.getClass();
        this.f193891a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
