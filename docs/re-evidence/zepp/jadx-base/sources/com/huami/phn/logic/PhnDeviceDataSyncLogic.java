package com.huami.phn.logic;

import androidx.exifinterface.media.ExifInterface;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.usecase.PostLocalDailyAnalysisUseCase;
import com.huami.phn.coach.usecase.PostLocalPlanDetailUseCase;
import com.huami.phn.coach.usecase.SyncDevicePhnUseCase;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.util.Result;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0005\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u0001H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/phn/logic/PhnDeviceDataSyncLogic;", "", "", "startSync", ExifInterface.GPS_DIRECTION_TRUE, "a", "()Ljava/lang/Object;", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PhnDeviceDataSyncLogic {

    @NotNull
    public static final PhnDeviceDataSyncLogic INSTANCE = new PhnDeviceDataSyncLogic();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "PhnDeviceDataSyncLogic";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sync success!";
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
            return "Sync failed!";
        }
    }

    private PhnDeviceDataSyncLogic() {
    }

    private final /* synthetic */ <T> T a() {
        Scope phnProjectKoinScope = PHNProjectModuleKt.getPhnProjectKoinScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) phnProjectKoinScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    @JvmStatic
    public static final boolean startSync() {
        Result<Boolean, UseCaseException.DeviceException> resultExec = ((SyncDevicePhnUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(SyncDevicePhnUseCase.class), null, null)).exec();
        Throwable thExceptionOrNull = resultExec.exceptionOrNull();
        if (thExceptionOrNull != null) {
            HMLog.error$default(TAG, null, null, b.a, 6, null);
            return false;
        }
        ((Boolean) resultExec.getValue()).booleanValue();
        HMLog.info(TAG, a.a);
        ((PostLocalPlanDetailUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PostLocalPlanDetailUseCase.class), null, null)).exec();
        ((PostLocalDailyAnalysisUseCase) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(PostLocalDailyAnalysisUseCase.class), null, null)).exec();
        return true;
    }
}
