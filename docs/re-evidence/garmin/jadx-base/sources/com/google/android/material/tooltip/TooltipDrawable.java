package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import c7.d;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

/* JADX INFO: loaded from: classes14.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Tooltip;
    private static final int DEFAULT_THEME_ATTR = R.attr.tooltipStyle;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    private TooltipDrawable(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        this.fontMetrics = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27) {
                TooltipDrawable.this.updateLocationOnScreen(view2);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i14;
        int i15 = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        Rect rect = this.displayFrame;
        if (i15 < 0) {
            i14 = ((rect.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((rect.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                return 0.0f;
            }
            i14 = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i14;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    public static TooltipDrawable create(Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i14, int i15) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i14, i15);
        tooltipDrawable.loadFromAttributes(attributeSet, i14, i15);
        return tooltipDrawable;
    }

    private EdgeTreatment createMarkerEdge() {
        float f14 = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.arrowSize)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.arrowSize), Math.min(Math.max(f14, -fWidth), fWidth));
    }

    private void drawText(Canvas canvas) {
        if (this.text == null) {
            return;
        }
        Rect bounds = getBounds();
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(bounds);
        if (this.textDrawableHelper.getTextAppearance() != null) {
            this.textDrawableHelper.getTextPaint().drawableState = getState();
            this.textDrawableHelper.updateTextPaintDrawState(this.context);
            this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iCalculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.getTextWidth(charSequence.toString());
    }

    private void loadFromAttributes(AttributeSet attributeSet, int i14, int i15) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, R.styleable.Tooltip, i14, i15, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
        this.showMarker = z14;
        if (z14) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        } else {
            this.arrowSize = 0;
        }
        setText(typedArrayObtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null) {
            int i16 = R.styleable.Tooltip_android_textColor;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, i16));
            }
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(d.e(MaterialColors.getColor(this.context, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), d.e(MaterialColors.getColor(this.context, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.context, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.layoutMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view2.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(View view2) {
        if (view2 == null) {
            return;
        }
        view2.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f14 = (float) (-((Math.sqrt(2.0d) * ((double) this.arrowSize)) - ((double) this.arrowSize)));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.tooltipPivotY) + getBounds().top);
        canvas.translate(fCalculatePointerOffset, f14);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public int getTextPadding() {
        return this.padding;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.showMarker) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(int i14) {
        this.layoutMargin = i14;
        invalidateSelf();
    }

    public void setMinHeight(int i14) {
        this.minHeight = i14;
        invalidateSelf();
    }

    public void setMinWidth(int i14) {
        this.minWidth = i14;
        invalidateSelf();
    }

    public void setRelativeToView(View view2) {
        if (view2 == null) {
            return;
        }
        updateLocationOnScreen(view2);
        view2.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void setRevealFraction(float f14) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f14;
        this.tooltipScaleY = f14;
        this.labelOpacity = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f14);
        invalidateSelf();
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(int i14) {
        setTextAppearance(new TextAppearance(this.context, i14));
    }

    public void setTextPadding(int i14) {
        this.padding = i14;
        invalidateSelf();
    }

    public void setTextResource(int i14) {
        setText(this.context.getResources().getString(i14));
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }
}
