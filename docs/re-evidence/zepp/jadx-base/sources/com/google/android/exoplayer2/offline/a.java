package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class a {
    private static final int b = 0;
    private static final String c = "progressive";
    private static final String d = "dash";
    private static final String e = "hls";
    private static final String f = "ss";
    private final AtomicFile a;

    public a(File actionFile) {
        this.a = new AtomicFile(actionFile);
    }

    private static String c(Uri uri, @Nullable String customCacheKey) {
        return customCacheKey != null ? customCacheKey : uri.toString();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    private static String d(String downloadType) {
        byte b2;
        int iHashCode = downloadType.hashCode();
        if (iHashCode != 3680) {
            if (iHashCode != 103407) {
                if (iHashCode != 3075986) {
                    if (iHashCode == 1131547531 && downloadType.equals(c)) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (downloadType.equals(d)) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (downloadType.equals(e)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (downloadType.equals(f)) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (b2 != 1) {
            return b2 != 2 ? MimeTypes.VIDEO_UNKNOWN : MimeTypes.APPLICATION_SS;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    private static DownloadRequest f(DataInputStream input) throws IOException {
        byte[] bArr;
        String utf = input.readUTF();
        int i = input.readInt();
        Uri uri = Uri.parse(input.readUTF());
        boolean z = input.readBoolean();
        int i2 = input.readInt();
        String utf2 = null;
        if (i2 != 0) {
            bArr = new byte[i2];
            input.readFully(bArr);
        } else {
            bArr = null;
        }
        boolean z2 = true;
        boolean z3 = i == 0 && c.equals(utf);
        ArrayList arrayList = new ArrayList();
        if (!z3) {
            int i3 = input.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(g(utf, i, input));
            }
        }
        if (i >= 2 || (!d.equals(utf) && !e.equals(utf) && !f.equals(utf))) {
            z2 = false;
        }
        if (!z2 && input.readBoolean()) {
            utf2 = input.readUTF();
        }
        String strC = i < 3 ? c(uri, utf2) : input.readUTF();
        if (z) {
            throw new DownloadRequest.UnsupportedRequestException();
        }
        return new DownloadRequest.Builder(strC, uri).setMimeType(d(utf)).setStreamKeys(arrayList).setCustomCacheKey(utf2).setData(bArr).build();
    }

    private static StreamKey g(String type, int version, DataInputStream input) throws IOException {
        int i;
        int i2;
        int i3;
        if ((e.equals(type) || f.equals(type)) && version == 0) {
            i = 0;
            i2 = input.readInt();
            i3 = input.readInt();
        } else {
            i = input.readInt();
            i2 = input.readInt();
            i3 = input.readInt();
        }
        return new StreamKey(i, i2, i3);
    }

    public void a() {
        this.a.delete();
    }

    public boolean b() {
        return this.a.exists();
    }

    public DownloadRequest[] e() throws IOException {
        if (!b()) {
            return new DownloadRequest[0];
        }
        try {
            InputStream inputStreamOpenRead = this.a.openRead();
            DataInputStream dataInputStream = new DataInputStream(inputStreamOpenRead);
            int i = dataInputStream.readInt();
            if (i > 0) {
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported action file version: ");
                sb.append(i);
                throw new IOException(sb.toString());
            }
            int i2 = dataInputStream.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    arrayList.add(f(dataInputStream));
                } catch (DownloadRequest.UnsupportedRequestException unused) {
                }
            }
            DownloadRequest[] downloadRequestArr = (DownloadRequest[]) arrayList.toArray(new DownloadRequest[0]);
            Util.closeQuietly(inputStreamOpenRead);
            return downloadRequestArr;
        } catch (Throwable th) {
            Util.closeQuietly((Closeable) null);
            throw th;
        }
    }
}
