package uu1;

import fg0.k;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv1.a f172851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f172852c;

    public /* synthetic */ g(xv1.a aVar, k kVar, int i14) {
        this.f172850a = i14;
        this.f172851b = aVar;
        this.f172852c = kVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f172850a) {
            case 0:
                this.f172851b.d2(this.f172852c);
                break;
            default:
                this.f172851b.b6(this.f172852c);
                break;
        }
        return Unit.INSTANCE;
    }
}
