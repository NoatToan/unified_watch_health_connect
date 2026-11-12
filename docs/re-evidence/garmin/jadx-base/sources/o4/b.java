package o4;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final BlendMode a(int i14) {
        q.f128930b.getClass();
        if (i14 == 0) {
            return BlendMode.CLEAR;
        }
        if (i14 == q.f128931c) {
            return BlendMode.SRC;
        }
        if (i14 == q.f128932d) {
            return BlendMode.DST;
        }
        if (i14 == q.f128933e) {
            return BlendMode.SRC_OVER;
        }
        if (i14 == q.f128934f) {
            return BlendMode.DST_OVER;
        }
        if (i14 == q.f128935g) {
            return BlendMode.SRC_IN;
        }
        if (i14 == q.f128936h) {
            return BlendMode.DST_IN;
        }
        if (i14 == q.f128937i) {
            return BlendMode.SRC_OUT;
        }
        if (i14 == q.f128938j) {
            return BlendMode.DST_OUT;
        }
        if (i14 == q.f128939k) {
            return BlendMode.SRC_ATOP;
        }
        if (i14 == q.f128940l) {
            return BlendMode.DST_ATOP;
        }
        if (i14 == q.f128941m) {
            return BlendMode.XOR;
        }
        if (i14 == q.f128942n) {
            return BlendMode.PLUS;
        }
        if (i14 == q.f128943o) {
            return BlendMode.MODULATE;
        }
        if (i14 == q.f128944p) {
            return BlendMode.SCREEN;
        }
        if (i14 == q.f128945q) {
            return BlendMode.OVERLAY;
        }
        if (i14 == q.f128946r) {
            return BlendMode.DARKEN;
        }
        if (i14 == q.f128947s) {
            return BlendMode.LIGHTEN;
        }
        if (i14 == q.f128948t) {
            return BlendMode.COLOR_DODGE;
        }
        if (i14 == q.f128949u) {
            return BlendMode.COLOR_BURN;
        }
        if (i14 == q.f128950v) {
            return BlendMode.HARD_LIGHT;
        }
        if (i14 == q.f128951w) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i14 == q.f128952x) {
            return BlendMode.DIFFERENCE;
        }
        if (i14 == q.f128953y) {
            return BlendMode.EXCLUSION;
        }
        if (i14 == q.f128954z) {
            return BlendMode.MULTIPLY;
        }
        if (i14 == q.A) {
            return BlendMode.HUE;
        }
        if (i14 == q.B) {
            return BlendMode.SATURATION;
        }
        if (i14 == q.C) {
            return BlendMode.COLOR;
        }
        return i14 == q.D ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i14) {
        q.a aVar = q.f128930b;
        aVar.getClass();
        if (i14 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        aVar.getClass();
        if (i14 == q.f128931c) {
            return PorterDuff.Mode.SRC;
        }
        aVar.getClass();
        if (i14 == q.f128932d) {
            return PorterDuff.Mode.DST;
        }
        aVar.getClass();
        if (i14 == q.f128933e) {
            return PorterDuff.Mode.SRC_OVER;
        }
        aVar.getClass();
        if (i14 == q.f128934f) {
            return PorterDuff.Mode.DST_OVER;
        }
        aVar.getClass();
        if (i14 == q.f128935g) {
            return PorterDuff.Mode.SRC_IN;
        }
        aVar.getClass();
        if (i14 == q.f128936h) {
            return PorterDuff.Mode.DST_IN;
        }
        aVar.getClass();
        if (i14 == q.f128937i) {
            return PorterDuff.Mode.SRC_OUT;
        }
        aVar.getClass();
        if (i14 == q.f128938j) {
            return PorterDuff.Mode.DST_OUT;
        }
        aVar.getClass();
        if (i14 == q.f128939k) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        aVar.getClass();
        if (i14 == q.f128940l) {
            return PorterDuff.Mode.DST_ATOP;
        }
        aVar.getClass();
        if (i14 == q.f128941m) {
            return PorterDuff.Mode.XOR;
        }
        aVar.getClass();
        if (i14 == q.f128942n) {
            return PorterDuff.Mode.ADD;
        }
        aVar.getClass();
        if (i14 == q.f128944p) {
            return PorterDuff.Mode.SCREEN;
        }
        aVar.getClass();
        if (i14 == q.f128945q) {
            return PorterDuff.Mode.OVERLAY;
        }
        aVar.getClass();
        if (i14 == q.f128946r) {
            return PorterDuff.Mode.DARKEN;
        }
        aVar.getClass();
        if (i14 == q.f128947s) {
            return PorterDuff.Mode.LIGHTEN;
        }
        aVar.getClass();
        return i14 == q.f128943o ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
