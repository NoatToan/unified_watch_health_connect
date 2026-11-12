package com.huami.wallet.common.helper;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.huami.wallet.common.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0007\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0007¨\u0006\n"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "placeHolder", "", "loadImage", "Landroid/view/View;", "visible", "gone", "common_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExtensionKt {
    public static final void gone(@NotNull View view) {
        view.setVisibility(8);
    }

    public static final void loadImage(@NotNull ImageView imageView, @Nullable String str, @DrawableRes int i) {
        RequestOptions requestOptionsPlaceholder = new RequestOptions().placeholder(i);
        if (str == null) {
            str = "";
        }
        Glide.with(imageView.getContext()).load(str).apply(requestOptionsPlaceholder).into(imageView);
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.drawable.ic_nfc_placeholder;
        }
        loadImage(imageView, str, i);
    }

    public static final void visible(@NotNull View view) {
        view.setVisibility(0);
    }
}
