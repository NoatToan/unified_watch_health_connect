package com.xiaomi.fitness.electronic.scale.widget;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import defpackage.gsi;
import defpackage.loi;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class ElectronicScaleSingleChoiceDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f12140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, Integer> f12141b;
    public int c;
    public int d;
    public RadioGroup e;
    public int[] f;
    public boolean g = true;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ElectronicScaleSingleChoiceDialog.this.d = gsi.V;
            ElectronicScaleSingleChoiceDialog.this.F(gsi.V, true);
            ElectronicScaleSingleChoiceDialog.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ElectronicScaleSingleChoiceDialog.this.d = gsi.W;
            ElectronicScaleSingleChoiceDialog.this.F(gsi.W, true);
            ElectronicScaleSingleChoiceDialog.this.dismiss();
        }
    }

    public static class c extends com.xiaomi.fitness.baseui.dialog.a<c, DialogParams, ElectronicScaleSingleChoiceDialog> {
        public c(String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ElectronicScaleSingleChoiceDialog internalCreate() {
            return new ElectronicScaleSingleChoiceDialog();
        }

        public c(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    public ElectronicScaleSingleChoiceDialog() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(RadioGroup radioGroup, int i) {
        this.d = i;
        int childCount = radioGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int id = radioGroup.getChildAt(i2).getId();
            if (id == i) {
                F(i, true);
            } else {
                F(id, false);
            }
        }
        if (this.g) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    public void F(int i, boolean z) {
        RadioButton radioButton = (RadioButton) this.e.findViewById(i);
        if (radioButton != null) {
            radioButton.setChecked(z);
            if (!z) {
                radioButton.setCompoundDrawablesRelative(null, null, null, null);
                return;
            }
            Drawable drawable = getResources().getDrawable(loi.f, null);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            radioButton.setCompoundDrawablesRelative(null, null, drawable, null);
        }
    }

    private void I() {
        Objects.requireNonNull(this.f);
        if (this.f.length != this.e.getChildCount()) {
            throw new InvalidParameterException("option res id array count mismatch radio group");
        }
        for (int i = 0; i < this.e.getChildCount(); i++) {
            ((RadioButton) this.e.getChildAt(i)).setText(this.f[i]);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c buildUpon() {
        return new c(requireDialogParams());
    }

    public int C() {
        Integer num = this.f12140a.get(Integer.valueOf(this.d));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void D() {
        if (this.f12140a == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f12140a = arrayMap;
            arrayMap.put(Integer.valueOf(gsi.V), 1);
            this.f12140a.put(Integer.valueOf(gsi.W), 2);
        }
        if (this.f12141b == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            this.f12141b = arrayMap2;
            arrayMap2.put(1, Integer.valueOf(gsi.V));
            this.f12141b.put(2, Integer.valueOf(gsi.W));
        }
    }

    public void G(int i) {
        Integer num = this.f12141b.get(Integer.valueOf(i));
        if (num == null) {
            this.c = 0;
            this.d = 0;
        } else {
            int iIntValue = num.intValue();
            this.c = iIntValue;
            this.d = iIntValue;
        }
    }

    public void H(int[] iArr) {
        this.f = iArr;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.e = (RadioGroup) view.findViewById(gsi.X);
        view.findViewById(gsi.V).setOnClickListener(new a());
        view.findViewById(gsi.W).setOnClickListener(new b());
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        Bundle bundle = new Bundle();
        bundle.putInt("selected_option", C());
        setResultData(Integer.valueOf(i), bundle);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @RequiresApi(api = 21)
    public void onStart() {
        super.onStart();
        I();
        F(this.d, true);
        this.e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: z58
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f40900a.E(radioGroup, i);
            }
        });
    }
}
