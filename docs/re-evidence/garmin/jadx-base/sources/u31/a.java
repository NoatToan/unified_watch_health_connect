package u31;

import a7.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.p2;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import e23.l;
import i41.f;
import java.util.ArrayList;
import k32.t;
import k32.u;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x0;
import pi0.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu31/a;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Lorg/joda/time/DateTime;", "", "onItemSelected", "<init>", "(Landroid/content/Context;Le23/l;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<DateTime, Unit> f168282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n41.a f168283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f168284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f168285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f168286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f168287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f168288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f168289j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, l<? super DateTime, Unit> lVar) {
        context.getClass();
        lVar.getClass();
        this.f168282c = lVar;
        this.f168283d = new n41.a(context);
        this.f168284e = new ArrayList();
        this.f168285f = new t(context);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f168284e.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        Integer num;
        if (f0Var instanceof u) {
            ArrayList arrayList = this.f168284e;
            arrayList.getClass();
            String calendarDate = ((f) new x0(arrayList).get(i14)).getCalendarDate();
            if (calendarDate == null) {
                calendarDate = LocalDate.now().toString();
                calendarDate.getClass();
            }
            DateTime dateTimeAtStartOfDay = new LocalDate(calendarDate).toDateTimeAtStartOfDay();
            f fVar = (f) new x0(arrayList).get(i14);
            dateTimeAtStartOfDay.getClass();
            n41.a aVar = this.f168283d;
            aVar.getClass();
            e eVar = aVar.f123603c;
            l22.a aVar2 = aVar.f123602b;
            String strA = eVar.a(dateTimeAtStartOfDay, qi0.a.WEEKDAY);
            String strA2 = n41.a.a(aVar, fVar.getWeeklyAvg());
            String strA3 = n41.a.a(aVar, fVar.getLastNightAvg());
            String strA4 = eVar.a(dateTimeAtStartOfDay, qi0.a.NO_YEAR_ABBREV_MONTH_DAY);
            u uVar = (u) f0Var;
            TextView textView = uVar.f102741e;
            TextView textView2 = uVar.f102740d;
            TextView textView3 = uVar.f102738b;
            TextView textView4 = uVar.f102737a;
            TextView textView5 = uVar.f102742f;
            ImageView imageView = uVar.f102743g;
            TextView textView6 = uVar.f102739c;
            String string = aVar2.getString(R.string.lbl_7d_avg);
            String string2 = aVar2.getString(R.string.overnight_avg);
            p2 p2VarA = t31.a.f162199a.a(fVar.getStatus());
            int iIntValue = (p2VarA == null || (num = p2VarA.f23192a) == null) ? -1 : num.intValue();
            if (!strA2.equals(uVar.itemView.getContext().getString(R.string.no_value_card))) {
                Drawable drawable = b.getDrawable(textView6.getContext(), iIntValue);
                int dimensionPixelSize = textView6.getResources().getDimensionPixelSize(R.dimen.spacing_small);
                if (drawable != null) {
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                }
                textView6.setCompoundDrawables(drawable, null, null, null);
            }
            textView4.setText(strA);
            textView3.setText(strA4);
            textView6.setText(strA2);
            if (textView2 != null) {
                textView2.setText(string);
            }
            textView.setText(strA3);
            if (textView5 != null) {
                textView5.setText(string2);
            }
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            uVar.itemView.setContentDescription(uVar.d());
            View view2 = uVar.itemView;
            view2.getClass();
            view2.setVisibility(0);
            String strA5 = aVar2.a(R.string.lbl_day_count_average, String.valueOf(7));
            String string3 = aVar2.getString(R.string.lbl_overnight_average);
            textView4.setContentDescription(null);
            textView3.setContentDescription(null);
            textView6.setContentDescription(null);
            if (textView2 != null) {
                textView2.setContentDescription(strA5);
            }
            textView.setContentDescription(null);
            if (textView5 != null) {
                textView5.setContentDescription(string3);
            }
            if (imageView != null) {
                imageView.setContentDescription(null);
            }
            uVar.itemView.setContentDescription(uVar.d());
            uVar.itemView.setOnClickListener(new u12.e(2, this, dateTimeAtStartOfDay));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewA = t.a(this.f168285f, viewGroup);
        View viewFindViewById = viewA.findViewById(R.id.text3);
        viewFindViewById.getClass();
        this.f168286g = (TextView) viewFindViewById;
        View viewFindViewById2 = viewA.findViewById(R.id.text4);
        viewFindViewById2.getClass();
        this.f168288i = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewA.findViewById(R.id.text5);
        viewFindViewById3.getClass();
        this.f168287h = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewA.findViewById(R.id.text6);
        viewFindViewById4.getClass();
        this.f168289j = (TextView) viewFindViewById4;
        TextView textView = this.f168286g;
        if (textView == null) {
            s.m("weeklyAverage");
            throw null;
        }
        textView.setCompoundDrawablePadding(12);
        TextView textView2 = this.f168287h;
        if (textView2 == null) {
            s.m("overnightAverage");
            throw null;
        }
        textView2.setGravity(8388613);
        TextView textView3 = this.f168289j;
        if (textView3 == null) {
            s.m("overnightAverageLabel");
            throw null;
        }
        textView3.setGravity(8388613);
        TextView textView4 = this.f168288i;
        if (textView4 == null) {
            s.m("weeklyAverageLabel");
            throw null;
        }
        textView4.setTextAppearance(R.style.Text_Caption_Secondary);
        TextView textView5 = this.f168289j;
        if (textView5 != null) {
            textView5.setTextAppearance(R.style.Text_Caption_Secondary);
            return new u(viewA);
        }
        s.m("overnightAverageLabel");
        throw null;
    }
}
