package com.xiaomi.fitness.health.pai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.pai.model.PaiIntro;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0018H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/pai/adapter/PaiIntroAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/pai/adapter/PaiIntroAdapter$PaiIntroViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/health/pai/model/PaiIntro;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "mDataList", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "PaiIntroViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaiIntroAdapter extends RecyclerView.Adapter<PaiIntroViewHolder> {

    @NotNull
    private Context mContext;

    @NotNull
    private List<PaiIntro> mDataList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/pai/adapter/PaiIntroAdapter$PaiIntroViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/pai/model/PaiIntro;", "paiIntro", "", "bindData", "(Lcom/xiaomi/fitness/health/pai/model/PaiIntro;)V", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "tvContent", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class PaiIntroViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView tvContent;

        @NotNull
        private final TextView tvTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaiIntroViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.bn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvTitle = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.Bk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvContent = (TextView) viewFindViewById2;
        }

        public final void bindData(@NotNull PaiIntro paiIntro) {
            Intrinsics.checkNotNullParameter(paiIntro, "paiIntro");
            this.tvTitle.setText(paiIntro.getTitleResId());
            this.tvContent.setText(paiIntro.getContentResId());
        }
    }

    public PaiIntroAdapter(@NotNull Context context, @NotNull List<PaiIntro> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mDataList = dataList;
        this.mContext = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<PaiIntro> getMDataList() {
        return this.mDataList;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMDataList(@NotNull List<PaiIntro> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PaiIntroViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.mDataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PaiIntroViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(jui.n7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new PaiIntroViewHolder(viewInflate);
    }
}
