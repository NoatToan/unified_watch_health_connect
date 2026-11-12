package r53;

import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
public final class p<T, C extends Collection<? super T>> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f150787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150789c;

    public p(t13.d<? super p> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150788b = obj;
        this.f150789c |= Integer.MIN_VALUE;
        return s.M(null, null, this);
    }
}
