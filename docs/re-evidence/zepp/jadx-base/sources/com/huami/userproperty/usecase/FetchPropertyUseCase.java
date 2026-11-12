package com.huami.userproperty.usecase;

import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.api.UserPropertyApi;
import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.tekartik.sqflite.Constant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", "", "Lcom/huami/userproperty/entity/AbsFetchParams;", "params", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "", "Lcom/huami/userproperty/entity/RawResult;", Constant.METHOD_EXECUTE, "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "a", "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "saveFetchResultUseCase", "<init>", "(Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class FetchPropertyUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SaveFetchResultUseCase saveFetchResultUseCase;

    public FetchPropertyUseCase(@NotNull SaveFetchResultUseCase saveFetchResultUseCase) {
        this.saveFetchResultUseCase = saveFetchResultUseCase;
    }

    @NotNull
    public final FetchResult<Map<String, String>> execute(@NotNull AbsFetchParams params) {
        String strInvoke = UserPropertyManager.INSTANCE.getDefaultApi().invoke();
        UserPropertyApi userPropertyApi = UserPropertyApi.INSTANCE;
        List<String> keys = params.getKeys();
        String mode = params.getMode();
        String api = params.getApi();
        if (api != null) {
            strInvoke = api;
        }
        FetchResult<Map<String, String>> fetchResultFetch = userPropertyApi.fetch(keys, mode, strInvoke);
        if (fetchResultFetch instanceof FetchResult.Success) {
            this.saveFetchResultUseCase.execute(params, (Map) ((FetchResult.Success) fetchResultFetch).getValue());
        }
        return fetchResultFetch;
    }
}
