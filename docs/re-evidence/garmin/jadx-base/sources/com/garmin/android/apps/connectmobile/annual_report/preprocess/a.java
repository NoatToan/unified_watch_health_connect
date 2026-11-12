package com.garmin.android.apps.connectmobile.annual_report.preprocess;

import android.content.Context;
import androidx.room.a0;
import au.e;
import au.g;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import ht.s;
import lc.u0;
import o13.r;
import o53.c0;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import tt.j;
import tt.k;
import v13.c;
import vb.h;
import xt.d;
import xt.f;
import xt.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/preprocess/a;", "", "Lxt/a;", "annualReportRepo", "Lau/g;", "annualReportReadyNotificationSender", "<init>", "(Lxt/a;Lau/g;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30185c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt.a f30186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30187b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30188a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30188a = iArr;
        }
    }

    static {
        new C0470a(null);
        f30185c = s0.f105811a.b(a.class).D();
    }

    public a(xt.a aVar, g gVar) {
        aVar.getClass();
        gVar.getClass();
        this.f30186a = aVar;
        this.f30187b = aVar.f192134c.f() != null;
    }

    public static void d(j jVar) {
        rt.a aVar = (rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null);
        j jVarC = aVar.c();
        if (jVarC != jVar) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, f30185c, "Update preprocess state from [" + jVarC + "] to [" + jVar + "]");
            aVar.j(jVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (b(r10, r11, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, c cVar) {
        au.a aVar;
        if (cVar instanceof au.a) {
            aVar = (au.a) cVar;
            int i14 = aVar.f12825d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f12825d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new au.a(this, cVar);
            }
        } else {
            aVar = new au.a(this, cVar);
        }
        Object objJ = aVar.f12823b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f12825d;
        String str = f30185c;
        if (i15 != 0) {
            if (i15 == 1) {
                context = aVar.f12822a;
                r.b(objJ);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            d(j.REPORT_READY);
            return Unit.INSTANCE;
        }
        r.b(objJ);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, str, "getReport");
        aVar.f12822a = context;
        aVar.f12825d = 1;
        xt.a aVar3 = this.f30186a;
        objJ = f0.J(aVar3, new d(aVar3, null), aVar);
        if (objJ != obj) {
        }
        return obj;
        v2 v2Var = (v2) objJ;
        String strH = a0.h("getReport: [", v2Var, "]");
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var2, str, strH);
        if (v2Var instanceof v2.a) {
            i2.a.b(a2Var2, str, "getReport: hasReportCache: [" + this.f30187b + "]");
            d(j.PROCESSING_FAILED);
            nt.a.f127827a.getClass();
            s sVar = s.f85508a;
            lt.a.b bVar = new lt.a.b(lt.a.EnumC2181a.GET_REPORT_API_FAILED);
            sVar.getClass();
            s.a(bVar);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            tt.i iVar = (tt.i) ((v2.b) v2Var).f47386a;
            aVar.f12822a = null;
            aVar.f12825d = 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, tt.i iVar, c cVar) {
        au.b bVar;
        if (cVar instanceof au.b) {
            bVar = (au.b) cVar;
            int i14 = bVar.f12829d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f12829d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new au.b(this, cVar);
            }
        } else {
            bVar = new au.b(this, cVar);
        }
        Object obj = bVar.f12827b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f12829d;
        if (i15 == 0) {
            r.b(obj);
            x53.c cVar2 = o53.s0.f129406a;
            c2 c2VarT = ge1.b.T(c0.a(x53.b.f189152a), null, null, new au.c(iVar, context, this, null), 3);
            bVar.f12826a = context;
            bVar.f12829d = 1;
            if (c2VarT.P(bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = bVar.f12826a;
            r.b(obj);
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, f30185c, "handleAnnualReportDTO: handling job finish, sending notification event");
        context.getClass();
        oi2.a.C2513a.a(oi2.a.f132270a, new e(2025, context, ((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).e(context)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        if (a(r12, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, c cVar) {
        au.d dVar;
        if (cVar instanceof au.d) {
            dVar = (au.d) cVar;
            int i14 = dVar.f12841d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f12841d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new au.d(this, cVar);
            }
        } else {
            dVar = new au.d(this, cVar);
        }
        Object objJ = dVar.f12839b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f12841d;
        String str = f30185c;
        if (i15 != 0) {
            if (i15 == 1) {
                context = dVar.f12838a;
                r.b(objJ);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
            return Unit.INSTANCE;
        }
        r.b(objJ);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, str, "sendGenerateRequest");
        dVar.f12838a = context;
        dVar.f12841d = 1;
        xt.a aVar2 = this.f30186a;
        objJ = f0.J(aVar2, new f(aVar2, null), dVar);
        if (objJ != obj) {
        }
        return obj;
        v2 v2Var = (v2) objJ;
        String strH = a0.h("sendGenerateRequest: [", v2Var, "]");
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.b(a2Var2, str, strH);
        boolean z14 = v2Var instanceof v2.b;
        boolean z15 = this.f30187b;
        if (z14) {
            i reportStatus = ((k) ((v2.b) v2Var).f47386a).getReportStatus();
            int i16 = reportStatus == null ? -1 : b.f30188a[reportStatus.ordinal()];
            if (i16 == 1) {
                dVar.f12838a = null;
                dVar.f12841d = 2;
            } else if (i16 == 2) {
                i2.a.b(a2Var2, str, "sendGenerateRequest: hasReportCache: [" + z15 + "]");
                d(j.PROCESSING_FAILED);
                nt.a.f127827a.getClass();
                s sVar = s.f85508a;
                lt.a.b bVar = new lt.a.b(lt.a.EnumC2181a.REQUEST_API_FAILED);
                sVar.getClass();
                s.a(bVar);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a.b(a2Var2, str, "sendGenerateRequest: hasReportCache: [" + z15 + "]");
            d(j.PROCESSING_FAILED);
            nt.a.f127827a.getClass();
            s sVar2 = s.f85508a;
            lt.a.b bVar2 = new lt.a.b(lt.a.EnumC2181a.REQUEST_API_FAILED);
            sVar2.getClass();
            s.a(bVar2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.annual_report.preprocess.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/preprocess/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0470a {
        public /* synthetic */ C0470a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0470a() {
        }
    }
}
