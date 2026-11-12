package com.xiaomi.fitness.baseui.recyclerview.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\rJ\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/ImageViewBindingAdapter;", "", "<init>", "()V", "setIcon", "", "view", "Landroid/widget/ImageView;", Constants.KEY_RECHARGE_ICON_URL, "", "placeholderIcon", "", "errorIcon", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "iconRes", "drawable", "Landroid/graphics/drawable/Drawable;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageViewBindingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewBindingAdapter.kt\ncom/xiaomi/fitness/baseui/recyclerview/adapter/ImageViewBindingAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,45:1\n1#2:46\n54#3,3:47\n24#3:50\n57#3,6:51\n63#3,2:58\n54#3,3:60\n24#3:63\n59#3,6:64\n57#4:57\n*S KotlinDebug\n*F\n+ 1 ImageViewBindingAdapter.kt\ncom/xiaomi/fitness/baseui/recyclerview/adapter/ImageViewBindingAdapter\n*L\n23#1:47,3\n23#1:50\n23#1:51,6\n23#1:58,2\n26#1:60,3\n26#1:63\n26#1:64,6\n23#1:57\n*E\n"})
public final class ImageViewBindingAdapter {

    @NotNull
    public static final ImageViewBindingAdapter INSTANCE = new ImageViewBindingAdapter();

    private ImageViewBindingAdapter() {
    }

    @JvmStatic
    public static final void setIcon(@NotNull ImageView view, @Nullable String iconUrl, @Nullable Integer placeholderIcon, @Nullable Integer errorIcon) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (iconUrl == null || iconUrl.length() == 0) {
            if (placeholderIcon != null) {
                Coil.imageLoader(view.getContext()).enqueue(new ImageRequest.Builder(view.getContext()).data(Integer.valueOf(placeholderIcon.intValue())).target(view).build());
                return;
            }
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(view.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(view.getContext()).data(iconUrl).target(view);
        if (errorIcon != null) {
            builderTarget.error(errorIcon.intValue());
        }
        imageLoader.enqueue(builderTarget.build());
    }

    @JvmStatic
    public static final void setIcon(@NotNull ImageView view, int iconRes) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImageResource(iconRes);
    }

    @JvmStatic
    public static final void setIcon(@NotNull ImageView view, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        view.setImageDrawable(drawable);
    }
}
