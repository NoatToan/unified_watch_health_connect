package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class yxk extends xxk {
    public yxk(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // defpackage.xxk, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (epa.d()) {
            epa.a("RoundedNinePatchDrawable#draw");
        }
        if (!g()) {
            super.draw(canvas);
            if (epa.d()) {
                epa.b();
                return;
            }
            return;
        }
        k();
        h();
        canvas.clipPath(this.e);
        super.draw(canvas);
        if (epa.d()) {
            epa.b();
        }
    }
}
