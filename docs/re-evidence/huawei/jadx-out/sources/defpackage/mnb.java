package defpackage;

import android.text.TextUtils;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.network.embedded.b6;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.CommonApi;
import com.huawei.networkclient.ProgressListener;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mnb {
    public static void d(List<String> list, IBaseResponseCallback iBaseResponseCallback, mne mneVar) {
        if (njy.e(list)) {
            LogUtil.j("HwEphemerisNet", "requestUrl return");
            a(iBaseResponseCallback, 1);
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (String str : list) {
            try {
                CommonApi commonApi = (CommonApi) oet.d().e(CommonApi.class);
                HashMap map = new HashMap(16);
                map.put(b6.a.f14602b, "HealthApp");
                map.put("traceId", UUID.randomUUID().toString());
                Response<String> responseExecute = commonApi.commonGet(str, map).execute();
                if (responseExecute != null && c(responseExecute, arrayList, null, iBaseResponseCallback)) {
                    return;
                }
            } catch (IOException unused) {
                LogUtil.e("R_Stress_HwEphemerisNet", "requestUrl net or Server is error.");
                a(iBaseResponseCallback, 2);
            } catch (IllegalArgumentException unused2) {
                LogUtil.e("HwEphemerisNet", "requestUtl find IllegalArgumentException");
                a(iBaseResponseCallback, 2);
            }
        }
        e(arrayList, iBaseResponseCallback, mneVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwEphemerisNet", "responseCallback callback is null");
        } else {
            iBaseResponseCallback.a(i, null);
        }
    }

    private static void e(List<mmz> list, IBaseResponseCallback iBaseResponseCallback, mne mneVar) {
        if (list.isEmpty()) {
            LogUtil.j("HwEphemerisNet", "download REQUEST_TAG_URL_ILLEGAL");
            a(iBaseResponseCallback, 1);
            return;
        }
        File filesDir = BaseApplication.getContext().getFilesDir();
        for (mmz mmzVar : list) {
            String strA = a(mmzVar.b());
            String str = nio.c(mneVar.d().getDeviceIdentify()) + strA;
            LogUtil.a("HwEphemerisNet", "file name : ", str);
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("HwEphemerisNet", "net data exception :", mmzVar.b());
                a(iBaseResponseCallback, 4);
            }
            mneVar.c(strA);
            File file = new File(filesDir, CommonUtil.c(str));
            if (file.exists()) {
                if (d(file, mmzVar.e(), mmzVar.c())) {
                    if (list.get(list.size() - 1).equals(mmzVar)) {
                        a(iBaseResponseCallback, 0);
                    }
                } else {
                    LogUtil.a("HwEphemerisNet", "download delete file:", Boolean.valueOf(file.delete()));
                }
            }
            a(mmzVar, list, file, iBaseResponseCallback);
        }
    }

    private static void a(final mmz mmzVar, final List<mmz> list, File file, final IBaseResponseCallback iBaseResponseCallback) {
        oet.d().a(new oer(mmzVar.b(), null, file, new ProgressListener<File>() { // from class: mnb.1
            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file2) {
                xji.a(file2.getPath(), "S2", 0);
                List list2 = list;
                if (((mmz) list2.get(list2.size() - 1)).equals(mmzVar)) {
                    mnb.a(iBaseResponseCallback, 0);
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                LogUtil.d("HwEphemerisNet", "onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                mnb.a(iBaseResponseCallback, 8);
            }
        }));
    }

    public static void d(ile ileVar, IBaseResponseCallback iBaseResponseCallback, mne mneVar) {
        ReleaseLogUtil.d("R_Stress_HwEphemerisNet", "requestUrlExt start");
        if (ileVar == null || iBaseResponseCallback == null || mneVar == null) {
            LogUtil.j("HwEphemerisNet", "requestUrlExt Invalid argument.");
            return;
        }
        Map<String, String> mapI = ileVar.i();
        if (mapI == null || mapI.isEmpty()) {
            LogUtil.j("HwEphemerisNet", "requestUrlExt return");
            iBaseResponseCallback.a(1, null);
            return;
        }
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl(ileVar.f(), GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        LogUtil.a("HwEphemerisNet", "grsUrl:", noCheckUrl);
        int iC = ileVar.c();
        if (ileVar.a() == 2) {
            b();
        }
        List arrayList = new ArrayList(0);
        if (iC == 2) {
            for (Map.Entry<String, String> entry : mapI.entrySet()) {
                mmz mmzVar = new mmz();
                mmzVar.b(noCheckUrl + entry.getKey());
                mmzVar.c(entry.getValue());
                arrayList.add(mmzVar);
            }
        } else if (iC != 1) {
            LogUtil.j("HwEphemerisNet", "requestUrlExt not supported requestType");
        } else {
            arrayList = e(noCheckUrl, mapI, ileVar, iBaseResponseCallback);
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("HwEphemerisNet", "requestUrlExt entityList is empty");
            iBaseResponseCallback.a(1, null);
        } else {
            d(arrayList, ileVar, iBaseResponseCallback, mneVar);
        }
    }

    private static List<mmz> e(String str, Map<String, String> map, ile ileVar, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(0);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                Response<String> responseExecute = ((CommonApi) oet.d().e(CommonApi.class)).commonGet(str + entry.getKey(), ileVar.d()).execute();
                if (responseExecute != null && c(responseExecute, arrayList, entry.getValue(), iBaseResponseCallback)) {
                    break;
                }
            } catch (IOException unused) {
                ReleaseLogUtil.a("R_Stress_HwEphemerisNet", "requestUrlExt net or Server is error.");
                iBaseResponseCallback.a(2, null);
            } catch (IllegalArgumentException unused2) {
                ReleaseLogUtil.a("HwEphemerisNet", "requestUrlExt find IllegalArgumentException");
                iBaseResponseCallback.a(2, null);
            }
        }
        return arrayList;
    }

    private static boolean c(Response<String> response, List<mmz> list, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (response.isOK()) {
            String body = response.getBody();
            LogUtil.a("HwEphemerisNet", "isAddValidData jsonString : ", body);
            mmz mmzVarE = mna.e(body);
            if (mmzVarE == null) {
                LogUtil.j("HwEphemerisNet", "isAddValidData ephemerisUrlBean is null.");
                iBaseResponseCallback.a(2, null);
                return true;
            }
            if (str != null) {
                mmzVarE.c(str);
            }
            if (mmzVarE.a()) {
                LogUtil.j("HwEphemerisNet", "isAddValidData invalid.");
                return false;
            }
            list.add(mmzVarE);
        }
        return false;
    }

    private static void d(List<mmz> list, ile ileVar, IBaseResponseCallback iBaseResponseCallback, mne mneVar) {
        if (list.isEmpty()) {
            LogUtil.j("HwEphemerisNet", "downloadExt REQUEST_TAG_URL_ILLEGAL");
            iBaseResponseCallback.a(1, null);
            return;
        }
        File filesDir = BaseApplication.getContext().getFilesDir();
        for (mmz mmzVar : list) {
            String strD = mmzVar.d();
            String str = nio.c(mneVar.d().getDeviceIdentify()) + strD;
            LogUtil.a("HwEphemerisNet", "downloadExt file name : ", str);
            if (TextUtils.isEmpty(str)) {
                iBaseResponseCallback.a(4, null);
            }
            if (!ileVar.h()) {
                mneVar.c(strD);
            }
            File file = new File(filesDir, CommonUtil.c(str));
            if (file.exists()) {
                LogUtil.a("HwEphemerisNet", "downloadExt delete file: ", Boolean.valueOf(file.delete()));
            }
            String strB = ileVar.b();
            ReleaseLogUtil.d("R_Stress_HwEphemerisNet", "downloadExt httpMethod: ", strB);
            if ("POST".equals(strB)) {
                oet.d().a(new oer(mmzVar.b(), ileVar.d(), file, d(list, ileVar, iBaseResponseCallback, mneVar, mmzVar), ileVar.e(), 2));
            } else {
                oet.d().a(new oer(mmzVar.b(), ileVar.d(), file, d(list, ileVar, iBaseResponseCallback, mneVar, mmzVar)));
            }
        }
    }

    private static ProgressListener d(final List<mmz> list, final ile ileVar, final IBaseResponseCallback iBaseResponseCallback, final mne mneVar, final mmz mmzVar) {
        return new ProgressListener<File>() { // from class: mnb.2
            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                if (!mnb.e(file, ileVar, mneVar)) {
                    iBaseResponseCallback.a(8, null);
                    return;
                }
                List list2 = list;
                if (((mmz) list2.get(list2.size() - 1)).equals(mmzVar)) {
                    iBaseResponseCallback.a(0, null);
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                LogUtil.a("HwEphemerisNet", "downloadExt onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                iBaseResponseCallback.a(8, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(File file, ile ileVar, mne mneVar) {
        ReleaseLogUtil.d("R_Stress_HwEphemerisNet", "processDataExt start");
        xji.a(file.getPath(), "S2", 0);
        if (ileVar.h()) {
            int iA = ileVar.a();
            String path = BaseApplication.getContext().getFilesDir().getPath();
            String strC = nio.c(mneVar.d().getDeviceIdentify());
            ilh ilhVar = new ilh();
            ilhVar.e(iA);
            ilhVar.e(path);
            ilhVar.c(strC);
            ilhVar.b(file.getPath());
            Map<String, String> ephResponse = ilf.b().getEphResponse(ilhVar);
            if (ephResponse == null || ephResponse.isEmpty()) {
                LogUtil.j("HwEphemerisNet", "downloadExt reprocessed maps is null");
                return false;
            }
            for (Map.Entry<String, String> entry : ephResponse.entrySet()) {
                xji.a(entry.getKey(), "S2", 0);
                mneVar.c(entry.getValue());
            }
        }
        ReleaseLogUtil.d("R_Stress_HwEphemerisNet", "processDataExt end");
        return true;
    }

    private static boolean d(File file, String str, String str2) {
        long length = file.length();
        if (length == 0) {
            LogUtil.j("HwEphemerisNet", "checkFile length is null");
            return false;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
            LogUtil.d("HwEphemerisNet", "read : ", Integer.valueOf(fileInputStreamOpenInputStream.read(bArr)));
            boolean zB = b(b(bArr, str2.getBytes(Charset.forName("UTF-8")), "SHA-256"), str);
            LogUtil.a("HwEphemerisNet", "checked : ", str);
            return zB;
        } catch (IOException | IllegalArgumentException | NoSuchAlgorithmException unused) {
            LogUtil.e("HwEphemerisNet", "checkFile find IllegalArgumentException|IOException|NoSuchAlgorithmException");
            return false;
        } finally {
            IoUtils.c(fileInputStreamOpenInputStream);
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        if (bArr == null) {
            throw new IllegalArgumentException("File not found.");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                byte[] bArr3 = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = byteArrayInputStream.read(bArr3);
                    if (i2 == -1) {
                        break;
                    }
                    messageDigest.update(bArr3, 0, i2);
                    i += i2;
                }
                if (i > 0) {
                    byte[] bArrD = d(bArr2, messageDigest);
                    IoUtils.c(byteArrayInputStream);
                    return bArrD;
                }
                throw new IllegalArgumentException("Input file is empty.");
            } catch (Throwable th) {
                th = th;
                IoUtils.c(byteArrayInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
        }
    }

    private static byte[] d(byte[] bArr, MessageDigest messageDigest) {
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (i < bArr.length) {
                int i2 = i + 8192;
                if (bArr.length >= i2) {
                    messageDigest.update(bArr, i, 8192);
                } else {
                    messageDigest.update(bArr, i, bArr.length - i);
                }
                i = i2;
            }
        }
        return messageDigest.digest();
    }

    private static boolean b(byte[] bArr, String str) {
        if (bArr == null || str == null) {
            LogUtil.j("HwEphemerisNet", "checkHash input fileBytes or signature string is null");
            return false;
        }
        if (!str.equals(b(bArr))) {
            return false;
        }
        LogUtil.d("HwEphemerisNet", "checkHash is OK");
        return true;
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(0);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/")) {
            return "";
        }
        return str.substring(str.lastIndexOf("/") + 1);
    }

    private static void b() {
        LogUtil.a("HwEphemerisNet", "PowerKitManager applyPowerKit Ephemeris");
        PowerKitManager.a().d("HwEphemerisNet", 65535, 30000L, "user-eph-download");
        if (EnvironmentInfo.l()) {
            return;
        }
        PowerKitManager.a().d("HwEphemerisNet", 512, 30000L, "user-eph-download");
    }

    public static void a() {
        LogUtil.a("HwEphemerisNet", "PowerKitManager unApplyPowerKit Ephemeris");
        PowerKitManager.a().a("HwEphemerisNet", 65535, "user-eph-download");
        if (EnvironmentInfo.l()) {
            return;
        }
        PowerKitManager.a().a("HwEphemerisNet", 512, "user-eph-download");
    }
}
