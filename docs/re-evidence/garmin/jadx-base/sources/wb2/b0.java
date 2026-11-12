package wb2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bs2.ad;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.InvalidUnitIDException;
import com.garmin.android.lib.connectdevicesync.exception.RemoteGdiServiceDeadException;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class b0 extends c {
    public static final /* synthetic */ int F = 0;
    public Set<String> A;
    public ServerProcessingTimeoutException B;
    public byte[] C;
    public boolean D;
    public bc2.a E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bc2.g f183959x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f183960y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f183961z;

    public class a implements i0.a {
        public a() {
        }

        public final void a(String[] strArr, long[] jArr, byte[] bArr, byte[] bArr2) {
            ad adVar;
            byte b14;
            String[] strArr2 = strArr;
            byte[] bArr3 = bArr;
            b0 b0Var = b0.this;
            AtomicReference<v.b> atomicReference = b0Var.f184163e;
            Logger logger = b0Var.f184159a;
            v.b bVar = atomicReference.get();
            if (bVar != v.b.PREPARING) {
                logger.warn("prepare: ignoring onPendingUploadFilesListed(); called after PREPARE state ended; current state = " + bVar);
                return;
            }
            wb2.b bVar2 = b0Var.f183967w;
            Vector<String> vector = b0Var.f184165g;
            if (strArr2.length <= 0 || strArr2.length != jArr.length) {
                StringBuilder sb3 = new StringBuilder();
                if (vector.isEmpty()) {
                    sb3.append(v.a.NO_ITEM_TO_PROCESS.f184192a);
                    String str = b0Var.D ? null : v.a.AUTO_UPLOAD_FALSE.f184192a;
                    if (!TextUtils.isEmpty(str)) {
                        sb3.append("; ");
                        sb3.append(str);
                    }
                    logger.warn("processRemoteDeviceFilesReady: ".concat(sb3.toString()));
                } else {
                    logger.debug("processRemoteDeviceFilesReady: ready for upload=" + vector + " (Count=" + vector.size() + "; " + b0Var.t() + " bytes)");
                }
                bVar2.j(wb2.b.a.LISTED, sb3.toString());
                b0Var.R(vector.size());
                b0Var.d0(null);
                return;
            }
            logger.debug("processRemoteDeviceFilesReady: fileIndices=" + Arrays.toString(strArr2) + "; fileSizes=" + Arrays.toString(jArr) + "; fileTypes=" + Arrays.toString(bArr3) + "; fileSubTypes=" + Arrays.toString(bArr2));
            ArrayList arrayList = new ArrayList();
            int i14 = -1;
            int i15 = 0;
            while (i15 < bArr3.length) {
                try {
                    if (bArr3[i15] == -128 && ((b14 = bArr2[i15]) == ad.MONITORING_B.f19675a || b14 == ad.SLEEP_DATA.f19675a)) {
                        i14 = i15;
                    }
                    i15++;
                    bArr3 = bArr;
                } catch (ServerException e4) {
                    logger.warn("processRemoteDeviceFilesReady: " + e4.getMessage());
                    b0Var.O(e4.failure, "upload", e4.getMessage(), null);
                    return;
                } catch (Exception e14) {
                    logger.error("processRemoteDeviceFilesReady: " + e14.getMessage(), (Throwable) e14);
                    b0Var.L(e14, "upload");
                    return;
                }
            }
            b0Var.A = b0Var.f183959x.b(b0Var.j());
            int i16 = 0;
            while (i16 < strArr2.length) {
                if (!TextUtils.isEmpty(strArr2[i16]) && jArr[i16] > 0) {
                    String strD = b0Var.f183960y.d(b0Var.l(), bArr2[i16]);
                    if (strD == null || !b0Var.A.contains(strD)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((int) bArr2[i16]);
                        sb4.append(":");
                        if (strD == null) {
                            strD = "UNKNOWN";
                        }
                        sb4.append(strD);
                        sb4.append(":");
                        short s8 = bArr2[i16];
                        ad[] adVarArrValues = ad.values();
                        int length = adVarArrValues.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                adVar = ad.INVALID;
                                break;
                            }
                            int i18 = length;
                            adVar = adVarArrValues[i17];
                            int i19 = i17;
                            if (s8 == adVar.f19675a) {
                                break;
                            }
                            i17 = i19 + 1;
                            length = i18;
                        }
                        sb4.append(adVar.name());
                        arrayList.add(sb4.toString());
                    } else {
                        String strE0 = b0Var.e0(strArr2[i16]);
                        if (!vector.contains(strE0)) {
                            b0Var.f184164f.put(strE0, new t0(strArr2[i16], jArr[i16], bArr[i16], bArr2[i16], false, i16 == i14));
                            vector.add(strE0);
                            b0Var.y(jArr[i16]);
                        }
                    }
                }
                i16++;
                strArr2 = strArr;
            }
            StringBuilder sb5 = new StringBuilder();
            if (vector.isEmpty()) {
                String str2 = v.a.NO_ITEM_TO_PROCESS.f184192a;
                String str3 = v.a.NO_SUPPORTED_ITEM_UPLOADABLE.f184192a;
                sb5.append(str2);
                sb5.append("; ");
                sb5.append(str3);
                if (!arrayList.isEmpty()) {
                    sb5.append("Skipped=");
                    sb5.append(arrayList);
                    logger.warn("******************** SYNC NON-FATAL FAILURE: Upload: Unrecognized file types ignored");
                }
                sb5.append("; Supported=");
                sb5.append(Arrays.toString(b0Var.C));
                sb5.append("; Uploadable=");
                sb5.append(b0Var.A);
                logger.warn("processRemoteDeviceFilesReady: " + sb5.toString());
            } else {
                if (arrayList.isEmpty()) {
                    sb5.append("Supported=");
                    sb5.append(Arrays.toString(b0Var.C));
                    sb5.append("; Uploadable=");
                    sb5.append(b0Var.A);
                    logger.info(sb5.toString());
                } else {
                    sb5.append("Skipped=");
                    sb5.append(arrayList);
                    sb5.append("; Supported=");
                    sb5.append(Arrays.toString(b0Var.C));
                    sb5.append("; Uploadable=");
                    sb5.append(b0Var.A);
                    logger.warn(sb5.toString());
                    logger.warn("******************** SYNC NON-FATAL FAILURE: Upload: Unrecognized file types ignored");
                }
                logger.debug("processRemoteDeviceFilesReady: ready for upload=" + vector + "; count=" + vector.size() + "; size=" + b0Var.t());
            }
            bVar2.j(wb2.b.a.LISTED, sb5.toString());
            b0Var.R(vector.size());
            b0Var.d0(null);
        }
    }

    public class b implements ea2.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ bc2.h f183963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f183964b;

        public b(bc2.h hVar, String str) {
            this.f183963a = hVar;
            this.f183964b = str;
        }

        public final void a() {
            b0 b0Var = b0.this;
            t0 t0VarH = b0Var.h();
            Logger logger = b0Var.f184159a;
            if (t0VarH == null) {
                logger.error("archive: Empty Transferable Item!");
                b0Var.L(new IllegalStateException("archive: Empty Transferable Item!"), "upload");
                return;
            }
            String str = t0VarH.f184151k;
            Vector<String> vector = b0Var.f184165g;
            ConcurrentHashMap<String, t0> concurrentHashMap = b0Var.f184164f;
            logger.info("file successfully archived on device: fileIndex=" + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strE0 = b0Var.e0(str);
            t0 t0Var = concurrentHashMap.get(strE0);
            vector.remove(strE0);
            concurrentHashMap.remove(strE0);
            b0Var.f183967w.i(wb2.b.a.ARCHIVED);
            logger.debug("notifyFileProcessingFinished: currentItem = " + t0Var);
            Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_FINISHED");
            String str2 = this.f183964b;
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("EXTRA_GC_SERVER_RESULT", str2);
            }
            bc2.h hVar = this.f183963a;
            if (hVar != null && hVar.e() > 0) {
                intent.putExtra("EXTRA_GC_SERVER_RESPONSE_CODE", hVar.e());
            }
            b0Var.b0(intent, t0Var);
            if (!vector.isEmpty()) {
                b0Var.Z();
            } else {
                b0Var.Q(v.c.SUCCESSFUL);
                b0Var.c0(null);
            }
        }
    }

    public b0(Context context, i0 i0Var, g0 g0Var) {
        super(context, "DeviceSyncUpload", g0Var);
        this.f183961z = -1;
        this.A = null;
        this.B = null;
        this.f183960y = i0Var == null ? g0Var : i0Var;
        this.f183959x = bc2.g.a(context);
        Y(context);
    }

    public static void Y(Context context) {
        File file = new File(context.getFilesDir(), "/uploads/guaranteed");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(context.getFilesDir(), "/uploads/regular");
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    @Override // wb2.v
    public final synchronized void A(DeviceProfile deviceProfile) {
        try {
            super.A(deviceProfile);
            this.A = null;
            this.B = null;
            this.f183967w.f("UPLOAD");
            this.E = ec2.e.f63800h;
            ea2.f fVar = (ea2.f) da2.d.c(this.f184161c).getCapability(deviceProfile.getMacAddress(), ea2.f.class);
            if (fVar != null) {
                this.C = fVar.getSupportedFitSubTypes();
            }
            if (((il2.e) ec2.e.b()).q()) {
                this.D = ((il2.e) ec2.e.b()).f94040b.d(deviceProfile);
            } else {
                this.D = false;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // wb2.v
    public final boolean E() {
        return this.f184164f.isEmpty();
    }

    @Override // wb2.c
    public final String W() {
        StringBuilder sb3 = new StringBuilder("\n#Auto Upload=");
        sb3.append(this.D);
        byte[] bArr = this.C;
        boolean z14 = bArr != null && bArr.length > 0;
        boolean z15 = this.A != null;
        if (z14 || z15) {
            sb3.append("\n#Types=");
            if (z14) {
                sb3.append(Arrays.toString(this.C));
            }
            sb3.append(" | ");
            if (z15) {
                sb3.append(this.A);
            }
        }
        return sb3.toString();
    }

    public final void X(String str, bc2.h hVar, String str2) {
        this.f183967w.i(wb2.b.a.ARCHIVING);
        this.f184159a.debug("archive: Archiving item ID=" + str);
        try {
            this.f183960y.c(l(), str, new b(hVar, str2));
        } catch (InvalidUnitIDException | RemoteGdiServiceDeadException e4) {
            L(e4, "upload");
        }
    }

    public final void Z() {
        ad adVar;
        if (!((il2.e) ec2.e.b()).p()) {
            String str = v.a.UNABLE_TO_COMPLETE_OPERATION.f184192a;
            String str2 = v.a.INVALID_USER_CREDENTIAL.f184192a;
            this.f184159a.error("USER SIGNED OUT?!?");
            O(h.INVALID_USER_CREDENTIAL, str, str2, null);
            return;
        }
        t0 t0VarH = h();
        Logger logger = this.f184159a;
        if (t0VarH == null) {
            logger.error("executeNextFile: Empty Transferable Item!");
            L(new IllegalStateException("executeNextFile: Empty Transferable Item!"), "upload");
            return;
        }
        logger.debug("notifyFileProcessingStarted: currentItem = " + t0VarH);
        b0(new Intent("com.garmin.android.lib.connectdevicesync.ACTION_FILE_PROCESSING_STARTED"), t0VarH);
        wb2.b bVar = this.f183967w;
        String str3 = t0VarH.f184151k;
        byte b14 = t0VarH.f184146f;
        byte b15 = t0VarH.f184147g;
        synchronized (bVar) {
            try {
                if (!TextUtils.isEmpty(str3)) {
                    bVar.f183935c = str3;
                }
                bVar.f183936d = b14;
                short s8 = b15;
                ad[] adVarArrValues = ad.values();
                int length = adVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        adVar = ad.INVALID;
                        break;
                    }
                    adVar = adVarArrValues[i14];
                    if (s8 == adVar.f19675a) {
                        break;
                    } else {
                        i14++;
                    }
                }
                String strName = adVar.name();
                if (strName == null) {
                    strName = Byte.toString(b15);
                }
                bVar.f183937e = strName;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f184159a.debug("executeNextFile: Start transferring item ID=" + t0VarH.f184151k);
        this.f183967w.i(wb2.b.a.EXTRACTING);
        DeviceProfile deviceProfileM = m();
        try {
            this.f183960y.b(l(), t0VarH.f184151k, new File(this.f184161c.getFilesDir(), (deviceProfileM == null || !deviceProfileM.getConfigurationFlags().contains(29)) ? "/uploads/guaranteed" : "/uploads/regular").getParent(), new c0(this));
        } catch (InvalidUnitIDException | RemoteGdiServiceDeadException e4) {
            L(e4, "upload");
        }
    }

    @Override // wb2.f0
    public final String a() {
        return "com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED";
    }

    public final void a0(long j8, String str) {
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_DEVICE_TRANSFER_PROGRESS");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FILE_NAME", str);
        }
        long jG = g();
        if (jG >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_SIZE", jG);
        }
        int iF = f();
        if (iF >= 0) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_COUNT", iF);
        }
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "notifyDeviceTransferProgress: FileName=", str, "; BytesTransferred=");
        j20.x.j(jG, "; CumulativeFileSize=", "; CumulativeFileCount=", sbJ);
        sbJ.append(iF);
        this.f184159a.debug(sbJ.toString());
        setChanged();
        notifyObservers(intent);
    }

    @Override // wb2.f0
    public final void b(Bundle bundle) {
        h hVar;
        boolean z14 = true;
        h hVar2 = null;
        if (!H() && !C()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 2);
        } else if (I()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 0);
            ServerProcessingTimeoutException serverProcessingTimeoutException = this.B;
            if (serverProcessingTimeoutException != null && (hVar = serverProcessingTimeoutException.failure) != null) {
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_EXECUTION_WARNING", hVar.name());
            }
        } else if (G()) {
            bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 0);
            bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_SUCCESS_REASON", v.a.NO_ITEM_TO_PROCESS.name());
        } else {
            if (D()) {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 1);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TYPE", q());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL", o());
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TRACE", p());
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_SOURCE", this.f184171m.get() != v.c.FAILED_SERVER_EXCEPTION ? 1 : 2);
                hVar2 = this.f184172n;
            } else {
                bundle.putInt("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_STATUS", 1);
                v.a aVar = v.a.ERROR_PRIOR_TO_EXECUTE;
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TYPE", aVar.name());
                String strO = o();
                if (v.a.NO_FAILURE_INFO_AVAILABLE.f184192a.equals(strO)) {
                    strO = aVar.f184192a;
                }
                if (!strO.startsWith("upload")) {
                    strO = "upload:".concat(strO);
                }
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_DETAIL", strO);
                bundle.putString("com.garmin.android.lib.connectdevicesync.EXTRA_UPLOAD_FAILURE_TRACE", p());
            }
            z14 = false;
        }
        v.J(bundle, z14, hVar2);
    }

    public final void b0(Intent intent, t0 t0Var) {
        if (t0Var != null) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
            intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
            intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
            intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_TYPE", t0Var.f184146f);
            intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_FILE_DATA_SUB_TYPE", t0Var.f184147g);
            setChanged();
            notifyObservers(intent);
        }
    }

    @Override // wb2.f0
    public final String c() {
        return "com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED";
    }

    public final void c0(String str) {
        V();
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_SPECIAL_CASE_RESPONSE_ERROR_CODE", this.f183961z);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON", str);
        }
        P(v.b.EXECUTED);
        StringBuilder sb3 = new StringBuilder("notifyUploadExecuted: failureReason=");
        sb3.append(!TextUtils.isEmpty(str) ? str : "none");
        sb3.append(", executionWarning=");
        ServerProcessingTimeoutException serverProcessingTimeoutException = this.B;
        sb3.append(serverProcessingTimeoutException != null ? serverProcessingTimeoutException : "none");
        h0.c(this.f184159a, sb3.toString(), v.B(str));
        setChanged();
        notifyObservers(intent);
    }

    public final void d0(String str) {
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED");
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
        StringBuilder sbW = v.h.w(iS, "notifyUploadPrepared: totalFileSize=", ", totalFileCount=", jT);
        sbW.append(", aFailureReason=");
        sbW.append(!TextUtils.isEmpty(str) ? str : "none");
        h0.c(this.f184159a, sbW.toString(), v.B(str));
        setChanged();
        notifyObservers(intent);
    }

    public final String e0(String str) {
        return "UL_" + j() + "_" + str;
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
                this.f184159a.debug("execute: Transferring the following files FROM remote device=" + this.f184165g.toString());
                Z();
            }
            this.f184159a.trace("execute: end");
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // wb2.f0
    public final synchronized void prepare() {
        t0 t0Var;
        this.f184159a.trace("prepare: begin");
        P(v.b.PREPARING);
        z();
        this.f184165g.clear();
        d();
        if (!((il2.e) ec2.e.b()).q()) {
            this.f184159a.debug("prepare: shouldUploadFiles = FALSE. Skipping Sync Upload.");
            R(0);
            d0(null);
            return;
        }
        boolean zIsEmpty = this.f184164f.isEmpty();
        Logger logger = this.f184159a;
        if (zIsEmpty) {
            logger.debug("prepare: No left-over item in the Work List from previous sync execution");
        } else {
            logger.debug("prepare: Work List is not empty. Processing files from Work List.");
            for (String str : this.f184164f.keySet()) {
                if (str != null && (t0Var = this.f184164f.get(str)) != null) {
                    this.f184159a.debug("prepare: Adding " + str + " to the Work List");
                    this.f184165g.add(str);
                    y(t0Var.f184145e);
                }
            }
        }
        this.f184159a.debug("prepare: Auto Upload Option Enabled=" + this.D);
        boolean z14 = this.D;
        Logger logger2 = this.f184159a;
        if (z14) {
            logger2.debug("prepare: Perform directory listing");
            this.f183967w.i(wb2.b.a.LISTING);
            try {
                this.f183960y.a(l(), this.C, new a());
            } catch (InvalidUnitIDException | RemoteGdiServiceDeadException e4) {
                L(e4, "upload");
            }
        } else {
            logger2.warn("prepare: Auto Upload option is set to FALSE for this device. No need to look for more uploadable items.");
            R(this.f184165g.size());
            d0(null);
        }
        this.f184159a.trace("prepare: end");
    }

    @Override // wb2.v
    public final void v() {
        Logger logger = this.f184159a;
        logger.debug("handlePostCancellation");
        U();
        Intent intent = new Intent("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_CANCELLED");
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", j());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", l());
        intent.putExtra("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_FULL_NAME", i());
        P(null);
        logger.debug("notifyUploadCancelled");
        setChanged();
        notifyObservers(intent);
    }

    @Override // wb2.v
    public final void w(String str) {
        String str2 = !TextUtils.isEmpty(str) ? str : v.a.NO_FAILURE_INFO_AVAILABLE.f184192a;
        h0.c(this.f184159a, fb1.c.n("handlePostException: Failure reason=", str2), v.B(str));
        if (this.f184163e.get() == v.b.PREPARING) {
            d0(str2);
        } else {
            c0(str2);
        }
    }
}
