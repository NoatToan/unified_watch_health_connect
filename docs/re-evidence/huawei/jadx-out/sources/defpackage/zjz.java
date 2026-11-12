package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J'\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\r2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "()V", "cont", "Lkotlin/coroutines/Continuation;", "", "index", "", "allocateLocked", "", "flow", "freeLocked", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zjz extends AbstractSharedFlowSlot<zjx<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f54211a = -1;
    public Continuation<? super yzc> e;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean allocateLocked(zjx<?> zjxVar) {
        if (this.f54211a >= 0) {
            return false;
        }
        this.f54211a = zjxVar.a();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Continuation<yzc>[] freeLocked(zjx<?> zjxVar) {
        if (ASSERTIONS_ENABLED.a() && this.f54211a < 0) {
            throw new AssertionError();
        }
        long j = this.f54211a;
        this.f54211a = -1L;
        this.e = null;
        return zjxVar.b(j);
    }
}
