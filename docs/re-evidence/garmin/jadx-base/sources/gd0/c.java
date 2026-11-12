package gd0;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.devices.task.DuplicateCourseTask$execute$2", f = "DuplicateCourseTask.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2<com.garmin.android.apps.connectmobile.courses.model.e> f76961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f76962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v2<com.garmin.android.apps.connectmobile.courses.model.e> v2Var, a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f76961a = v2Var;
        this.f76962b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f76961a, this.f76962b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        s20.d dVar = s20.d.f156005a;
        v2.b bVar = (v2.b) this.f76961a;
        List<GeoPointDTO> list = ((com.garmin.android.apps.connectmobile.courses.model.e) bVar.f47386a).geoPoints;
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        dVar.getClass();
        ArrayList arrayListF = s20.d.f(list, zY);
        T t7 = bVar.f47386a;
        ((com.garmin.android.apps.connectmobile.courses.model.e) t7).intervalMarkers = arrayListF;
        this.f76962b.f76954b.b((com.garmin.android.apps.connectmobile.courses.model.e) t7);
        return Unit.INSTANCE;
    }
}
