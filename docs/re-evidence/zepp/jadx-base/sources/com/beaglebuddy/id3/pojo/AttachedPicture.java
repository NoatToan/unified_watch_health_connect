package com.beaglebuddy.id3.pojo;

import com.beaglebuddy.id3.enums.PictureType;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.ad.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public class AttachedPicture {
    private static Hashtable<String, String> e;
    private PictureType a;
    private String b;
    private String c;
    private byte[] d;

    static {
        Hashtable<String, String> hashtable = new Hashtable<>();
        e = hashtable;
        hashtable.put("jpg", "image/jpg");
        e.put(Constants.GIF_PATH, "image/gif");
        e.put("png", "image/png");
        e.put("bmp", "image/bmp");
    }

    public AttachedPicture(PictureType pictureType, String str) throws IOException {
        this(pictureType, new File(str));
    }

    private static String a(String str) {
        String strSubstring = str.substring(str.lastIndexOf(46) + 1);
        return e.get(strSubstring) == null ? "image/" : e.get(strSubstring);
    }

    public String getDescription() {
        return this.c;
    }

    public byte[] getImage() {
        return this.d;
    }

    public String getMimeType() {
        return this.b;
    }

    public PictureType getPictureType() {
        return this.a;
    }

    public void setDescription(String str) {
        this.c = str.trim();
    }

    public void setImage(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("The raw bytes of the image may not be empty.");
        }
        this.d = bArr;
    }

    public void setMimeType(String str) {
        if (str != null && str.trim().startsWith("image")) {
            this.b = str.trim();
            return;
        }
        throw new IllegalArgumentException("Invalid mime type, " + str + ".  It must be a valid image mime type such as \"image\", \"image/jpg\", \"image/gif\", etc.");
    }

    public void setPictureType(PictureType pictureType) {
        if (pictureType == null) {
            throw new IllegalArgumentException("The picture type may not be empty.");
        }
        this.a = pictureType;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("picture type: " + this.a + "\n");
        stringBuffer.append("mime type...: " + this.b + "\n");
        stringBuffer.append("description.: " + this.c + "\n");
        stringBuffer.append("image.......: " + this.d.length + " bytes");
        return stringBuffer.toString();
    }

    public AttachedPicture(PictureType pictureType, File file) throws IOException {
        this(pictureType, a(file.getPath()), pictureType.getDescription(), file);
    }

    public AttachedPicture(PictureType pictureType, String str, String str2, String str3) throws IOException {
        this(pictureType, str, str2, new File(str3));
    }

    public AttachedPicture(PictureType pictureType, String str, String str2, File file) throws IOException {
        if (file.exists() && file.isFile()) {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                if (fileInputStream.read(bArr) == length) {
                    setPictureType(pictureType);
                    setMimeType(str);
                    setDescription(str2);
                    setImage(bArr);
                    try {
                        fileInputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                throw new IOException("unable to load the image file at " + file.getPath());
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        }
        throw new IllegalArgumentException(file.getPath() + " does not refer to a valid image file.");
    }

    public AttachedPicture(PictureType pictureType, URL url) throws IOException {
        this(pictureType, a(url.toExternalForm()), pictureType.getDescription(), url);
    }

    public AttachedPicture(PictureType pictureType, String str, String str2, URL url) throws IOException {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        uRLConnection.connect();
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        int contentLength = uRLConnection.getContentLength();
        byte[] bArr = new byte[contentLength];
        try {
            if (inputStreamOpenStream.read(bArr) == contentLength) {
                setPictureType(pictureType);
                setMimeType(str);
                setDescription(str2);
                setImage(bArr);
                try {
                    inputStreamOpenStream.close();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            throw new IOException("unable to load the image file from " + url.toExternalForm());
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public AttachedPicture(PictureType pictureType, String str, String str2, byte[] bArr) {
        setPictureType(pictureType);
        setMimeType(str);
        setDescription(str2);
        setImage(bArr);
    }
}
