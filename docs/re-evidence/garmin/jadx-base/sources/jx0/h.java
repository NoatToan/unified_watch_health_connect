package jx0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c22.h0;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hx0.u0;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\t\n\u000b\f\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Ljx0/h;", "Lmx0/a;", "Lww0/n;", "Landroid/content/Context;", "parentContext", "", "numberOfCycles", "<init>", "(Landroid/content/Context;I)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends mx0.a<ww0.n> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f101459f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f101461e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/h$b;", "Lmx0/a$a;", "Lww0/n;", "Landroid/view/View;", "view", "<init>", "(Ljx0/h;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends mx0.a.AbstractC2298a<ww0.n> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f101462f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f101463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f101464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f101465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ComposeView f101466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f101467e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f101467e = hVar;
            this.f101463a = (TextView) view2.findViewById(R.id.cycle_card_date_text);
            this.f101464b = (TextView) view2.findViewById(R.id.cycle_card_period_text);
            this.f101465c = (TextView) view2.findViewById(R.id.cycle_card_cycle_length);
            View viewFindViewById = view2.findViewById(R.id.cycle_card_pie_chart);
            viewFindViewById.getClass();
            this.f101466d = (ComposeView) viewFindViewById;
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(ww0.n nVar) {
            String string;
            String string2;
            ww0.n nVar2 = nVar;
            nVar2.getClass();
            j0.f23099a.getClass();
            SimpleDateFormat simpleDateFormatW = j0.w("MMM d, yyyy");
            LocalDate startDate = nVar2.getStartDate();
            this.f101463a.setText(startDate != null ? simpleDateFormatW.format(startDate.toDate()) : "");
            Integer periodLength = nVar2.getPeriodLength();
            int i14 = 0;
            h hVar = this.f101467e;
            if (periodLength != null && periodLength.intValue() == 1) {
                int i15 = h.f101459f;
                string = hVar.f121332a.getString(R.string.mct_period_length_day);
            } else {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                Integer periodLength2 = nVar2.getPeriodLength();
                String str = integerInstance.format(Integer.valueOf(periodLength2 != null ? periodLength2.intValue() : 0));
                int i16 = h.f101459f;
                string = hVar.f121332a.getString(R.string.mct_period_length_days, str);
            }
            this.f101464b.setText(string);
            Integer cycleLength = nVar2.getCycleLength();
            if (cycleLength != null && cycleLength.intValue() == 1) {
                string2 = hVar.f121332a.getString(R.string.mct_next_phase_day);
            } else {
                NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                Integer cycleLength2 = nVar2.getCycleLength();
                string2 = hVar.f121332a.getString(R.string.mct_next_phase_days, integerInstance2.format(Integer.valueOf(cycleLength2 != null ? cycleLength2.intValue() : 0)));
            }
            this.f101465c.setText(string2);
            dx0.a aVar = dx0.a.REPORT;
            boolean z14 = nVar2.getCycleLength() == null || s.g(nVar2.getGapCycle(), Boolean.TRUE);
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a;
            boolean zG = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(aVar2);
            boolean zC = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.c(aVar2);
            i52.a.f91796a.getClass();
            this.f101466d.setContent(new z3.e(-557435161, true, new i(new dx0.e(aVar, false, z14, true, zG, zC, i52.a.o()), nVar2, i14)));
            this.itemView.setOnClickListener(new hx0.k(23, startDate, hVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/h$c;", "Lmx0/a$a;", "Lww0/n;", "Landroid/view/View;", "view", "<init>", "(Ljx0/h;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends mx0.a.AbstractC2298a<ww0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f101468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f101469b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f101469b = hVar;
            this.f101468a = (TextView) view2.findViewById(R.id.cycle_item_no_cycles_text);
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(ww0.n nVar) {
            ww0.n nVar2 = nVar;
            nVar2.getClass();
            j0.f23099a.getClass();
            SimpleDateFormat simpleDateFormatW = j0.w("MMM d, yyyy");
            LocalDate startDate = nVar2.getStartDate();
            String str = startDate != null ? simpleDateFormatW.format(startDate.toDate()) : "";
            h0 h0VarG = nVar2.g();
            LocalDate localDate = h0VarG != null ? h0VarG.f23062b : null;
            String str2 = localDate != null ? simpleDateFormatW.format(localDate.toDate()) : "";
            int i14 = h.f101459f;
            this.f101468a.setText(this.f101469b.f121332a.getString(R.string.mct_no_cycles_logged_range, str, str2));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/h$d;", "Lmx0/a$a;", "Lww0/n;", "Landroid/view/View;", "view", "<init>", "(Ljx0/h;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends mx0.a.AbstractC2298a<ww0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f101470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f101471b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f101471b = hVar;
            this.f101470a = (TextView) view2.findViewById(R.id.cycle_item_no_cycles_text);
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(ww0.n nVar) {
            ww0.n nVar2 = nVar;
            nVar2.getClass();
            j0.f23099a.getClass();
            SimpleDateFormat simpleDateFormatW = j0.w("MMM d, yyyy");
            LocalDate startDate = nVar2.getStartDate();
            String str = startDate != null ? simpleDateFormatW.format(startDate.toDate()) : "";
            int i14 = h.f101459f;
            this.f101470a.setText(this.f101471b.f121332a.getString(R.string.mct_no_cycles_logged_before, str));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/h$e;", "Lmx0/a$a;", "Lww0/n;", "Landroid/view/View;", "view", "<init>", "(Ljx0/h;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends mx0.a.AbstractC2298a<ww0.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f101472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f101473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f101473b = hVar;
            this.f101472a = (TextView) view2.findViewById(R.id.cycle_item_no_cycles_text);
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(ww0.n nVar) {
            ww0.n nVar2 = nVar;
            nVar2.getClass();
            j0.f23099a.getClass();
            SimpleDateFormat simpleDateFormatW = j0.w("MMM d, yyyy");
            LocalDate startDate = nVar2.getStartDate();
            String str = startDate != null ? simpleDateFormatW.format(startDate.toDate()) : "";
            h0 h0VarG = nVar2.g();
            LocalDate localDate = h0VarG != null ? h0VarG.f23062b : null;
            String str2 = localDate != null ? simpleDateFormatW.format(localDate.toDate()) : "";
            int i14 = h.f101459f;
            this.f101472a.setText(this.f101473b.f121332a.getString(R.string.preganncy_logged_range, str, str2));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i14) {
        super(context);
        context.getClass();
        this.f101460d = i14;
    }

    @Override // mx0.a, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        if (this.f121334c.isEmpty()) {
            return 0;
        }
        int size = this.f121334c.size();
        List<? extends T> list = this.f121334c;
        return size < this.f101460d ? list.size() + 1 : list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        if (i14 >= this.f121334c.size()) {
            return 3;
        }
        ww0.n nVar = (ww0.n) this.f121334c.get(i14);
        if (s.g(nVar.getGapCycle(), Boolean.TRUE)) {
            return 2;
        }
        return nVar.getCycleType() == ww0.a.PREGNANT ? 4 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        mx0.a.AbstractC2298a abstractC2298a = (mx0.a.AbstractC2298a) f0Var;
        abstractC2298a.getClass();
        list.getClass();
        List<? extends T> list2 = this.f121334c;
        abstractC2298a.d(list2.get(Math.min(i14, list2.size() - 1)));
    }

    @Override // mx0.a
    public final mx0.a.AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        if (i14 == 1) {
            Context context = viewGroup.getContext();
            context.getClass();
            View viewInflate = layoutInflater.inflate(((double) c22.b.a(context)) >= 1.5d ? R.layout.view_cycle_list_item_font_scaled : R.layout.view_cycle_list_item, viewGroup, false);
            viewInflate.getClass();
            return new b(this, viewInflate);
        }
        if (i14 == 2) {
            View viewInflate2 = layoutInflater.inflate(R.layout.view_cycle_list_item_no_cycles, viewGroup, false);
            viewInflate2.getClass();
            return new c(this, viewInflate2);
        }
        if (i14 == 3) {
            View viewInflate3 = layoutInflater.inflate(R.layout.view_cycle_list_item_no_cycles, viewGroup, false);
            viewInflate3.getClass();
            return new d(this, viewInflate3);
        }
        if (i14 != 4) {
            vb.h.s("Invalid view in MCT report list adapter");
            return null;
        }
        View viewInflate4 = layoutInflater.inflate(R.layout.view_cycle_list_item_no_cycles, viewGroup, false);
        viewInflate4.getClass();
        return new e(this, viewInflate4);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ljx0/h$a;", "", "<init>", "()V", "", "CYCLE_CARD_VIEW_ID", "I", "CYCLE_GAP_VIEW_ID", "NO_CYCLES_BEFORE_VIEW_ID", "PREGNANCY_CARD_VIEW_ID", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
