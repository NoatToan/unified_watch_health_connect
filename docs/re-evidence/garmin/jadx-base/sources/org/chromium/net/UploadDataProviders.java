package org.chromium.net;

import android.os.ParcelFileDescriptor;
import c73.c;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new c.C0373c(new c73.a(file), 0);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new c.C0373c(new c73.b(parcelFileDescriptor), 0);
    }

    public static UploadDataProvider create(byte[] bArr, int i14, int i15) {
        return c.a(i14, i15, bArr);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c.a(byteBuffer.slice(), 0);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return c.a(0, bArr.length, bArr);
    }
}
