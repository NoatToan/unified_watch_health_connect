package h63;

import m63.q1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/j;", "Li63/c;", "Lb63/l;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i63.c<b63.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f82302a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f82303b = k63.k.a("kotlinx.datetime.Instant", k63.d.i.f103232a);

    private j() {
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
        return f82303b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.l lVar = (b63.l) obj;
        lVar.getClass();
        fVar.p(lVar.toString());
    }
}
