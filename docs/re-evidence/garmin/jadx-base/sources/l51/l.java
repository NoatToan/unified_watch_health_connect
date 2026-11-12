package l51;

import lc.y;
import p005kotlin.Unit;
import p006l2.w2;
import r53.b2;
import r53.o2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110203a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p51.e f110204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f110205c;

    public /* synthetic */ l(y yVar, p51.e eVar) {
        this.f110205c = yVar;
        this.f110204b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        u41.a aVar;
        switch (this.f110203a) {
            case 0:
                p51.e eVar = this.f110204b;
                b2 b2Var = eVar.f136178g;
                if (eVar.f136174c != null) {
                    aVar = new u41.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) null, eVar.f136174c, (Double) null, Long.valueOf(((o51.j) b2Var.f150540a.getValue()).f129275d), (t41.a) null, (Boolean) null, eVar.f136175d, Boolean.valueOf(eVar.f136176e), eVar.f136177f, false, 565, (p005kotlin.jvm.internal.j) null);
                } else {
                    o2<T> o2Var = b2Var.f150540a;
                    aVar = new u41.a((com.garmin.android.apps.connectmobile.pacepro.data.dto.b) null, (String) null, Double.valueOf(((o51.j) o2Var.getValue()).b()), Long.valueOf(((o51.j) o2Var.getValue()).f129275d), t41.b.a(((o51.j) o2Var.getValue()).f129274c), Boolean.valueOf(((o51.j) o2Var.getValue()).f129272a == t41.f.OTHER), (String) null, (Boolean) null, eVar.f136177f, false, 707, (p005kotlin.jvm.internal.j) null);
                }
                this.f110205c.h(new w2(15), new n51.b.C2324b(aVar));
                break;
            default:
                this.f110204b.y4();
                y.l(this.f110205c, n51.b.h.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(p51.e eVar, y yVar) {
        this.f110204b = eVar;
        this.f110205c = yVar;
    }
}
