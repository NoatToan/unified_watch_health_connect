package com.xiaomi.hm.health.device.fw_upgrade;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.account.HMLoginManager;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.SmartExecutorApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.handler.IHMFileDownloadResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.BaseResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ExternalResourceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.base.SystemImageStatus;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.FwDwonSuccessInfo;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.HMFirmware;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwOnlineManager {
    public static final int DEFAULT_FLAG = -1;
    public static final int FLAG_INDEX_BASE_RES = 3;
    public static final int FLAG_INDEX_EXT_RES = 4;
    public static final int FLAG_INDEX_FONT = 2;
    public static final int FLAG_INDEX_FW = 0;
    public static final int FLAG_INDEX_RES = 1;
    public static final String FW_TYPE_ONLINE = "FW_TYPE_ONLINE";
    public static final String SPLIT_FLAG = ";";
    private static final String e = "HMFwOnlineManager";
    private static final String h = "FW_TYPE_IGNORE_ONLINE";
    private static final int i = 2;
    private static final String j = "devices/ALL/hasNewVersion";
    private Hashtable<HMDeviceType, Integer> a;
    private Handler b;
    private final Lazy<SmartExecutorApi> c;
    private final Lazy<FirmwareManagerApi> d;
    private static final List<HMDeviceSource> f = Arrays.asList(HMDeviceSource.OTHER_MOZART, HMDeviceSource.OTHER_HAYDN);
    private static List<f> g = new ArrayList();
    private static final Lazy<DeviceManagerApi> k = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<KeeperProxyApi> l = KoinJavaComponent.inject(KeeperProxyApi.class);

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ c a;
        public final /* synthetic */ String b;

        public a(c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                this.a.C = 0;
                String str = new String(hMHttpResponseData.getResponseBody(), StandardCharsets.UTF_8);
                HMLog.i(HMFwOnlineManager.e, "result:" + str, new Object[0]);
                HMFwOnlineManager.this.x(str, this.a, this.b);
            }
        }
    }

    public class b extends IHMFileDownloadResponseHandler {
        public final /* synthetic */ FwDownloadAnalyticsData b;

        public b(FwDownloadAnalyticsData fwDownloadAnalyticsData) {
            this.b = fwDownloadAnalyticsData;
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            FwDownloadAnalyticsData fwDownloadAnalyticsData;
            if (!(th instanceof ConnectTimeoutException) || (fwDownloadAnalyticsData = this.b) == null) {
                return;
            }
            fwDownloadAnalyticsData.setReason("timeout");
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData, File file) {
            HMLog.i(HMFwOnlineManager.e, "onFailure", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMFileDownloadResponseHandler
        public void onSuccess(HMHttpResponseData hMHttpResponseData, File file) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess:");
            if (file == null) {
                str = "null";
            } else {
                str = "length:" + file.length();
            }
            sb.append(str);
            HMLog.i(HMFwOnlineManager.e, sb.toString(), new Object[0]);
        }
    }

    public class c {
        public d A;
        public d B;
        public int C = 1;
        public int a;
        public boolean b;
        public int c;
        public String d;
        public boolean e;
        public String f;
        public int g;
        public int h;
        public int i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public d w;
        public d x;
        public d y;
        public d z;

        public c() {
        }

        public boolean a() {
            d dVar;
            d dVar2;
            d dVar3;
            d dVar4;
            d dVar5;
            d dVar6 = this.w;
            return (dVar6 != null && dVar6.a()) || ((dVar = this.x) != null && dVar.a()) || (((dVar2 = this.y) != null && dVar2.a()) || (((dVar3 = this.z) != null && dVar3.a()) || (((dVar4 = this.A) != null && dVar4.a()) || ((dVar5 = this.B) != null && dVar5.a()))));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.c == cVar.c && this.d.equalsIgnoreCase(cVar.d) && this.e == cVar.e && this.f.equalsIgnoreCase(cVar.f) && this.g == cVar.g && this.h == cVar.h && this.w.equals(cVar.w) && this.x.equals(cVar.x) && this.y.equals(cVar.y) && this.z.equals(cVar.z) && this.A.equals(cVar.A) && this.j.equals(cVar.j);
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public class d {
        public String a;
        public String b;
        public String c;
        public int d;
        public long e;
        public String f;

        public d(String str, String str2, String str3, long j, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.e = j;
            this.d = i2;
            this.f = FileUtils.getFwPath(String.valueOf(i), str2);
        }

        public boolean a() {
            return (TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || this.e <= 0) ? false : true;
        }

        public boolean b() {
            return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.c) && this.e <= 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equalsIgnoreCase(dVar.a) && this.b.equalsIgnoreCase(dVar.b) && this.c.equalsIgnoreCase(dVar.c) && this.e == dVar.e;
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public static class e {
        public static final HMFwOnlineManager a = new HMFwOnlineManager();

        private e() {
        }
    }

    public interface f {
        void a(boolean z);

        void onProgress(int i);
    }

    private HMFwOnlineManager() {
        this.a = new Hashtable<>();
        this.b = new Handler(Looper.getMainLooper());
        this.c = KoinJavaComponent.inject(SmartExecutorApi.class);
        this.d = KoinJavaComponent.inject(FirmwareManagerApi.class);
    }

    private void A(final int i2) {
        this.b.post(new Runnable() { // from class: yu2
            @Override // java.lang.Runnable
            public final void run() {
                HMFwOnlineManager.v(i2);
            }
        });
    }

    private boolean B(d dVar, @NonNull List<String> list, @NonNull String str, @NonNull c cVar) {
        if (dVar == null || dVar.b()) {
            return true;
        }
        if (!dVar.a()) {
            HMLog.i(e, "not valid.", new Object[0]);
            return false;
        }
        if (f(dVar)) {
            list.add(dVar.f);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        FwDownloadAnalyticsData fwDownloadAnalyticsDataQ = q(str, cVar);
        if (o(dVar, fwDownloadAnalyticsDataQ) || o(dVar, fwDownloadAnalyticsDataQ)) {
            list.add(dVar.f);
            HMFwOnlineAnalyticsKt.firmwareDownloadSuccess(fwDownloadAnalyticsDataQ, System.currentTimeMillis() - jCurrentTimeMillis);
            return true;
        }
        HMFwOnlineAnalyticsKt.firmwareDownloadFail(fwDownloadAnalyticsDataQ, System.currentTimeMillis() - jCurrentTimeMillis);
        HMLog.i(e, "download twice fail.", new Object[0]);
        return false;
    }

    private boolean C(@NonNull c cVar) {
        ArrayList arrayList = new ArrayList();
        if (!B(cVar.z, arrayList, "fw", cVar)) {
            z(false);
            return false;
        }
        if (!B(cVar.y, arrayList, "res", cVar)) {
            z(false);
            return false;
        }
        if (!B(cVar.x, arrayList, "ft", cVar)) {
            z(false);
            return false;
        }
        if (!B(cVar.w, arrayList, "gps", cVar)) {
            z(false);
            return false;
        }
        if (!B(cVar.A, arrayList, HMFwOnlineAnalyticsKt.BASE_RESOURCE, cVar)) {
            z(false);
            return false;
        }
        if (!B(cVar.B, arrayList, HMFwOnlineAnalyticsKt.EXT_RESOURCE, cVar)) {
            z(false);
            return false;
        }
        n(FileUtils.getFwDir(String.valueOf(cVar.c)), arrayList);
        z(true);
        return true;
    }

    private void D(HMDeviceType hMDeviceType) {
        Integer num = this.a.get(hMDeviceType);
        if (num == null) {
            return;
        }
        this.a.put(hMDeviceType, Integer.valueOf(num.intValue() + (-1) < 0 ? 0 : num.intValue() - 1));
    }

    private void E(@NonNull c cVar) {
        FwDwonSuccessInfo fwDwonSuccessInfo = new FwDwonSuccessInfo();
        fwDwonSuccessInfo.setSource(cVar.c);
        fwDwonSuccessInfo.setProductVersion(Integer.valueOf(cVar.h));
        fwDwonSuccessInfo.setForceUpgrade(Boolean.valueOf(cVar.e));
        fwDwonSuccessInfo.setServerAppVersion(HMAppConfig.getVersionCode());
        fwDwonSuccessInfo.setChangeLog(cVar.d);
        fwDwonSuccessInfo.setLocalFwVersionCode(cVar.i);
        fwDwonSuccessInfo.setLocalFwVersion(cVar.j);
        fwDwonSuccessInfo.setFwType(FW_TYPE_ONLINE);
        fwDwonSuccessInfo.setBuildTime(Integer.valueOf(cVar.a));
        StringBuilder sb = new StringBuilder();
        d dVar = cVar.z;
        if (dVar == null || !dVar.a()) {
            sb.append(-1);
        } else {
            fwDwonSuccessInfo.setLocalMd5Content(cVar.z.b);
            fwDwonSuccessInfo.setFwName(cVar.z.b);
            fwDwonSuccessInfo.setFwPath(cVar.z.f);
            sb.append(cVar.z.d);
        }
        sb.append(";");
        d dVar2 = cVar.y;
        if (dVar2 == null || !dVar2.a()) {
            sb.append(-1);
        } else {
            fwDwonSuccessInfo.setResource(cVar.y.b);
            fwDwonSuccessInfo.setResourceName(cVar.y.b);
            fwDwonSuccessInfo.setResourcePath(cVar.y.f);
            fwDwonSuccessInfo.setResourceVersionCode(Integer.valueOf(this.d.getValue().getVersionCode(cVar.y.c)));
            sb.append(cVar.y.d);
        }
        sb.append(";");
        d dVar3 = cVar.x;
        if (dVar3 == null || !dVar3.a()) {
            sb.append(-1);
        } else {
            fwDwonSuccessInfo.setFont(cVar.x.b);
            fwDwonSuccessInfo.setFontName(cVar.x.b);
            fwDwonSuccessInfo.setFontPath(cVar.x.f);
            fwDwonSuccessInfo.setFontVersionCode(Integer.valueOf(this.d.getValue().getVersionCode(cVar.x.c)));
            sb.append(cVar.x.d);
        }
        sb.append(";");
        d dVar4 = cVar.A;
        if (dVar4 == null || !dVar4.a()) {
            sb.append(-1);
        } else {
            fwDwonSuccessInfo.setBaseResource(cVar.A.b);
            fwDwonSuccessInfo.setBaseResourceName(cVar.A.b);
            fwDwonSuccessInfo.setBaseResourcePath(cVar.A.f);
            fwDwonSuccessInfo.setBaseResourceVersionCode(Integer.valueOf(this.d.getValue().getVersionCode(cVar.A.c)));
            sb.append(cVar.A.d);
        }
        sb.append(";");
        d dVar5 = cVar.B;
        if (dVar5 == null || !dVar5.a()) {
            sb.append(-1);
        } else {
            fwDwonSuccessInfo.setExternalResource(cVar.B.b);
            fwDwonSuccessInfo.setExternalResourceName(cVar.B.b);
            fwDwonSuccessInfo.setExternalResourcePath(cVar.B.f);
            fwDwonSuccessInfo.setExternalResourceVersionCode(Integer.valueOf(this.d.getValue().getVersionCode(cVar.B.c)));
        }
        sb.append(";");
        sb.append(cVar.k);
        d dVar6 = cVar.w;
        if (dVar6 != null && dVar6.a()) {
            fwDwonSuccessInfo.setGps(cVar.w.b);
            fwDwonSuccessInfo.setGpsName(cVar.w.b);
            fwDwonSuccessInfo.setGpsPath(cVar.w.f);
            fwDwonSuccessInfo.setGpsVersionCode(cVar.w.c);
        }
        fwDwonSuccessInfo.setFwRelyVersion(sb.toString());
        HMDaoManager.getInstance().getFwDwonSuccessInfoDao().insertOrReplace(fwDwonSuccessInfo);
    }

    private void F(@NonNull DeviceInfo deviceInfo, boolean z) {
        String firmwareVersionStr;
        if (z) {
            HMFirmware currentFwInfo = this.d.getValue().getCurrentFwInfo(deviceInfo);
            if (currentFwInfo == null) {
                return;
            } else {
                firmwareVersionStr = currentFwInfo.getFwVersion();
            }
        } else {
            firmwareVersionStr = deviceInfo.getFirmwareVersionStr();
        }
        int versionCode = this.d.getValue().getVersionCode(firmwareVersionStr);
        if (TextUtils.isEmpty(firmwareVersionStr) || versionCode == -1) {
            return;
        }
        FwDwonSuccessInfo fwDwonSuccessInfo = new FwDwonSuccessInfo();
        fwDwonSuccessInfo.setSource(deviceInfo.getDeviceSource().getValue());
        fwDwonSuccessInfo.setProductVersion(Integer.valueOf(deviceInfo.getProductVersion()));
        fwDwonSuccessInfo.setForceUpgrade(Boolean.TRUE);
        fwDwonSuccessInfo.setServerAppVersion(HMAppConfig.getVersionCode());
        fwDwonSuccessInfo.setChangeLog(null);
        fwDwonSuccessInfo.setLocalFwVersion(firmwareVersionStr);
        fwDwonSuccessInfo.setLocalFwVersionCode(versionCode);
        fwDwonSuccessInfo.setFwType(z ? h : FW_TYPE_ONLINE);
        HMDaoManager.getInstance().getFwDwonSuccessInfoDao().insertOrReplace(fwDwonSuccessInfo);
    }

    private void G(@NonNull c cVar, HMDeviceType hMDeviceType) {
        int i2;
        boolean zC = C(cVar);
        if (zC) {
            i2 = 0;
            E(cVar);
        } else {
            i2 = 1;
        }
        D(hMDeviceType);
        EventBus.getDefault().post(new EventFwCheckResult(zC, i2));
    }

    public static String createDeviceValue(DeviceInfo deviceInfo) {
        int value = deviceInfo.getDeviceSource().getValue();
        int productVersion = deviceInfo.getProductVersion();
        if (productVersion == -1) {
            return String.valueOf(value);
        }
        return value + "_" + productVersion;
    }

    private void e(HMDeviceType hMDeviceType) {
        Integer num = this.a.get(hMDeviceType);
        if (num == null) {
            this.a.put(hMDeviceType, 0);
        } else {
            this.a.put(hMDeviceType, Integer.valueOf(num.intValue() + 1));
        }
    }

    private boolean f(@NonNull d dVar) {
        File file = new File(dVar.f);
        try {
            if (!file.exists()) {
                HMLog.i(e, "fwFile is't exists", new Object[0]);
                return false;
            }
            String fileMD5String = Md5FileUtils.getFileMD5String(file);
            if (!TextUtils.isEmpty(fileMD5String) && fileMD5String.equalsIgnoreCase(dVar.b)) {
                return true;
            }
            HMLog.i(e, "delete error file:" + file.delete(), new Object[0]);
            return false;
        } catch (IOException e2) {
            HMLog.i(e, e2.toString(), new Object[0]);
            return false;
        }
    }

    private boolean g(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getBaseResource()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getBaseResourceName()) && fwDwonSuccessInfo.getBaseResourceVersionCode() != null && fwDwonSuccessInfo.getBaseResourceVersionCode().intValue() == this.d.getValue().getVersionCode(dVar.c);
        }
        return true;
    }

    public static int getFlag(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            String[] strArrSplit = str.split(";");
            if (i2 < strArrSplit.length - 1) {
                return Integer.parseInt(strArrSplit[i2]);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static HMFwOnlineManager getInstance() {
        return e.a;
    }

    public static String getLangs(String str) {
        try {
            String[] strArrSplit = str.split(";");
            return strArrSplit[strArrSplit.length - 1];
        } catch (Exception unused) {
            return null;
        }
    }

    public static Locale getLocale(DeviceInfo deviceInfo) {
        HMOtherVersion otherVersion;
        HMLanguage language;
        Locale locale = Locale.getDefault();
        if (deviceInfo == null || !deviceInfo.getLanguageComBination().isSupportDeviceSettings() || (otherVersion = deviceInfo.getOtherVersion()) == null || (language = otherVersion.getLanguage()) == null) {
            return locale;
        }
        try {
            return HmLocale.getLocale(language.getLanguage());
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return locale;
        }
    }

    private boolean h(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getExternalResource()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getExternalResourceName()) && fwDwonSuccessInfo.getExternalResourceVersionCode() != null && fwDwonSuccessInfo.getExternalResourceVersionCode().intValue() == this.d.getValue().getVersionCode(dVar.c);
        }
        return true;
    }

    private boolean i(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getFont()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getFontName()) && fwDwonSuccessInfo.getFontVersionCode() != null && fwDwonSuccessInfo.getFontVersionCode().intValue() == this.d.getValue().getVersionCode(dVar.c);
        }
        return true;
    }

    private boolean j(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getLocalMd5Content()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getFwName()) && dVar.c.equalsIgnoreCase(fwDwonSuccessInfo.getLocalFwVersion());
        }
        return true;
    }

    private boolean k(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getGps()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getGpsName()) && dVar.c.equalsIgnoreCase(fwDwonSuccessInfo.getGpsVersionCode());
        }
        return true;
    }

    private boolean l(@NonNull FwDwonSuccessInfo fwDwonSuccessInfo, @NonNull d dVar) {
        if (dVar.a()) {
            return dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getResource()) && dVar.b.equalsIgnoreCase(fwDwonSuccessInfo.getResourceName()) && fwDwonSuccessInfo.getResourceVersionCode() != null && fwDwonSuccessInfo.getResourceVersionCode().intValue() == this.d.getValue().getVersionCode(dVar.c);
        }
        return true;
    }

    private boolean m(@NonNull DeviceInfo deviceInfo, @NonNull c cVar) {
        FwDwonSuccessInfo info = FwDaoManager.getManager().getInfo(deviceInfo.getDeviceSource(), deviceInfo.getProductVersion());
        String languageCode = HMLanguage.getLanguageCode(getLocale(deviceInfo));
        if (TextUtils.isEmpty(cVar.k) || !cVar.k.contains(languageCode)) {
            cVar.k = languageCode;
        }
        if (info == null) {
            return false;
        }
        return (info.getSource() == cVar.c && info.getProductVersion() != null && info.getProductVersion().intValue() == cVar.h && p(getLangs(info.getFwRelyVersion()), cVar.k) && info.getServerAppVersion() == HMAppConfig.getVersionCode() && p(info.getChangeLog(), cVar.d) && info.getLocalFwVersionCode() == cVar.i) && j(info, cVar.z) && l(info, cVar.y) && i(info, cVar.x) && k(info, cVar.w) && g(info, cVar.A) && h(info, cVar.B);
    }

    private void n(String str, List<String> list) {
        for (String str2 : new File(str).list()) {
            File file = new File(str, str2);
            if (!list.contains(file.getAbsolutePath())) {
                HMLog.i(e, "delete deleteExpiredFw:" + file.delete(), new Object[0]);
            }
        }
    }

    private boolean o(@NonNull d dVar, FwDownloadAnalyticsData fwDownloadAnalyticsData) {
        File file = new File(dVar.f);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        HMWebUtil.doSeparateRequest(dVar.a, (Map<String, String>) null, file, Support.RequestSupport.GET, false, true, (IHMFileDownloadResponseHandler) new b(fwDownloadAnalyticsData), new HMHttpConfig[0]);
        return f(dVar);
    }

    private boolean p(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return true;
        }
        return TextUtils.equals(str, str2);
    }

    private FwDownloadAnalyticsData q(@NonNull String str, @NonNull c cVar) {
        str.hashCode();
        switch (str) {
            case "ft":
                HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(cVar.c);
                String str2 = cVar.m;
                d dVar = cVar.x;
                return new FwDownloadAnalyticsData(hMDeviceSourceFromValue, str2, dVar.c, cVar.e, str, cVar.s, dVar.d, "other");
            case "fw":
                HMDeviceSource hMDeviceSourceFromValue2 = HMDeviceSource.fromValue(cVar.c);
                String str3 = cVar.l;
                d dVar2 = cVar.z;
                return new FwDownloadAnalyticsData(hMDeviceSourceFromValue2, str3, dVar2.c, cVar.e, str, cVar.r, dVar2.d, "other");
            case "gps":
                return new FwDownloadAnalyticsData(HMDeviceSource.fromValue(cVar.c), cVar.p, cVar.w.c, cVar.e, str, -1, -1, "other");
            case "res":
                HMDeviceSource hMDeviceSourceFromValue3 = HMDeviceSource.fromValue(cVar.c);
                String str4 = cVar.n;
                d dVar3 = cVar.y;
                return new FwDownloadAnalyticsData(hMDeviceSourceFromValue3, str4, dVar3.c, cVar.e, str, cVar.t, dVar3.d, "other");
            case "bres":
                HMDeviceSource hMDeviceSourceFromValue4 = HMDeviceSource.fromValue(cVar.c);
                String str5 = cVar.o;
                d dVar4 = cVar.A;
                return new FwDownloadAnalyticsData(hMDeviceSourceFromValue4, str5, dVar4.c, cVar.e, str, cVar.u, dVar4.d, "other");
            case "eres":
                HMDeviceSource hMDeviceSourceFromValue5 = HMDeviceSource.fromValue(cVar.c);
                String str6 = cVar.q;
                d dVar5 = cVar.B;
                return new FwDownloadAnalyticsData(hMDeviceSourceFromValue5, str6, dVar5.c, cVar.e, str, cVar.v, dVar5.d, "other");
            default:
                return null;
        }
    }

    private c r(@NonNull DeviceInfo deviceInfo, String str, HMDeviceType hMDeviceType) {
        Locale locale = getLocale(deviceInfo);
        int value = deviceInfo.getDeviceSource().getValue();
        HMOtherVersion otherVersion = deviceInfo.getOtherVersion();
        PnP pnp = deviceInfo.getPnp();
        String url = HMServerDef.getUrl(j);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("appVersion", HMAppConfig.getVersionName() + "_" + HMAppConfig.getVersionCode());
        systemParams.put("deviceType", "ALL");
        systemParams.put("deviceSource", Integer.valueOf(value));
        systemParams.put("firmwareVersion", s(str));
        systemParams.put("gpsVersion", deviceInfo.getGpsVersionStr());
        systemParams.put("support8Bytes", Boolean.TRUE);
        systemParams.put("userId", Long.valueOf(HMLoginManager.getValidUid()));
        String country = locale.getCountry();
        systemParams.put("lang", HMLanguage.getLanguageCode(locale) + "_" + country);
        if (TextUtils.isEmpty(country)) {
            systemParams.remove("country");
        } else {
            systemParams.put("country", country);
        }
        c cVar = new c();
        cVar.l = str;
        cVar.p = deviceInfo.getGpsVersionStr();
        if (otherVersion != null && hMDeviceType != HMDeviceType.EARBUD) {
            systemParams.put("firmwareFlag", Integer.valueOf(otherVersion.getFwFlag()));
            systemParams.put("fontVersion", Integer.valueOf(otherVersion.getFontVersion()));
            systemParams.put("fontFlag", Integer.valueOf(otherVersion.getFontFlag()));
            systemParams.put("resourceVersion", Integer.valueOf(otherVersion.getResourceVersion()));
            systemParams.put("resourceFlag", Integer.valueOf(otherVersion.getResourceFlag()));
            cVar.m = String.valueOf(otherVersion.getFontVersion());
            cVar.n = String.valueOf(otherVersion.getResourceVersion());
            cVar.r = otherVersion.getFwFlag();
            cVar.s = otherVersion.getFontFlag();
            cVar.t = otherVersion.getResourceFlag();
            SystemImageStatus systemImageStatus = otherVersion.getSystemImageStatus();
            if (systemImageStatus != null && systemImageStatus != SystemImageStatus.NoInformation.INSTANCE) {
                systemParams.put("diagnosticCode", Integer.valueOf(systemImageStatus.getCode()));
            }
            BaseResourceInfo baseResourceInfo = otherVersion.getBaseResourceInfo();
            if (baseResourceInfo != null) {
                systemParams.put("baseResourceVersion", Integer.valueOf(baseResourceInfo.getResVersion()));
                systemParams.put("baseResourceFlag", Integer.valueOf(baseResourceInfo.getResFlag()));
                cVar.o = String.valueOf(baseResourceInfo.getResVersion());
                cVar.u = baseResourceInfo.getResFlag();
            }
            ExternalResourceInfo externalResourceInfo = otherVersion.getExternalResourceInfo();
            if (externalResourceInfo != null) {
                systemParams.put("extResourceVersion", Integer.valueOf(externalResourceInfo.getVersion()));
                systemParams.put("extResourceFlag", Integer.valueOf(externalResourceInfo.getFlag()));
                cVar.q = String.valueOf(externalResourceInfo.getVersion());
                cVar.v = externalResourceInfo.getFlag();
            } else if (HMDeviceFeature.hasFeatureBaseResource(deviceInfo.getDeviceSource())) {
                systemParams.put("extResourceVersion", -1);
                systemParams.put("extResourceFlag", -1);
                cVar.q = EcgData.DEFAULT_DIGIT_VALUE;
                cVar.v = -1;
            }
        }
        if (pnp != null) {
            systemParams.put("vendorId", Integer.valueOf(pnp.vendorId));
            systemParams.put("vendorSource", Integer.valueOf(pnp.vendorSource));
        } else {
            systemParams.put("vendorId", -1);
            systemParams.put("vendorSource", -1);
        }
        systemParams.put(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_HARDWARE_VERSION, s(deviceInfo.getHardwareVersionStr()));
        if (value == HMDeviceSource.OTHER_BOLT.getValue()) {
            systemParams.put("productionSource", 15);
        } else if (value == HMDeviceSource.OTHER_BOLT_SECOND.getValue()) {
            systemParams.put("productionSource", 31);
        } else {
            systemParams.put("productionSource", Integer.valueOf(deviceInfo.getProductVersion()));
        }
        systemParams.put("productId", Integer.valueOf(deviceInfo.getProductId()));
        try {
            Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
            systemHeader.put("lang", HMLanguage.getLanguageCode(locale) + "_" + country);
            if (TextUtils.isEmpty(country)) {
                systemHeader.remove("country");
            } else {
                systemHeader.put("country", country);
            }
            HMWebUtil.doSeparateRequest(url, systemHeader, systemParams, Support.RequestSupport.GET, true, true, (IHMBasicHttpResponseHandler) new a(cVar, str), new HMHttpConfig[0]);
            return cVar;
        } catch (Exception e2) {
            HMLog.i(e, e2.getMessage(), new Object[0]);
            return cVar;
        }
    }

    private String s(String str) {
        return (!TextUtils.isEmpty(str) && str.startsWith("V")) ? str.substring(1) : str;
    }

    public static boolean shouldCheckFwAuto(HMDeviceType hMDeviceType) {
        HMBaseDevice device = k.getValue().getDevice(hMDeviceType);
        if (device == null) {
            return true;
        }
        return shouldCheckFwAuto(device.getMDeviceSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(boolean z, HMDeviceType hMDeviceType, DeviceInfo deviceInfo, HMBaseDevice hMBaseDevice, boolean z2) {
        if (!z || HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType)) {
            e(hMDeviceType);
            c cVarR = r(deviceInfo, hMBaseDevice.getDeviceVersion(), hMBaseDevice.getDeviceType());
            if (cVarR == null) {
                HMLog.i(e, "fw is null", new Object[0]);
                D(hMDeviceType);
                return;
            }
            if (cVarR.b) {
                HMLog.i(e, "fw ignore!", new Object[0]);
                F(deviceInfo, true);
                D(hMDeviceType);
                EventBus.getDefault().post(new EventFwCheckResult(false));
                return;
            }
            if (!cVarR.a()) {
                HMLog.i(e, "fw has not", new Object[0]);
                F(deviceInfo, false);
                D(hMDeviceType);
                EventBus.getDefault().post(new EventFwCheckResult(false, cVarR.C));
                return;
            }
            if (m(deviceInfo, cVarR) && !z2) {
                D(hMDeviceType);
            } else {
                l.getValue().saveFwUpgradeTime(createDeviceValue(deviceInfo), 0L);
                G(cVarR, hMDeviceType);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(boolean z) {
        Iterator<f> it2 = g.iterator();
        while (it2.hasNext()) {
            it2.next().a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(int i2) {
        Iterator<f> it2 = g.iterator();
        while (it2.hasNext()) {
            it2.next().onProgress(i2);
        }
    }

    private int w(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Date date = new SimpleDateFormat("yyyyMMddhhmm").parse(str);
                if (date != null) {
                    return (int) (date.getTime() / 1000);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str, c cVar, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("ignore", false);
            cVar.b = zOptBoolean;
            if (zOptBoolean) {
                return;
            }
            String strOptString = jSONObject.optString("lang");
            int iOptInt = jSONObject.optInt("upgradeType");
            int iOptInt2 = jSONObject.optInt("deviceSource");
            int iOptInt3 = jSONObject.optInt("productionSource", -1);
            String strOptString2 = jSONObject.optString("heartRateVersion");
            cVar.w = y("gps", iOptInt2, jSONObject);
            cVar.x = y("font", iOptInt2, jSONObject);
            cVar.y = y("resource", iOptInt2, jSONObject);
            cVar.z = y("firmware", iOptInt2, jSONObject);
            cVar.A = y("baseResource", iOptInt2, jSONObject);
            cVar.B = y("extResource", iOptInt2, jSONObject);
            cVar.a = w(jSONObject.optString("buildTime", ""));
            cVar.k = strOptString;
            cVar.c = iOptInt2;
            cVar.d = jSONObject.optString("changeLog");
            cVar.e = iOptInt == 2;
            cVar.f = strOptString2;
            cVar.g = this.d.getValue().getVersionCode(strOptString2);
            cVar.h = iOptInt3;
            d dVar = cVar.z;
            if (dVar == null || !dVar.a()) {
                cVar.j = str2;
                cVar.i = this.d.getValue().getVersionCode(str2);
            } else {
                cVar.j = cVar.z.c;
                cVar.i = this.d.getValue().getVersionCode(cVar.z.c);
            }
        } catch (JSONException unused) {
            HMLog.i(e, "parse error.", new Object[0]);
        }
    }

    private d y(String str, int i2, @NonNull JSONObject jSONObject) {
        return new d(jSONObject.optString(str + "Url"), jSONObject.optString(str + "Md5"), jSONObject.optString(str + "Version"), jSONObject.optLong(str + "Length"), i2, jSONObject.optInt(str + "Flag", -1));
    }

    private void z(final boolean z) {
        this.b.post(new Runnable() { // from class: av2
            @Override // java.lang.Runnable
            public final void run() {
                HMFwOnlineManager.u(z);
            }
        });
    }

    public void checkAll() {
        DeviceManagerApi value = k.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (value.isConnected(hMDeviceType)) {
            checkFw(hMDeviceType, false);
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.WEIGHT;
        if (value.isConnected(hMDeviceType2)) {
            checkFw(hMDeviceType2, false);
        }
        HMDeviceType hMDeviceType3 = HMDeviceType.SHOES;
        if (value.isConnected(hMDeviceType3)) {
            checkFw(hMDeviceType3, false);
        }
        HMDeviceType hMDeviceType4 = HMDeviceType.EARBUD;
        if (value.isConnected(hMDeviceType4)) {
            checkFw(hMDeviceType4, false);
        }
        HMDeviceType hMDeviceType5 = HMDeviceType.TREADMILL;
        if (value.isConnected(hMDeviceType5)) {
            checkFw(hMDeviceType5, false);
        }
        HMDeviceType hMDeviceType6 = HMDeviceType.HEADSET;
        if (value.isConnected(hMDeviceType6)) {
            checkFw(hMDeviceType6, false);
        }
    }

    public void checkFw(HMDeviceType hMDeviceType, boolean z) {
        checkFw(hMDeviceType, z, false);
    }

    public boolean isDownloading(HMDeviceType hMDeviceType) {
        Integer num = this.a.get(hMDeviceType);
        return num != null && num.intValue() > 0;
    }

    public boolean needUpgrade(DeviceInfo deviceInfo) {
        return !TimeUtils.isTheSameDay(l.getValue().getFwUpgradeTime(createDeviceValue(deviceInfo)), System.currentTimeMillis());
    }

    public void registerDataObserver(f fVar) {
        g.add(fVar);
    }

    public void unregisterDataObserver(f fVar) {
        if (fVar != null) {
            g.remove(fVar);
        }
    }

    public void checkFw(final HMDeviceType hMDeviceType, final boolean z, final boolean z2) {
        final HMBaseDevice device = k.getValue().getDevice(hMDeviceType);
        if (device == null) {
            HMLog.i(e, "device is null", new Object[0]);
            return;
        }
        final DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(e, "deviceInfo is null", new Object[0]);
        } else if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
            this.c.getValue().getSerialExecutor().execute(new Runnable() { // from class: zu2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.t(z2, hMDeviceType, deviceInfo, device, z);
                }
            });
        }
    }

    public static boolean shouldCheckFwAuto(HMDeviceSource hMDeviceSource) {
        return !f.contains(hMDeviceSource);
    }
}
