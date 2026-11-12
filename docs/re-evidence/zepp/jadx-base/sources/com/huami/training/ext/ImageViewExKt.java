package com.huami.training.ext;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.huami.training.ui.R;
import com.huami.training.utils.CenterCropRoundCornerTransform;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a%\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "loadUrl", "", "placeHolder", "loadUrlWithCorner", "", "radius", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Float;)V", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ImageViewExKt {
    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(str);
        RequestOptions requestOptions = new RequestOptions();
        int i = R.drawable.tr_img_placeholder;
        requestBuilderLoad.apply(requestOptions.placeholder(i).error(i)).into(imageView);
    }

    public static final void loadUrlWithCorner(@NotNull ImageView imageView, @Nullable String str) {
        loadUrlWithCorner(imageView, str, null);
    }

    public static final void loadUrlWithCorner(@NotNull ImageView imageView, @Nullable String str, @Nullable Float f) {
        float fDpToPx = ViewExKt.dpToPx(imageView, 9.6f);
        if (f != null) {
            fDpToPx = f.floatValue();
        }
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(str);
        RequestOptions requestOptionsTransform = new RequestOptions().transform(new CenterCropRoundCornerTransform(fDpToPx));
        int i = R.drawable.tr_img_placeholder;
        requestBuilderLoad.apply(requestOptionsTransform.placeholder(i).error(i)).into(imageView);
    }

    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str, int i) {
        Glide.with(imageView.getContext()).load(str).apply(new RequestOptions().placeholder(i).error(i)).into(imageView);
    }
}
