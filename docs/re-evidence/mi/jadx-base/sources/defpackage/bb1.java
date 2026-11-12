package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class bb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f4002a = false;

    @RequiresApi(api = 23)
    public static void b(View view) {
        if (view == null) {
            return;
        }
        view.setForeground(hm1.h(view.getContext(), zhi.G));
        if (view.isClickable()) {
            return;
        }
        view.setOnHoverListener(new View.OnHoverListener() { // from class: ab1
            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                return bb1.g(view2, motionEvent);
            }
        });
    }

    @Deprecated
    public static void c(View view) {
        d(view, IHoverStyle.HoverEffect.NORMAL);
    }

    @Deprecated
    public static void d(View view, IHoverStyle.HoverEffect hoverEffect) {
        Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(view, new AnimConfig[0]);
        Folme.useAt(view).hover().setEffect(hoverEffect).handleHoverOf(view, new AnimConfig[0]);
    }

    public static void e(View view) {
        ITouchStyle scale = Folme.useAt(view).touch().setTint(0).setScale(1.0f, new ITouchStyle.TouchType[0]);
        IHoverStyle effect = Folme.useAt(view).hover().setTint(0).setEffect(IHoverStyle.HoverEffect.NORMAL);
        if (hm1.d(view.getContext(), zhi.F, true)) {
            scale.setBackgroundColor(335544320);
            effect.setBackgroundColor(335544320);
        } else {
            scale.setBackgroundColor(620756991);
            effect.setBackgroundColor(620756991);
        }
        scale.handleTouchOf(view, new AnimConfig[0]);
        effect.handleHoverOf(view, new AnimConfig[0]);
    }

    public static boolean f() {
        return f4002a;
    }

    public static /* synthetic */ boolean g(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            view.setHovered(true);
        } else if (motionEvent.getAction() == 10) {
            view.setHovered(false);
        }
        return false;
    }
}
