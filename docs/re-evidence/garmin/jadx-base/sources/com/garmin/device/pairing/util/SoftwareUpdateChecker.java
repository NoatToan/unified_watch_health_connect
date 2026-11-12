package com.garmin.device.pairing.util;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import lm2.h;
import lm2.i;
import n23.j;
import org.apache.commons.lang3.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import ue.f;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/device/pairing/util/SoftwareUpdateChecker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SoftwareUpdateChecker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50929e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f50930f = LoggerFactory.getLogger("PAIR#SoftwareUpdateChecker");

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/device/pairing/util/SoftwareUpdateChecker$b", "Llm2/i$b;", "", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements i.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f50931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f50932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CompletableFuture<d.a> f50933c;

        public b(String str, long j8, CompletableFuture<d.a> completableFuture) {
            this.f50931a = str;
            this.f50932b = j8;
            this.f50933c = completableFuture;
        }

        @Override // lm2.i.b
        public final void a(String str) {
            SoftwareUpdateChecker.f50930f.info(j.d(this.f50932b, "Successful check SW updates for ", this.f50931a, "/"));
            this.f50933c.complete(new d.a.c());
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            th3.getClass();
            Logger logger = SoftwareUpdateChecker.f50930f;
            String message = th3.getMessage();
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f50932b, "Failed check SW updates for ", this.f50931a, "/");
            sbJ.append(": ");
            sbJ.append(message);
            logger.warn(sbJ.toString());
            this.f50933c.complete(new d.a.C0165a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftwareUpdateChecker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public static final void d(Context context, bm2.d dVar) {
        f50929e.getClass();
        context.getClass();
        v vVar = v.CONNECTED;
        vVar.getClass();
        f.a aVar = new f.a();
        aVar.b(vVar);
        f fVarA = aVar.a();
        c.a aVar2 = new c.a();
        String strF = dVar.f();
        LinkedHashMap linkedHashMap = aVar2.f11467a;
        linkedHashMap.put("key_connection_id", strF);
        linkedHashMap.put("key_unit_id", Long.valueOf(dVar.getF92746j()));
        x.a aVar3 = new x.a((Class<? extends d>) SoftwareUpdateChecker.class);
        aVar3.f170098c.f26950j = fVarA;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).c(e.e(dVar.getF92746j(), "background_sw_check_"), l.REPLACE, aVar3.e(15L, timeUnit).d(ue.a.LINEAR, 15L, timeUnit).f(aVar2.a()).a());
        String f92742f = dVar.getF92742f();
        long f92746j = dVar.getF92746j();
        String strF2 = dVar.f();
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f92746j, "Scheduled SW check for ", f92742f, "/");
        sbJ.append("/");
        sbJ.append(strF2);
        f50930f.info(sbJ.toString());
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        WorkerParameters workerParameters = this.f11470b;
        String strE = workerParameters.f11427b.e("key_connection_id");
        if (strE == null) {
            return new d.a.C0165a();
        }
        long jD = workerParameters.f11427b.d("key_unit_id", -1L);
        boolean z14 = h.f113619b;
        Logger logger = f50930f;
        if (!z14) {
            logger.error("Unable to check SW updates because pairing library not initialized");
            return new d.a.b();
        }
        DeviceProfile deviceProfileH = ((fm2.c) h.c()).h(strE);
        bm2.d dVar = deviceProfileH != null ? new bm2.d(deviceProfileH) : new bm2.d(jD, 0, strE, strE, 0, 1, new Configuration());
        byte[] bArr = ((em2.d) h.e()).f(dVar).f128594a;
        if (bArr == null || bArr.length == 0) {
            logger.error(j.d(jD, "Unable to check SW updates because no XML for ", strE, "/"));
            return new d.a.C0165a();
        }
        CompletableFuture completableFuture = new CompletableFuture();
        ((im2.c) h.f()).c(new yl2.c(dVar, bArr), new b(strE, jD, completableFuture));
        Object objJoin = completableFuture.join();
        objJoin.getClass();
        return (d.a) objJoin;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/device/pairing/util/SoftwareUpdateChecker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "WORK_NAME", "KEY_CONNECTION_ID", "KEY_UNIT_ID", "", "SOFTWARE_UPDATE_CHECK_DELAY_MINUTES", "J", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
