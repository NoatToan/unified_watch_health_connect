package cr1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.storage.device.DeviceStorageRepo$getDeviceECGVideoPath$3", f = "DeviceStorageRepo.kt", l = {166}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f55381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f55384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f55385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.l f55386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f55387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f55388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f55389i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u0 u0Var, com.garmin.android.apps.connectmobile.devices.model.l lVar, boolean z14, f fVar, String str, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f55385e = u0Var;
        this.f55386f = lVar;
        this.f55387g = z14;
        this.f55388h = fVar;
        this.f55389i = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f55385e, this.f55386f, this.f55387g, this.f55388h, this.f55389i, dVar);
        jVar.f55384d = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        f fVar;
        String str;
        String str2;
        InputStream inputStream;
        b0 b0Var = (b0) this.f55384d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55383c;
        String absolutePath = null;
        try {
            if (i14 == 0) {
                r.b(obj);
                StringBuilder sb3 = new StringBuilder("getDeviceECGVideoPath for ");
                u0 u0Var = this.f55385e;
                sb3.append(u0Var);
                sb3.append(" deviceDto=[");
                com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f55386f;
                sb3.append(lVar);
                sb3.append("], clearCache = ");
                boolean z14 = this.f55387g;
                sb3.append(z14);
                String string = sb3.toString();
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "DeviceStorageRepo", string);
                f fVar2 = this.f55388h;
                e eVar = fVar2.f55365c;
                Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                String str3 = this.f55389i;
                String strA = e.a(contextC, str3);
                if (z14) {
                    i2.a.b(a2Var, "DeviceStorageRepo", "getDeviceECGVideoPath -> clear cache requested, possible corrupted file, deleting existing file");
                    new File(strA).delete();
                }
                if (new File(strA).exists() && !z14) {
                    i2.a.b(a2Var, "DeviceStorageRepo", "getDeviceECGVideoPath -> cached file already exists, returning path");
                    return strA;
                }
                i2.a.b(a2Var, "DeviceStorageRepo", "getDeviceECGVideoPath -> no cached file at path " + strA + ", downloading");
                br1.a aVarB = fVar2.b(u0Var, lVar);
                if (aVarB != null) {
                    i2.a.b(a2Var, "DeviceStorageRepo", "getDeviceECGVideoPath -> Manifest " + aVarB);
                    Map mapB = e.b(fVar2.f55365c, aVarB, a.f55354c);
                    Iterator it = mapB.keySet().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        str2 = (String) next;
                        str2.getClass();
                    } while (!w.z(str2, "ecg_tutorial.mp4", true));
                    String str4 = (String) next;
                    if (str4 != null) {
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.b(a2Var2, "DeviceStorageRepo", "getDeviceECGVideoPath -> Videos urlMap=[" + mapB + "]");
                        String str5 = (String) p13.u0.c(str4, mapB);
                        this.f55384d = b0Var;
                        this.f55381a = fVar2;
                        this.f55382b = str3;
                        this.f55383c = 1;
                        Object objH = fVar2.h(str5, this);
                        if (objH == aVar) {
                            return aVar;
                        }
                        fVar = fVar2;
                        obj = objH;
                        str = str3;
                    }
                }
                return absolutePath;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f55382b;
            fVar = this.f55381a;
            r.b(obj);
            if (inputStream != null) {
                File fileA = f.a(fVar, str, inputStream);
                String str6 = "getDeviceECGVideoPath -> video file written to " + fileA.getAbsolutePath();
                i2.a aVar4 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var3, "DeviceStorageRepo", str6);
                absolutePath = fileA.getAbsolutePath();
            } else {
                i2.a aVar5 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar5.getClass();
                i2.a.f(a2Var4, "DeviceStorageRepo", "getDeviceECGVideoPath -> video input stream is null");
            }
        } catch (IOException unused) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var5, "DeviceStorageRepo", "getDeviceECGVideoPath -> failed to write video file");
        }
        inputStream = (InputStream) obj;
        return absolutePath;
    }
}
