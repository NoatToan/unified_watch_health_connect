package yr1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import bs2.ad;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQStorageManagementActivity;
import com.garmin.android.apps.connectmobile.consent.DataSyncIndicatorsWorker;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.v1;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.filetransfer.core.util.CiqNoSlotsException;
import d53.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import lc.u0;
import o53.b0;
import o53.e1;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.i0;
import ue.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyr1/g;", "Lal2/e;", "Ljl2/a;", "Lgl2/l;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements al2.e, jl2.a, gl2.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f199079g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f199080h = {"IQWatchFaces", "IQDataFields", "IQWatchApps", "IQWidgets"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f199081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f199082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, al2.k> f199083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f199084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Long, al2.a> f199085f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199086a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[al2.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[al2.b.NO_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[al2.b.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[al2.b.INTERRUPTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[al2.b.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f199086a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.sync.GCMDeviceSyncReceiver$onCIQError$1", f = "GCMDeviceSyncReceiver.kt", l = {202}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f199087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f199088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb2.i f199089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f199090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f199091e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)J"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.sync.GCMDeviceSyncReceiver$onCIQError$1$deviceUnitId$1", f = "GCMDeviceSyncReceiver.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Long>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f199092a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f199092a = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f199092a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Long> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                sd2.j jVarF = rd2.j.f(this.f199092a);
                if (jVarF != null) {
                    return new Long(jVarF.f158686c);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wb2.i iVar, g gVar, String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f199089c = iVar;
            this.f199090d = gVar;
            this.f199091e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f199089c, this.f199090d, this.f199091e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f199088b;
            g gVar = this.f199090d;
            if (i14 == 0) {
                o13.r.b(obj);
                String string = this.f199089c == wb2.i.REMOTE_DEVICE_NO_SLOTS_FOR_FILE_TYPE ? gVar.f199081b.getString(R.string.connect_iq_apps_not_enough_slots) : gVar.f199081b.getString(R.string.connect_iq_apps_not_enough_space);
                string.getClass();
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f199091e, null);
                this.f199087a = string;
                this.f199088b = 1;
                Object objE0 = ge1.b.e0(bVar, aVar2, this);
                if (objE0 == aVar) {
                    return aVar;
                }
                str = string;
                obj = objE0;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.f199087a;
                o13.r.b(obj);
            }
            Long l14 = (Long) obj;
            if (l14 == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = l14.longValue();
            a aVar3 = g.f199079g;
            gVar.h(jLongValue, str);
            return Unit.INSTANCE;
        }
    }

    public g(Context context) {
        context.getClass();
        this.f199081b = context;
        this.f199082c = o13.m.b(new ya0.j(23));
        this.f199083d = f();
        o13.t tVarB = o13.m.b(new ya0.j(24));
        this.f199084e = tVarB;
        this.f199085f = (Map) tVarB.getValue();
    }

    @Override // al2.m
    public final void B(al2.n nVar) {
        f199079g.getClass();
        a.a("onFileTransferProgress " + nVar);
    }

    @Override // jl2.a
    public final void a(String str, al2.k kVar, long j8, gy2.g gVar) {
        kVar.getClass();
        gVar.getClass();
        f199079g.getClass();
        a.a("onDownloadEvent connectionId[" + str + "] event[" + kVar + "] messageId[" + j8 + "] messageType[" + gVar + "]");
        if (gVar == gy2.g.SOFTWARE_UPDATE) {
            a.a("Software Update Status changed to " + kVar + " for device with connectionId[" + str + "]");
            f().put(str, kVar);
        }
    }

    @Override // gl2.l
    public final void b(rs2.c cVar, UUID uuid, String str, String str2, boolean z14) {
        long jOptLong;
        cVar.getClass();
        uuid.getClass();
        str.getClass();
        if (z14) {
            return;
        }
        f199079g.getClass();
        a.a("onUploadComplete fileId[" + uuid + "] dataType[" + str + "] responseBody[" + str2 + "]");
        gl2.l.f77976a.getClass();
        boolean z15 = false;
        if (str2.length() == 0) {
            jOptLong = -1;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2).getJSONObject("detailedImportResult");
                jSONObject.getClass();
                JSONArray jSONArray = jSONObject.getJSONArray("successes");
                jSONArray.getClass();
                if (jSONArray.length() == 0) {
                    jOptLong = -1;
                } else {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                    jSONObject2.getClass();
                    jOptLong = jSONObject2.optLong("internalId", -1L);
                }
            } catch (Exception unused) {
            }
        }
        if (jOptLong == -1) {
            yr1.a aVarC = yr1.a.c();
            long f172494b = cVar.getF92746j();
            synchronized (aVarC) {
                ConcurrentHashMap<Long, yr1.a.EnumC3722a> concurrentHashMap = yr1.a.f199059b;
                if (concurrentHashMap.get(Long.valueOf(f172494b)) == null) {
                    return;
                }
                concurrentHashMap.remove(Long.valueOf(f172494b));
                return;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray2 = new JSONObject(str2).getJSONObject("detailedImportResult").getJSONArray("successes");
                if (jSONArray2.length() > 0) {
                    String strOptString = jSONArray2.getJSONObject(0).optString("externalId");
                    strOptString.getClass();
                    z15 = w.z(strOptString, "HEALTH_MONITORING", false);
                }
            } catch (JSONException e4) {
                a aVar = f199079g;
                String str3 = "failure parsing  file upload response " + e4.getMessage();
                aVar.getClass();
                a.a(str3);
            }
        }
        if (z15) {
            yr1.a.c().a(cVar.getF92746j(), -2L);
        } else if (jOptLong > 0) {
            yr1.a.c().a(cVar.getF92746j(), jOptLong);
            ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).J(true);
        }
    }

    @Override // jl2.a
    public final void c(String str, wb2.i iVar) {
        iVar.getClass();
        f199079g.getClass();
        a.a("onCIQError connectionId[" + str + "] failure[" + iVar + "]");
        ge1.b.T(e1.f129333a, null, null, new c(iVar, this, str, null), 3);
    }

    @Override // jl2.a
    public final void d(String str, al2.k kVar, byte b14, byte b15) {
        kVar.getClass();
        StringBuilder sb3 = new StringBuilder("onUploadEvent connectionId[");
        sb3.append(str);
        sb3.append("] event[");
        sb3.append(kVar);
        sb3.append("] fileDataType[");
        String strE = androidx.core.view.j.e(b14, b15, "] fileDataSubType[", "]", sb3);
        f199079g.getClass();
        a.a(strE);
        if (kVar == al2.k.SUCCESS) {
            cw.l lVarB = cw.l.b();
            lVarB.getClass();
            if (ad.ACTIVITY.f19675a == b15) {
                lVarB.f55934a++;
            }
            if (ad.MONITORING_B.f19675a == b15) {
                lVarB.f55935b++;
            }
        }
    }

    @Override // gl2.l
    public final List e() {
        return p13.w.c("FIT_TYPE_4");
    }

    public final Map<String, al2.k> f() {
        return (Map) this.f199082c.getValue();
    }

    public final void h(long j8, String str) {
        Context context = this.f199081b;
        Intent intent = new Intent(context, (Class<?>) ConnectIQStorageManagementActivity.class);
        intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", j8);
        intent.addFlags(268435456);
        sz0.e eVar = sz0.e.f161374m;
        z6.q qVar = new z6.q(context, eVar.f161386a);
        Notification notification = qVar.N;
        notification.icon = 2131232010;
        qVar.f202683e = z6.q.e(context.getString(R.string.lbl_installation_failed));
        qVar.f202684f = z6.q.e(str);
        qVar.i(16, true);
        notification.vibrate = new long[]{500, 1000};
        qVar.f202691m = 2;
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(str);
        qVar.l(oVar);
        qVar.f202686h = PendingIntent.getActivity(context, 0, intent, 201326592);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, 8, eVar);
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
        Map<String, al2.k> map;
        f199079g.getClass();
        a.a("onProgress " + aVar);
        Map map2 = (Map) this.f199084e.getValue();
        rs2.c cVar = aVar.f3759a;
        map2.put(Long.valueOf(cVar.getF92746j()), aVar);
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        Bundle bundle = new Bundle();
        bundle.putLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", cVar.getF92746j());
        String f172501i = cVar.getF92737a();
        if (f172501i == null) {
            f172501i = cVar.getF92739c();
        }
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", f172501i);
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", cVar.getF92742f());
        bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_PROGRESS_VISIBILITY", (aVar.f3760b.f132729a ? wb2.j.ALWAYS_SHOW_PROGRESS : wb2.j.INVISIBLE).name());
        bundle.putFloat("com.garmin.android.lib.connectdevicesync.EXTRA_TOTAL_PROGRESS_BY_FILE_SIZE", aVar.a());
        m.f199104a.getClass();
        g gVar = m.f199105b.get();
        bundle.putBoolean("com.garmin.android.lib.connectdevicesync.EXTRA_PROCESSING_SOFTWARE_UPDATE", ((gVar == null || (map = gVar.f199083d) == null) ? null : map.get(cVar.getF92741e())) == al2.k.STARTED);
        oi2.a.C2513a.a(c2513a, new pi2.k(bundle));
    }

    @Override // al2.m
    public final void u(al2.l lVar) {
        lVar.getClass();
        rs2.c cVar = lVar.f3819a;
        al2.k kVar = lVar.f3822d;
        f199079g.getClass();
        a.a("onFileTransferStatusChange " + lVar);
        wk2.f fVar = lVar.f3821c;
        if (p005kotlin.jvm.internal.s.g(fVar.f185843b, "software-update")) {
            a.a("Software Update Status changed to " + kVar + " for device with connectionId[" + cVar.getF92741e() + "]");
            f().put(cVar.getF92741e(), kVar);
        }
        if (kVar == al2.k.SUCCESS) {
            cw.l lVarB = cw.l.b();
            String str = fVar.f185843b;
            lVarB.getClass();
            if (o.ACTIVITY.f199119a.equals(str)) {
                lVarB.f55934a++;
            }
            if (o.MONITORING_B.f199119a.equals(str)) {
                lVarB.f55935b++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0219  */
    @Override // al2.e
    public final void y(al2.c cVar) throws RemoteException {
        Integer numY;
        Object next;
        f199079g.getClass();
        a.a("onStatusChange " + cVar);
        cw.l lVarB = cw.l.b();
        al2.b bVar = cVar.f3777c;
        lVarB.getClass();
        int i14 = cw.l.a.f55936a[bVar.ordinal()];
        if (i14 == 1) {
            lVarB.f55934a = 0;
            lVarB.f55935b = 0;
        } else if (i14 != 2) {
            if (i14 == 3) {
                com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_feedback_syncs_successful, GCMSettingManager.f41536b.edit(), 0);
                com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_feedback_count, GCMSettingManager.f41536b.edit(), 0);
            }
        } else if (lVarB.f55934a > 0 || lVarB.f55935b > 0) {
            com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_feedback_syncs_successful, GCMSettingManager.f41536b.edit(), GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_feedback_syncs_successful), 0) + 1);
        }
        Object obj = null;
        if (cVar.f3777c.f3774a) {
            ((Map) this.f199084e.getValue()).remove(Long.valueOf(cVar.f3775a.getF92746j()));
            yr1.a aVarC = yr1.a.c();
            Context context = this.f199081b;
            long f172494b = cVar.f3775a.getF92746j();
            synchronized (aVarC) {
                try {
                    ConcurrentHashMap<Long, yr1.a.EnumC3722a> concurrentHashMap = yr1.a.f199059b;
                    yr1.a.EnumC3722a enumC3722a = concurrentHashMap.get(Long.valueOf(f172494b));
                    if (enumC3722a != null) {
                        int iOrdinal = enumC3722a.ordinal();
                        if (iOrdinal == 0) {
                            concurrentHashMap.put(Long.valueOf(f172494b), yr1.a.EnumC3722a.FINISHED);
                        } else if (iOrdinal == 1 || iOrdinal == 2) {
                            if (yr1.a.f199060c.get(Long.valueOf(f172494b)).longValue() == -2 && ((qn.c) KoinJavaComponent.get(qn.c.class)).a()) {
                                aVarC.d(context);
                            }
                            concurrentHashMap.put(Long.valueOf(f172494b), yr1.a.EnumC3722a.FINISHED);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            v1 v1Var = v1.f47374a;
            Context context2 = this.f199081b;
            v1Var.getClass();
            v1.j(context2, false, null);
            long f172494b2 = cVar.f3775a.getF92746j();
            al2.b bVar2 = cVar.f3777c;
            boolean z14 = bVar2 == al2.b.SUCCESS || bVar2 == al2.b.NO_ITEMS;
            GCMSettingManager.f41538d.edit().putBoolean(GCMSettingManager.f41535a.getString(R.string.key_device_last_sync_status) + f172494b2, z14).apply();
        }
        switch (b.f199086a[cVar.f3777c.ordinal()]) {
            case 1:
                ((Map) this.f199084e.getValue()).put(Long.valueOf(cVar.f3775a.getF92746j()), new al2.a(cVar.f3775a, cVar.f3776b, 0L, 0L, 0.0f, false, 0.0f, 112, null));
                f().put(cVar.f3775a.getF92741e(), null);
                oi2.a.C2513a.a(oi2.a.f132270a, new pi2.j(s.a(cVar)));
                yr1.a aVarC2 = yr1.a.c();
                long f172494b3 = cVar.f3775a.getF92746j();
                synchronized (aVarC2) {
                    try {
                        ConcurrentHashMap<Long, yr1.a.EnumC3722a> concurrentHashMap2 = yr1.a.f199059b;
                        yr1.a.EnumC3722a enumC3722a2 = concurrentHashMap2.get(Long.valueOf(f172494b3));
                        if (enumC3722a2 == null || enumC3722a2 == yr1.a.EnumC3722a.FINISHED) {
                            enumC3722a2 = yr1.a.EnumC3722a.STARTED;
                        }
                        concurrentHashMap2.put(Long.valueOf(f172494b3), enumC3722a2);
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("GCM_deviceName", cVar.f3775a.getF92742f());
                v1 v1Var2 = v1.f47374a;
                Context context3 = this.f199081b;
                boolean z15 = cVar.f3776b.f132729a;
                v1Var2.getClass();
                v1.j(context3, z15, bundle);
                return;
            case 2:
            case 3:
                al2.k kVar = this.f199083d.get(cVar.f3775a.getF92741e());
                Map<String, al2.k> mapF = f();
                rs2.c cVar2 = cVar.f3775a;
                mapF.put(cVar2.getF92741e(), null);
                oi2.a.C2513a.a(oi2.a.f132270a, new pi2.i(s.a(cVar)));
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.DEVICE_SYNC, false);
                List<al2.j> list = cVar.f3779e;
                if (list == null || !list.isEmpty()) {
                    for (al2.j jVar : list) {
                        if (jVar.f3806c.getFailure() == ok2.e.C && (numY = lg.d.y(jVar.f3806c)) != null && numY.intValue() == 412) {
                            String str = a2.CONSENT.f28756a;
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.b(a2Var, str, "DeviceSyncReceiver onSyncFinished() with 412 response code -> trigger Data Sync Indicators GC worker");
                            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, this.f199081b).a("DataSyncIndicatorsWorker", ue.l.REPLACE, new x.a((Class<? extends androidx.work.d>) DataSyncIndicatorsWorker.class).a()).a();
                        }
                    }
                }
                if (km2.a.i(cVar2.getF92746j(), null, SupportedCapability.REALTIME_SETTINGS.ordinal()) && kVar == al2.k.SUCCESS) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "DeviceSyncReceiver", "onSoftwareUpdate: re-initialize RealTimeSettings");
                    String[] strArrB = da2.d.b().f58886a.f111646e.b(cVar2.getF92746j());
                    if (strArrB.length == 0) {
                        i2.a.p(a2Var2, "DeviceSyncReceiver", "initializeDeviceSettings: Could not find macAddress from unitId " + cVar2.getF92746j());
                        return;
                    }
                    com.garmin.realtimesettings.app.initialization.b bVar3 = com.garmin.realtimesettings.app.initialization.b.f52589a;
                    Context context4 = this.f199081b;
                    String str2 = strArrB[0];
                    long f172494b4 = cVar2.getF92746j();
                    String strB = GCMSettingManager.k().b();
                    String strStripEnd = StringUtils.stripEnd(GCMSettingManager.k().e(), "/");
                    strStripEnd.getClass();
                    com.garmin.realtimesettings.app.initialization.b.e(bVar3, context4, str2, new fx2.a(f172494b4, strB, strStripEnd), c22.b0.b(null));
                    i2.a.b(a2Var2, "DeviceSyncReceiver", v.h.u(cVar2.getF92746j(), "Starting realtime settings work request with unitId ", " and macAddress ", strArrB[0]));
                    return;
                }
                return;
            case 4:
            case 5:
                Context context5 = this.f199081b;
                Map<String, al2.k> mapF2 = f();
                rs2.c cVar3 = cVar.f3775a;
                mapF2.put(cVar3.getF92741e(), null);
                oi2.a.C2513a.a(oi2.a.f132270a, new pi2.i(s.a(cVar)));
                vc2.c cVar4 = az0.b.f13673d;
                if (cVar4 != null) {
                    cVar4.a(500);
                }
                List<al2.j> list2 = cVar.f3779e;
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        al2.j jVar2 = (al2.j) next;
                        if (jVar2.f3806c.getFailure() == ok2.e.f132654x) {
                            wk2.f fVar = jVar2.f3804a;
                            String str3 = fVar != null ? fVar.f185843b : null;
                            if (str3 == null || !p13.u.z(f199080h, str3)) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                al2.j jVar3 = (al2.j) next;
                if (jVar3 != null) {
                    a aVar3 = f199079g;
                    String str4 = "onSyncFailure CoreTransferFailure.NO_SPACE connectionId[" + cVar3.getF92741e() + "] failure[" + jVar3 + "]";
                    aVar3.getClass();
                    a.a(str4);
                    long f172494b5 = cVar3.getF92746j();
                    String string = context5.getString(R.string.connect_iq_apps_not_enough_space);
                    string.getClass();
                    h(f172494b5, string);
                }
                for (Object obj2 : list2) {
                    if (((al2.j) obj2).f3806c instanceof CiqNoSlotsException) {
                        obj = obj2;
                        if (((al2.j) obj) != null) {
                            long f172494b6 = cVar3.getF92746j();
                            String string2 = context5.getString(R.string.connect_iq_apps_not_enough_slots);
                            string2.getClass();
                            h(f172494b6, string2);
                            return;
                        }
                        return;
                    }
                }
                if (((al2.j) obj) != null) {
                    long f172494b7 = cVar3.getF92746j();
                    String string3 = context5.getString(R.string.connect_iq_apps_not_enough_slots);
                    string3.getClass();
                    h(f172494b7, string3);
                    return;
                }
                return;
            case 6:
                a.a("onStatusChange event: " + cVar.f3777c + " not handled");
                return;
            default:
                u0.r();
                return;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyr1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACTIVITY_DATA_TYPE", "", "CONSENT_REVOKED_RESPONSE_CODE", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(String str) {
            a2 a2Var = a2.DEVICES;
            String strConcat = "DeviceSyncReceiver ".concat(str);
            i2.f36769a.getClass();
            i2.a.a(a2Var, strConcat);
        }

        private a() {
        }
    }
}
