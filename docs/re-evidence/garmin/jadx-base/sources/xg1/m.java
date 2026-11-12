package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxg1/m;", "Landroidx/fragment/app/i;", "Lxg1/s;", "Lxg1/n;", "<init>", "()V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends androidx.fragment.app.i implements s<n> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f190903g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static h f190904h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f190905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwitchCompat f190906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f190907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.e f190908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f190909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i<n> f190910f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xg1/m$b", "Landroid/text/TextWatcher;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i14;
            editable.getClass();
            try {
                i14 = editable.toString().length() > 0 ? Integer.parseInt(editable.toString()) : 0;
            } catch (NumberFormatException unused) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "StepGoalDialog", "Invalid input \"" + ((Object) editable) + "\" instead of integer.");
            }
            boolean z14 = i14 >= 1;
            a aVar2 = m.f190903g;
            m.this.v6(z14);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }
    }

    public static final m u6(h hVar, int i14, boolean z14) {
        f190903g.getClass();
        f190904h = hVar;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", R.string.steps_step_goal_title);
        bundle.putInt("arg2", i14);
        bundle.putBoolean("arg3", z14);
        mVar.setArguments(bundle);
        return mVar;
    }

    @Override // xg1.s
    public final void X4(i<n> iVar) {
        this.f190910f = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, "StepGoalDialog");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i14 = arguments != null ? arguments.getInt("arg1") : R.string.steps_step_goal_title;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        this.f190909e = layoutInflater.inflate(R.layout.gcm_steps_goal, (ViewGroup) null);
        this.f190908d = new androidx.appcompat.app.e.a(requireContext()).setView(this.f190909e).setTitle(i14).setPositiveButton(R.string.lbl_save, new l(this, 0)).setNegativeButton(R.string.lbl_cancel, new vu1.k(22)).create();
        View view2 = this.f190909e;
        this.f190907c = view2 != null ? (TextView) view2.findViewById(R.id.goalStepsErrorLabel) : null;
        View view3 = this.f190909e;
        EditText editText = view3 != null ? (EditText) view3.findViewById(R.id.goalStepsValue) : null;
        this.f190905a = editText;
        if (editText != null) {
            editText.addTextChangedListener(new b());
        }
        EditText editText2 = this.f190905a;
        if (editText2 != null) {
            androidx.appcompat.app.e eVar = this.f190908d;
            eVar.getClass();
            q63.a.a(eVar, editText2);
        }
        androidx.appcompat.app.e eVar2 = this.f190908d;
        eVar2.getClass();
        return eVar2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onStart() {
        boolean z14;
        EditText editText;
        super.onStart();
        View view2 = this.f190909e;
        Bundle arguments = getArguments();
        this.f190905a = view2 != null ? (EditText) view2.findViewById(R.id.goalStepsValue) : null;
        int i14 = arguments != null ? arguments.getInt("arg2") : 7500;
        String strValueOf = String.valueOf(i14 >= 1 ? i14 : 7500);
        EditText editText2 = this.f190905a;
        if (editText2 != null) {
            editText2.setText(strValueOf);
        }
        if (!TextUtils.isEmpty(strValueOf) && (editText = this.f190905a) != null) {
            editText.setSelection((int) Math.min(strValueOf.length(), getResources().getInteger(R.integer.max_step_goal_digit_count)));
        }
        SwitchCompat switchCompat = view2 != null ? (SwitchCompat) view2.findViewById(R.id.addGoalButton) : null;
        this.f190906b = switchCompat;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new bl0.b(13, this, view2));
        }
        boolean z15 = arguments == null || arguments.getBoolean("arg3");
        SwitchCompat switchCompat2 = this.f190906b;
        if (switchCompat2 != null) {
            switchCompat2.setChecked(z15);
        }
        EditText editText3 = this.f190905a;
        if (editText3 != null) {
            editText3.setEnabled(!z15);
        }
        EditText editText4 = this.f190905a;
        editText4.getClass();
        if (editText4.getText().length() > 0) {
            EditText editText5 = this.f190905a;
            editText5.getClass();
            z14 = Integer.parseInt(editText5.getText().toString()) >= 1;
        }
        v6(z14);
    }

    public final void v6(boolean z14) {
        Button buttonE;
        Button buttonE2;
        Button buttonE3;
        Button buttonE4;
        if (z14) {
            EditText editText = this.f190905a;
            if (editText != null) {
                editText.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_primary));
            }
            androidx.appcompat.app.e eVar = this.f190908d;
            if (eVar != null && (buttonE4 = eVar.e(-1)) != null) {
                buttonE4.setEnabled(true);
            }
            androidx.appcompat.app.e eVar2 = this.f190908d;
            if (eVar2 != null && (buttonE3 = eVar2.e(-1)) != null) {
                buttonE3.setClickable(true);
            }
            TextView textView = this.f190907c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        SwitchCompat switchCompat = this.f190906b;
        if (switchCompat != null) {
            switchCompat.getClass();
            if (!switchCompat.isChecked()) {
                EditText editText2 = this.f190905a;
                if (editText2 != null) {
                    editText2.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_danger_action));
                }
                TextView textView2 = this.f190907c;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
        }
        androidx.appcompat.app.e eVar3 = this.f190908d;
        if (eVar3 != null && (buttonE2 = eVar3.e(-1)) != null) {
            buttonE2.setEnabled(false);
        }
        androidx.appcompat.app.e eVar4 = this.f190908d;
        if (eVar4 == null || (buttonE = eVar4.e(-1)) == null) {
            return;
        }
        buttonE.setClickable(false);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxg1/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lxg1/h;", "mListener", "Lxg1/h;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
