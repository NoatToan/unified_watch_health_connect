package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteResult;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase;", "", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteResult;", "", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "remote", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "b", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "local", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;)V", "c", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FetchRemoteTodoListUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "FetchRemoteTodoListUseCase";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remote;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/usecase/FetchRemoteTodoListUseCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<List<Todo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoteResult<List<Todo>> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch remote todo success! - " + ((List) ((RemoteResult.Success) this.a).getData()).size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<List<Todo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RemoteResult<List<Todo>> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch remote todo failed! - " + ((RemoteResult.Failed) this.a).getCode();
        }
    }

    public FetchRemoteTodoListUseCase(@NotNull RemoteDataSource remoteDataSource, @NotNull LocalDataSource localDataSource) {
        this.remote = remoteDataSource;
        this.local = localDataSource;
    }

    @NotNull
    public final RemoteResult<List<Todo>> execute() {
        RemoteResult<List<Todo>> remoteResultFetch = this.remote.fetch();
        if (remoteResultFetch instanceof RemoteResult.Success) {
            HMLog.info(TAG, new b(remoteResultFetch));
            this.local.deleteAll();
            RemoteResult.Success success = (RemoteResult.Success) remoteResultFetch;
            if (!((Collection) success.getData()).isEmpty()) {
                this.local.save((List<Todo>) success.getData());
            }
        } else if (remoteResultFetch instanceof RemoteResult.Failed) {
            HMLog.error$default(TAG, null, null, new c(remoteResultFetch), 6, null);
        }
        return remoteResultFetch;
    }
}
