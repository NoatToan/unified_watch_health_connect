package com.google.accompanist.drawablepainter;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import n4.g;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import o4.f0;
import p005kotlin.Metadata;
import p3.x1;
import t4.c;
import t4.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "Lt4/d;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;Lp3/m;I)Lt4/d;", "Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lo13/l;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER", "Ln4/g;", "getIntrinsicSize", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "gcm-common-ui_vanillaRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class DrawablePainter2Kt {
    private static final l MAIN_HANDLER$delegate = m.a(n.NONE, new a(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler MAIN_HANDLER_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            g.f123559b.getClass();
            return g.f123560c;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L);
        g.a aVar = g.f123559b;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:6:0x0015 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @e
    public static final d rememberDrawablePainter(Drawable drawable, p3.m mVar, int i14) {
        Object drawablePainter2;
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(drawable);
        Object objQ = mVar.q();
        if (zB) {
            if (drawable == null) {
                objQ = EmptyPainter2.INSTANCE;
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter2 = new c(f0.b(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    drawableMutate.getClass();
                    drawablePainter2 = new DrawablePainter2(drawableMutate);
                }
                objQ = drawablePainter2;
            }
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                if (drawable == null) {
                    objQ = EmptyPainter2.INSTANCE;
                } else {
                    if (drawable instanceof ColorDrawable) {
                        drawablePainter2 = new c(f0.b(((ColorDrawable) drawable).getColor()), null);
                    } else {
                        Drawable drawableMutate2 = drawable.mutate();
                        drawableMutate2.getClass();
                        drawablePainter2 = new DrawablePainter2(drawableMutate2);
                    }
                    objQ = drawablePainter2;
                }
                mVar.K(objQ);
            }
        }
        return (d) objQ;
    }
}
