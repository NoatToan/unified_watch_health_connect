package com.xiaomi.hm.health.temperature.usecase;

import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import com.xiaomi.hm.health.temperature.repository.ManualTempRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/temperature/usecase/UploadManualTempUseCase;", "", "", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "data", "", Constant.METHOD_EXECUTE, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "a", "Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "manualTempRepository", "<init>", "(Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class UploadManualTempUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ManualTempRepository manualTempRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ManualTempBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<ManualTempBean> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadManualTempUseCase execute data:" + this.a;
        }
    }

    public UploadManualTempUseCase(@NotNull ManualTempRepository manualTempRepository) {
        this.manualTempRepository = manualTempRepository;
    }

    @Nullable
    public final Object execute(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super Boolean> continuation) {
        HMLog.info("UploadManualTempUseCase", new a(list));
        return this.manualTempRepository.uploadManualTemp(list, continuation);
    }
}
