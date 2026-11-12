package com.garmin.realtimesettings.app.initialization;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.w0;
import androidx.room.g0;
import cx2.h;
import df.j;
import iw2.i1;
import iw2.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o13.p;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ue.i0;
import ue.x;
import ve.t0;
import x53.c;
import xw2.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/realtimesettings/app/initialization/b;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52589a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f52590b = new h("RealTimeSettingsInitializer", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static vw2.a f52591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f52592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u53.d f52593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HashMap<String, String> f52594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static HashMap<String, String> f52595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f52596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f52597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f52598j;

    static {
        c cVar = s0.f129406a;
        f52593e = c0.h(c0.a(x53.b.f189152a), ge1.b.h());
        f52594f = new HashMap<>();
        f52595g = new HashMap<>();
        f52597i = Build.VERSION.SDK_INT >= 31;
        f52598j = Boolean.FALSE;
    }

    private b() {
    }

    public static vw2.a a() {
        vw2.a aVar = f52591c;
        if (aVar != null) {
            return aVar;
        }
        l73.c.b().e(new xw2.c("RTS lost the App communication tunnel."));
        return new vw2.c();
    }

    public static String b(Context context, long j8) {
        context.getClass();
        String str = f52596h;
        if (str != null) {
            return str;
        }
        w.f95547a.getClass();
        String strF = w.f(context, j8);
        f52590b.getClass();
        return strF;
    }

    public static d c() {
        d dVar = f52592d;
        if (dVar != null) {
            return dVar;
        }
        s.m("options");
        throw null;
    }

    public static i1 d(b bVar) {
        bVar.getClass();
        String str = c().f192453a.f192450b;
        bVar.getClass();
        return (i1) da2.d.b().getCapability(str, i1.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(b bVar, Context context, String str, fx2.a aVar, String str2) {
        xw2.a aVar2 = xw2.a.NONE;
        bVar.getClass();
        str.getClass();
        long j8 = aVar.f73849a;
        aVar2.getClass();
        f52590b.b("makeupRTSData: Get Real Time Settings Data...");
        RTSInitializationWorker.b bVar2 = RTSInitializationWorker.b.f52565a;
        String str3 = aVar.f73850b;
        bVar2.getClass();
        RTSInitializationWorker.b.f52571g = str3;
        RTSInitializationWorker.b.f52567c = true;
        String str4 = aVar.f73851c;
        bVar2.getClass();
        RTSInitializationWorker.b.f52569e = Long.valueOf(j8);
        RTSInitializationWorker.b.f52570f = str;
        RTSInitializationWorker.b.f52566b = true;
        RTSInitializationWorker.b.f52572h = str4;
        bVar2.getClass();
        RTSInitializationWorker.b.f52569e = Long.valueOf(j8);
        RTSInitializationWorker.b.f52570f = str;
        RTSInitializationWorker.b.f52568d = true;
        RTSInitializationWorker.b.f52573i = str2;
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p("EXTRA_DOWNLOAD_STRINGS", Boolean.valueOf(RTSInitializationWorker.b.f52566b)));
        arrayList.add(new p("EXTRA_DOWNLOAD_IMAGES", Boolean.valueOf(RTSInitializationWorker.b.f52567c)));
        arrayList.add(new p("EXTRA_FETCH_COMPOSITIONS", Boolean.valueOf(RTSInitializationWorker.b.f52568d)));
        arrayList.add(new p("EXTRA_CONSENT_COUNTRY", RTSInitializationWorker.b.f52573i));
        if (RTSInitializationWorker.b.f52566b) {
            arrayList.add(new p("EXTRA_UNIT_ID", RTSInitializationWorker.b.f52569e));
            arrayList.add(new p("EXTRA_MAC_ADDRESS", RTSInitializationWorker.b.f52570f));
            arrayList.add(new p("EXTRA_OMT_SERVER_BASE_URL", RTSInitializationWorker.b.f52572h));
        }
        if (RTSInitializationWorker.b.f52567c) {
            arrayList.add(new p("EXTRA_GC_STATIC_SERVER_BASE_URL", RTSInitializationWorker.b.f52571g));
        }
        p[] pVarArr = (p[]) arrayList.toArray(new p[0]);
        p[] pVarArr2 = (p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        androidx.work.c.a aVar3 = new androidx.work.c.a();
        for (p pVar : pVarArr2) {
            aVar3.b(pVar.f128595b, (String) pVar.f128594a);
        }
        x xVarA = ((x.a) RTSInitializationWorker.b.f52574j.getValue()).f(aVar3.a()).a();
        RTSInitializationWorker.f52563g.getClass();
        t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context);
        List listC = p13.w.c(xVarA);
        if (listC.isEmpty()) {
            vb.h.s("enqueue needs at least one WorkRequest.");
            return;
        }
        new ve.c0(t0VarO, listC).a();
        t0 t0VarG = t0.g(context);
        t0VarG.getClass();
        g0 g0VarR = t0VarG.f177606d.j().r(Collections.singletonList(xVarA.f170093a.toString()));
        ve.s0 s0Var = new ve.s0(t0VarG);
        ef.b bVar3 = t0VarG.f177607e;
        Object obj = new Object();
        w0 w0Var = new w0();
        w0Var.n(g0VarR, new j(bVar3, obj, s0Var, w0Var));
    }
}
