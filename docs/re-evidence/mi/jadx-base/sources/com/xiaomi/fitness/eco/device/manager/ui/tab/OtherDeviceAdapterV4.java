package com.xiaomi.fitness.eco.device.manager.ui.tab;

import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseBindingAdapter;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;
import defpackage.ari;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceAdapterV4;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "Lcom/xiaomi/fitness/eco/device/manager/ui/EcoDeviceDetail;", "<init>", "()V", "updateItem", "", "did", "", "mac", "connected", "", "status", "", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOtherDeviceAdapterV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherDeviceAdapterV4.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceAdapterV4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1872#2,3:29\n*S KotlinDebug\n*F\n+ 1 OtherDeviceAdapterV4.kt\ncom/xiaomi/fitness/eco/device/manager/ui/tab/OtherDeviceAdapterV4\n*L\n16#1:29,3\n*E\n"})
public final class OtherDeviceAdapterV4 extends BaseBindingAdapter<EcoDeviceDetail> {
    public OtherDeviceAdapterV4() {
        super(null, 1, null);
        addChildClickViewIds(ari.u);
    }

    public final void updateItem(@Nullable String did, @Nullable String mac, boolean connected, int status) {
        int i = 0;
        for (EcoDeviceDetail ecoDeviceDetail : getDataList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            EcoDeviceDetail ecoDeviceDetail2 = ecoDeviceDetail;
            if ((Intrinsics.areEqual(ecoDeviceDetail2.getDid(), did) || Intrinsics.areEqual(ecoDeviceDetail2.getMac(), mac)) && status != ecoDeviceDetail2.getLastConnectedStatus()) {
                ecoDeviceDetail2.setLastConnectedStatus(status);
                ecoDeviceDetail2.setConnecting(connected);
                ecoDeviceDetail2.setConnectStatus(status);
                notifyItemChanged(i);
            }
            i = i2;
        }
    }
}
