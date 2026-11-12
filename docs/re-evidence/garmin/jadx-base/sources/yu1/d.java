package yu1;

import fg0.k;
import jv1.n;
import p005kotlin.Unit;
import vu1.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f199778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f199779c;

    public /* synthetic */ d(n nVar, w wVar, int i14) {
        this.f199777a = i14;
        this.f199778b = nVar;
        this.f199779c = wVar;
    }

    @Override // e23.a
    public final Object invoke() {
        w wVar;
        w wVar2;
        switch (this.f199777a) {
            case 0:
                k kVar = this.f199778b.f101088j;
                if (kVar != null && (wVar = this.f199779c) != null) {
                    wVar.K2(kVar);
                }
                break;
            default:
                k kVar2 = this.f199778b.f101088j;
                if (kVar2 != null && (wVar2 = this.f199779c) != null) {
                    wVar2.R0(kVar2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
