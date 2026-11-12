package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f5116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f5117b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f5118c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5119d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5120e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5121f;

    public h(CompoundButton compoundButton) {
        this.f5116a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f5116a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f5119d || this.f5120e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f5119d) {
                    drawableMutate.setTintList(this.f5117b);
                }
                if (this.f5120e) {
                    drawableMutate.setTintMode(this.f5118c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i14) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f5116a;
        Context context = compoundButton.getContext();
        int[] iArr = h.a.f80433m;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        CompoundButton compoundButton2 = this.f5116a;
        androidx.core.view.s0.q(compoundButton2, compoundButton2.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(j.a.a(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(j.a.a(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(j.a.a(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(w0VarG.a(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(c0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            w0VarG.h();
        }
    }
}
