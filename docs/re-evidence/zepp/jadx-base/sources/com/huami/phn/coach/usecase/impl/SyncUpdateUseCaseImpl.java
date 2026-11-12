package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.SyncDevicePhnUseCase;
import com.huami.phn.coach.usecase.SyncUpdateUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DeviceChecker;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.LocalKeeper;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\tB/\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/SyncUpdateUseCaseImpl;", "Lcom/huami/phn/coach/usecase/SyncUpdateUseCase;", "Lcom/huami/phn/core/model/PHNProjectRecord;", "record", "", "source", "Lkotlinx/serialization/json/JsonObject;", "result", "", "a", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/coach/usecase/UseCaseException$DeviceException;", "exec", "Lcom/huami/phn/core/device/DevicePHNFeature;", "Lcom/huami/phn/core/device/DevicePHNFeature;", "device", "Lcom/huami/phn/core/source/LocalDataSource;", "b", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/core/device/DeviceChecker;", "c", "Lcom/huami/phn/core/device/DeviceChecker;", "checker", "Lcom/huami/phn/core/source/LocalKeeper;", GoogleApiAvailabilityLight.a, "Lcom/huami/phn/core/source/LocalKeeper;", HMKeeperConstant.KEEP_XML, "Lcom/huami/phn/coach/usecase/SyncDevicePhnUseCase;", "e", "Lcom/huami/phn/coach/usecase/SyncDevicePhnUseCase;", "syncDevicePhn", "<init>", "(Lcom/huami/phn/core/device/DevicePHNFeature;Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/device/DeviceChecker;Lcom/huami/phn/core/source/LocalKeeper;Lcom/huami/phn/coach/usecase/SyncDevicePhnUseCase;)V", "f", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class SyncUpdateUseCaseImpl implements SyncUpdateUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "SyncUpdateUseCaseImpl";

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DevicePHNFeature device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceChecker checker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LocalKeeper keeper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SyncDevicePhnUseCase syncDevicePhn;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/impl/SyncUpdateUseCaseImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
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
            return "Can not sync PHN!";
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
            return "Daily sync...";
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
            return "No local record!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "PHN has been stopped!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ JsonObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JsonObject jsonObject) {
            super(0);
            this.a = jsonObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sync update failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No data change, skip save!";
        }
    }

    public SyncUpdateUseCaseImpl(@NotNull DevicePHNFeature devicePHNFeature, @NotNull LocalDataSource localDataSource, @NotNull DeviceChecker deviceChecker, @NotNull LocalKeeper localKeeper, @NotNull SyncDevicePhnUseCase syncDevicePhnUseCase) {
        this.device = devicePHNFeature;
        this.local = localDataSource;
        this.checker = deviceChecker;
        this.keeper = localKeeper;
        this.syncDevicePhn = syncDevicePhnUseCase;
    }

    private final void a(PHNProjectRecord record, int source, JsonObject result) {
        Map.Entry<String, JsonElement> next;
        if (record.getResult() != null) {
            boolean z = true;
            if (result.isEmpty()) {
                z = false;
                break;
            }
            Iterator<Map.Entry<String, JsonElement>> it2 = result.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                next = it2.next();
            } while (!(!Intrinsics.areEqual(next.getValue(), record.getResult().get((Object) next.getKey()))));
            if (z) {
                Map mutableMap = r.toMutableMap(record.getResult());
                for (Map.Entry<String, JsonElement> entry : result.entrySet()) {
                    mutableMap.put(entry.getKey(), entry.getValue());
                }
                result = new JsonObject(mutableMap);
            } else {
                result = null;
            }
        }
        JsonObject jsonObject = result;
        if (jsonObject == null) {
            HMLog.info(TAG, h.a);
        } else {
            this.local.saveOrUpdateProject(kotlin.collections.e.listOf(record.copy((47 & 1) != 0 ? record.timestamp : 0L, (47 & 2) != 0 ? record.version : null, (47 & 4) != 0 ? record.setting : null, (47 & 8) != 0 ? record.result : jsonObject, (47 & 16) != 0 ? record.source : source, (47 & 32) != 0 ? record.synced : 0)));
        }
    }

    @Override // com.huami.phn.coach.usecase.SyncUpdateUseCase
    @NotNull
    public Result<Boolean, UseCaseException.DeviceException> exec() {
        BleException bleException = (BleException) this.checker.isPhnEnable().exceptionOrNull();
        if (bleException != null) {
            HMLog.error$default(TAG, null, bleException, b.a, 2, null);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException));
        }
        if (!this.keeper.isDailySynced()) {
            HMLog.info(TAG, c.a);
            return this.syncDevicePhn.exec();
        }
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) CollectionsKt.firstOrNull((List) this.local.queryProject(1, null));
        if (pHNProjectRecord == null) {
            HMLog.info(TAG, d.a);
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = pHNProjectRecord.getSetting().getEndDate();
        boolean z = false;
        if (endDate != null) {
            z = endDate.getTimestamp() > 0;
        }
        if (z) {
            HMLog.info(TAG, e.a);
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        Result<JsonObject, BleException> resultSyncPhnUpdate = this.device.syncPhnUpdate();
        Throwable thExceptionOrNull = resultSyncPhnUpdate.exceptionOrNull();
        if (thExceptionOrNull != null) {
            BleException bleException2 = (BleException) thExceptionOrNull;
            HMLog.error$default(TAG, null, bleException2, g.a, 2, null);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException2));
        }
        JsonObject jsonObject = (JsonObject) resultSyncPhnUpdate.getValue();
        HMLog.info(TAG, new f(jsonObject));
        a(pHNProjectRecord, this.device.deviceSource().getValue(), jsonObject);
        return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
    }
}
