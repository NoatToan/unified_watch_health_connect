package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IPressureAllDayDataListener;", "", "", "", "data", "", "onDataReceived", "onDataMissing", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IPressureAllDayDataListener {
    void onDataMissing();

    void onDataReceived(@NotNull List<Integer> data);
}
