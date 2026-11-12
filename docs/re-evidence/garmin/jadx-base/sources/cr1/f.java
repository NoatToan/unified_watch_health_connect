package cr1;

import android.content.Context;
import android.graphics.BitmapFactory;
import c83.a0;
import c83.b0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d53.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import o13.r;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcr1/f;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lcr1/d;", "storageApiService", "Lcr1/b;", "s3GarminService", "Lcr1/e;", "deviceStorageHelper", "<init>", "(Lcr1/d;Lcr1/b;Lcr1/e;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f55362d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f55363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f55364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f55365c;

    public f(d dVar, b bVar, e eVar) {
        dVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f55363a = dVar;
        this.f55364b = bVar;
        this.f55365c = eVar;
    }

    public static final File a(f fVar, String str, InputStream inputStream) throws IOException {
        fVar.getClass();
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        new e(0);
        File file = new File(e.a(contextC, str));
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(dh.b.M(inputStream));
        inputStream.close();
        fileOutputStream.close();
        return file;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:4:0x0031  */
    public final br1.a b(u0 u0Var, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        String str;
        u0Var.getClass();
        String str2 = u0Var.f203854a;
        str2.getClass();
        Object obj = w.W(str2, new String[]{","}).get(0);
        String str3 = "_quatix";
        switch (e.b.f55361a[u0Var.ordinal()]) {
            case 1:
                if (lVar == null) {
                    str3 = null;
                } else {
                    String applicationKey = lVar.getApplicationKey();
                    if (w.z(applicationKey, "Captain", true)) {
                        str = "_captain";
                    } else if (w.z(applicationKey, "Golfer", true)) {
                        str = "_golfer";
                    } else if (w.z(applicationKey, "Adventurer", true)) {
                        str = "_adventurer";
                    } else if (w.z(applicationKey, "carbonAthlete", true)) {
                        str = "_carbonAthlete";
                    } else if (w.z(applicationKey, "Athlete", true)) {
                        str = "_athlete";
                    } else if (w.z(applicationKey, "performanceEdition", true)) {
                        str = "_performanceEdition";
                    } else if (!w.z(applicationKey, "damascus", true)) {
                        str3 = "";
                    } else {
                        str = "_damascus";
                    }
                    str3 = str;
                }
                break;
            case 2:
                if (!u0.w(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.w(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                    }
                }
                break;
            case 3:
                if (!u0.y(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.y(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_tactix";
                break;
            case 4:
                if (!u0.m(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.m(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_porsche";
                break;
            case 5:
                if (!u0.i(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.i(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_mk2i";
                break;
            case 6:
                if (!u0.k(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.k(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_mk3si";
                break;
            case 7:
            case 8:
            case 9:
                if (!u0.x(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.x(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_tactical";
                break;
            case 10:
                if (!u0.w(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.w(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                    }
                }
                break;
            case 11:
                if (!u0.x(lVar != null ? lVar.getApplicationKey() : null)) {
                    if (!u0.x(lVar != null ? lVar.getProductDisplayName() : null)) {
                        str3 = null;
                        break;
                    }
                }
                str3 = "_tactical";
                break;
            default:
                str3 = "";
                break;
        }
        String str4 = obj + (str3 != null ? str3 : "");
        try {
            d dVar = this.f55363a;
            d.f55359a.getClass();
            a0<String> a0VarExecute = dVar.a(d.a.a(), new br1.c(str4, null, 0, 6, null)).execute();
            if (!a0VarExecute.f25745a.isSuccessful()) {
                String str5 = u0Var + " getDeviceAssetsManifest() -> server error response code=[" + a0VarExecute.f25745a.code() + "]";
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "DeviceStorageRepo", str5);
                return null;
            }
            String str6 = a0VarExecute.f25746b;
            if (str6 != null) {
                br1.b.f19576b.getClass();
                return new br1.b(str6).a();
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "DeviceStorageRepo", u0Var + " getDeviceAssetsManifest() -> theme assets storage manifest JSON response is NULL.");
            return null;
        } catch (HttpException e4) {
            String str7 = u0Var + " getDeviceAssetsManifest() -> server error response code=[" + e4.code() + "] message=[" + e4.message() + "].";
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "DeviceStorageRepo", str7);
            return null;
        } catch (Throwable th3) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var4, "DeviceStorageRepo", u0Var + " getDeviceAssetsManifest() -> server error message=[" + th3 + "].");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(String str, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f55368c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f55368c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f55366a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f55368c;
        if (i15 == 0) {
            r.b(objJ);
            h hVar = new h(this, str, null);
            gVar.f55368c = 1;
            objJ = f0.J(this, hVar, gVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
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
        i2.a.f(a2Var, "DeviceStorageRepo", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a0 -> B:27:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.lang.String r17, boolean r18, boolean r19, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr1.f.d(java.lang.String, boolean, boolean, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, v13.c cVar) throws IOException {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f55392c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f55392c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objJ = kVar.f55390a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f55392c;
        if (i15 == 0) {
            r.b(objJ);
            l lVar = new l(this, str, null);
            kVar.f55392c = 1;
            objJ = f0.J(this, lVar, kVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
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
        i2.a.f(a2Var, "DeviceStorageRepo", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(String str, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f55422c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f55422c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f55420a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f55422c;
        if (i15 == 0) {
            r.b(objJ);
            o oVar = new o(this, str, null);
            nVar.f55422c = 1;
            objJ = f0.J(this, oVar, nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
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
        i2.a.f(a2Var, "DeviceStorageRepo", strH);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(String str, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f55428c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f55428c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f55426a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f55428c;
        if (i15 == 0) {
            r.b(objJ);
            q qVar = new q(this, str, null);
            pVar.f55428c = 1;
            objJ = f0.J(this, qVar, pVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return ((ResponseBody) ((v2.b) v2Var).f47386a).byteStream();
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strH = f3.h(((v2.a) v2Var).f47383a, "getDeviceVideoAsset() -> error message=[", "].");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "DeviceStorageRepo", strH);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcr1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "IMAGE_STORAGE_MANIFEST_BASE_URL", "IMAGE_STORAGE_MANIFEST_DEVICE_JSON", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static f a(a aVar) {
            d dVar = (d) ez0.b.a(ez0.b.f67468a, ez0.c.GCS, d.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            b0.b bVar = new b0.b();
            bVar.b("https://s3.garmin.com/");
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BASIC);
            Unit unit = Unit.INSTANCE;
            bVar.d(builder.addNetworkInterceptor(httpLoggingInterceptor).build());
            mz2.c.f122004a.getClass();
            bVar.f25769d.add(mz2.c.b.a());
            bVar.a(h83.k.c());
            bVar.a(e83.a.c());
            Object objB = bVar.c().b(b.class);
            objB.getClass();
            aVar.getClass();
            dVar.getClass();
            return new f(dVar, (b) objB, new e(320));
        }

        private a() {
        }
    }
}
