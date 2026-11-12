package nd0;

import bs2.ad;
import bs2.hd;
import bs2.q00;
import bs2.sd;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.fit.FitRuntimeException;
import f12.l;
import gg1.o0;
import java.io.File;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r53.s;
import y80.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnd0/c;", "Ly80/q0;", "Lf12/l;", "gcmUserSettings", "Lzv/d;", "orcaDeviceSettingsManager", "<init>", "(Lf12/l;Lzv/d;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f125393c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f125394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zv.d f125395b;

    static {
        new a(null);
    }

    public c(l lVar, zv.d dVar) {
        lVar.getClass();
        this.f125394a = lVar;
        this.f125395b = dVar;
    }

    @Override // y80.q0
    public final void a(o0 o0Var, int i14) {
        o0Var.getClass();
        zv.d dVar = this.f125395b;
        if (dVar == null) {
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SpeedSensorUpdateUseCaseImpl", "OrcaDeviceSettingsManager is null, cannot set bike wheel preferences");
        } else {
            q00 q00Var = dVar.f207141b;
            if (q00Var != null) {
                q00Var.n(3, Integer.valueOf(i14));
            }
            this.f125394a.P2(o0Var);
        }
    }

    @Override // y80.q0
    public final r53.b b() {
        return s.f(new d(this, null));
    }

    @Override // y80.q0
    public final Unit c(o0 o0Var, int i14) throws Throwable {
        a(o0Var, i14);
        zv.d dVar = this.f125395b;
        if (dVar != null) {
            Float f14 = new Float((float) this.f125394a.v3());
            q00 q00Var = dVar.f207141b;
            if (q00Var != null) {
                q00Var.n(0, f14);
            }
        }
        if (dVar != null) {
            q00 q00Var2 = dVar.f207140a;
            if (q00Var2 == null || dVar.f207141b == null || ((q00Var2.h(2) != null || dVar.f207141b.h(2) == null) && ((dVar.f207140a.h(1) != null || dVar.f207141b.h(1) == null) && ((dVar.f207140a.h(0) != null || dVar.f207141b.h(0) == null) && ((dVar.f207140a.s() != null || dVar.f207141b.s() == null) && ((dVar.f207140a.r() != null || dVar.f207141b.r() == null) && ((dVar.f207140a.i(3) != null || dVar.f207141b.i(3) == null) && ((dVar.f207140a.i(3) == null || dVar.f207141b.i(3) == null || Integer.compare(dVar.f207141b.i(3).intValue(), dVar.f207140a.i(3).intValue()) == 0) && ((dVar.f207140a.h(2) == null || dVar.f207141b.h(2) == null || Float.compare(dVar.f207141b.h(2).floatValue(), dVar.f207140a.h(2).floatValue()) == 0) && ((dVar.f207140a.h(1) == null || dVar.f207141b.h(1) == null || Float.compare(dVar.f207141b.h(1).floatValue(), dVar.f207140a.h(1).floatValue()) == 0) && ((dVar.f207140a.h(0) == null || dVar.f207141b.h(0) == null || Float.compare(dVar.f207141b.h(0).floatValue(), dVar.f207140a.h(0).floatValue()) == 0) && ((dVar.f207140a.s() == null || dVar.f207141b.s() == null || Long.compare(dVar.f207141b.s().longValue(), dVar.f207140a.s().longValue()) == 0) && (dVar.f207140a.r() == null || dVar.f207141b.r() == null || Long.compare(dVar.f207141b.r().longValue(), dVar.f207140a.r().longValue()) == 0))))))))))))) {
                xv.d dVar2 = new xv.d(0, 647);
                oi2.a.f132270a.getClass();
                l73.c.b().e(dVar2);
                zv.d.b();
            } else {
                dVar.f207140a = dVar.f207141b;
                hd hdVar = null;
                try {
                    try {
                        try {
                            String absolutePath = dVar.f207143d.get().getFilesDir().getAbsolutePath();
                            File file = new File(absolutePath, "settings.fit");
                            file.getParentFile().mkdirs();
                            if (file.getParentFile().exists() && !file.exists()) {
                                try {
                                    file.createNewFile();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            hd hdVar2 = new hd(file, sd.a.V1_0);
                            try {
                                try {
                                    hdVar2.d(dVar.f207144e);
                                    hdVar2.d(dVar.f207141b);
                                    try {
                                        hdVar2.c();
                                    } catch (FitRuntimeException unused) {
                                    }
                                    dVar.c(absolutePath, (byte) ad.SETTINGS.f19675a);
                                    hdVar2.c();
                                } catch (Throwable th3) {
                                    th = th3;
                                    hdVar = hdVar2;
                                    if (hdVar != null) {
                                        try {
                                            hdVar.c();
                                        } catch (FitRuntimeException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (FitRuntimeException e14) {
                                e = e14;
                                hdVar = hdVar2;
                                i2.i("OrcaDeviceSettingsManager", "Oops something bad happened: " + e.getMessage());
                                if (hdVar != null) {
                                    hdVar.c();
                                }
                                return Unit.INSTANCE;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (FitRuntimeException e15) {
                        e = e15;
                    }
                } catch (FitRuntimeException unused3) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // y80.q0
    public final int d() {
        zv.d dVar = this.f125395b;
        if (dVar == null) {
            return 2111;
        }
        q00 q00Var = dVar.f207141b;
        Integer numI = (q00Var == null || q00Var.i(3) == null) ? null : dVar.f207141b.i(3);
        if (numI != null) {
            return numI.intValue();
        }
        return 2111;
    }

    @Override // y80.q0
    public final o0 k() {
        return this.f125394a.k().a() ? o0.METRIC : o0.STATUTE_US;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnd0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
