package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchDeviceTodoListUseCase;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "api", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "b", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "sync2Cloud", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;)V", "c", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FetchDeviceTodoListUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "FetchDeviceTodoListUseCase";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SyncLocalChangeToRemoteUseCase sync2Cloud;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/usecase/FetchDeviceTodoListUseCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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
            return "Fetch device todo to local.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch device todo failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch device todo version failed!";
        }
    }

    public FetchDeviceTodoListUseCase(@NotNull LocalDataSource localDataSource, @NotNull SyncLocalChangeToRemoteUseCase syncLocalChangeToRemoteUseCase) {
        this.local = localDataSource;
        this.sync2Cloud = syncLocalChangeToRemoteUseCase;
    }

    @NotNull
    public final List<Todo> execute(@NotNull TodoApi api) {
        List<Todo> list = null;
        if (api.queryVersion() instanceof Success) {
            Response<List<Todo>> responseQueryData = api.queryData();
            if (responseQueryData instanceof Success) {
                HMLog.info(TAG, b.a);
                this.local.deleteAll();
                Success success = (Success) responseQueryData;
                if (!((Collection) success.getData()).isEmpty()) {
                    this.local.save((List<Todo>) success.getData());
                }
                this.sync2Cloud.execute();
                list = (List) success.getData();
            } else {
                HMLog.error$default(TAG, null, null, c.a, 6, null);
            }
        } else {
            HMLog.error$default(TAG, null, null, d.a, 6, null);
        }
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}
