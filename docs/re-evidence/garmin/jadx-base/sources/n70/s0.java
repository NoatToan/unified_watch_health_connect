package n70;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s0 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j70.k.c f124542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j70.k.f f124543b;

    public s0(j70.k.c cVar, j70.k.f fVar) {
        this.f124542a = cVar;
        this.f124543b = fVar;
    }

    @Override // e23.a
    public final Boolean invoke() {
        j70.k.c cVar = this.f124542a;
        String strA = cVar != null ? cVar.a() : null;
        String str = cVar != null ? cVar.f97554e : null;
        String str2 = cVar != null ? cVar.f97555f : null;
        List<pb2.a.d> list = cVar != null ? cVar.f97557h : null;
        j70.k.f fVar = this.f124543b;
        List listK = p13.x.k(strA, str, str2, list, fVar != null ? fVar.f97566b : null, fVar != null ? fVar.G : null, fVar != null ? fVar.H : null, fVar != null ? fVar.f97569e : null, fVar != null ? fVar.A : null, fVar != null ? fVar.Q : null);
        boolean z14 = true;
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    z14 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }
}
