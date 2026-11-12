package qw0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.c2;
import p008y1.k3;
import p3.p1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f148344a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", "it", "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.map.MapProviderMenuKt$PopupDropDownView$1$1$1", f = "MapProviderMenu.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<c2, n4.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f148345a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f148345a = p1Var;
        }

        @Override // e23.q
        public final Object invoke(c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            return new a(this.f148345a, dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f148345a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public q(p1<Boolean> p1Var) {
        this.f148344a = p1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objF = k3.f(h0Var, null, new a(this.f148344a, null), null, dVar, 11);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }
}
