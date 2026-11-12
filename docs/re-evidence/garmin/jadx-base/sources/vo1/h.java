package vo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lyo1/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getAllActiveAwardTypes$1", f = "SocialGroupRideRepo.kt", l = {219, 218}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends yo1.c>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f179049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f179050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f179052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f179053e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyo1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getAllActiveAwardTypes$1$1", f = "SocialGroupRideRepo.kt", l = {220}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<List<? extends yo1.c>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f179055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f179056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f179055b = cVar;
            this.f179056c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f179055b, this.f179056c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends yo1.c>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179054a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<List<yo1.c>>> i0VarE = this.f179055b.f179029a.e(this.f179056c);
            this.f179054a = 1;
            Object objAwait = i0VarE.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f179052d = cVar;
        this.f179053e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f179052d, this.f179053e, dVar);
        hVar.f179051c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends yo1.c>>> jVar, t13.d<? super Unit> dVar) {
        return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f179051c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179050b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f179049a;
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
        String str = this.f179053e;
        c cVar = this.f179052d;
        a aVar2 = new a(cVar, str, null);
        this.f179051c = null;
        this.f179049a = jVar;
        this.f179050b = 1;
        obj = cVar.C(aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f179051c = null;
        this.f179049a = null;
        this.f179050b = 2;
    }
}
