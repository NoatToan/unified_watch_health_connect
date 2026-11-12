package com.huami.bluetooth.profile.channel.module.todo;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0006H&J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/todo/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "queryData", "todo", "", "update", "delete", "list", "syncData", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoCallback;", "callback", "", "registerDeviceCallback", "unregisterDeviceCallback", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface TodoApi {
    @NotNull
    Response<Boolean> delete(@NotNull Todo todo);

    @NotNull
    Response<List<Todo>> queryData();

    @NotNull
    Response<Version> queryVersion();

    void registerDeviceCallback(@NotNull TodoCallback callback);

    @NotNull
    Response<Boolean> syncData(@NotNull List<Todo> list);

    void unregisterDeviceCallback(@NotNull TodoCallback callback);

    @NotNull
    Response<Boolean> update(@NotNull Todo todo);
}
