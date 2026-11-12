package wb2;

import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.lib.connectdevicesync.exception.ServerProcessingTimeoutException;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class c0 implements ea2.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f183968a;

    public c0(b0 b0Var) {
        this.f183968a = b0Var;
    }

    @Override // ea2.f.c
    public final void a(long j8, String str) {
        long j14;
        b0 b0Var = this.f183968a;
        int i14 = b0.F;
        b0Var.f184159a.debug(n23.j.d(j8, "processFileDownloadProgress: fileIndex=", str, "; bytesTransferred="));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t0 t0Var = b0Var.f184164f.get(b0Var.e0(str));
        if (t0Var != null) {
            synchronized (b0Var) {
                j14 = b0Var.f184168j;
            }
            long j15 = j14 + j8;
            synchronized (b0Var) {
                b0Var.f184167i = j15;
            }
            b0Var.a0(j8, t0Var.f184144d);
        }
    }

    @Override // ea2.f.c
    public final void b(File file, String str) {
        long j8;
        hc2.a aVarE;
        String parent = file.getParent();
        String name = file.getName();
        long length = file.length();
        b0 b0Var = this.f183968a;
        bc2.g gVar = b0Var.f183959x;
        b bVar = b0Var.f183967w;
        Logger logger = b0Var.f184159a;
        StringBuilder sbI = p6.b.i("processFileDownloadComplete: fileIndex=", str, "; aFileDir=", parent, "; aFileName=");
        sbI.append(name);
        sbI.append("; aFileSize=");
        sbI.append(length);
        logger.debug(sbI.toString());
        if (TextUtils.isEmpty(str) || length <= 0 || TextUtils.isEmpty(parent) || TextUtils.isEmpty(name)) {
            logger.error("processFileDownloadComplete: Item ID, file size, file dir, or file name is invalid");
            b0Var.L(new IllegalStateException("Unable to download file: Item ID, file size, file dir, or file name is invalid"), "upload");
            return;
        }
        synchronized (bVar) {
            bVar.f183940h = length;
        }
        bVar.i(b.a.EXTRACTED);
        synchronized (b0Var) {
            j8 = b0Var.f184168j;
        }
        long j14 = j8 + length;
        synchronized (b0Var) {
            b0Var.f184168j = j14;
        }
        synchronized (b0Var) {
            b0Var.f184167i = j14;
        }
        synchronized (b0Var) {
            b0Var.f184170l++;
        }
        b0Var.a0(length, name);
        t0 t0Var = b0Var.f184164f.get(b0Var.e0(str));
        if (t0Var == null) {
            logger.warn("processFileDownloadComplete: Unrecognized transfer activity for item ID=" + str);
            return;
        }
        t0Var.f184143c = parent;
        t0Var.f184144d = name;
        t0Var.f184145e = length;
        logger.info(t0Var.toString());
        bVar.i(b.a.POSTING);
        File file2 = new File(parent, name);
        bc2.a aVar = b0Var.E;
        File file3 = (aVar == null || (aVarE = aVar.e(parent, name, b0Var.m(), t0Var)) == null) ? file2 : aVarE;
        bc2.h hVar = new bc2.h();
        bc2.g.a aVarE2 = ((il2.e) ec2.e.b()).f94040b.e(t0Var);
        DeviceProfile deviceProfileM = b0Var.m();
        bc2.g.a aVar2 = (deviceProfileM != null && deviceProfileM.getConfigurationFlags().contains(29) && (aVarE2 == bc2.g.a.DEFAULT || aVarE2 == bc2.g.a.IMMEDIATE)) ? bc2.g.a.IMMEDIATE : bc2.g.a.GUARANTEED;
        bc2.g.a aVar3 = bc2.g.a.IMMEDIATE;
        bc2.g gVar2 = b0Var.f183959x;
        if (aVar2 == aVar3) {
            try {
                hVar = gVar2.c(b0Var.j(), file3, t0Var, aVar3, b0Var.f184162d);
                bVar.i(b.a.POSTED);
                bVar.g(hVar);
                gVar.getClass();
                b0Var.X(str, hVar, hVar.d());
            } catch (ServerProcessingTimeoutException e4) {
                b0Var.B = e4;
                bVar.i(b.a.POSTED_AWAITING_PROCESSING);
                bVar.g(hVar);
                gVar.getClass();
                b0Var.X(str, hVar, hVar.d());
            } catch (ServerException e14) {
                b0Var.O(e14.failure, "upload", e14.getMessage(), null);
            } catch (Exception e15) {
                b0Var.L(e15, "upload");
            }
        } else {
            try {
                hVar = gVar2.c(b0Var.j(), file3, t0Var, bc2.g.a.GUARANTEED, b0Var.f184162d);
                bVar.i(b.a.POSTED);
                bVar.g(hVar);
            } catch (ServerProcessingTimeoutException e16) {
                b0Var.B = e16;
                bVar.i(b.a.POSTED_AWAITING_PROCESSING);
                bVar.g(hVar);
            } catch (Exception unused) {
            }
            gVar.getClass();
            b0Var.X(str, hVar, hVar.d());
        }
        gVar.getClass();
        int iE = hVar.e();
        if (iE == 400 || iE == 406 || iE == 409 || iE == 413 || iE == 415 || iE == 419 || iE == 412) {
            b0Var.f183961z = hVar.e();
        }
    }

    @Override // ea2.f.c
    public final void c(String str, String str2) {
        b0 b0Var = this.f183968a;
        b0Var.getClass();
        b0Var.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, h.REMOTE_DEVICE_EXCEPTION, str2, "Failed to read file from device", null);
        b0Var.w(str2);
    }
}
