package b31;

import b63.u;
import b63.w;
import b63.z;
import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lb31/i;", "Lb31/h;", "Lc31/j;", "promptOnboardingDao", "Lf31/a;", "onboardingAPI", "<init>", "(Lc31/j;Lf31/a;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c31.j f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f31.a f15643b;

    static {
        new a(null);
    }

    public i(c31.j jVar, f31.a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f15642a = jVar;
        this.f15643b = aVar;
    }

    public static ArrayList f(List list) {
        u uVarA;
        u uVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g31.b bVar = (g31.b) it.next();
            String str = bVar.f75685e;
            String str2 = bVar.f75688h;
            d31.f fVar = null;
            if (str == null || str2 == null) {
                i2.f36769a.getClass();
                i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Skipping item with null typeKey or status: " + bVar);
            } else {
                d31.d.f57349b.getClass();
                d31.d dVarA = d31.d.a.a(str);
                if (dVarA == d31.d.UNKNOWN) {
                    i2.f36769a.getClass();
                    i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Skipping item with UNKNOWN type: " + bVar);
                } else {
                    d31.c.f57340b.getClass();
                    d31.c cVarA = d31.c.a.a(str2);
                    String str3 = bVar.f75687g;
                    if (str3 != null) {
                        try {
                            uVarA = u.Companion.a(u.INSTANCE, str3);
                        } catch (Exception e4) {
                            a2 a2Var = a2.ONBOARDING;
                            String strConcat = "DeviceOnboardingRepository - Failed to parse LocalDateTime from reminderDate string: ".concat(str3);
                            i2.f36769a.getClass();
                            i2.a.g(a2Var, strConcat, e4);
                            uVarA = null;
                        }
                        uVar = uVarA;
                    } else {
                        uVar = null;
                    }
                    if (dVarA == d31.d.PARTNER_CHALLENGE_PROMOTE) {
                        g31.d dVar = bVar.f75686f;
                        String str4 = dVar != null ? dVar.f75698a : null;
                        Integer num = dVar != null ? dVar.f75701d : null;
                        if (str4 == null || num == null) {
                            i2.f36769a.getClass();
                            i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Skipping PARTNER_CHALLENGE_PROMOTE item with null badgeKey or challengeCategory: " + bVar);
                        } else {
                            fVar = new d31.f(dVarA, cVarA, uVar, new d31.e(str4, dVar.f75699b, dVar.f75700c, num, dVar.f75702e));
                        }
                    } else {
                        fVar = new d31.f(dVarA, cVarA, uVar, null, 8, null);
                    }
                }
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // b31.h
    public final Object a(d31.c cVar, zo0.d.c cVar2) {
        return this.f15642a.g(cVar, cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:34:0x00b3, B:36:0x00bd, B:39:0x00c5, B:40:0x00d6), top: B:50:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:34:0x00b3, B:36:0x00bd, B:39:0x00c5, B:40:0x00d6), top: B:50:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00c5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00ea, please report this as an issue */
    @Override // b31.h
    public final Object b(long j8, d31.d dVar, d31.c cVar, v13.c cVar2) {
        l lVar;
        d31.d dVar2;
        i iVar;
        long j14;
        int i14;
        d31.c cVar3;
        Object bVar;
        Throwable thB;
        a0 a0Var;
        d31.c cVar4 = cVar;
        if (cVar2 instanceof l) {
            lVar = (l) cVar2;
            int i15 = lVar.f15666h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lVar.f15666h = i15 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar2);
            }
        } else {
            lVar = new l(this, cVar2);
        }
        Object objD = lVar.f15664f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = lVar.f15666h;
        if (i16 == 0) {
            r.b(objD);
            try {
                int i17 = q.f128596b;
                c31.j jVar = this.f15642a;
                lVar.f15660b = dVar;
                lVar.f15661c = cVar4;
                lVar.f15662d = this;
                lVar.f15659a = j8;
                lVar.f15663e = 0;
                lVar.f15666h = 1;
                if (jVar.c(dVar, cVar4, lVar) != aVar) {
                    iVar = this;
                    j14 = j8;
                    dVar2 = dVar;
                    i14 = 0;
                    f31.a aVar2 = iVar.f15643b;
                    g31.b bVar2 = new g31.b((String) null, (Boolean) null, (Long) null, (g31.a) null, dVar2.f57377a, (g31.d) null, (String) null, cVar4.f57347a, new Long(j14), 111, (p005kotlin.jvm.internal.j) null);
                    lVar.f15660b = dVar2;
                    lVar.f15661c = cVar4;
                    lVar.f15662d = null;
                    lVar.f15659a = j14;
                    lVar.f15663e = i14;
                    lVar.f15666h = 2;
                    objD = aVar2.d(bVar2, lVar);
                    if (objD != aVar) {
                        cVar3 = cVar4;
                        a0Var = (a0) objD;
                        if (!a0Var.f25745a.isSuccessful()) {
                            throw new Exception("Failed to update onboarding item: " + a0Var);
                        }
                        bVar = Unit.INSTANCE;
                        int i18 = q.f128596b;
                        thB = q.b(bVar);
                        if (thB != null) {
                            i2.f36769a.getClass();
                            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating prompt onboarding item for type: " + dVar2 + ", status: " + cVar3, thB);
                        }
                        return bVar;
                    }
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                dVar2 = dVar;
            }
        } else if (i16 == 1) {
            i14 = lVar.f15663e;
            j14 = lVar.f15659a;
            i iVar2 = lVar.f15662d;
            d31.c cVar5 = lVar.f15661c;
            dVar2 = lVar.f15660b;
            try {
                r.b(objD);
                iVar = iVar2;
                cVar4 = cVar5;
                try {
                    f31.a aVar3 = iVar.f15643b;
                    g31.b bVar3 = new g31.b((String) null, (Boolean) null, (Long) null, (g31.a) null, dVar2.f57377a, (g31.d) null, (String) null, cVar4.f57347a, new Long(j14), 111, (p005kotlin.jvm.internal.j) null);
                    lVar.f15660b = dVar2;
                    lVar.f15661c = cVar4;
                    lVar.f15662d = null;
                    lVar.f15659a = j14;
                    lVar.f15663e = i14;
                    lVar.f15666h = 2;
                    objD = aVar3.d(bVar3, lVar);
                    if (objD != aVar) {
                        cVar3 = cVar4;
                        a0Var = (a0) objD;
                        if (!a0Var.f25745a.isSuccessful()) {
                            throw new Exception("Failed to update onboarding item: " + a0Var);
                        }
                        bVar = Unit.INSTANCE;
                        int i19 = q.f128596b;
                        thB = q.b(bVar);
                        if (thB != null) {
                            i2.f36769a.getClass();
                            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating prompt onboarding item for type: " + dVar2 + ", status: " + cVar3, thB);
                        }
                        return bVar;
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    int i24 = q.f128596b;
                    bVar = new q.b(th);
                    cVar3 = cVar4;
                }
            } catch (Throwable th5) {
                th = th5;
                cVar4 = cVar5;
            }
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar3 = lVar.f15661c;
            d31.d dVar3 = lVar.f15660b;
            try {
                r.b(objD);
                dVar2 = dVar3;
                try {
                    a0Var = (a0) objD;
                    if (!a0Var.f25745a.isSuccessful()) {
                        throw new Exception("Failed to update onboarding item: " + a0Var);
                    }
                    bVar = Unit.INSTANCE;
                    int i110 = q.f128596b;
                    thB = q.b(bVar);
                    if (thB != null) {
                        i2.f36769a.getClass();
                        i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating prompt onboarding item for type: " + dVar2 + ", status: " + cVar3, thB);
                    }
                    return bVar;
                } catch (Throwable th6) {
                    th = th6;
                    cVar4 = cVar3;
                    int i25 = q.f128596b;
                    bVar = new q.b(th);
                    cVar3 = cVar4;
                }
            } catch (Throwable th7) {
                th = th7;
                dVar2 = dVar3;
                cVar4 = cVar3;
                int i26 = q.f128596b;
                bVar = new q.b(th);
                cVar3 = cVar4;
                thB = q.b(bVar);
                if (thB != null) {
                    i2.f36769a.getClass();
                    i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating prompt onboarding item for type: " + dVar2 + ", status: " + cVar3, thB);
                }
                return bVar;
            }
        }
        int i27 = q.f128596b;
        bVar = new q.b(th);
        cVar3 = cVar4;
        thB = q.b(bVar);
        if (thB != null) {
            i2.f36769a.getClass();
            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error updating prompt onboarding item for type: " + dVar2 + ", status: " + cVar3, thB);
        }
        return bVar;
    }

    @Override // b31.h
    public final Object c(i31.a aVar) {
        Object objA = this.f15642a.a(aVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // b31.h
    public final Object d(ArrayList arrayList, v13.c cVar) {
        j jVar;
        i iVar;
        int i14;
        List list;
        ArrayList arrayList2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i15 = jVar.f15649f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                jVar.f15649f = i15 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objB = jVar.f15647d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = jVar.f15649f;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = jVar.f15646c;
                    iVar = jVar.f15644a;
                    r.b(objB);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = jVar.f15645b;
                    r.b(objB);
                }
                int i17 = q.f128596b;
                return arrayList2;
            }
            r.b(objB);
            int i18 = q.f128596b;
            b63.l lVarA = b63.a.C0229a.f16171a.a();
            z.INSTANCE.getClass();
            LocalDateTime localDateTime = b63.b.d(lVarA, z.f16226b).f16216a;
            f31.a aVar2 = this.f15643b;
            int year = localDateTime.getYear();
            Month month = localDateTime.getMonth();
            month.getClass();
            w wVarA = b63.c.a(month);
            int dayOfMonth = localDateTime.getDayOfMonth();
            wVarA.getClass();
            String string = new u(year, wVarA, dayOfMonth, 23, 59, 59, 1).toString();
            ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((d31.d) it.next()).f57377a);
            }
            jVar.f15644a = this;
            jVar.f15646c = 0;
            jVar.f15649f = 1;
            objB = aVar2.b(string, arrayList3, jVar);
            if (objB != aVar) {
                iVar = this;
                i14 = 0;
            }
            return aVar;
            a0 a0Var = (a0) objB;
            if (!a0Var.f25745a.isSuccessful()) {
                throw new Exception("Failed to fetch prompt onboarding items: " + a0Var);
            }
            g31.c cVar2 = (g31.c) a0Var.f25746b;
            if (cVar2 == null || (list = cVar2.f75696e) == null) {
                list = j0.f134944a;
            }
            iVar.getClass();
            ArrayList arrayListF = f(list);
            a2 a2Var = a2.ONBOARDING;
            ArrayList arrayList4 = new ArrayList(y.r(arrayListF, 10));
            Iterator it3 = arrayListF.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((d31.f) it3.next()).f57383a);
            }
            i2.f36769a.getClass();
            i2.a.a(a2Var, "DeviceOnboardingRepository - Caching prompt onboarding items for - " + arrayList4);
            c31.j jVar2 = iVar.f15642a;
            jVar.f15644a = null;
            jVar.f15645b = arrayListF;
            jVar.f15646c = i14;
            jVar.f15649f = 2;
            if (jVar2.e(arrayListF, jVar) != aVar) {
                arrayList2 = arrayListF;
                int i19 = q.f128596b;
                return arrayList2;
            }
            return aVar;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            q.b bVar = new q.b(th3);
            Throwable thB = q.b(bVar);
            if (thB != null) {
                a2 a2Var2 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.g(a2Var2, "DeviceOnboardingRepository - Error fetching prompt onboarding items", thB);
            }
            return bVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00fd A[Catch: all -> 0x0114, TryCatch #2 {all -> 0x0114, blocks: (B:30:0x00f3, B:32:0x00fd, B:35:0x0117), top: B:54:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00fd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x014a, please report this as an issue */
    @Override // b31.h
    public final Object e(long j8, d31.d dVar, int i14, v13.c cVar) {
        k kVar;
        u uVarD;
        i iVar;
        d31.d dVar2;
        int i15;
        a0 a0Var;
        c31.j jVar;
        int i16;
        Object bVar;
        Throwable thB;
        long j14 = j8;
        d31.d dVar3 = dVar;
        int i17 = i14;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i18 = kVar.f15658i;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                kVar.f15658i = i18 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f15656g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = kVar.f15658i;
        if (i19 == 0) {
            r.b(obj);
            try {
                int i24 = q.f128596b;
                b63.l lVarA = b63.a.C0229a.f16171a.a();
                e53.c.a aVar2 = e53.c.f63094b;
                b63.l lVarB = lVarA.b(e53.e.e(i17, e53.f.DAYS));
                z.INSTANCE.getClass();
                uVarD = b63.b.d(lVarB, z.f16226b);
                LocalDateTime localDateTime = uVarD.f16216a;
                f31.a aVar3 = this.f15643b;
                int year = localDateTime.getYear();
                Month month = localDateTime.getMonth();
                month.getClass();
                w wVarA = b63.c.a(month);
                int dayOfMonth = localDateTime.getDayOfMonth();
                wVarA.getClass();
                g31.b bVar2 = new g31.b(null, null, null, null, dVar3.f57377a, null, new u(year, wVarA, dayOfMonth, 0, 0, 1, 1).toString(), d31.c.NOT_STARTED.f57347a, new Long(j14), 47, (p005kotlin.jvm.internal.j) null);
                kVar.f15651b = dVar3;
                kVar.f15652c = this;
                kVar.f15653d = uVarD;
                kVar.f15650a = j14;
                kVar.f15654e = i17;
                kVar.f15655f = 0;
                kVar.f15658i = 1;
                Object objD = aVar3.d(bVar2, kVar);
                if (objD != aVar) {
                    iVar = this;
                    dVar2 = dVar3;
                    i15 = 0;
                    obj = objD;
                    a0Var = (a0) obj;
                    if (!a0Var.f25745a.isSuccessful()) {
                        i2.f36769a.getClass();
                        i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Failed to postpone onboarding item: " + a0Var);
                    }
                    jVar = iVar.f15642a;
                    kVar.f15651b = dVar2;
                    kVar.f15652c = null;
                    kVar.f15653d = null;
                    kVar.f15650a = j14;
                    kVar.f15654e = i17;
                    kVar.f15655f = i15;
                    kVar.f15658i = 2;
                    if (jVar.f(dVar2, uVarD, kVar) != aVar) {
                        i16 = i17;
                        bVar = Unit.INSTANCE;
                        int i25 = q.f128596b;
                    }
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                int i26 = q.f128596b;
                bVar = new q.b(th);
                dVar2 = dVar3;
                i16 = i17;
            }
        } else {
            if (i19 == 1) {
                int i27 = kVar.f15655f;
                int i28 = kVar.f15654e;
                long j15 = kVar.f15650a;
                uVarD = kVar.f15653d;
                iVar = kVar.f15652c;
                dVar2 = kVar.f15651b;
                try {
                    r.b(obj);
                    i15 = i27;
                    i17 = i28;
                    j14 = j15;
                    try {
                        a0Var = (a0) obj;
                        if (!a0Var.f25745a.isSuccessful()) {
                            i2.f36769a.getClass();
                            i2.a.e(a2.ONBOARDING, "DeviceOnboardingRepository - Failed to postpone onboarding item: " + a0Var);
                        }
                        jVar = iVar.f15642a;
                        kVar.f15651b = dVar2;
                        kVar.f15652c = null;
                        kVar.f15653d = null;
                        kVar.f15650a = j14;
                        kVar.f15654e = i17;
                        kVar.f15655f = i15;
                        kVar.f15658i = 2;
                        if (jVar.f(dVar2, uVarD, kVar) != aVar) {
                            i16 = i17;
                            bVar = Unit.INSTANCE;
                            int i29 = q.f128596b;
                        }
                        return aVar;
                    } catch (Throwable th4) {
                        th = th4;
                        dVar3 = dVar2;
                        int i210 = q.f128596b;
                        bVar = new q.b(th);
                        dVar2 = dVar3;
                        i16 = i17;
                        thB = q.b(bVar);
                        if (thB != null) {
                            i2.f36769a.getClass();
                            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error postponing prompt onboarding item for type: " + dVar2 + " by " + i16 + " days", thB);
                        }
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i17 = i28;
                    dVar3 = dVar2;
                    int i211 = q.f128596b;
                    bVar = new q.b(th);
                    dVar2 = dVar3;
                    i16 = i17;
                    thB = q.b(bVar);
                    if (thB != null) {
                        i2.f36769a.getClass();
                        i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error postponing prompt onboarding item for type: " + dVar2 + " by " + i16 + " days", thB);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i16 = kVar.f15654e;
            d31.d dVar4 = kVar.f15651b;
            try {
                r.b(obj);
                dVar2 = dVar4;
                try {
                    bVar = Unit.INSTANCE;
                    int i212 = q.f128596b;
                } catch (Throwable th6) {
                    th = th6;
                    i17 = i16;
                    dVar3 = dVar2;
                    int i213 = q.f128596b;
                    bVar = new q.b(th);
                    dVar2 = dVar3;
                    i16 = i17;
                }
            } catch (Throwable th7) {
                th = th7;
                i17 = i16;
                dVar3 = dVar4;
                int i214 = q.f128596b;
                bVar = new q.b(th);
                dVar2 = dVar3;
                i16 = i17;
            }
        }
        thB = q.b(bVar);
        if (thB != null) {
            i2.f36769a.getClass();
            i2.a.g(a2.ONBOARDING, "DeviceOnboardingRepository - Error postponing prompt onboarding item for type: " + dVar2 + " by " + i16 + " days", thB);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb31/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
