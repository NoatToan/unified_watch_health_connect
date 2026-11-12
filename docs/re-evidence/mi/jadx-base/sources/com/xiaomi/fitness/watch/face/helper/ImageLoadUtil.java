package com.xiaomi.fitness.watch.face.helper;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import coil.Coil;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import coil.size.Scale;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.impl.Callback;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J.\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ.\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ.\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ2\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/ImageLoadUtil;", "", "<init>", "()V", "load", "", "view", "Landroid/widget/ImageView;", "url", "", "res", "", Constants.DEVICE_TYPE_WEAR, "h", "radius", "drawable", "Landroid/graphics/drawable/Drawable;", "file", "Ljava/io/File;", CardInfo.KEY_OWNER, "Landroidx/lifecycle/Lifecycle;", "callback", "Lcom/xiaomi/fitness/watch/face/impl/Callback;", "loadNoCache", "preLoad", "loadWithPlaceHolder", "placeHolder", "scaleType", "Lcoil/size/Scale;", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoadUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/watch/face/helper/ImageLoadUtil\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,153:1\n54#2,3:154\n24#2:157\n57#2,6:158\n63#2,2:165\n54#2,3:167\n24#2:170\n59#2,6:171\n54#2,3:177\n24#2:180\n59#2,6:181\n54#2,3:187\n24#2:190\n59#2,6:191\n59#2,6:198\n54#2,3:204\n24#2:207\n59#2,6:208\n59#2,4:215\n63#2,2:228\n54#2,3:230\n24#2:233\n59#2,6:234\n54#2,3:240\n24#2:243\n59#2,6:244\n54#2,3:250\n24#2:253\n59#2,6:254\n54#2,3:260\n24#2:263\n59#2,6:264\n57#3:164\n192#4:197\n192#4:214\n844#5,9:219\n*S KotlinDebug\n*F\n+ 1 ImageLoadUtil.kt\ncom/xiaomi/fitness/watch/face/helper/ImageLoadUtil\n*L\n23#1:154,3\n23#1:157\n23#1:158,6\n23#1:165,2\n27#1:167,3\n27#1:170\n27#1:171,6\n36#1:177,3\n36#1:180\n36#1:181,6\n45#1:187,3\n45#1:190\n45#1:191,6\n67#1:198,6\n77#1:204,3\n77#1:207\n77#1:208,6\n99#1:215,4\n99#1:228,2\n113#1:230,3\n113#1:233\n113#1:234,6\n123#1:240,3\n123#1:243\n123#1:244,6\n133#1:250,3\n133#1:253\n133#1:254,6\n144#1:260,3\n144#1:263\n144#1:264,6\n23#1:164\n59#1:197\n91#1:214\n104#1:219,9\n*E\n"})
public final class ImageLoadUtil {

    @NotNull
    public static final ImageLoadUtil INSTANCE = new ImageLoadUtil();

    private ImageLoadUtil() {
    }

    public static /* synthetic */ void load$default(ImageLoadUtil imageLoadUtil, ImageView imageView, String str, int i, int i2, int i3, Lifecycle lifecycle, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            lifecycle = null;
        }
        imageLoadUtil.load(imageView, str, i, i2, i3, lifecycle);
    }

    @JvmStatic
    public static final void loadWithPlaceHolder(@NotNull ImageView view, @NotNull String url, int placeHolder, int radius, @NotNull Scale scaleType) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        builderTarget.placeholder(placeHolder);
        builderTarget.scale(scaleType);
        imageLoader.enqueue(builderTarget.build());
    }

    public final void load(@NotNull ImageView view, int res, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(res);
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(numValueOf).target(view);
        builderTarget.size(w, h);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void loadNoCache(@NotNull ImageView view, @NotNull String url, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        builderTarget.size(w, h);
        builderTarget.memoryCachePolicy(CachePolicy.DISABLED);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void preLoad(@NotNull ImageView view, @NotNull String url, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        builderTarget.size(w, h);
        builderTarget.memoryCachePolicy(CachePolicy.WRITE_ONLY);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void load(@NotNull ImageView view, @Nullable String url, int w, int h, int radius, @Nullable Lifecycle owner) {
        int i = 1;
        boolean z = false;
        Intrinsics.checkNotNullParameter(view, "view");
        if (url == null || url.length() == 0) {
            return;
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "gif?", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "webp?", false, 2, (Object) null)) {
            ImageLoader imageLoader = Coil.imageLoader(view.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
            builderTarget.size(w, h);
            float f = radius;
            builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
            builderTarget.lifecycle(owner);
            imageLoader.enqueue(builderTarget.build());
            return;
        }
        ImageLoader.Builder builder = new ImageLoader.Builder(ApplicationExtKt.getApplication());
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
        }
        ImageLoader imageLoaderBuild = builder.components(builder2.build()).build();
        ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        builderTarget2.size(w, h);
        builderTarget2.lifecycle(owner);
        imageLoaderBuild.enqueue(builderTarget2.build());
    }

    public final void loadNoCache(@NotNull ImageView view, @NotNull File file, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(file, "file");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(file).target(view);
        builderTarget.size(w, h);
        builderTarget.memoryCachePolicy(CachePolicy.DISABLED);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void load(@NotNull ImageView view, @NotNull String url, int w, int h, int radius, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ImageLoader.Builder builder = new ImageLoader.Builder(ApplicationExtKt.getApplication());
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
        }
        ImageLoader imageLoaderBuild = builder.components(builder2.build()).build();
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(url).target(view);
        builderTarget.size(w, h);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.watch.face.helper.ImageLoadUtil$load$lambda$8$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                callback.onReady(result);
            }
        });
        imageLoaderBuild.enqueue(builderTarget.build());
    }

    public final void load(@NotNull ImageView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Coil.imageLoader(view.getContext()).enqueue(new ImageRequest.Builder(view.getContext()).data(url).target(view).build());
    }

    public final void load(@NotNull ImageView view, @Nullable Drawable drawable, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(drawable).target(view);
        builderTarget.size(w, h);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }

    public final void load(@NotNull ImageView view, @NotNull File file, int w, int h, int radius) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(file, "file");
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(file).target(view);
        builderTarget.size(w, h);
        float f = radius;
        builderTarget.transformations(new RoundedCornersTransformation(f, f, f, f));
        imageLoader.enqueue(builderTarget.build());
    }
}
