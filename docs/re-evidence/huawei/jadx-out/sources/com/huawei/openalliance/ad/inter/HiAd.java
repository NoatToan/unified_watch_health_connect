package com.huawei.openalliance.ad.inter;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.hms.pps.EnableServiceResult;
import com.huawei.hms.pps.HwPPS;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.beans.server.AdPreReq;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.download.app.interfaces.AutoOpenListener;
import com.huawei.openalliance.ad.download.app.l;
import com.huawei.openalliance.ad.dw;
import com.huawei.openalliance.ad.dynamictemplate.IImageLoader;
import com.huawei.openalliance.ad.ew;
import com.huawei.openalliance.ad.fb;
import com.huawei.openalliance.ad.fi;
import com.huawei.openalliance.ad.fj;
import com.huawei.openalliance.ad.fl;
import com.huawei.openalliance.ad.fn;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.fu;
import com.huawei.openalliance.ad.gf;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.GameData;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListenerV1;
import com.huawei.openalliance.ad.inter.listeners.ExtensionActionListener;
import com.huawei.openalliance.ad.inter.listeners.IAskForUnlockScreen;
import com.huawei.openalliance.ad.inter.listeners.IExSplashCallback;
import com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback;
import com.huawei.openalliance.ad.inter.listeners.ISyncPlayedGameListener;
import com.huawei.openalliance.ad.inter.listeners.LandingPageAction;
import com.huawei.openalliance.ad.inter.listeners.LinkedAdListener;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.is;
import com.huawei.openalliance.ad.jt;
import com.huawei.openalliance.ad.kf;
import com.huawei.openalliance.ad.magazine.inter.listener.IAdInvalidHandler;
import com.huawei.openalliance.ad.magazine.inter.listener.IPPSDownloadService;
import com.huawei.openalliance.ad.media.IMultiMediaPlayingManager;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.net.http.HttpsConfig;
import com.huawei.openalliance.ad.nt;
import com.huawei.openalliance.ad.pd;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.ai;
import com.huawei.openalliance.ad.utils.am;
import com.huawei.openalliance.ad.utils.an;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bg;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bl;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.bp;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.ck;
import com.huawei.openalliance.ad.utils.cl;
import com.huawei.openalliance.ad.utils.cn;
import com.huawei.openalliance.ad.utils.cy;
import com.huawei.openalliance.ad.utils.da;
import com.huawei.openalliance.ad.utils.dcservice.PlayedGameRsp;
import com.huawei.openalliance.ad.utils.dd;
import com.huawei.openalliance.ad.utils.de;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dl;
import com.huawei.openalliance.ad.utils.dm;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.k;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.utils.t;
import com.huawei.openalliance.ad.utils.y;
import java.io.File;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class HiAd implements IHiAd, com.huawei.openalliance.ad.inter.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19006a = "HiAd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HiAd f19007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f19008c = new byte[0];
    private IPPSDownloadService D;
    private IAdInvalidHandler E;
    private IAskForUnlockScreen G;
    private IHiAd.IIntentProcessor H;
    private Context d;
    private gk e;
    private gf f;
    private LandingPageAction g;
    private IMultiMediaPlayingManager h;
    private IAppDownloadManager j;
    private AppDownloadListener k;
    private AppDownloadListenerV1 l;
    private AutoOpenListener m;
    private IPPSWebEventCallback n;
    private IExSplashCallback o;
    private ExtensionActionListener p;
    private int q;
    private int r;
    private LinkedAdListener s;
    private RequestOptions u;
    private Integer v;
    private AppStatusQuery z;
    private Map<BroadcastReceiver, IntentFilter> i = new HashMap();
    private int t = -1;
    private boolean w = true;
    private boolean x = true;
    private int y = 0;
    private Map<Integer, Boolean> A = new HashMap();
    private Boolean B = null;
    private boolean C = true;
    private WeakReference<Activity> F = null;
    private BroadcastReceiver I = new BroadcastReceiver() { // from class: com.huawei.openalliance.ad.inter.HiAd.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.3.1
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    for (Map.Entry entry : HiAd.this.i.entrySet()) {
                        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) entry.getKey();
                        IntentFilter intentFilter = (IntentFilter) entry.getValue();
                        if (intentFilter != null && intentFilter.matchAction(action)) {
                            broadcastReceiver.onReceive(context, intent);
                        }
                    }
                }
            });
        }
    };

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    @Deprecated
    public void requestConfig(String str) {
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void syncMediaGrs(String str, String str2) {
        da.a().b(str2);
        initGrs(str);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setVideoAutoPlayNet(int i) {
        try {
            hw.b(f19006a, "net type: %d", Integer.valueOf(i));
            fp.b(this.d).l(i);
        } catch (Throwable th) {
            hw.c(f19006a, "set net err, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setRequestConfiguration(RequestOptions requestOptions) {
        this.u = requestOptions;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setPPSWebListener(IPPSWebEventCallback iPPSWebEventCallback) {
        this.n = iPPSWebEventCallback;
        dq.a(new h(this.n));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setPPSDownloadService(IPPSDownloadService iPPSDownloadService) {
        this.D = iPPSDownloadService;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setOpenWebPageByBrowser(boolean z) {
        this.B = Boolean.valueOf(z);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setOpenLinkStatus(boolean z) {
        this.w = z;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setMultiMediaPlayingManager(IMultiMediaPlayingManager iMultiMediaPlayingManager) {
        this.h = iMultiMediaPlayingManager;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setLandingPageAction(LandingPageAction landingPageAction) {
        this.g = landingPageAction;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setIsPreloadWebView(boolean z) {
        this.C = z;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setImageLoader(IImageLoader iImageLoader) {
        com.huawei.openalliance.ad.dynamictemplate.a.a().a(iImageLoader);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setExtensionActionListener(ExtensionActionListener extensionActionListener) {
        this.p = extensionActionListener;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setExSplashCallback(IExSplashCallback iExSplashCallback, int i, int i2) {
        this.o = iExSplashCallback;
        this.q = i;
        this.r = i2;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setExLinkedAdListener(LinkedAdListener linkedAdListener) {
        this.s = linkedAdListener;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setCustomSSLSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        HttpsConfig.a(sSLSocketFactory);
        HttpsConfig.a(x509TrustManager);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setCurActivity(Activity activity) {
        if (activity != null) {
            this.F = new WeakReference<>(activity);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setCountryCode(String str) {
        this.e.n(str);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setConsent(final String str) {
        hw.b(f19006a, "set TCF consent string");
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.6
            @Override // java.lang.Runnable
            public void run() {
                na.a(HiAd.this.d).a(RTCMethods.SET_TCF_CONSENT_STRING, str, null, null);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setBrowserAppDownloadListener(AppDownloadListenerV1 appDownloadListenerV1) {
        this.l = appDownloadListenerV1;
        dq.a(new f(appDownloadListenerV1));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setBrand(int i) {
        this.v = Integer.valueOf(i);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAutoOpenListener(AutoOpenListener autoOpenListener) {
        this.m = autoOpenListener;
        dq.a(new e(autoOpenListener));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAskForUnlockScreen(IAskForUnlockScreen iAskForUnlockScreen) {
        this.G = iAskForUnlockScreen;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAppStatusQuery(AppStatusQuery appStatusQuery) {
        this.z = appStatusQuery;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAppInstalledNotify(boolean z) {
        this.x = z;
        hw.a(f19006a, "set app installed notify: %s", Boolean.valueOf(z));
        a(this.x, this.y, MapKeyNames.FULL_SCREEN_NOTIFY);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAppDownloadListener(AppDownloadListener appDownloadListener) {
        this.k = appDownloadListener;
        dq.a(new g(appDownloadListener));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAppAutoOpenForbidden(boolean z) {
        hw.b(f19006a, "set app AutoOpenForbidden: " + z);
        this.e.f(z);
        com.huawei.openalliance.ad.download.ag.f.a(this.d, z, new c(), String.class);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAppActivateStyle(int i) {
        this.y = i;
        hw.a(f19006a, "set app activate style: %s", Integer.valueOf(i));
        a(this.x, this.y, MapKeyNames.ACTIVATE_NOTIFY_STYLE);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void setAdInvalidHandler(IAdInvalidHandler iAdInvalidHandler) {
        this.E = iAdInvalidHandler;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void reportGameData(final List<String> list, final List<String> list2) {
        if (bm.a(list) || bm.a(list2)) {
            return;
        }
        if (list.size() != list2.size()) {
            hw.b(f19006a, "reportGameData, invalid input");
            return;
        }
        if (list.size() > 20) {
            list = list.subList(0, 20);
            list2 = list2.subList(0, 20);
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.10
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.analysis.c cVar = new com.huawei.openalliance.ad.analysis.c(HiAd.this.d.getApplicationContext());
                int size = list.size();
                cVar.a(size, a(list, size), a(list), a(list2));
            }

            private String a(List<String> list3) {
                StringBuilder sb = new StringBuilder("{");
                Iterator<String> it = list3.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
                sb.append("}");
                return sb.toString();
            }

            private float a(List<String> list3, int i) {
                Iterator<String> it = list3.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if ("AD".equals(it.next())) {
                        i2++;
                    }
                }
                return new BigDecimal(i2).divide(new BigDecimal(i), 2, RoundingMode.HALF_UP).floatValue();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void registerIntentProcessor(IHiAd.IIntentProcessor iIntentProcessor) {
        Log.d(f19006a, "registerIntentProcessor: " + iIntentProcessor);
        this.H = iIntentProcessor;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void placementAdPreCfgReq() {
        final String strCg = this.e.cg();
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.7
            @Override // java.lang.Runnable
            public void run() {
                HiAd.this.f.a(strCg);
                hw.a(HiAd.f19006a, "placementAdPreCfgReq slotId is: %s", strCg);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void onForeground() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.4
            @Override // java.lang.Runnable
            public void run() {
                ck.a(HiAd.this.d).a();
                dw.h().j();
                HiAd hiAd = HiAd.this;
                hiAd.c(hiAd.d);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void onBackground() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.5
            @Override // java.lang.Runnable
            public void run() {
                ck.a(HiAd.this.d).b();
                dw.h().i();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public Boolean o() {
        return this.B;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void notifyUiModeChange(int i) {
        try {
            hw.b(f19006a, "ui mode: %d", Integer.valueOf(i));
            fp.b(this.d).m(i);
            Intent intent = new Intent(Constants.UI_CHANGE_ACTION);
            intent.setPackage(this.d.getPackageName());
            this.d.sendBroadcast(intent);
        } catch (Throwable th) {
            hw.c(f19006a, "set ui mode err, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public boolean n() {
        if (!ab.t(this.d)) {
            return false;
        }
        boolean zAj = fp.b(this.d).aj();
        hw.b(f19006a, "isSetSurfaceFirst: %s", Boolean.valueOf(zAj));
        return zAj;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public boolean m() {
        return this.C;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public AppStatusQuery l() {
        return this.z;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public boolean k() {
        return this.w;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public Integer j() {
        return this.v;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public boolean isVideoCacheWhenPlay(int i) {
        if (this.A.containsKey(Integer.valueOf(i))) {
            return this.A.get(Integer.valueOf(i)).booleanValue();
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public boolean isEnableUserInfo() {
        if (as.b(this.d)) {
            return this.e.bf();
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public boolean isAppInstalledNotify() {
        return this.x;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public boolean isAppAutoOpenForbidden() {
        return this.e.cs();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void initOptions(Context context) {
        o.b(new d(context));
        u();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void initLog(boolean z, int i, String str) {
        if (as.b(this.d) && z) {
            bp.a(this.d, i, str);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void initLog(boolean z, int i) {
        initLog(z, i, null);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void initGrs(String str, String str2) {
        if (!cc.b(this.d)) {
            da.a().a(str2);
        }
        initGrs(str);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void initGrs(String str) {
        da.a().c(str);
        if (an.a()) {
            da.a().a(this.d);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void informReady() {
        com.huawei.openalliance.ad.inter.d.a(this.d).b();
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public int i() {
        return this.r;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public int h() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    @Deprecated
    public Map<String, List<String>> getTemplates(List<String> list) {
        hw.b(f19006a, "@Deprecated function:getTemplates()");
        return new HashMap();
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public RequestOptions getRequestConfiguration() {
        if (this.u == null) {
            this.u = new RequestOptions.Builder().build();
        }
        return this.u;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void getPlayedGameList(int i, ISyncPlayedGameListener iSyncPlayedGameListener) {
        if (iSyncPlayedGameListener == null) {
            return;
        }
        if (i < 1) {
            hw.a(f19006a, "getPlayedGameList, size is invalid");
            iSyncPlayedGameListener.onResult(null);
            a(-11);
            return;
        }
        if (i > 20) {
            i = 20;
        }
        if (!E()) {
            hw.b(f19006a, "hms version not support query game");
            iSyncPlayedGameListener.onResult(null);
            a(-8);
            return;
        }
        if (System.currentTimeMillis() - this.e.cJ() >= this.e.as()) {
            hw.a(f19006a, "getPlayedGameList");
            this.e.q(System.currentTimeMillis());
            com.huawei.openalliance.ad.utils.dcservice.a.a(iSyncPlayedGameListener, this.d, i);
            return;
        }
        String str = f19006a;
        hw.a(str, "getPlayedGameList, still in interval.");
        String strCK = this.e.cK();
        hw.a(str, "lastQueryResult from sp is %s", strCK);
        PlayedGameRsp playedGameRsp = (PlayedGameRsp) bk.b(this.d, strCK, PlayedGameRsp.class, new Class[0]);
        if (playedGameRsp == null || bm.a(playedGameRsp.a())) {
            iSyncPlayedGameListener.onResult(null);
            return;
        }
        List<GameData> listA = playedGameRsp.a();
        if (listA.size() > i) {
            listA = a(i, listA);
        }
        iSyncPlayedGameListener.onResult(listA);
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public IPPSDownloadService getPPSDownloadService() {
        return this.D;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public IHiAd.IIntentProcessor getIntentProcessor() {
        hw.a(f19006a, "getIntentProcessor: %s", this.H);
        return this.H;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public ExtensionActionListener getExtensionActionListener() {
        return this.p;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public String getEngineVer() {
        String strA = com.huawei.openalliance.ad.e.a();
        hw.b(f19006a, "engineVer: %s", strA);
        return strA;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public Activity getCurActivity() {
        WeakReference<Activity> weakReference = this.F;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public IAskForUnlockScreen getAskForUnlockScreen() {
        return this.G;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public IAppDownloadManager getAppDownloadManager() {
        if (this.j == null) {
            this.j = new l();
        }
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public int getAppActivateStyle() {
        return this.y;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public IAdInvalidHandler getAdInvalidHandler() {
        return this.E;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public LinkedAdListener g() {
        return this.s;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public IExSplashCallback f() {
        return this.o;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void enableVideoCacheWhenPlay(int i, boolean z) {
        hw.b(f19006a, "enableVideoCacheWhenPlay, type: %s, enable: %s", Integer.valueOf(i), Boolean.valueOf(z));
        this.A.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void enableUserInfo(boolean z) {
        if (as.b(this.d)) {
            this.e.b(z);
            a(z);
            if (z) {
                x();
            } else {
                o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.19
                    @Override // java.lang.Runnable
                    public void run() {
                        ew.a(HiAd.this.d).e();
                        fb.a(HiAd.this.d).e();
                        fu.a(HiAd.this.d).e();
                        fj.a(HiAd.this.d).e();
                        HiAd.this.z();
                    }
                });
            }
            if (an.a()) {
                da.a().a(this.d, z);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void enableSharePd(boolean z) {
        if (as.b(this.d)) {
            this.e.d(z);
        }
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public void enableAndroidId(boolean z) {
        hw.a(f19006a, "enableAndroidId: %s", Boolean.valueOf(z));
        fp.b(this.d).c(z);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public boolean e() {
        boolean z = this.t != Process.myPid();
        if (z) {
            this.t = Process.myPid();
        }
        hw.b(f19006a, "isNewProcess:" + z);
        return z;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public Context d() {
        return this.d;
    }

    @Override // com.huawei.openalliance.ad.inter.IHiAd
    public List<String> checkFirstOpen(Map<String, String> map) {
        if (!br.a(map)) {
            a(map);
            return a(this.d.getApplicationContext(), map);
        }
        hw.a(f19006a, "checkFirstOpen: checkMap is empty");
        cl.a(this.d, map, -1L, new ArrayList(), "checkMap is empty");
        return new ArrayList();
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void c(String str) {
        a(str, false, false, true);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public IMultiMediaPlayingManager c() {
        IMultiMediaPlayingManager iMultiMediaPlayingManager = this.h;
        return iMultiMediaPlayingManager != null ? iMultiMediaPlayingManager : com.huawei.openalliance.ad.media.a.a(this.d);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void b(String str) {
        a(str, true, true, true);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public LandingPageAction b() {
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void a(final boolean z) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (!pd.a()) {
                    hw.c(HiAd.f19006a, "ppskit api is not included");
                } else {
                    HiAd.this.b(z);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void a(String str) {
        a(str, true, false, false);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void a(final VideoConfiguration videoConfiguration, final boolean z, final boolean z2, final int i) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.8
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(HiAd.this.d).a(videoConfiguration, z, z2, i);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (broadcastReceiver == null) {
            return;
        }
        this.i.put(broadcastReceiver, intentFilter);
    }

    @Override // com.huawei.openalliance.ad.inter.f
    public void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return;
        }
        this.i.remove(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        A();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        cn cnVarA = cn.a(this.d);
        cnVarA.a();
        if (TextUtils.isEmpty(cnVarA.j())) {
            cnVarA.g(ab.a(this.d));
        }
        dk.a(this.d, "normal");
        dk.a(this.d, "ar");
    }

    private void x() {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.20
            @Override // java.lang.Runnable
            public void run() {
                HiAd.this.y();
                HiAd.this.r();
                jt.a().a(HiAd.this.d);
            }
        });
    }

    private boolean w() {
        if (!cc.a(this.d).n()) {
            return false;
        }
        hw.a(f19006a, "device ready for refresh config");
        return true;
    }

    private long v() {
        int iN;
        if (w() && (iN = df.n()) <= 10) {
            df.a(iN + 1);
            return 0L;
        }
        int iBn = this.e.bn();
        if (cc.a(this.d).m()) {
            hw.a(f19006a, "testDeviceConfigRefreshInterval in use.");
            iBn = this.e.A();
        }
        return iBn * 60000;
    }

    private void u() {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.16
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.analysis.g.a(HiAd.this.d);
                com.huawei.openalliance.ad.e.a(HiAd.this.d);
                com.huawei.openalliance.ad.utils.d.A(HiAd.this.d);
            }
        });
    }

    private void t() {
        if (as.e()) {
            o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.15
                @Override // java.lang.Runnable
                public void run() {
                    Consent.getInstance(HiAd.this.d).getNpaAccordingToServerConsent();
                }
            });
        }
    }

    private void s() {
        o.b(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.14
            @Override // java.lang.Runnable
            public void run() {
                kf.a(HiAd.this.d).c();
                Log.i(HiAd.f19006a, "prerequest.");
                int iZ = HiAd.this.e.Z();
                boolean zJ = ab.j(HiAd.this.d);
                hw.b(HiAd.f19006a, "preRequest, type: %s, isTv: %s", Integer.valueOf(iZ), Boolean.valueOf(zJ));
                if (iZ == 1 || zJ) {
                    fi.a(HiAd.this.d).a(new AdPreReq());
                } else if (iZ == 2) {
                    new NativeAdLoader(HiAd.this.d, new String[]{ConfigMapKeys.CLCT_PRE_REQ}).loadAds(4, true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (System.currentTimeMillis() - this.e.cE() > 86400000) {
            na.a(this.d).a(RTCMethods.QUERY_ACCOUNT_INFO, null, new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.inter.HiAd.12
                /* JADX WARN: Code duplicated, block: B:19:0x007e A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x0010, B:8:0x0019, B:10:0x0025, B:12:0x002b, B:23:0x008a, B:14:0x0032, B:16:0x0049, B:17:0x0063, B:19:0x007e, B:21:0x0084), top: B:28:0x0002 }] */
                /* JADX WARN: Code duplicated, block: B:21:0x0084 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {all -> 0x008e, blocks: (B:3:0x0002, B:5:0x000a, B:7:0x0010, B:8:0x0019, B:10:0x0025, B:12:0x002b, B:23:0x008a, B:14:0x0032, B:16:0x0049, B:17:0x0063, B:19:0x007e, B:21:0x0084), top: B:28:0x0002 }] */
                /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                    String str2;
                    String str3;
                    if (callResult != null) {
                        try {
                            if (callResult.getCode() == 200) {
                                if (hw.a()) {
                                    hw.a(HiAd.f19006a, "query account info from hms success!");
                                }
                                String data = callResult.getData();
                                if (!dg.b(data)) {
                                    JSONObject jSONObject = new JSONObject(data);
                                    boolean zOptBoolean = jSONObject.optBoolean(Constants.IS_COPPA);
                                    boolean zOptBoolean2 = jSONObject.optBoolean(Constants.IS_TFUA);
                                    if (hw.a()) {
                                        hw.a(HiAd.f19006a, "account info get from hms, coppa is %s, tfua is %s", Boolean.valueOf(zOptBoolean), Boolean.valueOf(zOptBoolean2));
                                    }
                                    cn.a(HiAd.this.d).h(zOptBoolean);
                                    cn.a(HiAd.this.d).i(zOptBoolean2);
                                    return;
                                }
                                if (!hw.a()) {
                                    return;
                                }
                                str2 = HiAd.f19006a;
                                str3 = "receiveData is null";
                            } else {
                                if (hw.a()) {
                                    return;
                                }
                                str2 = HiAd.f19006a;
                                str3 = "failed to query account info from hms";
                            }
                        } catch (Throwable th) {
                            hw.d(HiAd.f19006a, "get account info from hms err : %s", th.getClass().getSimpleName());
                            return;
                        }
                    } else {
                        if (hw.a()) {
                            return;
                        }
                        str2 = HiAd.f19006a;
                        str3 = "failed to query account info from hms";
                    }
                    hw.a(str2, str3);
                }
            }, String.class);
            this.e.n(System.currentTimeMillis());
        } else if (hw.a()) {
            hw.a(f19006a, "query account info frequently");
        }
    }

    private void q() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        as.a(this.d, this.I, intentFilter);
    }

    public static boolean isOaidAvaiable(Context context) {
        try {
            String strA = com.huawei.openalliance.ad.utils.d.a(context, k.e(context));
            return strA != null && Integer.parseInt(strA) >= 50005300;
        } catch (Throwable th) {
            Log.i(f19006a, "isOaidAvaiable error: " + th.getClass().getSimpleName());
        }
    }

    public static IHiAd getInstance(Context context) {
        return b(context);
    }

    public static void disableUserInfo(Context context) {
        Log.i(f19006a, "disableUserInfo, context ".concat(context == null ? "is null" : "not null"));
        if (context == null) {
            return;
        }
        fp.b(context).b(false);
        getInstance(context).enableUserInfo(false);
    }

    private void d(String str) {
        int iA = fl.a(this.d).a(str);
        if (iA == 2 || iA == 3) {
            hw.b(f19006a, "invoke kit req sdk config");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("slotid", str);
                jSONObject.put("sdk_type", com.huawei.openalliance.ad.utils.d.z(this.d));
                jSONObject.put(MapKeyNames.UI_ENGINE_VERSION, com.huawei.openalliance.ad.e.a());
                na.a(this.d).a(RTCMethods.REQUEST_SDK_CONFIG, jSONObject.toString(), null, String.class);
            } catch (Throwable th) {
                hw.c(f19006a, "invoke kit req config failed: %s", th.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        boolean zV = com.huawei.openalliance.ad.utils.dk.v(context);
        hw.a(f19006a, "has install permission is: %s", Boolean.valueOf(zV));
        com.huawei.openalliance.ad.download.ag.f.b(context.getApplicationContext(), zV, new a(), String.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        hw.b(f19006a, "enable service: " + z);
        HwPPS.getInstance(this.d).confirmAgreement(z).addOnCompleteListener(new b());
    }

    private static HiAd b(Context context) {
        HiAd hiAd;
        synchronized (f19008c) {
            if (f19007b == null) {
                f19007b = new HiAd(context);
            }
            hiAd = f19007b;
        }
        return hiAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, String str, boolean z2) {
        try {
            long jL = z ? this.e.l(str) : this.e.bo();
            long jV = v();
            if (!z2 || System.currentTimeMillis() - jL > jV) {
                AppConfigRsp appConfigRspA = this.f.a(str);
                if (appConfigRspA != null && appConfigRspA.responseCode == 0 && 200 == appConfigRspA.l()) {
                    this.e.a(str, appConfigRspA, z);
                    SdkCfgSha256Record sdkCfgSha256Record = new SdkCfgSha256Record();
                    sdkCfgSha256Record.a(this.d.getPackageName());
                    sdkCfgSha256Record.b(appConfigRspA.Z());
                    fn.a(this.d).a(sdkCfgSha256Record);
                    hw.a(f19006a, "sha256 save to databases, sha256 is %s", appConfigRspA.Z());
                    dk.a(this.d, "normal").b(this.e.bU().longValue());
                    dk.a(this.d, "ar").b(this.e.bU().longValue());
                    d(str);
                } else if (appConfigRspA != null && 206 == appConfigRspA.l()) {
                    if (z) {
                        this.e.a(str, System.currentTimeMillis());
                    } else {
                        this.e.e(System.currentTimeMillis());
                    }
                    hw.b(f19006a, "SDK get config is no change");
                }
            }
            if (an.a()) {
                da.a().a(this.d);
            }
        } catch (Throwable th) {
            String str2 = f19006a;
            hw.b(str2, "RC get exception");
            hw.a(3, str2, th);
        }
    }

    private void a(boolean z, int i, String str) {
        com.huawei.openalliance.ad.download.ag.f.a(this.d.getApplicationContext(), z, i, str, new a(), String.class);
    }

    private void a(Map<String, String> map) {
        map.remove(null);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (dg.b(entry.getValue())) {
                map.remove(key);
            }
        }
    }

    private void a(final String str, final boolean z, final boolean z2, boolean z3) {
        if (as.b(this.d)) {
            if (dg.b(str)) {
                hw.d(f19006a, "adId is empty, please check it!");
            } else if (z3) {
                o.c(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.17
                    @Override // java.lang.Runnable
                    public void run() {
                        HiAd.this.a(z2, str, z);
                    }
                });
            } else {
                o.b(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.18
                    @Override // java.lang.Runnable
                    public void run() {
                        HiAd.this.a(z2, str, z);
                    }
                });
            }
        }
    }

    private void a(final int i) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.11
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(HiAd.this.d.getApplicationContext()).b("0", "0", "" + i);
            }
        });
    }

    private List<String> a(Context context, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        try {
            List<String> listA = cl.a(context, map, arrayList);
            hw.a(f19006a, "get the result from ppskit value is :%s", listA);
            return listA;
        } catch (Throwable th) {
            String simpleName = th.getClass().getSimpleName();
            hw.c(f19006a, "checkFirstOpen: getNeedShowFirstOpenFromKit catch error, %s", simpleName);
            cl.a(context, map, -1L, arrayList, "getNeedShowFirstOpenFromKit catch error: " + simpleName);
            return arrayList;
        }
    }

    private List<GameData> a(int i, List<GameData> list) {
        Collections.sort(list, new Comparator<GameData>() { // from class: com.huawei.openalliance.ad.inter.HiAd.13
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(GameData gameData, GameData gameData2) {
                return Long.compare(gameData2.getRecentPlayedTime(), gameData.getRecentPlayedTime());
            }
        });
        return list.subList(0, i);
    }

    public static com.huawei.openalliance.ad.inter.f a(Context context) {
        return b(context);
    }

    public static com.huawei.openalliance.ad.inter.f a() {
        return f19007b;
    }

    private boolean E() {
        int iA = y.a(this.d);
        hw.a(f19006a, "dc version: %s", Integer.valueOf(iA));
        return iA >= 30478100;
    }

    private void D() {
        if (WhiteListPkgList.isHwBrowserPkgName(this.d.getPackageName())) {
            ((Application) this.d.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.huawei.openalliance.ad.inter.HiAd.9
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    if (activity != null) {
                        hw.a(HiAd.f19006a, "cur activity is: %s", activity.getClass().getSimpleName());
                        HiAd.this.setCurActivity(activity);
                    }
                }
            });
        }
    }

    private void C() {
        com.huawei.openalliance.ad.download.app.e.a(this.d);
        dw.a(this.d);
    }

    static class a implements RemoteCallResultCallback<String> {
        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                hw.a(HiAd.f19006a, "success: set app installed notify in hms, %s", str);
            } else {
                hw.c(HiAd.f19006a, "error: set app installed notify in hms, %s", str);
            }
        }

        private a() {
        }
    }

    static class b implements OnCompleteListener<EnableServiceResult> {
        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<EnableServiceResult> task) {
            if (task == null) {
                hw.b(HiAd.f19006a, "service enable result: false");
                return;
            }
            EnableServiceResult result = task.getResult();
            if (result != null) {
                hw.b(HiAd.f19006a, "service enable result: " + result.isResult());
                return;
            }
            hw.b(HiAd.f19006a, "service enable result: false");
        }

        private b() {
        }
    }

    static class c implements RemoteCallResultCallback<String> {
        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public void onRemoteCallResult(String str, CallResult<String> callResult) {
            if (callResult.getCode() == 200) {
                hw.b(HiAd.f19006a, "set kit AutoOpenForbidden success");
            }
        }

        private c() {
        }
    }

    private void B() {
        String str = dd.g(this.d) + File.separator + Constants.PPS_ROOT_PATH + File.separator;
        if (dg.b(str)) {
            return;
        }
        ai.a(str);
    }

    static class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f19045a;

        @Override // java.lang.Runnable
        public void run() {
            is.a(this.f19045a);
        }

        public d(Context context) {
            this.f19045a = context;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AutoOpenListener f19046a;

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.openalliance.ad.download.app.d.a().a(this.f19046a);
        }

        e(AutoOpenListener autoOpenListener) {
            this.f19046a = autoOpenListener;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppDownloadListenerV1 f19047a;

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.openalliance.ad.download.app.d.a().a(this.f19047a);
        }

        f(AppDownloadListenerV1 appDownloadListenerV1) {
            this.f19047a = appDownloadListenerV1;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppDownloadListener f19048a;

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.openalliance.ad.download.app.d.a().a(this.f19048a);
        }

        g(AppDownloadListener appDownloadListener) {
            this.f19048a = appDownloadListener;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IPPSWebEventCallback f19049a;

        @Override // java.lang.Runnable
        public void run() {
            nt.a().a(this.f19049a);
        }

        h(IPPSWebEventCallback iPPSWebEventCallback) {
            this.f19049a = iPPSWebEventCallback;
        }
    }

    private void A() {
        String str = dd.f(this.d) + File.separator + Constants.PPS_ROOT_PATH + File.separator;
        if (!dg.b(str)) {
            ai.a(str);
        }
        dk.a();
    }

    private HiAd(final Context context) {
        this.d = context.getApplicationContext();
        String str = f19006a;
        Log.i(str, "HiAd init");
        q();
        gk gkVarB = fp.b(this.d);
        this.e = gkVarB;
        boolean zBf = gkVarB.bf();
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.inter.HiAd.1
            @Override // java.lang.Runnable
            public void run() {
                if (cc.b(context)) {
                    IntentFilter intentFilter = new IntentFilter(Constants.ACTION_EXSPLASH_START_LINKED);
                    Intent intentA = as.a(HiAd.this.d, (BroadcastReceiver) null, intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
                    if (intentA != null && intentA.getAction() != null && intentA.getAction().equals(Constants.ACTION_EXSPLASH_START_LINKED)) {
                        Log.d(HiAd.f19006a, "HiAd: getIntent");
                        new com.huawei.openalliance.ad.inter.b(HiAd.this.d).onReceive(HiAd.this.d, intentA);
                    }
                    as.a(HiAd.this.d, new com.huawei.openalliance.ad.inter.b(HiAd.this.d), intentFilter, Constants.PERMISSION_PPS_DOWNLOAD, (Handler) null);
                }
                com.huawei.openalliance.ad.inter.c.a(HiAd.this.d).b();
                cy.a(HiAd.this.d);
                de.a(HiAd.this.d);
            }
        });
        this.f = fi.a(this.d);
        dm.a(new com.huawei.openalliance.ad.analysis.c(context));
        C();
        if (zBf) {
            x();
            bl.a(this.d);
            s();
            t();
            if (!WhiteListPkgList.accInitPkgList(context)) {
                o.b(new d(context));
            }
            am.c(this.d);
            dl.a(context);
            bg.b(context);
            t.a(context, 3);
        }
        if (!WhiteListPkgList.accInitPkgList(context)) {
            u();
        }
        D();
        Log.i(str, "HiAd init end");
    }
}
