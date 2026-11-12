package n02;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f122182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f122185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f122186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f122187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l f122188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.l f122189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.a f122190j;

    public /* synthetic */ h(int i14, int i15, int i16, boolean z14, String str, String str2, e23.l lVar, e23.l lVar2, e23.a aVar, int i17, int i18) {
        this.f122181a = i18;
        this.f122182b = i14;
        this.f122183c = i15;
        this.f122184d = i16;
        this.f122185e = z14;
        this.f122186f = str;
        this.f122187g = str2;
        this.f122188h = lVar;
        this.f122189i = lVar2;
        this.f122190j = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f122181a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.a(this.f122182b, this.f122183c, this.f122184d, this.f122185e, this.f122186f, this.f122187g, this.f122188h, this.f122189i, this.f122190j, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                k.a(this.f122182b, this.f122183c, this.f122184d, this.f122185e, this.f122186f, this.f122187g, this.f122188h, this.f122189i, this.f122190j, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
