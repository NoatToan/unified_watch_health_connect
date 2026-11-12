package pc0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lr80/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getApplicationInfoAsync$1", f = "DevicesRepo.kt", l = {535, 535}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super v2<? extends List<? extends r80.b>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f137263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f137265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f137266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f137267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f137268f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lr80/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.repo.DevicesRepo$getApplicationInfoAsync$1$1", f = "DevicesRepo.kt", l = {535}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends r80.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f137270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f137271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f137272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str, String str2, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f137270b = jVar;
            this.f137271c = str;
            this.f137272d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f137270b, this.f137271c, this.f137272d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<List<? extends r80.b>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137269a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<List<r80.b>>> i0VarP = this.f137270b.f137224a.p(this.f137271c, this.f137272d);
            this.f137269a = 1;
            Object objAwait = i0VarP.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j jVar, String str, String str2, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f137266d = jVar;
        this.f137267e = str;
        this.f137268f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f137266d, this.f137267e, this.f137268f, dVar);
        oVar.f137265c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends List<? extends r80.b>>> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f137265c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137264b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f137263a;
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
        String str = this.f137267e;
        String str2 = this.f137268f;
        j jVar2 = this.f137266d;
        a aVar2 = new a(jVar2, str, str2, null);
        this.f137265c = null;
        this.f137263a = jVar;
        this.f137264b = 1;
        jVar2.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(jVar2, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f137265c = null;
        this.f137263a = null;
        this.f137264b = 2;
    }
}
