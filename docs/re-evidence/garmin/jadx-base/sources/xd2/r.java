package xd2;

import fe2.s1;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "Lfe2/s1;", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackMessages$2", f = "DefaultLivetrackRepository.kt", l = {419}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends List<? extends s1>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f190318e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lae2/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getGrouptrackMessages$2$1", f = "DefaultLivetrackRepository.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST, 420}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ae2.j>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f190323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f190324f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, String str, long j14, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190321c = bVar;
            this.f190322d = j8;
            this.f190323e = str;
            this.f190324f = j14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190321c, this.f190322d, this.f190323e, this.f190324f, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ae2.j>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190320b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190321c;
                z0Var = bVar.f190045c;
                this.f190319a = z0Var;
                this.f190320b = 1;
                obj = b.J(bVar, this.f190322d, this);
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
            z0Var = this.f190319a;
            o13.r.b(obj);
            z0 z0Var2 = z0Var;
            this.f190319a = null;
            this.f190320b = 2;
            Object objO = z0Var2.o((Map) obj, this.f190323e, this.f190324f, this);
            return objO == aVar ? aVar : objO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, long j8, String str, long j14, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f190315b = bVar;
        this.f190316c = j8;
        this.f190317d = str;
        this.f190318e = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f190315b, this.f190316c, this.f190317d, this.f190318e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends List<? extends s1>>> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190314a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f190318e;
            b bVar = this.f190315b;
            a aVar2 = new a(bVar, this.f190316c, this.f190317d, j8, null);
            this.f190314a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(25));
    }
}
