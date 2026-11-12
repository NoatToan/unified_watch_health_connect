package i71;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusDeviceDTO;
import com.garmin.android.apps.connectmobile.v2;
import jw.c0;
import lc.u0;
import org.joda.time.Duration;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li71/v;", "Li71/r;", "Liw/e;", "personalPrefsRepo", "<init>", "(Liw/e;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw.e f92002a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingstatus.domain.dashboard.LastTrainingStatusDeviceServerImpl", f = "LastTrainingStatusDeviceServerImpl.kt", l = {12}, m = "fetchData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f92003a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f92005c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f92003a = obj;
            this.f92005c |= Integer.MIN_VALUE;
            return v.this.a(this);
        }
    }

    static {
        new a(null);
    }

    public v(iw.e eVar) {
        eVar.getClass();
        this.f92002a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i71.r
    public final Object a(t13.d<? super String> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f92005c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f92005c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objJ = bVar.f92003a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f92005c;
        if (i15 == 0) {
            o13.r.b(objJ);
            bVar.f92005c = 1;
            iw.e eVar = this.f92002a;
            objJ = f0.J(eVar, new iw.h(eVar, null), bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            u0.r();
            return null;
        }
        String str = ((TrainingStatusDeviceDTO) ((v2.b) v2Var).f47386a).f39908a;
        if (str != null) {
            long millis = Duration.standardDays(1L).getMillis();
            c0 c0Var = new c0(millis, millis);
            c0Var.e("https://connectapi.garmin.com/userpreference-service/TrainingStatus.last.device");
            c0Var.d(Unit.INSTANCE, str);
        }
        return str;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li71/v$a;", "", "<init>", "()V", "", "LAST_TS_DEVICE_USED", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
