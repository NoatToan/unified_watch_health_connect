package org.acra.util;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import org.acra.ACRA;

/* JADX INFO: loaded from: classes23.dex */
public final class Installation {
    private static final String a = "ACRA-INSTALLATION";

    private Installation() {
    }

    @NonNull
    public static synchronized String id(@NonNull Context context) {
        File file = new File(context.getFilesDir(), a);
        try {
            if (!file.exists()) {
                IOUtils.writeStringToFile(file, UUID.randomUUID().toString());
            }
            return new StreamReader(file).read();
        } catch (IOException | RuntimeException e) {
            ACRA.log.w(ACRA.LOG_TAG, "Couldn't retrieve InstallationId for " + context.getPackageName(), e);
            return "Couldn't retrieve InstallationId";
        }
    }
}
