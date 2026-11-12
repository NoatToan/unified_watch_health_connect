package in1;

import androidx.lifecycle.v1;
import p005kotlin.Unit;
import sm1.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm1.s f94531b;

    public /* synthetic */ l(sm1.s sVar, int i14) {
        this.f94530a = i14;
        this.f94531b = sVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f94530a) {
            case 0:
                this.f94531b.F4(false);
                break;
            case 1:
                this.f94531b.H4(false);
                break;
            default:
                sm1.s sVar = this.f94531b;
                sVar.getClass();
                ge1.b.T(v1.a(sVar), null, null, new z(sVar, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
