package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.huawei.appgallery.markethomecountrysdk.f;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class bia {
    public static String b(Context context) {
        String strE;
        try {
            ServiceVerifyKit.Builder builder = new ServiceVerifyKit.Builder();
            builder.a(context).c(new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId"), ServiceVerifyKit.Builder.ComponentType.ACTIVITY);
            f fVarB = bhs.b(context);
            Iterator<String> it = fVarB.b().iterator();
            while (it.hasNext()) {
                builder.d(fVarB.a(), it.next());
            }
            if (bhw.c(context) == 2) {
                builder.d("com.huawei.appmarketwear", "CE1EF7188F820973C191227D95D54311ED3A65EC83E37009E898A1C058BBC775");
            }
            strE = builder.e();
            try {
                Log.d("ServiceVerifyKitUtils", "genVerifiedPackageName, get market packageName from verify kit is: " + strE);
                return strE;
            } catch (Throwable unused) {
                Log.e("ServiceVerifyKitUtils", "genVerifiedPackageName error");
                return strE;
            }
        } catch (Throwable unused2) {
            strE = null;
        }
    }
}
