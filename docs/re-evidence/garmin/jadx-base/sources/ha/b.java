package ha;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static Bitmap a(int i14, byte[] bArr) throws IOException {
        int i15 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i14, null);
        if (bitmapDecodeByteArray == null) {
            throw ParserException.createForMalformedContainer("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            d8.a aVar = new d8.a(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (aVar.d(1, "Orientation")) {
                case 3:
                case 4:
                    i15 = 180;
                    break;
                case 5:
                case 8:
                    i15 = 270;
                    break;
                case 6:
                case 7:
                    i15 = 90;
                    break;
            }
            if (i15 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i15);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
