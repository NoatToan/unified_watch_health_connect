package fb1;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.BabyMovementActivity;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lfb1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70201a = "•";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f70202b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.p f70203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f70204d;

    /* JADX INFO: renamed from: fb1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfb1/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lfb1/a;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ViewOnClickListenerC1440a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f70205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f70206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f70207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnClickListenerC1440a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f70207c = aVar;
            this.f70205a = (TextView) view2.findViewById(R.id.left_text_view);
            this.f70206b = (TextView) view2.findViewById(R.id.right_text_view);
            view2.setEnabled(i52.a.k());
            aVar.f70204d = DateFormat.is24HourFormat(view2.getContext());
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            a aVar = this.f70207c;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.p pVar = aVar.f70203c;
            if (pVar != null) {
                db1.a aVar2 = (db1.a) aVar.f70202b.get(getBindingAdapterPosition());
                getBindingAdapterPosition();
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = pVar.f40789a;
                BabyMovementActivity.a aVar3 = BabyMovementActivity.f40448c;
                LocalDate localDate = pVar.f40790b;
                Context context = pVar.f40791c;
                ww0.b bVar = pVar.f40792d;
                int iIndexOf = pVar.f40793e.indexOf(aVar2);
                aVar3.getClass();
                oVar.startActivityForResult(BabyMovementActivity.a.a(localDate, context, bVar, iIndexOf), 25);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f70202b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String strD1;
        String strU1;
        String str;
        T tB;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof ViewOnClickListenerC1440a)) {
            ViewOnClickListenerC1440a viewOnClickListenerC1440a = (ViewOnClickListenerC1440a) f0Var;
            db1.a aVar = (db1.a) this.f70202b.get(i14);
            TextView textView = viewOnClickListenerC1440a.f70206b;
            a aVar2 = viewOnClickListenerC1440a.f70207c;
            aVar.getClass();
            Integer count = aVar.getCount();
            int iIntValue = count != null ? count.intValue() : 0;
            db1.g movementType = aVar.getMovementType();
            if (movementType == null) {
                movementType = db1.g.OTHER;
            }
            Context context = viewOnClickListenerC1440a.itemView.getContext();
            context.getClass();
            viewOnClickListenerC1440a.f70205a.setText(org.apache.commons.lang3.e.d(iIntValue, StringUtils.SPACE, movementType.a(context)));
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            DateTime startTimestamp = aVar.getStartTimestamp();
            String str2 = null;
            if (startTimestamp != null) {
                int hourOfDay = startTimestamp.getHourOfDay();
                int minuteOfHour = startTimestamp.getMinuteOfHour();
                if (aVar2.f70204d) {
                    l3.f23124b.getClass();
                    strD1 = l3.a.d1((hourOfDay * 60) + minuteOfHour);
                    if (strD1 == null) {
                        strD1 = "";
                    }
                } else {
                    strD1 = c22.j0.u((hourOfDay * 60) + minuteOfHour);
                }
            } else {
                strD1 = null;
            }
            Integer duration = aVar.getDuration();
            if (duration != null) {
                int iIntValue2 = duration.intValue();
                l3.a aVar3 = l3.f23124b;
                Context context2 = viewOnClickListenerC1440a.itemView.getContext();
                context2.getClass();
                String string = viewOnClickListenerC1440a.itemView.getContext().getString(R.string.no_value);
                string.getClass();
                aVar3.getClass();
                strU1 = l3.a.u1(context2, iIntValue2, string);
                Context context3 = viewOnClickListenerC1440a.itemView.getContext();
                context3.getClass();
                String strC = new oi0.h(context3).c(iIntValue2, false);
                if (strC.length() == 0) {
                    tB = strC;
                    tB = u62.z.b(R.string.txt_empty_page_no_data, viewOnClickListenerC1440a.itemView);
                }
                tB = strC;
                r0Var.f105810a = tB;
            } else {
                strU1 = null;
            }
            if (strD1 != null && strU1 != null) {
                str2 = ((Object) strD1) + StringUtils.SPACE + aVar2.f70201a + StringUtils.SPACE + ((Object) strU1);
                str = ((Object) strD1) + StringUtils.SPACE + aVar2.f70201a + StringUtils.SPACE + r0Var.f105810a;
            } else if (strD1 == null && strU1 != null) {
                str = (String) r0Var.f105810a;
                str2 = strU1;
            } else if (strD1 == null || strU1 != null) {
                str = null;
            } else {
                str = strD1;
                str2 = str;
            }
            if (str2 != null) {
                textView.setText(str2);
                if (str != null) {
                    textView.setContentDescription(str);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new ViewOnClickListenerC1440a(this, n23.j.b(viewGroup, R.layout.baby_movment_list_item, viewGroup, false));
    }
}
