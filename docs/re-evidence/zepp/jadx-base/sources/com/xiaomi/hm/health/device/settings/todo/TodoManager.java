package com.xiaomi.hm.health.device.settings.todo;

import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.xiaomi.hm.health.device.settings.todo.usecase.DeviceDataObserverUserCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.FetchDeviceTodoListUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.FetchRemoteTodoListUseCase;
import com.xiaomi.hm.health.device.settings.todo.usecase.RestoreDataUseCase;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoManager;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "api", "", "onActiveDevice", "onDeviceConnected", "onUserLogin", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoManager {

    @NotNull
    public static final TodoManager INSTANCE = new TodoManager();

    private TodoManager() {
    }

    @JvmStatic
    public static final void onActiveDevice(@NotNull TodoApi api) {
        ((RestoreDataUseCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(RestoreDataUseCase.class), null, null)).execute(api);
        ((DeviceDataObserverUserCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(DeviceDataObserverUserCase.class), null, null)).execute(api);
    }

    @JvmStatic
    public static final void onDeviceConnected(@NotNull TodoApi api) {
        ((FetchDeviceTodoListUseCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(FetchDeviceTodoListUseCase.class), null, null)).execute(api);
        ((DeviceDataObserverUserCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(DeviceDataObserverUserCase.class), null, null)).execute(api);
    }

    @JvmStatic
    public static final void onUserLogin() {
        ((FetchRemoteTodoListUseCase) TodoModuleKt.getTodoUserScope().get(Reflection.getOrCreateKotlinClass(FetchRemoteTodoListUseCase.class), null, null)).execute();
    }
}
