package com.huami.bloodoxygen.core.usecase.odi;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bigdata.statistics.core.resource.Failure;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.Success;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "Lcom/huami/bigdata/statistics/core/resource/Resource;", "mapToResourceNoSuspend", "core_release"}, k = 2, mv = {1, 5, 1})
public final class GetLocalSleepBreathScoreListUseCaseKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "successOrFailure error " + this.a.getMessage();
        }
    }

    @NotNull
    public static final <T> Resource<T> mapToResourceNoSuspend(@NotNull Function0<? extends T> function0) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(function0.invoke()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info$default(null, new a(thM3848exceptionOrNullimpl), 1, null);
        }
        Throwable thM3848exceptionOrNullimpl2 = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl2 != null) {
            objM3845constructorimpl = new Failure(thM3848exceptionOrNullimpl2.getMessage(), null, 2, null);
        }
        return (Resource) objM3845constructorimpl;
    }
}
