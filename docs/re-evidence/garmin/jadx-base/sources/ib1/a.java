package ib1;

import am.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.d;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.s;
import com.garmin.android.apps.connectmobile.view.InfiniteViewPager;
import com.google.android.material.appbar.AppBarLayout;
import db1.k;
import db1.m;
import fb1.n0;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;
import r22.b0;
import tb1.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lib1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f92513a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f92514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f92515c;

    /* JADX INFO: renamed from: ib1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lib1/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "itemView", "<init>", "(Lib1/a;Landroid/view/View;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ViewOnClickListenerC1768a extends RecyclerView.f0 implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f92516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f92517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f92518c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnClickListenerC1768a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            this.f92518c = aVar;
            this.f92516a = (TextView) view2.findViewById(R.id.notes_day_title);
            this.f92517b = (TextView) view2.findViewById(R.id.notes_content);
            view2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            view2.getClass();
            a aVar = this.f92518c;
            s sVar = aVar.f92515c;
            if (sVar != null) {
                k kVar = (k) aVar.f92513a.get(getBindingAdapterPosition());
                kVar.getClass();
                LocalDate calendarDate = kVar.getCalendarDate();
                if (calendarDate != null) {
                    androidx.fragment.app.m activity = sVar.getActivity();
                    PregnancyDetailsActivity pregnancyDetailsActivity = activity instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity : null;
                    if (pregnancyDetailsActivity != null) {
                        pregnancyDetailsActivity.ra(0);
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a aVar2 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) pregnancyDetailsActivity.f40501w.getValue();
                        Object objA = aVar2.a(aVar2.f40534j.getCurrentItem());
                        if (objA instanceof d) {
                            d dVar = (d) objA;
                            DateTime dateTime = calendarDate.toDateTime(LocalTime.now());
                            InfiniteViewPager infiniteViewPagerW6 = dVar.w6();
                            b0 b0VarV6 = dVar.v6();
                            if (dateTime == null) {
                                dateTime = DateTime.now();
                            }
                            dateTime.getClass();
                            infiniteViewPagerW6.C(b0VarV6.c(dateTime), false);
                        } else if (objA instanceof jx0.d) {
                            ((jx0.d) objA).G6(calendarDate);
                        }
                        View viewFindViewById = pregnancyDetailsActivity.findViewById(R.id.app_bar_layout);
                        viewFindViewById.getClass();
                        ((AppBarLayout) viewFindViewById).setExpanded(true);
                    }
                    androidx.fragment.app.m activity2 = sVar.getActivity();
                    PregnancyDetailsActivity pregnancyDetailsActivity2 = activity2 instanceof PregnancyDetailsActivity ? (PregnancyDetailsActivity) activity2 : null;
                    if (pregnancyDetailsActivity2 != null) {
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a aVar3 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a) pregnancyDetailsActivity2.f40501w.getValue();
                        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.a.InterfaceC0763a interfaceC0763aA = aVar3.a(aVar3.f40534j.getCurrentItem());
                        if (interfaceC0763aA instanceof d) {
                            b0 b0VarV7 = ((d) interfaceC0763aA).v6();
                            Object obj = b0VarV7.f149914k.get(b0VarV7.f149911h);
                            q qVar = obj instanceof q ? (q) obj : null;
                            if (qVar != null) {
                                NestedScrollView nestedScrollView = qVar.f40796i;
                                if (nestedScrollView == null) {
                                    p005kotlin.jvm.internal.s.m("mScrollView");
                                    throw null;
                                }
                                nestedScrollView.post(new eh2.b(qVar, 5));
                                NestedScrollView nestedScrollView2 = qVar.f40796i;
                                if (nestedScrollView2 != null) {
                                    nestedScrollView2.getViewTreeObserver().addOnGlobalLayoutListener(new n0(qVar));
                                } else {
                                    p005kotlin.jvm.internal.s.m("mScrollView");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f92513a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        m mVar;
        int i15;
        String string;
        String strO;
        f0Var.getClass();
        if (i14 != -1 && (f0Var instanceof ViewOnClickListenerC1768a)) {
            ViewOnClickListenerC1768a viewOnClickListenerC1768a = (ViewOnClickListenerC1768a) f0Var;
            k kVar = (k) this.f92513a.get(i14);
            kVar.getClass();
            TextView textView = viewOnClickListenerC1768a.f92516a;
            textView.setText((CharSequence) null);
            viewOnClickListenerC1768a.f92517b.setText(kVar.getNote());
            LocalDate calendarDate = kVar.getCalendarDate();
            if (calendarDate == null || (mVar = viewOnClickListenerC1768a.f92518c.f92514b) == null) {
                return;
            }
            f.a aVar = f.f163746a;
            Context context = viewOnClickListenerC1768a.itemView.getContext();
            context.getClass();
            aVar.getClass();
            LocalDate pregnancyCycleStart = mVar.getPregnancyCycleStart();
            String str = " (";
            if (pregnancyCycleStart != null) {
                int days = Days.daysBetween(pregnancyCycleStart, calendarDate).getDays();
                String string2 = context.getString(R.string.pregnancy_week_abbreviation);
                String strD = p6.b.d(context, R.string.lbl_abbreviation_day, string2);
                int i16 = days / 7;
                int i17 = days % 7;
                j0 j0Var = j0.f23099a;
                i15 = 1;
                DateTime dateTime = new DateTime(calendarDate.toDate().getTime());
                j0Var.getClass();
                String strK = j0.k(dateTime, 'M');
                if (i16 == 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strK);
                    str = " (";
                    sb3.append(str);
                    sb3.append(i17 + 1);
                    sb3.append(strD);
                    sb3.append(")");
                    string = sb3.toString();
                } else {
                    str = " (";
                    string = strK + str + i16 + string2 + StringUtils.SPACE + (i17 + 1) + strD + ")";
                }
            } else {
                i15 = 1;
                f.f163747b.error("Pregnancy cycle start date should not be null");
                string = null;
            }
            textView.setText(string);
            Context context2 = viewOnClickListenerC1768a.itemView.getContext();
            context2.getClass();
            LocalDate pregnancyCycleStart2 = mVar.getPregnancyCycleStart();
            if (pregnancyCycleStart2 != null) {
                int days2 = Days.daysBetween(pregnancyCycleStart2, calendarDate).getDays();
                int i18 = days2 / 7;
                j0 j0Var2 = j0.f23099a;
                DateTime dateTime2 = new DateTime(calendarDate.toDate().getTime());
                j0Var2.getClass();
                String strK2 = j0.k(dateTime2, 'M');
                int i19 = (days2 % 7) + 1;
                String string3 = i19 == i15 ? context2.getString(R.string.mct_next_phase_day) : context2.getString(R.string.mct_next_phase_days, Integer.valueOf(i19));
                string3.getClass();
                if (i18 == 0) {
                    strO = com.nimbusds.jose.shaded.gson.internal.a.h(strK2, str, string3, ")");
                } else {
                    String string4 = i18 == 1 ? context2.getString(R.string.common_week_label) : context2.getString(R.string.lbl_plural_more_than_one_week, Integer.valueOf(i18));
                    string4.getClass();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strK2);
                    sb4.append(str);
                    sb4.append(string4);
                    sb4.append(StringUtils.SPACE);
                    strO = j.o(string3, ")", sb4);
                }
            } else {
                f.f163747b.error("Pregnancy cycle start date should not be null");
                strO = null;
            }
            textView.setContentDescription(strO);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new ViewOnClickListenerC1768a(this, n23.j.b(viewGroup, R.layout.pregnancy_notes_list_item, viewGroup, false));
    }
}
