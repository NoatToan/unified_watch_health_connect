package hl0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq53/t;", "", "Lsd2/i;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.GetDownloadedGolfCoursesUseCase$invoke$1", f = "GetDownloadedGolfCoursesUseCase.kt", l = {16, 26}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<q53.t<? super List<? extends sd2.i>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f84308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f84309c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hl0/m$a", "Lol0/b;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ol0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q53.t<List<? extends sd2.i>> f84310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f84311b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q53.t<? super List<? extends sd2.i>> tVar, n nVar) {
            this.f84310a = tVar;
            this.f84311b = nVar;
        }

        @Override // ol0.b
        public final void databaseContentChanged(ol0.a aVar) {
            aVar.getClass();
            this.f84310a.i(this.f84311b.f84312a.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f84309c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f84309c, dVar);
        mVar.f84308b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super List<? extends sd2.i>> tVar, t13.d<? super Unit> dVar) {
        return ((m) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (q53.r.a(r0, r2, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q53.t tVar = (q53.t) this.f84308b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84307a;
        n nVar = this.f84309c;
        if (i14 == 0) {
            o13.r.b(obj);
            hl0.a aVar2 = nVar.f84313b;
            this.f84308b = tVar;
            this.f84307a = 1;
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
        tVar.i(nVar.f84312a.d());
        a aVar3 = new a(tVar, nVar);
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(aVar3);
        h62.j jVar = new h62.j(aVar3, 7);
        this.f84308b = null;
        this.f84307a = 2;
    }
}
