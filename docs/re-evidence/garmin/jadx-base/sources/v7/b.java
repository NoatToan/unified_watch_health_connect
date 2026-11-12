package v7;

import androidx.datastore.core.CorruptionException;
import e23.l;
import p005kotlin.Metadata;
import u7.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv7/b;", "T", "Lu7/d;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Le23/l;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<CorruptionException, T> f176110a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super CorruptionException, ? extends T> lVar) {
        lVar.getClass();
        this.f176110a = lVar;
    }

    @Override // u7.d
    public final Object a(CorruptionException corruptionException) {
        return this.f176110a.invoke(corruptionException);
    }
}
