package com.huami.bloodoxygen.core.usecase.other;

import com.huami.bloodoxygen.core.local.database.BloodOxygenDatabase;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/other/ClearAllUserDataUseCase;", "", "", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "a", "Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;", "database", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kvKit", "<init>", "(Lcom/huami/bloodoxygen/core/local/database/BloodOxygenDatabase;Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class ClearAllUserDataUseCase {

    @NotNull
    private static final String c = "ClearAllUserDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenDatabase database;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kvKit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ClearAllUserDataUseCase execute";
        }
    }

    public ClearAllUserDataUseCase(@NotNull BloodOxygenDatabase bloodOxygenDatabase, @NotNull KvPersistence kvPersistence) {
        this.database = bloodOxygenDatabase;
        this.kvKit = kvPersistence;
    }

    @Nullable
    public final Object execute(@NotNull Continuation<? super Unit> continuation) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, a.a, 1, null);
        this.database.clearAllTables();
        this.kvKit.clear();
        return Unit.INSTANCE;
    }
}
