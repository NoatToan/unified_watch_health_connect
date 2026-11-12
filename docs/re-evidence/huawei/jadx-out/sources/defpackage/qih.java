package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes43.dex */
public class qih {
    public static Bitmap c(Context context, String str) {
        return BitmapFactory.decodeStream(b(context, str));
    }

    public static InputStream b(Context context, String str) {
        qid.e("AssetsHelper", qid.a());
        try {
            return context.getAssets().open(str);
        } catch (IOException e) {
            e.printStackTrace();
            qid.e("AssetsHelper", qid.a() + " e=" + e.getMessage());
            return null;
        }
    }
}
