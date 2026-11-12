package ea0;

import e23.p;
import ep.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f63605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f63606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f63607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f63608e;

    public /* synthetic */ a(String str, String str2, boolean z14, e23.a aVar, int i14, int i15) {
        this.f63604a = i15;
        this.f63605b = str;
        this.f63606c = str2;
        this.f63607d = z14;
        this.f63608e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63604a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                f.c(this.f63605b, this.f63606c, this.f63607d, this.f63608e, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                k.c(this.f63605b, this.f63606c, this.f63607d, this.f63608e, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
