package qw0;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqw0/j;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f148320a = new j();

    private j() {
    }

    @SuppressLint({"ResourceType"})
    public static final Bitmap a(Resources resources, String str, Paint paint) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, 2131231999);
        f148320a.getClass();
        if (TextUtils.isEmpty(str) || paint == null || bitmapDecodeResource == null || str == null) {
            return null;
        }
        Bitmap.Config config = bitmapDecodeResource.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmapDecodeResource.copy(config, true);
        if (bitmapCopy == null) {
            return null;
        }
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        new Canvas(bitmapCopy).drawText(str, ((bitmapCopy.getWidth() - rect.width()) / 2.0f) - rect.left, ((bitmapCopy.getHeight() - rect.height()) / 2.0f) - rect.top, paint);
        return bitmapCopy;
    }
}
