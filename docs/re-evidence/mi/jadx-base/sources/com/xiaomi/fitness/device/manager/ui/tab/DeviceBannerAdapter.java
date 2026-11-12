package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import defpackage.xqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/tab/DeviceBannerAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "Lcom/fitness/banner/export/v2/BannerItemV2;", "<init>", "()V", "onBindViewHolder", "", "holder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "position", "", "payloads", "", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceBannerAdapter extends BaseBindingAdapter<BannerItemV2> {
    public DeviceBannerAdapter() {
        super(null, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BaseViewHolder<BannerItemV2>) d0Var, i, (List<Object>) list);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter
    public void onBindViewHolder(@NotNull BaseViewHolder<BannerItemV2> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder((BaseViewHolder) holder, position, payloads);
        BannerItemV2 itemData = getItemData(position);
        if (itemData == null) {
            return;
        }
        ((MultipleStyleBannerView) holder.itemView.findViewById(xqi.h0)).updateBanner(itemData);
    }
}
