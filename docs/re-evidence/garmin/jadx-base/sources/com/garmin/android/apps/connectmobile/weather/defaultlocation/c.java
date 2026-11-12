package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import c22.b0;
import c22.t1;
import c22.z1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.library.mapsdkadapter.f;
import com.garmin.android.library.mapsdkadapter.i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.textfield.TextInputEditText;
import e23.l;
import g42.o;
import g42.p;
import g42.q;
import g42.v;
import ie2.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import me2.z;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.u;
import p13.x;
import p13.y;
import qe2.h;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/c;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "Lg42/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements i.l, g42.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f47939y = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f47940a = m.b(new g12.m(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f47941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g42.c f47942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputEditText f47943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextInputEditText f47944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f47945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f47946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f47947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f47948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f47949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f47950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMMapView f47951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f47952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f47953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Spinner f47954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<String> f47955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f47956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f47957r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f47958t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f47959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bl0.a f47960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f47961x;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f47962a;

        public b(l lVar) {
            lVar.getClass();
            this.f47962a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f47962a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47962a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.weather.defaultlocation.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0934c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            String str = (String) t7;
            b0 b0Var = b0.f23008a;
            str.getClass();
            b0Var.getClass();
            String strA = b0.a(str, false);
            String str2 = (String) t14;
            str2.getClass();
            return r13.a.b(strA, b0.a(str2, false));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/weather/defaultlocation/c$d", "Landroid/widget/AdapterView$OnItemSelectedListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view2, int i14, long j8) {
            c cVar = c.this;
            if (!cVar.f47958t) {
                cVar.f47958t = true;
                return;
            }
            cVar.v6(false);
            String str = cVar.f47955p.get(i14);
            b0.f23008a.getClass();
            String strA = b0.a(str, true);
            cVar.f47956q = strA;
            cVar.w6().debug("onItemSelected: Got ".concat(strA));
            g42.c cVar2 = cVar.f47942c;
            if (cVar2 == null) {
                s.m("preferenceListener");
                throw null;
            }
            if (!cVar2.R0()) {
                cVar.w6().warn("onItemSelected: Internet is turned off, not searching for country");
            } else if (cVar.f47941b != null) {
                androidx.lifecycle.m.a(null, new g42.s(strA, null), 3).f(cVar.getViewLifecycleOwner(), new b(new g42.n(cVar, strA, 2)));
            } else {
                s.m("viewModel");
                throw null;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public c() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        this.f47955p = u.Y(iSOCountries, new C0934c());
        this.f47957r = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f();
        this.f47960w = new bl0.a(this, 3);
        this.f47961x = new d();
    }

    public final void A6(boolean z14) {
        LinearLayout linearLayout = this.f47946g;
        if (linearLayout == null) {
            s.m("searchLocationLinearLayout");
            throw null;
        }
        linearLayout.setVisibility((!z14 || this.f47957r) ? 8 : 0);
        LinearLayout linearLayout2 = this.f47948i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(z14 ? 8 : 0);
        } else {
            s.m("selectedLocationLinearLayout");
            throw null;
        }
    }

    public final void C6(Address address, boolean z14) {
        String string;
        String strA;
        String string2;
        w6().debug("updateLocationTextFields with address: {}", address);
        TextView textView = this.f47949j;
        if (textView == null) {
            s.m("selectedCityTextView");
            throw null;
        }
        textView.setVisibility(0);
        if (address == null) {
            TextInputEditText textInputEditText = this.f47944e;
            if (textInputEditText == null) {
                s.m("postalCodeEditText");
                throw null;
            }
            textInputEditText.setText((CharSequence) null);
            TextView textView2 = this.f47949j;
            if (textView2 == null) {
                s.m("selectedCityTextView");
                throw null;
            }
            textView2.setText((CharSequence) null);
            TextView textView3 = this.f47950k;
            if (textView3 != null) {
                textView3.setText((CharSequence) null);
                return;
            } else {
                s.m("selectedCountryTextView");
                throw null;
            }
        }
        TextInputEditText textInputEditText2 = this.f47943d;
        if (textInputEditText2 == null) {
            s.m("countryValueEditText");
            throw null;
        }
        String countryCode = address.getCountryCode();
        if (countryCode != null) {
            b0.f23008a.getClass();
            string = b0.a(countryCode, false);
        } else {
            string = getString(R.string.lbl_unknown);
            string.getClass();
        }
        textInputEditText2.setText(string);
        String countryCode2 = address.getCountryCode();
        if (countryCode2 != null) {
            b0.f23008a.getClass();
            strA = b0.a(countryCode2, false);
        } else {
            strA = null;
        }
        this.f47956q = strA;
        if (z14) {
            TextInputEditText textInputEditText3 = this.f47944e;
            if (textInputEditText3 == null) {
                s.m("postalCodeEditText");
                throw null;
            }
            textInputEditText3.setText(address.getPostalCode());
        }
        TextView textView4 = this.f47949j;
        if (textView4 == null) {
            s.m("selectedCityTextView");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        textView4.setText(t1.a(contextRequireContext, address));
        TextView textView5 = this.f47950k;
        if (textView5 == null) {
            s.m("selectedCountryTextView");
            throw null;
        }
        String countryCode3 = address.getCountryCode();
        if (countryCode3 != null) {
            b0.f23008a.getClass();
            string2 = b0.a(countryCode3, false);
        } else {
            string2 = getString(R.string.lbl_unknown);
            string2.getClass();
        }
        textView5.setText(string2);
    }

    public final void E6(f fVar) {
        Logger loggerW6 = w6();
        z1.f23762a.getClass();
        loggerW6.debug("updateLocationTextFieldsWithUnknown: ".concat(z1.c(fVar)));
        TextInputEditText textInputEditText = this.f47943d;
        if (textInputEditText == null) {
            s.m("countryValueEditText");
            throw null;
        }
        textInputEditText.setText(getString(R.string.lbl_unknown));
        TextInputEditText textInputEditText2 = this.f47944e;
        if (textInputEditText2 == null) {
            s.m("postalCodeEditText");
            throw null;
        }
        textInputEditText2.setText("");
        TextView textView = this.f47949j;
        if (this.f47957r) {
            if (textView == null) {
                s.m("selectedCityTextView");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            if (textView == null) {
                s.m("selectedCityTextView");
                throw null;
            }
            textView.setText(z1.c(fVar));
        }
        TextView textView2 = this.f47950k;
        if (textView2 != null) {
            textView2.setText(getString(R.string.lbl_unknown));
        } else {
            s.m("selectedCountryTextView");
            throw null;
        }
    }

    public final void F6(boolean z14) {
        g.y("updateSearchLocationButton: ", z14, w6());
        TextView textView = this.f47947h;
        if (textView == null) {
            s.m("searchLocationButton");
            throw null;
        }
        textView.setEnabled(z14);
        TextView textView2 = this.f47947h;
        if (textView2 != null) {
            textView2.setAlpha(z14 ? 1.0f : 0.7f);
        } else {
            s.m("searchLocationButton");
            throw null;
        }
    }

    public final void G6(f fVar, float f14) {
        Logger loggerW6 = w6();
        z1.f23762a.getClass();
        loggerW6.debug("zoomMap: Going to " + z1.c(fVar) + " with zoom level " + f14);
        h hVar = this.f47952m;
        if (hVar != null) {
            i.a.b(hVar, fVar, f14, 4);
        } else {
            s.m("map");
            throw null;
        }
    }

    @Override // g42.a
    public final void K3() {
        g42.c cVar = this.f47942c;
        if (cVar != null) {
            cVar.Z8();
        } else {
            s.m("preferenceListener");
            throw null;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(i.d dVar) {
        dVar.getClass();
        w6().error("onMapUnavailable: statusCode=-1");
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView != null) {
            gCMMapView.c();
        } else {
            s.m("mapView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(i iVar) {
        w6().debug("onMapReady:");
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView == null) {
            s.m("mapView");
            throw null;
        }
        gCMMapView.b();
        iVar.O(new en0.n(this, 23));
        iVar.setMapType(1);
        q qVar = this.f47941b;
        if (qVar == null) {
            s.m("viewModel");
            throw null;
        }
        Address address = (Address) qVar.f75819c.d();
        if (address != null) {
            w6().debug("zoomInitialMap: Used temporary address: {}", address);
            z1 z1Var = z1.f23762a;
            h hVar = this.f47952m;
            if (hVar == null) {
                s.m("map");
                throw null;
            }
            i.d f50264r = hVar.f144584a.getF50264r();
            z1Var.getClass();
            f fVarA = z1.a(address, f50264r);
            C6(address, true);
            G6(fVarA, 12.0f);
            u6(address, fVarA.f50283a);
            A6(false);
        } else {
            g42.c cVar = this.f47942c;
            if (cVar == null) {
                s.m("preferenceListener");
                throw null;
            }
            if (cVar.R0()) {
                q qVar2 = this.f47941b;
                if (qVar2 == null) {
                    s.m("viewModel");
                    throw null;
                }
                String str = qVar2.f75822f;
                if (str == null) {
                    str = qVar2.f75823g;
                }
                if (str != null) {
                    com.airbnb.lottie.animation.keyframe.a.u("zoomInitialMap: received a non-null description string=(", str, ")", w6());
                    if (this.f47941b == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    q.A4(str).f(getViewLifecycleOwner(), new b(new g42.n(this, str, 0)));
                } else {
                    w6().debug("zoomInitialMap: description string is null, searching for other locations...");
                    q qVar3 = this.f47941b;
                    if (qVar3 == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    androidx.lifecycle.m.a(null, new v(qVar3, contextRequireContext, null), 3).f(getViewLifecycleOwner(), new b(new o(this, 0)));
                }
            } else {
                w6().warn("zoomInitialMap: Internet is turned off");
            }
        }
        gCMMapView.setImportantForAccessibility(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        g42.c cVar = context instanceof g42.c ? (g42.c) context : null;
        if (cVar == null) {
            throw new ClassCastException("Activity must implement IWeatherLocationSelectionListener!");
        }
        this.f47942c = cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_weather_location_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView != null) {
            gCMMapView.onDestroy();
        } else {
            s.m("mapView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView != null) {
            gCMMapView.onLowMemory();
        } else {
            s.m("mapView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView != null) {
            gCMMapView.onPause();
        } else {
            s.m("mapView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView != null) {
            gCMMapView.onResume();
        } else {
            s.m("mapView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f47941b = (q) new x1(mVarRequireActivity).b(s0.f105811a.b(q.class));
        View viewFindViewById = view2.findViewById(R.id.locationSelectionMV);
        viewFindViewById.getClass();
        this.f47951l = (GCMMapView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.countryValueET);
        viewFindViewById2.getClass();
        TextInputEditText textInputEditText = (TextInputEditText) viewFindViewById2;
        this.f47943d = textInputEditText;
        final int i14 = 0;
        textInputEditText.setOnClickListener(new View.OnClickListener(this) { // from class: g42.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75809b;

            {
                this.f75809b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                int i15 = i14;
                int i16 = 1;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75809b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.w6().debug("countryRowClicked");
                        cVar.y6();
                        c cVar2 = cVar.f47942c;
                        if (cVar2 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar2.R0()) {
                            Spinner spinner = cVar.f47954o;
                            if (spinner != null) {
                                spinner.performClick();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("countriesSpinner");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        c cVar3 = cVar.f47942c;
                        if (cVar3 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar3.R0()) {
                            TextInputEditText textInputEditText2 = cVar.f47944e;
                            if (textInputEditText2 == null) {
                                p005kotlin.jvm.internal.s.m("postalCodeEditText");
                                throw null;
                            }
                            Editable text = textInputEditText2.getText();
                            if (text == null || (string = text.toString()) == null) {
                                return;
                            }
                            if (d53.w.i0(string).toString().length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                return;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            String str = cVar.f47956q;
                            if (str != null) {
                                sb3.append(str);
                                sb3.append(StringUtils.SPACE);
                            }
                            sb3.append(string);
                            if (cVar.f47941b != null) {
                                q.A4(sb3.toString()).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new n(cVar, string, i16)));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        c cVar4 = cVar.f47942c;
                        if (cVar4 != null) {
                            cVar4.Z8();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.y6();
                        cVar.z6();
                        cVar.C6(null, true);
                        cVar.F6(false);
                        cVar.A6(true);
                        cVar.v6(false);
                        q qVar = cVar.f47941b;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Logger logger = q.f75816h;
                        qVar.C4(null, null);
                        return;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.postalCodeET);
        viewFindViewById3.getClass();
        TextInputEditText textInputEditText2 = (TextInputEditText) viewFindViewById3;
        this.f47944e = textInputEditText2;
        textInputEditText2.setOnEditorActionListener(this.f47960w);
        TextInputEditText textInputEditText3 = this.f47944e;
        if (textInputEditText3 == null) {
            s.m("postalCodeEditText");
            throw null;
        }
        textInputEditText3.addTextChangedListener(new p(this));
        View viewFindViewById4 = view2.findViewById(R.id.postalCodeErrorTV);
        viewFindViewById4.getClass();
        this.f47945f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.searchLocationLL);
        viewFindViewById5.getClass();
        this.f47946g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.searchLocationBtn);
        viewFindViewById6.getClass();
        TextView textView = (TextView) viewFindViewById6;
        this.f47947h = textView;
        final int i15 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: g42.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75809b;

            {
                this.f75809b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                int i16 = i15;
                int i17 = 1;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75809b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.w6().debug("countryRowClicked");
                        cVar.y6();
                        c cVar2 = cVar.f47942c;
                        if (cVar2 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar2.R0()) {
                            Spinner spinner = cVar.f47954o;
                            if (spinner != null) {
                                spinner.performClick();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("countriesSpinner");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        c cVar3 = cVar.f47942c;
                        if (cVar3 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar3.R0()) {
                            TextInputEditText textInputEditText4 = cVar.f47944e;
                            if (textInputEditText4 == null) {
                                p005kotlin.jvm.internal.s.m("postalCodeEditText");
                                throw null;
                            }
                            Editable text = textInputEditText4.getText();
                            if (text == null || (string = text.toString()) == null) {
                                return;
                            }
                            if (d53.w.i0(string).toString().length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                return;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            String str = cVar.f47956q;
                            if (str != null) {
                                sb3.append(str);
                                sb3.append(StringUtils.SPACE);
                            }
                            sb3.append(string);
                            if (cVar.f47941b != null) {
                                q.A4(sb3.toString()).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new n(cVar, string, i17)));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        c cVar4 = cVar.f47942c;
                        if (cVar4 != null) {
                            cVar4.Z8();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.y6();
                        cVar.z6();
                        cVar.C6(null, true);
                        cVar.F6(false);
                        cVar.A6(true);
                        cVar.v6(false);
                        q qVar = cVar.f47941b;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Logger logger = q.f75816h;
                        qVar.C4(null, null);
                        return;
                }
            }
        });
        View viewFindViewById7 = view2.findViewById(R.id.selectedLocationLL);
        viewFindViewById7.getClass();
        this.f47948i = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.selectedCityNameTV);
        viewFindViewById8.getClass();
        this.f47949j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.selectedCountryNameTV);
        viewFindViewById9.getClass();
        this.f47950k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.setLocationBtn);
        viewFindViewById10.getClass();
        final int i16 = 2;
        ((TextView) viewFindViewById10).setOnClickListener(new View.OnClickListener(this) { // from class: g42.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75809b;

            {
                this.f75809b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                int i17 = i16;
                int i18 = 1;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75809b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.w6().debug("countryRowClicked");
                        cVar.y6();
                        c cVar2 = cVar.f47942c;
                        if (cVar2 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar2.R0()) {
                            Spinner spinner = cVar.f47954o;
                            if (spinner != null) {
                                spinner.performClick();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("countriesSpinner");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        c cVar3 = cVar.f47942c;
                        if (cVar3 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar3.R0()) {
                            TextInputEditText textInputEditText4 = cVar.f47944e;
                            if (textInputEditText4 == null) {
                                p005kotlin.jvm.internal.s.m("postalCodeEditText");
                                throw null;
                            }
                            Editable text = textInputEditText4.getText();
                            if (text == null || (string = text.toString()) == null) {
                                return;
                            }
                            if (d53.w.i0(string).toString().length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                return;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            String str = cVar.f47956q;
                            if (str != null) {
                                sb3.append(str);
                                sb3.append(StringUtils.SPACE);
                            }
                            sb3.append(string);
                            if (cVar.f47941b != null) {
                                q.A4(sb3.toString()).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new n(cVar, string, i18)));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        c cVar4 = cVar.f47942c;
                        if (cVar4 != null) {
                            cVar4.Z8();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.y6();
                        cVar.z6();
                        cVar.C6(null, true);
                        cVar.F6(false);
                        cVar.A6(true);
                        cVar.v6(false);
                        q qVar = cVar.f47941b;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Logger logger = q.f75816h;
                        qVar.C4(null, null);
                        return;
                }
            }
        });
        View viewFindViewById11 = view2.findViewById(R.id.cancelSelectedLocationBtn);
        viewFindViewById11.getClass();
        final int i17 = 3;
        ((ImageView) viewFindViewById11).setOnClickListener(new View.OnClickListener(this) { // from class: g42.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75809b;

            {
                this.f75809b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                String string;
                int i18 = i17;
                int i19 = 1;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75809b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.w6().debug("countryRowClicked");
                        cVar.y6();
                        c cVar2 = cVar.f47942c;
                        if (cVar2 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar2.R0()) {
                            Spinner spinner = cVar.f47954o;
                            if (spinner != null) {
                                spinner.performClick();
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("countriesSpinner");
                                throw null;
                            }
                        }
                        return;
                    case 1:
                        c cVar3 = cVar.f47942c;
                        if (cVar3 == null) {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                        if (cVar3.R0()) {
                            TextInputEditText textInputEditText4 = cVar.f47944e;
                            if (textInputEditText4 == null) {
                                p005kotlin.jvm.internal.s.m("postalCodeEditText");
                                throw null;
                            }
                            Editable text = textInputEditText4.getText();
                            if (text == null || (string = text.toString()) == null) {
                                return;
                            }
                            if (d53.w.i0(string).toString().length() <= 0) {
                                string = null;
                            }
                            if (string == null) {
                                return;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            String str = cVar.f47956q;
                            if (str != null) {
                                sb3.append(str);
                                sb3.append(StringUtils.SPACE);
                            }
                            sb3.append(string);
                            if (cVar.f47941b != null) {
                                q.A4(sb3.toString()).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new n(cVar, string, i19)));
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                        }
                        return;
                    case 2:
                        c cVar4 = cVar.f47942c;
                        if (cVar4 != null) {
                            cVar4.Z8();
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("preferenceListener");
                            throw null;
                        }
                    default:
                        com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                        cVar.y6();
                        cVar.z6();
                        cVar.C6(null, true);
                        cVar.F6(false);
                        cVar.A6(true);
                        cVar.v6(false);
                        q qVar = cVar.f47941b;
                        if (qVar == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        Logger logger = q.f75816h;
                        qVar.C4(null, null);
                        return;
                }
            }
        });
        GCMMapView gCMMapView = this.f47951l;
        if (gCMMapView == null) {
            s.m("mapView");
            throw null;
        }
        gCMMapView.setupMap(this);
        GCMMapView gCMMapView2 = this.f47951l;
        if (gCMMapView2 == null) {
            s.m("mapView");
            throw null;
        }
        gCMMapView2.onCreate(bundle);
        GCMMapView gCMMapView3 = this.f47951l;
        if (gCMMapView3 == null) {
            s.m("mapView");
            throw null;
        }
        this.f47952m = gCMMapView3.getMapProxy();
        View viewFindViewById12 = view2.findViewById(R.id.weatherLocationTooltipTV);
        viewFindViewById12.getClass();
        this.f47953n = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.countriesSpinner);
        viewFindViewById13.getClass();
        this.f47954o = (Spinner) viewFindViewById13;
        A6(true);
        List<String> list = this.f47955p;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (String str : list) {
            b0.f23008a.getClass();
            arrayList.add(b0.a(str, false));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(requireContext(), R.layout.simple_spinner_item, h0.M0(arrayList));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = this.f47954o;
        if (spinner == null) {
            s.m("countriesSpinner");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(this.f47961x);
        List listK = x.k(j22.f.ALLOWED_WHILE_USING, j22.f.ALLOWED_ALL_TIME);
        j22.b bVar = j22.b.f96736a;
        Context context = view2.getContext();
        context.getClass();
        bVar.getClass();
        boolean zContains = listK.contains(j22.b.j(context));
        g.y("enableCompass: Location permission enabled = ", zContains, w6());
        h hVar = this.f47952m;
        if (hVar == null) {
            s.m("map");
            throw null;
        }
        hVar.setMyLocationEnabled(zContains);
        w6().debug("monitorInternetConnection: observing state");
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        az0.b.f13675f.f(viewLifecycleOwner, new b(new o(this, 1)));
        if (this.f47941b == null) {
            s.m("viewModel");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        du2.g.f61293g.getClass();
        if (du2.g.a.b(contextRequireContext).getBoolean("key_user_has_seen_map_tooltip", false)) {
            return;
        }
        TextView textView2 = this.f47953n;
        if (textView2 == null) {
            s.m("tooltipView");
            throw null;
        }
        textView2.setVisibility(0);
        if (this.f47941b == null) {
            s.m("viewModel");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        du2.g.a.b(contextRequireContext2).edit().putBoolean("key_user_has_seen_map_tooltip", true).apply();
    }

    public final void u6(Address address, LatLng latLng) {
        f fVarA;
        w6().debug("addMarker: latLng=[{}], address=[{}]", latLng, address);
        z6();
        if (latLng != null) {
            fVarA = z.b(latLng);
        } else {
            if (address == null) {
                return;
            }
            z1 z1Var = z1.f23762a;
            h hVar = this.f47952m;
            if (hVar == null) {
                s.m("map");
                throw null;
            }
            i.d f50264r = hVar.f144584a.getF50264r();
            z1Var.getClass();
            fVarA = z1.a(address, f50264r);
        }
        h hVar2 = this.f47952m;
        if (hVar2 == null) {
            s.m("map");
            throw null;
        }
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.d(fVarA);
        this.f47959v = hVar2.x(pVar);
    }

    public final void v6(boolean z14) {
        g.y("configurePostalCodeErrorState: ", z14, w6());
        Drawable drawable = z14 ? a7.b.getDrawable(requireContext(), 2131231971) : null;
        ColorStateList colorStateListValueOf = z14 ? ColorStateList.valueOf(requireContext().getColor(R.color.gcm_button_danger)) : ColorStateList.valueOf(requireContext().getColor(R.color.dark_gray));
        colorStateListValueOf.getClass();
        TextView textView = this.f47945f;
        if (textView == null) {
            s.m("postalCodeErrorTextView");
            throw null;
        }
        textView.setVisibility(z14 ? 0 : 8);
        TextInputEditText textInputEditText = this.f47944e;
        if (textInputEditText == null) {
            s.m("postalCodeEditText");
            throw null;
        }
        textInputEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        TextInputEditText textInputEditText2 = this.f47944e;
        if (textInputEditText2 == null) {
            s.m("postalCodeEditText");
            throw null;
        }
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        textInputEditText2.setBackgroundTintList(colorStateListValueOf);
    }

    public final Logger w6() {
        return (Logger) this.f47940a.getValue();
    }

    public final void y6() {
        w6().debug("hideTooltip");
        TextView textView = this.f47953n;
        if (textView == null) {
            s.m("tooltipView");
            throw null;
        }
        if (textView.getVisibility() == 0) {
            TextView textView2 = this.f47953n;
            if (textView2 != null) {
                textView2.setVisibility(8);
            } else {
                s.m("tooltipView");
                throw null;
            }
        }
    }

    public final void z6() {
        j jVar = this.f47959v;
        if (jVar != null) {
            h hVar = this.f47952m;
            if (hVar == null) {
                s.m("map");
                throw null;
            }
            for (j jVar2 : hVar.f144584a.Q()) {
                if (s.g(jVar2.getPosition(), jVar.getPosition())) {
                    h hVar2 = this.f47952m;
                    if (hVar2 == null) {
                        s.m("map");
                        throw null;
                    }
                    hVar2.n(jVar2);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/c$a;", "", "<init>", "()V", "", "DEFAULT_ZOOM_FAR", "F", "DEFAULT_ZOOM_NEAR", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
