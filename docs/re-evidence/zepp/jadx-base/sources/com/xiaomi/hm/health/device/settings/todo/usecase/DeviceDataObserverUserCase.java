package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.todo.DataChangAction;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.huami.bluetooth.profile.channel.module.todo.TodoCallback;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/DeviceDataObserverUserCase;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "api", "", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "b", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "sync2Cloud", "com/xiaomi/hm/health/device/settings/todo/usecase/DeviceDataObserverUserCase$deviceObserver$1", "c", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/DeviceDataObserverUserCase$deviceObserver$1;", "deviceObserver", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;)V", GoogleApiAvailabilityLight.a, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataObserverUserCase {

    @Deprecated
    @NotNull
    public static final String TAG = "DeviceDataObserverUserCase";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SyncLocalChangeToRemoteUseCase sync2Cloud;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataObserverUserCase$deviceObserver$1 deviceObserver = new TodoCallback() { // from class: com.xiaomi.hm.health.device.settings.todo.usecase.DeviceDataObserverUserCase$deviceObserver$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ DataChangAction a;
            public final /* synthetic */ Todo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DataChangAction dataChangAction, Todo todo) {
                super(0);
                this.a = dataChangAction;
                this.b = todo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Device todo changed: " + this.a + " - " + this.b.getId();
            }
        }

        @Override // com.huami.bluetooth.profile.channel.module.todo.TodoCallback
        public void onDataChanged(@NotNull DataChangAction action, @NotNull Todo todo) {
            HMLog.info(DeviceDataObserverUserCase.TAG, new a(action, todo));
            if (Intrinsics.areEqual(action, DataChangAction.Add.INSTANCE) || Intrinsics.areEqual(action, DataChangAction.Update.INSTANCE)) {
                this.a.local.save(todo);
            } else if (Intrinsics.areEqual(action, DataChangAction.Delete.INSTANCE)) {
                this.a.local.delete(todo);
            }
            this.a.sync2Cloud.execute();
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/usecase/DeviceDataObserverUserCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Observer device todo changed.";
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.xiaomi.hm.health.device.settings.todo.usecase.DeviceDataObserverUserCase$deviceObserver$1] */
    public DeviceDataObserverUserCase(@NotNull LocalDataSource localDataSource, @NotNull SyncLocalChangeToRemoteUseCase syncLocalChangeToRemoteUseCase) {
        this.local = localDataSource;
        this.sync2Cloud = syncLocalChangeToRemoteUseCase;
    }

    public final void execute(@NotNull TodoApi api) {
        HMLog.info(TAG, b.a);
        api.registerDeviceCallback(this.deviceObserver);
    }
}
