package xd2;

import com.google.android.gms.wallet.WalletConstants;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lxd2/g1;", "", "<anonymous>", "(Lo53/b0;)Lxd2/g1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$endGrouptrackSession$2", f = "DefaultLivetrackRepository.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super g1<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae2.e0 f190172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Period f190173f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$endGrouptrackSession$2$1", f = "DefaultLivetrackRepository.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z0 f190174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f190175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f190176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f190177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f190178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ae2.e0 f190179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Period f190180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, long j8, String str, ae2.e0 e0Var, Period period, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f190176c = bVar;
            this.f190177d = j8;
            this.f190178e = str;
            this.f190179f = e0Var;
            this.f190180g = period;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f190176c, this.f190177d, this.f190178e, this.f190179f, this.f190180g, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190175b;
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f190176c;
                z0Var = bVar.f190045c;
                this.f190174a = z0Var;
                this.f190175b = 1;
                obj = b.J(bVar, this.f190177d, this);
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
            z0Var = this.f190174a;
            o13.r.b(obj);
            ae2.x xVar = new ae2.x(DateTime.now(), this.f190179f, this.f190180g);
            this.f190174a = null;
            this.f190175b = 2;
            Object objF = z0Var.f((Map) obj, this.f190178e, xVar, this);
            return objF == aVar ? aVar : objF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, long j8, String str, ae2.e0 e0Var, Period period, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f190169b = bVar;
        this.f190170c = j8;
        this.f190171d = str;
        this.f190172e = e0Var;
        this.f190173f = period;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f190169b, this.f190170c, this.f190171d, this.f190172e, this.f190173f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super g1<? extends Unit>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190168a;
        if (i14 == 0) {
            o13.r.b(obj);
            Period period = this.f190173f;
            b bVar = this.f190169b;
            a aVar2 = new a(bVar, this.f190170c, this.f190171d, this.f190172e, period, null);
            this.f190168a = 1;
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
        return h1.a((yd2.b) obj, new x91.j(19));
    }
}
