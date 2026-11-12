package com.xiaomi.hm.health.device.feature.sync;

import android.content.Context;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.IDeviceStatusChanged;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/StatusTypeConvert;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/dto/ProgressDto;", "progress", "", "convertProgress", "subString", "mergeString", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "statusDto", "convertStatus", "", "errorCode", "convertErrorCode", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Context;", "Lcom/huami/devicex/manager/IDeviceStatusChanged;", "deviceStatusChange", "Lcom/huami/devicex/manager/IDeviceStatusChanged;", "tag", "Ljava/lang/String;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "Lkotlin/Lazy;", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "(Landroid/content/Context;Lcom/huami/devicex/manager/IDeviceStatusChanged;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StatusTypeConvert implements KoinComponent {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @NotNull
    private final IDeviceStatusChanged deviceStatusChange;

    @NotNull
    private final String tag = "StatusTypeConvert";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceWorkStatus.values().length];
            iArr[DeviceWorkStatus.NORMAL.ordinal()] = 1;
            iArr[DeviceWorkStatus.RUNNING.ordinal()] = 2;
            iArr[DeviceWorkStatus.EXCEPTION.ordinal()] = 3;
            iArr[DeviceWorkStatus.FINISHED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatusTypeConvert(@NotNull Context context, @NotNull IDeviceStatusChanged iDeviceStatusChanged) {
        this.context = context;
        this.deviceStatusChange = iDeviceStatusChanged;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.StatusTypeConvert$special$$inlined$inject$default$1
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

    private final String convertProgress(ProgressDto progress) {
        if (progress == null) {
            return "";
        }
        JobType type = progress.getType();
        JobType.Companion companion = JobType.INSTANCE;
        if (Intrinsics.areEqual(type, companion.getActivities()) ? true : Intrinsics.areEqual(type, companion.getHR()) ? true : Intrinsics.areEqual(type, companion.getAF()) ? true : Intrinsics.areEqual(type, companion.getECG()) ? true : Intrinsics.areEqual(type, companion.getPPG())) {
            return this.context.getString(R.string.sync_center_type_activity_record);
        }
        if (Intrinsics.areEqual(type, companion.getPAI())) {
            return this.context.getString(R.string.pai);
        }
        if (Intrinsics.areEqual(type, companion.getWEIGHT_FAT())) {
            return this.context.getString(R.string.sync_center_type_weight);
        }
        if (Intrinsics.areEqual(type, companion.getFIRST_BEAT()) ? true : Intrinsics.areEqual(type, companion.getSPO2()) ? true : Intrinsics.areEqual(type, companion.getPRESSURE()) ? true : Intrinsics.areEqual(type, companion.getFEMALE_HEALTH()) ? true : Intrinsics.areEqual(type, companion.getBODY_TEMPERATURE()) ? true : Intrinsics.areEqual(type, companion.getDEVICE_STATISTIC())) {
            return this.context.getString(R.string.sync_center_type_health);
        }
        return Intrinsics.areEqual(type, companion.getSportRecords()) ? this.context.getString(R.string.sync_center_type_sport_recode) : "";
    }

    private final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final String mergeString(String subString) {
        return this.context.getString(R.string.sync_center_message_label, subString);
    }

    public final int convertErrorCode(int errorCode) {
        if (errorCode != 4) {
            if (errorCode == 5) {
                return 7;
            }
            if (errorCode == 6) {
                return 21;
            }
            if (errorCode == 7) {
                return 6;
            }
        }
        return -1;
    }

    @NotNull
    public final String convertStatus(@NotNull WorkStatusDto statusDto) {
        HMLog.w(this.tag, "status -> " + statusDto, new Object[0]);
        int i = WhenMappings.$EnumSwitchMapping$0[statusDto.getWorkStatus().ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return mergeString(convertProgress(statusDto.getProgress()));
        }
        if (i != 3) {
            return i != 4 ? "" : this.context.getString(R.string.sync_center_message_success);
        }
        return this.context.getString(R.string.watch_skin_sync_fail);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
