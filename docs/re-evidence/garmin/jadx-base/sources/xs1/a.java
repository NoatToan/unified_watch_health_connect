package xs1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import pt1.p;
import qz.c;
import xz.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxs1/a;", "Lqz/c;", "Lpt1/p;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<p, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f192075a;

    public a(Context context) {
        context.getClass();
        this.f192075a = context;
    }

    @Override // qz.c
    public final List<BarDataSet> a(p pVar) {
        Iterable<o20.a> iterableB1;
        i53.c<o20.a> cVar;
        p pVar2 = pVar;
        if (pVar2 == null || (cVar = pVar2.f140936h) == null || (iterableB1 = h0.b1(cVar)) == null) {
            iterableB1 = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(iterableB1, 10));
        for (o20.a aVar : iterableB1) {
            Context context = this.f192075a;
            arrayList.add(new e(((float) aVar.C()) - 1.0f, ((float) aVar.D()) * 100.0f, (Object) null, new int[]{context.getColor(R.color.blue_40_static), context.getColor(R.color.blue_40_static)}, 0.0f, false, false, 112, (j) null));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setHighlightEnabled(false);
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(p pVar) {
        return 12;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(p pVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(p pVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(p pVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    @Override // qz.c
    public final float i(p pVar) {
        float fDoubleValue;
        i53.c<o20.a> cVar;
        Double dValueOf;
        p pVar2 = pVar;
        if (pVar2 == null || (cVar = pVar2.f140936h) == null) {
            fDoubleValue = 0.0f;
        } else {
            Iterator<o20.a> it = cVar.iterator();
            if (it.hasNext()) {
                double D = it.next().D();
                while (it.hasNext()) {
                    D = Math.max(D, it.next().D());
                }
                dValueOf = Double.valueOf(D);
            } else {
                dValueOf = null;
            }
            if (dValueOf != null) {
                fDoubleValue = (float) dValueOf.doubleValue();
            } else {
                fDoubleValue = 0.0f;
            }
        }
        return fDoubleValue * 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(p pVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(p pVar) {
        return 11.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(p pVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(p pVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(p pVar) {
        return 0.0f;
    }
}
