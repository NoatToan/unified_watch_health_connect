package w02;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f181082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<n4.c, Unit> f181083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f181085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<b5.a0, n4.c, Unit> f181086e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar, e23.l<? super n4.c, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.p<? super b5.a0, ? super n4.c, Unit> pVar) {
        this.f181082a = aVar;
        this.f181083b = lVar;
        this.f181084c = aVar2;
        this.f181085d = aVar3;
        this.f181086e = pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objA = this.f181082a.a(h0Var, this.f181083b, this.f181084c, this.f181085d, this.f181086e, dVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }
}
