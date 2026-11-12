package com.huami.bloodoxygen.core.usecase.heartrate;

import com.huami.bloodoxygen.core.koin.BoHeartRate;
import com.huami.bloodoxygen.core.koin.IHeartRateQuery;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/heartrate/GetHeartRateInfoUseCase;", "", "", "", "dates", "Lcom/huami/bloodoxygen/core/koin/BoHeartRate;", Constant.METHOD_EXECUTE, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/koin/IHeartRateQuery;", "a", "Lcom/huami/bloodoxygen/core/koin/IHeartRateQuery;", "iHeartRateQuery", "<init>", "(Lcom/huami/bloodoxygen/core/koin/IHeartRateQuery;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetHeartRateInfoUseCase {

    @NotNull
    private static final String b = "GetHeartRateInfoUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateQuery iHeartRateQuery;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetHeartRateInfoUseCase execute " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    public GetHeartRateInfoUseCase(@NotNull IHeartRateQuery iHeartRateQuery) {
        this.iHeartRateQuery = iHeartRateQuery;
    }

    @Nullable
    public final Object execute(@NotNull List<String> list, @NotNull Continuation<? super List<BoHeartRate>> continuation) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(list), 1, null);
        return this.iHeartRateQuery.invoke(list, continuation);
    }
}
