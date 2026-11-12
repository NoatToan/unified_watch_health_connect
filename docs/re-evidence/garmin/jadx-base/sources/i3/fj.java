package i3;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/fj;", "Lk6/c0;", "Li3/ti;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "tooltipAnchorSpacing", "<init>", "(IILkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class fj implements p004k6.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88126b;

    private fj(int i14, int i15) {
        this.f88125a = i14;
        this.f88126b = i15;
    }

    @Override // p004k6.c0
    public final long a(g6.l lVar, long j8, g6.o oVar, long j14) {
        ti.a aVar = ti.f89828b;
        aVar.getClass();
        int i14 = ti.f89831e;
        int i15 = this.f88125a;
        if (i15 == i14) {
            return c(lVar, j14);
        }
        aVar.getClass();
        if (i15 == ti.f89832f) {
            return d(lVar, j14, j8);
        }
        aVar.getClass();
        if (i15 == ti.f89829c) {
            return b(lVar, j14, j8);
        }
        aVar.getClass();
        if (i15 != ti.f89830d) {
            aVar.getClass();
            if (i15 == ti.f89833g) {
                return oVar == g6.o.Ltr ? c(lVar, j14) : d(lVar, j14, j8);
            }
            aVar.getClass();
            if (i15 == ti.f89834h) {
                return oVar == g6.o.Ltr ? d(lVar, j14, j8) : c(lVar, j14);
            }
            return b(lVar, j14, j8);
        }
        int i16 = (int) (j14 >> 32);
        int iA = am.j.a(lVar.d(), i16, 2, lVar.f76008a);
        if (iA < 0) {
            iA = lVar.f76008a;
        } else if (iA + i16 > ((int) (j8 >> 32))) {
            iA = lVar.f76010c - i16;
        }
        int i17 = lVar.f76011d;
        int i18 = this.f88126b;
        int i19 = i17 + i18;
        int i24 = (int) (j14 & 4294967295L);
        if (i19 + i24 > ((int) (j8 & 4294967295L))) {
            i19 = (lVar.f76009b - i24) - i18;
        }
        long j15 = (((long) iA) << 32) | (((long) i19) & 4294967295L);
        g6.k.a aVar2 = g6.k.f76003b;
        return j15;
    }

    public final long b(g6.l lVar, long j8, long j14) {
        int i14 = (int) (j8 >> 32);
        int iA = am.j.a(lVar.d(), i14, 2, lVar.f76008a);
        if (iA < 0) {
            iA = lVar.f76008a;
        } else if (iA + i14 > ((int) (j14 >> 32))) {
            iA = lVar.f76010c - i14;
        }
        int i15 = lVar.f76009b - ((int) (j8 & 4294967295L));
        int i16 = this.f88126b;
        int i17 = i15 - i16;
        if (i17 < 0) {
            i17 = lVar.f76011d + i16;
        }
        long j15 = (((long) iA) << 32) | (((long) i17) & 4294967295L);
        g6.k.a aVar = g6.k.f76003b;
        return j15;
    }

    public final long c(g6.l lVar, long j8) {
        int i14 = lVar.f76008a;
        int i15 = this.f88126b;
        int i16 = i14 - (((int) (j8 >> 32)) + i15);
        if (i16 < 0) {
            i16 = lVar.f76010c + i15;
        }
        long j14 = (((long) i16) << 32) | (((long) (((lVar.f76009b + lVar.f76011d) - ((int) (j8 & 4294967295L))) / 2)) & 4294967295L);
        g6.k.a aVar = g6.k.f76003b;
        return j14;
    }

    public final long d(g6.l lVar, long j8, long j14) {
        int i14 = lVar.f76010c;
        int i15 = this.f88126b;
        int i16 = i14 + i15;
        int i17 = (int) (j8 >> 32);
        if (i16 + i17 > ((int) (j14 >> 32))) {
            i16 = lVar.f76008a - (i17 + i15);
        }
        long j15 = (((long) i16) << 32) | (((long) (((lVar.f76009b + lVar.f76011d) - ((int) (j8 & 4294967295L))) / 2)) & 4294967295L);
        g6.k.a aVar = g6.k.f76003b;
        return j15;
    }

    public /* synthetic */ fj(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15);
    }
}
