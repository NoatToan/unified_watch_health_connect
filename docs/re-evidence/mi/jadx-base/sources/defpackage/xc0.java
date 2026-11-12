package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public class xc0 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f38960a;

    @RequiresApi(21)
    public static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public xc0(ActionBarContainer actionBarContainer) {
        this.f38960a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f38960a;
        if (actionBarContainer.h) {
            Drawable drawable = actionBarContainer.g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f38960a;
        Drawable drawable3 = actionBarContainer2.f;
        if (drawable3 == null || !actionBarContainer2.i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f38960a;
        if (actionBarContainer.h) {
            if (actionBarContainer.g != null) {
                a.a(actionBarContainer.e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
