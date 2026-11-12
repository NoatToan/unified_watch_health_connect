package yo;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class g<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f198260a;

    public g(e eVar) {
        this.f198260a = eVar;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        c83.a0 a0Var = (c83.a0) obj;
        this.f198260a.f198236f.j(new o13.p<>(a0Var.f25745a.headers().toMultimap(), new Integer(a0Var.f25745a.code())));
        return Unit.INSTANCE;
    }
}
