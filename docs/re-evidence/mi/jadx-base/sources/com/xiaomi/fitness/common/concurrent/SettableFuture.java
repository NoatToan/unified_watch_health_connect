package com.xiaomi.fitness.common.concurrent;

import com.mi.health.course.export.data.CourseConfigModel;
import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/SettableFuture;", "V", "Ljava/util/concurrent/Future;", CourseConfigModel.DevCmd.CMD_ACTION_SET, "", "v", "(Ljava/lang/Object;)V", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SettableFuture<V> extends Future<V> {
    void set(V v);
}
