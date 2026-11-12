package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Font {
    private final String a;
    private final String b;
    private final String c;
    private final float d;

    @Nullable
    private Typeface e;

    public Font(String str, String str2, String str3, float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
    }

    public float a() {
        return this.d;
    }

    public String getFamily() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public String getStyle() {
        return this.c;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.e;
    }

    public void setTypeface(@Nullable Typeface typeface) {
        this.e = typeface;
    }
}
