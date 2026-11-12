package ac2;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import ds.e0;
import gy2.f;
import gy2.g;
import gy2.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Long, gy2.c> f2706b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2707c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2708d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f2709e;

    public d(Context context) {
        this.f2705a = context;
        int i14 = gt2.c.f79010a;
        this.f2709e = gt2.b.f79005a.i("SYNC#GcDownloadQueueAgent");
    }

    public static String b(long j8, long j14, g gVar) {
        return j8 + "_" + j14 + "_" + String.format("%02x", Integer.valueOf(gVar.f80324a)) + ".tmp";
    }

    public static String d(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + "/gcsync";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static boolean e(long j8, byte b14) {
        if (b14 >= 0) {
            long j14 = 1 << b14;
            if ((j8 & j14) == j14) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j8, wb2.g gVar) {
        gy2.c cVar = this.f2706b.get(Long.valueOf(j8));
        Logger logger = this.f2709e;
        if (cVar == null) {
            logger.debug("download: Error acknowledging " + j8 + ". Device message not found in the internal dictionary");
            return;
        }
        long jA = cVar.a();
        a aVar = new a();
        fc2.b bVarC = ec2.e.c();
        String str = gVar.f183996a;
        cc2.g gVar2 = (cc2.g) bVarC;
        str.getClass();
        ge1.b.T(gVar2.f26753b, null, null, new cc2.a(aVar, gVar2, jA, j8, str, null), 3);
        aVar.b();
        if (aVar.f()) {
            logger.error("Error sending [received] ACK message for message ID [ " + j8 + "].");
            return;
        }
        StringBuilder sbK = e0.k(j8, "acknowledge: Successfully ACKed message ID [", "] with action [");
        sbK.append(gVar.name());
        sbK.append("].");
        logger.info(sbK.toString());
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    public final ArrayList c(List list, long j8, boolean z14, String str, DeviceProfile deviceProfile) {
        gy2.c.b bVar;
        boolean z15;
        long j14;
        boolean zC;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder("Device supported download types: ");
        if (j8 > 0) {
            for (g gVar : g.values()) {
                if (e(j8, (byte) gVar.f80324a)) {
                    sb3.append(gVar.f80325b);
                    sb3.append("(");
                    sb3.append(gVar.f80324a);
                    sb3.append("), ");
                }
            }
        } else {
            sb3.append("NONE");
        }
        String string = sb3.toString();
        Logger logger = this.f2709e;
        logger.info(string);
        if (list != null && !list.isEmpty() && j8 >= 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gy2.c cVar = (gy2.c) it.next();
                if (cVar != null && cVar.f80290a != null && cVar.f80293d != null && ((bVar = cVar.f80296g) == gy2.c.b.NEW || bVar == gy2.c.b.UNKNOWN_STATUS)) {
                    if (j8 >= 0) {
                        boolean z16 = true;
                        if (str.equals("Force")) {
                            logger.warn("shouldBeDownloaded(): SoftwareUpdateMode is FORCE, aDownloadBitMask is overridden to mimic software only sync.");
                            j14 = 1 << g.SOFTWARE_UPDATE.f80324a;
                        } else {
                            j14 = j8;
                        }
                        g gVar2 = cVar.f80295f;
                        if (gVar2 != null) {
                            if (e(j14, (byte) gVar2.f80324a)) {
                                int connectionType = deviceProfile.getConnectionType();
                                h hVar = cVar.f80294e;
                                if ((hVar != null ? hVar.f80344r : null) != null) {
                                    if (!(hVar != null ? hVar.f80344r : null).isEmpty()) {
                                        h hVar2 = cVar.f80294e;
                                        ArrayList arrayList2 = hVar2 != null ? hVar2.f80344r : null;
                                        if (connectionType == 1) {
                                            if (arrayList2.contains("BLE")) {
                                                logger.debug("isFileAllowedForConnection: File is restricted over BLE");
                                            }
                                            z15 = false;
                                        } else if (connectionType == 2) {
                                        }
                                        if (arrayList2.contains("BTC")) {
                                            logger.debug("isFileAllowedForConnection: File is restricted over BTC");
                                            z15 = false;
                                        }
                                    }
                                }
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15 && gVar2 == g.SOFTWARE_UPDATE) {
                                if (str.equals("Block")) {
                                    logger.warn("shouldBeDownloaded(): SoftwareUpdateMode is BLOCK, this update will NOT be downloaded.");
                                } else {
                                    f fVar = this.f2707c.f2710a;
                                    String strG = cVar.g();
                                    if (strG != null && strG.length() != 0) {
                                        z16 = false;
                                    }
                                    String strTrim = !z16 ? cVar.g().trim() : null;
                                    String strTrim2 = cVar.h() ? cVar.b().trim() : null;
                                    fVar.getClass();
                                    String strA = f.a(strTrim, strTrim2);
                                    if (TextUtils.isEmpty(strA)) {
                                        zC = false;
                                    } else {
                                        strA.getClass();
                                        zC = fVar.c(0, strA);
                                    }
                                    if (!zC) {
                                        logger.warn("shouldBeDownloaded(): invalid message [" + cVar.d() + "]. This update will NOT be downloaded!");
                                    }
                                }
                                z15 = false;
                            }
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        arrayList.add(cVar);
                        if (cVar.f80295f == g.SOFTWARE_UPDATE) {
                            logger.debug("filterDownloadList: Found SOFTWARE_UPDATE");
                            if (!z14) {
                                logger.debug("filterDownloadList: shouldContinueSyncAfterSoftwareUpdate()=false. vivofit!");
                                break;
                            }
                            logger.debug("filterDownloadList: shouldContinueSyncAfterSoftwareUpdate()=true. vivosmart!");
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return arrayList;
    }

    public final void f(String str, List list) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(": ");
        if (list == null || list.isEmpty()) {
            sb3.append("No item\n");
        } else {
            sb3.append("\n");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gy2.c cVar = (gy2.c) it.next();
                sb3.append("  ");
                sb3.append(cVar.d());
                sb3.append(StringUtils.SPACE);
                sb3.append(cVar.f80295f);
                String strE = cVar.e();
                if (!(strE == null || strE.length() == 0)) {
                    sb3.append(StringUtils.SPACE);
                    sb3.append(cVar.e());
                }
                if (cVar.h()) {
                    sb3.append(StringUtils.SPACE);
                    sb3.append(cVar.b());
                }
                h hVar = cVar.f80294e;
                if (hVar != null && hVar.f80330d != null) {
                    sb3.append(" (");
                    sb3.append(cVar.c());
                    sb3.append(" bytes)");
                }
                if (cVar.f80296g != null) {
                    sb3.append(" [");
                    sb3.append(cVar.f80296g);
                    sb3.append("]");
                }
                sb3.append("\n");
            }
        }
        this.f2709e.info(sb3.toString());
    }
}
