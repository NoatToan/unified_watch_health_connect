package com.xiaomi.fitness.devicesettings.huami.weather;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.huami.weather.SelectCityAdapter;
import com.xiaomi.fitness.sync.export.model.WeatherSelectCityInfo;
import defpackage.eui;
import defpackage.jni;
import defpackage.ni4;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0014\u0010\"\u001a\u00020\u001f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$SelectCityViewHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$OnCityItemClickListener;", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$OnCityItemClickListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getListener", "()Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$OnCityItemClickListener;", "setListener", "(Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$OnCityItemClickListener;)V", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "SelectCityViewHolder", "OnCityItemClickListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectCityAdapter extends RecyclerView.Adapter<SelectCityViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<WeatherSelectCityInfo> dataList;

    @Nullable
    private OnCityItemClickListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$OnCityItemClickListener;", "", "onItemSelect", "", "locationInfo", "Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCityItemClickListener {
        void onItemSelect(@NotNull WeatherSelectCityInfo locationInfo);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/SelectCityAdapter$SelectCityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", "locationInfo", "", "bindData", "(Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;)V", "Landroid/widget/TextView;", "cityNameView", "Landroid/widget/TextView;", "getCityNameView", "()Landroid/widget/TextView;", "setCityNameView", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SelectCityViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView cityNameView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectCityViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.cityNameView = (TextView) itemView.findViewById(zqi.E0);
        }

        public final void bindData(@NotNull WeatherSelectCityInfo locationInfo) {
            Intrinsics.checkNotNullParameter(locationInfo, "locationInfo");
            if (TextUtils.isEmpty(locationInfo.getAffiliation())) {
                TextView textView = this.cityNameView;
                if (textView != null) {
                    textView.setText(locationInfo.getName());
                    return;
                }
                return;
            }
            TextView textView2 = this.cityNameView;
            if (textView2 != null) {
                textView2.setText(locationInfo.getName() + " - " + locationInfo.getAffiliation());
            }
        }

        @Nullable
        public final TextView getCityNameView() {
            return this.cityNameView;
        }

        public final void setCityNameView(@Nullable TextView textView) {
            this.cityNameView = textView;
        }
    }

    public /* synthetic */ SelectCityAdapter(Context context, List list, OnCityItemClickListener onCityItemClickListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : onCityItemClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(SelectCityAdapter this$0, WeatherSelectCityInfo locationInfo, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(locationInfo, "$locationInfo");
        OnCityItemClickListener onCityItemClickListener = this$0.listener;
        if (onCityItemClickListener != null) {
            onCityItemClickListener.onItemSelect(locationInfo);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<WeatherSelectCityInfo> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final OnCityItemClickListener getListener() {
        return this.listener;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<WeatherSelectCityInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setListener(@Nullable OnCityItemClickListener onCityItemClickListener) {
        this.listener = onCityItemClickListener;
    }

    public final void updateDataList(@NotNull List<WeatherSelectCityInfo> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public SelectCityAdapter(@NotNull Context context, @NotNull List<WeatherSelectCityInfo> dataList, @Nullable OnCityItemClickListener onCityItemClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.listener = onCityItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SelectCityViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final WeatherSelectCityInfo weatherSelectCityInfo = this.dataList.get(position);
        holder.bindData(weatherSelectCityInfo);
        holder.itemView.setBackground(ni4.e(ApplicationExtKt.getApplication(), jni.R));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: csl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectCityAdapter.onBindViewHolder$lambda$0(this.f14680a, weatherSelectCityInfo, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SelectCityViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.G2, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SelectCityViewHolder(viewInflate);
    }
}
