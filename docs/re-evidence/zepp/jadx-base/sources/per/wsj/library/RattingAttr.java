package per.wsj.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;

/* JADX INFO: loaded from: classes23.dex */
public class RattingAttr {
    private Context a;
    private int b;
    private int c;
    private int d;
    private ColorStateList e;
    private ColorStateList f;
    private ColorStateList g;
    private boolean h;

    public RattingAttr(Context context, int starCount, int bgDrawable, int starDrawable, ColorStateList bgColor, ColorStateList secondaryStarColor, ColorStateList starColor, boolean keepOriginColor) {
        this.a = context;
        this.b = starCount;
        this.c = bgDrawable;
        this.d = starDrawable;
        this.h = keepOriginColor;
        this.e = bgColor;
        this.f = secondaryStarColor;
        this.g = starColor;
    }

    @SuppressLint({"RtlHardcoded"})
    private Drawable a(int tileResId, int tintAttrRes, boolean mKeepOriginColor) {
        return new ClipDrawable(c(tileResId, tintAttrRes, mKeepOriginColor), 3, 1);
    }

    @SuppressLint({"RtlHardcoded"})
    private Drawable b(int tileResId, int tintColor) {
        return new ClipDrawable(d(tileResId, tintColor), 3, 1);
    }

    private Drawable c(int tileRes, int tintAttrRes, boolean mKeepOriginColor) {
        return d(tileRes, !mKeepOriginColor ? e(tintAttrRes) : -1);
    }

    private Drawable d(int tileRes, int tintColor) {
        TileDrawable tileDrawable = new TileDrawable(AppCompatResources.getDrawable(this.a, tileRes));
        tileDrawable.mutate();
        if (tintColor != -1) {
            tileDrawable.setTint(tintColor);
        }
        return tileDrawable;
    }

    private int e(int attrRes) {
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(new int[]{attrRes});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ColorStateList getBgColor() {
        return this.e;
    }

    public int getBgDrawable() {
        return this.c;
    }

    public Drawable[] getLayerList() {
        return new Drawable[]{c(this.c, R.attr.colorControlHighlight, this.h), b(this.d, 0), a(this.d, R.attr.colorControlActivated, this.h)};
    }

    public ColorStateList getSecondaryStarColor() {
        return this.f;
    }

    public ColorStateList getStarColor() {
        return this.g;
    }

    public int getStarCount() {
        return this.b;
    }

    public int getStarDrawable() {
        return this.d;
    }

    public boolean isKeepOriginColor() {
        return this.h;
    }

    public void setBgColor(ColorStateList bgColor) {
        this.e = bgColor;
    }

    public void setBgDrawable(int bgDrawable) {
        this.c = bgDrawable;
    }

    public void setKeepOriginColor(boolean keepOriginColor) {
        this.h = keepOriginColor;
    }

    public void setSecondaryStarColor(ColorStateList secondaryStarColor) {
        this.f = secondaryStarColor;
    }

    public void setStarColor(ColorStateList starColor) {
        this.g = starColor;
    }

    public void setStarCount(int starCount) {
        this.b = starCount;
    }

    public void setStarDrawable(int starDrawable) {
        this.d = starDrawable;
    }
}
