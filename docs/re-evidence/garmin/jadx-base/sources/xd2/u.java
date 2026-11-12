package xd2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "Lae2/h0;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getLivetrackSessions$2$1$1", f = "DefaultLivetrackRepository.kt", l = {261}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends List<? extends ae2.h0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ be2.g f190348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190349d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/j0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getLivetrackSessions$2$1$1$1", f = "DefaultLivetrackRepository.kt", l = {262, 262}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.j0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ be2.g f190353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f190354e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, be2.g gVar, String str, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190352c = bVar;
            this.f190353d = gVar;
            this.f190354e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190352c, this.f190353d, this.f190354e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.j0>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190351b;
            be2.g gVar = this.f190353d;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190352c;
                z0Var = bVar.f190045c;
                long j8 = gVar.f17765a;
                this.f190350a = z0Var;
                this.f190351b = 1;
                obj = b.J(bVar, j8, this);
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
            z0Var = this.f190350a;
            o13.r.b(obj);
            String str = gVar.f17768d;
            this.f190350a = null;
            this.f190351b = 2;
            Object objC = z0Var.c((Map) obj, this.f190354e, str, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b bVar, be2.g gVar, String str, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f190347b = bVar;
        this.f190348c = gVar;
        this.f190349d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f190347b, this.f190348c, this.f190349d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends List<? extends ae2.h0>>> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190346a;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f190349d;
            b bVar = this.f190347b;
            a aVar2 = new a(bVar, this.f190348c, str, null);
            this.f190346a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(26));
    }
}
