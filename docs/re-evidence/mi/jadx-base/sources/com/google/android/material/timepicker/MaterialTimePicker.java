package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import defpackage.b4j;
import defpackage.e8f;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.k3j;
import defpackage.kwi;
import defpackage.l8f;
import defpackage.oep;
import defpackage.pii;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.e {
    public TimePickerView e;
    public ViewStub f;
    public com.google.android.material.timepicker.a g;
    public com.google.android.material.timepicker.c h;
    public oep i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8932k;
    public CharSequence m;
    public CharSequence o;
    public CharSequence q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MaterialButton f8933r;
    public Button s;
    public TimeModel u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<View.OnClickListener> f8930a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<View.OnClickListener> f8931b = new LinkedHashSet();
    public final Set<DialogInterface.OnCancelListener> c = new LinkedHashSet();
    public final Set<DialogInterface.OnDismissListener> d = new LinkedHashSet();
    public int l = 0;
    public int n = 0;
    public int p = 0;
    public int t = 0;
    public int v = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f8930a.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f8931b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.t = materialTimePicker.t == 0 ? 1 : 0;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.D(materialTimePicker2.f8933r);
        }
    }

    public final oep A(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i != 0) {
            if (this.h == null) {
                this.h = new com.google.android.material.timepicker.c((LinearLayout) viewStub.inflate(), this.u);
            }
            this.h.g();
            return this.h;
        }
        com.google.android.material.timepicker.a aVar = this.g;
        if (aVar == null) {
            aVar = new com.google.android.material.timepicker.a(timePickerView, this.u);
        }
        this.g = aVar;
        return aVar;
    }

    public final void B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.u = timeModel;
        if (timeModel == null) {
            this.u = new TimeModel();
        }
        this.t = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
        this.l = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.m = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.n = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.o = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.p = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.q = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    public final void C() {
        Button button = this.s;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    public final void D(MaterialButton materialButton) {
        if (materialButton == null || this.e == null || this.f == null) {
            return;
        }
        oep oepVar = this.i;
        if (oepVar != null) {
            oepVar.e();
        }
        oep oepVarA = A(this.t, this.e, this.f);
        this.i = oepVarA;
        oepVarA.a();
        this.i.f();
        Pair<Integer, Integer> pairY = y(this.t);
        materialButton.setIconResource(((Integer) pairY.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairY.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d() {
        this.t = 1;
        D(this.f8933r);
        this.h.j();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        B(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), z());
        Context context = dialog.getContext();
        int iD = e8f.d(context, pii.s, MaterialTimePicker.class.getCanonicalName());
        l8f l8fVar = new l8f(context, null, pii.L, k3j.K);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, b4j.u5, pii.L, k3j.K);
        this.f8932k = typedArrayObtainStyledAttributes.getResourceId(b4j.v5, 0);
        this.j = typedArrayObtainStyledAttributes.getResourceId(b4j.w5, 0);
        typedArrayObtainStyledAttributes.recycle();
        l8fVar.Q(context);
        l8fVar.b0(ColorStateList.valueOf(iD));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(l8fVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        l8fVar.a0(androidx.core.view.c.v(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(kwi.u, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(iqi.y);
        this.e = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.f = (ViewStub) viewGroup2.findViewById(iqi.u);
        this.f8933r = (MaterialButton) viewGroup2.findViewById(iqi.w);
        TextView textView = (TextView) viewGroup2.findViewById(iqi.i);
        int i = this.l;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.m)) {
            textView.setText(this.m);
        }
        D(this.f8933r);
        Button button = (Button) viewGroup2.findViewById(iqi.x);
        button.setOnClickListener(new a());
        int i2 = this.n;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.o)) {
            button.setText(this.o);
        }
        Button button2 = (Button) viewGroup2.findViewById(iqi.v);
        this.s = button2;
        button2.setOnClickListener(new b());
        int i3 = this.p;
        if (i3 != 0) {
            this.s.setText(i3);
        } else if (!TextUtils.isEmpty(this.q)) {
            this.s.setText(this.q);
        }
        C();
        this.f8933r.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.i = null;
        this.g = null;
        this.h = null;
        TimePickerView timePickerView = this.e;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.u);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.t);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.l);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.m);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.n);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.o);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.p);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.v);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        C();
    }

    public final Pair<Integer, Integer> y(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.j), Integer.valueOf(h2j.f19618r));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.f8932k), Integer.valueOf(h2j.o));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    public final int z() {
        int i = this.v;
        if (i != 0) {
            return i;
        }
        TypedValue typedValueA = e8f.a(requireContext(), pii.M);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }
}
