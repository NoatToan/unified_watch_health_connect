package i31;

import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li31/z;", "Lo53/b0;", "Lb31/h;", "promptOnboardingRepository", "Lf12/b;", "userAccount", "Lo53/z;", "ioDispatcher", "<init>", "(Lb31/h;Lf12/b;Lo53/z;)V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b31.h f90777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f90778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f90779c;

    public z(b31.h hVar, f12.b bVar, o53.z zVar) {
        hVar.getClass();
        bVar.getClass();
        zVar.getClass();
        this.f90777a = hVar;
        this.f90778b = bVar;
        this.f90779c = zVar;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF136462d() {
        return this.f90779c.plus(ge1.b.h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(b31.h hVar, f12.b bVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(hVar, bVar, zVar);
    }
}
