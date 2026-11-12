package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.b1;
import c22.l3;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import f2.o0;
import fb1.h0;
import i3.e5;
import java.util.Locale;
import org.joda.time.LocalDate;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import ww0.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/n;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/q$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends Fragment implements q.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f40726p = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f40728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f40729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f40730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f40732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f40733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f40734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f40735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f40736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f40737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardView f40738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f40739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ww0.c f40740n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40727a = o13.m.a(o13.n.NONE, new d(this, null, new c(this), null, null));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o13.t f40741o = o13.m.b(new e40.d(this, 27));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f40742a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f40742a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40742a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40742a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40743a;

        public c(Fragment fragment) {
            this.f40743a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f40743a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<hx0.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f40748e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f40744a = fragment;
            this.f40745b = qualifier;
            this.f40746c = aVar;
            this.f40747d = aVar2;
            this.f40748e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, hx0.s] */
        @Override // e23.a
        public final hx0.s invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f40746c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f40744a;
            e23.a aVar = this.f40747d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hx0.s.class), viewModelStore, null, defaultViewModelCreationExtras, this.f40745b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f40748e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q.b
    public final void M4(ww0.c cVar) {
        this.f40740n = cVar;
        u6();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 201) {
            ((hx0.s) this.f40727a.getValue()).D4((LocalDate) this.f40741o.getValue(), this.f40740n);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_details_insights, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LocalDate localDate = (LocalDate) this.f40741o.getValue();
        if (localDate != null) {
            dh.b.L(((hx0.s) this.f40727a.getValue()).A4(localDate), this, new b(new o0(this, 13)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ww0.c cVar;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_PREGNANCY_DETAILS", ww0.c.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_PREGNANCY_DETAILS");
                if (!(parcelable2 instanceof ww0.c)) {
                    parcelable2 = null;
                }
                parcelable = (ww0.c) parcelable2;
            }
            cVar = (ww0.c) parcelable;
        } else {
            cVar = null;
        }
        this.f40740n = cVar;
        View viewFindViewById = view2.findViewById(R.id.pregnancy_insights_image_view);
        viewFindViewById.getClass();
        this.f40728b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.pregnancy_insights_title);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view2.findViewById(R.id.pregnancy_insights_sub_title);
        viewFindViewById3.getClass();
        this.f40729c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.pregnancy_insights_description);
        viewFindViewById4.getClass();
        this.f40730d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.pregnancy_insights_learn_more);
        viewFindViewById5.getClass();
        this.f40731e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.pregnancy_insights_label_view);
        viewFindViewById6.getClass();
        this.f40732f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.pregnancy_insights_weight_gain_goal_layout);
        viewFindViewById7.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById7;
        this.f40737k = linearLayout;
        View viewL = oi0.c.L(linearLayout, R.layout.weight_gain_goal_layout, R.layout.weight_gain_goal_layout_font_scaled);
        LinearLayout linearLayout2 = this.f40737k;
        if (linearLayout2 == null) {
            p005kotlin.jvm.internal.s.m("mWeightGainGoalLayout");
            throw null;
        }
        linearLayout2.addView(viewL);
        View viewFindViewById8 = viewL.findViewById(R.id.pregnancy_insights_weight_gain_goal);
        viewFindViewById8.getClass();
        this.f40738l = (CardView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.pregnancy_insights_calendar_layout);
        viewFindViewById9.getClass();
        LinearLayout linearLayout3 = (LinearLayout) viewFindViewById9;
        this.f40739m = linearLayout3;
        View viewL2 = oi0.c.L(linearLayout3, R.layout.pregnancy_insights_item_cell, R.layout.pregnancy_insights_item_cell_font_scaled);
        View viewFindViewById10 = viewL2.findViewById(R.id.pregnancy_insights_label);
        viewFindViewById10.getClass();
        this.f40733g = (TextView) viewFindViewById10;
        View viewFindViewById11 = viewL2.findViewById(R.id.pregnancy_insights_value);
        viewFindViewById11.getClass();
        this.f40734h = (TextView) viewFindViewById11;
        LinearLayout linearLayout4 = this.f40739m;
        if (linearLayout4 == null) {
            p005kotlin.jvm.internal.s.m("mPregnancyInsightsCalendarLayout");
            throw null;
        }
        linearLayout4.addView(viewL2);
        LinearLayout linearLayout5 = this.f40739m;
        if (linearLayout5 == null) {
            p005kotlin.jvm.internal.s.m("mPregnancyInsightsCalendarLayout");
            throw null;
        }
        View viewL3 = oi0.c.L(linearLayout5, R.layout.pregnancy_insights_item_cell, R.layout.pregnancy_insights_item_cell_font_scaled);
        ViewGroup.LayoutParams layoutParams = viewL3.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).setMargins(0, getResources().getDimensionPixelSize(R.dimen.gcm3_divider_height), 0, 0);
        View viewFindViewById12 = viewL3.findViewById(R.id.pregnancy_insights_label);
        viewFindViewById12.getClass();
        this.f40735i = (TextView) viewFindViewById12;
        View viewFindViewById13 = viewL3.findViewById(R.id.pregnancy_insights_value);
        viewFindViewById13.getClass();
        this.f40736j = (TextView) viewFindViewById13;
        LinearLayout linearLayout6 = this.f40739m;
        if (linearLayout6 == null) {
            p005kotlin.jvm.internal.s.m("mPregnancyInsightsCalendarLayout");
            throw null;
        }
        linearLayout6.addView(viewL3);
        TextView textView = this.f40732f;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mViewButton");
            throw null;
        }
        textView.setOnClickListener(new h0(this, 1));
        u6();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6() {
        ww0.l cycleSummary;
        Double dValueOf;
        Double dValueOf2;
        Double highWeightGoalInGrams;
        Double lowWeightGoalInGrams;
        u uVar;
        String strN;
        String string;
        String string2;
        o13.p pVar;
        ww0.c cVar = this.f40740n;
        if (cVar == null || (cycleSummary = cVar.getCycleSummary()) == null) {
            return;
        }
        Integer numberOfWeek = cycleSummary.getNumberOfWeek();
        if (numberOfWeek != null) {
            int iIntValue = numberOfWeek.intValue();
            u.a aVar = u.f40867g;
            int iMin = Math.min(40, iIntValue);
            aVar.getClass();
            int i14 = iMin - 1;
            if (i14 < 40) {
                try {
                    uVar = u.values()[i14];
                    if (uVar.f40869a != iMin) {
                        uVar = null;
                    }
                } catch (Exception unused) {
                }
            } else {
                uVar = null;
            }
            if (uVar != null) {
                Integer num = uVar.f40870b;
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    ImageView imageView = this.f40728b;
                    if (imageView == null) {
                        p005kotlin.jvm.internal.s.m("mBabySizeImageView");
                        throw null;
                    }
                    Resources resources = getResources();
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    imageView.setImageDrawable(resources.getDrawable(iIntValue2, null));
                }
                Integer num2 = uVar.f40871c;
                if (num2 != null) {
                    String strG = e5.g(getString(R.string.pregnancy_baby_size), ": ", getString(num2.intValue()));
                    TextView textView = this.f40729c;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("mBabySize");
                        throw null;
                    }
                    textView.setText(strG);
                }
                TextView textView2 = this.f40730d;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("mInsightsDescription");
                    throw null;
                }
                int i15 = uVar.f40869a;
                if (i15 == 11) {
                    GarminConnectMobileApp.f28685g.getClass();
                    Context contextA = GarminConnectMobileApp.a.a();
                    if (fb1.s0.f70298a[op0.b.a.b(op0.b.f133168a).ordinal()] == 1) {
                        String lowerCase = fb1.c.l(R.string.common_ounce_string).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        strN = "12-".concat(lowerCase);
                    } else {
                        strN = fb1.c.n("354 ", GarminConnectMobileApp.a.a().getString(R.string.lbl_unit_milliliter_abr));
                    }
                    string = contextA.getString(R.string.pregnancy_educational_content11, strN);
                    string.getClass();
                } else if (i15 == 15) {
                    if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                        GarminConnectMobileApp.f28685g.getClass();
                        string2 = GarminConnectMobileApp.a.a().getString(R.string.pregnancy_weight_gain_metric_range);
                    } else {
                        GarminConnectMobileApp.f28685g.getClass();
                        string2 = GarminConnectMobileApp.a.a().getString(R.string.pregnancy_weight_gain_statute_range);
                    }
                    string2.getClass();
                    GarminConnectMobileApp.f28685g.getClass();
                    string = GarminConnectMobileApp.a.a().getString(R.string.pregnancy_educational_content15, string2);
                    string.getClass();
                } else if (i15 == 25) {
                    GarminConnectMobileApp.f28685g.getClass();
                    wp0.a aVar2 = new wp0.a(new l22.a(GarminConnectMobileApp.a.b()));
                    op0.b.a aVar3 = op0.b.f133168a;
                    String strA = aVar2.a(295.74d, op0.b.a.b(aVar3), false);
                    Double dF = d53.s.f(strA);
                    int i16 = (dF != null ? dF.doubleValue() : 0.0d) == 1.0d ? op0.b.a.b(aVar3).f142312a : op0.b.a.b(aVar3).f142313b;
                    Context contextA2 = GarminConnectMobileApp.a.a();
                    String lowerCase2 = fb1.c.l(i16).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    string = contextA2.getString(R.string.pregnancy_educational_content25, strA, lowerCase2);
                    string.getClass();
                } else if (i15 == 27) {
                    GarminConnectMobileApp.f28685g.getClass();
                    Context contextA3 = GarminConnectMobileApp.a.a();
                    Context contextA4 = GarminConnectMobileApp.a.a();
                    l3.a aVar4 = l3.f23124b;
                    String string3 = contextA4.getString(R.string.common_hyphenated_values, String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 12.7d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48)))), String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 18.14d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48)))));
                    k42.b bVar = k42.b.f102880a;
                    GarminConnectMobileApp garminConnectMobileAppB = GarminConnectMobileApp.a.b();
                    bVar.getClass();
                    string = contextA3.getString(R.string.pregnancy_educational_content27, string3, k42.b.q(garminConnectMobileAppB), GarminConnectMobileApp.a.a().getString(R.string.common_hyphenated_values, String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 11.34d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48)))), String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 15.88d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48))))), k42.b.q(GarminConnectMobileApp.a.b()), GarminConnectMobileApp.a.a().getString(R.string.common_hyphenated_values, String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 6.8d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48)))), String.valueOf(MathKt.b(b1.b(l3.a.C1(aVar4, GarminConnectMobileApp.a.b(), 11.34d, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y(), false, null, 48))))), k42.b.q(GarminConnectMobileApp.a.b()));
                    string.getClass();
                } else if (i15 != 38) {
                    string = uVar.f40872d;
                } else {
                    GarminConnectMobileApp.f28685g.getClass();
                    l22.a aVar5 = new l22.a(GarminConnectMobileApp.a.b());
                    if (op0.b.a.b(op0.b.f133168a) == q22.b.MILLILITER) {
                        String lowerCase3 = aVar5.getString(R.string.common_milliliters).toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        pVar = new o13.p("443", lowerCase3);
                    } else {
                        String lowerCase4 = aVar5.getString(R.string.common_ounces).toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                        pVar = new o13.p("15", lowerCase4);
                    }
                    string = aVar5.a(R.string.pregnancy_educational_content38, (String) pVar.f128594a, (String) pVar.f128595b);
                }
                textView2.setText(string);
                TextView textView3 = this.f40731e;
                if (textView3 == null) {
                    p005kotlin.jvm.internal.s.m("mLearnMoreView");
                    throw null;
                }
                oe2.f.Z(textView3, uVar.f40873e, uVar.f40874f);
            }
        }
        TextView textView4 = this.f40733g;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("mCurrentWeekLabel");
            throw null;
        }
        textView4.setText(getString(R.string.pregnancy_weeks_to_go));
        Integer numberOfWeek2 = cycleSummary.getNumberOfWeek();
        if (numberOfWeek2 != null) {
            int iIntValue3 = numberOfWeek2.intValue();
            TextView textView5 = this.f40734h;
            if (textView5 == null) {
                p005kotlin.jvm.internal.s.m("mCurrentWeekValue");
                throw null;
            }
            textView5.setText(String.valueOf(Math.max(40 - iIntValue3, 0)));
            TextView textView6 = this.f40735i;
            if (textView6 == null) {
                p005kotlin.jvm.internal.s.m("mDaysToNextTrimesterLabel");
                throw null;
            }
            textView6.setText(((float) iIntValue3) > 27.0f ? getString(R.string.pregnancy_days_to_due_date) : getString(R.string.pregnancy_days_to_next_trimester));
            Integer daysUntilNextPhase = cycleSummary.getDaysUntilNextPhase();
            if (daysUntilNextPhase != null) {
                int iIntValue4 = daysUntilNextPhase.intValue();
                TextView textView7 = this.f40736j;
                if (textView7 == null) {
                    p005kotlin.jvm.internal.s.m("mNextTrimesterDays");
                    throw null;
                }
                textView7.setText(iIntValue3 < 41 ? String.valueOf(iIntValue4) : "0");
            }
        }
        ww0.c cVar2 = this.f40740n;
        v weightGoals = cVar2 != null ? cVar2.getWeightGoals() : null;
        if (weightGoals == null || (lowWeightGoalInGrams = weightGoals.getLowWeightGoalInGrams()) == null) {
            dValueOf = null;
        } else {
            double dDoubleValue = lowWeightGoalInGrams.doubleValue();
            l3.f23124b.getClass();
            dValueOf = Double.valueOf(l3.a.P1(dDoubleValue));
        }
        if (weightGoals == null || (highWeightGoalInGrams = weightGoals.getHighWeightGoalInGrams()) == null) {
            dValueOf2 = null;
        } else {
            double dDoubleValue2 = highWeightGoalInGrams.doubleValue();
            l3.f23124b.getClass();
            dValueOf2 = Double.valueOf(l3.a.P1(dDoubleValue2));
        }
        Context context = getContext();
        if (dValueOf == null || dValueOf2 == null || context == null) {
            CardView cardView = this.f40738l;
            if (cardView == null) {
                p005kotlin.jvm.internal.s.m("mWeightGainGoalCardView");
                throw null;
            }
            cardView.setVisibility(8);
        } else {
            CardView cardView2 = this.f40738l;
            if (cardView2 == null) {
                p005kotlin.jvm.internal.s.m("mWeightGainGoalCardView");
                throw null;
            }
            cardView2.setVisibility(0);
            CardView cardView3 = this.f40738l;
            if (cardView3 == null) {
                p005kotlin.jvm.internal.s.m("mWeightGainGoalCardView");
                throw null;
            }
            ((TextView) cardView3.findViewById(R.id.goal_layout_title)).setText(getString(R.string.pregnancy_weekly_weight_goal));
            double dC = k42.b.c(dValueOf.doubleValue());
            l3.f23124b.getClass();
            String strJ = k42.b.j(context, dC, false, l3.f23130h);
            String strJ2 = k42.b.j(context, k42.b.c(dValueOf2.doubleValue()), true, l3.f23130h);
            CardView cardView4 = this.f40738l;
            if (cardView4 == null) {
                p005kotlin.jvm.internal.s.m("mWeightGainGoalCardView");
                throw null;
            }
            ((TextView) cardView4.findViewById(R.id.goal_layout_value)).setText(getString(R.string.string_short_dash_line_string_pattern, strJ, strJ2));
        }
        CardView cardView5 = this.f40738l;
        if (cardView5 != null) {
            cardView5.setOnClickListener(new h0(this, 0));
        } else {
            p005kotlin.jvm.internal.s.m("mWeightGainGoalCardView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/n$a;", "", "<init>", "()V", "", "EXTRA_PREGNANCY_DETAILS", "Ljava/lang/String;", "EXTRA_DATE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
