package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class nxk extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f28546a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f28546a) * ((double) f2))) : f;
    }

    public static float b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f28546a) * ((double) f2))) : f * 1.5f;
    }
}
