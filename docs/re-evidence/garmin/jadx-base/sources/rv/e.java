package rv;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.bic.view.CircumferencePickerLayout;
import com.garmin.android.apps.connectmobile.d3;
import com.garmin.android.apps.connectmobile.i2;
import dv.l;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lrv/e;", "Lrv/a;", "Landroid/view/View$OnClickListener;", "Ldv/l;", "<init>", "()V", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends rv.a implements View.OnClickListener, l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f154612o = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f154615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f154616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f154617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f154618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f154619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CircumferencePickerLayout f154620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f154621m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154613e = 2111;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f154614f = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f154622n = new c();

    public interface b {
        void v1();

        void x7(int i14, boolean z14);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"rv/e$c", "Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$a;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements CircumferencePickerLayout.a {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.bic.view.CircumferencePickerLayout.a
        public final void a(int i14, boolean z14) {
            int iB;
            if (z14) {
                iB = i14;
            } else {
                l3.a aVar = l3.f23124b;
                m3 m3Var = m3.INCH;
                m3 m3Var2 = m3.MILLIMETER;
                aVar.getClass();
                iB = MathKt.b(l3.a.g(i14, m3Var, m3Var2));
            }
            e eVar = e.this;
            eVar.f154613e = iB;
            eVar.f154614f = z14;
            eVar.C6(i14, z14);
        }
    }

    public final void C6(int i14, boolean z14) {
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23131i;
        TextView textView = this.f154616h;
        if (textView == null) {
            s.m("mainValue");
            throw null;
        }
        textView.setText(decimalFormat.format(Math.round(i14)));
        TextView textView2 = this.f154617i;
        if (textView2 == null) {
            s.m("mainUnit");
            throw null;
        }
        textView2.setText(getString(z14 ? R.string.lbl_mm : R.string.lbl_inch));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (c22.b.a(contextRequireContext) >= 1.5f) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            float fB = c22.b.b(contextRequireContext2, getResources().getDimension(2131165319), 1.5f);
            TextView textView3 = this.f154616h;
            if (textView3 == null) {
                s.m("mainValue");
                throw null;
            }
            textView3.setTextSize(0, fB);
            TextView textView4 = this.f154617i;
            if (textView4 != null) {
                textView4.setTextSize(0, fB);
            } else {
                s.m("mainUnit");
                throw null;
            }
        }
    }

    @Override // dv.l
    public final View R() {
        return requireView().findViewById(R.id.main_image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dv.b, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f154621m = (b) context;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.BIC;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "WheelCircumferenceFragment", "Activity must implement OnCircumferenceSelectedListener");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        int id3 = view2.getId();
        if (id3 == R.id.btn_next) {
            final int i14 = 0;
            A6(new rv.a.b(this) { // from class: rv.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f154611b;

                {
                    this.f154611b = this;
                }

                @Override // rv.a.b
                public final void c() {
                    switch (i14) {
                        case 0:
                            e eVar = this.f154611b;
                            e.b bVar = eVar.f154621m;
                            if (bVar != null) {
                                bVar.x7(eVar.f154613e, eVar.f154614f);
                            }
                            break;
                        default:
                            e.b bVar2 = this.f154611b.f154621m;
                            if (bVar2 != null) {
                                bVar2.v1();
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (id3 != R.id.btn_circumference_input) {
            if (id3 == R.id.estimate_circumference_label) {
                final int i15 = 1;
                A6(new rv.a.b(this) { // from class: rv.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f154611b;

                    {
                        this.f154611b = this;
                    }

                    @Override // rv.a.b
                    public final void c() {
                        switch (i15) {
                            case 0:
                                e eVar = this.f154611b;
                                e.b bVar = eVar.f154621m;
                                if (bVar != null) {
                                    bVar.x7(eVar.f154613e, eVar.f154614f);
                                }
                                break;
                            default:
                                e.b bVar2 = this.f154611b.f154621m;
                                if (bVar2 != null) {
                                    bVar2.v1();
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        CircumferencePickerLayout circumferencePickerLayout = this.f154620l;
        if (circumferencePickerLayout == null) {
            s.m("circumferencePickerLayout");
            throw null;
        }
        int visibility = circumferencePickerLayout.getVisibility();
        CircumferencePickerLayout circumferencePickerLayout2 = this.f154620l;
        if (visibility == 0) {
            if (circumferencePickerLayout2 != null) {
                circumferencePickerLayout2.setVisibility(4);
                return;
            } else {
                s.m("circumferencePickerLayout");
                throw null;
            }
        }
        if (circumferencePickerLayout2 != null) {
            circumferencePickerLayout2.setVisibility(0);
        } else {
            s.m("circumferencePickerLayout");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f154615g = arguments.getBoolean("EXTRA_IS_BIC_FLOW");
            this.f154613e = arguments.getInt("GCM_extra_bike_wheel_circumference_information");
            this.f154614f = arguments.getBoolean("GCM_extra_bike_wheel_displayed_in_metric");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_bic_tell_us_more_bike_circumference, viewGroup, false);
    }

    @Override // rv.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f154615g) {
            u6(getString(R.string.lbl_startup_wheel_circumference_question));
        } else {
            u6(getString(R.string.lbl_tire_circumference));
        }
        d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.focusTitle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        int iB;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.information_label);
        viewFindViewById.getClass();
        this.f154618j = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.circumference_image_view);
        viewFindViewById2.getClass();
        this.f154619k = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.main_measurement_value);
        viewFindViewById3.getClass();
        this.f154616h = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.main_measurement_label);
        viewFindViewById4.getClass();
        this.f154617i = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.estimate_circumference_label);
        viewFindViewById5.getClass();
        ((Button) viewFindViewById5).setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.btn_circumference_input);
        Button button = (Button) view2.findViewById(R.id.btn_next);
        View viewFindViewById6 = view2.findViewById(R.id.height_picker);
        viewFindViewById6.getClass();
        CircumferencePickerLayout circumferencePickerLayout = (CircumferencePickerLayout) viewFindViewById6;
        this.f154620l = circumferencePickerLayout;
        circumferencePickerLayout.setPickerCallback(this.f154622n);
        CircumferencePickerLayout circumferencePickerLayout2 = this.f154620l;
        if (circumferencePickerLayout2 == null) {
            s.m("circumferencePickerLayout");
            throw null;
        }
        circumferencePickerLayout2.c(this.f154614f);
        CircumferencePickerLayout circumferencePickerLayout3 = this.f154620l;
        if (circumferencePickerLayout3 == null) {
            s.m("circumferencePickerLayout");
            throw null;
        }
        circumferencePickerLayout3.d(this.f154613e, this.f154614f);
        if (this.f154615g) {
            linearLayout.setOnClickListener(this);
            button.setOnClickListener(this);
        } else {
            CircumferencePickerLayout circumferencePickerLayout4 = this.f154620l;
            if (circumferencePickerLayout4 == null) {
                s.m("circumferencePickerLayout");
                throw null;
            }
            circumferencePickerLayout4.setVisibility(0);
            linearLayout.getClass();
            linearLayout.setVisibility(8);
            button.getClass();
            button.setVisibility(8);
            TextView textView = this.f154618j;
            if (textView == null) {
                s.m("informationLabel");
                throw null;
            }
            textView.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
        }
        if (this.f154614f) {
            iB = this.f154613e;
        } else {
            l3.a aVar = l3.f23124b;
            double d14 = this.f154613e;
            m3 m3Var = m3.MILLIMETER;
            m3 m3Var2 = m3.INCH;
            aVar.getClass();
            iB = MathKt.b(l3.a.g(d14, m3Var, m3Var2));
        }
        C6(iB, this.f154614f);
    }

    @Override // rv.a
    public final ImageView v6() {
        ImageView imageView = this.f154619k;
        if (imageView != null) {
            return imageView;
        }
        s.m("mainImage");
        throw null;
    }

    @Override // rv.a
    public final int[] y6() {
        return new int[]{0, 2};
    }

    @Override // rv.a
    public final int[] z6() {
        return new int[]{1, 3};
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrv/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IS_BIC_FLOW", "", "DEFAULT_WHEEL_CIRCUMFERENCE", "I", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
