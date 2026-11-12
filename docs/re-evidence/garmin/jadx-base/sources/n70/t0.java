package n70;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class t0 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j70.k.f f124577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j70.k.c f124578b;

    public t0(j70.k.f fVar, j70.k.c cVar) {
        this.f124577a = fVar;
        this.f124578b = cVar;
    }

    @Override // e23.a
    public final Boolean invoke() {
        j70.k.f fVar = this.f124577a;
        String str = fVar != null ? fVar.f97566b : null;
        String str2 = fVar != null ? fVar.G : null;
        String str3 = fVar != null ? fVar.H : null;
        String str4 = fVar != null ? fVar.A : null;
        String str5 = fVar != null ? fVar.N : null;
        pb2.e.c cVar = fVar != null ? fVar.Q : null;
        j70.k.c cVar2 = this.f124578b;
        List listK = p13.x.k(str, str2, str3, str4, str5, cVar, cVar2 != null ? cVar2.f97554e : null, cVar2 != null ? cVar2.f97555f : null, cVar2 != null ? cVar2.f97551b : null, cVar2 != null ? cVar2.f97557h : null);
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
