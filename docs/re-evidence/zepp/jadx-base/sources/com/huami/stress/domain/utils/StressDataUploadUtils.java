package com.huami.stress.domain.utils;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.huami.stress.domain.worker.StressDataUploadWorker;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/stress/domain/utils/StressDataUploadUtils;", "Lorg/koin/core/component/KoinComponent;", "", "userId", "", "startUploadStressData", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class StressDataUploadUtils implements KoinComponent {

    @NotNull
    public static final StressDataUploadUtils INSTANCE = new StressDataUploadUtils();

    private StressDataUploadUtils() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startUploadStressData(@NotNull String userId) {
        Pair[] pairArr = {TuplesKt.to("userId", userId)};
        Data.Builder builder = new Data.Builder();
        for (int i = 0; i < 1; i++) {
            Pair pair = pairArr[i];
            builder.put((String) pair.getFirst(), pair.getSecond());
        }
        WorkManager.getInstance((Context) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null)).enqueueUniqueWork(ParamsConst.stressWorker, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(StressDataUploadWorker.class).setInputData(builder.build()).build());
    }
}
