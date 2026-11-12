package i11;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87078a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f87079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f87080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f87081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f87082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f87083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f87084g;

    public /* synthetic */ d(p pVar, String str, String str2, String str3, r rVar, int i14) {
        this.f87079b = pVar;
        this.f87080c = str;
        this.f87081d = str2;
        this.f87082e = str3;
        this.f87083f = rVar;
        this.f87084g = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f87078a) {
            case 0:
                ((Integer) obj2).getClass();
                e.a(p0.t(this.f87084g | 1), this.f87079b, this.f87083f, this.f87080c, this.f87081d, this.f87082e, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ub1.f.a(p0.t(this.f87084g | 1), this.f87079b, this.f87083f, this.f87080c, this.f87081d, this.f87082e, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(r rVar, String str, String str2, String str3, p pVar, int i14) {
        this.f87083f = rVar;
        this.f87080c = str;
        this.f87081d = str2;
        this.f87082e = str3;
        this.f87079b = pVar;
        this.f87084g = i14;
    }
}
