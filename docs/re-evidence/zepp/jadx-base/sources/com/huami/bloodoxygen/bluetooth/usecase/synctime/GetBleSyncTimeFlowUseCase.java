package com.huami.bloodoxygen.bluetooth.usecase.synctime;

import com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/usecase/synctime/GetBleSyncTimeFlowUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "a", "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "syncTimeRepo", "<init>", "(Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GetBleSyncTimeFlowUseCase {

    @NotNull
    private static final String b = "GetBleSyncTimeLiveDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenSyncTimeRepo syncTimeRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetBleSyncTimeLiveDataUseCase execute";
        }
    }

    public GetBleSyncTimeFlowUseCase(@NotNull BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo) {
        this.syncTimeRepo = bloodOxygenSyncTimeRepo;
    }

    @NotNull
    public final Flow<Long> execute() {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, a.a, 1, null);
        return this.syncTimeRepo.getBleSyncTimeFlow();
    }
}
