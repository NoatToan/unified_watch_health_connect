package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/e2;", "Li63/c;", "Lo13/x;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e2 implements i63.c<o13.x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f116939a = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f116940b;

    static {
        p005kotlin.jvm.internal.r.f105809a.getClass();
        f116940b = k1.a("kotlin.UInt", m0.f116981a);
    }

    private e2() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return o13.x.a(eVar.k(f116940b).u());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f116940b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.g(f116940b).o(((o13.x) obj).f128614a);
    }
}
