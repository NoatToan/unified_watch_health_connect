package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class Cue implements Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private static final int i = 8;
    private static final int j = 9;
    private static final int k = 10;
    private static final int l = 11;
    private static final int m = 12;
    private static final int n = 13;
    private static final int o = 14;
    private static final int p = 15;
    private static final int q = 16;

    @Nullable
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;

    @Nullable
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;

    @Nullable
    public final CharSequence text;

    @Nullable
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;
    public static final Cue EMPTY = new Builder().setText("").build();
    public static final Bundleable.Creator<Cue> CREATOR = new Bundleable.Creator() { // from class: t11
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Cue.b(bundle);
        }
    };

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    public static final class Builder {

        @Nullable
        private CharSequence a;

        @Nullable
        private Bitmap b;

        @Nullable
        private Layout.Alignment c;

        @Nullable
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;

        @ColorInt
        private int o;
        private int p;
        private float q;

        public Cue build() {
            return new Cue(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        public Builder clearWindowColor() {
            this.n = false;
            return this;
        }

        @Nullable
        @Pure
        public Bitmap getBitmap() {
            return this.b;
        }

        @Pure
        public float getBitmapHeight() {
            return this.m;
        }

        @Pure
        public float getLine() {
            return this.e;
        }

        @Pure
        public int getLineAnchor() {
            return this.g;
        }

        @Pure
        public int getLineType() {
            return this.f;
        }

        @Pure
        public float getPosition() {
            return this.h;
        }

        @Pure
        public int getPositionAnchor() {
            return this.i;
        }

        @Pure
        public float getSize() {
            return this.l;
        }

        @Nullable
        @Pure
        public CharSequence getText() {
            return this.a;
        }

        @Nullable
        @Pure
        public Layout.Alignment getTextAlignment() {
            return this.c;
        }

        @Pure
        public float getTextSize() {
            return this.k;
        }

        @Pure
        public int getTextSizeType() {
            return this.j;
        }

        @Pure
        public int getVerticalType() {
            return this.p;
        }

        @ColorInt
        @Pure
        public int getWindowColor() {
            return this.o;
        }

        public boolean isWindowColorSet() {
            return this.n;
        }

        public Builder setBitmap(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public Builder setBitmapHeight(float bitmapHeight) {
            this.m = bitmapHeight;
            return this;
        }

        public Builder setLine(float line, int lineType) {
            this.e = line;
            this.f = lineType;
            return this;
        }

        public Builder setLineAnchor(int lineAnchor) {
            this.g = lineAnchor;
            return this;
        }

        public Builder setMultiRowAlignment(@Nullable Layout.Alignment multiRowAlignment) {
            this.d = multiRowAlignment;
            return this;
        }

        public Builder setPosition(float position) {
            this.h = position;
            return this;
        }

        public Builder setPositionAnchor(int positionAnchor) {
            this.i = positionAnchor;
            return this;
        }

        public Builder setShearDegrees(float shearDegrees) {
            this.q = shearDegrees;
            return this;
        }

        public Builder setSize(float size) {
            this.l = size;
            return this;
        }

        public Builder setText(CharSequence text) {
            this.a = text;
            return this;
        }

        public Builder setTextAlignment(@Nullable Layout.Alignment textAlignment) {
            this.c = textAlignment;
            return this;
        }

        public Builder setTextSize(float textSize, int textSizeType) {
            this.k = textSize;
            this.j = textSizeType;
            return this;
        }

        public Builder setVerticalType(int verticalType) {
            this.p = verticalType;
            return this;
        }

        public Builder setWindowColor(@ColorInt int windowColor) {
            this.o = windowColor;
            this.n = true;
            return this;
        }

        public Builder() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        private Builder(Cue cue) {
            this.a = cue.text;
            this.b = cue.bitmap;
            this.c = cue.textAlignment;
            this.d = cue.multiRowAlignment;
            this.e = cue.line;
            this.f = cue.lineType;
            this.g = cue.lineAnchor;
            this.h = cue.position;
            this.i = cue.positionAnchor;
            this.j = cue.textSizeType;
            this.k = cue.textSize;
            this.l = cue.size;
            this.m = cue.bitmapHeight;
            this.n = cue.windowColorSet;
            this.o = cue.windowColor;
            this.p = cue.verticalType;
            this.q = cue.shearDegrees;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cue b(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(c(0));
        if (charSequence != null) {
            builder.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(c(1));
        if (alignment != null) {
            builder.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(c(2));
        if (alignment2 != null) {
            builder.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(c(3));
        if (bitmap != null) {
            builder.setBitmap(bitmap);
        }
        if (bundle.containsKey(c(4)) && bundle.containsKey(c(5))) {
            builder.setLine(bundle.getFloat(c(4)), bundle.getInt(c(5)));
        }
        if (bundle.containsKey(c(6))) {
            builder.setLineAnchor(bundle.getInt(c(6)));
        }
        if (bundle.containsKey(c(7))) {
            builder.setPosition(bundle.getFloat(c(7)));
        }
        if (bundle.containsKey(c(8))) {
            builder.setPositionAnchor(bundle.getInt(c(8)));
        }
        if (bundle.containsKey(c(10)) && bundle.containsKey(c(9))) {
            builder.setTextSize(bundle.getFloat(c(10)), bundle.getInt(c(9)));
        }
        if (bundle.containsKey(c(11))) {
            builder.setSize(bundle.getFloat(c(11)));
        }
        if (bundle.containsKey(c(12))) {
            builder.setBitmapHeight(bundle.getFloat(c(12)));
        }
        if (bundle.containsKey(c(13))) {
            builder.setWindowColor(bundle.getInt(c(13)));
        }
        if (!bundle.getBoolean(c(14), false)) {
            builder.clearWindowColor();
        }
        if (bundle.containsKey(c(15))) {
            builder.setVerticalType(bundle.getInt(c(15)));
        }
        if (bundle.containsKey(c(16))) {
            builder.setShearDegrees(bundle.getFloat(c(16)));
        }
        return builder.build();
    }

    private static String c(int field) {
        return Integer.toString(field, 36);
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        return TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment && ((bitmap = this.bitmap) != null ? !((bitmap2 = cue.bitmap) == null || !bitmap.sameAs(bitmap2)) : cue.bitmap == null) && this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees;
    }

    public int hashCode() {
        return Objects.hashCode(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, Float.valueOf(this.line), Integer.valueOf(this.lineType), Integer.valueOf(this.lineAnchor), Float.valueOf(this.position), Integer.valueOf(this.positionAnchor), Float.valueOf(this.size), Float.valueOf(this.bitmapHeight), Boolean.valueOf(this.windowColorSet), Integer.valueOf(this.windowColor), Integer.valueOf(this.textSizeType), Float.valueOf(this.textSize), Integer.valueOf(this.verticalType), Float.valueOf(this.shearDegrees));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(c(0), this.text);
        bundle.putSerializable(c(1), this.textAlignment);
        bundle.putSerializable(c(2), this.multiRowAlignment);
        bundle.putParcelable(c(3), this.bitmap);
        bundle.putFloat(c(4), this.line);
        bundle.putInt(c(5), this.lineType);
        bundle.putInt(c(6), this.lineAnchor);
        bundle.putFloat(c(7), this.position);
        bundle.putInt(c(8), this.positionAnchor);
        bundle.putInt(c(9), this.textSizeType);
        bundle.putFloat(c(10), this.textSize);
        bundle.putFloat(c(11), this.size);
        bundle.putFloat(c(12), this.bitmapHeight);
        bundle.putBoolean(c(14), this.windowColorSet);
        bundle.putInt(c(13), this.windowColor);
        bundle.putInt(c(15), this.verticalType);
        bundle.putFloat(c(16), this.shearDegrees);
        return bundle;
    }

    @Deprecated
    public Cue(CharSequence text) {
        this(text, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size) {
        this(text, textAlignment, line, lineType, lineAnchor, position, positionAnchor, size, false, -16777216);
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, int textSizeType, float textSize) {
        this(text, textAlignment, null, null, line, lineType, lineAnchor, position, positionAnchor, textSizeType, textSize, size, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, boolean windowColorSet, int windowColor) {
        this(text, textAlignment, null, null, line, lineType, lineAnchor, position, positionAnchor, Integer.MIN_VALUE, -3.4028235E38f, size, -3.4028235E38f, windowColorSet, windowColor, Integer.MIN_VALUE, 0.0f);
    }

    private Cue(@Nullable CharSequence text, @Nullable Layout.Alignment textAlignment, @Nullable Layout.Alignment multiRowAlignment, @Nullable Bitmap bitmap, float line, int lineType, int lineAnchor, float position, int positionAnchor, int textSizeType, float textSize, float size, float bitmapHeight, boolean windowColorSet, int windowColor, int verticalType, float shearDegrees) {
        if (text == null) {
            Assertions.checkNotNull(bitmap);
        } else {
            Assertions.checkArgument(bitmap == null);
        }
        if (text instanceof Spanned) {
            this.text = SpannedString.valueOf(text);
        } else if (text != null) {
            this.text = text.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = textAlignment;
        this.multiRowAlignment = multiRowAlignment;
        this.bitmap = bitmap;
        this.line = line;
        this.lineType = lineType;
        this.lineAnchor = lineAnchor;
        this.position = position;
        this.positionAnchor = positionAnchor;
        this.size = size;
        this.bitmapHeight = bitmapHeight;
        this.windowColorSet = windowColorSet;
        this.windowColor = windowColor;
        this.textSizeType = textSizeType;
        this.textSize = textSize;
        this.verticalType = verticalType;
        this.shearDegrees = shearDegrees;
    }
}
