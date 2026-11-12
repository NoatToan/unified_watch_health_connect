package com.xiaomi.fitness.device.manager.ui.scan;

import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/xiaomi/fitness/device/manager/ui/scan/ScanDeviceActivity$mLookup$2$1", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "getSpanSize", "(I)I", "spanSize", "", "setSpanSize", "(I)V", "mSpanSize", "I", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ScanDeviceActivity$mLookup$2$1 extends GridLayoutManager.b {
    private int mSpanSize;

    public ScanDeviceActivity$mLookup$2$1(ScanDeviceActivity scanDeviceActivity) {
        this.mSpanSize = SettingsPropertiesUtil.INSTANCE.isFolded(scanDeviceActivity) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public int getSpanSize(int position) {
        return this.mSpanSize;
    }

    public final void setSpanSize(int spanSize) {
        this.mSpanSize = spanSize;
    }
}
