package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class s1 extends androidx.fragment.app.i {
    public d A;
    public RadioButton B;
    public RadioButton C;
    public final a D = new a();
    public final b E = new b();
    public final c F = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.e f149862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f149863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f149864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f149865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f149866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f149867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f149868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f149869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f149870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f149871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f149872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f149873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f149874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f149875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f149876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f149877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f149878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f149879r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f149880t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f149881v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f149882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f149883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f149884y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f149885z;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            s1 s1Var = s1.this;
            if (s1Var.f149884y != null) {
                int value = s1Var.f149864c.getValue();
                s1Var.f149866e = value;
                s1Var.u6(s1Var.f149864c, value);
                NumberPicker numberPicker = s1Var.f149865d;
                int i15 = Integer.parseInt(s1Var.u6(numberPicker, numberPicker.getValue()));
                s1Var.f149867f = i15;
                s1Var.u6(s1Var.f149865d, i15);
                s1Var.f149884y.a(s1Var.f149866e, s1Var.f149867f);
            }
            s1Var.f149862a.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            s1 s1Var = s1.this;
            s1Var.getClass();
            s1Var.f149862a.dismiss();
        }
    }

    public class c implements NumberPicker.OnValueChangeListener {
        public c() {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            int id3 = numberPicker.getId();
            s1 s1Var = s1.this;
            if (id3 == R.id.nr_picker_1) {
                s1Var.f149866e = i15;
                s1Var.u6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_2) {
                s1Var.f149867f = i15;
                s1Var.u6(numberPicker, i15);
            }
            s1Var.v6(numberPicker, i14, i15);
        }
    }

    public interface d {
        void c();
    }

    public interface e {
        void a(int i14, int i15);
    }

    public interface f {
        void b();
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View viewInflate = View.inflate(getActivity(), R.layout.segmented_number_picker_layout, null);
        this.f149863b = viewInflate;
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.nr_picker_1);
        this.f149864c = numberPicker;
        boolean z14 = this.f149870i;
        c cVar = this.F;
        if (z14) {
            numberPicker.setMinValue(this.f149872k);
            this.f149864c.setMaxValue(this.f149873l);
            this.f149864c.setValue(this.f149868g);
            this.f149864c.setWrapSelectorWheel(this.f149876o);
            this.f149864c.setOnValueChangedListener(cVar);
            this.f149864c.setDescendantFocusability(393216);
        } else {
            numberPicker.setVisibility(8);
        }
        ((TextView) this.f149863b.findViewById(R.id.unit_1)).setVisibility(8);
        this.f149865d = (NumberPicker) this.f149863b.findViewById(R.id.nr_picker_2);
        ((TextView) this.f149863b.findViewById(R.id.decimal_char)).setText(Character.toString(c22.b2.f23010b));
        boolean z15 = this.f149871j;
        NumberPicker numberPicker2 = this.f149865d;
        if (z15) {
            numberPicker2.setMinValue(this.f149874m);
            this.f149865d.setMaxValue(this.f149875n);
            this.f149865d.setValue(this.f149869h);
            this.f149865d.setWrapSelectorWheel(this.f149877p);
            this.f149865d.setOnValueChangedListener(cVar);
            this.f149865d.setDescendantFocusability(393216);
            this.f149865d.setFormatter(new bi2.j(5));
            View childAt = this.f149865d.getChildAt(0);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setFilters(new InputFilter[0]);
            }
            this.f149865d.invalidate();
        } else {
            numberPicker2.setVisibility(8);
        }
        ((TextView) this.f149863b.findViewById(R.id.unit_2)).setVisibility(8);
        RadioGroup radioGroup = (RadioGroup) this.f149863b.findViewById(R.id.unitsRadioGroup);
        this.B = (RadioButton) radioGroup.findViewById(R.id.statuteRadioButton);
        this.C = (RadioButton) radioGroup.findViewById(R.id.metricRadioButton);
        this.B.setText(this.f149880t);
        this.B.setContentDescription(this.f149882w);
        this.C.setText(this.f149881v);
        this.C.setContentDescription(this.f149883x);
        if (am.j.z(f12.l.f68084a)) {
            this.C.setChecked(true);
        } else {
            this.B.setChecked(true);
        }
        radioGroup.setOnCheckedChangeListener(new a71.f(this, 3));
        int i14 = this.f149868g;
        this.f149866e = i14;
        u6(this.f149864c, i14);
        this.f149867f = Integer.parseInt(u6(this.f149865d, this.f149869h));
        u6(this.f149865d, this.f149869h);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).setView(this.f149863b).setPositiveButton(this.f149879r, this.D).setNegativeButton(this.f149878q, this.E).create();
        this.f149862a = eVarCreate;
        Window window = eVarCreate.getWindow();
        if (window != null) {
            window.getDecorView().setImportantForAccessibility(2);
        }
        return this.f149862a;
    }

    public final String u6(NumberPicker numberPicker, int i14) {
        if (numberPicker == null) {
            return null;
        }
        return numberPicker.getDisplayedValues() == null ? Integer.toString(i14) : numberPicker.getDisplayedValues()[i14];
    }

    public void v6(NumberPicker numberPicker, int i14, int i15) {
    }
}
