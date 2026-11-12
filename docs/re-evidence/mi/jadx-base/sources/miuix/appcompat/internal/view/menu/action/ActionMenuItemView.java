package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.g5j;
import defpackage.ie0;
import defpackage.s6g;
import defpackage.zhi;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.internal.view.menu.i;

/* JADX INFO: loaded from: classes3.dex */
public class ActionMenuItemView extends LinearLayout implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f26499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.c f26500b;
    public boolean c;
    public final ie0 d;

    public ActionMenuItemView(Context context) {
        this(context, null, 0);
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public boolean a() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void b(f fVar, int i) {
        this.f26499a = fVar;
        setSelected(false);
        setTitle(fVar.getTitle());
        setIcon(fVar.getIcon());
        setCheckable(fVar.isCheckable());
        setChecked(fVar.isChecked());
        setEnabled(fVar.isEnabled());
        setClickable(true);
        this.d.b(fVar.getContentDescription());
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public f getItemData() {
        return this.f26499a;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.a(configuration);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        d.c cVar = this.f26500b;
        if (cVar == null || !cVar.a(this.f26499a, 0)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    public void setCheckable(boolean z) {
        this.c = z;
    }

    public void setChecked(boolean z) {
        if (this.c) {
            setSelected(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.d.c(z);
    }

    public void setIcon(Drawable drawable) {
        this.d.d(drawable);
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void setItemInvoker(d.c cVar) {
        this.f26500b = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.d.f(charSequence);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.J, zhi.q, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(g5j.K, true) && s6g.f(context) == 2) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        ie0 ie0Var = new ie0(this);
        this.d = ie0Var;
        ie0Var.e(z);
    }
}
