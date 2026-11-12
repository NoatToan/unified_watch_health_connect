package com.xiaomi.fitness.nfc.utils;

import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/CoilUtils;", "", "<init>", "()V", "load", "", "imageView", "Landroid/widget/ImageView;", "url", "", "placeHolder", "", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoilUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoilUtils.kt\ncom/xiaomi/fitness/nfc/utils/CoilUtils\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,18:1\n54#2,3:19\n24#2:22\n59#2,6:23\n*S KotlinDebug\n*F\n+ 1 CoilUtils.kt\ncom/xiaomi/fitness/nfc/utils/CoilUtils\n*L\n14#1:19,3\n14#1:22\n14#1:23,6\n*E\n"})
public final class CoilUtils {

    @NotNull
    public static final CoilUtils INSTANCE = new CoilUtils();

    private CoilUtils() {
    }

    @JvmStatic
    public static final void load(@NotNull ImageView imageView, @NotNull String url, int placeHolder) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(url, "url");
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
        builderTarget.placeholder(placeHolder);
        imageLoader.enqueue(builderTarget.build());
    }
}
