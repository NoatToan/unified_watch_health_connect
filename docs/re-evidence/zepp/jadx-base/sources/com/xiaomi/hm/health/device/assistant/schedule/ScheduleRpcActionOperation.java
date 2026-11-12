package com.xiaomi.hm.health.device.assistant.schedule;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.assistant.model.UpdatesManager;
import com.huami.assistant.util.UpdateBuilder;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.assistant.facotry.ActionOperation;
import com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi;
import com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0016R\u001e\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/ScheduleRpcActionOperation;", "Lcom/xiaomi/hm/health/device/assistant/facotry/ActionOperation;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/assistant/dataexchange/actions/EventAction;", "action", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "a", "", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/dataflow/exchange/Action;", "Lcom/huami/watch/dataflow/exchange/ActionResult;", "exec", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "c", "getScheduleRpcApi", "()Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "scheduleRpcApi", "Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApi;", "()Lcom/xiaomi/hm/health/device/assistant/schedule/web/ScheduleWebApi;", "scheduleWebApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ScheduleRpcActionOperation implements ActionOperation, KoinComponent {
    public static final boolean isMock = false;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = ScheduleRpcActionOperation.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleRpcApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleWebApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAction a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventAction eventAction) {
            super(0);
            this.a = eventAction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "action event : " + this.a.event;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "没有设备";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "设备没有连接";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "非GT系列不支持";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Action a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Action action) {
            super(0);
            this.a = action;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "action not implement " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAction a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EventAction eventAction) {
            super(0);
            this.a = eventAction;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "action event : " + this.a.event;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ScheduleRpcApi> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleRpcApi getA() {
            return new BleScheduleRpcImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduleRpcActionOperation() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcActionOperation$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.scheduleRpcApi = LazyKt__LazyJVMKt.lazy(g.a);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.scheduleWebApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<ScheduleWebApi>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcActionOperation$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.assistant.schedule.web.ScheduleWebApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ScheduleWebApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ScheduleWebApi.class), objArr2, objArr3);
            }
        });
    }

    private final HMMiLiProDevice a(EventAction action) {
        HMLog.debug(this.tag, new a(action));
        HMBaseDevice device = b().getDevice();
        if (device == null) {
            HMLog.error$default(this.tag, null, null, b.a, 6, null);
            return null;
        }
        if (!device.isConnected()) {
            HMLog.error$default(this.tag, null, null, c.a, 6, null);
            return null;
        }
        if (ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_SCHEDULE)) {
            HMLog.error$default(this.tag, null, null, d.a, 6, null);
            return null;
        }
        if (device instanceof HMMiLiProDevice) {
            return (HMMiLiProDevice) device;
        }
        return null;
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final ScheduleWebApi c() {
        return (ScheduleWebApi) this.scheduleWebApi.getValue();
    }

    private final String d(EventAction action) {
        HMLog.debug(this.tag, new f(action));
        return new Gson().toJson(new ArrayList());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    @Override // com.xiaomi.hm.health.device.assistant.facotry.ActionOperation
    @NotNull
    public ActionResult exec(@NotNull Action action) {
        ActionResult actionResult = new ActionResult(action);
        if (!(action instanceof EventAction)) {
            return actionResult.fail();
        }
        boolean zUpdate = false;
        switch (action.action) {
            case "Update":
                EventAction eventAction = (EventAction) action;
                zUpdate = getScheduleRpcApi().update(eventAction.event);
                if (zUpdate) {
                    UpdatesManager.getManager().save(UpdateBuilder.build(eventAction.event));
                }
            case "Add":
                EventAction eventAction2 = (EventAction) action;
                zUpdate = getScheduleRpcApi().add(eventAction2.event);
                if (zUpdate) {
                    UpdatesManager.getManager().save(UpdateBuilder.build(eventAction2.event));
                }
            case "Query":
                actionResult.resultData = d((EventAction) action);
                return actionResult.success();
            case "Delete":
                EventAction eventAction3 = (EventAction) action;
                long j = Long.parseLong(eventAction3.event.syncId);
                if (c().deleteEvent(eventAction3.event.syncId) && getScheduleRpcApi().deleteById(j)) {
                    zUpdate = true;
                }
                if (zUpdate) {
                    UpdatesManager.getManager().deleteBySyncId(2, eventAction3.event.syncId);
                }
            default:
                HMLog.error$default(this.tag, null, null, new e(action), 6, null);
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final ScheduleRpcApi getScheduleRpcApi() {
        return (ScheduleRpcApi) this.scheduleRpcApi.getValue();
    }
}
