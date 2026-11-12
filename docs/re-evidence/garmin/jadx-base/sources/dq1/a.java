package dq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import p005kotlin.Metadata;
import te2.k0;
import te2.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldq1/a;", "", "Lf12/b;", "userAccount", "<init>", "(Lf12/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f60711b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.b f60712a;

    static {
        new C1290a(null);
    }

    public a(f12.b bVar) {
        bVar.getClass();
        this.f60712a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:13:0x0029, B:19:0x0036, B:31:0x005d, B:20:0x003a, B:26:0x004a, B:28:0x0052, B:23:0x0041), top: B:37:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) throws Throwable {
        b bVar;
        Object objB;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f60715c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f60715c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB2 = bVar.f60713a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f60715c;
        try {
            if (i15 == 0) {
                o13.r.b(objB2);
                bVar.f60715c = 1;
                objB2 = b(bVar);
                if (objB2 == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                o13.r.b(objB2);
            } else {
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(objB2);
                        return objB2;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB2);
            }
            bVar.f60715c = 3;
            objB = b(bVar);
            if (objB == obj) {
                return obj;
            }
            return objB;
            if (((Boolean) objB2).booleanValue()) {
                f12.b bVar2 = this.f60712a;
                bVar.f60715c = 2;
                if (bVar2.r(bVar) != obj) {
                    bVar.f60715c = 3;
                    objB = b(bVar);
                    if (objB == obj) {
                        return objB;
                    }
                }
            } else {
                bVar.f60715c = 3;
                objB = b(bVar);
                if (objB == obj) {
                    return objB;
                }
            }
            return obj;
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error checking age action required: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AgeActionRequestedUseCase", strD);
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f60718c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f60718c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objE0 = cVar2.f60716a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f60718c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            k0 k0Var = new k0();
            cVar2.f60718c = 1;
            x53.c cVar3 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new n0(k0Var, null), cVar2);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        tc2.c cVar4 = (tc2.c) objE0;
        tc2.a digitalAgeOfConsent = cVar4.getDigitalAgeOfConsent();
        tc2.b status = digitalAgeOfConsent != null ? digitalAgeOfConsent.getStatus() : null;
        if (status != tc2.b.DOB_REQUIRED && status != tc2.b.LOCATION_REQUIRED) {
            z14 = false;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "AgeActionRequestedUseCase", "Checking age action required: " + cVar4);
        return Boolean.valueOf(z14);
    }

    /* JADX INFO: renamed from: dq1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldq1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1290a {
        public /* synthetic */ C1290a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1290a() {
        }
    }
}
