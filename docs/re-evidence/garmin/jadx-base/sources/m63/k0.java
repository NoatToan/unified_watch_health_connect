package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lm63/k0;", "Lm63/e0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements e0<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i63.c<Object> f116968a;

    public k0(i63.c<Object> cVar) {
        this.f116968a = cVar;
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        return new i63.c[]{this.f116968a};
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // i63.i, i63.b
    public final k63.e getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }
}
