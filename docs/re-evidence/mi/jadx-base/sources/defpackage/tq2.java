package defpackage;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.imagecache.ImageCacheUtils;
import com.xiaomi.smarthome.library.crypto.MD5Util;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.async.FileAsyncHandler;
import com.xiaomi.smarthome.library.http.async.HttpAsyncHandle;
import java.io.File;
import java.net.URI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class tq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, e> f34925a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f34926b;

    public class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.FirmwareUpgradeResponse f34927a;

        public a(Response.FirmwareUpgradeResponse firmwareUpgradeResponse) {
            this.f34927a = firmwareUpgradeResponse;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            String string;
            String string2;
            if (bundle != null) {
                string = bundle.getString("path");
                string2 = bundle.getString("md5");
            } else {
                string = null;
                string2 = null;
            }
            BluetoothLog.v(String.format("onResponse code = %d, path = %s, md5 = %s", Integer.valueOf(i), string, string2));
            this.f34927a.onResponse(i, string, string2);
        }

        @Override // tq2.f
        public void onProgress(int i) {
            this.f34927a.onProgress(i);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f34929b;
        public final /* synthetic */ String c;

        public b(int i, f fVar, String str) {
            this.f34928a = i;
            this.f34929b = fVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f34928a;
            if (i != 0) {
                this.f34929b.onResponse(i, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("path", this.c);
            bundle.putString("md5", tq2.j(this.c));
            this.f34929b.onResponse(0, bundle);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f34930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34931b;

        public c(f fVar, int i) {
            this.f34930a = fVar;
            this.f34931b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34930a.onProgress(this.f34931b);
        }
    }

    public class d extends FileAsyncHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f34933b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, String str, f fVar, String str2) {
            super(file);
            this.f34932a = str;
            this.f34933b = fVar;
            this.c = str2;
        }

        @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
        public void onFailure(Error error, Exception exc, okhttp3.Response response) {
            FileUtils.deleteFile(this.c);
            tq2.f34925a.remove(this.f34932a);
            tq2.f(this.f34933b, -1, null);
        }

        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public void onProgress(long j, long j2) {
            float f = 0.0f;
            float f2 = j2 > 0 ? j / j2 : 0.0f;
            if (f2 >= 0.0f) {
                f = 1.0f;
                if (1.0f >= f2) {
                    f = f2;
                }
            }
            tq2.e(this.f34933b, (int) (f * 100.0f));
        }

        @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
        public void onSuccess(File file, okhttp3.Response response) {
            tq2.f34925a.remove(this.f34932a);
            tq2.f(this.f34933b, 0, this.c);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpAsyncHandle f34934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f34935b;

        public e(HttpAsyncHandle httpAsyncHandle, f fVar) {
            this.f34934a = httpAsyncHandle;
            this.f34935b = fVar;
        }
    }

    public interface f extends Response.BleResponse<Bundle> {
        void onProgress(int i);
    }

    public static void e(f fVar, int i) {
        k().post(new c(fVar, i));
    }

    public static void f(f fVar, int i, String str) {
        k().post(new b(i, fVar, str));
    }

    public static void g(String str, Response.FirmwareUpgradeResponse firmwareUpgradeResponse) {
        BluetoothLog.v(String.format("downloadFirmware v2", new Object[0]));
        l(str, new a(firmwareUpgradeResponse));
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return MD5Util.getMd5Digest(str);
        }
        String path = URI.create(str).getPath();
        int iLastIndexOf = path.lastIndexOf("/");
        return iLastIndexOf >= 0 ? path.substring(iLastIndexOf + 1) : path;
    }

    public static String i() {
        String path;
        if ("mounted".equals(Environment.getExternalStorageState()) || !ImageCacheUtils.isExternalStorageRemovable()) {
            path = ImageCacheUtils.getExternalCacheDir(MiJiaEnvironment.getAppContext()).getPath();
        } else {
            path = MiJiaEnvironment.getAppContext().getCacheDir().getPath() + File.separator + "app";
        }
        return new File(path, "ble").getAbsolutePath();
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        return (file.exists() && file.isFile()) ? MD5Util.getFileMD5(file) : "";
    }

    public static Handler k() {
        if (f34926b == null) {
            f34926b = new Handler(Looper.getMainLooper());
        }
        return f34926b;
    }

    public static void l(String str, f fVar) {
        if (TextUtils.isEmpty(str)) {
            fVar.onResponse(-3, null);
            return;
        }
        if (f34925a.containsKey(str)) {
            fVar.onResponse(-13, null);
            return;
        }
        try {
            File fileM = m(str);
            HttpAsyncHandle httpAsyncHandleSendRequestDefault = HttpApi.sendRequestDefault(new Request.Builder().method("GET").url(str).build(), new d(fileM, str, fVar, fileM.getAbsolutePath()));
            if (httpAsyncHandleSendRequestDefault != null) {
                f34925a.put(str, new e(httpAsyncHandleSendRequestDefault, fVar));
            }
        } catch (Throwable th) {
            fVar.onResponse(-1, null);
            BluetoothLog.e(th);
        }
    }

    public static File m(String str) {
        String strI = i();
        if (TextUtils.isEmpty(strI)) {
            throw new IllegalStateException("downloadDir null");
        }
        File file = new File(strI);
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("downloadDir not exist or mkdirs failed");
        }
        if (file.isFile() && (!file.delete() || !file.mkdirs())) {
            throw new IllegalStateException("downloadDir is file, delete failed or mkdirs failed");
        }
        String str2 = strI + File.separator + h(str);
        FileUtils.deleteFile(str2);
        File fileCreateFileIfNotExists = FileUtils.createFileIfNotExists(str2);
        if (fileCreateFileIfNotExists != null) {
            return fileCreateFileIfNotExists;
        }
        FileUtils.deleteFile(str2);
        throw new IllegalStateException("create download file failed");
    }
}
