package r53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr53/b;", "T", "Lr53/f;", "Lkotlin/Function2;", "Lq53/t;", "Lt13/d;", "", "", "block", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Le23/p;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> extends f<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<q53.t<? super T>, t13.d<? super Unit>, Object> f150528e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q53.t f150529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<T> f150531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f150532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, t13.d<? super a> dVar) {
            super(dVar);
            this.f150531c = bVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150530b = obj;
            this.f150532d |= Integer.MIN_VALUE;
            return this.f150531c.h(null, this);
        }
    }

    public /* synthetic */ b(e23.p pVar, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(pVar, (i15 & 2) != 0 ? t13.h.f161748a : gVar, (i15 & 4) != 0 ? -2 : i14, (i15 & 8) != 0 ? q53.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.f, s53.f
    public final Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f150532d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f150532d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f150530b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f150532d;
        if (i15 == 0) {
            o13.r.b(obj);
            aVar.f150529a = tVar;
            aVar.f150532d = 1;
            if (super.h(tVar, aVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tVar = aVar.f150529a;
            o13.r.b(obj);
        }
        if (tVar.d()) {
            return Unit.INSTANCE;
        }
        vb.h.z("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // r53.f, s53.f
    public final s53.f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new b(this.f150528e, gVar, i14, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(e23.p<? super q53.t<? super T>, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.g gVar, int i14, q53.a aVar) {
        super(pVar, gVar, i14, aVar);
        this.f150528e = pVar;
    }
}
