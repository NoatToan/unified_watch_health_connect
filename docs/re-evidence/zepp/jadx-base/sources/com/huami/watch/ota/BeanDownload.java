package com.huami.watch.ota;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.watch.util.Log;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class BeanDownload {
    public static final String DEFAUL_STRING = "null";
    public static final int STATE_COMPLETED = 1;
    public static final int STATE_DOWNLOAD_FAIL = 3;
    public static final int STATE_FILE_EXIST = 4;
    public static final int STATE_INTERRUPTED = 2;
    public static final int STATE_LOADING = 0;
    private static final String a = "HmOta-BeanDownload";
    private static final String b = "beandownload_reference";
    private static final String c = "config_last_filename";
    private static final String d = "config_last_md5";
    private static final String e = "config_last_url";
    private static final String f = "config_last_loadsize";
    private static final String g = "config_last_filesize";
    public boolean enable;
    public long loadedSize;
    public String md5;
    public String name;
    public long size;
    public int state;
    public String url;

    public static void clearLastDownload(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
        Log.d(a, "clear last download result", new Object[0]);
        sharedPreferences.edit().putString(c, "").commit();
        sharedPreferences.edit().putLong(g, 0L).commit();
        sharedPreferences.edit().putLong(f, 0L).commit();
        sharedPreferences.edit().putString(d, "").commit();
        sharedPreferences.edit().putString(e, "").commit();
    }

    public static Long getLastFileSize(Context context) {
        return Long.valueOf(context.getSharedPreferences(b, 0).getLong(g, 0L));
    }

    public static String getLastFilename(Context context) {
        return context.getSharedPreferences(b, 0).getString(c, "");
    }

    public static Long getLastLoadSize(Context context) {
        return Long.valueOf(context.getSharedPreferences(b, 0).getLong(f, 0L));
    }

    public static String getLastMd5(Context context) {
        return context.getSharedPreferences(b, 0).getString(d, "");
    }

    public static String getLastUrl(Context context) {
        return context.getSharedPreferences(b, 0).getString(e, "");
    }

    public static void updateLastDownload(Context context, BeanDownload beanDownload) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
        Log.d(a, "update last download result : " + beanDownload, new Object[0]);
        sharedPreferences.edit().putString(c, beanDownload.name).commit();
        sharedPreferences.edit().putLong(g, beanDownload.size).commit();
        sharedPreferences.edit().putLong(f, beanDownload.loadedSize).commit();
        sharedPreferences.edit().putString(d, beanDownload.md5).commit();
        sharedPreferences.edit().putString(e, beanDownload.url).commit();
    }

    public String toString() {
        return SearchCriteria.LT + "file name :" + this.name + " md5 : " + this.md5 + " loadsize : " + this.loadedSize + " state : " + this.state + " enable : " + this.enable + SearchCriteria.GT;
    }
}
