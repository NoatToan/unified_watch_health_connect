package com.xiaomi.fitness.component;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0003H&J*\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u00030\u0003H&J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0003H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/component/ComponentConfiguration;", "", "createMainComponentInitMap", "", "", "", "Lcom/xiaomi/fitness/component/Task;", "createBackgroundComponentInitMap", "createAppComponentDelegates", "", "Lcom/xiaomi/fitness/component/AppComponentDelegate;", "createOnEventTaskMap", "component-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ComponentConfiguration {
    @NotNull
    Map<String, AppComponentDelegate<?>> createAppComponentDelegates();

    @NotNull
    Map<Integer, Map<Integer, List<Task>>> createBackgroundComponentInitMap();

    @NotNull
    Map<Integer, List<Task>> createMainComponentInitMap();

    @NotNull
    Map<String, Task> createOnEventTaskMap();
}
