package nw0;

import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f128058b;

    public /* synthetic */ k(r rVar, int i14) {
        this.f128057a = i14;
        this.f128058b = rVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f128057a;
        r rVar = this.f128058b;
        switch (i14) {
            case 0:
                rVar.getClass();
                ge1.b.T(v1.a(rVar), null, null, new u(rVar, null), 3);
                break;
            case 1:
                rVar.A4(false);
                break;
            case 2:
                p2 p2Var = rVar.f128105f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, d.a((d) value, null, null, null, false, false, false, false, 111)));
                break;
            case 3:
                rVar.C4(false);
                break;
            case 4:
                rVar.C4(false);
                ge1.b.T(v1.a(rVar), null, null, new v(true, rVar, null), 3);
                break;
            case 5:
                rVar.B4(new j0.b(""));
                break;
            case 6:
                rVar.B4(j0.a.f128055a);
                break;
            default:
                rVar.getClass();
                w9.a aVarA = v1.a(rVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new t(rVar, null), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
