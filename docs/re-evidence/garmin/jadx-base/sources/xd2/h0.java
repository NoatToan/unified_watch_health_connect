package xd2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$setLivetrackSettings$result$1", f = "DefaultLivetrackRepository.kt", l = {111, 110}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f190181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f190183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f190184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae2.q f190185e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b bVar, long j8, ae2.q qVar, t13.d<? super h0> dVar) {
        super(1, dVar);
        this.f190183c = bVar;
        this.f190184d = j8;
        this.f190185e = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h0(this.f190183c, this.f190184d, this.f190185e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((h0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z0 z0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190182b;
        if (i14 == 0) {
            o13.r.b(obj);
            b bVar = this.f190183c;
            z0Var = bVar.f190045c;
            this.f190181a = z0Var;
            this.f190182b = 1;
            obj = b.J(bVar, this.f190184d, this);
            if (obj != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z0Var = this.f190181a;
        o13.r.b(obj);
        this.f190181a = null;
        this.f190182b = 2;
        Object objI = z0Var.i((Map) obj, this.f190185e, this);
        return objI == aVar ? aVar : objI;
    }
}
