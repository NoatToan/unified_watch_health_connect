package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import defpackage.b6i;
import defpackage.cm8;
import defpackage.epa;
import defpackage.ibl;
import defpackage.m1a;
import defpackage.o47;
import defpackage.qxk;
import defpackage.rbl;
import defpackage.rxk;
import defpackage.sxk;
import defpackage.yxk;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Drawable f7107a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            rxk rxkVar = new rxk(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(rxkVar, roundingParams);
            return rxkVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            yxk yxkVar = new yxk((NinePatchDrawable) drawable);
            b(yxkVar, roundingParams);
            return yxkVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            cm8.E("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        sxk sxkVarF = sxk.f((ColorDrawable) drawable);
        b(sxkVarF, roundingParams);
        return sxkVarF;
    }

    public static void b(qxk qxkVar, RoundingParams roundingParams) {
        qxkVar.b(roundingParams.i());
        qxkVar.l(roundingParams.d());
        qxkVar.a(roundingParams.b(), roundingParams.c());
        qxkVar.c(roundingParams.g());
        qxkVar.j(roundingParams.k());
        qxkVar.e(roundingParams.h());
    }

    public static o47 c(o47 o47Var) {
        while (true) {
            Object drawable = o47Var.getDrawable();
            if (drawable == o47Var || !(drawable instanceof o47)) {
                break;
            }
            o47Var = (o47) drawable;
        }
        return o47Var;
    }

    public static Drawable d(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (epa.d()) {
                epa.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.j() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (!(drawable instanceof m1a)) {
                    return a(drawable, roundingParams, resources);
                }
                o47 o47VarC = c((m1a) drawable);
                o47VarC.h(a(o47VarC.h(f7107a), roundingParams, resources));
                return drawable;
            }
            return drawable;
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public static Drawable e(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (epa.d()) {
                epa.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.j() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.q(roundingParams.f());
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public static Drawable f(Drawable drawable, rbl.b bVar) {
        return g(drawable, bVar, null);
    }

    public static Drawable g(Drawable drawable, rbl.b bVar, PointF pointF) {
        if (epa.d()) {
            epa.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (epa.d()) {
                epa.b();
            }
            return drawable;
        }
        ibl iblVar = new ibl(drawable, bVar);
        if (pointF != null) {
            iblVar.s(pointF);
        }
        if (epa.d()) {
            epa.b();
        }
        return iblVar;
    }

    public static void h(qxk qxkVar) {
        qxkVar.b(false);
        qxkVar.d(0.0f);
        qxkVar.a(0, 0.0f);
        qxkVar.c(0.0f);
        qxkVar.j(false);
        qxkVar.e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(o47 o47Var, RoundingParams roundingParams, Resources resources) {
        o47 o47VarC = c(o47Var);
        Drawable drawable = o47VarC.getDrawable();
        if (roundingParams == null || roundingParams.j() != RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (drawable instanceof qxk) {
                h((qxk) drawable);
            }
        } else if (drawable instanceof qxk) {
            b((qxk) drawable, roundingParams);
        } else if (drawable != 0) {
            o47VarC.h(f7107a);
            o47VarC.h(a(drawable, roundingParams, resources));
        }
    }

    public static void j(o47 o47Var, RoundingParams roundingParams) {
        Drawable drawable = o47Var.getDrawable();
        if (roundingParams == null || roundingParams.j() != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof RoundedCornersDrawable) {
                Drawable drawable2 = f7107a;
                o47Var.h(((RoundedCornersDrawable) drawable).n(drawable2));
                drawable2.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawable instanceof RoundedCornersDrawable)) {
            o47Var.h(e(o47Var.h(f7107a), roundingParams));
            return;
        }
        RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
        b(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.q(roundingParams.f());
    }

    public static ibl k(o47 o47Var, rbl.b bVar) {
        Drawable drawableF = f(o47Var.h(f7107a), bVar);
        o47Var.h(drawableF);
        b6i.h(drawableF, "Parent has no child drawable!");
        return (ibl) drawableF;
    }
}
