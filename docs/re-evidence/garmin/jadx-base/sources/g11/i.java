package g11;

import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74855a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f74856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f74857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f74858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f74859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f74860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f74861g;

    public /* synthetic */ i(r rVar, String str, String str2, e23.a aVar, String str3, int i14, int i15) {
        this.f74856b = rVar;
        this.f74857c = str;
        this.f74858d = str2;
        this.f74860f = aVar;
        this.f74859e = str3;
        this.f74861g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f74855a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.b(this.f74856b, this.f74857c, this.f74858d, this.f74860f, this.f74859e, (p3.m) obj, iT, this.f74861g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                gs0.b.a(p0.t(this.f74861g | 1), this.f74860f, this.f74856b, this.f74857c, this.f74858d, this.f74859e, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                i51.g.a(p0.t(this.f74861g | 1), this.f74860f, this.f74856b, this.f74857c, this.f74858d, this.f74859e, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(r rVar, String str, String str2, String str3, e23.a aVar, int i14) {
        this.f74856b = rVar;
        this.f74857c = str;
        this.f74858d = str2;
        this.f74859e = str3;
        this.f74860f = aVar;
        this.f74861g = i14;
    }

    public /* synthetic */ i(String str, String str2, r rVar, String str3, e23.a aVar, int i14) {
        this.f74857c = str;
        this.f74858d = str2;
        this.f74856b = rVar;
        this.f74859e = str3;
        this.f74860f = aVar;
        this.f74861g = i14;
    }
}
