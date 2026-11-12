package com.xiaomi.fitness.sport.view.launch.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport.bean.CourseRecommendBean;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.bean.SportLabelBean;
import com.xiaomi.fitness.sport.view.SportViewHolder;
import com.xiaomi.fitness.sport.view.launch.adapter.LaunchSportAdapter;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport.view.tab.adapter.RecommendSportView;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;
import com.xiaomi.fitness.sport.view.tab.adapter.SourceSportView;
import com.xiaomi.fitness.sport.view.tab.adapter.SportLabelView;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015J\u0014\u0010\u0016\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0011J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchSportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/SportViewHolder;", "launchView", "Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;", "sourceKey", "", "<init>", "(Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;Ljava/lang/String;)V", "getLaunchView", "()Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;", "setLaunchView", "(Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;)V", "list", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "routeData", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "launchViewHolder", "setData", "", "", "setHeadData", "setRouteData", "data", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemViewType", "position", "onBindViewHolder", "holder", "getItemCount", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportAdapter extends RecyclerView.Adapter<SportViewHolder> {
    public static final int COURSE_RECOMMEND = 2;
    public static final int LAUNCH = 0;
    public static final int RUNNING_ROUTE = 4;
    public static final int SPORT_LABEL = 3;

    @NotNull
    public static final String TAG = "LaunchSportAdapter";
    public static final int VOICE_SOURCE = 1;

    @NotNull
    private LaunchView launchView;

    @Nullable
    private SportViewHolder launchViewHolder;

    @NotNull
    private ArrayList<BaseSportItemBean> list;

    @Nullable
    private RunningRouteListBean routeData;

    @NotNull
    private final String sourceKey;

    public LaunchSportAdapter(@NotNull LaunchView launchView, @NotNull String sourceKey) {
        Intrinsics.checkNotNullParameter(launchView, "launchView");
        Intrinsics.checkNotNullParameter(sourceKey, "sourceKey");
        this.launchView = launchView;
        this.sourceKey = sourceKey;
        this.list = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$2(View view, int i, AbilityPlanRunningCourse abilityPlanRunningCourse) {
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        ArrayList<BaseSportItemBean> arrayList = this.list;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.list.get(position) instanceof LaunchViewBean) {
            return 0;
        }
        if (this.list.get(position) instanceof CourseRecommendBean) {
            return 2;
        }
        if (this.list.get(position) instanceof SportLabelBean) {
            return 3;
        }
        return this.list.get(position) instanceof RunningRouteListBean ? 4 : 1;
    }

    @NotNull
    public final LaunchView getLaunchView() {
        return this.launchView;
    }

    public final void setData(@NotNull List<? extends BaseSportItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.clear();
        this.list.addAll(list);
        RunningRouteListBean runningRouteListBean = this.routeData;
        if (runningRouteListBean != null && this.list.size() > 0) {
            this.list.add(1, runningRouteListBean);
        }
        if (list.size() == 1) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(1, list.size() - 1);
        }
    }

    public final void setHeadData(@NotNull List<? extends BaseSportItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list.addAll(list);
        notifyItemRangeChanged(0, 1);
    }

    public final void setLaunchView(@NotNull LaunchView launchView) {
        Intrinsics.checkNotNullParameter(launchView, "<set-?>");
        this.launchView = launchView;
    }

    public final void setRouteData(@NotNull RunningRouteListBean data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.routeData = data;
        if (data == null || this.list.size() <= 0) {
            return;
        }
        this.list.add(1, data);
        notifyItemRangeChanged(1, this.list.size() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SportViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BaseSportItemBean baseSportItemBean = this.list.get(position);
        Intrinsics.checkNotNullExpressionValue(baseSportItemBean, "get(...)");
        holder.bind(baseSportItemBean);
        if (getItemViewType(position) == 2) {
            holder.statistic(this.sourceKey);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SportViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            if (this.launchViewHolder == null) {
                LaunchView launchView = this.launchView;
                Intrinsics.checkNotNull(launchView, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.ISportTabItemData<com.xiaomi.fitness.sport.bean.BaseSportItemBean>");
                this.launchViewHolder = new SportViewHolder(launchView);
            }
            SportViewHolder sportViewHolder = this.launchViewHolder;
            Intrinsics.checkNotNull(sportViewHolder, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.SportViewHolder");
            return sportViewHolder;
        }
        if (viewType == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new SportViewHolder(new RecommendSportView(context));
        }
        if (viewType == 2) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            return new SportViewHolder(new SourceSportView(context2, this.sourceKey));
        }
        if (viewType == 3) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            return new SportViewHolder(new SportLabelView(context3));
        }
        if (viewType != 4) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            return new SportViewHolder(new LaunchView(context4, 0, null, new Function3() { // from class: o3e
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LaunchSportAdapter.onCreateViewHolder$lambda$2((View) obj, ((Integer) obj2).intValue(), (AbilityPlanRunningCourse) obj3);
                }
            }));
        }
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        return new SportViewHolder(new RunningRouteView(context5, null, 2, null));
    }
}
