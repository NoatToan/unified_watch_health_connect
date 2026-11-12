package ba2;

import e23.p;
import et1.c1;
import h4.r;
import ht1.w;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import s70.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f17077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17078d;

    public /* synthetic */ g(int i14, e23.a aVar, r rVar) {
        this.f17075a = 0;
        this.f17077c = aVar;
        this.f17076b = rVar;
        this.f17078d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f17075a) {
            case 0:
                num.getClass();
                j.c(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            case 1:
                num.getClass();
                dj0.d.e(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            case 2:
                num.intValue();
                c1.b(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            case 3:
                num.getClass();
                dh.b.b(this.f17078d, p0.t(1), this.f17077c, this.f17076b, mVar);
                break;
            case 4:
                num.getClass();
                w.j(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            case 5:
                num.getClass();
                s.c(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            case 6:
                num.getClass();
                si1.d.a(p0.t(this.f17078d | 1), this.f17077c, this.f17076b, mVar);
                break;
            default:
                num.getClass();
                yz1.h.a(p0.t(1), this.f17078d, this.f17077c, this.f17076b, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(r rVar, int i14, e23.a aVar, int i15) {
        this.f17075a = 3;
        this.f17076b = rVar;
        this.f17078d = i14;
        this.f17077c = aVar;
    }

    public /* synthetic */ g(r rVar, e23.a aVar, int i14, int i15) {
        this.f17075a = 7;
        this.f17076b = rVar;
        this.f17077c = aVar;
        this.f17078d = i15;
    }

    public /* synthetic */ g(r rVar, e23.a aVar, int i14, int i15, byte b14) {
        this.f17075a = i15;
        this.f17076b = rVar;
        this.f17077c = aVar;
        this.f17078d = i14;
    }
}
