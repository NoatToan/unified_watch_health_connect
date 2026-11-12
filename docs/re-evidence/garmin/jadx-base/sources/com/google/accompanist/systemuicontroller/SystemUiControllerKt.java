package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.l;
import o4.d0;
import o4.f0;
import p004k6.v;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0007H\u0082\u0010¢\u0006\u0004\b\u0005\u0010\b\"\u0017\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/view/Window;", "window", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "rememberSystemUiController", "(Landroid/view/Window;Lp3/m;II)Lcom/google/accompanist/systemuicontroller/SystemUiController;", "findWindow", "(Lp3/m;I)Landroid/view/Window;", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/view/Window;", "Lo4/d0;", "BlackScrim", "J", "Lkotlin/Function1;", "BlackScrimmed", "Le23/l;", "systemuicontroller_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SystemUiControllerKt {
    private static final long BlackScrim = f0.e(0.0f, 0.0f, 0.0f, 0.3f);
    private static final l<d0, d0> BlackScrimmed = SystemUiControllerKt$BlackScrimmed$1.INSTANCE;

    private static final Window findWindow(m mVar, int i14) {
        mVar.L(1009281237);
        x1 x1Var = n.f135158a;
        y3 y3Var = AndroidCompositionLocals_androidKt.f6046f;
        ViewParent parent = ((View) mVar.A(y3Var)).getParent();
        v vVar = parent instanceof v ? (v) parent : null;
        Window window = vVar != null ? vVar.getWindow() : null;
        if (window == null) {
            Context context = ((View) mVar.A(y3Var)).getContext();
            context.getClass();
            window = findWindow(context);
        }
        mVar.R();
        return window;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    public static final SystemUiController rememberSystemUiController(Window window, m mVar, int i14, int i15) {
        mVar.L(-715745933);
        if ((i15 & 1) != 0) {
            window = findWindow(mVar, 0);
        }
        x1 x1Var = n.f135158a;
        View view2 = (View) mVar.A(AndroidCompositionLocals_androidKt.f6046f);
        mVar.L(511388516);
        boolean zB = mVar.B(view2) | mVar.B(window);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new AndroidSystemUiController(view2, window);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new AndroidSystemUiController(view2, window);
                mVar.K(objQ);
            }
        }
        mVar.R();
        AndroidSystemUiController androidSystemUiController = (AndroidSystemUiController) objQ;
        mVar.R();
        return androidSystemUiController;
    }

    private static final Window findWindow(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        return ((Activity) context).getWindow();
    }
}
