package ps2;

import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.m1;
import androidx.core.view.z;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Calendar;
import java.util.Collection;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import r22.c0;
import r22.y1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements u03.f, u03.d, u03.a, SearchView.l, c0.b, y1.d, z, qm.h.a, YAxisValueFormatter, qm.i.b, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f140472b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f140471a = i14;
        this.f140472b = obj;
    }

    @Override // qm.h.a
    public void a(float f14) {
        qm.c cVar = ((qm.c.k) this.f140472b).f145309a;
        qm.c.g0 g0Var = cVar.f145288z;
        g0Var.f145304a = false;
        cVar.f145270g.setValueLabel(cVar.f145286x.getString(R.string.lbl_value_avg, g0Var.b(f14)));
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f140471a;
        Object obj2 = this.f140472b;
        switch (i14) {
            case 4:
                ((c) obj2).invoke(obj);
                break;
            case 5:
                ((p90.h) obj2).invoke(obj);
                break;
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                qr2.e.E4((bb2.b) obj2, obj);
                break;
            case 7:
                ((c) obj2).invoke(obj);
                break;
            case 8:
                ((c) obj2).invoke(obj);
                break;
            case 18:
                Logger logger = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 19:
                Logger logger2 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 20:
                Logger logger3 = qr2.d.f146935v;
                ((ph1.d) obj2).invoke(obj);
                break;
            case 21:
                Logger logger4 = qr2.d.f146935v;
                ((qd0.a) obj2).invoke(obj);
                break;
            case 22:
                Logger logger5 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 23:
                Logger logger6 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 24:
                Logger logger7 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 25:
                Logger logger8 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
            case 26:
                Logger logger9 = qr2.d.f146935v;
                ((qr2.c) obj2).invoke(obj);
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        switch (this.f140471a) {
            case 0:
                c cVar = (c) this.f140472b;
                obj.getClass();
                return (q03.f) cVar.invoke(obj);
            case 1:
                f fVar = (f) this.f140472b;
                obj.getClass();
                return (q03.f) fVar.invoke(obj);
            case 2:
                c cVar2 = (c) this.f140472b;
                obj.getClass();
                return (Collection) cVar2.invoke(obj);
            case 3:
                c cVar3 = (c) this.f140472b;
                obj.getClass();
                return (q03.f) cVar3.invoke(obj);
            default:
                f fVar2 = (f) this.f140472b;
                obj.getClass();
                return (q03.f) fVar2.invoke(obj);
        }
    }

    @Override // r22.y1.d
    public void c(Object obj) {
        com.garmin.android.apps.connectmobile.settings.lte.b bVar = (com.garmin.android.apps.connectmobile.settings.lte.b) this.f140472b;
        com.garmin.android.apps.connectmobile.settings.lte.b.a aVar = com.garmin.android.apps.connectmobile.settings.lte.b.f43475i;
        obj.getClass();
        bVar.f43482g = ((Long) obj).longValue();
        bVar.u6().F4(bVar.f43482g);
    }

    @Override // com.github.mikephil.chartingv2.formatter.YAxisValueFormatter
    public String getFormattedValue(float f14, YAxis yAxis) {
        int iRound;
        qm.m mVar = (qm.m) this.f140472b;
        if (mVar.f145433j.getB1() == 3) {
            float f15 = mVar.f145429f;
            iRound = (int) j20.x.a(mVar.f145428e, f15, f14 / mVar.f145426c, f15);
        } else {
            float f16 = mVar.f145431h;
            double dA = j20.x.a(mVar.f145430g, f16, f14 / mVar.f145426c, f16);
            if (!am.j.z(f12.l.f68084a)) {
                l3.f23124b.getClass();
                dA = l3.a.d(dA);
            }
            iRound = (int) Math.round(dA);
        }
        return String.valueOf(iRound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r22.c0.b
    public void h(Calendar calendar) {
        rh1.b bVar;
        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = (IndexScale2AdjustBodyCompositionActivity) this.f140472b;
        String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
        LocalDate localDateFromCalendarFields = LocalDate.fromCalendarFields(calendar);
        qh1.p pVarDa = indexScale2AdjustBodyCompositionActivity.da();
        localDateFromCalendarFields.getClass();
        y0<rh1.a> y0Var = pVarDa.f144769d;
        rh1.a aVarD = y0Var.d();
        if (aVarD != null) {
            rh1.b bVar2 = aVarD.f152745a;
            rh1.b bVarB = bVar2 != null ? rh1.b.b(bVar2, localDateFromCalendarFields, null, null, 14) : new rh1.b(localDateFromCalendarFields, null, null, null, 14, null);
            rh1.a.f152744f.getClass();
            y0Var.m(rh1.a.a(aVarD, bVarB, null, null, null, false, 22));
        }
        qh1.p pVarDa2 = indexScale2AdjustBodyCompositionActivity.da();
        rh1.a aVar = (rh1.a) pVarDa2.f144770e.d();
        if (aVar == null || (bVar = aVar.f152745a) == null) {
            return;
        }
        pVarDa2.y4();
        ge1.b.T(v1.a(pVarDa2), null, null, new qh1.w(pVarDa2, bVar, null), 3);
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        int i14 = this.f140471a;
        Object obj = this.f140472b;
        switch (i14) {
            case 13:
                int i15 = qm.a.f145246i;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(128);
                eVarI.getClass();
                ((qm.a) obj).f().setExtraLeftOffset(Utils.convertPixelsToDp(eVarI.f25190a));
                break;
            default:
                ((qm.u) obj).setExtraLeftOffset(com.github.mikephil.chartingv2.utils.Utils.convertPixelsToDp(m1Var.f6508a.i(128).f25190a));
                break;
        }
        return m1Var;
    }

    @Override // androidx.appcompat.widget.SearchView.l
    public void onClose() {
        qg0.a aVar = (qg0.a) this.f140472b;
        aVar.f144658h = null;
        aVar.ga();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ph1.d dVar = (ph1.d) this.f140472b;
        qw0.b.a aVar = qw0.b.f148296j;
        dVar.invoke(obj);
    }

    @Override // u03.a
    public void run() {
        int i14 = this.f140471a;
        Object obj = this.f140472b;
        switch (i14) {
            case 9:
                ms2.g gVar = (ms2.g) obj;
                w wVar = w.f140538a;
                is2.b bVarA = gVar.getF133320a();
                try {
                    gVar.initialize().k(l13.a.f108327b).e();
                } catch (Exception e4) {
                    w.f140539b.error("failed to init provider " + bVarA, (Throwable) e4);
                    w.f140544g.add(bVarA);
                    w.f140542e.remove(bVarA);
                    return;
                }
                break;
            default:
                qr2.e.C4((qr2.e) obj);
                break;
        }
    }
}
