package g52;

import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z42.i f75962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f75963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f75964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f75965e;

    public /* synthetic */ l(z42.i iVar, LocalDate localDate, LocalDate localDate2, int i14) {
        this.f75961a = 1;
        this.f75962b = iVar;
        this.f75963c = localDate;
        this.f75964d = localDate2;
        this.f75965e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f75961a) {
            case 0:
                ((Integer) obj2).getClass();
                m.a(this.f75962b, this.f75963c, this.f75964d, this.f75965e, (p3.m) obj, p0.t(1));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m.a(this.f75962b, this.f75963c, this.f75964d, this.f75965e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.a(this.f75962b, this.f75963c, this.f75964d, this.f75965e, (p3.m) obj, p0.t(3073));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(z42.i iVar, LocalDate localDate, LocalDate localDate2, int i14, int i15, int i16) {
        this.f75961a = i16;
        this.f75962b = iVar;
        this.f75963c = localDate;
        this.f75964d = localDate2;
        this.f75965e = i14;
    }
}
