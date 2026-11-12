package vk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvk1/a;", "", "<init>", "()V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: vk1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3336a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178580a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.HR_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.HR_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.LACTATE_THRESHOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f178580a = iArr;
        }
    }

    static {
        new a();
    }

    private a() {
    }

    public static final void a(f fVar, int i14) {
        fVar.getClass();
        j jVarG = c.g(fVar);
        if (jVarG == null || C3336a.f178580a[jVarG.ordinal()] != 3) {
            return;
        }
        h.f178634a.getClass();
        fVar.f178614d = i14;
        c.i(fVar);
    }

    public static final void b(f fVar, int i14) {
        fVar.getClass();
        j jVarG = c.g(fVar);
        if (jVarG != null) {
            int i15 = C3336a.f178580a[jVarG.ordinal()];
            if (i15 == 1) {
                i.f178635a.getClass();
                fVar.f178621k = i14;
                i.c(fVar);
                i.d(fVar);
                return;
            }
            if (i15 == 2) {
                g.f178633a.getClass();
                fVar.f178621k = i14;
                g.c(fVar);
            } else {
                if (i15 != 3) {
                    return;
                }
                h.f178634a.getClass();
                fVar.f178621k = i14;
                h.d(fVar);
            }
        }
    }

    public static final void c(f fVar, int i14) {
        fVar.getClass();
        j jVarG = c.g(fVar);
        if (jVarG == null || C3336a.f178580a[jVarG.ordinal()] != 2) {
            return;
        }
        g.f178633a.getClass();
        fVar.f178613c = i14;
        g.c(fVar);
    }

    public static final void d(f fVar) {
        fVar.getClass();
        j jVarG = c.g(fVar);
        if (jVarG != null) {
            int i14 = C3336a.f178580a[jVarG.ordinal()];
            if (i14 == 1) {
                i.f178635a.getClass();
                i.c(fVar);
            } else if (i14 == 2) {
                g.f178633a.getClass();
                g.c(fVar);
            } else {
                if (i14 != 3) {
                    return;
                }
                h.f178634a.getClass();
                h.c(fVar);
            }
        }
    }

    public static final void e(f fVar) {
        fVar.getClass();
        j jVarG = c.g(fVar);
        if (jVarG != null) {
            int i14 = C3336a.f178580a[jVarG.ordinal()];
            if (i14 == 1) {
                i.f178635a.getClass();
                i.d(fVar);
            } else if (i14 == 2) {
                g.f178633a.getClass();
                g.d(fVar);
            } else {
                if (i14 != 3) {
                    return;
                }
                h.f178634a.getClass();
                h.d(fVar);
            }
        }
    }
}
