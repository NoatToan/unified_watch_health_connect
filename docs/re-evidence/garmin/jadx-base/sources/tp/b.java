package tp;

import am.x0;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import fw.m;
import fw.p;
import java.util.List;
import java.util.Locale;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.w;
import p13.x;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltp/b;", "Ltp/a;", "Lkp/a;", "reportsApi", "<init>", "(Lkp/a;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements tp.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f165919b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp.a f165920a;

    static {
        new a(null);
        f165919b = x.k("distance", "duration", "calories", "bmrCalories", "packWeightCalories", "elevationGain", "differenceBodyBattery", "avgStress", "splitSummaries.avgStress.ROUND_ACTIVE", "splitSummaries.avgStressWin.ROUND_ACTIVE", "splitSummaries.avgStressLoss.ROUND_ACTIVE", "splitSummaries.avgStressDraw.ROUND_ACTIVE", "splitSummaries.gamesWon.ROUND_ACTIVE", "splitSummaries.gamesNotWon.ROUND_ACTIVE", "splitSummaries.gamesAverageWon.ROUND_ACTIVE", "splitSummaries.avgPackWeight.PACK_WEIGHT", "beginPackWeight", "avgSpeed");
    }

    public b(kp.a aVar) {
        aVar.getClass();
        this.f165920a = aVar;
    }

    @Override // tp.a
    public final Object a(String str, String str2, String str3, lp.e eVar) {
        return f("monthly", str, str2, str3, eVar);
    }

    @Override // tp.a
    public final Object b(String str, String str2, String str3, v13.c cVar) {
        return f("weekly", str, str2, str3, cVar);
    }

    @Override // tp.a
    public final Object c(String str, String str2, String str3, lp.c cVar) {
        return f("daily", str, str2, str3, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tp.a
    public final Object d(long j8, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f165923c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f165923c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f165921a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f165923c;
        try {
            if (i15 == 0) {
                r.b(objB);
                kp.a aVar2 = this.f165920a;
                cVar2.f165923c = 1;
                objB = aVar2.b(j8, cVar2);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            return new m(null, ((a0) objB).f25745a.isSuccessful() ? p.SUCCESS : p.ERROR, null, null, 9, null);
        } catch (Exception e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.ACTIVITIES;
            String str = "Could not delete activity: " + e4.getMessage();
            aVar3.getClass();
            i2.a.f(a2Var, "ReportsRepoImpl", str);
            return new m(null, p.ERROR, null, null, 9, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:13:0x0029, B:26:0x004f, B:28:0x0059, B:30:0x0068), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0068 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:13:0x0029, B:26:0x004f, B:28:0x0059, B:30:0x0068), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // tp.a
    public final Object e(String str, String str2, String str3, String str4, v13.c cVar) {
        d dVar;
        Exception exc;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f165928e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f165928e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object objA = dVar2.f165926c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f165928e;
        if (i15 != 0) {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = dVar2.f165925b;
            str3 = dVar2.f165924a;
            try {
                r.b(objA);
                a0 a0Var = (a0) objA;
                return a0Var.f25745a.isSuccessful() ? new m(null, p.SUCCESS, a0Var.f25746b, null, 9, null) : new m(null, p.ERROR, null, null, 9, null);
            } catch (Exception e4) {
                e = e4;
                exc = e;
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.ACTIVITIES;
                String message = exc.getMessage();
                StringBuilder sbI = p6.b.i("Could not get activities from ", str3, " until ", str4, ": ");
                sbI.append(message);
                String string = sbI.toString();
                aVar2.getClass();
                i2.a.f(a2Var, "ReportsRepoImpl", string);
                return new m(null, p.ERROR, null, null, 9, null);
            }
        }
        r.b(objA);
        try {
            kp.a aVar3 = this.f165920a;
            dVar2.f165924a = str3;
            dVar2.f165925b = str4;
            dVar2.f165928e = 1;
            try {
                objA = aVar3.a(str, str2, str3, str4, dVar2);
                if (objA == aVar) {
                    return aVar;
                }
                a0 a0Var2 = (a0) objA;
                if (a0Var2.f25745a.isSuccessful()) {
                }
            } catch (Exception e14) {
                exc = e14;
                str3 = str3;
                str4 = str4;
            }
        } catch (Exception e15) {
            e = e15;
            exc = e;
        }
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.ACTIVITIES;
        String message2 = exc.getMessage();
        StringBuilder sbI2 = p6.b.i("Could not get activities from ", str3, " until ", str4, ": ");
        sbI2.append(message2);
        String string2 = sbI2.toString();
        aVar4.getClass();
        i2.a.f(a2Var2, "ReportsRepoImpl", string2);
        return new m(null, p.ERROR, null, null, 9, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(String str, String str2, String str3, String str4, v13.c cVar) {
        e eVar;
        String str5;
        a0 a0Var;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f165933e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f165933e = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object objD = eVar2.f165931c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f165933e;
        try {
            if (i15 == 0) {
                r.b(objD);
                try {
                    boolean zG = s.g(str4, x0.E2.f4358a);
                    kp.a aVar2 = this.f165920a;
                    if (zG) {
                        List<String> listC = w.c(str4);
                        String lowerCase = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        List<String> list = f165919b;
                        eVar2.f165929a = str2;
                        eVar2.f165930b = str3;
                        eVar2.f165933e = 1;
                        objD = aVar2.c(str2, str3, str, false, false, listC, true, lowerCase, list, eVar2);
                        if (objD != aVar) {
                            a0Var = (a0) objD;
                        }
                    } else {
                        List<String> listC2 = w.c(str4);
                        List<String> list2 = f165919b;
                        eVar2.f165929a = str2;
                        eVar2.f165930b = str3;
                        eVar2.f165933e = 2;
                        objD = aVar2.d(str2, str3, str, false, false, listC2, true, list2, eVar2);
                        if (objD != aVar) {
                            a0Var = (a0) objD;
                        }
                    }
                    return aVar;
                } catch (Exception e4) {
                    e = e4;
                    str5 = str3;
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.ACTIVITIES;
                    String message = e.getMessage();
                    StringBuilder sbI = p6.b.i("Could not get reports from ", str2, " until ", str5, ": ");
                    sbI.append(message);
                    String string = sbI.toString();
                    aVar3.getClass();
                    i2.a.f(a2Var, "ReportsRepoImpl", string);
                    return new m(null, p.ERROR, null, null, 9, null);
                }
            }
            if (i15 == 1) {
                String str6 = eVar2.f165930b;
                String str7 = eVar2.f165929a;
                r.b(objD);
                a0Var = (a0) objD;
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str8 = eVar2.f165930b;
                String str9 = eVar2.f165929a;
                r.b(objD);
                a0Var = (a0) objD;
            }
            return a0Var.f25745a.isSuccessful() ? new m(null, p.SUCCESS, a0Var.f25746b, null, 9, null) : new m(null, p.ERROR, null, null, 9, null);
        } catch (Exception e14) {
            e = e14;
            str5 = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltp/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
