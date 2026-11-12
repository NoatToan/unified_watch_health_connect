package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.errorprone.annotations.InlineMe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.zad = null;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.android.gms.base.R.styleable.SignInButton, 0, 0);
        try {
            this.zaa = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
            this.zab = typedArrayObtainStyledAttributes.getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.zaa, this.zab);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    private final void zaa(Context context) {
        View view2 = this.zac;
        if (view2 != null) {
            removeView(view2);
        }
        try {
            this.zac = zaz.zaa(context, this.zaa, this.zab);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i14 = this.zaa;
            int i15 = this.zab;
            zaaa zaaaVar = new zaaa(context, null);
            zaaaVar.zaa(context.getResources(), i14, i15);
            this.zac = zaaaVar;
        }
        addView(this.zac);
        this.zac.setEnabled(isEnabled());
        this.zac.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener == null || view2 != this.zac) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i14) {
        setStyle(this.zaa, i14);
    }

    @Override // android.view.View
    public void setEnabled(boolean z14) {
        super.setEnabled(z14);
        this.zac.setEnabled(z14);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        View view2 = this.zac;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        setStyle(this.zaa, this.zab);
    }

    public void setSize(int i14) {
        setStyle(i14, this.zab);
    }

    public void setStyle(int i14, int i15) {
        this.zaa = i14;
        this.zab = i15;
        zaa(getContext());
    }

    @InlineMe(replacement = "this.setStyle(buttonSize, colorScheme)")
    @Deprecated
    public void setStyle(int i14, int i15, Scope[] scopeArr) {
        setStyle(i14, i15);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context) {
        this(context, null);
    }
}
