package au0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f12979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f12982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f12983g;

    public /* synthetic */ o(String str, h4.r rVar, String str2, boolean z14, e23.a aVar, e23.a aVar2, int i14) {
        this.f12977a = 1;
        this.f12978b = str;
        this.f12979c = rVar;
        this.f12980d = str2;
        this.f12981e = z14;
        this.f12982f = aVar;
        this.f12983g = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12977a) {
            case 0:
                ((Integer) obj2).getClass();
                p.a(p0.t(1), this.f12982f, this.f12983g, this.f12979c, this.f12978b, this.f12980d, (p3.m) obj, this.f12981e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rx1.l.a(p0.t(1), this.f12982f, this.f12983g, this.f12979c, this.f12978b, this.f12980d, (p3.m) obj, this.f12981e);
                break;
            default:
                ((Integer) obj2).getClass();
                wg2.d.a(p0.t(1), this.f12982f, this.f12983g, this.f12979c, this.f12978b, this.f12980d, (p3.m) obj, this.f12981e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(String str, String str2, boolean z14, e23.a aVar, e23.a aVar2, h4.r rVar, int i14, int i15) {
        this.f12977a = i15;
        this.f12978b = str;
        this.f12980d = str2;
        this.f12981e = z14;
        this.f12982f = aVar;
        this.f12983g = aVar2;
        this.f12979c = rVar;
    }
}
