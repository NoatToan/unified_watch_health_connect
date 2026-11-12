package t42;

import i3.mc;
import java.util.List;
import o53.b0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f162332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f162333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f162334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f162335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162336f;

    public /* synthetic */ d(mc mcVar, b0 b0Var, List list, e23.l lVar, int i14, int i15) {
        this.f162331a = i15;
        this.f162332b = mcVar;
        this.f162333c = b0Var;
        this.f162334d = list;
        this.f162335e = lVar;
        this.f162336f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f162331a) {
            case 0:
                ((Integer) obj2).getClass();
                e.a(this.f162332b, this.f162333c, this.f162334d, this.f162335e, (p3.m) obj, p0.t(this.f162336f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tw.e.a(this.f162332b, this.f162333c, this.f162334d, this.f162335e, (p3.m) obj, p0.t(this.f162336f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
