package d50;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f57524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f57525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f57526d;

    public /* synthetic */ f(i53.c cVar, e23.l lVar, int i14, int i15) {
        this.f57523a = i15;
        this.f57524b = cVar;
        this.f57525c = lVar;
        this.f57526d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f57523a) {
            case 0:
                num.getClass();
                jg.b.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 1:
                num.intValue();
                g52.f.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 2:
                num.intValue();
                g52.f.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 3:
                num.intValue();
                g52.j.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 4:
                num.intValue();
                g52.j.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 5:
                num.getClass();
                wv0.i.d(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 6:
                num.intValue();
                xq1.a.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 7:
                num.intValue();
                xq1.a.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            case 8:
                num.intValue();
                xq1.h.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
            default:
                num.intValue();
                xq1.h.a(this.f57524b, this.f57525c, mVar, p0.t(this.f57526d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
