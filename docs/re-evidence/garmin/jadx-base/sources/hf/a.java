package hf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhf/a;", "Lhf/h;", "Landroid/graphics/Bitmap;", "bitmap", "", "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f83537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83538b;

    public a(Bitmap bitmap, boolean z14) {
        this.f83537a = bitmap;
        this.f83538b = z14;
    }

    @Override // hf.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF83538b() {
        return this.f83538b;
    }

    @Override // hf.h
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.f83537a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f83537a, aVar.f83537a) && this.f83538b == aVar.f83538b;
    }

    @Override // hf.h
    public final int getHeight() {
        return this.f83537a.getHeight();
    }

    @Override // hf.h
    public final long getSize() {
        int i14;
        int allocationByteCount;
        Bitmap bitmap = this.f83537a;
        if (!bitmap.isRecycled()) {
            try {
                allocationByteCount = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i14 = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i14 = 2;
                } else {
                    i14 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                }
                allocationByteCount = i14 * height;
            }
            return allocationByteCount;
        }
        StringBuilder sb3 = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb3.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb3.append(" [");
        sb3.append(width);
        sb3.append(" x ");
        sb3.append(height2);
        sb3.append("] + ");
        sb3.append(config2);
        throw new IllegalStateException(sb3.toString().toString());
    }

    @Override // hf.h
    public final int getWidth() {
        return this.f83537a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83538b) + (this.f83537a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BitmapImage(bitmap=");
        sb3.append(this.f83537a);
        sb3.append(", shareable=");
        return am.j.t(sb3, this.f83538b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
