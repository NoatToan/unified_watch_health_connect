package dd;

import e23.l;
import java.util.concurrent.CancellationException;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class a extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a<Object> f59150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0<Object> f59151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.concurrent.futures.b.a<Object> aVar, i0<Object> i0Var) {
        super(1);
        this.f59150a = aVar;
        this.f59151b = i0Var;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        Throwable th4 = th3;
        androidx.concurrent.futures.b.a<Object> aVar = this.f59150a;
        if (th4 == null) {
            aVar.b(this.f59151b.f());
        } else if (th4 instanceof CancellationException) {
            aVar.c();
        } else {
            aVar.d(th4);
        }
        return Unit.INSTANCE;
    }
}
