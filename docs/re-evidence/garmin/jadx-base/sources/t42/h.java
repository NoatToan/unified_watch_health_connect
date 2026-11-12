package t42;

import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;
import q42.y;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f162340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f162341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f162342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f162343e;

    public /* synthetic */ h(y yVar, DateTime dateTime, DateTime dateTime2, e23.l lVar, int i14, int i15) {
        this.f162339a = i15;
        this.f162340b = yVar;
        this.f162341c = dateTime;
        this.f162342d = dateTime2;
        this.f162343e = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f162339a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.b(this.f162340b, this.f162341c, this.f162342d, this.f162343e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                t.b(this.f162340b, this.f162341c, this.f162342d, this.f162343e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
