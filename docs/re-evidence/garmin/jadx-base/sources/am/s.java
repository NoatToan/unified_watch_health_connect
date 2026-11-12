package am;

import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lto/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityFullResolutionPolyline$1", f = "ActivityRepo.kt", l = {166, 165}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<r53.j<? super v2<? extends to.f>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4185e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityFullResolutionPolyline$1$1", f = "ActivityRepo.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<String>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f4186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f4187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4186a = mVar;
            this.f4187b = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4186a, this.f4187b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<String>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            c83.a0<String> a0VarExecute = this.f4186a.f4069a.N(this.f4187b).execute();
            a0VarExecute.getClass();
            return a0VarExecute;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, long j8, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f4184d = mVar;
        this.f4185e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f4184d, this.f4185e, dVar);
        sVar.f4183c = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends to.f>> jVar, t13.d<? super Unit> dVar) {
        return ((s) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r2.emit(r14, r13) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 aVar;
        r53.j jVar = (r53.j) this.f4183c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4182b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4181a;
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
        long j8 = this.f4185e;
        m mVar = this.f4184d;
        a aVar3 = new a(mVar, j8, null);
        this.f4183c = null;
        this.f4181a = jVar;
        this.f4182b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar3, this);
        if (obj != aVar2) {
        }
        return aVar2;
        r53.j jVar2 = jVar;
        v2 v2Var = (v2) obj;
        if (!(v2Var instanceof v2.a)) {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            v2.b bVar = (v2.b) v2Var;
            int i15 = bVar.f47387b;
            HttpUrl httpUrl = bVar.f47388c;
            try {
                aVar = new v2.b((to.f) GsonUtil.f47253b.fromJson((String) ((v2.b) v2Var).f47386a, to.f.class), i15, httpUrl, null, 8, null);
            } catch (Exception e4) {
                aVar = new v2.a(e4, null, null, 6, null);
            }
            v2Var = aVar;
        }
        this.f4183c = null;
        this.f4181a = null;
        this.f4182b = 2;
    }
}
