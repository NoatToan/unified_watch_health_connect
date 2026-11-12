package p4;

import com.google.firebase.analytics.FirebaseAnalytics;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lp4/g;", "", "Lp4/c;", "source", FirebaseAnalytics.Param.DESTINATION, "transformSource", "transformDestination", "Lp4/m;", "renderIntent", "", "transform", "<init>", "(Lp4/c;Lp4/c;Lp4/c;Lp4/c;I[FLkotlin/jvm/internal/j;)V", "intent", "(Lp4/c;Lp4/c;ILkotlin/jvm/internal/j;)V", "b", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f135570e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f135571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f135572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f135573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f135574d;

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Illegal instructions before constructor call */
    private g(c cVar, c cVar2, int i14) {
        c cVarA;
        c cVarA2;
        float[] fArr;
        float[] fArrA;
        float[] fArrA2;
        long j8 = cVar.f135542b;
        p4.b.f135535b.getClass();
        long j14 = p4.b.f135536c;
        if (p4.b.a(j8, j14)) {
            j.f135579a.getClass();
            cVarA = d.a(cVar, j.f135581c);
        } else {
            cVarA = cVar;
        }
        if (p4.b.a(cVar2.f135542b, j14)) {
            j.f135579a.getClass();
            cVarA2 = d.a(cVar2, j.f135581c);
        } else {
            cVarA2 = cVar2;
        }
        f135570e.getClass();
        m.f135589b.getClass();
        if (i14 == m.f135592e) {
            boolean zA = p4.b.a(cVar.f135542b, j14);
            boolean zA2 = p4.b.a(cVar2.f135542b, j14);
            if (!(zA && zA2) && (zA || zA2)) {
                s sVar = ((q) (zA ? cVar : cVar2)).f135602d;
                if (zA) {
                    fArrA = sVar.a();
                } else {
                    j.f135579a.getClass();
                    fArrA = j.f135584f;
                }
                if (zA2) {
                    fArrA2 = sVar.a();
                } else {
                    j.f135579a.getClass();
                    fArrA2 = j.f135584f;
                }
                fArr = new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar, cVar2, cVarA, cVarA2, i14, fArr, null);
    }

    public long a(long j8) {
        float fI = d0.i(j8);
        float fH = d0.h(j8);
        float f14 = d0.f(j8);
        float fE = d0.e(j8);
        c cVar = this.f135572b;
        long jE = cVar.e(fI, fH, f14);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fG = cVar.g(fI, fH, f14);
        float[] fArr = this.f135574d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fG *= fArr[2];
        }
        float f15 = fIntBitsToFloat;
        float f16 = fIntBitsToFloat2;
        return this.f135573c.h(f15, f16, fG, fE, this.f135571a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp4/g$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp4/g$b;", "Lp4/g;", "Lp4/q;", "mSource", "mDestination", "Lp4/m;", "intent", "<init>", "(Lp4/q;Lp4/q;ILkotlin/jvm/internal/j;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q f135575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final q f135576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float[] f135577h;

        private b(q qVar, q qVar2, int i14) {
            float[] fArrF;
            super(qVar, qVar2, qVar, qVar2, i14, null, null);
            this.f135575f = qVar;
            this.f135576g = qVar2;
            s sVar = qVar.f135602d;
            float[] fArrF2 = qVar.f135607i;
            s sVar2 = qVar2.f135602d;
            float[] fArrE = qVar2.f135608j;
            if (d.c(sVar, sVar2)) {
                fArrF = d.f(fArrE, fArrF2);
            } else {
                float[] fArrA = sVar.a();
                float[] fArrA2 = sVar2.a();
                j.f135579a.getClass();
                s sVar3 = j.f135581c;
                if (!d.c(sVar, sVar3)) {
                    p4.a.f135532b.getClass();
                    fArrF2 = d.f(d.b(p4.a.f135533c.f135534a, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArrF2);
                }
                if (!d.c(sVar2, sVar3)) {
                    p4.a.f135532b.getClass();
                    fArrE = d.e(d.f(d.b(p4.a.f135533c.f135534a, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f135607i));
                }
                m.f135589b.getClass();
                fArrF = d.f(fArrE, i14 == m.f135592e ? d.g(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrF2) : fArrF2);
            }
            this.f135577h = fArrF;
        }

        @Override // p4.g
        public final long a(long j8) {
            float fI = d0.i(j8);
            float fH = d0.h(j8);
            float f14 = d0.f(j8);
            float fE = d0.e(j8);
            q qVar = this.f135575f;
            float fA = (float) qVar.f135614p.a(fI);
            n nVar = qVar.f135614p;
            float fA2 = (float) nVar.a(fH);
            float fA3 = (float) nVar.a(f14);
            float[] fArr = this.f135577h;
            float f15 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
            float f16 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
            float f17 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
            q qVar2 = this.f135576g;
            float fA4 = (float) qVar2.f135611m.a(f15);
            n nVar2 = qVar2.f135611m;
            return f0.a(fA4, (float) nVar2.a(f16), (float) nVar2.a(f17), fE, qVar2);
        }

        public /* synthetic */ b(q qVar, q qVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(qVar, qVar2, i14);
        }
    }

    public /* synthetic */ g(c cVar, c cVar2, c cVar3, c cVar4, int i14, float[] fArr, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2, cVar3, cVar4, i14, fArr);
    }

    private g(c cVar, c cVar2, c cVar3, c cVar4, int i14, float[] fArr) {
        this.f135571a = cVar2;
        this.f135572b = cVar3;
        this.f135573c = cVar4;
        this.f135574d = fArr;
    }

    public /* synthetic */ g(c cVar, c cVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2, i14);
    }
}
