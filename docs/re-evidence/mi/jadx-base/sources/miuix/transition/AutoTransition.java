package miuix.transition;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTransition extends MiuixTransitionSet {
    public AutoTransition() {
        i();
    }

    public final void i() {
        h(1);
        e(new Fade(2)).e(new ChangeBounds()).e(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }
}
