package xd2;

import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$expandLivetrackSession$2", f = "DefaultLivetrackRepository.kt", l = {332}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f190245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae2.e0 f190246e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$expandLivetrackSession$2$1", f = "DefaultLivetrackRepository.kt", l = {334, 333}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DateTime f190251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ae2.e0 f190252f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, DateTime dateTime, ae2.e0 e0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190249c = bVar;
            this.f190250d = j8;
            this.f190251e = dateTime;
            this.f190252f = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190249c, this.f190250d, this.f190251e, this.f190252f, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190248b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190249c;
                z0Var = bVar.f190045c;
                this.f190247a = z0Var;
                this.f190248b = 1;
                obj = b.J(bVar, this.f190250d, this);
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
            z0Var = this.f190247a;
            o13.r.b(obj);
            ae2.y yVar = new ae2.y(null, this.f190251e, this.f190252f, null, null, 25, null);
            this.f190247a = null;
            this.f190248b = 2;
            Object objA = z0Var.a((Map) obj, yVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, long j8, DateTime dateTime, ae2.e0 e0Var, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f190243b = bVar;
        this.f190244c = j8;
        this.f190245d = dateTime;
        this.f190246e = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f190243b, this.f190244c, this.f190245d, this.f190246e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends Unit>> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190242a;
        if (i14 == 0) {
            o13.r.b(obj);
            ae2.e0 e0Var = this.f190246e;
            b bVar = this.f190243b;
            a aVar2 = new a(bVar, this.f190244c, this.f190245d, e0Var, null);
            this.f190242a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(22));
    }
}
