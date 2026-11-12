package defpackage;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNAssetsLoadRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class jur implements n1d<YRNAssetsLoadRequest> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f23158a;

    public jur(AssetManager assetManager) {
        this.f23158a = assetManager;
    }

    public boolean b(YRNAssetsLoadRequest yRNAssetsLoadRequest) throws Exception {
        FileOutputStream fileOutputStream;
        zxr.a("YRN_YRNV3_SDK", "YRNAssetsLoader.load: " + yRNAssetsLoadRequest);
        String module = yRNAssetsLoadRequest.getModule();
        if (TextUtils.isEmpty(module)) {
            throw new Exception("YRNAssetsLoader.load:request.getModule() == null");
        }
        if (!yxr.d(yRNAssetsLoadRequest.getAppName(), module)) {
            throw new Exception("YRNAssetsLoader.load:LockHelper.lockModule: " + module + " failed");
        }
        String builtInPath = yRNAssetsLoadRequest.getBuiltInPath();
        InputStream inputStream = null;
        try {
            File fileB = wwr.b(yRNAssetsLoadRequest.getZipCachePath());
            InputStream inputStreamOpen = this.f23158a.open(builtInPath);
            try {
                fileOutputStream = new FileOutputStream(fileB);
                try {
                    bxr.b(inputStreamOpen, fileOutputStream);
                    fileOutputStream.flush();
                    zxr.a("YRN_YRNV3_SDK", "YRNAssetsLoader.load: success:" + yRNAssetsLoadRequest);
                    bxr.a(inputStreamOpen);
                    bxr.a(fileOutputStream);
                    yxr.f(yRNAssetsLoadRequest.getAppName(), module);
                    return true;
                } catch (Exception e) {
                    e = e;
                    inputStream = inputStreamOpen;
                    try {
                        throw new Exception("YRNAssetsLoader.load: fail: " + module + ",error is " + e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        bxr.a(inputStream);
                        bxr.a(fileOutputStream);
                        yxr.f(yRNAssetsLoadRequest.getAppName(), module);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    bxr.a(inputStream);
                    bxr.a(fileOutputStream);
                    yxr.f(yRNAssetsLoadRequest.getAppName(), module);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }
}
