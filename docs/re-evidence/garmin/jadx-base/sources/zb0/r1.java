package zb0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.Date;
import org.joda.time.LocalDate;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class r1 extends Fragment {
    public EditText A;
    public EditText B;
    public ViewGroup C;
    public TextView D;
    public UserSettingsDTO I;
    public JSONObject P;
    public c Y;
    public s2 Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f203630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f203631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f203632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f203633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f203634k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public d3 f203635k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f203636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f203637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f203638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f203639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f203640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f203641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f203642r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f203643t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f203644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f203645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EditText f203646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EditText f203647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EditText f203648z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f203624a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f203625b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalDate f203626c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f203627d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f203628e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f203629f = "";
    public long E = -1;
    public long F = -1;
    public com.garmin.android.apps.connectmobile.devices.model.l T = null;
    public final Boolean X = Boolean.valueOf(com.garmin.android.apps.connectmobile.k1.f37122a.r());
    public final a H0 = new a();
    public final b I0 = new b();
    public final o1 J0 = new o1(this, 0);

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            final r1 r1Var = r1.this;
            if (cVar != cVar2 || r1Var.I == null) {
                if (r1Var.z6()) {
                    final int i14 = 0;
                    androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(r1Var.getActivity()).setTitle("").setMessage(Html.fromHtml(new SpannableStringBuilder(r1Var.getText(R.string.msg_error_retrieving_user_profile_data)).toString())).setPositiveButton(R.string.lbl_try_again, new DialogInterface.OnClickListener() { // from class: zb0.p1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            switch (i14) {
                                case 0:
                                    r1 r1Var2 = r1Var;
                                    r1Var2.getClass();
                                    dialogInterface.dismiss();
                                    if (r1Var2.z6()) {
                                        r1Var2.A6();
                                        r1Var2.E = cw.q.N().M(r1Var2.H0);
                                    }
                                    break;
                                default:
                                    r1 r1Var3 = r1Var;
                                    r1Var3.getClass();
                                    dialogInterface.dismiss();
                                    r1.c cVar3 = r1Var3.Y;
                                    if (cVar3 != null) {
                                        cVar3.p3();
                                    }
                                    break;
                            }
                        }
                    });
                    final int i15 = 1;
                    positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: zb0.p1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i16) {
                            switch (i15) {
                                case 0:
                                    r1 r1Var2 = r1Var;
                                    r1Var2.getClass();
                                    dialogInterface.dismiss();
                                    if (r1Var2.z6()) {
                                        r1Var2.A6();
                                        r1Var2.E = cw.q.N().M(r1Var2.H0);
                                    }
                                    break;
                                default:
                                    r1 r1Var3 = r1Var;
                                    r1Var3.getClass();
                                    dialogInterface.dismiss();
                                    r1.c cVar3 = r1Var3.Y;
                                    if (cVar3 != null) {
                                        cVar3.p3();
                                    }
                                    break;
                            }
                        }
                    }).show();
                }
            } else if (r1Var.z6()) {
                r1Var.C.setVisibility(0);
                f12.l.f68084a.getClass();
                String strW = f12.l.a.a().w();
                r1Var.f203627d = strW;
                if (TextUtils.isEmpty(strW)) {
                    r1Var.f203627d = r1Var.getString(R.string.user_gender_value_male);
                }
                r1Var.f203630g.setOnClickListener(new o1(r1Var, 6));
                r1Var.f203631h.setOnClickListener(new o1(r1Var, 11));
                r1Var.w6();
                float fT = f12.l.a.a().t();
                r1Var.f203624a = fT;
                if (fT <= 0.0f) {
                    r1Var.f203624a = 170.0f;
                }
                String strF = l3.f(r1Var.f203624a, r1Var.getActivity(), f12.l.a.a().y());
                r1Var.f203646x.setText(strF);
                r1Var.f203646x.setContentDescription(oi0.d.a(r1Var.requireContext(), strF.toString(), new ig1.l0(25)));
                r1Var.f203646x.setOnClickListener(new o1(r1Var, 12));
                double dV3 = f12.l.a.a().v3();
                r1Var.f203625b = dV3;
                if (dV3 == 0.0d) {
                    r1Var.f203625b = 68.039d;
                }
                String strL = l3.l(r1Var.f203625b, r1Var.getActivity(), f12.l.a.a().y());
                r1Var.f203647y.setText(strL);
                r1Var.f203647y.setContentDescription(oi0.d.a(r1Var.requireContext(), strL.toString(), new ig1.l0(26)));
                r1Var.f203647y.setOnClickListener(new o1(r1Var, 1));
                if (r1Var.X.booleanValue()) {
                    r1Var.f203648z.setVisibility(8);
                } else {
                    LocalDate localDateL1 = f12.l.a.a().l1();
                    r1Var.f203626c = localDateL1;
                    r1Var.f203648z.setText(localDateL1 != null ? DateFormat.getDateFormat(r1Var.getActivity()).format(r1Var.f203626c.toDate()) : DateFormat.getDateFormat(r1Var.getActivity()).format(new Date(631173600000L)));
                    r1Var.f203648z.setOnClickListener(new o1(r1Var, 2));
                }
                int iE2 = f12.l.a.a().e2();
                r1Var.f203628e = iE2;
                if (iE2 == 0) {
                    r1Var.f203628e = 5;
                }
                r1Var.f203634k.setOnClickListener(new o1(r1Var, 3));
                r1Var.f203636l.setOnClickListener(new o1(r1Var, 4));
                r1Var.f203637m.setOnClickListener(new o1(r1Var, 5));
                r1Var.v6();
                f12.l.a.a().h();
                EditText editText = r1Var.A;
                z22.a.C3763a c3763a = z22.a.f202016d;
                androidx.fragment.app.m activity = r1Var.getActivity();
                c3763a.getClass();
                editText.setText(z22.a.C3763a.a(activity, true));
                r1Var.A.setOnClickListener(new o1(r1Var, 7));
                f12.l.a.a().d();
                r1Var.B.setText(z22.a.C3763a.a(r1Var.getActivity(), false));
                r1Var.B.setOnClickListener(new o1(r1Var, 8));
                if (c22.b.a(r1Var.requireContext()) >= 1.3f) {
                    float fB = c22.b.b(r1Var.requireContext(), r1Var.getResources().getDimensionPixelSize(R.dimen.andfont_h_3), 1.3f);
                    r1Var.f203646x.setTextSize(0, fB);
                    r1Var.f203647y.setTextSize(0, fB);
                    r1Var.A.setTextSize(0, fB);
                    r1Var.B.setTextSize(0, fB);
                }
                if (u0.n(r1Var.T.getPartNumberPartial(), u0.E5) && r1Var.getView() != null) {
                    TextView textView = (TextView) r1Var.getView().findViewById(R.id.handednessLabel);
                    textView.setText(r1Var.getText(R.string.handedness_golf_lbl));
                    textView.setVisibility(0);
                    TextView textView2 = (TextView) r1Var.getView().findViewById(R.id.handedness_description);
                    textView2.setText(r1Var.getText(R.string.handedness_golf_description));
                    textView2.setVisibility(0);
                    r1Var.getView().findViewById(R.id.handedness_button_container).setVisibility(0);
                    Button button = (Button) r1Var.getView().findViewById(R.id.handedness_left_button);
                    r1Var.f203632i = button;
                    button.setText(r1Var.getText(R.string.handedness_golf_value_left_handed));
                    r1Var.f203641q = r1Var.getView().findViewById(R.id.handedness_left_underline);
                    r1Var.f203632i.setOnClickListener(new o1(r1Var, 9));
                    r1Var.f203632i.setVisibility(0);
                    Button button2 = (Button) r1Var.getView().findViewById(R.id.handedness_right_button);
                    r1Var.f203633j = button2;
                    button2.setVisibility(0);
                    r1Var.f203642r = r1Var.getView().findViewById(R.id.handedness_right_underline);
                    r1Var.f203633j.setOnClickListener(new o1(r1Var, 10));
                    String strK = f12.l.a.a().K();
                    r1Var.f203629f = strK;
                    if (TextUtils.isEmpty(strK) || r1Var.f203629f.equals(r1Var.getString(R.string.user_handedness_capable_value_right))) {
                        r1Var.f203633j.performClick();
                    } else {
                        r1Var.f203632i.performClick();
                    }
                    r1Var.getView().findViewById(R.id.heightLabel).setVisibility(8);
                    r1Var.f203646x.setVisibility(8);
                    r1Var.getView().findViewById(R.id.weightLabel).setVisibility(8);
                    r1Var.f203647y.setVisibility(8);
                    r1Var.getView().findViewById(R.id.birthday_label).setVisibility(8);
                    r1Var.f203648z.setVisibility(8);
                    r1Var.getView().findViewById(R.id.activity_level_label).setVisibility(8);
                    r1Var.getView().findViewById(R.id.activity_level_button_container).setVisibility(8);
                    r1Var.getView().findViewById(R.id.activity_level_description).setVisibility(8);
                    r1Var.getView().findViewById(R.id.bedtime_label).setVisibility(8);
                    r1Var.A.setVisibility(8);
                    r1Var.getView().findViewById(R.id.waketime_label).setVisibility(8);
                    r1Var.B.setVisibility(8);
                    r1Var.getView().findViewById(R.id.sleep_time_description).setVisibility(8);
                }
                r1Var.u6();
                s2 s2Var = r1Var.Z;
                if (s2Var != null) {
                    s2Var.hideProgressOverlay();
                }
            }
            s2 s2Var2 = r1Var.Z;
            if (s2Var2 != null) {
                s2Var2.hideProgressOverlay();
            }
            r1Var.E = -1L;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) obj;
            r1 r1Var = r1.this;
            r1Var.I = userSettingsDTO;
            r1Var.P = userSettingsDTO.t1();
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            c cVar2;
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar3 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            r1 r1Var = r1.this;
            if (cVar == cVar3) {
                if (r1Var.z6() && (cVar2 = r1Var.Y) != null) {
                    cVar2.U0(r1Var.T);
                }
            } else if (r1Var.z6()) {
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(r1Var.getActivity());
                aVar.setPositiveButton(R.string.lbl_close, new xk1.v(27));
                aVar.setMessage(R.string.alert_gc_status_server_degraded_performance);
                aVar.create().show();
            }
            s2 s2Var = r1Var.Z;
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            }
            r1Var.F = -1L;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public interface c {
        void U0(com.garmin.android.apps.connectmobile.devices.model.l lVar);

        void p3();
    }

    public final void A6() {
        s2 s2Var = this.Z;
        if (s2Var != null) {
            s2Var.showProgressOverlay();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        i2.a(a2.DEVICES, "TellUsMoreFragment", ".onActivityCreated()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        i2.a(a2.DEVICES, "TellUsMoreFragment", ".onAttach()");
        try {
            this.Y = (c) context;
            this.Z = (s2) context;
            this.f203635k0 = (d3) context;
        } catch (ClassCastException unused) {
            i2.f(a2.DEVICES, "TellUsMoreFragment", "Activity must implement TellUsMoreCallBack and ProgressOverlayListener and ToolbarListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.a(a2.DEVICES, "TellUsMoreFragment", ".onCreate()");
        if (getArguments() != null) {
            this.T = (com.garmin.android.apps.connectmobile.devices.model.l) getArguments().getParcelable("arg.device.dto");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm_devices_tell_us_more, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d3 d3Var = this.f203635k0;
        if (d3Var != null) {
            d3Var.updateActionBar(getString(R.string.tell_us_more_page_title), 2);
        }
        if (z6()) {
            A6();
            this.E = cw.q.N().M(this.H0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        i2.a(a2.DEVICES, "TellUsMoreFragment", ".onStop()");
        long j8 = this.E;
        if (j8 != -1) {
            try {
                com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
            } catch (Exception unused) {
                i2.f(a2.DEVICES, "TellUsMoreFragment", "Error cancelling getUserSettingsFromGC");
            }
        }
        long j14 = this.F;
        if (j14 != -1) {
            try {
                com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j14);
            } catch (Exception unused2) {
                i2.f(a2.DEVICES, "TellUsMoreFragment", "Error cancelling saveUserSettingsToGC");
            }
        }
        s2 s2Var = this.Z;
        if (s2Var != null) {
            s2Var.hideProgressOverlay();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        this.C = (ViewGroup) view2.findViewById(R.id.tell_me_more_layout);
        this.f203630g = (Button) view2.findViewById(R.id.male_button);
        this.f203639o = view2.findViewById(R.id.male_underline);
        this.f203631h = (Button) view2.findViewById(R.id.female_button);
        this.f203640p = view2.findViewById(R.id.female_underline);
        this.f203646x = (EditText) view2.findViewById(R.id.height_edit_text);
        this.f203647y = (EditText) view2.findViewById(R.id.weight_edit_text);
        this.f203648z = (EditText) view2.findViewById(R.id.birthday_edit_text);
        this.f203634k = (Button) view2.findViewById(R.id.low_button);
        this.f203643t = view2.findViewById(R.id.low_underline);
        this.f203636l = (Button) view2.findViewById(R.id.med_button);
        this.f203644v = view2.findViewById(R.id.med_underline);
        this.f203637m = (Button) view2.findViewById(R.id.high_button);
        this.f203645w = view2.findViewById(R.id.high_underline);
        this.D = (TextView) view2.findViewById(R.id.activity_level_description);
        this.A = (EditText) view2.findViewById(R.id.bedtime_edit_text);
        this.B = (EditText) view2.findViewById(R.id.waketime_edit_text);
        this.f203638n = (Button) view2.findViewById(R.id.button_next);
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
            if (!this.X.booleanValue() && f12.l.a.a().l1() == null) {
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
            this.f203638n.setOnClickListener(this.J0);
            this.f203638n.setEnabled(true);
            this.f203638n.setBackgroundColor(a7.b.getColor(requireContext(), R.color.gcm_button_primary));
        }
    }

    public final void v6() {
        this.f203634k.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
        this.f203643t.setVisibility(4);
        this.f203636l.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
        this.f203644v.setVisibility(4);
        this.f203637m.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
        this.f203645w.setVisibility(4);
        int i14 = this.f203628e;
        if (i14 <= 3) {
            this.f203634k.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203643t.setVisibility(0);
            this.D.setText(R.string.txt_activity_level_low_desc);
        } else if (i14 <= 7) {
            this.f203636l.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203644v.setVisibility(0);
            this.D.setText(R.string.txt_activity_level_medium_desc);
        } else {
            this.f203637m.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203645w.setVisibility(0);
            this.D.setText(R.string.txt_activity_level_high_desc);
        }
    }

    public final void w6() {
        if (this.f203627d.equals(getString(R.string.user_gender_value_male))) {
            this.f203630g.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203639o.setVisibility(0);
            this.f203631h.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
            this.f203640p.setVisibility(4);
            return;
        }
        if (this.f203627d.equals(getString(R.string.user_gender_value_female))) {
            this.f203631h.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203640p.setVisibility(0);
            this.f203630g.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
            this.f203639o.setVisibility(4);
        }
    }

    public final void y6() {
        if (this.f203629f.equals(getString(R.string.user_handedness_capable_value_left))) {
            this.f203632i.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203641q.setVisibility(0);
            this.f203633j.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
            this.f203642r.setVisibility(4);
            return;
        }
        if (this.f203629f.equals(getString(R.string.user_handedness_capable_value_right))) {
            this.f203633j.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary_action));
            this.f203642r.setVisibility(0);
            this.f203632i.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
            this.f203641q.setVisibility(4);
        }
    }

    public final boolean z6() {
        return (getActivity() == null || getActivity().isFinishing()) ? false : true;
    }
}
