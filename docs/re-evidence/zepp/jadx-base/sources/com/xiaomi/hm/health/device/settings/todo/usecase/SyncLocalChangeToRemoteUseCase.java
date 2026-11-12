package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.settings.todo.datasource.LocalDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteDataSource;
import com.xiaomi.hm.health.device.settings.todo.datasource.RemoteResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;", "remote", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "b", "Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;", "remoteLocal", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase;", "c", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase;", "data", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/datasource/RemoteDataSource;Lcom/xiaomi/hm/health/device/settings/todo/datasource/LocalDataSource;Lcom/xiaomi/hm/health/device/settings/todo/usecase/FindLocalModifyDataUseCase;)V", GoogleApiAvailabilityLight.a, "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SyncLocalChangeToRemoteUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "SyncLocalChangeToRemoteUseCase";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remote;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource remoteLocal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FindLocalModifyDataUseCase data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/usecase/SyncLocalChangeToRemoteUseCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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
            return "No change!";
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
            return "Update local remote.";
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
            return "Delete local remote.";
        }
    }

    public SyncLocalChangeToRemoteUseCase(@NotNull RemoteDataSource remoteDataSource, @NotNull LocalDataSource localDataSource, @NotNull FindLocalModifyDataUseCase findLocalModifyDataUseCase) {
        this.remote = remoteDataSource;
        this.remoteLocal = localDataSource;
        this.data = findLocalModifyDataUseCase;
    }

    public final void execute() {
        Map<FindLocalModifyDataUseCase.Group, List<Todo>> mapExecute = this.data.execute();
        if (mapExecute.isEmpty()) {
            HMLog.info(TAG, b.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Todo> arrayList2 = new ArrayList();
        for (Map.Entry<FindLocalModifyDataUseCase.Group, List<Todo>> entry : mapExecute.entrySet()) {
            FindLocalModifyDataUseCase.Group key = entry.getKey();
            if (Intrinsics.areEqual(key, FindLocalModifyDataUseCase.Group.Add.INSTANCE)) {
                arrayList.addAll(entry.getValue());
            } else if (Intrinsics.areEqual(key, FindLocalModifyDataUseCase.Group.Update.INSTANCE)) {
                arrayList.addAll(entry.getValue());
            } else if (Intrinsics.areEqual(key, FindLocalModifyDataUseCase.Group.Delete.INSTANCE)) {
                arrayList2.addAll(entry.getValue());
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null && (this.remote.push(arrayList) instanceof RemoteResult.Success)) {
            this.remoteLocal.save(arrayList);
            HMLog.info(TAG, c.a);
        }
        for (Todo todo : arrayList2) {
            if (this.remote.delete(todo) instanceof RemoteResult.Success) {
                this.remoteLocal.delete(todo);
                HMLog.info(TAG, d.a);
            }
        }
    }
}
