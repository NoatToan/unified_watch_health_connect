package androidx.work;

import androidx.lifecycle.LiveData;
import defpackage.lhe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/work/OperationImpl;", "Landroidx/work/b;", "Landroidx/lifecycle/LiveData;", "Landroidx/work/b$b;", "getState", "()Landroidx/lifecycle/LiveData;", "Llhe;", "Landroidx/work/b$b$c;", "getResult", "()Llhe;", "state", "Landroidx/lifecycle/LiveData;", "future", "Llhe;", "<init>", "(Landroidx/lifecycle/LiveData;Llhe;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
final class OperationImpl implements b {

    @NotNull
    private final lhe<b.AbstractC0082b.c> future;

    @NotNull
    private final LiveData<b.AbstractC0082b> state;

    public OperationImpl(@NotNull LiveData<b.AbstractC0082b> state, @NotNull lhe<b.AbstractC0082b.c> future) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        this.state = state;
        this.future = future;
    }

    @Override // androidx.work.b
    @NotNull
    public lhe<b.AbstractC0082b.c> getResult() {
        return this.future;
    }

    @NotNull
    public LiveData<b.AbstractC0082b> getState() {
        return this.state;
    }
}
