package u1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f167708a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", MapboxMap.QFE_OFFSET, "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", l = {885}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.q<p008y1.c2, n4.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ p008y1.c2 f167710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f167711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f167712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f167712d = yVar;
        }

        @Override // e23.q
        public final Object invoke(p008y1.c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            a aVar = new a(this.f167712d, dVar);
            aVar.f167710b = c2Var;
            aVar.f167711c = j8;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objE;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167709a;
            if (i14 == 0) {
                o13.r.b(obj);
                p008y1.c2 c2Var = this.f167710b;
                long j8 = this.f167711c;
                y yVar = this.f167712d;
                if (yVar.f167353h) {
                    this.f167709a = 1;
                    a2.j jVar = yVar.f167348c;
                    if (jVar == null || (objE = o53.c0.e(new e(c2Var, j8, jVar, yVar, null), this)) != obj2) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public x(y yVar) {
        this.f167708a = yVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        y yVar = this.f167708a;
        Object objE = k3.e(h0Var, new a(yVar, null), new tn2.t(yVar, 18), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
