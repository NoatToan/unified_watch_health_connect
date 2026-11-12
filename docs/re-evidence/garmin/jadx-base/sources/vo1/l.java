package vo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getSocialGroupRideResults$1", f = "SocialGroupRideRepo.kt", l = {41, 40}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<r53.j<? super v2<? extends yo1.j>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f179083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f179086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f179087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f179088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Long f179089g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyo1/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getSocialGroupRideResults$1$1", f = "SocialGroupRideRepo.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<yo1.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f179091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f179092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f179093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f179094e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, String str2, Long l14, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f179091b = cVar;
            this.f179092c = str;
            this.f179093d = str2;
            this.f179094e = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f179091b, this.f179092c, this.f179093d, this.f179094e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<yo1.j>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179090a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<yo1.j>> i0VarC = this.f179091b.f179029a.c(this.f179092c, this.f179093d, this.f179094e);
            this.f179090a = 1;
            Object objAwait = i0VarC.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar, String str, String str2, Long l14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f179086d = cVar;
        this.f179087e = str;
        this.f179088f = str2;
        this.f179089g = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f179086d, this.f179087e, this.f179088f, this.f179089g, dVar);
        lVar.f179085c = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends yo1.j>> jVar, t13.d<? super Unit> dVar) {
        return ((l) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f179085c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179084b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f179083a;
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        Long l14 = this.f179089g;
        c cVar = this.f179086d;
        a aVar2 = new a(cVar, this.f179087e, this.f179088f, l14, null);
        this.f179085c = null;
        this.f179083a = jVar;
        this.f179084b = 1;
        cVar.getClass();
        obj = f0.J(cVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f179085c = null;
        this.f179083a = null;
        this.f179084b = 2;
    }
}
