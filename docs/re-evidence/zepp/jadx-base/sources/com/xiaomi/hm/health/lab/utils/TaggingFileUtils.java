package com.xiaomi.hm.health.lab.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.feedback.log.utils.ConstantsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.databases.model.SensorData;
import com.xiaomi.hm.health.databases.model.SensorDataDao;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.model.CommonSensorRecord;
import com.xiaomi.hm.health.lab.model.GSensorRecord;
import com.xiaomi.hm.health.lab.model.GyroSensorRecord;
import com.xiaomi.hm.health.lab.model.MagnRecord;
import com.xiaomi.hm.health.lab.model.NmeaRecord;
import com.xiaomi.hm.health.lab.model.PPGSensorRecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.lab.provider.OptionsItemProvider;
import com.xiaomi.hm.health.lab.utils.TaggingFileUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes21.dex */
public class TaggingFileUtils {
    public static final String STR_FORMAT = "utf-8";
    private static final String a = "TaggingFileUtils";
    private static int b = 524288;

    public static boolean archiveDir(String str, File file) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            h(zipOutputStream, new File(str));
            zipOutputStream.close();
            return true;
        } catch (IOException e) {
            HMLog.info(a, new Function0() { // from class: rk7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaggingFileUtils.n(e);
                }
            });
            return false;
        }
    }

    public static String createDeviceSwimmingLogFilePath(String str) {
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ConstantsKt.LOG_FILE_SUFFIX;
    }

    public static void deleteAllBehaviorData(BehaviorTagEnity behaviorTagEnity) {
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.LabActionId.eq(Long.valueOf(behaviorTagEnity.getLabActionId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        HMDaoManager.getInstance().getDaoSession().getSensorDataDao().queryBuilder().where(SensorDataDao.Properties.LabActionId.eq(Long.valueOf(behaviorTagEnity.getLabActionId())), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public static String getRealName(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    private static void h(ZipOutputStream zipOutputStream, final File file) {
        HMLog.info(a, new Function0() { // from class: pk7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaggingFileUtils.k(file);
            }
        });
        final File[] fileArrListFiles = file.listFiles();
        for (final int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isDirectory()) {
                h(zipOutputStream, fileArrListFiles[i]);
            } else if (!Pattern.compile(com.huami.feedback.util.ConstantsKt.APP_LOG_FILE_NAME_PATTEN).matcher(fileArrListFiles[i].getName()).matches()) {
                try {
                    HMLog.info(a, new Function0() { // from class: sk7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaggingFileUtils.l(fileArrListFiles, i);
                        }
                    });
                    byte[] bArr = new byte[1024];
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[i]);
                    zipOutputStream.putNextEntry(new ZipEntry(fileArrListFiles[i].getName()));
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i2);
                        }
                    }
                    zipOutputStream.closeEntry();
                    fileInputStream.close();
                } catch (IOException e) {
                    HMLog.info(a, new Function0() { // from class: qk7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaggingFileUtils.m(e);
                        }
                    });
                }
            }
        }
    }

    private static boolean i(ArrayList<File> arrayList) {
        boolean zDelete = true;
        for (File file : arrayList) {
            if (file != null && file.exists()) {
                zDelete &= file.delete();
            }
        }
        return zDelete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileWriter] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:27:0x0073). Please report as a decompilation issue!!! */
    private static void j(File file) throws Throwable {
        ?? r1 = 0;
        FileWriter fileWriter = null;
        r1 = 0;
        try {
            try {
                try {
                    String strR = r(file);
                    FileWriter fileWriter2 = new FileWriter(file);
                    try {
                        int temperatureDeviceOption = LabKeeper.getTemperatureDeviceOption();
                        int temperaturePartOption = LabKeeper.getTemperaturePartOption();
                        String str = OptionsItemProvider.buildDeviceKey().get(temperatureDeviceOption);
                        String str2 = OptionsItemProvider.buildPartsKey().get(temperatureDeviceOption).get(temperaturePartOption);
                        float temperatureOption = LabKeeper.getTemperatureOption();
                        fileWriter2.write(str + "," + str2 + "," + temperatureOption + "," + strR);
                        fileWriter2.flush();
                        fileWriter2.close();
                        r1 = temperatureOption;
                    } catch (Exception e) {
                        e = e;
                        fileWriter = fileWriter2;
                        e.printStackTrace();
                        r1 = fileWriter;
                        if (fileWriter != null) {
                            fileWriter.flush();
                            fileWriter.close();
                            r1 = fileWriter;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r1 = fileWriter2;
                        if (r1 != 0) {
                            try {
                                r1.flush();
                                r1.close();
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            r1 = r1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k(File file) {
        return "Adding directory: " + file.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l(File[] fileArr, int i) {
        return "Adding file: " + fileArr[i].getName();
    }

    public static void logOutByLabCommonSensor(List<CommonSensorRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        boolean zCreateNewFile;
        FileWriter fileWriter = null;
        try {
            try {
                if (behaviorTagEnity != null) {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity));
                        if (labPath != null) {
                            if (labPath.exists()) {
                                zCreateNewFile = false;
                            } else {
                                zCreateNewFile = labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            if (zCreateNewFile) {
                                try {
                                    fileWriter2.write("WristThermometer\r\n");
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = fileWriter2;
                                    e.printStackTrace();
                                    if (fileWriter == null) {
                                        return;
                                    }
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.flush();
                                            fileWriter.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            for (CommonSensorRecord commonSensorRecord : list) {
                                List<Number> data = commonSensorRecord.getData();
                                if (data != null) {
                                    Iterator<Number> it2 = data.iterator();
                                    while (it2.hasNext()) {
                                        fileWriter2.write(String.format(Locale.getDefault(), "%s,", it2.next()));
                                    }
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d\r\n", Long.valueOf(commonSensorRecord.getTimeStamp())));
                                }
                            }
                            fileWriter = fileWriter2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void logOutByLabGSensor(List<GSensorRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        boolean zCreateNewFile;
        FileWriter fileWriter = null;
        try {
            try {
                if (behaviorTagEnity != null) {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity));
                        if (labPath != null) {
                            if (labPath.exists()) {
                                zCreateNewFile = false;
                            } else {
                                zCreateNewFile = labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            if (zCreateNewFile) {
                                try {
                                    fileWriter2.write("x,y,z,t\r\n");
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = fileWriter2;
                                    e.printStackTrace();
                                    if (fileWriter == null) {
                                        return;
                                    }
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.flush();
                                            fileWriter.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            for (GSensorRecord gSensorRecord : list) {
                                if (gSensorRecord.getTimeStamp() != -1) {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,%d\r\n", Short.valueOf(gSensorRecord.getAccX()), Short.valueOf(gSensorRecord.getAccY()), Short.valueOf(gSensorRecord.getAccZ()), Long.valueOf(gSensorRecord.getTimeStamp())));
                                } else {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,\r\n", Short.valueOf(gSensorRecord.getAccX()), Short.valueOf(gSensorRecord.getAccY()), Short.valueOf(gSensorRecord.getAccZ())));
                                }
                            }
                            fileWriter = fileWriter2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void logOutByLabGeo(List<MagnRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        boolean zCreateNewFile;
        FileWriter fileWriter = null;
        try {
            try {
                if (behaviorTagEnity != null) {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity));
                        if (labPath != null) {
                            if (labPath.exists()) {
                                zCreateNewFile = false;
                            } else {
                                zCreateNewFile = labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            if (zCreateNewFile) {
                                try {
                                    fileWriter2.write("x,y,z,t\r\n");
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = fileWriter2;
                                    e.printStackTrace();
                                    if (fileWriter == null) {
                                        return;
                                    }
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.flush();
                                            fileWriter.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            for (MagnRecord magnRecord : list) {
                                if (magnRecord.getTimeStamp() != -1) {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,%d\r\n", Short.valueOf(magnRecord.getX()), Short.valueOf(magnRecord.getY()), Short.valueOf(magnRecord.getZ()), Long.valueOf(magnRecord.getTimeStamp())));
                                } else {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,\r\n", Short.valueOf(magnRecord.getX()), Short.valueOf(magnRecord.getY()), Short.valueOf(magnRecord.getZ())));
                                }
                            }
                            fileWriter = fileWriter2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void logOutByLabGyro(List<GyroSensorRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        boolean zCreateNewFile;
        FileWriter fileWriter = null;
        try {
            try {
                if (behaviorTagEnity != null) {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity));
                        if (labPath != null) {
                            if (labPath.exists()) {
                                zCreateNewFile = false;
                            } else {
                                zCreateNewFile = labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            if (zCreateNewFile) {
                                try {
                                    fileWriter2.write("x,y,z,t\r\n");
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = fileWriter2;
                                    e.printStackTrace();
                                    if (fileWriter == null) {
                                        return;
                                    }
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.flush();
                                            fileWriter.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            for (GyroSensorRecord gyroSensorRecord : list) {
                                if (gyroSensorRecord.getTimeStamp() != -1) {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,%d\r\n", Short.valueOf(gyroSensorRecord.getX()), Short.valueOf(gyroSensorRecord.getY()), Short.valueOf(gyroSensorRecord.getZ()), Long.valueOf(gyroSensorRecord.getTimeStamp())));
                                } else {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d,%d,\r\n", Short.valueOf(gyroSensorRecord.getX()), Short.valueOf(gyroSensorRecord.getY()), Short.valueOf(gyroSensorRecord.getZ())));
                                }
                            }
                            fileWriter = fileWriter2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void logOutByLabNmea(List<NmeaRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        FileWriter fileWriter = null;
        try {
            try {
                if (behaviorTagEnity != null) {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity, "txt"));
                        if (labPath != null) {
                            if (!labPath.exists()) {
                                labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            try {
                                Iterator<NmeaRecord> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    fileWriter2.write(it2.next().getLog());
                                }
                                fileWriter = fileWriter2;
                            } catch (Exception e) {
                                e = e;
                                fileWriter = fileWriter2;
                                e.printStackTrace();
                                if (fileWriter == null) {
                                    return;
                                }
                                fileWriter.flush();
                                fileWriter.close();
                            } catch (Throwable th) {
                                th = th;
                                fileWriter = fileWriter2;
                                if (fileWriter != null) {
                                    try {
                                        fileWriter.flush();
                                        fileWriter.close();
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void logOutByLabPPGSensor(List<PPGSensorRecord> list, BehaviorTagEnity behaviorTagEnity, SensorRecordsEnity sensorRecordsEnity) throws Throwable {
        boolean zCreateNewFile;
        FileWriter fileWriter = null;
        try {
            if (behaviorTagEnity != null) {
                try {
                    try {
                        File labPath = FileUtils.getLabPath(BehaviorTaggingTools.getTaggingFileName(behaviorTagEnity, sensorRecordsEnity));
                        if (labPath != null) {
                            if (labPath.exists()) {
                                zCreateNewFile = false;
                            } else {
                                zCreateNewFile = labPath.createNewFile();
                                saveSensorRecordsEnity(sensorRecordsEnity);
                            }
                            FileWriter fileWriter2 = new FileWriter(labPath, true);
                            if (zCreateNewFile) {
                                try {
                                    fileWriter2.write("PPG,t\r\n");
                                } catch (Exception e) {
                                    e = e;
                                    fileWriter = fileWriter2;
                                    e.printStackTrace();
                                    if (fileWriter == null) {
                                        return;
                                    }
                                    fileWriter.flush();
                                    fileWriter.close();
                                } catch (Throwable th) {
                                    th = th;
                                    fileWriter = fileWriter2;
                                    if (fileWriter != null) {
                                        try {
                                            fileWriter.flush();
                                            fileWriter.close();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            for (PPGSensorRecord pPGSensorRecord : list) {
                                if (pPGSensorRecord.getTimeStamp() != -1) {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,%d\r\n", Long.valueOf(pPGSensorRecord.getPpg()), Long.valueOf(pPGSensorRecord.getTimeStamp())));
                                } else {
                                    fileWriter2.write(String.format(Locale.getDefault(), "%d,\r\n", Long.valueOf(pPGSensorRecord.getPpg())));
                                }
                            }
                            fileWriter = fileWriter2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (fileWriter != null) {
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(IOException iOException) {
        return "IOException :" + iOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(IOException iOException) {
        return "Error creating zip file: " + iOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(long j) {
        return "tag offset:" + j;
    }

    public static long offset() {
        final long timeOffset = ((long) (LabKeeper.getTimeOffset() * 60 * 60)) * 1000;
        HMLog.info(a, new Function0() { // from class: mk7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaggingFileUtils.o(timeOffset);
            }
        });
        return timeOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(BehaviorTagEnity behaviorTagEnity) {
        return "labs saveLabAction:" + behaviorTagEnity.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(SensorRecordsEnity sensorRecordsEnity) {
        return "labs saveSensorRecordsEnity:" + sensorRecordsEnity.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[Catch: IOException -> 0x0060, TRY_LEAVE, TryCatch #3 {IOException -> 0x0060, blocks: (B:30:0x005c, B:34:0x0064), top: B:50:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0077 A[Catch: IOException -> 0x0073, TRY_LEAVE, TryCatch #1 {IOException -> 0x0073, blocks: (B:40:0x006f, B:44:0x0077), top: B:48:0x006f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.ByteArrayOutputStream] */
    private static String r(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        if (!file.exists()) {
            return "";
        }
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream((File) file), b);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[b];
                        while (true) {
                            int i = bufferedInputStream.read(bArr, 0, b);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        String str = new String(byteArrayOutputStream.toByteArray());
                        try {
                            bufferedInputStream.close();
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return str;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return "";
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return "";
                    }
                } catch (Exception e5) {
                    e = e5;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    file = 0;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                            if (file != 0) {
                                file.close();
                            }
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    } else if (file != 0) {
                        file.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            bufferedInputStream = null;
            e = e7;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            file = 0;
        }
    }

    public static LabAction saveLabAction(final BehaviorTagEnity behaviorTagEnity) {
        LabAction labAction = new LabAction();
        labAction.setLabActionId(Long.valueOf(behaviorTagEnity.getLabActionId()));
        labAction.setUserId(behaviorTagEnity.getUserId());
        labAction.setProductVersion(Integer.valueOf(behaviorTagEnity.getProductVersion()));
        labAction.setProtocolVersion(Integer.valueOf(behaviorTagEnity.getProtocolVersion()));
        labAction.setDeviceId(behaviorTagEnity.getDeviceId());
        HMDeviceSource hmDeviceSource = behaviorTagEnity.getHmDeviceSource();
        if (hmDeviceSource != null) {
            labAction.setDeviceSource(Integer.valueOf(hmDeviceSource.getValue()));
        }
        labAction.setBehaviorName(behaviorTagEnity.getBehaviorKey());
        labAction.setCustomizeBehaviorName(behaviorTagEnity.getCustomizeBehaviorName());
        labAction.setUploadStatus(-2);
        labAction.setTimeZone(Integer.valueOf(behaviorTagEnity.getTimeZone()));
        labAction.setStartBehaviorTime(Long.valueOf(behaviorTagEnity.getStartClickTime()));
        labAction.setEndBehaviorTime(Long.valueOf(behaviorTagEnity.getEndClickTime()));
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().insertOrReplaceInTx(labAction);
        HMLog.info(a, new Function0() { // from class: nk7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaggingFileUtils.p(behaviorTagEnity);
            }
        });
        return labAction;
    }

    public static SensorData saveSensorRecordsEnity(final SensorRecordsEnity sensorRecordsEnity) {
        SensorData sensorData = new SensorData();
        sensorData.setLabActionId(Long.valueOf(sensorRecordsEnity.getLabActionId()));
        sensorData.setSamplingRate(Integer.valueOf(sensorRecordsEnity.getSamplingRate()));
        sensorData.setStartTagTime(Long.valueOf(sensorRecordsEnity.getStartTaggingTime()));
        sensorData.setEndTagTime(Long.valueOf(sensorRecordsEnity.getEndTaggingTime()));
        sensorData.setFileName(sensorRecordsEnity.getFileName());
        sensorData.setSensorType(Integer.valueOf(sensorRecordsEnity.getSensorTypeIntVal()));
        sensorData.setResolution(sensorRecordsEnity.getResolution());
        HMDaoManager.getInstance().getDaoSession().getSensorDataDao().insertOrReplaceInTx(sensorData);
        HMLog.info(a, new Function0() { // from class: ok7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaggingFileUtils.q(sensorRecordsEnity);
            }
        });
        return sensorData;
    }

    public static void updateLabAction(LabAction labAction) {
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().update(labAction);
    }

    public static void updateSensorDataEndTagTime(SensorRecordsEnity sensorRecordsEnity) {
        LabAction labActionUnique = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.LabActionId.eq(Long.valueOf(sensorRecordsEnity.getLabActionId())), new WhereCondition[0]).unique();
        labActionUnique.setEndBehaviorTime(Long.valueOf(sensorRecordsEnity.getEndTaggingTime()));
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().update(labActionUnique);
        SensorData sensorDataUnique = HMDaoManager.getInstance().getDaoSession().getSensorDataDao().queryBuilder().where(SensorDataDao.Properties.LabActionId.eq(Long.valueOf(sensorRecordsEnity.getLabActionId())), SensorDataDao.Properties.StartTagTime.eq(Long.valueOf(sensorRecordsEnity.getStartTaggingTime()))).unique();
        sensorDataUnique.setEndTagTime(Long.valueOf(sensorRecordsEnity.getEndTaggingTime()));
        HMDaoManager.getInstance().getDaoSession().getSensorDataDao().update(sensorDataUnique);
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0112: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:52:0x0112 */
    public static File zipFileByBehavior(Context context, BehaviorTagEnity behaviorTagEnity) throws Throwable {
        Throwable th;
        File file;
        ArrayList<File> arrayList = new ArrayList();
        File file2 = null;
        try {
            try {
                List<SensorRecordsEnity> sensorRecordsEnityList = behaviorTagEnity.getSensorRecordsEnityList();
                if (sensorRecordsEnityList != null) {
                    for (int i = 0; i < sensorRecordsEnityList.size(); i++) {
                        SensorRecordsEnity sensorRecordsEnity = sensorRecordsEnityList.get(i);
                        File labPath = FileUtils.getLabPath(sensorRecordsEnity.getFileName());
                        if (labPath == null || !labPath.exists()) {
                            sensorRecordsEnityList.remove(i);
                        } else {
                            if (sensorRecordsEnity.getSensorTypeIntVal() == 7) {
                                j(labPath);
                            }
                            arrayList.add(labPath);
                        }
                    }
                    File labPath2 = FileUtils.getLabPath(String.format(Locale.getDefault(), "%s_%s_%s.zip", behaviorTagEnity.getUserId(), getRealName(behaviorTagEnity.getBehaviorKey(), behaviorTagEnity.getCustomizeBehaviorName()), Long.valueOf(behaviorTagEnity.getStartClickTime())));
                    if (labPath2 != null) {
                        try {
                            if (arrayList.size() > 0) {
                                ZipUtil.zipFiles(arrayList, labPath2);
                            }
                        } catch (IOException e) {
                            e = e;
                            e.printStackTrace();
                        }
                    }
                    file2 = labPath2;
                }
                if (file2 != null && file2.exists()) {
                    if (LabCallbackInit.getInitCallBack().keepNmeaLog() && BehaviorTaggingTools.NMEA.equals(behaviorTagEnity.getBehaviorKey())) {
                        for (File file3 : arrayList) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(behaviorTagEnity.getStartClickTime());
                            String str = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(calendar.getTime());
                            try {
                                File externalFilesDir = context.getExternalFilesDir("timex_data");
                                if (externalFilesDir != null) {
                                    FileUtils.copyFile(file3, new File(externalFilesDir.getAbsolutePath() + File.separator + "NMEA-" + str + ".txt"));
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    i(arrayList);
                }
            } catch (Throwable th2) {
                th = th2;
                file2 = file;
                th = th;
                if (file2 != null || !file2.exists()) {
                    throw th;
                }
                if (LabCallbackInit.getInitCallBack().keepNmeaLog() && BehaviorTaggingTools.NMEA.equals(behaviorTagEnity.getBehaviorKey())) {
                    for (File file4 : arrayList) {
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(behaviorTagEnity.getStartClickTime());
                        String str2 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(calendar2.getTime());
                        try {
                            File externalFilesDir2 = context.getExternalFilesDir("timex_data");
                            if (externalFilesDir2 != null) {
                                FileUtils.copyFile(file4, new File(externalFilesDir2.getAbsolutePath() + File.separator + "NMEA-" + str2 + ".txt"));
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                i(arrayList);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            th = th;
            if (file2 != null) {
                throw th;
            }
            throw th;
        }
        return file2;
    }

    public static File zipFileByLabAction(LabAction labAction) throws Throwable {
        File file;
        ArrayList arrayList = new ArrayList();
        File file2 = null;
        try {
            List<SensorData> list = HMDaoManager.getInstance().getDaoSession().getSensorDataDao().queryBuilder().where(SensorDataDao.Properties.LabActionId.eq(labAction.getLabActionId()), new WhereCondition[0]).build().list();
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    SensorData sensorData = list.get(i);
                    File labPath = FileUtils.getLabPath(sensorData.getFileName());
                    if (labPath == null || !labPath.exists()) {
                        list.remove(i);
                    } else {
                        if (sensorData.getSensorType().intValue() == 7) {
                            j(labPath);
                        }
                        arrayList.add(labPath);
                    }
                }
                File labPath2 = FileUtils.getLabPath(String.format(Locale.getDefault(), "%s_%s_%s.zip", labAction.getUserId(), getRealName(labAction.getBehaviorName(), labAction.getCustomizeBehaviorName()), labAction.getStartBehaviorTime()));
                if (labPath2 != null) {
                    try {
                        if (arrayList.size() > 0) {
                            ZipUtil.zipFiles(arrayList, labPath2);
                        }
                    } catch (IOException e) {
                        file = labPath2;
                        e = e;
                        try {
                            e.printStackTrace();
                        } catch (Throwable th) {
                            th = th;
                            file2 = file;
                            if (file2 != null && file2.exists()) {
                                i(arrayList);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        file2 = labPath2;
                        th = th2;
                        if (file2 != null) {
                            i(arrayList);
                        }
                        throw th;
                    }
                }
                file2 = labPath2;
            }
            if (file2 != null && file2.exists()) {
                i(arrayList);
            }
        } catch (IOException e2) {
            e = e2;
            file = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return file2;
    }
}
