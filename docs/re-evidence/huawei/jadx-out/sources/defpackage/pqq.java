package defpackage;

import android.content.Context;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public class pqq {
    public static String c(Context context) {
        return pqj.e();
    }

    public static pqp b(Context context, String str) {
        return pqp.c(c(context), pqj.b().d(pqj.e()), str, context.getResources().getConfiguration().locale);
    }

    public static boolean b(String str, String str2) {
        AudioResProviderInterface audioResProviderInterface = (AudioResProviderInterface) AppRouter.e(AudioResProviderInterface.ROUTER_PATH_AUDIO_RES_PROVIDER, AudioResProviderInterface.class);
        if (audioResProviderInterface != null) {
            pql audioResPath = audioResProviderInterface.getAudioResPath(str, pqj.b().d(pqj.e()), str2);
            String strE = audioResPath.e();
            String strC = audioResPath.c();
            String strA = audioResPath.a();
            String strB = audioResPath.b();
            return strC != null && strE != null && strA != null && strB != null && new File(strE).exists() && new File(strC).exists() && new File(strA).exists() && new File(strB).exists();
        }
        LogUtil.j("MultilingualAudioUtil", "service is null");
        return false;
    }

    public static String e(String str, String str2) {
        return fdy.d(str2, str + "_" + pqj.b().d(pqj.e()), (String) null);
    }
}
