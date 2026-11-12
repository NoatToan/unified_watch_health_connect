package defpackage;

import android.text.TextUtils;
import com.alipay.sdk.m.r.a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class np {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public on f43387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43388c = "LocalWebPayManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43386a = null;
    public String e = null;
    public String d = null;
    public String g = null;
    public String h = "0";
    public Map<String, String> i = null;
    public nn f = null;
    public volatile boolean j = false;

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nn f43391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0020a f43392c;

        public d(nn nnVar, a.InterfaceC0020a interfaceC0020a) {
            this.f43391b = nnVar;
            this.f43392c = interfaceC0020a;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = np.this.g;
            File file = new File(str);
            if (file.exists()) {
                os.c(str);
            }
            file.mkdir();
            a.b(this.f43391b.c(), np.this.g + "/downloading.zip", this.f43392c);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final np f43393b = new np();
    }

    public static np e() {
        return e.f43393b;
    }

    public void a() {
        oq.b("mspl", "LocalWebPayManager clearData");
        this.f43387b = null;
        this.h = "0";
        this.f = null;
        this.i = null;
    }

    public boolean b() {
        if (this.f == null || this.j) {
            return false;
        }
        return TextUtils.equals(this.f.e(), nn.c.d) || TextUtils.equals(this.f.e(), nn.c.e);
    }

    public final boolean d() {
        File file = new File(this.f43386a);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(this.e);
            if (!file2.exists()) {
                file2.mkdir();
            }
            return new File(this.e).exists() && new File(this.d).exists();
        } catch (Throwable th) {
            oq.c(th);
            return false;
        }
    }

    public String f() {
        oq.c("LocalWebPayManager", "getLocalConfigVersion=" + this.h);
        return this.h;
    }

    public final void h() {
        JSONObject jSONObjectA = os.a(this.d);
        oq.b("mspl", "readContentFromConfigJson jsonConfigJson=" + jSONObjectA);
        if (jSONObjectA != null) {
            try {
                String string = jSONObjectA.getString("version");
                JSONObject jSONObject = jSONObjectA.getJSONObject("homeHtml");
                JSONObject jSONObject2 = jSONObjectA.getJSONObject("fileList");
                this.h = string;
                JSONObject jSONObjectC = op.c(jSONObject, jSONObject2);
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        this.i.put(next, jSONObjectC.getString(next));
                    } catch (Throwable th) {
                        oq.c(th);
                    }
                }
            } catch (Throwable th2) {
                oq.d("LocalWebPayManager", "readContentFromConfigJson fileContent error");
                oq.c(th2);
                mu.c(this.f43387b, "biz", "LocalWebPayManager.readContentFromConfigJsonError", th2);
            }
        }
    }

    public class c implements a.InterfaceC0020a {
        public final /* synthetic */ nn d;

        public c(nn nnVar) {
            this.d = nnVar;
        }

        @Override // com.alipay.sdk.m.r.a.InterfaceC0020a
        public void a(File file) {
            oq.c("LocalWebPayManager", "checkAndUpdateLocalData downloadListener onSuccess");
            np.this.e(this.d);
            np.this.j = false;
        }

        @Override // com.alipay.sdk.m.r.a.InterfaceC0020a
        public void a(Throwable th) {
            oq.c(th);
            np.this.j = false;
        }
    }

    public void e(on onVar) {
        if (this.f43387b != null) {
            oq.d("mspl", "LocalWebPayManager.init mBizContext not null");
            mu.e(onVar, "biz", "LocalWebPayManager.init", "mBizContext not null");
            a();
        }
        this.f43387b = onVar;
        String absolutePath = onVar.c().getFilesDir().getAbsolutePath();
        this.f43386a = absolutePath + "/localWebPay";
        this.e = absolutePath + "/localWebPay/localWebFiles";
        this.d = absolutePath + "/localWebPay/localWebFiles/sdkConfig.json";
        this.g = absolutePath + "/localWebPay/localWebPayDownloadingFiles";
        this.i = new HashMap();
        boolean zD = d();
        oq.b("mspl", "LocalWebPayManager init checkConfigFile=" + zD);
        if (zD) {
            h();
        }
    }

    public final void e(nn nnVar) {
        if (nnVar == null) {
            return;
        }
        oq.a("LocalWebPayManager", "unzipAndCheckSHA256 dataSHA256:" + nnVar.b());
        try {
            File[] fileArrListFiles = new File(this.g).listFiles();
            File file = null;
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].getName().endsWith(".zip")) {
                    file = fileArrListFiles[i];
                }
            }
            String strC = ox.c(file);
            oq.a("LocalWebPayManager", "unzipAndCheckSHA256 fileSha256:" + strC);
            if (TextUtils.equals(strC, nnVar.b())) {
                oq.a("LocalWebPayManager", "unzipAndCheckSHA256 unzip");
                ow.c(file.getAbsolutePath(), this.g);
                File file2 = new File(this.e);
                File file3 = new File(this.g);
                if (file2.exists()) {
                    os.c(this.e);
                }
                oq.a("LocalWebPayManager", "unzipAndCheckSHA256 resultReNameTo:" + file3.renameTo(file2));
            }
        } catch (Throwable th) {
            oq.c(th);
            mu.c(this.f43387b, "biz", "LocalWebPayManager.unzipAndCheckSHA256Error", th);
        }
    }

    public void c(nn nnVar) {
        oq.c("LocalWebPayManager", "h5LocalData :" + nnVar);
        this.f = nnVar;
    }

    public void c() {
        oq.c("LocalWebPayManager", "checkAndUpdateLocalData isDownloading=" + this.j);
        nn nnVar = this.f;
        if (nnVar != null && !this.j && ((TextUtils.equals(nnVar.e(), nn.c.f43304a) || TextUtils.equals(nnVar.e(), nn.c.d)) && !TextUtils.isEmpty(nnVar.c()))) {
            this.j = true;
            new Thread(new d(nnVar, new c(nnVar))).start();
        } else {
            oq.c("LocalWebPayManager", "checkAndUpdateLocalData return");
        }
    }

    public String c(String str) {
        String str2;
        if (b()) {
            String strD = d(str);
            if (TextUtils.isEmpty(this.i.get(strD))) {
                oq.a("LocalWebPayManager", "getLocalFilePath get null, url：" + str);
                str2 = "";
            } else {
                str2 = this.e + "/" + this.i.get(strD);
            }
        } else {
            str2 = "";
        }
        oq.b("LocalWebPayManager", "getLocalFilePath result:" + str2);
        return str2;
    }

    public final String d(String str) {
        int iIndexOf;
        return (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(63)) == -1) ? str : str.substring(0, iIndexOf);
    }
}
