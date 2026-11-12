package mh1;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.IndexAppearanceViewModel$getUserInfo$1", f = "IndexAppearanceViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, long j8, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f118462b = fVar;
        this.f118463c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f118462b, this.f118463c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118461a;
        f fVar = this.f118462b;
        if (i14 == 0) {
            o13.r.b(obj);
            wn1.t tVar = fVar.f118469b;
            this.f118461a = 1;
            tVar.getClass();
            obj = f0.J(tVar, new wn1.y(this.f118463c, null), this);
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
        if (v2Var instanceof v2.b) {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) ((v2.b) v2Var).f47386a;
            if (deviceSettingsDTO != null) {
                fVar.f118470c.j(fw.m.a.g(fw.m.f73767e, deviceSettingsDTO, 1));
            } else {
                fVar.f118470c.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) v2Var;
            ((Logger) fVar.f118468a.getValue()).error(a0.g(aVar2.f47384b, "getUserInfo: Unsuccessful request, received code "), (Throwable) aVar2.f47383a);
            fVar.f118470c.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
        }
        return Unit.INSTANCE;
    }
}
