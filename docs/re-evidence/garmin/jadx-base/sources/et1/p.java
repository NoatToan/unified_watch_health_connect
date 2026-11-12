package et1;

import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f65731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f65732c;

    public /* synthetic */ p(o53.b0 b0Var, p3.p1 p1Var, int i14) {
        this.f65730a = i14;
        this.f65731b = b0Var;
        this.f65732c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f65730a;
        p3.p1 p1Var = this.f65732c;
        o53.b0 b0Var = this.f65731b;
        switch (i14) {
            case 0:
                ge1.b.T(b0Var, null, null, new r.a(p1Var, null), 3);
                break;
            default:
                int i15 = PreviewCatalogActivity.f49781a;
                ge1.b.T(b0Var, null, null, new PreviewCatalogActivity.a(p1Var, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
