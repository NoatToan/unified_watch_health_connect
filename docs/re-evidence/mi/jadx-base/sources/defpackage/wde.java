package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes4.dex */
public class wde extends c10 {
    @Override // defpackage.c10
    public Animation b(View view, int i, int i2, int i3, int i4) {
        boolean z = true;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (view.getWidth() == i3 && view.getHeight() == i4) {
            z = false;
        }
        if (z2 || z) {
            return new p4i(view, i, i2, i3, i4);
        }
        return null;
    }

    @Override // defpackage.c10
    public boolean e() {
        return this.d > 0;
    }
}
