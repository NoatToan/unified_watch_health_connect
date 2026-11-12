package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.m80;
import defpackage.ni4;
import defpackage.oep;
import defpackage.t04;
import defpackage.u8p;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class c implements TimePickerView.g, oep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeModel f8956b;
    public final TextWatcher c = new a();
    public final TextWatcher d = new b();
    public final ChipTextInputComboView e;
    public final ChipTextInputComboView f;
    public final com.google.android.material.timepicker.b g;
    public final EditText h;
    public final EditText i;
    public MaterialButtonToggleGroup j;

    public class a extends u8p {
        public a() {
        }

        @Override // defpackage.u8p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    c.this.f8956b.i(0);
                } else {
                    c.this.f8956b.i(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public class b extends u8p {
        public b() {
        }

        @Override // defpackage.u8p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    c.this.f8956b.h(0);
                } else {
                    c.this.f8956b.h(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.c$c, reason: collision with other inner class name */
    public class ViewOnClickListenerC0226c implements View.OnClickListener {
        public ViewOnClickListenerC0226c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.d(((Integer) view.getTag(iqi.W)).intValue());
        }
    }

    public class d extends t04 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f8960b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f8960b = timeModel;
        }

        @Override // defpackage.t04, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.m0(view.getResources().getString(h2j.j, String.valueOf(this.f8960b.d())));
        }
    }

    public class e extends t04 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TimeModel f8961b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f8961b = timeModel;
        }

        @Override // defpackage.t04, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            super.onInitializeAccessibilityNodeInfo(view, m80Var);
            m80Var.m0(view.getResources().getString(h2j.l, String.valueOf(this.f8961b.e)));
        }
    }

    public class f implements MaterialButtonToggleGroup.d {
        public f() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            c.this.f8956b.j(i == iqi.n ? 1 : 0);
        }
    }

    public c(LinearLayout linearLayout, TimeModel timeModel) {
        this.f8955a = linearLayout;
        this.f8956b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(iqi.s);
        this.e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(iqi.p);
        this.f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(iqi.f21997r);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(iqi.f21997r);
        textView.setText(resources.getString(h2j.q));
        textView2.setText(resources.getString(h2j.p));
        chipTextInputComboView.setTag(iqi.W, 12);
        chipTextInputComboView2.setTag(iqi.W, 10);
        if (timeModel.c == 0) {
            l();
        }
        ViewOnClickListenerC0226c viewOnClickListenerC0226c = new ViewOnClickListenerC0226c();
        chipTextInputComboView2.setOnClickListener(viewOnClickListenerC0226c);
        chipTextInputComboView.setOnClickListener(viewOnClickListenerC0226c);
        chipTextInputComboView2.c(timeModel.e());
        chipTextInputComboView.c(timeModel.f());
        this.h = chipTextInputComboView2.e().getEditText();
        this.i = chipTextInputComboView.e().getEditText();
        this.g = new com.google.android.material.timepicker.b(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.f(new d(linearLayout.getContext(), h2j.i, timeModel));
        chipTextInputComboView.f(new e(linearLayout.getContext(), h2j.f19617k, timeModel));
        h();
    }

    @Override // defpackage.oep
    public void a() {
        this.f8955a.setVisibility(0);
    }

    public final void c() {
        this.h.addTextChangedListener(this.d);
        this.i.addTextChangedListener(this.c);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void d(int i) {
        this.f8956b.f = i;
        this.e.setChecked(i == 12);
        this.f.setChecked(i == 10);
        m();
    }

    @Override // defpackage.oep
    public void e() {
        View focusedChild = this.f8955a.getFocusedChild();
        if (focusedChild == null) {
            this.f8955a.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) ni4.i(this.f8955a.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f8955a.setVisibility(8);
    }

    @Override // defpackage.oep
    public void f() {
        k(this.f8956b);
    }

    public void g() {
        this.e.setChecked(false);
        this.f.setChecked(false);
    }

    public void h() {
        c();
        k(this.f8956b);
        this.g.a();
    }

    public final void i() {
        this.h.removeTextChangedListener(this.d);
        this.i.removeTextChangedListener(this.c);
    }

    public void j() {
        this.e.setChecked(this.f8956b.f == 12);
        this.f.setChecked(this.f8956b.f == 10);
    }

    public final void k(TimeModel timeModel) {
        i();
        Locale locale = this.f8955a.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.e));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.d()));
        this.e.g(str);
        this.f.g(str2);
        c();
        m();
    }

    public final void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f8955a.findViewById(iqi.o);
        this.j = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new f());
        this.j.setVisibility(0);
        m();
    }

    public final void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.j;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.d(this.f8956b.g == 0 ? iqi.m : iqi.n);
    }
}
