package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/v0;", "Li63/c;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 implements i63.c<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f117027a = new v0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f117028b = new q1("kotlin.Long", k63.d.g.f103230a);

    private v0() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return Long.valueOf(eVar.o());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f117028b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.s(((Number) obj).longValue());
    }
}
