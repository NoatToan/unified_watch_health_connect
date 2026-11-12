package wn0;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f186112b;

    public /* synthetic */ c(l lVar, int i14) {
        this.f186111a = i14;
        this.f186112b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f186111a) {
            case 0:
                this.f186112b.y4(false);
                break;
            default:
                l lVar = this.f186112b;
                lVar.getClass();
                ge1.b.T(v1.a(lVar), null, null, new m(lVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
