package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zbh, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0005\u001a!\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a<\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0087\bø\u0001\u0000\u001aA\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0002*#\b\u0001\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u0002H\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0017\u001a;\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001aT\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0002*#\b\u0001\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u0002H\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001a=\u0010\u001b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rH\u0087H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001d\"\u001b\u0010\u001e\u001a\u00020\u000b8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"resume", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeWithException", TrackConstants$Events.EXCEPTION, "", "Continuation", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "resumeWith", "Lkotlin/Function1;", "Lkotlin/Result;", "createCoroutine", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", SocialConstants.PARAM_RECEIVER, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "startCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "suspendCoroutine", "block", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coroutineContext", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class resume {
    public static final <T> void d(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        zcp.c(function1, "");
        zcp.c(continuation, "");
        Continuation continuationC = zbg.c(zbg.a(function1, continuation));
        yzc yzcVar = yzc.e;
        yyt.c cVar = yyt.f53903b;
        continuationC.resumeWith(yyt.e(yzcVar));
    }

    public static final <R, T> void e(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        zcp.c(function2, "");
        zcp.c(continuation, "");
        Continuation continuationC = zbg.c(zbg.a(function2, r, continuation));
        yzc yzcVar = yzc.e;
        yyt.c cVar = yyt.f53903b;
        continuationC.resumeWith(yyt.e(yzcVar));
    }
}
