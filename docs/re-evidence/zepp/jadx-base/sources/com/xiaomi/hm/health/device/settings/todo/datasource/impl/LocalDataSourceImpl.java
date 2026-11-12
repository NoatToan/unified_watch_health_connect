package com.xiaomi.hm.health.device.settings.todo.datasource.impl;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.widget.share.ShareAnalytics;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/datasource/impl/LocalDataSourceImpl;", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "loadAll", "todo", "", "delete", "deleteAll", ShareAnalytics.ParamValue.SAVE, "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvPersistence", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocalDataSourceImpl implements LocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kvPersistence;

    public LocalDataSourceImpl(@NotNull KvPersistence kvPersistence) {
        this.kvPersistence = kvPersistence;
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    public boolean delete(@NotNull Todo todo) {
        return LocalDataSource.DefaultImpls.delete(this, todo);
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    public boolean deleteAll() {
        this.kvPersistence.clear();
        return true;
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    @NotNull
    public List<Todo> loadAll() {
        String[] allKeys = this.kvPersistence.getAllKeys();
        ArrayList arrayList = new ArrayList();
        for (String str : allKeys) {
            ParcelableTodo parcelableTodo = (ParcelableTodo) this.kvPersistence.getParcelableValue(str, ParcelableTodo.class);
            Todo todo = parcelableTodo == null ? null : new Todo(parcelableTodo.getId(), parcelableTodo.getContent(), TodoSourceKt.toTodoSource(parcelableTodo.getSource()), parcelableTodo.getDate(), parcelableTodo.getTime(), parcelableTodo.getRepeat(), parcelableTodo.getCompleteTime(), parcelableTodo.getFirstRemind());
            if (todo != null) {
                arrayList.add(todo);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    public boolean save(@NotNull Todo todo) {
        return LocalDataSource.DefaultImpls.save(this, todo);
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    public boolean delete(@NotNull List<Todo> todo) {
        if (!todo.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(todo, 10));
            Iterator<T> it2 = todo.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Todo) it2.next()).getId()));
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            this.kvPersistence.removeValuesForKeys((String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return true;
    }

    @Override // com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource
    public boolean save(@NotNull List<Todo> todo) {
        if (!(!todo.isEmpty())) {
            return true;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(todo, 10));
        for (Todo todo2 : todo) {
            arrayList.add(new Pair(String.valueOf(todo2.getId()), new ParcelableTodo(todo2.getId(), todo2.getContent(), TodoSourceKt.toInt(todo2.getSource()), todo2.getDate(), todo2.getTime(), todo2.getRepeat(), todo2.getCompleteTime(), todo2.getFirstRemind())));
        }
        Object[] array = arrayList.toArray(new Pair[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Pair[] pairArr = (Pair[]) array;
        this.kvPersistence.setValues((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return true;
    }
}
