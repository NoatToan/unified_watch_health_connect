package kh0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f104760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f104761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f104762d;

    public /* synthetic */ r(List list, e23.l lVar, e23.l lVar2, int i14, int i15) {
        this.f104759a = i15;
        this.f104760b = list;
        this.f104761c = lVar;
        this.f104762d = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f104759a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                s.e(this.f104760b, this.f104761c, this.f104762d, mVar, p0.t(1));
                break;
            default:
                ll0.c.c(this.f104760b, this.f104761c, this.f104762d, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
