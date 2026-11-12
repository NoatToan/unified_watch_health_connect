package com.xiaomi.fitness.medal.medaldetail;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.medal.MedalHelper;
import defpackage.ecf;
import defpackage.iri;
import defpackage.pui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter$MedalDetailHorizontalViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter$MedalDetailHorizontalViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter$MedalDetailHorizontalViewHolder;I)V", "", "Lecf$a$a;", "dataList", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "MedalDetailHorizontalViewHolder", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalDetailHorizontalAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalDetailHorizontalAdapter.kt\ncom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,45:1\n54#2,3:46\n24#2:49\n57#2,6:50\n63#2,2:57\n57#3:56\n*S KotlinDebug\n*F\n+ 1 MedalDetailHorizontalAdapter.kt\ncom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter\n*L\n42#1:46,3\n42#1:49\n42#1:50,6\n42#1:57,2\n42#1:56\n*E\n"})
public final class MedalDetailHorizontalAdapter extends RecyclerView.Adapter<MedalDetailHorizontalViewHolder> {

    @NotNull
    private final List<ecf.a.C0923a> dataList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter$MedalDetailHorizontalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "medalIcon", "Landroid/widget/ImageView;", "getMedalIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "gotCount", "Landroid/widget/TextView;", "getGotCount", "()Landroid/widget/TextView;", "<init>", "(Lcom/xiaomi/fitness/medal/medaldetail/MedalDetailHorizontalAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedalDetailHorizontalViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView gotCount;

        @NotNull
        private final ImageView medalIcon;
        final /* synthetic */ MedalDetailHorizontalAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalDetailHorizontalViewHolder(@NotNull MedalDetailHorizontalAdapter medalDetailHorizontalAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalDetailHorizontalAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(iri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalIcon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(iri.t);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.gotCount = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getGotCount() {
            return this.gotCount;
        }

        @NotNull
        public final ImageView getMedalIcon() {
            return this.medalIcon;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MedalDetailHorizontalAdapter(@NotNull List<? extends ecf.a.C0923a> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MedalDetailHorizontalViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ecf.a.C0923a c0923a = this.dataList.get(position);
        String str = TextUtils.isEmpty(c0923a.c) ? "-" : c0923a.c;
        ImageView medalIcon = holder.getMedalIcon();
        Coil.imageLoader(medalIcon.getContext()).enqueue(new ImageRequest.Builder(medalIcon.getContext()).data(str).target(medalIcon).build());
        holder.getGotCount().setText(MedalHelper.INSTANCE.constructsMedalAchievedStatusDisplayStr(c0923a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MedalDetailHorizontalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pui.g, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MedalDetailHorizontalViewHolder(this, viewInflate);
    }
}
