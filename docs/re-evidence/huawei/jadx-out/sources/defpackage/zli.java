package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.openalliance.ad.constant.ParamConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zli implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f54264a;

    public zli(CoroutineContext coroutineContext) {
        this.f54264a = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getF54264a() {
        return this.f54264a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getF54264a() + g4.l;
    }
}
