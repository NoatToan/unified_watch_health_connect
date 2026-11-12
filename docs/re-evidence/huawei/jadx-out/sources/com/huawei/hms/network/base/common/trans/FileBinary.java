package com.huawei.hms.network.base.common.trans;

import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class FileBinary implements Binary {
    public static final String HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14510b = "FileBinary";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f14511a;

    @Override // com.huawei.hms.network.base.common.trans.Binary
    public void onWriteBinary(OutputStream outputStream) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getInputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        IoUtils.closeSecure(inputStream);
                        return;
                    }
                    outputStream.write(bArr, 0, i);
                }
            } catch (IOException e) {
                Logger.w(f14510b, "the file is reading but has error!");
                throw e;
            }
        } catch (Throwable th) {
            IoUtils.closeSecure(inputStream);
            throw th;
        }
    }

    @Override // com.huawei.hms.network.base.common.trans.Binary
    public long getLength() {
        return this.f14511a.length();
    }

    public InputStream getInputStream() {
        return new FileInputStream(this.f14511a);
    }

    public FileBinary(File file, String str) {
        if (file != null) {
            this.f14511a = file;
        } else {
            throw new IllegalArgumentException("File is null: " + str);
        }
    }

    public FileBinary(File file) {
        this(file, file == null ? "" : file.getName());
    }
}
