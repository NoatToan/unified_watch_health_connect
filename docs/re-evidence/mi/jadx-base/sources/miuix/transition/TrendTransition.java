package miuix.transition;

import android.content.Context;
import android.util.AttributeSet;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class TrendTransition extends ChangeBounds {
    public int[] I;
    public AnimState J;

    public TrendTransition() {
        this.I = new int[2];
        this.J = new AnimState().add(ViewProperty.ALPHA, 0.0d);
    }

    public TrendTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new int[2];
        this.J = new AnimState().add(ViewProperty.ALPHA, 0.0d);
    }
}
