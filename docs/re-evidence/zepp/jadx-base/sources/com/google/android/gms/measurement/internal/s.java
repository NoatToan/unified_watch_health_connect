package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.loopj.android.http.AsyncHttpClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
final class s implements Runnable {
    private final URL a;
    private final byte[] b;
    private final q c;
    private final String d;
    private final Map<String, String> e;
    public final /* synthetic */ zzer f;

    public s(zzer zzerVar, String str, URL url, byte[] bArr, Map<String, String> map, q qVar) {
        this.f = zzerVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(qVar);
        this.a = url;
        this.b = bArr;
        this.c = qVar;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fa: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:42:0x00f8 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0100: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:44:0x00fd */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        Map map2;
        int i;
        r rVar;
        zzfs zzfsVarZzaz;
        IOException iOException;
        int i2;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.f.zzax();
        OutputStream outputStream = null;
        try {
            zzer zzerVar = this.f;
            URLConnection uRLConnectionOpenConnection = this.a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzerVar.zzs.zzf();
            httpURLConnection.setConnectTimeout(60000);
            zzerVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map<String, String> map5 = this.e;
                if (map5 != null) {
                    for (Map.Entry<String, String> entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                if (this.b != null) {
                    byte[] bArrF = this.f.zzf.zzu().F(this.b);
                    zzej zzejVarZzj = this.f.zzs.zzay().zzj();
                    int length = bArrF.length;
                    zzejVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", AsyncHttpClient.ENCODING_GZIP);
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrF);
                        outputStream2.close();
                    } catch (IOException e2) {
                        e = e2;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e;
                        i2 = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.f.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzel.zzn(this.d), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfsVarZzaz = this.f.zzs.zzaz();
                        rVar = new r(this.d, this.c, i2, iOException, null, map2, null);
                        zzfsVarZzaz.zzp(rVar);
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.f.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzel.zzn(this.d), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f.zzs.zzaz().zzp(new r(this.d, this.c, i, null, null, map, null));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr);
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzfsVarZzaz = this.f.zzs.zzaz();
                                rVar = new r(this.d, this.c, responseCode, null, byteArray, headerFields, null);
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e5) {
                        map2 = null;
                        iOException = e5;
                        i2 = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfsVarZzaz = this.f.zzs.zzaz();
                        rVar = new r(this.d, this.c, i2, iOException, null, map2, null);
                    } catch (Throwable th5) {
                        th = th5;
                        map = null;
                        i = responseCode;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f.zzs.zzaz().zzp(new r(this.d, this.c, i, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e6) {
                    iOException = e6;
                    i2 = responseCode;
                    map2 = map4;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzfsVarZzaz = this.f.zzs.zzaz();
                    rVar = new r(this.d, this.c, i2, iOException, null, map2, null);
                } catch (Throwable th6) {
                    th = th6;
                    i = responseCode;
                    map = map3;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f.zzs.zzaz().zzp(new r(this.d, this.c, i, null, null, map, null));
                    throw th;
                }
            } catch (IOException e7) {
                map2 = null;
                iOException = e7;
                i2 = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzfsVarZzaz = this.f.zzs.zzaz();
                rVar = new r(this.d, this.c, i2, iOException, null, map2, null);
                zzfsVarZzaz.zzp(rVar);
            } catch (Throwable th7) {
                map = null;
                th = th7;
            }
            zzfsVarZzaz.zzp(rVar);
        } catch (IOException e8) {
            e = e8;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
