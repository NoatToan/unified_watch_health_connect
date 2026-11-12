package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ztk extends Drawable implements i3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f41662a;

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ztk mutate() {
        this.f41662a = new b(this.f41662a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f41662a;
        if (bVar.f41664b) {
            bVar.f41663a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41662a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41662a.f41663a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f41662a.f41663a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f41662a.f41663a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = auk.e(iArr);
        b bVar = this.f41662a;
        if (bVar.f41664b == zE) {
            return zOnStateChange;
        }
        bVar.f41664b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f41662a.f41663a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41662a.f41663a.setColorFilter(colorFilter);
    }

    @Override // defpackage.i3m
    public void setShapeAppearanceModel(r2m r2mVar) {
        this.f41662a.f41663a.setShapeAppearanceModel(r2mVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.f41662a.f41663a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f41662a.f41663a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f41662a.f41663a.setTintMode(mode);
    }

    public ztk(r2m r2mVar) {
        this(new b(new l8f(r2mVar)));
    }

    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l8f f41663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41664b;

        public b(l8f l8fVar) {
            this.f41663a = l8fVar;
            this.f41664b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ztk newDrawable() {
            return new ztk(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f41663a = (l8f) bVar.f41663a.getConstantState().newDrawable();
            this.f41664b = bVar.f41664b;
        }
    }

    public ztk(b bVar) {
        this.f41662a = bVar;
    }
}
