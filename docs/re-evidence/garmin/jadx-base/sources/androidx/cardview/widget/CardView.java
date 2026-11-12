package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final c IMPL = new androidx.cardview.widget.a();
    private final b mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f6007a;

        public a() {
        }

        public final void a(int i14, int i15, int i16, int i17) {
            CardView cardView = CardView.this;
            cardView.mShadowBounds.set(i14, i15, i16, i17);
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i14 + rect.left, i15 + rect.top, i16 + rect.right, i17 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i14) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i14);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a();
        this.mCardViewDelegate = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o1.a.f128493a, i14, com.garmin.android.apps.connectmobile.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.garmin.android.apps.connectmobile.R.color.cardview_light_background) : getResources().getColor(com.garmin.android.apps.connectmobile.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        androidx.cardview.widget.a aVar2 = (androidx.cardview.widget.a) IMPL;
        aVar2.getClass();
        d dVar = new d(colorStateListValueOf, dimension);
        aVar.f6007a = dVar;
        CardView cardView = CardView.this;
        cardView.setBackgroundDrawable(dVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        aVar2.a(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        return ((a) bVar).f6007a.f6016h;
    }

    public float getCardElevation() {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        return ((a) bVar).f6007a.f6013e;
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        return ((a) bVar).f6007a.f6009a;
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        c cVar = IMPL;
        if (cVar instanceof androidx.cardview.widget.a) {
            super.onMeasure(i14, i15);
            return;
        }
        int mode = View.MeasureSpec.getMode(i14);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            b bVar = this.mCardViewDelegate;
            ((androidx.cardview.widget.a) cVar).getClass();
            i14 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(((a) bVar).f6007a.f6009a * 2.0f), View.MeasureSpec.getSize(i14)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i15);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            b bVar2 = this.mCardViewDelegate;
            ((androidx.cardview.widget.a) cVar).getClass();
            i15 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(((a) bVar2).f6007a.f6009a * 2.0f), View.MeasureSpec.getSize(i15)), mode2);
        }
        super.onMeasure(i14, i15);
    }

    public void setCardBackgroundColor(int i14) {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i14);
        ((androidx.cardview.widget.a) cVar).getClass();
        d dVar = ((a) bVar).f6007a;
        if (colorStateListValueOf == null) {
            dVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        dVar.f6016h = colorStateListValueOf;
        dVar.f6010b.setColor(colorStateListValueOf.getColorForState(dVar.getState(), dVar.f6016h.getDefaultColor()));
        dVar.invalidateSelf();
    }

    public void setCardElevation(float f14) {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        CardView.this.setElevation(f14);
    }

    public void setContentPadding(int i14, int i15, int i16, int i17) {
        this.mContentPadding.set(i14, i15, i16, i17);
        ((androidx.cardview.widget.a) IMPL).b(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f14) {
        ((androidx.cardview.widget.a) IMPL).a(this.mCardViewDelegate, f14);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i14) {
        this.mUserSetMinHeight = i14;
        super.setMinimumHeight(i14);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i14) {
        this.mUserSetMinWidth = i14;
        super.setMinimumWidth(i14);
    }

    @Override // android.view.View
    public void setPadding(int i14, int i15, int i16, int i17) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i14, int i15, int i16, int i17) {
    }

    public void setPreventCornerOverlap(boolean z14) {
        if (z14 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z14;
            c cVar = IMPL;
            b bVar = this.mCardViewDelegate;
            androidx.cardview.widget.a aVar = (androidx.cardview.widget.a) cVar;
            aVar.getClass();
            aVar.a(bVar, ((a) bVar).f6007a.f6013e);
        }
    }

    public void setRadius(float f14) {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        d dVar = ((a) bVar).f6007a;
        if (f14 == dVar.f6009a) {
            return;
        }
        dVar.f6009a = f14;
        dVar.b(null);
        dVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z14) {
        if (this.mCompatPadding != z14) {
            this.mCompatPadding = z14;
            c cVar = IMPL;
            b bVar = this.mCardViewDelegate;
            androidx.cardview.widget.a aVar = (androidx.cardview.widget.a) cVar;
            aVar.getClass();
            aVar.a(bVar, ((a) bVar).f6007a.f6013e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c cVar = IMPL;
        b bVar = this.mCardViewDelegate;
        ((androidx.cardview.widget.a) cVar).getClass();
        d dVar = ((a) bVar).f6007a;
        if (colorStateList == null) {
            dVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        dVar.f6016h = colorStateList;
        dVar.f6010b.setColor(colorStateList.getColorForState(dVar.getState(), dVar.f6016h.getDefaultColor()));
        dVar.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.garmin.android.apps.connectmobile.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
