package com.huami.watch.transport.httpsupport.translogutils;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class Util {
    public static final String ACTION_DELETE_SUMMARY = "com.huami.watch.sport.delete_summary";
    public static final String ACTION_DOWNLOAD_STATISTIC = "com.huami.watch.sport.download_statistic";
    public static final String ACTION_HEALTH = "com.huami.watch.health.upload_history";
    public static final String ACTION_HEALTH_RATE = "com.huami.watch.health.upload_heartrate";
    public static final String ACTION_SPORT_DOWNLOAD_DETAIL = "com.huami.watch.sport.download_detail";
    public static final String ACTION_SPORT_DOWNLOAD_SUMMARY = "com.huami.watch.sport.download_summary";
    public static final String ACTION_SPORT_UPLOAD_DETAIL = "com.huami.watch.sport.upload_detail";
    public static final String ACTION_SPORT_UPLOAD_SUMMARY = "com.huami.watch.sport.upload_summary";
    public static final String ACTION_XXX = "com.huami.watch.xxx";
    public static final boolean DEBUG;
    public static final boolean DEBUG_SERVER;
    public static final boolean SPRING_LOG_ENALBE = true;
    public static final String TRANS_TAG = "LOG_TRANS";
    public static final String[] TRANS_TAGS;
    public static final String TRANS_TAG_HEALTH = "_HEALTH";
    public static final String TRANS_TAG_N = "LOG_TRANS_NEW";
    public static final String TRANS_TAG_SPORT = "_SPORT";
    public static final String TRANS_TAG_TEST = "_TEST";

    static {
        boolean zExists = new File(Environment.getExternalStorageDirectory() + "/springchannel.ini").exists();
        DEBUG = zExists;
        DEBUG_SERVER = zExists & true;
        TRANS_TAGS = new String[]{TRANS_TAG_SPORT, TRANS_TAG_HEALTH, TRANS_TAG_TEST};
    }
}
