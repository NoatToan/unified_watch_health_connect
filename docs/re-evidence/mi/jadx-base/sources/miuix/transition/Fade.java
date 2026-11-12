package miuix.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.u5j;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class Fade extends Visibility {
    public AnimState D;
    public AnimState E;

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnimState animState = new AnimState("fade_in_end");
        ViewProperty viewProperty = ViewProperty.AUTO_ALPHA;
        this.D = animState.add(viewProperty, 1.0d);
        this.E = new AnimState("fade_out_end").add(viewProperty, 0.0d);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5j.e);
        f(typedArrayObtainStyledAttributes.getInt(u5j.f, e()));
        typedArrayObtainStyledAttributes.recycle();
    }

    public Fade(int i) {
        AnimState animState = new AnimState("fade_in_end");
        ViewProperty viewProperty = ViewProperty.AUTO_ALPHA;
        this.D = animState.add(viewProperty, 1.0d);
        this.E = new AnimState("fade_out_end").add(viewProperty, 0.0d);
        f(i);
    }
}
