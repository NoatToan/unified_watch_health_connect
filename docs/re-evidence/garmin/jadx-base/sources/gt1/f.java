package gt1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78951a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f78952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f78953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f78954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f78955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f78957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a f78958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f78960j;

    public /* synthetic */ f(h4.r rVar, String str, int i14, boolean z14, boolean z15, boolean z16, e23.a aVar, int i15, int i16) {
        this.f78952b = rVar;
        this.f78960j = str;
        this.f78956f = i14;
        this.f78953c = z14;
        this.f78954d = z15;
        this.f78955e = z16;
        this.f78958h = aVar;
        this.f78957g = i15;
        this.f78959i = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78951a) {
            case 0:
                ((Integer) obj2).getClass();
                h.a(this.f78952b, (String) this.f78960j, this.f78956f, this.f78953c, this.f78954d, this.f78955e, this.f78958h, (p3.m) obj, p0.t(this.f78957g | 1), this.f78959i);
                break;
            default:
                ((Integer) obj2).getClass();
                ub0.k.e(this.f78952b, this.f78953c, this.f78954d, this.f78955e, this.f78956f, this.f78957g, (e23.l) this.f78960j, this.f78958h, (p3.m) obj, p0.t(this.f78959i | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(h4.r rVar, boolean z14, boolean z15, boolean z16, int i14, int i15, e23.l lVar, e23.a aVar, int i16) {
        this.f78952b = rVar;
        this.f78953c = z14;
        this.f78954d = z15;
        this.f78955e = z16;
        this.f78956f = i14;
        this.f78957g = i15;
        this.f78960j = lVar;
        this.f78958h = aVar;
        this.f78959i = i16;
    }
}
