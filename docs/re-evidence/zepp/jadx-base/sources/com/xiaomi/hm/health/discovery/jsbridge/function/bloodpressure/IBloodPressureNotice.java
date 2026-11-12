package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/IBloodPressureNotice;", "", "", "data", "handle", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "", "match", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureNotice {
    @Nullable
    Object handle(@Nullable String str, @NotNull Continuation<? super String> continuation);

    boolean match(@NotNull String type);
}
