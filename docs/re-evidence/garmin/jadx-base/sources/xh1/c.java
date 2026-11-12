package xh1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import fw.m;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxh1/c;", "Landroidx/lifecycle/u1;", "Lg60/c;", "repository", "<init>", "(Lg60/c;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f191046f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g60.c f191047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f191048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<m<g60.b>> f191049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f191050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f191051e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.swim.css.CriticalSwimSpeedEditViewModel$updateCriticalSwimSpeed$1", f = "CriticalSwimSpeedEditViewModel.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191052a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g60.b f191054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g60.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f191054c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(this.f191054c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191052a;
            c cVar = c.this;
            if (i14 == 0) {
                r.b(obj);
                cVar.f191049c.j(m.a.f(m.f73767e, null, null, 3));
                g60.c cVar2 = cVar.f191047a;
                this.f191052a = 1;
                obj = cVar2.a(this.f191054c, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                T t7 = ((v2.b) v2Var).f47386a;
                cVar.f191051e = ((g60.b) t7).b();
                cVar.f191049c.j(m.a.g(m.f73767e, t7, 1));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar2 = (v2.a) v2Var;
                cVar.f191048b.error(c.f191046f + " - Got " + aVar2.f47384b + " http error code while updating critical swim speed.\n " + aVar2.f47385c);
                cVar.f191049c.j(m.a.d(m.f73767e, aVar2.f47383a));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f191046f = c.class.getSimpleName();
    }

    public c(g60.c cVar) {
        cVar.getClass();
        this.f191047a = cVar;
        this.f191048b = gt2.c.b(a2.SETTINGS.f28756a);
        y0<m<g60.b>> y0Var = new y0<>();
        this.f191049c = y0Var;
        this.f191050d = y0Var;
    }

    public final void x4(long j8) {
        DateTime dateTimeNow = DateTime.now();
        ge1.b.T(v1.a(this), null, null, new b(new g60.b(null, Long.valueOf(j8), j0.b(dateTimeNow, "yyyy-MM-dd'T'HH:mm:ss.SSS", null), j0.b(dateTimeNow, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC), g60.d.CLIENT_APP.f76039a), null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxh1/c$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(g60.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g60.c.R.getClass();
            cVar = g60.c.a.a();
        }
        this(cVar);
    }
}
