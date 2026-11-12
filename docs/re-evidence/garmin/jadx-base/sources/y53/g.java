package y53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f194571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f194572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f<Object> f194573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f<Object> fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f194573c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f194572b = obj;
        this.f194574d |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f194556f;
        return this.f194573c.f(this);
    }
}
