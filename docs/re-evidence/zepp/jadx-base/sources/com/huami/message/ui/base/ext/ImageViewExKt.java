package com.huami.message.ui.base.ext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.huami.message.ui.R;
import com.huami.message.ui.base.glide.CenterCropRoundCornerTransform;
import com.huami.message.ui.base.glide.GlideCircleBorderTransform;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a%\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0007\u0010\n\u001a(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002\u001a0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002\u001a.\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a$\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¨\u0006\u0016"}, d2 = {"Landroid/widget/ImageView;", "", "url", "", "loadUrl", "", "placeHolder", "loadUrlWithCorner", "", "radius", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Float;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "c", "borderWidth", "borderColor", "a", "loadUrlWithCircleBorder", "drawable", "loadDrawableWithCircleBorder", "message-mifit_release"}, k = 2, mv = {1, 5, 1})
public final class ImageViewExKt {
    private static final RequestBuilder<Drawable> a(Context context, int i, float f, int i2) {
        return Glide.with(context).load(Integer.valueOf(i)).apply(new RequestOptions().centerCrop().transform(new GlideCircleBorderTransform(f, i2)));
    }

    public static /* synthetic */ RequestBuilder b(Context context, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = R.drawable.mc_img_placeholder;
        }
        return a(context, i, f, i2);
    }

    private static final RequestBuilder<Drawable> c(Context context, int i, float f) {
        return Glide.with(context).load(Integer.valueOf(i)).apply(new RequestOptions().centerCrop().transform(new CenterCropRoundCornerTransform(f)));
    }

    public static /* synthetic */ RequestBuilder d(Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = R.drawable.mc_img_placeholder;
        }
        return c(context, i, f);
    }

    public static final void loadDrawableWithCircleBorder(@NotNull ImageView imageView, @Nullable Drawable drawable, float f, int i) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(drawable);
        RequestOptions requestOptionsTransform = new RequestOptions().transform(new GlideCircleBorderTransform(f, i));
        int i2 = R.drawable.mc_img_placeholder;
        requestBuilderLoad.apply(requestOptionsTransform.placeholder(i2).error(i2)).into(imageView);
    }

    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(str);
        RequestOptions requestOptions = new RequestOptions();
        int i = R.drawable.mc_img_placeholder;
        requestBuilderLoad.apply(requestOptions.placeholder(i).error(i)).into(imageView);
    }

    public static final void loadUrlWithCircleBorder(@NotNull ImageView imageView, @Nullable String str, float f, int i, int i2) {
        Glide.with(imageView.getContext()).load(str).apply(new RequestOptions().transform(new GlideCircleBorderTransform(f, i)).placeholder(i2).error(i2)).thumbnail(a(imageView.getContext(), i2, f, i)).into(imageView);
    }

    public static /* synthetic */ void loadUrlWithCircleBorder$default(ImageView imageView, String str, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = R.drawable.mc_img_placeholder;
        }
        loadUrlWithCircleBorder(imageView, str, f, i, i2);
    }

    public static final void loadUrlWithCorner(@NotNull ImageView imageView, @Nullable String str) {
        loadUrlWithCorner(imageView, str, null);
    }

    public static final void loadUrlWithCorner(@NotNull ImageView imageView, @Nullable String str, @Nullable Float f) {
        float fDpToPx = ViewExKt.dpToPx((View) imageView, 9.6f);
        if (f != null) {
            fDpToPx = f.floatValue();
        }
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(str);
        RequestOptions requestOptions = new RequestOptions();
        int i = R.drawable.mc_img_placeholder;
        requestBuilderLoad.apply(requestOptions.placeholder(i).error(i).transform(new CenterCropRoundCornerTransform(fDpToPx))).thumbnail(c(imageView.getContext(), i, fDpToPx)).into(imageView);
    }

    public static final void loadUrl(@NotNull ImageView imageView, @Nullable String str, int i) {
        Glide.with(imageView.getContext()).load(str).apply(new RequestOptions().placeholder(i).error(i)).into(imageView);
    }

    public static final void loadDrawableWithCircleBorder(@NotNull ImageView imageView, @Nullable Drawable drawable) {
        RequestBuilder<Drawable> requestBuilderLoad = Glide.with(imageView.getContext()).load(drawable);
        RequestOptions requestOptions = new RequestOptions();
        int i = R.drawable.mc_img_placeholder;
        requestBuilderLoad.apply(requestOptions.placeholder(i).error(i)).into(imageView);
    }
}
