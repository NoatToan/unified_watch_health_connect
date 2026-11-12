package at1;

import e23.p;
import kh0.w;
import p005kotlin.Unit;
import p3.p0;
import w52.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f12766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12767e;

    public /* synthetic */ d(String str, String str2, e23.a aVar, int i14, int i15) {
        this.f12763a = i15;
        this.f12764b = str;
        this.f12765c = str2;
        this.f12766d = aVar;
        this.f12767e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12763a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f12767e | 1);
                zf.b.b(this.f12764b, this.f12765c, this.f12766d, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                w.a(this.f12764b, this.f12765c, this.f12766d, (p3.m) obj, iT2, this.f12767e);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iT3 = p0.t(this.f12767e | 1);
                a0.c(this.f12764b, this.f12765c, this.f12766d, (p3.m) obj, iT3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(1);
                wv0.p.a(this.f12764b, this.f12765c, this.f12766d, (p3.m) obj, iT4, this.f12767e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(String str, String str2, e23.a aVar, int i14, int i15, int i16) {
        this.f12763a = i16;
        this.f12764b = str;
        this.f12765c = str2;
        this.f12766d = aVar;
        this.f12767e = i15;
    }
}
