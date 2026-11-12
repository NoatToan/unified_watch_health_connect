package ir0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lir0/h;", "Li63/c;", "Lir0/g;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements i63.c<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k63.e f94809a = kotlinx.serialization.internal.g.f105973c.f117005b;

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        long[] jArrDeserialize = kotlinx.serialization.internal.g.f105973c.deserialize(eVar);
        return new g(jArrDeserialize[0], (int) jArrDeserialize[1]);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final k63.e getF94809a() {
        return this.f94809a;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        g gVar = (g) obj;
        gVar.getClass();
        kotlinx.serialization.internal.g.f105973c.serialize(fVar, new long[]{gVar.f94807a, gVar.f94808b});
    }
}
