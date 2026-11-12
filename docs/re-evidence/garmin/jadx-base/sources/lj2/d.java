package lj2;

import lc.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nj2.a f113084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f113085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f113086d;

    public /* synthetic */ d(nj2.a aVar, y yVar, String str, int i14) {
        this.f113083a = i14;
        this.f113084b = aVar;
        this.f113085c = yVar;
        this.f113086d = str;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f113083a) {
            case 0:
                this.f113084b.f126258j.m(null);
                y.k(this.f113086d, this.f113085c);
                break;
            default:
                this.f113084b.f126252d.setValue(Boolean.TRUE);
                y.k(this.f113086d, this.f113085c);
                break;
        }
        return Unit.INSTANCE;
    }
}
