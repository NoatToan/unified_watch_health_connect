package com.xiaomi.hm.health.devicex.proxy.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.huami.devicex.injection.AvatarManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.manager.AvatarManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/AvatarManagerImpl;", "Lcom/huami/devicex/injection/AvatarManagerApi;", "Landroid/graphics/Bitmap;", "resource", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/ImageView;", "mThumbnailImg", "", "makeRoundedBitmapDrawable", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AvatarManagerImpl implements AvatarManagerApi {
    @Override // com.huami.devicex.injection.AvatarManagerApi
    public void makeRoundedBitmapDrawable(@NotNull Bitmap resource, @NotNull Context context, @NotNull ImageView mThumbnailImg) {
        AvatarManager.makeRoundedBitmapDrawable(resource, context, mThumbnailImg);
    }
}
