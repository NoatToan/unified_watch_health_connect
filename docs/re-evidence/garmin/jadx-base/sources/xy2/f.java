package xy2;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxy2/f;", "Lxy2/e;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f192724a = new LinkedHashMap();

    @Override // xy2.e
    public final <E extends h> E a(h.b<? extends E> bVar) {
        bVar.getClass();
        LinkedHashMap linkedHashMap = this.f192724a;
        Object objA = linkedHashMap.get(bVar);
        if (objA == null) {
            objA = bVar.a();
            linkedHashMap.put(bVar, objA);
        }
        objA.getClass();
        return (E) objA;
    }
}
