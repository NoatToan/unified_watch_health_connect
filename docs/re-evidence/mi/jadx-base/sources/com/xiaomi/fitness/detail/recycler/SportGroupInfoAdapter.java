package com.xiaomi.fitness.detail.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.model.GroupInfoViewModel;
import defpackage.bsi;
import defpackage.byi;
import defpackage.ivi;
import defpackage.j1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003897B%\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b5\u00106J\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u0019R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\rR\"\u00102\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\r¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportGroupInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "getItemViewType", "(I)I", "", "isHeaderView", "(I)Z", "count", "", "setFooterViewCount", "(I)V", "notifyDataChanged", "()V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getContentItemCount", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "", "Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "mType", "I", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "mHeaderCount", "getMHeaderCount", "setMHeaderCount", "mFooterCount", "getMFooterCount", "setMFooterCount", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "Companion", "HeaderViewHolder", "ContentViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportGroupInfoAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    protected static final int ITEM_TYPE_CONTENT = 1;
    protected static final int ITEM_TYPE_FOOTER = 102;
    protected static final int ITEM_TYPE_HEADER = 101;

    @NotNull
    private Context mContext;

    @NotNull
    private List<GroupInfoViewModel> mDataList;
    private int mFooterCount;
    private int mHeaderCount;

    @NotNull
    private final LayoutInflater mLayoutInflater;
    private final int mType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportGroupInfoAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/content/Context;", "context", "Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;", "model", "", "bindData", "(Landroid/content/Context;Lcom/xiaomi/fitness/detail/model/GroupInfoViewModel;)V", "Landroid/widget/TextView;", "txtInfoName", "Landroid/widget/TextView;", "getTxtInfoName", "()Landroid/widget/TextView;", "setTxtInfoName", "(Landroid/widget/TextView;)V", "txtDuration", "getTxtDuration", "setTxtDuration", "txtAvgHrm", "getTxtAvgHrm", "setTxtAvgHrm", "txtCalories", "getTxtCalories", "setTxtCalories", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportGroupInfoAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ContentViewHolder extends RecyclerView.d0 {
        final /* synthetic */ SportGroupInfoAdapter this$0;

        @NotNull
        private TextView txtAvgHrm;

        @NotNull
        private TextView txtCalories;

        @NotNull
        private TextView txtDuration;

        @NotNull
        private TextView txtInfoName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull SportGroupInfoAdapter sportGroupInfoAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportGroupInfoAdapter;
            this.txtInfoName = (TextView) itemView.findViewById(bsi.K8);
            this.txtDuration = (TextView) itemView.findViewById(bsi.B8);
            this.txtAvgHrm = (TextView) itemView.findViewById(bsi.v8);
            this.txtCalories = (TextView) itemView.findViewById(bsi.x8);
        }

        public final void bindData(@NotNull Context context, @NotNull GroupInfoViewModel model) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(model, "model");
            this.txtInfoName.setText(model.getInfoName());
            this.txtDuration.setText(TimeDateUtil.getTimeStrWithSecDef(model.getTime()));
            if (model.getThirdColumnValue() < 0) {
                this.txtAvgHrm.setText("--");
            } else {
                this.txtAvgHrm.setText(Integer.toString(model.getThirdColumnValue()));
            }
            String quantityString = context.getResources().getQuantityString(byi.common_unit_calorie_desc, model.getCalories(), Integer.valueOf(model.getCalories()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            this.txtCalories.setText(quantityString);
        }

        @NotNull
        public final TextView getTxtAvgHrm() {
            return this.txtAvgHrm;
        }

        @NotNull
        public final TextView getTxtCalories() {
            return this.txtCalories;
        }

        @NotNull
        public final TextView getTxtDuration() {
            return this.txtDuration;
        }

        @NotNull
        public final TextView getTxtInfoName() {
            return this.txtInfoName;
        }

        public final void setTxtAvgHrm(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtAvgHrm = textView;
        }

        public final void setTxtCalories(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtCalories = textView;
        }

        public final void setTxtDuration(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtDuration = textView;
        }

        public final void setTxtInfoName(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtInfoName = textView;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportGroupInfoAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/widget/TextView;", "title3", "Landroid/widget/TextView;", "getTitle3", "()Landroid/widget/TextView;", "setTitle3", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportGroupInfoAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HeaderViewHolder extends RecyclerView.d0 {
        final /* synthetic */ SportGroupInfoAdapter this$0;

        @NotNull
        private TextView title3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull SportGroupInfoAdapter sportGroupInfoAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportGroupInfoAdapter;
            this.title3 = (TextView) itemView.findViewById(bsi.t9);
        }

        public final void bindData() {
            if (this.this$0.mType == 14) {
                this.title3.setText(this.this$0.getMContext().getString(j1j.o7));
            } else if (this.this$0.mType == 13) {
                this.title3.setText(this.this$0.getMContext().getString(j1j.U6));
            } else {
                this.title3.setText(this.this$0.getMContext().getString(j1j.X4));
            }
        }

        @NotNull
        public final TextView getTitle3() {
            return this.title3;
        }

        public final void setTitle3(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.title3 = textView;
        }
    }

    public SportGroupInfoAdapter(@NotNull Context mContext, @NotNull List<GroupInfoViewModel> mDataList, int i) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.mType = i;
        this.mHeaderCount = 1;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    public final int getContentItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mHeaderCount + getContentItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int i = this.mHeaderCount;
        if (i == 0 || position >= i) {
            return (this.mFooterCount == 0 || position < i + getContentItemCount()) ? 1 : 102;
        }
        return 101;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<GroupInfoViewModel> getMDataList() {
        return this.mDataList;
    }

    public final int getMFooterCount() {
        return this.mFooterCount;
    }

    public final int getMHeaderCount() {
        return this.mHeaderCount;
    }

    public final boolean isHeaderView(int position) {
        int i = this.mHeaderCount;
        return i != 0 && position < i;
    }

    public final void notifyDataChanged() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (!(viewHolder instanceof ContentViewHolder)) {
            if (viewHolder instanceof HeaderViewHolder) {
                ((HeaderViewHolder) viewHolder).bindData();
            }
        } else {
            GroupInfoViewModel groupInfoViewModel = this.mDataList.get(position - this.mHeaderCount);
            if (groupInfoViewModel != null) {
                ((ContentViewHolder) viewHolder).bindData(this.mContext, groupInfoViewModel);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 101) {
            View viewInflate = this.mLayoutInflater.inflate(ivi.I0, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HeaderViewHolder(this, viewInflate);
        }
        View viewInflate2 = this.mLayoutInflater.inflate(ivi.H0, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ContentViewHolder(this, viewInflate2);
    }

    public final void setFooterViewCount(int count) {
        this.mFooterCount = count;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMDataList(@NotNull List<GroupInfoViewModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMFooterCount(int i) {
        this.mFooterCount = i;
    }

    public final void setMHeaderCount(int i) {
        this.mHeaderCount = i;
    }
}
