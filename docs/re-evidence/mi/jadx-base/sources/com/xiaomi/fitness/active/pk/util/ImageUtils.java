package com.xiaomi.fitness.active.pk.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import defpackage.fni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/ImageUtils;", "", "<init>", "()V", "loadAvatar", "", "imageView", "Landroid/widget/ImageView;", "url", "", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUtils.kt\ncom/xiaomi/fitness/active/pk/util/ImageUtils\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,30:1\n54#2,3:31\n24#2:34\n59#2,4:35\n63#2,2:48\n844#3,9:39\n*S KotlinDebug\n*F\n+ 1 ImageUtils.kt\ncom/xiaomi/fitness/active/pk/util/ImageUtils\n*L\n18#1:31,3\n18#1:34\n18#1:35,4\n18#1:48,2\n20#1:39,9\n*E\n"})
public final class ImageUtils {

    @NotNull
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    public final void loadAvatar(@Nullable final ImageView imageView, @Nullable String url) {
        if (TextUtils.isEmpty(url)) {
            if (imageView != null) {
                imageView.setImageResource(fni.i);
            }
        } else if (imageView != null) {
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            builderTarget.target(new Target() { // from class: com.xiaomi.fitness.active.pk.util.ImageUtils$loadAvatar$lambda$2$$inlined$target$default$1
                @Override // coil.target.Target
                public void onError(@Nullable Drawable error) {
                    imageView.setImageResource(fni.i);
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
            builderTarget.placeholder(fni.i);
            imageLoader.enqueue(builderTarget.build());
        }
    }
}
