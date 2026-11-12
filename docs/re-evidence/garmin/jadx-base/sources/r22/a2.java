package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a2 extends androidx.fragment.app.i {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public String F;
    public String H0;
    public String I;
    public String I0;
    public int J0;
    public int K0;
    public int L0;
    public String M0;
    public View O0;
    public a73.j P;
    public d T;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.e f149554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f149555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f149556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f149557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f149558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f149559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f149560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f149561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f149562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f149563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f149564k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f149565k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f149566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f149567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f149568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f149569o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f149573t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f149574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f149576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f149578z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f149570p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f149571q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f149572r = false;
    public int N0 = 1;
    public final a P0 = new a();
    public final b Q0 = new b();
    public final c R0 = new c();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            a2 a2Var = a2.this;
            if (a2Var.T != null) {
                a2Var.X = a2Var.f149555b.getValue();
                a2Var.f149565k0 = a2Var.w6(a2Var.f149555b, a2Var.X);
                a2Var.Y = a2Var.f149556c.getValue();
                a2Var.H0 = a2Var.w6(a2Var.f149556c, a2Var.Y);
                a2Var.Z = a2Var.f149557d.getValue();
                a2Var.I0 = a2Var.w6(a2Var.f149557d, a2Var.Z);
                a2Var.T.i(a2Var.f149565k0, a2Var.X, a2Var.Y, a2Var.H0, a2Var.I0, a2Var.Z);
            }
            a2Var.f149554a.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            a2 a2Var = a2.this;
            a73.j jVar = a2Var.P;
            if (jVar != null) {
                ag0.b bVar = (ag0.b) jVar.f1851b;
                ag0.b.a aVar = ag0.b.Z0;
                bVar.dismiss();
            }
            a2Var.f149554a.dismiss();
        }
    }

    public class c implements NumberPicker.OnValueChangeListener {
        public c() {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            int id3 = numberPicker.getId();
            a2 a2Var = a2.this;
            if (id3 == R.id.nr_picker_1) {
                a2Var.X = i15;
                a2Var.f149565k0 = a2Var.w6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_2) {
                a2Var.Y = i15;
                a2Var.H0 = a2Var.w6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_3) {
                a2Var.Z = i15;
                a2Var.I0 = a2Var.w6(numberPicker, i15);
                String[] displayedValues = numberPicker.getDisplayedValues();
                if (numberPicker.getId() == R.id.nr_picker_3 && displayedValues != null && displayedValues.length > i14 && displayedValues.length > i15) {
                    if (displayedValues[i14].equals(a2Var.getString(R.string.lbl_mile)) && displayedValues[i15].equals(a2Var.getString(R.string.lbl_km))) {
                        a2Var.f149555b.setMinValue(a2Var.f149573t);
                        double d14 = a2Var.f149574v;
                        l3.f23124b.getClass();
                        int i16 = (int) (d14 * 1.609344d);
                        a2Var.f149574v = i16;
                        a2Var.f149555b.setMaxValue(i16);
                    } else if (displayedValues[i14].equals(a2Var.getString(R.string.lbl_km)) && displayedValues[i15].equals(a2Var.getString(R.string.lbl_mile))) {
                        a2Var.f149555b.setMinValue(a2Var.f149573t);
                        double d15 = a2Var.f149574v;
                        l3.f23124b.getClass();
                        int iCeil = (int) Math.ceil(d15 / 1.609344d);
                        a2Var.f149574v = iCeil;
                        a2Var.f149555b.setMaxValue(iCeil);
                    }
                }
            }
            a2Var.M6();
            a2Var.K6();
            a2Var.z6(numberPicker, i14, i15);
        }
    }

    public interface d {
        void i(String str, int i14, int i15, String str2, String str3, int i16);
    }

    public static void S6(NumberPicker numberPicker, int i14, int i15, boolean z14) {
        numberPicker.setMinValue(i14);
        numberPicker.setMaxValue(i15);
        numberPicker.setWrapSelectorWheel(z14);
    }

    public final void A6(int i14) {
        this.f149567m = true;
        this.f149561h = i14;
    }

    public void C6(int i14, int i15, boolean z14) {
        this.f149573t = i14;
        this.f149574v = i15;
        this.f149567m = true;
        this.C = z14;
    }

    public final void E6(int i14) {
        this.f149568n = true;
        this.f149562i = i14;
    }

    public final void F6(int i14) {
        this.f149568n = true;
        this.f149576x = i14;
    }

    public final void G6(int i14) {
        this.f149568n = true;
        this.f149575w = i14;
    }

    public void H6(int i14, int i15, boolean z14) {
        G6(i14);
        F6(i15);
        this.f149568n = true;
        this.D = z14;
    }

    public final void I6(int i14) {
        this.f149569o = true;
        this.f149563j = i14;
    }

    public void J6(int i14, int i15, boolean z14) {
        this.f149577y = i14;
        this.f149578z = i15;
        this.f149569o = true;
        this.E = z14;
    }

    public final void K6() {
        String str = this.f149567m ? this.f149565k0 : null;
        String str2 = this.f149568n ? this.H0 : null;
        String str3 = this.f149569o ? this.I0 : null;
        String strV6 = v6(str, this.X, this.Y, str2, str3, this.Z);
        String strU6 = u6(str, this.X, this.Y, str2, str3, this.Z);
        androidx.appcompat.app.e eVar = this.f149554a;
        if (eVar != null) {
            oe2.f.g0(eVar, strV6, strU6);
        }
    }

    public final void M6() {
        int i14 = this.X;
        int i15 = this.Y;
        int i16 = this.Z;
        this.f149554a.setTitle(v6(this.f149567m ? this.f149565k0 : null, i14, i15, this.f149568n ? this.H0 : null, this.f149569o ? this.I0 : null, i16));
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.number_picker_dialog, (ViewGroup) null);
        this.O0 = viewInflate;
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.nr_picker_1);
        this.f149555b = numberPicker;
        boolean z14 = this.f149567m;
        c cVar = this.R0;
        if (z14) {
            numberPicker.setMinValue(this.f149573t);
            this.f149555b.setMaxValue(this.f149574v);
            this.f149555b.setValue(this.f149561h);
            this.f149555b.setWrapSelectorWheel(this.C);
            this.f149555b.setOnValueChangedListener(cVar);
            this.f149555b.setDescendantFocusability(393216);
        } else {
            numberPicker.setVisibility(8);
        }
        TextView textView = (TextView) this.O0.findViewById(R.id.unit_1);
        this.f149558e = textView;
        if (this.f149570p) {
            textView.setVisibility(0);
            this.f149558e.setText(this.J0);
            this.f149558e.setImportantForAccessibility(this.N0);
        } else {
            textView.setVisibility(8);
        }
        this.f149556c = (NumberPicker) this.O0.findViewById(R.id.nr_picker_2);
        this.f149559f = (TextView) this.O0.findViewById(R.id.unit_2);
        boolean z15 = this.f149568n;
        NumberPicker numberPicker2 = this.f149556c;
        if (z15) {
            numberPicker2.setMinValue(this.f149575w);
            this.f149556c.setMaxValue(this.f149576x);
            this.f149556c.setValue(this.f149562i);
            this.f149556c.setWrapSelectorWheel(this.D);
            if (this.A) {
                this.f149556c.setDisplayedValues(this.f149564k);
            }
            this.f149556c.setOnValueChangedListener(cVar);
            this.f149556c.setDescendantFocusability(393216);
        } else {
            numberPicker2.setVisibility(8);
        }
        TextView textView2 = (TextView) this.O0.findViewById(R.id.unit_2);
        this.f149559f = textView2;
        if (this.f149571q) {
            textView2.setVisibility(0);
            this.f149559f.setText(this.K0);
            String str = this.M0;
            if (str != null) {
                this.f149559f.setContentDescription(str);
            }
        } else {
            textView2.setVisibility(8);
        }
        this.f149557d = (NumberPicker) this.O0.findViewById(R.id.nr_picker_3);
        this.f149560g = (TextView) this.O0.findViewById(R.id.unit_3);
        boolean z16 = this.f149569o;
        NumberPicker numberPicker3 = this.f149557d;
        if (z16) {
            numberPicker3.setMinValue(this.f149577y);
            this.f149557d.setMaxValue(this.f149578z);
            this.f149557d.setValue(this.f149563j);
            this.f149557d.setWrapSelectorWheel(this.E);
            if (this.B) {
                this.f149557d.setDisplayedValues(this.f149566l);
            }
            this.f149557d.setOnValueChangedListener(cVar);
            this.f149557d.setDescendantFocusability(393216);
        } else {
            numberPicker3.setVisibility(8);
        }
        TextView textView3 = (TextView) this.O0.findViewById(R.id.unit_3);
        this.f149560g = textView3;
        if (this.f149572r) {
            textView3.setVisibility(0);
            this.f149560g.setText(this.L0);
        } else {
            textView3.setVisibility(8);
        }
        int i14 = this.f149561h;
        this.X = i14;
        this.f149565k0 = w6(this.f149555b, i14);
        int i15 = this.f149562i;
        this.Y = i15;
        this.H0 = w6(this.f149556c, i15);
        int i16 = this.f149563j;
        this.Z = i16;
        this.I0 = w6(this.f149557d, i16);
        y6();
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(getActivity()).setTitle(StringUtils.SPACE).setView(this.O0).setPositiveButton(this.I, this.P0).setNegativeButton(this.F, this.Q0).create();
        this.f149554a = eVarCreate;
        return eVarCreate;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        K6();
    }

    @Override // androidx.fragment.app.i
    public void show(androidx.fragment.app.v vVar, String str) {
        showNow(vVar, str);
        if (this.f149554a != null) {
            K6();
            if (this.f149554a.getWindow() != null) {
                this.f149554a.getWindow().getDecorView().setImportantForAccessibility(2);
            }
        }
    }

    public String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        return v6(str, i14, i15, str2, str3, i16);
    }

    public String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        StringBuilder sb3 = new StringBuilder();
        if (str != null) {
            sb3.append(str);
            sb3.append(StringUtils.SPACE);
        }
        if (str2 != null) {
            sb3.append(str2);
            sb3.append(StringUtils.SPACE);
        }
        if (str3 != null) {
            sb3.append(str3);
            sb3.append(StringUtils.SPACE);
        }
        return sb3.toString();
    }

    public final String w6(NumberPicker numberPicker, int i14) {
        if (numberPicker == null) {
            return null;
        }
        return numberPicker.getDisplayedValues() == null ? Integer.toString(i14) : numberPicker.getDisplayedValues()[i14];
    }

    public void y6() {
    }

    public void z6(NumberPicker numberPicker, int i14, int i15) {
    }
}
