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
import gg1.h0;
import i3.e5;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lgb1/f;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public db1.m f76662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f76663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.k f76664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k32.t f76665f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgb1/f$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lgb1/f;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f76666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f76667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f76668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f76669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f76670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f76671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f f76672g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, View view2) {
            super(view2);
            view2.getClass();
            this.f76672g = fVar;
            this.f76666a = (TextView) view2.findViewById(R.id.text1);
            this.f76667b = (TextView) view2.findViewById(R.id.text2);
            this.f76668c = (TextView) view2.findViewById(R.id.text3);
            this.f76669d = (TextView) view2.findViewById(R.id.text4);
            this.f76670e = (TextView) view2.findViewById(R.id.text5);
            this.f76671f = (TextView) view2.findViewById(R.id.text6);
            view2.setEnabled(i52.a.n());
            view2.setOnClickListener(this);
            AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
            layoutParams.setMargins((int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 15, (int) view2.getContext().getResources().getDimension(R.dimen.spacing_normal), 15);
            view2.setLayoutParams(layoutParams);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            f fVar = this.f76672g;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.k kVar = fVar.f76664e;
            if (kVar != null) {
                gb1.a aVar = (gb1.a) fVar.f76663d.get(getBindingAdapterPosition());
                getBindingAdapterPosition();
                aVar.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a aVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.f40794v;
                LocalDate localDate = new DateTime(aVar.f76645a).toLocalDate();
                localDate.getClass();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.a.a(localDate);
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j jVar = kVar.f40694a;
                PregnancyDetailsActivity.a aVar3 = PregnancyDetailsActivity.f40489x;
                Context contextRequireContext = jVar.requireContext();
                contextRequireContext.getClass();
                tb1.e.f163745a.getClass();
                boolean zH = tb1.e.a.h();
                DateTime dateTime = aVar.f76645a;
                db1.m mVar = jVar.f40685r;
                aVar3.getClass();
                jVar.startActivity(PregnancyDetailsActivity.a.a(contextRequireContext, false, zH, dateTime, false, mVar, false));
            }
        }
    }

    static {
        new b(null);
    }

    public f(Context context) {
        context.getClass();
        this.f76663d = new ArrayList();
        this.f76665f = new k32.t(context);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f76663d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String string;
        LocalDate pregnancyCycleStart;
        Double d14;
        String str;
        String str2;
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            gb1.a aVar2 = (gb1.a) this.f76663d.get(i14);
            TextView textView = aVar.f76667b;
            TextView textView2 = aVar.f76671f;
            aVar2.getClass();
            TextView textView3 = aVar.f76668c;
            textView3.getClass();
            textView3.setVisibility(8);
            TextView textView4 = aVar.f76669d;
            textView4.getClass();
            textView4.setVisibility(8);
            gb1.a aVar3 = new gb1.a(aVar2.f76645a, aVar2.f76646b, aVar2.f76647c);
            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
            TextView textView5 = aVar.f76670e;
            CharSequence text = textView5.getText();
            text.getClass();
            if (text.length() == 0 && (d14 = aVar3.f76646b) != null) {
                double dDoubleValue = d14.doubleValue();
                h0 h0VarI = i52.a.i();
                h0 h0Var = h0.MILLI_GRAMS_PER_DECILITER;
                if (h0VarI == h0Var) {
                    l3.f23124b.getClass();
                    str = ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + aVar.itemView.getContext().getString(R.string.pregnancy_mgdl);
                } else {
                    l3.f23124b.getClass();
                    str = ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + aVar.itemView.getContext().getString(R.string.pregnancy_mmol);
                }
                textView5.setText(str);
                if (i52.a.i() == h0Var) {
                    l3.f23124b.getClass();
                    str2 = ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + aVar.itemView.getContext().getString(R.string.lbl_mgdl_long);
                } else {
                    l3.f23124b.getClass();
                    str2 = ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + aVar.itemView.getContext().getString(R.string.lbl_mmol_l_long);
                }
                textView5.setContentDescription(str2);
            }
            Integer num = aVar3.f76647c;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue > 1) {
                    textView2.getClass();
                    textView2.setVisibility(0);
                    string = contextC.getString(R.string.pregnancy_multiple_readings, String.valueOf(iIntValue));
                    string.getClass();
                    textView2.setContentDescription(aVar.itemView.getContext().getString(R.string.lbl_average));
                } else {
                    string = contextC.getString(R.string.pregnancy_single_reading, String.valueOf(iIntValue));
                    string.getClass();
                    textView2.getClass();
                    textView2.setVisibility(8);
                }
            } else {
                string = "";
            }
            DateTime dateTime = aVar3.f76645a;
            if (dateTime != null) {
                f fVar = aVar.f76672g;
                aVar.f76666a.setText(new pi0.e(contextC).a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                db1.m mVar = fVar.f76662c;
                if (mVar == null || (pregnancyCycleStart = mVar.getPregnancyCycleStart()) == null) {
                    return;
                }
                int days = Days.daysBetween(pregnancyCycleStart.toDateTimeAtStartOfDay(), dateTime).getDays() / 7;
                int days2 = (Days.daysBetween(pregnancyCycleStart.toDateTimeAtStartOfDay(), dateTime).getDays() % 7) + 1;
                String string2 = contextC.getString(R.string.pregnancy_week_day_short, String.valueOf(days), String.valueOf(days2));
                string2.getClass();
                if (!string.equals("")) {
                    string2 = string2 + " • " + ((Object) string);
                }
                textView.setText(string2);
                Context context = aVar.itemView.getContext();
                context.getClass();
                String strB = new oi0.a(new l22.a(context)).b(days, days2);
                if (!string.equals("")) {
                    strB = e5.g(strB, " • ", string);
                }
                textView.setContentDescription(strB);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, k32.t.a(this.f76665f, viewGroup));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgb1/f$b;", "", "<init>", "()V", "", "TOTAL_NUMBER_OF_DAYS_IN_WEEK", "I", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
