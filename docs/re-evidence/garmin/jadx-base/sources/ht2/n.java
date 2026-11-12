package ht2;

import com.garmin.util.common.AppInfo;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d53.w;
import ds.e0;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import o53.a0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht2/n;", "", "<init>", "()V", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r f85667b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h53.a f85669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static com.garmin.inappupdate.e f85670e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f85666a = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<o13.q<com.garmin.inappupdate.e>> f85668c = new q<>();

    static {
        h53.c.a aVar = h53.c.a.f82142a;
        aVar.getClass();
        f85669d = new h53.a(false, aVar);
    }

    private n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, com.garmin.inappupdate.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    public static com.garmin.inappupdate.e c(g gVar, AppInfo appInfo) {
        boolean z14;
        T next;
        gVar.getClass();
        appInfo.getClass();
        String str = appInfo.f52812b;
        String str2 = gVar.f85643b;
        if (str2 == null || w.J(str2)) {
            z14 = true;
        } else {
            long jC0 = gl1.d.c0(str);
            long jC1 = gl1.d.c0(str2);
            z14 = jC0 >= jC1;
            if (!z14) {
                a aVar = a.f85620a;
                StringBuilder sbK = e0.k(jC0, "isMinVersionSatisfied: FALSE, thisAppVersion=", ", minVersion=");
                sbK.append(jC1);
                aVar.d(sbK.toString());
            }
        }
        if (!z14) {
            com.garmin.inappupdate.c cVar = com.garmin.inappupdate.c.PROMPT_REQUIRED_UPDATE;
            str2.getClass();
            return new com.garmin.inappupdate.e(cVar, str2);
        }
        long jC2 = gl1.d.c0(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g.a("5", gVar.f85649h, linkedHashMap);
        g.a("4", gVar.f85648g, linkedHashMap);
        g.a("3", gVar.f85647f, linkedHashMap);
        g.a("2", gVar.f85646e, linkedHashMap);
        g.a(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, gVar.f85645d, linkedHashMap);
        g.a("0", gVar.f85644c, linkedHashMap);
        a.f85620a.b("determineUpdateInfo: inputVersionsMap -> " + linkedHashMap);
        Object obj = str;
        long jLongValue = jC2;
        for (o13.p pVar : h0.Z(linkedHashMap.values())) {
            if (jLongValue < ((Number) pVar.f128595b).longValue()) {
                jLongValue = ((Number) pVar.f128595b).longValue();
                obj = pVar.f128594a;
            }
        }
        if (jLongValue == jC2) {
            a.f85620a.b("determineUpdateInfo: no update, versionOfUpdate[" + obj + "] == currentVersion[" + str + "]");
            return null;
        }
        a.f85620a.d("determineUpdateInfo: highest versionOfUpdate[" + obj + "] > currentVersion[" + str + "]");
        r0 r0Var = new r0();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (r0Var.f105810a == 0 && entry.getValue() != null) {
                Object value = entry.getValue();
                value.getClass();
                if (jC2 < ((Number) ((o13.p) value).f128595b).longValue()) {
                    w13.c cVar2 = com.garmin.inappupdate.c.f52411i;
                    p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                    do {
                        if (!bVarN.hasNext()) {
                            next = 0;
                            break;
                        }
                        next = bVarN.next();
                    } while (!(((com.garmin.inappupdate.c) next).f52412a == Integer.parseInt((String) entry.getKey())));
                    r0Var.f105810a = next;
                }
            }
        }
        if (r0Var.f105810a == 0) {
            r0Var.f105810a = com.garmin.inappupdate.c.NO_PROMPT;
        }
        a aVar2 = a.f85620a;
        T t7 = r0Var.f105810a;
        t7.getClass();
        int i14 = ((com.garmin.inappupdate.c) t7).f52412a;
        T t14 = r0Var.f105810a;
        t14.getClass();
        StringBuilder sbR = wr.g.r(i14, "determineUpdateInfo: priority ", "-", ((com.garmin.inappupdate.c) t14).name(), " update to ");
        sbR.append(obj);
        aVar2.b(sbR.toString());
        T t15 = r0Var.f105810a;
        t15.getClass();
        return new com.garmin.inappupdate.e((com.garmin.inappupdate.c) t15, (String) obj);
    }

    public static Object f(i iVar) throws Throwable {
        com.garmin.inappupdate.e eVar = f85670e;
        if (eVar != null) {
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new m(eVar, null), iVar);
            if (objE0 == u13.a.COROUTINE_SUSPENDED) {
                return objE0;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(g gVar, v13.c cVar) throws Throwable {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f85653c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f85653c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objE0 = hVar.f85651a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f85653c;
        if (i15 == 0) {
            o13.r.b(objE0);
            t13.g gVarPlus = s0.f129406a.plus(new a0("Helper"));
            com.garmin.inappupdate.a aVar2 = new com.garmin.inappupdate.a(gVar, null);
            hVar.f85653c = 1;
            objE0 = ge1.b.e0(gVarPlus, aVar2, hVar);
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
        return ((o13.q) objE0).f128597a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (f(r12) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (f(r12) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (f(r12) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011f, code lost:
    
        if (f(r12) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (f(r12) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0186, code lost:
    
        if (e(r12) == r1) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(com.garmin.inappupdate.e eVar, v13.c cVar) throws Exception {
        i iVar;
        com.garmin.inappupdate.c cVar2;
        int iIntValue;
        b63.l lVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f85656c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f85656c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f85654a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (iVar2.f85656c) {
            case 0:
                o13.r.b(obj);
                if (eVar != null && (cVar2 = eVar.f52423b) != com.garmin.inappupdate.c.NO_PROMPT) {
                    if (cVar2 != com.garmin.inappupdate.c.PROMPT_REQUIRED_UPDATE) {
                        com.garmin.inappupdate.e eVar2 = f85670e;
                        if (eVar2 == null) {
                            f85670e = eVar;
                            iVar2.f85656c = 6;
                        } else if (cVar2 == com.garmin.inappupdate.c.PROMPT_ONCE) {
                            if (s.g(eVar2.f52424c, eVar.f52424c)) {
                                return com.garmin.inappupdate.d.NONE;
                            }
                            f85670e = eVar;
                            iVar2.f85656c = 3;
                        } else if (cVar2.f52412a > eVar2.f52423b.f52412a) {
                            f85670e = eVar;
                            iVar2.f85656c = 4;
                        } else {
                            if (com.garmin.inappupdate.c.PROMPT_CONFIGURABLE == cVar2) {
                                r rVar = f85667b;
                                rVar.getClass();
                                iIntValue = rVar.f85683a * 60;
                            } else {
                                Integer num = cVar2.f52413b;
                                num.getClass();
                                iIntValue = num.intValue();
                            }
                            b63.l lVar2 = eVar2.f52425d;
                            b63.i.INSTANCE.getClass();
                            b63.i.e eVar3 = b63.i.f16187a;
                            lVar2.getClass();
                            eVar3.getClass();
                            long j8 = iIntValue;
                            try {
                                d63.b bVarB = d63.c.b(j8, eVar3.f16196h, C.NANOS_PER_SECOND);
                                Instant instantPlusNanos = lVar2.f16204a.plusSeconds(bVarB.f58077a).plusNanos(bVarB.f58078b);
                                instantPlusNanos.getClass();
                                lVar = new b63.l(instantPlusNanos);
                                break;
                            } catch (Exception e4) {
                                if (!(e4 instanceof DateTimeException) && !(e4 instanceof ArithmeticException)) {
                                    throw e4;
                                }
                                if (j8 > 0) {
                                    b63.l.INSTANCE.getClass();
                                    lVar = b63.l.f16203d;
                                } else {
                                    b63.l.INSTANCE.getClass();
                                    lVar = b63.l.f16202c;
                                }
                            }
                            b63.l lVarA = b63.a.C0229a.f16171a.a();
                            if (lVarA.compareTo(lVar) <= 0) {
                                e53.c.a aVar2 = e53.c.f63094b;
                                Instant instant = lVar.f16204a;
                                long epochSecond = instant.getEpochSecond();
                                Instant instant2 = lVarA.f16204a;
                                long j14 = e53.c.j(e53.c.h(e53.e.f(epochSecond - instant2.getEpochSecond(), e53.f.SECONDS), e53.e.e(instant.getNano() - instant2.getNano(), e53.f.NANOSECONDS)), e53.f.MINUTES);
                                a.f85620a.b("determinePromptType: delay period expires in " + j14 + " minutes");
                                return com.garmin.inappupdate.d.NONE;
                            }
                            f85670e = eVar;
                            iVar2.f85656c = 5;
                        }
                    } else {
                        f85670e = eVar;
                        iVar2.f85656c = 2;
                    }
                    break;
                } else {
                    f85670e = null;
                    iVar2.f85656c = 1;
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.NONE;
            case 2:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.IMMEDIATE;
            case 3:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.FLEXIBLE;
            case 4:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.FLEXIBLE;
            case 5:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.FLEXIBLE;
            case 6:
                o13.r.b(obj);
                return com.garmin.inappupdate.d.FLEXIBLE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (ge1.b.e0(r7, r2, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(r rVar, v13.c cVar) throws Throwable {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f85659c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f85659c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE0 = jVar.f85657a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f85659c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            f85669d.b();
            return Unit.INSTANCE;
        }
        o13.r.b(objE0);
        f85667b = rVar;
        f85670e = null;
        x53.c cVar2 = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        k kVar = new k(null);
        jVar.f85659c = 1;
        objE0 = ge1.b.e0(bVar, kVar, jVar);
        if (objE0 != aVar) {
        }
        return aVar;
        String str = (String) objE0;
        if (str != null) {
            x53.c cVar3 = s0.f129406a;
            com.garmin.inappupdate.b bVar2 = new com.garmin.inappupdate.b(str, null);
            jVar.f85659c = 2;
        } else {
            a.f85620a.b("initialize: no persisted update found");
        }
        f85669d.b();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(v13.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f85663c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f85663c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f85661a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f85663c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                c cVar2 = new c();
                lVar.f85663c = 1;
                if (cVar2.b("InAppUpdateCheckHelper", "mostRecentUpdate", lVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Throwable th3) {
            a.f85620a.c("removePersistentDataStoreEntry", th3);
        }
        return Unit.INSTANCE;
    }
}
