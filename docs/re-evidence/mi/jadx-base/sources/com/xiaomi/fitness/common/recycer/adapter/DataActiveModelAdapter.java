package com.xiaomi.fitness.common.recycer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.recycer.adapter.DataActiveModelAdapter;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.model.DataActiveModel;
import defpackage.a9h;
import defpackage.c0j;
import defpackage.d64;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003AB@B\u001f\b\u0016\u0012\u0006\u0010:\u001a\u00020(\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b<\u0010=B1\b\u0016\u0012\u0006\u0010:\u001a\u00020(\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u0010>\u001a\u00020\u0003¢\u0006\u0004\b<\u0010?J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010#¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bottomCount", "", "setBottomCount", "(I)V", "headerCount", "setHeaderCount", "titleResId", "setHeaderViewTitle", "arrowVisibility", "setHeaderArrowVisibility", "setArrowVisibility", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "isHeaderView", "(I)Z", "getContentItemCount", "La9h;", "onLoadMoreListener", "addOnLoadMoreListener", "(La9h;)V", "", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "mDataList", "Ljava/util/List;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mHeaderCount", "I", "mBottomCount", "", "headerTitle", "Ljava/lang/String;", "headerImgResId", "headerArrowVisibility", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "La9h;", "getOnLoadMoreListener", "()La9h;", "setOnLoadMoreListener", "context", "dataList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "headerImageResId", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;I)V", "Companion", "BottomViewHolder", "ActiveModelViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DataActiveModelAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    private static final int ITEM_TYPE_BOTTOM = 102;
    public static final int ITEM_TYPE_CONTENT = 1;
    public static final int ITEM_TYPE_HEADER = 101;
    private int arrowVisibility;
    private int headerArrowVisibility;
    private int headerImgResId;

    @Nullable
    private String headerTitle;
    private int mBottomCount;

    @NotNull
    private Context mContext;

    @NotNull
    private List<DataActiveModel> mDataList;
    private int mHeaderCount;

    @NotNull
    private LayoutInflater mLayoutInflater;

    @Nullable
    private a9h onLoadMoreListener;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter$ActiveModelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/data/model/DataActiveModel;", "dataActiveModel", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/data/model/DataActiveModel;I)V", "Landroid/widget/TextView;", "recordDateView", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "modelImgView", "Landroid/widget/ImageView;", "modelTitleView", "modelDescView", "Landroid/view/View;", "lineTop", "Landroid/view/View;", "lineBottom", "itemView", "<init>", "(Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ActiveModelViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View lineBottom;

        @NotNull
        private final View lineTop;

        @NotNull
        private final TextView modelDescView;

        @NotNull
        private final ImageView modelImgView;

        @NotNull
        private final TextView modelTitleView;

        @NotNull
        private final TextView recordDateView;
        final /* synthetic */ DataActiveModelAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActiveModelViewHolder(@NotNull DataActiveModelAdapter dataActiveModelAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = dataActiveModelAdapter;
            this.recordDateView = (TextView) itemView.findViewById(eri.Ln);
            this.modelImgView = (ImageView) itemView.findViewById(eri.s7);
            this.modelTitleView = (TextView) itemView.findViewById(eri.Nn);
            this.modelDescView = (TextView) itemView.findViewById(eri.Mn);
            this.lineTop = itemView.findViewById(eri.Ha);
            this.lineBottom = itemView.findViewById(eri.Ba);
        }

        public final void bindData(@NotNull DataActiveModel dataActiveModel, int position) {
            Intrinsics.checkNotNullParameter(dataActiveModel, "dataActiveModel");
            if (dataActiveModel.isDayFirstData) {
                this.recordDateView.setVisibility(0);
                this.recordDateView.setText(this.this$0.mContext.getString(c0j.F6, TimeDateUtil.getDateMMddFormat(TimeDateUtil.timestampToLocalDate(dataActiveModel.startTime))));
            } else {
                this.recordDateView.setVisibility(8);
            }
            this.modelImgView.setImageResource(dataActiveModel.getImgResource());
            this.modelTitleView.setText(dataActiveModel.getTitleStr());
            this.modelDescView.setText(dataActiveModel.getDescStr(this.this$0.mContext));
            if (position - this.this$0.mHeaderCount == 0 || dataActiveModel.isDayFirstData) {
                this.lineTop.setVisibility(4);
            } else {
                this.lineTop.setVisibility(0);
            }
            if (position == (this.this$0.getCount() - this.this$0.mBottomCount) - 1 || dataActiveModel.isDayEndData) {
                this.lineBottom.setVisibility(4);
            } else {
                this.lineBottom.setVisibility(0);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter$BottomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/widget/TextView;", "txtBtn", "Landroid/widget/TextView;", "getTxtBtn", "()Landroid/widget/TextView;", "setTxtBtn", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "itemView", "<init>", "(Lcom/xiaomi/fitness/common/recycer/adapter/DataActiveModelAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class BottomViewHolder extends RecyclerView.d0 {

        @NotNull
        private View contentView;
        final /* synthetic */ DataActiveModelAdapter this$0;

        @NotNull
        private TextView txtBtn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomViewHolder(@NotNull DataActiveModelAdapter dataActiveModelAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = dataActiveModelAdapter;
            this.txtBtn = (TextView) itemView.findViewById(eri.Yn);
            this.contentView = itemView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(DataActiveModelAdapter this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.getOnLoadMoreListener() != null) {
                a9h onLoadMoreListener = this$0.getOnLoadMoreListener();
                Intrinsics.checkNotNull(onLoadMoreListener);
                onLoadMoreListener.onLoadMore();
            }
        }

        public final void bindData() {
            TextView textView = this.txtBtn;
            final DataActiveModelAdapter dataActiveModelAdapter = this.this$0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: pk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataActiveModelAdapter.BottomViewHolder.bindData$lambda$0(dataActiveModelAdapter, view);
                }
            });
        }

        @NotNull
        public final View getContentView() {
            return this.contentView;
        }

        @NotNull
        public final TextView getTxtBtn() {
            return this.txtBtn;
        }

        public final void setContentView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.contentView = view;
        }

        public final void setTxtBtn(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.txtBtn = textView;
        }
    }

    public DataActiveModelAdapter(@NotNull Context context, @NotNull List<DataActiveModel> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mBottomCount = 1;
        this.headerImgResId = -1;
        this.headerArrowVisibility = 8;
        this.mContext = context;
        this.mDataList = dataList;
        this.mHeaderCount = 0;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    public final void addOnLoadMoreListener(@Nullable a9h onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }

    public final int getContentItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mHeaderCount + getContentItemCount() + this.mBottomCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int contentItemCount = getContentItemCount();
        int i = this.mHeaderCount;
        if (i == 0 || position >= i) {
            return (this.mBottomCount == 0 || position < i + contentItemCount) ? 1 : 102;
        }
        return 101;
    }

    @Nullable
    public final a9h getOnLoadMoreListener() {
        return this.onLoadMoreListener;
    }

    public final boolean isHeaderView(int position) {
        int i = this.mHeaderCount;
        return i != 0 && position < i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof d64) {
            ((d64) viewHolder).a(this.headerImgResId, this.headerTitle, this.headerArrowVisibility);
            return;
        }
        if (!(viewHolder instanceof ActiveModelViewHolder)) {
            if (viewHolder instanceof BottomViewHolder) {
                ((BottomViewHolder) viewHolder).bindData();
            }
        } else {
            DataActiveModel dataActiveModel = this.mDataList.get(position - this.mHeaderCount);
            if (dataActiveModel != null) {
                ((ActiveModelViewHolder) viewHolder).bindData(dataActiveModel, position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 101) {
            return new d64(this.mLayoutInflater.inflate(jui.R6, parent, false));
        }
        if (viewType != 102) {
            View viewInflate = this.mLayoutInflater.inflate(jui.x6, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new ActiveModelViewHolder(this, viewInflate);
        }
        View viewInflate2 = this.mLayoutInflater.inflate(jui.S7, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new BottomViewHolder(this, viewInflate2);
    }

    public final void setArrowVisibility(int arrowVisibility) {
        this.arrowVisibility = arrowVisibility;
    }

    public final void setBottomCount(int bottomCount) {
        this.mBottomCount = bottomCount;
        notifyDataSetChanged();
    }

    public final void setHeaderArrowVisibility(int arrowVisibility) {
        this.headerArrowVisibility = arrowVisibility;
    }

    public final void setHeaderCount(int headerCount) {
        this.mHeaderCount = headerCount;
    }

    public final void setHeaderViewTitle(int titleResId) {
        this.headerTitle = this.mContext.getString(titleResId);
    }

    public final void setOnLoadMoreListener(@Nullable a9h a9hVar) {
        this.onLoadMoreListener = a9hVar;
    }

    public DataActiveModelAdapter(@NotNull Context context, @NotNull List<DataActiveModel> dataList, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mHeaderCount = 1;
        this.mBottomCount = 1;
        this.headerArrowVisibility = 8;
        this.mContext = context;
        this.mDataList = dataList;
        this.headerTitle = str;
        this.headerImgResId = i;
        this.mLayoutInflater = LayoutInflater.from(context);
    }
}
