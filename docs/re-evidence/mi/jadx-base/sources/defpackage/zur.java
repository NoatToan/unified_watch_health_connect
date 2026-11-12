package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.bundle.config.YRNBundleError;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class zur {
    public static boolean a(String str, String str2) throws Exception {
        zxr.a("YRN_YRNV3_SDK", "YRNBundleVerifier.verifyBundle: " + str2);
        if (TextUtils.isEmpty(str2)) {
            String strA = yur.a(YRNBundleError.VERIFY_ERROR, "YRNBundleVerifier.verifyBundle: cachePath == null");
            zxr.b("YRN_YRNV3_SDK", strA);
            throw new Exception(strA);
        }
        File file = new File(str2);
        if (!file.exists()) {
            String strA2 = yur.a(YRNBundleError.VERIFY_ERROR, "YRNBundleVerifier.verifyBundle: file:" + str2 + " does not exist");
            zxr.b("YRN_YRNV3_SDK", strA2);
            throw new Exception(strA2);
        }
        String strF = wwr.f(file);
        if (TextUtils.equals(strF, str)) {
            zxr.a("YRN_YRNV3_SDK", "YRNBundleVerifier.verifyBundle:success " + str2);
            return true;
        }
        String strA3 = yur.a(YRNBundleError.VERIFY_ERROR, "YRNBundleVerifier.verifyBundle: md5 does not equal :" + str + " | " + strF + " | file size:" + file.length());
        zxr.b("YRN_YRNV3_SDK", strA3);
        file.delete();
        throw new Exception(strA3);
    }

    public static List<YRNBundleInfo> b(List<YRNBundleInfo> list, List<YRNBundleInfo> list2) {
        if (list2 == null) {
            return null;
        }
        if (list != null && list.size() != 0) {
            for (YRNBundleInfo yRNBundleInfo : list2) {
                for (YRNBundleInfo yRNBundleInfo2 : list) {
                    if (TextUtils.equals(yRNBundleInfo.getModule(), yRNBundleInfo2.getModule())) {
                        if (!TextUtils.equals(yRNBundleInfo2.getMd5(), yRNBundleInfo.getMd5()) || !wwr.h(yRNBundleInfo2.getBundlePath()) || !wwr.h(yRNBundleInfo2.getBundlePathFileName())) {
                            break;
                        }
                        yRNBundleInfo.setNeedUpdate(false);
                        break;
                    }
                }
            }
        }
        return list2;
    }
}
