package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public class ssn extends QrCodeDataBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f48637a = Arrays.asList(FitRunPlayAudio.PLAY_TYPE_T);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f48638b = Arrays.asList("r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f48639c = Arrays.asList("PIN");
    private static final List<String> d = Arrays.asList("bt_name", "n");
    private String e;
    private int i;
    private String j;

    ssn(String str) {
        super(str);
        this.j = null;
    }

    @Override // com.huawei.ui.homehealth.qrcode.util.QrCodeDataBase
    public int parser(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            LogUtil.e("R_QrCode_DeviceQrCodeData", "mQrCodeDataBase is null.");
            return -3;
        }
        String str = (String) obj;
        String[] strArrSplit = str.split("&");
        if (strArrSplit == null || strArrSplit.length < 1) {
            LogUtil.j("DeviceQrCodeData", "split is error.");
            return -3;
        }
        String strB = b(strArrSplit[0], f48637a);
        if (strB == null) {
            LogUtil.e("R_QrCode_DeviceQrCodeData", "type is null.");
            return -4;
        }
        if (strArrSplit.length > 1) {
            this.e = b(strArrSplit[1], d);
        }
        ReleaseLogUtil.d("R_QrCode_DeviceQrCodeData", " mDeviceName: ", this.e);
        if (b(str) || d(str)) {
            String strB2 = b(strArrSplit[2], f48638b);
            this.j = strB2;
            if (TextUtils.isEmpty(strB2)) {
                this.j = b(strArrSplit[2], f48639c);
            }
            LogUtil.a("DeviceQrCodeData", " pinCode: ", this.j);
        }
        try {
            this.i = Integer.parseInt(strB);
            int iC = lvi.c(this.e);
            if (this.i == 79 && !TextUtils.isEmpty(this.e) && (this.e.toLowerCase().startsWith("huawei band 8-") || this.e.toLowerCase().startsWith("huawei band ask-"))) {
                this.i = 71;
            }
            if (this.e == null) {
                iC = this.i;
            } else if (Utils.o() && a()) {
                rdt.b(100103, "");
            }
            if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isHtyVersion()) {
                return 0;
            }
            if (c(iC)) {
                if (!CommonUtil.ab(BaseApplication.getContext())) {
                    return -21;
                }
                a(strB);
                return -20;
            }
            int i = this.i;
            ReleaseLogUtil.d("R_QrCode_DeviceQrCodeData", "parse result ", Integer.valueOf(i), " ,device name is ", this.e);
            if (!CommonUtil.ab(BaseApplication.getContext())) {
                return 0;
            }
            a(strB);
            return -20;
        } catch (NumberFormatException unused) {
            return -4;
        }
    }

    private boolean a() {
        List<eds> deviceList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
        if (njy.e(deviceList)) {
            return true;
        }
        Iterator<eds> it = deviceList.iterator();
        while (it.hasNext()) {
            List<String> listD = it.next().d();
            if (!njy.e(listD)) {
                Iterator<String> it2 = listD.iterator();
                while (it2.hasNext()) {
                    if (this.e.contains(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean c(int i) {
        boolean zD = lvi.d(this.i, this.e);
        boolean zA = a(this.i);
        boolean zB = b(i);
        LogUtil.a("DeviceQrCodeData", "currentPairDeviceProductType :", Integer.valueOf(i), "isSupportScan:", Boolean.valueOf(zD), "isNeedOobeRes:", Boolean.valueOf(zA), "isDownloadImageFile:", Boolean.valueOf(zB));
        return i == -1 || !zD || zA || zB;
    }

    private void a(String str) {
        int iB = CommonUtil.b(str, 10);
        this.i = iB;
        if (iB == 79 && !TextUtils.isEmpty(this.e) && (this.e.toLowerCase().startsWith("huawei band 8-") || this.e.toLowerCase().startsWith("huawei band ask-"))) {
            this.i = 71;
        }
        String strD = lvi.d(this.i);
        tpb.b();
        if (!TextUtils.isEmpty(strD)) {
            pis pisVarE = piu.c().e(strD);
            if (pisVarE != null) {
                EzPluginManager.b().c(pisVarE);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(strD);
            ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(arrayList, null);
            return;
        }
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByType(this.i);
    }

    public boolean b(int i) {
        String strD = lvi.d(i);
        if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strD)) {
            return true;
        }
        boolean zExists = new File(pig.c().e(strD) + File.separator + strD + File.separator + "img").exists();
        StringBuilder sb = new StringBuilder();
        sb.append(pig.c().e(strD));
        sb.append(File.separator);
        sb.append(strD);
        sb.append(File.separator);
        sb.append("lang");
        return !zExists && new File(sb.toString()).exists();
    }

    private boolean a(int i) {
        String pluginIndexOobe = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(lvi.d(i));
        if (TextUtils.isEmpty(pluginIndexOobe)) {
            return false;
        }
        boolean zExists = new File(edf.f32777a + pluginIndexOobe + File.separator + pluginIndexOobe + File.separator).exists();
        LogUtil.a("DeviceQrCodeData", "isExistOobeRes:", Boolean.valueOf(zExists));
        return !zExists;
    }

    private String b(String str, List<String> list) {
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length != 2) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(strArrSplit[0])) {
                try {
                    return URLDecoder.decode(strArrSplit[1], "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    LogUtil.e("DeviceQrCodeData", "parseKeyValue UnsupportedEncodingException:");
                }
            }
        }
        return null;
    }

    boolean b() {
        return this.i == 0;
    }

    public int d() {
        return this.i;
    }

    public String e() {
        return this.e;
    }

    public String c() {
        return this.j;
    }

    private boolean b(String str) {
        return Pattern.compile("^.*&r=\\d{6}.*$").matcher(str).matches();
    }

    private boolean d(String str) {
        return Pattern.compile("^.*&PIN=\\d{6}.*$", 2).matcher(str).matches();
    }
}
