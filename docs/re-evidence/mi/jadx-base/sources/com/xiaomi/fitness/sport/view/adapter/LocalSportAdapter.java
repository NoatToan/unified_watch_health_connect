package com.xiaomi.fitness.sport.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.sport.bean.LocalSportBean;
import com.xiaomi.fitness.sport.view.tab.adapter.LocalSportEcoView;
import defpackage.nuf;
import defpackage.rli;
import defpackage.vuq;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fJ\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter$Holder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "list", "", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "setData", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalSportAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private Context context;

    @NotNull
    private List<LocalSportBean> list;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/bean/LocalSportBean;", "bean", "", "bindData", "(Lcom/xiaomi/fitness/sport/bean/LocalSportBean;)V", "Lvuq;", "view", "Lvuq;", "getView", "()Lvuq;", "<init>", "(Lcom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter;Lvuq;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nLocalSportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,65:1\n54#2,3:66\n24#2:69\n59#2,6:70\n*S KotlinDebug\n*F\n+ 1 LocalSportAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/LocalSportAdapter$Holder\n*L\n59#1:66,3\n59#1:69\n59#1:70,6\n*E\n"})
    public final class Holder extends RecyclerView.d0 {
        final /* synthetic */ LocalSportAdapter this$0;

        @NotNull
        private final vuq view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull LocalSportAdapter localSportAdapter, vuq view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = localSportAdapter;
            this.view = view;
            nuf.f(view.getRoot());
        }

        public final void bindData(@NotNull LocalSportBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            ViewGroup.LayoutParams layoutParams = this.view.getRoot().getLayoutParams();
            layoutParams.width = UIUtils.INSTANCE.isTabletAndLandscape(this.this$0.getContext()) ? -1 : ExtUtilsKt.getDp(270);
            this.view.getRoot().setLayoutParams(layoutParams);
            this.view.C0(bean);
            this.view.getRoot().setTag(bean);
            ImageView image = this.view.B;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            Integer numValueOf = Integer.valueOf(bean.getBackResource());
            ImageLoader imageLoader = Coil.imageLoader(image.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(image.getContext()).data(numValueOf).target(image);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDimension(rli.c)));
            imageLoader.enqueue(builderTarget.build());
        }

        @NotNull
        public final vuq getView() {
            return this.view;
        }
    }

    public LocalSportAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.list = new ArrayList();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setData(@NotNull List<LocalSportBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.list.get(position));
        LocalSportEcoView.SportDataUtil.INSTANCE.cardZoom(this.context, this.list.get(position), holder.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        vuq vuqVarA0 = vuq.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(vuqVarA0, "inflate(...)");
        return new Holder(this, vuqVarA0);
    }
}
