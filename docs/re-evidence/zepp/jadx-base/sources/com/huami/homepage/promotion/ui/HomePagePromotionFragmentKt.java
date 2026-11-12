package com.huami.homepage.promotion.ui;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.huami.homepage.promotion.util.RoundedCornersTransformation;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0002¨\u0006\r"}, d2 = {"Landroid/view/View;", "", "isVisible", "", "c", "Landroid/widget/ImageView;", "", "url", "", "placeholder", "b", Constant.PAI_KEY_DAILY_PAI, "a", "promotion_release"}, k = 2, mv = {1, 5, 1})
public final class HomePagePromotionFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(View view, int i) {
        return (int) TypedValue.applyDimension(1, i, view.getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ImageView imageView, String str, int i) {
        Glide.with(imageView).load(str).apply(new RequestOptions().placeholder(i).transforms(new CenterCrop(), new RoundedCornersTransformation(a(imageView, 6), 0, RoundedCornersTransformation.CornerType.TOP))).into(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}
