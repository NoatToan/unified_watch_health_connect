package ij1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceViewModel$getAllRegisteredDevices$1", f = "PrimaryDeviceViewModel.kt", l = {111, 114}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f93856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f93857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f93857c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f93857c, dVar);
        iVar.f93856b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r6.A4((gj1.f) r8, r7) == r1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f93856b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93855a;
        g gVar = this.f93857c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        fj1.b bVar = gVar.f93834a;
        this.f93856b = b0Var;
        this.f93855a = 1;
        obj = bVar.a(this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            int i15 = g.f93833m;
            y0<g3<gj1.f>> y0VarY4 = gVar.y4();
            g3.a aVar2 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            z.h(aVar2, t7, y0VarY4);
            this.f93856b = null;
            this.f93855a = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String string = ((v2.a) v2Var).f47383a.toString();
            y.f136664a.getClass();
            y.a.c("GCMSettingsViewModel", string);
        }
        return Unit.INSTANCE;
    }
}
