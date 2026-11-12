package q72;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq72/i;", "Lq82/c;", "Ln82/d;", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements q82.c<n82.d> {
    @Override // q82.c
    public final String a(n82.d dVar) {
        n82.d dVar2 = dVar;
        o82.a aVar = dVar2.f124956a;
        o oVar = aVar.f130843a;
        if (dVar2.f124957b == o82.g.f130849b) {
            return "Current";
        }
        o oVar2 = aVar.f130844b;
        if (s.g(oVar, oVar2)) {
            return oVar.toString();
        }
        return oVar + " - " + oVar2;
    }
}
