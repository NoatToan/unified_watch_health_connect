package com.xiaomi.fitness.common.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;", "T", "", "onDataReady", "dataSet", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "(Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;)Ljava/lang/Object;", "DataSet", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDataHandler<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "", "get", "D", "type", "", "(Ljava/lang/String;)Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DataSet {
        @Nullable
        <D> D get(@NotNull String type);
    }

    @Nullable
    T onDataReady(@NotNull DataSet dataSet);
}
