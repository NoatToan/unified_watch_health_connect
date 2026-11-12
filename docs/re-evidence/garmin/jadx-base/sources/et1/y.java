package et1;

import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import i3.a5;
import i3.b5;
import i3.x3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f65961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f65962c;

    public /* synthetic */ y(e2.i0 i0Var, o53.b0 b0Var, int i14) {
        this.f65960a = i14;
        this.f65962c = i0Var;
        this.f65961b = b0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f65960a;
        boolean z14 = true;
        e2.i0 i0Var = this.f65962c;
        o53.b0 b0Var = this.f65961b;
        switch (i14) {
            case 0:
                ge1.b.T(b0Var, null, null, new h0(i0Var, null), 3);
                return Unit.INSTANCE;
            case 1:
                ge1.b.T(b0Var, null, null, new x3.e(i0Var, null), 3);
                return Unit.INSTANCE;
            case 2:
                ge1.b.T(b0Var, null, null, new x3.f(i0Var, null), 3);
                return Unit.INSTANCE;
            case 3:
                if (i0Var.e()) {
                    ge1.b.T(b0Var, null, null, new b5(i0Var, null), 3);
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            case 4:
                if (i0Var.c()) {
                    ge1.b.T(b0Var, null, null, new a5(i0Var, null), 3);
                } else {
                    z14 = false;
                }
                return Boolean.valueOf(z14);
            default:
                int i15 = PreviewCatalogActivity.f49781a;
                ge1.b.T(b0Var, null, null, new PreviewCatalogActivity.e(i0Var, null), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ y(o53.b0 b0Var, e2.i0 i0Var, int i14) {
        this.f65960a = i14;
        this.f65961b = b0Var;
        this.f65962c = i0Var;
    }
}
