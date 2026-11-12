package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes14.dex */
public final class zzc {
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    httpURLConnection.disconnect();
                    zzi.zza();
                } catch (Throwable th3) {
                    httpURLConnection.disconnect();
                    throw th3;
                }
            } catch (IOException e4) {
                e = e4;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                zzi.zza();
            } catch (IndexOutOfBoundsException e14) {
                new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e14.getMessage()).length());
                zzi.zza();
            } catch (RuntimeException e15) {
                e = e15;
                new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
                zzi.zza();
            }
        } catch (Throwable th4) {
            zzi.zza();
            throw th4;
        }
    }
}
