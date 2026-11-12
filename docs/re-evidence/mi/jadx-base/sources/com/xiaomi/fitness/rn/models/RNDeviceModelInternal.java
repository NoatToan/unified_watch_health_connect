package com.xiaomi.fitness.rn.models;

import com.xiaomi.fitness.rn.export.bean.RNDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H&R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/rn/models/RNDeviceModelInternal;", "", "initByModelDevice", "", "device", "Lcom/xiaomi/fitness/rn/export/bean/RNDeviceInfo;", "isReAdded", "", "()Z", "setReAdded", "(Z)V", "setCurrentStatus", "isCurrent", "onBindSuccess", "rebind", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RNDeviceModelInternal {
    void initByModelDevice(@NotNull RNDeviceInfo device);

    boolean isReAdded();

    void onBindSuccess(boolean rebind);

    void setCurrentStatus(boolean isCurrent);

    void setReAdded(boolean z);
}
