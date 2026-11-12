package com.huawei.hms.network.file.b;

import android.text.TextUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.hms.network.file.api.RequestManager;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.upload.api.FileEntity;
import com.huawei.hms.network.httpclient.RequestBody;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f15713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.hms.network.file.core.task.f f15714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<FileEntity> f15715c;
    long d;

    /* JADX WARN: Code restructure failed: missing block: B:116:0x025e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0260, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0262, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ea, code lost:
    
        r25.f15714b.a(r25.f15713a);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:? -> B:93:0x01f2). Please report as a decompilation issue!!! */
    @Override // com.huawei.hms.network.httpclient.RequestBody
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeTo(OutputStream outputStream) throws Throwable {
        long j;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3;
        RandomAccessFile randomAccessFile4;
        long j2;
        RandomAccessFile randomAccessFileA;
        int i;
        int i2;
        int i3 = 0;
        FLogger.i("UploadRequestBody", "UploadRequestBody writeTo", new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f15713a.c(jCurrentTimeMillis - this.f15713a.y());
        int i4 = 0;
        InputStream inputStreamOpenInputStream = null;
        for (Iterator<FileEntity> it = this.f15715c.iterator(); it.hasNext(); it = it) {
            FileEntity next = it.next();
            if (next.getStartPos() < 0) {
                FLogger.w("UploadRequestBody", "upload file startPos is " + next.getStartPos() + " < 0", new Object[i3]);
            }
            i4++;
            long uploadSize = next.getUploadSize();
            int i5 = uploadSize > 1048576 ? 1048576 : (int) uploadSize;
            int i6 = next.getUri() == null ? 1 : i3;
            FLogger.d("UploadRequestBody", "writeTo file-" + i4 + ",fileInfo:" + next, new Object[i3]);
            try {
                if (uploadSize <= 0) {
                    FLogger.e("UploadRequestBody", "startPos is greater than or equal to fileSize,fileInfo:" + next);
                    throw new FileManagerException(Constants.ErrorCode.TASK_UPLOAD_PARAMS_COMMON_ERROR, "startPos is greater than or equal to fileSize");
                }
                try {
                    byte[] bArr = new byte[i5];
                    File file = next.getFile();
                    if (i6 != 0) {
                        randomAccessFileA = com.huawei.hms.network.file.core.util.c.a(file.getCanonicalPath(), "r");
                        if (randomAccessFileA == null) {
                            throw new FileManagerException(Constants.ErrorCode.FILE_NO_EXIST);
                        }
                        try {
                            if (next.getStartPos() + uploadSize > randomAccessFileA.length()) {
                                FLogger.e("UploadRequestBody", "uploadTask pos + upload length is outoff filesize,fileInfo:" + this.f15713a);
                                throw new FileManagerException(Constants.ErrorCode.TASK_UPLOAD_PARAMS_ERROR);
                            }
                            randomAccessFileA.seek(next.getStartPos());
                            j2 = 0;
                        } catch (FileManagerException e) {
                            e = e;
                            randomAccessFile4 = randomAccessFileA;
                            FLogger.e("UploadRequestBody", "upload failed FileManagerException,convert to IOException", e);
                            throw new IOException(e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            randomAccessFile3 = randomAccessFileA;
                            FLogger.e("UploadRequestBody", "upload failed RuntimeException,convert to InterruptedIOException", e);
                            throw new InterruptedIOException(e.getMessage());
                        } catch (Exception e3) {
                            e = e3;
                            randomAccessFile2 = randomAccessFileA;
                            FLogger.e("UploadRequestBody", "upload failed Exception,convert to InterruptedIOException", e);
                            throw new InterruptedIOException(StringUtils.anonymizeMessage(e.getMessage()));
                        } catch (Throwable th) {
                            th = th;
                            j = jCurrentTimeMillis;
                            randomAccessFile = randomAccessFileA;
                            Utils.close(randomAccessFile);
                            Utils.close(inputStreamOpenInputStream);
                            this.f15713a.d(System.currentTimeMillis() - j);
                            throw th;
                        }
                    } else {
                        inputStreamOpenInputStream = RequestManager.getAppContext().getContentResolver().openInputStream(next.getUri());
                        if (inputStreamOpenInputStream == null) {
                            throw new FileManagerException(Constants.ErrorCode.TASK_UPLOAD_INPUT_STREAM_ERROR);
                        }
                        j2 = 0;
                        if (next.getStartPos() > 0) {
                            long jSkip = inputStreamOpenInputStream.skip(next.getStartPos());
                            if (jSkip != next.getStartPos()) {
                                FLogger.w("UploadRequestBody", "skip failed for：" + jSkip + ",startPos:" + next.getStartPos(), new Object[0]);
                            }
                        }
                        randomAccessFileA = null;
                    }
                    int i7 = i5;
                    int i8 = 0;
                    boolean z = i6;
                    while (i7 > 0) {
                        if (z != 0) {
                            if (randomAccessFileA == null) {
                                throw new FileManagerException(Constants.ErrorCode.FILE_NO_EXIST);
                            }
                            try {
                                i = randomAccessFileA.read(bArr, i8, i7);
                            } catch (FileManagerException e4) {
                                e = e4;
                                FLogger.e("UploadRequestBody", "upload failed FileManagerException,convert to IOException", e);
                                throw new IOException(e);
                            } catch (RuntimeException e5) {
                                e = e5;
                                FLogger.e("UploadRequestBody", "upload failed RuntimeException,convert to InterruptedIOException", e);
                                throw new InterruptedIOException(e.getMessage());
                            } catch (Exception e6) {
                                e = e6;
                                FLogger.e("UploadRequestBody", "upload failed Exception,convert to InterruptedIOException", e);
                                throw new InterruptedIOException(StringUtils.anonymizeMessage(e.getMessage()));
                            } catch (Throwable th2) {
                                th = th2;
                                j = jCurrentTimeMillis;
                                randomAccessFile = randomAccessFileA;
                                Utils.close(randomAccessFile);
                                Utils.close(inputStreamOpenInputStream);
                                this.f15713a.d(System.currentTimeMillis() - j);
                                throw th;
                            }
                        } else {
                            if (inputStreamOpenInputStream == null) {
                                throw new FileManagerException(Constants.ErrorCode.TASK_UPLOAD_INPUT_STREAM_ERROR);
                            }
                            i = inputStreamOpenInputStream.read(bArr, i8, i7);
                        }
                        if (i <= 0) {
                            break;
                        }
                        long j3 = uploadSize;
                        long j4 = i;
                        j2 += j4;
                        i8 += i;
                        a(next, z);
                        if (i8 >= i5) {
                            outputStream.write(bArr, 0, i8);
                            synchronized (this.f15713a) {
                                f fVar = this.f15713a;
                                fVar.a(fVar.c() + j4);
                            }
                            this.f15714b.a(this.f15713a);
                            i2 = i5;
                            i8 = 0;
                        } else {
                            i2 = i5 - i8;
                        }
                        long j5 = j3 - j2;
                        boolean z2 = z;
                        i7 = j5 < ((long) i2) ? (int) j5 : i2;
                        if (this.f15713a.h()) {
                            break;
                        }
                        uploadSize = j3;
                        z = z2 ? 1 : 0;
                    }
                    long j6 = j2;
                    if (i8 > 0) {
                        outputStream.write(bArr, 0, i8);
                        synchronized (this.f15713a) {
                            try {
                                f fVar2 = this.f15713a;
                                j = jCurrentTimeMillis;
                                try {
                                    fVar2.a(fVar2.c() + ((long) i8));
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = jCurrentTimeMillis;
                    if (!this.f15713a.h()) {
                        this.f15713a.a(true);
                    }
                    i3 = 0;
                    FLogger.i("UploadRequestBody", "upload Success for:" + next + ",read sum:" + j6, new Object[0]);
                    Utils.close(randomAccessFileA);
                    Utils.close(inputStreamOpenInputStream);
                    this.f15713a.d(System.currentTimeMillis() - j);
                    if (this.f15713a.h()) {
                        return;
                    }
                    jCurrentTimeMillis = j;
                } catch (FileManagerException e7) {
                    e = e7;
                    randomAccessFile4 = null;
                    FLogger.e("UploadRequestBody", "upload failed FileManagerException,convert to IOException", e);
                    throw new IOException(e);
                } catch (RuntimeException e8) {
                    e = e8;
                    randomAccessFile3 = null;
                    FLogger.e("UploadRequestBody", "upload failed RuntimeException,convert to InterruptedIOException", e);
                    throw new InterruptedIOException(e.getMessage());
                } catch (Exception e9) {
                    e = e9;
                    randomAccessFile2 = null;
                    FLogger.e("UploadRequestBody", "upload failed Exception,convert to InterruptedIOException", e);
                    throw new InterruptedIOException(StringUtils.anonymizeMessage(e.getMessage()));
                } catch (Throwable th5) {
                    th = th5;
                    j = jCurrentTimeMillis;
                    randomAccessFile = null;
                    Utils.close(randomAccessFile);
                    Utils.close(inputStreamOpenInputStream);
                    this.f15713a.d(System.currentTimeMillis() - j);
                    throw th;
                }
            } catch (FileManagerException e10) {
                e = e10;
            } catch (RuntimeException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public String contentType() {
        Map<String, String> headers = this.f15713a.p().getHeaders();
        return (headers.isEmpty() || TextUtils.isEmpty(headers.get("Content-Type"))) ? FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM : headers.get("Content-Type");
    }

    @Override // com.huawei.hms.network.httpclient.RequestBody
    public long contentLength() {
        return this.d;
    }

    private void a(List<FileEntity> list) {
        this.f15715c = new ArrayList();
        this.d = 0L;
        if (Utils.isEmpty(list)) {
            return;
        }
        this.f15715c.addAll(list);
        Iterator<FileEntity> it = this.f15715c.iterator();
        while (it.hasNext()) {
            this.d += it.next().getUploadSize();
        }
    }

    private void a(FileEntity fileEntity, boolean z) {
        if (z) {
            if (!new File(fileEntity.getFile().getPath()).exists()) {
                throw new FileManagerException(Constants.ErrorCode.FILE_UPLOAD_NO_EXIST.getErrorCode(), "upload file is no exists");
            }
            return;
        }
        try {
            try {
                Utils.close(RequestManager.getAppContext().getContentResolver().openInputStream(fileEntity.getUri()));
            } catch (FileNotFoundException unused) {
                throw new FileManagerException(Constants.ErrorCode.FILE_UPLOAD_NO_EXIST.getErrorCode(), "upload file is no exists for uri");
            }
        } catch (Throwable th) {
            Utils.close(null);
            throw th;
        }
    }

    public c(f fVar, List<FileEntity> list, com.huawei.hms.network.file.core.task.f fVar2) {
        this.f15713a = fVar;
        this.f15714b = fVar2;
        a(list);
    }
}
