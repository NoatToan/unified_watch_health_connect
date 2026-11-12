package com.xiaomi.wearable.transport.queue;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "DATA", "", "onReceiveData", "", "data", "(Ljava/lang/Object;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TaskDataReceiver<DATA> {
    void onReceiveData(DATA data);
}
