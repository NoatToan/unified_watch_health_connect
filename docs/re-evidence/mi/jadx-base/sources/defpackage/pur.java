package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.bundle.config.YRNBundleError;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class pur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30809a = "YRN_YRNV3_SDK";

    public boolean a(YRNLoadRequest yRNLoadRequest) throws Exception {
        File parentFile;
        File[] fileArrListFiles;
        zxr.a("YRN_YRNV3_SDK", "YRNBundleCacheHandler.handlePackage: " + yRNLoadRequest);
        String module = yRNLoadRequest.getModule();
        ezr.c().f(YRNTraceEvent.newEvent(yRNLoadRequest.getAppName(), 1100, "解压请求", null, yRNLoadRequest));
        if (TextUtils.isEmpty(module)) {
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.UNZIP_ERROR, "YRNBundleCacheHandler.handlePackage:loadRequest.getModule() == null"));
            throw new Exception("YRNBundleCacheHandler.handlePackage:loadRequest.getModule() == null");
        }
        if (!yxr.d(yRNLoadRequest.getAppName(), module)) {
            String str = "YRNBundleCacheHandler.handlePackage:LockHelper.lockModule: " + module + " failed";
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.UNZIP_ERROR, str));
            throw new Exception(str);
        }
        File file = new File(yRNLoadRequest.getZipCachePath());
        if (!file.exists()) {
            String str2 = "YRNBundleCacheHandler.handlePackage:unzip file:" + file.getAbsolutePath() + " does not exist";
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.UNZIP_ERROR, str2));
            throw new Exception(str2);
        }
        File file2 = new File(yRNLoadRequest.getCacheDirPath());
        String usingBundlePath = yRNLoadRequest.getUsingBundlePath();
        if (!TextUtils.isEmpty(usingBundlePath) && (parentFile = file2.getParentFile()) != null && parentFile.exists() && (fileArrListFiles = parentFile.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file3 : fileArrListFiles) {
                if (!TextUtils.equals(usingBundlePath, file3.getAbsolutePath()) && !TextUtils.equals(file.getAbsolutePath(), file3.getAbsolutePath())) {
                    wwr.e(file3.getAbsolutePath());
                }
            }
        }
        file2.mkdirs();
        if (!file2.exists()) {
            String str3 = "YRNBundleCacheHandler.handlePackage:file:" + yRNLoadRequest.getCacheDirPath() + " create failed";
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.UNZIP_ERROR, str3));
            throw new Exception(str3);
        }
        String strF = wwr.f(file);
        if (!TextUtils.equals(strF, yRNLoadRequest.getMd5())) {
            file.delete();
            String str4 = "YRNBundleCacheHandler.handlePackage:file:" + file.getAbsolutePath() + " md5:" + strF + " does not equal loadRequest.getMd5():" + yRNLoadRequest.getMd5();
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.VERIFY_ERROR, str4));
            throw new Exception(str4);
        }
        zxr.a("YRN_YRNV3_SDK", yur.a(YRNBundleError.VERIFY_ALREADY_LATEST_ERROR, "YRNBundleCacheHandler.handlePackage:file:" + file.getAbsolutePath() + " md5:" + strF + " does equal loadRequest.getMd5():" + yRNLoadRequest.getMd5()));
        ezr.c().f(YRNTraceEvent.newEvent(yRNLoadRequest.getAppName(), 1100, "解压路径", null, file2.getPath()));
        boolean zN = wwr.n(file, file2);
        yxr.f(yRNLoadRequest.getAppName(), module);
        return zN;
    }
}
