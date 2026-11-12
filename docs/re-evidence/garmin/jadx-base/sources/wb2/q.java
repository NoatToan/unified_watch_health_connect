package wb2;

import android.content.Context;
import ch.qos.logback.classic.Logger;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.gfdi.file.FileException;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class q implements SyncDownloadCapability.ResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f184084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f184085b;

    public q(p pVar, t0 t0Var) {
        this.f184085b = pVar;
        this.f184084a = t0Var;
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void a(String str) {
        long j8;
        p pVar = this.f184085b;
        Logger logger = pVar.f184159a;
        StringBuilder sb3 = new StringBuilder("onFileSaved: item.filePath=");
        t0 t0Var = this.f184084a;
        sb3.append(t0Var.f184143c);
        sb3.append("; item.fileName=");
        sb3.append(t0Var.f184144d);
        logger.debug(sb3.toString());
        pVar.f183967w.i(b.a.SAVED);
        long j14 = t0Var.f184145e;
        if (t0Var.f184153m) {
            j14 = 100;
        }
        synchronized (pVar) {
            j8 = pVar.f184168j;
        }
        long j15 = j8 + j14;
        synchronized (pVar) {
            pVar.f184168j = j15;
        }
        synchronized (pVar) {
            pVar.f184167i = j15;
        }
        synchronized (pVar) {
            pVar.f184170l++;
        }
        p.X(pVar, t0Var.f184144d, t0Var.f184145e);
        if (t0Var.a()) {
            pVar.C = false;
            pVar.D = 0;
        }
        long j16 = t0Var.f184152l;
        b bVar = pVar.f183967w;
        bVar.i(b.a.ACKNOWLEDGING);
        ac2.d dVar = pVar.f184072x;
        dVar.getClass();
        dVar.a(j16, g.RECEIVED);
        bVar.i(b.a.ACKED);
        pVar.f0(j16);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void b(long j8, String str) {
        long j14;
        long j15;
        p pVar = this.f184085b;
        Logger logger = pVar.f184159a;
        StringBuilder sb3 = new StringBuilder("onFileSaveProgress: item.fileName=");
        t0 t0Var = this.f184084a;
        sb3.append(t0Var.f184144d);
        sb3.append("; bytesTransferred=");
        sb3.append(j8);
        logger.debug(sb3.toString());
        if (t0Var.f184153m) {
            j14 = (long) (((j8 * 1.0f) / t0Var.f184145e) * 100.0f);
            Logger logger2 = pVar.f184159a;
            StringBuilder sbK = ds.e0.k(j8, "onFileSaveProgress: adjusted bytesTransferred from ", " to ");
            sbK.append(j14);
            logger2.debug(sbK.toString());
        } else {
            j14 = j8;
        }
        synchronized (pVar) {
            j15 = pVar.f184168j;
        }
        long j16 = j15 + j14;
        synchronized (pVar) {
            pVar.f184167i = j16;
        }
        p.X(pVar, t0Var.f184144d, j8);
    }

    @Override // com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability.ResultListener
    public final void c(String str, FileException fileException) {
        i iVar;
        String string;
        p pVar = this.f184085b;
        pVar.f184159a.error(fileException.getMessage());
        int i14 = p.T;
        switch (p.c.f184077a[fileException.getReason().ordinal()]) {
            case 1:
                iVar = i.REMOTE_DEVICE_NOT_ENOUGH_SPACE;
                break;
            case 2:
                iVar = i.REMOTE_DEVICE_NOT_ENOUGH_SPACE_FOR_FILE_TYPE;
                break;
            case 3:
                iVar = i.REMOTE_DEVICE_NO_SLOTS_FOR_FILE_TYPE;
                break;
            case 4:
                iVar = i.REMOTE_DEVICE_CRC_ERROR;
                break;
            case 5:
                iVar = i.FILE_NOT_FOUND;
                break;
            case 6:
                iVar = i.CAN_NOT_READ_FROM_FILE;
                break;
            case 7:
                iVar = i.REMOTE_DEVICE_CAN_NOT_WRITE_TO_FILE;
                break;
            case 8:
                iVar = i.REMOTE_DEVICE_ABORT_FILE_TRANSFER;
                break;
            case 9:
                iVar = i.REMOTE_DEVICE_NOT_READY;
                break;
            case 10:
                iVar = i.REMOTE_DEVICE_INVALID_REQUEST;
                break;
            default:
                iVar = i.DEFAULT_FAILURE;
                break;
        }
        t0 t0Var = this.f184084a;
        byte b14 = t0Var.f184147g;
        long j8 = t0Var.f184152l;
        String str2 = t0Var.f184155o;
        gy2.g gVar = gy2.g.INSTALL_APP;
        if (b14 == gVar.f80324a && (iVar == i.REMOTE_DEVICE_NO_SLOTS_FOR_FILE_TYPE || iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE_FOR_FILE_TYPE || iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE)) {
            pVar.B = p.d.a(iVar, t0Var.f184154n, str2);
            pVar.j();
            Context context = pVar.f184161c;
            gc2.a aVar = ec2.e.f63799g;
            if (aVar != null) {
                aVar.a(1, context);
            }
            string = "Not enough space for CIQ item";
        } else if (b14 == gy2.g.COURSES.f80324a && (iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE_FOR_FILE_TYPE || iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE)) {
            pVar.j();
            Context context2 = pVar.f184161c;
            gc2.a aVar2 = ec2.e.f63799g;
            if (aVar2 != null) {
                aVar2.a(2, context2);
            }
            string = "Not enough space for courses";
        } else if (b14 == gy2.g.WORKOUTS.f80324a && (iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE_FOR_FILE_TYPE || iVar == i.REMOTE_DEVICE_NOT_ENOUGH_SPACE)) {
            pVar.j();
            Context context3 = pVar.f184161c;
            gc2.a aVar3 = ec2.e.f63799g;
            if (aVar3 != null) {
                aVar3.a(3, context3);
            }
            string = "Not enough space for workouts";
        } else if (t0Var.a()) {
            pVar.C = false;
            pVar.D = 1;
            string = "Error sending software update file to device: " + iVar.name();
        } else {
            StringBuilder sb3 = new StringBuilder("Error sending file to device");
            if (iVar != null) {
                sb3.append(": ");
                sb3.append(iVar.name());
            }
            string = sb3.toString();
        }
        if ((t0Var.f184147g != gVar.f80324a || pVar.B.f184078a == null) && EnumSet.of(FileException.a.NOT_ENOUGH_SPACE, FileException.a.NOT_SUPPORTED, FileException.a.NO_SLOTS_FOR_TYPE, FileException.a.NOT_ENOUGH_SPACE_FOR_FILE_TYPE, FileException.a.FILE_INDEX_DOES_NOT_EXIST, FileException.a.FILE_INDEX_NOT_WRITABLE).contains(fileException.getReason())) {
            pVar.f184072x.a(j8, g.ERROR);
            pVar.f183967w.i(b.a.ACKED);
        }
        String message = fileException.getMessage() != null ? fileException.getMessage() : string;
        if (t0Var.a()) {
            h hVar = h.SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED;
            if (iVar == i.REMOTE_DEVICE_ABORT_FILE_TRANSFER) {
                hVar = h.SOFTWARE_UPDATE_FILE_DOWNLOAD_CANCELLED;
            }
            String str3 = string;
            pVar.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, hVar, str3, message, null);
            pVar.w(str3);
            return;
        }
        List<gy2.g> list = pVar.A;
        if (list == null || list.contains(t0Var.f184149i)) {
            String str4 = string;
            pVar.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, h.REMOTE_DEVICE_EXCEPTION, str4, message, null);
            pVar.w(str4);
            return;
        }
        p.Y(pVar, message);
        Logger logger = pVar.f184159a;
        StringBuilder sbI = p6.b.i("******************** SYNC NON-FATAL FAILURE: Download: Failed transfer to device for ", str2, " error:", string, " detail:");
        sbI.append(message);
        logger.warn(sbI.toString());
        pVar.f184177t.e(v.e(string, message), null);
        pVar.f0(j8);
    }
}
