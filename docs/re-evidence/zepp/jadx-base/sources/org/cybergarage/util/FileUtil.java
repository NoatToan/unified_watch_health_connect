package org.cybergarage.util;

import com.huami.view.basetitle.IdGetter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes23.dex */
public final class FileUtil {
    public static final boolean isXMLFileName(String str) {
        if (StringUtil.hasData(str)) {
            return str.toLowerCase().endsWith(IdGetter.xml);
        }
        return false;
    }

    public static final byte[] load(String str) {
        try {
            return load(new FileInputStream(str));
        } catch (Exception e) {
            Debug.warning(e);
            return new byte[0];
        }
    }

    public static final byte[] load(File file) {
        try {
            return load(new FileInputStream(file));
        } catch (Exception e) {
            Debug.warning(e);
            return new byte[0];
        }
    }

    public static final byte[] load(FileInputStream fileInputStream) {
        byte[] bArr = new byte[524288];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = fileInputStream.read(bArr);
            while (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
                i = fileInputStream.read(bArr);
            }
            fileInputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.warning(e);
            return new byte[0];
        }
    }
}
