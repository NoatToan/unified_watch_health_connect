package com.xiaomi.fitness.baseui.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.loi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"loadAvatarWithDefaultImg", "", "imageView", "Landroid/widget/ImageView;", "url", "", "iconWidth", "", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarLoadExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarLoadExt.kt\ncom/xiaomi/fitness/baseui/utils/AvatarLoadExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,28:1\n54#2,3:29\n24#2:32\n59#2,4:33\n63#2,2:46\n844#3,9:37\n*S KotlinDebug\n*F\n+ 1 AvatarLoadExt.kt\ncom/xiaomi/fitness/baseui/utils/AvatarLoadExtKt\n*L\n16#1:29,3\n16#1:32\n16#1:33,4\n16#1:46,2\n19#1:37,9\n*E\n"})
public final class AvatarLoadExtKt {
    public static final void loadAvatarWithDefaultImg(@NotNull final ImageView imageView, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (str == null || TextUtils.isEmpty(str)) {
            imageView.setImageResource(loi.g);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(i, i);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.baseui.utils.AvatarLoadExtKt$loadAvatarWithDefaultImg$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(loi.g);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imageView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(loi.g);
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadAvatarWithDefaultImg$default(ImageView imageView, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = ExtUtilsKt.getDp(46);
        }
        loadAvatarWithDefaultImg(imageView, str, i);
    }
}
