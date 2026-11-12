package fn1;

import androidx.lifecycle.v1;
import i3.mc;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72235a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f72236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sm1.s f72237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f72238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f72239e;

    public /* synthetic */ s(b0 b0Var, sm1.s sVar, DateTime dateTime, mc mcVar) {
        this.f72236b = b0Var;
        this.f72237c = sVar;
        this.f72238d = dateTime;
        this.f72239e = mcVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f72235a;
        mc mcVar = this.f72239e;
        DateTime dateTime = this.f72238d;
        b0 b0Var = this.f72236b;
        switch (i14) {
            case 0:
                km1.v vVar = (km1.v) obj;
                vVar.getClass();
                sm1.s sVar = this.f72237c;
                s sVar2 = new s(b0Var, sVar, dateTime, mcVar);
                t60.a aVar = sm1.s.f160180t;
                sVar.getClass();
                ge1.b.T(v1.a(sVar), null, null, new sm1.u(-1L, sVar, vVar, sVar2, null), 3);
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    ge1.b.T(b0Var, null, null, new u.b(mcVar, null), 3);
                    sn.a.o(f12.l.f68084a, true);
                    this.f72237c.f160192l.i(new o82.a(g22.k.z(dateTime).b(), null, 2, null), true);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(sm1.s sVar, b0 b0Var, DateTime dateTime, mc mcVar) {
        this.f72237c = sVar;
        this.f72236b = b0Var;
        this.f72238d = dateTime;
        this.f72239e = mcVar;
    }
}
