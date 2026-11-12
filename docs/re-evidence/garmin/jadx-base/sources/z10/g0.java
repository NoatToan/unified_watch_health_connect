package z10;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz10/g0;", "Lp92/a;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 implements p92.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f201003b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f201004a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f201006b;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177707g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve2.e.f177708h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ve2.e.f177714n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ve2.e.f177711k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f201005a = iArr;
            int[] iArr2 = new int[q92.x.values().length];
            try {
                iArr2[q92.x.DI_CONNECT_LIVETRACK_STRAVA_BEACON.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q92.x.DI_CONNECT_UPLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[q92.x.DI_CONNECT_LIVETRACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[q92.x.DI_CONNECT_STRAVA.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f201006b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public g0(Context context) {
        context.getClass();
        this.f201004a = context;
    }

    @Override // p92.a
    public final String a() {
        f12.l.f68084a.getClass();
        return f12.l.a.a().getUserName();
    }

    public final String b() {
        String string = this.f201004a.getString(R.string.app_name_garmin_connect);
        string.getClass();
        return string;
    }

    public final Uri c(Context context, q92.x xVar) {
        String str;
        String str2;
        String str3;
        xVar.getClass();
        b1.f200894a.getClass();
        int i14 = b1.a.C3752a.f200895a[xVar.ordinal()];
        String str4 = ".png";
        switch (i14) {
            case 1:
                str = "11_data_upload";
                str2 = str;
                break;
            case 2:
                str = "16_insights";
                str2 = str;
                break;
            case 3:
                str = "17_livetrack";
                str2 = str;
                break;
            case 4:
                str = "gdpr_atp";
                str2 = str;
                break;
            case 5:
                str = "third_party";
                str2 = "3rd_party_strava";
                break;
            case 6:
                str = "gdpr_cppi";
                str4 = ".jpg";
                str2 = str;
                break;
            case 7:
                str = "aad";
                str2 = str;
                break;
            default:
                str = "";
                str2 = str;
                break;
        }
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("static.garmincdn.com").appendPath("com.garmin.connect").appendPath(FirebaseAnalytics.Param.CONTENT).appendPath("images").appendPath("gcm").appendPath("gdpr").appendPath(str).appendPath("android");
        int i15 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (i15 <= 160) {
            str3 = c22.p3.MDPI.f23201a;
        } else if (i15 <= 240) {
            str3 = c22.p3.HDPI.f23201a;
        } else {
            str3 = i15 <= 320 ? c22.p3.XHDPI.f23201a : c22.p3.XXHDPI.f23201a;
        }
        Uri uriBuild = builderAppendPath.appendPath(str3).appendPath(str2.concat(str4)).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public final ImageView.ScaleType d(q92.x xVar) {
        xVar.getClass();
        return b.f201006b[xVar.ordinal()] == 1 ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP;
    }

    public final p92.b e() {
        dd2.b bVarB = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).b();
        String str = bVarB.f59210a;
        String str2 = bVarB.f59211b;
        sc2.j jVarD = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).d();
        return new p92.b(str, str2, jVarD.f158514a, jVarD.f158515b, g() ? ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g() : "");
    }

    public final p92.a0 f() {
        switch (b.f201005a[((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().ordinal()]) {
            case 1:
                return p92.a0.PROD;
            case 2:
                return p92.a0.CHINA;
            case 3:
                return p92.a0.TEST;
            case 4:
                return p92.a0.TEST_SSO_CHINA;
            case 5:
                return p92.a0.AQUA;
            case 6:
                return p92.a0.PINK;
            default:
                return p92.a0.PROD;
        }
    }

    public final boolean g() {
        return ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("gcm_oauth2_enabled");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110 A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:47:0x010c, B:49:0x0110, B:52:0x0116, B:54:0x011a, B:56:0x011e, B:57:0x0123), top: B:66:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:47:0x010c, B:49:0x0110, B:52:0x0116, B:54:0x011a, B:56:0x011e, B:57:0x0123), top: B:66:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011e A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:47:0x010c, B:49:0x0110, B:52:0x0116, B:54:0x011a, B:56:0x011e, B:57:0x0123), top: B:66:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb A[SYNTHETIC] */
    public final Object h(q92.x xVar, v13.i iVar) {
        Iterator<T> it;
        Object next;
        Iterator<T> it3;
        Object next2;
        long j8;
        wd2.c2.f fVar;
        wd2.q qVarC;
        wd2.g1 g1Var;
        Logger logger;
        wd2.h2 h2Var;
        v0.f201271b.getClass();
        v0.a.a().c(xVar, Long.MAX_VALUE);
        int i14 = b.f201006b[xVar.ordinal()];
        if (i14 == 1) {
            for (wd2.z1 z1Var : wd2.m.a()) {
                it = z1Var.f184698f.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((wd2.h2) next).f184494d, wd2.c2.f.f184414a));
                if (((wd2.h2) next) != null) {
                    it3 = z1Var.f184698f.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        h2Var = (wd2.h2) next2;
                        if (p005kotlin.jvm.internal.s.g(h2Var.f184494d, wd2.c2.a.f184409a) && !p005kotlin.jvm.internal.s.g(h2Var.f184494d, wd2.c2.f.f184414a)) {
                            break;
                        }
                    }
                    j8 = z1Var.f184693a;
                    if (next2 != null) {
                        fVar = wd2.c2.f.f184414a;
                        fVar.getClass();
                        qVarC = wd2.q.f184563f.c();
                        synchronized (qVarC) {
                            try {
                                g1Var = qVarC.f184567b;
                                if (g1Var != null) {
                                    g1Var.g(j8, fVar);
                                }
                                if (qVarC.f184567b == null) {
                                    logger = wd2.q.f184565h;
                                    if (logger != null) {
                                        logger.debug("Nothing to stop, shutting down");
                                    }
                                    ge1.b.T(qVarC, null, null, new wd2.d0(null), 3);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
                    }
                }
            }
            f12.l.f68084a.getClass();
            f12.l.a.a().d2(false);
        } else if (i14 == 2) {
            cw.q qVarN = cw.q.N();
            qVarN.getClass();
            new Long(com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN), null));
        } else if (i14 == 3) {
            o53.m1 m1VarC = g8.i.c();
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC)), null, null, new k0(this, null), 3);
        } else if (i14 == 4) {
            while (r8.hasNext()) {
                it = z1Var.f184698f.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((wd2.h2) next).f184494d, wd2.c2.f.f184414a));
                if (((wd2.h2) next) != null) {
                    it3 = z1Var.f184698f.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        h2Var = (wd2.h2) next2;
                        if (p005kotlin.jvm.internal.s.g(h2Var.f184494d, wd2.c2.a.f184409a)) {
                        }
                    }
                    j8 = z1Var.f184693a;
                    if (next2 != null) {
                        fVar = wd2.c2.f.f184414a;
                        fVar.getClass();
                        qVarC = wd2.q.f184563f.c();
                        synchronized (qVarC) {
                            g1Var = qVarC.f184567b;
                            if (g1Var != null) {
                                g1Var.g(j8, fVar);
                            }
                            if (qVarC.f184567b == null) {
                                logger = wd2.q.f184565h;
                                if (logger != null) {
                                    logger.debug("Nothing to stop, shutting down");
                                }
                                ge1.b.T(qVarC, null, null, new wd2.d0(null), 3);
                            }
                        }
                    } else {
                        wd2.m.h(j8, com.garmin.android.library.livetrack.i.a.f50228a);
                    }
                }
            }
            f12.l.f68084a.getClass();
            f12.l.a.a().d2(false);
        } else {
            if (i14 == 5) {
                eu1.d dVar = (eu1.d) KoinJavaComponent.get$default(eu1.d.class, null, null, 6, null);
                dVar.getClass();
                Object objE = o53.c0.e(new eu1.c(dVar, null), iVar);
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (objE != aVar) {
                    objE = Unit.INSTANCE;
                }
                return objE == aVar ? objE : Unit.INSTANCE;
            }
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.CONSENT, "NO revokeConsentActions for " + xVar);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz10/g0$a;", "", "<init>", "()V", "", "X_GARMIN_CLIENT_ID", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
