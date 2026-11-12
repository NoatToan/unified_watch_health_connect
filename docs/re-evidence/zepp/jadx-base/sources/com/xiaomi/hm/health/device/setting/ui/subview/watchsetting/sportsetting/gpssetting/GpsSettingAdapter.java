package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsFrequency;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.SearchStarPreference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012BG\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0$\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R%\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "getGpsMode", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "setGpsMode", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;)V", "gpsMode", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "c", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "Lkotlin/Function1;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getOnMoreClick", "()Lkotlin/jvm/functions/Function0;", "onMoreClick", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsSettingAdapter extends RecyclerView.Adapter<GpsSettingViewHolder> {

    @NotNull
    private static final String f = "GpsSettingAdapter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private GpsMode gpsMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<GpsSettingVo> list;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<GpsMode, Unit> listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onMoreClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GpsSettingAdapter.this.getOnMoreClick().invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "adjust marginBottom";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ GpsSettingVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GpsSettingVo gpsSettingVo) {
            super(1);
            this.b = gpsSettingVo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            if (GpsSettingAdapter.this.getGpsMode() == this.b.getGpsMode()) {
                return;
            }
            GpsSettingAdapter.this.getListener().invoke(this.b.getGpsMode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GpsSettingAdapter(@NotNull Context context, @NotNull GpsMode gpsMode, @NotNull List<GpsSettingVo> list, @NotNull Function1<? super GpsMode, Unit> function1, @NotNull Function0<Unit> function0) {
        this.context = context;
        this.gpsMode = gpsMode;
        this.list = list;
        this.listener = function1;
        this.onMoreClick = function0;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final GpsMode getGpsMode() {
        return this.gpsMode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.list.size();
    }

    @NotNull
    public final List<GpsSettingVo> getList() {
        return this.list;
    }

    @NotNull
    public final Function1<GpsMode, Unit> getListener() {
        return this.listener;
    }

    @NotNull
    public final Function0<Unit> getOnMoreClick() {
        return this.onMoreClick;
    }

    public final void setGpsMode(@NotNull GpsMode gpsMode) {
        this.gpsMode = gpsMode;
    }

    public final void setList(@NotNull List<GpsSettingVo> list) {
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull GpsSettingViewHolder holder, int position) {
        GpsSettingVo gpsSettingVo = this.list.get(position);
        ExtKt.setVisible$default(holder.getCheckedImg(), getGpsMode() == gpsSettingVo.getGpsMode(), false, 2, null);
        holder.getModeTv().setText(gpsSettingVo.getGpsMode().fullDesc());
        GpsFrequency gpsFrequency = gpsSettingVo.getGpsFrequency();
        ExtKt.setVisible$default(holder.getGpsFrequenciesTv(), gpsFrequency != null, false, 2, null);
        if (gpsFrequency != null) {
            holder.getGpsFrequenciesTv().setText(gpsFrequency.fullDesc());
        }
        LocationCombination locationCombination = gpsSettingVo.getLocationCombination();
        ExtKt.setVisible$default(holder.getGpsCombineTv(), locationCombination != null, false, 2, null);
        if (locationCombination != null) {
            holder.getGpsCombineTv().setText(locationCombination.fullDesc());
        }
        SearchStarPreference searchStarPreference = gpsSettingVo.getSearchStarPreference();
        ExtKt.setVisible$default(holder.getStarSearchPreferencesTv(), searchStarPreference != null, false, 2, null);
        if (searchStarPreference != null) {
            holder.getStarSearchPreferencesTv().setText(searchStarPreference.fullDesc());
        }
        Integer dataInterval = gpsSettingVo.getDataInterval();
        ExtKt.setVisible$default(holder.getDataIntervalTv(), dataInterval != null, false, 2, null);
        if (dataInterval != null) {
            dataInterval.intValue();
            holder.getDataIntervalTv().setText(getContext().getResources().getQuantityString(R.plurals.ds_gps_data_interval, dataInterval.intValue(), dataInterval));
        }
        ExtKt.setVisible$default(holder.getMoreLayout(), gpsSettingVo.getGpsMode() == GpsMode.DIY, false, 2, null);
        ExtKt.smartClick$default(holder.getMoreLayout(), 0L, new a(), 1, null);
        if (CollectionsKt__CollectionsKt.getLastIndex(getList()) == position) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                HMLog.info(f, b.a);
                marginLayoutParams.bottomMargin = (int) ViewUtils.dp2px(getContext(), 14.0f);
                holder.itemView.setLayoutParams(marginLayoutParams);
            }
        }
        ExtKt.smartClick$default(holder.itemView, 0L, new c(gpsSettingVo), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public GpsSettingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new GpsSettingViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gps_setting, parent, false));
    }
}
