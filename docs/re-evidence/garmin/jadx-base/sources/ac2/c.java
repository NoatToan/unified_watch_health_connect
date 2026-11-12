package ac2;

import android.text.TextUtils;
import ch.qos.logback.classic.Logger;
import com.garmin.device.datatypes.DeviceProfile;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n23.j;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceProfile f2701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f2704d;

    public c(d dVar, DeviceProfile deviceProfile, List list, long j8) {
        this.f2704d = dVar;
        this.f2701a = deviceProfile;
        this.f2702b = list;
        this.f2703c = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strValueOf = String.valueOf(this.f2701a.getF92746j());
        d dVar = this.f2704d;
        Logger logger = dVar.f2709e;
        long j8 = this.f2703c;
        logger.trace(j.d(j8, "deleteExpiredMessageFilesFromLocalStorage ", strValueOf, StringUtils.SPACE));
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        File[] fileArrListFiles = new File(d.d(dVar.f2705a)).listFiles();
        HashSet hashSet = new HashSet();
        List list = this.f2702b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(String.valueOf(((gy2.c) it.next()).d()));
            }
        }
        for (File file : fileArrListFiles) {
            try {
                logger.trace("deleteExpiredMessageFilesFromLocalStorage: found file: " + file.getName() + StringUtils.SPACE + file.length());
                if (file.getName().startsWith(strValueOf + "_")) {
                    String[] strArrSplit = file.getName().replace(".tmp", "").split("_");
                    if ((strArrSplit.length < 3 || hashSet.contains(strArrSplit[1])) ? false : d.e(j8, Byte.parseByte(strArrSplit[2], 16))) {
                        logger.info("Delete no longer queued file " + file.getName());
                        file.delete();
                    }
                }
            } catch (Exception e4) {
                logger.error("Failed to check/delete file " + file.getName(), (Throwable) e4);
            }
        }
    }
}
