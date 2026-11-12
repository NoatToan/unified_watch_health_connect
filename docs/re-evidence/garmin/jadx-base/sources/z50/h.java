package z50;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a60.b f202459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f202460c;

    public /* synthetic */ h(a60.b bVar, l lVar, int i14, int i15) {
        this.f202458a = i15;
        this.f202459b = bVar;
        this.f202460c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f202458a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.a(this.f202459b, this.f202460c, mVar, p0.t(1));
                break;
            default:
                k.a(this.f202459b, this.f202460c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
