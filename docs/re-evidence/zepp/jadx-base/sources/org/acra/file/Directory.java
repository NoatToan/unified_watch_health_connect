package org.acra.file;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public enum Directory {
    FILES_LEGACY { // from class: org.acra.file.Directory.1
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return (str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) ? Directory.ROOT : Directory.FILES).getFile(context, str);
        }
    },
    FILES { // from class: org.acra.file.Directory.2
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(context.getFilesDir(), str);
        }
    },
    EXTERNAL_FILES { // from class: org.acra.file.Directory.3
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(context.getExternalFilesDir(null), str);
        }
    },
    CACHE { // from class: org.acra.file.Directory.4
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(context.getCacheDir(), str);
        }
    },
    EXTERNAL_CACHE { // from class: org.acra.file.Directory.5
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(context.getExternalCacheDir(), str);
        }
    },
    NO_BACKUP_FILES { // from class: org.acra.file.Directory.6
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : new File(context.getApplicationInfo().dataDir, "no_backup"), str);
        }
    },
    EXTERNAL_STORAGE { // from class: org.acra.file.Directory.7
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            return new File(Environment.getExternalStorageDirectory(), str);
        }
    },
    ROOT { // from class: org.acra.file.Directory.8
        @Override // org.acra.file.Directory
        @NonNull
        public File getFile(@NonNull Context context, @NonNull String str) {
            String[] strArrSplit = str.split(Pattern.quote(File.separator), 2);
            if (strArrSplit.length == 1) {
                return new File(str);
            }
            File[] fileArrListRoots = File.listRoots();
            for (File file : fileArrListRoots) {
                if (strArrSplit[0].equals(file.getPath().replace(File.separator, ""))) {
                    return new File(file, strArrSplit[1]);
                }
            }
            return new File(fileArrListRoots[0], str);
        }
    };

    @NonNull
    public abstract File getFile(@NonNull Context context, @NonNull String str);
}
