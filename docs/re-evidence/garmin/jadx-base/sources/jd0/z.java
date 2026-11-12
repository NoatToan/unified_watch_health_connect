package jd0;

import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm1.b f98389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f98390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f98391d;

    public /* synthetic */ z(mm1.b bVar, LocalDate localDate, LocalDate localDate2) {
        this.f98389b = bVar;
        this.f98390c = localDate;
        this.f98391d = localDate2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98388a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    rn1.g.a(this.f98389b, this.f98390c, this.f98391d, false, null, mVar, 8, 16);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rn1.b.a(this.f98389b, this.f98390c, this.f98391d, (p3.m) obj, p0.t(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z(mm1.b bVar, LocalDate localDate, LocalDate localDate2, int i14) {
        this.f98389b = bVar;
        this.f98390c = localDate;
        this.f98391d = localDate2;
    }
}
