package com.huami.watch.companion.xiaomiai;

import android.text.TextUtils;
import com.amazon.alexa.avs.log.LogHelper;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public class AudioSaveUtils {
    public static final String AUDIO_RECORDER_FOLDER = "audioRecorder/";
    public static final String AUDIO_ROOT_PATH = "/sdcard/";
    public static final String TAG = LogHelper.makeLogTag(AudioSaveUtils.class);

    public static boolean deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(new File(AUDIO_ROOT_PATH, AUDIO_RECORDER_FOLDER).getPath(), str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    public static String getFilename(String str) {
        File file = new File(AUDIO_ROOT_PATH, AUDIO_RECORDER_FOLDER);
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str;
    }

    public static boolean writeWaveDataToFile(String str, byte[] bArr, int i, int i2) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            LogHelper.e(TAG, "file name is null");
            return false;
        }
        if (bArr == null || bArr.length == 0) {
            LogHelper.e(TAG, "writeWaveDataToFile data is empty ");
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str, true);
                try {
                    fileOutputStream2.write(bArr, i, i2);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    LogHelper.e(TAG, "writeWaveDataToFile " + e.toString());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
