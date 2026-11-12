package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.openalliance.ad.beans.parameter.StylePackageInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.DslZipSha256Check;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class py {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static py f20093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f20094c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20095a;
    private final String d;
    private String e;
    private int f;

    public void a() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.py.3
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.utils.ai.a(py.this.e);
                com.huawei.openalliance.ad.utils.ai.e(new File(str));
            }
        });
    }

    private Pair<File, File> c() {
        File file;
        File file2 = new File(this.e);
        File file3 = null;
        if (!file2.isDirectory()) {
            hw.c("StyleProcessor", "style not dir");
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (com.huawei.openalliance.ad.utils.bm.a(fileArrListFiles)) {
            file = null;
        } else {
            file = null;
            for (File file4 : fileArrListFiles) {
                if (file4 != null && !com.huawei.openalliance.ad.utils.dg.b(file4.getName())) {
                    if (file4.getName().endsWith("packageInfo.json")) {
                        file3 = file4;
                    } else if (file4.getName().endsWith(".zip")) {
                        file = file4;
                    }
                }
            }
        }
        return new Pair<>(file3, file);
    }

    private void b() {
        gm gmVarA = ft.a(this.f20095a);
        hw.a("StyleProcessor", "queryStyleConfigInner updateStyleFcFlag: %s", Integer.valueOf(gmVarA.a()));
        boolean z = gmVarA.a() == 1;
        long jC = com.huawei.openalliance.ad.utils.as.c();
        hw.a("StyleProcessor", "requestNow: %s, cur time: %s", Boolean.valueOf(z), com.huawei.openalliance.ad.utils.as.a(Constants.TIME_FORMAT_WITHOUT_MILLS).format(Long.valueOf(jC)));
        if (z) {
            a(1);
        } else {
            long jB = gmVarA.b();
            boolean z2 = jC - jB > 600000;
            hw.a("StyleProcessor", "last query time: %s, reqInterval: %s", com.huawei.openalliance.ad.utils.as.a(Constants.TIME_FORMAT_WITHOUT_MILLS).format(Long.valueOf(jB)), 600000);
            if (!z2) {
                return;
            } else {
                a(0);
            }
        }
        gmVarA.a(jC);
    }

    private static py b(Context context) {
        py pyVar;
        synchronized (f20094c) {
            if (f20093b == null) {
                f20093b = new py(context);
            }
            pyVar = f20093b;
        }
        return pyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Pair<File, File> b(String str) {
        try {
            if (com.huawei.openalliance.ad.utils.dg.b(str)) {
                hw.b("StyleProcessor", "file path empty");
                return null;
            }
            if (!str.endsWith(".zip")) {
                hw.b("StyleProcessor", "not zip file");
                return null;
            }
            String strSubstring = str.substring(0, str.lastIndexOf(".zip"));
            this.e = strSubstring;
            hw.a("StyleProcessor", "unzip, maxCnt: %s, dir path: %s", Integer.valueOf(this.f), com.huawei.openalliance.ad.utils.ds.a(strSubstring));
            boolean zA = com.huawei.openalliance.ad.utils.ea.a(str, this.e, true, this.f);
            hw.b("StyleProcessor", "unzip result: %s", Boolean.valueOf(zA));
            if (zA) {
                return c();
            }
            hw.b("StyleProcessor", "unzip failed");
            return null;
        } catch (Throwable th) {
            hw.c("StyleProcessor", "get unzipped file error: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        String str2;
        String strAj = com.huawei.openalliance.ad.utils.cn.a(this.f20095a).aj();
        String strA = e.a();
        if (TextUtils.isEmpty(strA)) {
            str2 = "new UiEngineVer is Empty";
        } else {
            hw.a("StyleProcessor", "new uiEngineVer:%s, old uiengineVersion:%s", strA, strAj);
            if (!strA.equals(strAj)) {
                hw.b("StyleProcessor", "uiEngineVer is not same");
                return false;
            }
            if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
                String strAi = com.huawei.openalliance.ad.utils.cn.a(this.f20095a).ai();
                hw.a("StyleProcessor", "cachedStylePkgVer:%s, updateStyleVer:%s", strAi, str);
                return str.equals(strAi);
            }
            str2 = "update style ver empty";
        }
        hw.c("StyleProcessor", str2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(File file, String str) {
        try {
            return com.huawei.openalliance.ad.utils.ea.a(com.huawei.openalliance.ad.utils.ai.h(file), str, true, this.f);
        } catch (Throwable th) {
            hw.c("StyleProcessor", "unzip dsl zip failed: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Pair<File, File> pair, String str) {
        File file = (File) pair.first;
        File file2 = (File) pair.second;
        if (file == null || file2 == null) {
            hw.c("StyleProcessor", "package info or dsl file null");
            return false;
        }
        StylePackageInfo stylePackageInfo = (StylePackageInfo) com.huawei.openalliance.ad.utils.bk.b(com.huawei.openalliance.ad.utils.ai.i(file), StylePackageInfo.class, new Class[0]);
        if (stylePackageInfo == null) {
            hw.b("StyleProcessor", "package info empty");
            return false;
        }
        String strA = stylePackageInfo.a();
        if (com.huawei.openalliance.ad.utils.dg.b(strA)) {
            hw.b("StyleProcessor", "check sha256 failed: %s", DslZipSha256Check.ERROR_PKG_SHA256_EMPTY);
            a("1", str, DslZipSha256Check.ERROR_PKG_SHA256_EMPTY);
            return false;
        }
        if (strA.equalsIgnoreCase(com.huawei.openalliance.ad.utils.db.a(file2))) {
            hw.b("StyleProcessor", DslZipSha256Check.SUCCESS_SHA256_CHECK);
            a("0", str, DslZipSha256Check.SUCCESS_SHA256_CHECK);
            return true;
        }
        hw.b("StyleProcessor", "check sha256 failed: %s", DslZipSha256Check.ERROR_SHA256_MISMATCH);
        a("1", str, DslZipSha256Check.ERROR_SHA256_MISMATCH);
        return false;
    }

    private void a(final String str, final String str2, final String str3) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.py.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(py.this.f20095a).a(str, str2, str3);
            }
        });
    }

    private void a(int i) {
        try {
            if (TextUtils.isEmpty(e.a())) {
                hw.c("StyleProcessor", "ui EngineVer is Empty");
                return;
            }
            hw.b("StyleProcessor", "do request");
            this.f = fp.b(this.f20095a).aC();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fc_flag", i);
            na.a(this.f20095a).a(RTCMethods.QUERY_STYLE_CONFIG, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.py.1
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    if (callResult == null) {
                        return;
                    }
                    try {
                        String data = callResult.getData();
                        if (com.huawei.openalliance.ad.utils.dg.b(data)) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject(data);
                        final String strOptString = jSONObject2.optString("styleFilePath");
                        final String strOptString2 = jSONObject2.optString("styleVersion");
                        final String strA = e.a();
                        hw.a("StyleProcessor", "max dsl cnt: %s, style ver: %s, file path: %s, ", Integer.valueOf(py.this.f), strOptString2, com.huawei.openalliance.ad.utils.ds.a(strOptString));
                        if (py.this.a(strOptString2)) {
                            hw.b("StyleProcessor", "no need update");
                        } else {
                            hw.b("StyleProcessor", "need update");
                            com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.py.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    String str2 = py.this.d + File.separator + "style_" + strOptString2 + ".zip";
                                    if (!com.huawei.openalliance.ad.utils.ai.d(py.this.f20095a, strOptString, str2)) {
                                        hw.b("StyleProcessor", "copy failed");
                                        return;
                                    }
                                    Pair pairB = py.this.b(str2);
                                    if (pairB == null) {
                                        hw.b("StyleProcessor", "style file pair null");
                                        return;
                                    }
                                    boolean zA = py.this.a((Pair<File, File>) pairB, strOptString2);
                                    hw.b("StyleProcessor", "check result: %s", Boolean.valueOf(zA));
                                    if (zA) {
                                        File file = (File) pairB.second;
                                        if (!file.exists()) {
                                            hw.b("StyleProcessor", "dsl zip not exist");
                                            return;
                                        }
                                        String str3 = py.this.e + File.separator + "dsl";
                                        if (!py.this.a(file, str3)) {
                                            hw.b("StyleProcessor", "unzip dsl fail");
                                            return;
                                        }
                                        hw.a("StyleProcessor", "unzip dsl maxCnt: %s, dir path: %s", Integer.valueOf(py.this.f), com.huawei.openalliance.ad.utils.ds.a(str3));
                                        boolean zA2 = com.huawei.openalliance.ad.utils.c.a(str3, strOptString2);
                                        hw.a("StyleProcessor", "updateResult: %s", Boolean.valueOf(zA2));
                                        if (zA2) {
                                            com.huawei.openalliance.ad.utils.cn.a(py.this.f20095a).K(strOptString2);
                                            com.huawei.openalliance.ad.utils.cn.a(py.this.f20095a).L(strA);
                                        }
                                        py.this.c(str2);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        hw.c("StyleProcessor", "query style config error: %s", th.getClass().getSimpleName());
                    }
                }
            }, String.class);
        } catch (Throwable th) {
            hw.c("StyleProcessor", "query style config error: %s", th.getClass().getSimpleName());
        }
    }

    public static py a(Context context) {
        return b(context);
    }

    private py(Context context) {
        this.f20095a = context.getApplicationContext();
        this.d = com.huawei.openalliance.ad.utils.dd.d(com.huawei.openalliance.ad.utils.ab.i(context)) + File.separator + "pps" + File.separator + TtmlNode.TAG_STYLE;
        this.f = fp.b(context).aC();
    }
}
