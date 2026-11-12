package com.xiaomi.wearable.data.sportmodel.detail.recycler;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.model.SportFeedbackLabelModel;
import com.xiaomi.wearable.data.sportmodel.detail.recycler.SportFeedbackLabelAdapter;
import defpackage.bsi;
import defpackage.ivi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter$LabelViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/detail/model/SportFeedbackLabelModel;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "LabelViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportFeedbackLabelAdapter extends RecyclerView.Adapter<LabelViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private final List<SportFeedbackLabelModel> dataList;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/detail/model/SportFeedbackLabelModel;", "dataList", "", "position", "", "bindData", "(Ljava/util/List;I)V", "", "selected", "validThreeMore", "(Ljava/util/List;Z)Z", "Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/CheckBox;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSportFeedbackLabelAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportFeedbackLabelAdapter.kt\ncom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter$LabelViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n774#2:69\n865#2,2:70\n*S KotlinDebug\n*F\n+ 1 SportFeedbackLabelAdapter.kt\ncom/xiaomi/wearable/data/sportmodel/detail/recycler/SportFeedbackLabelAdapter$LabelViewHolder\n*L\n55#1:69\n55#1:70,2\n*E\n"})
    public static final class LabelViewHolder extends RecyclerView.d0 {

        @NotNull
        private final CheckBox checkBox;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(bsi.F);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.checkBox = (CheckBox) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void bindData$lambda$0(Ref.ObjectRef labelModel, LabelViewHolder this$0, List dataList, View view) {
            Intrinsics.checkNotNullParameter(labelModel, "$labelModel");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dataList, "$dataList");
            boolean selected = ((SportFeedbackLabelModel) labelModel.element).getSelected();
            if (this$0.validThreeMore(dataList, selected)) {
                this$0.checkBox.setChecked(false);
            } else {
                ((SportFeedbackLabelModel) labelModel.element).setSelected(!selected);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        public final void bindData(@NotNull final List<SportFeedbackLabelModel> dataList, int position) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? r4 = dataList.get(position);
            objectRef.element = r4;
            if (!TextUtils.isEmpty(((SportFeedbackLabelModel) r4).getLabelStr())) {
                this.checkBox.setText(((SportFeedbackLabelModel) objectRef.element).getLabelStr());
            }
            this.checkBox.setChecked(((SportFeedbackLabelModel) objectRef.element).getSelected());
            this.checkBox.setOnClickListener(new View.OnClickListener() { // from class: lln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SportFeedbackLabelAdapter.LabelViewHolder.bindData$lambda$0(objectRef, this, dataList, view);
                }
            });
        }

        public final boolean validThreeMore(@NotNull List<SportFeedbackLabelModel> dataList, boolean selected) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            if (!selected) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : dataList) {
                    if (((SportFeedbackLabelModel) obj).getSelected()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() >= 3) {
                    return true;
                }
            }
            return false;
        }
    }

    public SportFeedbackLabelAdapter(@NotNull Context context, @NotNull List<SportFeedbackLabelModel> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<SportFeedbackLabelModel> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LabelViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LabelViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(ivi.Q0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new LabelViewHolder(viewInflate);
    }
}
