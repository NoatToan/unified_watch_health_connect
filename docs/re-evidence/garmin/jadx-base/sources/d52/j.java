package d52;

import org.joda.time.DateTime;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f57578b;

    public /* synthetic */ j(q qVar, int i14) {
        this.f57577a = i14;
        this.f57578b = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f57577a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p2 p2Var = this.f57578b.f57618g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, r.a((r) value, null, null, null, zBooleanValue, false, false, false, false, false, 503)));
                break;
            case 1:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                b63.o oVarB = g22.k.z(dateTime).b();
                q qVar = this.f57578b;
                qVar.getClass();
                qVar.f57619h.i(new o82.a(oVarB, null, 2, null), true);
                break;
            case 2:
                yd1.b bVar = (yd1.b) obj;
                bVar.getClass();
                this.f57578b.A4(bVar);
                break;
            default:
                yd1.b bVar2 = (yd1.b) obj;
                bVar2.getClass();
                this.f57578b.A4(bVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
