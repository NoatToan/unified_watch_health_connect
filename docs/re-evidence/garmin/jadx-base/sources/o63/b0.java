package o63;

import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import java.util.Map;
import lc.u0;
import m63.k1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lo63/b0;", "Ln63/m;", "Ll63/b;", "Lo63/g;", "composer", "Ln63/b;", "json", "Lo63/g0;", "mode", "", "modeReuseCache", "<init>", "(Lo63/g;Ln63/b;Lo63/g0;[Ln63/m;)V", "Lo63/l;", "output", "(Lo63/l;Ln63/b;Lo63/g0;[Ln63/m;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends l63.b implements n63.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f129833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n63.b f129834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f129835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n63.m[] f129836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p63.e f129837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n63.g f129838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f129839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f129840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f129841i;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129842a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f129842a = iArr;
        }
    }

    public b0(g gVar, n63.b bVar, g0 g0Var, n63.m[] mVarArr) {
        gVar.getClass();
        bVar.getClass();
        g0Var.getClass();
        this.f129833a = gVar;
        this.f129834b = bVar;
        this.f129835c = g0Var;
        this.f129836d = mVarArr;
        this.f129837e = bVar.f123894b;
        this.f129838f = bVar.f123893a;
        int iOrdinal = g0Var.ordinal();
        if (mVarArr != null) {
            n63.m mVar = mVarArr[iOrdinal];
            if (mVar == null && mVar == this) {
                return;
            }
            mVarArr[iOrdinal] = this;
        }
    }

    @Override // l63.b, l63.f
    public final void A(double d14) {
        boolean z14 = this.f129839g;
        g gVar = this.f129833a;
        if (z14) {
            p(String.valueOf(d14));
        } else {
            gVar.f129854a.c(String.valueOf(d14));
        }
        if (this.f129838f.f123929k || Math.abs(d14) <= Double.MAX_VALUE) {
            return;
        }
        throw gg.b.e(gVar.f129854a.toString(), Double.valueOf(d14));
    }

    @Override // l63.d
    public final boolean C(k63.e eVar) {
        eVar.getClass();
        return this.f129838f.f123919a;
    }

    @Override // l63.b, l63.f
    public final void D() {
        g gVar = this.f129833a;
        gVar.getClass();
        gVar.f129854a.c(BuildConfig.TRAVIS);
    }

    @Override // l63.b
    public final void E(k63.e eVar, int i14) {
        eVar.getClass();
        int i15 = a.f129842a[this.f129835c.ordinal()];
        g gVar = this.f129833a;
        boolean z14 = true;
        if (i15 == 1) {
            if (!gVar.f129855b) {
                gVar.e(CoreConstants.COMMA_CHAR);
            }
            gVar.b();
            return;
        }
        if (i15 == 2) {
            if (gVar.f129855b) {
                this.f129839g = true;
                gVar.b();
                return;
            }
            if (i14 % 2 == 0) {
                gVar.e(CoreConstants.COMMA_CHAR);
                gVar.b();
            } else {
                gVar.e(CoreConstants.COLON_CHAR);
                gVar.j();
                z14 = false;
            }
            this.f129839g = z14;
            return;
        }
        if (i15 == 3) {
            if (i14 == 0) {
                this.f129839g = true;
            }
            if (i14 == 1) {
                gVar.e(CoreConstants.COMMA_CHAR);
                gVar.j();
                this.f129839g = false;
                return;
            }
            return;
        }
        if (!gVar.f129855b) {
            gVar.e(CoreConstants.COMMA_CHAR);
        }
        gVar.b();
        k.a<Map<String, Integer>> aVar = o.f129873a;
        n63.b bVar = this.f129834b;
        bVar.getClass();
        o.e(eVar, bVar);
        p(eVar.d(i14));
        gVar.e(CoreConstants.COLON_CHAR);
        gVar.j();
    }

    @Override // l63.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p63.e getF129837e() {
        return this.f129837e;
    }

    @Override // l63.b, l63.d
    public final void b(k63.e eVar) {
        eVar.getClass();
        g0 g0Var = this.f129835c;
        if (g0Var.f129863b != 0) {
            g gVar = this.f129833a;
            gVar.k();
            gVar.c();
            gVar.e(g0Var.f129863b);
        }
    }

    @Override // l63.b, l63.f
    public final l63.d c(k63.e eVar) {
        n63.m mVar;
        eVar.getClass();
        n63.b bVar = this.f129834b;
        g0 g0VarB = h0.b(eVar, bVar);
        char c14 = g0VarB.f129862a;
        g gVar = this.f129833a;
        if (c14 != 0) {
            gVar.e(c14);
            gVar.a();
        }
        String str = this.f129840h;
        if (str != null) {
            String f116983a = this.f129841i;
            if (f116983a == null) {
                f116983a = eVar.getF103221c();
            }
            gVar.b();
            gVar.i(str);
            gVar.e(CoreConstants.COLON_CHAR);
            gVar.j();
            p(f116983a);
            this.f129840h = null;
            this.f129841i = null;
        }
        if (this.f129835c == g0VarB) {
            return this;
        }
        n63.m[] mVarArr = this.f129836d;
        return (mVarArr == null || (mVar = mVarArr[g0VarB.ordinal()]) == null) ? new b0(gVar, bVar, g0VarB, mVarArr) : mVar;
    }

    @Override // l63.b, l63.d
    public final <T> void d(k63.e eVar, int i14, i63.i<? super T> iVar, T t7) {
        eVar.getClass();
        iVar.getClass();
        if (t7 != null || this.f129838f.f123924f) {
            super.d(eVar, i14, iVar, t7);
        }
    }

    @Override // l63.b, l63.f
    public final l63.f g(k63.e eVar) {
        eVar.getClass();
        boolean zA = c0.a(eVar);
        g0 g0Var = this.f129835c;
        n63.b bVar = this.f129834b;
        g hVar = this.f129833a;
        if (zA) {
            if (!(hVar instanceof i)) {
                hVar = new i(hVar.f129854a, this.f129839g);
            }
            return new b0(hVar, bVar, g0Var, (n63.m[]) null);
        }
        if (eVar.getF116965m() && eVar.equals(n63.j.f123935a)) {
            if (!(hVar instanceof h)) {
                hVar = new h(hVar.f129854a, this.f129839g);
            }
            return new b0(hVar, bVar, g0Var, (n63.m[]) null);
        }
        if (this.f129840h != null) {
            this.f129841i = eVar.getF103221c();
        }
        return this;
    }

    @Override // l63.b, l63.f
    public final void h(short s8) {
        if (this.f129839g) {
            p(String.valueOf((int) s8));
        } else {
            this.f129833a.h(s8);
        }
    }

    @Override // l63.b, l63.f
    public final void i(boolean z14) {
        if (this.f129839g) {
            p(String.valueOf(z14));
        } else {
            this.f129833a.f129854a.c(String.valueOf(z14));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l63.f
    public final <T> void l(i63.i<? super T> iVar, T t7) {
        String strA;
        iVar.getClass();
        n63.b bVar = this.f129834b;
        n63.g gVar = bVar.f123893a;
        if (gVar.f123927i) {
            iVar.serialize(this, t7);
            return;
        }
        boolean z14 = iVar instanceof m63.b;
        if (!z14) {
            int i14 = z.a.f129909a[gVar.f123934p.ordinal()];
            if (i14 != 1 && i14 != 2) {
                if (i14 != 3) {
                    u0.r();
                    return;
                } else {
                    k63.l f103234b = iVar.getF158591b().getF103234b();
                    strA = (p005kotlin.jvm.internal.s.g(f103234b, k63.m.a.f103253a) || p005kotlin.jvm.internal.s.g(f103234b, k63.m.d.f103256a)) ? z.a(iVar.getF158591b(), bVar) : null;
                }
            }
        } else if (gVar.f123934p != n63.a.NONE) {
        }
        if (z14) {
            m63.b bVar2 = (m63.b) iVar;
            if (t7 == 0) {
                androidx.core.view.j.s("Value for serializer ", bVar2.getF158591b(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            i63.i<? super T> iVarW = gl1.d.w(bVar2, this, t7);
            if (strA != null) {
                if (iVar instanceof i63.g) {
                    k63.e f116202c = iVarW.getF158591b();
                    f116202c.getClass();
                    if (k1.b(f116202c).contains(strA)) {
                        o2.c.o(p6.b.i("Sealed class '", iVarW.getF158591b().getF103221c(), "' cannot be serialized as base class '", ((i63.g) iVar).getF158591b().getF103221c(), "' because it has property name that conflicts with JSON class discriminator '"), strA, "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        return;
                    }
                }
                k63.l f103234b2 = iVarW.getF158591b().getF103234b();
                f103234b2.getClass();
                if (f103234b2 instanceof k63.l.b) {
                    vb.h.z("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    return;
                } else if (f103234b2 instanceof k63.d) {
                    vb.h.z("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    return;
                } else if (f103234b2 instanceof k63.c) {
                    vb.h.z("Actual serializer for polymorphic cannot be polymorphic itself");
                    return;
                }
            }
            iVar = iVarW;
        }
        if (strA != null) {
            String f116983a = iVar.getF158591b().getF103221c();
            this.f129840h = strA;
            this.f129841i = f116983a;
        }
        iVar.serialize(this, t7);
    }

    @Override // l63.b, l63.f
    public final void m(k63.e eVar, int i14) {
        eVar.getClass();
        p(eVar.d(i14));
    }

    @Override // l63.b, l63.f
    public final void o(int i14) {
        if (this.f129839g) {
            p(String.valueOf(i14));
        } else {
            this.f129833a.f(i14);
        }
    }

    @Override // l63.b, l63.f
    public final void p(String str) {
        str.getClass();
        this.f129833a.i(str);
    }

    @Override // l63.b, l63.f
    public final void s(long j8) {
        if (this.f129839g) {
            p(String.valueOf(j8));
        } else {
            this.f129833a.g(j8);
        }
    }

    @Override // l63.b, l63.f
    public final void t(char c14) {
        p(String.valueOf(c14));
    }

    @Override // l63.b, l63.f
    public final void w(byte b14) {
        if (this.f129839g) {
            p(String.valueOf((int) b14));
        } else {
            this.f129833a.d(b14);
        }
    }

    @Override // l63.b, l63.f
    public final void y(float f14) {
        boolean z14 = this.f129839g;
        g gVar = this.f129833a;
        if (z14) {
            p(String.valueOf(f14));
        } else {
            gVar.f129854a.c(String.valueOf(f14));
        }
        if (this.f129838f.f123929k || Math.abs(f14) <= Float.MAX_VALUE) {
            return;
        }
        throw gg.b.e(gVar.f129854a.toString(), Float.valueOf(f14));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(l lVar, n63.b bVar, g0 g0Var, n63.m[] mVarArr) {
        this(bVar.f123893a.f123923e ? new j(lVar, bVar) : new g(lVar), bVar, g0Var, mVarArr);
        lVar.getClass();
        bVar.getClass();
        g0Var.getClass();
        mVarArr.getClass();
    }
}
