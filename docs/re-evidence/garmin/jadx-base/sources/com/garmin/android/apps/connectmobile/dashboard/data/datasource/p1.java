package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/p1;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o1;", "Lf42/b;", "weatherRepo", "Lhg0/b;", "activityRepo", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/v1;", "eventsResponse", "<init>", "(Lf42/b;Lhg0/b;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/v1;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33313d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f42.b f33314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hg0.b f33315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f33316c;

    static {
        new a(null);
        hg0.b.a aVar = hg0.b.f83652b;
        f42.b.a aVar2 = f42.b.f68862b;
    }

    public p1(f42.b bVar, hg0.b bVar2, v1 v1Var) {
        bVar.getClass();
        bVar2.getClass();
        this.f33314a = bVar;
        this.f33315b = bVar2;
        this.f33316c = v1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:25:0x0121  */
    /* JADX WARN: Code duplicated, block: B:26:0x0126  */
    /* JADX WARN: Code duplicated, block: B:28:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0166  */
    /* JADX WARN: Code duplicated, block: B:38:0x016b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0172  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0341 -> B:106:0x0346). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x036d -> B:117:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0386 -> B:120:0x038e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0198 -> B:117:0x0379). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.o1
    public final java.lang.Object a(v13.c r39) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.dashboard.data.datasource.p1.a(v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(long j8, v13.c cVar) {
        q1 q1Var;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f33330c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f33330c = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object objJ = q1Var.f33328a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f33330c;
        if (i15 == 0) {
            o13.r.b(objJ);
            q1Var.f33330c = 1;
            hg0.b bVar = this.f33315b;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new hg0.f(bVar, j8, null), q1Var);
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
            return (ps.b2) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to fetch event activity weather data ");
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventWeatherDataSource", strD);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(double d14, double d15, long j8, v13.c cVar) {
        r1 r1Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f33343c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f33343c = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objJ = r1Var.f33341a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f33343c;
        if (i15 == 0) {
            o13.r.b(objJ);
            int iA = lb2.b.a(d14);
            int iA2 = lb2.b.a(d15);
            r1Var.f33343c = 1;
            f42.b bVar = this.f33314a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(bVar, new f42.c(bVar, iA, iA2, j8, 1, null), r1Var);
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
            return (h42.b) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to fetch event forecast weather data ");
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventWeatherDataSource", strD);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(double d14, double d15, long j8, v13.c cVar) {
        s1 s1Var;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f33349c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f33349c = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object objC = s1Var.f33347a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f33349c;
        if (i15 == 0) {
            o13.r.b(objC);
            int iA = lb2.b.a(d14);
            int iA2 = lb2.b.a(d15);
            s1Var.f33349c = 1;
            f42.b bVar = this.f33314a;
            objC = bVar.C(new f42.d(bVar, iA, iA2, j8, null, null, null), s1Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            return (h42.e) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to fetch event historical weather data ");
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "EventWeatherDataSource", strD);
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/p1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "RACEDAY_LIMIT", "I", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
