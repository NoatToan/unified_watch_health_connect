package zs0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bt0.i;
import bt0.j;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import e32.p;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.x;
import qz.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzs0/f;", "Le32/p;", "Lvs0/c;", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalType", "Landroid/view/View;", "view", "Ljt0/a;", "viewModel", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;ILandroid/view/View;Ljt0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements p<vs0.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f206844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jt0.a f206845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f206846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f206847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f206848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f206849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k32.e<xs0.b> f206850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k32.e<xs0.b> f206851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k32.e<xs0.b> f206852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final at0.e f206853j;

    public f(LocalDate localDate, LocalDate localDate2, int i14, View view2, jt0.a aVar) {
        localDate.getClass();
        localDate2.getClass();
        view2.getClass();
        aVar.getClass();
        this.f206844a = view2;
        this.f206845b = aVar;
        View viewFindViewById = view2.findViewById(R.id.report_type_title);
        viewFindViewById.getClass();
        this.f206846c = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pace_chip);
        viewFindViewById2.getClass();
        this.f206847d = viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.power_chip);
        viewFindViewById3.getClass();
        this.f206848e = viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.power_per_weight_chip);
        viewFindViewById4.getClass();
        this.f206849f = viewFindViewById4;
        this.f206850g = new k32.e<>(viewFindViewById2, xs0.b.PACE, false, 4, null);
        this.f206851h = new k32.e<>(viewFindViewById3, xs0.b.POWER, false, 4, null);
        this.f206852i = new k32.e<>(viewFindViewById4, xs0.b.POWER_PER_KG, false, 4, null);
        this.f206853j = new at0.e(view2, localDate, localDate2, i14, aVar.f100682a);
    }

    @Override // e32.p
    public final void a() {
        at0.e eVar = this.f206853j;
        qz.a.b(eVar.f12753b, null, eVar.f12754c, 4);
        k32.e<xs0.b> eVar2 = this.f206850g;
        eVar2.d(R.string.lbl_pace);
        k32.e<xs0.b> eVar3 = this.f206851h;
        eVar3.d(R.string.lbl_power_cap);
        k32.e<xs0.b> eVar4 = this.f206852i;
        eVar4.d(R.string.lbl_power_watts_per_kilogram_abbreviation);
        new k32.c(x.k(eVar2, eVar3, eVar4), new e(this), null, 4, null);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(vs0.c cVar) {
        return false;
    }

    @Override // e32.p
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c(vs0.c cVar) {
        xs0.b bVar;
        List<o61.b> list;
        List<o61.b> list2;
        xs0.b bVarD = this.f206845b.f100689h.d();
        if (bVarD == null) {
            bVarD = xs0.b.PACE;
        }
        TextView textView = this.f206846c;
        k32.e<xs0.b> eVar = this.f206852i;
        k32.e<xs0.b> eVar2 = this.f206851h;
        k32.e<xs0.b> eVar3 = this.f206850g;
        if (cVar == null || (list2 = cVar.f179734c) == null || list2.isEmpty()) {
            eVar3.a(false);
            eVar2.a(false);
            eVar.a(false);
            v22.e.j(textView);
            bVar = null;
        } else {
            v22.e.q(textView);
            List<o61.b> list3 = cVar.f179735d;
            boolean z14 = list3 == null || list3.isEmpty();
            boolean z15 = !z14;
            List<o61.b> list4 = cVar.f179733b;
            boolean z16 = list4 == null || list4.isEmpty();
            boolean z17 = !z16;
            List<o61.b> list5 = cVar.f179732a;
            boolean z18 = list5 == null || list5.isEmpty();
            eVar3.a(z15);
            eVar2.a(z17);
            eVar.a(!z18);
            if (!z16 && bVarD == (bVar = xs0.b.POWER)) {
                eVar3.c(false);
                eVar2.c(true);
                eVar.c(false);
            } else if (!z18 && bVarD == (bVar = xs0.b.POWER_PER_KG)) {
                eVar3.c(false);
                eVar2.c(false);
                eVar.c(true);
            } else if (!z14 || bVarD == xs0.b.PACE) {
                eVar3.c(true);
                eVar2.c(false);
                eVar.c(false);
                bVar = xs0.b.PACE;
            } else {
                bVar = xs0.b.HEART_RATE;
            }
        }
        Context context = this.f206844a.getContext();
        context.getClass();
        at0.e eVar4 = this.f206853j;
        at0.d<vs0.c> dVar = eVar4.f12753b;
        String str = eVar4.f12754c;
        at0.d<vs0.c> dVar2 = eVar4.f12753b;
        if (cVar == null || (list = cVar.f179734c) == null || list.isEmpty()) {
            qz.a.b(dVar2, null, str, 4);
            qz.f fVar = dVar.f12749e;
            fVar.getClass();
            ((bt0.e) fVar).f21054c = null;
            return;
        }
        qz.c<vs0.c, ILineDataSet> cVar2 = dVar.f12746b;
        cVar2.getClass();
        bt0.c cVar3 = (bt0.c) cVar2;
        if (bVar != null) {
            cVar3.f21045c = bVar;
            bt0.f.a aVar = bt0.f.f21060g;
            xs0.a aVar2 = cVar3.f21044b;
            aVar.getClass();
            cVar3.f21047e = bt0.f.a.a(context, bVar, aVar2);
            bt0.b bVar2 = cVar3.f21043a;
            bVar2.f21038e = null;
            bVar2.f21039f = null;
            bVar2.f21040g = null;
            bVar2.f21041h = null;
            bVar2.f21037d = bVar;
        }
        g<f00.c> gVar = dVar.f12747c;
        gVar.getClass();
        i iVar = (i) gVar;
        if (bVar == null) {
            xs0.b bVar3 = xs0.b.HEART_RATE;
        }
        iVar.f21078f = new j(bVar, iVar.f21074b, iVar.f21073a.getAxisLeft(), iVar.f21076d);
        qz.f fVar2 = dVar.f12749e;
        fVar2.getClass();
        ((bt0.e) fVar2).f21054c = bVar;
        qz.a.b(dVar2, cVar, str, 4);
    }
}
