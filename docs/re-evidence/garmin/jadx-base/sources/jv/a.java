package jv;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.g3;
import cr1.f;
import cr1.m;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import x53.c;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.bic.device.animation.DeviceAnimationViewModel$getDeviceAnimationHolder$1", f = "DeviceAnimationViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f100942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f100943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f100944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f100945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k22.a f100946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0<g3<hv.b>> f100947g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, u0 u0Var, l lVar, k22.a aVar, y0<g3<hv.b>> y0Var, d<? super a> dVar) {
        super(2, dVar);
        this.f100943c = bVar;
        this.f100944d = u0Var;
        this.f100945e = lVar;
        this.f100946f = aVar;
        this.f100947g = y0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f100943c, this.f100944d, this.f100945e, this.f100946f, this.f100947g, dVar);
        aVar.f100942b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b0 b0Var = (b0) this.f100942b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100941a;
        if (i14 == 0) {
            r.b(obj);
            f fVar = this.f100943c.f100948a;
            this.f100942b = b0Var;
            this.f100941a = 1;
            fVar.getClass();
            c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new m(this.f100944d, this.f100945e, fVar, this.f100946f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        hv.b bVar = (hv.b) obj;
        y0<g3<hv.b>> y0Var = this.f100947g;
        if (bVar != null) {
            g3.f35298f.getClass();
            y0Var.m(g3.a.d(bVar));
        } else {
            y0Var.m(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
