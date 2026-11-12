package com.huami.phn.core.webapi;

import com.huami.phn.core.webapi.impl.PHNInitWebApiImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/phn/core/webapi/PHNInitWebApi;", "", "", "jsonData", PHNInitWebApiImpl.PARAM_PHN_ALGO_VERSION, "postPHNInitData", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public interface PHNInitWebApi {
    @NotNull
    String postPHNInitData(@NotNull String jsonData, @NotNull String algoVersion);
}
