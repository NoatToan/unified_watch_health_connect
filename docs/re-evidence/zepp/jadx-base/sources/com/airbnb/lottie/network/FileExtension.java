package com.airbnb.lottie.network;

import androidx.multidex.MultiDexExtractor;
import com.airbnb.lottie.utils.Logger;
import com.huami.network.hmnetwork.server.HMServerDef;

/* JADX INFO: loaded from: classes2.dex */
public enum FileExtension {
    JSON(HMServerDef.RESPONSE_FORMAT),
    ZIP(MultiDexExtractor.EXTRACTED_SUFFIX);

    public final String extension;

    FileExtension(String str) {
        this.extension = str;
    }

    public static FileExtension forFile(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        Logger.warning("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
