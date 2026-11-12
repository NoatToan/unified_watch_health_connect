package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase;", "", "", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "b", "remote", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;)V", "Group", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindLocalModifyDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource remote;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group;", "", "<init>", "()V", "Add", "Delete", "Update", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Add;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Update;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Delete;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static abstract class Group {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Add;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Add extends Group {

            @NotNull
            public static final Add INSTANCE = new Add();

            private Add() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Delete;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Delete extends Group {

            @NotNull
            public static final Delete INSTANCE = new Delete();

            private Delete() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group$Update;", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase$Group;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Update extends Group {

            @NotNull
            public static final Update INSTANCE = new Update();

            private Update() {
                super(null);
            }
        }

        private Group() {
        }

        public /* synthetic */ Group(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FindLocalModifyDataUseCase(@NotNull LocalDataSource localDataSource, @NotNull LocalDataSource localDataSource2) {
        this.local = localDataSource;
        this.remote = localDataSource2;
    }

    @NotNull
    public final Map<Group, List<Todo>> execute() {
        boolean z;
        boolean z2;
        List<Todo> listLoadAll = this.local.loadAll();
        List<Todo> listLoadAll2 = this.remote.loadAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<T> it2 = listLoadAll.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Todo todo = (Todo) next;
            if (!(listLoadAll2 instanceof Collection) || !listLoadAll2.isEmpty()) {
                Iterator<T> it3 = listLoadAll2.iterator();
                do {
                    if (!it3.hasNext()) {
                        z3 = true;
                        break;
                    }
                } while (!(((Todo) it3.next()).getId() == todo.getId()));
            } else {
                z3 = true;
                break;
            }
            Boolean boolValueOf = Boolean.valueOf(z3);
            Object arrayList = linkedHashMap2.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(next);
        }
        List list = (List) linkedHashMap2.get(Boolean.TRUE);
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                linkedHashMap.put(Group.Add.INSTANCE, list);
            }
        }
        List list2 = (List) linkedHashMap2.get(Boolean.FALSE);
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                Todo todo2 = (Todo) obj;
                if (!(listLoadAll2 instanceof Collection) || !listLoadAll2.isEmpty()) {
                    Iterator<T> it4 = listLoadAll2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z2 = false;
                            break;
                        }
                        Todo todo3 = (Todo) it4.next();
                        if (todo3.getId() == todo2.getId() && !Intrinsics.areEqual(todo3, todo2)) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                linkedHashMap.put(Group.Update.INSTANCE, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLoadAll2) {
            Todo todo4 = (Todo) obj2;
            if (!(listLoadAll instanceof Collection) || !listLoadAll.isEmpty()) {
                Iterator<T> it5 = listLoadAll.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z = true;
                        break;
                    }
                    if (((Todo) it5.next()).getId() == todo4.getId()) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3.isEmpty() ^ true ? arrayList3 : null;
        if (arrayList4 != null) {
            linkedHashMap.put(Group.Delete.INSTANCE, arrayList4);
        }
        return linkedHashMap;
    }
}
