package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/c2;", "Li63/c;", "Lo13/v;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 implements i63.c<o13.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f116928a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0 f116929b;

    static {
        p005kotlin.jvm.internal.d.f105790a.getClass();
        f116929b = k1.a("kotlin.UByte", i.f116959a);
    }

    private c2() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return o13.v.a(eVar.k(f116929b).m());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF94809a() {
        return f116929b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.g(f116929b).w(((o13.v) obj).f128609a);
    }
}
