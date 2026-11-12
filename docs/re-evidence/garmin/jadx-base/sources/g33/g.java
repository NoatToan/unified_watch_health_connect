package g33;

import c33.t;
import e33.k;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p13.j0;
import s33.m;
import s33.o;
import s33.v;
import s33.y;
import u33.j;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f75724a = new g();

    private g() {
    }

    public static boolean a(Metadata metadata) {
        return new f33.c(metadata.mv()).compareTo(new f33.c(1, 4, 0)) < 0;
    }

    public static t b(Metadata metadata) throws InvalidProtocolBufferException {
        p<w33.e, m> pVarI = w33.g.i(dh.b.O(metadata), metadata.d2());
        w33.e eVar = pVarI.f128594a;
        m mVar = pVarI.f128595b;
        boolean zA = a(metadata);
        j0 j0Var = j0.f134944a;
        mVar.getClass();
        eVar.getClass();
        j0Var.getClass();
        t tVar = new t();
        v vVar = mVar.f156742g;
        vVar.getClass();
        u33.h hVar = new u33.h(vVar);
        j.a aVar = j.f168343b;
        y yVar = mVar.f156743h;
        yVar.getClass();
        aVar.getClass();
        d33.m mVar2 = new d33.m(eVar, hVar, j.a.a(yVar), zA, null, j0Var, 16, null);
        List<s33.j> list = mVar.f156739d;
        list.getClass();
        List<o> list2 = mVar.f156740e;
        list2.getClass();
        List<s33.t> list3 = mVar.f156741f;
        list3.getClass();
        d33.o.j(tVar, list, list2, list3, mVar2);
        Iterator<T> it = mVar2.f57417h.iterator();
        while (it.hasNext()) {
            ((k) it.next()).c(tVar, mVar, mVar2);
        }
        return tVar;
    }
}
