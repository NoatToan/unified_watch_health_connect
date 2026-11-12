package ol1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import f12.l;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.shareableevents.ShareableEventViewModel$getCourseDetails$1", f = "ShareableEventViewModel.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.shareableevents.a f132858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f132859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.android.apps.connectmobile.shareableevents.a aVar, long j8, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f132858b = aVar;
        this.f132859c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f132858b, this.f132859c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132857a;
        com.garmin.android.apps.connectmobile.shareableevents.a aVar2 = this.f132858b;
        if (i14 == 0) {
            r.b(obj);
            aVar2.z4().j(g3.a.c(g3.f35298f));
            d60.b bVar = aVar2.f44227d;
            if (bVar == null) {
                s.m("courseRepository");
                throw null;
            }
            this.f132857a = 1;
            obj = f0.J(bVar, new d60.j(bVar, this.f132859c, null), this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a;
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            s20.d dVar = s20.d.f156005a;
            List<GeoPointDTO> list = eVar.geoPoints;
            dVar.getClass();
            eVar.intervalMarkers = s20.d.f(list, zY);
            y0<g3<com.garmin.android.apps.connectmobile.courses.model.e>> y0VarZ4 = aVar2.z4();
            g3.f35298f.getClass();
            y0VarZ4.j(g3.a.d(eVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            aVar2.z4().j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47383a.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
