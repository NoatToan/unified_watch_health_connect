package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/g;", "Li63/c;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements i63.c<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f116948a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f116949b = new q1("kotlin.Boolean", k63.d.a.f103224a);

    private g() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return Boolean.valueOf(eVar.y());
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f116949b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.i(((Boolean) obj).booleanValue());
    }
}
