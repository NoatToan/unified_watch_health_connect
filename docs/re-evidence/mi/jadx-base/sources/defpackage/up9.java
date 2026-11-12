package defpackage;

import com.google.android.gms.common.Scopes;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;

/* JADX INFO: loaded from: classes10.dex */
public class up9 {
    public static String a(FitnessDataId fitnessDataId) {
        if (fitnessDataId.getDataType() == 0 && fitnessDataId.getDailyType() == 5) {
            return "";
        }
        int tzIn15Min = fitnessDataId.getTzIn15Min();
        String str = (tzIn15Min < 0 ? "n" : FitnessFilePathUtils.TimeZoneConstant.POSITIVE) + Math.abs(tzIn15Min);
        return (fitnessDataId.getDataType() == 0 ? "daily" : "sport") + "/" + str;
    }

    public static String b(FitnessDataId fitnessDataId) {
        int dailyType = fitnessDataId.getDailyType();
        if (dailyType == 1) {
            return "distribute";
        }
        if (dailyType == 2) {
            return "dsleep";
        }
        if (dailyType == 3) {
            return "nsleep";
        }
        if (dailyType != 4) {
            return dailyType != 5 ? e(fitnessDataId) : Scopes.PROFILE;
        }
        return "average";
    }

    public static String c(FitnessDataId fitnessDataId) {
        return d(fitnessDataId) + "_v" + fitnessDataId.getVersion();
    }

    public static String d(FitnessDataId fitnessDataId) {
        if (fitnessDataId.getDataType() == 0) {
            return fitnessDataId.getTimeStamp() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + b(fitnessDataId);
        }
        return fitnessDataId.getTimeStamp() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + fitnessDataId.getSportType() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + e(fitnessDataId);
    }

    public static String e(FitnessDataId fitnessDataId) {
        int fileType = fitnessDataId.getFileType();
        if (fileType != 0) {
            return fileType != 1 ? "gps" : "report";
        }
        return "record";
    }
}
