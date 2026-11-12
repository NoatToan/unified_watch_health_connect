package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0016¢\u0006\u0002\u0010#R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "state", "", "Lkotlin/sequences/State;", "nextValue", "Ljava/lang/Object;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "exceptionalState", "", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zdt<T> extends SequenceScope<T> implements Iterator<T>, Continuation<yzc>, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Continuation<? super yzc> f54008c;
    private T d;
    private Iterator<? extends T> e;

    public final void b(Continuation<? super yzc> continuation) {
        this.f54008c = continuation;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.f54007b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator<? extends T> it = this.e;
                zcp.e(it);
                if (it.hasNext()) {
                    this.f54007b = 2;
                    return true;
                }
                this.e = null;
            }
            this.f54007b = 5;
            Continuation<? super yzc> continuation = this.f54008c;
            zcp.e(continuation);
            this.f54008c = null;
            yzc yzcVar = yzc.e;
            yyt.c cVar = yyt.f53903b;
            continuation.resumeWith(yyt.e(yzcVar));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.f54007b;
        if (i == 0 || i == 1) {
            return b();
        }
        if (i == 2) {
            this.f54007b = 1;
            Iterator<? extends T> it = this.e;
            zcp.e(it);
            return it.next();
        }
        if (i == 3) {
            this.f54007b = 0;
            T t = this.d;
            this.d = null;
            return t;
        }
        throw d();
    }

    private final T b() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable d() {
        int i = this.f54007b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f54007b);
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yield(T t, Continuation<? super yzc> continuation) {
        this.d = t;
        this.f54007b = 3;
        this.f54008c = continuation;
        Object objA = zbg.a();
        if (objA == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objA == zbg.a() ? objA : yzc.e;
    }

    @Override // kotlin.sequences.SequenceScope
    public Object yieldAll(Iterator<? extends T> it, Continuation<? super yzc> continuation) {
        if (!it.hasNext()) {
            return yzc.e;
        }
        this.e = it;
        this.f54007b = 2;
        this.f54008c = continuation;
        Object objA = zbg.a();
        if (objA == zbg.a()) {
            probeCoroutineCreated.e(continuation);
        }
        return objA == zbg.a() ? objA : yzc.e;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        createFailure.c(result);
        this.f54007b = 4;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return zbf.f53962b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
