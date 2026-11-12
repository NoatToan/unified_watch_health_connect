package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import defpackage.g5j;
import defpackage.ie0;
import defpackage.s6g;
import miuix.animation.ViewHoverListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class OverflowMenuButton extends LinearLayout implements ViewHoverListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie0 f26517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f26518b;
    public boolean c;

    public interface a {
        void a();
    }

    public OverflowMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a() {
        ViewGroup viewGroup = this;
        while (viewGroup != null && viewGroup.getVisibility() == 0) {
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        return viewGroup == null;
    }

    @Override // miuix.animation.ViewHoverListener
    public boolean isHover() {
        return this.c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f26517a.a(configuration);
    }

    @Override // miuix.animation.ViewHoverListener
    public void onEnterHover() {
        this.c = true;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onExitHover() {
        this.c = false;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onMoveHover() {
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick() || !a()) {
            return true;
        }
        playSoundEffect(0);
        a aVar = this.f26518b;
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f26517a.c(z);
    }

    public void setOnOverflowMenuButtonClickListener(a aVar) {
        this.f26518b = aVar;
    }

    public OverflowMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.a2, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(g5j.c2);
        CharSequence text = typedArrayObtainStyledAttributes.getText(g5j.b2);
        String string = typedArrayObtainStyledAttributes.getString(g5j.d2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(g5j.e2, true) && s6g.f(context) == 2;
        typedArrayObtainStyledAttributes.recycle();
        ie0 ie0Var = new ie0(this);
        this.f26517a = ie0Var;
        ie0Var.d(drawable);
        ie0Var.f(text);
        ie0Var.b(string);
        ie0Var.e(z);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }
}
