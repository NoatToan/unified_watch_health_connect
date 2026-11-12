package vg1;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import bs2.ad;
import bs2.bk;
import bs2.hd;
import bs2.id;
import bs2.sd;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.fit.FitRuntimeException;
import java.io.File;
import java.io.IOException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001Bw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvg1/s0;", "Lvg1/a0;", "Luv/i;", "Luv/h;", "Landroid/app/Activity;", "activity", "Luv/h$a;", "settingsProprieties", "Landroidx/lifecycle/z0;", "Lfw/m;", "", "deviceSettingsFetchingObserver", "Ljava/lang/Void;", "deviceSettingsSavingObserver", "", "batteryStatusObserver", "Luv/e;", "firmwareUpdateObserver", "<init>", "(Landroid/app/Activity;Luv/h$a;Landroidx/lifecycle/z0;Landroidx/lifecycle/z0;Landroidx/lifecycle/z0;Landroidx/lifecycle/z0;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 implements a0<uv.i<uv.h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f178156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uv.h.a f178157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.z0<fw.m<String>> f178158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.z0<fw.m<Void>> f178159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.z0<fw.m<Integer>> f178160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.z0<fw.m<uv.e>> f178161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public uv.b f178162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public uv.c f178163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public uv.a f178164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uv.d f178165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final uv.i<uv.h> f178166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f178167l;

    public s0(Activity activity, uv.h.a aVar, androidx.lifecycle.z0<fw.m<String>> z0Var, androidx.lifecycle.z0<fw.m<Void>> z0Var2, androidx.lifecycle.z0<fw.m<Integer>> z0Var3, androidx.lifecycle.z0<fw.m<uv.e>> z0Var4) {
        activity.getClass();
        aVar.getClass();
        this.f178156a = activity;
        this.f178157b = aVar;
        this.f178158c = z0Var;
        this.f178159d = z0Var2;
        this.f178160e = z0Var3;
        this.f178161f = z0Var4;
        this.f178166k = new uv.i<>(null, null, 0, null, 15, null);
        this.f178167l = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.a0
    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f178167l = bundle.getLong("GCM_deviceUnitID", -1L);
            String string = bundle.getString("GCM_currentFirmwareVersion");
            uv.i<uv.h> iVar = this.f178166k;
            iVar.getClass();
            if (string != null) {
                iVar.f172902e = uv.j.a(string);
            }
            uv.h.a aVar = this.f178157b;
            androidx.lifecycle.z0<fw.m<String>> z0Var = this.f178158c;
            Activity activity = this.f178156a;
            if (z0Var != null) {
                uv.b bVar = new uv.b(this.f178167l, aVar);
                this.f178162g = bVar;
                androidx.lifecycle.y0 y0Var = bVar.f172871d;
                if (y0Var != null) {
                    activity.getClass();
                    y0Var.f((androidx.lifecycle.n0) activity, z0Var);
                }
            }
            androidx.lifecycle.z0<fw.m<Void>> z0Var2 = this.f178159d;
            if (z0Var2 != null) {
                uv.c cVar = new uv.c(this.f178167l, aVar);
                this.f178163h = cVar;
                androidx.lifecycle.y0 y0Var2 = cVar.f172876c;
                if (y0Var2 != null) {
                    activity.getClass();
                    y0Var2.f((androidx.lifecycle.n0) activity, z0Var2);
                }
            }
            androidx.lifecycle.z0<fw.m<Integer>> z0Var3 = this.f178160e;
            if (z0Var3 != null) {
                uv.a aVar2 = new uv.a(activity, this.f178167l);
                this.f178164i = aVar2;
                androidx.lifecycle.y0 y0Var3 = aVar2.f172863c;
                if (y0Var3 != null) {
                    activity.getClass();
                    y0Var3.f((androidx.lifecycle.n0) activity, z0Var3);
                }
            }
            androidx.lifecycle.z0<fw.m<uv.e>> z0Var4 = this.f178161f;
            if (z0Var4 != null) {
                uv.d dVar = new uv.d(activity);
                this.f178165j = dVar;
                androidx.lifecycle.y0 y0Var4 = dVar.f172881b;
                if (y0Var4 != null) {
                    activity.getClass();
                    y0Var4.f((androidx.lifecycle.n0) activity, z0Var4);
                }
            }
        }
    }

    @Override // vg1.a0
    public final void c(dc0.a aVar) {
    }

    @Override // vg1.a0
    /* JADX INFO: renamed from: d */
    public final uv.i<uv.h> getF178111a() {
        return this.f178166k;
    }

    @Override // vg1.a0
    public final boolean e() {
        T t7 = this.f178166k.f172898a;
        return t7 != 0 && t7.getF207136c();
    }

    @Override // vg1.a0
    public final void f(r0 r0Var) {
        l80.b bVar = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);
        uv.i<uv.h> iVar = this.f178166k;
        T t7 = iVar.f172898a;
        if (t7 != 0 && t7.getF207136c() && bVar.a(this.f178167l)) {
            r0Var.f178154d = true;
            uv.c cVar = this.f178163h;
            if (cVar != null) {
                T t14 = iVar.f172898a;
                id f166523b = t14 != 0 ? t14.getF207135b() : null;
                T t15 = iVar.f172898a;
                bk bkVarC = t15 != 0 ? t15.c() : null;
                uv.h.a aVar = cVar.f172875b;
                String str = aVar.f172896b;
                File file = aVar.f172897c;
                androidx.lifecycle.y0 y0Var = cVar.f172876c;
                if (f166523b == null || bkVarC == null) {
                    cVar.f172877d.d(null, null);
                    return;
                }
                File file2 = new File(file.getAbsolutePath(), str);
                try {
                    file2.getParentFile().mkdirs();
                    if (file2.getParentFile().exists() && !file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (IOException e4) {
                    y0Var.getClass();
                    fw.m.f73767e.getClass();
                    y0Var.m(fw.m.a.a(null, e4));
                }
                hd hdVar = new hd(file2, sd.a.V1_0);
                try {
                    try {
                        hdVar.d(f166523b);
                        hdVar.d(bkVarC);
                    } catch (FitRuntimeException e14) {
                        y0Var.getClass();
                        fw.m.f73767e.getClass();
                        y0Var.m(fw.m.a.a(null, e14));
                    }
                    hdVar.c();
                    zb0.e eVar = (zb0.e) KoinJavaComponent.get$default(zb0.e.class, null, null, 6, null);
                    String strD = eVar.d(cVar.f172874a);
                    if (strD != null) {
                        try {
                            int i14 = aVar.f172895a;
                            String absolutePath = file.getAbsolutePath();
                            absolutePath.getClass();
                            eVar.u(strD, i14, absolutePath, str, (byte) ad.SETTINGS.f19675a, cVar.f172877d);
                        } catch (RemoteException e15) {
                            y0Var.getClass();
                            fw.m.f73767e.getClass();
                            y0Var.m(fw.m.a.a(null, e15));
                            cVar.a();
                        }
                    }
                } catch (Throwable th3) {
                    hdVar.c();
                    throw th3;
                }
            }
        }
    }

    @Override // vg1.a0
    public final int g() {
        return 16;
    }

    @Override // vg1.a0
    public final void h(Bundle bundle) {
    }

    @Override // vg1.a0
    public final boolean hasModel() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg1.a0
    public final /* bridge */ /* synthetic */ void i(DeviceSettingsDTO deviceSettingsDTO) {
    }

    public /* synthetic */ s0(Activity activity, uv.h.a aVar, androidx.lifecycle.z0 z0Var, androidx.lifecycle.z0 z0Var2, androidx.lifecycle.z0 z0Var3, androidx.lifecycle.z0 z0Var4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(activity, aVar, (i14 & 4) != 0 ? null : z0Var, (i14 & 8) != 0 ? null : z0Var2, (i14 & 16) != 0 ? null : z0Var3, (i14 & 32) != 0 ? null : z0Var4);
    }
}
