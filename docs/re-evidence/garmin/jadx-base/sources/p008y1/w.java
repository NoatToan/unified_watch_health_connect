package p008y1;

import b2.e;
import j23.l;
import j23.t;
import java.util.concurrent.CancellationException;
import o13.q;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q3.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/w;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<z.a> f193690a = new c<>(new z.a[16], 0);

    public final void a(CancellationException cancellationException) {
        c<z.a> cVar = this.f193690a;
        int i14 = cVar.f142358c;
        j[] jVarArr = new j[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            jVarArr[i15] = cVar.f142356a[i15].f193742b;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            jVarArr[i16].u(cancellationException);
        }
        if (cVar.f142358c == 0) {
            return;
        }
        e.c("uncancelled requests present");
    }

    public final void b() {
        c<z.a> cVar = this.f193690a;
        l lVarO = t.o(0, cVar.f142358c);
        int i14 = lVarO.f96796a;
        int i15 = lVarO.f96797b;
        if (i14 <= i15) {
            while (true) {
                j<Unit> jVar = cVar.f142356a[i14].f193742b;
                Unit unit = Unit.INSTANCE;
                int i16 = q.f128596b;
                jVar.resumeWith(unit);
                if (i14 == i15) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        cVar.g();
    }
}
