package com.xiaomi.hm.health.device.assistant.reminder;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.dataexchange.actions.EventAction;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.device.assistant.facotry.ActionOperation;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0012H\u0016R\u001e\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/reminder/ReminderActionOperation;", "Lcom/xiaomi/hm/health/device/assistant/facotry/ActionOperation;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/assistant/dataexchange/actions/EventAction;", "action", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "b", "", "a", "c", "g", "", "e", "device", "", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "infoList", "f", "Lcom/huami/watch/dataflow/exchange/Action;", "Lcom/huami/watch/dataflow/exchange/ActionResult;", "exec", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "countDownLatch", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReminderActionOperation implements ActionOperation, KoinComponent {
    private static final long d = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = ReminderActionOperation.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public ReminderActionOperation() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.assistant.reminder.ReminderActionOperation$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final boolean a(EventAction action) {
        HMMiLiProDevice hMMiLiProDeviceB = b(action);
        if (hMMiLiProDeviceB == null) {
            return false;
        }
        List<HMReminderInfo> listConvert2InsertInfoList = new ReminderInfoAdapter(action.event).convert2InsertInfoList();
        if (listConvert2InsertInfoList.isEmpty()) {
            return false;
        }
        return f(hMMiLiProDeviceB, listConvert2InsertInfoList);
    }

    private final HMMiLiProDevice b(EventAction action) {
        HMLog.d(this.tag, "action event : " + action.event, new Object[0]);
        HMBaseDevice device = d().getDevice();
        if (device == null) {
            HMLog.e(this.tag, "没有设备", new Object[0]);
            return null;
        }
        if (!device.isConnected()) {
            HMLog.e(this.tag, "设备没有连接", new Object[0]);
            return null;
        }
        if (ConfigHelperKt.hasMiliFeature(Feature.REMINDER_SOURCE_S)) {
            HMLog.e(this.tag, "非GT系列不支持", new Object[0]);
            return null;
        }
        if (device instanceof HMMiLiProDevice) {
            return (HMMiLiProDevice) device;
        }
        return null;
    }

    private final boolean c(EventAction action) {
        HMMiLiProDevice hMMiLiProDeviceB = b(action);
        if (hMMiLiProDeviceB == null) {
            return false;
        }
        List<HMReminderInfo> listConvert2DeleteInfoList = new ReminderInfoAdapter(action.event).convert2DeleteInfoList();
        if (listConvert2DeleteInfoList.isEmpty()) {
            return false;
        }
        return f(hMMiLiProDeviceB, listConvert2DeleteInfoList);
    }

    private final DeviceManagerApi d() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void e(EventAction action) {
        HMLog.d(this.tag, "action event : " + action.event, new Object[0]);
    }

    private final boolean f(HMMiLiProDevice device, List<? extends HMReminderInfo> infoList) throws InterruptedException {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        device.setReminder(infoList, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.assistant.reminder.ReminderActionOperation$sendCommand2device$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                onFinish(bool.booleanValue());
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                atomicBoolean.set(result);
                this.countDownLatch.countDown();
            }
        });
        this.countDownLatch.await(3L, TimeUnit.SECONDS);
        return atomicBoolean.get();
    }

    private final boolean g(EventAction action) {
        return a(action);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0053, please report this as an issue */
    @Override // com.xiaomi.hm.health.device.assistant.facotry.ActionOperation
    @NotNull
    public ActionResult exec(@NotNull Action action) {
        ActionResult actionResult = new ActionResult(action);
        if (!(action instanceof EventAction)) {
            return actionResult.fail();
        }
        boolean zG = false;
        switch (action.action) {
            case "Update":
                zG = g((EventAction) action);
                break;
            case "Add":
                zG = a((EventAction) action);
                break;
            case "Query":
                e((EventAction) action);
                break;
            case "Delete":
                zG = c((EventAction) action);
                break;
            default:
                HMLog.e(this.tag, "action not implement " + action, new Object[0]);
                break;
        }
        return zG ? actionResult.success() : actionResult.fail();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
