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
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes14.dex */
final class zzgy implements Runnable {
    final /* synthetic */ zzgz zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzgw zzd;
    private final String zze;
    private final Map zzf;

    public zzgy(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, zzgw zzgwVar) {
        Objects.requireNonNull(zzgzVar);
        this.zza = zzgzVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgwVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgwVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fc: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x00fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00ff: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:52:0x00fe */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th3;
        Map map3;
        Map map4;
        InputStream inputStream;
        zzgz zzgzVar = this.zza;
        zzgzVar.zzaX();
        int i14 = 0;
        OutputStream outputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzgzVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] bArrZzv = zzgzVar.zzg.zzp().zzv(bArr);
                    zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                    int length = bArrZzv.length;
                    zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzv);
                        outputStream2.close();
                    } catch (IOException e4) {
                        iOException = e4;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e14) {
                                this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e14);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, responseCode, iOException, null, map2, null));
                    } catch (Throwable th4) {
                        th = th4;
                        map = null;
                        outputStream = outputStream2;
                        th3 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e15) {
                                this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e15);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i14, null, null, map, null));
                        throw th3;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i15 = inputStream.read(bArr2);
                                    if (i15 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i15);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                        }
                    } catch (IOException e16) {
                        e = e16;
                        map2 = null;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, responseCode, iOException, null, map2, null));
                    } catch (Throwable th7) {
                        th3 = th7;
                        map = null;
                        i14 = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i14, null, null, map, null));
                        throw th3;
                    }
                } catch (IOException e17) {
                    e = e17;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, responseCode, iOException, null, map2, null));
                } catch (Throwable th8) {
                    th3 = th8;
                    i14 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzu.zzaW().zzj(new zzgx(this.zze, this.zzd, i14, null, null, map, null));
                    throw th3;
                }
            } catch (IOException e18) {
                iOException = e18;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th9) {
                th = th9;
                map = null;
            }
        } catch (IOException e19) {
            iOException = e19;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th10) {
            th = th10;
            httpURLConnection = null;
            map = null;
        }
    }
}
