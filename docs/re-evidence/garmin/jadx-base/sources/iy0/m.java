package iy0;

import am.x0;
import am.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liy0/m;", "Lqz/c;", "Lsy0/l;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Li53/c;", "Lcy0/n;", "activities", "<init>", "(Landroid/content/Context;Li53/c;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements qz.c<sy0.l, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<cy0.n> f95811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.f f95812c;

    public m(Context context, i53.c<cy0.n> cVar) {
        context.getClass();
        this.f95810a = context;
        this.f95811b = cVar;
        String string = context.getString(R.string.lbl_time_h_m_s);
        string.getClass();
        xz.g.f fVar = xz.g.f.f192751a;
        this.f95812c = i53.a.a(new xz.f(string, null, null, null, fVar, null, null, 110, null), new xz.f("", null, null, null, fVar, null, null, 110, null));
    }

    public static k x(i53.c cVar) {
        if (cVar == null) {
            return null;
        }
        Iterator<E> it = cVar.iterator();
        double d14 = Double.MAX_VALUE;
        double d15 = Double.MIN_VALUE;
        double d16 = Double.MIN_VALUE;
        double d17 = Double.MAX_VALUE;
        while (it.hasNext()) {
            cy0.g gVar = (cy0.g) it.next();
            int durationSecondOffset = gVar.getDurationSecondOffset();
            double elevation = gVar.getElevation();
            double d18 = durationSecondOffset;
            if (d18 > d15) {
                d15 = d18;
            }
            if (d18 < d14) {
                d14 = d18;
            }
            if (elevation > d16) {
                d16 = elevation;
            }
            if (elevation < d17) {
                d17 = elevation;
            }
        }
        return new k(new j(d14, d15), new j(d17, d16));
    }

    @Override // qz.c
    public final List<ILineDataSet> a(sy0.l lVar) {
        i53.c<cy0.g> cVar;
        sy0.l lVar2 = lVar;
        ArrayList arrayList = new ArrayList();
        if (lVar2 != null && (cVar = lVar2.f161250b) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (cy0.g gVar : cVar) {
                arrayList2.add(new Entry(gVar.getDurationSecondOffset(), (float) gVar.getElevation()));
            }
            i53.f fVarJ = i53.a.j(h0.N0(arrayList2, new l()));
            if (!fVarJ.isEmpty()) {
                LineDataSet lineDataSet = new LineDataSet(fVarJ, "");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setLineWidth(2.0f);
                gl.c.f77766a.getClass();
                gl.e eVar = gl.c.f77767b;
                lineDataSet.setColor(f0.j(eVar.f77817y));
                lineDataSet.setFillColor(f0.j(eVar.f77817y));
                lineDataSet.setFillAlpha(255);
                arrayList.add(lineDataSet);
            }
        }
        return i53.a.j(h0.Z(arrayList));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(sy0.l lVar) {
        return false;
    }

    @Override // qz.c
    public final float e(sy0.l lVar) {
        sy0.l lVar2 = lVar;
        k kVarX = x(lVar2 != null ? lVar2.f161250b : null);
        if (kVarX != null) {
            return (float) kVarX.f95808a.f95806a;
        }
        return -1.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final List g(sy0.l lVar) {
        i53.c<cy0.f> cVar;
        cy0.n nVar;
        cy0.n next;
        sy0.l lVar2 = lVar;
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        ArrayList arrayList = new ArrayList();
        if (lVar2 != null && (cVar = lVar2.f161249a) != null) {
            for (cy0.f fVar : cVar) {
                i53.c<cy0.n> cVar2 = this.f95811b;
                if (cVar2 != null) {
                    Iterator<cy0.n> it = cVar2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (next.getActivityId() != fVar.getActivityId());
                    nVar = next;
                } else {
                    nVar = null;
                }
                x0 x0VarM = z0.m(nVar != null ? nVar.getActivityTypeKey() : null);
                if (x0VarM != null) {
                    int iU = x0VarM.u(zL0);
                    int i14 = x0VarM.f4366i;
                    Context context = this.f95810a;
                    Resources resources = context.getResources();
                    resources.getClass();
                    arrayList.add(new xz.h(fVar.getStartDurationOffsetSecond(), r0.a(context, iU, i14, R.color.gcm_icon_on_color, (int) xy2.b.n(resources, 1.0f), R.color.gcm_icon_stroke, r0.a.DEFAULT), ""));
                }
            }
        }
        return i53.a.j(arrayList);
    }

    @Override // qz.c
    public final float i(sy0.l lVar) {
        sy0.l lVar2 = lVar;
        k kVarX = x(lVar2 != null ? lVar2.f161250b : null);
        if (kVarX == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.ceil(kVarX.f95809b.f95807b / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(sy0.l lVar) {
        return 4;
    }

    @Override // qz.c
    public final boolean l() {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(sy0.l lVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final float q(sy0.l lVar) {
        sy0.l lVar2 = lVar;
        k kVarX = x(lVar2 != null ? lVar2.f161250b : null);
        if (kVarX != null) {
            return (float) kVarX.f95808a.f95807b;
        }
        return -1.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final float t(sy0.l lVar) {
        sy0.l lVar2 = lVar;
        k kVarX = x(lVar2 != null ? lVar2.f161250b : null);
        if (kVarX == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.floor(kVarX.f95809b.f95806a / d14) * d14);
    }

    @Override // qz.c
    public final List u(sy0.l lVar) {
        return this.f95812c;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(sy0.l lVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(sy0.l lVar) {
        return 0.0f;
    }
}
