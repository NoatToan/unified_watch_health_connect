package d60;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.repo.CoursesRepo$getSecondaryClimbs$2", f = "CoursesRepo.kt", l = {379}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ClimbDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f57821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f57822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f57823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f57824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f57825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f57826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.b f57827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b bVar, List<Long> list, String str, double d14, double d15, com.garmin.android.apps.connectmobile.courses.model.b bVar2, com.garmin.android.apps.connectmobile.courses.model.b bVar3, t13.d<? super c0> dVar) {
        super(1, dVar);
        this.f57821b = bVar;
        this.f57822c = list;
        this.f57823d = str;
        this.f57824e = d14;
        this.f57825f = d15;
        this.f57826g = bVar2;
        this.f57827h = bVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f57821b, this.f57822c, this.f57823d, this.f57824e, this.f57825f, this.f57826g, this.f57827h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ClimbDTO>>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f57820a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b.a aVar2 = b.f57806c;
        o53.i0<c83.a0<List<ClimbDTO>>> i0VarQ = this.f57821b.b().q(this.f57822c, this.f57823d, this.f57824e, this.f57825f, this.f57826g.f32828a, this.f57827h.f32828a);
        this.f57820a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
