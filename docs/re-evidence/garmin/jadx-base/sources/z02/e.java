package z02;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200739a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f200740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b92.a f200741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f200742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f200743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f200744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f200745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f200746h;

    public /* synthetic */ e(String str, u4.d dVar, e23.a aVar, b92.a aVar2, p pVar, int i14, int i15) {
        this.f200742d = str;
        this.f200740b = dVar;
        this.f200743e = aVar;
        this.f200741c = aVar2;
        this.f200744f = pVar;
        this.f200745g = i14;
        this.f200746h = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f200739a) {
            case 0:
                ((Integer) obj2).getClass();
                f.c(p0.t(this.f200745g | 1), this.f200746h, this.f200741c, this.f200743e, this.f200744f, this.f200742d, (m) obj, this.f200740b);
                break;
            default:
                ((Integer) obj2).getClass();
                f.a(p0.t(this.f200745g | 1), this.f200746h, this.f200741c, this.f200743e, this.f200744f, this.f200742d, (m) obj, this.f200740b);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(u4.d dVar, b92.a aVar, String str, e23.a aVar2, p pVar, int i14, int i15) {
        this.f200740b = dVar;
        this.f200741c = aVar;
        this.f200742d = str;
        this.f200743e = aVar2;
        this.f200744f = pVar;
        this.f200745g = i14;
        this.f200746h = i15;
    }
}
