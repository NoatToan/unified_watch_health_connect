package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.e;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.WeakHashMap;
import m.d;

/* JADX INFO: loaded from: classes14.dex */
public class MaterialAlertDialogBuilder extends e.a {
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(Context context, int i14) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i14));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i15 = DEF_STYLE_ATTR;
        int i16 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i15, i16);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, R.styleable.MaterialAlertDialog, i15, i16);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialAlertDialog_backgroundTint, color);
        typedArrayObtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i15, i16);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            materialShapeDrawable.setCornerSize(dimension);
        }
        this.background = materialShapeDrawable;
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context contextWrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? contextWrap : new d(contextWrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    private static int getOverridingThemeResId(Context context, int i14) {
        return i14 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i14;
    }

    @Override // androidx.appcompat.app.e.a
    public e create() {
        e eVarCreate = super.create();
        Window window = eVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            ((MaterialShapeDrawable) drawable).setElevation(decorView.getElevation());
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(eVarCreate, this.backgroundInsets));
        return eVarCreate;
    }

    public Drawable getBackground() {
        return this.background;
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i14) {
        this.backgroundInsets.bottom = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i14) {
        int layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
        Rect rect = this.backgroundInsets;
        if (layoutDirection == 1) {
            rect.left = i14;
            return this;
        }
        rect.right = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i14) {
        int layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
        Rect rect = this.backgroundInsets;
        if (layoutDirection == 1) {
            rect.right = i14;
            return this;
        }
        rect.left = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i14) {
        this.backgroundInsets.top = i14;
        return this;
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCancelable(boolean z14) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCustomTitle(View view2) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view2);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(int i14) {
        return (MaterialAlertDialogBuilder) super.setIcon(i14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIconAttribute(int i14) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i14, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(int i14) {
        return (MaterialAlertDialogBuilder) super.setMessage(i14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(int i14, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i14, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i14, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i14, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i14, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(int i14, int i15, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i14, i15, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(int i14) {
        return (MaterialAlertDialogBuilder) super.setTitle(i14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(int i14) {
        return (MaterialAlertDialogBuilder) super.setView(i14);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(View view2) {
        return (MaterialAlertDialogBuilder) super.setView(view2);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i14, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i14, str, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i14, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i14, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i14, onClickListener);
    }

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }
}
