package wu1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bv1.m;
import bv1.p;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lwu1/f;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "d", JWKParameterNames.RSA_EXPONENT, "c", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends f1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f187294j = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f187295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f187296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f187297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f187298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f187299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f187300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f187301i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwu1/f$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwu1/f$c;", "Lwu1/f$e;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f187302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f187303g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            this.f187302f = view2;
            this.f187303g = (TextView) view2.findViewById(R.id.header_item_text_view);
        }

        @Override // wu1.f.e
        public final void d(tw1.a aVar, int i14) {
            Context context = this.f187302f.getContext();
            super.d(aVar, i14);
            TextView textView = this.f187303g;
            if (i14 == 0) {
                textView.setText(context.getText(R.string.completed_phases));
            } else {
                textView.getClass();
                textView.setVisibility(8);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwu1/f$d;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f187304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f187305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f187306d;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(LayoutInflater layoutInflater) {
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.fbt_phase_current, (ViewGroup) null);
            viewInflate.getClass();
            super(viewInflate);
            this.f187304b = (TextView) this.f21420a.findViewById(R.id.phase_name_view);
            this.f187305c = (TextView) this.f21420a.findViewById(R.id.phase_date_range_view);
            this.f187306d = (TextView) this.f21420a.findViewById(R.id.phase_description_view);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwu1/f$e;", "Lwu1/f$a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f187307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f187308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f187309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f187310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f187311e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view2) {
            super(view2);
            view2.getClass();
            this.f187307a = view2;
            this.f187308b = (TextView) view2.findViewById(R.id.phase_name_view);
            this.f187309c = (TextView) view2.findViewById(R.id.phase_description_view);
            this.f187310d = (TextView) view2.findViewById(R.id.phase_date_range_view);
            this.f187311e = (TextView) view2.findViewById(R.id.header_item_text_view);
        }

        public void d(tw1.a aVar, int i14) {
            View view2 = this.f187307a;
            Context context = view2.getContext();
            TextView textView = this.f187311e;
            if (i14 == 0) {
                textView.setText(context.getText(R.string.upcoming_phases));
            } else {
                textView.getClass();
                textView.setVisibility(8);
            }
            hv1.g.a aVar2 = hv1.g.f85858c;
            String trainingPhase = aVar.getTrainingPhase();
            aVar2.getClass();
            hv1.g gVarA = hv1.g.a.a(trainingPhase);
            if (gVarA != null) {
                b bVar = f.f187294j;
                TextView textView2 = this.f187308b;
                textView2.getClass();
                TextView textView3 = this.f187309c;
                textView3.getClass();
                b.a(bVar, view2, gVarA, textView2, textView3);
            } else {
                view2.setVisibility(8);
            }
            aVar.g();
            aVar.d();
            b bVar2 = f.f187294j;
            LocalDate localDateG = aVar.g();
            LocalDate localDateD = aVar.d();
            bVar2.getClass();
            fy1.i.a aVar3 = fy1.i.f73924a;
            Context context2 = view2.getContext();
            context2.getClass();
            DateTime dateTimeAtStartOfDay = localDateG.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            DateTime dateTimeAtStartOfDay2 = localDateD.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay2.getClass();
            aVar3.getClass();
            this.f187310d.setText(fy1.i.a.j(context2, dateTimeAtStartOfDay, dateTimeAtStartOfDay2));
        }
    }

    public f(Activity activity) {
        activity.getClass();
        this.f187295c = activity;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
        this.f187296d = layoutInflaterFrom;
        this.f187297e = new ArrayList();
        this.f187298f = new ArrayList();
        layoutInflaterFrom.getClass();
        p pVar = new p(layoutInflaterFrom);
        this.f187299g = pVar;
        d dVar = new d(layoutInflaterFrom);
        this.f187300h = dVar;
        this.f187301i = this.f187298f.size() + this.f187297e.size();
        pVar.a();
        t(pVar.f21420a);
        dVar.a();
        t(dVar.f21420a);
    }

    public final void A(av1.e eVar) {
        if (eVar != null) {
            p pVar = this.f187299g;
            pVar.f21420a.setVisibility(0);
            xu1.a aVar = eVar.f13264a;
            if (aVar != null) {
                pVar.c(aVar);
            } else {
                pVar.a();
            }
            d dVar = this.f187300h;
            dVar.f21420a.setVisibility(0);
            tw1.a aVar2 = eVar.f13265b;
            if (aVar2 != null) {
                View view2 = dVar.f21420a;
                hv1.g.a aVar3 = hv1.g.f85858c;
                String trainingPhase = aVar2.getTrainingPhase();
                aVar3.getClass();
                hv1.g gVarA = hv1.g.a.a(trainingPhase);
                b bVar = f187294j;
                if (gVarA != null) {
                    TextView textView = dVar.f187304b;
                    textView.getClass();
                    TextView textView2 = dVar.f187306d;
                    textView2.getClass();
                    b.a(bVar, view2, gVarA, textView, textView2);
                } else {
                    view2.setVisibility(8);
                }
                aVar2.g();
                aVar2.d();
                TextView textView3 = dVar.f187305c;
                LocalDate localDateG = aVar2.g();
                LocalDate localDateD = aVar2.d();
                bVar.getClass();
                fy1.i.a aVar4 = fy1.i.f73924a;
                Context context = view2.getContext();
                context.getClass();
                DateTime dateTimeAtStartOfDay = localDateG.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                DateTime dateTimeAtStartOfDay2 = localDateD.toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                aVar4.getClass();
                textView3.setText(fy1.i.a.j(context, dateTimeAtStartOfDay, dateTimeAtStartOfDay2));
            } else {
                dVar.a();
            }
            List<tw1.a> list = eVar.f13266c;
            this.f187297e = list != null ? new ArrayList(list) : new ArrayList();
            List<tw1.a> list2 = eVar.f13267d;
            this.f187298f = list2 != null ? new ArrayList(list2) : new ArrayList();
            this.f187301i = this.f187298f.size() + this.f187297e.size();
        }
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        int itemViewType = super.getItemViewType(i14);
        if (itemViewType == 1) {
            int size = i14 - this.f34942a.size();
            if (size < this.f187297e.size()) {
                return 99;
            }
            if (size >= this.f187297e.size() && size < this.f187301i) {
                return 98;
            }
        }
        return itemViewType;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getF187301i() {
        return this.f187301i;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 < this.f187297e.size() && (f0Var instanceof e)) {
            tw1.a aVar = (tw1.a) this.f187297e.get(i14);
            aVar.g();
            ((e) f0Var).d(aVar, i14);
        } else {
            if (i14 < this.f187297e.size() || i14 >= this.f187301i || !(f0Var instanceof c)) {
                return;
            }
            int size = this.f187298f.size() - (this.f187301i - i14);
            tw1.a aVar2 = (tw1.a) this.f187298f.get(size);
            aVar2.g();
            ((c) f0Var).d(aVar2, size);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.f187296d;
        View viewInflate = layoutInflater.inflate(R.layout.fbt_phases_list, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.phase_card_container);
        View viewInflate2 = layoutInflater.inflate(R.layout.fbt_phase_common_card, (ViewGroup) frameLayout, false);
        Activity activity = this.f187295c;
        if (i14 == 99) {
            frameLayout.setBackgroundColor(activity.getColor(R.color.gcm_background_hero));
            frameLayout.addView(viewInflate2);
            return new e(viewInflate);
        }
        frameLayout.setBackgroundColor(activity.getColor(R.color.gcm_background));
        frameLayout.addView(viewInflate2);
        return new c(viewInflate);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lwu1/f$b;", "", "<init>", "()V", "", "UPCOMING_PHASES", "I", "COMPLETED_PHASES", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final void a(b bVar, View view2, hv1.g gVar, TextView textView, TextView textView2) {
            bVar.getClass();
            textView.setText(view2.getContext().getString(gVar.f85861a));
            textView2.setText(view2.getContext().getString(gVar.f85862b));
        }

        private b() {
        }
    }
}
