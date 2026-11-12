package zc;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import yc.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lyc/s;", "it", "", "emit", "(Lyc/s;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class b<T> implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d<T> f203900a;

    public b(d<T> dVar) {
        this.f203900a = dVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        this.f203900a.f203908e.setValue((s) obj);
        return Unit.INSTANCE;
    }
}
