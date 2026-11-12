package b5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/p;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<o> f15865a = new q3.c<>(new o[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.q0<p> f15866b = new p1.q0<>(10);

    public boolean a(p1.z<a0> zVar, f5.c0 c0Var, k kVar, boolean z14) {
        q3.c<o> cVar = this.f15865a;
        o[] oVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        boolean z15 = false;
        for (int i15 = 0; i15 < i14; i15++) {
            z15 = oVarArr[i15].a(zVar, c0Var, kVar, z14) || z15;
        }
        return z15;
    }

    public void b(k kVar) {
        q3.c<o> cVar = this.f15865a;
        int i14 = cVar.f142358c;
        while (true) {
            i14--;
            if (-1 >= i14) {
                return;
            }
            if (cVar.f142356a[i14].f15857d.f24450a == 0) {
                cVar.k(i14);
            }
        }
    }
}
