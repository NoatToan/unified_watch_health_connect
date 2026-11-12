package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", TrackConstants$Opers.INVOKE, "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zie<T> extends JobNode {
    private final zgf<T> d;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ yzc invoke(Throwable th) {
        invoke2(th);
        return yzc.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zie(zgf<? super T> zgfVar) {
        this.d = zgfVar;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Throwable cause) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (ASSERTIONS_ENABLED.a() && (state$kotlinx_coroutines_core instanceof Incomplete)) {
            throw new AssertionError();
        }
        if (state$kotlinx_coroutines_core instanceof zgl) {
            zgf<T> zgfVar = this.d;
            yyt.c cVar = yyt.f53903b;
            zgfVar.resumeWith(yyt.e(createFailure.a(((zgl) state$kotlinx_coroutines_core).f54081b)));
        } else {
            zgf<T> zgfVar2 = this.d;
            yyt.c cVar2 = yyt.f53903b;
            zgfVar2.resumeWith(yyt.e(COMPLETING_ALREADY.a(state$kotlinx_coroutines_core)));
        }
    }
}
