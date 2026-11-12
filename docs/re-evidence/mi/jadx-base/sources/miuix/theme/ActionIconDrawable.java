package miuix.theme;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import defpackage.t5j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class ActionIconDrawable extends VectorDrawable {
    private static final int[] STATE_DISABLED = {-16842910};
    private static final int[] STATE_PRESSED = {R.attr.state_enabled, R.attr.state_pressed};
    private int mActionIconHeight;
    private int mActionIconWidth;
    private float mNormalAlpha = 0.8f;
    private float mPressedAlpha = 0.5f;
    private float mDisabledAlpha = 0.3f;

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, t5j.f34342a, 0, 0) : resources.obtainAttributes(attributeSet, t5j.f34342a);
        this.mNormalAlpha = typedArrayObtainStyledAttributes.getFloat(t5j.d, 0.0f);
        this.mPressedAlpha = typedArrayObtainStyledAttributes.getFloat(t5j.e, 0.0f);
        this.mDisabledAlpha = typedArrayObtainStyledAttributes.getFloat(t5j.f34343b, 0.0f);
        this.mActionIconWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(t5j.f, 0);
        this.mActionIconHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(t5j.c, 0);
        typedArrayObtainStyledAttributes.recycle();
        setAlphaF(this.mNormalAlpha);
    }

    private void setAlphaF(float f) {
        setAlpha((int) (f * 255.0f));
    }

    private boolean toDisabledState() {
        setAlphaF(this.mDisabledAlpha);
        return true;
    }

    private boolean toNormalState() {
        setAlphaF(this.mNormalAlpha);
        return true;
    }

    private boolean toPressedState() {
        setAlphaF(this.mPressedAlpha);
        return true;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.mActionIconWidth;
        if (i != 0 && this.mActionIconHeight != 0) {
            canvas.translate((i - super.getIntrinsicWidth()) >> 1, (this.mActionIconHeight - super.getIntrinsicHeight()) >> 1);
            canvas.scale(super.getIntrinsicWidth() / this.mActionIconWidth, super.getIntrinsicHeight() / this.mActionIconHeight, 0.5f, 0.5f);
        }
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return null;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.mActionIconHeight;
        return i == 0 ? super.getIntrinsicHeight() : i;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.mActionIconWidth;
        return i == 0 ? super.getIntrinsicWidth() : i;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        init(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        super.onStateChange(iArr);
        if (StateSet.stateSetMatches(STATE_DISABLED, iArr)) {
            return toDisabledState();
        }
        return StateSet.stateSetMatches(STATE_PRESSED, iArr) ? toPressedState() : toNormalState();
    }
}
