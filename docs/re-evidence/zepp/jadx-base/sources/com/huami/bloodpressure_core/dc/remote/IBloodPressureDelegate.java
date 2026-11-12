package com.huami.bloodpressure_core.dc.remote;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/IBloodPressureDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "", "next", "", "getUserAllData", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "", "postDataList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeStamp", "delData", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface IBloodPressureDelegate<T, R> {
    @Nullable
    Object delData(long j, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getUserAllData(@Nullable Long l, @NotNull Continuation<? super List<? extends T>> continuation);

    @Nullable
    Object postDataList(@NotNull List<? extends R> list, @NotNull Continuation<? super Boolean> continuation);
}
