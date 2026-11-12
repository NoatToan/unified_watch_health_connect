package lo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ActivityTypesActivity;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.ActivitiesEditIntervalsActivity;
import com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.MultisportConversionActivity;
import com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.MultisportEditLegsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gncs.NotificationConstants;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class f extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f113735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ps.p f113736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f113741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f113742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113745r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Button f113746t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.e1 f113747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f113748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b.u f113749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public oo.b f113750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f113751z = new a(true);
    public final b A = new b();
    public final c B = new c();

    public class a extends b.s {
        public a(boolean z14) {
            super(z14);
        }

        @Override // b.s
        public final void b() {
            f.this.K6();
        }
    }

    public class b implements d80.b {
        public b() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            f fVar = f.this;
            g22.e.b(fVar, bVar);
            f.J6(fVar);
            g22.e.f(fVar);
            com.garmin.android.apps.connectmobile.e1 e1Var = fVar.f113747v;
            if (e1Var != null) {
                e1Var.onFragmentFinished(null, null);
            }
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            ht.d dVar = ht.d.f85467a;
            f fVar = f.this;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = fVar.f113735h;
            dVar.getClass();
            ht.d.a(hVar, false);
            ht.e eVar = fVar.f113950b;
            if (eVar != null) {
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("gas", eVar.f85468a);
                bundle.putBoolean("suit", eVar.f85469b);
                bundle.putBoolean("suit_thickness", eVar.f85470c);
                bundle.putBoolean("equipment", eVar.f85471d);
                aVar2.getClass();
                ht.a.a(bundle, "EditedDiveGear");
            }
            g22.e.f(fVar);
            f.J6(fVar);
            g22.e.l(fVar);
            am.b bVarM = am.b.M();
            long j8 = fVar.f113735h.f29448a;
            c cVar = fVar.B;
            bVarM.getClass();
            d80.f.b bVar = new d80.f.b(new Object[]{Long.toString(j8)}, lj0.a.f112938k);
            bVar.f58273c = com.garmin.android.apps.connectmobile.activities.newmodel.h.class;
            bVar.f58274d = cVar;
            bVar.f58275e = d80.g.JSON_OBJECT;
            bVar.f58277g = true;
            bVar.f58276f = new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_DETAILS, DateTimeConstants.MINUTES_PER_DAY);
            bVar.a().b();
            ((f12.l) KoinJavaComponent.get(f12.l.class)).T3(true);
            ((ou1.g) KoinJavaComponent.get(ou1.g.class)).a(true);
        }
    }

    public class c implements d80.b {
        public c() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            f fVar = f.this;
            g22.e.b(fVar, bVar);
            g22.e.f(fVar);
            com.garmin.android.apps.connectmobile.e1 e1Var = fVar.f113747v;
            if (e1Var != null) {
                e1Var.onFragmentFinished(null, null);
            }
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            f fVar = f.this;
            g22.e.f(fVar);
            if (fVar.getActivity() != null) {
                Intent intent = new Intent();
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) obj;
                hVar.f29462o = fVar.f113735h.f29462o;
                intent.putExtra("GCM_extra_activity_summary", hVar);
                fVar.getActivity().setResult(-1, intent);
                fVar.getActivity().finish();
            }
        }
    }

    public static void J6(f fVar) {
        fVar.getClass();
        qd2.a aVarB = qd2.a.b();
        if (aVarB == null || fVar.f113735h == null) {
            return;
        }
        aVarB.i(qd2.a.b.ACTIVITY_LIST);
        long j8 = fVar.f113735h.f29448a;
        aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, j8);
        aVarB.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, j8);
        aVarB.h(qd2.a.EnumC2721a.ACTIVITY_SEGMENTS, j8);
        aVarB.h(qd2.a.EnumC2721a.ACTIVITY_POLYLINE, j8);
    }

    @Override // lo.t, lo.f0.d
    public final void A0() {
        HelpActivity.da(requireContext(), ro0.l.DOGS, null, null);
    }

    @Override // lo.f0.d
    public final void A3(am.x0 x0Var, am.x0 x0Var2) {
        am.x0 x0VarC = this.f113735h.C();
        boolean z14 = this.f113742o;
        ActivityTypesActivity.f28779c.getClass();
        ActivityTypesActivity.a.b(this, x0VarC, x0Var, x0Var2, true, z14);
    }

    public final void K6() {
        if (!this.f113737j) {
            if (this.f113749x != null) {
                this.f113751z.f(false);
                this.f113749x.d();
                return;
            }
            return;
        }
        String string = getString(R.string.message_common_confirm_leaving_screen);
        lo.c cVar = new lo.c(this, 2);
        com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
        string.getClass();
        com.garmin.android.apps.connectmobile.q1 q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(0, string, R.string.lbl_yes, R.string.lbl_cancel, cVar);
        q1VarA.setCancelable(false);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        q1VarA.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    public final void M6() {
        Intent intent = new Intent(getActivity(), (Class<?>) ActivitiesEditIntervalsActivity.class);
        String str = this.f113748w;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.f4308n, str);
        intent.putExtra("GCM_extra_activity_type", (Parcelable) this.f113735h.C());
        intent.putExtra("GCM_extra_activity_splits", this.f113736i);
        intent.putExtra("RUNNING_ACTIVITY", zB);
        startActivityForResult(intent, 503);
    }

    @Override // lo.t, lo.f0.d
    public final void S4() {
        w6();
    }

    public final void S6() {
        Bundle bundle = new Bundle();
        bundle.putString("name", this.f113735h.f29449b);
        bundle.putString(NotificationConstants.KEY_DATA_MIME_TYPE, am.r1.f(this.f113735h.C()));
        bundle.putString("Time", Double.toString(this.f113735h.f29460m.f29516i));
        bundle.putString("Distance", Double.toString(this.f113735h.f29460m.f29512h));
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "ClickTrimActivity");
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113735h;
        ps.p pVar = this.f113736i;
        boolean z14 = this.f113739l;
        boolean z15 = this.f113740m;
        ActivitiesTrimActivity.f28809p.getClass();
        hVar.getClass();
        Intent intent = new Intent(getActivity(), (Class<?>) ActivitiesTrimActivity.class);
        Bundle bundle2 = new Bundle(4);
        bundle2.putParcelable("GCM_extra_activity_summary", hVar);
        bundle2.putParcelable("GCM_extra_activity_splits", pVar);
        bundle2.putBoolean("GCM_extra_has_trim_time_fragment", z14);
        bundle2.putBoolean("GCM_extra_has_trim_distance_fragment", z15);
        com.airbnb.lottie.animation.keyframe.a.q(com.garmin.android.apps.connectmobile.l2.f37135b, intent, bundle2);
        startActivityForResult(intent, 35);
    }

    public final void T6() {
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = this.f113735h.f29461n;
        if (sVar != null) {
            String str = sVar.f29658c;
            f0 f0Var = this.f113949a;
            boolean z14 = true;
            boolean z15 = str != null ? !str.equals(f0Var.Y1.get("suit_type")) : f0Var.Y1.get("suit_type") != null;
            boolean z16 = sVar.f29659d != this.f113949a.c0("suit_thickness");
            String str2 = sVar.f29665j;
            f0 f0Var2 = this.f113949a;
            if (str2 != null ? str2.equals(f0Var2.Y1.get("equipment")) : f0Var2.Y1.get("equipment") == null) {
                z14 = false;
            }
            if (z15 || z16 || z14) {
                if (this.f113950b == null) {
                    this.f113950b = new ht.e(false, false, false, false);
                }
                ht.e eVar = this.f113950b;
                eVar.f85470c = z16;
                eVar.f85471d = z14;
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVarA = s3.a(this.f113735h, this.f113949a);
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVarA.f29460m;
        if (i0Var != null && i0Var.f29549t > 65534.0d) {
            new androidx.appcompat.app.e.a(requireContext()).setMessage(R.string.activities_edit_activity_save_calorie_error).setPositiveButton(R.string.lbl_ok, new jm0.c(15)).create().show();
            return;
        }
        JSONObject jSONObjectA = r3.a(hVarA, this.f113735h.C());
        if (jSONObjectA == null || jSONObjectA.length() == 0) {
            com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesEditFragment", "updateActivity() has nothing to save");
            com.garmin.android.apps.connectmobile.e1 e1Var = this.f113747v;
            if (e1Var != null) {
                e1Var.onFragmentFinished(null, null);
                return;
            }
            return;
        }
        com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesEditFragment", "updateActivity() post new data to the server");
        g22.e.l(this);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113735h;
        og0.a aVar = og0.a.f131967a;
        hVar.getClass();
        ps.p0 p0Var = hVarA.f29456i;
        String typeKey = p0Var != null ? p0Var.getTypeKey() : null;
        ps.p0 p0Var2 = hVar.f29456i;
        String typeKey2 = p0Var2 != null ? p0Var2.getTypeKey() : null;
        qs.g.f147071e.getClass();
        i53.f fVarA = i53.a.a(qs.g.RACE, qs.g.SPECIAL_EVENT);
        if (!jSONObjectA.has("eventTypeDTO") || !fVarA.contains(qs.g.a.a(typeKey2)) || fVarA.contains(qs.g.a.a(typeKey)) || hVar.f29459l.getCalendarEventInfo() == null) {
            am.b bVarM = am.b.M();
            long j8 = hVarA.f29448a;
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = this.f113735h.f29460m;
            bVarM.N(j8, i0Var2 != null ? i0Var2.f29492c : 0L, jSONObjectA.toString(), this.A);
            return;
        }
        oo.b bVar = this.f113750y;
        long j14 = hVarA.f29448a;
        kk1.a aVar2 = new kk1.a(this, 13, hVarA, jSONObjectA);
        bVar.getClass();
        ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.j(bVar, j14, aVar2, null), 3);
    }

    @Override // lo.t, lo.f0.d
    public final void j0() {
        if (this.f113735h == null || this.f113736i == null || !this.f113737j) {
            M6();
            return;
        }
        String string = getString(R.string.edit_intervals_question);
        String string2 = getString(R.string.discard_unsaved_changes);
        lo.c cVar = new lo.c(this, 0);
        com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
        com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string, string2, R.string.lbl_common_continue, R.string.lbl_cancel, cVar);
        q1VarC.setCancelable(false);
        androidx.fragment.app.v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // lo.t, lo.f0.d
    public final void j1() {
        w6();
    }

    @Override // lo.f0.d
    public final void j4(am.x0 x0Var) {
        am.x0 x0VarC = this.f113735h.C();
        boolean z14 = this.f113742o;
        ActivityTypesActivity.f28779c.getClass();
        x0Var.getClass();
        ActivityTypesActivity.a.b(this, x0VarC, x0Var, null, true, z14);
    }

    @Override // lo.t, androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        ps.p pVar;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 503) {
            if (intent == null || intent.getExtras() == null || (pVar = (ps.p) am.a2.c(intent.getExtras(), "GCM_extra_activity_splits")) == null) {
                return;
            }
            this.f113736i = pVar;
            Intent intent2 = new Intent();
            intent2.putExtra("GCM_extra_activity_splits", this.f113736i);
            getActivity().setResult(-1, intent2);
            getActivity().finish();
            return;
        }
        if (i14 == 10 && i15 == -1) {
            String stringExtra = intent.getStringExtra("GCM_extra_activity_type");
            this.f113744q = intent.getBooleanExtra("GCM_extra_unlink_event", false);
            am.x0 x0VarL = am.z0.l(am.x0.f4308n, stringExtra);
            com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesEditFragment", "Activity Type changed to " + x0VarL.f4358a + " fetching privacy to check if custom per activity type");
            g22.e.l(this);
            am.l lVar = this.f113949a.H1;
            oo.b bVar = this.f113750y;
            bVar.getClass();
            lVar.getClass();
            t13.g gVar = androidx.lifecycle.v1.a(bVar).f183565a;
            x53.c cVar = o53.s0.f129406a;
            androidx.lifecycle.m.a(gVar.plus(x53.b.f189152a), new oo.c(bVar, lVar, x0VarL, null), 2).f(getViewLifecycleOwner(), new lh2.i(this, 4, lVar, x0VarL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f113747v = (com.garmin.android.apps.connectmobile.e1) context;
        } catch (ClassCastException e4) {
            com.garmin.android.apps.connectmobile.i2.f(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesEditFragment", e4.getMessage() + " -- Host activity must implement the FragmentFinishListener interface.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        this.f113749x = onBackPressedDispatcher;
        onBackPressedDispatcher.b(this.f113751z, this);
    }

    @Override // lo.t, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        f0 f0Var;
        GCMComplexOneLineButton gCMComplexOneLineButton;
        ps.a1 a1Var;
        ps.a1 a1Var2;
        super.onViewCreated(view2, bundle);
        this.f113750y = (oo.b) new androidx.lifecycle.x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(oo.b.class));
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        Bundle bundleC = com.garmin.android.apps.connectmobile.l2.a.b().c(this);
        final int i14 = 0;
        long j8 = -1;
        if (bundleC != null) {
            this.f113738k = bundleC.getBoolean("GCM_extra_has_trim_chart_data", false);
            this.f113739l = bundleC.getBoolean("GCM_extra_has_trim_time_fragment", false);
            this.f113740m = bundleC.getBoolean("GCM_extra_has_trim_distance_fragment", false);
            this.f113745r = bundleC.getBoolean("GCM_supports_advanced_leg_editing", false);
            this.f113741n = bundleC.getBoolean("GCM_has_device_info", false);
            j8 = bundleC.getLong("GCM_extra_activity_parent_id", -1L);
            string = bundleC.getString("GCM_extra_activity_parent_type_key", null);
        } else {
            string = null;
        }
        ps.r rVar = (ps.r) am.a2.c(bundleC, "GCM_extra_activity_summary");
        this.f113735h = rVar != null ? fr.a.g(rVar, (ps.s0) am.a2.c(bundleC, "GCM_workout_exercise_set")) : null;
        this.f113736i = (ps.p) am.a2.c(bundleC, "GCM_extra_activity_splits");
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113735h;
        this.f113748w = (hVar == null ? am.x0.f4346x : hVar.C()).f4358a;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113735h;
        final int i15 = 1;
        this.f113742o = (hVar2 == null || hVar2.f29459l.getCalendarEventInfo() == null) ? false : true;
        ps.p pVar = this.f113736i;
        if (pVar != null) {
            this.f113743p = zf.b.A(pVar.i());
        }
        this.f113949a = new f0(requireActivity(), this.f113735h, this.f113741n, Calendar.getInstance(Locale.getDefault()), this, this.f113743p);
        view2.findViewById(R.id.btn_cancel_manual_activity).setOnClickListener(new View.OnClickListener(this) { // from class: lo.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f113730b;

            {
                this.f113730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3;
                switch (i14) {
                    case 0:
                        this.f113730b.K6();
                        break;
                    case 1:
                        f fVar = this.f113730b;
                        if (!fVar.f113744q) {
                            fVar.T6();
                        } else {
                            oo.b bVar = fVar.f113750y;
                            long j14 = fVar.f113735h.f29448a;
                            bVar.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.i(bVar, j14, null), 3);
                        }
                        break;
                    case 2:
                        f fVar2 = this.f113730b;
                        if (g22.e.e(fVar2) && fVar2.f113735h != null && fVar2.f113736i != null) {
                            if (!fVar2.f113737j) {
                                fVar2.S6();
                            } else {
                                String string2 = fVar2.getString(R.string.activities_trim_activity_question);
                                String string3 = fVar2.getString(R.string.activities_override_changes);
                                c cVar = new c(fVar2, 1);
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.lbl_yes, R.string.lbl_cancel, cVar);
                                q1VarC.setCancelable(false);
                                androidx.fragment.app.v childFragmentManager = fVar2.getChildFragmentManager();
                                childFragmentManager.getClass();
                                q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                            }
                            break;
                        }
                        break;
                    case 3:
                        f fVar3 = this.f113730b;
                        if (g22.e.e(fVar3) && (hVar3 = fVar3.f113735h) != null && fVar3.f113736i != null) {
                            long j15 = hVar3.f29448a;
                            zo.k kVar = zo.k.NORMAL_FLOW;
                            MultisportEditLegsActivity.f29307b.getClass();
                            MultisportEditLegsActivity.a.a(fVar3, j15, 36, kVar);
                            break;
                        }
                        break;
                    default:
                        f fVar4 = this.f113730b;
                        if (g22.e.e(fVar4)) {
                            long j16 = fVar4.f113735h.f29448a;
                            MultisportConversionActivity.f29306a.getClass();
                            Intent intent = new Intent(fVar4.getActivity(), (Class<?>) MultisportConversionActivity.class);
                            intent.putExtra("GCM_extra_activity_id", j16);
                            fVar4.startActivityForResult(intent, 37);
                        }
                        break;
                }
            }
        });
        Button button = (Button) view2.findViewById(R.id.btn_save_manual_activity);
        this.f113746t = button;
        button.setEnabled(false);
        this.f113746t.setOnClickListener(new View.OnClickListener(this) { // from class: lo.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f113730b;

            {
                this.f113730b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3;
                switch (i15) {
                    case 0:
                        this.f113730b.K6();
                        break;
                    case 1:
                        f fVar = this.f113730b;
                        if (!fVar.f113744q) {
                            fVar.T6();
                        } else {
                            oo.b bVar = fVar.f113750y;
                            long j14 = fVar.f113735h.f29448a;
                            bVar.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.i(bVar, j14, null), 3);
                        }
                        break;
                    case 2:
                        f fVar2 = this.f113730b;
                        if (g22.e.e(fVar2) && fVar2.f113735h != null && fVar2.f113736i != null) {
                            if (!fVar2.f113737j) {
                                fVar2.S6();
                            } else {
                                String string2 = fVar2.getString(R.string.activities_trim_activity_question);
                                String string3 = fVar2.getString(R.string.activities_override_changes);
                                c cVar = new c(fVar2, 1);
                                com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.lbl_yes, R.string.lbl_cancel, cVar);
                                q1VarC.setCancelable(false);
                                androidx.fragment.app.v childFragmentManager = fVar2.getChildFragmentManager();
                                childFragmentManager.getClass();
                                q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                            }
                            break;
                        }
                        break;
                    case 3:
                        f fVar3 = this.f113730b;
                        if (g22.e.e(fVar3) && (hVar3 = fVar3.f113735h) != null && fVar3.f113736i != null) {
                            long j15 = hVar3.f29448a;
                            zo.k kVar = zo.k.NORMAL_FLOW;
                            MultisportEditLegsActivity.f29307b.getClass();
                            MultisportEditLegsActivity.a.a(fVar3, j15, 36, kVar);
                            break;
                        }
                        break;
                    default:
                        f fVar4 = this.f113730b;
                        if (g22.e.e(fVar4)) {
                            long j16 = fVar4.f113735h.f29448a;
                            MultisportConversionActivity.f29306a.getClass();
                            Intent intent = new Intent(fVar4.getActivity(), (Class<?>) MultisportConversionActivity.class);
                            intent.putExtra("GCM_extra_activity_id", j16);
                            fVar4.startActivityForResult(intent, 37);
                        }
                        break;
                }
            }
        });
        boolean zJ = ((am.d) KoinJavaComponent.get(am.d.class)).J();
        boolean zH = am.z0.H(this.f113748w);
        boolean z14 = am.z0.H(this.f113748w) && !this.f113745r;
        String str = this.f113748w;
        boolean z15 = j8 > 0 ? bm.m.d(str).booleanValue() && string != null && bm.m.d(string).booleanValue() : bm.m.d(str).booleanValue() || this.f113745r;
        boolean z16 = j8 > 0 && bm.m.d(this.f113748w).booleanValue();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = this.f113735h;
        boolean z17 = (hVar3 == null || (a1Var2 = hVar3.f29459l) == null || a1Var2.getFileFormat() == null || TextUtils.isEmpty(hVar3.f29459l.getFileFormat().getFormatKey()) || !hVar3.f29459l.getFileFormat().getFormatKey().equalsIgnoreCase("fit")) ? false : true;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = this.f113735h;
        boolean z18 = (hVar4 == null || (a1Var = hVar4.f29459l) == null || a1Var.getManufacturer() == null || !hVar4.f29459l.getManufacturer().toLowerCase(Locale.ROOT).contains("tacx")) ? false : true;
        final int i16 = 2;
        if (zJ && z15 && z17 && !z18 && this.f113741n && this.f113738k && this.f113739l && !z14 && j8 <= 0) {
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f113949a.Y0;
            if (gCMComplexOneLineButton2 != null) {
                gCMComplexOneLineButton2.setVisibility(0);
            }
            f0 f0Var2 = this.f113949a;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: lo.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f113730b;

                {
                    this.f113730b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5;
                    switch (i16) {
                        case 0:
                            this.f113730b.K6();
                            break;
                        case 1:
                            f fVar = this.f113730b;
                            if (!fVar.f113744q) {
                                fVar.T6();
                            } else {
                                oo.b bVar = fVar.f113750y;
                                long j14 = fVar.f113735h.f29448a;
                                bVar.getClass();
                                ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.i(bVar, j14, null), 3);
                            }
                            break;
                        case 2:
                            f fVar2 = this.f113730b;
                            if (g22.e.e(fVar2) && fVar2.f113735h != null && fVar2.f113736i != null) {
                                if (!fVar2.f113737j) {
                                    fVar2.S6();
                                } else {
                                    String string2 = fVar2.getString(R.string.activities_trim_activity_question);
                                    String string3 = fVar2.getString(R.string.activities_override_changes);
                                    c cVar = new c(fVar2, 1);
                                    com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                    com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.lbl_yes, R.string.lbl_cancel, cVar);
                                    q1VarC.setCancelable(false);
                                    androidx.fragment.app.v childFragmentManager = fVar2.getChildFragmentManager();
                                    childFragmentManager.getClass();
                                    q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                                }
                                break;
                            }
                            break;
                        case 3:
                            f fVar3 = this.f113730b;
                            if (g22.e.e(fVar3) && (hVar5 = fVar3.f113735h) != null && fVar3.f113736i != null) {
                                long j15 = hVar5.f29448a;
                                zo.k kVar = zo.k.NORMAL_FLOW;
                                MultisportEditLegsActivity.f29307b.getClass();
                                MultisportEditLegsActivity.a.a(fVar3, j15, 36, kVar);
                                break;
                            }
                            break;
                        default:
                            f fVar4 = this.f113730b;
                            if (g22.e.e(fVar4)) {
                                long j16 = fVar4.f113735h.f29448a;
                                MultisportConversionActivity.f29306a.getClass();
                                Intent intent = new Intent(fVar4.getActivity(), (Class<?>) MultisportConversionActivity.class);
                                intent.putExtra("GCM_extra_activity_id", j16);
                                fVar4.startActivityForResult(intent, 37);
                            }
                            break;
                    }
                }
            };
            GCMComplexOneLineButton gCMComplexOneLineButton3 = f0Var2.Y0;
            if (gCMComplexOneLineButton3 != null) {
                gCMComplexOneLineButton3.setOnClickListener(onClickListener);
            }
        } else if (z16 && zJ && z15 && z17 && !z18 && this.f113741n && this.f113738k && this.f113739l && (gCMComplexOneLineButton = (f0Var = this.f113949a).Y0) != null) {
            gCMComplexOneLineButton.setVisibility(0);
            f0Var.Y0.setEnabled(false);
            f0Var.Y0.setButtonBottomHint(R.string.msg_multisport_child_trim_not_available);
        }
        if (this.f113745r && z17 && this.f113741n && this.f113738k && this.f113739l) {
            GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f113949a.Z0;
            if (gCMComplexOneLineButton4 != null) {
                gCMComplexOneLineButton4.setVisibility(0);
            }
            f0 f0Var3 = this.f113949a;
            final int i17 = 3;
            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: lo.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f113730b;

                {
                    this.f113730b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5;
                    switch (i17) {
                        case 0:
                            this.f113730b.K6();
                            break;
                        case 1:
                            f fVar = this.f113730b;
                            if (!fVar.f113744q) {
                                fVar.T6();
                            } else {
                                oo.b bVar = fVar.f113750y;
                                long j14 = fVar.f113735h.f29448a;
                                bVar.getClass();
                                ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.i(bVar, j14, null), 3);
                            }
                            break;
                        case 2:
                            f fVar2 = this.f113730b;
                            if (g22.e.e(fVar2) && fVar2.f113735h != null && fVar2.f113736i != null) {
                                if (!fVar2.f113737j) {
                                    fVar2.S6();
                                } else {
                                    String string2 = fVar2.getString(R.string.activities_trim_activity_question);
                                    String string3 = fVar2.getString(R.string.activities_override_changes);
                                    c cVar = new c(fVar2, 1);
                                    com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                    com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.lbl_yes, R.string.lbl_cancel, cVar);
                                    q1VarC.setCancelable(false);
                                    androidx.fragment.app.v childFragmentManager = fVar2.getChildFragmentManager();
                                    childFragmentManager.getClass();
                                    q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                                }
                                break;
                            }
                            break;
                        case 3:
                            f fVar3 = this.f113730b;
                            if (g22.e.e(fVar3) && (hVar5 = fVar3.f113735h) != null && fVar3.f113736i != null) {
                                long j15 = hVar5.f29448a;
                                zo.k kVar = zo.k.NORMAL_FLOW;
                                MultisportEditLegsActivity.f29307b.getClass();
                                MultisportEditLegsActivity.a.a(fVar3, j15, 36, kVar);
                                break;
                            }
                            break;
                        default:
                            f fVar4 = this.f113730b;
                            if (g22.e.e(fVar4)) {
                                long j16 = fVar4.f113735h.f29448a;
                                MultisportConversionActivity.f29306a.getClass();
                                Intent intent = new Intent(fVar4.getActivity(), (Class<?>) MultisportConversionActivity.class);
                                intent.putExtra("GCM_extra_activity_id", j16);
                                fVar4.startActivityForResult(intent, 37);
                            }
                            break;
                    }
                }
            };
            GCMComplexOneLineButton gCMComplexOneLineButton5 = f0Var3.Z0;
            if (gCMComplexOneLineButton5 != null) {
                gCMComplexOneLineButton5.setOnClickListener(onClickListener2);
            }
        }
        if (zJ && z15 && z17 && !z18 && this.f113741n && this.f113738k && this.f113739l && !zH && j8 <= 0) {
            GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f113949a.f113757a1;
            if (gCMComplexOneLineButton6 != null) {
                gCMComplexOneLineButton6.setVisibility(0);
            }
            f0 f0Var4 = this.f113949a;
            final int i18 = 4;
            View.OnClickListener onClickListener3 = new View.OnClickListener(this) { // from class: lo.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f113730b;

                {
                    this.f113730b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5;
                    switch (i18) {
                        case 0:
                            this.f113730b.K6();
                            break;
                        case 1:
                            f fVar = this.f113730b;
                            if (!fVar.f113744q) {
                                fVar.T6();
                            } else {
                                oo.b bVar = fVar.f113750y;
                                long j14 = fVar.f113735h.f29448a;
                                bVar.getClass();
                                ge1.b.T(androidx.lifecycle.v1.a(bVar), null, null, new oo.i(bVar, j14, null), 3);
                            }
                            break;
                        case 2:
                            f fVar2 = this.f113730b;
                            if (g22.e.e(fVar2) && fVar2.f113735h != null && fVar2.f113736i != null) {
                                if (!fVar2.f113737j) {
                                    fVar2.S6();
                                } else {
                                    String string2 = fVar2.getString(R.string.activities_trim_activity_question);
                                    String string3 = fVar2.getString(R.string.activities_override_changes);
                                    c cVar = new c(fVar2, 1);
                                    com.garmin.android.apps.connectmobile.q1.f41066b.getClass();
                                    com.garmin.android.apps.connectmobile.q1 q1VarC = com.garmin.android.apps.connectmobile.q1.b.c(string2, string3, R.string.lbl_yes, R.string.lbl_cancel, cVar);
                                    q1VarC.setCancelable(false);
                                    androidx.fragment.app.v childFragmentManager = fVar2.getChildFragmentManager();
                                    childFragmentManager.getClass();
                                    q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                                }
                                break;
                            }
                            break;
                        case 3:
                            f fVar3 = this.f113730b;
                            if (g22.e.e(fVar3) && (hVar5 = fVar3.f113735h) != null && fVar3.f113736i != null) {
                                long j15 = hVar5.f29448a;
                                zo.k kVar = zo.k.NORMAL_FLOW;
                                MultisportEditLegsActivity.f29307b.getClass();
                                MultisportEditLegsActivity.a.a(fVar3, j15, 36, kVar);
                                break;
                            }
                            break;
                        default:
                            f fVar4 = this.f113730b;
                            if (g22.e.e(fVar4)) {
                                long j16 = fVar4.f113735h.f29448a;
                                MultisportConversionActivity.f29306a.getClass();
                                Intent intent = new Intent(fVar4.getActivity(), (Class<?>) MultisportConversionActivity.class);
                                intent.putExtra("GCM_extra_activity_id", j16);
                                fVar4.startActivityForResult(intent, 37);
                            }
                            break;
                    }
                }
            };
            GCMComplexOneLineButton gCMComplexOneLineButton7 = f0Var4.f113757a1;
            if (gCMComplexOneLineButton7 != null) {
                gCMComplexOneLineButton7.setOnClickListener(onClickListener3);
            }
        }
        this.f113949a.R0();
        ((androidx.lifecycle.s0) this.f113750y.f133063m.getValue()).f(getViewLifecycleOwner(), new d(this, 1));
        bv.b.f21240b.getClass();
        if (com.garmin.android.apps.connectmobile.k1.f37122a.H0()) {
            oo.b bVar = this.f113750y;
            bVar.getClass();
            t13.g gVar = androidx.lifecycle.v1.a(bVar).f183565a;
            x53.c cVar = o53.s0.f129406a;
            androidx.lifecycle.m.a(gVar.plus(x53.b.f189152a), new oo.e(null), 2).f(getViewLifecycleOwner(), new d(this, 2));
        }
    }

    @Override // lo.t, lo.f0.d
    public final void u() {
        startActivity(((am.d) KoinJavaComponent.get(am.d.class)).j0(requireContext()));
    }

    @Override // lo.t
    public final void w6() {
        if (this.f113737j) {
            return;
        }
        this.f113737j = true;
        Button button = this.f113746t;
        if (button != null) {
            button.setEnabled(true);
        }
    }
}
