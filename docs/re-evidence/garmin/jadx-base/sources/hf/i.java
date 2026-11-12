package hf;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhf/i;", "Landroid/graphics/drawable/Drawable;", "Lhf/h;", "image", "<init>", "(Lhf/h;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f83563a;

    public i(h hVar) {
        this.f83563a = hVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f83563a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @o13.e
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
