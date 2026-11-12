package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.content.Context;
import android.content.res.Resources;
import android.location.Address;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.room.a0;
import c22.t1;
import com.garmin.android.apps.connectmobile.R;
import du2.g;
import e23.l;
import fw.p;
import g42.d;
import g42.k;
import j22.f;
import java.io.IOException;
import java.util.List;
import lc.u0;
import o13.h;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.x;
import wi1.j;
import zb0.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/a;", "Landroidx/fragment/app/Fragment;", "Lg42/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements g42.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0932a f47906o = new C0932a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f47907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.weather.defaultlocation.b f47908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g42.b f47909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f47910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConstraintLayout f47911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f47912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConstraintLayout f47913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConstraintLayout f47914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f47915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f47916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f47917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f47918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f47919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f47920n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47921a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47921a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f47922a;

        public c(l lVar) {
            lVar.getClass();
            this.f47922a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f47922a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47922a.invoke(obj);
        }
    }

    public a() {
        int i14 = gt2.c.f79010a;
        this.f47907a = gt2.b.f79005a.h("WeatherLocationPreferenceFragment");
    }

    @Override // g42.a
    public final void K3() {
        List listK = x.k(f.ALLOWED_ALL_TIME, f.ALLOWED_WHILE_USING);
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f47908b;
        if (bVar == null) {
            s.m("viewModel");
            throw null;
        }
        T tD = bVar.f47926b.d();
        g.d dVar = g.d.PHONE;
        Logger logger = this.f47907a;
        if (tD == dVar) {
            j22.b bVar2 = j22.b.f96736a;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            bVar2.getClass();
            if (!listK.contains(j22.b.j(contextRequireContext))) {
                logger.error("backPressed: PHONE source is configured but don't have sufficient permissions");
                g42.b bVar3 = this.f47909c;
                if (bVar3 != null) {
                    bVar3.W3();
                    return;
                } else {
                    s.m("preferenceListener");
                    throw null;
                }
            }
        }
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar4 = this.f47908b;
        if (bVar4 == null) {
            s.m("viewModel");
            throw null;
        }
        if (bVar4.f47926b.d() == g.d.STATIC) {
            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar5 = this.f47908b;
            if (bVar5 == null) {
                s.m("viewModel");
                throw null;
            }
            d dVarX4 = bVar5.x4();
            if (dVarX4 == null || (dVarX4.f75784a && (dVarX4.f75785b == null || dVarX4.f75786c == null))) {
                logger.error("backPressed: STATIC source is configured but we're not ready to save");
                g42.b bVar6 = this.f47909c;
                if (bVar6 != null) {
                    bVar6.x5();
                    return;
                } else {
                    s.m("preferenceListener");
                    throw null;
                }
            }
        }
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar7 = this.f47908b;
        if (bVar7 == null) {
            s.m("viewModel");
            throw null;
        }
        j jVar = bVar7.f47927c.f43524b;
        d dVar2 = jVar != null ? jVar.f185558w : null;
        boolean z14 = true;
        if (dVar2 != null ? dVar2.equals(bVar7.x4()) : true) {
            logger.debug("backPressed: Nothing to save, navigating back");
            g42.b bVar8 = this.f47909c;
            if (bVar8 != null) {
                bVar8.Z8();
                return;
            } else {
                s.m("preferenceListener");
                throw null;
            }
        }
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar9 = this.f47908b;
        if (bVar9 == null) {
            s.m("viewModel");
            throw null;
        }
        d dVarX5 = bVar9.x4();
        if (dVarX5 == null || (dVarX5.f75784a && (dVarX5.f75785b == null || dVarX5.f75786c == null))) {
            z14 = false;
        }
        if (!z14) {
            logger.warn("backPressed: NOT ready to save, how did we get to this state?");
            return;
        }
        g42.b bVar10 = this.f47909c;
        if (bVar10 == null) {
            s.m("preferenceListener");
            throw null;
        }
        if (bVar10.R0()) {
            logger.debug("backPressed: Starting save");
            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar11 = this.f47908b;
            if (bVar11 != null) {
                bVar11.B4();
                return;
            } else {
                s.m("viewModel");
                throw null;
            }
        }
        logger.debug("backPressed: No internet, showing error dialog");
        g42.b bVar12 = this.f47909c;
        if (bVar12 != null) {
            bVar12.F2();
        } else {
            s.m("preferenceListener");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        g42.b bVar = context instanceof g42.b ? (g42.b) context : null;
        if (bVar == null) {
            throw new ClassCastException("Activity must implement IWeatherLocationPreferenceListener!");
        }
        this.f47909c = bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.weather_location_preference_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String string;
        super.onResume();
        TextView textView = this.f47916j;
        if (textView == null) {
            s.m("currentPermissionStatusTextView");
            throw null;
        }
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f47908b;
        if (bVar == null) {
            s.m("viewModel");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView.setText(bVar.y4(contextRequireContext));
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = this.f47908b;
        if (bVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        Address address = (Address) bVar2.f47933i.d();
        if (address != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            string = t1.a(contextRequireContext2, address);
        } else {
            string = getString(R.string.lbl_add_a_location);
            string.getClass();
        }
        TextView textView2 = this.f47915i;
        if (textView2 != null) {
            textView2.setText(string);
        } else {
            s.m("locationDescriptionTextView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f47908b = (com.garmin.android.apps.connectmobile.weather.defaultlocation.b) new x1(mVarRequireActivity).b(s0.f105811a.b(com.garmin.android.apps.connectmobile.weather.defaultlocation.b.class));
        View viewFindViewById = view2.findViewById(R.id.usePhoneLocationTV);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.usePhoneLocationCL);
        viewFindViewById2.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        this.f47911e = constraintLayout;
        final int i14 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: g42.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75798b;

            {
                this.f75798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f75798b.f47908b;
                        if (bVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context context = view2.getContext();
                        context.getClass();
                        bVar.z4(context, du2.g.d.PHONE);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = this.f75798b.f47908b;
                        if (bVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context context2 = view2.getContext();
                        context2.getClass();
                        bVar2.z4(context2, du2.g.d.STATIC);
                        return;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.usePhoneLocationIV);
        viewFindViewById3.getClass();
        this.f47910d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.useStaticLocationTV);
        viewFindViewById4.getClass();
        View viewFindViewById5 = view2.findViewById(R.id.useStaticLocationCL);
        viewFindViewById5.getClass();
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById5;
        this.f47913g = constraintLayout2;
        final int i15 = 1;
        constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: g42.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75798b;

            {
                this.f75798b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f75798b.f47908b;
                        if (bVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context context = view2.getContext();
                        context.getClass();
                        bVar.z4(context, du2.g.d.PHONE);
                        return;
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = this.f75798b.f47908b;
                        if (bVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context context2 = view2.getContext();
                        context2.getClass();
                        bVar2.z4(context2, du2.g.d.STATIC);
                        return;
                }
            }
        });
        View viewFindViewById6 = view2.findViewById(R.id.useStaticLocationIV);
        viewFindViewById6.getClass();
        this.f47912f = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.selectStaticLocationCL);
        viewFindViewById7.getClass();
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindViewById7;
        this.f47914h = constraintLayout3;
        final int i16 = 0;
        constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: g42.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75801b;

            {
                this.f75801b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar = this.f75801b;
                switch (i17) {
                    case 0:
                        b bVar = aVar.f47909c;
                        if (bVar != null) {
                            bVar.b6();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a.C0932a c0932a = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.f47906o;
                        j22.b bVar2 = j22.b.f96736a;
                        androidx.fragment.app.m mVarRequireActivity2 = aVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.getClass();
                        j22.b.r(mVarRequireActivity2);
                        return;
                }
            }
        });
        View viewFindViewById8 = view2.findViewById(R.id.selectLocationDescriptionTV);
        viewFindViewById8.getClass();
        this.f47915i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.currentLocationPermissionStatusTV);
        viewFindViewById9.getClass();
        this.f47916j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.manageLocationPermissionLink);
        viewFindViewById10.getClass();
        TextView textView = (TextView) viewFindViewById10;
        this.f47917k = textView;
        final int i17 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: g42.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75801b;

            {
                this.f75801b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar = this.f75801b;
                switch (i18) {
                    case 0:
                        b bVar = aVar.f47909c;
                        if (bVar != null) {
                            bVar.b6();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a.C0932a c0932a = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.f47906o;
                        j22.b bVar2 = j22.b.f96736a;
                        androidx.fragment.app.m mVarRequireActivity2 = aVar.requireActivity();
                        mVarRequireActivity2.getClass();
                        bVar2.getClass();
                        j22.b.r(mVarRequireActivity2);
                        return;
                }
            }
        });
        View viewFindViewById11 = view2.findViewById(R.id.selectStaticLocationIV);
        viewFindViewById11.getClass();
        this.f47918l = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.devices_applied_list_fixed_location);
        viewFindViewById12.getClass();
        this.f47919m = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.devices_applied_list_phone_location);
        viewFindViewById13.getClass();
        this.f47920n = (TextView) viewFindViewById13;
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f47908b;
        if (bVar == null) {
            s.m("viewModel");
            throw null;
        }
        final int i18 = 0;
        bVar.f47926b.f(getViewLifecycleOwner(), new c(new l(this) { // from class: g42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75796b;

            {
                this.f75796b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) throws IOException {
                o13.p pVar;
                String string;
                switch (i18) {
                    case 0:
                        du2.g.d dVar = (du2.g.d) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for preferredLocationSource: ", dVar.name(), aVar.f47907a);
                        TextView textView2 = aVar.f47916j;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("currentPermissionStatusTextView");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = aVar.f47908b;
                        if (bVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        textView2.setText(bVar2.y4(contextRequireContext));
                        du2.g.d dVar2 = du2.g.d.PHONE;
                        boolean z14 = dVar == dVar2;
                        ImageView imageView = aVar.f47910d;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("usePhoneLocationImageView");
                            throw null;
                        }
                        imageView.setVisibility(z14 ? 0 : 8);
                        TextView textView3 = aVar.f47917k;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("managePermissionLinkTextView");
                            throw null;
                        }
                        textView3.setVisibility(z14 ? 0 : 8);
                        ImageView imageView2 = aVar.f47912f;
                        if (imageView2 == null) {
                            p005kotlin.jvm.internal.s.m("useStaticLocationImageView");
                            throw null;
                        }
                        imageView2.setVisibility(z14 ? 8 : 0);
                        ConstraintLayout constraintLayout4 = aVar.f47914h;
                        if (constraintLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("selectStaticLocationConstraintLayout");
                            throw null;
                        }
                        constraintLayout4.setVisibility(z14 ? 8 : 0);
                        TextView textView4 = aVar.f47920n;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                            throw null;
                        }
                        textView4.setVisibility(z14 ? 0 : 8);
                        TextView textView5 = aVar.f47919m;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                            throw null;
                        }
                        textView5.setVisibility(z14 ? 8 : 0);
                        boolean z15 = dVar == dVar2;
                        List<sd2.f> listB = n0.b();
                        listB.getClass();
                        List listB1 = h0.b1(listB);
                        if (listB1.size() > 1) {
                            Integer numValueOf = Integer.valueOf(listB1.size() - 1);
                            String string2 = aVar.getString(R.string.lbl_and);
                            Object objM0 = h0.m0(listB1);
                            objM0.getClass();
                            pVar = new o13.p(numValueOf, a0.j(StringUtils.SPACE, string2, StringUtils.SPACE, w2.a0.i((sd2.f) objM0)));
                        } else {
                            pVar = new o13.p(Integer.valueOf(listB1.size()), null);
                        }
                        int iIntValue = ((Number) pVar.f128594a).intValue();
                        String str = (String) pVar.f128595b;
                        StringBuilder sb3 = new StringBuilder("");
                        h0.j0(listB1.subList(0, iIntValue), sb3, ", ", null, null, new g11.e(10), 28);
                        if (str != null) {
                            sb3.append(str);
                        }
                        if (z15) {
                            TextView textView6 = aVar.f47920n;
                            if (textView6 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                                throw null;
                            }
                            textView6.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        } else {
                            TextView textView7 = aVar.f47919m;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                                throw null;
                            }
                            textView7.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Address address = (Address) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar2 = this.f75796b;
                        aVar2.f47907a.debug("Got update for temporary address: {}", address);
                        TextView textView8 = aVar2.f47915i;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationDescriptionTextView");
                            throw null;
                        }
                        if (address != null) {
                            Context contextRequireContext2 = aVar2.requireContext();
                            contextRequireContext2.getClass();
                            string = t1.a(contextRequireContext2, address);
                        } else {
                            string = aVar2.getString(R.string.lbl_add_a_location);
                            string.getClass();
                        }
                        textView8.setText(string);
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar3 = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for save status: ", mVar.f73769b.name(), aVar3.f47907a);
                        int i19 = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.b.f47921a[mVar.f73769b.ordinal()];
                        if (i19 == 1) {
                            g22.e.l(aVar3);
                        } else if (i19 == 2) {
                            g22.e.f(aVar3);
                            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar3 = aVar3.f47908b;
                            if (bVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            Context contextRequireContext3 = aVar3.requireContext();
                            contextRequireContext3.getClass();
                            d dVarX4 = bVar3.x4();
                            if (dVarX4 != null) {
                                du2.g.a aVar4 = du2.g.f61293g;
                                Double d14 = dVarX4.f75785b;
                                Double d15 = dVarX4.f75786c;
                                aVar4.getClass();
                                du2.g.a.e(contextRequireContext3, d14, d15);
                            }
                            b bVar4 = aVar3.f47909c;
                            if (bVar4 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar4.Z8();
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(aVar3);
                            b bVar5 = aVar3.f47909c;
                            if (bVar5 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar5.J1();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = this.f47908b;
        if (bVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i19 = 1;
        bVar2.f47933i.f(getViewLifecycleOwner(), new c(new l(this) { // from class: g42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75796b;

            {
                this.f75796b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) throws IOException {
                o13.p pVar;
                String string;
                switch (i19) {
                    case 0:
                        du2.g.d dVar = (du2.g.d) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for preferredLocationSource: ", dVar.name(), aVar.f47907a);
                        TextView textView2 = aVar.f47916j;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("currentPermissionStatusTextView");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar3 = aVar.f47908b;
                        if (bVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        textView2.setText(bVar3.y4(contextRequireContext));
                        du2.g.d dVar2 = du2.g.d.PHONE;
                        boolean z14 = dVar == dVar2;
                        ImageView imageView = aVar.f47910d;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("usePhoneLocationImageView");
                            throw null;
                        }
                        imageView.setVisibility(z14 ? 0 : 8);
                        TextView textView3 = aVar.f47917k;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("managePermissionLinkTextView");
                            throw null;
                        }
                        textView3.setVisibility(z14 ? 0 : 8);
                        ImageView imageView2 = aVar.f47912f;
                        if (imageView2 == null) {
                            p005kotlin.jvm.internal.s.m("useStaticLocationImageView");
                            throw null;
                        }
                        imageView2.setVisibility(z14 ? 8 : 0);
                        ConstraintLayout constraintLayout4 = aVar.f47914h;
                        if (constraintLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("selectStaticLocationConstraintLayout");
                            throw null;
                        }
                        constraintLayout4.setVisibility(z14 ? 8 : 0);
                        TextView textView4 = aVar.f47920n;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                            throw null;
                        }
                        textView4.setVisibility(z14 ? 0 : 8);
                        TextView textView5 = aVar.f47919m;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                            throw null;
                        }
                        textView5.setVisibility(z14 ? 8 : 0);
                        boolean z15 = dVar == dVar2;
                        List<sd2.f> listB = n0.b();
                        listB.getClass();
                        List listB1 = h0.b1(listB);
                        if (listB1.size() > 1) {
                            Integer numValueOf = Integer.valueOf(listB1.size() - 1);
                            String string2 = aVar.getString(R.string.lbl_and);
                            Object objM0 = h0.m0(listB1);
                            objM0.getClass();
                            pVar = new o13.p(numValueOf, a0.j(StringUtils.SPACE, string2, StringUtils.SPACE, w2.a0.i((sd2.f) objM0)));
                        } else {
                            pVar = new o13.p(Integer.valueOf(listB1.size()), null);
                        }
                        int iIntValue = ((Number) pVar.f128594a).intValue();
                        String str = (String) pVar.f128595b;
                        StringBuilder sb3 = new StringBuilder("");
                        h0.j0(listB1.subList(0, iIntValue), sb3, ", ", null, null, new g11.e(10), 28);
                        if (str != null) {
                            sb3.append(str);
                        }
                        if (z15) {
                            TextView textView6 = aVar.f47920n;
                            if (textView6 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                                throw null;
                            }
                            textView6.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        } else {
                            TextView textView7 = aVar.f47919m;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                                throw null;
                            }
                            textView7.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Address address = (Address) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar2 = this.f75796b;
                        aVar2.f47907a.debug("Got update for temporary address: {}", address);
                        TextView textView8 = aVar2.f47915i;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationDescriptionTextView");
                            throw null;
                        }
                        if (address != null) {
                            Context contextRequireContext2 = aVar2.requireContext();
                            contextRequireContext2.getClass();
                            string = t1.a(contextRequireContext2, address);
                        } else {
                            string = aVar2.getString(R.string.lbl_add_a_location);
                            string.getClass();
                        }
                        textView8.setText(string);
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar3 = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for save status: ", mVar.f73769b.name(), aVar3.f47907a);
                        int i110 = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.b.f47921a[mVar.f73769b.ordinal()];
                        if (i110 == 1) {
                            g22.e.l(aVar3);
                        } else if (i110 == 2) {
                            g22.e.f(aVar3);
                            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar4 = aVar3.f47908b;
                            if (bVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            Context contextRequireContext3 = aVar3.requireContext();
                            contextRequireContext3.getClass();
                            d dVarX4 = bVar4.x4();
                            if (dVarX4 != null) {
                                du2.g.a aVar4 = du2.g.f61293g;
                                Double d14 = dVarX4.f75785b;
                                Double d15 = dVarX4.f75786c;
                                aVar4.getClass();
                                du2.g.a.e(contextRequireContext3, d14, d15);
                            }
                            b bVar5 = aVar3.f47909c;
                            if (bVar5 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar5.Z8();
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(aVar3);
                            b bVar6 = aVar3.f47909c;
                            if (bVar6 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar6.J1();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar3 = this.f47908b;
        if (bVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i24 = 2;
        bVar3.f47930f.f(getViewLifecycleOwner(), new c(new l(this) { // from class: g42.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.a f75796b;

            {
                this.f75796b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) throws IOException {
                o13.p pVar;
                String string;
                switch (i24) {
                    case 0:
                        du2.g.d dVar = (du2.g.d) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for preferredLocationSource: ", dVar.name(), aVar.f47907a);
                        TextView textView2 = aVar.f47916j;
                        if (textView2 == null) {
                            p005kotlin.jvm.internal.s.m("currentPermissionStatusTextView");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar4 = aVar.f47908b;
                        if (bVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        textView2.setText(bVar4.y4(contextRequireContext));
                        du2.g.d dVar2 = du2.g.d.PHONE;
                        boolean z14 = dVar == dVar2;
                        ImageView imageView = aVar.f47910d;
                        if (imageView == null) {
                            p005kotlin.jvm.internal.s.m("usePhoneLocationImageView");
                            throw null;
                        }
                        imageView.setVisibility(z14 ? 0 : 8);
                        TextView textView3 = aVar.f47917k;
                        if (textView3 == null) {
                            p005kotlin.jvm.internal.s.m("managePermissionLinkTextView");
                            throw null;
                        }
                        textView3.setVisibility(z14 ? 0 : 8);
                        ImageView imageView2 = aVar.f47912f;
                        if (imageView2 == null) {
                            p005kotlin.jvm.internal.s.m("useStaticLocationImageView");
                            throw null;
                        }
                        imageView2.setVisibility(z14 ? 8 : 0);
                        ConstraintLayout constraintLayout4 = aVar.f47914h;
                        if (constraintLayout4 == null) {
                            p005kotlin.jvm.internal.s.m("selectStaticLocationConstraintLayout");
                            throw null;
                        }
                        constraintLayout4.setVisibility(z14 ? 8 : 0);
                        TextView textView4 = aVar.f47920n;
                        if (textView4 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                            throw null;
                        }
                        textView4.setVisibility(z14 ? 0 : 8);
                        TextView textView5 = aVar.f47919m;
                        if (textView5 == null) {
                            p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                            throw null;
                        }
                        textView5.setVisibility(z14 ? 8 : 0);
                        boolean z15 = dVar == dVar2;
                        List<sd2.f> listB = n0.b();
                        listB.getClass();
                        List listB1 = h0.b1(listB);
                        if (listB1.size() > 1) {
                            Integer numValueOf = Integer.valueOf(listB1.size() - 1);
                            String string2 = aVar.getString(R.string.lbl_and);
                            Object objM0 = h0.m0(listB1);
                            objM0.getClass();
                            pVar = new o13.p(numValueOf, a0.j(StringUtils.SPACE, string2, StringUtils.SPACE, w2.a0.i((sd2.f) objM0)));
                        } else {
                            pVar = new o13.p(Integer.valueOf(listB1.size()), null);
                        }
                        int iIntValue = ((Number) pVar.f128594a).intValue();
                        String str = (String) pVar.f128595b;
                        StringBuilder sb3 = new StringBuilder("");
                        h0.j0(listB1.subList(0, iIntValue), sb3, ", ", null, null, new g11.e(10), 28);
                        if (str != null) {
                            sb3.append(str);
                        }
                        if (z15) {
                            TextView textView6 = aVar.f47920n;
                            if (textView6 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListPhoneLocationTextView");
                                throw null;
                            }
                            textView6.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        } else {
                            TextView textView7 = aVar.f47919m;
                            if (textView7 == null) {
                                p005kotlin.jvm.internal.s.m("devicesListFixedLocationTextView");
                                throw null;
                            }
                            textView7.setText(aVar.getString(R.string.weather_setting_devices_applied_to, sb3.toString()));
                        }
                        return Unit.INSTANCE;
                    case 1:
                        Address address = (Address) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar2 = this.f75796b;
                        aVar2.f47907a.debug("Got update for temporary address: {}", address);
                        TextView textView8 = aVar2.f47915i;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("locationDescriptionTextView");
                            throw null;
                        }
                        if (address != null) {
                            Context contextRequireContext2 = aVar2.requireContext();
                            contextRequireContext2.getClass();
                            string = t1.a(contextRequireContext2, address);
                        } else {
                            string = aVar2.getString(R.string.lbl_add_a_location);
                            string.getClass();
                        }
                        textView8.setText(string);
                        return Unit.INSTANCE;
                    default:
                        fw.m mVar = (fw.m) obj;
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.a aVar3 = this.f75796b;
                        com.airbnb.lottie.animation.keyframe.a.w("Got update for save status: ", mVar.f73769b.name(), aVar3.f47907a);
                        int i110 = com.garmin.android.apps.connectmobile.weather.defaultlocation.a.b.f47921a[mVar.f73769b.ordinal()];
                        if (i110 == 1) {
                            g22.e.l(aVar3);
                        } else if (i110 == 2) {
                            g22.e.f(aVar3);
                            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar5 = aVar3.f47908b;
                            if (bVar5 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            Context contextRequireContext3 = aVar3.requireContext();
                            contextRequireContext3.getClass();
                            d dVarX4 = bVar5.x4();
                            if (dVarX4 != null) {
                                du2.g.a aVar4 = du2.g.f61293g;
                                Double d14 = dVarX4.f75785b;
                                Double d15 = dVarX4.f75786c;
                                aVar4.getClass();
                                du2.g.a.e(contextRequireContext3, d14, d15);
                            }
                            b bVar6 = aVar3.f47909c;
                            if (bVar6 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar6.Z8();
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(aVar3);
                            b bVar7 = aVar3.f47909c;
                            if (bVar7 == null) {
                                p005kotlin.jvm.internal.s.m("preferenceListener");
                                throw null;
                            }
                            bVar7.J1();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.e(contextRequireContext)) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            Resources resources = getResources();
            resources.getClass();
            int iC = (int) c22.b.c(contextRequireContext2, xy2.b.n(resources, 24.0f), 1.8f);
            ImageView imageView = this.f47910d;
            if (imageView == null) {
                s.m("usePhoneLocationImageView");
                throw null;
            }
            imageView.getLayoutParams().width = iC;
            ImageView imageView2 = this.f47910d;
            if (imageView2 == null) {
                s.m("usePhoneLocationImageView");
                throw null;
            }
            imageView2.getLayoutParams().height = iC;
            ImageView imageView3 = this.f47912f;
            if (imageView3 == null) {
                s.m("useStaticLocationImageView");
                throw null;
            }
            imageView3.getLayoutParams().width = iC;
            ImageView imageView4 = this.f47912f;
            if (imageView4 == null) {
                s.m("useStaticLocationImageView");
                throw null;
            }
            imageView4.getLayoutParams().height = iC;
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            Resources resources2 = getResources();
            resources2.getClass();
            int iC2 = (int) c22.b.c(contextRequireContext3, xy2.b.n(resources2, 24.0f), 1.8f);
            ImageView imageView5 = this.f47918l;
            if (imageView5 == null) {
                s.m("staticLocationArrowImageView");
                throw null;
            }
            imageView5.getLayoutParams().width = iC2;
            ImageView imageView6 = this.f47918l;
            if (imageView6 == null) {
                s.m("staticLocationArrowImageView");
                throw null;
            }
            imageView6.getLayoutParams().height = iC2;
        }
        ConstraintLayout constraintLayout4 = this.f47911e;
        if (constraintLayout4 == null) {
            s.m("usePhoneLocationConstraintLayout");
            throw null;
        }
        androidx.core.view.s0.r(constraintLayout4, new g42.j(this));
        ConstraintLayout constraintLayout5 = this.f47913g;
        if (constraintLayout5 != null) {
            androidx.core.view.s0.r(constraintLayout5, new k(this));
        } else {
            s.m("useStaticLocationConstraintLayout");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.weather.defaultlocation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/a$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0932a {
        public /* synthetic */ C0932a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0932a() {
        }
    }
}
