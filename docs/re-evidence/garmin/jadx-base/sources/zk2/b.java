package zk2;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.core.queue.AdHocQueue$add$1", f = "AdHocQueue.kt", l = {123}, m = "invokeSuspend")
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk2.a f205113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wk2.i f205114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<wk2.i, Unit> f205115d;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.core.queue.AdHocQueue$add$1$1", f = "AdHocQueue.kt", l = {124}, m = "invokeSuspend")
    public static final class a extends v13.i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f205116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zk2.a f205117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wk2.i f205118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<wk2.i, Unit> f205119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zk2.a aVar, wk2.i iVar, l<? super wk2.i, Unit> lVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f205117b = aVar;
            this.f205118c = iVar;
            this.f205119d = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f205117b, this.f205118c, this.f205119d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f205116a;
            if (i14 == 0) {
                r.b(obj);
                this.f205116a = 1;
                if (zk2.a.d(this.f205117b, this.f205118c, this.f205119d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(zk2.a aVar, wk2.i iVar, l<? super wk2.i, Unit> lVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f205113b = aVar;
        this.f205114c = iVar;
        this.f205115d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f205113b, this.f205114c, this.f205115d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205112a;
        if (i14 == 0) {
            r.b(obj);
            zk2.a aVar2 = this.f205113b;
            cz2.p pVar = aVar2.f205105i;
            a aVar3 = new a(aVar2, this.f205114c, this.f205115d, null);
            this.f205112a = 1;
            if (pVar.a(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
