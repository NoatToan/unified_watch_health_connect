package pk1;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsHeaderView;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p40.o0;
import z10.d1;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpk1/u;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends Fragment {
    public static final a E = new a(null);
    public View A;
    public final f12.l B;
    public final Object C;
    public yk1.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMSettingsHeaderView f138316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMSettingsItemView f138317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMSettingsItemView f138318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f138319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMSettingsItemView f138320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GCMSettingsItemView f138321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMSettingsItemView f138322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GCMSettingsItemView f138323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GCMSettingsHeaderView f138324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GCMSettingsItemView f138325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMSettingsHeaderView f138326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMSettingsItemView f138327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMSettingsItemView f138328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMSettingsHeaderView f138329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMSettingsItemView f138330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMSettingsHeaderView f138331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GCMSettingsItemView f138332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GCMSettingsHeaderView f138333r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMSettingsItemView f138334t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMSettingsItemView f138335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMSettingsHeaderView f138336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMSettingsItemView f138337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMSettingsHeaderView f138338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GCMSettingsItemView f138339z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138340a;

        static {
            int[] iArr = new int[du2.g.d.values().length];
            try {
                iArr[du2.g.d.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[du2.g.d.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138340a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f138341a;

        public c(Fragment fragment) {
            this.f138341a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f138341a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f138342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f138343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f138344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f138345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f138346e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f138342a = fragment;
            this.f138343b = qualifier;
            this.f138344c = aVar;
            this.f138345d = aVar2;
            this.f138346e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pk1.f] */
        @Override // e23.a
        public final f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 viewModelStore = ((ViewModelStoreOwner) this.f138344c.invoke()).getViewModelStore();
            Fragment fragment = this.f138342a;
            e23.a aVar = this.f138345d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(f.class), viewModelStore, null, defaultViewModelCreationExtras, this.f138343b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f138346e, 4, null);
        }
    }

    public u() {
        f12.l.f68084a.getClass();
        this.B = f12.l.a.a();
        this.C = o13.m.a(o13.n.NONE, new d(this, null, new c(this), null, null));
    }

    public static boolean H6() {
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        if (k1Var.g0()) {
            return true;
        }
        bv.b.a();
        return k1Var.Z();
    }

    public final String A6(int i14) {
        if (i14 >= 0 && i14 < 11) {
            return String.valueOf(i14);
        }
        String string = getString(R.string.lbl_none);
        string.getClass();
        return string;
    }

    public final String C6(LocalDate localDate) {
        if (localDate != null) {
            String strPrint = DateTimeFormat.mediumDate().print(localDate);
            strPrint.getClass();
            return strPrint;
        }
        String string = getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public final String E6(String str) {
        if (d53.u.q(getString(R.string.user_gender_value_male), str, true)) {
            String string = getString(R.string.lbl_gender_male);
            string.getClass();
            return string;
        }
        if (d53.u.q(getString(R.string.user_gender_value_female), str, true)) {
            String string2 = getString(R.string.lbl_gender_female);
            string2.getClass();
            return string2;
        }
        String string3 = getString(R.string.gender_not_specified);
        string3.getClass();
        return string3;
    }

    public final String F6(float f14) {
        String strN0 = l3.a.n0(l3.f23124b, requireContext(), f14, this.B.y());
        if (!TextUtils.isEmpty(strN0)) {
            return strN0;
        }
        String string = getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public final String G6(double d14) {
        String strC1 = l3.a.C1(l3.f23124b, requireContext(), d14, this.B.y(), false, null, 56);
        if (!TextUtils.isEmpty(strC1)) {
            return strC1;
        }
        String string = getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public final void I6() {
        boolean z14;
        GCMSettingsHeaderView gCMSettingsHeaderView = this.f138316a;
        if (gCMSettingsHeaderView == null) {
            p005kotlin.jvm.internal.s.m("personalInfoHeaderView");
            throw null;
        }
        gCMSettingsHeaderView.a(new r(this, 17));
        GCMSettingsItemView gCMSettingsItemView = this.f138317b;
        if (gCMSettingsItemView == null) {
            p005kotlin.jvm.internal.s.m("genderView");
            throw null;
        }
        f12.l lVar = this.B;
        gCMSettingsItemView.setSummary((CharSequence) E6(lVar.w()));
        String[] stringArray = getResources().getStringArray(R.array.gcm_user_genders_values);
        stringArray.getClass();
        GCMSettingsItemView gCMSettingsItemView2 = this.f138317b;
        if (gCMSettingsItemView2 == null) {
            p005kotlin.jvm.internal.s.m("genderView");
            throw null;
        }
        gCMSettingsItemView2.setOnClickListener(new lq.g(29, this, stringArray));
        GCMSettingsItemView gCMSettingsItemView3 = this.f138318c;
        if (gCMSettingsItemView3 == null) {
            p005kotlin.jvm.internal.s.m("dateOfBirthView");
            throw null;
        }
        gCMSettingsItemView3.setSummary(C6(lVar.l1()));
        if (k1.f37122a.r()) {
            GCMSettingsItemView gCMSettingsItemView4 = this.f138318c;
            if (gCMSettingsItemView4 == null) {
                p005kotlin.jvm.internal.s.m("dateOfBirthView");
                throw null;
            }
            gCMSettingsItemView4.setEnabled(false);
            GCMSettingsItemView gCMSettingsItemView5 = this.f138318c;
            if (gCMSettingsItemView5 == null) {
                p005kotlin.jvm.internal.s.m("dateOfBirthView");
                throw null;
            }
            TextView textView = gCMSettingsItemView5.f44206a;
            textView.setEnabled(false);
            TextView textView2 = gCMSettingsItemView5.f44207b;
            textView2.setEnabled(false);
            textView.setTextColor(gCMSettingsItemView5.getContext().getColor(R.color.gcm_text_primary_disabled));
            textView2.setTextColor(gCMSettingsItemView5.getContext().getColor(R.color.gcm_text_secondary_disabled));
            String string = getString(R.string.lbl_manage_garmin_account);
            string.getClass();
            String strG = e5.g(getString(R.string.msg_update_birthdate_garmin_account_profile), StringUtils.SPACE, string);
            int color = a7.b.getColor(requireContext(), R.color.gcm_text_primary_action_selector);
            c22.d.f23016a.getClass();
            String strA = c22.d.a.a();
            TextView textView3 = this.f138319d;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("supportDateOfBirthView");
                throw null;
            }
            v22.e.p(textView3, strG, string, color, new o0(6, this, strA));
        } else {
            TextView textView4 = this.f138319d;
            if (textView4 == null) {
                p005kotlin.jvm.internal.s.m("supportDateOfBirthView");
                throw null;
            }
            textView4.setVisibility(8);
            GCMSettingsItemView gCMSettingsItemView6 = this.f138318c;
            if (gCMSettingsItemView6 == null) {
                p005kotlin.jvm.internal.s.m("dateOfBirthView");
                throw null;
            }
            gCMSettingsItemView6.setOnClickListener(new r(this, 12));
            GCMSettingsItemView gCMSettingsItemView7 = this.f138318c;
            if (gCMSettingsItemView7 == null) {
                p005kotlin.jvm.internal.s.m("dateOfBirthView");
                throw null;
            }
            String string2 = getString(R.string.remove_date);
            string2.getClass();
            gCMSettingsItemView7.setActionText(string2);
            GCMSettingsItemView gCMSettingsItemView8 = this.f138318c;
            if (gCMSettingsItemView8 == null) {
                p005kotlin.jvm.internal.s.m("dateOfBirthView");
                throw null;
            }
            gCMSettingsItemView8.setActionClickListener(new r(this, 13));
        }
        u6();
        w6();
        z6();
        GCMSettingsItemView gCMSettingsItemView9 = this.f138323h;
        if (gCMSettingsItemView9 == null) {
            p005kotlin.jvm.internal.s.m("activityClassView");
            throw null;
        }
        gCMSettingsItemView9.setSummary(A6(lVar.e2()));
        GCMSettingsItemView gCMSettingsItemView10 = this.f138323h;
        if (gCMSettingsItemView10 == null) {
            p005kotlin.jvm.internal.s.m("activityClassView");
            throw null;
        }
        gCMSettingsItemView10.setOnClickListener(new r(this, 10));
        boolean zH6 = H6();
        if (zH6) {
            GCMSettingsItemView gCMSettingsItemView11 = this.f138325j;
            if (gCMSettingsItemView11 == null) {
                p005kotlin.jvm.internal.s.m("wheelchairModeView");
                throw null;
            }
            gCMSettingsItemView11.setOnClickListener(new r(this, 0));
        }
        GCMSettingsHeaderView gCMSettingsHeaderView2 = this.f138324i;
        if (gCMSettingsHeaderView2 == null) {
            p005kotlin.jvm.internal.s.m("accessibilityHeaderView");
            throw null;
        }
        v22.e.v(gCMSettingsHeaderView2, zH6);
        GCMSettingsItemView gCMSettingsItemView12 = this.f138325j;
        if (gCMSettingsItemView12 == null) {
            p005kotlin.jvm.internal.s.m("wheelchairModeView");
            throw null;
        }
        v22.e.v(gCMSettingsItemView12, zH6);
        rd2.f.a().f152045a.getClass();
        ArrayList arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            Iterator it = arrayListE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                } else if (((sd2.f) it.next()).q4()) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        boolean z15 = !z14;
        if (!z14) {
            GCMSettingsHeaderView gCMSettingsHeaderView3 = this.f138326k;
            if (gCMSettingsHeaderView3 == null) {
                p005kotlin.jvm.internal.s.m("sleepHeaderView");
                throw null;
            }
            gCMSettingsHeaderView3.a(new r(this, 15));
            GCMSettingsItemView gCMSettingsItemView13 = this.f138327l;
            if (gCMSettingsItemView13 == null) {
                p005kotlin.jvm.internal.s.m("sleepBedTimeView");
                throw null;
            }
            z22.a.C3763a c3763a = z22.a.f202016d;
            Context contextRequireContext = requireContext();
            c3763a.getClass();
            gCMSettingsItemView13.setSummary(z22.a.C3763a.a(contextRequireContext, true));
            GCMSettingsItemView gCMSettingsItemView14 = this.f138327l;
            if (gCMSettingsItemView14 == null) {
                p005kotlin.jvm.internal.s.m("sleepBedTimeView");
                throw null;
            }
            gCMSettingsItemView14.setOnClickListener(new r(this, 2));
            GCMSettingsItemView gCMSettingsItemView15 = this.f138328m;
            if (gCMSettingsItemView15 == null) {
                p005kotlin.jvm.internal.s.m("sleepWakeTimeView");
                throw null;
            }
            gCMSettingsItemView15.setSummary(z22.a.C3763a.a(requireContext(), false));
            GCMSettingsItemView gCMSettingsItemView16 = this.f138328m;
            if (gCMSettingsItemView16 == null) {
                p005kotlin.jvm.internal.s.m("sleepWakeTimeView");
                throw null;
            }
            gCMSettingsItemView16.setOnClickListener(new r(this, 14));
        }
        GCMSettingsHeaderView gCMSettingsHeaderView4 = this.f138326k;
        if (gCMSettingsHeaderView4 == null) {
            p005kotlin.jvm.internal.s.m("sleepHeaderView");
            throw null;
        }
        v22.e.v(gCMSettingsHeaderView4, z15);
        GCMSettingsItemView gCMSettingsItemView17 = this.f138327l;
        if (gCMSettingsItemView17 == null) {
            p005kotlin.jvm.internal.s.m("sleepBedTimeView");
            throw null;
        }
        v22.e.v(gCMSettingsItemView17, z15);
        GCMSettingsItemView gCMSettingsItemView18 = this.f138328m;
        if (gCMSettingsItemView18 == null) {
            p005kotlin.jvm.internal.s.m("sleepWakeTimeView");
            throw null;
        }
        v22.e.v(gCMSettingsItemView18, z15);
        y6();
        GCMSettingsHeaderView gCMSettingsHeaderView5 = this.f138331p;
        if (gCMSettingsHeaderView5 == null) {
            p005kotlin.jvm.internal.s.m("measurementUnitsHeaderView");
            throw null;
        }
        gCMSettingsHeaderView5.a(new r(this, 1));
        GCMSettingsItemView gCMSettingsItemView19 = this.f138332q;
        if (gCMSettingsItemView19 == null) {
            p005kotlin.jvm.internal.s.m("measurementUnitsView");
            throw null;
        }
        String string3 = getString(lVar.g().f77292b);
        string3.getClass();
        gCMSettingsItemView19.setSummary(string3);
        GCMSettingsItemView gCMSettingsItemView20 = this.f138332q;
        if (gCMSettingsItemView20 == null) {
            p005kotlin.jvm.internal.s.m("measurementUnitsView");
            throw null;
        }
        gCMSettingsItemView20.setOnClickListener(new r(this, 3));
        v6();
        boolean zH7 = H6();
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        GCMSettingsHeaderView gCMSettingsHeaderView6 = this.f138336w;
        if (gCMSettingsHeaderView6 == null) {
            p005kotlin.jvm.internal.s.m("combinedStrideLengthHeaderView");
            throw null;
        }
        gCMSettingsHeaderView6.setVisibility(0);
        GCMSettingsItemView gCMSettingsItemView21 = this.f138337x;
        if (gCMSettingsItemView21 == null) {
            p005kotlin.jvm.internal.s.m("combinedStrideLengthItem");
            throw null;
        }
        gCMSettingsItemView21.setVisibility(0);
        int i14 = (zH7 && zL0) ? R.string.lbl_pushes : R.string.lbl_steps;
        int i15 = (zH7 && zL0) ? R.string.lbl_custom_stroke_length : R.string.user_setting_custom_stride_length;
        GCMSettingsHeaderView gCMSettingsHeaderView7 = this.f138336w;
        if (gCMSettingsHeaderView7 == null) {
            p005kotlin.jvm.internal.s.m("combinedStrideLengthHeaderView");
            throw null;
        }
        String string4 = getString(i14);
        string4.getClass();
        gCMSettingsHeaderView7.setHeaderText(string4);
        GCMSettingsItemView gCMSettingsItemView22 = this.f138337x;
        if (gCMSettingsItemView22 == null) {
            p005kotlin.jvm.internal.s.m("combinedStrideLengthItem");
            throw null;
        }
        String string5 = getString(i15);
        string5.getClass();
        gCMSettingsItemView22.setTitle(string5);
        GCMSettingsItemView gCMSettingsItemView23 = this.f138337x;
        if (gCMSettingsItemView23 == null) {
            p005kotlin.jvm.internal.s.m("combinedStrideLengthItem");
            throw null;
        }
        gCMSettingsItemView23.setOnClickListener(new r(this, 18));
        GCMSettingsHeaderView gCMSettingsHeaderView8 = this.f138338y;
        if (gCMSettingsHeaderView8 == null) {
            p005kotlin.jvm.internal.s.m("displayPreferencesHeaderView");
            throw null;
        }
        gCMSettingsHeaderView8.a(new r(this, 6));
        GCMSettingsItemView gCMSettingsItemView24 = this.f138339z;
        if (gCMSettingsItemView24 == null) {
            p005kotlin.jvm.internal.s.m("firstDayOfWeekView");
            throw null;
        }
        String string6 = getString(lVar.e1().f77272d);
        string6.getClass();
        gCMSettingsItemView24.setSummary(string6);
        gg1.m mVar = gg1.m.SATURDAY;
        String string7 = getString(mVar.f77272d);
        gg1.m mVar2 = gg1.m.SUNDAY;
        String string8 = getString(mVar2.f77272d);
        gg1.m mVar3 = gg1.m.MONDAY;
        String[] strArr = {string7, string8, getString(mVar3.f77272d)};
        gg1.m[] mVarArr = {mVar, mVar2, mVar3};
        GCMSettingsItemView gCMSettingsItemView25 = this.f138339z;
        if (gCMSettingsItemView25 != null) {
            gCMSettingsItemView25.setOnClickListener(new bv2.j(this, 25, strArr, mVarArr));
        } else {
            p005kotlin.jvm.internal.s.m("firstDayOfWeekView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof yk1.a) {
            this.D = (yk1.a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_settings_user_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.header_personal_info);
        viewFindViewById.getClass();
        this.f138316a = (GCMSettingsHeaderView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.setting_gender);
        viewFindViewById2.getClass();
        this.f138317b = (GCMSettingsItemView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.setting_birthday);
        viewFindViewById3.getClass();
        this.f138318c = (GCMSettingsItemView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.support_birth_date);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f138319d = textView;
        textView.setText(getString(R.string.msg_update_birthdate_garmin_account_profile) + " 2132093188");
        View viewFindViewById5 = view2.findViewById(R.id.setting_age);
        viewFindViewById5.getClass();
        this.f138320e = (GCMSettingsItemView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.setting_height);
        viewFindViewById6.getClass();
        this.f138321f = (GCMSettingsItemView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.setting_weight);
        viewFindViewById7.getClass();
        this.f138322g = (GCMSettingsItemView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.setting_activity_class);
        viewFindViewById8.getClass();
        this.f138323h = (GCMSettingsItemView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.header_accessibility_settings);
        viewFindViewById9.getClass();
        this.f138324i = (GCMSettingsHeaderView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.setting_wheelchair_mode);
        viewFindViewById10.getClass();
        this.f138325j = (GCMSettingsItemView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.header_sleep_settings);
        viewFindViewById11.getClass();
        this.f138326k = (GCMSettingsHeaderView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.setting_sleep_bed_time);
        viewFindViewById12.getClass();
        this.f138327l = (GCMSettingsItemView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.setting_sleep_wake_time);
        viewFindViewById13.getClass();
        this.f138328m = (GCMSettingsItemView) viewFindViewById13;
        View viewFindViewById14 = view2.findViewById(R.id.header_weather);
        viewFindViewById14.getClass();
        this.f138329n = (GCMSettingsHeaderView) viewFindViewById14;
        View viewFindViewById15 = view2.findViewById(R.id.setting_weather_location);
        viewFindViewById15.getClass();
        this.f138330o = (GCMSettingsItemView) viewFindViewById15;
        View viewFindViewById16 = view2.findViewById(R.id.header_measurement_units);
        viewFindViewById16.getClass();
        this.f138331p = (GCMSettingsHeaderView) viewFindViewById16;
        View viewFindViewById17 = view2.findViewById(R.id.setting_measurement_units);
        viewFindViewById17.getClass();
        this.f138332q = (GCMSettingsItemView) viewFindViewById17;
        View viewFindViewById18 = view2.findViewById(R.id.header_health);
        viewFindViewById18.getClass();
        this.f138333r = (GCMSettingsHeaderView) viewFindViewById18;
        View viewFindViewById19 = view2.findViewById(R.id.setting_hydration);
        viewFindViewById19.getClass();
        this.f138334t = (GCMSettingsItemView) viewFindViewById19;
        View viewFindViewById20 = view2.findViewById(R.id.setting_women_health);
        viewFindViewById20.getClass();
        this.f138335v = (GCMSettingsItemView) viewFindViewById20;
        View viewFindViewById21 = view2.findViewById(R.id.header_combined_stride_length);
        viewFindViewById21.getClass();
        this.f138336w = (GCMSettingsHeaderView) viewFindViewById21;
        View viewFindViewById22 = view2.findViewById(R.id.combined_stride_length);
        viewFindViewById22.getClass();
        this.f138337x = (GCMSettingsItemView) viewFindViewById22;
        View viewFindViewById23 = view2.findViewById(R.id.header_display_preferences);
        viewFindViewById23.getClass();
        this.f138338y = (GCMSettingsHeaderView) viewFindViewById23;
        View viewFindViewById24 = view2.findViewById(R.id.setting_first_day_of_week);
        viewFindViewById24.getClass();
        this.f138339z = (GCMSettingsItemView) viewFindViewById24;
        View viewFindViewById25 = view2.findViewById(R.id.btn_privacy_policy);
        viewFindViewById25.getClass();
        this.A = viewFindViewById25;
        viewFindViewById25.setOnClickListener(new r(this, 16));
        I6();
        if (k1.f37122a.r()) {
            ge1.b.T(f0.w(this), null, null, new y(this, null), 3);
        }
    }

    public final void u6() {
        LocalDate localDateL1 = this.B.l1();
        if (localDateL1 != null) {
            Years yearsYearsBetween = Years.yearsBetween(localDateL1, new LocalDate());
            GCMSettingsItemView gCMSettingsItemView = this.f138320e;
            if (gCMSettingsItemView != null) {
                gCMSettingsItemView.setSummary(String.valueOf(yearsYearsBetween.getYears()));
                return;
            } else {
                p005kotlin.jvm.internal.s.m("ageView");
                throw null;
            }
        }
        GCMSettingsItemView gCMSettingsItemView2 = this.f138320e;
        if (gCMSettingsItemView2 == null) {
            p005kotlin.jvm.internal.s.m("ageView");
            throw null;
        }
        String string = getString(R.string.no_value);
        string.getClass();
        gCMSettingsItemView2.setSummary(string);
    }

    public final void v6() {
        boolean zI = d1.i(q92.x.DI_CONNECT_UPLOAD);
        boolean z14 = zI && k1.f37122a.d();
        boolean z15 = zI && k1.f37122a.c();
        f12.l lVar = this.B;
        boolean zEquals = lVar.w().equals(UserSettingsDTO.c.MALE.f43537a);
        GCMSettingsItemView gCMSettingsItemView = this.f138334t;
        if (zI) {
            if (gCMSettingsItemView == null) {
                p005kotlin.jvm.internal.s.m("hydrationView");
                throw null;
            }
            gCMSettingsItemView.setVisibility(0);
            GCMSettingsItemView gCMSettingsItemView2 = this.f138334t;
            if (gCMSettingsItemView2 == null) {
                p005kotlin.jvm.internal.s.m("hydrationView");
                throw null;
            }
            gCMSettingsItemView2.setOnClickListener(new r(this, 19));
        } else {
            if (gCMSettingsItemView == null) {
                p005kotlin.jvm.internal.s.m("hydrationView");
                throw null;
            }
            gCMSettingsItemView.setVisibility(8);
        }
        boolean z16 = (z14 || z15) && !zEquals;
        GCMSettingsItemView gCMSettingsItemView3 = this.f138335v;
        if (z16) {
            if (gCMSettingsItemView3 == null) {
                p005kotlin.jvm.internal.s.m("womenHealthView");
                throw null;
            }
            gCMSettingsItemView3.setVisibility(0);
            ww0.a aVarY1 = lVar.y1();
            ww0.a aVar = ww0.a.PREGNANT;
            GCMSettingsItemView gCMSettingsItemView4 = this.f138335v;
            if (aVarY1 == aVar) {
                if (gCMSettingsItemView4 == null) {
                    p005kotlin.jvm.internal.s.m("womenHealthView");
                    throw null;
                }
                String string = getString(R.string.pregnancy_title);
                string.getClass();
                gCMSettingsItemView4.setSummary(string);
            } else {
                if (gCMSettingsItemView4 == null) {
                    p005kotlin.jvm.internal.s.m("womenHealthView");
                    throw null;
                }
                String string2 = getString(R.string.mct_menstrual_cycle);
                string2.getClass();
                gCMSettingsItemView4.setSummary(string2);
            }
            GCMSettingsItemView gCMSettingsItemView5 = this.f138335v;
            if (gCMSettingsItemView5 == null) {
                p005kotlin.jvm.internal.s.m("womenHealthView");
                throw null;
            }
            gCMSettingsItemView5.setOnClickListener(new r(this, 7));
        } else {
            if (gCMSettingsItemView3 == null) {
                p005kotlin.jvm.internal.s.m("womenHealthView");
                throw null;
            }
            gCMSettingsItemView3.setVisibility(8);
        }
        if (zI || z14 || z15) {
            return;
        }
        GCMSettingsHeaderView gCMSettingsHeaderView = this.f138333r;
        if (gCMSettingsHeaderView != null) {
            gCMSettingsHeaderView.setVisibility(8);
        } else {
            p005kotlin.jvm.internal.s.m("healthHeaderView");
            throw null;
        }
    }

    public final void w6() {
        GCMSettingsItemView gCMSettingsItemView = this.f138321f;
        if (gCMSettingsItemView == null) {
            p005kotlin.jvm.internal.s.m("heightView");
            throw null;
        }
        gCMSettingsItemView.setSummary(F6(this.B.t()));
        GCMSettingsItemView gCMSettingsItemView2 = this.f138321f;
        if (gCMSettingsItemView2 == null) {
            p005kotlin.jvm.internal.s.m("heightView");
            throw null;
        }
        gCMSettingsItemView2.setOnClickListener(new r(this, 8));
        GCMSettingsItemView gCMSettingsItemView3 = this.f138321f;
        if (gCMSettingsItemView3 != null) {
            gCMSettingsItemView3.setActionClickListener(new r(this, 9));
        } else {
            p005kotlin.jvm.internal.s.m("heightView");
            throw null;
        }
    }

    public final void y6() {
        boolean z14 = n0.b().size() > 0;
        GCMSettingsHeaderView gCMSettingsHeaderView = this.f138329n;
        if (!z14) {
            if (gCMSettingsHeaderView == null) {
                p005kotlin.jvm.internal.s.m("weatherLocationHeaderView");
                throw null;
            }
            gCMSettingsHeaderView.setVisibility(8);
            GCMSettingsItemView gCMSettingsItemView = this.f138330o;
            if (gCMSettingsItemView != null) {
                gCMSettingsItemView.setVisibility(8);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("weatherLocationView");
                throw null;
            }
        }
        if (gCMSettingsHeaderView == null) {
            p005kotlin.jvm.internal.s.m("weatherLocationHeaderView");
            throw null;
        }
        gCMSettingsHeaderView.setVisibility(0);
        GCMSettingsItemView gCMSettingsItemView2 = this.f138330o;
        if (gCMSettingsItemView2 == null) {
            p005kotlin.jvm.internal.s.m("weatherLocationView");
            throw null;
        }
        gCMSettingsItemView2.setVisibility(0);
        du2.g.a aVar = du2.g.f61293g;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        int i14 = b.f138340a[du2.g.a.d(contextRequireContext).ordinal()];
        if (i14 == 1) {
            GCMSettingsItemView gCMSettingsItemView3 = this.f138330o;
            if (gCMSettingsItemView3 == null) {
                p005kotlin.jvm.internal.s.m("weatherLocationView");
                throw null;
            }
            String string = getString(R.string.weather_location_settings_subtitle);
            string.getClass();
            gCMSettingsItemView3.setSummary(string);
        } else {
            if (i14 != 2) {
                u0.r();
                return;
            }
            GCMSettingsItemView gCMSettingsItemView4 = this.f138330o;
            if (gCMSettingsItemView4 == null) {
                p005kotlin.jvm.internal.s.m("weatherLocationView");
                throw null;
            }
            String string2 = getString(R.string.weather_location_fixed_location);
            string2.getClass();
            gCMSettingsItemView4.setSummary(string2);
        }
        GCMSettingsItemView gCMSettingsItemView5 = this.f138330o;
        if (gCMSettingsItemView5 != null) {
            gCMSettingsItemView5.setOnClickListener(new r(this, 11));
        } else {
            p005kotlin.jvm.internal.s.m("weatherLocationView");
            throw null;
        }
    }

    public final void z6() {
        GCMSettingsItemView gCMSettingsItemView = this.f138322g;
        if (gCMSettingsItemView == null) {
            p005kotlin.jvm.internal.s.m("weightView");
            throw null;
        }
        gCMSettingsItemView.setSummary(G6(this.B.v3()));
        GCMSettingsItemView gCMSettingsItemView2 = this.f138322g;
        if (gCMSettingsItemView2 == null) {
            p005kotlin.jvm.internal.s.m("weightView");
            throw null;
        }
        gCMSettingsItemView2.setOnClickListener(new r(this, 4));
        GCMSettingsItemView gCMSettingsItemView3 = this.f138322g;
        if (gCMSettingsItemView3 != null) {
            gCMSettingsItemView3.setActionClickListener(new r(this, 5));
        } else {
            p005kotlin.jvm.internal.s.m("weightView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lpk1/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MINIMUM_ACTIVITY_CLASS", "I", "MAXIMUM_ACTIVITY_CLASS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
