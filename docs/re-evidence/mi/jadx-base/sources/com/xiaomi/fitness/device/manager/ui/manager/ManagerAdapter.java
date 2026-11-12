package com.xiaomi.fitness.device.manager.ui.manager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerAdapter;
import defpackage.xqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001e\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/manager/ManagerAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "Lcom/xiaomi/fitness/device/manager/ui/DeviceDetail;", "<init>", "()V", "updateItem", "", "did", "", "connected", "", "status", "", "onBindViewHolder", "holder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "position", "payloads", "", "", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManagerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/manager/ManagerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1872#2,3:64\n*S KotlinDebug\n*F\n+ 1 ManagerAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/manager/ManagerAdapter\n*L\n28#1:64,3\n*E\n"})
public final class ManagerAdapter extends BaseBindingAdapter<DeviceDetail> {
    public static final int PAYLOADS_MODE_CHANGED = 1;

    public ManagerAdapter() {
        super(null, 1, null);
        addChildClickViewIds(xqi.N, xqi.f39369r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$2$lambda$1(BaseViewHolder holder, Function3 it, ManagerAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (holder.getBindingAdapterPosition() == -1) {
            return false;
        }
        DeviceDetail itemData = this$0.getItemData(i);
        Intrinsics.checkNotNull(itemData);
        Integer numValueOf = Integer.valueOf(i);
        Intrinsics.checkNotNull(view);
        return ((Boolean) it.invoke(itemData, numValueOf, view)).booleanValue();
    }

    public final void updateItem(@Nullable String did, boolean connected, int status) {
        int i = 0;
        for (DeviceDetail deviceDetail : getDataList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DeviceDetail deviceDetail2 = deviceDetail;
            if (Intrinsics.areEqual(deviceDetail2.getDid(), did)) {
                deviceDetail2.setConnecting(connected);
                deviceDetail2.setConnectStatus(status);
                notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BaseViewHolder<DeviceDetail>) d0Var, i, (List<Object>) list);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter
    public void onBindViewHolder(@NotNull BaseViewHolder<DeviceDetail> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder((BaseViewHolder) holder, position, payloads);
        if (payloads.size() > 0) {
            Object obj = payloads.get(0);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null && num.intValue() == 1) {
                Logger.i("notifyDisplayMode changed: " + DeviceDetail.INSTANCE.checkIsEditMode(), new Object[0]);
                View view = holder.itemView;
                DeviceSwipeView deviceSwipeView = view instanceof DeviceSwipeView ? (DeviceSwipeView) view : null;
                if (deviceSwipeView != null) {
                    deviceSwipeView.notifyDisplayModeChanged();
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final BaseViewHolder<DeviceDetail> holder, final int position) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder((BaseViewHolder) holder, position);
        final Function3<DeviceDetail, Integer, View, Boolean> mLongListener = getMLongListener();
        if (mLongListener == null || (viewFindViewById = holder.itemView.findViewById(xqi.v)) == null) {
            return;
        }
        viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: l3f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ManagerAdapter.onBindViewHolder$lambda$2$lambda$1(holder, mLongListener, this, position, view);
            }
        });
    }
}
