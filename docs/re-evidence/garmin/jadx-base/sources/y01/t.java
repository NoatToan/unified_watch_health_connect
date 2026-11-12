package y01;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193027a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f193028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f193029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f193031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f193032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f193033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f193034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f193035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f193036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e23.p f193037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f193038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f193039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f193040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f193041o;

    public /* synthetic */ t(h4.r rVar, String str, String str2, Integer num, boolean z14, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14, int i15, e23.p pVar, int i16, int i17, int i18) {
        this.f193028b = rVar;
        this.f193029c = str;
        this.f193030d = str2;
        this.f193031e = num;
        this.f193032f = z14;
        this.f193033g = lVar;
        this.f193034h = lVar2;
        this.f193041o = lVar3;
        this.f193035i = i14;
        this.f193036j = i15;
        this.f193037k = pVar;
        this.f193038l = i16;
        this.f193039m = i17;
        this.f193040n = i18;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f193027a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f193038l | 1);
                int iT2 = p0.t(this.f193039m);
                w.a(this.f193028b, this.f193029c, this.f193030d, (String) this.f193041o, this.f193031e, this.f193032f, this.f193033g, this.f193034h, this.f193035i, this.f193036j, this.f193037k, (p3.m) obj, iT, iT2, this.f193040n);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(this.f193038l | 1);
                int iT4 = p0.t(this.f193039m);
                y.a(this.f193028b, this.f193029c, this.f193030d, this.f193031e, this.f193032f, this.f193033g, this.f193034h, (e23.l) this.f193041o, this.f193035i, this.f193036j, this.f193037k, (p3.m) obj, iT3, iT4, this.f193040n);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(h4.r rVar, String str, String str2, String str3, Integer num, boolean z14, e23.l lVar, e23.l lVar2, int i14, int i15, e23.p pVar, int i16, int i17, int i18) {
        this.f193028b = rVar;
        this.f193029c = str;
        this.f193030d = str2;
        this.f193041o = str3;
        this.f193031e = num;
        this.f193032f = z14;
        this.f193033g = lVar;
        this.f193034h = lVar2;
        this.f193035i = i14;
        this.f193036j = i15;
        this.f193037k = pVar;
        this.f193038l = i16;
        this.f193039m = i17;
        this.f193040n = i18;
    }
}
