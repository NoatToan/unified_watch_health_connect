package i02;

import b5.a0;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f86865b;

    public /* synthetic */ k(p pVar, int i14) {
        this.f86864a = i14;
        this.f86865b = pVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f86864a;
        p pVar = this.f86865b;
        switch (i14) {
            case 0:
                a0 a0Var = (a0) obj;
                n4.c cVar = (n4.c) obj2;
                a0Var.a();
                long j8 = a0Var.f15750c;
                pVar.w((int) Float.intBitsToFloat((int) (j8 >> 32)), (int) Float.intBitsToFloat((int) (j8 & 4294967295L)), (int) Float.intBitsToFloat((int) (cVar.f123544a >> 32)), (int) Float.intBitsToFloat((int) (cVar.f123544a & 4294967295L)));
                return Unit.INSTANCE;
            default:
                List list = (List) obj;
                List list2 = (List) obj2;
                p.a aVar = p.f86882o;
                list.getClass();
                list2.getClass();
                Object objD0 = h0.d0(list);
                Integer numValueOf = objD0 != null ? Integer.valueOf(pVar.l(objD0)) : null;
                Object objD1 = h0.d0(list2);
                return Boolean.valueOf(p005kotlin.jvm.internal.s.g(numValueOf, objD1 != null ? Integer.valueOf(pVar.l(objD1)) : null) && list.size() == list2.size());
        }
    }
}
