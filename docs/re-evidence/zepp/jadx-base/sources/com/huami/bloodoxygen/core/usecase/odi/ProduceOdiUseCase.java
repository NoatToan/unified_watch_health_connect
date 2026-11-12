package com.huami.bloodoxygen.core.usecase.odi;

import com.huami.bloodoxygen.core.koin.BoSleepInfo;
import com.huami.bloodoxygen.core.local.process.OdiFactory;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.core.utils.SharedInstanceKt;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/odi/ProduceOdiUseCase;", "", "", "Lcom/huami/bloodoxygen/core/koin/BoSleepInfo;", "infoListBo", "", Constant.METHOD_EXECUTE, "infoBo", "Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", "a", "Lcom/huami/bloodoxygen/core/local/process/OdiFactory;", "odiFactory", "<init>", "(Lcom/huami/bloodoxygen/core/local/process/OdiFactory;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class ProduceOdiUseCase {

    @NotNull
    private static final String b = "ProduceOdiUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final OdiFactory odiFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<BoSleepInfo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BoSleepInfo> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ProduceOdiUseCase execute " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BoSleepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BoSleepInfo boSleepInfo) {
            super(0);
            this.a = boSleepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ProduceOdiUseCase execute " + SharedInstanceKt.getGson().toJson(this.a);
        }
    }

    public ProduceOdiUseCase(@NotNull OdiFactory odiFactory) {
        this.odiFactory = odiFactory;
    }

    public final void execute(@NotNull List<BoSleepInfo> infoListBo) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(infoListBo), 1, null);
        this.odiFactory.produce(infoListBo);
    }

    public final void execute(@NotNull BoSleepInfo infoBo) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new b(infoBo), 1, null);
        this.odiFactory.produce(infoBo);
    }
}
