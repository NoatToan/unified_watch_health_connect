package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzln implements Runnable {
    final /* synthetic */ zzlo zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzll zzd;
    private final String zze;
    private final Map zzf;

    public zzln(zzlo zzloVar, String str, URL url, byte[] bArr, Map map, zzll zzllVar) {
        Objects.requireNonNull(zzloVar);
        this.zza = zzloVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzllVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzllVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i14, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i14, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzln] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r14;
        OutputStream outputStream3;
        ?? r15;
        OutputStream outputStream4;
        InputStream inputStream;
        zzlo zzloVar = this.zza;
        zzloVar.zzaX();
        int i14 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzloVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r16 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.zzf;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzicVar.zzaU();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            zzgs zzgsVarZzk = this.zza.zzu.zzaV().zzk();
                            int length = byteArray.length;
                            zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r16 = outputStream5;
                            } catch (IOException e4) {
                                e = e4;
                                r15 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e14) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e14);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i14, e, null, r15);
                            } catch (Throwable th3) {
                                th = th3;
                                r14 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e15) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e15);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i14, null, null, r14);
                                throw th;
                            }
                        } catch (IOException e16) {
                            this.zza.zzu.zzaV().zzb().zzb("Failed to gzip post request content", e16);
                            throw e16;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i15 = inputStream.read(bArr2);
                                        if (i15 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            zzb(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i15);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = null;
                            }
                        } catch (IOException e17) {
                            i14 = responseCode;
                            e = e17;
                            outputStream2 = null;
                            r15 = outputStream2;
                            outputStream4 = outputStream2;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i14, e, null, r15);
                        } catch (Throwable th6) {
                            i14 = responseCode;
                            th = th6;
                            outputStream = null;
                            r14 = outputStream;
                            outputStream3 = outputStream;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i14, null, null, r14);
                            throw th;
                        }
                    } catch (IOException e18) {
                        i14 = responseCode;
                        e = e18;
                        r15 = r16;
                        outputStream4 = null;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i14, e, null, r15);
                    } catch (Throwable th7) {
                        i14 = responseCode;
                        th = th7;
                        r14 = r16;
                        outputStream3 = null;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i14, null, null, r14);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (IOException e19) {
                e = e19;
            }
        } catch (IOException e24) {
            e = e24;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    public final /* synthetic */ void zza(int i14, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zze, i14, exc, bArr, map);
    }
}
