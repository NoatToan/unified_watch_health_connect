package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes14.dex */
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 1;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    private static Object textDirection;
    private int end;
    private boolean isRtl;
    private final TextPaint paint;
    private CharSequence source;
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;
    private int start = 0;
    private Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = Integer.MAX_VALUE;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
    private boolean includePad = true;
    private TextUtils.TruncateAt ellipsize = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th3) {
            super("Error thrown initializing StaticLayout " + th3.getMessage(), th3);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i14) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i14;
        this.end = charSequence.length();
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (Exception e4) {
            throw new StaticLayoutBuilderCompatException(e4);
        }
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence charSequence, TextPaint textPaint, int i14) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i14);
    }

    public StaticLayout build() {
        if (this.source == null) {
            this.source = "";
        }
        int iMax = Math.max(0, this.width);
        CharSequence charSequenceEllipsize = this.source;
        if (this.maxLines == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.paint, iMax, this.ellipsize);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.end);
        this.end = iMin;
        if (this.isRtl && this.maxLines == 1) {
            this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.start, iMin, this.paint, iMax);
        builderObtain.setAlignment(this.alignment);
        builderObtain.setIncludePad(this.includePad);
        builderObtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.maxLines);
        float f14 = this.lineSpacingAdd;
        if (f14 != 0.0f || this.lineSpacingMultiplier != 1.0f) {
            builderObtain.setLineSpacing(f14, this.lineSpacingMultiplier);
        }
        if (this.maxLines > 1) {
            builderObtain.setHyphenationFrequency(this.hyphenationFrequency);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(builderObtain);
        }
        return builderObtain.build();
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setEnd(int i14) {
        this.end = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i14) {
        this.hyphenationFrequency = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setIncludePad(boolean z14) {
        this.includePad = z14;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z14) {
        this.isRtl = z14;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setLineSpacing(float f14, float f15) {
        this.lineSpacingAdd = f14;
        this.lineSpacingMultiplier = f15;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setMaxLines(int i14) {
        this.maxLines = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStart(int i14) {
        this.start = i14;
        return this;
    }

    @CanIgnoreReturnValue
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }
}
