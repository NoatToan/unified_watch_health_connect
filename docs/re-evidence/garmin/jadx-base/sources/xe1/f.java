package xe1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ af1.e f190437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o82.g f190438c;

    public /* synthetic */ f(af1.e eVar, o82.g gVar, int i14, int i15) {
        this.f190436a = i15;
        this.f190437b = eVar;
        this.f190438c = gVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f190436a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                g.a(this.f190437b, this.f190438c, mVar, p0.t(1));
                break;
            default:
                g.b(this.f190437b, this.f190438c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
