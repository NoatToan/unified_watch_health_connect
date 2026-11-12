package d70;

import e23.p;
import h4.r;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58088a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f58089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k61.b f58090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o82.g f58091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f58092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ DateTime f58093f;

    public /* synthetic */ c(r rVar, k61.b bVar, o82.g gVar, DateTime dateTime, DateTime dateTime2) {
        this.f58089b = rVar;
        this.f58090c = bVar;
        this.f58091d = gVar;
        this.f58092e = dateTime;
        this.f58093f = dateTime2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58088a) {
            case 0:
                ((Integer) obj2).getClass();
                g.c(this.f58089b, this.f58090c, this.f58091d, this.f58092e, this.f58093f, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    g.c(this.f58089b, this.f58090c, this.f58091d, this.f58092e, this.f58093f, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(r rVar, k61.b bVar, o82.g gVar, DateTime dateTime, DateTime dateTime2, int i14) {
        this.f58089b = rVar;
        this.f58090c = bVar;
        this.f58091d = gVar;
        this.f58092e = dateTime;
        this.f58093f = dateTime2;
    }
}
