package com.garmin.realtimesettings.app.initialization;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import ex2.i;
import iw2.w;
import o13.m;
import o13.r;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.d;
import v13.e;
import vb.h;
import vv0.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/RTSInitializationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RTSInitializationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f52563g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f52564h = m.b(new u(9));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/RTSInitializationWorker$b;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static boolean f52566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static boolean f52567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f52568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Long f52569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static String f52570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static String f52571g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static String f52572h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static String f52573i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f52565a = new b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final t f52574j = m.b(new u(10));

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "com.garmin.realtimesettings.app.initialization.RTSInitializationWorker", f = "RTSInitializationWorker.kt", l = {148, 163, 177, 180}, m = "doWork", v = 1)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f52575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f52576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f52578d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f52580f;

        public c(d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f52578d = obj;
            this.f52580f |= Integer.MIN_VALUE;
            return RTSInitializationWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTSInitializationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d A[PHI: r0 r4 r5 r7 r8 r9
      0x015d: PHI (r0v18 androidx.work.WorkerParameters) = 
      (r6v0 androidx.work.WorkerParameters)
      (r6v0 androidx.work.WorkerParameters)
      (r6v0 androidx.work.WorkerParameters)
      (r0v35 androidx.work.WorkerParameters)
     binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r4v7 android.content.Context) = 
      (r4v5 android.content.Context)
      (r4v5 android.content.Context)
      (r4v5 android.content.Context)
      (r4v11 android.content.Context)
     binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r5v10 java.lang.String) = (r5v7 java.lang.String), (r5v7 java.lang.String), (r5v7 java.lang.String), (r5v19 java.lang.String) binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r7v6 java.lang.String) = (r7v4 java.lang.String), (r7v4 java.lang.String), (r7v4 java.lang.String), (r7v10 java.lang.String) binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r8v5 com.garmin.realtimesettings.app.initialization.RTSInitializationWorker$c) = 
      (r8v3 com.garmin.realtimesettings.app.initialization.RTSInitializationWorker$c)
      (r8v3 com.garmin.realtimesettings.app.initialization.RTSInitializationWorker$c)
      (r8v3 com.garmin.realtimesettings.app.initialization.RTSInitializationWorker$c)
      (r8v0 com.garmin.realtimesettings.app.initialization.RTSInitializationWorker$c)
     binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r9v17 long) = (r9v15 long), (r9v15 long), (r9v15 long), (r9v23 long) binds: [B:51:0x0133, B:58:0x0160, B:55:0x015a, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        c cVar;
        long j8;
        String str;
        String str2;
        long j14;
        String str3;
        long j15;
        String strE;
        i iVar;
        String str4;
        String str5;
        String str6;
        long j16;
        hw2.c cVar2;
        String str7;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f52580f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f52580f = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar3 = cVar;
        Object obj = cVar3.f52578d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar3.f52580f;
        a aVar2 = f52563g;
        Context context = this.f11469a;
        WorkerParameters workerParameters = this.f11470b;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    long j17 = cVar3.f52575a;
                    str2 = cVar3.f52577c;
                    str3 = cVar3.f52576b;
                    r.b(obj);
                    context = context;
                    j14 = j17;
                } else {
                    if (i15 == 2) {
                        long j18 = cVar3.f52575a;
                        str2 = cVar3.f52577c;
                        String str8 = cVar3.f52576b;
                        r.b(obj);
                        context = context;
                        str = str8;
                        j15 = j18;
                        workerParameters = workerParameters;
                        str4 = str2;
                        str5 = str;
                        if (workerParameters.f11427b.a("EXTRA_FETCH_COMPOSITIONS", false)) {
                            a.a(aVar2).debug("doWork: Fetching compositions");
                            w wVar = w.f95547a;
                            context.getClass();
                            cVar3.f52576b = str5;
                            cVar3.f52577c = str4;
                            cVar3.f52575a = j15;
                            cVar3.f52580f = 3;
                            wVar.getClass();
                            if (w.e(context, j15, cVar3) != aVar) {
                                str6 = str4;
                                j16 = j15;
                                cVar2 = new hw2.c();
                                context.getClass();
                                cVar3.f52576b = null;
                                cVar3.f52577c = str6;
                                cVar3.f52575a = j16;
                                cVar3.f52580f = 4;
                                if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                                    str7 = str6;
                                }
                            }
                            cVar3 = cVar3;
                            return aVar;
                        }
                        a.a(aVar2).debug("doWork: Successful initiated all the three calls.");
                        return new androidx.work.d.a.c();
                    }
                    if (i15 == 3) {
                        long j19 = cVar3.f52575a;
                        String str9 = cVar3.f52577c;
                        str5 = cVar3.f52576b;
                        r.b(obj);
                        str6 = str9;
                        context = context;
                        j16 = j19;
                        cVar2 = new hw2.c();
                        context.getClass();
                        cVar3.f52576b = null;
                        cVar3.f52577c = str6;
                        cVar3.f52575a = j16;
                        cVar3.f52580f = 4;
                        if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                            str7 = str6;
                        }
                        cVar3 = cVar3;
                        return aVar;
                    }
                    if (i15 != 4) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str7 = cVar3.f52577c;
                    r.b(obj);
                    context = context;
                }
                w wVar2 = w.f95547a;
                context.getClass();
                wVar2.getClass();
                str7.getClass();
                w.f95548b.getClass();
                context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_consent_country), str7).apply();
                context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_locale), hb2.h.d(hb2.h.a(context))).apply();
                a.a(aVar2).warn("doWork: Compositions: onSuccess");
                a.a(aVar2).debug("doWork: Successful initiated all the three calls.");
                return new androidx.work.d.a.c();
            }
            r.b(obj);
            a.a(aVar2).debug("doWork:");
            androidx.work.c cVar4 = workerParameters.f11427b;
            androidx.work.c cVar5 = workerParameters.f11427b;
            long jD = cVar4.d("EXTRA_UNIT_ID", -1L);
            String strE2 = cVar5.e("EXTRA_MAC_ADDRESS");
            String strE3 = cVar5.e("EXTRA_CONSENT_COUNTRY");
            if (jD == -1 || strE2 == null || strE2.length() == 0 || strE3 == null || strE3.length() == 0) {
                Logger loggerA = a.a(aVar2);
                StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(jD, "doWork: Cannot continue to download. Unit Id ", " && macAddress ", strE2);
                sbK.append(" error.");
                loggerA.error(sbK.toString());
                return new androidx.work.d.a.C0165a();
            }
            Logger loggerA2 = a.a(aVar2);
            StringBuilder sbK2 = com.airbnb.lottie.animation.keyframe.a.k(jD, "doWork: Starting initialization work with unitId ", " and macAddress ", strE2);
            sbK2.append(StringUtils.SPACE);
            loggerA2.debug(sbK2.toString());
            if (cVar5.a("EXTRA_DOWNLOAD_STRINGS", false)) {
                a.a(aVar2).debug("doWork: Strings: Downloading strings");
                String strE4 = cVar5.e("EXTRA_OMT_SERVER_BASE_URL");
                if (strE4 != null) {
                    ex2.w wVar3 = ex2.w.f67058a;
                    context.getClass();
                    cVar3.f52576b = strE2;
                    cVar3.f52577c = strE3;
                    cVar3.f52575a = jD;
                    cVar3.f52580f = 1;
                    context = context;
                    j14 = jD;
                    if (wVar3.c(context, j14, strE2, strE4, strE3, cVar3) != aVar) {
                        cVar3 = cVar3;
                        str3 = strE2;
                        str2 = strE3;
                    }
                } else {
                    a.a(aVar2).error("doWork: Strings: Did not get Base URL");
                }
                cVar3 = cVar3;
                return aVar;
            }
            j8 = jD;
            str = strE2;
            str2 = strE3;
            j15 = j8;
            if (workerParameters.f11427b.a("EXTRA_DOWNLOAD_IMAGES", false)) {
                a.a(aVar2).debug("doWork: Icons: Downloading images");
                strE = workerParameters.f11427b.e("EXTRA_GC_STATIC_SERVER_BASE_URL");
                if (strE != null) {
                    iVar = i.f66970a;
                    context.getClass();
                    cVar3.f52576b = str;
                    cVar3.f52577c = str2;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 2;
                    if (iVar.a(context, str, strE, str2, cVar3) != aVar) {
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
                a.a(aVar2).error("doWork: Icons: Did not get Base URL");
                str4 = str2;
                str5 = str;
                if (workerParameters.f11427b.a("EXTRA_FETCH_COMPOSITIONS", false)) {
                    a.a(aVar2).debug("doWork: Fetching compositions");
                    w wVar4 = w.f95547a;
                    context.getClass();
                    cVar3.f52576b = str5;
                    cVar3.f52577c = str4;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 3;
                    wVar4.getClass();
                    if (w.e(context, j15, cVar3) != aVar) {
                        str6 = str4;
                        j16 = j15;
                        cVar2 = new hw2.c();
                        context.getClass();
                        cVar3.f52576b = null;
                        cVar3.f52577c = str6;
                        cVar3.f52575a = j16;
                        cVar3.f52580f = 4;
                        if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                            str7 = str6;
                            w wVar5 = w.f95547a;
                            context.getClass();
                            wVar5.getClass();
                            str7.getClass();
                            w.f95548b.getClass();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_consent_country), str7).apply();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_locale), hb2.h.d(hb2.h.a(context))).apply();
                            a.a(aVar2).warn("doWork: Compositions: onSuccess");
                        }
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
            } else {
                str4 = str2;
                str5 = str;
                if (workerParameters.f11427b.a("EXTRA_FETCH_COMPOSITIONS", false)) {
                    a.a(aVar2).debug("doWork: Fetching compositions");
                    w wVar6 = w.f95547a;
                    context.getClass();
                    cVar3.f52576b = str5;
                    cVar3.f52577c = str4;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 3;
                    wVar6.getClass();
                    if (w.e(context, j15, cVar3) != aVar) {
                        str6 = str4;
                        j16 = j15;
                        cVar2 = new hw2.c();
                        context.getClass();
                        cVar3.f52576b = null;
                        cVar3.f52577c = str6;
                        cVar3.f52575a = j16;
                        cVar3.f52580f = 4;
                        if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                            str7 = str6;
                            w wVar7 = w.f95547a;
                            context.getClass();
                            wVar7.getClass();
                            str7.getClass();
                            w.f95548b.getClass();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_consent_country), str7).apply();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_locale), hb2.h.d(hb2.h.a(context))).apply();
                            a.a(aVar2).warn("doWork: Compositions: onSuccess");
                        }
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
            }
            a.a(aVar2).debug("doWork: Successful initiated all the three calls.");
            return new androidx.work.d.a.c();
            j8 = j14;
            str = str3;
            j15 = j8;
            if (workerParameters.f11427b.a("EXTRA_DOWNLOAD_IMAGES", false)) {
                a.a(aVar2).debug("doWork: Icons: Downloading images");
                strE = workerParameters.f11427b.e("EXTRA_GC_STATIC_SERVER_BASE_URL");
                if (strE != null) {
                    iVar = i.f66970a;
                    context.getClass();
                    cVar3.f52576b = str;
                    cVar3.f52577c = str2;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 2;
                    if (iVar.a(context, str, strE, str2, cVar3) != aVar) {
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
                a.a(aVar2).error("doWork: Icons: Did not get Base URL");
                str4 = str2;
                str5 = str;
                if (workerParameters.f11427b.a("EXTRA_FETCH_COMPOSITIONS", false)) {
                    a.a(aVar2).debug("doWork: Fetching compositions");
                    w wVar8 = w.f95547a;
                    context.getClass();
                    cVar3.f52576b = str5;
                    cVar3.f52577c = str4;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 3;
                    wVar8.getClass();
                    if (w.e(context, j15, cVar3) != aVar) {
                        str6 = str4;
                        j16 = j15;
                        cVar2 = new hw2.c();
                        context.getClass();
                        cVar3.f52576b = null;
                        cVar3.f52577c = str6;
                        cVar3.f52575a = j16;
                        cVar3.f52580f = 4;
                        if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                            str7 = str6;
                            w wVar9 = w.f95547a;
                            context.getClass();
                            wVar9.getClass();
                            str7.getClass();
                            w.f95548b.getClass();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_consent_country), str7).apply();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_locale), hb2.h.d(hb2.h.a(context))).apply();
                            a.a(aVar2).warn("doWork: Compositions: onSuccess");
                        }
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
            } else {
                str4 = str2;
                str5 = str;
                if (workerParameters.f11427b.a("EXTRA_FETCH_COMPOSITIONS", false)) {
                    a.a(aVar2).debug("doWork: Fetching compositions");
                    w wVar10 = w.f95547a;
                    context.getClass();
                    cVar3.f52576b = str5;
                    cVar3.f52577c = str4;
                    cVar3.f52575a = j15;
                    cVar3.f52580f = 3;
                    wVar10.getClass();
                    if (w.e(context, j15, cVar3) != aVar) {
                        str6 = str4;
                        j16 = j15;
                        cVar2 = new hw2.c();
                        context.getClass();
                        cVar3.f52576b = null;
                        cVar3.f52577c = str6;
                        cVar3.f52575a = j16;
                        cVar3.f52580f = 4;
                        if (cVar2.a(context, j16, str5, GDIRealtimeSettingsProto.WellKnownCompositionId.DEVICE_SETTINGS_HOME_VALUE, -1, true, false, cVar3) != aVar) {
                            str7 = str6;
                            w wVar11 = w.f95547a;
                            context.getClass();
                            wVar11.getClass();
                            str7.getClass();
                            w.f95548b.getClass();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_consent_country), str7).apply();
                            context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putString(context.getString(R.string.key_app_locale), hb2.h.d(hb2.h.a(context))).apply();
                            a.a(aVar2).warn("doWork: Compositions: onSuccess");
                        }
                    }
                    cVar3 = cVar3;
                    return aVar;
                }
            }
        } catch (Exception e4) {
            a.a(aVar2).warn("doWork: Compositions: onFailure", (Throwable) e4);
        }
        a.a(aVar2).debug("doWork: Successful initiated all the three calls.");
        return new androidx.work.d.a.c();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/RTSInitializationWorker$a;", "", "<init>", "()V", "", "EXTRA_DOWNLOAD_STRINGS", "Ljava/lang/String;", "EXTRA_DOWNLOAD_IMAGES", "EXTRA_FETCH_COMPOSITIONS", "EXTRA_UNIT_ID", "EXTRA_MAC_ADDRESS", "EXTRA_CONSENT_COUNTRY", "EXTRA_GC_STATIC_SERVER_BASE_URL", "EXTRA_OMT_SERVER_BASE_URL", "", "DEFAULT_UNIT_ID", "J", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) RTSInitializationWorker.f52564h.getValue();
        }

        private a() {
        }
    }
}
