package defpackage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hms.network.embedded.q0;
import com.huawei.openalliance.ad.constant.ParamConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "n", "", "(Lkotlin/coroutines/CoroutineContext;I)V", "elements", "", "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, q0.j, "[Ljava/lang/Object;", "append", "", FunctionSetBeanReader.BI_ELEMENT, "value", "restore", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f54310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadContextElement<Object>[] f54311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54312c;
    public final CoroutineContext d;

    public zmr(CoroutineContext coroutineContext, int i) {
        this.d = coroutineContext;
        this.f54310a = new Object[i];
        this.f54311b = new ThreadContextElement[i];
    }

    public final void a(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.f54310a;
        int i = this.f54312c;
        objArr[i] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.f54311b;
        this.f54312c = i + 1;
        zcp.e(threadContextElement, "");
        threadContextElementArr[i] = threadContextElement;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f54311b.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement<Object> threadContextElement = this.f54311b[length];
            zcp.e(threadContextElement);
            threadContextElement.restoreThreadContext(coroutineContext, this.f54310a[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
