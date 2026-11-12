package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: zma, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u000b\u001aC\u0010\f\u001a\u0004\u0018\u00010\r\"\u0004\b\u0000\u0010\u0004*\u0018\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0004`\u00052\u0006\u0010\u0006\u001a\u0002H\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0004\"\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0011"}, d2 = {"bindCancellationFun", "Lkotlin/Function1;", "", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", FunctionSetBeanReader.BI_ELEMENT, ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "callUndeliveredElement", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "callUndeliveredElementCatchingException", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class bindCancellationFun {
    public static /* synthetic */ zmn c(Function1 function1, Object obj, zmn zmnVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            zmnVar = null;
        }
        return c(function1, obj, zmnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> zmn c(Function1<? super E, yzc> function1, E e2, zmn zmnVar) {
        try {
            function1.invoke(e2);
            return zmnVar;
        } catch (Throwable th) {
            if (zmnVar == null || zmnVar.getCause() == th) {
                return new zmn("Exception in undelivered element handler for " + e2, th);
            }
            yyl.d(zmnVar, th);
            return zmnVar;
        }
    }

    public static final <E> void d(Function1<? super E, yzc> function1, E e2, CoroutineContext coroutineContext) {
        zmn zmnVarC = c(function1, e2, null);
        if (zmnVarC != null) {
            CoroutineExceptionHandler.b(coroutineContext, zmnVarC);
        }
    }

    /* JADX INFO: renamed from: zma$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "<anonymous parameter 0>", "", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function1<Throwable, yzc> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ E f54294c;
        final /* synthetic */ Function1<E, yzc> d;
        final /* synthetic */ CoroutineContext e;

        public final void b(Throwable th) {
            bindCancellationFun.d(this.d, this.f54294c, this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ yzc invoke(Throwable th) {
            b(th);
            return yzc.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super E, yzc> function1, E e, CoroutineContext coroutineContext) {
            super(1);
            this.d = function1;
            this.f54294c = e;
            this.e = coroutineContext;
        }
    }

    public static final <E> Function1<Throwable, yzc> e(Function1<? super E, yzc> function1, E e2, CoroutineContext coroutineContext) {
        return new e(function1, e2, coroutineContext);
    }
}
