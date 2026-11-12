package dq1;

import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import q92.v;
import q92.x;
import te2.k0;
import te2.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldq1/l;", "", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<x> f60769b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f60770a;

    static {
        new a(null);
        f60769b = p13.x.k(x.DI_CONNECT_UPLOAD, x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN, x.DI_CONNECT_LIVETRACK, x.DI_CONNECT_INSIGHTS, x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE, x.DI_CONNECT_AUTO_ACTIVITY_DETECTION);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(f12.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            f12.l.f68084a.getClass();
            lVar = f12.l.a.a();
        }
        this(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, v13.c cVar) throws Throwable {
        m mVar;
        boolean zBooleanValue;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f60773c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f60773c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objB = mVar.f60771a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f60773c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                mVar.f60773c = 1;
                objB = b(list, mVar);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            zBooleanValue = ((Boolean) objB).booleanValue();
            if (zBooleanValue) {
                a2 a2Var = a2.CHILD_ACCOUNTS;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GraduationConsentRefreshUseCase", "Child account graduation detected (child role + past graduationDateUTC). Consent refresh required.");
            }
        } catch (Exception e4) {
            a2 a2Var2 = a2.CHILD_ACCOUNTS;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Error checking child account graduation status: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "GraduationConsentRefreshUseCase", strD);
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public final Object b(List list, v13.c cVar) throws Throwable {
        n nVar;
        ?? arrayList;
        Long graduationDateUTC;
        Date date;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f60777d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f60777d = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objE0 = nVar.f60775b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f60777d;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objE0);
            if (!s3.b()) {
                return Boolean.FALSE;
            }
            k0 k0Var = new k0();
            nVar.f60774a = list;
            nVar.f60777d = 1;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new n0(k0Var, null), nVar);
            if (objE0 == aVar) {
                arrayList = list;
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = nVar.f60774a;
            o13.r.b(objE0);
            arrayList = list2;
        }
        arrayList = list;
        tc2.a digitalAgeOfConsent = ((tc2.c) objE0).getDigitalAgeOfConsent();
        if (digitalAgeOfConsent == null || (graduationDateUTC = digitalAgeOfConsent.getGraduationDateUTC()) == null) {
            return Boolean.FALSE;
        }
        if (DateTime.now().getMillis() < graduationDateUTC.longValue()) {
            return Boolean.FALSE;
        }
        List<x> list3 = f60769b;
        if (arrayList == 0) {
            arrayList = new ArrayList();
            for (x xVar : list3) {
                p92.o.f136619a.getClass();
                v vVarN = p92.o.n(xVar);
                if (vVarN != null) {
                    arrayList.add(vVarN);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (v vVar : arrayList) {
                if (list3.contains(vVar.f143783a) && q92.c.a(vVar)) {
                    return Boolean.TRUE;
                }
            }
        }
        long jO0 = this.f60770a.O0();
        if (jO0 <= 0) {
            return Boolean.TRUE;
        }
        if (arrayList.isEmpty()) {
            z14 = false;
        } else {
            for (v vVar2 : arrayList) {
                if (!list3.contains(vVar2.f143783a) || (date = vVar2.f143790h) == null || date.getTime() <= jO0) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldq1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "Lq92/x;", "GRADUATION_CONSENT_TYPE_IDS", "Ljava/util/List;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public l(f12.l lVar) {
        lVar.getClass();
        this.f60770a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
