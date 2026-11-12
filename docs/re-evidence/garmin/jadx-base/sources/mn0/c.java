package mn0;

import androidx.room.a0;
import o13.q;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmn0/c;", "", "Lrd2/f;", "deviceDAO", "<init>", "(Lrd2/f;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd2.f f119696a;

    public c(rd2.f fVar) {
        fVar.getClass();
        this.f119696a = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f119693d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f119693d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objE0 = aVar.f119691b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f119693d;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(this, j8, null);
            aVar.f119690a = j8;
            aVar.f119693d = 1;
            objE0 = ge1.b.e0(bVar, bVar2, aVar);
            if (objE0 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = aVar.f119690a;
            r.b(objE0);
        }
        sd2.f fVar = (sd2.f) objE0;
        if (fVar != null) {
            int i16 = q.f128596b;
            return new vn0.a(fVar);
        }
        int i17 = q.f128596b;
        return new q.b(new IllegalArgumentException(a0.f(j8, "DeviceDatabaseRecord with deviceId=", " not found")));
    }
}
