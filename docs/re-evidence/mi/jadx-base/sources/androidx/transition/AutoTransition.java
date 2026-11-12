package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        y0();
    }

    public final void y0() {
        v0(1);
        m0(new Fade(2)).m0(new ChangeBounds()).m0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y0();
    }
}
