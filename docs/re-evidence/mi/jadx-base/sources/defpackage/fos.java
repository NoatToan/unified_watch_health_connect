package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class fos {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wxs f18036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tzs f18037b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18038a;

        static {
            int[] iArr = new int[fd.values().length];
            f18038a = iArr;
            try {
                iArr[fd.ALERT_THIRD_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18038a[fd.ALERT_FIND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18038a[fd.ALERT_INCALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18038a[fd.ALERT_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18038a[fd.ALERT_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18038a[fd.ALERT_SMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18038a[fd.ALERT_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18038a[fd.ALERT_LOVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public fos(jet jetVar) {
        this.f18036a = null;
        this.f18037b = null;
        this.f18036a = new wxs(jetVar);
        this.f18037b = new tzs(jetVar);
    }

    public boolean a() {
        synchronized (this.f18037b) {
            try {
                if (!this.f18037b.init()) {
                    return false;
                }
                boolean zO = this.f18037b.o();
                this.f18037b.deInit();
                return zO;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b(fd fdVar) {
        boolean zN;
        synchronized (this.f18036a) {
            try {
                boolean z = false;
                if (!this.f18036a.init()) {
                    return false;
                }
                switch (a.f18038a[fdVar.ordinal()]) {
                    case 1:
                    case 2:
                        zN = this.f18036a.n();
                        z = zN;
                        break;
                    case 3:
                        zN = this.f18036a.o();
                        z = zN;
                        break;
                    case 4:
                        zN = this.f18036a.q();
                        z = zN;
                        break;
                    case 5:
                        zN = this.f18036a.m();
                        z = zN;
                        break;
                    case 6:
                        zN = this.f18036a.r();
                        z = zN;
                        break;
                    case 7:
                        zN = this.f18036a.s();
                        z = zN;
                        break;
                    case 8:
                        zN = this.f18036a.p();
                        z = zN;
                        break;
                }
                this.f18036a.deInit();
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(fd fdVar, int i) {
        boolean zF;
        synchronized (this.f18036a) {
            try {
                boolean z = false;
                if (!this.f18036a.init()) {
                    return false;
                }
                if (fdVar != fd.ALERT_PACE) {
                    if (fdVar == fd.ALERT_HR) {
                        zF = this.f18036a.f(i);
                    }
                    this.f18036a.deInit();
                    return z;
                }
                zF = this.f18036a.g(i);
                z = zF;
                this.f18036a.deInit();
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(ivs ivsVar, boolean z, boolean z2) {
        ivsVar.d(this.f18037b.m());
        fd fdVarH = ivsVar.h();
        if (fdVarH == fd.ALERT_FIND || fdVarH == fd.ALERT_LOVE) {
            return b(fdVarH);
        }
        if (fdVarH == fd.ALERT_PACE || fdVarH == fd.ALERT_HR) {
            return c(fdVarH, ivsVar.l());
        }
        if (this.f18037b.r()) {
            tzs tzsVar = this.f18037b;
            return tzsVar.patchWrite(tzsVar.f(ivsVar, z2), 0);
        }
        if (z && this.f18037b.isSupportPatchWrite()) {
            byte[] bArrD = tzs.d(ivsVar, 1);
            return bArrD != null && bArrD.length > 0 && this.f18037b.patchWrite(bArrD, 0);
        }
        synchronized (this.f18037b) {
            try {
                if (!this.f18037b.init()) {
                    return false;
                }
                boolean zC = this.f18037b.c(ivsVar);
                this.f18037b.deInit();
                return zC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        tzs tzsVar = this.f18037b;
        if (tzsVar != null) {
            tzsVar.p();
        }
    }

    public void f() {
        tzs tzsVar = this.f18037b;
        if (tzsVar != null) {
            tzsVar.q();
        }
    }
}
