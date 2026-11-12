package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class jxj {
    public static Drawable d(String str, int i) {
        LogUtil.a("SportRecordImageHelper", "getSportRecordDrawable imageName = ", str);
        String str2 = fdy.d("com.huawei.health_Sport_Common", "sport_record_image", (String) null) + File.separator;
        BitmapDrawable bitmapDrawableB = qqf.b(str2 + str + ".webp");
        if (bitmapDrawableB != null) {
            return bitmapDrawableB;
        }
        BitmapDrawable bitmapDrawableB2 = qqf.b(str2 + str + ".png");
        return bitmapDrawableB2 != null ? bitmapDrawableB2 : BaseApplication.b().getDrawable(i);
    }

    public static Drawable c(String str) {
        LogUtil.a("SportRecordImageHelper", "getSportRecordDrawable imageName = ", str);
        String str2 = fdy.d("com.huawei.health_Sport_Common", "sport_record_image", (String) null) + File.separator;
        BitmapDrawable bitmapDrawableB = qqf.b(str2 + str + ".webp");
        if (bitmapDrawableB != null) {
            return bitmapDrawableB;
        }
        return qqf.b(str2 + str + ".png");
    }
}
