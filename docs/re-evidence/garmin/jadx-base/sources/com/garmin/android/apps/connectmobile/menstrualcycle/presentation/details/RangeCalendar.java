package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.h0;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import f12.l;
import h62.j;
import hx0.o;
import hx0.s0;
import hx0.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.m;
import o13.p;
import o13.t;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0019J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lhx0/t0;", "dataLoadListener", "", "setDataLoader", "(Lhx0/t0;)V", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$a;", "mode", "setMode", "(Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i$a;)V", "", "Lorg/joda/time/LocalDate;", "getPeriodDates", "()Ljava/util/Set;", "getUpdatedPeriodDates", "getViewDate", "()Lorg/joda/time/LocalDate;", "Lhx0/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDaySelectedListener", "(Lhx0/f;)V", "getSelectionRangeEnd", "getPregnancyStartDates", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i;", "b", "Lo13/l;", "getMCalendarAdapter", "()Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/i;", "mCalendarAdapter", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RangeCalendar extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f38819f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f38821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f38822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f38824e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendar$a", "Landroidx/recyclerview/widget/RecyclerView$u;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f38826b;

        public a(LinearLayoutManager linearLayoutManager) {
            this.f38826b = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, i14, i15);
            RangeCalendar rangeCalendar = RangeCalendar.this;
            if (rangeCalendar.f38823d || rangeCalendar.f38822c == null) {
                return;
            }
            LinearLayoutManager linearLayoutManager = this.f38826b;
            int childCount = linearLayoutManager.getChildCount();
            int itemCount = linearLayoutManager.getItemCount();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            rangeCalendar.getMCalendarAdapter().f38993k = iFindFirstVisibleItemPosition;
            if (childCount + iFindFirstVisibleItemPosition >= itemCount) {
                rangeCalendar.f38823d = true;
                t0 t0Var = rangeCalendar.f38822c;
                if (t0Var != null) {
                    t0Var.O();
                    return;
                }
                return;
            }
            if (iFindFirstVisibleItemPosition != 0 || i15 >= 0) {
                return;
            }
            rangeCalendar.f38823d = true;
            t0 t0Var2 = rangeCalendar.f38822c;
            if (t0Var2 != null) {
                t0Var2.s0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeCalendar(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.mContext = context;
        this.f38821b = m.b(new j(this, 19));
        LayoutInflater.from(context).inflate(R.layout.range_calendar, this);
        vx.i.f180642a.getClass();
        ArrayList arrayList = new ArrayList();
        l.f68084a.getClass();
        switch (vx.i.a.f180643a[l.a.a().e1().ordinal()]) {
            case 1:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                break;
            case 2:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                break;
            case 3:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                break;
            case 4:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                break;
            case 5:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                break;
            case 6:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                break;
            case 7:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                break;
            default:
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_sunday_initial), context.getString(R.string.lbl_day_of_week_sunday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_monday_initial), context.getString(R.string.lbl_day_of_week_monday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_tuesday_initial), context.getString(R.string.lbl_day_of_week_tuesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_wednesday_initial), context.getString(R.string.lbl_day_of_week_wednesday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_thursday_initial), context.getString(R.string.lbl_day_of_week_thursday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_friday_initial), context.getString(R.string.lbl_day_of_week_friday)));
                arrayList.add(new p(context.getString(R.string.lbl_day_of_week_saturday_initial), context.getString(R.string.lbl_day_of_week_saturday)));
                break;
        }
        TextView textView = (TextView) findViewById(R.id.range_calendar_day_label_0);
        TextView textView2 = (TextView) findViewById(R.id.range_calendar_day_label_1);
        TextView textView3 = (TextView) findViewById(R.id.range_calendar_day_label_2);
        TextView textView4 = (TextView) findViewById(R.id.range_calendar_day_label_3);
        TextView textView5 = (TextView) findViewById(R.id.range_calendar_day_label_4);
        TextView textView6 = (TextView) findViewById(R.id.range_calendar_day_label_5);
        TextView textView7 = (TextView) findViewById(R.id.range_calendar_day_label_6);
        View viewFindViewById = findViewById(R.id.range_calendar_week_list);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f38824e = recyclerView;
        if (arrayList.isEmpty() || arrayList.size() != 7) {
            textView.setText(context.getString(R.string.lbl_day_of_week_sunday_initial));
            textView.setContentDescription(context.getString(R.string.lbl_day_of_week_sunday));
            textView2.setText(context.getString(R.string.lbl_day_of_week_monday_initial));
            textView2.setContentDescription(context.getString(R.string.lbl_day_of_week_monday));
            textView3.setText(context.getString(R.string.lbl_day_of_week_tuesday_initial));
            textView3.setContentDescription(context.getString(R.string.lbl_day_of_week_tuesday));
            textView4.setText(context.getString(R.string.lbl_day_of_week_wednesday_initial));
            textView4.setContentDescription(context.getString(R.string.lbl_day_of_week_wednesday));
            textView5.setText(context.getString(R.string.lbl_day_of_week_thursday_initial));
            textView5.setContentDescription(context.getString(R.string.lbl_day_of_week_thursday));
            textView6.setText(context.getString(R.string.lbl_day_of_week_friday_initial));
            textView6.setContentDescription(context.getString(R.string.lbl_day_of_week_friday));
            textView7.setText(context.getString(R.string.lbl_day_of_week_saturday_initial));
            textView7.setContentDescription(context.getString(R.string.lbl_day_of_week_saturday));
        } else {
            textView.setText((CharSequence) ((p) arrayList.get(0)).f128594a);
            textView.setContentDescription((CharSequence) ((p) arrayList.get(0)).f128595b);
            textView2.setText((CharSequence) ((p) arrayList.get(1)).f128594a);
            textView2.setContentDescription((CharSequence) ((p) arrayList.get(1)).f128595b);
            textView3.setText((CharSequence) ((p) arrayList.get(2)).f128594a);
            textView3.setContentDescription((CharSequence) ((p) arrayList.get(2)).f128595b);
            textView4.setText((CharSequence) ((p) arrayList.get(3)).f128594a);
            textView4.setContentDescription((CharSequence) ((p) arrayList.get(3)).f128595b);
            textView5.setText((CharSequence) ((p) arrayList.get(4)).f128594a);
            textView5.setContentDescription((CharSequence) ((p) arrayList.get(4)).f128595b);
            textView6.setText((CharSequence) ((p) arrayList.get(5)).f128594a);
            textView6.setContentDescription((CharSequence) ((p) arrayList.get(5)).f128595b);
            textView7.setText((CharSequence) ((p) arrayList.get(6)).f128594a);
            textView7.setContentDescription((CharSequence) ((p) arrayList.get(6)).f128595b);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addOnScrollListener(new a(linearLayoutManager));
        recyclerView.setAdapter(getMCalendarAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i getMCalendarAdapter() {
        return (i) this.f38821b.getValue();
    }

    public static void i(RangeCalendar rangeCalendar, b.a aVar, LocalDate localDate) {
        int i14;
        int size;
        Object obj;
        int i15;
        i mCalendarAdapter = rangeCalendar.getMCalendarAdapter();
        ArrayList<i.b> arrayList = mCalendarAdapter.f38990h;
        HashMap<LocalDate, s0> map = mCalendarAdapter.f38992j;
        aVar.getClass();
        h0 h0Var = aVar.f38897b;
        Iterator<LocalDate> it = h0Var.iterator();
        while (true) {
            h0.a aVar2 = (h0.a) it;
            if (!aVar2.hasNext()) {
                break;
            } else {
                map.remove((LocalDate) aVar2.next());
            }
        }
        map.putAll(aVar.f38896a);
        LocalDate localDatePlusMonths = h0Var.f23061a;
        int i16 = 0;
        int size2 = 0;
        while (i16 < 21) {
            if (size2 == 0 && localDate != null && localDate.getMonthOfYear() == localDatePlusMonths.getMonthOfYear() && localDate.getYear() == localDatePlusMonths.getYear()) {
                size2 = arrayList.size();
            }
            HashSet<LocalDate> hashSet = mCalendarAdapter.f38988f;
            j0.f23099a.getClass();
            String str = j0.w("MMMM yyyy").format(localDatePlusMonths.toDate());
            LocalDate localDateWithMinimumValue = localDatePlusMonths.dayOfMonth().withMinimumValue();
            ArrayList arrayList2 = new ArrayList();
            boolean z14 = true;
            int i17 = 0;
            int size3 = 0;
            while (i17 < 7) {
                ArrayList arrayList3 = new ArrayList();
                int i18 = i16;
                int i19 = size2;
                int i24 = 0;
                int i25 = 7;
                boolean z15 = false;
                boolean z16 = false;
                while (i24 < i25) {
                    int dayOfWeek = localDateWithMinimumValue.getDayOfWeek();
                    vx.i.f180642a.getClass();
                    int iA = vx.i.a() + dayOfWeek;
                    int i26 = i25;
                    if (iA % 7 == i24) {
                        i15 = i24;
                        if (localDateWithMinimumValue.getMonthOfYear() == localDatePlusMonths.getMonthOfYear()) {
                            s0 s0Var = map.get(localDateWithMinimumValue);
                            if ((s0Var != null ? s0Var.f86165b : null) == o.Period) {
                                mCalendarAdapter.f38987e.add(localDateWithMinimumValue);
                                if (mCalendarAdapter.u() && !hashSet.contains(localDateWithMinimumValue)) {
                                    hashSet.add(localDateWithMinimumValue);
                                }
                            }
                            if (s.g(localDate, localDateWithMinimumValue)) {
                                z16 = true;
                            }
                            arrayList3.add(localDateWithMinimumValue);
                            s0 s0Var2 = map.get(localDateWithMinimumValue);
                            if (s0Var2 != null && s0Var2.f86170g && s0Var2.f86168e) {
                                mCalendarAdapter.f38989g.add(s0Var2.f86164a);
                            }
                            localDateWithMinimumValue = jg.b.G(localDateWithMinimumValue);
                            z15 = true;
                        }
                        i24 = i15 + 1;
                        i25 = i26;
                    } else {
                        i15 = i24;
                    }
                    arrayList3.add(null);
                    i24 = i15 + 1;
                    i25 = i26;
                }
                if (z15) {
                    if (mCalendarAdapter.f38991i) {
                        Collections.reverse(arrayList3);
                    }
                    if (z16) {
                        size3 = arrayList2.size();
                    }
                    str.getClass();
                    arrayList2.add(new i.b(str, arrayList3, z14));
                }
                i17++;
                i16 = i18;
                size2 = i19;
                z14 = false;
            }
            int i27 = i16;
            int i28 = size2;
            if (mCalendarAdapter.u()) {
                if (s.g(mCalendarAdapter.f38986d, LocalDate.now())) {
                    mCalendarAdapter.E(hashSet);
                } else {
                    Iterator it3 = p13.h0.M0(hashSet).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it3.next();
                        if (LocalDate.now().compareTo((ReadablePartial) next) <= 0) {
                            obj = next;
                            break;
                        }
                    }
                    LocalDate localDate2 = (LocalDate) obj;
                    if (localDate2 != null) {
                        mCalendarAdapter.f38986d = jg.b.G(i.B(localDate2, hashSet));
                    }
                }
                d0.C(hashSet, new ho0.g(mCalendarAdapter, 8));
            }
            if (arrayList.isEmpty()) {
                i14 = -1;
                break;
            }
            Iterator<i.b> it4 = arrayList.iterator();
            i14 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i14 = -1;
                    break;
                }
                int i29 = i14 + 1;
                i.b next2 = it4.next();
                boolean z17 = next2.f38999c;
                List<LocalDate> list = next2.f38998b;
                if (z17 && !list.isEmpty()) {
                    Iterator<LocalDate> it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (s.g(it5.next(), localDatePlusMonths)) {
                            break;
                        }
                    }
                }
                i14 = i29;
            }
            if (i14 >= 0) {
                Iterator it6 = arrayList2.iterator();
                it6.getClass();
                while (it6.hasNext()) {
                    Object next3 = it6.next();
                    next3.getClass();
                    arrayList.set(i14, (i.b) next3);
                    mCalendarAdapter.notifyItemChanged(i14);
                    i14++;
                }
            } else {
                if (arrayList.isEmpty()) {
                    size = arrayList.size();
                    break;
                }
                Iterator<i.b> it7 = arrayList.iterator();
                size = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        size = arrayList.size();
                        break;
                    }
                    int i30 = size + 1;
                    i.b next4 = it7.next();
                    boolean z18 = next4.f38999c;
                    List<LocalDate> list2 = next4.f38998b;
                    if (z18 && !list2.isEmpty()) {
                        for (LocalDate localDate3 : list2) {
                            if (localDate3 != null && localDate3.compareTo((ReadablePartial) localDatePlusMonths) > 0) {
                                break;
                            }
                        }
                    }
                    size = i30;
                }
                Iterator it8 = arrayList2.iterator();
                it8.getClass();
                while (it8.hasNext()) {
                    Object next5 = it8.next();
                    next5.getClass();
                    arrayList.add(size, (i.b) next5);
                    mCalendarAdapter.notifyItemInserted(size);
                    size++;
                }
            }
            size2 = i28 + size3;
            localDatePlusMonths = localDatePlusMonths.plusMonths(1);
            localDatePlusMonths.getClass();
            if (localDatePlusMonths.compareTo((ReadablePartial) h0Var.f23062b) > 0) {
                break;
            } else {
                i16 = i27 + 1;
            }
        }
        if (localDate != null && size2 > 0) {
            rangeCalendar.f38824e.scrollToPosition(size2);
        }
        rangeCalendar.f38823d = false;
        t0 t0Var = rangeCalendar.f38822c;
        if (t0Var != null) {
            t0Var.P1();
        }
    }

    public final Context getMContext() {
        return this.mContext;
    }

    public final Set<LocalDate> getPeriodDates() {
        return getMCalendarAdapter().f38987e;
    }

    public final Set<LocalDate> getPregnancyStartDates() {
        return getMCalendarAdapter().f38989g;
    }

    public final LocalDate getSelectionRangeEnd() {
        return getMCalendarAdapter().f38986d;
    }

    public final Set<LocalDate> getUpdatedPeriodDates() {
        return getMCalendarAdapter().f38988f;
    }

    public final LocalDate getViewDate() {
        Object next;
        i mCalendarAdapter = getMCalendarAdapter();
        i.b bVar = mCalendarAdapter.f38990h.get(mCalendarAdapter.f38993k);
        bVar.getClass();
        Iterator<T> it = bVar.f38998b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LocalDate) next) == null);
        LocalDate localDate = (LocalDate) next;
        if (localDate != null) {
            return localDate;
        }
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        return localDateNow;
    }

    public final void k() {
        i mCalendarAdapter = getMCalendarAdapter();
        mCalendarAdapter.f38990h.clear();
        mCalendarAdapter.f38992j.clear();
        mCalendarAdapter.f38987e.clear();
        mCalendarAdapter.f38988f.clear();
        mCalendarAdapter.f38989g.clear();
        mCalendarAdapter.notifyDataSetChanged();
    }

    public final boolean l() {
        return getMCalendarAdapter().u();
    }

    public final void setDataLoader(t0 dataLoadListener) {
        dataLoadListener.getClass();
        this.f38822c = dataLoadListener;
    }

    public final void setDaySelectedListener(hx0.f listener) {
        listener.getClass();
        getMCalendarAdapter().f38984b = listener;
    }

    public final void setMode(i.a mode) {
        mode.getClass();
        i mCalendarAdapter = getMCalendarAdapter();
        HashSet<LocalDate> hashSet = mCalendarAdapter.f38987e;
        HashSet<LocalDate> hashSet2 = mCalendarAdapter.f38988f;
        if (mCalendarAdapter.f38985c == mode) {
            return;
        }
        int i14 = i.d.f39005a[mode.ordinal()];
        if (i14 == 1) {
            mCalendarAdapter.E(hashSet);
            ArrayList arrayList = new ArrayList();
            for (LocalDate localDate : hashSet) {
                if (localDate.compareTo((ReadablePartial) mCalendarAdapter.f38986d) <= 0) {
                    arrayList.add(localDate);
                }
            }
            hashSet2.addAll(arrayList);
        } else {
            if (i14 != 2) {
                u0.r();
                return;
            }
            hashSet2.clear();
        }
        mCalendarAdapter.f38985c = mode;
        mCalendarAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeCalendar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeCalendar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RangeCalendar(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
