package kotlin;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import e23.a;
import e23.l;
import p005kotlin.jvm.internal.s;
import p1.n;
import p5.a0;
import p5.p;
import p5.q;
import p5.r;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/d0;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f91131a = new d0();

    private d0() {
    }

    public final boolean onClearTranslation(View view2) {
        a aVar;
        view2.getClass();
        j4.a contentCaptureManager = ((m) view2).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f96968f = j4.a.b.SHOW_ORIGINAL;
        n<a0> nVarD = contentCaptureManager.d();
        Object[] objArr = nVarD.f134774c;
        long[] jArr = nVarD.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        q qVar = ((a0) objArr[(i14 << 3) + i16]).f135947a.f136098d;
                        p5.d0.f135959a.getClass();
                        if (r.a(qVar, p5.d0.F) != null) {
                            p.f136057a.getClass();
                            p5.a aVar2 = (p5.a) r.a(qVar, p.f136071o);
                            if (aVar2 != null && (aVar = (a) aVar2.f135946b) != null) {
                            }
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }

    public final boolean onHideTranslation(View view2) {
        l lVar;
        view2.getClass();
        j4.a contentCaptureManager = ((m) view2).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f96968f = j4.a.b.SHOW_ORIGINAL;
        n<a0> nVarD = contentCaptureManager.d();
        Object[] objArr = nVarD.f134774c;
        long[] jArr = nVarD.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        q qVar = ((a0) objArr[(i14 << 3) + i16]).f135947a.f136098d;
                        p5.d0.f135959a.getClass();
                        if (s.g(r.a(qVar, p5.d0.F), Boolean.TRUE)) {
                            p.f136057a.getClass();
                            p5.a aVar = (p5.a) r.a(qVar, p.f136070n);
                            if (aVar != null && (lVar = (l) aVar.f135946b) != null) {
                            }
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }

    public final boolean onShowTranslation(View view2) {
        l lVar;
        view2.getClass();
        j4.a contentCaptureManager = ((m) view2).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.f96968f = j4.a.b.SHOW_TRANSLATED;
        n<a0> nVarD = contentCaptureManager.d();
        Object[] objArr = nVarD.f134774c;
        long[] jArr = nVarD.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        q qVar = ((a0) objArr[(i14 << 3) + i16]).f135947a.f136098d;
                        p5.d0.f135959a.getClass();
                        if (s.g(r.a(qVar, p5.d0.F), Boolean.FALSE)) {
                            p.f136057a.getClass();
                            p5.a aVar = (p5.a) r.a(qVar, p.f136070n);
                            if (aVar != null && (lVar = (l) aVar.f135946b) != null) {
                            }
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return true;
                }
            }
            if (i14 == length) {
                return true;
            }
            i14++;
        }
    }
}
