package kotlin;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g6.o;
import h5.e0;
import j23.f;
import j23.t;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p13.h0;
import p5.c0;
import p5.d0;
import p5.j0;
import p5.k;
import p5.q;
import p5.r;
import p5.y;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91641a;

        static {
            int[] iArr = new int[r5.a.values().length];
            try {
                iArr[r5.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r5.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r5.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91641a = iArr;
        }
    }

    public static final boolean a(y yVar) {
        q qVarK = yVar.k();
        d0.f135959a.getClass();
        return !qVarK.f136085a.b(d0.f135969k);
    }

    public static final boolean b(y yVar) {
        return yVar.f136097c.B == o.Rtl;
    }

    public static final boolean c(y yVar, Resources resources) {
        q qVar = yVar.f136098d;
        d0.f135959a.getClass();
        List list = (List) r.a(qVar, d0.f135960b);
        return !c0.e(yVar) && (yVar.f136098d.f136088d || (yVar.r() && ((list != null ? (String) h0.d0(list) : null) != null || g(yVar) != null || f(yVar, resources) != null || e(yVar))));
    }

    public static final e0 d(e0 e0Var, l<? super e0, Boolean> lVar) {
        for (e0 e0VarK = e0Var.K(); e0VarK != null; e0VarK = e0VarK.K()) {
            if (lVar.invoke(e0VarK).booleanValue()) {
                return e0VarK;
            }
        }
        return null;
    }

    public static final boolean e(y yVar) {
        q qVar = yVar.f136098d;
        d0 d0Var = d0.f135959a;
        d0Var.getClass();
        r5.a aVar = (r5.a) r.a(qVar, d0.L);
        q qVar2 = yVar.f136098d;
        d0Var.getClass();
        p5.l lVar = (p5.l) r.a(qVar2, d0.A);
        boolean z14 = aVar != null;
        d0Var.getClass();
        if (((Boolean) r.a(qVar2, d0.K)) == null) {
            return z14;
        }
        p5.l.f136032b.getClass();
        int i14 = p5.l.f136036f;
        if (lVar != null && lVar.f136041a == i14) {
            return z14;
        }
        return true;
    }

    public static final String f(y yVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        int iE;
        q qVar = yVar.f136098d;
        d0.f135959a.getClass();
        Object objA = r.a(qVar, d0.f135961c);
        q qVar2 = yVar.f136098d;
        r5.a aVar = (r5.a) r.a(qVar2, d0.L);
        p5.l lVar = (p5.l) r.a(qVar2, d0.A);
        if (aVar != null) {
            int i14 = a.f91641a[aVar.ordinal()];
            if (i14 == 1) {
                p5.l.f136032b.getClass();
                int i15 = p5.l.f136034d;
                if (lVar != null && lVar.f136041a == i15 && objA == null) {
                    objA = resources.getString(R.string.state_on);
                }
            } else if (i14 == 2) {
                p5.l.f136032b.getClass();
                int i16 = p5.l.f136034d;
                if (lVar != null && lVar.f136041a == i16 && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else {
                if (i14 != 3) {
                    u0.r();
                    return null;
                }
                if (objA == null) {
                    objA = resources.getString(R.string.indeterminate);
                }
            }
        }
        Boolean bool = (Boolean) r.a(qVar2, d0.K);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            p5.l.f136032b.getClass();
            int i17 = p5.l.f136036f;
            if ((lVar == null || lVar.f136041a != i17) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        k kVar = (k) r.a(qVar2, d0.f135962d);
        if (kVar != null) {
            k.f136027d.getClass();
            if (kVar != k.f136028e) {
                if (objA == null) {
                    f<Float> fVar = kVar.f136030b;
                    float fFloatValue = fVar.b().floatValue() - fVar.getStart().floatValue() == 0.0f ? 0.0f : (kVar.f136029a - fVar.getStart().floatValue()) / (fVar.b().floatValue() - fVar.getStart().floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iE = 0;
                    } else {
                        iE = fFloatValue == 1.0f ? 100 : t.e(Math.round(fFloatValue * 100), 1, 99);
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(iE));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        j0<c> j0Var = d0.H;
        if (qVar2.f136085a.b(j0Var)) {
            q qVarK = new y(yVar.f136095a, true, yVar.f136097c, qVar2).k();
            Collection collection2 = (Collection) r.a(qVarK, d0.f135960b);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) r.a(qVarK, d0.D)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) r.a(qVarK, j0Var)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) objA;
    }

    public static final c g(y yVar) {
        q qVar = yVar.f136098d;
        d0 d0Var = d0.f135959a;
        d0Var.getClass();
        c cVar = (c) r.a(qVar, d0.H);
        q qVar2 = yVar.f136098d;
        d0Var.getClass();
        List list = (List) r.a(qVar2, d0.D);
        return cVar == null ? list != null ? (c) h0.d0(list) : null : cVar;
    }
}
