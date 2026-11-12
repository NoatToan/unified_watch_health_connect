package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.s0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import dd0.k;
import java.util.Date;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class g extends Fragment {
    public EditText A;
    public EditText B;
    public EditText C;
    public EditText D;
    public EditText E;
    public RelativeLayout F;
    public TextView I;
    public UserSettingsDTO T;
    public JSONObject X;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f34546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f34547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f34548k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c f34549k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f34550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f34551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f34552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f34553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f34554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f34555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f34556r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f34557t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f34558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f34559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f34560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f34561y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f34562z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34538a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f34539b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalDate f34540c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34541d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f34542e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34543f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34544g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34545h = "";
    public l P = null;
    public long Y = -1;
    public final Boolean Z = Boolean.valueOf(k1.f37122a.r());
    public final a H0 = new a();
    public final k I0 = new k(this, 3);

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            g gVar = g.this;
            if (gVar.z6()) {
                if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    c cVar2 = gVar.f34549k0;
                    if (cVar2 != null) {
                        cVar2.M8();
                    }
                } else {
                    i2.f(a2.DEVICES, "PersonalInfoEditingWizardFragment", "Error saving user personal information to GC [" + cVar.name() + "].");
                    gVar.f34554p.setEnabled(true);
                    Toast.makeText(gVar.getActivity(), R.string.txt_error_occurred, 0).show();
                }
                if (gVar.isAdded()) {
                    ((com.garmin.android.apps.connectmobile.c) gVar.getActivity()).hideProgressOverlay();
                }
            }
            gVar.Y = -1L;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Boolean f34564a;

        public b(g gVar, Boolean bool) {
            this.f34564a = bool;
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(this.f34564a.booleanValue());
        }
    }

    public interface c {
        void M8();
    }

    public final void A6(View view2, Boolean bool) {
        s0.r(view2, new b(this, bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "PersonalInfoEditingWizardFragment", ".onAttach()");
        try {
            this.f34549k0 = (c) context;
        } catch (ClassCastException unused) {
            com.nimbusds.jose.shaded.gson.internal.a.r(context.toString(), c.class.getSimpleName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.a(a2.DEVICES, "PersonalInfoEditingWizardFragment", ".onCreate()");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.P = (l) arguments.getParcelable("DEVICE_DTO");
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) arguments.getParcelable("PERSONAL_INFO_JSON");
            this.T = userSettingsDTO;
            if (userSettingsDTO != null) {
                this.X = userSettingsDTO.t1();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i2.a(a2.DEVICES, "PersonalInfoEditingWizardFragment", ".onCreateView()");
        View viewInflate = layoutInflater.inflate(R.layout.gcm_devices_tell_us_more, (ViewGroup) null);
        this.f34562z = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.tell_me_more_layout);
        this.F = relativeLayout;
        relativeLayout.setVisibility(4);
        return this.f34562z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        i2.a(a2.DEVICES, "PersonalInfoEditingWizardFragment", ".onStop()");
        long j8 = this.Y;
        if (j8 != -1) {
            try {
                com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
            } catch (Exception unused) {
                i2.f(a2.DEVICES, "PersonalInfoEditingWizardFragment", "Error cancelling saveUserSettingsToGC");
            }
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        this.F.setVisibility(0);
        f12.l.f68084a.getClass();
        String strW = f12.l.a.a().w();
        this.f34543f = strW;
        if (TextUtils.isEmpty(strW)) {
            this.f34543f = getString(R.string.user_gender_value_male);
        }
        this.f34546i = (Button) this.f34562z.findViewById(R.id.male_button);
        this.f34555q = this.f34562z.findViewById(R.id.male_underline);
        this.f34546i.setOnClickListener(new k(this, 0));
        this.f34547j = (Button) this.f34562z.findViewById(R.id.female_button);
        this.f34556r = this.f34562z.findViewById(R.id.female_underline);
        this.f34547j.setOnClickListener(new k(this, 6));
        w6();
        float fT = f12.l.a.a().t();
        this.f34538a = fT;
        if (fT <= 0.0f) {
            this.f34538a = 170.0f;
        }
        EditText editText = (EditText) this.f34562z.findViewById(R.id.height_edit_text);
        this.A = editText;
        editText.setText(l3.f(this.f34538a, getActivity(), f12.l.a.a().y()));
        this.A.setOnClickListener(new k(this, 7));
        double dV3 = f12.l.a.a().v3();
        this.f34539b = dV3;
        if (dV3 == 0.0d) {
            this.f34539b = 68.039d;
        }
        EditText editText2 = (EditText) this.f34562z.findViewById(R.id.weight_edit_text);
        this.B = editText2;
        editText2.setText(l3.l(this.f34539b, getActivity(), f12.l.a.a().y()));
        this.B.setOnClickListener(new k(this, 8));
        if (c22.b.a(requireContext()) >= 1.3f) {
            float fB = c22.b.b(requireContext(), getResources().getDimensionPixelSize(R.dimen.andfont_body_1), 1.3f);
            this.A.setTextSize(0, fB);
            this.B.setTextSize(0, fB);
        }
        this.C = (EditText) this.f34562z.findViewById(R.id.birthday_edit_text);
        if (this.Z.booleanValue()) {
            this.f34562z.findViewById(R.id.birthday_label).setVisibility(8);
            this.C.setVisibility(8);
        } else {
            LocalDate localDateL1 = f12.l.a.a().l1();
            this.f34540c = localDateL1;
            this.C.setText(localDateL1 != null ? DateFormat.getDateFormat(getActivity()).format(this.f34540c.toDate()) : DateFormat.getDateFormat(getActivity()).format(new Date(631173600000L)));
            this.C.setOnClickListener(new k(this, 9));
        }
        int iE2 = f12.l.a.a().e2();
        this.f34544g = iE2;
        if (iE2 == 0) {
            this.f34544g = 5;
        }
        this.f34551m = (Button) this.f34562z.findViewById(R.id.low_button);
        this.f34559w = this.f34562z.findViewById(R.id.low_underline);
        this.f34551m.setOnClickListener(new k(this, 10));
        this.f34552n = (Button) this.f34562z.findViewById(R.id.med_button);
        this.f34560x = this.f34562z.findViewById(R.id.med_underline);
        this.f34552n.setOnClickListener(new k(this, 11));
        this.f34553o = (Button) this.f34562z.findViewById(R.id.high_button);
        this.f34561y = this.f34562z.findViewById(R.id.high_underline);
        this.f34553o.setOnClickListener(new k(this, 12));
        this.I = (TextView) this.f34562z.findViewById(R.id.activity_level_description);
        v6();
        long jH = f12.l.a.a().h();
        this.f34541d = jH;
        if (jH == -1) {
            this.f34541d = 79200L;
        }
        EditText editText3 = (EditText) this.f34562z.findViewById(R.id.bedtime_edit_text);
        this.D = editText3;
        if (this.f34541d != -1) {
            z22.a.C3763a c3763a = z22.a.f202016d;
            m activity = getActivity();
            c3763a.getClass();
            editText3.setText(z22.a.C3763a.a(activity, true));
        }
        this.D.setOnClickListener(new k(this, 1));
        long jD = f12.l.a.a().d();
        this.f34542e = jD;
        if (jD == -1) {
            this.f34542e = 21600L;
        }
        EditText editText4 = (EditText) this.f34562z.findViewById(R.id.waketime_edit_text);
        this.E = editText4;
        if (this.f34542e != -1) {
            z22.a.C3763a c3763a2 = z22.a.f202016d;
            m activity2 = getActivity();
            c3763a2.getClass();
            editText4.setText(z22.a.C3763a.a(activity2, false));
        }
        this.E.setOnClickListener(new k(this, 2));
        if (c22.b.a(requireContext()) >= 1.3f) {
            float fB2 = c22.b.b(requireContext(), getResources().getDimensionPixelSize(R.dimen.andfont_body_1), 1.3f);
            this.D.setTextSize(0, fB2);
            this.E.setTextSize(0, fB2);
        }
        if (u0.n(this.P.getPartNumberPartial(), u0.E5)) {
            TextView textView = (TextView) this.f34562z.findViewById(R.id.handednessLabel);
            textView.setText(getText(R.string.handedness_golf_lbl));
            textView.setVisibility(0);
            TextView textView2 = (TextView) this.f34562z.findViewById(R.id.handedness_description);
            textView2.setText(getText(R.string.handedness_golf_description));
            textView2.setVisibility(0);
            this.f34562z.findViewById(R.id.handedness_button_container).setVisibility(0);
            Button button = (Button) this.f34562z.findViewById(R.id.handedness_left_button);
            this.f34548k = button;
            button.setText(getText(R.string.handedness_golf_value_left_handed));
            this.f34557t = this.f34562z.findViewById(R.id.handedness_left_underline);
            this.f34548k.setOnClickListener(new k(this, 4));
            this.f34548k.setVisibility(0);
            Button button2 = (Button) this.f34562z.findViewById(R.id.handedness_right_button);
            this.f34550l = button2;
            button2.setVisibility(0);
            this.f34558v = this.f34562z.findViewById(R.id.handedness_right_underline);
            this.f34550l.setOnClickListener(new k(this, 5));
            String strK = f12.l.a.a().K();
            this.f34545h = strK;
            if (TextUtils.isEmpty(strK) || this.f34545h.equals(getString(R.string.user_handedness_capable_value_right))) {
                this.f34550l.performClick();
            } else {
                this.f34548k.performClick();
            }
            this.f34562z.findViewById(R.id.heightLabel).setVisibility(8);
            this.A.setVisibility(8);
            this.f34562z.findViewById(R.id.weightLabel).setVisibility(8);
            this.B.setVisibility(8);
            this.f34562z.findViewById(R.id.birthday_label).setVisibility(8);
            this.C.setVisibility(8);
            this.f34562z.findViewById(R.id.activity_level_label).setVisibility(8);
            this.f34562z.findViewById(R.id.activity_level_button_container).setVisibility(8);
            this.f34562z.findViewById(R.id.activity_level_description).setVisibility(8);
            this.f34562z.findViewById(R.id.bedtime_label).setVisibility(8);
            this.D.setVisibility(8);
            this.f34562z.findViewById(R.id.waketime_label).setVisibility(8);
            this.E.setVisibility(8);
            this.f34562z.findViewById(R.id.sleep_time_description).setVisibility(8);
        }
        this.f34554p = (Button) this.f34562z.findViewById(R.id.button_next);
        u6();
    }

    public final void u6() {
        if (z6()) {
            f12.l.f68084a.getClass();
            if (f12.l.a.a().t() <= 0.0f) {
                f12.l.a.a().U2(170.0f);
            }
            if (f12.l.a.a().v3() == 0.0d) {
                f12.l.a.a().K1(68.039d);
            }
            if (!this.Z.booleanValue() && f12.l.a.a().l1() == null) {
                f12.l.a.a().B1(new LocalDate(631173600000L));
            }
            if (f12.l.a.a().e2() == 0) {
                f12.l.a.a().X(5);
            }
            if (f12.l.a.a().h() == -1) {
                f12.l.a.a().U3(79200L);
            }
            if (f12.l.a.a().d() == -1) {
                f12.l.a.a().H3(21600L);
            }
            if (TextUtils.isEmpty(f12.l.a.a().w())) {
                f12.l.a.a().R(getString(R.string.user_gender_value_male));
            }
            this.f34554p.setOnClickListener(this.I0);
            this.f34554p.setEnabled(true);
            this.f34554p.setBackgroundColor(a7.b.getColor(getActivity(), R.color.gcm_button_primary));
        }
    }

    public final void v6() {
        this.f34551m.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
        this.f34559w.setVisibility(4);
        this.f34552n.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
        this.f34560x.setVisibility(4);
        this.f34553o.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
        this.f34561y.setVisibility(4);
        Button button = this.f34551m;
        Boolean bool = Boolean.FALSE;
        A6(button, bool);
        A6(this.f34552n, bool);
        A6(this.f34553o, bool);
        int i14 = this.f34544g;
        if (i14 <= 3) {
            this.f34551m.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34559w.setVisibility(0);
            this.I.setText(R.string.txt_activity_level_low_desc);
            A6(this.f34551m, Boolean.TRUE);
            return;
        }
        if (i14 <= 7) {
            this.f34552n.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34560x.setVisibility(0);
            this.I.setText(R.string.txt_activity_level_medium_desc);
            A6(this.f34552n, Boolean.TRUE);
            return;
        }
        this.f34553o.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
        this.f34561y.setVisibility(0);
        this.I.setText(R.string.txt_activity_level_high_desc);
        A6(this.f34553o, Boolean.TRUE);
    }

    public final void w6() {
        A6(this.f34546i, Boolean.valueOf(this.f34543f.equals(getString(R.string.user_gender_value_male))));
        A6(this.f34547j, Boolean.valueOf(this.f34543f.equals(getString(R.string.user_gender_value_female))));
        if (this.f34543f.equals(getString(R.string.user_gender_value_male))) {
            this.f34546i.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34555q.setVisibility(0);
            this.f34547j.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
            this.f34556r.setVisibility(4);
            return;
        }
        if (this.f34543f.equals(getString(R.string.user_gender_value_female))) {
            this.f34547j.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34556r.setVisibility(0);
            this.f34546i.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
            this.f34555q.setVisibility(4);
        }
    }

    public final void y6() {
        A6(this.f34548k, Boolean.valueOf(this.f34545h.equals(getString(R.string.user_handedness_capable_value_left))));
        A6(this.f34550l, Boolean.valueOf(this.f34545h.equals(getString(R.string.user_handedness_capable_value_right))));
        if (this.f34545h.equals(getString(R.string.user_handedness_capable_value_left))) {
            this.f34548k.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34557t.setVisibility(0);
            this.f34550l.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
            this.f34558v.setVisibility(4);
            return;
        }
        if (this.f34545h.equals(getString(R.string.user_handedness_capable_value_right))) {
            this.f34550l.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_primary_action));
            this.f34558v.setVisibility(0);
            this.f34548k.setTextColor(a7.b.getColor(getActivity(), R.color.gcm_text_secondary));
            this.f34557t.setVisibility(4);
        }
    }

    public final boolean z6() {
        return (getActivity() == null || getActivity().isFinishing()) ? false : true;
    }
}
