package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0001\u0010\r*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\r0\bH\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/ThreadContextElement;", "value", "threadLocal", "Ljava/lang/ThreadLocal;", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", MedalConstants.EVENT_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "restoreThreadContext", "", ParamConstants.Param.CONTEXT, "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zmj<T> implements ThreadContextElement<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext.Key<?> f54299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadLocal<T> f54300b;
    private final T e;

    public zmj(T t, ThreadLocal<T> threadLocal) {
        this.e = t;
        this.f54300b = threadLocal;
        this.f54299a = new zmk(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) ThreadContextElement.b.e(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return ThreadContextElement.b.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key<?> getKey() {
        return this.f54299a;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(CoroutineContext context) {
        T t = this.f54300b.get();
        this.f54300b.set(this.e);
        return t;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(CoroutineContext context, T oldState) {
        this.f54300b.set(oldState);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return zcp.b(getKey(), key) ? zbf.f53962b : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        if (!zcp.b(getKey(), key)) {
            return null;
        }
        zcp.e(this, "");
        return this;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.e + ", threadLocal = " + this.f54300b + g4.l;
    }
}
