package gb1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lgb1/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public db1.m f76651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f76652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.g f76653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k32.t f76654f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgb1/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lgb1/d;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f76655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f76656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f76657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f76658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f76659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f76660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d f76661g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view2) {
            super(view2);
            view2.getClass();
            this.f76661g = dVar;
            this.f76655a = (TextView) view2.findViewById(R.id.text1);
            this.f76656b = (TextView) view2.findViewById(R.id.text2);
            this.f76657c = (TextView) view2.findViewById(R.id.text3);
            this.f76658d = (TextView) view2.findViewById(R.id.text4);
            this.f76659e = (TextView) view2.findViewById(R.id.text5);
            this.f76660f = (TextView) view2.findViewById(R.id.text6);
            view2.setEnabled(i52.a.k());
            view2.setOnClickListener(this);
            AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
            layoutParams.setMargins((int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 15, (int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 15);
            view2.setLayoutParams(layoutParams);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            d dVar = this.f76661g;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.g gVar = dVar.f76653e;
            if (gVar != null) {
                gb1.b bVar = (gb1.b) dVar.f76652d.get(getBindingAdapterPosition());
                getBindingAdapterPosition();
                bVar.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                LocalDate localDate = new DateTime(bVar.f76648a).toLocalDate();
                localDate.getClass();
                aVar.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a.a(localDate);
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f fVar = gVar.f40632a;
                PregnancyDetailsActivity.a aVar2 = PregnancyDetailsActivity.f40489x;
                Context contextRequireContext = fVar.requireContext();
                contextRequireContext.getClass();
                tb1.e.f163745a.getClass();
                boolean zH = tb1.e.a.h();
                DateTime dateTime = bVar.f76648a;
                db1.m mVar = fVar.f40620p;
                aVar2.getClass();
                fVar.startActivity(PregnancyDetailsActivity.a.a(contextRequireContext, false, zH, dateTime, false, mVar, false));
            }
        }
    }

    static {
        new b(null);
    }

    public d(Context context) {
        context.getClass();
        this.f76652d = new ArrayList();
        this.f76654f = new k32.t(context);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f76652d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        LocalDate pregnancyCycleStart;
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            gb1.b bVar = (gb1.b) this.f76652d.get(i14);
            TextView textView = aVar.f76660f;
            TextView textView2 = aVar.f76659e;
            TextView textView3 = aVar.f76658d;
            TextView textView4 = aVar.f76656b;
            bVar.getClass();
            gb1.b bVar2 = new gb1.b(bVar.f76648a, bVar.f76649b, bVar.f76650c);
            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
            DateTime dateTime = bVar2.f76648a;
            if (dateTime != null) {
                d dVar = aVar.f76661g;
                aVar.f76655a.setText(new pi0.e(contextC).a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                db1.m mVar = dVar.f76651c;
                if (mVar != null && (pregnancyCycleStart = mVar.getPregnancyCycleStart()) != null) {
                    int days = Days.daysBetween(pregnancyCycleStart.toDateTimeAtStartOfDay(), dateTime).getDays() / 7;
                    int days2 = (Days.daysBetween(pregnancyCycleStart.toDateTimeAtStartOfDay(), dateTime).getDays() % 7) + 1;
                    String string = contextC.getString(R.string.pregnancy_week_day_short, String.valueOf(days), String.valueOf(days2));
                    string.getClass();
                    textView4.setText(string);
                    Context context = aVar.itemView.getContext();
                    context.getClass();
                    textView4.setContentDescription(new oi0.a(new l22.a(context)).b(days, days2));
                }
            }
            Integer num = bVar2.f76649b;
            if (num != null) {
                aVar.f76657c.setText(String.valueOf(num.intValue()));
                textView3.setText(contextC.getString(R.string.pregnancy_avg_moves));
                textView3.setContentDescription(aVar.itemView.getContext().getString(R.string.lbl_average_moves));
            }
            Integer num2 = bVar2.f76650c;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                l3.a aVar2 = l3.f23124b;
                String string2 = contextC.getString(R.string.no_value_card);
                string2.getClass();
                aVar2.getClass();
                textView2.setText(l3.a.v1(contextC, iIntValue, string2));
                textView.setText(contextC.getString(R.string.pregnancy_avg_duration));
                String strC = new oi0.h(contextC).c(iIntValue, false);
                if (strC.length() == 0) {
                    strC = contextC.getString(R.string.txt_empty_page_no_data);
                    strC.getClass();
                }
                textView2.setContentDescription(strC);
                textView.setContentDescription(aVar.itemView.getContext().getString(R.string.lbl_average_duration));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, k32.t.a(this.f76654f, viewGroup));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgb1/d$b;", "", "<init>", "()V", "", "TOTAL_NUMBER_OF_DAYS_IN_WEEK", "I", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
