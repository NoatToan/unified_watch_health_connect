package com.huami.userproperty.usecase;

import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.entity.FetchParams;
import com.tekartik.sqflite.Constant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "", "Lcom/huami/userproperty/entity/AbsFetchParams;", "params", "", "", "resultMap", "", Constant.METHOD_EXECUTE, "propertyKey", "apiUrl", "singleValue", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "a", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalLocalDataSource", "<init>", "(Lcom/huami/userproperty/datasource/InternalLocalDataSource;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class SaveFetchResultUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InternalLocalDataSource internalLocalDataSource;

    public SaveFetchResultUseCase(@NotNull InternalLocalDataSource internalLocalDataSource) {
        this.internalLocalDataSource = internalLocalDataSource;
    }

    public final void execute(@NotNull String propertyKey, @Nullable String apiUrl, @Nullable String singleValue) {
        execute(new FetchParams(propertyKey, "SINGLE", apiUrl), q.mapOf(TuplesKt.to(propertyKey, singleValue)));
    }

    public final void execute(@NotNull AbsFetchParams params, @Nullable Map<? extends String, String> resultMap) {
        if (resultMap != null) {
            for (Map.Entry<? extends String, String> entry : resultMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                this.internalLocalDataSource.saveLocal(key, params.getApi(), value);
                this.internalLocalDataSource.saveLastSync(key, params.getApi(), value);
            }
        }
        if (Intrinsics.areEqual(params.getMode(), "RANGE") && params.getKeys().size() == 1) {
            this.internalLocalDataSource.saveFetchedRangeKey((String) CollectionsKt.first((List) params.getKeys()), params.getApi());
        }
    }
}
