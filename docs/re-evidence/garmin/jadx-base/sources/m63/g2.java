package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/g2;", "Li63/c;", "Lo13/z;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 implements i63.c<o13.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f116952a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f116953b;

    static {
        p005kotlin.jvm.internal.x.f105817a.getClass();
        f116953b = k1.a("kotlin.ULong", v0.f117027a);
    }

    private g2() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return o13.z.a(eVar.k(f116953b).o());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f116953b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.g(f116953b).s(((o13.z) obj).f128619a);
    }
}
