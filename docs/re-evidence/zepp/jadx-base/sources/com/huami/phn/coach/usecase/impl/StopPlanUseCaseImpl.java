package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.PostLocalPlanDetailUseCase;
import com.huami.phn.coach.usecase.StopPlanUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\u00058\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/huami/phn/coach/usecase/impl/StopPlanUseCaseImpl;", "Lcom/huami/phn/coach/usecase/impl/UpdateLocalPlan;", "Lcom/huami/phn/coach/usecase/StopPlanUseCase;", "", "type", "", "reason", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/coach/usecase/UseCaseException;", Command.STOP, "Lcom/huami/phn/core/device/DevicePHNFeature;", GoogleApiAvailabilityLight.a, "Lcom/huami/phn/core/device/DevicePHNFeature;", "device", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "networkCheck", "f", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "", "id", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;", "postPlan", "<init>", "(JLcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;Lcom/huami/phn/core/device/DevicePHNFeature;Lkotlin/jvm/functions/Function0;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class StopPlanUseCaseImpl extends UpdateLocalPlan implements StopPlanUseCase {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DevicePHNFeature device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Function0<Boolean> networkCheck;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Stop plan success!";
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
            return "Stop plan failed!";
        }
    }

    public StopPlanUseCaseImpl(long j, @NotNull LocalDataSource localDataSource, @NotNull PostLocalPlanDetailUseCase postLocalPlanDetailUseCase, @NotNull DevicePHNFeature devicePHNFeature, @NotNull Function0<Boolean> function0) {
        super(j, localDataSource, postLocalPlanDetailUseCase);
        this.device = devicePHNFeature;
        this.networkCheck = function0;
        this.tag = "StopPlanUseCaseImpl";
    }

    @Override // com.huami.phn.coach.usecase.impl.UpdateLocalPlan
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.phn.coach.usecase.StopPlanUseCase
    @NotNull
    public Result<Boolean, UseCaseException> stop(int type, @Nullable String reason) {
        if (!this.networkCheck.invoke().booleanValue()) {
            return Result.INSTANCE.failure$phn_coach_release(UseCaseException.NetException.NetAvailableException.INSTANCE);
        }
        Result<Boolean, BleException> resultStopPhnProject = this.device.stopPhnProject();
        Throwable thExceptionOrNull = resultStopPhnProject.exceptionOrNull();
        if (thExceptionOrNull != null) {
            BleException bleException = (BleException) thExceptionOrNull;
            HMLog.error$default(getTag(), null, bleException, b.a, 2, null);
            return Result.INSTANCE.failure$phn_coach_release(new UseCaseException.DeviceException(bleException));
        }
        ((Boolean) resultStopPhnProject.getValue()).booleanValue();
        HMLog.info(getTag(), a.a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        PHNProjectRecord.PHNProjectSetting.TimeStampAndZone timeStampAndZone = new PHNProjectRecord.PHNProjectSetting.TimeStampAndZone(jCurrentTimeMillis, (-(calendar.get(15) + calendar.get(16))) / 60000);
        PHNProjectRecord pHNProjectRecordQueryProject = ((UpdateLocalPlan) this).local.queryProject(((UpdateLocalPlan) this).id);
        if (pHNProjectRecordQueryProject == null) {
            pHNProjectRecordQueryProject = null;
        } else {
            HMLog.info(getTag(), new UpdateLocalPlan$updateLocal$1$1$1(this, ((UpdateLocalPlan) this).local.saveOrUpdateProject(e.listOf(pHNProjectRecordQueryProject.copy((47 & 1) != 0 ? pHNProjectRecordQueryProject.timestamp : 0L, (47 & 2) != 0 ? pHNProjectRecordQueryProject.version : null, (47 & 4) != 0 ? pHNProjectRecordQueryProject.setting : PHNProjectRecord.PHNProjectSetting.copy$default(pHNProjectRecordQueryProject.getSetting(), null, timeStampAndZone, null, type, reason == null ? "" : reason, 5, null), (47 & 8) != 0 ? pHNProjectRecordQueryProject.result : null, (47 & 16) != 0 ? pHNProjectRecordQueryProject.source : 0, (47 & 32) != 0 ? pHNProjectRecordQueryProject.synced : 0)))));
            ((UpdateLocalPlan) this).postPlan.exec();
        }
        if (pHNProjectRecordQueryProject == null) {
            HMLog.warn$default(getTag(), null, new UpdateLocalPlan.AnonymousClass2(), 2, null);
        }
        return Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
    }
}
