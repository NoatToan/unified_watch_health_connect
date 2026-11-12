package f21;

import java.util.List;
import o4.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68560a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f68561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f68562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f68563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f68564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f68565f;

    public /* synthetic */ j0(float f14, long j8, List list, float f15, float f16) {
        this.f68562c = f14;
        this.f68561b = j8;
        this.f68564e = list;
        this.f68563d = f15;
        this.f68565f = f16;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f68560a;
        float f14 = this.f68565f;
        float f15 = this.f68563d;
        switch (i14) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                return i53.a.k(m92.d.c(fVar, this.f68562c, this.f68561b, this.f68564e, Float.valueOf(f15), Float.valueOf(0.0f), Float.valueOf(f14)));
            default:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f16 = j92.b.f97899b.f97917b / 2;
                g6.f.a aVar = g6.f.f75994b;
                m92.m.d dVar = new m92.m.d(this.f68561b, null);
                g1.a aVar2 = g1.f128855a;
                float f17 = this.f68562c;
                aVar2.getClass();
                return m92.c0.e(fVar2, f16, dVar, false, 0.0f, null, null, this.f68564e, Float.valueOf(1441.0f), null, null, Float.valueOf(0.0f), Float.valueOf(f14), null, false, g1.a.a(f15, new float[]{f17, f17}), 13112);
        }
    }

    public /* synthetic */ j0(long j8, float f14, float f15, List list, float f16) {
        this.f68561b = j8;
        this.f68562c = f14;
        this.f68563d = f15;
        this.f68564e = list;
        this.f68565f = f16;
    }
}
