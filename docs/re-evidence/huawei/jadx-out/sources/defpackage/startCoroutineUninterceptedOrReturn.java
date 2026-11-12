package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zbe, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u001aA\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0006\u001aZ\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002*#\b\u0001\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001aV\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002*#\b\u0001\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001¢\u0006\u0002\u0010\f\u001an\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0002*)\b\u0001\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\u000f\u001a\u0002H\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aj\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0002*)\b\u0001\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0006\u0010\u000f\u001a\u0002H\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0013\u001aZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0002*#\b\u0001\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007\u001aF\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001c\b\u0004\u0010\u0017\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0083\b¢\u0006\u0002\b\u0018\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0002¢\u0006\u0002\b\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"startCoroutineUninterceptedOrReturn", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", SocialConstants.PARAM_RECEIVER, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", RemoteMessageConst.MessageBody.PARAM, "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCoroutineUnintercepted", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "createCoroutineFromSuspendFunction", "block", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createSimpleCoroutineForSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class startCoroutineUninterceptedOrReturn {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<yzc> a(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        zcp.c(function1, "");
        zcp.c(continuation, "");
        Continuation<?> continuationA = probeCoroutineCreated.a(continuation);
        if (function1 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function1).create(continuationA);
        }
        CoroutineContext context = continuationA.getD();
        if (context == zbf.f53962b) {
            return new d(continuationA, function1);
        }
        return new b(continuationA, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> Continuation<yzc> a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        zcp.c(function2, "");
        zcp.c(continuation, "");
        Continuation<?> continuationA = probeCoroutineCreated.a(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, continuationA);
        }
        CoroutineContext context = continuationA.getD();
        if (context == zbf.f53962b) {
            return new c(continuationA, function2, r);
        }
        return new e(continuationA, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<T> c(Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        zcp.c(continuation, "");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.intercepted()) == null) ? continuation : continuation2;
    }

    /* JADX INFO: renamed from: zbe$c */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends RestrictedContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f53957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f53958b;
        final /* synthetic */ Function2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, Function2 function2, Object obj) {
            super(continuation);
            this.d = function2;
            this.f53958b = obj;
            zcp.e(continuation, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object result) {
            int i = this.f53957a;
            if (i != 0) {
                if (i == 1) {
                    this.f53957a = 2;
                    createFailure.c(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f53957a = 1;
            createFailure.c(result);
            zcp.e(this.d, "");
            return ((Function2) zcy.c(this.d, 2)).invoke(this.f53958b, this);
        }
    }

    /* JADX INFO: renamed from: zbe$d */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends RestrictedContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f53959a;
        private int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, Function1 function1) {
            super(continuation);
            this.f53959a = function1;
            zcp.e(continuation, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object result) {
            int i = this.d;
            if (i != 0) {
                if (i == 1) {
                    this.d = 2;
                    createFailure.c(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.d = 1;
            createFailure.c(result);
            zcp.e(this.f53959a, "");
            return ((Function1) zcy.c(this.f53959a, 1)).invoke(this);
        }
    }

    /* JADX INFO: renamed from: zbe$b */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f53956a;
        private int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, CoroutineContext coroutineContext, Function1 function1) {
            super(continuation, coroutineContext);
            this.f53956a = function1;
            zcp.e(continuation, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object result) {
            int i = this.e;
            if (i != 0) {
                if (i == 1) {
                    this.e = 2;
                    createFailure.c(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.e = 1;
            createFailure.c(result);
            zcp.e(this.f53956a, "");
            return ((Function1) zcy.c(this.f53956a, 1)).invoke(this);
        }
    }

    /* JADX INFO: renamed from: zbe$e */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f53960a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f53961c;
        private int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(continuation, coroutineContext);
            this.f53961c = function2;
            this.f53960a = obj;
            zcp.e(continuation, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object result) {
            int i = this.e;
            if (i != 0) {
                if (i == 1) {
                    this.e = 2;
                    createFailure.c(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.e = 1;
            createFailure.c(result);
            zcp.e(this.f53961c, "");
            return ((Function2) zcy.c(this.f53961c, 2)).invoke(this.f53960a, this);
        }
    }
}
