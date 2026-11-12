package com.garmin.android.apps.connectmobile.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import b.s;
import b.u;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.google.maps.android.BuildConfig;
import ew1.h1;
import gg1.l0;
import k32.l;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wn1.h;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/e;", "Landroidx/fragment/app/Fragment;", "Lwn1/h$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment implements h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f43401l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f43402a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f43404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f43406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f43407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f43408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f43409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f43410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f43411j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43403b = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f43412k = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/e$b", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            e eVar = e.this;
            if (!eVar.f43405d) {
                eVar.requireActivity().finish();
                return;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.b(a2Var, "IndexSmartScaleUserSettingsFragment", ".onBackPressed() Saving");
            if (eVar.isAdded()) {
                g22.e.l(eVar);
            }
            h hVar = eVar.f43402a;
            if (hVar != null) {
                hVar.d();
            } else {
                p005kotlin.jvm.internal.s.m("dtoAssembler");
                throw null;
            }
        }
    }

    @Override // wn1.h.b
    public final void O4(String str) {
        Toast.makeText(requireContext(), getString(R.string.txt_error_occurred) + StringUtils.SPACE + str, 0).show();
        if (isAdded()) {
            g22.e.f(this);
        }
        requireActivity().finish();
    }

    @Override // wn1.h.b
    public final void c3(String str) {
        Toast.makeText(requireContext(), getString(R.string.msg_error_retrieving_user_profile_data) + StringUtils.SPACE + str, 0).show();
        g22.e.f(this);
        requireActivity().finish();
    }

    @Override // wn1.h.b
    public final void l0() {
        g22.e.f(this);
        String strT = GCMSettingManager.t(this.f43403b);
        String str = !TextUtils.isEmpty(strT) ? strT : "";
        l lVar = this.f43406e;
        if (lVar == null) {
            p005kotlin.jvm.internal.s.m("userShortNameItem");
            throw null;
        }
        String string = getResources().getString(R.string.smart_scale_user_settings_lbl_short_name);
        string.getClass();
        if (TextUtils.isEmpty(strT)) {
            strT = "";
        }
        lVar.b(string, strT);
        l lVar2 = this.f43406e;
        if (lVar2 == null) {
            p005kotlin.jvm.internal.s.m("userShortNameItem");
            throw null;
        }
        lVar2.f102707b.setOnClickListener(new cw2.b(19, this, str));
        l lVar3 = this.f43407f;
        if (lVar3 == null) {
            p005kotlin.jvm.internal.s.m("userDateOfBirthItem");
            throw null;
        }
        lVar3.a(R.string.lbl_birthdate, null);
        f12.l.f68084a.getClass();
        LocalDate localDateL1 = f12.l.a.a().l1();
        if (localDateL1 != null) {
            String strPrint = DateTimeFormat.mediumDate().print(localDateL1);
            l lVar4 = this.f43407f;
            if (lVar4 == null) {
                p005kotlin.jvm.internal.s.m("userDateOfBirthItem");
                throw null;
            }
            lVar4.h(strPrint);
        }
        l lVar5 = this.f43407f;
        if (lVar5 == null) {
            p005kotlin.jvm.internal.s.m("userDateOfBirthItem");
            throw null;
        }
        final int i14 = 0;
        lVar5.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: gg1.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77275b;

            {
                this.f77275b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.e eVar = this.f77275b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        View view3 = eVar.getView();
                        Context context = view3 != null ? view3.getContext() : null;
                        String[] stringArray = eVar.getResources().getStringArray(R.array.gcm_user_genders_display);
                        stringArray.getClass();
                        String[] stringArray2 = eVar.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray2.getClass();
                        f12.l.f68084a.getClass();
                        int iM = p13.u.M(stringArray2, f12.l.a.a().w());
                        if (context != null) {
                            new androidx.appcompat.app.e.a(context).setTitle(eVar.getResources().getString(R.string.lbl_gender)).setSingleChoiceItems(stringArray, iM, new ag0.d(28, stringArray2, eVar)).show();
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        new com.garmin.android.apps.connectmobile.settings.d(eVar.requireContext(), new n0(eVar));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new n0(eVar), 254, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        rk1.b.C2900b c2900b = new rk1.b.C2900b(eVar.requireContext());
                        String string2 = eVar.getString(R.string.lbl_activity_class);
                        rk1.b.d dVar = c2900b.f153344b;
                        dVar.f153346b = string2;
                        c2900b.e(0);
                        c2900b.d(10);
                        f12.l.f68084a.getClass();
                        c2900b.c(Integer.valueOf(f12.l.a.a().e2()));
                        dVar.f153345a = 1;
                        c2900b.f(new aq.z(eVar, 1));
                        c2900b.a();
                        eVar.f43405d = true;
                        break;
                }
            }
        });
        l lVar6 = this.f43408g;
        if (lVar6 == null) {
            p005kotlin.jvm.internal.s.m("userGenderItem");
            throw null;
        }
        String string2 = getResources().getString(R.string.lbl_gender);
        string2.getClass();
        lVar6.b(string2, null);
        v6(f12.l.a.a().w());
        l lVar7 = this.f43408g;
        if (lVar7 == null) {
            p005kotlin.jvm.internal.s.m("userGenderItem");
            throw null;
        }
        final int i15 = 1;
        lVar7.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: gg1.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77275b;

            {
                this.f77275b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.e eVar = this.f77275b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        View view3 = eVar.getView();
                        Context context = view3 != null ? view3.getContext() : null;
                        String[] stringArray = eVar.getResources().getStringArray(R.array.gcm_user_genders_display);
                        stringArray.getClass();
                        String[] stringArray2 = eVar.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray2.getClass();
                        f12.l.f68084a.getClass();
                        int iM = p13.u.M(stringArray2, f12.l.a.a().w());
                        if (context != null) {
                            new androidx.appcompat.app.e.a(context).setTitle(eVar.getResources().getString(R.string.lbl_gender)).setSingleChoiceItems(stringArray, iM, new ag0.d(28, stringArray2, eVar)).show();
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        new com.garmin.android.apps.connectmobile.settings.d(eVar.requireContext(), new n0(eVar));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new n0(eVar), 254, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        rk1.b.C2900b c2900b = new rk1.b.C2900b(eVar.requireContext());
                        String string3 = eVar.getString(R.string.lbl_activity_class);
                        rk1.b.d dVar = c2900b.f153344b;
                        dVar.f153346b = string3;
                        c2900b.e(0);
                        c2900b.d(10);
                        f12.l.f68084a.getClass();
                        c2900b.c(Integer.valueOf(f12.l.a.a().e2()));
                        dVar.f153345a = 1;
                        c2900b.f(new aq.z(eVar, 1));
                        c2900b.a();
                        eVar.f43405d = true;
                        break;
                }
            }
        });
        l lVar8 = this.f43409h;
        if (lVar8 == null) {
            p005kotlin.jvm.internal.s.m("userHeightItem");
            throw null;
        }
        String string3 = getResources().getString(R.string.lbl_height);
        string3.getClass();
        l3.a aVar = l3.f23124b;
        lVar8.b(string3, l3.a.n0(aVar, requireContext(), f12.l.a.a().t(), f12.l.a.a().y()));
        l lVar9 = this.f43409h;
        if (lVar9 == null) {
            p005kotlin.jvm.internal.s.m("userHeightItem");
            throw null;
        }
        final int i16 = 2;
        lVar9.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: gg1.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77275b;

            {
                this.f77275b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.settings.e eVar = this.f77275b;
                switch (i17) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        View view3 = eVar.getView();
                        Context context = view3 != null ? view3.getContext() : null;
                        String[] stringArray = eVar.getResources().getStringArray(R.array.gcm_user_genders_display);
                        stringArray.getClass();
                        String[] stringArray2 = eVar.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray2.getClass();
                        f12.l.f68084a.getClass();
                        int iM = p13.u.M(stringArray2, f12.l.a.a().w());
                        if (context != null) {
                            new androidx.appcompat.app.e.a(context).setTitle(eVar.getResources().getString(R.string.lbl_gender)).setSingleChoiceItems(stringArray, iM, new ag0.d(28, stringArray2, eVar)).show();
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        new com.garmin.android.apps.connectmobile.settings.d(eVar.requireContext(), new n0(eVar));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new n0(eVar), 254, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        rk1.b.C2900b c2900b = new rk1.b.C2900b(eVar.requireContext());
                        String string4 = eVar.getString(R.string.lbl_activity_class);
                        rk1.b.d dVar = c2900b.f153344b;
                        dVar.f153346b = string4;
                        c2900b.e(0);
                        c2900b.d(10);
                        f12.l.f68084a.getClass();
                        c2900b.c(Integer.valueOf(f12.l.a.a().e2()));
                        dVar.f153345a = 1;
                        c2900b.f(new aq.z(eVar, 1));
                        c2900b.a();
                        eVar.f43405d = true;
                        break;
                }
            }
        });
        l lVar10 = this.f43410i;
        if (lVar10 == null) {
            p005kotlin.jvm.internal.s.m("userWeightItem");
            throw null;
        }
        String string4 = getResources().getString(R.string.card_weight_title);
        string4.getClass();
        lVar10.b(string4, l3.a.C1(aVar, requireContext(), f12.l.a.a().v3(), f12.l.a.a().y(), false, null, 56));
        l lVar11 = this.f43410i;
        if (lVar11 == null) {
            p005kotlin.jvm.internal.s.m("userWeightItem");
            throw null;
        }
        final int i17 = 3;
        lVar11.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: gg1.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77275b;

            {
                this.f77275b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                com.garmin.android.apps.connectmobile.settings.e eVar = this.f77275b;
                switch (i18) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        View view3 = eVar.getView();
                        Context context = view3 != null ? view3.getContext() : null;
                        String[] stringArray = eVar.getResources().getStringArray(R.array.gcm_user_genders_display);
                        stringArray.getClass();
                        String[] stringArray2 = eVar.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray2.getClass();
                        f12.l.f68084a.getClass();
                        int iM = p13.u.M(stringArray2, f12.l.a.a().w());
                        if (context != null) {
                            new androidx.appcompat.app.e.a(context).setTitle(eVar.getResources().getString(R.string.lbl_gender)).setSingleChoiceItems(stringArray, iM, new ag0.d(28, stringArray2, eVar)).show();
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        new com.garmin.android.apps.connectmobile.settings.d(eVar.requireContext(), new n0(eVar));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new n0(eVar), 254, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        rk1.b.C2900b c2900b = new rk1.b.C2900b(eVar.requireContext());
                        String string5 = eVar.getString(R.string.lbl_activity_class);
                        rk1.b.d dVar = c2900b.f153344b;
                        dVar.f153346b = string5;
                        c2900b.e(0);
                        c2900b.d(10);
                        f12.l.f68084a.getClass();
                        c2900b.c(Integer.valueOf(f12.l.a.a().e2()));
                        dVar.f153345a = 1;
                        c2900b.f(new aq.z(eVar, 1));
                        c2900b.a();
                        eVar.f43405d = true;
                        break;
                }
            }
        });
        l lVar12 = this.f43411j;
        if (lVar12 == null) {
            p005kotlin.jvm.internal.s.m("userActivityClassItem");
            throw null;
        }
        String string5 = getResources().getString(R.string.lbl_activity_class);
        string5.getClass();
        lVar12.b(string5, null);
        if (f12.l.a.a().e2() != -1) {
            l lVar13 = this.f43411j;
            if (lVar13 == null) {
                p005kotlin.jvm.internal.s.m("userActivityClassItem");
                throw null;
            }
            lVar13.h(String.valueOf(f12.l.a.a().e2()));
        }
        l lVar14 = this.f43411j;
        if (lVar14 == null) {
            p005kotlin.jvm.internal.s.m("userActivityClassItem");
            throw null;
        }
        final int i18 = 4;
        lVar14.f102707b.setOnClickListener(new View.OnClickListener(this) { // from class: gg1.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.e f77275b;

            {
                this.f77275b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                com.garmin.android.apps.connectmobile.settings.e eVar = this.f77275b;
                switch (i19) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        eVar.startActivity(new Intent(eVar.requireContext(), (Class<?>) UpdateBirthdateActivity.class));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar3 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        View view3 = eVar.getView();
                        Context context = view3 != null ? view3.getContext() : null;
                        String[] stringArray = eVar.getResources().getStringArray(R.array.gcm_user_genders_display);
                        stringArray.getClass();
                        String[] stringArray2 = eVar.getResources().getStringArray(R.array.gcm_user_genders_values);
                        stringArray2.getClass();
                        f12.l.f68084a.getClass();
                        int iM = p13.u.M(stringArray2, f12.l.a.a().w());
                        if (context != null) {
                            new androidx.appcompat.app.e.a(context).setTitle(eVar.getResources().getString(R.string.lbl_gender)).setSingleChoiceItems(stringArray, iM, new ag0.d(28, stringArray2, eVar)).show();
                        }
                        break;
                    case 2:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        new com.garmin.android.apps.connectmobile.settings.d(eVar.requireContext(), new n0(eVar));
                        break;
                    case 3:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        new j42.b(contextRequireContext, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new n0(eVar), 254, (p005kotlin.jvm.internal.j) null);
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.e.a aVar6 = com.garmin.android.apps.connectmobile.settings.e.f43401l;
                        rk1.b.C2900b c2900b = new rk1.b.C2900b(eVar.requireContext());
                        String string6 = eVar.getString(R.string.lbl_activity_class);
                        rk1.b.d dVar = c2900b.f153344b;
                        dVar.f153346b = string6;
                        c2900b.e(0);
                        c2900b.d(10);
                        f12.l.f68084a.getClass();
                        c2900b.c(Integer.valueOf(f12.l.a.a().e2()));
                        dVar.f153345a = 1;
                        c2900b.f(new aq.z(eVar, 1));
                        c2900b.a();
                        eVar.f43405d = true;
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f43412k, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f43403b = arguments != null ? arguments.getLong("REMOTE_DEVICE_ID") : -1L;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("PRODUCT_NUMBER") : null;
        this.f43404c = string;
        this.f43402a = new h(this.f43403b, string, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_settings_index_smart_scale_personal_info, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        h hVar = this.f43402a;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        hVar.a();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        h hVar = this.f43402a;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        hVar.c();
        g22.e.l(this);
        View viewFindViewById = view2.findViewById(R.id.settings_smart_scale_user_short_name_item);
        viewFindViewById.getClass();
        this.f43406e = new l(viewFindViewById);
        View viewFindViewById2 = view2.findViewById(R.id.settings_smart_scale_user_date_of_birth_item);
        viewFindViewById2.getClass();
        this.f43407f = new l(viewFindViewById2);
        View viewFindViewById3 = view2.findViewById(R.id.settings_smart_scale_user_genders_display_item);
        viewFindViewById3.getClass();
        this.f43408g = new l(viewFindViewById3);
        View viewFindViewById4 = view2.findViewById(R.id.settings_smart_scale_user_height_item);
        viewFindViewById4.getClass();
        this.f43409h = new l(viewFindViewById4);
        View viewFindViewById5 = view2.findViewById(R.id.settings_smart_scale_user_weight_item);
        viewFindViewById5.getClass();
        this.f43410i = new l(viewFindViewById5);
        View viewFindViewById6 = view2.findViewById(R.id.settings_smart_scale_activity_class_item);
        viewFindViewById6.getClass();
        this.f43411j = new l(viewFindViewById6);
    }

    public final void u6(String str, String str2) {
        String str3 = this.f43404c;
        u0 u0Var = u0.S5;
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(u0.n(str3, u0Var) ? 5 : 4), new InputFilter.AllCaps(), new l0(0)};
        String string = getString(R.string.smart_scale_user_settings_lbl_short_name);
        string.getClass();
        int i14 = u0.n(this.f43404c, u0Var) ? 5 : 4;
        h1 h1Var = new h1(this, 10);
        int i15 = wn1.a.f186174k;
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("KEY_TITLE", string);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("KEY_INITIAL_VALUE", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("KEY_INITIAL_EXCEPTION", str2);
        }
        bundle.putInt("KEY_MAX_LENGTH", i14);
        wn1.a aVar = new wn1.a();
        aVar.setArguments(bundle);
        aVar.f186178d = h1Var;
        h hVar = this.f43402a;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        aVar.f186179e = hVar.f186235c;
        aVar.f186180f = inputFilterArr;
        aVar.show(requireActivity().getFragmentManager(), BuildConfig.TRAVIS);
    }

    public final void v6(String str) {
        if (str.length() > 0) {
            if (p005kotlin.jvm.internal.s.g(str, getString(R.string.user_gender_value_male))) {
                l lVar = this.f43408g;
                if (lVar != null) {
                    lVar.h(getResources().getString(R.string.lbl_gender_male));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("userGenderItem");
                    throw null;
                }
            }
            if (p005kotlin.jvm.internal.s.g(str, getString(R.string.user_gender_value_female))) {
                l lVar2 = this.f43408g;
                if (lVar2 != null) {
                    lVar2.h(getResources().getString(R.string.lbl_gender_female));
                } else {
                    p005kotlin.jvm.internal.s.m("userGenderItem");
                    throw null;
                }
            }
        }
    }

    @Override // wn1.h.b
    public final void x5() {
        this.f43405d = false;
        Toast.makeText(requireContext(), getText(R.string.msg_settings_saved_successfully), 1).show();
        if (isAdded()) {
            g22.e.f(this);
        }
        requireActivity().finish();
    }

    @Override // wn1.h.b
    public final void z1() {
        if (isAdded()) {
            g22.e.f(this);
        }
        String strT = GCMSettingManager.t(this.f43403b);
        h hVar = this.f43402a;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("dtoAssembler");
            throw null;
        }
        hVar.f186235c.getClass();
        u6(strT, getString(R.string.msg_duplicate_short_name));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/e$a;", "", "<init>", "()V", "", "REMOTE_DEVICE_ID", "Ljava/lang/String;", "PRODUCT_NUMBER", "", "MINIMUM_ACTIVITY_CLASS", "I", "MAXIMUM_ACTIVITY_CLASS", "SCALE_NAME_MAX_LENGTH", "MERCURY_NAME_MAX_LENGTH", "TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
