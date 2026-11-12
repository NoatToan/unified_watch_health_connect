package v92;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv92/c0;", "Landroidx/lifecycle/x1$c;", "Lq92/f;", "consentRepository", "Lp92/a;", "consentAppDelegate", "Lq92/z;", "dispatcherProvider", "<init>", "(Lq92/f;Lp92/a;Lq92/z;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q92.f f176315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p92.a f176316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q92.z f176317c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c0(q92.f fVar, p92.a aVar, q92.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        fVar = (i14 & 1) != 0 ? q92.f.a.a(q92.f.f143627e) : fVar;
        if ((i14 & 2) != 0) {
            p92.o.f136619a.getClass();
            aVar = p92.o.l();
        }
        this(fVar, aVar, (i14 & 4) != 0 ? new q92.z(null, null, null, 7, null) : zVar);
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(r.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new r(this.f176315a, this.f176316b, this.f176317c);
    }

    public c0(q92.f fVar, p92.a aVar, q92.z zVar) {
        fVar.getClass();
        aVar.getClass();
        zVar.getClass();
        this.f176315a = fVar;
        this.f176316b = aVar;
        this.f176317c = zVar;
    }

    public c0() {
        this(null, null, null, 7, null);
    }
}
