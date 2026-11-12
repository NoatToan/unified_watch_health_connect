package com.miui.tsmclient.common.net.request;

import com.miui.tsmclient.common.net.FileRequestCallback;
import com.miui.tsmclient.common.net.RequestCallback;
import com.miui.tsmclient.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class FileRequest extends BaseRequest<File> {
    private static final int BUFFER_SIZE = 1024;
    private File mFile;
    private FileRequestCallback mFileRequestCallback;

    public FileRequest(String str, File file, RequestCallback requestCallback) {
        super("GET", str, requestCallback);
        this.mRequestType = BaseRequest.RequestType.NORMAL;
        this.mFile = file;
        if (requestCallback instanceof FileRequestCallback) {
            this.mFileRequestCallback = (FileRequestCallback) requestCallback;
        }
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isStringResponse() {
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public File parseBody(boolean z, InputStream inputStream, long j) throws IOException {
        FileRequestCallback fileRequestCallback;
        if (z) {
            File file = this.mFile;
            if (file != null && file.canWrite()) {
                FileOutputStream fileOutputStream = new FileOutputStream(this.mFile);
                long j2 = 0;
                if (j > 0) {
                    try {
                        fileRequestCallback = this.mFileRequestCallback;
                    } finally {
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    }
                } else {
                    fileRequestCallback = null;
                }
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                        if (fileRequestCallback != null) {
                            j2 += (long) i;
                            fileRequestCallback.onProgress((int) (((j2 * 1.0f) / j) * 100.0f));
                        }
                    } else {
                        fileOutputStream.flush();
                        return this.mFile;
                    }
                }
            } else {
                throw new IOException("the saving path is invalid");
            }
        } else {
            throw new IOException("http code is incorrect");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public File parseBody(boolean z, String str) throws IOException {
        throw new UnsupportedOperationException();
    }
}
