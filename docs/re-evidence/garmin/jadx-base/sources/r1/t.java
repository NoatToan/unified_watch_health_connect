package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class t extends p005kotlin.jvm.internal.w implements e23.l<Integer, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Integer> f149241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q<Object> f149242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(e23.l<? super Integer, Integer> lVar, q<Object> qVar) {
        super(1);
        this.f149241a = lVar;
        this.f149242b = qVar;
    }

    @Override // e23.l
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        q<Object> qVar = this.f149242b;
        int iH = (int) (q.h(qVar) & 4294967295L);
        long j8 = iIntValue;
        g6.m.a aVar = g6.m.f76012b;
        long jG = q.g(qVar, (j8 & 4294967295L) | (j8 << 32), q.h(qVar));
        g6.k.a aVar2 = g6.k.f76003b;
        return this.f149241a.invoke(Integer.valueOf(iH - ((int) (jG & 4294967295L))));
    }
}
