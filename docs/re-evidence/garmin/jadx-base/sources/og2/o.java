package og2;

import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Log2/o;", "", "<init>", "()V", "a", "b", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f132067a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Log2/o$a;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static float a(j jVar, j jVar2) {
            jVar.getClass();
            jVar2.getClass();
            float f14 = jVar.f132046a - jVar2.f132046a;
            float f15 = jVar.f132047b - jVar2.f132047b;
            return (f15 * f15) + (f14 * f14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [T, float[]] */
        public static i53.c b(i53.c cVar) {
            cVar.getClass();
            if (cVar.size() <= 301) {
                return cVar;
            }
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            int size = cVar.size();
            ?? r14 = new float[size];
            for (int i14 = 0; i14 < size; i14++) {
                r14[i14] = 0;
            }
            r0Var.f105810a = r14;
            c(cVar, r0Var, 0, cVar.size() - 1);
            float[] fArr = (float[]) r0Var.f105810a;
            fArr[0] = Float.POSITIVE_INFINITY;
            fArr[cVar.size() - 1] = Float.POSITIVE_INFINITY;
            float[] fArr2 = (float[]) r0Var.f105810a;
            fArr2.getClass();
            List listM0 = p13.h0.M0(p13.h0.S0(p13.h0.N0(new j23.l(0, fArr2.length - 1), new n(r0Var)), MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE));
            ArrayList arrayList = new ArrayList(p13.y.r(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add((j) cVar.get(((Number) it.next()).intValue()));
            }
            return i53.a.e(arrayList);
        }

        public static final void c(i53.c<j> cVar, p005kotlin.jvm.internal.r0<float[]> r0Var, int i14, int i15) {
            float fA;
            int i16 = i14 + 1;
            if (i15 <= i16) {
                return;
            }
            b bVar = new b(cVar.get(i14), cVar.get(i15), 0.0f, 4, null);
            float f14 = -1.0f;
            int i17 = i14;
            while (i16 < i15) {
                j jVar = cVar.get(i16);
                jVar.getClass();
                float f15 = bVar.f132070c;
                float f16 = 0.0f;
                j jVar2 = bVar.f132069b;
                j jVar3 = bVar.f132068a;
                if (f15 != 0.0f) {
                    float f17 = jVar.f132046a;
                    float f18 = jVar3.f132046a;
                    float f19 = (jVar2.f132046a - f18) * (f17 - f18);
                    float f22 = jVar.f132047b;
                    float f24 = jVar3.f132047b;
                    f16 = (((jVar2.f132047b - f24) * (f22 - f24)) + f19) / f15;
                }
                if (f16 < 0) {
                    o.f132067a.getClass();
                    fA = a(jVar, jVar3);
                } else if (f16 > 1.0f) {
                    o.f132067a.getClass();
                    fA = a(jVar, jVar2);
                } else {
                    a aVar = o.f132067a;
                    float f25 = jVar3.f132046a;
                    float fA2 = j20.x.a(jVar2.f132046a, f25, f16, f25);
                    float f26 = jVar3.f132047b;
                    j jVar4 = new j(fA2, j20.x.a(jVar2.f132047b, f26, f16, f26));
                    aVar.getClass();
                    fA = a(jVar, jVar4);
                }
                if (fA > f14) {
                    i17 = i16;
                    f14 = fA;
                }
                i16++;
            }
            r0Var.f105810a[i17] = f14;
            c(cVar, r0Var, i14, i17);
            c(cVar, r0Var, i17, i15);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Log2/o$b;", "", "Log2/j;", "p1", "p2", "", "lengthSquared", "<init>", "(Log2/j;Log2/j;F)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f132068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f132069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f132070c;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(j jVar, j jVar2, float f14, int i14, p005kotlin.jvm.internal.j jVar3) {
            if ((i14 & 4) != 0) {
                o.f132067a.getClass();
                f14 = a.a(jVar, jVar2);
            }
            this(jVar, jVar2, f14);
        }

        public b(j jVar, j jVar2, float f14) {
            jVar.getClass();
            jVar2.getClass();
            this.f132068a = jVar;
            this.f132069b = jVar2;
            this.f132070c = f14;
        }
    }
}
