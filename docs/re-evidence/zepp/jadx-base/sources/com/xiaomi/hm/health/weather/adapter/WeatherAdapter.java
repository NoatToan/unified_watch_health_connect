package com.xiaomi.hm.health.weather.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.weather.adapter.WeatherAdapter;
import com.xiaomi.hm.health.weather.events.CityListEventListener;
import com.xiaomi.hm.health.weather.model.WeatherVo;
import com.xiaomi.hm.health.weather.other.WeatherItemType;
import com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001989:B7\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0$\u0012\u0006\u0010/\u001a\u00020,\u0012\b\b\u0002\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "e", "Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter$WeatherListHolder;", "f", "", "support", "Landroid/widget/CheckBox;", "checkbox", "Lcom/xiaomi/hm/health/weather/model/WeatherVo;", "weatherVo", "g", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "getItemViewType", "onBindViewHolder", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "b", "Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "viewModel", "", "c", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "Lcom/xiaomi/hm/health/weather/events/CityListEventListener;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/weather/events/CityListEventListener;", "cityListEventListener", "Z", "getSupportDefaultCity", "()Z", "setSupportDefaultCity", "(Z)V", "supportDefaultCity", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;Ljava/util/List;Lcom/xiaomi/hm/health/weather/events/CityListEventListener;Z)V", "WeatherAddCityHolder", "WeatherCityTitleHolder", "WeatherListHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Deprecated
    public static final int VIEW_TYPE_ADD_CITY = 2;

    @Deprecated
    public static final int VIEW_TYPE_CITY_LIST = 1;

    @Deprecated
    public static final int VIEW_TYPE_CITY_TITLE = 3;

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WeatherViewModel viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<WeatherVo> data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private CityListEventListener cityListEventListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean supportDefaultCity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter$WeatherAddCityHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter$WeatherCityTitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/weather/adapter/WeatherAdapter$WeatherListHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "enable", "", "setSwipeEnable", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "c", "getDeleteView", "deleteView", "Landroid/widget/CheckBox;", GoogleApiAvailabilityLight.a, "Landroid/widget/CheckBox;", "getDefaultCityCb", "()Landroid/widget/CheckBox;", "defaultCityCb", "<init>", "(Landroid/view/View;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final CheckBox defaultCityCb;

        public WeatherListHolder(@NotNull View view) {
            super(view);
            this.view = view;
            this.textView = (TextView) view.findViewById(R.id.city_title_tv);
            this.deleteView = view.findViewById(R.id.smMenuView);
            this.defaultCityCb = (CheckBox) view.findViewById(R.id.default_city_cb);
        }

        @NotNull
        public final CheckBox getDefaultCityCb() {
            return this.defaultCityCb;
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
            iArr[WeatherItemType.LOCATED_CITY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/xiaomi/hm/health/weather/adapter/WeatherAdapter$a", "", "", "VIEW_TYPE_ADD_CITY", LogUtil.I, "VIEW_TYPE_CITY_LIST", "VIEW_TYPE_CITY_TITLE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WeatherAdapter(Context context, WeatherViewModel weatherViewModel, List list, CityListEventListener cityListEventListener, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, weatherViewModel, list, cityListEventListener, (i & 16) != 0 ? false : z);
    }

    private final void e(RecyclerView.ViewHolder holder) {
        WeatherListHolder weatherListHolder = holder instanceof WeatherListHolder ? (WeatherListHolder) holder : null;
        if (weatherListHolder == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = weatherListHolder.getTextView().getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.setMarginStart((int) ViewUtils.dp2px(weatherListHolder.getTextView().getContext(), 14.0f));
        weatherListHolder.getTextView().setLayoutParams(layoutParams2);
    }

    private final void f(WeatherListHolder holder) {
    }

    private final void g(boolean support, CheckBox checkbox, final WeatherVo weatherVo) {
        ExtensionsKt.setVisible(checkbox, support);
        if (support) {
            checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: no8
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    WeatherAdapter.h(weatherVo, this, compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(WeatherVo weatherVo, WeatherAdapter weatherAdapter, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (weatherVo.getDefaultCity()) {
                compoundButton.toggle();
            } else {
                weatherAdapter.cityListEventListener.onDefaultCityChange(weatherVo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WeatherAdapter weatherAdapter, WeatherVo weatherVo, View view) {
        weatherAdapter.cityListEventListener.onDelete(weatherVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WeatherAdapter weatherAdapter, WeatherVo weatherVo, View view) {
        weatherAdapter.cityListEventListener.onDelete(weatherVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WeatherAdapter weatherAdapter, View view) {
        weatherAdapter.cityListEventListener.onSearchClick(view);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<WeatherVo> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
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

    public final boolean getSupportDefaultCity() {
        return this.supportDefaultCity;
    }

    @NotNull
    public final WeatherViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        final WeatherVo weatherVo = this.data.get(position);
        boolean z = holder instanceof WeatherListHolder;
        WeatherListHolder weatherListHolder = z ? (WeatherListHolder) holder : null;
        if (weatherListHolder != null) {
            weatherListHolder.getDefaultCityCb().setChecked(false);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[weatherVo.getType().ordinal()];
        if (i == 1) {
            ((WeatherAddCityHolder) holder).getTextView().setOnClickListener(new View.OnClickListener() { // from class: ko8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherAdapter.k(this.a, view);
                }
            });
        } else if (i == 3) {
            WeatherListHolder weatherListHolder2 = (WeatherListHolder) holder;
            weatherListHolder2.getTextView().setText(weatherVo.getCity());
            weatherListHolder2.setSwipeEnable(true);
            weatherListHolder2.getDeleteView().setOnClickListener(new View.OnClickListener() { // from class: lo8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherAdapter.i(this.a, weatherVo, view);
                }
            });
            g(getSupportDefaultCity(), weatherListHolder2.getDefaultCityCb(), weatherVo);
        } else if (i == 4) {
            WeatherListHolder weatherListHolder3 = (WeatherListHolder) holder;
            weatherListHolder3.getTextView().setText(getViewModel().getCurrentCityTitle(getContext(), weatherVo.getCity()));
            weatherListHolder3.getDeleteView().setOnClickListener(new View.OnClickListener() { // from class: mo8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherAdapter.j(this.a, weatherVo, view);
                }
            });
            g(getSupportDefaultCity(), weatherListHolder3.getDefaultCityCb(), weatherVo);
            if (m.isBlank(weatherVo.getLocationKey())) {
                ExtensionsKt.setVisible(weatherListHolder3.getDefaultCityCb(), false);
                e(holder);
            }
        }
        if (weatherVo.getDefaultCity()) {
            WeatherListHolder weatherListHolder4 = z ? (WeatherListHolder) holder : null;
            if (weatherListHolder4 != null) {
                weatherListHolder4.getDefaultCityCb().setChecked(true);
                f(weatherListHolder4);
            }
        }
        if (this.supportDefaultCity) {
            return;
        }
        e(holder);
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

    public final void setSupportDefaultCity(boolean z) {
        this.supportDefaultCity = z;
    }

    public WeatherAdapter(@NotNull Context context, @NotNull WeatherViewModel weatherViewModel, @NotNull List<WeatherVo> list, @NotNull CityListEventListener cityListEventListener, boolean z) {
        this.context = context;
        this.viewModel = weatherViewModel;
        this.data = list;
        this.cityListEventListener = cityListEventListener;
        this.supportDefaultCity = z;
    }
}
