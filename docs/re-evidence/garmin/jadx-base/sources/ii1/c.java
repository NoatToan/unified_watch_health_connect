package ii1;

import o13.q;
import o13.r;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lii1/c;", "", "Lrd2/f;", "deviceDAO", "Lo53/z;", "dispatcher", "<init>", "(Lrd2/f;Lo53/z;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd2.f f93769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f93770b;

    public c(rd2.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        this.f93769a = fVar;
        this.f93770b = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f93766c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f93766c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objE0 = aVar.f93764a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f93766c;
        if (i15 == 0) {
            r.b(objE0);
            b bVar = new b(this, j8, null);
            aVar.f93766c = 1;
            objE0 = ge1.b.e0(this.f93770b, bVar, aVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((q) objE0).f128597a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(rd2.f fVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(fVar, zVar);
    }
}
