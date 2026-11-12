package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import lo.l3;

/* JADX INFO: loaded from: classes10.dex */
public class r1 extends androidx.fragment.app.i {
    public RadioButton A;
    public boolean B;
    public l3 C;
    public l3 D;
    public l3 E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.e f149827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f149828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f149829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f149830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f149831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f149832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f149833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f149834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f149835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f149836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f149837k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f149839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f149840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f149841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f149842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f149843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f149844r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f149845t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f149846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f149847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r22.d f149848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f149849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RadioButton f149850z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f149838l = true;
    public final a F = new a();
    public final b I = new b();
    public final c P = new c();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            r1 r1Var = r1.this;
            if (r1Var.f149847w != null) {
                int value = r1Var.f149829c.getValue();
                r1Var.f149831e = value;
                r1Var.f149849y = r1Var.u6(r1Var.f149829c, value);
                NumberPicker numberPicker = r1Var.f149830d;
                int i15 = Integer.parseInt(r1Var.u6(numberPicker, numberPicker.getValue()));
                r1Var.f149832f = i15;
                r1Var.u6(r1Var.f149830d, i15);
                r1Var.f149847w.d(r1Var.f149831e, r1Var.f149832f, r1Var.f149849y);
            }
            r1Var.f149827a.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            r1 r1Var = r1.this;
            r1Var.getClass();
            r1Var.f149827a.dismiss();
        }
    }

    public class c implements NumberPicker.OnValueChangeListener {
        public c() {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            int id3 = numberPicker.getId();
            r1 r1Var = r1.this;
            if (id3 == R.id.nr_picker_1) {
                r1Var.f149831e = i15;
                r1Var.f149849y = r1Var.u6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_2) {
                r1Var.f149832f = i15;
                r1Var.u6(numberPicker, i15);
            }
            r1Var.getClass();
        }
    }

    public interface d {
        void d(int i14, int i15, String str);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View viewInflate = View.inflate(getActivity(), R.layout.segmented_number_picker_layout, null);
        this.f149828b = viewInflate;
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.nr_picker_1);
        this.f149829c = numberPicker;
        boolean z14 = this.f149836j;
        c cVar = this.P;
        if (z14) {
            numberPicker.setMinValue(this.f149839m);
            this.f149829c.setMaxValue(this.f149840n);
            this.f149829c.setValue(this.f149833g);
            this.f149829c.setWrapSelectorWheel(this.f149843q);
            if (this.f149842p) {
                this.f149829c.setDisplayedValues(this.f149835i);
            }
            this.f149829c.setOnValueChangedListener(cVar);
            this.f149829c.setDescendantFocusability(393216);
        } else {
            numberPicker.setVisibility(8);
        }
        ((TextView) this.f149828b.findViewById(R.id.unit_1)).setVisibility(8);
        TextView textView = (TextView) this.f149828b.findViewById(R.id.decimal_char);
        textView.setText(Character.toString(c22.b2.f23010b));
        NumberPicker numberPicker2 = (NumberPicker) this.f149828b.findViewById(R.id.nr_picker_2);
        this.f149830d = numberPicker2;
        if (this.f149837k) {
            textView.setVisibility(0);
            this.f149830d.setMinValue(0);
            this.f149830d.setMaxValue(this.f149841o);
            this.f149830d.setValue(this.f149834h);
            this.f149830d.setWrapSelectorWheel(this.f149844r);
            this.f149830d.setOnValueChangedListener(cVar);
            this.f149830d.setDescendantFocusability(393216);
            this.f149830d.setFormatter(new p62.h(this, 3));
            View childAt = this.f149830d.getChildAt(0);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setFilters(new InputFilter[0]);
            }
            this.f149830d.invalidate();
        } else {
            numberPicker2.setVisibility(8);
            textView.setVisibility(8);
        }
        ((TextView) this.f149828b.findViewById(R.id.unit_2)).setVisibility(8);
        RadioGroup radioGroup = (RadioGroup) this.f149828b.findViewById(R.id.unitsRadioGroup);
        this.f149850z = (RadioButton) radioGroup.findViewById(R.id.statuteRadioButton);
        this.A = (RadioButton) radioGroup.findViewById(R.id.metricRadioButton);
        this.f149850z.setChecked(true);
        l3 l3Var = this.C;
        if (l3Var != null) {
            this.f149850z.setText(getString(l3Var.f113908b));
        }
        l3 l3Var2 = this.D;
        if (l3Var2 != null) {
            this.A.setText(getString(l3Var2.f113908b));
        }
        this.A.setVisibility(this.B ? 8 : 0);
        l3 l3Var3 = this.E;
        if (l3Var3 == null || this.C == null || l3Var3.ordinal() != this.C.ordinal()) {
            this.f149850z.setChecked(false);
            this.A.setChecked(true);
        } else {
            this.f149850z.setChecked(true);
            this.A.setChecked(false);
        }
        radioGroup.setOnCheckedChangeListener(new a71.f(this, 2));
        if (this.B) {
            this.A.setVisibility(8);
            this.f149850z.setChecked(true);
        }
        int i14 = this.f149833g;
        this.f149831e = i14;
        this.f149849y = u6(this.f149829c, i14);
        this.f149832f = Integer.parseInt(u6(this.f149830d, this.f149834h));
        u6(this.f149830d, this.f149834h);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(requireContext()).setView(this.f149828b).setPositiveButton(this.f149846v, this.F).setNegativeButton(this.f149845t, this.I).create();
        this.f149827a = eVarCreate;
        return eVarCreate;
    }

    public final String u6(NumberPicker numberPicker, int i14) {
        if (numberPicker == null) {
            return null;
        }
        return numberPicker.getDisplayedValues() == null ? Integer.toString(i14) : numberPicker.getDisplayedValues()[i14];
    }

    public final void v6(int i14) {
        this.f149836j = true;
        this.f149833g = i14;
    }

    public final void w6(ArrayList<l3> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.C = arrayList.get(0);
        if (arrayList.size() > 1) {
            this.D = arrayList.get(1);
        } else {
            this.B = true;
        }
    }
}
