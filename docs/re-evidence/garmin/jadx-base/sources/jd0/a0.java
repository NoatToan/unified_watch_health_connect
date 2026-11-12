package jd0;

import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f98331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f98332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f98333d;

    public /* synthetic */ a0(i53.c cVar, LocalDate localDate, LocalDate localDate2, int i14) {
        this.f98330a = i14;
        this.f98331b = cVar;
        this.f98332c = localDate;
        this.f98333d = localDate2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98330a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d61.c.a(this.f98331b, this.f98332c, this.f98333d, c61.a.HEAT, mVar, x61.e.f189206q | 3072);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d61.c.a(this.f98331b, this.f98332c, this.f98333d, c61.a.ALTITUDE, mVar2, x61.e.f189206q | 3072);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
