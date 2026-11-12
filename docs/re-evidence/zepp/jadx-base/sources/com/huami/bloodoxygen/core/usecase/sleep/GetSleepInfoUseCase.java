package com.huami.bloodoxygen.core.usecase.sleep;

import com.huami.bloodoxygen.core.koin.BoSleepInfo;
import com.huami.bloodoxygen.core.koin.ISleepQuery;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/sleep/GetSleepInfoUseCase;", "", "", "date", "Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", Constant.METHOD_EXECUTE, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "a", "Lcom/huami/bloodoxygen/core/koin/ISleepQuery;", "iSleepQuery", "<init>", "(Lcom/huami/bloodoxygen/core/koin/ISleepQuery;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetSleepInfoUseCase {

    @NotNull
    private static final String b = "GetSleepInfoUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepQuery iSleepQuery;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetSleepInfoUseCase execute " + this.a;
        }
    }

    public GetSleepInfoUseCase(@NotNull ISleepQuery iSleepQuery) {
        this.iSleepQuery = iSleepQuery;
    }

    @Nullable
    public final Object execute(@NotNull String str, @NotNull Continuation<? super BoSleepInfo> continuation) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(str), 1, null);
        return this.iSleepQuery.invoke(str, continuation);
    }
}
