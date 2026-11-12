package uj1;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f171573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f171574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171575d;

    public /* synthetic */ x(e23.l lVar, int i14, int i15, List list) {
        this.f171572a = i15;
        this.f171573b = list;
        this.f171574c = lVar;
        this.f171575d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171572a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                z.c(this.f171573b, this.f171574c, mVar, p0.t(this.f171575d | 1));
                break;
            case 1:
                xr1.e.a(this.f171573b, this.f171574c, mVar, p0.t(this.f171575d | 1));
                break;
            default:
                xr1.e.a(this.f171573b, this.f171574c, mVar, p0.t(this.f171575d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
