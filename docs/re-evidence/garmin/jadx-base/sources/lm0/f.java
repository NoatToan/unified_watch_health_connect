package lm0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f113537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f113538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f113539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f113540e;

    public /* synthetic */ f(List list, e23.l lVar, e23.l lVar2, e23.a aVar, int i14, int i15) {
        this.f113536a = i15;
        this.f113537b = list;
        this.f113538c = lVar;
        this.f113539d = lVar2;
        this.f113540e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f113536a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                g.a(this.f113537b, this.f113538c, this.f113539d, this.f113540e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                ma0.a.a(this.f113537b, this.f113538c, this.f113539d, this.f113540e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
