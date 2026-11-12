package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class a extends AnimatedStateListDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1033a f26634a;

    public a() {
        this.f26634a = a();
    }

    public C1033a a() {
        return new C1033a();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26634a;
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer
    public void setConstantState(DrawableContainer.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (this.f26634a == null) {
            this.f26634a = a();
        }
        this.f26634a.f26635a = drawableContainerState;
    }

    /* JADX INFO: renamed from: miuix.internal.view.a$a, reason: collision with other inner class name */
    public static class C1033a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable.ConstantState f26635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26636b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;

        public Drawable a(Resources resources, Resources.Theme theme, C1033a c1033a) {
            return new a(resources, theme, c1033a);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            Drawable.ConstantState constantState = this.f26635a;
            if (constantState == null) {
                return false;
            }
            return constantState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f26635a;
            if (constantState == null) {
                return -1;
            }
            return constantState.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            if (this.f26635a == null) {
                return null;
            }
            return a(null, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            if (this.f26635a == null) {
                return null;
            }
            return a(resources, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f26635a == null) {
                return null;
            }
            return a(resources, theme, this);
        }
    }

    public a(Resources resources, Resources.Theme theme, C1033a c1033a) {
        Drawable drawableNewDrawable;
        if (c1033a != null) {
            if (resources == null) {
                drawableNewDrawable = c1033a.f26635a.newDrawable();
            } else if (theme == null) {
                drawableNewDrawable = c1033a.f26635a.newDrawable(resources);
            } else {
                drawableNewDrawable = c1033a.f26635a.newDrawable(resources, theme);
            }
            if (drawableNewDrawable != null) {
                c1033a.f26635a = drawableNewDrawable.getConstantState();
            }
            setConstantState((DrawableContainer.DrawableContainerState) c1033a.f26635a);
            onStateChange(getState());
            jumpToCurrentState();
            C1033a c1033a2 = this.f26634a;
            c1033a2.f26636b = c1033a.f26636b;
            c1033a2.c = c1033a.c;
            c1033a2.d = c1033a.d;
            c1033a2.j = c1033a.j;
        }
    }
}
