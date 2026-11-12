package yb2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.gson.Gson;
import d53.u;
import il2.e;
import kc2.f;
import kc2.g;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import wb2.h;
import wb2.k0;
import yt2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyb2/c;", "Lxb2/a;", "<init>", "()V", "a", "connect-device-sync-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements xb2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f195702a;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f195704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f195705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f195706d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, k0 k0Var, Bundle bundle) {
            super(0);
            this.f195704b = dVar;
            this.f195705c = k0Var;
            this.f195706d = bundle;
        }

        @Override // e23.a
        public final Unit invoke() {
            c.this.getClass();
            d dVar = this.f195704b;
            dVar.getClass();
            k0 k0Var = this.f195705c;
            k0Var.getClass();
            Bundle bundle = this.f195706d;
            bundle.getClass();
            g gVarG = c.g(k0Var);
            f fVarF = c.f(k0Var);
            String string = bundle.getString("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_FAILURE_CODE", "");
            String str = h.Y;
            str.getClass();
            string.getClass();
            kc2.b bVar = new kc2.b(str, string, string, "", null, 16, null);
            c.f195702a.warn("sendOverallSyncFailureAnalytic " + gVarG + StringUtils.SPACE + bVar);
            c.e(dVar, jc2.f.FAILURE, gVarG, fVarF, bVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: yb2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C3642c extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f195708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k0 f195709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3642c(d dVar, k0 k0Var) {
            super(0);
            this.f195708b = dVar;
            this.f195709c = k0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            kc2.b bVar;
            c.this.getClass();
            Logger logger = c.f195702a;
            d dVar = this.f195708b;
            dVar.getClass();
            k0 k0Var = this.f195709c;
            k0Var.getClass();
            g gVarG = c.g(k0Var);
            f fVarF = c.f(k0Var);
            jc2.f fVar = jc2.f.SUCCESS;
            if (k0Var.f184051f != null) {
                String str = k0Var.f184051f;
                String str2 = str == null ? "" : str;
                String str3 = k0Var.f184052g;
                String str4 = str3 == null ? "" : str3;
                String str5 = k0Var.f184053h;
                String str6 = str5 == null ? "" : str5;
                String str7 = k0Var.f184054i;
                bVar = new kc2.b(str2, str4, str6, str7 == null ? "" : str7, null, 16, null);
                String str8 = k0Var.f184052g;
                fVar = (str8 == null || !u.p(str8, h.SOFTWARE_UPDATE_FILE_DOWNLOAD_CANCELLED.name(), false)) ? jc2.f.FAILURE : jc2.f.ABORT;
                logger.warn("sendSyncFinishedAnalytic " + gVarG + StringUtils.SPACE + bVar);
            } else {
                logger.debug("sendSyncFinishedAnalytic " + gVarG);
                bVar = null;
            }
            c.e(dVar, fVar, gVarG, fVarF, bVar);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f195702a = LoggerFactory.getLogger("SYNC-OMT#AnalyticsCallback");
    }

    public static void e(d dVar, jc2.f fVar, g gVar, f fVar2, kc2.b bVar) {
        String strName;
        String errorStackTrace;
        NetworkInfo.State state;
        yt2.g gVarD = dVar.d();
        kc2.a aVar = new kc2.a(gVarD.f199677c, gVarD.f199675a, gVarD.f199676b);
        ConnectivityManager connectivityManager = (ConnectivityManager) ((e) ec2.e.b()).m().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || (state = activeNetworkInfo.getState()) == null || (strName = state.name()) == null) {
            strName = NetworkInfo.State.UNKNOWN.name();
        }
        String typeName = activeNetworkInfo != null ? activeNetworkInfo.getTypeName() : null;
        if (typeName == null) {
            typeName = "";
        }
        String subtypeName = activeNetworkInfo != null ? activeNetworkInfo.getSubtypeName() : null;
        kc2.e eVar = new kc2.e(strName, typeName, subtypeName != null ? subtypeName : "");
        if (bVar != null && (errorStackTrace = bVar.getErrorStackTrace()) != null && d53.w.z(errorStackTrace, "UnknownHostException", false) && !s.g(eVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String(), NetworkInfo.State.CONNECTED.name()) && !dVar.a()) {
            f195702a.debug("Drop this analytics event");
            return;
        }
        Gson gson = new Gson();
        String str = fVar.jsonValue;
        str.getClass();
        String str2 = jc2.b.NONE.jsonValue;
        str2.getClass();
        boolean z14 = !dVar.a();
        if (bVar != null) {
            com.garmin.android.lib.garminmobileanalytics.b.a aVar2 = com.garmin.android.lib.garminmobileanalytics.b.f49927a;
            String errorMessage = bVar.getErrorMessage();
            aVar2.getClass();
            bVar.j(com.garmin.android.lib.garminmobileanalytics.b.a.a(errorMessage));
            bVar.i(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorGroupName()));
            bVar.k(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorStackTrace()));
            bVar.m(com.garmin.android.lib.garminmobileanalytics.b.a.a(bVar.getErrorType()));
        }
        kc2.c cVar = new kc2.c(gVar, aVar, str, str2, z14, eVar, bVar, gson.toJson(fVar2), null, 256, null);
        String str3 = jc2.a.GARMIN_DEVICE_SYNC.omtEventTypeValue;
        str3.getClass();
        String json = gson.toJson(cVar);
        json.getClass();
        yt2.e eVar2 = new yt2.e(str3, json, System.currentTimeMillis());
        yt2.f.f199669a.getClass();
        yt2.f.a(eVar2, true);
    }

    public static f f(k0 k0Var) {
        if (k0Var.f184046a == 1) {
            String syncType = jc2.h.SILENT.getSyncType();
            syncType.getClass();
            return new f(syncType);
        }
        String syncType2 = jc2.h.USER_VISIBLE.getSyncType();
        syncType2.getClass();
        return new f(syncType2);
    }

    public static g g(k0 k0Var) {
        if (k0Var.f184047b <= 0) {
            return new g(0L, "", "", "");
        }
        long j8 = k0Var.f184047b;
        String str = k0Var.f184048c;
        str.getClass();
        return new g(j8, str, String.valueOf(k0Var.f184050e), String.valueOf(k0Var.f184049d));
    }

    @Override // xb2.a
    public final void a(k0 k0Var, Bundle bundle) {
    }

    @Override // xb2.a
    public final void b(k0 k0Var, Bundle bundle) {
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar == null) {
            return;
        }
        oi0.c.W(-1, new b(aVar, k0Var, bundle));
    }

    @Override // xb2.a
    public final void c(k0 k0Var, Bundle bundle) {
    }

    @Override // xb2.a
    public final void d(k0 k0Var) {
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar == null) {
            return;
        }
        oi0.c.W(-1, new C3642c(aVar, k0Var));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyb2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "SYNC_ANALYTICS_PREFIX", "Ljava/lang/String;", "connect-device-sync-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
