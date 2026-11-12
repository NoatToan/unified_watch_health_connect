package com.xiaomi.fitness.electronic.scale.widget.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.imageview.ShapeableImageView;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBannerAdapter;
import com.xiaomi.fitness.widget.carousel.CarouselBannerModel;
import defpackage.bri;
import defpackage.gui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018J#\u0010\u0019\u001a\u00020\u000b2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\t¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter$CarouselBannerHolder;", "<init>", "()V", "mDataList", "", "Lcom/xiaomi/fitness/widget/carousel/CarouselBannerModel;", "onBannerClickListener", "Lcom/xiaomi/fitness/electronic/scale/widget/banner/OnBannerClickListener;", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "bindData", "dataList", "", "setOnBannerClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Lkotlin/jvm/functions/Function1;)V", "CarouselBannerHolder", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoBannerAdapter extends RecyclerView.Adapter<CarouselBannerHolder> {

    @NotNull
    private List<CarouselBannerModel> mDataList = new ArrayList();

    @Nullable
    private Function1<? super CarouselBannerModel, Unit> onBannerClickListener;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter$CarouselBannerHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindData", "(I)V", "onClick", "Lcom/google/android/material/imageview/ShapeableImageView;", "image", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImage", "()Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nEcoBannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoBannerAdapter.kt\ncom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter$CarouselBannerHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,63:1\n54#2,3:64\n24#2:67\n57#2,6:68\n63#2,2:75\n57#3:74\n*S KotlinDebug\n*F\n+ 1 EcoBannerAdapter.kt\ncom/xiaomi/fitness/electronic/scale/widget/banner/EcoBannerAdapter$CarouselBannerHolder\n*L\n49#1:64,3\n49#1:67\n49#1:68,6\n49#1:75,2\n49#1:74\n*E\n"})
    public final class CarouselBannerHolder extends RecyclerView.d0 {

        @NotNull
        private final ShapeableImageView image;
        final /* synthetic */ EcoBannerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CarouselBannerHolder(@NotNull EcoBannerAdapter ecoBannerAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = ecoBannerAdapter;
            this.image = (ShapeableImageView) itemView.findViewById(bri.S0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(EcoBannerAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Function1 function1 = this$0.onBannerClickListener;
            if (function1 != null) {
                function1.invoke2(this$0.mDataList.get(i));
            }
        }

        public final void bindData(int position) {
            CarouselBannerModel carouselBannerModel = (CarouselBannerModel) this.this$0.mDataList.get(position);
            ShapeableImageView shapeableImageView = this.image;
            Coil.imageLoader(shapeableImageView.getContext()).enqueue(new ImageRequest.Builder(shapeableImageView.getContext()).data(carouselBannerModel.getImgUrl()).target(shapeableImageView).build());
        }

        @NotNull
        public final ShapeableImageView getImage() {
            return this.image;
        }

        public final void onClick(final int position) {
            ShapeableImageView shapeableImageView = this.image;
            final EcoBannerAdapter ecoBannerAdapter = this.this$0;
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: xd7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcoBannerAdapter.CarouselBannerHolder.onClick$lambda$0(ecoBannerAdapter, position, view);
                }
            });
        }
    }

    public final void bindData(@NotNull List<CarouselBannerModel> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDataList.clear();
        this.mDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    public final void setOnBannerClickListener(@NotNull Function1<? super CarouselBannerModel, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onBannerClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CarouselBannerHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(position);
        holder.onClick(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CarouselBannerHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(gui.d0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new CarouselBannerHolder(this, viewInflate);
    }
}
