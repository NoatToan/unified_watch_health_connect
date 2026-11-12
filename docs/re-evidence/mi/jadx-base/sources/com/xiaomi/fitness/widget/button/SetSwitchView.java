package com.xiaomi.fitness.widget.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b5j;
import defpackage.ksi;
import defpackage.qvi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class SetSwitchView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13449b;
    public SwitchButton c;
    public View d;
    public ImageView e;

    public SetSwitchView(Context context) {
        this(context, null);
    }

    private void initView() {
        this.c = (SwitchButton) findViewById(ksi.D);
        this.f13448a = (TextView) findViewById(ksi.F);
        this.f13449b = (TextView) findViewById(ksi.B);
        this.d = findViewById(ksi.E);
        this.e = (ImageView) findViewById(ksi.C);
    }

    private void setValue(TypedArray typedArray) {
        if (typedArray == null) {
            return;
        }
        String string = typedArray.getString(b5j.M4);
        String string2 = typedArray.getString(b5j.J4);
        boolean z = typedArray.getBoolean(b5j.K4, true);
        boolean z2 = typedArray.getBoolean(b5j.L4, true);
        this.f13448a.setText(string);
        if (!z || TextUtils.isEmpty(string2)) {
            this.f13449b.setVisibility(8);
        } else {
            this.f13449b.setVisibility(0);
            this.f13449b.setText(string2);
        }
        if (z2) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(8);
        }
        Drawable drawable = typedArray.getDrawable(b5j.I4);
        if (drawable != null) {
            this.e.setImageDrawable(drawable);
        } else {
            this.e.setVisibility(8);
        }
        if (typedArray.getBoolean(b5j.H4, false)) {
            findViewById(ksi.f24262a).setVisibility(0);
            this.c.setVisibility(8);
        } else {
            findViewById(ksi.f24262a).setVisibility(8);
            this.c.setVisibility(0);
        }
    }

    public SwitchButton getSwitch() {
        return this.c;
    }

    public void setChecked(boolean z) {
        SwitchButton switchButton = this.c;
        if (switchButton != null) {
            switchButton.i(z, false, false);
        }
    }

    public void setDes_(@NotNull String str) {
        this.f13449b.setText(str);
        this.f13449b.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f13448a.setEnabled(z);
        this.f13449b.setEnabled(z);
        this.c.setEnabled(z);
        this.e.setEnabled(z);
        this.d.setEnabled(z);
    }

    public void setIcon_(Drawable drawable) {
        if (drawable == null) {
            this.e.setVisibility(8);
        } else {
            this.e.setImageDrawable(drawable);
            this.e.setVisibility(0);
        }
    }

    public void setLineShow(boolean z) {
        if (z) {
            this.d.setVisibility(0);
        } else {
            this.d.setVisibility(4);
        }
    }

    public void setTitle_(String str) {
        this.f13448a.setText(str);
    }

    public SetSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(qvi.j, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5j.G4);
        initView();
        setValue(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
