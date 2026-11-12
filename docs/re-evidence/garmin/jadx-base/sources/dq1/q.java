package dq1;

import au0.x;
import au0.z;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.j2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldq1/q;", "", "Lau0/z;", "liveActivityRepositoryWrapper", "Lau0/x;", "liveActivityPreferences", "Lbu0/j;", "isLockedInLiveActivitySessionInProgress", "<init>", "(Lau0/z;Lau0/x;Lbu0/j;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f60783d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f60784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f60785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bu0.j f60786c;

    static {
        new a(null);
    }

    public q(z zVar, x xVar, bu0.j jVar) {
        zVar.getClass();
        xVar.getClass();
        jVar.getClass();
        this.f60784a = zVar;
        this.f60785b = xVar;
        this.f60786c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j8, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f60789c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f60789c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object objC = rVar.f60787a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f60789c;
        if (i15 == 0) {
            o13.r.b(objC);
            if (!this.f60785b.d()) {
                a2 a2Var = a2.ACTIVITY_RECORDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "IsLockedInLiveActivitySessionInProgressAtStartupUseCase", "Not locked in active activity recording session.");
                return Boolean.FALSE;
            }
            s sVar = new s(this, null);
            rVar.f60789c = 1;
            objC = j2.c(j8, sVar, rVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        Boolean bool = (Boolean) objC;
        i2.f36769a.getClass();
        i2.a.b(a2.ACTIVITY_RECORDING, "IsLockedInLiveActivitySessionInProgressAtStartupUseCase", "Has active session: " + bool);
        return Boolean.valueOf(this.f60786c.a(bool != null ? bool.booleanValue() : false));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldq1/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_TIMEOUT_MILLIS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
