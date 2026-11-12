package com.huami.heartrate.resting.datasource;

import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.koin.KoinExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/heartrate/resting/datasource/RestingHrDataSource;", "Lcom/huami/heartrate/resting/datasource/IRestingHrDataSource;", "", "dateFrom", "dateEnd", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/heartrate/dto/RestingHeartRate;", "fetchRestingHr", "", "a", "Ljava/lang/String;", "userId", "<init>", "(Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class RestingHrDataSource implements IRestingHrDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public RestingHrDataSource(@NotNull String str) {
        this.userId = str;
    }

    @Override // com.huami.heartrate.resting.datasource.IRestingHrDataSource
    @NotNull
    public Flow<List<RestingHeartRate>> fetchRestingHr(long dateFrom, long dateEnd) {
        return KoinExtKt.getHeartRateDataDelegate().fetchRestingHeartRate(dateFrom, dateEnd, this.userId);
    }
}
