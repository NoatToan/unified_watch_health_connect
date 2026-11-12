package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public class cxk extends m1a implements s0r {
    public Drawable e;
    public t0r f;

    public cxk(Drawable drawable) {
        super(drawable);
        this.e = null;
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            t0r t0rVar = this.f;
            if (t0rVar != null) {
                t0rVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.e.draw(canvas);
            }
        }
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // defpackage.s0r
    public void k(t0r t0rVar) {
        this.f = t0rVar;
    }

    public void p(Drawable drawable) {
        this.e = drawable;
        invalidateSelf();
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        t0r t0rVar = this.f;
        if (t0rVar != null) {
            t0rVar.a(z);
        }
        return super.setVisible(z, z2);
    }
}
