package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.RestorePHNPlanUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DeviceChecker;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/RestorePHNPlanUseCaseImpl;", "Lcom/huami/phn/coach/usecase/RestorePHNPlanUseCase;", "", "a", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/coach/usecase/UseCaseException$DeviceException;", "exec", "Lcom/huami/phn/core/device/DevicePHNFeature;", "Lcom/huami/phn/core/device/DevicePHNFeature;", "device", "Lcom/huami/phn/core/source/LocalDataSource;", "b", "Lcom/huami/phn/core/source/LocalDataSource;", "source", "Lcom/huami/phn/core/device/DeviceChecker;", "c", "Lcom/huami/phn/core/device/DeviceChecker;", "checker", "<init>", "(Lcom/huami/phn/core/device/DevicePHNFeature;Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/device/DeviceChecker;)V", GoogleApiAvailabilityLight.a, "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class RestorePHNPlanUseCaseImpl implements RestorePHNPlanUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "RestorePHNPlanUseCaseImpl";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DevicePHNFeature device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceChecker checker;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/impl/RestorePHNPlanUseCaseImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
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
            return "Can not restore PHN!";
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
            return "Stop device phn - No local record!";
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
            return "Stop device phn - PHN has been stopped!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ PHNProjectRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PHNProjectRecord pHNProjectRecord) {
            super(0);
            this.a = pHNProjectRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Restore phn: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Restore phn failed!";
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
            return "Stop device phn success!";
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
            return "Stop device phn failed!";
        }
    }

    public RestorePHNPlanUseCaseImpl(@NotNull DevicePHNFeature devicePHNFeature, @NotNull LocalDataSource localDataSource, @NotNull DeviceChecker deviceChecker) {
        this.device = devicePHNFeature;
        this.source = localDataSource;
        this.checker = deviceChecker;
    }

    private final void a() {
        Result<Boolean, BleException> resultStopPhnProject = this.device.stopPhnProject();
        Throwable thExceptionOrNull = resultStopPhnProject.exceptionOrNull();
        if (thExceptionOrNull != null) {
            HMLog.error$default(TAG, null, (BleException) thExceptionOrNull, h.a, 2, null);
        } else {
            ((Boolean) resultStopPhnProject.getValue()).booleanValue();
            HMLog.info(TAG, g.a);
        }
    }

    @Override // com.huami.phn.coach.usecase.RestorePHNPlanUseCase
    @NotNull
    public Result<Boolean, UseCaseException.DeviceException> exec() {
        BleException bleException = (BleException) this.checker.isPhnEnable().exceptionOrNull();
        if (bleException != null) {
            HMLog.error$default(TAG, null, bleException, b.a, 2, null);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException));
        }
        PHNProjectRecord pHNProjectRecord = (PHNProjectRecord) CollectionsKt.firstOrNull((List) this.source.queryProject(1, null));
        if (pHNProjectRecord == null) {
            HMLog.info(TAG, c.a);
            a();
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone endDate = pHNProjectRecord.getSetting().getEndDate();
        boolean z = false;
        if (endDate != null) {
            z = endDate.getTimestamp() > 0;
        }
        if (z) {
            HMLog.info(TAG, d.a);
            a();
            return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
        }
        Result<Boolean, BleException> resultStartPhnProject = this.device.startPhnProject(pHNProjectRecord);
        Throwable thExceptionOrNull = resultStartPhnProject.exceptionOrNull();
        if (thExceptionOrNull != null) {
            BleException bleException2 = (BleException) thExceptionOrNull;
            HMLog.error$default(TAG, null, bleException2, f.a, 2, null);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException2));
        }
        ((Boolean) resultStartPhnProject.getValue()).booleanValue();
        PHNProjectRecord pHNProjectRecordCopy = pHNProjectRecord.copy((47 & 1) != 0 ? pHNProjectRecord.timestamp : 0L, (47 & 2) != 0 ? pHNProjectRecord.version : null, (47 & 4) != 0 ? pHNProjectRecord.setting : null, (47 & 8) != 0 ? pHNProjectRecord.result : null, (47 & 16) != 0 ? pHNProjectRecord.source : this.device.deviceSource().getValue(), (47 & 32) != 0 ? pHNProjectRecord.synced : 0);
        HMLog.info(TAG, new e(pHNProjectRecordCopy));
        this.source.saveOrUpdateProject(kotlin.collections.e.listOf(pHNProjectRecordCopy));
        return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
    }
}
