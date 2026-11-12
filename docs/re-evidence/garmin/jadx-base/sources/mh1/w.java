package mh1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;
import r53.q2;
import wn1.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmh1/w;", "Landroidx/lifecycle/u1;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn1.t f118513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f118514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<fw.m<hi0.a>> f118515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f118516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f118517e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.InviteConnectionsViewModel$sendInviteForDevice$1", f = "InviteConnectionsViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f118518a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.smartscale.model.b f118520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f118521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ hi0.a f118522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.smartscale.model.b bVar, boolean z14, hi0.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118520c = bVar;
            this.f118521d = z14;
            this.f118522e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w.this.new a(this.f118520c, this.f118521d, this.f118522e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f118518a;
            com.garmin.android.apps.connectmobile.smartscale.model.b bVar = this.f118520c;
            w wVar = w.this;
            if (i14 == 0) {
                o13.r.b(obj);
                wn1.t tVar = wVar.f118513a;
                this.f118518a = 1;
                tVar.getClass();
                obj = f0.J(tVar, new a0(bVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            hi0.a aVar2 = this.f118522e;
            if (z14) {
                if (this.f118521d) {
                    String deviceID = bVar.getDeviceID();
                    Long l14 = deviceID != null ? new Long(Long.parseLong(deviceID)) : null;
                    if (l14 != null) {
                        long jLongValue = l14.longValue();
                        wVar.getClass();
                        ge1.b.T(v1.a(wVar), null, null, new u(wVar, false, jLongValue, null), 3);
                    }
                    wVar.f118515c.j(fw.m.a.g(fw.m.f73767e, aVar2, 1));
                } else {
                    wVar.f118515c.j(fw.m.a.g(fw.m.f73767e, aVar2, 1));
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                wVar.f118515c.j(fw.m.a.b(fw.m.f73767e, ((v2.a) v2Var).f47383a instanceof NoNetworkException ? new fw.h() : new fw.r(), aVar2, 1));
            }
            return Unit.INSTANCE;
        }
    }

    public w() {
        o13.m.b(new q(2));
        this.f118513a = wn1.t.a.b(wn1.t.f186332a);
        f12.l.f68084a.getClass();
        this.f118514b = f12.l.a.a();
        this.f118515c = new y0<>();
        p2 p2VarA = q2.a(new mh1.a(false, false, 3, null));
        this.f118516d = p2VarA;
        this.f118517e = p2VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(w wVar, long j8, v13.c cVar) {
        v vVar;
        wVar.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f118512c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f118512c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(wVar, cVar);
            }
        } else {
            vVar = new v(wVar, cVar);
        }
        Object objJ = vVar.f118510a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f118512c;
        if (i15 == 0) {
            o13.r.b(objJ);
            wn1.t tVar = wVar.f118513a;
            vVar.f118512c = 1;
            tVar.getClass();
            objJ = f0.J(tVar, new wn1.x(j8, null), vVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            return j0.f134944a;
        }
        u0.r();
        return null;
    }

    public final void y4(com.garmin.android.apps.connectmobile.smartscale.model.b bVar, hi0.a aVar, boolean z14) {
        y0<fw.m<hi0.a>> y0Var = this.f118515c;
        fw.m<hi0.a> mVarD = y0Var.d();
        if ((mVarD != null ? mVarD.f73769b : null) != fw.p.LOADING) {
            y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
            ge1.b.T(v1.a(this), null, null, new a(bVar, z14, aVar, null), 3);
        }
    }
}
