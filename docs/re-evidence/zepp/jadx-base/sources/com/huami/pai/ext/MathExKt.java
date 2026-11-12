package com.huami.pai.ext;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001c\u0010\b\u001a\u00020\u00008\u0000@\u0000X\u0080D¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "other", "", "equal", "a", "F", "getCURRENCY", "()F", "CURRENCY", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class MathExKt {
    private static final float a = 1.0E-6f;

    public static final boolean equal(float f, float f2) {
        return Math.abs(f - f2) < a;
    }

    public static final float getCURRENCY() {
        return a;
    }
}
