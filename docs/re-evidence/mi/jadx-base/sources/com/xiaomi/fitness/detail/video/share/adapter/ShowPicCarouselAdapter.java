package com.xiaomi.fitness.detail.video.share.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter$CarouselItemViewHolder;", "<init>", "()V", "mImgList", "", "Landroid/net/Uri;", "updateData", "", "imgList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "CarouselItemViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShowPicCarouselAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowPicCarouselAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,56:1\n54#2,3:57\n24#2:60\n57#2,6:61\n63#2,2:68\n54#2,3:70\n24#2:73\n59#2,6:74\n57#3:67\n*S KotlinDebug\n*F\n+ 1 ShowPicCarouselAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter\n*L\n39#1:57,3\n39#1:60\n39#1:61,6\n39#1:68,2\n48#1:70,3\n48#1:73\n48#1:74,6\n39#1:67\n*E\n"})
public final class ShowPicCarouselAdapter extends RecyclerView.Adapter<CarouselItemViewHolder> {

    @Nullable
    private List<? extends Uri> mImgList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter$CarouselItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Lcom/google/android/material/imageview/ShapeableImageView;", "img", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImg", "()Lcom/google/android/material/imageview/ShapeableImageView;", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/adapter/ShowPicCarouselAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CarouselItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ShapeableImageView img;

        @NotNull
        private final View itemView;
        final /* synthetic */ ShowPicCarouselAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselItemViewHolder(@NotNull ShowPicCarouselAdapter showPicCarouselAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = showPicCarouselAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(bsi.s2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.img = (ShapeableImageView) viewFindViewById;
        }

        @NotNull
        public final ShapeableImageView getImg() {
            return this.img;
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<? extends Uri> list = this.mImgList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void updateData(@Nullable List<? extends Uri> imgList) {
        this.mImgList = imgList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CarouselItemViewHolder holder, int position) {
        Uri uri;
        int dp;
        int i;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<? extends Uri> list = this.mImgList;
        if (list == null || (uri = list.get(position)) == null) {
            return;
        }
        float rationOfHeightBasedOnWidthFromUri = SportTraceVideoShareUtilKt.getRationOfHeightBasedOnWidthFromUri(uri);
        if (rationOfHeightBasedOnWidthFromUri == -1.0f) {
            ShapeableImageView img = holder.getImg();
            Coil.imageLoader(img.getContext()).enqueue(new ImageRequest.Builder(img.getContext()).data(Integer.valueOf(hoi.I)).target(img).build());
            return;
        }
        if (rationOfHeightBasedOnWidthFromUri >= 1.34d) {
            dp = ExtUtilsKt.getDp(Double.valueOf(383.33d));
            i = (int) (dp / rationOfHeightBasedOnWidthFromUri);
        } else {
            int dp2 = ExtUtilsKt.getDp(Double.valueOf(285.33d));
            dp = (int) (dp2 * rationOfHeightBasedOnWidthFromUri);
            i = dp2;
        }
        ShapeableImageView img2 = holder.getImg();
        ImageLoader imageLoader = Coil.imageLoader(img2.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(img2.getContext()).data(uri).target(img2);
        builderTarget.size(i, dp);
        imageLoader.enqueue(builderTarget.build());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CarouselItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.h0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new CarouselItemViewHolder(this, viewInflate);
    }
}
