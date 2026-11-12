package com.xiaomi.hm.health.device.settings.todo.datasource;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.widget.share.ShareAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "loadAll", "todo", "", "delete", "deleteAll", ShareAnalytics.ParamValue.SAVE, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface LocalDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean delete(@NotNull LocalDataSource localDataSource, @NotNull Todo todo) {
            return localDataSource.delete(e.listOf(todo));
        }

        public static boolean save(@NotNull LocalDataSource localDataSource, @NotNull Todo todo) {
            return localDataSource.save(e.listOf(todo));
        }
    }

    boolean delete(@NotNull Todo todo);

    boolean delete(@NotNull List<Todo> todo);

    boolean deleteAll();

    @NotNull
    List<Todo> loadAll();

    boolean save(@NotNull Todo todo);

    boolean save(@NotNull List<Todo> todo);
}
