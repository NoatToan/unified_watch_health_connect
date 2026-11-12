package z20;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz20/h;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f201911a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.DeleteCourseUseCase$invoke$1", f = "DeleteCourseUseCase.kt", l = {17, 22}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super v2<? extends Unit>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f201913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f201914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f201915d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201914c = str;
            this.f201915d = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f201914c, this.f201915d, dVar);
            aVar.f201913b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super v2<? extends Unit>> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r13 == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L19;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 aVar;
            r53.j jVar = (r53.j) this.f201913b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f201912a;
            if (i14 != 0) {
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
            }
            o13.r.b(obj);
            String str = this.f201914c;
            if (str != null) {
                d60.b bVar = this.f201915d.f201911a;
                this.f201913b = jVar;
                this.f201912a = 1;
                obj = f0.J(bVar, new d60.e(bVar, str, null), this);
            } else {
                aVar = new v2.a(new Exception("Invalid course id."), null, null, 6, null);
                this.f201913b = null;
                this.f201912a = 2;
            }
            return aVar2;
            aVar = (v2) obj;
            this.f201913b = null;
            this.f201912a = 2;
        }
    }

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public h(d60.b bVar) {
        bVar.getClass();
        this.f201911a = bVar;
    }

    public final r53.i<v2<Unit>> a(String str) {
        c2 c2Var = new c2(new a(str, this, null));
        x53.c cVar = s0.f129406a;
        return r53.s.A(c2Var, x53.b.f189152a);
    }
}
