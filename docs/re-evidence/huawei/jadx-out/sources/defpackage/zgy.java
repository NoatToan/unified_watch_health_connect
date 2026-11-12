package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000b\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ScopeCoroutine;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "afterCompletion", "", "state", "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "tryResume", "", "trySuspend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zgy<T> extends zmc<T> {
    private static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(zgy.class, "_decision");

    @Volatile
    private volatile int _decision;

    public zgy(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!e.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean c() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!e.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // defpackage.zmc, defpackage.zhy
    protected void afterCompletion(Object state) {
        afterResume(state);
    }

    @Override // defpackage.zmc, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object state) {
        if (c()) {
            return;
        }
        REUSABLE_CLAIMED.d(zbg.c(this.d), recoverResult.a(state, this.d), null, 2, null);
    }

    public final Object d() {
        if (e()) {
            return zbg.a();
        }
        Object objA = COMPLETING_ALREADY.a(getState$kotlinx_coroutines_core());
        if (objA instanceof zgl) {
            throw ((zgl) objA).f54081b;
        }
        return objA;
    }
}
