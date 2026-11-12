package o4;

import android.graphics.Bitmap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo4/f;", "Lo4/v0;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f128848b;

    public f(Bitmap bitmap) {
        this.f128848b = bitmap;
    }

    @Override // o4.v0
    public final void a() {
        this.f128848b.prepareToDraw();
    }

    @Override // o4.v0
    public final int b() {
        Bitmap.Config config = this.f128848b.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            w0.f129024b.getClass();
            return w0.f129025c;
        }
        if (config == Bitmap.Config.RGB_565) {
            w0.f129024b.getClass();
            return w0.f129026d;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            w0.f129024b.getClass();
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            w0.f129024b.getClass();
            return w0.f129027e;
        }
        if (config == Bitmap.Config.HARDWARE) {
            w0.f129024b.getClass();
            return w0.f129028f;
        }
        w0.f129024b.getClass();
        return 0;
    }

    @Override // o4.v0
    public final int getHeight() {
        return this.f128848b.getHeight();
    }

    @Override // o4.v0
    public final int getWidth() {
        return this.f128848b.getWidth();
    }
}
