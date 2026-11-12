package qw;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f148193b;

    public /* synthetic */ e(g gVar, int i14) {
        this.f148192a = i14;
        this.f148193b = gVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f148192a) {
            case 0:
                this.f148193b.y4(null);
                break;
            case 1:
                g gVar = this.f148193b;
                pw.a aVar = ((l) gVar.f148249d.f150540a.getValue()).f148287d;
                if (aVar != null) {
                    ge1.b.T(v1.a(gVar), null, null, new h(gVar, aVar, null), 3);
                }
                gVar.y4(null);
                break;
            case 2:
                g gVar2 = this.f148193b;
                gVar2.getClass();
                ge1.b.T(v1.a(gVar2), null, null, new j(gVar2, null), 3);
                break;
            default:
                g gVar3 = this.f148193b;
                gVar3.getClass();
                ge1.b.T(v1.a(gVar3), null, null, new j(gVar3, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
