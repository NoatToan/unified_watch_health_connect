package a81;

import c22.l3;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.b f1968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1969c;

    public /* synthetic */ k(l22.b bVar, boolean z14, int i14) {
        this.f1967a = i14;
        this.f1968b = bVar;
        this.f1969c = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f1967a;
        l22.b bVar = this.f1968b;
        boolean z14 = this.f1969c;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i14) {
            case 0:
                v vVar = v.f1974a;
                l3.a aVar = l3.f23124b;
                aVar.getClass();
                return l3.a.t0(aVar, bVar, l3.a.p(fFloatValue, z14));
            case 1:
                v vVar2 = v.f1974a;
                l3.a aVar2 = l3.f23124b;
                DecimalFormat decimalFormat = l3.f23125c;
                aVar2.getClass();
                return l3.a.S(this.f1968b, fFloatValue, decimalFormat, false, this.f1969c);
            case 2:
                v vVar3 = v.f1974a;
                l3.a aVar3 = l3.f23124b;
                DecimalFormat decimalFormat2 = l3.f23125c;
                aVar3.getClass();
                return l3.a.S(this.f1968b, fFloatValue, decimalFormat2, false, this.f1969c);
            default:
                v vVar4 = v.f1974a;
                l3.a aVar4 = l3.f23124b;
                aVar4.getClass();
                return l3.a.t0(aVar4, bVar, l3.a.p(fFloatValue, z14));
        }
    }

    public /* synthetic */ k(boolean z14, l22.b bVar, int i14) {
        this.f1967a = i14;
        this.f1969c = z14;
        this.f1968b = bVar;
    }
}
