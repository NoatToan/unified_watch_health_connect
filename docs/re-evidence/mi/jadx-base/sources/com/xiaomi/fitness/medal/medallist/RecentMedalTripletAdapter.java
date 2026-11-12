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
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medallist.RecentMedalTripletAdapter;
import defpackage.ecf;
import defpackage.iri;
import defpackage.mli;
import defpackage.nuf;
import defpackage.pui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter$RecentMedalViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter$RecentMedalViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter$RecentMedalViewHolder;I)V", "getItemCount", "()I", "", "Lecf$a$a;", "dataList", "Ljava/util/List;", "imageWidth", "I", "<init>", "(Ljava/util/List;)V", "RecentMedalViewHolder", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecentMedalTripletAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentMedalTripletAdapter.kt\ncom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,74:1\n54#2,3:75\n24#2:78\n57#2,6:79\n63#2,2:86\n57#3:85\n*S KotlinDebug\n*F\n+ 1 RecentMedalTripletAdapter.kt\ncom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter\n*L\n58#1:75,3\n58#1:78\n58#1:79,6\n58#1:86,2\n58#1:85\n*E\n"})
public final class RecentMedalTripletAdapter extends RecyclerView.Adapter<RecentMedalViewHolder> {

    @NotNull
    private final List<ecf.a.C0923a> dataList;
    private final int imageWidth;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter$RecentMedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "medalIcon", "Landroid/widget/ImageView;", "getMedalIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/RecentMedalTripletAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RecentMedalViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView medalIcon;
        final /* synthetic */ RecentMedalTripletAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentMedalViewHolder(@NotNull RecentMedalTripletAdapter recentMedalTripletAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recentMedalTripletAdapter;
            View viewFindViewById = view.findViewById(iri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalIcon = (ImageView) viewFindViewById;
        }

        @NotNull
        public final ImageView getMedalIcon() {
            return this.medalIcon;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentMedalTripletAdapter(@NotNull List<? extends ecf.a.C0923a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.imageWidth = (Resources.getSystem().getDisplayMetrics().widthPixels - (ExtUtilsKt.getDimension(mli.f26983b) * 2)) / 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(RecentMedalViewHolder holder, ecf.a.C0923a medalData) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(medalData, "$medalData");
        ImageView medalIcon = holder.getMedalIcon();
        Coil.imageLoader(medalIcon.getContext()).enqueue(new ImageRequest.Builder(medalIcon.getContext()).data(medalData.c).target(medalIcon).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(RecentMedalTripletAdapter this$0, int i, RecentMedalViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        ecf.a.C0923a c0923a = this$0.dataList.get(i);
        Intent intent = new Intent();
        intent.putExtra("key_params_medal_id", c0923a.o.longValue());
        intent.putExtra("key_params_medal_type", c0923a.m);
        intent.setClass(holder.itemView.getContext(), MedalDetailActivity.class);
        holder.itemView.getContext().startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecentMedalViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ecf.a.C0923a c0923a = this.dataList.get(position);
        int i = this.imageWidth;
        MedalHelper.Companion companion = MedalHelper.INSTANCE;
        Logger.d("RecentMedalTripletAdapter", "onBindViewHolder imageWidth=" + i + " imageHeight=" + ((int) (i * companion.getMedalImgRatio(c0923a.f16490b))));
        holder.getMedalIcon().getLayoutParams().width = this.imageWidth;
        holder.getMedalIcon().getLayoutParams().height = (int) (((float) this.imageWidth) * companion.getMedalImgRatio(c0923a.f16490b));
        holder.getMedalIcon().post(new Runnable() { // from class: whj
            @Override // java.lang.Runnable
            public final void run() {
                RecentMedalTripletAdapter.onBindViewHolder$lambda$0(holder, c0923a);
            }
        });
        nuf.f(holder.itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: xhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentMedalTripletAdapter.onBindViewHolder$lambda$1(this.f39136a, position, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecentMedalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pui.f30803r, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new RecentMedalViewHolder(this, viewInflate);
    }
}
