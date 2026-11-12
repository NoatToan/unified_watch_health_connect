package com.xiaomi.hm.health.device.settings.todo.datasource;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.message.utils.MessageRecorderEventHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteResult;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", RemoteConfigComponent.FETCH_FILE_NAME, "todo", "", "delete", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface RemoteDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static RemoteResult<Boolean> push(@NotNull RemoteDataSource remoteDataSource, @NotNull Todo todo) {
            return remoteDataSource.push(e.listOf(todo));
        }
    }

    @NotNull
    RemoteResult<Boolean> delete(@NotNull Todo todo);

    @NotNull
    RemoteResult<List<Todo>> fetch();

    @NotNull
    RemoteResult<Boolean> push(@NotNull Todo todo);

    @NotNull
    RemoteResult<Boolean> push(@NotNull List<Todo> todo);
}
