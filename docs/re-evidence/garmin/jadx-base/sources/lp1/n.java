package lp1;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp1/n;", "Le32/p;", "Lip1/i;", "Landroid/view/View;", "view", "Le32/l;", "Lep1/g;", "navigator", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalType", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements e32.p<ip1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f114179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f114180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f114181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposeView f114182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f114183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f114184f;

    public n(View view2, e32.l<ep1.g> lVar, LocalDate localDate, LocalDate localDate2, int i14) {
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f114179a = localDate;
        this.f114180b = localDate2;
        this.f114181c = new p(view2, localDate, localDate2, i14);
        View viewFindViewById = view2.findViewById(R.id.no_data_view);
        viewFindViewById.getClass();
        this.f114182d = (ComposeView) viewFindViewById;
        this.f114183e = new v(view2, i14);
        this.f114184f = new h(view2, lVar);
    }

    public static ArrayList e(List list, LocalDate localDate, LocalDate localDate2) {
        Object next;
        Long totalActivityTimeGainedMs;
        ArrayList arrayList = new ArrayList();
        int days = Days.daysBetween(localDate, localDate2).getDays();
        if (days >= 0) {
            int i14 = 0;
            while (true) {
                LocalDate localDateMinusDays = localDate2.minusDays(i14);
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((ip1.g) next).getLocalConnectDate(), localDateMinusDays));
                ip1.g gVar = (ip1.g) next;
                long jLongValue = (gVar == null || (totalActivityTimeGainedMs = gVar.getTotalActivityTimeGainedMs()) == null) ? 0L : totalActivityTimeGainedMs.longValue();
                l3.f23124b.getClass();
                localDateMinusDays.getClass();
                arrayList.add(new ip1.f(localDateMinusDays, (long) (jLongValue / ((double) 1000))));
                if (i14 == days) {
                    break;
                }
                i14++;
            }
        }
        return arrayList;
    }

    @Override // e32.p
    public final void a() {
        v22.e.j(this.f114181c.f114188a);
        ComposeView composeView = this.f114183e.f114207a;
        if (composeView != null) {
            f.f114142a.getClass();
            composeView.setContent(f.f114143b);
        }
        this.f114184f.a(null);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(ip1.i iVar) {
        return false;
    }

    @Override // e32.p
    public final void c(ip1.i iVar) {
        Object next;
        ip1.h hVar;
        ip1.i iVar2 = iVar;
        Iterable iterableE = null;
        List<ip1.g> listB = (iVar2 == null || (hVar = iVar2.f94690a) == null) ? null : hVar.b();
        if (listB == null || listB.isEmpty()) {
            d();
            return;
        }
        LocalDate localDate = this.f114179a;
        LocalDate localDate2 = this.f114180b;
        ArrayList arrayListE = e(listB, localDate, localDate2);
        Iterator it = arrayListE.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ip1.f) next).f94685b <= 0);
        if (next == null) {
            d();
            return;
        }
        LocalDate localDateMinusDays = localDate.minusDays(Days.daysBetween(localDate, localDate2).getDays() + 1);
        LocalDate localDateMinusDays2 = localDate.minusDays(1);
        ip1.h hVar2 = iVar2.f94691b;
        List<ip1.g> listB2 = hVar2 != null ? hVar2.b() : null;
        if (listB2 != null) {
            localDateMinusDays.getClass();
            localDateMinusDays2.getClass();
            iterableE = e(listB2, localDateMinusDays, localDateMinusDays2);
        }
        if (iterableE == null) {
            iterableE = j0.f134944a;
        }
        List listG0 = h0.G0(arrayListE);
        p pVar = this.f114181c;
        String string = pVar.f114189b.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        qz.a.b(pVar.f114190c, listG0, string, 4);
        v22.e.q(pVar.f114188a);
        Iterator it3 = arrayListE.iterator();
        long j8 = 0;
        while (it3.hasNext()) {
            j8 += ((ip1.f) it3.next()).f94685b;
        }
        Iterator it4 = iterableE.iterator();
        long j14 = 0;
        while (it4.hasNext()) {
            j14 += ((ip1.f) it4.next()).f94685b;
        }
        v vVar = this.f114183e;
        ComposeView composeView = vVar.f114207a;
        if (composeView != null) {
            composeView.setContent(new z3.e(-2005647857, true, new t(j8, vVar, j14, 0)));
        }
        this.f114184f.a(arrayListE);
    }

    public final void d() {
        p pVar = this.f114181c;
        String string = pVar.f114189b.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        qz.a.b(pVar.f114190c, null, string, 4);
        v22.e.q(pVar.f114188a);
        e.f114139a.getClass();
        this.f114182d.setContent(e.f114141c);
        ComposeView composeView = this.f114183e.f114207a;
        if (composeView != null) {
            f.f114142a.getClass();
            composeView.setContent(f.f114143b);
        }
        this.f114184f.a(null);
    }
}
