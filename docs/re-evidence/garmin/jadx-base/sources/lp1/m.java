package lp1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llp1/m;", "Le32/p;", "Lip1/c;", "Landroid/view/View;", "view", "Le32/l;", "Lep1/g;", "navigator", "<init>", "(Landroid/view/View;Le32/l;)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements e32.p<ip1.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f114175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f114176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f114177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f114178d;

    public m(View view2, e32.l<ep1.g> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f114175a = new r(view2);
        View viewFindViewById = view2.findViewById(R.id.no_data_view);
        viewFindViewById.getClass();
        this.f114176b = (ComposeView) viewFindViewById;
        this.f114177c = new a(view2, new dp1.e(lVar, 1));
        this.f114178d = new o(view2);
    }

    @Override // e32.p
    public final void a() {
        View view2 = this.f114175a.f114194a;
        view2.getClass();
        view2.setVisibility(8);
        this.f114177c.a(null);
        View view3 = this.f114178d.f114186b;
        view3.getClass();
        view3.setVisibility(8);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(ip1.c cVar) {
        return false;
    }

    @Override // e32.p
    public final void c(ip1.c cVar) {
        long jLongValue;
        long j8;
        Double gainSolarActivityTime;
        List<ip1.a> listB;
        ip1.b deviceSolarInput;
        List<ip1.g> listB2;
        List<ip1.a> listB3;
        ip1.c cVar2 = cVar;
        a2 a2Var = a2.EDGE_SOLAR_CHARGE;
        String strH = am.j.h((cVar2 == null || (listB3 = cVar2.b()) == null) ? 0 : listB3.size(), "Number of activities: ");
        i2.f36769a.getClass();
        i2.a.a(a2Var, strH);
        if (cVar2 == null || (deviceSolarInput = cVar2.getDeviceSolarInput()) == null || (listB2 = deviceSolarInput.b()) == null) {
            jLongValue = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB2.iterator();
            while (it.hasNext()) {
                Long totalActivityTimeGainedMs = ((ip1.g) it.next()).getTotalActivityTimeGainedMs();
                if (totalActivityTimeGainedMs != null) {
                    arrayList.add(totalActivityTimeGainedMs);
                }
            }
            Iterator it3 = arrayList.iterator();
            jLongValue = 0;
            while (it3.hasNext()) {
                jLongValue += ((Number) it3.next()).longValue();
            }
        }
        l3.f23124b.getClass();
        long j14 = (long) (jLongValue / ((double) 1000));
        o oVar = this.f114178d;
        a aVar = this.f114177c;
        ArrayList arrayList2 = null;
        r rVar = this.f114175a;
        if (j14 <= 0) {
            View view2 = rVar.f114194a;
            view2.getClass();
            view2.setVisibility(0);
            rVar.f114195b.setText(rVar.f114196c.f114152d);
            c.f114135a.getClass();
            this.f114176b.setContent(c.f114137c);
            aVar.a(null);
            View view3 = oVar.f114186b;
            view3.getClass();
            view3.setVisibility(8);
            return;
        }
        View view4 = rVar.f114194a;
        view4.getClass();
        view4.setVisibility(0);
        i iVar = rVar.f114196c;
        rVar.f114195b.setText(rVar.f114197d.a(iVar.a(j14), R.style.Text_Body1_Primary, iVar.f114192b, iVar.f114193c));
        if (cVar2 != null && (listB = cVar2.b()) != null) {
            arrayList2 = new ArrayList();
            for (Object obj : listB) {
                ip1.k summaryDTO = ((ip1.a) obj).getSummaryDTO();
                if (summaryDTO != null && summaryDTO.g()) {
                    arrayList2.add(obj);
                }
            }
        }
        aVar.a(arrayList2);
        a2 a2Var2 = a2.EDGE_SOLAR_CHARGE;
        String strH2 = am.j.h(arrayList2 != null ? arrayList2.size() : 0, "Number of activities with solar gain time: ");
        i2.f36769a.getClass();
        i2.a.a(a2Var2, strH2);
        if (arrayList2 != null) {
            Iterator it4 = arrayList2.iterator();
            double dDoubleValue = 0.0d;
            while (it4.hasNext()) {
                ip1.k summaryDTO2 = ((ip1.a) it4.next()).getSummaryDTO();
                dDoubleValue += (summaryDTO2 == null || (gainSolarActivityTime = summaryDTO2.getGainSolarActivityTime()) == null) ? 0.0d : gainSolarActivityTime.doubleValue();
            }
            j8 = (long) dDoubleValue;
        } else {
            j8 = 0;
        }
        long j15 = j14 - j8;
        if (j15 <= 0) {
            View view5 = oVar.f114186b;
            view5.getClass();
            view5.setVisibility(8);
            return;
        }
        View view6 = oVar.f114186b;
        view6.getClass();
        view6.setVisibility(0);
        TextView textView = oVar.f114187c;
        Context context = oVar.f114185a;
        context.getClass();
        textView.setText(y.n(context, j15));
    }
}
