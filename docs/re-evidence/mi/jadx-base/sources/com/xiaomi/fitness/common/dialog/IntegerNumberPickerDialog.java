package com.xiaomi.fitness.common.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import defpackage.c0j;
import defpackage.clb;
import defpackage.eri;

/* JADX INFO: loaded from: classes6.dex */
public class IntegerNumberPickerDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11799b = 0;
    public int c = 0;
    public int d = 0;
    public String e;
    public boolean f;
    public int g;
    public String h;
    public TextView i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11800k;
    public boolean l;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, IntegerNumberPickerDialog> {
        public a(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntegerNumberPickerDialog internalCreate() {
            return new IntegerNumberPickerDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    public final int B(int i, int i2, int i3) {
        if (i3 < i) {
            return i;
        }
        return i3 > i2 ? i2 : i3;
    }

    public final /* synthetic */ void C(View view) {
        this.l = true;
        dismiss();
    }

    public final /* synthetic */ void E(NumberPickerView numberPickerView, int i, int i2) {
        I(getValue());
    }

    public void F(boolean z) {
        this.f11800k = z;
        TextView textView = this.j;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public final void G(int i) {
        NumberPickerView numberPickerView = this.f11798a;
        if (numberPickerView != null) {
            numberPickerView.setMaxValue(i);
        }
    }

    public final void H(int i) {
        NumberPickerView numberPickerView = this.f11798a;
        if (numberPickerView != null) {
            numberPickerView.setMinValue(i);
        }
    }

    public final void I(int i) {
        if (getContext() != null) {
            this.f11798a.setContentDescription(getContext().getString(c0j.Sq, i + this.h));
        }
    }

    public final void J(String str) {
        NumberPickerView numberPickerView;
        if (TextUtils.isEmpty(str) || (numberPickerView = this.f11798a) == null) {
            return;
        }
        numberPickerView.setHintText(str);
    }

    public int getValue() {
        NumberPickerView numberPickerView = this.f11798a;
        if (numberPickerView != null) {
            return numberPickerView.getValue();
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomTitle(View view) {
        super.initCustomTitle(view);
        this.i = (TextView) view.findViewById(eri.bn);
        TextView textView = (TextView) view.findViewById(eri.Ak);
        this.j = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: mcd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f26006a.C(view2);
            }
        });
        F(this.f11800k);
        setTitle(this.g);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        NumberPickerView numberPickerView = (NumberPickerView) view.findViewById(eri.oc);
        this.f11798a = numberPickerView;
        numberPickerView.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: ncd
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView2, int i, int i2) {
                this.f27776a.D(numberPickerView2, i, i2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.f11799b = bundle.getInt("key_value", 0);
        }
        this.f = true;
        H(this.d);
        G(this.c);
        setValue(this.f11799b);
        J(this.e);
        this.f11798a.setOnValueChangedListener(new NumberPickerView.d() { // from class: ocd
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                this.f28999a.E(numberPickerView, i, i2);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_value", getValue());
            setResultData(Integer.valueOf(i), bundle);
        } else if (this.l) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_value", 0);
            setResultData(-4, bundle2);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f11798a != null) {
            bundle.putInt("key_value", getValue());
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        super.onShow();
        this.l = false;
    }

    public void setMaxValue(int i) {
        this.c = i;
        if (this.f) {
            G(i);
        }
    }

    public void setMinValue(int i) {
        this.d = i;
        if (this.f) {
            H(i);
        }
    }

    public void setTitle(int i) {
        this.g = i;
        TextView textView = this.i;
        if (textView == null || i == 0) {
            return;
        }
        textView.setText(i);
    }

    public void setUnit(String str) {
        this.h = str;
        if (this.f) {
            J(str);
        } else {
            this.e = str;
        }
    }

    public void setValue(int i) {
        int iB = B(this.d, this.c, i);
        if (!this.f || this.f11798a == null) {
            this.f11799b = i;
        } else {
            updateValue(iB);
        }
    }

    public final void updateValue(int i) {
        NumberPickerView numberPickerView = this.f11798a;
        if (numberPickerView == null) {
            return;
        }
        numberPickerView.setValue(i);
        I(i);
    }
}
