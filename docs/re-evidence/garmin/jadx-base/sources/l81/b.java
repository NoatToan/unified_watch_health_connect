package l81;

import c83.a0;
import e23.l;
import o13.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lk81/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.hillscore.data.repository.HillScoreRepoImpl$getAggregatedHillScore$2", f = "HillScoreRepoImpl.kt", l = {41, 43}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<k81.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f111486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f111487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f111488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocalDate f111489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m61.a f111490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, LocalDate localDate, LocalDate localDate2, m61.a aVar, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f111487b = eVar;
        this.f111488c = localDate;
        this.f111489d = localDate2;
        this.f111490e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f111487b, this.f111488c, this.f111489d, this.f111490e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<k81.b>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f111486a;
        e eVar = this.f111487b;
        if (i14 == 0) {
            r.b(obj);
            if (eVar.f111499b == null) {
                this.f111486a = 1;
                if (eVar.w(null, this) != aVar) {
                }
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j81.a aVar2 = eVar.f111498a;
        fz0.c cVarC = fz0.d.c(this.f111488c);
        fz0.c cVarC2 = fz0.d.c(this.f111489d);
        String str = this.f111490e.f116886a;
        this.f111486a = 2;
        Object objB = aVar2.b(cVarC, cVarC2, str, this);
        return objB == aVar ? aVar : objB;
    }
}
