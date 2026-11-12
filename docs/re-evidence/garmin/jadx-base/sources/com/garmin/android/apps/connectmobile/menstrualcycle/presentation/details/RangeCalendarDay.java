package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s0;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.view.CircleView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hx0.o;
import j23.l;
import java.text.DateFormatSymbols;
import java.util.HashSet;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u00022%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u000b2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010\n\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010)\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "date", "", "setDate", "(Ljava/lang/Integer;)V", "durationColor", "setDuration", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$b;", "editState", "setSelectable", "(Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$b;)V", "Lorg/joda/time/LocalDate;", "setAnimation", "(Lorg/joda/time/LocalDate;)V", "", "checked", "setCheckedAnimationState", "(Z)V", "Ljava/util/HashSet;", "Lhx0/d;", "Lkotlin/collections/HashSet;", "activities", "setDots", "(Ljava/util/HashSet;)V", "Lhx0/s0;", "dayModel", "setWeekDay", "(Lhx0/s0;)V", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "value", JWKParameterNames.OCT_KEY_VALUE, "Lorg/joda/time/LocalDate;", "getDate", "()Lorg/joda/time/LocalDate;", "l", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$b;", "getEditState", "()Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$b;", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RangeCalendarDay extends ConstraintLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f38827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f38828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f38829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f38830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f38831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f38832r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f38833t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f38835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f38836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f38837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f38839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CircleView f38840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleView f38841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CircleView f38842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f38843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public LocalDate date;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public b editState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$b;", "", "<init>", "(Ljava/lang/String;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        PastPeriod,
        CurrentPeriod,
        FuturePeriodStart,
        FuturePeriod,
        Unchecked,
        Uneditable;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38853a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.PastPeriod.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.CurrentPeriod.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.FuturePeriodStart.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.FuturePeriod.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f38853a = iArr;
            }
        }

        public final boolean a() {
            int i14 = a.f38853a[ordinal()];
            return i14 == 1 || i14 == 2 || i14 == 3;
        }

        public final boolean b() {
            int i14 = a.f38853a[ordinal()];
            return i14 == 3 || i14 == 4;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38854a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.Period.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.Fertile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.Ovulation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38854a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$d", "Landroidx/core/view/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends androidx.core.view.a {
        public d() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            b editState = RangeCalendarDay.this.getEditState();
            fVar.m(editState != null ? editState.a() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$e", "Landroidx/core/view/a;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(false);
            fVar.b(l7.f.a.f110568g);
        }
    }

    static {
        new a(null);
        f38827m = R.color.mct_period_dark;
        f38828n = R.color.mct_period;
        f38829o = R.color.mct_fertility_dark;
        f38830p = R.color.mct_fertility;
        f38831q = R.color.mct_predicted_ovulation;
        f38832r = new l(0, 20);
        f38833t = new l(40, 53);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeCalendarDay(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.mContext = context;
        this.f38843j = new DateFormatSymbols().getMonths();
        LayoutInflater.from(context).inflate(R.layout.range_calendar_day, this);
        View viewFindViewById = findViewById(R.id.range_calendar_day_check);
        viewFindViewById.getClass();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.f38835b = lottieAnimationView;
        View viewFindViewById2 = findViewById(R.id.range_calendar_selected_frame);
        viewFindViewById2.getClass();
        this.f38836c = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.range_calendar_feature_image);
        viewFindViewById3.getClass();
        this.f38837d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.range_calendar_date_label);
        viewFindViewById4.getClass();
        this.f38838e = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.range_calendar_duration_line);
        viewFindViewById5.getClass();
        this.f38839f = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.range_calendar_ovulation_dot);
        viewFindViewById6.getClass();
        this.f38840g = (CircleView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.range_calendar_symptoms_dot);
        viewFindViewById7.getClass();
        this.f38841h = (CircleView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.range_calendar_notes_dot);
        viewFindViewById8.getClass();
        this.f38842i = (CircleView) viewFindViewById8;
        viewFindViewById2.setVisibility(8);
        lottieAnimationView.setAnimation(R.raw.icon_checkmark_calendar);
    }

    public static Integer j(LocalDate localDate, o oVar) {
        int i14 = c.f38854a[oVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return Integer.valueOf(localDate.compareTo((ReadablePartial) LocalDate.now()) > 0 ? f38829o : f38830p);
            }
            if (i14 != 3) {
                return null;
            }
            return Integer.valueOf(f38831q);
        }
        if (localDate.compareTo((ReadablePartial) LocalDate.now()) <= 0) {
            return Integer.valueOf(f38828n);
        }
        if (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.a.g(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.b.f39089a)) {
            return Integer.valueOf(f38827m);
        }
        return null;
    }

    private final void setAnimation(LocalDate date) {
        this.f38835b.setAnimation(date.compareTo((ReadablePartial) LocalDate.now()) <= 0 ? R.raw.icon_checkmark_calendar : R.raw.icon_checkmark_calendar_future);
    }

    private final void setCheckedAnimationState(boolean checked) {
        int i14 = (checked ? f38832r : f38833t).f96797b;
        LottieAnimationView lottieAnimationView = this.f38835b;
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(0, i14);
        lottieAnimationView.setFrame(0);
        lottieAnimationView.setFrame(i14);
    }

    private final void setDate(Integer date) {
        String strValueOf = date != null ? String.valueOf(date.intValue()) : null;
        TextView textView = this.f38838e;
        if (strValueOf != null) {
            textView.setText(String.valueOf(date.intValue()));
            setVisibility(0);
        } else {
            textView.setText("");
            setVisibility(4);
        }
    }

    private final void setDots(HashSet<hx0.d> activities) {
        this.f38840g.setVisibility(activities.contains(hx0.d.Ovulation) ? 0 : 8);
        this.f38841h.setVisibility(activities.contains(hx0.d.Symptoms) ? 0 : 8);
        this.f38842i.setVisibility(activities.contains(hx0.d.Notes) ? 0 : 8);
    }

    private final void setDuration(Integer durationColor) {
        View view2 = this.f38839f;
        if (durationColor == null) {
            view2.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view2.setBackgroundColor(a7.b.getColor(this.mContext, durationColor.intValue()));
        }
    }

    private final void setSelectable(b editState) {
        LottieAnimationView lottieAnimationView = this.f38835b;
        Animation animation = lottieAnimationView.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        if (editState == b.Uneditable) {
            v22.e.l(lottieAnimationView);
        } else {
            v22.e.q(lottieAnimationView);
            setCheckedAnimationState(editState.a());
        }
    }

    public final LocalDate getDate() {
        return this.date;
    }

    public final b getEditState() {
        return this.editState;
    }

    public final Context getMContext() {
        return this.mContext;
    }

    public final void i(LocalDate localDate) {
        setDate(localDate != null ? Integer.valueOf(localDate.getDayOfMonth()) : null);
        setDuration(null);
        setSelectable(b.Uneditable);
        setDots(new HashSet<>());
        v22.e.j(this.f38836c);
        this.editState = null;
    }

    public final void k(LocalDate localDate, b bVar) {
        localDate.getClass();
        bVar.getClass();
        this.date = localDate;
        this.editState = bVar;
        setDate(Integer.valueOf(localDate.getDayOfMonth()));
        boolean zB = bVar.b();
        int i14 = f38827m;
        if (zB) {
            setDuration(Integer.valueOf(i14));
        } else {
            setDuration(null);
        }
        setAnimation(localDate);
        setSelectable(bVar);
        setDots(new HashSet<>());
        this.f38837d.setVisibility(8);
        boolean zG = s.g(this.date, LocalDate.now());
        View view2 = this.f38836c;
        if (zG) {
            v22.e.q(view2);
        } else {
            v22.e.j(view2);
        }
        if (bVar.b()) {
            l(Integer.valueOf(i14), null);
        } else {
            l(null, null);
        }
    }

    public final void l(Integer num, HashSet<hx0.d> hashSet) {
        String string;
        String str = "";
        if (num != null && num.intValue() == f38827m) {
            string = getContext().getString(R.string.mct_predicted_period_day);
            string.getClass();
        } else if (num != null && num.intValue() == f38828n) {
            string = getContext().getString(R.string.mct_period_day);
            string.getClass();
        } else if (num != null && num.intValue() == f38829o) {
            string = getContext().getString(R.string.mct_predicted_fertile_day);
            string.getClass();
        } else if (num != null && num.intValue() == f38830p) {
            string = getContext().getString(R.string.mct_fertile_day);
            string.getClass();
        } else if (num != null && num.intValue() == f38831q) {
            string = getContext().getString(R.string.lbl_estimated_ovulation_day);
            string.getClass();
        } else {
            string = "";
        }
        if (hashSet != null) {
            if (hashSet.contains(hx0.d.Ovulation)) {
                string = ((Object) string) + ". " + getContext().getString(R.string.mct_ovulation_day_logged);
            }
            if (hashSet.contains(hx0.d.Symptoms)) {
                string = ((Object) string) + ". " + getContext().getString(R.string.mct_symptoms_logged);
            }
            if (hashSet.contains(hx0.d.Notes)) {
                string = ((Object) string) + ". " + getContext().getString(R.string.mct_notes_logged);
            }
        }
        if (v22.e.d(this.f38837d)) {
            string = ((Object) string) + ". " + getContext().getString(R.string.pregnancy_start_date_title);
        }
        if (v22.e.d(this.f38835b)) {
            s0.r(this, new d());
        } else {
            s0.r(this, new e());
        }
        LocalDate localDate = this.date;
        if (localDate != null) {
            str = this.f38843j[localDate.getMonthOfYear() - 1];
            str.getClass();
        }
        setContentDescription(((Object) str) + StringUtils.SPACE + ((Object) this.f38838e.getText()) + StringUtils.SPACE + ((Object) string));
    }

    public final void m(b bVar) {
        bVar.getClass();
        b bVar2 = this.editState;
        if (bVar2 == null || bVar == bVar2) {
            return;
        }
        b bVar3 = b.Uneditable;
        if (bVar2 == bVar3 || bVar == bVar3) {
            setSelectable(bVar);
        } else if (bVar.a() != bVar2.a()) {
            b bVar4 = this.editState;
            bVar4.getClass();
            boolean zA = bVar4.a();
            LottieAnimationView lottieAnimationView = this.f38835b;
            if (zA) {
                l lVar = f38833t;
                lottieAnimationView.setMinAndMaxFrame(lVar.f96796a, lVar.f96797b);
                lottieAnimationView.playAnimation();
            } else if (zA) {
                u0.r();
                return;
            } else {
                l lVar2 = f38832r;
                lottieAnimationView.setMinAndMaxFrame(lVar2.f96796a, lVar2.f96797b);
                lottieAnimationView.playAnimation();
            }
        }
        if (bVar.b()) {
            setDuration(Integer.valueOf(f38827m));
        } else {
            setDuration(null);
        }
        this.editState = bVar;
    }

    public final void setWeekDay(hx0.s0 dayModel) {
        dayModel.getClass();
        HashSet<hx0.d> hashSet = dayModel.f86166c;
        LocalDate localDate = dayModel.f86164a;
        this.date = localDate;
        this.editState = null;
        setDate(localDate != null ? Integer.valueOf(localDate.getDayOfMonth()) : null);
        this.f38837d.setVisibility((dayModel.f86168e && dayModel.f86169f == hx0.e.Pregnancy) ? 0 : 8);
        setDuration(j(localDate, dayModel.f86165b));
        setSelectable(b.Uneditable);
        setDots(hashSet);
        boolean zG = s.g(this.date, LocalDate.now());
        View view2 = this.f38836c;
        if (zG) {
            v22.e.q(view2);
        } else {
            v22.e.j(view2);
        }
        l(j(localDate, dayModel.f86165b), hashSet);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/RangeCalendarDay$a;", "", "<init>", "()V", "", "DURATION_COLOR_PERIOD_PREDICTION", "I", "DURATION_COLOR_PERIOD", "DURATION_COLOR_FERTILE_PREDICTION", "DURATION_COLOR_FERTILE", "DURATION_COLOR_OVULATION_PREDICTION", "Lj23/l;", "checkMarkChecked", "Lj23/l;", "checkMarkUnchecked", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeCalendarDay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeCalendarDay(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RangeCalendarDay(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
