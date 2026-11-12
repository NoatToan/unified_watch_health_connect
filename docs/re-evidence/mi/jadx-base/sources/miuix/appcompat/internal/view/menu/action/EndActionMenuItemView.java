package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.awi;
import defpackage.vsi;
import defpackage.z1j;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.ViewHoverListener;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.f;
import miuix.appcompat.internal.view.menu.i;

/* JADX INFO: loaded from: classes3.dex */
public class EndActionMenuItemView extends LinearLayout implements i.a, ViewHoverListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f26514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.c f26515b;
    public ImageView c;
    public boolean d;
    public boolean e;

    public EndActionMenuItemView(Context context) {
        this(context, null, 0);
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public boolean a() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void b(f fVar, int i) {
        this.f26514a = fVar;
        setSelected(false);
        setTitle(fVar.getTitle());
        setIcon(fVar.getIcon());
        setCheckable(fVar.isCheckable());
        setChecked(fVar.isChecked());
        setEnabled(fVar.isEnabled());
        setClickable(true);
        if (TextUtils.isEmpty(fVar.getContentDescription())) {
            setContentDescription(fVar.getTitle());
        } else {
            setContentDescription(fVar.getContentDescription());
        }
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public f getItemData() {
        return this.f26514a;
    }

    @Override // miuix.animation.ViewHoverListener
    public boolean isHover() {
        return this.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // miuix.animation.ViewHoverListener
    public void onEnterHover() {
        this.e = true;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onExitHover() {
        this.e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f fVar = this.f26514a;
        if (fVar == null || !fVar.j()) {
            return;
        }
        accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + getResources().getString(z1j.g));
    }

    @Override // miuix.animation.ViewHoverListener
    public void onMoveHover() {
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        int i = this.f26514a.getItemId() == vsi.S ? 1 : 0;
        d.c cVar = this.f26515b;
        if (cVar == null || !cVar.a(this.f26514a, i)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    public void setCheckable(boolean z) {
        this.d = z;
    }

    public void setChecked(boolean z) {
        if (this.d) {
            setSelected(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
    }

    public void setIcon(Drawable drawable) {
        if (this.c.getDrawable() != drawable) {
            this.c.setImageDrawable(drawable);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.i.a
    public void setItemInvoker(d.c cVar) {
        this.f26515b = cVar;
    }

    public void setTitle(CharSequence charSequence) {
    }

    public EndActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EndActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setGravity(17);
        View.inflate(context, awi.j, this);
        ImageView imageView = (ImageView) findViewById(vsi.q);
        this.c = imageView;
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.setForceDarkAllowed(false);
        }
        Folme.useAt(this).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setFeedbackRadius(60.0f);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
    }
}
