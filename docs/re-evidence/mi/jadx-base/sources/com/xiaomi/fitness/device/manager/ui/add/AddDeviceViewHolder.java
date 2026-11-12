package com.xiaomi.fitness.device.manager.ui.add;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.widget.SquareImageView;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.hni;
import defpackage.nuf;
import defpackage.r76;
import defpackage.zv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Lr76;", "Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindView", "(Lr76;Lcom/xiaomi/fitness/device/manager/export/add/DeviceInfo;)V", "Landroidx/lifecycle/Lifecycle;", "lc", "Landroidx/lifecycle/Lifecycle;", "getLc", "()Landroidx/lifecycle/Lifecycle;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;Landroidx/lifecycle/Lifecycle;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddDeviceListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceListAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,46:1\n54#2,3:47\n24#2:50\n59#2,6:51\n*S KotlinDebug\n*F\n+ 1 AddDeviceListAdapter.kt\ncom/xiaomi/fitness/device/manager/ui/add/AddDeviceViewHolder\n*L\n28#1:47,3\n28#1:50\n28#1:51,6\n*E\n"})
public final class AddDeviceViewHolder extends BaseBindingViewHolder<r76, DeviceInfo> {

    @Nullable
    private final Lifecycle lc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDeviceViewHolder(@NotNull View view, @Nullable Lifecycle lifecycle) {
        super(zv1.f, view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.lc = lifecycle;
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder
    public void bindView(@NotNull r76 r76Var, @NotNull DeviceInfo t) {
        Intrinsics.checkNotNullParameter(r76Var, "<this>");
        Intrinsics.checkNotNullParameter(t, "t");
        SquareImageView deviceIvDeviceDial = r76Var.A;
        Intrinsics.checkNotNullExpressionValue(deviceIvDeviceDial, "deviceIvDeviceDial");
        String bigPreview = t.getBigPreview();
        ImageLoader imageLoader = Coil.imageLoader(deviceIvDeviceDial.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(deviceIvDeviceDial.getContext()).data(bigPreview).target(deviceIvDeviceDial);
        int i = t.isBand() ? hni.i : hni.l;
        builderTarget.error(i);
        builderTarget.placeholder(i);
        builderTarget.lifecycle(this.lc);
        imageLoader.enqueue(builderTarget.build());
        if (t.getItemType() == 12) {
            nuf.f(r76Var.getRoot());
        }
    }

    @Nullable
    public final Lifecycle getLc() {
        return this.lc;
    }
}
