package com.xiaomi.hm.health.device.weather.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.weather.adapter.WeatherAdapter;
import com.xiaomi.hm.health.device.weather.events.CityListEventListener;
import com.xiaomi.hm.health.device.weather.model.WeatherVo;
import com.xiaomi.hm.health.device.weather.other.WeatherItemType;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u001e\u001f B\u001d\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "getItemViewType", "holder", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/device/weather/model/WeatherVo;", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "Lcom/xiaomi/hm/health/device/weather/events/CityListEventListener;", "b", "Lcom/xiaomi/hm/health/device/weather/events/CityListEventListener;", "cityListEventListener", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/device/weather/events/CityListEventListener;)V", "c", "WeatherAddCityHolder", "WeatherCityTitleHolder", "WeatherListHolder", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Deprecated
    public static final int VIEW_TYPE_ADD_CITY = 2;

    @Deprecated
    public static final int VIEW_TYPE_CITY_LIST = 1;

    @Deprecated
    public static final int VIEW_TYPE_CITY_TITLE = 3;

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<WeatherVo> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private CityListEventListener cityListEventListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/WeatherAdapter$WeatherAddCityHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeatherAddCityHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView textView;

        public WeatherAddCityHolder(@NotNull View view) {
            super(view);
            this.view = view;
            this.textView = (TextView) view.findViewById(R.id.add_city_tv);
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/WeatherAdapter$WeatherCityTitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeatherCityTitleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        public WeatherCityTitleHolder(@NotNull View view) {
            super(view);
            this.view = view;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/WeatherAdapter$WeatherListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "enable", "", "setSwipeEnable", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "c", "getDeleteView", "deleteView", "<init>", "(Landroid/view/View;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class WeatherListHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final TextView textView;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final View deleteView;

        public WeatherListHolder(@NotNull View view) {
            super(view);
            this.view = view;
            this.textView = (TextView) view.findViewById(R.id.smContentView);
            this.deleteView = view.findViewById(R.id.smMenuView);
        }

        @NotNull
        public final View getDeleteView() {
            return this.deleteView;
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setSwipeEnable(boolean enable) {
            View view = this.view;
            SwipeMenuLayout swipeMenuLayout = view instanceof SwipeMenuLayout ? (SwipeMenuLayout) view : null;
            if (swipeMenuLayout == null) {
                return;
            }
            swipeMenuLayout.setSwipeEnable(enable);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WeatherItemType.values().length];
            iArr[WeatherItemType.ADD_CITY.ordinal()] = 1;
            iArr[WeatherItemType.CITY_TITLE.ordinal()] = 2;
            iArr[WeatherItemType.CITY_LIST.ordinal()] = 3;
            iArr[WeatherItemType.CURRENT_CITY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/device/weather/adapter/WeatherAdapter$a", "", "", "VIEW_TYPE_ADD_CITY", LogUtil.I, "VIEW_TYPE_CITY_LIST", "VIEW_TYPE_CITY_TITLE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WeatherAdapter(@NotNull List<WeatherVo> list, @NotNull CityListEventListener cityListEventListener) {
        this.data = list;
        this.cityListEventListener = cityListEventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(WeatherAdapter weatherAdapter, WeatherVo weatherVo, View view) {
        weatherAdapter.cityListEventListener.onDelete(weatherVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(WeatherAdapter weatherAdapter, View view) {
        weatherAdapter.cityListEventListener.onSearchClick(view);
    }

    @NotNull
    public final List<WeatherVo> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.data.get(position).getType().ordinal()];
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        final WeatherVo weatherVo = this.data.get(position);
        int i = WhenMappings.$EnumSwitchMapping$0[weatherVo.getType().ordinal()];
        if (i == 1) {
            ((WeatherAddCityHolder) holder).getTextView().setOnClickListener(new View.OnClickListener() { // from class: io8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherAdapter.d(this.a, view);
                }
            });
            return;
        }
        if (i == 3) {
            WeatherListHolder weatherListHolder = (WeatherListHolder) holder;
            weatherListHolder.getTextView().setText(weatherVo.getCity());
            weatherListHolder.setSwipeEnable(true);
            weatherListHolder.getDeleteView().setOnClickListener(new View.OnClickListener() { // from class: jo8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherAdapter.c(this.a, weatherVo, view);
                }
            });
            return;
        }
        if (i != 4) {
            return;
        }
        WeatherListHolder weatherListHolder2 = (WeatherListHolder) holder;
        TextView textView = weatherListHolder2.getTextView();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        textView.setText(String.format(IntroduceShuffleFactoryKt.getString(R.string.huamios_weather_current_located), Arrays.copyOf(new Object[]{weatherVo.getCity()}, 1)));
        weatherListHolder2.setSwipeEnable(false);
        weatherListHolder2.getDeleteView().setOnClickListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType != 1) {
            return viewType != 2 ? new WeatherCityTitleHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_city_title, parent, false)) : new WeatherAddCityHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_add_city, parent, false));
        }
        return new WeatherListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item_city_list, parent, false));
    }

    public final void setData(@NotNull List<WeatherVo> list) {
        this.data = list;
    }
}
