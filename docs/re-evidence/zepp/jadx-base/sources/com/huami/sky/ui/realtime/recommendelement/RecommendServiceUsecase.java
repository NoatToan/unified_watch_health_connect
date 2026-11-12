package com.huami.sky.ui.realtime.recommendelement;

import androidx.exifinterface.media.ExifInterface;
import com.huami.heartrate.HelperKt;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.sleep.service.SleepService;
import com.huami.step.service.StepService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0001H\u0082\b¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "", ExifInterface.GPS_DIRECTION_TRUE, "b", "()Ljava/lang/Object;", "Lorg/koin/core/Koin;", "a", "Lcom/huami/sleep/service/SleepService;", "getSleepService", "Lcom/huami/step/service/StepService;", "getStepService", "Lcom/huami/heartrate/service/IHeartRateService;", "getHeartRateService", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RecommendServiceUsecase {

    @NotNull
    public static final RecommendServiceUsecase INSTANCE = new RecommendServiceUsecase();

    private RecommendServiceUsecase() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Koin a() {
        return GlobalContext.INSTANCE.get();
    }

    private final /* synthetic */ <T> T b() {
        Scope rootScope = a().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    @Nullable
    public final IHeartRateService getHeartRateService() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(HelperKt.getHeartRateService$default(null, 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (IHeartRateService) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Nullable
    public final SleepService getSleepService() {
        return (SleepService) a().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SleepService.class), null, null);
    }

    @Nullable
    public final StepService getStepService() {
        return (StepService) a().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(StepService.class), null, null);
    }
}
