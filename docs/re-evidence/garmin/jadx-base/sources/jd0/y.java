package jd0;

import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98383a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f98384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.d f98385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f98386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f98387e;

    public /* synthetic */ y(h4.r rVar, i53.d dVar, DateTime dateTime, DateTime dateTime2) {
        this.f98384b = rVar;
        this.f98385c = dVar;
        this.f98386d = dateTime;
        this.f98387e = dateTime2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98383a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z32.f.a(this.f98385c, this.f98384b, this.f98386d, this.f98387e, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z32.e.a(this.f98384b, this.f98385c, this.f98386d, this.f98387e, 0.0f, 0.0f, 0, 0.0f, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                z32.f.a(this.f98385c, this.f98384b, this.f98386d, this.f98387e, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(i53.d dVar, h4.r rVar, DateTime dateTime, DateTime dateTime2) {
        this.f98385c = dVar;
        this.f98384b = rVar;
        this.f98386d = dateTime;
        this.f98387e = dateTime2;
    }

    public /* synthetic */ y(i53.d dVar, h4.r rVar, DateTime dateTime, DateTime dateTime2, int i14) {
        this.f98385c = dVar;
        this.f98384b = rVar;
        this.f98386d = dateTime;
        this.f98387e = dateTime2;
    }
}
