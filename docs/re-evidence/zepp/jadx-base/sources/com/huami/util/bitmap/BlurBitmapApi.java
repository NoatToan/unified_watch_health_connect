package com.huami.util.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J.\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/huami/util/bitmap/BlurBitmapApi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/Bitmap;", "image", "blurBitmap", "", AnimatorViewWrapper.SCALE, "radius", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public interface BlurBitmapApi {
    @Nullable
    Bitmap blurBitmap(@Nullable Context context, @Nullable Bitmap image);

    @Nullable
    Bitmap blurBitmap(@Nullable Context context, @Nullable Bitmap image, float scale, float radius);
}
