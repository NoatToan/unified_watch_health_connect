package xd2;

import fe2.s1;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "Lae2/f0;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$sendGrouptrackMessage$2", f = "DefaultLivetrackRepository.kt", l = {443}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends List<? extends ae2.f0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f190088d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/b0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$sendGrouptrackMessage$2$apiResult$1", f = "DefaultLivetrackRepository.kt", l = {445, 444}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.b0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s1 f190093e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, s1 s1Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190091c = bVar;
            this.f190092d = j8;
            this.f190093e = s1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190091c, this.f190092d, this.f190093e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.b0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190090b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190091c;
                z0Var = bVar.f190045c;
                this.f190089a = z0Var;
                this.f190090b = 1;
                obj = b.J(bVar, this.f190092d, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z0Var = this.f190089a;
            o13.r.b(obj);
            Map<String, String> map = (Map) obj;
            s1 s1Var = this.f190093e;
            Long l14 = s1Var.f70921a;
            Long l15 = s1Var.f70922b;
            ae2.a0 a0Var = new ae2.a0(l14, l15 != null ? new DateTime(l15.longValue()) : null, s1Var.f70923c, s1Var.f70924d, s1Var.f70925e);
            this.f190089a = null;
            this.f190090b = 2;
            Object objG = z0Var.g(map, a0Var, this);
            return objG == aVar ? aVar : objG;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b bVar, long j8, s1 s1Var, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f190086b = bVar;
        this.f190087c = j8;
        this.f190088d = s1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f190086b, this.f190087c, this.f190088d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends List<? extends ae2.f0>>> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190085a;
        if (i14 == 0) {
            o13.r.b(obj);
            s1 s1Var = this.f190088d;
            b bVar = this.f190086b;
            a aVar2 = new a(bVar, this.f190087c, s1Var, null);
            this.f190085a = 1;
            obj = bVar.k(0, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        yd2.b bVar2 = (yd2.b) obj;
        if (!(bVar2 instanceof yd2.b.C3683b)) {
            return g1.a.f.f190166b;
        }
        List<ae2.f0> listA = ((ae2.b0) ((yd2.b.C3683b) bVar2).f196776a).a();
        if (listA == null || !(!listA.isEmpty())) {
            listA = null;
        }
        return new g1.b(listA);
    }
}
