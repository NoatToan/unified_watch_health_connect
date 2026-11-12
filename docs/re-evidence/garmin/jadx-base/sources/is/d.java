package is;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static final Bitmap a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return Build.VERSION.SDK_INT >= 29 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri)) : MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        } catch (IOException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            String str = "Failed to retrieve bitmap from  " + uri + " : " + e4.getMessage();
            aVar.getClass();
            i2.a.f(a2Var, "ShareUtil", str);
            return null;
        }
    }
}
