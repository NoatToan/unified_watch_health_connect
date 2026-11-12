package r1;

import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class x extends p005kotlin.jvm.internal.w implements e23.l<Integer, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q<Object> f149307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Integer> f149308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(q<Object> qVar, e23.l<? super Integer, Integer> lVar) {
        super(1);
        this.f149307a = qVar;
        this.f149308b = lVar;
    }

    @Override // e23.l
    public final Integer invoke(Integer num) {
        long j8;
        int iIntValue = num.intValue();
        q<Object> qVar = this.f149307a;
        x3<g6.m> x3VarD = qVar.f149195e.d(qVar.f149191a.f155747d.getF182175a());
        if (x3VarD != null) {
            j8 = x3VarD.getF182175a().f76013a;
        } else {
            g6.m.f76012b.getClass();
            j8 = 0;
        }
        long j14 = j8;
        long j15 = iIntValue;
        long j16 = (j15 << 32) | (j15 & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        long jA = qVar.f149192b.a(j16, j14, g6.o.Ltr);
        g6.k.a aVar2 = g6.k.f76003b;
        return this.f149308b.invoke(Integer.valueOf((-((int) (jA & 4294967295L))) - iIntValue));
    }
}
