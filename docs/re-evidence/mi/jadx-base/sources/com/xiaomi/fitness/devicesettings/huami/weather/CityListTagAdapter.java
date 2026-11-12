package com.xiaomi.fitness.devicesettings.huami.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.huami.weather.CityListTagAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import defpackage.eui;
import defpackage.wzi;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\u001c\u0010\u001f\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter$LabelViewHolder;", "context", "Landroid/content/Context;", "mCityList", "", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "removeListener", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getMCityList", "()Ljava/util/List;", "setMCityList", "(Ljava/util/List;)V", "getRemoveListener", "()Lkotlin/jvm/functions/Function1;", "updateCityKeyList", "list", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "LabelViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityListTagAdapter extends RecyclerView.Adapter<LabelViewHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<LocationKey> mCityList;

    @NotNull
    private final Function1<Integer, Unit> removeListener;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "dataList", "", "position", "", "bindData", "(Ljava/util/List;I)V", "Landroid/widget/TextView;", "cityBtn", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "removeBtn", "Landroid/widget/ImageView;", "getRemoveBtn", "()Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/huami/weather/CityListTagAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LabelViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView cityBtn;

        @NotNull
        private final ImageView removeBtn;
        final /* synthetic */ CityListTagAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelViewHolder(@NotNull CityListTagAdapter cityListTagAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = cityListTagAdapter;
            View viewFindViewById = itemView.findViewById(zqi.G0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.cityBtn = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.u7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.removeBtn = (ImageView) viewFindViewById2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        public final void bindData(@NotNull List<? extends LocationKey> dataList, int position) {
            String str;
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            LocationKey locationKey = dataList.get(position);
            String locationName = locationKey.locationName;
            if (locationName != null) {
                Intrinsics.checkNotNullExpressionValue(locationName, "locationName");
                if (locationName.length() > 0) {
                    str = locationKey.locationName;
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            if (position == 0 && locationKey.isUserAutoLocation) {
                ViewExtKt.gone(this.removeBtn);
                str = str + ResourceExtKt.getString(wzi.F9);
            } else {
                ViewExtKt.visible(this.removeBtn);
            }
            this.cityBtn.setText(str);
        }

        @NotNull
        public final ImageView getRemoveBtn() {
            return this.removeBtn;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CityListTagAdapter(@NotNull Context context, @NotNull List<LocationKey> mCityList, @NotNull Function1<? super Integer, Unit> removeListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mCityList, "mCityList");
        Intrinsics.checkNotNullParameter(removeListener, "removeListener");
        this.context = context;
        this.mCityList = mCityList;
        this.removeListener = removeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(CityListTagAdapter this$0, LabelViewHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.removeListener.invoke2(Integer.valueOf(holder.getBindingAdapterPosition()));
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mCityList.size();
    }

    @NotNull
    public final List<LocationKey> getMCityList() {
        return this.mCityList;
    }

    @NotNull
    public final Function1<Integer, Unit> getRemoveListener() {
        return this.removeListener;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setMCityList(@NotNull List<LocationKey> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mCityList = list;
    }

    public void updateCityKeyList(@NotNull List<LocationKey> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mCityList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final LabelViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.mCityList, position);
        holder.getRemoveBtn().setOnClickListener(new View.OnClickListener() { // from class: ux3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CityListTagAdapter.onBindViewHolder$lambda$0(this.f36242a, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LabelViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.d3, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new LabelViewHolder(this, viewInflate);
    }
}
