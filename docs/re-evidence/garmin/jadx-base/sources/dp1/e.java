package dp1;

import e23.l;
import e32.o;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import yo1.k;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e32.l f60653b;

    public /* synthetic */ e(e32.l lVar, int i14) {
        this.f60652a = i14;
        this.f60653b = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f60652a;
        e32.l lVar = this.f60653b;
        switch (i14) {
            case 0:
                k kVar = (k) obj;
                int i15 = g.f60656d;
                kVar.getClass();
                lVar.I8(new a(kVar));
                break;
            case 1:
                ip1.a aVar = (ip1.a) obj;
                aVar.getClass();
                lVar.I8(new ep1.a(aVar));
                break;
            case 2:
                lVar.I8(new ja1.a(((Long) obj).longValue()));
                break;
            default:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                lVar.p4(o.f62806i, dateTime);
                break;
        }
        return Unit.INSTANCE;
    }
}
