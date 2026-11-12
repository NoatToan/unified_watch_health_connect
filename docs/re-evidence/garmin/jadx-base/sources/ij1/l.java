package ij1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$handleRegisteredDevices$2", f = "PrimaryDeviceViewModel.kt", l = {248}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f93873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f93874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<gj1.b> f93875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, Long l14, r0<gj1.b> r0Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f93873b = gVar;
        this.f93874c = l14;
        this.f93875d = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f93873b, this.f93874c, this.f93875d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93872a;
        if (i14 == 0) {
            o13.r.b(obj);
            long jLongValue = this.f93874c.longValue();
            gj1.b bVar = this.f93875d.f105810a;
            this.f93872a = 1;
            lVar = this;
            obj = g.x4(this.f93873b, jLongValue, true, bVar, lVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            lVar = this;
        }
        gj1.h hVar = (gj1.h) obj;
        if (hVar == null) {
            return null;
        }
        lVar.f93873b.getClass();
        return g.B4(hVar);
    }
}
