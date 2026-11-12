package gc0;

import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd2.f f76845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f76846b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f76850f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f76852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f76853i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76849e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f76847c = f.NONE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f76848d = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wb2.h f76851g = wb2.h.DEFAULT;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76854a;

        static {
            int[] iArr = new int[f.values().length];
            f76854a = iArr;
            try {
                iArr[f.INITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76854a[f.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76854a[f.IN_PROGRESS_NO_SUB_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76854a[f.IN_PROGRESS_SUB_STATUS_SENDING_SOFTWARE_UPDATE_TO_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f76854a[f.FINISHED_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f76854a[f.FINISHED_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(sd2.f fVar) {
        this.f76845a = fVar;
        this.f76850f = u0.l(fVar.getProductNumber());
        this.f76853i = fVar.S2();
    }

    public final void a(f fVar) {
        this.f76847c = fVar;
        if (fVar == f.NONE) {
            this.f76848d = -1L;
            this.f76849e = 0;
        }
    }

    public final boolean b() {
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f76846b;
        return u0.u(lVar != null ? lVar.getPartNumberPartial() : null, lVar != null && lVar.getGolfAppSyncCapable());
    }

    public e(sd2.f fVar, com.garmin.android.apps.connectmobile.devices.model.l lVar) {
        this.f76845a = fVar;
        this.f76846b = lVar;
        this.f76850f = u0.l(fVar.getProductNumber());
    }
}
