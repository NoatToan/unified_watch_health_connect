package com.xiaomi.fitness.sport.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerItem;
import com.fitness.banner.export.IBanner;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport.bean.RecommendSportBean;
import defpackage.rli;
import defpackage.rwq;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter$Holder;", "<init>", "()V", "list", "", "Lcom/xiaomi/fitness/sport/bean/RecommendSportBean;", "setData", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private List<RecommendSportBean> list = new ArrayList();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/sport/bean/RecommendSportBean;", "bean", "bindData", "(Lcom/xiaomi/fitness/sport/bean/RecommendSportBean;)V", "Lrwq;", "view", "Lrwq;", "getView", "()Lrwq;", "<init>", "(Lcom/xiaomi/fitness/sport/view/adapter/RecommendAdapter;Lrwq;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecommendAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/RecommendAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,65:1\n54#2,3:66\n24#2:69\n59#2,6:70\n*S KotlinDebug\n*F\n+ 1 RecommendAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/RecommendAdapter$Holder\n*L\n60#1:66,3\n60#1:69\n60#1:70,6\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {
        final /* synthetic */ RecommendAdapter this$0;

        @NotNull
        private final rwq view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull RecommendAdapter recommendAdapter, rwq view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recommendAdapter;
            this.view = view;
            view.getRoot().setOnClickListener(this);
        }

        public final void bindData(@NotNull RecommendSportBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            if (bean.getBannerItem() == null) {
                return;
            }
            this.view.C0(bean);
            this.view.getRoot().setTag(bean.getBannerItem());
            View root = this.view.getRoot();
            BannerItem bannerItem = bean.getBannerItem();
            Intrinsics.checkNotNull(bannerItem);
            root.setContentDescription(bannerItem.getMainTitle());
            a aVar = new a();
            aVar.s(this.view.A);
            int i = xri.y2;
            BannerItem bannerItem2 = bean.getBannerItem();
            Intrinsics.checkNotNull(bannerItem2);
            aVar.Z(i, bannerItem2.getSmallImage() ? "3.45:1" : "2:1");
            aVar.i(this.view.A);
            ImageView image = this.view.B;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            BannerItem bannerItem3 = bean.getBannerItem();
            Intrinsics.checkNotNull(bannerItem3);
            String iconHead = bannerItem3.getIconHead();
            ImageLoader imageLoader = Coil.imageLoader(image.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(image.getContext()).data(iconHead).target(image);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDimension(rli.c)));
            imageLoader.enqueue(builderTarget.build());
        }

        @NotNull
        public final rwq getView() {
            return this.view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View v) {
            if ((v != null ? v.getTag() : null) instanceof BannerItem) {
                IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
                Object tag = v.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.fitness.banner.export.BannerItem");
                instance.onBannerV1Click((BannerItem) tag);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@NotNull List<RecommendSportBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        rwq rwqVarA0 = rwq.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(rwqVarA0, "inflate(...)");
        return new Holder(this, rwqVarA0);
    }
}
