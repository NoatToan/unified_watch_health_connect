package fn1;

import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f72241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f72242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm1.s f72243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f72244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72245f;

    public /* synthetic */ t(km1.c cVar, DateTime dateTime, sm1.s sVar, e23.a aVar, int i14, int i15) {
        this.f72240a = i15;
        this.f72241b = cVar;
        this.f72242c = dateTime;
        this.f72243d = sVar;
        this.f72244e = aVar;
        this.f72245f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f72240a) {
            case 0:
                ((Integer) obj2).getClass();
                u.b(this.f72241b, this.f72242c, this.f72243d, this.f72244e, (p3.m) obj, p0.t(this.f72245f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jn1.e.a(this.f72241b, this.f72242c, this.f72243d, this.f72244e, (p3.m) obj, p0.t(this.f72245f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                kn1.d.a(this.f72241b, this.f72242c, this.f72243d, this.f72244e, (p3.m) obj, p0.t(this.f72245f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
