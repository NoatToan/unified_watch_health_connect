package h63;

import b63.a0;
import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/i;", "Li63/c;", "Lb63/l;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements i63.c<b63.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f82300a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82301b = k63.k.a("kotlinx.datetime.Instant/ISO", k63.d.i.f103232a);

    private i() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        b63.l.Companion companion = b63.l.INSTANCE;
        String strS = eVar.s();
        c63.m.b.f25016a.getClass();
        c63.p pVar = c63.m.b.f25017b;
        companion.getClass();
        return b63.l.Companion.b(strS, pVar);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f82301b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.l lVar = (b63.l) obj;
        lVar.getClass();
        c63.m.b.f25016a.getClass();
        c63.p pVar = c63.m.b.f25017b;
        a0.INSTANCE.getClass();
        a0 a0Var = a0.f16172b;
        pVar.getClass();
        a0Var.getClass();
        a42.i iVar = new a42.i(22, lVar, a0Var);
        e63.p<c63.o, String> pVar2 = c63.q.f25042a;
        c63.m mVar = new c63.m(null, 1, 0 == true ? 1 : 0);
        iVar.invoke(mVar);
        fVar.p(pVar.b(mVar));
    }
}
