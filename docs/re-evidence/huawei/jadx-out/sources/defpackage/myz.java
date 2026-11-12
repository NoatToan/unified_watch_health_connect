package defpackage;

import com.huawei.datatype.PeriodRriEntity;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myz {
    public static PeriodRriEntity d(FileInputStream fileInputStream) {
        PeriodRriEntity periodRriEntity = null;
        if (fileInputStream == null) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "inputStream is null");
            return null;
        }
        try {
            try {
                LogUtil.a("ParsePeriodRriFileUtil", "parse file Header.");
                PeriodRriEntity periodRriEntity2 = new PeriodRriEntity();
                try {
                    byte[] bArr = new byte[48];
                    if (fileInputStream.read(bArr) == -1) {
                        ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "isReadHeader is -1");
                        try {
                            fileInputStream.close();
                            return periodRriEntity2;
                        } catch (IOException unused) {
                            LogUtil.e("ParsePeriodRriFileUtil", "IOException");
                            return periodRriEntity2;
                        }
                    }
                    int iC = c(bArr, periodRriEntity2);
                    int iFetchVersion = periodRriEntity2.fetchVersion();
                    if (iFetchVersion == 0 || iFetchVersion == 1 || iFetchVersion == 2) {
                        a(bArr, iC, periodRriEntity2);
                        a(fileInputStream, periodRriEntity2);
                        a(periodRriEntity2.fetchRriDataList());
                    } else if (iFetchVersion != 3) {
                        LogUtil.j("ParsePeriodRriFileUtil", "no support version.");
                    } else {
                        e(bArr, iC, periodRriEntity2);
                        d(fileInputStream, periodRriEntity2);
                        c(periodRriEntity2.fetchPressDataList());
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                        LogUtil.e("ParsePeriodRriFileUtil", "IOException");
                    }
                    LogUtil.a("ParsePeriodRriFileUtil", "Period_RRI parse end,entity is:", periodRriEntity2.toString());
                    return periodRriEntity2;
                } catch (FileNotFoundException unused3) {
                    periodRriEntity = periodRriEntity2;
                    ReleaseLogUtil.a("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "FileNotFoundException");
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                        LogUtil.e("ParsePeriodRriFileUtil", "IOException");
                    }
                    periodRriEntity2 = periodRriEntity;
                } catch (IOException unused5) {
                    periodRriEntity = periodRriEntity2;
                    ReleaseLogUtil.a("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "IOException");
                    try {
                        fileInputStream.close();
                    } catch (IOException unused6) {
                        LogUtil.e("ParsePeriodRriFileUtil", "IOException");
                    }
                    periodRriEntity2 = periodRriEntity;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (IOException unused7) {
                    LogUtil.e("ParsePeriodRriFileUtil", "IOException");
                }
                throw th;
            }
        } catch (FileNotFoundException unused8) {
        } catch (IOException unused9) {
        }
    }

    private static int c(byte[] bArr, PeriodRriEntity periodRriEntity) {
        LogUtil.a("ParsePeriodRriFileUtil", "parse RRI header file com");
        if (bArr == null || bArr.length != 48) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "header is error argument");
            return -1;
        }
        LogUtil.a("ParsePeriodRriFileUtil", "header :", eeq.e(bArr));
        int iE = e(64);
        periodRriEntity.configFileSize(e(b(bArr, 0, iE)));
        int iE2 = e(16) + iE;
        String strB = b(bArr, iE, iE2);
        LogUtil.a("ParsePeriodRriFileUtil", "bitmap :", strB);
        periodRriEntity.configBitmap((int) e(strB));
        int iE3 = e(16) + iE2;
        periodRriEntity.configVersion((int) e(b(bArr, iE2, iE3)));
        return iE3;
    }

    private static void e(byte[] bArr, int i, PeriodRriEntity periodRriEntity) {
        periodRriEntity.configHeaderReserved(b(bArr, i, i + 36));
    }

    private static void a(byte[] bArr, int i, PeriodRriEntity periodRriEntity) {
        int i2 = i + 1;
        periodRriEntity.configSize((int) e(b(bArr, i, i2)));
        periodRriEntity.configRriDataList(new ArrayList(0));
        periodRriEntity.configHeaderReserved(b(bArr, i2, i + 36));
    }

    private static void a(FileInputStream fileInputStream, PeriodRriEntity periodRriEntity) throws IOException {
        byte[] bArr = new byte[(periodRriEntity.fetchSize() * 3) + 6];
        while (fileInputStream.read(bArr) != -1) {
            b(bArr, periodRriEntity);
        }
    }

    private static void b(byte[] bArr, PeriodRriEntity periodRriEntity) {
        PeriodRriEntity.RriDataEntity rriDataEntity = new PeriodRriEntity.RriDataEntity();
        int i = 0;
        int i2 = 4;
        String strB = b(bArr, 0, 4);
        if (e(strB) == 0) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "remove startTime is 0");
            return;
        }
        rriDataEntity.configStartTime(e(strB));
        int iFetchSize = periodRriEntity.fetchSize();
        rriDataEntity.configRriList(new ArrayList(iFetchSize));
        int i3 = 0;
        while (i3 < iFetchSize) {
            int i4 = i2 + 2;
            rriDataEntity.addRri((int) e(b(bArr, i2, i4)));
            i3++;
            i2 = i4;
        }
        rriDataEntity.configSqiList(new ArrayList(iFetchSize));
        while (i < iFetchSize) {
            int i5 = i2 + 1;
            rriDataEntity.addSqi((int) e(b(bArr, i2, i5)));
            i++;
            i2 = i5;
        }
        int i6 = i2 + 1;
        rriDataEntity.configIntensity((int) e(b(bArr, i2, i6)));
        rriDataEntity.configReserved(b(bArr, i6, i2 + 2));
        periodRriEntity.fetchRriDataList().add(rriDataEntity);
    }

    private static void d(FileInputStream fileInputStream, PeriodRriEntity periodRriEntity) throws IOException {
        byte[] bArr = new byte[66];
        periodRriEntity.configPressDataList(new ArrayList(0));
        while (fileInputStream.read(bArr) != -1) {
            d(bArr, periodRriEntity);
        }
    }

    private static void d(byte[] bArr, PeriodRriEntity periodRriEntity) {
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        String strB = b(bArr, 0, 4);
        if (e(strB) == 0) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "remove startTime is 0");
            return;
        }
        hiStressMetaData.configStressStartTime(e(strB));
        String strB2 = b(bArr, 4, 8);
        if (e(strB2) == 0) {
            ReleaseLogUtil.e("BTSYNC_PeriodRri_ParsePeriodRriFileUtil", "remove endTime is 0");
            return;
        }
        hiStressMetaData.configStressEndTime(e(strB2));
        hiStressMetaData.configStressAlgorithmVer((int) e(b(bArr, 8, 12)));
        hiStressMetaData.configStressScore((int) e(b(bArr, 12, 13)));
        hiStressMetaData.configStressGrade((int) e(b(bArr, 13, 14)));
        hiStressMetaData.configStressCalibFlag((int) e(b(bArr, 14, 15)));
        e(bArr, hiStressMetaData, 15);
        periodRriEntity.fetchPressDataList().add(hiStressMetaData);
    }

    private static void e(byte[] bArr, HiStressMetaData hiStressMetaData, int i) {
        int i2 = i + 1;
        hiStressMetaData.configStressMeasureType((int) e(b(bArr, i, i2)));
        int i3 = i + 2;
        hiStressMetaData.configStressAccFlag((int) e(b(bArr, i2, i3)));
        int i4 = i + 3;
        hiStressMetaData.configStressPpgFlag((int) e(b(bArr, i3, i4)));
        int i5 = 0;
        ArrayList arrayList = new ArrayList(0);
        while (i5 < 12) {
            int i6 = i4 + 4;
            arrayList.add(Float.valueOf(eeq.h(b(bArr, i4, i6))));
            i5++;
            i4 = i6;
        }
        hiStressMetaData.configStressFeature(arrayList);
    }

    private static String b(byte[] bArr, int i, int i2) {
        if (bArr == null || i > i2) {
            LogUtil.j("ParsePeriodRriFileUtil", "byteToString bytes is null");
            return "";
        }
        byte[] bArr2 = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr2[i3] = bArr[i];
            i++;
            i3++;
        }
        return eeq.e(bArr2);
    }

    private static int e(int i) {
        if (i >= 0) {
            return i >> 3;
        }
        throw new IllegalArgumentException("error argument");
    }

    private static void a(List<PeriodRriEntity.RriDataEntity> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(list, new Comparator<PeriodRriEntity.RriDataEntity>() { // from class: myz.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(PeriodRriEntity.RriDataEntity rriDataEntity, PeriodRriEntity.RriDataEntity rriDataEntity2) {
                if (rriDataEntity == null || rriDataEntity2 == null) {
                    LogUtil.j("ParsePeriodRriFileUtil", "sortRriData is null");
                    return 0;
                }
                return Long.compare(rriDataEntity.fetchStartTime(), rriDataEntity2.fetchStartTime());
            }
        });
    }

    private static void c(List<HiStressMetaData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(list, new Comparator<HiStressMetaData>() { // from class: myz.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(HiStressMetaData hiStressMetaData, HiStressMetaData hiStressMetaData2) {
                if (hiStressMetaData == null || hiStressMetaData2 == null) {
                    LogUtil.j("ParsePeriodRriFileUtil", "sortPressData is null");
                    return 0;
                }
                return Long.compare(hiStressMetaData.fetchStressEndTime(), hiStressMetaData2.fetchStressEndTime());
            }
        });
    }

    private static long e(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            LogUtil.e("ParsePeriodRriFileUtil", "parse fail:", str);
            return 0L;
        }
    }

    public static boolean d(List<HiStressMetaData> list) {
        for (HiStressMetaData hiStressMetaData : list) {
            if (hiStressMetaData == null || !e(hiStressMetaData)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(HiStressMetaData hiStressMetaData) {
        long jFetchStressStartTime = hiStressMetaData.fetchStressStartTime();
        long jFetchStressEndTime = hiStressMetaData.fetchStressEndTime();
        long jP = HiDateUtil.p(0L);
        if (jFetchStressStartTime > jFetchStressEndTime || jFetchStressEndTime <= 0 || jFetchStressStartTime <= 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressStartTime: ", Long.valueOf(jFetchStressStartTime));
            return false;
        }
        if (jFetchStressStartTime < jP) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressStartTime: ", Long.valueOf(jFetchStressStartTime));
            return false;
        }
        int iFetchStressAlgorithmVer = hiStressMetaData.fetchStressAlgorithmVer();
        if (iFetchStressAlgorithmVer <= 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressAlgorithmVer: ", Integer.valueOf(iFetchStressAlgorithmVer));
            return false;
        }
        int iFetchStressDevNo = hiStressMetaData.fetchStressDevNo();
        if (iFetchStressDevNo < 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressDeviceNo: ", Integer.valueOf(iFetchStressDevNo));
            return false;
        }
        int iFetchStressScore = hiStressMetaData.fetchStressScore();
        if (iFetchStressScore <= 0 || iFetchStressScore >= 100) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressScore: ", Integer.valueOf(iFetchStressScore));
            return false;
        }
        int iFetchStressGrade = hiStressMetaData.fetchStressGrade();
        if (iFetchStressGrade <= 0 || iFetchStressGrade > 4) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressGrade: ", Integer.valueOf(iFetchStressGrade));
            return false;
        }
        int iFetchStressCalibFlag = hiStressMetaData.fetchStressCalibFlag();
        if (iFetchStressCalibFlag != 1 && iFetchStressCalibFlag != 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressCalibFlag: ", Integer.valueOf(iFetchStressCalibFlag));
            return false;
        }
        return a(hiStressMetaData);
    }

    private static boolean a(HiStressMetaData hiStressMetaData) {
        int iFetchStressMeasureType = hiStressMetaData.fetchStressMeasureType();
        if (iFetchStressMeasureType < 0 || iFetchStressMeasureType > 2) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressMeasureType: ", Integer.valueOf(iFetchStressMeasureType));
            return false;
        }
        int iFetchStressAccFlag = hiStressMetaData.fetchStressAccFlag();
        if (iFetchStressAccFlag < 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressAccFlag: ", Integer.valueOf(iFetchStressAccFlag));
            return false;
        }
        int iFetchStressPpgFlag = hiStressMetaData.fetchStressPpgFlag();
        if (iFetchStressPpgFlag < 0) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressPpgFlag: ", Integer.valueOf(iFetchStressPpgFlag));
            return false;
        }
        List<Float> listFetchStressFeature = hiStressMetaData.fetchStressFeature();
        if (listFetchStressFeature == null) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressFeature is null");
            return false;
        }
        int size = listFetchStressFeature.size();
        if (size != 12) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressFeatureSize: ", Integer.valueOf(size));
            return false;
        }
        List<String> listFetchStressFeatureAtts = hiStressMetaData.fetchStressFeatureAtts();
        if (listFetchStressFeatureAtts == null) {
            LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressFeatureAtts is null");
            return false;
        }
        int size2 = listFetchStressFeatureAtts.size();
        if (size2 == 12) {
            return true;
        }
        LogUtil.a("ParsePeriodRriFileUtil", "isStressData is false, stressFeatureAttsSize: ", Integer.valueOf(size2));
        return false;
    }
}
