package m63;

import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/d1;", "Li63/c;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 implements i63.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f116932a = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f116933b = c1.f116925a;

    private d1() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f116933b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        ((Void) obj).getClass();
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
