package com.huami.femalehealth.logiclib.helper.ext;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "loadUrl", "", "placeHolder", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class ImageViewExKt {
    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str) {
        Glide.with(imageView.getContext()).load(str).into(imageView);
    }

    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str, int i) {
        Glide.with(imageView.getContext()).load(str).apply(new RequestOptions().placeholder(i).error(i)).into(imageView);
    }
}
