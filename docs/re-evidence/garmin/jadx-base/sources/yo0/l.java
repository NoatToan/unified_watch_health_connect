package yo0;

import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.devices.model.u;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.d1;
import z10.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.home.MyDeviceViewModel$fetchDeviceInfo$1", f = "MyDeviceViewModel.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f198408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f198408b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f198408b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198407a;
        m mVar = this.f198408b;
        if (i14 == 0) {
            r.b(obj);
            pc0.j jVar = mVar.f198409a;
            this.f198407a = 1;
            jVar.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new pc0.b0(jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        u uVar = (u) obj;
        int i15 = uVar.f34317b;
        d1 d1Var = d1.f200951a;
        v0.f201271b.getClass();
        v0 v0VarA = v0.a.a();
        boolean z14 = i15 > 0;
        SharedPreferences.Editor editorEdit = v0VarA.f201273a.edit();
        editorEdit.putBoolean("gcm_consent_hide_my_day_key", z14);
        editorEdit.apply();
        mVar.f198410b.m(uVar);
        return Unit.INSTANCE;
    }
}
