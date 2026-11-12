package com.xiaomi.hm.health.weather.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.weather.adapter.HotCityAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BL\u0012!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R1\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/weather/adapter/HotCityAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/weather/adapter/HotCityHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cityName", "a", "Lkotlin/jvm/functions/Function1;", "hotCitySelectCallback", "Lkotlin/Pair;", "b", "Lkotlin/Pair;", "itemSize", "", "c", "Ljava/util/List;", "getCityList", "()Ljava/util/List;", "setCityList", "(Ljava/util/List;)V", "cityList", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Ljava/util/List;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HotCityAdapter extends RecyclerView.Adapter<HotCityHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, Unit> hotCitySelectCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Pair<Integer, Integer> itemSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<String> cityList;

    /* JADX WARN: Multi-variable type inference failed */
    public HotCityAdapter(@NotNull Function1<? super String, Unit> function1, @NotNull Pair<Integer, Integer> pair, @NotNull List<String> list) {
        this.hotCitySelectCallback = function1;
        this.itemSize = pair;
        this.cityList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HotCityAdapter hotCityAdapter, int i, View view) {
        hotCityAdapter.hotCitySelectCallback.invoke(hotCityAdapter.getCityList().get(i));
    }

    @NotNull
    public final List<String> getCityList() {
        return this.cityList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.cityList.size();
    }

    public final void setCityList(@NotNull List<String> list) {
        this.cityList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull HotCityHolder holder, final int position) {
        TextView textView = holder.getTextView();
        textView.setText(getCityList().get(position));
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) ViewUtils.dp2px(DeviceXFunctionsKt.getContext(), this.itemSize.getFirst().intValue());
        layoutParams.height = (int) ViewUtils.dp2px(DeviceXFunctionsKt.getContext(), this.itemSize.getSecond().intValue());
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new View.OnClickListener() { // from class: g94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HotCityAdapter.b(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public HotCityHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new HotCityHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot_city, parent, false));
    }
}
