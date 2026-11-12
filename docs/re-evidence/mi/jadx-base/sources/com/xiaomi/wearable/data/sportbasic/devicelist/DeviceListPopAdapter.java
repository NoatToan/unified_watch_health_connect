package com.xiaomi.wearable.data.sportbasic.devicelist;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.wearable.data.sportbasic.devicelist.DeviceListPopAdapter;
import defpackage.c0j;
import defpackage.cl5;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u001f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter$DeviceListPopViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter$DeviceListPopViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter$DeviceListPopViewHolder;I)V", "", "Lcl5;", "dataDeviceModelList", "Ljava/util/List;", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "deviceSelectedListener", "Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;", "", "currentSid", "Ljava/lang/String;", "getCurrentSid", "()Ljava/lang/String;", "setCurrentSid", "(Ljava/lang/String;)V", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/common/devicelist/SportsDeviceListView$DeviceSelectedListener;)V", "DeviceListPopViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceListPopAdapter extends RecyclerView.Adapter<DeviceListPopViewHolder> {

    @Nullable
    private String currentSid;

    @NotNull
    private final List<cl5> dataDeviceModelList;

    @Nullable
    private final SportsDeviceListView.DeviceSelectedListener deviceSelectedListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter$DeviceListPopViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "deviceName", "Landroid/widget/TextView;", "getDeviceName", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "selectedIcon", "Landroid/widget/ImageView;", "getSelectedIcon", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/wearable/data/sportbasic/devicelist/DeviceListPopAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class DeviceListPopViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView deviceName;

        @NotNull
        private final ImageView selectedIcon;
        final /* synthetic */ DeviceListPopAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceListPopViewHolder(@NotNull DeviceListPopAdapter deviceListPopAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = deviceListPopAdapter;
            View viewFindViewById = view.findViewById(eri.L3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.deviceName = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(eri.Te);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.selectedIcon = (ImageView) viewFindViewById2;
        }

        @NotNull
        public final TextView getDeviceName() {
            return this.deviceName;
        }

        @NotNull
        public final ImageView getSelectedIcon() {
            return this.selectedIcon;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceListPopAdapter(@NotNull List<? extends cl5> dataDeviceModelList, @Nullable SportsDeviceListView.DeviceSelectedListener deviceSelectedListener) {
        Intrinsics.checkNotNullParameter(dataDeviceModelList, "dataDeviceModelList");
        this.dataDeviceModelList = dataDeviceModelList;
        this.deviceSelectedListener = deviceSelectedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(cl5 data, DeviceListPopAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        data.f5449b = true;
        this$0.currentSid = data.c;
        this$0.notifyDataSetChanged();
        SportsDeviceListView.DeviceSelectedListener deviceSelectedListener = this$0.deviceSelectedListener;
        if (deviceSelectedListener != null) {
            String did = data.c;
            Intrinsics.checkNotNullExpressionValue(did, "did");
            deviceSelectedListener.deviceSelected(did, true);
        }
    }

    @Nullable
    public final String getCurrentSid() {
        return this.currentSid;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataDeviceModelList.size();
    }

    public final void setCurrentSid(@Nullable String str) {
        this.currentSid = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DeviceListPopViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final cl5 cl5Var = this.dataDeviceModelList.get(position);
        TextView deviceName = holder.getDeviceName();
        String str = cl5Var.f5448a;
        if (str == null) {
            str = cl5Var.c;
        }
        deviceName.setText(str);
        ImageView selectedIcon = holder.getSelectedIcon();
        int i = 0;
        if (Intrinsics.areEqual(cl5Var.c, this.currentSid)) {
            View view = holder.itemView;
            Application app = AppUtil.getApp();
            int i2 = c0j.j9;
            Object[] objArr = new Object[1];
            String str2 = cl5Var.f5448a;
            if (str2 == null) {
                str2 = cl5Var.c;
            }
            objArr[0] = str2;
            view.setContentDescription(app.getString(i2, objArr));
        } else {
            View view2 = holder.itemView;
            Application app2 = AppUtil.getApp();
            int i3 = c0j.k9;
            Object[] objArr2 = new Object[1];
            String str3 = cl5Var.f5448a;
            if (str3 == null) {
                str3 = cl5Var.c;
            }
            objArr2[0] = str3;
            view2.setContentDescription(app2.getString(i3, objArr2));
            i = 8;
        }
        selectedIcon.setVisibility(i);
        holder.getDeviceName().setTextColor(ExtUtilsKt.getColor(iji.r3));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: x86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DeviceListPopAdapter.onBindViewHolder$lambda$0(cl5Var, this, view3);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DeviceListPopViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.F8, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new DeviceListPopViewHolder(this, viewInflate);
    }
}
