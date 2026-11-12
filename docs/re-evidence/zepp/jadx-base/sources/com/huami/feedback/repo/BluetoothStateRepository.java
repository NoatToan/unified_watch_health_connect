package com.huami.feedback.repo;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/huami/feedback/repo/BluetoothStateRepository;", "", "", "isBluetoothEnable", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/huami/feedback/repo/BluetoothState;", "getBluetoothState", "()Lkotlinx/coroutines/flow/StateFlow;", "bluetoothState", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface BluetoothStateRepository {
    @NotNull
    StateFlow<BluetoothState> getBluetoothState();

    boolean isBluetoothEnable();
}
