package com.xiaomi.wearable.gpsalgorithm.utils;

import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessAlgoCsvUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessAlgoCsvUtils {
    public static final String SPLIT = ",";
    private static final String TAG = "FitnessAlgoCsvUtils";
    private static ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

    private static String getLocationColumnName(Location location) {
        boolean z = location == null;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "time" : Long.valueOf(location.timeStamp));
        sb.append(",");
        sb.append(z ? "longitude" : Double.valueOf(location.longitude));
        sb.append(",");
        sb.append(z ? "latitude" : Double.valueOf(location.latitude));
        sb.append(",");
        sb.append(z ? "kilometer" : Integer.valueOf(location.kilometer));
        sb.append(",");
        sb.append(z ? "flagSegment" : Boolean.valueOf(location.flagSegment));
        sb.append(",");
        sb.append(z ? "speed" : Float.valueOf(location.speed));
        sb.append(",");
        sb.append(z ? "speed_acc" : Float.valueOf(location.speedAccuracy));
        sb.append(",");
        sb.append(z ? "horizontal_acc" : Float.valueOf(location.horizontalAccuracy));
        sb.append(",");
        sb.append(z ? "pace" : Integer.valueOf(location.pace));
        sb.append(",");
        sb.append(z ? "total_distance" : Double.valueOf(location.total_distance));
        sb.append(",");
        sb.append("\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$writeTgcOriginData$1(File file, byte[] bArr) throws Exception {
        return Boolean.valueOf(FitnessFileUtils.writeFile(file, bArr));
    }

    public static boolean writeCSV(String str, String str2, boolean z) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str), z);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            FitnessLogUtils.e(TAG, "writeCSV " + e.getMessage());
            return false;
        } catch (IOException e2) {
            FitnessLogUtils.e(TAG, "writeCSV" + e2.getMessage());
            return false;
        }
    }

    public static void writeLocationListCSV(List<Location> list, final String str) {
        if (list == null || list.size() == 0) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        singleExecutor.submit(new Runnable() { // from class: no9
            @Override // java.lang.Runnable
            public final void run() {
                FitnessAlgoCsvUtils.writeLocationListCSV2(arrayList, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeLocationListCSV2(List<Location> list, String str) {
        File file = new File(AppUtil.getApp().getExternalFilesDir(null), "/fitness/csv/sport/gpsAlgo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            file2.delete();
        }
        if (writeCSV(file2.getPath(), getLocationColumnName(null), false)) {
            Iterator<Location> it = list.iterator();
            while (it.hasNext()) {
                writeCSV(file2.getPath(), getLocationColumnName(it.next()), true);
            }
        }
    }

    public static void writeTgcOriginData(final File file, final byte[] bArr) {
        singleExecutor.submit(new Callable() { // from class: mo9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FitnessAlgoCsvUtils.lambda$writeTgcOriginData$1(file, bArr);
            }
        });
    }
}
