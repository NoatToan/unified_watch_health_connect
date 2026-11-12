package androidx.room;

import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/u;", "", "", "size", "<init>", "(I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f10962a;

    public u(int i14) {
        this.f10962a = q2.a(new int[i14]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final u13.a a(z0.b bVar, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f10961c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f10961c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f10959a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f10961c;
        if (i15 == 0) {
            o13.r.b(obj);
            tVar.f10961c = 1;
            if (this.f10962a.collect(bVar, tVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
