package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@Deprecated
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    @KeepForSdk
    @Deprecated
    public String getVersion(String str) throws Throwable {
        IOException e4;
        String str2;
        InputStream resourceAsStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.zzc;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = LibraryVersion.class.getResourceAsStream("/" + str + ".properties");
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        GmsLogger gmsLogger = zza;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb3.append(str);
                        sb3.append(" version is ");
                        sb3.append(property);
                        gmsLogger.v("LibraryVersion", sb3.toString());
                    } else {
                        GmsLogger gmsLogger2 = zza;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb4.append("Failed to get app version for libraryName: ");
                        sb4.append(str);
                        gmsLogger2.w("LibraryVersion", sb4.toString());
                    }
                } catch (IOException e14) {
                    e4 = e14;
                    String str3 = property;
                    inputStream = resourceAsStream;
                    str2 = str3;
                    GmsLogger gmsLogger3 = zza;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb5.append("Failed to get app version for libraryName: ");
                    sb5.append(str);
                    gmsLogger3.e("LibraryVersion", sb5.toString(), e4);
                    InputStream inputStream2 = inputStream;
                    property = str2;
                    resourceAsStream = inputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e4 = e15;
                str2 = null;
            }
            if (resourceAsStream != null) {
                IOUtils.closeQuietly(resourceAsStream);
            }
            if (property == null) {
                zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.zzc.put(str, property);
            return property;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
