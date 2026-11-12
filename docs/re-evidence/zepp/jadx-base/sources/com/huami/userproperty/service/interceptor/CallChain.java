package com.huami.userproperty.service.interceptor;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BE\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/userproperty/service/interceptor/CallChain;", "P", "R", "Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "params", "()Ljava/lang/Object;", "handle", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "finalChain", "b", "Ljava/lang/Object;", "request", "", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "c", "Ljava/util/List;", "interceptors", "", GoogleApiAvailabilityLight.a, LogUtil.I, "index", "<init>", "(Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;Ljava/lang/Object;Ljava/util/List;I)V", "service_release"}, k = 1, mv = {1, 5, 1})
public final class CallChain<P, R> implements Interceptor.Chain<P, R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Interceptor.Chain<P, R> finalChain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final P request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Interceptor<P, R>> interceptors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int index;

    /* JADX WARN: Multi-variable type inference failed */
    public CallChain(@NotNull Interceptor.Chain<P, R> chain, P p, @NotNull List<? extends Interceptor<P, R>> list, int i) {
        this.finalChain = chain;
        this.request = p;
        this.interceptors = list;
        this.index = i;
    }

    @Override // com.huami.userproperty.service.interceptor.Interceptor.Chain
    public R handle(P params) {
        if (this.index == this.interceptors.size()) {
            return this.finalChain.handle(params);
        }
        return this.interceptors.get(this.index).intercept(new CallChain(this.finalChain, params, this.interceptors, this.index + 1));
    }

    @Override // com.huami.userproperty.service.interceptor.Interceptor.Chain
    public P params() {
        return this.request;
    }
}
