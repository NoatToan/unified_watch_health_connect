package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class oxk extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f29790a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f29790a) * ((double) f2))) : f;
    }

    public static float b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f29790a) * ((double) f2))) : f * 1.5f;
    }
}
