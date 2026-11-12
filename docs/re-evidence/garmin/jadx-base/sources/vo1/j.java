package vo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyo1/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getSocialGroupRideCompetitionsResults$1", f = "SocialGroupRideRepo.kt", l = {58, 57}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<r53.j<? super v2<? extends yo1.f>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f179061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f179064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f179065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f179066f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyo1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getSocialGroupRideCompetitionsResults$1$1", f = "SocialGroupRideRepo.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<yo1.f>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f179068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f179069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f179070d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, Long l14, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f179068b = cVar;
            this.f179069c = str;
            this.f179070d = l14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f179068b, this.f179069c, this.f179070d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<yo1.f>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179067a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<yo1.f>> i0VarD = this.f179068b.f179029a.d(this.f179069c, this.f179070d);
            this.f179067a = 1;
            Object objAwait = i0VarD.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, String str, Long l14, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f179064d = cVar;
        this.f179065e = str;
        this.f179066f = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f179064d, this.f179065e, this.f179066f, dVar);
        jVar.f179063c = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends yo1.f>> jVar, t13.d<? super Unit> dVar) {
        return ((j) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f179063c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179062b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f179061a;
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
        String str = this.f179065e;
        Long l14 = this.f179066f;
        c cVar = this.f179064d;
        a aVar2 = new a(cVar, str, l14, null);
        this.f179063c = null;
        this.f179061a = jVar;
        this.f179062b = 1;
        cVar.getClass();
        obj = f0.J(cVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f179063c = null;
        this.f179061a = null;
        this.f179062b = 2;
    }
}
