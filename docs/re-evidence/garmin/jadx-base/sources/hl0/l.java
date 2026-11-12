package hl0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lsd2/i;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.GetDownloadedGolfCourseUseCase$invoke$1", f = "GetDownloadedGolfCourseUseCase.kt", l = {17, 27}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<q53.t<? super sd2.i>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f84302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f84303d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hl0/l$a", "Lol0/b;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ol0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q53.t<sd2.i> f84304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f84305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f84306c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q53.t<? super sd2.i> tVar, k kVar, int i14) {
            this.f84304a = tVar;
            this.f84305b = kVar;
            this.f84306c = i14;
        }

        @Override // ol0.b
        public final void databaseContentChanged(ol0.a aVar) {
            aVar.getClass();
            this.f84304a.i(k.a(this.f84305b, this.f84306c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, int i14, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f84302c = kVar;
        this.f84303d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f84302c, this.f84303d, dVar);
        lVar.f84301b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super sd2.i> tVar, t13.d<? super Unit> dVar) {
        return ((l) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (q53.r.a(r0, r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f84301b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84300a;
        k kVar = this.f84302c;
        if (i14 == 0) {
            o13.r.b(obj);
            hl0.a aVar2 = kVar.f84298b;
            this.f84301b = tVar;
            this.f84300a = 1;
            if (aVar2.e(this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        int i15 = this.f84303d;
        tVar.i(k.a(kVar, i15));
        a aVar3 = new a(tVar, kVar, i15);
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(aVar3);
        h62.j jVar = new h62.j(aVar3, 6);
        this.f84301b = null;
        this.f84300a = 2;
    }
}
