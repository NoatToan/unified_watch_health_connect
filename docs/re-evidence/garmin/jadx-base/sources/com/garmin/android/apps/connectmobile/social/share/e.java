package com.garmin.android.apps.connectmobile.social.share;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/e;", "", "Landroid/graphics/Bitmap;", "image", "<init>", "(Landroid/graphics/Bitmap;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f44681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Canvas f44682b;

    public interface a {
        void draw(Canvas canvas);
    }

    public e(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        this.f44681a = bitmapCopy;
        this.f44682b = bitmapCopy != null ? new Canvas(bitmapCopy) : null;
    }
}
