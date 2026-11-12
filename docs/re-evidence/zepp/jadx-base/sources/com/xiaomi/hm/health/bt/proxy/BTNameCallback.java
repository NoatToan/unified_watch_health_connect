package com.xiaomi.hm.health.bt.proxy;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&J$\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&J$\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&J$\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0018\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bH&J$\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&J$\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;", "", "Ljava/util/HashMap;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/collections/HashMap;", "getMiliProNames", "getAmazfitNames", "getSmartWatchNames", "getBMNames", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNormandyNames", "getMiliNames", "getEarbudNames", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface BTNameCallback {
    @NotNull
    HashMap<String, HMDeviceSource> getAmazfitNames();

    @NotNull
    HashMap<String, HMDeviceSource> getBMNames();

    @NotNull
    HashMap<String, HMDeviceSource> getEarbudNames();

    @NotNull
    HashMap<String, HMDeviceSource> getMiliNames();

    @NotNull
    HashMap<String, HMDeviceSource> getMiliProNames();

    @NotNull
    ArrayList<String> getNormandyNames();

    @NotNull
    HashMap<String, HMDeviceSource> getSmartWatchNames();
}
