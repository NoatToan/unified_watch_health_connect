package li;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import r53.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lli/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lr53/j;", "owner", "<init>", "(Lr53/j;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<?> f112561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j<?> jVar) {
        super("Flow was aborted, no more elements needed");
        jVar.getClass();
        this.f112561a = jVar;
    }
}
