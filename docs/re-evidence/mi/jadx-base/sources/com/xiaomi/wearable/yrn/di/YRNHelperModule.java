package com.xiaomi.wearable.yrn.di;

import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.debug.YRNDebugHelper;
import com.xiaomi.wearable.yrn.impl.YRNDebugHelperImpl;
import com.xiaomi.wearable.yrn.impl.YRNHelperImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/wearable/yrn/di/YRNHelperModule;", "", "<init>", "()V", "bindYRNHelper", "Lcom/xiaomi/wearable/yrn/export/YRNHelper;", "helperImpl", "Lcom/xiaomi/wearable/yrn/impl/YRNHelperImpl;", "bindYRNDebugHelper", "Lcom/xiaomi/wearable/yrn/export/debug/YRNDebugHelper;", "Lcom/xiaomi/wearable/yrn/impl/YRNDebugHelperImpl;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class YRNHelperModule {
    @NotNull
    public abstract YRNDebugHelper bindYRNDebugHelper(@NotNull YRNDebugHelperImpl helperImpl);

    @NotNull
    public abstract YRNHelper bindYRNHelper(@NotNull YRNHelperImpl helperImpl);
}
