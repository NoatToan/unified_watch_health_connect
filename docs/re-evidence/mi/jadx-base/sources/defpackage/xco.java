package defpackage;

import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class xco {
    public static int a(StateListDrawable stateListDrawable) {
        return stateListDrawable.getStateCount();
    }

    public static int[] b(StateListDrawable stateListDrawable, int i) {
        return stateListDrawable.getStateSet(i);
    }
}
