package n63;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln63/k;", "Li63/c;", "Ln63/i;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements i63.c<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f123936a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f123937b = k63.k.e("kotlinx.serialization.json.JsonElement", k63.c.b.f103223a, new k63.e[0], new mi0.i(29));

    private k() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return g8.i.n(eVar).i();
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f123937b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        g8.i.l(fVar);
        if (iVar instanceof z) {
            fVar.l(a0.f123890a, iVar);
            return;
        }
        if (iVar instanceof x) {
            fVar.l(y.f123949a, iVar);
        } else if (iVar instanceof c) {
            fVar.l(d.f123897a, iVar);
        } else {
            u0.r();
        }
    }
}
