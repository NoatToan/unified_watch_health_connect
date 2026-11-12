package px2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpx2/p;", "Lla2/a;", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f141867a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.samd.protoimpl.SaMDProtobufHandler$initGarminDeviceConnectionCallback$1$onDeviceConnected$1", f = "SaMDProtobufHandler.kt", l = {220}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ la2.b f141869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f141870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(la2.b bVar, o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141869b = bVar;
            this.f141870c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141869b, this.f141870c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141868a;
            if (i14 == 0) {
                r.b(obj);
                jx2.r rVar = new jx2.r();
                la2.b bVar = this.f141869b;
                long f92746j = bVar.f111632a.getF92746j();
                String str = this.f141870c.f141838e;
                String f92742f = bVar.f111632a.getF92742f();
                f92742f.getClass();
                this.f141868a = 1;
                gx2.b.f80060a.getClass();
                Object objE0 = ge1.b.e0(gx2.b.d.a(), new jx2.o(rVar, f92742f, f92746j, str, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
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

    public p(o oVar) {
        this.f141867a = oVar;
    }

    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        o oVar = this.f141867a;
        if (oVar.f141835b.getF92746j() == bVar.f111632a.getF92746j()) {
            ge1.b.T(oVar.c(), null, null, new a(bVar, oVar, null), 3);
        }
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
    }
}
