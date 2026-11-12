package n63;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln63/a0;", "Li63/c;", "Ln63/z;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 implements i63.c<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f123890a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f123891b = k63.k.f("kotlinx.serialization.json.JsonPrimitive", k63.d.i.f103232a, new k63.e[0]);

    private a0() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        i iVarI = g8.i.n(eVar).i();
        if (iVarI instanceof z) {
            return (z) iVarI;
        }
        StringBuilder sb3 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw gg.b.h(iVarI.toString(), -1, p6.b.h(s0.f105811a, iVarI.getClass(), sb3));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f123891b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        z zVar = (z) obj;
        zVar.getClass();
        g8.i.l(fVar);
        if (zVar instanceof u) {
            fVar.l(v.f123945a, u.INSTANCE);
        } else {
            fVar.l(r.f123942a, (q) zVar);
        }
    }
}
