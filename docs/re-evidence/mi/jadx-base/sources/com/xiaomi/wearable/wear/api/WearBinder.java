package com.xiaomi.wearable.wear.api;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.kj2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/wearable/wear/api/WearBinder;", "", "Lkj2;", "callback", "", StatConstants.PARAM_START, "(Lkj2;)V", BroadcastsKt.SILENT_PUSHING_CANCEL, "()V", "device_release"}, k = 1, mv = {2, 0, 0})
public interface WearBinder {
    void cancel();

    void start(@NotNull kj2 callback);
}
