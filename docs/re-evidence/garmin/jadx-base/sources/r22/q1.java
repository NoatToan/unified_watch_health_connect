package r22;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import lo.l3;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
public class q1 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.app.e f149803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f149804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f149805c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f149807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f149808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f149809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q2 f149810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f149811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f149812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EditText f149813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f149814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l3 f149815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l3 f149816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l3 f149817o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f149806d = 0.0d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f149818p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f149819q = new b();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            double dB;
            int iC;
            q1 q1Var = q1.this;
            if (q1Var.f149809g != null) {
                if (!TextUtils.isEmpty(q1Var.f149813k.getText().toString())) {
                    String string = q1Var.f149813k.getText().toString();
                    int iIndexOf = string.indexOf(".");
                    if (iIndexOf >= 0) {
                        iC = c22.b1.c(string.substring(0, iIndexOf));
                        String strSubstring = string.substring(iIndexOf + 1);
                        if (strSubstring.length() < 2) {
                            strSubstring = strSubstring.concat("0");
                        }
                        dB = c22.b1.b(strSubstring);
                    } else {
                        dB = 0.0d;
                        try {
                            iC = Integer.parseInt(string);
                        } catch (NumberFormatException e4) {
                            com.garmin.android.apps.connectmobile.i2.i("SegmentedDistanceInputPickerDialogFragment", e4.getMessage());
                            iC = 0;
                        }
                    }
                    d dVar = q1Var.f149809g;
                    RadioButton radioButton = q1Var.f149812j;
                    dVar.a(iC, dB, !(radioButton != null ? radioButton.isChecked() : false) ? q1Var.f149815m : q1Var.f149816n);
                }
                q1Var.f149803a.dismiss();
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            q1 q1Var = q1.this;
            q1Var.getClass();
            q1Var.f149803a.dismiss();
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length = editable.length();
            q1 q1Var = q1.this;
            if (length >= 1) {
                q1Var.f149803a.e(-1).setEnabled(true);
            } else {
                q1Var.f149803a.e(-1).setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    public interface d {
        void a(int i14, double d14, l3 l3Var);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        super.onCreateDialog(bundle);
        View viewInflate = View.inflate(getActivity(), R.layout.segmented_number_input_picker_layout, null);
        this.f149804b = viewInflate;
        EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edit_text);
        this.f149813k = editText;
        editText.setInputType(4098);
        this.f149813k.setText(String.valueOf(this.f149806d));
        this.f149813k.setHint(String.valueOf(0.0d));
        this.f149813k.setInputType(8194);
        int i14 = 1;
        this.f149813k.setFilters(new InputFilter[]{new u20.f(0.0d, this.f149805c, "(([0-9]+)?)((\\.)?([0-9][0-9]?)?)")});
        RadioGroup radioGroup = (RadioGroup) this.f149804b.findViewById(R.id.units_radio_group);
        this.f149811i = (RadioButton) radioGroup.findViewById(R.id.statute_radio_button);
        this.f149812j = (RadioButton) radioGroup.findViewById(R.id.metric_radio_button);
        this.f149811i.setChecked(true);
        l3 l3Var = this.f149815m;
        if (l3Var != null) {
            this.f149811i.setText(getString(l3Var.f113908b));
        }
        l3 l3Var2 = this.f149816n;
        if (l3Var2 != null) {
            this.f149812j.setText(getString(l3Var2.f113908b));
        }
        this.f149812j.setVisibility(this.f149814l ? 8 : 0);
        l3 l3Var3 = this.f149817o;
        if (l3Var3 == null || this.f149815m == null || l3Var3.ordinal() != this.f149815m.ordinal()) {
            this.f149811i.setChecked(false);
            this.f149812j.setChecked(true);
        } else {
            this.f149811i.setChecked(true);
            this.f149812j.setChecked(false);
        }
        radioGroup.setOnCheckedChangeListener(new a71.f(this, i14));
        if (this.f149814l) {
            this.f149812j.setVisibility(8);
            this.f149811i.setChecked(true);
        }
        this.f149803a = new androidx.appcompat.app.e.a(requireContext()).setView(this.f149804b).setPositiveButton(this.f149808f, this.f149818p).setNegativeButton(this.f149807e, this.f149819q).create();
        this.f149813k.addTextChangedListener(new c());
        return this.f149803a;
    }

    public final void u6(ArrayList<l3> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.f149815m = arrayList.get(0);
        if (arrayList.size() > 1) {
            this.f149816n = arrayList.get(1);
        } else {
            this.f149814l = true;
        }
    }
}
