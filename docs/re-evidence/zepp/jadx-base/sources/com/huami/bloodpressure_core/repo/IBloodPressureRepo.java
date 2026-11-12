package com.huami.bloodpressure_core.repo;

import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J#\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "", "", "getUserData", "cleanData", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "saveAndPostData", "saveAndPostNightData", "", "dateString", "", "days", "getRemoteNightData", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureRepo {
    void cleanData();

    @Nullable
    Object getRemoteNightData(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation);

    void getUserData();

    void saveAndPostData(@NotNull List<BloodPressureDbVo> list);

    void saveAndPostNightData(@NotNull List<BloodPressureDbVo> list);
}
