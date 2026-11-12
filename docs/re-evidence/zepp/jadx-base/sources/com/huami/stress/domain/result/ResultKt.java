package com.huami.stress.domain.result;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\"%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/stress/domain/result/Result;", "fallback", "successOr", "(Lcom/huami/stress/domain/result/Result;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "liveData", "", "updateOnSuccess", "getData", "(Lcom/huami/stress/domain/result/Result;)Ljava/lang/Object;", "data", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class ResultKt {
    @Nullable
    public static final <T> T getData(@NotNull Result<? extends T> result) {
        Result.Success success = result instanceof Result.Success ? (Result.Success) result : null;
        if (success == null) {
            return null;
        }
        return (T) success.getData();
    }

    public static final <T> T successOr(@NotNull Result<? extends T> result, T t) {
        T t2;
        Result.Success success = result instanceof Result.Success ? (Result.Success) result : null;
        return (success == null || (t2 = (T) success.getData()) == null) ? t : t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void updateOnSuccess(Result<? extends T> result, MutableLiveData<T> mutableLiveData) {
        if (result instanceof Result.Success) {
            mutableLiveData.setValue(((Result.Success) result).getData());
        }
    }
}
