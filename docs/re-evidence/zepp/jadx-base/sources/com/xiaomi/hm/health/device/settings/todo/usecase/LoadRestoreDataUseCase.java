package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/LoadRestoreDataUseCase;", "", "", "max", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase;", "b", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase;", "fetchRemote", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LoadRestoreDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FetchRemoteTodoListUseCase fetchRemote;

    public LoadRestoreDataUseCase(@NotNull LocalDataSource localDataSource, @NotNull FetchRemoteTodoListUseCase fetchRemoteTodoListUseCase) {
        this.local = localDataSource;
        this.fetchRemote = fetchRemoteTodoListUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    @NotNull
    public final List<Todo> execute(int max) {
        List<Todo> listLoadAll = this.local.loadAll();
        if (!(!listLoadAll.isEmpty())) {
            listLoadAll = null;
        }
        if (listLoadAll == null) {
            RemoteResult<List<Todo>> remoteResultExecute = this.fetchRemote.execute();
            if (remoteResultExecute instanceof RemoteResult.Success) {
                listLoadAll = (List) ((RemoteResult.Success) remoteResultExecute).getData();
            } else {
                if (!(remoteResultExecute instanceof RemoteResult.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                listLoadAll = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        if (listLoadAll.size() <= max) {
            return listLoadAll;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = listLoadAll.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Long completeTime = ((Todo) next).getCompleteTime();
            if (completeTime != null) {
                if (!(completeTime.longValue() >= 0)) {
                    completeTime = null;
                }
            } else {
                completeTime = null;
            }
            Boolean boolValueOf = Boolean.valueOf(completeTime == null);
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(next);
        }
        List list = (List) linkedHashMap.get(Boolean.TRUE);
        List listSortedWith = list == null ? null : CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.hm.health.device.settings.todo.usecase.LoadRestoreDataUseCase$execute$lambda-6$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Todo) t2).getId()), Long.valueOf(((Todo) t).getId()));
            }
        });
        if (listSortedWith == null) {
            listSortedWith = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = (List) linkedHashMap.get(Boolean.FALSE);
        List listSortedWith2 = list2 != null ? CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.xiaomi.hm.health.device.settings.todo.usecase.LoadRestoreDataUseCase$execute$lambda-6$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Todo) t2).getId()), Long.valueOf(((Todo) t).getId()));
            }
        }) : null;
        if (listSortedWith2 == null) {
            listSortedWith2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if (listSortedWith.size() >= max) {
            return listSortedWith.subList(0, max);
        }
        List<Todo> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listSortedWith);
        mutableList.addAll(listSortedWith2.subList(0, max - listSortedWith.size()));
        return mutableList;
    }
}
