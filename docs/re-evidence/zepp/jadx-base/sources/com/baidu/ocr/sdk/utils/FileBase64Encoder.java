package com.baidu.ocr.sdk.utils;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class FileBase64Encoder {
    private byte[] buffer = new byte[24576];
    private InputStream inputStream;

    private void closeInputStream() {
        try {
            try {
                this.inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.inputStream = null;
        }
    }

    public byte[] encode() {
        try {
            int i = this.inputStream.read(this.buffer);
            if (i != -1) {
                return Base64.encode(this.buffer, 0, i, 2);
            }
            closeInputStream();
            return null;
        } catch (IOException e) {
            closeInputStream();
            e.printStackTrace();
            return null;
        }
    }

    public void setInputFile(File file) throws FileNotFoundException {
        this.inputStream = new FileInputStream(file);
    }
}
