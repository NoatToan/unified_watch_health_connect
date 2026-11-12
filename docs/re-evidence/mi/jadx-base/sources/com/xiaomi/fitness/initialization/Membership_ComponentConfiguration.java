package com.xiaomi.fitness.initialization;

import com.xiaomi.fitness.component.AppComponentDelegate;
import com.xiaomi.fitness.component.ComponentConfiguration;
import com.xiaomi.fitness.component.Task;
import com.xiaomi.fitness.membership.component.MembershipComponent_AppComponent;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005J$\u0010\t\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u0005J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0005J\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/initialization/Membership_ComponentConfiguration;", "Lcom/xiaomi/fitness/component/ComponentConfiguration;", "<init>", "()V", "createMainComponentInitMap", "", "", "", "Lcom/xiaomi/fitness/component/Task;", "createBackgroundComponentInitMap", "createAppComponentDelegates", "", "Lcom/xiaomi/fitness/component/AppComponentDelegate;", "createOnEventTaskMap", "membership_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Membership_ComponentConfiguration implements ComponentConfiguration {
    @Override // com.xiaomi.fitness.component.ComponentConfiguration
    @NotNull
    public final Map<String, AppComponentDelegate<?>> createAppComponentDelegates() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("membership", new MembershipComponent_AppComponent());
        return concurrentHashMap;
    }

    @Override // com.xiaomi.fitness.component.ComponentConfiguration
    @NotNull
    public final Map<Integer, Map<Integer, List<Task>>> createBackgroundComponentInitMap() {
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        treeMap.put(2, treeMap2);
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Task("membership", 2, "fetchMembership", false, ""));
        treeMap2.put(8, linkedList);
        return treeMap;
    }

    @Override // com.xiaomi.fitness.component.ComponentConfiguration
    @NotNull
    public final Map<Integer, List<Task>> createMainComponentInitMap() {
        return new TreeMap();
    }

    @Override // com.xiaomi.fitness.component.ComponentConfiguration
    @NotNull
    public final Map<String, Task> createOnEventTaskMap() {
        return new TreeMap();
    }
}
