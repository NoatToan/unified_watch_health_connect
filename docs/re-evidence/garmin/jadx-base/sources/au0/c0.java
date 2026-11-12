package au0;

import am.x0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau0/c0;", "", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f12870a;

    public c0(z zVar) {
        this.f12870a = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:61:0x0192  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0194, code lost:
    
        if (r0 == r3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(of2.b0 b0Var, v13.c cVar) {
        b0 b0Var2;
        of2.b0 b0Var3;
        boolean z14;
        of2.b0 b0Var4;
        boolean zBooleanValue;
        String str;
        rs2.c cVar2;
        jg2.a aVar;
        x0 x0VarA;
        p2 p2Var;
        Object value;
        p2 p2Var2;
        Object value2;
        c2 c2Var;
        Object objH;
        boolean z15;
        boolean z16;
        x0 x0VarA2;
        Object objB;
        if (cVar instanceof b0) {
            b0Var2 = (b0) cVar;
            int i14 = b0Var2.f12863f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var2.f12863f = i14 - Integer.MIN_VALUE;
            } else {
                b0Var2 = new b0(this, cVar);
            }
        } else {
            b0Var2 = new b0(this, cVar);
        }
        Object objA = b0Var2.f12861d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var2.f12863f;
        z zVar = this.f12870a;
        if (i15 == 0) {
            o13.r.b(objA);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "LiveActivityRepositoryWrapper", "setupClient");
            fg2.z zVar2 = zVar.f13004c;
            b0Var3 = b0Var;
            b0Var2.f12858a = b0Var3;
            b0Var2.f12863f = 1;
            objA = zVar2.a(b0Var2);
            if (objA != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            b0Var3 = b0Var2.f12858a;
            o13.r.b(objA);
        } else {
            if (i15 == 2) {
                z14 = b0Var2.f12859b;
                b0Var4 = b0Var2.f12858a;
                o13.r.b(objA);
                zBooleanValue = ((Boolean) objA).booleanValue();
                if (z14 && !zBooleanValue) {
                    a2 a2Var2 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var2, "LiveActivityRepositoryWrapper", "User failed to meet prerequisites.");
                    return Boolean.FALSE;
                }
                str = b0Var4.f131748e;
                cVar2 = b0Var4.f131745b;
                aVar = b0Var4.f131746c;
                if (str == null) {
                    a2 a2Var3 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.p(a2Var3, "LiveActivityRepositoryWrapper", "Missing activity type key.");
                    return Boolean.FALSE;
                }
                h0.f12930a.getClass();
                x0VarA = h0.a.a(str);
                if (x0VarA == null) {
                    a2 a2Var4 = a2.SUBSCRIPTIONS;
                    String strConcat = "Received unknown activity type key ".concat(str);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var4, "LiveActivityRepositoryWrapper", strConcat);
                    return Boolean.FALSE;
                }
                p2Var = zVar.f13013l;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, aVar));
                p2Var2 = zVar.f13015n;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, cVar2));
                zVar.f13019r = x0VarA;
                zVar.f13010i.k(null, new sf2.a.d(b0Var4.f131744a, str, b0Var4.f131757n, b0Var4.f131753j));
                tf2.b bVar = b0Var4.f131754k.f164471c;
                c2Var = zVar.f13020s;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                zVar.f13020s = ge1.b.T(o53.c0.a(s0.f129406a), null, null, new a0(bVar, zVar, aVar, null), 3);
                fg2.c cVar3 = zVar.f13005d;
                long f172494b = cVar2.getF172494b();
                b0Var2.f12858a = b0Var4;
                b0Var2.f12859b = z14;
                b0Var2.f12860c = zBooleanValue;
                b0Var2.f12863f = 3;
                objH = cVar3.h(f172494b, b0Var2);
                if (objH != aVar2) {
                    z15 = z14;
                    z16 = zBooleanValue;
                    objA = objH;
                    if (!((Boolean) objA).booleanValue()) {
                        b0Var2.f12858a = null;
                        b0Var2.f12859b = z15;
                        b0Var2.f12860c = z16;
                        b0Var2.f12863f = 4;
                        int i16 = z.f13001t;
                        zVar.getClass();
                        h0.a aVar4 = h0.f12930a;
                        String str2 = b0Var4.f131748e;
                        aVar4.getClass();
                        x0VarA2 = h0.a.a(str2);
                        if (x0VarA2 == null) {
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            String strN = fb1.c.n("Failed to get activity type for key ", b0Var4.f131748e);
                            i2.f36769a.getClass();
                            i2.a.f(a2Var5, "LiveActivityRepositoryWrapper", strN);
                            objB = Unit.INSTANCE;
                        } else {
                            objB = zVar.f13007f.b(x0VarA2, b0Var2);
                            if (objB != u13.a.COROUTINE_SUSPENDED) {
                                objB = Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar2;
            }
            if (i15 == 3) {
                z16 = b0Var2.f12860c;
                z15 = b0Var2.f12859b;
                b0Var4 = b0Var2.f12858a;
                o13.r.b(objA);
                if (!((Boolean) objA).booleanValue()) {
                    b0Var2.f12858a = null;
                    b0Var2.f12859b = z15;
                    b0Var2.f12860c = z16;
                    b0Var2.f12863f = 4;
                    int i17 = z.f13001t;
                    zVar.getClass();
                    h0.a aVar5 = h0.f12930a;
                    String str3 = b0Var4.f131748e;
                    aVar5.getClass();
                    x0VarA2 = h0.a.a(str3);
                    if (x0VarA2 == null) {
                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                        String strN2 = fb1.c.n("Failed to get activity type for key ", b0Var4.f131748e);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var6, "LiveActivityRepositoryWrapper", strN2);
                        objB = Unit.INSTANCE;
                    } else {
                        objB = zVar.f13007f.b(x0VarA2, b0Var2);
                        if (objB != u13.a.COROUTINE_SUSPENDED) {
                            objB = Unit.INSTANCE;
                        }
                    }
                }
            } else {
                if (i15 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
        }
        a2 a2Var7 = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var7, "LiveActivityRepositoryWrapper", "Finished setupClient successfully.");
        return Boolean.TRUE;
        boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
        fg2.c cVar4 = zVar.f13005d;
        long f172494b2 = b0Var3.f131745b.getF172494b();
        b0Var2.f12858a = b0Var3;
        b0Var2.f12859b = zBooleanValue2;
        b0Var2.f12863f = 2;
        Object objD = cVar4.d(f172494b2, b0Var2);
        if (objD != aVar2) {
            of2.b0 b0Var5 = b0Var3;
            z14 = zBooleanValue2;
            objA = objD;
            b0Var4 = b0Var5;
            zBooleanValue = ((Boolean) objA).booleanValue();
            if (z14) {
            }
            str = b0Var4.f131748e;
            cVar2 = b0Var4.f131745b;
            aVar = b0Var4.f131746c;
            if (str == null) {
                a2 a2Var8 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.p(a2Var8, "LiveActivityRepositoryWrapper", "Missing activity type key.");
                return Boolean.FALSE;
            }
            h0.f12930a.getClass();
            x0VarA = h0.a.a(str);
            if (x0VarA == null) {
                a2 a2Var9 = a2.SUBSCRIPTIONS;
                String strConcat2 = "Received unknown activity type key ".concat(str);
                i2.f36769a.getClass();
                i2.a.f(a2Var9, "LiveActivityRepositoryWrapper", strConcat2);
                return Boolean.FALSE;
            }
            p2Var = zVar.f13013l;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, aVar));
            p2Var2 = zVar.f13015n;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, cVar2));
            zVar.f13019r = x0VarA;
            zVar.f13010i.k(null, new sf2.a.d(b0Var4.f131744a, str, b0Var4.f131757n, b0Var4.f131753j));
            tf2.b bVar2 = b0Var4.f131754k.f164471c;
            c2Var = zVar.f13020s;
            if (c2Var != null) {
                c2Var.c(null);
            }
            zVar.f13020s = ge1.b.T(o53.c0.a(s0.f129406a), null, null, new a0(bVar2, zVar, aVar, null), 3);
            fg2.c cVar5 = zVar.f13005d;
            long f172494b3 = cVar2.getF172494b();
            b0Var2.f12858a = b0Var4;
            b0Var2.f12859b = z14;
            b0Var2.f12860c = zBooleanValue;
            b0Var2.f12863f = 3;
            objH = cVar5.h(f172494b3, b0Var2);
            if (objH != aVar2) {
                z15 = z14;
                z16 = zBooleanValue;
                objA = objH;
                if (!((Boolean) objA).booleanValue()) {
                    b0Var2.f12858a = null;
                    b0Var2.f12859b = z15;
                    b0Var2.f12860c = z16;
                    b0Var2.f12863f = 4;
                    int i18 = z.f13001t;
                    zVar.getClass();
                    h0.a aVar6 = h0.f12930a;
                    String str4 = b0Var4.f131748e;
                    aVar6.getClass();
                    x0VarA2 = h0.a.a(str4);
                    if (x0VarA2 == null) {
                        a2 a2Var10 = a2.SUBSCRIPTIONS;
                        String strN3 = fb1.c.n("Failed to get activity type for key ", b0Var4.f131748e);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var10, "LiveActivityRepositoryWrapper", strN3);
                        objB = Unit.INSTANCE;
                    } else {
                        objB = zVar.f13007f.b(x0VarA2, b0Var2);
                        if (objB != u13.a.COROUTINE_SUSPENDED) {
                            objB = Unit.INSTANCE;
                        }
                    }
                }
                a2 a2Var11 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.b(a2Var11, "LiveActivityRepositoryWrapper", "Finished setupClient successfully.");
                return Boolean.TRUE;
            }
        }
        return aVar2;
    }
}
