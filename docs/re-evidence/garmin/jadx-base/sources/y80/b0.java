package y80;

import android.content.Context;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ly80/b0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcr1/d;", "storageApiService", "Lcr1/b;", "s3GarminService", "Ly80/a0;", "deviceStorageHelper", "<init>", "(Landroid/content/Context;Lcr1/d;Lcr1/b;Ly80/a0;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f195089e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f195090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cr1.d f195091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cr1.b f195092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f195093d;

    static {
        new a(null);
    }

    public b0(Context context, cr1.d dVar, cr1.b bVar, a0 a0Var) {
        context.getClass();
        dVar.getClass();
        bVar.getClass();
        a0Var.getClass();
        this.f195090a = context;
        this.f195091b = dVar;
        this.f195092c = bVar;
        this.f195093d = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x024d A[PHI: r2 r6 r7
      0x024d: PHI (r2v13 y80.c0) = (r2v11 y80.c0), (r2v11 y80.c0), (r2v15 y80.c0), (r2v15 y80.c0), (r2v15 y80.c0) binds: [B:67:0x01ee, B:69:0x01f2, B:74:0x0221, B:80:0x0248, B:81:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r6v16 java.util.Map) = (r6v14 java.util.Map), (r6v14 java.util.Map), (r6v19 java.util.Map), (r6v19 java.util.Map), (r6v19 java.util.Map) binds: [B:67:0x01ee, B:69:0x01f2, B:74:0x0221, B:80:0x0248, B:81:0x024a] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r7v20 o90.a) = (r7v18 o90.a), (r7v18 o90.a), (r7v22 o90.a), (r7v22 o90.a), (r7v22 o90.a) binds: [B:67:0x01ee, B:69:0x01f2, B:74:0x0221, B:80:0x0248, B:81:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0251  */
    /* JADX WARN: Code duplicated, block: B:89:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0112 -> B:35:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(y80.b0 r18, java.util.Map r19, zb0.u0 r20, o90.a r21, v13.c r22) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.b0.a(y80.b0, java.util.Map, zb0.u0, o90.a, v13.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0172  */
    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:106:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0180  */
    /* JADX WARN: Code duplicated, block: B:108:0x0183  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:118:0x019f  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:4:0x004b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public final br1.a b(zb0.u0 u0Var, String str, String str2) {
        String str3;
        String strConcat;
        String str4;
        String str5;
        u0Var.getClass();
        String str6 = u0Var.f203854a;
        str6.getClass();
        Object obj = d53.w.W(str6, new String[]{","}).get(0);
        String str7 = "_golfer";
        switch (a0.b.f195085a[u0Var.ordinal()]) {
            case 1:
                if (str == null) {
                    strConcat = null;
                } else {
                    if (d53.w.z(str, "Captain", true)) {
                        str3 = "_captain";
                    } else if (d53.w.z(str, "Golfer", true)) {
                        strConcat = "_golfer";
                    } else if (d53.w.z(str, "Adventurer", true)) {
                        strConcat = "_adventurer";
                    } else if (d53.w.z(str, "carbonAthlete", true)) {
                        str3 = "_carbonAthlete";
                    } else if (d53.w.z(str, "Athlete", true)) {
                        strConcat = "_athlete";
                    } else if (d53.w.z(str, "performanceEdition", true)) {
                        str3 = "_performanceEdition";
                    } else if (!d53.w.z(str, "damascus", true)) {
                        strConcat = "";
                    } else {
                        str3 = "_damascus";
                    }
                    strConcat = str3;
                }
                break;
            case 2:
                if (zb0.u0.w(str) || zb0.u0.w(str2)) {
                    strConcat = "_quatix";
                } else {
                    strConcat = null;
                }
                break;
            case 3:
                if (zb0.u0.y(str) || zb0.u0.y(str2)) {
                    strConcat = "_tactix";
                } else {
                    strConcat = null;
                }
                break;
            case 4:
                String lowerCase = (str2 == null ? "" : str2).toLowerCase(Locale.ENGLISH);
                if (u0Var == zb0.u0.T2 && lowerCase.contains("quatix")) {
                    if (str2 == null) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (zb0.u0.d(u0Var, str4)) {
                        if (str2 == null) {
                            str5 = "";
                        } else {
                            str5 = str2;
                        }
                        if (zb0.u0.e(u0Var, str5)) {
                            strConcat = "_quatix";
                        } else {
                            str3 = "_titanium";
                        }
                    } else {
                        strConcat = "_quatix_solar";
                    }
                } else if (zb0.u0.e(u0Var, str2 == null ? "" : str2)) {
                    if (str2 == null) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (zb0.u0.d(u0Var, str4)) {
                        if (str2 == null) {
                            str5 = "";
                        } else {
                            str5 = str2;
                        }
                        if (zb0.u0.e(u0Var, str5)) {
                            strConcat = "_quatix";
                        } else {
                            str3 = "_titanium";
                        }
                    } else {
                        strConcat = "_quatix_solar";
                    }
                } else {
                    str3 = "_pro";
                }
                strConcat = str3;
                break;
            case 5:
                strConcat = "_s_pro";
                break;
            case 6:
                strConcat = "_s";
                break;
            case 7:
                if (zb0.u0.d(u0Var, str2 == null ? "" : str2)) {
                    strConcat = "_quatix_solar";
                } else if (!zb0.u0.f(u0Var, str2 == null ? "" : str2)) {
                    String lowerCase2 = (str2 == null ? "" : str2).toLowerCase(Locale.ENGLISH);
                    if (u0Var == zb0.u0.V2 && lowerCase2.contains("tactixdelta")) {
                        strConcat = "_tactix";
                    } else {
                        strConcat = "_x";
                    }
                } else {
                    strConcat = "_tactix";
                }
                break;
            case 8:
                if (zb0.u0.m(str) || zb0.u0.m(str2)) {
                    strConcat = "_porsche";
                } else {
                    strConcat = null;
                }
                break;
            case 9:
                if (zb0.u0.i(str) || zb0.u0.i(str2)) {
                    strConcat = "_mk2i";
                } else {
                    strConcat = null;
                }
                break;
            case 10:
                if (zb0.u0.k(str) || zb0.u0.k(str2)) {
                    strConcat = "_mk3si";
                } else {
                    strConcat = null;
                }
                break;
            case 11:
            case 12:
            case 13:
                if (zb0.u0.x(str) || zb0.u0.x(str2)) {
                    strConcat = "_tactical";
                } else {
                    strConcat = null;
                }
                break;
            case 14:
                if (zb0.u0.w(str) || zb0.u0.w(str2)) {
                    strConcat = "_quatix";
                } else {
                    strConcat = null;
                }
                break;
            case 15:
                if (zb0.u0.x(str) || zb0.u0.x(str2)) {
                    strConcat = "_tactical";
                } else {
                    strConcat = null;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                if (zb0.u0.h(str) || zb0.u0.h(str2)) {
                    strConcat = "_lte";
                } else {
                    strConcat = null;
                }
                break;
            case 23:
                if (str == null) {
                    strConcat = null;
                } else {
                    if (d53.w.z(str, "Adventurer", true)) {
                        str7 = "_adventurer";
                    } else if (d53.w.z(str, "Athlete", true)) {
                        str7 = "_athlete";
                    } else if (d53.w.z(str, "Aviator", true)) {
                        str7 = "_aviator";
                    } else if (d53.w.z(str, "Commander", true)) {
                        str7 = "_commander";
                    } else if (d53.w.z(str, "Diver", true)) {
                        str7 = "_diver";
                    } else if (!d53.w.z(str, "Golfer", true)) {
                        str7 = "";
                    }
                    strConcat = str7.concat(zb0.u0.h(str) ? "_lte" : "");
                }
                break;
            default:
                strConcat = "";
                break;
        }
        if (strConcat == null) {
            strConcat = "";
        }
        String str8 = obj + strConcat;
        try {
            cr1.d dVar = this.f195091b;
            cr1.d.f55359a.getClass();
            c83.a0<String> a0VarExecute = dVar.a(cr1.d.a.a(), new br1.c(str8, null, 0, 6, null)).execute();
            if (!a0VarExecute.f25745a.isSuccessful()) {
                String str9 = u0Var + " getDeviceAssetsManifest() -> server error response code=[" + a0VarExecute.f25745a.code() + "]";
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "DeviceStorageRepository", str9);
                return null;
            }
            String str10 = a0VarExecute.f25746b;
            if (str10 != null) {
                br1.b.f19576b.getClass();
                return new br1.b(str10).a();
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "DeviceStorageRepository", u0Var + " getDeviceAssetsManifest() -> theme assets storage manifest JSON response is NULL.");
            return null;
        } catch (HttpException e4) {
            String str11 = u0Var + " getDeviceAssetsManifest() -> server error response code=[" + e4.code() + "] message=[" + e4.message() + "].";
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "DeviceStorageRepository", str11);
            return null;
        } catch (Throwable th3) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var4, "DeviceStorageRepository", u0Var + " getDeviceAssetsManifest() -> server error message=[" + th3 + "].");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, v13.c cVar) {
        d0 d0Var;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i14 = d0Var.f195112c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f195112c = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, cVar);
            }
        } else {
            d0Var = new d0(this, cVar);
        }
        Object objJ = d0Var.f195110a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f195112c;
        if (i15 == 0) {
            o13.r.b(objJ);
            e0 e0Var = new e0(this, str, null);
            d0Var.f195112c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, e0Var, d0Var);
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
        if (v2Var instanceof v2.b) {
            return BitmapFactory.decodeStream(((ResponseBody) ((v2.b) v2Var).f47386a).byteStream());
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "getDeviceBitmapAsset() -> error message=[", "].");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DeviceStorageRepository", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(String str, v13.c cVar) throws IOException {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f195136c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f195136c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objJ = g0Var.f195134a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f195136c;
        if (i15 == 0) {
            o13.r.b(objJ);
            h0 h0Var = new h0(this, str, null);
            g0Var.f195136c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, h0Var, g0Var);
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
        if (v2Var instanceof v2.b) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((ResponseBody) ((v2.b) v2Var).f47386a).byteStream(), d53.c.f57666b), 8192);
            try {
                String strE = lg.d.E(bufferedReader);
                bufferedReader.close();
                return strE;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(bufferedReader, th3);
                    throw th4;
                }
            }
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "getDeviceLottieAsset() -> error message=[", "].");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DeviceStorageRepository", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, v13.c cVar) {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f195162c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f195162c = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objJ = j0Var.f195160a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f195162c;
        if (i15 == 0) {
            o13.r.b(objJ);
            k0 k0Var = new k0(this, str, null);
            j0Var.f195162c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, k0Var, j0Var);
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
        if (v2Var instanceof v2.b) {
            return (dr1.a) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "getDeviceLottieTutorialsSetup() -> error message=[", "].");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DeviceStorageRepository", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(String str, v13.c cVar) {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f195187c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f195187c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objJ = n0Var.f195185a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f195187c;
        if (i15 == 0) {
            o13.r.b(objJ);
            o0 o0Var = new o0(this, str + "android/tutorials/device_setup_assets.json", null);
            n0Var.f195187c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, o0Var, n0Var);
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
        if (v2Var instanceof v2.b) {
            return (er1.a) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "getDeviceTutorialsSetup() -> error message=[", "].");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DeviceStorageRepository", strH);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ly80/b0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IMAGE_STORAGE_MANIFEST_DEVICE_JSON", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
