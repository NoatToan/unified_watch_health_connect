package com.xiaomi.hm.health.imageload.ext;

import android.widget.ImageView;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0086\b\"\u0016\u0010\t\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "loadWithCenterCropCrossFade", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/imageload/DisplayConfig$ConfigBuilder;", "processHandler", "loadWithProcess", "TAG", "Ljava/lang/String;", "imageloader_release"}, k = 2, mv = {1, 4, 0})
public final class ImageLoadExtentionsKt {

    @NotNull
    public static final String TAG = "HMImageLoader";

    public static final void loadWithCenterCropCrossFade(@NotNull ImageView imageView, @NotNull String str) {
        try {
            HMImageLoader.with(imageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(str).crossFade().centerCrop().into(imageView);
        } catch (Exception e) {
            HMLog.e(TAG, e);
        }
    }

    public static final void loadWithProcess(@NotNull ImageView imageView, @NotNull Function1<? super DisplayConfig.ConfigBuilder, Unit> function1) {
        try {
            function1.invoke(HMImageLoader.with(imageView).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL));
        } catch (Exception e) {
            HMLog.e(TAG, e);
        }
    }
}
