package fx0;

import e23.p;
import h4.r;
import java.util.List;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73804a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f73805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f73806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f73807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f73808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f73809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f73810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f73811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f73812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f73813j;

    public /* synthetic */ l(r rVar, c2.j.e eVar, int i14, Object obj, List list, e23.l lVar, e23.l lVar2, int i15, int i16) {
        this.f73805b = rVar;
        this.f73811h = eVar;
        this.f73808e = i14;
        this.f73806c = obj;
        this.f73807d = list;
        this.f73812i = lVar;
        this.f73813j = lVar2;
        this.f73809f = i15;
        this.f73810g = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f73804a) {
            case 0:
                ((Integer) obj2).getClass();
                m.a(this.f73805b, (yz1.d) this.f73811h, (String) this.f73806c, (u4.d) this.f73812i, (d0) this.f73813j, (String) this.f73807d, this.f73808e, (p3.m) obj, p0.t(this.f73809f | 1), this.f73810g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                n02.m.a(this.f73805b, (String) this.f73806c, (String) this.f73807d, (String) this.f73811h, (String) this.f73812i, this.f73808e, this.f73809f, this.f73810g, (e23.l) this.f73813j, (p3.m) obj, iT);
                break;
            case 2:
                ((Integer) obj2).getClass();
                vq0.b.a(this.f73805b, (c2.j.e) this.f73811h, this.f73808e, this.f73806c, (List) this.f73807d, (e23.l) this.f73812i, (e23.l) this.f73813j, (p3.m) obj, p0.t(this.f73809f | 1), this.f73810g);
                break;
            default:
                ((Integer) obj2).getClass();
                wv0.d.d(this.f73805b, (String) this.f73806c, (String) this.f73807d, (String) this.f73811h, (Integer) this.f73812i, (e23.l) this.f73813j, this.f73808e, this.f73809f, (p3.m) obj, p0.t(this.f73810g | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(r rVar, String str, String str2, String str3, Integer num, e23.l lVar, int i14, int i15, int i16) {
        this.f73805b = rVar;
        this.f73806c = str;
        this.f73807d = str2;
        this.f73811h = str3;
        this.f73812i = num;
        this.f73813j = lVar;
        this.f73808e = i14;
        this.f73809f = i15;
        this.f73810g = i16;
    }

    public /* synthetic */ l(r rVar, String str, String str2, String str3, String str4, int i14, int i15, int i16, e23.l lVar, int i17) {
        this.f73805b = rVar;
        this.f73806c = str;
        this.f73807d = str2;
        this.f73811h = str3;
        this.f73812i = str4;
        this.f73808e = i14;
        this.f73809f = i15;
        this.f73810g = i16;
        this.f73813j = lVar;
    }

    public /* synthetic */ l(r rVar, yz1.d dVar, String str, u4.d dVar2, d0 d0Var, String str2, int i14, int i15, int i16) {
        this.f73805b = rVar;
        this.f73811h = dVar;
        this.f73806c = str;
        this.f73812i = dVar2;
        this.f73813j = d0Var;
        this.f73807d = str2;
        this.f73808e = i14;
        this.f73809f = i15;
        this.f73810g = i16;
    }
}
