package com.xiaomi.fitness.medal.medallist;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medallist.RecentMedalAdapter;
import defpackage.ecf;
import defpackage.iri;
import defpackage.nuf;
import defpackage.pui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter$RecentMedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter$RecentMedalViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter$RecentMedalViewHolder;I)V", "", "Lecf$a$a;", "dataList", "Ljava/util/List;", "imageWidth", "I", "<init>", "(Ljava/util/List;)V", "RecentMedalViewHolder", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecentMedalAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentMedalAdapter.kt\ncom/xiaomi/fitness/medal/medallist/RecentMedalAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,73:1\n54#2,3:74\n24#2:77\n57#2,6:78\n63#2,2:85\n57#3:84\n*S KotlinDebug\n*F\n+ 1 RecentMedalAdapter.kt\ncom/xiaomi/fitness/medal/medallist/RecentMedalAdapter\n*L\n55#1:74,3\n55#1:77\n55#1:78,6\n55#1:85,2\n55#1:84\n*E\n"})
public final class RecentMedalAdapter extends RecyclerView.Adapter<RecentMedalViewHolder> {

    @NotNull
    private final List<ecf.a.C0923a> dataList;
    private final int imageWidth;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter$RecentMedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "medalIcon", "Landroid/widget/ImageView;", "getMedalIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/RecentMedalAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RecentMedalViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView medalIcon;
        final /* synthetic */ RecentMedalAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentMedalViewHolder(@NotNull final RecentMedalAdapter recentMedalAdapter, final View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recentMedalAdapter;
            View viewFindViewById = view.findViewById(iri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalIcon = (ImageView) viewFindViewById;
            nuf.f(view);
            view.setOnClickListener(new View.OnClickListener() { // from class: vhj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RecentMedalAdapter.RecentMedalViewHolder._init_$lambda$0(recentMedalAdapter, this, view, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(RecentMedalAdapter this$0, RecentMedalViewHolder this$1, View view, View view2) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(view, "$view");
            ecf.a.C0923a c0923a = (ecf.a.C0923a) this$0.dataList.get(this$1.getBindingAdapterPosition());
            Intent intent = new Intent();
            intent.putExtra("key_params_medal_id", c0923a.o.longValue());
            intent.putExtra("key_params_medal_type", c0923a.m);
            intent.setClass(view.getContext(), MedalDetailActivity.class);
            view.getContext().startActivity(intent);
        }

        @NotNull
        public final ImageView getMedalIcon() {
            return this.medalIcon;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentMedalAdapter(@NotNull List<? extends ecf.a.C0923a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.imageWidth = Resources.getSystem().getDisplayMetrics().widthPixels - ExtUtilsKt.getDp(Float.valueOf(60.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RecentMedalViewHolder holder, ecf.a.C0923a medalData) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(medalData, "$medalData");
        ImageView medalIcon = holder.getMedalIcon();
        Coil.imageLoader(medalIcon.getContext()).enqueue(new ImageRequest.Builder(medalIcon.getContext()).data(medalData.c).target(medalIcon).build());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecentMedalViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ecf.a.C0923a c0923a = this.dataList.get(position);
        holder.getMedalIcon().getLayoutParams().width = this.imageWidth;
        holder.getMedalIcon().getLayoutParams().height = (int) (this.imageWidth * MedalHelper.INSTANCE.getMedalImgRatio(c0923a.f16490b));
        holder.getMedalIcon().post(new Runnable() { // from class: uhj
            @Override // java.lang.Runnable
            public final void run() {
                RecentMedalAdapter.onBindViewHolder$lambda$0(holder, c0923a);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecentMedalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pui.f30802k, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new RecentMedalViewHolder(this, viewInflate);
    }
}
