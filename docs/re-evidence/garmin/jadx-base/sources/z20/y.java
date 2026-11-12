package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d60.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz20/y;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f201966b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f201967a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.ToggleFavoriteStateUseCase$invoke$1", f = "ToggleFavoriteStateUseCase.kt", l = {22, 24, 30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f201969b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f201971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f201972e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201971d = str;
            this.f201972e = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = y.this.new a(this.f201971d, this.f201972e, dVar);
            aVar.f201969b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x004b  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        
            if (r14 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        
            if (r14 == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long lValueOf;
            v2 aVar;
            r53.j jVar = (r53.j) this.f201969b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f201968a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    aVar = (v2) obj;
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    aVar = (v2) obj;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            int i15 = y.f201966b;
            y yVar = y.this;
            yVar.getClass();
            String str = this.f201971d;
            if (str == null || str.length() == 0) {
                lValueOf = null;
            } else {
                try {
                    long j8 = Long.parseLong(str);
                    if (j8 > 0) {
                        lValueOf = Long.valueOf(j8);
                    } else {
                        lValueOf = null;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (lValueOf != null) {
                d60.b bVar = yVar.f201967a;
                if (this.f201972e) {
                    String strValueOf = String.valueOf(str);
                    this.f201969b = jVar;
                    this.f201968a = 2;
                    obj = f0.J(bVar, new m0(bVar, strValueOf, null), this);
                } else {
                    k30.r rVar = new k30.r(lValueOf.longValue());
                    this.f201969b = jVar;
                    this.f201968a = 1;
                    obj = f0.J(bVar, new d60.g(bVar, rVar, null), this);
                }
            } else {
                aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
            }
            return aVar2;
            this.f201969b = null;
            this.f201968a = 3;
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public y(d60.b bVar) {
        bVar.getClass();
        this.f201967a = bVar;
    }

    public final r53.i<v2<Unit>> a(String str, boolean z14) {
        c2 c2Var = new c2(new a(str, z14, null));
        x53.c cVar = s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }
}
