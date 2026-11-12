package wo2;

import e23.p;
import java.util.Iterator;
import java.util.Set;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue$notifyApduProcessedListeners$2", f = "EventAwareSyncQueue.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f186488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo2.a f186489b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.model.EventAwareSyncQueue$notifyApduProcessedListeners$2$1$1", f = "EventAwareSyncQueue.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wo2.a.InterfaceC3465a f186490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wo2.a.InterfaceC3465a interfaceC3465a, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f186490a = interfaceC3465a;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f186490a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f186490a.a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wo2.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f186489b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f186489b, dVar);
        bVar.f186488a = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f186488a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Set<wo2.a.InterfaceC3465a> set = this.f186489b.f186461r;
        set.getClass();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ge1.b.T(b0Var, null, null, new a((wo2.a.InterfaceC3465a) it.next(), null), 3);
        }
        return Unit.INSTANCE;
    }
}
