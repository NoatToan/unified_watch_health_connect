package com.xiaomi.fitness.feedback.bugreport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.cri;
import defpackage.hui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u00018B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\fJ\u0014\u0010)\u001a\u00020'2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130*J\u0016\u0010+\u001a\u00020'2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010*J\u001c\u0010,\u001a\u00060\u0002R\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001c\u00101\u001a\u00020'2\n\u00102\u001a\u00060\u0002R\u00020\u00002\u0006\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u00106\u001a\u000207H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0014j\b\u0012\u0004\u0012\u00020\u0013`\u0012¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0014j\b\u0012\u0004\u0012\u00020\u0019`\u0012¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\"\"\u0004\b%\u0010$¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter$TypeHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "isSubTYpe", "", "isHideArrow", "<init>", "(Landroid/content/Context;ZZ)V", "mListener", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;", "getMListener", "()Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;", "setMListener", "(Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;)V", "mainTypeData", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "Ljava/util/ArrayList;", "getMainTypeData", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "subTypeData", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType$SubTypeItem;", "getSubTypeData", "mInflater", "Landroid/view/LayoutInflater;", "getMInflater", "()Landroid/view/LayoutInflater;", "setMInflater", "(Landroid/view/LayoutInflater;)V", "isSubType", "()Z", "setSubType", "(Z)V", "setHideArrow", "setOnItemClickCallBack", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateData", "", "updateSubData", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "holder", "pos", "getItemCount", "onClick", "v", "Landroid/view/View;", "TypeHolder", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackTypesAdapter extends RecyclerView.Adapter<TypeHolder> implements View.OnClickListener {
    private boolean isHideArrow;
    private boolean isSubType;

    @Nullable
    private LayoutInflater mInflater;

    @Nullable
    private OnItemClickCallBack mListener;

    @NotNull
    private final ArrayList<FeedBackModelData.FeedBackType> mainTypeData = new ArrayList<>();

    @NotNull
    private final ArrayList<FeedBackModelData.FeedBackType.SubTypeItem> subTypeData = new ArrayList<>();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter$TypeHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "", "bindData", "(Ljava/lang/Object;)V", "Landroid/widget/TextView;", "typeNameTV", "Landroid/widget/TextView;", "getTypeNameTV", "()Landroid/widget/TextView;", "setTypeNameTV", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "rightArrow", "Landroid/widget/ImageView;", "getRightArrow", "()Landroid/widget/ImageView;", "setRightArrow", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/feedback/bugreport/FeedbackTypesAdapter;Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TypeHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView rightArrow;
        final /* synthetic */ FeedbackTypesAdapter this$0;

        @NotNull
        private TextView typeNameTV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeHolder(@NotNull FeedbackTypesAdapter feedbackTypesAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = feedbackTypesAdapter;
            this.typeNameTV = (TextView) itemView.findViewById(cri.common_item_name_tv);
            this.rightArrow = (ImageView) itemView.findViewById(cri.B);
        }

        public final void bindData(@Nullable Object o) {
            this.itemView.setTag(o);
            if (o instanceof FeedBackModelData.FeedBackType) {
                this.typeNameTV.setText(((FeedBackModelData.FeedBackType) o).getWideTagContent());
            } else if (o instanceof FeedBackModelData.FeedBackType.SubTypeItem) {
                this.typeNameTV.setText(((FeedBackModelData.FeedBackType.SubTypeItem) o).getShowContent());
            }
            if (this.this$0.getIsHideArrow()) {
                this.rightArrow.setVisibility(8);
            } else {
                this.rightArrow.setVisibility(0);
            }
        }

        @NotNull
        public final ImageView getRightArrow() {
            return this.rightArrow;
        }

        @NotNull
        public final TextView getTypeNameTV() {
            return this.typeNameTV;
        }

        public final void setRightArrow(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.rightArrow = imageView;
        }

        public final void setTypeNameTV(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.typeNameTV = textView;
        }
    }

    public FeedbackTypesAdapter(@Nullable Context context, boolean z, boolean z2) {
        this.mInflater = LayoutInflater.from(context);
        this.isSubType = z;
        this.isHideArrow = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return (this.isSubType ? this.subTypeData : this.mainTypeData).size();
    }

    @Nullable
    public final LayoutInflater getMInflater() {
        return this.mInflater;
    }

    @Nullable
    public final OnItemClickCallBack getMListener() {
        return this.mListener;
    }

    @NotNull
    public final ArrayList<FeedBackModelData.FeedBackType> getMainTypeData() {
        return this.mainTypeData;
    }

    @NotNull
    public final ArrayList<FeedBackModelData.FeedBackType.SubTypeItem> getSubTypeData() {
        return this.subTypeData;
    }

    /* JADX INFO: renamed from: isHideArrow, reason: from getter */
    public final boolean getIsHideArrow() {
        return this.isHideArrow;
    }

    /* JADX INFO: renamed from: isSubType, reason: from getter */
    public final boolean getIsSubType() {
        return this.isSubType;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OnItemClickCallBack onItemClickCallBack = this.mListener;
        Intrinsics.checkNotNull(onItemClickCallBack);
        onItemClickCallBack.onItemClick(v, v.getTag());
    }

    public final void setHideArrow(boolean z) {
        this.isHideArrow = z;
    }

    public final void setMInflater(@Nullable LayoutInflater layoutInflater) {
        this.mInflater = layoutInflater;
    }

    public final void setMListener(@Nullable OnItemClickCallBack onItemClickCallBack) {
        this.mListener = onItemClickCallBack;
    }

    public final void setOnItemClickCallBack(@Nullable OnItemClickCallBack listener) {
        this.mListener = listener;
    }

    public final void setSubType(boolean z) {
        this.isSubType = z;
    }

    public final void updateData(@NotNull List<FeedBackModelData.FeedBackType> mainTypeData) {
        Intrinsics.checkNotNullParameter(mainTypeData, "mainTypeData");
        this.mainTypeData.clear();
        this.mainTypeData.addAll(mainTypeData);
        notifyDataSetChanged();
    }

    public final void updateSubData(@Nullable List<FeedBackModelData.FeedBackType.SubTypeItem> subTypeData) {
        if (subTypeData != null) {
            this.subTypeData.clear();
            this.subTypeData.addAll(subTypeData);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TypeHolder holder, int pos) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.isSubType) {
            holder.bindData(this.subTypeData.get(pos));
        } else {
            holder.bindData(this.mainTypeData.get(pos));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TypeHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = this.mInflater;
        Intrinsics.checkNotNull(layoutInflater);
        View viewInflate = layoutInflater.inflate(hui.i, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setOnClickListener(this);
        return new TypeHolder(this, viewInflate);
    }
}
