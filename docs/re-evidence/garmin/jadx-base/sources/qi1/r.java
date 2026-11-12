package qi1;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqi1/r;", "Landroidx/lifecycle/x1$c;", "", "deviceId", "Ll22/b;", "resourceResolver", "<init>", "(JLl22/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f144924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f144925b;

    public r(long j8, l22.b bVar) {
        bVar.getClass();
        this.f144924a = j8;
        this.f144925b = bVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(f.class)) {
            return new f(this.f144924a, this.f144925b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
