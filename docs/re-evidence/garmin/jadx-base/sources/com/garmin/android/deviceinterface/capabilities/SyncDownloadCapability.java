package com.garmin.android.deviceinterface.capabilities;

import com.garmin.gfdi.file.FileException;
import ea2.e;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public interface SyncDownloadCapability extends e {

    public interface ResultListener {
        void a(String str);

        void b(long j8, String str);

        void c(String str, FileException fileException);
    }

    long getDownloadBitMask();

    void saveFile(String str, File file, byte b14, byte b15, String str2, long j8, boolean z14, ResultListener resultListener);
}
