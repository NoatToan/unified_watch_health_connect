package com.xiaomi.hm.health.device.settings.todo.usecase;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.bluetooth.profile.channel.module.todo.TodoApi;
import com.huami.bluetooth.profile.channel.module.todo.Version;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.settings.todo.TodoListViewModel;
import com.xiaomi.hm.health.device.settings.todo.TodoRepeat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/usecase/RestoreDataUseCase;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/todo/TodoApi;", "api", "", Constant.METHOD_EXECUTE, "Lcom/xiaomi/hm/health/device/settings/todo/usecase/LoadRestoreDataUseCase;", "a", "Lcom/xiaomi/hm/health/device/settings/todo/usecase/LoadRestoreDataUseCase;", "restoreData", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "(Lcom/xiaomi/hm/health/device/settings/todo/usecase/LoadRestoreDataUseCase;)V", "c", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RestoreDataUseCase implements KoinComponent {

    @Deprecated
    @NotNull
    public static final String TAG = "RestoreDataUseCase";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoadRestoreDataUseCase restoreData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/todo/usecase/RestoreDataUseCase$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
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
            return "Cannot restore todo without version info!";
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
            return "No restore todo!";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestoreDataUseCase(@NotNull LoadRestoreDataUseCase loadRestoreDataUseCase) {
        this.restoreData = loadRestoreDataUseCase;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.settings.todo.usecase.RestoreDataUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceCenter invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
    }

    private final DeviceCenter a() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    public final void execute(@NotNull TodoApi api) {
        Response<Version> responseQueryVersion = api.queryVersion();
        if (!(responseQueryVersion instanceof Success)) {
            HMLog.error$default(TAG, null, null, b.a, 6, null);
            return;
        }
        Success success = (Success) responseQueryVersion;
        List<Todo> listExecute = this.restoreData.execute(((Version) success.getData()).getMaxCount());
        if (listExecute.isEmpty()) {
            HMLog.info(TAG, c.a);
            return;
        }
        boolean zSupportWorkday = TodoListViewModel.INSTANCE.supportWorkday(((Version) success.getData()).getV(), a().getDevice());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listExecute, 10));
        for (Todo todoCopy : listExecute) {
            if (!zSupportWorkday && todoCopy.getRepeat() == 4096) {
                todoCopy = todoCopy.copy((158 & 1) != 0 ? todoCopy.id : 0L, (158 & 2) != 0 ? todoCopy.content : null, (158 & 4) != 0 ? todoCopy.source : null, (158 & 8) != 0 ? todoCopy.date : null, (158 & 16) != 0 ? todoCopy.time : null, (158 & 32) != 0 ? todoCopy.repeat : TodoRepeat.checkFlag(todoCopy.getRepeat(), todoCopy.getDate(), zSupportWorkday), (158 & 64) != 0 ? todoCopy.completeTime : null, (158 & 128) != 0 ? todoCopy.firstRemind : null);
            }
            arrayList.add(todoCopy);
        }
        api.syncData(arrayList);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
