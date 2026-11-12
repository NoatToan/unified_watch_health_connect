package com.xiaomi.fitness.sport.sporttab.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import com.xiaomi.fitness.sport.sporttab.recycler.TrainingIndicatorAdapterGrid;
import com.xiaomi.fitness.sport_export.utils.OneTrackExtKt;
import defpackage.aki;
import defpackage.dvi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterGrid;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "modelList", "", "refreshData", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "contextFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "getContextFragment", "()Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "", "mModelList", "Ljava/util/List;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;)V", "Companion", "ItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainingIndicatorAdapterGrid extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int DATA_EXIST = 1;
    public static final int NO_DATA = 0;

    @NotNull
    public static final String TAG = "TrainingIndicatorAdapterGrid";

    @NotNull
    private final BaseFragment contextFragment;

    @NotNull
    private final List<TrainingIndexDataItem> mModelList;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterGrid$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "model", "", "bindData", "(Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;)V", "Landroid/widget/TextView;", "trainingIndicatorTv", "Landroid/widget/TextView;", "latestDataTv", "guideTv", "desTv", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "levelBarView", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView;", "startLevelDes", "endLevelDes", "Landroid/widget/ImageView;", "noDataLevelBar", "Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/TrainingIndicatorAdapterGrid;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView desTv;

        @NotNull
        private final TextView endLevelDes;

        @NotNull
        private final TextView guideTv;

        @NotNull
        private final TextView latestDataTv;

        @NotNull
        private final LevelBarView levelBarView;

        @NotNull
        private final ImageView noDataLevelBar;

        @NotNull
        private final TextView startLevelDes;
        final /* synthetic */ TrainingIndicatorAdapterGrid this$0;

        @NotNull
        private final TextView trainingIndicatorTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull TrainingIndicatorAdapterGrid trainingIndicatorAdapterGrid, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = trainingIndicatorAdapterGrid;
            View viewFindViewById = itemView.findViewById(xri.Q7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.trainingIndicatorTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.Y2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.latestDataTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(xri.e2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.guideTv = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(xri.g1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.desTv = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(xri.f3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.levelBarView = (LevelBarView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(xri.start_level_des);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.startLevelDes = (TextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(xri.E1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.endLevelDes = (TextView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(xri.X3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.noDataLevelBar = (ImageView) viewFindViewById8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(TrainingIndicatorAdapterGrid this$0, TrainingIndexDataItem model, TextView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(model, "$model");
            Intrinsics.checkNotNullParameter(it, "it");
            HealthPageExtKt.getInstance(IHealthPage.INSTANCE).goToTrainingIndexUnderstandPage(this$0.getContextFragment(), model.getHomeDataType());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$1(TrainingIndexDataItem model, ItemViewHolder this$0, boolean z, View it) {
            Intrinsics.checkNotNullParameter(model, "$model");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            long timestamp = model.getTimestamp();
            String did = model.getDid();
            Context context = this$0.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            healthPageExtKt.goToTrainingIndexDataPage(timestamp, did, context, model.getHomeDataType(), null);
            OneTrackExtKt.oneTrackOnClick(model.getHomeDataType(), !z ? 1 : 0);
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final TrainingIndexDataItem model) {
            int i;
            Intrinsics.checkNotNullParameter(model, "model");
            this.trainingIndicatorTv.setText(model.getTitle());
            final boolean noData = model.getNoData();
            Logger.i(TrainingIndicatorAdapterGrid.TAG, "bindModel model=" + model);
            if (noData) {
                i = aki.B;
                ViewExtKt.gone(this.desTv);
                TextView textView = this.guideTv;
                final TrainingIndicatorAdapterGrid trainingIndicatorAdapterGrid = this.this$0;
                ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: htp
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return TrainingIndicatorAdapterGrid.ItemViewHolder.bindData$lambda$0(trainingIndicatorAdapterGrid, model, (TextView) obj);
                    }
                }, 1, null);
            } else {
                i = aki.C;
                ViewExtKt.visible(this.desTv);
                this.desTv.setText(model.getDes());
                this.levelBarView.setLevels(model.getLevelItems());
                ViewExtKt.gone(this.guideTv);
                if (model.getArrowPosition() >= 0) {
                    this.levelBarView.setLevel(model.getArrowPosition());
                }
            }
            ViewExtKt.clickWithTrigger$default(this.itemView, 0L, new Function1() { // from class: itp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TrainingIndicatorAdapterGrid.ItemViewHolder.bindData$lambda$1(model, this, noData, (View) obj);
                }
            }, 1, null);
            ViewExtKt.setVisible(this.guideTv, noData);
            if (noData) {
                this.guideTv.setText(model.getNoDataGuideStr());
            }
            ViewExtKt.setVisible(this.levelBarView, !noData);
            ViewExtKt.setVisible(this.noDataLevelBar, noData);
            ViewExtKt.setVisible(this.latestDataTv, !noData);
            this.startLevelDes.setTextColor(ApplicationExtKt.getApplication().getResources().getColor(i, null));
            this.endLevelDes.setTextColor(ApplicationExtKt.getApplication().getResources().getColor(i, null));
            this.startLevelDes.setText(model.getStartLevelName());
            this.endLevelDes.setText(model.getEndLevelName());
            this.latestDataTv.setText(model.getValue());
        }
    }

    public TrainingIndicatorAdapterGrid(@NotNull BaseFragment contextFragment) {
        Intrinsics.checkNotNullParameter(contextFragment, "contextFragment");
        this.contextFragment = contextFragment;
        this.mModelList = new ArrayList();
    }

    @NotNull
    public final BaseFragment getContextFragment() {
        return this.contextFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bindData(this.mModelList.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Logger.d(TAG, "onCreateViewHolder cardSize=" + this.mModelList.size());
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.n1, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void refreshData(@NotNull List<TrainingIndexDataItem> modelList) {
        Intrinsics.checkNotNullParameter(modelList, "modelList");
        Logger.d(TAG, "refreshData modelListSize=" + modelList.size());
        this.mModelList.clear();
        this.mModelList.addAll(modelList);
        notifyDataSetChanged();
    }
}
