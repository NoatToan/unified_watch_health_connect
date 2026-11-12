package c22;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f23038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o13.h f23039h;

    public /* synthetic */ e0(int i14, List list, h4.r rVar, boolean z14, e23.l lVar, int i15, int i16) {
        this.f23032a = 0;
        this.f23033b = i14;
        this.f23037f = list;
        this.f23038g = rVar;
        this.f23034c = z14;
        this.f23039h = lVar;
        this.f23035d = i15;
        this.f23036e = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f23032a;
        int i15 = this.f23035d;
        o13.h hVar = this.f23039h;
        Object obj3 = this.f23037f;
        Object obj4 = this.f23038g;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                g0.a(this.f23033b, (List) obj3, (h4.r) obj4, this.f23034c, (e23.l) hVar, (p3.m) obj, iT, this.f23036e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                h82.r rVar = h82.r.f82497a;
                int iT2 = p3.p0.t(i15 | 1);
                ((h82.r) obj3).B(this.f23033b, (b92.a) obj4, this.f23034c, (e23.a) hVar, (p3.m) obj, iT2, this.f23036e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p3.p0.t(i15 | 1);
                m82.e.a((h4.r) obj4, (m82.f) obj3, this.f23033b, this.f23034c, (e23.q) hVar, (p3.m) obj, iT3, this.f23036e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(i15 | 1);
                n82.c.a((h4.r) obj4, (n82.f) obj3, this.f23033b, this.f23034c, (e23.r) hVar, (p3.m) obj, iT4, this.f23036e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e0(h4.r rVar, Object obj, int i14, boolean z14, o13.h hVar, int i15, int i16, int i17) {
        this.f23032a = i17;
        this.f23038g = rVar;
        this.f23037f = obj;
        this.f23033b = i14;
        this.f23034c = z14;
        this.f23039h = hVar;
        this.f23035d = i15;
        this.f23036e = i16;
    }

    public /* synthetic */ e0(h82.r rVar, int i14, b92.a aVar, boolean z14, e23.a aVar2, int i15, int i16) {
        this.f23032a = 1;
        this.f23037f = rVar;
        this.f23033b = i14;
        this.f23038g = aVar;
        this.f23034c = z14;
        this.f23039h = aVar2;
        this.f23035d = i15;
        this.f23036e = i16;
    }
}
