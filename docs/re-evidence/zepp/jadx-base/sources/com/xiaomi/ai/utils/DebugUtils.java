package com.xiaomi.ai.utils;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes18.dex */
public class DebugUtils {
    public static final String DEBUG_INDICATOR_FILE;
    public static final String ROOT;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append("aisdk");
        String string = sb.toString();
        ROOT = string;
        DEBUG_INDICATOR_FILE = string + str + "debug_on";
    }

    public static void extractDBToSdcard() {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File dataDirectory = Environment.getDataDirectory();
            if (externalStorageDirectory.canWrite()) {
                File file = new File(dataDirectory, "//data//com.xiaomi.facephoto//databases//gallery.db");
                File file2 = new File(externalStorageDirectory, "gallery.db");
                FileChannel channel = new FileInputStream(file).getChannel();
                FileChannel channel2 = new FileOutputStream(file2).getChannel();
                channel2.transferFrom(channel, 0L, channel.size());
                channel.close();
                channel2.close();
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean isDebugOn() {
        return new File(DEBUG_INDICATOR_FILE).exists();
    }
}
