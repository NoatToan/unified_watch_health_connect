package com.huawei.hms.network.file.a;

import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.k;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.download.api.GetRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a implements com.huawei.hms.network.file.core.task.b<GetRequest, d> {
    private d d;
    private HttpClient e;
    Submit<ResponseBody> f;
    private GlobalRequestConfig k;
    i l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15662a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15663b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f15664c = "";
    long g = 0;
    private int h = 0;
    private int i = 0;
    private com.huawei.hms.network.file.core.task.f j = null;

    boolean a(String str) {
        File file = new File(str);
        if (file.exists() || file.getParentFile() == null) {
            return false;
        }
        return file.getParentFile().mkdirs();
    }

    void a(Submit<ResponseBody> submit, k<GetRequest> kVar) {
        if (submit != null) {
            try {
                if (submit.getRequestFinishedInfo() != null) {
                    kVar.b(submit.getRequestFinishedInfo());
                }
            } catch (RuntimeException e) {
                FLogger.w("DownloadImpl", "collectFinishedInfo RuntimeException", e);
            } catch (Exception e2) {
                FLogger.w("DownloadImpl", "collectFinishedInfo exception", e2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13, types: [long] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.huawei.hms.network.file.a.a] */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.huawei.hms.network.file.a.d, com.huawei.hms.network.file.core.task.k] */
    @Override // com.huawei.hms.network.file.core.task.b
    public Closeable a(d dVar, com.huawei.hms.network.file.core.task.f fVar) throws Throwable {
        Throwable th;
        ?? r14;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        Response<ResponseBody> responseA;
        Throwable th2;
        Response<ResponseBody> response;
        FileManagerException fileManagerException;
        Response<ResponseBody> response2;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r15;
        InputStream inputStream3;
        InputStream inputStream4;
        ?? r16;
        InputStream inputStream5;
        InputStream inputStream6;
        this.j = fVar;
        this.d = dVar;
        this.f15662a = dVar.v();
        try {
            this.f15663b = new URL(this.f15662a).getHost();
        } catch (MalformedURLException unused) {
            FLogger.w("DownloadImpl", "process getHost malformedURLException", new Object[0]);
        }
        if (((GetRequest) dVar.p()).getConfig() != null && this.k.getRetryTimes() != -100) {
            this.h = this.k.getRetryTimes();
        }
        BufferedInputStream bufferedInputStream2 = null;
        InputStream inputStream7 = null;
        while (!this.d.h()) {
            try {
                try {
                    long jA = this.d.A() + this.d.c();
                    long jY = this.d.y();
                    StringBuilder sb = new StringBuilder();
                    sb.append("downloadOneRange before connect, task:");
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        sb.append(this.d.p().getId());
                        sb.append(", host =");
                        sb.append(this.f15663b);
                        sb.append(", protocol=  range:");
                        sb.append(jA);
                        sb.append(AwarenessConstants.SECOND_ACTION_SPLITE_TAG);
                        sb.append(jY);
                        sb.append(",configRetryCount:");
                        sb.append(this.h);
                        sb.append(",sliceRetryCount:");
                        sb.append(this.i);
                        FLogger.i("DownloadImpl", sb.toString(), new Object[0]);
                        String strA = a(this.f15662a, this.d.p().getParams());
                        FLogger.v("DownloadImpl", "process paramsUrl:" + strA);
                        r15 = jY;
                        responseA = a(strA, jA, r15, this.d);
                        try {
                            l lVar = new l(Constants.ErrorCode.SUCCESS);
                            lVar.setRawResponse(responseA);
                            dVar.a(lVar);
                            int code = responseA.getCode();
                            FLogger.d("DownloadImpl", "hostStr=" + this.f15663b + " httpVersion:" + this.f15664c, new Object[0]);
                            a(code, jA, r15);
                            if (!Utils.checkReadableStream(code)) {
                                FLogger.w("DownloadImpl", "code 304, return directly", new Object[0]);
                                throw new FileManagerException(Constants.ErrorCode.NOT_MODIFIED);
                            }
                            long contentLength = responseA.getBody().getContentLength();
                            FLogger.i("DownloadImpl", "response content-length:" + contentLength + ",responseCode:" + code, new Object[0]);
                            long j = (jA + contentLength) - 1;
                            if (this.d.p().getFileSize() <= 0 && contentLength > 0 && this.d.y() <= 0 && !this.d.h()) {
                                if (!com.huawei.hms.network.file.core.util.d.c(responseA.getHeaders()) || com.huawei.hms.network.file.core.util.d.a(responseA.getHeaders())) {
                                    FLogger.i("DownloadImpl", "fix endpos for noSize:" + this.d.A() + AwarenessConstants.SECOND_ACTION_SPLITE_TAG + j, new Object[0]);
                                } else {
                                    boolean zA = this.j.a(contentLength);
                                    FLogger.i("DownloadImpl", "downloadOneRange hasNewTask " + zA, new Object[0]);
                                    if (zA) {
                                        contentLength = dVar.a();
                                    }
                                }
                                d dVar2 = this.d;
                                dVar2.a(dVar2.A(), j);
                            } else if (this.d.y() < 0 && contentLength > 0) {
                                FLogger.i("DownloadImpl", "fix end pos for unfinishedTask:" + this.d.A() + AwarenessConstants.SECOND_ACTION_SPLITE_TAG + j, new Object[0]);
                                d dVar3 = this.d;
                                dVar3.a(dVar3.A(), j);
                            }
                            if (!this.d.C() && this.d.a() > 0) {
                                contentLength = this.d.a() - this.d.c();
                            }
                            long j2 = contentLength;
                            FLogger.i("DownloadImpl", "downloadOneRange stargetReadSize：" + j2, new Object[0]);
                            InputStream inputStream8 = responseA.getBody().getInputStream();
                            if (inputStream8 == null) {
                                FLogger.e("DownloadImpl", "get inputStream from response failed,  in == null");
                                throw new IOException("get inputStream from response failed");
                            }
                            try {
                                if (com.huawei.hms.network.file.core.util.d.b(responseA.getHeaders())) {
                                    FLogger.i("DownloadImpl", "gzip is need Decompress", new Object[0]);
                                    bufferedInputStream2 = new BufferedInputStream(new GZIPInputStream(inputStream8));
                                } else {
                                    bufferedInputStream2 = new BufferedInputStream(inputStream8);
                                }
                                try {
                                    try {
                                        String strB = this.d.B();
                                        a(strB);
                                        try {
                                            if (this.d.h()) {
                                                FLogger.w("DownloadImpl", "task of future is cancelled", new Object[0]);
                                                Utils.close(null);
                                                Utils.close(inputStream8);
                                                Utils.close(bufferedInputStream2);
                                                if (responseA != null) {
                                                    try {
                                                        responseA.close();
                                                    } catch (IOException unused2) {
                                                        FLogger.w("DownloadImpl", "the response hasn't been closed!", new Object[0]);
                                                    }
                                                }
                                                this.d.a(this.i);
                                                a(this.f, this.d);
                                                return null;
                                            }
                                            RandomAccessFile randomAccessFileA = com.huawei.hms.network.file.core.util.c.a(strB, "rwd");
                                            try {
                                                randomAccessFileA.seek(jA - this.d.p().getOffset());
                                                a(bufferedInputStream2, randomAccessFileA, strB, j2);
                                                if (!this.d.h()) {
                                                    this.d.a(true);
                                                }
                                                Utils.close(randomAccessFileA);
                                                Utils.close(inputStream8);
                                                Utils.close(bufferedInputStream2);
                                                if (responseA != null) {
                                                    try {
                                                        responseA.close();
                                                    } catch (IOException unused3) {
                                                        FLogger.w("DownloadImpl", "the response hasn't been closed!", new Object[0]);
                                                    }
                                                }
                                                this.d.a(this.i);
                                                a(this.f, this.d);
                                                return responseA;
                                            } catch (FileManagerException e) {
                                                e = e;
                                                throw e;
                                            } catch (IOException e2) {
                                                e = e2;
                                                IOException iOException2 = e;
                                                FLogger.e("DownloadImpl", "new downloadFile failed", iOException2);
                                                throw new FileManagerException(Constants.ErrorCode.CREATE_DOWNLOAD_FILE_FAILED, iOException2);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                th2 = th;
                                                throw new FileManagerException(Constants.ErrorCode.UNKNOW_ERROR, th2.getMessage());
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                        }
                                    } catch (IOException e4) {
                                        iOException = e4;
                                        inputStream2 = inputStream8;
                                        r15 = inputStream8;
                                        try {
                                            FLogger.w("DownloadImpl", "read catch IO exception in downloadOneSlice: hostStr = " + this.f15663b, new Object[0]);
                                            a(iOException);
                                            Utils.close(null);
                                            Utils.close(inputStream2);
                                            Utils.close(bufferedInputStream2);
                                            if (responseA != null) {
                                                try {
                                                    responseA.close();
                                                } catch (IOException unused4) {
                                                    FLogger.w("DownloadImpl", "the response hasn't been closed!", new Object[0]);
                                                }
                                            }
                                            this.d.a(this.i);
                                            a(this.f, this.d);
                                            inputStream7 = inputStream2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r14 = inputStream2;
                                            Utils.close(null);
                                            Utils.close(r14);
                                            Utils.close(bufferedInputStream2);
                                            if (responseA != null) {
                                                try {
                                                    responseA.close();
                                                } catch (IOException unused5) {
                                                    FLogger.w("DownloadImpl", "the response hasn't been closed!", new Object[0]);
                                                }
                                            }
                                            this.d.a(this.i);
                                            a(this.f, this.d);
                                            throw th;
                                        }
                                    }
                                } catch (FileManagerException e5) {
                                    e = e5;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (FileManagerException e6) {
                                fileManagerException = e6;
                                inputStream6 = inputStream8;
                            } catch (IOException e7) {
                                iOException = e7;
                                inputStream4 = inputStream8;
                                r16 = inputStream8;
                                bufferedInputStream2 = bufferedInputStream;
                                r15 = r16;
                                inputStream2 = inputStream4;
                                FLogger.w("DownloadImpl", "read catch IO exception in downloadOneSlice: hostStr = " + this.f15663b, new Object[0]);
                                a(iOException);
                                Utils.close(null);
                                Utils.close(inputStream2);
                                Utils.close(bufferedInputStream2);
                                if (responseA != null) {
                                    responseA.close();
                                }
                                this.d.a(this.i);
                                a(this.f, this.d);
                                inputStream7 = inputStream2;
                            } catch (Throwable th6) {
                                th2 = th6;
                                inputStream5 = inputStream8;
                                response = responseA;
                                inputStream = inputStream5;
                                throw new FileManagerException(Constants.ErrorCode.UNKNOW_ERROR, th2.getMessage());
                            }
                        } catch (FileManagerException e8) {
                            fileManagerException = e8;
                            inputStream6 = inputStream7;
                        } catch (IOException e9) {
                            iOException = e9;
                            r16 = r15;
                            inputStream4 = inputStream7;
                        } catch (Throwable th7) {
                            th2 = th7;
                            inputStream5 = inputStream7;
                        }
                        response2 = responseA;
                        inputStream3 = inputStream6;
                    } catch (FileManagerException e10) {
                        e = e10;
                        fileManagerException = e;
                        response2 = null;
                        inputStream3 = inputStream7;
                    } catch (IOException e11) {
                        iOException = e11;
                        responseA = null;
                        r16 = r15;
                        inputStream4 = inputStream7;
                    } catch (Throwable th8) {
                        th = th8;
                        th2 = th;
                        response = null;
                        inputStream = inputStream7;
                        throw new FileManagerException(Constants.ErrorCode.UNKNOW_ERROR, th2.getMessage());
                    }
                } catch (FileManagerException e12) {
                    e = e12;
                    bufferedInputStream = bufferedInputStream2;
                } catch (IOException e13) {
                    iOException = e13;
                    bufferedInputStream2 = bufferedInputStream2;
                    responseA = null;
                    r15 = r15;
                    inputStream2 = inputStream7;
                } catch (Throwable th9) {
                    th = th9;
                    bufferedInputStream = bufferedInputStream2;
                }
                throw fileManagerException;
            } catch (Throwable th10) {
                th = th10;
                r14 = r15;
            }
        }
        return null;
    }

    private boolean b(IOException iOException) {
        return com.huawei.hms.network.file.core.util.b.a((Throwable) iOException) && this.i <= this.h;
    }

    private StringBuilder b(String str, Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str.indexOf(38) > 0 || str.indexOf(63) > 0) {
            sb.append("&");
        } else {
            sb.append("?");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getValue(), "UTF-8");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(strEncode);
            sb.append("&");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }

    private void a(IOException iOException) {
        String message = !Utils.isBlank(iOException.getMessage()) ? iOException.getMessage() : "IO exception";
        this.i++;
        int iA = com.huawei.hms.network.file.core.util.b.a(iOException);
        if (b(iOException)) {
            return;
        }
        FLogger.e("DownloadImpl", "doWithIOException failed, retrycount=" + this.i + ", code=" + iA);
        throw new FileManagerException(iA, message, iOException);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01df */
    /* JADX WARN: Code duplicated, block: B:118:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(BufferedInputStream bufferedInputStream, RandomAccessFile randomAccessFile, String str, long j) throws Throwable {
        String str2;
        Throwable th;
        int i;
        String str3;
        int iA;
        Throwable th2;
        int i2;
        boolean z;
        String str4 = "writeFile exception3";
        long j2 = 0;
        int i3 = 8192;
        if (j > 0 && j < 8192) {
            FLogger.i("DownloadImpl", "readStream use targeFtSize as buffer size:" + j, new Object[0]);
            i3 = (int) j;
        }
        this.l = null;
        int speedLimit = this.d.p().getSpeedLimit();
        if (speedLimit > 0) {
            this.l = new i(this.d.p().getSpeedLimit());
            if (speedLimit < i3 / 2) {
                i3 = speedLimit * 2;
            }
            FLogger.i("DownloadImpl", "readStream enable SpeedLimit for:" + speedLimit + " byte/s,readLength:" + i3, new Object[0]);
        }
        FLogger.i("DownloadImpl", "readStream start targetSize:" + j + ", readBuffer:" + i3, new Object[0]);
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[1048576];
        long jCurrentTimeMillis = System.currentTimeMillis() - 500;
        int i4 = 0;
        while (true) {
            try {
                if (!this.d.h()) {
                    try {
                        int iA2 = a(i3);
                        if (!this.d.h()) {
                            if (iA2 <= 0) {
                                try {
                                    FLogger.e("DownloadImpl", "test limitedByteSize is zero");
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    bArr2 = bArr2;
                                    str3 = str4;
                                }
                            } else {
                                int i5 = i3;
                                int i6 = bufferedInputStream.read(bArr, 0, iA2);
                                if (i6 > 0) {
                                    this.i = 0;
                                    byte[] bArr3 = bArr2;
                                    byte[] bArr4 = bArr;
                                    long j3 = j2 + ((long) i6);
                                    try {
                                        str3 = str4;
                                        try {
                                            this.d.a(j3, j, i5);
                                            if (this.d.h()) {
                                                iA = i4;
                                                bArr2 = bArr3;
                                                if (iA > 0) {
                                                    try {
                                                        iA = a(randomAccessFile, bArr2, iA);
                                                    } catch (IOException e) {
                                                        FLogger.e("DownloadImpl", "writeFile exception2", e);
                                                        throw new FileManagerException(Constants.ErrorCode.WRITE_FILE_EXCEPTION, "writeFile exception2");
                                                    }
                                                }
                                                if (iA > 0) {
                                                    try {
                                                        a(randomAccessFile, bArr2, iA);
                                                        return;
                                                    } catch (IOException e2) {
                                                        FLogger.e("DownloadImpl", str3, e2);
                                                        return;
                                                    }
                                                }
                                                return;
                                            }
                                            if (!new File(str).exists()) {
                                                iA = i4;
                                                bArr2 = bArr3;
                                                throw new FileManagerException(Constants.ErrorCode.FILE_NO_EXIST);
                                            }
                                            iA = i4;
                                            if (i6 + iA <= 1048576) {
                                                try {
                                                    if (System.currentTimeMillis() <= jCurrentTimeMillis + 1000) {
                                                        bArr2 = bArr3;
                                                    } else if (iA > 0) {
                                                        bArr2 = bArr3;
                                                        try {
                                                            int iA3 = a(randomAccessFile, bArr2, iA);
                                                            try {
                                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                                iA = iA3;
                                                            } catch (IOException e3) {
                                                                e = e3;
                                                                FLogger.e("DownloadImpl", "writeFile exception1", e);
                                                                throw new FileManagerException(Constants.ErrorCode.WRITE_FILE_EXCEPTION, "writeFile exception1");
                                                            }
                                                        } catch (IOException e4) {
                                                            e = e4;
                                                        }
                                                    } else {
                                                        bArr2 = bArr3;
                                                    }
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    i4 = iA;
                                                    bArr2 = bArr3;
                                                }
                                            } else if (iA > 0) {
                                                bArr2 = bArr3;
                                                int iA4 = a(randomAccessFile, bArr2, iA);
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                iA = iA4;
                                            } else {
                                                bArr2 = bArr3;
                                            }
                                            try {
                                                System.arraycopy(bArr4, 0, bArr2, iA, i6);
                                                i4 = iA + i6;
                                                if (j <= 0) {
                                                    i2 = i5;
                                                } else {
                                                    if (j3 >= j) {
                                                        FLogger.i("DownloadImpl", "readStream enought target size:" + j, new Object[0]);
                                                        iA = i4;
                                                        if (iA > 0) {
                                                            iA = a(randomAccessFile, bArr2, iA);
                                                        }
                                                        if (iA > 0) {
                                                            a(randomAccessFile, bArr2, iA);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    try {
                                                        i2 = i5;
                                                        if (j3 + ((long) i2) > j) {
                                                            i2 = (int) (j - j3);
                                                            z = false;
                                                            FLogger.i("DownloadImpl", "readStream will read over change readLength:" + i2, new Object[0]);
                                                        }
                                                        bArr2 = bArr2;
                                                        str4 = str3;
                                                        i3 = i2;
                                                        bArr = bArr4;
                                                        j2 = j3;
                                                    } catch (Throwable th5) {
                                                        th2 = th5;
                                                    }
                                                }
                                                z = false;
                                                bArr2 = bArr2;
                                                str4 = str3;
                                                i3 = i2;
                                                bArr = bArr4;
                                                j2 = j3;
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                            }
                                            th2 = th6;
                                            i4 = iA;
                                            th = th2;
                                            str2 = str3;
                                            i = i4;
                                            if (i <= 0) {
                                                throw th;
                                            }
                                            try {
                                                a(randomAccessFile, bArr2, i);
                                                throw th;
                                            } catch (IOException e5) {
                                                FLogger.e("DownloadImpl", str2, e5);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                        }
                                        bArr2 = bArr3;
                                    } catch (Throwable th8) {
                                        th2 = th8;
                                        str3 = str4;
                                        iA = i4;
                                        bArr2 = bArr3;
                                    }
                                    th = th2;
                                    str2 = str3;
                                    i = i4;
                                    if (i <= 0) {
                                        throw th;
                                    }
                                    a(randomAccessFile, bArr2, i);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = str4;
                        th = th;
                        i = i4;
                        if (i <= 0) {
                            throw th;
                        }
                        a(randomAccessFile, bArr2, i);
                        throw th;
                    }
                }
                bArr2 = bArr2;
                str3 = str4;
                iA = i4;
                if (iA > 0) {
                    iA = a(randomAccessFile, bArr2, iA);
                }
                if (iA > 0) {
                    a(randomAccessFile, bArr2, iA);
                    return;
                }
                return;
            } catch (Throwable th10) {
                th = th10;
                str2 = str4;
            }
        }
    }

    private void a(int i, long j, long j2) {
        String str = "[responseCode=" + i + ", hostStr=" + this.f15663b + "]";
        if (i == -1) {
            throw new FileManagerException(Constants.ErrorCode.SERVER_EXCEPTION, str + " download failed,response null, hostStr=" + this.f15663b);
        }
        if (i != 416) {
            if (i != 200 && i != 206 && i != 304) {
                throw new FileManagerException(i, str);
            }
            return;
        }
        String str2 = str + " package= " + this.d.f() + ", storeSize=" + this.d.a() + ", rangeStart=" + j + ", rangeEnd=" + j2;
        FLogger.w("DownloadImpl", "httpErrorcode:" + i, new Object[0]);
        throw new FileManagerException(i, str2);
    }

    private void a() {
        this.j.a(this.d);
    }

    private String a(String str, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                return b(str, map).toString();
            } catch (UnsupportedEncodingException e) {
                FLogger.e("DownloadImpl", "createUrlWithParams errorr:", e);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Response a(Throwable[] thArr) {
        try {
            return this.f.execute();
        } catch (IOException e) {
            FLogger.e("DownloadImpl", "execute ioexception");
            thArr[0] = e;
            return null;
        }
    }

    private Response<ResponseBody> a(String str, long j, long j2, d dVar) throws Throwable {
        Request.Builder builderNewRequest = this.e.newRequest();
        builderNewRequest.options(Utils.convertToJsonString(this.k));
        builderNewRequest.url(str);
        if (dVar.C()) {
            FLogger.i("DownloadImpl", "getDownloadResult needAddRangHeader for start:" + j + ",end:" + j2, new Object[0]);
            String str2 = (j < 0 || j2 < j) ? "" : "bytes=" + j + com.huawei.openalliance.ad.constant.Constants.LINK + j2;
            if (j2 == -1 && j > 0) {
                str2 = "bytes=" + j + com.huawei.openalliance.ad.constant.Constants.LINK;
            }
            if (!Utils.isBlank(str2)) {
                FLogger.i("DownloadImpl", "getDownloadResult add range for slice", new Object[0]);
                builderNewRequest.addHeader("Range", str2);
            }
        }
        Map<String, String> headers = dVar.p().getHeaders();
        if (!headers.isEmpty()) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builderNewRequest.addHeader(entry.getKey(), entry.getValue());
            }
        }
        HashMap map = new HashMap();
        if (!dVar.p().getReportInfos().isEmpty()) {
            map.putAll(dVar.p().getReportInfos());
        }
        if (!map.containsKey("trace_id")) {
            map.put("trace_id", String.valueOf(dVar.p().getId()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map.containsKey("trace_id")) {
                jSONObject.put("trace_id", map.get("trace_id"));
            }
            if (map.containsKey("device_id")) {
                jSONObject.put("device_id", map.get("device_id"));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("metrics_data", jSONObject);
            builderNewRequest.options(jSONObject2.toString());
        } catch (JSONException unused) {
            FLogger.e("DownloadImpl", "getDownloadResult requestBuilder.options exception");
        }
        this.f = this.e.newSubmit(builderNewRequest.build());
        if (dVar.h()) {
            this.f.cancel();
        }
        dVar.a(this.f);
        final Throwable[] thArr = new Throwable[1];
        Future futureSubmit = ExecutorsUtils.newSingleThreadExecutor("DownloadImpl").submit(new Callable() { // from class: com.huawei.hms.network.file.a.a$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.a(thArr);
            }
        });
        Response<ResponseBody> response = (futureSubmit.isCancelled() || dVar.h()) ? null : (Response) futureSubmit.get(2L, TimeUnit.MINUTES);
        Throwable th = thArr[0];
        if (th == null) {
            return response;
        }
        throw th;
    }

    private int a(RandomAccessFile randomAccessFile, byte[] bArr, int i) throws IOException {
        randomAccessFile.write(bArr, 0, i);
        d dVar = this.d;
        long j = i;
        dVar.a(dVar.c() + j);
        this.g += j;
        a();
        return 0;
    }

    private int a(int i) {
        i iVar = this.l;
        return iVar != null ? iVar.a(i) : i;
    }

    public a(GlobalRequestConfig globalRequestConfig, HttpClient httpClient) {
        this.e = httpClient;
        this.k = globalRequestConfig;
    }
}
