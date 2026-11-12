package com.xiaomi.smarthome.frame.server_compact;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.file.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ServersConfig {
    private static final String SERVER_CONFIG = "server_config";
    private static final String TAG = "ServersConfig";

    public static boolean existsLocaledServer(Context context, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(SERVER_CONFIG);
        String str = File.separator;
        sb.append(str);
        sb.append(LocaleUtil.getString(locale).toLowerCase());
        sb.append(".json");
        if (!TextUtils.isEmpty(FileUtil.loadJSONFromAsset(context, sb.toString()))) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SERVER_CONFIG);
        sb2.append(str);
        sb2.append(getRealLanguage(locale.getLanguage().toLowerCase()));
        sb2.append(".json");
        return !TextUtils.isEmpty(FileUtil.loadJSONFromAsset(context, sb2.toString()));
    }

    public static String get(Context context, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(SERVER_CONFIG);
        String str = File.separator;
        sb.append(str);
        sb.append(LocaleUtil.getString(locale).toLowerCase());
        sb.append(".json");
        String strLoadJSONFromAsset = FileUtil.loadJSONFromAsset(context, sb.toString());
        if (!TextUtils.isEmpty(strLoadJSONFromAsset)) {
            return strLoadJSONFromAsset;
        }
        String strLoadJSONFromAsset2 = FileUtil.loadJSONFromAsset(context, SERVER_CONFIG + str + getRealLanguage(locale.getLanguage().toLowerCase()) + ".json");
        return !TextUtils.isEmpty(strLoadJSONFromAsset2) ? strLoadJSONFromAsset2 : FileUtil.readTxtFromFile(getFilePath(context, LocaleUtil.getString(locale).toLowerCase()));
    }

    private static String getFilePath(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(SERVER_CONFIG);
        sb.append(str2);
        sb.append(str.toLowerCase());
        return sb.toString();
    }

    private static String getRealLanguage(String str) {
        if (TextUtils.equals("iw", str)) {
            return "he";
        }
        if (TextUtils.equals("ji", str)) {
            return "yi";
        }
        return TextUtils.equals("in", str) ? "id" : str;
    }

    public static boolean set(Context context, String str, String str2) throws Throwable {
        File file;
        File file2 = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            String filePath = getFilePath(context, str);
            File file3 = new File(filePath);
            try {
                if (file3.exists()) {
                    file = new File(filePath + ".bak");
                    try {
                        file3.renameTo(file);
                    } catch (Exception e) {
                        e = e;
                        file2 = file3;
                        if (MiJiaEnvironment.isDebugBuildType()) {
                            e.printStackTrace();
                        }
                        if (file2 != null) {
                            try {
                                file2.deleteOnExit();
                                if (file != null && file2 != null) {
                                    file.renameTo(file2);
                                }
                            } catch (Exception e2) {
                                if (MiJiaEnvironment.isDebugBuildType()) {
                                    e2.printStackTrace();
                                }
                                return false;
                            }
                        } else if (file != null) {
                            file.renameTo(file2);
                        }
                        return false;
                    }
                } else {
                    FileUtil.createFileIfNotExists(filePath);
                    file = null;
                }
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file3));
                    try {
                        outputStreamWriter2.write(str2, 0, str2.length());
                        if (file != null) {
                            file.deleteOnExit();
                        }
                        outputStreamWriter2.close();
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            outputStreamWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                file = null;
            }
        } catch (Exception e4) {
            e = e4;
            file = null;
        }
    }
}
