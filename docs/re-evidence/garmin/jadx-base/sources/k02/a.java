package k02;

import b5.s0;
import e23.l;
import f2.m;
import g6.k;
import h4.r;
import java.util.Iterator;
import o4.t0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102100b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f102099a = i14;
        this.f102100b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object next;
        int i14 = this.f102099a;
        d dVar = this.f102100b;
        switch (i14) {
            case 0:
                t0 t0Var = (t0) obj;
                t0Var.getClass();
                t0Var.x(Float.intBitsToFloat((int) (dVar.b() >> 32)));
                t0Var.q(Float.intBitsToFloat((int) (dVar.b() & 4294967295L)));
                return Unit.INSTANCE;
            case 1:
                t0 t0Var2 = (t0) obj;
                t0Var2.getClass();
                t0Var2.x(Float.intBitsToFloat((int) (dVar.f102114i.e().f123544a >> 32)));
                t0Var2.q(Float.intBitsToFloat((int) (dVar.f102114i.e().f123544a & 4294967295L)));
                return Unit.INSTANCE;
            case 2:
                long j8 = ((n4.c) obj).f123544a;
                Iterator<T> it = dVar.f102106a.i().e().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        m mVar = (m) next;
                        long f68169v = mVar.getF68169v();
                        k.a aVar = k.f76003b;
                        int i15 = (int) (f68169v >> 32);
                        int iC = (int) (d.c(mVar) >> 32);
                        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j8 >> 32));
                        if (i15 <= iIntBitsToFloat && iIntBitsToFloat <= iC) {
                            int f68169v2 = (int) (mVar.getF68169v() & 4294967295L);
                            int iC2 = (int) (d.c(mVar) & 4294967295L);
                            int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (j8 & 4294967295L));
                            if (f68169v2 > iIntBitsToFloat2 || iIntBitsToFloat2 > iC2) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                m mVar2 = (m) next;
                if (mVar2 != null) {
                    dVar.f102109d.setValue(Integer.valueOf(mVar2.getF62559a()));
                    long f68169v3 = mVar2.getF68169v();
                    k.a aVar2 = k.f76003b;
                    float f14 = (int) (f68169v3 & 4294967295L);
                    long jFloatToRawIntBits = Float.floatToRawIntBits((int) (f68169v3 >> 32));
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(f14);
                    n4.c.a aVar3 = n4.c.f123541b;
                    dVar.f102111f.setValue(n4.c.a((jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2)));
                }
                return Unit.INSTANCE;
            case 3:
                r rVar = (r) obj;
                rVar.getClass();
                dVar.getClass();
                return s0.b(rVar, dVar, new f(dVar));
            default:
                r rVar2 = (r) obj;
                rVar2.getClass();
                dVar.getClass();
                return s0.b(rVar2, dVar, new f(dVar));
        }
    }
}
