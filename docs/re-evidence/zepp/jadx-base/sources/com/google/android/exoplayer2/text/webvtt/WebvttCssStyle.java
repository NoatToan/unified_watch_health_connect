package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private static final int r = 0;
    private static final int s = 1;

    @ColorInt
    private int f;
    private int h;
    private float o;
    private String a = "";
    private String b = "";
    private Set<String> c = Collections.emptySet();
    private String d = "";

    @Nullable
    private String e = null;
    private boolean g = false;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int p = -1;
    private boolean q = false;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    private static int a(int currentScore, String target, @Nullable String actual, int score) {
        if (target.isEmpty() || currentScore == -1) {
            return currentScore;
        }
        if (target.equals(actual)) {
            return currentScore + score;
        }
        return -1;
    }

    public int getBackgroundColor() {
        if (this.i) {
            return this.h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.q;
    }

    public int getFontColor() {
        if (this.g) {
            return this.f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String getFontFamily() {
        return this.e;
    }

    public float getFontSize() {
        return this.o;
    }

    public int getFontSizeUnit() {
        return this.n;
    }

    public int getRubyPosition() {
        return this.p;
    }

    public int getSpecificityScore(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.a, str, 1073741824), this.b, str2, 2), this.d, str3, 4);
        if (iA == -1 || !set.containsAll(this.c)) {
            return 0;
        }
        return iA + (this.c.size() * 4);
    }

    public int getStyle() {
        int i = this.l;
        if (i == -1 && this.m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.i;
    }

    public boolean hasFontColor() {
        return this.g;
    }

    public boolean isLinethrough() {
        return this.j == 1;
    }

    public boolean isUnderline() {
        return this.k == 1;
    }

    public WebvttCssStyle setBackgroundColor(int backgroundColor) {
        this.h = backgroundColor;
        this.i = true;
        return this;
    }

    public WebvttCssStyle setBold(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public WebvttCssStyle setCombineUpright(boolean enabled) {
        this.q = enabled;
        return this;
    }

    public WebvttCssStyle setFontColor(int color) {
        this.f = color;
        this.g = true;
        return this;
    }

    public WebvttCssStyle setFontFamily(@Nullable String fontFamily) {
        this.e = fontFamily == null ? null : Ascii.toLowerCase(fontFamily);
        return this;
    }

    public WebvttCssStyle setFontSize(float fontSize) {
        this.o = fontSize;
        return this;
    }

    public WebvttCssStyle setFontSizeUnit(int unit) {
        this.n = unit;
        return this;
    }

    public WebvttCssStyle setItalic(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public WebvttCssStyle setLinethrough(boolean z) {
        this.j = z ? 1 : 0;
        return this;
    }

    public WebvttCssStyle setRubyPosition(int rubyPosition) {
        this.p = rubyPosition;
        return this;
    }

    public void setTargetClasses(String[] targetClasses) {
        this.c = new HashSet(Arrays.asList(targetClasses));
    }

    public void setTargetId(String targetId) {
        this.a = targetId;
    }

    public void setTargetTagName(String targetTag) {
        this.b = targetTag;
    }

    public void setTargetVoice(String targetVoice) {
        this.d = targetVoice;
    }

    public WebvttCssStyle setUnderline(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }
}
