package com.xiaomi.fitness.homepage.banner;

import android.app.ActivityOptions;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.homepage.banner.BannerAdapter;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/BannerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/homepage/banner/BannerAdapter$BannerViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "mDataList", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "BannerViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerAdapter extends RecyclerView.Adapter<BannerViewHolder> {

    @NotNull
    private Context mContext;

    @NotNull
    private List<HomeBannerModel> mDataList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/homepage/banner/BannerAdapter$BannerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/homepage/banner/HomeBannerModel;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "img", "Lcom/google/android/material/imageview/ShapeableImageView;", "getImg", "()Lcom/google/android/material/imageview/ShapeableImageView;", "setImg", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/homepage/banner/BannerAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nBannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerAdapter.kt\ncom/xiaomi/fitness/homepage/banner/BannerAdapter$BannerViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,62:1\n54#2,3:63\n24#2:66\n57#2,6:67\n63#2,2:74\n57#3:73\n*S KotlinDebug\n*F\n+ 1 BannerAdapter.kt\ncom/xiaomi/fitness/homepage/banner/BannerAdapter$BannerViewHolder\n*L\n58#1:63,3\n58#1:66\n58#1:67,6\n58#1:74,2\n58#1:73\n*E\n"})
    public final class BannerViewHolder extends RecyclerView.d0 {

        @Nullable
        private ShapeableImageView img;
        final /* synthetic */ BannerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BannerViewHolder(@NotNull BannerAdapter bannerAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = bannerAdapter;
            this.img = (ShapeableImageView) itemView.findViewById(eri.m7);
        }

        public final void bindData(@NotNull HomeBannerModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            ShapeableImageView shapeableImageView = this.img;
            if (shapeableImageView != null) {
                Coil.imageLoader(shapeableImageView.getContext()).enqueue(new ImageRequest.Builder(shapeableImageView.getContext()).data(model.getImgUrl()).target(shapeableImageView).build());
            }
            Logger.i("BannerView", " the img Url:" + model.getImgUrl());
        }

        @Nullable
        public final ShapeableImageView getImg() {
            return this.img;
        }

        public final void setImg(@Nullable ShapeableImageView shapeableImageView) {
            this.img = shapeableImageView;
        }
    }

    public BannerAdapter(@NotNull Context context, @NotNull List<HomeBannerModel> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDataList = dataList;
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(HomeBannerModel bannerModel, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(bannerModel, "$bannerModel");
        Logger.i("BannerView", " the intent Url:" + bannerModel.getIntentUrl());
        WebViewUtilKt.startWebView$default(bannerModel.getIntentUrl(), bannerModel.getMainTitle(), false, false, null, false, null, false, 252, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<HomeBannerModel> getMDataList() {
        return this.mDataList;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMDataList(@NotNull List<HomeBannerModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BannerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final HomeBannerModel homeBannerModel = this.mDataList.get(position);
        holder.bindData(homeBannerModel);
        HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
        Context context = this.mContext;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        healthDataUtil.cardZoom(context, itemView, new Function1() { // from class: f02
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BannerAdapter.onBindViewHolder$lambda$0(homeBannerModel, (ActivityOptions) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BannerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(jui.i7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new BannerViewHolder(this, viewInflate);
    }
}
