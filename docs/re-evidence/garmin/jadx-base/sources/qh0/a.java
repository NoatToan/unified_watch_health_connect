package qh0;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import mt0.y;
import ng1.c1;
import xg1.s;

/* JADX INFO: loaded from: classes8.dex */
public class a extends i implements s<Double> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f144689e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xg1.i<Double> f144690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f144691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f144692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f144693d;

    /* JADX INFO: renamed from: qh0.a$a, reason: collision with other inner class name */
    public class C2729a implements TextWatcher {
        public C2729a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int iIntValue;
            if (editable.toString().isEmpty()) {
                iIntValue = -1;
            } else {
                try {
                    iIntValue = Integer.valueOf(editable.toString()).intValue();
                } catch (NumberFormatException e4) {
                    i2.i("FloorsGoalDialog", "Error parsing floors climbed goal value: " + e4.getMessage());
                    iIntValue = -1;
                }
            }
            a.this.v6(iIntValue >= 0 && iIntValue <= 999);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    public interface b {
        void l(int i14);
    }

    public static a u6(int i14, b bVar) {
        f144689e = bVar;
        Bundle bundle = new Bundle(1);
        bundle.putInt("arg.key.goal.floors", i14);
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // xg1.s
    public final void X4(xg1.i<Double> iVar) {
        this.f144690a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        show(vVar, "FloorsGoalDialog");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_floors_goal, (ViewGroup) null);
        viewInflate.findViewById(R.id.set_default_goal).setOnClickListener(new oq.a(this, 9));
        this.f144692c = (TextView) viewInflate.findViewById(R.id.error_text);
        this.f144691b = (EditText) viewInflate.findViewById(R.id.edit_text);
        int i14 = getArguments() != null ? getArguments().getInt("arg.key.goal.floors") : 10;
        if (i14 != -1) {
            String strTrim = String.valueOf(i14).trim();
            this.f144691b.setText(strTrim);
            this.f144691b.setSelection(strTrim.length());
        } else {
            this.f144691b.setText(String.valueOf(0));
        }
        this.f144691b.requestFocus();
        this.f144691b.addTextChangedListener(new C2729a());
        e eVarCreate = new e.a(getActivity()).setView(viewInflate).setTitle(R.string.steps_step_goal_title).setCancelable(true).setPositiveButton(R.string.lbl_save, new c1(this, 18)).setNegativeButton(R.string.lbl_cancel, new y(28)).create();
        this.f144693d = eVarCreate;
        q63.a.a(eVarCreate, this.f144691b);
        return this.f144693d;
    }

    public final void v6(boolean z14) {
        if (z14) {
            this.f144693d.e(-1).setEnabled(true);
            this.f144693d.e(-1).setClickable(true);
            this.f144692c.setVisibility(8);
        } else {
            this.f144692c.setVisibility(0);
            this.f144693d.e(-1).setEnabled(false);
            this.f144693d.e(-1).setClickable(false);
        }
    }
}
