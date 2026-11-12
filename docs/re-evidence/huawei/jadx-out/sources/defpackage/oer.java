package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.networkclient.IDownloadStrategy;
import com.huawei.networkclient.ProgressListener;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class oer implements IDownloadStrategy<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f44242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProgressListener<File> f44243c;
    private String d;
    private Map<String, String> e;
    private String f;
    private File i;

    public oer(String str, Map<String, String> map, File file, ProgressListener<File> progressListener, String str2, int i) {
        this.i = null;
        this.f = str;
        this.f44243c = progressListener;
        this.f44242b = file;
        this.e = map;
        this.f44241a = i;
        this.d = str2;
    }

    public oer(String str, Map<String, String> map, File file, File file2, ProgressListener<File> progressListener) {
        this.f = str;
        this.f44243c = progressListener;
        this.f44242b = file;
        this.e = map;
        this.i = file2;
        this.d = null;
        this.f44241a = 1;
    }

    public oer(String str, Map<String, String> map, File file, ProgressListener<File> progressListener) {
        this(str, map, file, progressListener, null, 1);
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return this.f;
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public int getRequestMethod() {
        return this.f44241a;
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public String getRequestBody() {
        return this.d;
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public Map<String, String> getHeaders() {
        return this.e;
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public ProgressListener<File> getListener() {
        return this.f44243c;
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public void handleResponseBody(ResponseBody responseBody, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean zC = oet.d().c(getUrl());
        if (!zC && this.i == null) {
            FileUtils.b(this.f44242b);
        }
        FileUtils.b(this.i);
        InputStream inputStream = responseBody.getInputStream();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                byte[] bArr = new byte[8192];
                File file = this.i;
                if (file == null) {
                    file = this.f44242b;
                }
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            zC = oet.d().c(getUrl());
                            if (!zC) {
                                fileOutputStream.write(bArr, 0, i2);
                            } else {
                                LogUtil.b("FileDownloadStrategy", "is canceled, stop write to file");
                                handleException(new Throwable("is canceled, stop write to file"), i);
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        LogUtil.d("FileDownloadStrategy", "download io fail:", ExceptionUtils.c(e));
                        handleException(e, i);
                        FileUtils.a(responseBody);
                        FileUtils.a(inputStream);
                        FileUtils.a(fileOutputStream2);
                        LogUtil.d("FileDownloadStrategy", "download is broken, delete incomplete file");
                        File file2 = this.i;
                        if (file2 == null) {
                            file2 = this.f44242b;
                        }
                        FileUtils.b(file2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        FileUtils.a(responseBody);
                        FileUtils.a(inputStream);
                        FileUtils.a(fileOutputStream);
                        if (zC || oet.d().c(getUrl())) {
                            LogUtil.d("FileDownloadStrategy", "download is broken, delete incomplete file");
                            File file3 = this.i;
                            if (file3 == null) {
                                file3 = this.f44242b;
                            }
                            FileUtils.b(file3);
                        } else {
                            File file4 = this.i;
                            if (file4 != null) {
                                try {
                                    FileUtils.e(file4, this.f44242b);
                                    this.f44243c.onFinish(this.f44242b);
                                } catch (IOException e2) {
                                    handleException(e2, i);
                                }
                                FileUtils.b(this.i);
                            } else {
                                this.f44243c.onFinish(this.f44242b);
                            }
                        }
                        throw th;
                    }
                }
                fileOutputStream.flush();
                FileUtils.a(responseBody);
                FileUtils.a(inputStream);
                FileUtils.a(fileOutputStream);
                if (zC || oet.d().c(getUrl())) {
                    LogUtil.d("FileDownloadStrategy", "download is broken, delete incomplete file");
                    File file5 = this.i;
                    if (file5 == null) {
                        file5 = this.f44242b;
                    }
                    FileUtils.b(file5);
                    return;
                }
                File file6 = this.i;
                if (file6 != null) {
                    try {
                        FileUtils.e(file6, this.f44242b);
                        this.f44243c.onFinish(this.f44242b);
                    } catch (IOException e3) {
                        handleException(e3, i);
                    }
                    FileUtils.b(this.i);
                    return;
                }
                this.f44243c.onFinish(this.f44242b);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    @Override // com.huawei.networkclient.IDownloadStrategy
    public void handleException(Throwable th, int i) {
        LogUtil.d("FileDownloadStrategy", "get exception:", ExceptionUtils.c(th), " errCode:", Integer.valueOf(i));
        File file = this.i;
        if (file == null) {
            FileUtils.j(this.f44242b);
        } else {
            FileUtils.j(file);
        }
        this.f44243c.onFail(th);
    }
}
