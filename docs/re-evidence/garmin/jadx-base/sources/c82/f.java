package c82;

import e23.l;
import e23.p;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25725a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f25728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f25729e;

    public /* synthetic */ f(r rVar, List list, l lVar, int i14) {
        this.f25729e = rVar;
        this.f25726b = list;
        this.f25728d = lVar;
        this.f25727c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25725a) {
            case 0:
                ((Integer) obj2).getClass();
                g.a(p0.t(this.f25727c | 1), this.f25728d, this.f25729e, this.f25726b, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(3073);
                lb0.e.a(this.f25726b, this.f25727c, this.f25728d, this.f25729e, (m) obj, iT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(List list, int i14, l lVar, r rVar, int i15) {
        this.f25726b = list;
        this.f25727c = i14;
        this.f25728d = lVar;
        this.f25729e = rVar;
    }
}
