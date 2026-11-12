package com.xiaomi.fitness.sport.view.wear.guide;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter$CarouselItemViewHolder;", "<init>", "()V", "dataList", "", "Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselDataItem;", "gifImageLoader", "Lcoil/ImageLoader;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "displayAnimatedGif", "carouselImageView", "Landroid/widget/ImageView;", "showGifImage", "resourceUrl", "", "placeHolderRes", "Companion", "CarouselItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearGuideCarouselAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearGuideCarouselAdapter.kt\ncom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,148:1\n192#2:149\n59#3,6:150\n*S KotlinDebug\n*F\n+ 1 WearGuideCarouselAdapter.kt\ncom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter\n*L\n93#1:149\n143#1:150,6\n*E\n"})
public final class WearGuideCarouselAdapter extends RecyclerView.Adapter<CarouselItemViewHolder> {

    @NotNull
    private static final String URI_ANIMATED_GIF_2_DARK_GLOBAL = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/en/2_dark.gif";

    @NotNull
    private static final String URI_ANIMATED_GIF_2_LIGHT_GLOBAL = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/en/2_light.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_1_DARK = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/1_dark.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_1_LIGHT = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/1_light.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_2_DARK = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/2_dark.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_2_LIGHT = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/2_light.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_3_DARK = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/3_dark.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_3_LIGHT = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/3_light.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_4_DARK = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/4_dark.gif";

    @NotNull
    private static final String URL_ANIMATED_GIF_4_LIGHT = "https://cdn.web-global.fds.api.mi-img.com/miwear-docs/running-bean-pics/zh_cn/4_light.gif";

    @NotNull
    private final List<WearGuideCarouselDataItem> dataList;

    @NotNull
    private ImageLoader gifImageLoader;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter$CarouselItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselDataItem;", "dataItem", "", "bindData", "(Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselDataItem;)V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "carouselImageView", "Landroid/widget/ImageView;", "<init>", "(Lcom/xiaomi/fitness/sport/view/wear/guide/WearGuideCarouselAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CarouselItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView carouselImageView;

        @NotNull
        private final View itemView;

        @NotNull
        private final TextView textView;
        final /* synthetic */ WearGuideCarouselAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselItemViewHolder(@NotNull WearGuideCarouselAdapter wearGuideCarouselAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = wearGuideCarouselAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(xri.i7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.textView = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.y2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.carouselImageView = (ImageView) viewFindViewById2;
        }

        public final void bindData(@NotNull WearGuideCarouselDataItem dataItem) {
            Intrinsics.checkNotNullParameter(dataItem, "dataItem");
            this.textView.setText(dataItem.getInstructionResId());
            this.this$0.displayAnimatedGif(getBindingAdapterPosition(), this.carouselImageView);
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }
    }

    public WearGuideCarouselAdapter() {
        ArrayList arrayList = new ArrayList();
        this.dataList = arrayList;
        boolean zIsPlayChannel = AppUtil.INSTANCE.isPlayChannel();
        boolean zIsNightMode = UIUtils.isNightMode(ApplicationExtKt.getApplication());
        String str = (zIsPlayChannel || !zIsNightMode) ? (zIsPlayChannel || zIsNightMode) ? (zIsPlayChannel && zIsNightMode) ? URI_ANIMATED_GIF_2_DARK_GLOBAL : URI_ANIMATED_GIF_2_LIGHT_GLOBAL : URL_ANIMATED_GIF_2_LIGHT : URL_ANIMATED_GIF_2_DARK;
        int i = zIsPlayChannel ? eoi.R0 : eoi.Q0;
        ListExtKt.add(arrayList, new WearGuideCarouselDataItem(zIsNightMode ? URL_ANIMATED_GIF_1_DARK : URL_ANIMATED_GIF_1_LIGHT, eoi.P0, c1j.k0));
        ListExtKt.add(arrayList, new WearGuideCarouselDataItem(str, i, c1j.l0));
        ListExtKt.add(arrayList, new WearGuideCarouselDataItem(zIsNightMode ? URL_ANIMATED_GIF_3_DARK : URL_ANIMATED_GIF_3_LIGHT, eoi.S0, c1j.m0));
        ListExtKt.add(arrayList, new WearGuideCarouselDataItem(zIsNightMode ? URL_ANIMATED_GIF_4_DARK : URL_ANIMATED_GIF_4_LIGHT, eoi.T0, c1j.n0));
        ImageLoader.Builder builder = new ImageLoader.Builder(ApplicationExtKt.getApplication());
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 1;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i2, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i2, defaultConstructorMarker));
        }
        Unit unit = Unit.INSTANCE;
        this.gifImageLoader = builder.components(builder2.build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayAnimatedGif(int position, ImageView carouselImageView) {
        showGifImage(carouselImageView, this.dataList.get(position).getAnimatedGifUrl(), this.dataList.get(position).getPlaceholderResId());
    }

    private final void showGifImage(ImageView carouselImageView, String resourceUrl, int placeHolderRes) {
        ImageLoader imageLoader = this.gifImageLoader;
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(carouselImageView.getContext()).data(resourceUrl).target(carouselImageView);
        builderTarget.placeholder(placeHolderRes);
        builderTarget.error(placeHolderRes);
        imageLoader.enqueue(builderTarget.build());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CarouselItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CarouselItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.R, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new CarouselItemViewHolder(this, viewInflate);
    }
}
