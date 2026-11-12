package com.xiaomi.fitness.v2;

import android.app.ActivityOptions;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener;
import com.xiaomi.fitness.v2.holder.BarChartContentViewHolderV2;
import com.xiaomi.fitness.v2.holder.BloodGlucoseChartViewHolder;
import com.xiaomi.fitness.v2.holder.BottomViewHolderV2;
import com.xiaomi.fitness.v2.holder.HealthIndicatorCardViewHolder;
import com.xiaomi.fitness.v2.holder.LineCharContentViewHolderV2;
import com.xiaomi.fitness.v2.holder.TodayHealthViewHolder;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import defpackage.c0c;
import defpackage.iji;
import defpackage.jui;
import defpackage.km5;
import defpackage.nf2;
import defpackage.o7e;
import defpackage.oxb;
import defpackage.s7e;
import defpackage.sxb;
import defpackage.u7e;
import defpackage.w7e;
import defpackage.zr3;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002MNB5\u0012\u0006\u00109\u001a\u000208\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bK\u0010LJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010%\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b*\u0010&J\u0015\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b+\u0010 J\u0017\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b/\u0010 J\u0017\u00102\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010J¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/v2/HealthAdapterV2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lnf2;", "Lkm5;", "dataModel", "viewHolder", "", "hasData", "", "setClickListener", "(Lkm5;Lnf2;Z)V", "", "position", "attachExposeTagToHealthCard", "(Lnf2;Lkm5;IZ)V", "attachClickTagToHealthCard", "(Lkm5;IZ)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lnf2;", "holder", "", "", "payloads", "onBindViewHolder", "(Lnf2;ILjava/util/List;)V", "(Lnf2;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "getItemId", "(I)J", "getContentItemCount", "isHeaderView", "(I)Z", "bottomCount", "setBottomCount", "(I)V", "isBottomView", "getItemType", "getItemAsPosition", "(I)Lkm5;", "i", "getItemPosition", "Lcom/xiaomi/fitness/v2/HealthAdapterV2$OnGoPageClickListener;", "onGoPageClickListener", "setOnGoPageClickListener", "(Lcom/xiaomi/fitness/v2/HealthAdapterV2$OnGoPageClickListener;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "mDataList", "Ljava/util/List;", "Landroidx/lifecycle/LifecycleOwner;", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroid/view/LayoutInflater;", "mLayoutInflater", "Landroid/view/LayoutInflater;", "mHeaderCount", "I", "mBottomCount", "Lcom/xiaomi/fitness/v2/HealthAdapterV2$OnGoPageClickListener;", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;)V", "Companion", "OnGoPageClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthAdapterV2 extends RecyclerView.Adapter<nf2> {
    private static final int ITEM_TYPE_BOTTOM = 90001;
    private static final int ITEM_TYPE_HEADER = 90000;

    @NotNull
    public static final String TAG = "HealthAdapterV2";

    @Nullable
    private final HealthCheckViewModel healthCheckViewModel;
    private int mBottomCount;

    @NotNull
    private final Context mContext;

    @NotNull
    private final List<km5> mDataList;
    private final int mHeaderCount;

    @NotNull
    private final LayoutInflater mLayoutInflater;

    @Nullable
    private final LifecycleOwner mLifecycleOwner;

    @Nullable
    private OnGoPageClickListener onGoPageClickListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/v2/HealthAdapterV2$OnGoPageClickListener;", "", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "position", "Landroid/app/ActivityOptions;", "activityOptions", "", "onGoPage", "(Landroidx/recyclerview/widget/RecyclerView$d0;ILandroid/app/ActivityOptions;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public interface OnGoPageClickListener {
        void onGoPage(@NotNull RecyclerView.d0 viewHolder, int position, @Nullable ActivityOptions activityOptions);
    }

    public /* synthetic */ HealthAdapterV2(Context context, List list, LifecycleOwner lifecycleOwner, HealthCheckViewModel healthCheckViewModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : lifecycleOwner, (i & 8) != 0 ? null : healthCheckViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachClickTagToHealthCard(km5 dataModel, int position, boolean hasData) {
        Logger.d(TAG, "attachClickTagToHealthCard dataType=" + HealthTabOneTrackExtKt.getHealthDataTrackName(dataModel.f23979b) + " hasData=" + hasData + " ");
        HealthTabOneTrackExtKt.oneTrackOnDataCardClick(dataModel.f23979b, hasData, position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachExposeTagToHealthCard(nf2 viewHolder, km5 dataModel, int position, boolean hasData) {
        viewHolder.itemView.setTag(HealthTabOneTrackExtKt.buildHealthDataCardExposeTag(dataModel.f23979b, hasData, position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setClickListener(final km5 dataModel, final nf2 viewHolder, final boolean hasData) {
        final Context context = this.mContext;
        final View view = viewHolder.itemView;
        zr3 zr3Var = new zr3(context, view) { // from class: com.xiaomi.fitness.v2.HealthAdapterV2$setClickListener$zoomHelper$1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1 || this.isHeaderView(bindingAdapterPosition)) {
                    return;
                }
                HealthAdapterV2.OnGoPageClickListener onGoPageClickListener = this.onGoPageClickListener;
                if (onGoPageClickListener != null) {
                    onGoPageClickListener.onGoPage(viewHolder, bindingAdapterPosition, activityOptions);
                }
                this.attachClickTagToHealthCard(dataModel, bindingAdapterPosition, hasData);
            }
        };
        zr3Var.setRadius(ExtUtilsKt.getDp(16));
        zr3Var.setTransitionBgColorRes(iji.I2);
    }

    public static /* synthetic */ void setClickListener$default(HealthAdapterV2 healthAdapterV2, km5 km5Var, nf2 nf2Var, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        healthAdapterV2.setClickListener(km5Var, nf2Var, z);
    }

    public final int getContentItemCount() {
        return this.mDataList.size();
    }

    @Nullable
    public final km5 getItemAsPosition(int position) {
        if (isBottomView(position) || isHeaderView(position)) {
            return null;
        }
        return this.mDataList.get(position - this.mHeaderCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mHeaderCount + getContentItemCount() + this.mBottomCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public final int getItemPosition(int i) {
        return this.mHeaderCount + i;
    }

    public final int getItemType(int position) {
        km5 itemAsPosition = getItemAsPosition(position);
        Intrinsics.checkNotNull(itemAsPosition);
        return itemAsPosition.f23979b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int contentItemCount = getContentItemCount();
        int i = this.mHeaderCount;
        if (i == 0 || position >= i) {
            return (this.mBottomCount == 0 || position < contentItemCount + i) ? this.mDataList.get(position - i).f23979b : ITEM_TYPE_BOTTOM;
        }
        return ITEM_TYPE_HEADER;
    }

    public final boolean isBottomView(int position) {
        return this.mBottomCount != 0 && position >= this.mHeaderCount + getContentItemCount();
    }

    public final boolean isHeaderView(int position) {
        int i = this.mHeaderCount;
        return i != 0 && position < i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final nf2 viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof c0c) {
            km5 itemAsPosition = getItemAsPosition(((c0c) viewHolder).getBindingAdapterPosition());
            if (itemAsPosition == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition);
            ((c0c) viewHolder).bindData(this.mContext, itemAsPosition);
            setClickListener$default(this, itemAsPosition, viewHolder, false, 4, null);
            return;
        }
        if (viewHolder instanceof HealthIndicatorCardViewHolder) {
            final km5 itemAsPosition2 = getItemAsPosition(((HealthIndicatorCardViewHolder) viewHolder).getBindingAdapterPosition());
            if (itemAsPosition2 == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition2);
            viewHolder.onLoadDataListener = new OnLoadDataListener() { // from class: com.xiaomi.fitness.v2.HealthAdapterV2.onBindViewHolder.1
                @Override // com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener
                public void onLoadData(boolean hasData) {
                    int bindingAdapterPosition = ((HealthIndicatorCardViewHolder) viewHolder).getBindingAdapterPosition();
                    this.setClickListener(itemAsPosition2, viewHolder, hasData);
                    this.attachExposeTagToHealthCard(viewHolder, itemAsPosition2, bindingAdapterPosition, hasData);
                }
            };
            ((HealthIndicatorCardViewHolder) viewHolder).updateBindData(itemAsPosition2);
            return;
        }
        if (viewHolder instanceof BarChartContentViewHolderV2) {
            final km5 itemAsPosition3 = getItemAsPosition(((BarChartContentViewHolderV2) viewHolder).getBindingAdapterPosition());
            if (itemAsPosition3 == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition3);
            viewHolder.onLoadDataListener = new OnLoadDataListener() { // from class: com.xiaomi.fitness.v2.HealthAdapterV2.onBindViewHolder.2
                @Override // com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener
                public void onLoadData(boolean hasData) {
                    int bindingAdapterPosition = ((BarChartContentViewHolderV2) viewHolder).getBindingAdapterPosition();
                    this.setClickListener(itemAsPosition3, viewHolder, hasData);
                    this.attachExposeTagToHealthCard(viewHolder, itemAsPosition3, bindingAdapterPosition, hasData);
                }
            };
            ((BarChartContentViewHolderV2) viewHolder).bindData(itemAsPosition3);
            return;
        }
        if (viewHolder instanceof LineCharContentViewHolderV2) {
            final km5 itemAsPosition4 = getItemAsPosition(((LineCharContentViewHolderV2) viewHolder).getBindingAdapterPosition());
            if (itemAsPosition4 == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition4);
            viewHolder.onLoadDataListener = new OnLoadDataListener() { // from class: com.xiaomi.fitness.v2.HealthAdapterV2.onBindViewHolder.3
                @Override // com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener
                public void onLoadData(boolean hasData) {
                    int bindingAdapterPosition = ((LineCharContentViewHolderV2) viewHolder).getBindingAdapterPosition();
                    this.setClickListener(itemAsPosition4, viewHolder, hasData);
                    this.attachExposeTagToHealthCard(viewHolder, itemAsPosition4, bindingAdapterPosition, hasData);
                }
            };
            ((LineCharContentViewHolderV2) viewHolder).bindData(itemAsPosition4);
            return;
        }
        if (viewHolder instanceof BloodGlucoseChartViewHolder) {
            final km5 itemAsPosition5 = getItemAsPosition(((BloodGlucoseChartViewHolder) viewHolder).getBindingAdapterPosition());
            if (itemAsPosition5 == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition5);
            viewHolder.onLoadDataListener = new OnLoadDataListener() { // from class: com.xiaomi.fitness.v2.HealthAdapterV2.onBindViewHolder.4
                @Override // com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener
                public void onLoadData(boolean hasData) {
                    int bindingAdapterPosition = ((BloodGlucoseChartViewHolder) viewHolder).getBindingAdapterPosition();
                    this.setClickListener(itemAsPosition5, viewHolder, hasData);
                    this.attachExposeTagToHealthCard(viewHolder, itemAsPosition5, bindingAdapterPosition, hasData);
                }
            };
            ((BloodGlucoseChartViewHolder) viewHolder).bindData(itemAsPosition5);
            return;
        }
        if (viewHolder instanceof TodayHealthViewHolder) {
            final km5 itemAsPosition6 = getItemAsPosition(((TodayHealthViewHolder) viewHolder).getBindingAdapterPosition());
            Logger.d(TAG, "TodayHealthViewHolder getItemAsPosition dataModel=" + itemAsPosition6);
            if (itemAsPosition6 == null) {
                return;
            }
            viewHolder.itemView.setTag(itemAsPosition6);
            viewHolder.onLoadDataListener = new OnLoadDataListener() { // from class: com.xiaomi.fitness.v2.HealthAdapterV2.onBindViewHolder.5
                @Override // com.xiaomi.fitness.homepage.viewholder.OnLoadDataListener
                public void onLoadData(boolean hasData) {
                    int bindingAdapterPosition = ((TodayHealthViewHolder) viewHolder).getBindingAdapterPosition();
                    this.setClickListener(itemAsPosition6, viewHolder, hasData);
                    this.attachExposeTagToHealthCard(viewHolder, itemAsPosition6, bindingAdapterPosition, hasData);
                }
            };
            ((TodayHealthViewHolder) viewHolder).bindData();
            return;
        }
        if (viewHolder instanceof BottomViewHolderV2) {
            if (isBottomView(((BottomViewHolderV2) viewHolder).getBindingAdapterPosition())) {
                View itemView = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                ViewExtKt.setVisible(itemView, true);
                viewHolder.itemView.setTag(HealthTabOneTrackExtKt.buildHealthManageBtnExposeTag(((BottomViewHolderV2) viewHolder).getBindingAdapterPosition()));
                return;
            }
            View itemView2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ViewExtKt.setVisible(itemView2, false);
            Logger.i(TAG, "position:" + ((BottomViewHolderV2) viewHolder).getBindingAdapterPosition() + " not Bottom,Please check type !");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public nf2 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Logger.d(TAG, "onCreateViewHolder viewType=" + viewType);
        if (viewType == 1) {
            return new c0c(this.mLayoutInflater.inflate(jui.P6, parent, false));
        }
        if (viewType != 4 && viewType != 13 && viewType != 21 && viewType != 23) {
            if (viewType != 10000) {
                if (viewType == 30000) {
                    Context context = this.mContext;
                    w7e w7eVarA0 = w7e.A0(this.mLayoutInflater, parent, false);
                    Intrinsics.checkNotNullExpressionValue(w7eVarA0, "inflate(...)");
                    LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
                    if (lifecycleOwner == null) {
                        Object obj = this.mContext;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                        lifecycleOwner = (LifecycleOwner) obj;
                    }
                    return new TodayHealthViewHolder(context, w7eVarA0, lifecycleOwner, this.healthCheckViewModel);
                }
                if (viewType != 16) {
                    if (viewType != 17) {
                        if (viewType != 402) {
                            if (viewType == 403) {
                                Context context2 = this.mContext;
                                s7e s7eVarA0 = s7e.A0(this.mLayoutInflater, parent, false);
                                Intrinsics.checkNotNullExpressionValue(s7eVarA0, "inflate(...)");
                                return new BloodGlucoseChartViewHolder(context2, s7eVarA0);
                            }
                            switch (viewType) {
                                case 6:
                                    break;
                                case 7:
                                case 9:
                                case 10:
                                    break;
                                case 8:
                                    break;
                                default:
                                    Context context3 = this.mContext;
                                    sxb sxbVarA0 = sxb.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
                                    Intrinsics.checkNotNullExpressionValue(sxbVarA0, "inflate(...)");
                                    return new BottomViewHolderV2(context3, sxbVarA0);
                            }
                        }
                    }
                }
                Context context4 = this.mContext;
                oxb oxbVarA0 = oxb.A0(this.mLayoutInflater, parent, false);
                Intrinsics.checkNotNullExpressionValue(oxbVarA0, "inflate(...)");
                return new HealthIndicatorCardViewHolder(context4, oxbVarA0);
            }
            Context context5 = this.mContext;
            u7e u7eVarA0 = u7e.A0(this.mLayoutInflater, parent, false);
            Intrinsics.checkNotNullExpressionValue(u7eVarA0, "inflate(...)");
            LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
            return new LineCharContentViewHolderV2(context5, u7eVarA0, lifecycleOwner2 != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2) : null);
        }
        Context context6 = this.mContext;
        o7e o7eVarA0 = o7e.A0(this.mLayoutInflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(o7eVarA0, "inflate(...)");
        return new BarChartContentViewHolderV2(context6, o7eVarA0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Job healthObservationJob;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        HealthCheckViewModel healthCheckViewModel = this.healthCheckViewModel;
        if (healthCheckViewModel != null && (healthObservationJob = healthCheckViewModel.getHealthObservationJob()) != null) {
            Job.DefaultImpls.cancel$default(healthObservationJob, (CancellationException) null, 1, (Object) null);
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void setBottomCount(int bottomCount) {
        this.mBottomCount = bottomCount;
    }

    public final void setOnGoPageClickListener(@Nullable OnGoPageClickListener onGoPageClickListener) {
        this.onGoPageClickListener = onGoPageClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthAdapterV2(@NotNull Context mContext, @NotNull List<? extends km5> mDataList, @Nullable LifecycleOwner lifecycleOwner, @Nullable HealthCheckViewModel healthCheckViewModel) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mContext = mContext;
        this.mDataList = mDataList;
        this.mLifecycleOwner = lifecycleOwner;
        this.healthCheckViewModel = healthCheckViewModel;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mContext);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.mLayoutInflater = layoutInflaterFrom;
    }

    public void onBindViewHolder(@NotNull nf2 holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((nf2) d0Var, i, (List<Object>) list);
    }
}
