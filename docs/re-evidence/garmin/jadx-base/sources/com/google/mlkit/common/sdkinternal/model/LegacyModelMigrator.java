package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class LegacyModelMigrator {

    @KeepForSdk
    protected final ModelFileHelper modelFileHelper;
    private final Context zzb;
    private final TaskCompletionSource zza = new TaskCompletionSource();
    private final Executor zzc = MLTaskExecutor.workerThreadExecutor();

    @KeepForSdk
    public LegacyModelMigrator(Context context, ModelFileHelper modelFileHelper) {
        this.zzb = context;
        this.modelFileHelper = modelFileHelper;
    }

    @KeepForSdk
    public static void deleteIfEmpty(File file) {
        File[] fileArrListFiles = file.listFiles();
        if ((fileArrListFiles == null || fileArrListFiles.length == 0) && !file.delete()) {
            "Error deleting model directory ".concat(String.valueOf(file));
        }
    }

    @KeepForSdk
    public static boolean isValidFirebasePersistenceKey(String str) {
        String[] strArrSplit = str.split("\\+", -1);
        if (strArrSplit.length != 2) {
            return false;
        }
        try {
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[0]);
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @KeepForSdk
    public static void migrateFile(File file, File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String.valueOf(file);
                String.valueOf(file2);
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            "Error deleting model file ".concat(String.valueOf(file));
        }
    }

    @KeepForSdk
    public abstract String getLegacyModelDirName();

    @KeepForSdk
    public File getLegacyRootDir() {
        Context context = this.zzb;
        return new File(context.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    @KeepForSdk
    public Task<Void> getMigrationTask() {
        return this.zza.getTask();
    }

    @KeepForSdk
    public abstract void migrateAllModelDirs(File file);

    @KeepForSdk
    public void start() {
        this.zzc.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza();
            }
        });
    }

    public final /* synthetic */ void zza() {
        File legacyRootDir = getLegacyRootDir();
        File[] fileArrListFiles = legacyRootDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                migrateAllModelDirs(file);
            }
            deleteIfEmpty(legacyRootDir);
        }
        this.zza.setResult(null);
    }
}
