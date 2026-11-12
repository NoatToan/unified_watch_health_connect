package com.huami.sky.lib.repo;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.api.UploadUserDataApi;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.DeviceStatus;
import com.huami.sky.lib.entity.HeartRate;
import com.huami.sky.lib.entity.MusicPlayRecord;
import com.huami.sky.lib.entity.UserAction;
import com.huami.sky.lib.utils.AnalyticsConstant;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.data.NotificationData;
import com.xiaomi.hm.health.bt.device.Status;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0012\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/huami/sky/lib/repo/DeviceDataRepositoryImpl;", "Lcom/huami/sky/lib/repo/DeviceDataRepository;", "", "type", "", "a", "receivedDeviceDataForUpload", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/sky/lib/entity/UserAction;", NotificationData.WearableExtrasData.KEY_ACTIONS, "Lcom/huami/sky/lib/entity/MusicPlayRecord;", "records", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "data", "Lcom/huami/sky/lib/entity/HeartRate;", Constants.DATA_KEY_HR, "", "uploadDeviceData", "(Ljava/util/List;Ljava/util/List;Lcom/huami/sky/lib/entity/DeviceDataEntity;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getSleepStateFlow", "", WebConstant.QueryParam.CLIP_ID, "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "status", "uploadDeviceStatus", "(Ljava/lang/String;Lcom/huami/sky/lib/assist/SkyDeviceStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceDataApi", "Lcom/huami/sky/lib/api/UploadUserDataApi;", "b", "Lcom/huami/sky/lib/api/UploadUserDataApi;", "uploadDataApi", "<init>", "(Lcom/huami/sky/lib/api/DeviceDataApi;Lcom/huami/sky/lib/api/UploadUserDataApi;)V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataRepositoryImpl implements DeviceDataRepository {
    public static final int halfMinute = 30000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataApi deviceDataApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final UploadUserDataApi uploadDataApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkyDeviceStatus.values().length];
            iArr[SkyDeviceStatus.CONNECTING.ordinal()] = 1;
            iArr[SkyDeviceStatus.CONNECT_SUCCESS.ordinal()] = 2;
            iArr[SkyDeviceStatus.CONNECT_FAIL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "监听RR数据";
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
            return "监听实时心率";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<HeartRate> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<HeartRate> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "list hr size is " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    public DeviceDataRepositoryImpl(@NotNull DeviceDataApi deviceDataApi, @NotNull UploadUserDataApi uploadUserDataApi) {
        this.deviceDataApi = deviceDataApi;
        this.uploadDataApi = uploadUserDataApi;
    }

    private final void a(int type) {
        CountEventBuilder countEventBuilder = new CountEventBuilder(AnalyticsConstant.EVENT_ID_UPLOAD_FAILURE);
        countEventBuilder.addExtra("type", String.valueOf(type));
        Analytics.recordEvent(countEventBuilder);
    }

    @Override // com.huami.sky.lib.repo.DeviceDataRepository
    @NotNull
    public Flow<Integer> getSleepStateFlow() {
        return this.deviceDataApi.sleepStateNotify();
    }

    @Override // com.huami.sky.lib.repo.DeviceDataRepository
    @Nullable
    public Object receivedDeviceDataForUpload(@NotNull Continuation<? super Unit> continuation) {
        if (this.deviceDataApi.isSupportRrInterval()) {
            HMLog.info("DeviceDataRepositoryImpl", a.a);
            Object objCollect = this.deviceDataApi.registerDeviceData().collect(new FlowCollector<DeviceDataEntity>() { // from class: com.huami.sky.lib.repo.DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(DeviceDataEntity deviceDataEntity, @NotNull Continuation<? super Unit> continuation2) {
                    Object objUploadDeviceData = this.a.uploadDeviceData(null, null, deviceDataEntity, null, continuation2);
                    return objUploadDeviceData == a.getCOROUTINE_SUSPENDED() ? objUploadDeviceData : Unit.INSTANCE;
                }
            }, continuation);
            return objCollect == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
        HMLog.info("DeviceDataRepositoryImpl", b.a);
        Object objCollect2 = this.deviceDataApi.registerHeartRate().collect(new DeviceDataRepositoryImpl$receivedDeviceDataForUpload$$inlined$collect$2(new ArrayList(), this), continuation);
        return objCollect2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
    }

    @Override // com.huami.sky.lib.repo.DeviceDataRepository
    @Nullable
    public Object uploadDeviceData(@Nullable List<UserAction> list, @Nullable List<MusicPlayRecord> list2, @Nullable DeviceDataEntity deviceDataEntity, @Nullable List<HeartRate> list3, @NotNull Continuation<? super Boolean> continuation) {
        int i;
        if (list3 != null) {
            i = 0;
        } else {
            i = deviceDataEntity != null ? 1 : 2;
        }
        try {
            boolean zUploadData = this.uploadDataApi.uploadData(list, list2, deviceDataEntity, list3);
            if (!zUploadData) {
                a(i);
            }
            return Boxing.boxBoolean(zUploadData);
        } catch (Exception e) {
            a(i);
            e.printStackTrace();
            return Boxing.boxBoolean(false);
        }
    }

    @Override // com.huami.sky.lib.repo.DeviceDataRepository
    @Nullable
    public Object uploadDeviceStatus(@NotNull String str, @Nullable SkyDeviceStatus skyDeviceStatus, @NotNull Continuation<? super Unit> continuation) {
        String str2;
        int i = skyDeviceStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[skyDeviceStatus.ordinal()];
        if (i == -1) {
            str2 = "noenable";
        } else if (i == 1) {
            str2 = "connecting";
        } else if (i == 2) {
            str2 = Status.PRE_CONNECT_STATE_CONNECTED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "connectFailed";
        }
        try {
            this.uploadDataApi.uploadDeviceStatus(new DeviceStatus(str, str2, skyDeviceStatus == null ? null : Boxing.boxInt(this.deviceDataApi.getDeviceSource()), System.currentTimeMillis()));
        } catch (Exception e) {
            HMLog.error$default("DeviceDataRepositoryImpl", null, e.getCause(), new d(e), 2, null);
        }
        return Unit.INSTANCE;
    }
}
