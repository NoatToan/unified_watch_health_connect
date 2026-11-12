package com.huami.mifit.sportlib;

import android.content.Context;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.dbkit.ISportActiveDatasDbCallback;
import com.huami.mifit.sportlib.dbkit.ISportConfigDbCallback;
import com.huami.mifit.sportlib.dbkit.ISportDetailDbCallback;
import com.huami.mifit.sportlib.dbkit.ISportRecordDbCallback;
import com.huami.mifit.sportlib.dbkit.SportActiveDatasDbKit;
import com.huami.mifit.sportlib.dbkit.SportConfigDbKit;
import com.huami.mifit.sportlib.dbkit.SportDetailDbKit;
import com.huami.mifit.sportlib.dbkit.SportRecordDbKit;
import com.huami.mifit.sportlib.dbkit.bulkparse.SportRawDataTransformer;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.defpractice.DefDeviceClient;
import com.huami.mifit.sportlib.defpractice.DefLogClient;
import com.huami.mifit.sportlib.logkit.ISportLogCallback;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.utils.ConfigUtils;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSportApplication {
    private static boolean a = false;
    private static String b = "";
    private static Class c;

    private GPSSportApplication() {
    }

    private static void a(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(file2);
            }
        }
    }

    public static void bindSportingClass(Class cls) {
        if (c != null) {
            return;
        }
        c = cls;
    }

    public static String getDataStoreDir() {
        return b;
    }

    public static Class getSportMainClass() {
        return c;
    }

    public static void init(Context context, boolean z) {
        if (context == null) {
            return;
        }
        a = z;
        Keeper.init(context);
        DefDeviceClient.getInstance().setContext(context.getApplicationContext());
        DefLogClient.enable(z, true, context.getFilesDir().getAbsolutePath() + "/log");
        b = context.getFilesDir().getAbsolutePath() + "/sportsData";
    }

    public static boolean isDebugVersion() {
        return a;
    }

    public static void logout(Context context) {
        if (context == null) {
            return;
        }
        ConfigUtils.clear();
        DataCondition dataCondition = new DataCondition(-1L);
        SportRecordDbKit.getInstance().deleteSportRecords(dataCondition);
        SportDetailDbKit.getInstance().deleteSportDetailDatas(dataCondition);
        Keeper.clear(context);
        File file = new File(b);
        if (file.exists()) {
            a(file);
        }
        SportRawDataTransformer.INSTANCE.getInstance().clearParsedData();
    }

    public static void setLogClient(ISportLogCallback iSportLogCallback) {
        LogKit.setLogClient(iSportLogCallback);
    }

    public static void setSportActiveDataDbClient(ISportActiveDatasDbCallback iSportActiveDatasDbCallback) {
        SportActiveDatasDbKit.getInstance().setActiveDbClient(iSportActiveDatasDbCallback);
    }

    public static void setSportConfigDbClient(ISportConfigDbCallback iSportConfigDbCallback) {
        SportConfigDbKit.getInstance().setConfigDbClient(iSportConfigDbCallback);
    }

    public static void setSportDetailDbClient(ISportDetailDbCallback iSportDetailDbCallback) {
        SportDetailDbKit.getInstance().setDetailDbClient(iSportDetailDbCallback);
    }

    public static void setSportRecordDbClient(ISportRecordDbCallback iSportRecordDbCallback) {
        SportRecordDbKit.getInstance().setRecordDbClient(iSportRecordDbCallback);
    }
}
