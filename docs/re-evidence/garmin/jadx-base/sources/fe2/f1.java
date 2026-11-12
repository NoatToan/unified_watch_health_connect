package fe2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo53/i0;", "Lxd2/g1;", "", "<anonymous>", "(Lo53/b0;)Lo53/i0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator$terminateSessions$endGrouptrackResult$1$1", f = "DeviceDrivenTerminator.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super o53.i0<? extends xd2.g1<? extends Unit>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f70738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70739c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator$terminateSessions$endGrouptrackResult$1$1$1", f = "DeviceDrivenTerminator.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super xd2.g1<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z0 f70741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f70742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0 z0Var, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70741b = z0Var;
            this.f70742c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f70741b, this.f70742c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super xd2.g1<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70740a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            z0 z0Var = this.f70741b;
            xd2.a1 a1Var = z0Var.f71022d;
            long j8 = z0Var.f71019a;
            ae2.e0 e0Var = z0Var.f71020b;
            this.f70740a = 1;
            Object objJ = a1Var.j(j8, e0Var, this.f70742c, this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(z0 z0Var, String str, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f70738b = z0Var;
        this.f70739c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f1 f1Var = new f1(this.f70738b, this.f70739c, dVar);
        f1Var.f70737a = obj;
        return f1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o53.i0<? extends xd2.g1<? extends Unit>>> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f70737a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return ge1.b.j(b0Var, null, null, new a(this.f70738b, this.f70739c, null), 3);
    }
}
