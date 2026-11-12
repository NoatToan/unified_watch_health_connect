package com.xiaomi.fitness.devicesettings.bluttooth.audio.util;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.library.crypto.SHA1Util;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/RecorderSyncHelper;", "", "<init>", "()V", "TAG", "", "insertRecorderDb", "", "path", "dir", "recordTime", "", "recordDuration", "", "copyToRecorderDirectory", "file", "Ljava/io/File;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecorderSyncHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecorderSyncHelper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/util/RecorderSyncHelper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,106:1\n29#2:107\n*S KotlinDebug\n*F\n+ 1 RecorderSyncHelper.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/util/RecorderSyncHelper\n*L\n61#1:107\n*E\n"})
public final class RecorderSyncHelper {

    @NotNull
    public static final RecorderSyncHelper INSTANCE = new RecorderSyncHelper();

    @NotNull
    private static final String TAG = "RecorderSyncHelper";

    private RecorderSyncHelper() {
    }

    @RequiresApi(31)
    @Nullable
    public final String copyToRecorderDirectory(@NotNull File file, @NotNull String dir) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(dir, "dir");
        try {
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RECORDINGS), dir);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String str = TAG;
            Logger.d(str, "write recorder file");
            File file3 = new File(file2, file.getName());
            if (file3.exists()) {
                return file3.getPath();
            }
            FilesKt__UtilsKt.copyTo$default(file, file3, false, 0, 6, null);
            Logger.e(str, "copy to recorder  " + file.getPath() + " " + file3.getPath());
            return file3.getPath();
        } catch (Exception e) {
            Logger.e(TAG, "copy to recorder fail " + e.getMessage());
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public final void insertRecorderDb(@Nullable String path, @NotNull String dir, long recordTime, int recordDuration) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (path == null || path.length() == 0) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            String name = file.getName();
            long length = file.length();
            String strCopyToRecorderDirectory = copyToRecorderDirectory(file, dir);
            if (strCopyToRecorderDirectory == null || strCopyToRecorderDirectory.length() == 0) {
                return;
            }
            String sHA1Digest = SHA1Util.getSHA1Digest(path);
            String str = TAG;
            Logger.i(str, "fileSize " + length + " sha1 " + sHA1Digest);
            if (recordDuration == 0) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                try {
                    try {
                        mediaPlayer.reset();
                        mediaPlayer.setDataSource(path);
                        mediaPlayer.prepare();
                        recordDuration = (int) (((double) ((mediaPlayer.getDuration() * 1.0f) / 1000)) + 0.5d);
                        Logger.i(str, "audio file duration " + mediaPlayer.getDuration());
                    } catch (Throwable th) {
                        mediaPlayer.release();
                        throw th;
                    }
                } catch (Exception e) {
                    Logger.e(TAG, "get duration error " + e.getMessage());
                }
                mediaPlayer.release();
            }
            try {
                ContentResolver contentResolver = ApplicationExtKt.getApplication().getContentResolver();
                Uri uri = Uri.parse("content://records/records");
                ContentValues contentValues = new ContentValues();
                contentValues.put("file_path", strCopyToRecorderDirectory);
                contentValues.put("file_name", name);
                contentValues.put("file_size", Long.valueOf(length));
                contentValues.put("rec_type", (Integer) 3);
                contentValues.put(MiuiCursorConstants.CREATE_TIME, Long.valueOf(recordTime));
                contentValues.put("db_sync_time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("sync_dirty", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("duration", Integer.valueOf(recordDuration));
                contentValues.put("sha1", sHA1Digest);
                contentValues.put("in_local", (Integer) 1);
                contentValues.put("in_cloud", (Integer) 0);
                Uri uriInsert = contentResolver.insert(uri, contentValues);
                Logger.i(TAG, path + " sync to recorder " + contentValues + " " + uriInsert);
            } catch (Exception e2) {
                Logger.e(TAG, "insert recorder fail " + e2.getMessage());
            }
        }
    }
}
