package com.garmin.android.apps.connectmobile;

import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/u;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46488a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/u$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        public static final Object a(a aVar, v13.c cVar) {
            p pVar;
            aVar.getClass();
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i14 = pVar.f39753c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    pVar.f39753c = i14 - Integer.MIN_VALUE;
                } else {
                    pVar = new p(aVar, cVar);
                }
            } else {
                pVar = new p(aVar, cVar);
            }
            Object objB = pVar.f39751a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = pVar.f39753c;
            if (i15 == 0) {
                o13.r.b(objB);
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zW = k1.f37122a.W();
                a2 a2Var = a2.USER;
                String strH = com.airbnb.lottie.animation.keyframe.a.h("[bindMfaTokenToOAuth2] ECG available=", zW);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "AppUpgradeManager", strH);
                if (zW) {
                    qf1.b bVar = (qf1.b) KoinJavaComponent.get$default(qf1.b.class, null, null, 6, null);
                    pVar.f39753c = 1;
                    objB = bVar.b(pVar);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
            qu.c cVar2 = (qu.c) objB;
            if (cVar2 instanceof qu.c.C2781c) {
                a2 a2Var2 = a2.USER;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "AppUpgradeManager", "[bindMfaTokenToOAuth2] has MFA token");
                try {
                    ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).u();
                    i2.a.b(a2Var2, "AppUpgradeManager", "[bindMfaTokenToOAuth2] MFA token bound successfully");
                } catch (Exception e4) {
                    a2 a2Var3 = a2.USER;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var3, "AppUpgradeManager", e4);
                }
            } else {
                a2 a2Var4 = a2.USER;
                String strG = com.airbnb.lottie.animation.keyframe.a.g("[bindMfaTokenToOAuth2] no MFA token (expired=", ")", cVar2 instanceof qu.c.a);
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "AppUpgradeManager", strG);
            }
            return Unit.INSTANCE;
        }

        public static final void b(a aVar) {
            aVar.getClass();
            sz0.c cVarB = sz0.c.b();
            f12.l.f68084a.getClass();
            String strU1 = f12.l.a.a().U1();
            cVarB.c(sz0.b.a.SOCIAL_SEARCH, strU1);
            cVarB.c(sz0.b.a.INSIGHTS, strU1);
            cVarB.c(sz0.b.a.WEIGHT, strU1);
            cVarB.c(sz0.b.a.MY_COMMUNITY_SNAPSHOT, strU1);
            cVarB.c(sz0.b.a.SNAPSHOTS, strU1);
            cVarB.c(sz0.b.a.ACHIEVEMENTS, strU1);
            cVarB.c(sz0.b.a.CALENDAR, strU1);
            cVarB.c(sz0.b.a.LEADERBOARD, strU1);
            cVarB.c(sz0.b.a.GEAR, strU1);
            cVarB.c(sz0.b.a.GOLF, strU1);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x009b A[Catch: Exception -> 0x0164, TryCatch #0 {Exception -> 0x0164, blocks: (B:13:0x0038, B:27:0x0095, B:24:0x0078, B:26:0x007e, B:29:0x009b, B:31:0x00a7, B:33:0x00b3, B:38:0x0106, B:40:0x010c, B:42:0x0118, B:18:0x0054, B:21:0x005c, B:23:0x0073), top: B:49:0x0028 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[Catch: Exception -> 0x0164, TryCatch #0 {Exception -> 0x0164, blocks: (B:13:0x0038, B:27:0x0095, B:24:0x0078, B:26:0x007e, B:29:0x009b, B:31:0x00a7, B:33:0x00b3, B:38:0x0106, B:40:0x010c, B:42:0x0118, B:18:0x0054, B:21:0x005c, B:23:0x0073), top: B:49:0x0028 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x010c A[Catch: Exception -> 0x0164, TryCatch #0 {Exception -> 0x0164, blocks: (B:13:0x0038, B:27:0x0095, B:24:0x0078, B:26:0x007e, B:29:0x009b, B:31:0x00a7, B:33:0x00b3, B:38:0x0106, B:40:0x010c, B:42:0x0118, B:18:0x0054, B:21:0x005c, B:23:0x0073), top: B:49:0x0028 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:27:0x0095). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010a -> B:27:0x0095). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0116 -> B:27:0x0095). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0161 -> B:27:0x0095). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object c(com.garmin.android.apps.connectmobile.u.a r17, v13.c r18) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.u.a.c(com.garmin.android.apps.connectmobile.u$a, v13.c):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0066  */
        /* JADX WARN: Code duplicated, block: B:40:0x008f  */
        public static JSONObject d(sd2.f fVar, String str, String str2) {
            String str3;
            String str4;
            String str5;
            byte[] gbleLongTermKey;
            byte[] gbleRand;
            byte[] gbleEdiv;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("macAddress", str);
                jSONObject.put("capabilitiesBitmask", str2);
                if (fVar.getGbleEdiv() == null || (gbleEdiv = fVar.getGbleEdiv()) == null) {
                    str3 = null;
                } else {
                    if (!(gbleEdiv.length == 0)) {
                        byte[] bArrEncode = Base64.encode(fVar.getGbleEdiv(), 0);
                        bArrEncode.getClass();
                        str3 = new String(bArrEncode, d53.c.f57666b);
                    } else {
                        str3 = null;
                    }
                }
                if (fVar.getGbleRand() == null || (gbleRand = fVar.getGbleRand()) == null) {
                    str4 = null;
                } else {
                    if (!(gbleRand.length == 0)) {
                        byte[] bArrEncode2 = Base64.encode(fVar.getGbleRand(), 0);
                        bArrEncode2.getClass();
                        str4 = new String(bArrEncode2, d53.c.f57666b);
                    } else {
                        str4 = null;
                    }
                }
                if (fVar.getGbleLongTermKey() == null || (gbleLongTermKey = fVar.getGbleLongTermKey()) == null) {
                    str5 = null;
                } else {
                    if (!(gbleLongTermKey.length == 0)) {
                        byte[] bArrEncode3 = Base64.encode(fVar.getGbleLongTermKey(), 0);
                        bArrEncode3.getClass();
                        str5 = new String(bArrEncode3, d53.c.f57666b);
                    } else {
                        str5 = null;
                    }
                }
                if (str3 != null && str4 != null && str5 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("encryptionDiversifier", str3);
                    jSONObject2.put("rand", str4);
                    jSONObject2.put("longTermKey", str5);
                    jSONObject.put("androidGarminBonding", jSONObject2);
                }
                return jSONObject;
            } catch (JSONException e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "AppUpgradeManager", "createDeviceConnectionJson() -> " + e4);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object e(String str, String str2, String str3, v13.c cVar) {
            C3888r c3888r;
            if (cVar instanceof C3888r) {
                c3888r = (C3888r) cVar;
                int i14 = c3888r.f41070c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c3888r.f41070c = i14 - Integer.MIN_VALUE;
                } else {
                    c3888r = new C3888r(this, cVar);
                }
            } else {
                c3888r = new C3888r(this, cVar);
            }
            Object objJ = c3888r.f41068a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c3888r.f41070c;
            if (i15 == 0) {
                o13.r.b(objJ);
                pc0.j jVarA = pc0.j.a.a(pc0.j.f137223i);
                c3888r.f41070c = 1;
                objJ = f0.J(jVarA, new pc0.k0(jVarA, str, str2, str3, null), c3888r);
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
            if (v2Var instanceof v2.a) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "updateConnectionInfoOnGC() -> ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "AppUpgradeManager", strD);
            } else if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }

        private a() {
        }
    }
}
