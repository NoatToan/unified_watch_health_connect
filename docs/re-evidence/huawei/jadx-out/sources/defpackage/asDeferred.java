package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: zku, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a[\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e¢\u0006\u0002\b\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/common/util/concurrent/ListenableFuture;", "asListenableFuture", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "nonNullCause", "", "Ljava/util/concurrent/ExecutionException;", "kotlinx-coroutines-guava"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class asDeferred {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable d(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        zcp.e(cause);
        return cause;
    }

    public static final <T> Object c(ListenableFuture<T> listenableFuture, Continuation<? super T> continuation) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return aro.d(listenableFuture);
            }
            zgf zgfVar = new zgf(zbg.c(continuation), 1);
            zgfVar.initCancellability();
            zgf zgfVar2 = zgfVar;
            listenableFuture.addListener(new zlb(listenableFuture, zgfVar2), aqx.e());
            zgfVar2.invokeOnCancellation(new e(listenableFuture));
            Object objB = zgfVar.b();
            if (objB == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            return objB;
        } catch (ExecutionException e2) {
            throw d(e2);
        }
    }

    /* JADX INFO: renamed from: zku$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function1<Throwable, yzc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListenableFuture<T> f54250a;

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ yzc invoke(Throwable th) {
            d(th);
            return yzc.e;
        }

        public final void d(Throwable th) {
            this.f54250a.cancel(false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ListenableFuture<T> listenableFuture) {
            super(1);
            this.f54250a = listenableFuture;
        }
    }
}
