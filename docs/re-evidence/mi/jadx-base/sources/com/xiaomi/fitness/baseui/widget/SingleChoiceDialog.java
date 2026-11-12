package com.xiaomi.fitness.baseui.widget;

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

/* JADX INFO: loaded from: classes7.dex */
public class SingleChoiceDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f11716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<Integer, Integer> f11717b;
    public int c;
    public int d;
    public RadioGroup f;
    public int[] g;
    public boolean e = true;
    public boolean h = true;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, SingleChoiceDialog> {
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
        public SingleChoiceDialog internalCreate() {
            return new SingleChoiceDialog();
        }

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }
    }

    public SingleChoiceDialog() {
        B();
    }

    private void H() {
        int[] iArr = this.g;
        if (iArr == null) {
            return;
        }
        Objects.requireNonNull(iArr);
        if (this.g.length != this.f.getChildCount()) {
            throw new InvalidParameterException("option res id array count mismatch radio group");
        }
        for (int i = 0; i < this.f.getChildCount(); i++) {
            ((RadioButton) this.f.getChildAt(i)).setText(this.g[i]);
        }
    }

    public int A() {
        Integer num = this.f11716a.get(Integer.valueOf(this.d));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void B() {
        if (this.f11716a == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f11716a = arrayMap;
            arrayMap.put(Integer.valueOf(gsi.V), 1);
            this.f11716a.put(Integer.valueOf(gsi.W), 2);
        }
        if (this.f11717b == null) {
            ArrayMap arrayMap2 = new ArrayMap();
            this.f11717b = arrayMap2;
            arrayMap2.put(1, Integer.valueOf(gsi.V));
            this.f11717b.put(2, Integer.valueOf(gsi.W));
        }
    }

    public final /* synthetic */ void C(RadioGroup radioGroup, int i) {
        this.d = i;
        int childCount = radioGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int id = radioGroup.getChildAt(i2).getId();
            if (id == i) {
                D(i, true);
            } else {
                D(id, false);
            }
        }
        if (this.h) {
            dismiss();
        }
    }

    @RequiresApi(api = 21)
    public final void D(int i, boolean z) {
        RadioButton radioButton = (RadioButton) this.f.findViewById(i);
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

    public void E(boolean z) {
        this.e = z;
    }

    public void F(int i) {
        Integer numValueOf = this.f11717b.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = this.e ? Integer.valueOf(gsi.V) : 0;
        }
        int iIntValue = numValueOf.intValue();
        this.c = iIntValue;
        this.d = iIntValue;
    }

    public void G(int[] iArr) {
        this.g = iArr;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f = (RadioGroup) view.findViewById(gsi.X);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = bundle.getIntArray("option_array");
            this.d = bundle.getInt("current_select_id");
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        Bundle bundle = new Bundle();
        bundle.putInt("selected_option", A());
        setResultData(Integer.valueOf(i), bundle);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putIntArray("option_array", this.g);
        bundle.putInt("current_select_id", this.d);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @RequiresApi(api = 21)
    public void onStart() {
        super.onStart();
        H();
        D(this.d, true);
        this.f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: cem
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f5250a.C(radioGroup, i);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public a buildUpon() {
        return new a(requireDialogParams());
    }
}
