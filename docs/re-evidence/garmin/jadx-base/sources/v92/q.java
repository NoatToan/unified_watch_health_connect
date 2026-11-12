package v92;

import androidx.lifecycle.v1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f176463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f176464c;

    public /* synthetic */ q(r rVar, boolean z14, int i14) {
        this.f176462a = i14;
        this.f176463b = rVar;
        this.f176464c = z14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f176462a;
        boolean z14 = this.f176464c;
        r rVar = this.f176463b;
        switch (i14) {
            case 0:
                int i15 = r.f176465l;
                ge1.b.T(v1.a(rVar), null, null, new b0(rVar, z14, null), 3);
                break;
            case 1:
                rVar.J4(z14);
                break;
            default:
                rVar.J4(z14);
                break;
        }
        return Unit.INSTANCE;
    }
}
