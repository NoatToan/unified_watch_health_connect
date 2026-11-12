package fb1;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.PregnancyBloodGlucoseActivity;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lfb1/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70265a = "•";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f70266b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.c f70267c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfb1/m$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lfb1/m;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f70268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f70269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f70270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f70271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f70272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m f70273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, View view2) {
            super(view2);
            view2.getClass();
            this.f70273f = mVar;
            this.f70268a = (TextView) view2.findViewById(R.id.left_text_view);
            this.f70269b = (TextView) view2.findViewById(R.id.right_text_view);
            view2.setEnabled(i52.a.n());
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            m mVar = this.f70273f;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.c cVar = mVar.f70267c;
            if (cVar != null) {
                db1.r rVar = (db1.r) mVar.f70266b.get(getBindingAdapterPosition());
                getBindingAdapterPosition();
                rVar.getClass();
                PregnancyBloodGlucoseActivity.a aVar = PregnancyBloodGlucoseActivity.f40449c;
                LocalDate localDate = cVar.f40774a;
                Context context = cVar.f40775b;
                ArrayList<String> arrayList = cVar.f40776c;
                aVar.getClass();
                cVar.f40777d.startActivityForResult(PregnancyBloodGlucoseActivity.a.a(localDate, context, rVar, arrayList), 26);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f70266b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String str;
        String strD1;
        Double value;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof a)) {
            a aVar = (a) f0Var;
            db1.r rVar = (db1.r) this.f70266b.get(i14);
            rVar.getClass();
            db1.r rVarB = db1.r.b(rVar);
            TextView textView = aVar.f70268a;
            CharSequence text = textView.getText();
            text.getClass();
            if (text.length() == 0 && (value = rVarB.getValue()) != null) {
                double dDoubleValue = value.doubleValue();
                tb1.e.a aVar2 = tb1.e.f163745a;
                Double dValueOf = Double.valueOf(dDoubleValue);
                Context context = aVar.itemView.getContext();
                context.getClass();
                aVar2.getClass();
                textView.setText(tb1.e.a.b(context, dValueOf));
                Double dValueOf2 = Double.valueOf(dDoubleValue);
                Context context2 = aVar.itemView.getContext();
                context2.getClass();
                textView.setContentDescription(tb1.e.a.a(context2, dValueOf2));
            }
            db1.d logType = rVarB.getLogType();
            if (logType != null) {
                aVar.f70270c = aVar.itemView.getContext().getString(logType.f59000a);
            }
            DateTime userMeasurementTimestamp = rVarB.getUserMeasurementTimestamp();
            if (userMeasurementTimestamp != null) {
                DateTime dateTime = new DateTime(userMeasurementTimestamp.getMillis());
                if (DateFormat.is24HourFormat(aVar.itemView.getContext())) {
                    l3.a aVar3 = l3.f23124b;
                    int minuteOfHour = dateTime.getMinuteOfHour() + (dateTime.getHourOfDay() * 60);
                    aVar3.getClass();
                    strD1 = l3.a.d1(minuteOfHour);
                } else {
                    strD1 = c22.j0.u(dateTime.getMinuteOfHour() + (dateTime.getHourOfDay() * 60));
                }
                aVar.f70271d = strD1;
            }
            String str2 = aVar.f70270c;
            if (str2 == null || (str = aVar.f70271d) == null) {
                String str3 = aVar.f70271d;
                if (str3 == null && str2 != null) {
                    aVar.f70272e = str2;
                } else if (str3 != null && str2 == null) {
                    aVar.f70272e = str3;
                }
            } else {
                aVar.f70272e = j20.x.d(str, StringUtils.SPACE, aVar.f70273f.f70265a, StringUtils.SPACE, str2);
            }
            String str4 = aVar.f70272e;
            if (str4 != null) {
                aVar.f70269b.setText(str4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.blood_glucose_list_item, viewGroup, false));
    }
}
