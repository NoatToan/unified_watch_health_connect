package com.huami.third.wechat;

import android.graphics.Bitmap;
import com.huami.android.zxing.QrCodeUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"", "content", "", "size", "Landroid/graphics/Bitmap;", "createQR", "wechat_release"}, k = 2, mv = {1, 5, 1})
public final class UtilKt {
    @NotNull
    public static final Bitmap createQR(@NotNull String str, int i) {
        return QrCodeUtils.createQRCode(str, i);
    }
}
