package w02;

import b5.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.m0;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: w02.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw02/a$a;", "Lw02/a;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3374a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3374a f181054a = new C3374a();

        private C3374a() {
        }

        @Override // w02.a
        public final Object a(h0 h0Var, e23.l<? super n4.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.p<? super b5.a0, ? super n4.c, Unit> pVar, t13.d<? super Unit> dVar) {
            Object objG = m0.g(h0Var, lVar, aVar, aVar2, pVar, dVar);
            return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
        }
    }

    Object a(h0 h0Var, e23.l<? super n4.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.p<? super b5.a0, ? super n4.c, Unit> pVar, t13.d<? super Unit> dVar);
}
