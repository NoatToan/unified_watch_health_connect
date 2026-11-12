package com.ximalaya.ting.android.player;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class XMediaPlayerConstants {
    public static final int CON_TIME_OUT = 20000;
    public static final int DEFAULT_CHUNK_SIZE = 65536;
    public static int DOWNLOAD_QUEUE_SIZE = 30;
    public static final int HTTP_REQUEST_TYPE_DOWNLOAD = 0;
    public static final int HTTP_REQUEST_TYPE_HEAD = 1;
    public static final int HTTP_REQUEST_TYPE_HTTPFLV = 3;
    public static final int HTTP_REQUEST_TYPE_M3U8 = 2;
    public static final int HTTP_REQUEST_TYPE_M3U8_TS = 4;
    public static final String LOCAL_SERVER_SUFFIX = "#local_server_suffix";
    public static final int MAX_PRELOAD_SIZE = 30;
    public static final int SEND_BUFFER_QUEUE_SIZE = 3;
    public static final int SEND_BUFFER_QUEUE_SIZE_FOR_LIVE = 1024;
    public static final int TIME_OUT = 30000;
    public static final String X2M_SUFFIX = ".x2m";
    public static final String XM_SUFFIX = ".xm";
    public static boolean isDebug = false;
    public static boolean isDebugPlayer = false;
    public static String APP_BASE_DIR = Environment.getExternalStorageDirectory().getPath() + "/ting";
    public static String CACHE_BASE_DIR = APP_BASE_DIR + "/player_caching";
    public static String INCOM_AUDIO_FILE_DIRECTORY = CACHE_BASE_DIR + "/audio";
    public static String FILE_PLAY_CACHE_INFO = "playcache.info";
    public static String INCOM_AUDIO_FILE_PLAY_CACHE_INFO = INCOM_AUDIO_FILE_DIRECTORY + File.separator + FILE_PLAY_CACHE_INFO;

    public static void resetCacheDir(Context context) {
        if (context == null || context.getExternalFilesDir("") == null) {
            return;
        }
        try {
            APP_BASE_DIR = context.getExternalFilesDir("") + "";
            CACHE_BASE_DIR = APP_BASE_DIR + "/player_caching";
            INCOM_AUDIO_FILE_DIRECTORY = CACHE_BASE_DIR + "/audio";
            INCOM_AUDIO_FILE_PLAY_CACHE_INFO = INCOM_AUDIO_FILE_DIRECTORY + File.separator + FILE_PLAY_CACHE_INFO;
            new File(INCOM_AUDIO_FILE_DIRECTORY).mkdirs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
