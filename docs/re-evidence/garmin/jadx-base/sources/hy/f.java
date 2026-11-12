package hy;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import go1.g0;
import gs1.z;
import java.util.ArrayList;
import java.util.Collection;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhy/f;", "Le32/p;", "Lxx/b;", "Landroid/view/View;", "view", "Lorg/joda/time/DateTime;", "date", "Le32/l;", "Lhy/g;", "navigator", "<init>", "(Landroid/view/View;Lorg/joda/time/DateTime;Le32/l;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e32.p<xx.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gs1.t f86326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomLineChart f86327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f86328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k32.e<gy.a> f86329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f86330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tz.a<gs1.t> f86331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f86332g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(View view2, DateTime dateTime, e32.l<g> lVar) {
        TextView textView;
        view2.getClass();
        dateTime.getClass();
        lVar.getClass();
        Context context = view2.getContext();
        context.getClass();
        int i14 = 2;
        boolean z14 = context.getResources().getConfiguration().orientation == 2;
        View viewFindViewById = view2.findViewById(R.id.chart_view);
        viewFindViewById.getClass();
        CustomLineChart customLineChart = (CustomLineChart) viewFindViewById;
        this.f86327b = customLineChart;
        this.f86328c = (TextView) view2.findViewById(R.id.item_tag_text);
        k32.e<gy.a> eVar = new k32.e<>(view2.findViewById(R.id.chart_measurement_option), gy.a.MOVEMENT, false, 4, null);
        this.f86329d = eVar;
        yz.k kVar = new yz.k(DateFormat.is24HourFormat(context));
        gy.b bVar = new gy.b(context, kVar, z14 ? new bf0.d(context, kVar) : new bf0.a(context, kVar), z14);
        String string = context.getString(R.string.common_no_certain_data, context.getString(R.string.device_screen_heart_rate));
        string.getClass();
        this.f86330e = string;
        this.f86331f = new tz.a<>(customLineChart, bVar, new ay.a(customLineChart), z14 ? new bf0.e(customLineChart, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0) : new bf0.g(customLineChart, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0), z14 ? new bf0.f(customLineChart) : new bf0.h(customLineChart), null, 32, null);
        this.f86332g = z14 ? null : new i(view2, dateTime, lVar);
        if (z14 && (textView = (TextView) view2.findViewById(R.id.chart_title)) != null) {
            Context context2 = textView.getContext();
            context2.getClass();
            textView.setText(new pi0.e(context2).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY));
        }
        eVar.d(R.string.lbl_movement);
        g0 g0Var = new g0(this, 12);
        Button button = eVar.f102679d;
        if (button != null) {
            button.setOnClickListener(g0Var);
        }
    }

    @Override // e32.p
    public final void a() {
        qz.a.b(this.f86331f, null, this.f86330e, 4);
        i iVar = this.f86332g;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e32.p
    public final void c(xx.b bVar) {
        gs1.t tVar;
        z userDailySummary;
        gs1.l payload;
        Boolean isJetLagDay;
        Collection collectionI;
        gs1.t tVar2;
        xx.b bVar2 = bVar;
        boolean zB = b(bVar2);
        CustomLineChart customLineChart = this.f86327b;
        if (zB) {
            v22.e.l(customLineChart);
        } else {
            v22.e.q(customLineChart);
            gs1.t tVar3 = bVar2 != null ? bVar2.f192468c : null;
            this.f86326a = tVar3;
            qz.a.b(this.f86331f, tVar3, this.f86330e, 4);
        }
        gs1.t tVar4 = this.f86326a;
        boolean zBooleanValue = false;
        this.f86329d.a(tVar4 != null && tVar4.y() && (tVar2 = this.f86326a) != null && tVar2.z());
        i iVar = this.f86332g;
        if (iVar != null) {
            if (bVar2 == null || (collectionI = bVar2.f192470e.I(bVar2.f192469d, bVar2.f192466a.toDate())) == null) {
                collectionI = j0.f134944a;
            }
            s sVar = iVar.f86338c;
            if (collectionI == null) {
                collectionI = j0.f134944a;
            }
            sVar.getClass();
            collectionI.getClass();
            r rVar = sVar.f86360a;
            ArrayList arrayList = rVar.f86359f;
            arrayList.clear();
            if (!collectionI.isEmpty()) {
                arrayList.addAll(collectionI);
            }
            rVar.notifyDataSetChanged();
        }
        if (bVar2 != null && (tVar = bVar2.f192468c) != null && (userDailySummary = tVar.getUserDailySummary()) != null && (payload = userDailySummary.getPayload()) != null && (isJetLagDay = payload.getIsJetLagDay()) != null) {
            zBooleanValue = isJetLagDay.booleanValue();
        }
        TextView textView = this.f86328c;
        if (textView != null) {
            v22.e.v(textView, zBooleanValue);
        }
        if (textView != null) {
            textView.setText(R.string.lbl_jet_lag_advisor);
        }
    }

    public final void d(boolean z14) {
        k32.e<gy.a> eVar = this.f86329d;
        eVar.c(z14);
        tz.a<gs1.t> aVar = this.f86331f;
        aVar.f167285b.s(eVar.b() ? gy.a.MOVEMENT : null);
        qz.a.b(aVar, this.f86326a, this.f86330e, 4);
    }

    @Override // e32.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean b(xx.b bVar) {
        gs1.l payload;
        Integer totalSteps;
        gs1.t tVar = bVar != null ? bVar.f192468c : null;
        if (tVar != null && !tVar.z()) {
            z userDailySummary = tVar.getUserDailySummary();
            if (((userDailySummary == null || (payload = userDailySummary.getPayload()) == null || (totalSteps = payload.getTotalSteps()) == null) ? 0 : totalSteps.intValue()) > 0) {
                return true;
            }
        }
        return df0.a.a(tVar);
    }
}
