package com.huami.lib.rainbow;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintProperties;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.slider.Slider;
import com.huami.lib.rainbow.widget.SwitchCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class ListTile extends ConstraintLayout {
    private ImageView a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private SwitchCompat i;
    private Slider j;
    private int k;
    private Paint l;
    private int m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerPosition {
        public static final int ALL = 3;
        public static final int END = 2;
        public static final int START = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RadiusPosition {
        public static final int ALL = 3;
        public static final int BOTTOM = 2;
        public static final int TOP = 1;
    }

    public class a extends ViewOutlineProvider {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i = this.a;
            if (i == 1) {
                int width = ListTile.this.getWidth();
                int height = ListTile.this.getHeight();
                int i2 = this.b;
                outline.setRoundRect(0, 0, width, height + i2, i2);
                return;
            }
            if (i == 2) {
                outline.setRoundRect(0, -this.b, ListTile.this.getWidth(), ListTile.this.getHeight(), this.b);
            } else {
                if (i != 3) {
                    return;
                }
                outline.setRoundRect(0, 0, ListTile.this.getWidth(), ListTile.this.getHeight(), this.b);
            }
        }
    }

    public ListTile(@NonNull Context context) {
        this(context, null);
    }

    private void a(boolean z) {
        setAlpha(z ? 0.6f : 1.0f);
    }

    private void b() {
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        int i = this.m;
        if (i != 0) {
            this.l.setColor(i);
        } else {
            this.l.setColor(getResources().getColor(R.color.s4));
        }
        this.l.setStrokeWidth(2.0f);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        View viewInflate = ViewGroup.inflate(context, R.layout.rainbow_list_tile, this);
        this.a = (ImageView) viewInflate.findViewById(R.id.rainbow_tile_delete);
        this.b = (ImageView) viewInflate.findViewById(R.id.rainbow_tile_leading);
        this.c = (TextView) viewInflate.findViewById(R.id.rainbow_tile_title);
        this.d = (TextView) viewInflate.findViewById(R.id.rainbow_tile_subtitle);
        this.e = (TextView) viewInflate.findViewById(R.id.rainbow_tile_label);
        this.g = (ImageView) viewInflate.findViewById(R.id.rainbow_tile_indicator);
        this.h = (ImageView) viewInflate.findViewById(R.id.rainbow_round_header_indicator);
        this.f = (ImageView) viewInflate.findViewById(R.id.rainbow_tile_trailing);
        this.i = (SwitchCompat) viewInflate.findViewById(R.id.rainbow_tile_switch);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListTile, i, R.style.Rainbow_Widget_ListTileView);
        try {
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.ListTile_android_enabled, true));
            int i2 = R.styleable.ListTile_ltv_divider_padding;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                this.k = typedArrayObtainStyledAttributes.getColor(i2, 0);
                this.m = typedArrayObtainStyledAttributes.getColor(R.styleable.ListTile_ltv_divider_color, 0);
                b();
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.ListTile_ltv_radius_position, 0);
            if (i3 != 0) {
                setRadiusPosition(i3);
            }
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ListTile_ltv_leading);
            if (drawable != null) {
                int i4 = R.styleable.ListTile_ltv_leadingTint;
                if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                    DrawableCompat.setTint(drawable, typedArrayObtainStyledAttributes.getColor(i4, -16777216));
                }
                setLeading(drawable);
                int i5 = R.styleable.ListTile_ltv_leadingBackground;
                if (typedArrayObtainStyledAttributes.hasValue(i5)) {
                    ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
                    int iRound = Math.round(ViewUtils.dpToPx(context, 40));
                    layoutParams.height = iRound;
                    layoutParams.width = iRound;
                    int color = typedArrayObtainStyledAttributes.getColor(i5, 0);
                    if (color != 0) {
                        ViewCompat.setBackgroundTintList(this.b, ColorStateList.valueOf(color));
                        this.b.setBackgroundResource(R.drawable.rainbow_bg_list_tile_leading);
                    }
                }
            }
            setTitle(typedArrayObtainStyledAttributes.getString(R.styleable.ListTile_ltv_title));
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.ListTile_ltv_slide)) {
                setTrailing((Drawable) null);
                this.j = (Slider) ((ViewStub) viewInflate.findViewById(R.id.rainbow_tile_stub)).inflate().findViewById(R.id.rainbow_tile_slide);
                new ConstraintProperties(this.c).removeConstraints(4).apply();
                return;
            }
            setSubtitle(typedArrayObtainStyledAttributes.getString(R.styleable.ListTile_ltv_subtitle));
            setLabel(typedArrayObtainStyledAttributes.getString(R.styleable.ListTile_ltv_label));
            int i6 = R.styleable.ListTile_ltv_tips;
            if (typedArrayObtainStyledAttributes.hasValue(i6)) {
                setTips(typedArrayObtainStyledAttributes.getString(i6));
            }
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ListTile_ltv_indicator);
            if (drawable2 != null) {
                DrawableCompat.setTint(drawable2, typedArrayObtainStyledAttributes.getColor(R.styleable.ListTile_ltv_indicatorTint, -16777216));
                setIndicatorIcon(drawable2);
            }
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ListTile_ltv_indicator_round_header);
            if (drawable3 != null) {
                setIndicatorHeader(drawable3);
            }
            int i7 = R.styleable.ListTile_ltv_checked;
            if (typedArrayObtainStyledAttributes.hasValue(i7)) {
                setChecked(typedArrayObtainStyledAttributes.getBoolean(i7, false));
            }
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.ListTile_ltv_dot, false)) {
                setDotted(true);
            }
            Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ListTile_ltv_trailing);
            if (drawable4 != null) {
                setTrailing(drawable4);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public CharSequence getSubtitle() {
        return this.d.getText();
    }

    public CharSequence getTips() {
        return this.e.getText();
    }

    public CharSequence getTitle() {
        return this.c.getText();
    }

    public boolean isChecked() {
        return this.i.getVisibility() == 0 && this.i.isChecked();
    }

    public boolean isIndicatorVisible() {
        return this.g.getVisibility() == 0 && this.g.getDrawable() != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        reset();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.l != null) {
            if (isRtl()) {
                int i = this.k;
                float paddingStart = (i == 3 || i == 2) ? getPaddingStart() : 0.0f;
                float height = getHeight();
                int i2 = this.k;
                canvas.drawLine(paddingStart, height, (i2 == 3 || i2 == 1) ? getWidth() - getPaddingEnd() : getWidth(), getHeight(), this.l);
                return;
            }
            int i3 = this.k;
            float paddingStart2 = (i3 == -1 || i3 == 2) ? 0.0f : getPaddingStart();
            float height2 = getHeight();
            int i4 = this.k;
            canvas.drawLine(paddingStart2, height2, (i4 == -1 || i4 == 1) ? getWidth() : getWidth() - getPaddingEnd(), getHeight(), this.l);
        }
    }

    public void reset() {
        this.f.setVisibility(0);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        setAlpha(1.0f);
    }

    public void setChecked(boolean z) {
        setTrailing((Drawable) null);
        this.e.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.i.setChecked(z);
        if (this.d.getVisibility() == 0) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.d.getLayoutParams())).topMargin = getResources().getDimensionPixelSize(R.dimen.d2);
        }
    }

    public void setClickableTitle(CharSequence charSequence) {
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
        this.c.setText(charSequence);
    }

    public void setDividerPadding(int i) {
        this.k = i;
        b();
        invalidate();
    }

    public void setDotted(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
        if (z) {
            this.g.setImageResource(R.drawable.shape_dot);
        }
    }

    public void setEditMode(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a(!z);
        SwitchCompat switchCompat = this.i;
        if (switchCompat != null) {
            switchCompat.setEnabled(z);
        }
        Slider slider = this.j;
        if (slider != null) {
            slider.setEnabled(z);
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public void setGrayEnable(boolean z) {
        a(z);
    }

    public void setIndicatorHeader(Drawable drawable) {
        this.h.setVisibility(0);
        this.h.setImageDrawable(drawable);
    }

    public void setIndicatorIcon(@DrawableRes int i) {
        setIndicatorIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setLabel(@StringRes int i) {
        setLabel(getContext().getText(i));
    }

    public void setLeading(@DrawableRes int i) {
        setLeading(AppCompatResources.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setLeadingIvVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setLeadingTint(@ColorInt int i) {
        setLeadingTint(ColorStateList.valueOf(i));
    }

    public void setOnChangeListener(Slider.OnChangeListener onChangeListener) {
        if (onChangeListener != null) {
            this.j.addOnChangeListener(onChangeListener);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener != null) {
            this.i.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public void setOnDeleteClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.a.setOnClickListener(onClickListener);
        }
    }

    public void setOnLabelClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.e.setOnClickListener(onClickListener);
        }
    }

    public void setRadiusPosition(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a(i, getResources().getDimensionPixelSize(R.dimen.rainbow_corner_radius)));
            setClipToOutline(true);
        }
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleColor(@ColorInt int i) {
        this.d.setTextColor(i);
    }

    public void setSubtitleMaxLines(int i) {
        this.d.setMaxLines(i);
    }

    public void setSwitchViewCenter() {
        new ConstraintProperties(this.i).centerVertically(0).apply();
    }

    public void setTips(@StringRes int i) {
        setTips(getContext().getText(i));
    }

    public void setTipsColor(@ColorInt int i) {
        this.e.setTextColor(i);
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleColor(@ColorInt int i) {
        this.c.setTextColor(i);
    }

    public void setTitleMaxLines(int i) {
        this.c.setMaxLines(i);
    }

    public void setTrailing(@DrawableRes int i) {
        setTrailing(AppCompatResources.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setTrailingIvVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setTrailingTint(@ColorInt int i) {
        setTrailingTint(ColorStateList.valueOf(i));
    }

    public ListTile(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listTileStyle);
    }

    public void setIndicatorIcon(Drawable drawable) {
        this.g.setVisibility(0);
        this.g.setImageDrawable(drawable);
    }

    public void setLabel(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.e.setVisibility(8);
            return;
        }
        setTrailing((Drawable) null);
        this.e.setBackgroundResource(R.drawable.shape_badge);
        this.e.setTextColor(AppCompatResources.getColorStateList(getContext(), R.color.s5));
        TextViewCompat.setTextAppearance(this.e, R.style.Rainbow_TextAppearance_Body5);
        this.e.setVisibility(0);
        this.e.setText(charSequence);
    }

    public void setLeading(Drawable drawable) {
        if (drawable == null) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setImageDrawable(drawable);
        }
    }

    public void setLeadingTint(ColorStateList colorStateList) {
        ImageViewCompat.setImageTintList(this.b, colorStateList);
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setText(charSequence);
        }
    }

    public void setTips(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTrailing(Drawable drawable) {
        int dimensionPixelSize = 0;
        if (drawable != null) {
            this.f.setVisibility(0);
            this.f.setImageDrawable(drawable);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.d5);
        } else {
            this.f.setVisibility(8);
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.setMarginEnd(dimensionPixelSize);
        this.d.setLayoutParams(layoutParams);
    }

    public void setTrailingTint(ColorStateList colorStateList) {
        ImageViewCompat.setImageTintList(this.f, colorStateList);
    }

    public ListTile(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i);
    }
}
