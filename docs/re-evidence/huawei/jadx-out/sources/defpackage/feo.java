package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.healthcloudconfig.voiceconfig.VoiceConfigCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class feo {
    public static void e(final String str, String str2, final VoiceConfigCallback voiceConfigCallback) {
        fdr fdrVarC = c(str, str2, voiceConfigCallback);
        if (fdrVarC == null) {
            a(str, "checkUpdate QueryParams is null", voiceConfigCallback);
            return;
        }
        final String strA = fdrVarC.a();
        if (!strA.matches("[-_.A-Za-z0-9]+")) {
            ReleaseLogUtil.a("HiH_VoiceConfigManager", "deviceIdentify = ", str, " errorInfo = ", "checkUpdate invalid char in configId");
            voiceConfigCallback.onFailure(str, "checkUpdate invalid char in configId");
        }
        final List<fdk> listE = fdrVarC.e();
        String strB = fdrVarC.b();
        String strD = fdrVarC.d();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB) || TextUtils.isEmpty(strD) || listE.size() == 0) {
            a(str, "checkUpdate necessary params is null", voiceConfigCallback);
            return;
        }
        final HashMap map = new HashMap();
        map.put(strB, strD);
        ThreadPoolManager.c().execute(new Runnable() { // from class: fen
            @Override // java.lang.Runnable
            public final void run() {
                feo.b(strA, map, str, voiceConfigCallback, listE);
            }
        });
    }

    static /* synthetic */ void b(String str, Map map, String str2, VoiceConfigCallback voiceConfigCallback, List list) {
        fcz fczVarD = fdy.d("HiH_VoiceConfigManager", new fda(str, map));
        if (fczVarD != null) {
            List<fcw> listA = fczVarD.a();
            if (listA.size() == 0) {
                a(str2, "getResponse from cloud fileList size = 0", voiceConfigCallback);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                for (int i2 = 0; i2 < listA.size(); i2++) {
                    String strC = ((fdk) list.get(i)).c();
                    int iA = ((fdk) list.get(i)).a();
                    String strC2 = listA.get(i2).c();
                    int i3 = Integer.parseInt(listA.get(i2).e());
                    if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2)) {
                        LogUtil.e("HiH_VoiceConfigManager", "fileName or fileIdFromCloud is empty");
                    } else if (strC.equals(strC2) && i3 > iA) {
                        fel felVar = new fel();
                        felVar.a(strC).e(i3).b(listA.get(i2).d()).a(a(listA.get(i2).d()));
                        arrayList.add(felVar);
                    }
                }
            }
            voiceConfigCallback.onSuccess(str2, arrayList);
        }
    }

    public static void d(final String str, String str2, final VoiceConfigCallback voiceConfigCallback) {
        fdr fdrVarC = c(str, str2, voiceConfigCallback);
        if (fdrVarC == null) {
            a(str, "downloadFiles QueryParams is null", voiceConfigCallback);
            return;
        }
        final String strA = fdrVarC.a();
        List<fdk> listE = fdrVarC.e();
        String strB = fdrVarC.b();
        String strD = fdrVarC.d();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listE.size(); i++) {
            arrayList.add(listE.get(i).c());
        }
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB) || TextUtils.isEmpty(strD) || arrayList.size() == 0) {
            a(str, "downloadFiles necessary params is null", voiceConfigCallback);
            return;
        }
        HashMap map = new HashMap();
        map.put(strB, strD);
        ReleaseLogUtil.d("HiH_VoiceConfigManager", "VoiceConfigManager downloadBatchList : ", arrayList);
        fdy.d(new fda(strA, map), "HiH_VoiceConfigManager", arrayList, new DownloadCallback<fcz>() { // from class: feo.5
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(fcz fczVar) {
                LogUtil.a("HiH_VoiceConfigManager", "downloadFiles onFinish, data is: ", HiJsonUtil.d(fczVar));
                feo.e(fczVar, strA, arrayList, str, voiceConfigCallback);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str3) {
                voiceConfigCallback.onProgress(j, j2, z, str3);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i2, Throwable th) {
                feo.a(str, i2 + th.toString(), voiceConfigCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(fcz fczVar, String str, List<String> list, String str2, VoiceConfigCallback voiceConfigCallback) {
        ArrayList arrayList = new ArrayList();
        List<fcw> listA = fczVar.a();
        for (int i = 0; i < listA.size(); i++) {
            String strC = listA.get(i).c();
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).equals(strC)) {
                    String strE = listA.get(i).e();
                    String strD = listA.get(i).d();
                    String strD2 = fdy.d(str, strC, strD);
                    if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
                        LogUtil.e("HiH_VoiceConfigManager", "ver or downloadUrl or filePath isEmpty");
                    } else {
                        File file = new File(strD2);
                        String[] strArrSplit = strD2.split("\\.");
                        File file2 = new File(file.getParent() + File.separator + strC + "." + strE + "." + strArrSplit[strArrSplit.length - 1]);
                        boolean zRenameTo = file.renameTo(file2);
                        fel felVar = new fel();
                        if (!zRenameTo) {
                            LogUtil.a("HiH_VoiceConfigManager", "renameFile failed");
                            felVar.c(file.getPath());
                        } else {
                            felVar.c(file2.getPath());
                        }
                        felVar.a(strC);
                        felVar.e(Integer.parseInt(strE));
                        arrayList.add(felVar);
                    }
                }
            }
        }
        voiceConfigCallback.onSuccess(str2, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, VoiceConfigCallback voiceConfigCallback) {
        LogUtil.e("HiH_VoiceConfigManager", "deviceIdentify = ", str, " errorInfo = ", str2);
        voiceConfigCallback.onFailure(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    private static int a(String str) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                int contentLength = httpURLConnection2.getContentLength();
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return contentLength;
            } catch (IOException e) {
                httpURLConnection = httpURLConnection2;
                e = e;
                try {
                    LogUtil.e("HiH_VoiceConfigManager", "getFileSizeFromNet IOException ", e.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return 0;
                } catch (Throwable th2) {
                    HttpURLConnection httpURLConnection3 = httpURLConnection;
                    th = th2;
                    httpURLConnection2 = httpURLConnection3;
                    Throwable th3 = th;
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                httpURLConnection = httpURLConnection2;
                th = th5;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th6) {
            th = th6;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private static fdr c(String str, String str2, VoiceConfigCallback voiceConfigCallback) {
        if (voiceConfigCallback == null) {
            LogUtil.e("HiH_VoiceConfigManager", "handleParams voiceConfigCallback is null");
            return null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            a("", "handleParams input params contains empty value", voiceConfigCallback);
            return null;
        }
        String strB = HEXUtils.b(str2);
        LogUtil.a("HiH_VoiceConfigManager", "handleParams configData = ", strB);
        try {
            fdr fdrVar = (fdr) HiJsonUtil.d(strB, fdr.class);
            if (fdrVar != null) {
                return fdrVar;
            }
            a(str, "handleParams QueryParams is null", voiceConfigCallback);
            return null;
        } catch (JsonSyntaxException e) {
            a(str, "handleParams Exception: " + e.getMessage(), voiceConfigCallback);
            return null;
        }
    }
}
