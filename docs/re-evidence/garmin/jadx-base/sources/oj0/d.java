package oj0;

import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loj0/d;", "Loj0/a;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oj0.a
    public final Object a(String str, v13.c cVar) throws Throwable {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f132275c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f132275c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objE0 = bVar.f132273a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f132275c;
        if (i15 == 0) {
            o13.r.b(objE0);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            c cVar3 = new c(str, null);
            bVar.f132275c = 1;
            objE0 = ge1.b.e0(bVar2, cVar3, bVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }
}
