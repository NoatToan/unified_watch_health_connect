package com.xiaomi.hm.health.device.weather.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.weather.adapter.CityResultAdapter;
import com.xiaomi.hm.health.device.weather.events.CityResultCallback;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/weather/adapter/CityResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/weather/adapter/CityResultHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "a", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "Lcom/xiaomi/hm/health/device/weather/events/CityResultCallback;", "b", "Lcom/xiaomi/hm/health/device/weather/events/CityResultCallback;", "getCallback", "()Lcom/xiaomi/hm/health/device/weather/events/CityResultCallback;", "callback", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/device/weather/events/CityResultCallback;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CityResultAdapter extends RecyclerView.Adapter<CityResultHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<? extends CityInfo> data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CityResultCallback callback;

    public CityResultAdapter(@NotNull List<? extends CityInfo> list, @NotNull CityResultCallback cityResultCallback) {
        this.data = list;
        this.callback = cityResultCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CityResultAdapter cityResultAdapter, int i, View view) {
        cityResultAdapter.getCallback().onCitySelect(cityResultAdapter.getData().get(i));
    }

    @NotNull
    public final CityResultCallback getCallback() {
        return this.callback;
    }

    @NotNull
    public final List<CityInfo> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.data.size();
    }

    public final void setData(@NotNull List<? extends CityInfo> list) {
        this.data = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CityResultHolder holder, final int position) {
        String name;
        TextView textView = holder.getTextView();
        if (TextUtils.isEmpty(getData().get(position).getAffiliation())) {
            name = getData().get(position).getName();
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            name = String.format("%s-%s", Arrays.copyOf(new Object[]{getData().get(position).getName(), getData().get(position).getAffiliation()}, 2));
        }
        textView.setText(name);
        textView.setOnClickListener(new View.OnClickListener() { // from class: zo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityResultAdapter.b(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CityResultHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new CityResultHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city_result_huamios, parent, false));
    }
}
