package com.huami.bluetooth.business;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/business/IChannel;", "", "Lkotlin/Function1;", "", "", "callback", "registerDataCallback", "byteArray", "", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IChannel {
    void registerDataCallback(@NotNull Function1<? super byte[], Unit> callback);

    @Nullable
    Object sendData(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation);
}
