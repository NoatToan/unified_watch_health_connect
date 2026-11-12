package qm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import ps.r1;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqm/m0;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lqm/l0;", "timeInZoneChartConfig", "Ltr/g;", "formatter", "<init>", "(Landroid/content/Context;Lqm/l0;Ltr/g;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class m0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f145413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tr.g f145414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context, l0 l0Var, tr.g gVar) {
        super(context);
        context.getClass();
        l0Var.getClass();
        gVar.getClass();
        this.f145413a = l0Var;
        this.f145414b = gVar;
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context).inflate(R.layout.composable_container, (ViewGroup) this, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    public final void a(List<r1> list, double d14, boolean z14) {
        Double zoneLowBoundary;
        Double d15;
        Double secsInZone;
        List<r1> list2 = list;
        list2.getClass();
        View viewFindViewById = findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        er.b bVar = er.b.f65058a;
        l0 l0Var = this.f145413a;
        List<Integer> listA = l0Var.a();
        int iB = l0Var.b();
        bVar.getClass();
        tr.g gVar = this.f145414b;
        gVar.getClass();
        l22.b bVar2 = gVar.f166119a;
        listA.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
        for (r1 r1Var : list2) {
            double d16 = 0.0d;
            double dDoubleValue = (r1Var == null || (secsInZone = r1Var.getSecsInZone()) == null) ? 0.0d : secsInZone.doubleValue();
            if (dDoubleValue >= 0.0d) {
                d16 = dDoubleValue;
            }
            arrayList.add(Double.valueOf(d16));
        }
        ArrayList arrayListD = tr.g.d(arrayList, d14, RoundingMode.FLOOR);
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        for (Object obj : list2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            int size = (list2.size() - 1) - i14;
            r1 r1Var2 = list2.get(size);
            int i16 = size + 1;
            int iIntValue = listA.get(size).intValue();
            String strE = gVar.e(i16);
            double dDoubleValue2 = ((Number) arrayListD.get(size)).doubleValue();
            float f14 = (float) dDoubleValue2;
            String strA = bVar2.a(R.string.lbl_percentage_with_value, Integer.valueOf((int) Math.floor(dDoubleValue2)));
            StringBuilder sb3 = new StringBuilder();
            r1 r1Var3 = (r1) p13.h0.e0(i16, list2);
            r1 r1Var4 = (r1) p13.h0.e0(size, list2);
            Integer numF = gVar.f(i16);
            String string = numF != null ? bVar2.getString(numF.intValue()) : null;
            if (r1Var4 != null) {
                int size2 = list.size();
                Double zoneLowBoundaryWithPrecision = z14 ? r1Var4.getZoneLowBoundaryWithPrecision() : r1Var4.getZoneLowBoundary();
                if (z14) {
                    if (r1Var3 != null) {
                        zoneLowBoundary = r1Var3.getZoneLowBoundaryWithPrecision();
                        d15 = zoneLowBoundary;
                    } else {
                        d15 = null;
                    }
                } else if (r1Var3 != null) {
                    zoneLowBoundary = r1Var3.getZoneLowBoundary();
                    d15 = zoneLowBoundary;
                } else {
                    d15 = null;
                }
                sb3.append(gVar.c(i16, size2, zoneLowBoundaryWithPrecision, d15));
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar2.getString(iB));
                if (string != null) {
                    sb3.append(" • ");
                    sb3.append(string);
                }
            } else {
                listA = listA;
            }
            arrayList2.add(new er.a(f14, strA, null, iIntValue, strE, sb3.toString(), String.valueOf(r1Var2 != null ? tr.g.a(r1Var2.getSecsInZone()) : null)));
            list2 = list;
            i14 = i15;
            listA = listA;
        }
        cr.c0.b(composeView, i53.a.j(arrayList2));
    }

    public final void b(List<x1> list, double d14) {
        er.a aVar;
        list.getClass();
        View viewFindViewById = findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        er.b bVar = er.b.f65058a;
        Context context = getContext();
        context.getClass();
        l22.a aVar2 = new l22.a(context);
        f12.l.f68084a.getClass();
        boolean zY = f12.l.a.a().y();
        bVar.getClass();
        w13.c<qs.q> cVar = qs.q.f147147g;
        ArrayList arrayList = new ArrayList();
        for (qs.q qVar : cVar) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                x1 x1Var = (x1) obj;
                if (x1Var.a2() == qs.x.SKI_RUN_SPLIT_SECTION && p005kotlin.jvm.internal.s.g(qVar.f147148a, x1Var.getPisteDifficulty())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                aVar = null;
            } else {
                Iterator it = arrayList2.iterator();
                double dDoubleValue = 0.0d;
                while (it.hasNext()) {
                    Double elevationLoss = ((x1) it.next()).getElevationLoss();
                    dDoubleValue += elevationLoss != null ? elevationLoss.doubleValue() : 0.0d;
                }
                double d15 = (((double) 100) * dDoubleValue) / d14;
                float f14 = (float) d15;
                String strA = aVar2.a(R.string.lbl_percentage_with_value, Integer.valueOf(MathKt.b(d15)));
                int i14 = qVar.f147150c;
                String string = aVar2.getString(qVar.f147149b);
                l3.a aVar3 = l3.f23124b;
                gg1.o0 o0Var = zY ? gg1.o0.METRIC : gg1.o0.STATUTE_US;
                aVar3.getClass();
                aVar = new er.a(f14, strA, qVar.f147151d, i14, string, null, l3.a.b0(aVar2, dDoubleValue, o0Var, false, l3.f23131i), 32, null);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        cr.c0.b(composeView, i53.a.j(arrayList));
    }

    public final void c(com.garmin.android.apps.connectmobile.activities.newmodel.o.d dVar, im.n nVar) {
        er.a aVar;
        nVar.getClass();
        View viewFindViewById = findViewById(R.id.composable_container);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        er.b bVar = er.b.f65058a;
        List<Integer> listA = this.f145413a.a();
        bVar.getClass();
        tr.g gVar = this.f145414b;
        gVar.getClass();
        listA.getClass();
        ArrayList<Double> arrayListA = im.o.a(dVar, nVar);
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListA, 10));
        for (Double d14 : arrayListA) {
            double d15 = 0.0d;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            if (dDoubleValue >= 0.0d) {
                d15 = dDoubleValue;
            }
            arrayList.add(Double.valueOf(d15));
        }
        ArrayList arrayListD = tr.g.d(arrayList, p13.h0.P0(arrayList), RoundingMode.HALF_UP);
        j23.l lVarI = p13.x.i(arrayListA);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = lVarI.iterator();
        while (((j23.k) it).f96801c) {
            int size = (arrayListA.size() - 1) - ((p13.p0) it).nextInt();
            Double d16 = (Double) arrayListA.get(size);
            if (d16 != null) {
                int i14 = size + 1;
                int iIntValue = listA.get(size).intValue();
                String strE = gVar.e(i14);
                double dDoubleValue2 = ((Number) arrayListD.get(size)).doubleValue();
                aVar = new er.a((float) dDoubleValue2, gVar.f166119a.a(R.string.lbl_percentage_with_value, Integer.valueOf((int) Math.floor(dDoubleValue2))), null, iIntValue, strE, gVar.b(i14, Double.valueOf(dVar.f29624f)), tr.g.a(d16));
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList2.add(aVar);
            }
            arrayListA = arrayListA;
            listA = listA;
        }
        cr.c0.b(composeView, i53.a.j(arrayList2));
    }

    public /* synthetic */ m0(Context context, l0 l0Var, tr.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? new i0() : l0Var, (i14 & 4) != 0 ? new tr.d(new l22.a(context)) : gVar);
    }
}
