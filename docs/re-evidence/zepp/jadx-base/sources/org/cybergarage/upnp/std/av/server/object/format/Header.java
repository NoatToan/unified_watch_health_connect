package org.cybergarage.upnp.std.av.server.object.format;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.cybergarage.util.Debug;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Header {
    public static final byte[] getID(InputStream inputStream, int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = new byte[i3];
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            for (int i4 = 0; i4 < i3; i4++) {
                byte b = dataInputStream.readByte();
                if (i4 >= i) {
                    bArr[i4 - i] = b;
                }
            }
            dataInputStream.close();
        } catch (EOFException unused) {
        } catch (Exception e) {
            Debug.warning(e);
        }
        return bArr;
    }

    public static final String getIDString(InputStream inputStream, int i, int i2) {
        return new String(getID(inputStream, i, i2));
    }

    public static final String getSuffix(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        return iLastIndexOf < 0 ? "" : name.substring(iLastIndexOf + 1, name.length());
    }

    public static final String getIDString(InputStream inputStream, int i) {
        return new String(getID(inputStream, i));
    }

    public static final String getIDString(File file, int i, int i2) {
        try {
            return getIDString(new FileInputStream(file), i, i2);
        } catch (Exception e) {
            Debug.warning(e);
            return "";
        }
    }

    public static final String getIDString(File file, int i) {
        return getIDString(file, 0, i);
    }

    public static final byte[] getID(InputStream inputStream, int i) {
        return getID(inputStream, 0, i);
    }

    public static final byte[] getID(File file, int i) {
        try {
            return getID(new FileInputStream(file), i);
        } catch (Exception e) {
            Debug.warning(e);
            return new byte[0];
        }
    }
}
