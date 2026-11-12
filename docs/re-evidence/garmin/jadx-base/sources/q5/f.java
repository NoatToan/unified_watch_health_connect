package q5;

import g6.k;
import h5.j;
import java.util.Arrays;
import o4.a1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq5/f;", "", "", "topLeft", "bottomRight", "Lg6/k;", "windowOffset", "screenOffset", "windowSize", "Lo4/a1;", "viewToWindowMatrix", "Lh5/j;", "node", "<init>", "(JJJJJ[FLh5/j;Lkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f142843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f142844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f142845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f142846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f142847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f142848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f142849g;

    private f(long j8, long j14, long j15, long j16, long j17, float[] fArr, j jVar) {
        this.f142843a = j8;
        this.f142844b = j14;
        this.f142845c = j15;
        this.f142846d = j16;
        this.f142847e = j17;
        this.f142848f = fArr;
        this.f142849g = jVar;
    }

    public final float a(int i14, int i15, int i16, int i17) {
        long j8 = this.f142843a;
        int i18 = (int) (j8 >> 32);
        int iMin = Math.min(Math.max(i18, i14), i16);
        int i19 = (int) j8;
        int iMin2 = Math.min(Math.max(i19, i15), i17);
        long j14 = this.f142844b;
        int i24 = (int) (j14 >> 32);
        int iMax = Math.max(Math.min(i24, i16), i14);
        int i25 = (int) j14;
        return Math.max((Math.max(Math.min(i25, i17), i15) - iMin2) * (iMax - iMin), 0) / Math.min((i17 - i15) * (i16 - i14), (i25 - i19) * (i24 - i18));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public final boolean equals(Object obj) {
        boolean zG;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f142843a != fVar.f142843a || this.f142844b != fVar.f142844b || this.f142847e != fVar.f142847e || !k.c(this.f142845c, fVar.f142845c) || !k.c(this.f142846d, fVar.f142846d)) {
            return false;
        }
        float[] fArr = fVar.f142848f;
        float[] fArr2 = this.f142848f;
        if (fArr2 == null) {
            if (fArr == null) {
                zG = true;
            } else {
                zG = false;
            }
        } else if (fArr == null) {
            zG = false;
        } else {
            int i14 = a1.f128807b;
            zG = s.g(fArr2, fArr);
        }
        return zG && s.g(this.f142849g, fVar.f142849g);
    }

    public final int hashCode() {
        int iHashCode;
        int iE = q6.f.e(q6.f.e(Long.hashCode(this.f142843a) * 31, 31, this.f142844b), 31, this.f142847e);
        k.a aVar = k.f76003b;
        int iE2 = q6.f.e(q6.f.e(iE, 31, this.f142845c), 31, this.f142846d);
        float[] fArr = this.f142848f;
        if (fArr != null) {
            int i14 = a1.f128807b;
            iHashCode = Arrays.hashCode(fArr);
        } else {
            iHashCode = 0;
        }
        return this.f142849g.hashCode() + ((iE2 + iHashCode) * 31);
    }

    public /* synthetic */ f(long j8, long j14, long j15, long j16, long j17, float[] fArr, j jVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, j14, j15, j16, j17, fArr, jVar);
    }
}
