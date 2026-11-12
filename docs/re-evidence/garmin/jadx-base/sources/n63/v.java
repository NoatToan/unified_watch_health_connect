package n63;

import kotlinx.serialization.json.internal.JsonDecodingException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln63/v;", "Li63/c;", "Ln63/u;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements i63.c<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f123945a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f123946b = k63.k.f("kotlinx.serialization.json.JsonNull", k63.l.b.f103252a, new k63.e[0]);

    private v() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        g8.i.n(eVar);
        if (eVar.D()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return u.INSTANCE;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f123946b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        ((u) obj).getClass();
        g8.i.l(fVar);
        fVar.D();
    }
}
