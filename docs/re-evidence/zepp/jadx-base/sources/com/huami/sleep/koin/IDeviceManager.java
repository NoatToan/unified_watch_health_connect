package com.huami.sleep.koin;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\nJ#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\f\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/koin/IDeviceManager;", "", "", "userId", "", "isEarbud", "date", "getDeviceDesc", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMainDeviceDesc", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMutiSource", "getLastSyncTime", "supportHrSleep", "sleepHrEnabled", "sleepRemEnabled", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceManager {
    @Nullable
    Object getDeviceDesc(@NotNull String str, boolean z, @NotNull String str2, @NotNull Continuation<? super String> continuation);

    @NotNull
    String getLastSyncTime();

    @Nullable
    Object getMainDeviceDesc(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object isEarbud(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isMutiSource(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);

    boolean sleepHrEnabled();

    boolean sleepRemEnabled();

    boolean supportHrSleep();
}
