package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.lib.connectdevicesync.exception.InvalidUnitIDException;
import com.garmin.android.lib.connectdevicesync.exception.RemoteGdiServiceDeadException;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gfdi.file.FileException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class p extends wb2.c {
    public static final /* synthetic */ int T = 0;
    public List<gy2.g> A;
    public d B;
    public boolean C;
    public int D;
    public String E;
    public int F;
    public String I;
    public j P;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ac2.d f184072x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j0 f184073y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f184074z;

    public class a {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0013  */
        /* JADX WARN: Code duplicated, block: B:15:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x000e  */
        public final void a(h hVar, String str, Exception exc) {
            j jVar;
            p pVar = p.this;
            try {
                if (lm2.h.f113619b) {
                    lm2.h.d();
                    if (!GarminDeviceWakefulService.f33825e) {
                        jVar = pVar.P;
                        if (jVar == null) {
                            jVar = j.ALWAYS_SHOW_PROGRESS;
                        }
                        if (jVar != j.INVISIBLE) {
                            pVar.f184159a.warn("******************** SYNC NON-FATAL FAILURE: Download List: ".concat(str));
                            p.Y(pVar, str);
                            b(new long[0], new long[0], new gy2.g[0], new String[0], new String[0]);
                            return;
                        }
                    }
                } else {
                    jVar = pVar.P;
                    if (jVar == null) {
                        jVar = j.ALWAYS_SHOW_PROGRESS;
                    }
                    if (jVar != j.INVISIBLE) {
                        pVar.f184159a.warn("******************** SYNC NON-FATAL FAILURE: Download List: ".concat(str));
                        p.Y(pVar, str);
                        b(new long[0], new long[0], new gy2.g[0], new String[0], new String[0]);
                        return;
                    }
                }
            } catch (Exception unused) {
            }
            pVar.N(hVar, new Exception(str, exc));
        }

        public final void b(long[] jArr, long[] jArr2, gy2.g[] gVarArr, String[] strArr, String[] strArr2) {
            int length = jArr.length;
            p pVar = p.this;
            if (length > 0) {
                Logger logger = pVar.f184159a;
                Vector<String> vector = pVar.f184165g;
                logger.debug("onDeviceMessagesFound: device message=" + Arrays.toString(jArr));
                for (int i14 = 0; i14 < jArr.length; i14++) {
                    long j8 = jArr[i14];
                    int i15 = p.T;
                    String strG0 = pVar.g0(j8);
                    if (!vector.contains(strG0)) {
                        t0 t0Var = new t0(jArr[i14], gVarArr[i14], false, strArr[i14], strArr2[i14]);
                        pVar.f184164f.put(strG0, t0Var);
                        vector.add(strG0);
                        long j14 = jArr2[i14];
                        if (j14 > 0) {
                            t0Var.f184153m = false;
                        } else {
                            t0Var.f184153m = true;
                            j14 = 100;
                        }
                        pVar.y(j14);
                    }
                }
            }
            StringBuilder sb3 = new StringBuilder();
            Vector<String> vector2 = pVar.f184165g;
            Vector<String> vector3 = pVar.f184165g;
            Logger logger2 = pVar.f184159a;
            if (vector2.isEmpty()) {
                String str = v.a.NO_ITEM_TO_PROCESS.f184192a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(v.a.NO_DOWNLOADABLE_ITEM_FOUND.f184192a);
                sb4.append(" (");
                String strI = am.j.i(pVar.f184074z, ")", sb4);
                sb3.append(str);
                sb3.append("; ");
                sb3.append(strI);
                logger2.warn("onDeviceMessagesFound: ".concat(sb3.toString()));
            } else {
                logger2.debug("onDeviceMessagesFound: ready for download. Count=" + vector3.size());
            }
            pVar.f183967w.j(wb2.b.a.BROWSED, sb3.toString());
            pVar.R(vector3.size());
            pVar.d0(null);
        }
    }

    public class b {
        public b() {
        }

        public final void a(long j8, String str, String str2, long j14, String str3) throws IOException {
            boolean zI;
            p pVar = p.this;
            pVar.f184159a.debug("onDeviceMessageDownloadComplete: aFileDir=" + str + "; aFileName=" + str2);
            ConcurrentHashMap<String, t0> concurrentHashMap = pVar.f184164f;
            int i14 = p.T;
            t0 t0Var = concurrentHashMap.get(pVar.g0(j8));
            if (t0Var == null) {
                pVar.f184159a.warn("onDeviceMessageDownloadComplete: Unrecognized transfer activity for device message id=" + j8);
                return;
            }
            str.getClass();
            str2.getClass();
            if (str2.length() != 0 && j14 > 0) {
                gy2.g gVar = t0Var.f184149i;
                if (gVar == null) {
                    zI = true;
                } else if (gVar.f80326c) {
                    iy2.a.f95840a.getClass();
                    zI = iy2.a.a(str, str2);
                } else {
                    iy2.a.f95840a.getClass();
                    byte[] bArr = new byte[(int) Math.min(8192L, j14)];
                    FileInputStream fileInputStream = new FileInputStream(new File(str, str2));
                    try {
                        fileInputStream.read(bArr);
                        Unit unit = Unit.INSTANCE;
                        fileInputStream.close();
                        zI = gg.b.I(bArr);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(fileInputStream, th3);
                            throw th4;
                        }
                    }
                }
            } else {
                zI = false;
            }
            if (!zI) {
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j14, "Cannot find file [", str2, "] or file is empty: ");
                sbJ.append(" or file could not be validated");
                String string = sbJ.toString();
                pVar.f184159a.error("onDeviceMessageDownloadComplete: ".concat(string));
                c(t0Var, h.DEVICE_MESSAGE_DOWNLOAD_FAILED, new IllegalArgumentException(string), j8);
                return;
            }
            wb2.b bVar = pVar.f183967w;
            synchronized (bVar) {
                bVar.f183940h = j14;
            }
            pVar.f183967w.i(wb2.b.a.DOWNLOADED);
            pVar.f184159a.debug("onDeviceMessageDownloadComplete: Updating entry for device message id=" + j8);
            t0Var.f184143c = str;
            t0Var.f184144d = str2;
            t0Var.f184145e = j14;
            t0Var.f184148h = str3;
            pVar.f184159a.info(t0Var.toString());
            Logger logger = pVar.f184159a;
            if (t0Var.a()) {
                pVar.C = true;
            }
            pVar.f183967w.i(wb2.b.a.SAVING);
            logger.debug("save: Start transferring file name=" + t0Var.f184144d);
            try {
                ((n0) pVar.f184073y).j(pVar.l(), Long.toString(t0Var.f184152l), t0Var.f184143c, t0Var.f184144d, t0Var.f184146f, t0Var.f184147g, t0Var.f184148h, new q(pVar, t0Var));
            } catch (InvalidUnitIDException | RemoteGdiServiceDeadException e4) {
                pVar.L(e4, "download");
            }
        }

        public final void b(long j8, h hVar, String str, Exception exc) {
            h hVar2 = h.CONTENT_DOES_NOT_EXIST;
            p pVar = p.this;
            if (hVar != hVar2) {
                int i14 = p.T;
                c(pVar.f184164f.get(pVar.g0(j8)), hVar, new Exception(str, exc), j8);
                return;
            }
            pVar.f184159a.warn("******************** SYNC NON-FATAL FAILURE: Download: ".concat(str));
            p.Y(pVar, str);
            wb2.b bVar = pVar.f183967w;
            bVar.i(wb2.b.a.ACKNOWLEDGING);
            ac2.d dVar = pVar.f184072x;
            dVar.getClass();
            dVar.a(j8, g.RECEIVED);
            bVar.i(wb2.b.a.ACKED);
            pVar.f0(j8);
        }

        public final void c(t0 t0Var, h hVar, Exception exc, long j8) {
            p pVar = p.this;
            if (pVar.A == null || (t0Var != null && (t0Var.a() || pVar.A.contains(t0Var.f184149i)))) {
                pVar.N(hVar, exc);
                return;
            }
            p.Y(pVar, exc.getMessage());
            if (t0Var != null) {
                pVar.f184159a.warn("******************** SYNC NON-FATAL FAILURE: Download: Failed to download from server for " + t0Var.f184155o + " code:" + hVar + " description:" + exc.getMessage());
            }
            pVar.f184177t.e(v.e(v.n(exc).getClass().getSimpleName(), exc.getMessage()), null);
            pVar.f0(j8);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184077a;

        static {
            int[] iArr = new int[FileException.a.values().length];
            f184077a = iArr;
            try {
                iArr[FileException.a.NOT_ENOUGH_SPACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184077a[FileException.a.NOT_ENOUGH_SPACE_FOR_FILE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184077a[FileException.a.NO_SLOTS_FOR_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f184077a[FileException.a.CRC_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f184077a[FileException.a.FILE_INDEX_DOES_NOT_EXIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f184077a[FileException.a.FILE_INDEX_NOT_READABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f184077a[FileException.a.FILE_INDEX_NOT_WRITABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f184077a[FileException.a.CANCELLED_BY_DEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f184077a[FileException.a.NOT_READY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f184077a[FileException.a.INVALID_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f184078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f184079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f184080c;

        private d(i iVar, String str, String str2) {
            this.f184078a = iVar;
            this.f184079b = str;
            this.f184080c = str2;
        }

        public static d a(i iVar, String str, String str2) {
            return new d(iVar, str, str2);
        }

        public static d b() {
            return new d(null, null, null);
        }
    }

    public p(Context context, j0 j0Var, g0 g0Var) {
        super(context, "DeviceSyncDownload", g0Var);
        this.f184074z = -1L;
        this.A = Collections.EMPTY_LIST;
        this.C = false;
        this.D = 2;
        this.E = "Normal";
        this.F = 0;
        this.I = null;
        this.P = j.ALWAYS_SHOW_PROGRESS;
        this.f184072x = new ac2.d(context);
        this.f184073y = j0Var == null ? g0Var : j0Var;
        new File(context.getFilesDir(), "/downloads").mkdirs();
    }

    public static void X(p pVar, String str, long j8) {
        pVar.getClass();
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_DEVICE_TRANSFER_PROGRESS");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", pVar.j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", pVar.l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", pVar.i());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FILE_NAME", str);
        }
        long jG = pVar.g();
        if (jG >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_SIZE", jG);
        }
        long jT = pVar.t();
        if (jT >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_SIZE", jT);
        }
        int iF = pVar.f();
        if (iF >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_COUNT", iF);
        }
        int iS = pVar.s();
        if (iS >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_COUNT", iS);
        }
        Logger logger = pVar.f184159a;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "notifyDeviceTransferProgress: FileName=", str, "; BytesTransferred=");
        j20.x.j(jG, "; CumulativeFileSize=", "; TotalFileSize=", sbJ);
        sbJ.append(jT);
        sbJ.append("; CumulativeFileCount=");
        sbJ.append(iF);
        sbJ.append("; TotalFileCount=");
        sbJ.append(iS);
        logger.debug(sbJ.toString());
        pVar.setChanged();
        pVar.notifyObservers(intent);
    }

    public static void Y(p pVar, String str) {
        synchronized (pVar) {
            pVar.F++;
            if (TextUtils.isEmpty(pVar.I)) {
                pVar.I = str;
            }
        }
    }

    @Override // wb2.v
    public final synchronized void A(DeviceProfile deviceProfile) {
        super.A(deviceProfile);
        this.f183967w.f("DOWNLOAD");
        this.A = ((il2.e) ec2.e.b()).a(deviceProfile);
    }

    @Override // wb2.v
    public final boolean E() {
        return this.f184164f.isEmpty();
    }

    @Override // wb2.c
    public final String W() {
        StringBuilder sb3 = new StringBuilder("\n#BitMask=");
        long j8 = this.f184074z;
        if (j8 >= 0) {
            sb3.append(j8);
        } else {
            sb3.append("n/a");
        }
        return sb3.toString();
    }

    public final void Z() {
        String[] strArr;
        this.B = d.b();
        DeviceProfile deviceProfileM = m();
        long j8 = this.f184074z;
        DeviceProfile deviceProfileM2 = m();
        boolean z14 = (deviceProfileM2 == null || deviceProfileM2.getConfigurationFlags().contains(48)) ? false : true;
        String str = this.E;
        a aVar = new a();
        ac2.d dVar = this.f184072x;
        ConcurrentHashMap<Long, gy2.c> concurrentHashMap = dVar.f2706b;
        Logger logger = dVar.f2709e;
        logger.debug("Browsing queue for device " + deviceProfileM.getF92746j());
        ac2.a aVar2 = new ac2.a();
        fc2.b bVarC = ec2.e.c();
        long f92746j = deviceProfileM.getF92746j();
        cc2.g gVar = (cc2.g) bVarC;
        u53.d dVar2 = gVar.f26753b;
        cc2.c cVar = new cc2.c(aVar2, gVar, f92746j, null);
        boolean z15 = z14;
        ge1.b.T(dVar2, null, null, cVar, 3);
        aVar2.b();
        if (aVar2.f()) {
            aVar.a(h.DOWNLOAD_QUEUE_BROWSE_FAILED, "Unexpected server response: " + aVar2.e(), aVar2.c());
            return;
        }
        String strD = aVar2.d();
        logger.debug(strD);
        gy2.d dVar3 = new gy2.d();
        try {
            dVar3.a(new JSONObject(strD));
            logger.debug("DONE PARSING " + dVar3.f80303a.intValue());
            long[] jArr = new long[0];
            long[] jArr2 = new long[0];
            gy2.g[] gVarArr = new gy2.g[0];
            String[] strArr2 = new String[0];
            String[] strArr3 = new String[0];
            ArrayList arrayList = dVar3.f80304b;
            dVar.f("GC RAW LIST OF DEVICE MESSAGES IN THE QUEUE", arrayList);
            if (arrayList != null) {
                strArr = strArr2;
                ArrayList arrayListC = dVar.c(arrayList, j8, z15, str, deviceProfileM);
                if (!arrayListC.isEmpty()) {
                    Collections.sort(arrayListC);
                    dVar.f("GC FILTERED LIST OF DEVICE MESSAGES IN THE QUEUE (DownloadBitMask=" + j8 + ")", arrayListC);
                    concurrentHashMap.clear();
                    jArr = new long[arrayListC.size()];
                    jArr2 = new long[arrayListC.size()];
                    gVarArr = new gy2.g[arrayListC.size()];
                    strArr = new String[arrayListC.size()];
                    strArr3 = new String[arrayListC.size()];
                    for (int i14 = 0; i14 < arrayListC.size(); i14++) {
                        jArr[i14] = ((gy2.c) arrayListC.get(i14)).d();
                        jArr2[i14] = ((gy2.c) arrayListC.get(i14)).c();
                        gVarArr[i14] = ((gy2.c) arrayListC.get(i14)).f80295f;
                        strArr[i14] = ((gy2.c) arrayListC.get(i14)).f();
                        strArr3[i14] = ((gy2.c) arrayListC.get(i14)).e();
                        concurrentHashMap.put(Long.valueOf(jArr[i14]), (gy2.c) arrayListC.get(i14));
                    }
                    new Thread(new ac2.c(dVar, deviceProfileM, arrayListC, j8), "DownloadQueueAgent-deleteExpiredFiles").start();
                }
            } else {
                strArr = strArr2;
            }
            try {
                aVar.b(jArr, jArr2, gVarArr, strArr, strArr3);
            } catch (JSONException e4) {
                e = e4;
                logger.error(e.getMessage());
                aVar.a(h.DOWNLOAD_QUEUE_BROWSE_FAILED, "Invalid JSON response", e);
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    @Override // wb2.f0
    public final String a() {
        return "com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_PREPARED";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a0(long r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wb2.p.a0(long):void");
    }

    @Override // wb2.f0
    public final void b(Bundle bundle) {
        bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_SOFTWARE_TRANSFER_RESULT", this.D);
        boolean z14 = true;
        h hVar = null;
        if (!H() && !C()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS", 2);
        } else if (I()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS", 0);
            int i14 = this.F;
            if (i14 > 0) {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_PARTIAL_FAILURE_COUNT", i14);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_SUCCESS_REASON", this.I);
            }
        } else if (G()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS", 0);
            bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_SUCCESS_REASON", v.a.NO_ITEM_TO_PROCESS.name());
        } else {
            if (D()) {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS", 1);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TYPE", q());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_DETAIL", o());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TRACE", p());
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_SOURCE", this.f184171m.get() != v.c.FAILED_SERVER_EXCEPTION ? 1 : 2);
                hVar = this.f184172n;
            } else {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_STATUS", 1);
                v.a aVar = v.a.ERROR_PRIOR_TO_EXECUTE;
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TYPE", aVar.name());
                String strO = o();
                if (v.a.NO_FAILURE_INFO_AVAILABLE.f184192a.equals(strO)) {
                    strO = aVar.f184192a;
                }
                if (!strO.startsWith("download")) {
                    strO = "download:".concat(strO);
                }
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_DETAIL", strO);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_DOWNLOAD_FAILURE_TRACE", p());
            }
            z14 = false;
        }
        v.J(bundle, z14, hVar);
    }

    public final void b0() throws Throwable {
        boolean zP = ((il2.e) ec2.e.b()).p();
        Logger logger = this.f184159a;
        if (!zP) {
            String str = v.a.UNABLE_TO_COMPLETE_OPERATION.f184192a;
            String str2 = v.a.INVALID_USER_CREDENTIAL.f184192a;
            logger.error("USER SIGNED OUT?!?");
            O(h.INVALID_USER_CREDENTIAL, str, str2, null);
            return;
        }
        t0 t0VarH = h();
        if (t0VarH == null) {
            logger.error("executeNextFile: Empty Transferable Item!");
            L(new IllegalStateException("executeNextFile: Empty Transferable Item!"), "download");
            return;
        }
        try {
            long j8 = t0VarH.f184152l;
            logger.debug("notifyMessageProcessingStarted: currentItem = " + t0VarH);
            e0(true, t0VarH);
            this.f183967w.h(Long.toString(j8), t0VarH.f184146f, t0VarH.f184147g, t0VarH.f184149i);
            a0(j8);
        } catch (Exception e4) {
            N(h.DEVICE_MESSAGE_DOWNLOAD_FAILED, e4);
        }
    }

    @Override // wb2.f0
    public final String c() {
        return "com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_EXECUTED";
    }

    public final void c0(String str) {
        V();
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_EXECUTED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON", str);
        }
        P(v.b.EXECUTED);
        StringBuilder sb3 = new StringBuilder("notifyDownloadExecuted: aFailureReason=");
        sb3.append(TextUtils.isEmpty(str) ? "none" : str);
        h0.c(this.f184159a, sb3.toString(), v.B(str));
        setChanged();
        notifyObservers(intent);
    }

    public final void d0(String str) {
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_PREPARED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        long jT = t();
        if (jT >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_SIZE", jT);
        }
        int iS = s();
        if (iS >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_COUNT", iS);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON", str);
        }
        P(v.b.PREPARED);
        h0.c(this.f184159a, am.j.o(", aFailureReason=", str, v.h.w(iS, "notifyDownloadPrepared: totalFileSize=", ", totalFileCount=", jT)), v.B(str));
        setChanged();
        notifyObservers(intent);
    }

    public final void e0(boolean z14, t0 t0Var) {
        gy2.g gVar;
        if (t0Var == null || (gVar = t0Var.f184149i) == null) {
            return;
        }
        Intent intent = new Intent(z14 ? "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_STARTED" : "com.garmin.android.lib.connectdevicesync.ACTION_MESSAGE_PROCESSING_FINISHED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_MESSAGE_TYPE", gVar.name());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_MESSAGE_ID", t0Var.f184152l);
        setChanged();
        notifyObservers(intent);
    }

    @Override // wb2.f0
    public final synchronized void execute() {
        try {
            this.f184159a.trace("execute: begin");
            P(v.b.EXECUTING);
            if (this.f184165g.isEmpty()) {
                boolean zD = D();
                Logger logger = this.f184159a;
                if (zD) {
                    logger.warn("execute: there has been exception encountered by prepare() method: " + q());
                    c0(o());
                } else {
                    logger.debug("execute: nothing to do");
                    Q(v.c.SUCCESSFUL_NOTHING_TO_DO);
                    c0(null);
                }
            } else {
                this.f184159a.debug("execute: Transferring the following files TO remote device=" + this.f184165g.toString());
                b0();
            }
            this.f184159a.trace("execute: end");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void f0(long j8) {
        String strG0 = g0(j8);
        ConcurrentHashMap<String, t0> concurrentHashMap = this.f184164f;
        t0 t0Var = concurrentHashMap.get(strG0);
        Vector<String> vector = this.f184165g;
        vector.remove(strG0);
        concurrentHashMap.remove(strG0);
        Logger logger = this.f184159a;
        logger.debug("notifyMessageProcessingFinished: currentItem = " + t0Var);
        e0(false, t0Var);
        if (!vector.isEmpty()) {
            b0();
            return;
        }
        Q(v.c.SUCCESSFUL);
        c0(null);
        i iVar = this.B.f184078a;
        if (iVar == null) {
            return;
        }
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_APP_INSTALLATION_FAILED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_APP_INSTALL_FAILURE_REASON", iVar.name());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        logger.debug("broadcastAppInstallFailure");
        r.f().getClass();
        boolean z14 = r.f184103h.get();
        Context context = this.f184161c;
        if (z14) {
            oa2.b.c(context, "com.garmin.android.lib.connectdevicesync.action.ACTION_APP_INSTALLATION_FAILED", r(), intent.getExtras());
        } else {
            oa2.b.a(context, "com.garmin.android.lib.connectdevicesync.action.ACTION_APP_INSTALLATION_FAILED", r(), intent.getExtras());
        }
    }

    public final String g0(long j8) {
        return "DL_" + j() + "_" + j8;
    }

    @Override // wb2.f0
    public final synchronized void prepare() {
        this.f184159a.trace("prepare: begin");
        P(v.b.PREPARING);
        z();
        this.f184165g.clear();
        d();
        long j8 = this.f184074z;
        if (j8 >= 0) {
            try {
                this.f184159a.debug("prepare: Perform Download Queue browsing");
                this.f183967w.i(wb2.b.a.BROWSING);
                Z();
            } catch (Exception e4) {
                N(h.DOWNLOAD_QUEUE_BROWSE_FAILED, e4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            String str = v.a.NO_ITEM_TO_PROCESS.f184192a;
            String str2 = v.a.INVALID_DOWNLOAD_BIT_MASK.f184192a + " (" + j8 + ")";
            sb3.append(str);
            sb3.append("; ");
            sb3.append(str2);
            this.f184159a.warn("prepare: ".concat(sb3.toString()));
            R(this.f184165g.size());
            d0(null);
        }
        this.f184159a.trace("prepare: end");
    }

    @Override // wb2.c, wb2.v
    public final void u() {
        if (this.C) {
            this.C = false;
            this.D = 1;
        }
        V();
    }

    @Override // wb2.v
    public final void v() {
        Logger logger = this.f184159a;
        logger.debug("handlePostCancellation");
        U();
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_CANCELLED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        P(null);
        logger.debug("notifyDownloadCancelled");
        setChanged();
        notifyObservers(intent);
    }

    @Override // wb2.v
    public final void w(String str) {
        h0.c(this.f184159a, fb1.c.n("handlePostException: Failure reason=", str), v.B(str));
        if (TextUtils.isEmpty(str)) {
            str = v.a.NO_FAILURE_INFO_AVAILABLE.f184192a;
        }
        if (this.f184163e.get() == v.b.PREPARING) {
            d0(str);
        } else {
            c0(str);
        }
    }
}
