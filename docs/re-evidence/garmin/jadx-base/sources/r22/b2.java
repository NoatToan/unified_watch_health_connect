package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class b2 extends androidx.fragment.app.i {
    public int A;
    public String B;
    public String C;
    public String D;
    public View E;
    public final a F = new a();
    public final b I = new b();
    public final c P = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.e f149595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPicker f149596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NumberPicker f149597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NumberPicker f149598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f149599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f149600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f149601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f149602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f149603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f149604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f149605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f149606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f149607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f149608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f149609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f149610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f149611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f149612r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f149613t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f149614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f149615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a73.f f149616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f149617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f149618z;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            b2 b2Var = b2.this;
            if (b2Var.f149616x != null) {
                b2Var.z6();
                b2Var.f149616x.i(b2Var.B, b2Var.f149617y, b2Var.f149618z, b2Var.C, b2Var.D, b2Var.A);
            }
            b2Var.f149595a.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            b2 b2Var = b2.this;
            b2Var.getClass();
            b2Var.f149595a.dismiss();
        }
    }

    public class c implements NumberPicker.OnValueChangeListener {
        public c() {
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
            int id3 = numberPicker.getId();
            b2 b2Var = b2.this;
            if (id3 == R.id.nr_picker_1) {
                b2Var.f149617y = i15;
                b2Var.B = b2Var.v6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_2) {
                b2Var.f149618z = i15;
                b2Var.C = b2Var.v6(numberPicker, i15);
            } else if (id3 == R.id.nr_picker_3) {
                b2Var.A = i15;
                b2Var.D = b2Var.v6(numberPicker, i15);
            }
            androidx.appcompat.app.e eVar = b2Var.f149595a;
            int i16 = b2Var.f149617y;
            int i17 = b2Var.f149618z;
            int i18 = b2Var.A;
            eVar.setTitle(b2Var.u6(b2Var.f149602h ? b2Var.B : null, i16, i17, b2Var.f149603i ? b2Var.C : null, b2Var.f149604j ? b2Var.D : null, i18));
            b2Var.w6(numberPicker, i14, i15);
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.number_picker_dialog, (ViewGroup) null);
        this.E = viewInflate;
        NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.nr_picker_1);
        this.f149596b = numberPicker;
        boolean z14 = this.f149602h;
        c cVar = this.P;
        if (z14) {
            numberPicker.setMinValue(this.f149605k);
            this.f149596b.setMaxValue(this.f149606l);
            this.f149596b.setValue(this.f149599e);
            this.f149596b.setWrapSelectorWheel(this.f149611q);
            this.f149596b.setOnValueChangedListener(cVar);
            this.f149596b.setDescendantFocusability(393216);
        } else {
            numberPicker.setVisibility(8);
        }
        ((TextView) this.E.findViewById(R.id.unit_1)).setVisibility(8);
        this.f149597c = (NumberPicker) this.E.findViewById(R.id.nr_picker_2);
        boolean z15 = this.f149603i;
        NumberPicker numberPicker2 = this.f149597c;
        if (z15) {
            numberPicker2.setMinValue(this.f149607m);
            this.f149597c.setMaxValue(this.f149608n);
            this.f149597c.setValue(this.f149600f);
            this.f149597c.setWrapSelectorWheel(this.f149612r);
            this.f149597c.setOnValueChangedListener(cVar);
            this.f149597c.setDescendantFocusability(393216);
        } else {
            numberPicker2.setVisibility(8);
        }
        ((TextView) this.E.findViewById(R.id.unit_2)).setVisibility(8);
        this.f149598d = (NumberPicker) this.E.findViewById(R.id.nr_picker_3);
        boolean z16 = this.f149604j;
        NumberPicker numberPicker3 = this.f149598d;
        if (z16) {
            numberPicker3.setMinValue(this.f149609o);
            this.f149598d.setMaxValue(this.f149610p);
            this.f149598d.setValue(this.f149601g);
            this.f149598d.setWrapSelectorWheel(this.f149613t);
            this.f149598d.setOnValueChangedListener(cVar);
            this.f149598d.setDescendantFocusability(393216);
        } else {
            numberPicker3.setVisibility(8);
        }
        ((TextView) this.E.findViewById(R.id.unit_3)).setVisibility(8);
        int i14 = this.f149599e;
        this.f149617y = i14;
        this.B = v6(this.f149596b, i14);
        int i15 = this.f149600f;
        this.f149618z = i15;
        this.C = v6(this.f149597c, i15);
        int i16 = this.f149601g;
        this.A = i16;
        this.D = v6(this.f149598d, i16);
        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(getActivity()).setTitle(u6(this.f149602h ? this.B : null, this.f149599e, this.f149600f, this.f149603i ? this.C : null, this.f149604j ? this.D : null, this.f149601g)).setView(this.E).setPositiveButton(this.f149615w, this.F).setNegativeButton(this.f149614v, this.I).create();
        this.f149595a = eVarCreate;
        return eVarCreate;
    }

    public String u6(String str, int i14, int i15, String str2, String str3, int i16) {
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

    public final String v6(NumberPicker numberPicker, int i14) {
        if (numberPicker == null) {
            return null;
        }
        return numberPicker.getDisplayedValues() == null ? Integer.toString(i14) : numberPicker.getDisplayedValues()[i14];
    }

    public void w6(NumberPicker numberPicker, int i14, int i15) {
    }

    public final void y6() {
        z6();
        androidx.appcompat.app.e eVar = this.f149595a;
        int i14 = this.f149617y;
        int i15 = this.f149618z;
        int i16 = this.A;
        eVar.setTitle(u6(this.f149602h ? this.B : null, i14, i15, this.f149603i ? this.C : null, this.f149604j ? this.D : null, i16));
    }

    public final void z6() {
        int value = this.f149596b.getValue();
        this.f149617y = value;
        this.B = v6(this.f149596b, value);
        int value2 = this.f149597c.getValue();
        this.f149618z = value2;
        this.C = v6(this.f149597c, value2);
        int value3 = this.f149598d.getValue();
        this.A = value3;
        this.D = v6(this.f149598d, value3);
    }
}
