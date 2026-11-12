package qh1;

import androidx.lifecycle.y0;
import c22.n3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionViewModel$resetBodyComposition$1", f = "IndexScale2AdjustBodyCompositionViewModel.kt", l = {112, 119}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rh1.a f144786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rh1.b f144787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rh1.a.C2881a f144788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f144789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f144791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f144792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, long j8, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f144791f = pVar;
        this.f144792g = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f144791f, this.f144792g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rh1.a.C2881a c2881a;
        y0<rh1.a> y0Var;
        rh1.a aVar;
        rh1.b bVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144790e;
        p pVar = this.f144791f;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = pVar.f144766a;
            this.f144790e = 1;
            obj = mVar.b(this.f144792g, this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f144789d;
            c2881a = this.f144788c;
            bVar = this.f144787b;
            aVar = this.f144786a;
            o13.r.b(obj);
        }
        c2881a.getClass();
        y0Var.j(rh1.a.C2881a.a(bVar, (n3) obj, aVar));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        y0<rh1.a> y0Var2 = pVar.f144769d;
        y0<rh1.a> y0Var3 = pVar.f144769d;
        rh1.a aVarD = y0Var2.d();
        if (aVarD != null) {
            if (v2Var instanceof v2.b) {
                c2881a = rh1.a.f152744f;
                rh1.b bVar2 = new rh1.b(null, null, null, null, 15, null);
                this.f144786a = aVarD;
                this.f144787b = bVar2;
                this.f144788c = c2881a;
                this.f144789d = y0Var3;
                this.f144790e = 2;
                rh1.a aVarD2 = y0Var3.d();
                if (aVarD2 == null || (obj = aVarD2.f152747c) == null) {
                    obj = ge1.b.e0(pVar.f144767b.f22991c, new s(pVar, null), this);
                }
                if (obj != aVar2) {
                    y0Var = y0Var3;
                    aVar = aVarD;
                    bVar = bVar2;
                    c2881a.getClass();
                    y0Var.j(rh1.a.C2881a.a(bVar, (n3) obj, aVar));
                }
                return aVar2;
            }
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            rh1.a.C2881a c2881a2 = rh1.a.f152744f;
            Exception exc = ((v2.a) v2Var).f47383a;
            c2881a2.getClass();
            exc.getClass();
            fw.m.f73767e.getClass();
            y0Var3.j(rh1.a.a(aVarD, null, null, null, fw.m.a.a(null, exc), false, 23));
        }
        return Unit.INSTANCE;
    }
}
