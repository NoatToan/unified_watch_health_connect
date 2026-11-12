package com.xiaomi.fitness.detail.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.detail.view.SportValueNameUnitView;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import defpackage.bsi;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003231B\u001d\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getContentItemCount", "getItemViewType", "(I)I", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "getItemAsPosition", "(I)Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "setMDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "mLevelItems", "getMLevelItems", "setMLevelItems", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "getMLayoutInflater", "()Landroid/view/LayoutInflater;", "setMLayoutInflater", "(Landroid/view/LayoutInflater;)V", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "HeaderViewHolder", "ContentViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportBehaviorTitleAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_COMMON = 0;
    public static final int ITEM_TYPE_HEAD = 2;
    public static final int ITEM_TYPE_LEVEL = 1;
    public static final int SPAN_COUNT_THREE = 3;
    public static final int SPAN_COUNT_TWO = 2;

    @NotNull
    private static final String TAG = "SportBehaviorAdapter";

    @NotNull
    private Context mContext;

    @NotNull
    private List<? extends SportBehaviorModel> mDataList;

    @NotNull
    private LayoutInflater mLayoutInflater;

    @Nullable
    private List<? extends LevelBarView.LevelItem> mLevelItems;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;)V", "Landroid/widget/TextView;", "valueText", "Landroid/widget/TextView;", "getValueText", "()Landroid/widget/TextView;", "setValueText", "(Landroid/widget/TextView;)V", "unitText", "getUnitText", "setUnitText", "descText", "getDescText", "setDescText", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ContentViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView descText;
        final /* synthetic */ SportBehaviorTitleAdapter this$0;

        @NotNull
        private TextView unitText;

        @NotNull
        private TextView valueText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(@NotNull SportBehaviorTitleAdapter sportBehaviorTitleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportBehaviorTitleAdapter;
            this.valueText = (TextView) itemView.findViewById(bsi.L9);
            this.unitText = (TextView) itemView.findViewById(bsi.K9);
            this.descText = (TextView) itemView.findViewById(bsi.j9);
        }

        public final void bindData(@NotNull SportBehaviorModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.valueText.setText(model.e);
            this.unitText.setText(model.f);
            this.descText.setText(model.g);
        }

        @NotNull
        public final TextView getDescText() {
            return this.descText;
        }

        @NotNull
        public final TextView getUnitText() {
            return this.unitText;
        }

        @NotNull
        public final TextView getValueText() {
            return this.valueText;
        }

        public final void setDescText(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.descText = textView;
        }

        public final void setUnitText(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.unitText = textView;
        }

        public final void setValueText(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.valueText = textView;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;", "model", "", "bindData", "(Lcom/xiaomi/fitness/summary/recycler/SportBehaviorModel;)V", "Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "valueUnitView", "Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "getValueUnitView", "()Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;", "setValueUnitView", "(Lcom/xiaomi/fitness/detail/view/SportValueNameUnitView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/recycler/SportBehaviorTitleAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HeaderViewHolder extends RecyclerView.d0 {
        final /* synthetic */ SportBehaviorTitleAdapter this$0;

        @Nullable
        private SportValueNameUnitView valueUnitView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull SportBehaviorTitleAdapter sportBehaviorTitleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sportBehaviorTitleAdapter;
        }

        public final void bindData(@Nullable SportBehaviorModel model) {
            SportValueNameUnitView sportValueNameUnitView = this.valueUnitView;
            Intrinsics.checkNotNull(sportValueNameUnitView);
            Intrinsics.checkNotNull(model);
            SportValueNameUnitView.bindData$default(sportValueNameUnitView, model, null, 2, null);
        }

        @Nullable
        public final SportValueNameUnitView getValueUnitView() {
            return this.valueUnitView;
        }

        public final void setValueUnitView(@Nullable SportValueNameUnitView sportValueNameUnitView) {
            this.valueUnitView = sportValueNameUnitView;
        }
    }

    public SportBehaviorTitleAdapter(@NotNull Context mContext, @NotNull List<? extends SportBehaviorModel> mDataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    public final int getContentItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final SportBehaviorModel getItemAsPosition(int position) {
        return this.mDataList.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return getContentItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<SportBehaviorModel> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final LayoutInflater getMLayoutInflater() {
        return this.mLayoutInflater;
    }

    @Nullable
    public final List<LevelBarView.LevelItem> getMLevelItems() {
        return this.mLevelItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 viewHolder, int position) {
        SportBehaviorModel itemAsPosition;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if ((viewHolder instanceof HeaderViewHolder) || !(viewHolder instanceof ContentViewHolder) || (itemAsPosition = getItemAsPosition(position - 1)) == null) {
            return;
        }
        ((ContentViewHolder) viewHolder).bindData(itemAsPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = this.mLayoutInflater.inflate(ivi.v0, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new HeaderViewHolder(this, viewInflate);
        }
        View viewInflate2 = this.mLayoutInflater.inflate(ivi.l2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new ContentViewHolder(this, viewInflate2);
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMDataList(@NotNull List<? extends SportBehaviorModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMLayoutInflater(@NotNull LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<set-?>");
        this.mLayoutInflater = layoutInflater;
    }

    public final void setMLevelItems(@Nullable List<? extends LevelBarView.LevelItem> list) {
        this.mLevelItems = list;
    }
}
