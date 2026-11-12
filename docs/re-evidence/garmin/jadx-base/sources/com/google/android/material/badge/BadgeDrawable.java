package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private WeakReference<View> anchorViewRef;
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final MaterialShapeDrawable shapeDrawable;
    private final BadgeState state;
    private final TextDrawableHelper textDrawableHelper;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(Context context, int i14, int i15, int i16, BadgeState.State state) {
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i14, i15, i16, state);
        this.state = badgeState;
        this.shapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, hasBadgeContent() ? badgeState.getBadgeWithTextShapeAppearanceResId() : badgeState.getBadgeShapeAppearanceResId(), hasBadgeContent() ? badgeState.getBadgeWithTextShapeAppearanceOverlayResId() : badgeState.getBadgeShapeAppearanceOverlayResId()).build());
        restoreState();
    }

    private void autoAdjustWithinGrandparentBounds(View view2) {
        float y14;
        float x14;
        View customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            if (!(view2.getParent() instanceof View)) {
                return;
            }
            float y15 = view2.getY();
            x14 = view2.getX();
            customBadgeParent = (View) view2.getParent();
            y14 = y15;
        } else if (!isAnchorViewWrappedInCompatParent()) {
            y14 = 0.0f;
            x14 = 0.0f;
        } else {
            if (!(customBadgeParent.getParent() instanceof View)) {
                return;
            }
            y14 = customBadgeParent.getY();
            x14 = customBadgeParent.getX();
            customBadgeParent = (View) customBadgeParent.getParent();
        }
        float topCutOff = getTopCutOff(customBadgeParent, y14);
        float leftCutOff = getLeftCutOff(customBadgeParent, x14);
        float bottomCutOff = getBottomCutOff(customBadgeParent, y14);
        float rightCutoff = getRightCutoff(customBadgeParent, x14);
        if (topCutOff < 0.0f) {
            this.badgeCenterY = Math.abs(topCutOff) + this.badgeCenterY;
        }
        if (leftCutOff < 0.0f) {
            this.badgeCenterX = Math.abs(leftCutOff) + this.badgeCenterX;
        }
        if (bottomCutOff > 0.0f) {
            this.badgeCenterY -= Math.abs(bottomCutOff);
        }
        if (rightCutoff > 0.0f) {
            this.badgeCenterX -= Math.abs(rightCutoff);
        }
    }

    private void calculateCenterAndBounds(Rect rect, View view2) {
        boolean zHasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        float f14 = zHasBadgeContent ? badgeState.badgeWithTextRadius : badgeState.badgeRadius;
        this.cornerRadius = f14;
        if (f14 != -1.0f) {
            this.halfBadgeWidth = f14;
            this.halfBadgeHeight = f14;
        } else {
            boolean zHasBadgeContent2 = hasBadgeContent();
            BadgeState badgeState2 = this.state;
            this.halfBadgeWidth = Math.round((zHasBadgeContent2 ? badgeState2.badgeWithTextWidth : badgeState2.badgeWidth) / 2.0f);
            boolean zHasBadgeContent3 = hasBadgeContent();
            BadgeState badgeState3 = this.state;
            this.halfBadgeHeight = Math.round((zHasBadgeContent3 ? badgeState3.badgeWithTextHeight : badgeState3.badgeHeight) / 2.0f);
        }
        if (hasBadgeContent()) {
            String badgeContent = getBadgeContent();
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(badgeContent) / 2.0f) + this.state.getBadgeHorizontalPadding());
            float fMax = Math.max(this.halfBadgeHeight, (this.textDrawableHelper.getTextHeight(badgeContent) / 2.0f) + this.state.getBadgeVerticalPadding());
            this.halfBadgeHeight = fMax;
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, fMax);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity == 8388691 || badgeGravity == 8388693) {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 == 8388659 || badgeGravity2 == 8388691) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            this.badgeCenterX = view2.getLayoutDirection() == 0 ? (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState : (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
        } else {
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            this.badgeCenterX = view2.getLayoutDirection() == 0 ? (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState : (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
        }
        if (this.state.isAutoAdjustedToGrandparentBounds()) {
            autoAdjustWithinGrandparentBounds(view2);
        }
    }

    public static BadgeDrawable create(Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static BadgeDrawable createFromResource(Context context, int i14) {
        return new BadgeDrawable(context, i14, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    public static BadgeDrawable createFromSavedState(Context context, BadgeState.State state) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    private void drawBadgeContent(Canvas canvas) {
        String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            Rect rect = new Rect();
            this.textDrawableHelper.getTextPaint().getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float fExactCenterY = this.badgeCenterY - rect.exactCenterY();
            canvas.drawText(badgeContent, this.badgeCenterX, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.textDrawableHelper.getTextPaint());
        }
    }

    private String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    private float getBottomCutOff(View view2, float f14) {
        if (!(view2.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterY + this.halfBadgeHeight) - (((View) view2.getParent()).getHeight() - view2.getY())) + f14;
    }

    private CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    private float getLeftCutOff(View view2, float f14) {
        return view2.getX() + (this.badgeCenterX - this.halfBadgeWidth) + f14;
    }

    private String getNumberBadgeText() {
        if (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
        }
        Context context = this.contextRef.get();
        return context == null ? "" : String.format(this.state.getNumberLocale(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.maxBadgeNumber), "+");
    }

    private String getNumberContentDescription() {
        Context context;
        if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        return (this.maxBadgeNumber == -2 || getNumber() <= this.maxBadgeNumber) ? context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), Integer.valueOf(getNumber())) : context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), Integer.valueOf(this.maxBadgeNumber));
    }

    private float getRightCutoff(View view2, float f14) {
        if (!(view2.getParent() instanceof View)) {
            return 0.0f;
        }
        return ((this.badgeCenterX + this.halfBadgeWidth) - (((View) view2.getParent()).getWidth() - view2.getX())) + f14;
    }

    private String getTextBadgeText() {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX);
    }

    private CharSequence getTextContentDescription() {
        CharSequence contentDescriptionForText = this.state.getContentDescriptionForText();
        return contentDescriptionForText != null ? contentDescriptionForText : getText();
    }

    private float getTopCutOff(View view2, float f14) {
        return view2.getY() + (this.badgeCenterY - this.halfBadgeHeight) + f14;
    }

    private int getTotalHorizontalOffsetForState() {
        boolean zHasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        int horizontalOffsetWithText = zHasBadgeContent ? badgeState.getHorizontalOffsetWithText() : badgeState.getHorizontalOffsetWithoutText();
        if (this.state.offsetAlignmentMode == 1) {
            boolean zHasBadgeContent2 = hasBadgeContent();
            BadgeState badgeState2 = this.state;
            horizontalOffsetWithText += zHasBadgeContent2 ? badgeState2.horizontalInsetWithText : badgeState2.horizontalInset;
        }
        return this.state.getAdditionalHorizontalOffset() + horizontalOffsetWithText;
    }

    private int getTotalVerticalOffsetForState() {
        int verticalOffsetWithoutText = this.state.getVerticalOffsetWithoutText();
        if (hasBadgeContent()) {
            verticalOffsetWithoutText = this.state.getVerticalOffsetWithText();
            Context context = this.contextRef.get();
            if (context != null) {
                verticalOffsetWithoutText = AnimationUtils.lerp(verticalOffsetWithoutText, verticalOffsetWithoutText - this.state.getLargeFontVerticalOffsetAdjustment(), AnimationUtils.lerp(0.0f, 1.0f, FONT_SCALE_THRESHOLD, 1.0f, MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithoutText -= Math.round(this.halfBadgeHeight);
        }
        return this.state.getAdditionalVerticalOffset() + verticalOffsetWithoutText;
    }

    private boolean hasBadgeContent() {
        return hasText() || hasNumber();
    }

    private boolean isAnchorViewWrappedInCompatParent() {
        FrameLayout customBadgeParent = getCustomBadgeParent();
        return customBadgeParent != null && customBadgeParent.getId() == R.id.mtrl_anchor_parent;
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != colorStateListValueOf) {
            this.shapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeGravityUpdated() {
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view2 = this.anchorViewRef.get();
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        updateBadgeCoordinates(view2, weakReference2 != null ? weakReference2.get() : null);
    }

    private void onBadgeShapeAppearanceUpdated() {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        boolean zHasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        int badgeWithTextShapeAppearanceResId = zHasBadgeContent ? badgeState.getBadgeWithTextShapeAppearanceResId() : badgeState.getBadgeShapeAppearanceResId();
        boolean zHasBadgeContent2 = hasBadgeContent();
        BadgeState badgeState2 = this.state;
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, badgeWithTextShapeAppearanceResId, zHasBadgeContent2 ? badgeState2.getBadgeWithTextShapeAppearanceOverlayResId() : badgeState2.getBadgeShapeAppearanceOverlayResId()).build());
        invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        TextAppearance textAppearance;
        Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    private void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onNumberUpdated() {
        if (hasText()) {
            return;
        }
        onBadgeContentUpdated();
    }

    private void onTextUpdated() {
        onBadgeContentUpdated();
    }

    private void onVisibilityUpdated() {
        boolean zIsVisible = this.state.isVisible();
        setVisible(zIsVisible, false);
        if (!BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || zIsVisible) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private void tryWrapAnchorInCompatParent(final View view2) {
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view2);
                final FrameLayout frameLayout = new FrameLayout(view2.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view2.getLayoutParams());
                frameLayout.setMinimumWidth(view2.getWidth());
                frameLayout.setMinimumHeight(view2.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view2);
                viewGroup.removeViewAt(iIndexOfChild);
                view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view2);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new Runnable() { // from class: com.google.android.material.badge.BadgeDrawable.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BadgeDrawable.this.updateBadgeCoordinates(view2, frameLayout);
                    }
                });
            }
        }
    }

    private static void updateAnchorParentToNotClip(View view2) {
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (context == null || view2 == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view2.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view2.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view2, rect2);
        }
        calculateCenterAndBounds(rect2, view2);
        BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        float f14 = this.cornerRadius;
        if (f14 != -1.0f) {
            this.shapeDrawable.setCornerSize(f14);
        }
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }

    public void clearNumber() {
        if (this.state.hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    public void clearText() {
        if (this.state.hasText()) {
            this.state.clearText();
            onTextUpdated();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasBadgeContent()) {
            drawBadgeContent(canvas);
        }
    }

    public int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    public int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    public CharSequence getContentDescription() {
        if (!isVisible()) {
            return null;
        }
        if (hasText()) {
            return getTextContentDescription();
        }
        return hasNumber() ? getNumberContentDescription() : getEmptyContentDescription();
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public int getNumber() {
        if (this.state.hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    public String getText() {
        return this.state.getText();
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public boolean hasNumber() {
        return !this.state.hasText() && this.state.hasNumber();
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int i14) {
        this.state.setAdditionalHorizontalOffset(i14);
        updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(int i14) {
        this.state.setAdditionalVerticalOffset(i14);
        updateCenterAndBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i14) {
        this.state.setAlpha(i14);
        onAlphaUpdated();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z14) {
        if (this.state.isAutoAdjustedToGrandparentBounds() == z14) {
            return;
        }
        this.state.setAutoAdjustToGrandparentBounds(z14);
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
    }

    public void setBackgroundColor(int i14) {
        this.state.setBackgroundColor(i14);
        onBackgroundColorUpdated();
    }

    public void setBadgeGravity(int i14) {
        if (i14 != 8388691) {
        }
        if (this.state.getBadgeGravity() != i14) {
            this.state.setBadgeGravity(i14);
            onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(Locale locale) {
        if (locale.equals(this.state.getNumberLocale())) {
            return;
        }
        this.state.setNumberLocale(locale);
        invalidateSelf();
    }

    public void setBadgeTextColor(int i14) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i14) {
            this.state.setBadgeTextColor(i14);
            onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(int i14) {
        this.state.setBadgeWithTextShapeAppearanceResId(i14);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int i14) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i14);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(int i14) {
        this.state.setBadgeShapeAppearanceResId(i14);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int i14) {
        this.state.setBadgeShapeAppearanceOverlayResId(i14);
        onBadgeShapeAppearanceUpdated();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i14) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i14);
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(int i14) {
        this.state.setContentDescriptionQuantityStringsResource(i14);
    }

    public void setHorizontalOffset(int i14) {
        setHorizontalOffsetWithoutText(i14);
        setHorizontalOffsetWithText(i14);
    }

    public void setHorizontalOffsetWithText(int i14) {
        this.state.setHorizontalOffsetWithText(i14);
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(int i14) {
        this.state.setHorizontalOffsetWithoutText(i14);
        updateCenterAndBounds();
    }

    public void setHorizontalPadding(int i14) {
        if (i14 != this.state.getBadgeHorizontalPadding()) {
            this.state.setBadgeHorizontalPadding(i14);
            updateCenterAndBounds();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(int i14) {
        this.state.setLargeFontVerticalOffsetAdjustment(i14);
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i14) {
        if (this.state.getMaxCharacterCount() != i14) {
            this.state.setMaxCharacterCount(i14);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setMaxNumber(int i14) {
        if (this.state.getMaxNumber() != i14) {
            this.state.setMaxNumber(i14);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setNumber(int i14) {
        int iMax = Math.max(0, i14);
        if (this.state.getNumber() != iMax) {
            this.state.setNumber(iMax);
            onNumberUpdated();
        }
    }

    public void setText(String str) {
        if (TextUtils.equals(this.state.getText(), str)) {
            return;
        }
        this.state.setText(str);
        onTextUpdated();
    }

    public void setTextAppearance(int i14) {
        this.state.setTextAppearanceResId(i14);
        onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int i14) {
        setVerticalOffsetWithoutText(i14);
        setVerticalOffsetWithText(i14);
    }

    public void setVerticalOffsetWithText(int i14) {
        this.state.setVerticalOffsetWithText(i14);
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(int i14) {
        this.state.setVerticalOffsetWithoutText(i14);
        updateCenterAndBounds();
    }

    public void setVerticalPadding(int i14) {
        if (i14 != this.state.getBadgeVerticalPadding()) {
            this.state.setBadgeVerticalPadding(i14);
            updateCenterAndBounds();
        }
    }

    public void setVisible(boolean z14) {
        this.state.setVisible(z14);
        onVisibilityUpdated();
    }

    public void updateBadgeCoordinates(View view2, FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view2);
        boolean z14 = BadgeUtils.USE_COMPAT_PARENT;
        if (z14 && frameLayout == null) {
            tryWrapAnchorInCompatParent(view2);
        } else {
            this.customBadgeParentRef = new WeakReference<>(frameLayout);
        }
        if (!z14) {
            updateAnchorParentToNotClip(view2);
        }
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void updateBadgeCoordinates(View view2) {
        updateBadgeCoordinates(view2, (FrameLayout) null);
    }

    @Deprecated
    public void updateBadgeCoordinates(View view2, ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view2, (FrameLayout) viewGroup);
        } else {
            h.s("customBadgeParent must be a FrameLayout");
        }
    }
}
