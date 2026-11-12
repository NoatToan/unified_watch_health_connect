package b31;

import b63.u;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import kd0.g1;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb31/b;", "Lb31/a;", "Ll80/a;", "deviceDelegate", "Lc31/c;", "deviceOnboardingDao", "Lf31/a;", "onboardingAPI", "<init>", "(Ll80/a;Lc31/c;Lf31/a;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements b31.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.a f15582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c31.c f15583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f31.a f15584c;

    static {
        new a(null);
    }

    public b(l80.a aVar, c31.c cVar, f31.a aVar2) {
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        this.f15582a = aVar;
        this.f15583b = cVar;
        this.f15584c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList l(long j8, int i14, String str, List list, String str2) {
        u uVarA;
        u uVar;
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            Object aVar = null;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            g31.b bVar = (g31.b) obj;
            String str3 = bVar.f75685e;
            String str4 = bVar.f75681a;
            String str5 = bVar.f75688h;
            if (str3 == null || str4 == null || str5 == null) {
                i2.f36769a.getClass();
                i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Skipping item with null typeKey, associationType, or status: " + bVar);
            } else {
                d31.d.f57349b.getClass();
                d31.d dVarA = d31.d.a.a(str3);
                if (dVarA == d31.d.UNKNOWN) {
                    i2.f36769a.getClass();
                    i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Skipping item with UNKNOWN typeKey: " + bVar);
                } else {
                    d31.b.f57332b.getClass();
                    d31.b bVarA = d31.b.a.a(str4);
                    d31.c.f57340b.getClass();
                    d31.c cVarA = d31.c.a.a(str5);
                    Boolean bool = bVar.f75682b;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    String str6 = bVar.f75687g;
                    if (str6 != null) {
                        try {
                            uVarA = u.Companion.a(u.INSTANCE, str6);
                        } catch (Exception e4) {
                            a2 a2Var = a2.ONBOARDING;
                            String strConcat = "DeviceOnboardingRepository - Failed to parse LocalDateTime from reminderDate string: ".concat(str6);
                            i2.f36769a.getClass();
                            i2.a.g(a2Var, strConcat, e4);
                            uVarA = null;
                        }
                        uVar = uVarA;
                    } else {
                        uVar = null;
                    }
                    g31.a aVar2 = bVar.f75684d;
                    aVar = new d31.a(j8, i14, str, str2, i15, dVarA, bVarA, cVarA, zBooleanValue, uVar, aVar2 != null ? aVar2.f75679a : null);
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i15 = i16;
        }
        return arrayList;
    }

    @Override // b31.a
    public final Object a(long j8, d31.d dVar, v13.i iVar) {
        return this.f15583b.k(j8, dVar, iVar);
    }

    @Override // b31.a
    public final Object b(long j8, d31.c cVar, v13.c cVar2) {
        return this.f15583b.g(j8, cVar, cVar2);
    }

    @Override // b31.a
    public final Object c(i31.a aVar) {
        Object objE = this.f15583b.e(aVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // b31.a
    public final r53.i<List<d31.a>> d(long j8) {
        return this.f15583b.h(j8);
    }

    @Override // b31.a
    public final r53.i<List<d31.a>> e(d31.c cVar) {
        cVar.getClass();
        return this.f15583b.a(cVar);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0160 A[Catch: all -> 0x029a, TryCatch #4 {all -> 0x029a, blocks: (B:52:0x015a, B:54:0x0160, B:56:0x0168, B:58:0x0170, B:60:0x0176, B:80:0x01c3, B:99:0x0213, B:102:0x021e), top: B:141:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0168 A[Catch: all -> 0x029a, TryCatch #4 {all -> 0x029a, blocks: (B:52:0x015a, B:54:0x0160, B:56:0x0168, B:58:0x0170, B:60:0x0176, B:80:0x01c3, B:99:0x0213, B:102:0x021e), top: B:141:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0170 A[Catch: all -> 0x029a, TryCatch #4 {all -> 0x029a, blocks: (B:52:0x015a, B:54:0x0160, B:56:0x0168, B:58:0x0170, B:60:0x0176, B:80:0x01c3, B:99:0x0213, B:102:0x021e), top: B:141:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0294 -> B:112:0x0297). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // b31.a
    public final java.lang.Object f(java.util.Set r26, java.util.Set r27, boolean r28, v13.c r29) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b31.b.f(java.util.Set, java.util.Set, boolean, v13.c):java.lang.Object");
    }

    @Override // b31.a
    public final Object g(long j8, v13.c cVar) {
        Object objI = this.f15583b.i(j8, cVar);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:42:0x00e6, B:44:0x00ec, B:46:0x00f0, B:51:0x00fb, B:53:0x0106, B:55:0x010f, B:57:0x0113, B:59:0x011c), top: B:86:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x011a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x015e A[Catch: all -> 0x005a, TryCatch #4 {all -> 0x005a, blocks: (B:18:0x0055, B:63:0x0154, B:65:0x015e, B:66:0x0163, B:67:0x0174), top: B:90:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0163 A[Catch: all -> 0x005a, TryCatch #4 {all -> 0x005a, blocks: (B:18:0x0055, B:63:0x0154, B:65:0x015e, B:66:0x0163, B:67:0x0174), top: B:90:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0163, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0195, please report this as an issue */
    @Override // b31.a
    public final Object h(long j8, long j14, d31.d dVar, d31.c cVar, v13.c cVar2) {
        e eVar;
        d31.c cVar3;
        long j15;
        Object obj;
        d31.d dVar2;
        d31.a aVar;
        long j16;
        d31.d dVar3;
        d31.a aVar2;
        d31.c cVar4;
        long j17;
        d31.c cVar5;
        e eVar2;
        d31.d dVar4;
        d31.d dVar5;
        d31.a aVar3;
        int i14;
        b bVar;
        String str;
        Boolean boolValueOf;
        String string;
        u uVar;
        d31.b bVar2;
        Object bVar3;
        Throwable thB;
        d31.c cVar6;
        a0 a0Var;
        long j18 = j14;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i15 = eVar.f15610j;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f15610j = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar2);
            }
        } else {
            eVar = new e(this, cVar2);
        }
        Object objD = eVar.f15608h;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f15610j;
        c31.c cVar7 = this.f15583b;
        try {
            try {
                if (i16 == 0) {
                    r.b(objD);
                    eVar.f15603c = dVar;
                    cVar3 = cVar;
                    eVar.f15604d = cVar3;
                    j15 = j8;
                    eVar.f15601a = j15;
                    eVar.f15602b = j18;
                    eVar.f15610j = 1;
                    Object objK = cVar7.k(j18, dVar, eVar);
                    if (objK != aVar4) {
                        obj = objK;
                        dVar2 = dVar;
                    }
                    return aVar4;
                }
                if (i16 != 1) {
                    if (i16 == 2) {
                        i14 = eVar.f15607g;
                        j18 = eVar.f15602b;
                        long j19 = eVar.f15601a;
                        bVar = (b) eVar.f15606f;
                        aVar3 = eVar.f15605e;
                        d31.c cVar8 = eVar.f15604d;
                        dVar5 = eVar.f15603c;
                        try {
                            r.b(objD);
                            cVar4 = cVar8;
                            j16 = j19;
                            try {
                                f31.a aVar5 = bVar.f15584c;
                                if (aVar3 != null || (bVar2 = aVar3.f57327g) == null) {
                                    str = null;
                                } else {
                                    str = bVar2.f57339a;
                                }
                                if (aVar3 != null) {
                                    boolValueOf = Boolean.valueOf(aVar3.f57329i);
                                } else {
                                    boolValueOf = null;
                                }
                                Long l14 = new Long(j18);
                                String str2 = dVar5.f57377a;
                                if (aVar3 != null || (uVar = aVar3.f57330j) == null) {
                                    string = null;
                                } else {
                                    string = uVar.toString();
                                }
                                g31.b bVar4 = new g31.b(str, boolValueOf, l14, (g31.a) null, str2, (g31.d) null, string, cVar4.f57347a, new Long(j16), 40, (p005kotlin.jvm.internal.j) null);
                                eVar.f15603c = dVar5;
                                eVar.f15604d = cVar4;
                                eVar.f15605e = aVar3;
                                eVar.f15606f = null;
                                eVar.f15601a = j16;
                                eVar.f15602b = j18;
                                eVar.f15607g = i14;
                                eVar.f15610j = 3;
                                objD = aVar5.d(bVar4, eVar);
                                if (objD != aVar4) {
                                    aVar2 = aVar3;
                                    dVar3 = dVar5;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                aVar2 = aVar3;
                                dVar3 = dVar5;
                                int i17 = q.f128596b;
                                bVar3 = new q.b(th);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cVar4 = cVar8;
                            j16 = j19;
                            aVar2 = aVar3;
                            dVar3 = dVar5;
                            int i18 = q.f128596b;
                            bVar3 = new q.b(th);
                            thB = q.b(bVar3);
                            if (thB == null) {
                                return bVar3;
                            }
                            i2.f36769a.getClass();
                            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating device onboarding item for deviceId: " + j18 + ", type: " + dVar3 + ", status: " + cVar4, thB);
                            if (aVar2 == null) {
                                return bVar3;
                            }
                            cVar6 = aVar2.f57328h;
                            eVar.f15603c = null;
                            eVar.f15604d = null;
                            eVar.f15605e = null;
                            eVar.f15606f = bVar3;
                            eVar.f15601a = j16;
                            eVar.f15602b = j18;
                            eVar.f15607g = 0;
                            eVar.f15610j = 4;
                            if (cVar7.c(j18, dVar3, cVar6, eVar) != aVar4) {
                                return aVar4;
                            }
                            return bVar3;
                        }
                        return aVar4;
                    }
                    if (i16 != 3) {
                        if (i16 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = eVar.f15606f;
                        r.b(objD);
                        return obj2;
                    }
                    j18 = eVar.f15602b;
                    j16 = eVar.f15601a;
                    aVar2 = eVar.f15605e;
                    cVar4 = eVar.f15604d;
                    dVar3 = eVar.f15603c;
                    try {
                        r.b(objD);
                    } catch (Throwable th5) {
                        th = th5;
                        int i19 = q.f128596b;
                        bVar3 = new q.b(th);
                    }
                    a0Var = (a0) objD;
                    if (a0Var.f25745a.isSuccessful()) {
                        throw new Exception("Failed to update onboarding item: " + a0Var);
                    }
                    bVar3 = Unit.INSTANCE;
                    int i24 = q.f128596b;
                    thB = q.b(bVar3);
                    if (thB == null) {
                        return bVar3;
                    }
                    i2.f36769a.getClass();
                    i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating device onboarding item for deviceId: " + j18 + ", type: " + dVar3 + ", status: " + cVar4, thB);
                    if (aVar2 == null) {
                        return bVar3;
                    }
                    cVar6 = aVar2.f57328h;
                    eVar.f15603c = null;
                    eVar.f15604d = null;
                    eVar.f15605e = null;
                    eVar.f15606f = bVar3;
                    eVar.f15601a = j16;
                    eVar.f15602b = j18;
                    eVar.f15607g = 0;
                    eVar.f15610j = 4;
                    if (cVar7.c(j18, dVar3, cVar6, eVar) != aVar4) {
                        return aVar4;
                    }
                    return bVar3;
                }
                j18 = eVar.f15602b;
                j15 = eVar.f15601a;
                d31.c cVar9 = eVar.f15604d;
                dVar2 = eVar.f15603c;
                r.b(objD);
                obj = objD;
                cVar3 = cVar9;
                Object objC = cVar7.c(j17, dVar4, cVar5, eVar2);
                cVar7 = cVar7;
                j18 = j17;
                eVar = eVar2;
                if (objC != aVar4) {
                    dVar5 = dVar4;
                    j16 = j15;
                    aVar3 = aVar;
                    i14 = 0;
                    bVar = this;
                    cVar4 = cVar5;
                    f31.a aVar6 = bVar.f15584c;
                    if (aVar3 != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (aVar3 != null) {
                        boolValueOf = Boolean.valueOf(aVar3.f57329i);
                    } else {
                        boolValueOf = null;
                    }
                    Long l15 = new Long(j18);
                    String str3 = dVar5.f57377a;
                    if (aVar3 != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    g31.b bVar5 = new g31.b(str, boolValueOf, l15, (g31.a) null, str3, (g31.d) null, string, cVar4.f57347a, new Long(j16), 40, (p005kotlin.jvm.internal.j) null);
                    eVar.f15603c = dVar5;
                    eVar.f15604d = cVar4;
                    eVar.f15605e = aVar3;
                    eVar.f15606f = null;
                    eVar.f15601a = j16;
                    eVar.f15602b = j18;
                    eVar.f15607g = i14;
                    eVar.f15610j = 3;
                    objD = aVar6.d(bVar5, eVar);
                    if (objD != aVar4) {
                        aVar2 = aVar3;
                        dVar3 = dVar5;
                        a0Var = (a0) objD;
                        if (a0Var.f25745a.isSuccessful()) {
                            throw new Exception("Failed to update onboarding item: " + a0Var);
                        }
                        bVar3 = Unit.INSTANCE;
                        int i25 = q.f128596b;
                        thB = q.b(bVar3);
                        if (thB == null) {
                            return bVar3;
                        }
                        i2.f36769a.getClass();
                        i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating device onboarding item for deviceId: " + j18 + ", type: " + dVar3 + ", status: " + cVar4, thB);
                        if (aVar2 == null) {
                            return bVar3;
                        }
                        cVar6 = aVar2.f57328h;
                        eVar.f15603c = null;
                        eVar.f15604d = null;
                        eVar.f15605e = null;
                        eVar.f15606f = bVar3;
                        eVar.f15601a = j16;
                        eVar.f15602b = j18;
                        eVar.f15607g = 0;
                        eVar.f15610j = 4;
                        if (cVar7.c(j18, dVar3, cVar6, eVar) != aVar4) {
                            return bVar3;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                cVar7 = cVar7;
                j18 = j17;
                dVar2 = dVar4;
                cVar3 = cVar5;
                eVar = eVar2;
                j16 = j15;
                dVar3 = dVar2;
                aVar2 = aVar;
                cVar4 = cVar3;
                int i110 = q.f128596b;
                bVar3 = new q.b(th);
            }
            int i26 = q.f128596b;
            eVar.f15603c = dVar2;
            eVar.f15604d = cVar3;
            eVar.f15605e = aVar;
            eVar.f15606f = this;
            eVar.f15601a = j15;
            eVar.f15602b = j18;
            eVar.f15607g = 0;
            eVar.f15610j = 2;
            j17 = j18;
            cVar5 = cVar3;
            eVar2 = eVar;
            dVar4 = dVar2;
        } catch (Throwable th7) {
            th = th7;
        }
        aVar = (d31.a) obj;
        return aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // b31.a
    public final Object i(int i14, v13.c cVar) {
        c cVar2;
        Object bVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i15 = cVar2.f15587c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar2.f15587c = i15 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objA = cVar2.f15585a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar2.f15587c;
        try {
            if (i16 == 0) {
                r.b(objA);
                int i17 = q.f128596b;
                f31.a aVar2 = this.f15584c;
                cVar2.f15587c = 1;
                objA = aVar2.a(i14, cVar2);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            a0 a0Var = (a0) objA;
            if (!a0Var.f25745a.isSuccessful()) {
                throw new Exception("Failed to delete all user onboarding items: " + a0Var);
            }
            bVar = Unit.INSTANCE;
            int i18 = q.f128596b;
            Throwable thB = q.b(bVar);
            if (thB != null) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.g(a2Var, "DeviceOnboardingRepository - Error deleting all user onboarding items", thB);
            }
            return bVar;
        } catch (Throwable th3) {
            int i19 = q.f128596b;
            bVar = new q.b(th3);
        }
    }

    @Override // b31.a
    public final Object j(d31.c cVar, v13.i iVar) {
        return this.f15583b.l(cVar, iVar);
    }

    @Override // b31.a
    public final Object k(g1 g1Var) {
        return this.f15583b.d(g1Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lb31/b$a;", "", "<init>", "()V", "", "DATE_TIME_FORMAT", "Ljava/lang/String;", "TAG", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
