package defpackage;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class not {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f43385a;

    public not() {
        this.f43385a = null;
        ConcurrentHashMap<String, String> concurrentHashMapB = noh.b();
        this.f43385a = concurrentHashMapB;
        if (concurrentHashMapB.isEmpty()) {
            nox.b("DataHelper", "resourcesMap is empty", true);
            return;
        }
        nox.b("DataHelper", "resourcesMap--" + this.f43385a.size(), false);
    }

    public boolean e(String str) {
        return this.f43385a.containsKey(str);
    }

    public WebResourceResponse d(String str) throws Throwable {
        String str2;
        String str3 = this.f43385a.get(str);
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            InputStream inputStreamB = nor.b(noh.e() + str3);
            if (inputStreamB == null) {
                return null;
            }
            if (str.contains(".css")) {
                nox.b("DataHelper", "mimeType is css", false);
                str2 = "text/css";
            } else if (str.contains(".png") || str.contains(".ico") || str.contains(Utils.SUFFIX_GIF)) {
                nox.b("DataHelper", "mimeType is png", false);
                str2 = Constants.IMAGE_TYPE;
            } else if (str.contains(".js")) {
                nox.b("DataHelper", "mimeType is js", false);
                str2 = "text/javascript";
            } else {
                nox.b("DataHelper", "getReplacedWebResourceResponse: mimetype default", false);
                return null;
            }
            nox.b("DataHelper", "getReplacedWebResourceResponse = " + this.f43385a.get(str), false);
            return new WebResourceResponse(str2, "utf-8", inputStreamB);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
            nox.a("DataHelper", "get hw folder or parse InputSteam failed", true);
            return null;
        }
    }
}
