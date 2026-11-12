package com.xiaomi.fitness.common.dialog;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.IntRange;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.c0j;
import defpackage.clb;
import defpackage.eri;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class FloatNumberPickerDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f11791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NumberPickerView f11792b;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public TextView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f11793k;
    public boolean l;
    public boolean m;
    public TextView q;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public int n = 9;
    public int o = 0;
    public int p = 1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UIUtils.INSTANCE.isRtl()) {
                if (FloatNumberPickerDialog.this.j.getLeft() > FloatNumberPickerDialog.this.f11793k.getRight()) {
                    return;
                }
            } else if (FloatNumberPickerDialog.this.j.getRight() < FloatNumberPickerDialog.this.f11793k.getLeft()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) FloatNumberPickerDialog.this.j.getLayoutParams();
            layoutParams.addRule(16, eri.Ak);
            FloatNumberPickerDialog.this.j.setLayoutParams(layoutParams);
        }
    }

    public static class b extends com.xiaomi.fitness.baseui.dialog.a<b, DialogParams, FloatNumberPickerDialog> {
        public b(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FloatNumberPickerDialog internalCreate() {
            return new FloatNumberPickerDialog();
        }

        public b(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    public static int G(int i) {
        int i2 = 1;
        for (int i3 = i / 10; i3 != 0; i3 /= 10) {
            i2++;
        }
        return i2;
    }

    public static int I(int i) {
        int i2 = 10;
        for (int i3 = i / 10; i3 != 0; i3 /= 10) {
            i2 *= 10;
        }
        return i2;
    }

    public final int F(float f) {
        int I = I(this.n);
        return Math.round(I * f) - (((int) f) * I);
    }

    public final int H(float f) {
        return (int) f;
    }

    public final float J(float f, float f2, float f3) {
        if (f3 < f) {
            return f;
        }
        return f3 > f2 ? f2 : f3;
    }

    public float K() {
        NumberPickerView numberPickerView;
        if (this.f11792b == null || (numberPickerView = this.f11791a) == null) {
            return 0.0f;
        }
        return numberPickerView.getValue() + (this.f11792b.getValue() / I(this.n));
    }

    public final /* synthetic */ void L(View view) {
        this.m = true;
        dismiss();
    }

    public final /* synthetic */ void M(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    public final /* synthetic */ void N(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    public final /* synthetic */ void O(NumberPickerView numberPickerView, int i, int i2) {
        Y(i2);
        b0(K());
    }

    public final /* synthetic */ void P(NumberPickerView numberPickerView, int i, int i2) {
        b0(K());
    }

    public final void Q() {
        TextView textView = this.j;
        if (textView == null || this.f11793k == null) {
            return;
        }
        textView.post(new a());
    }

    public void R(@IntRange(from = 0) int i) {
        if (i < 0) {
            throw new IllegalArgumentException("value must >= 0");
        }
        this.n = i;
        int iG = G(i);
        this.p = iG;
        NumberPickerView numberPickerView = this.f11792b;
        if (numberPickerView != null) {
            numberPickerView.setNumberDigits(iG);
        }
    }

    public void S(@IntRange(from = 0) int i) {
        if (i < 0) {
            throw new IllegalArgumentException("value must >= 0");
        }
        this.o = i;
    }

    public void T(boolean z) {
        this.l = z;
        TextView textView = this.f11793k;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public void U(float f) {
        this.d = f;
        if (this.g) {
            Z(f);
        }
    }

    public void V(float f) {
        this.e = f;
        if (this.g) {
            a0(f);
        }
    }

    public void W(int i) {
        this.i = i;
        if (this.g) {
            c0(i);
        } else {
            this.f = i;
        }
    }

    public void X(float f) {
        float fJ = J(this.e, this.d, f);
        if (!this.g || this.f11791a == null || this.f11792b == null) {
            this.c = f;
        } else {
            d0(fJ);
        }
    }

    public final void Y(float f) {
        int iH = H(this.d);
        int iH2 = H(this.e);
        int iF = this.n;
        int iF2 = this.o;
        if (f == iH) {
            iF = F(this.d);
        }
        if (f == iH2) {
            iF2 = F(this.e);
        }
        int value = this.f11792b.getValue();
        this.f11792b.setMaxValue(iF);
        this.f11792b.setMinValue(iF2);
        if (value > iF) {
            this.f11792b.setValue(iF);
        } else if (value < iF2) {
            this.f11792b.setValue(iF2);
        } else {
            this.f11792b.setValue(value);
        }
    }

    public final void Z(float f) {
        NumberPickerView numberPickerView = this.f11791a;
        if (numberPickerView == null || this.f11792b == null) {
            return;
        }
        numberPickerView.setMaxValue((int) f);
    }

    public final void a0(float f) {
        NumberPickerView numberPickerView = this.f11791a;
        if (numberPickerView == null || this.f11792b == null) {
            return;
        }
        numberPickerView.setMinValue((int) f);
    }

    public final void b0(float f) {
        if (getContext() != null) {
            String string = this.i == 0 ? "" : getContext().getString(this.i);
            String string2 = getContext().getString(c0j.Ul, f + string);
            this.f11791a.setContentDescription(string2);
            this.f11792b.setContentDescription(string2);
        }
    }

    public final void c0(int i) {
        NumberPickerView numberPickerView;
        if (i == 0 || (numberPickerView = this.f11792b) == null) {
            return;
        }
        numberPickerView.setHintText(requireContext().getString(i));
    }

    public final void d0(float f) {
        NumberPickerView numberPickerView = this.f11791a;
        if (numberPickerView == null || this.f11792b == null) {
            return;
        }
        numberPickerView.setValue(H(f));
        Y(f);
        this.f11792b.setValue(F(f));
        b0(f);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomTitle(View view) {
        super.initCustomTitle(view);
        this.j = (TextView) view.findViewById(eri.bn);
        TextView textView = (TextView) view.findViewById(eri.Ak);
        this.f11793k = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: wx9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38454a.L(view2);
            }
        });
        T(this.l);
        setTitle(this.h);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f11791a = (NumberPickerView) view.findViewById(eri.Jc);
        this.f11792b = (NumberPickerView) view.findViewById(eri.Kc);
        this.q = (TextView) view.findViewById(eri.c3);
        String strValueOf = String.valueOf(Character.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getDecimalSeparator()));
        if (strValueOf.isEmpty()) {
            strValueOf = ".";
        }
        this.q.setText(strValueOf);
        Logger.d("FloatNumberPickerDialog", "decimalSeparatorStr=" + strValueOf);
        this.f11791a.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: yx9
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView, int i, int i2) {
                this.f40660a.M(numberPickerView, i, i2);
            }
        });
        this.f11792b.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: ay9
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
            public final void a(NumberPickerView numberPickerView, int i, int i2) {
                this.f3566a.N(numberPickerView, i, i2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.c = bundle.getFloat("key_value", 0.0f);
        }
        a0(this.e);
        Z(this.d);
        this.f11791a.setOnValueChangedListener(new NumberPickerView.d() { // from class: sx9
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                this.f34075a.O(numberPickerView, i, i2);
            }
        });
        this.f11792b.setOnValueChangedListener(new NumberPickerView.d() { // from class: ux9
            @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
            public final void onValueChange(NumberPickerView numberPickerView, int i, int i2) {
                this.f36247a.P(numberPickerView, i, i2);
            }
        });
        float f = this.c;
        if (f != 0.0f) {
            d0(f);
            this.c = 0.0f;
        }
        this.f11792b.setNumberDigits(this.p);
        c0(this.f);
        this.g = true;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.g = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putFloat("key_value", K());
            setResultData(Integer.valueOf(i), bundle);
        } else if (this.m) {
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("key_value", 0.0f);
            setResultData(-4, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Q();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f11791a == null || this.f11792b == null) {
            return;
        }
        bundle.putFloat("key_value", K());
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onShow() {
        this.m = false;
    }

    public void setTitle(int i) {
        this.h = i;
        TextView textView = this.j;
        if (textView != null) {
            try {
                textView.setText(i);
            } catch (Resources.NotFoundException e) {
                Logger.e("FloatNumberPickerDialog", "setTitle: " + e.getMessage());
            }
        }
    }
}
