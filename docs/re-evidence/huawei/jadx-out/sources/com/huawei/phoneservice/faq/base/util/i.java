package com.huawei.phoneservice.faq.base.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.entity.Builder;
import com.huawei.phoneservice.faq.base.entity.FaqSdkServiceUrlResponse;
import com.huawei.phoneservice.faq.base.entity.ModuleConfigRequest;
import com.huawei.phoneservice.faq.base.entity.ModuleConfigResponse;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqRestClient;
import com.huawei.phoneservice.faq.base.network.FaqSdkAddressApi;
import com.huawei.phoneservice.faq.base.network.SdkAppInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements ISdk, Sdk, FaqHandler.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.huawei.phoneservice.faq.base.b f21591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f21592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Application f21593c;
    private WeakReference<SdkListener> d;
    private volatile com.huawei.phoneservice.faq.base.c e;
    private Map<String, String> f;
    private Map<String, String> g;
    private Map<String, String> h;
    private String i;
    private WeakReference<SdkClickListener> j;
    private List<SdkUpdateListener> k;
    private FaqBaseCallback m;

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void unregisterUpdateListener(SdkUpdateListener sdkUpdateListener) {
        if (this.k != null) {
            ((BaseSdkUpdateRequest) sdkUpdateListener).a();
            this.k.remove(sdkUpdateListener);
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void showReleaseLog(boolean z) {
        g.c(z, this.f21593c);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void setUriFromFaq(Uri uri) {
        if (uri != null) {
            try {
                if (!FaqConstants.HOST_NAME.equals(URI.create(uri.toString()).getHost())) {
                    g.a("SDK INIT SET URI", " ERROR, HOST ILLEGAL !!!");
                    return;
                }
                if (this.h == null) {
                    this.h = new Builder().build();
                }
                this.h.putAll(new Builder().setUri(uri).build());
            } catch (IllegalArgumentException unused) {
                g.a("SDK INIT SET URI", "ERROR, IllegalArgumentException !!!");
            }
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void setSdkListener(SdkListener sdkListener) {
        synchronized (this) {
            try {
                if (sdkListener != null) {
                    WeakReference<SdkListener> weakReference = this.d;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    this.d = new WeakReference<>(sdkListener);
                } else {
                    WeakReference<SdkListener> weakReference2 = this.d;
                    if (weakReference2 != null) {
                        weakReference2.clear();
                        this.d = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void setLanguage(String str) {
        n.d(this.f21593c, str);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void setClickListener(SdkClickListener sdkClickListener) {
        if (sdkClickListener != null) {
            WeakReference<SdkClickListener> weakReference = this.j;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.j = new WeakReference<>(sdkClickListener);
            return;
        }
        WeakReference<SdkClickListener> weakReference2 = this.j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.j = null;
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void setCallback(FaqBaseCallback faqBaseCallback) {
        this.m = faqBaseCallback;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public Sdk saveSdk(String str, String str2) {
        synchronized (this) {
            if (str != null) {
                String sdk = getSdk(str);
                Map<String, String> map = this.h;
                if (map != null) {
                    if (str2 != null) {
                        map.put(str, str2);
                        Map<String, String> map2 = this.f;
                        if (map2 != null) {
                            map2.put(str, str2);
                        }
                    }
                    List<SdkUpdateListener> list = this.k;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            try {
                                this.k.get(size).onSdkUpdate(str, sdk, str2);
                            } catch (IndexOutOfBoundsException unused) {
                                g.c("FaqSdk", "mSdkUpdateListeners IndexOutOfBoundsException");
                            }
                        }
                    }
                }
            }
        }
        return this;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void saveMapOnSaveInstanceState(String str) {
        String strE = n.e(this.f21593c);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.h;
        if (map == null) {
            this.h = new Builder().setJson(str).build();
            if (!TextUtils.isEmpty(strE)) {
                this.h.put("language", strE);
                n.d(this.f21593c, "");
            }
        } else {
            map.putAll(new Builder().setJson(str).build());
            if (!TextUtils.isEmpty(strE)) {
                this.h.put("language", strE);
                n.d(this.f21593c, "");
            }
            Map<String, String> map2 = this.f;
            if (map2 != null) {
                this.h.putAll(map2);
            }
        }
        this.g.putAll(this.h);
        this.f21591a = com.huawei.phoneservice.faq.base.b.INIT_SUCCESS;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public void release() {
        WeakReference<SdkListener> weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
        WeakReference<SdkClickListener> weakReference2 = this.j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.j = null;
        }
        List<SdkUpdateListener> list = this.k;
        if (list != null) {
            list.clear();
            this.k = null;
        }
        Map<String, String> map = this.h;
        if (map != null) {
            map.clear();
            this.h = null;
        }
        Handler handler = this.f21592b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f21592b = null;
        }
        this.f21591a = com.huawei.phoneservice.faq.base.b.INIT_FAIL;
        this.f21593c = null;
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void registerUpdateListener(SdkUpdateListener sdkUpdateListener) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        ((BaseSdkUpdateRequest) sdkUpdateListener).a(new b(sdkUpdateListener));
        this.k.add(sdkUpdateListener);
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public Submit queryModuleList(Context context, ModuleConfigRequest moduleConfigRequest, Callback callback) {
        return FaqSdkAddressApi.f21555c.b(context).e(moduleConfigRequest, callback);
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void onSdkInit(int i, String str) {
        SdkListener sdkListener;
        WeakReference<SdkListener> weakReference = this.d;
        if (weakReference == null || (sdkListener = weakReference.get()) == null) {
            return;
        }
        this.e = com.huawei.phoneservice.faq.base.c.INIT_DONE;
        if (i != 0 || this.f21591a.a() == 0) {
            sdkListener.onSdkInit(i, this.f21591a.a(), this.f21591a.b() + str);
            return;
        }
        sdkListener.onSdkInit(-1, this.f21591a.a(), this.f21591a.b() + str);
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void onSdkErr(String str, String str2) {
        Handler handler = this.f21592b;
        if (handler != null) {
            handler.removeMessages(0);
            Handler handler2 = this.f21592b;
            handler2.sendMessageDelayed(handler2.obtainMessage(0, new Pair(str, str2)), 1000L);
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void onClick(String str, String str2, Object obj) {
        SdkClickListener sdkClickListener;
        WeakReference<SdkClickListener> weakReference = this.j;
        if (weakReference == null || (sdkClickListener = weakReference.get()) == null) {
            return;
        }
        sdkClickListener.onClick(str, str2, obj);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public boolean initIsDone() {
        return this.e == com.huawei.phoneservice.faq.base.c.INIT_DONE;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public boolean init(Application application) {
        this.f21593c = application;
        this.f21592b = new FaqHandler(this);
        return this.f21591a != com.huawei.phoneservice.faq.base.b.INIT_FAIL;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public boolean init() {
        return this.f21591a != com.huawei.phoneservice.faq.base.b.INIT_FAIL;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public int init(Application application, String str, SdkListener sdkListener) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "ERROR, uriStr EMPTY !!!";
        } else {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                return init(application, uri, sdkListener);
            }
            str2 = "ERROR, Uri NULL !!!";
        }
        g.a("SDK INIT", str2);
        return -1;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public int init(Application application, Builder builder, SdkListener sdkListener) {
        this.f21593c = application;
        this.f21591a = init() ? com.huawei.phoneservice.faq.base.b.INIT_AGAIN : com.huawei.phoneservice.faq.base.b.INIT_FAIL;
        this.e = com.huawei.phoneservice.faq.base.c.INIT_PROGRESS;
        if (sdkListener != null) {
            WeakReference<SdkListener> weakReference = this.d;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.d = new WeakReference<>(sdkListener);
        }
        if (builder.isEmpty()) {
            this.f21591a = com.huawei.phoneservice.faq.base.b.PARAMETER_ERROR;
            onSdkInit(-1, "ERROR, parameter EMPTY !!!");
            return -1;
        }
        Map<String, String> mapBuild = builder.build();
        this.h = mapBuild;
        e(mapBuild.get("country"));
        return 0;
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public int init(Application application, Uri uri, SdkListener sdkListener) {
        if (uri == null) {
            return -1;
        }
        try {
            if (FaqConstants.HOST_NAME.equals(URI.create(uri.toString()).getHost())) {
                return init(application, new Builder().setUri(uri), sdkListener);
            }
            g.a("SDK INIT", "ERROR, HOST ILLEGAL !!!");
            return -1;
        } catch (IllegalArgumentException e2) {
            g.c("SDK INIT", e2.getMessage());
            return -1;
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public int init(Activity activity, String str) {
        return init(activity.getApplication(), str, (SdkListener) null);
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public boolean haveSdkErr(String str) {
        SdkListener sdkListener;
        WeakReference<SdkListener> weakReference = this.d;
        if (weakReference == null || this.f21592b == null || (sdkListener = weakReference.get()) == null) {
            return false;
        }
        return sdkListener.haveSdkErr(str);
    }

    @Override // com.huawei.phoneservice.faq.base.util.FaqHandler.CallBack
    public void handleMessage(int i, Message message) {
        SdkListener sdkListener;
        if (i != 0) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            WeakReference<SdkListener> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null || (sdkListener = this.d.get()) == null) {
                return;
            }
            sdkListener.onSdkErr((String) pair.first, (String) pair.second);
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public boolean hadAddress() {
        return this.f21591a.c();
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void getServiceUrl() {
        d(this.i);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public String getSdkVersion() {
        return "26.4.0.3";
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public SdkListener getSdkListener() {
        synchronized (this) {
            WeakReference<SdkListener> weakReference = this.d;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public int getSdkInitCode() {
        return this.f21591a.a();
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public String getSdk(String str) {
        if (this.h == null) {
            if (this.f21593c == null) {
                g.a("FaqSdk", "CONTENXT IS NULL");
                return null;
            }
            this.h = new Builder().setJson(n.b(this.f21593c, FaqConstants.SDK_SP_FILE_NAME, FaqConstants.SDK_SP_KEY, "")).build();
        }
        Map<String, String> map = this.h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void getModuleList() {
        a(this.i);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public String getMapOnSaveInstance() {
        this.f.clear();
        return new JSONObject(this.g).toString();
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public String getMap() {
        return new Gson().toJson(r.b(this.h));
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public FaqBaseCallback getCallback() {
        return this.m;
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public boolean clearDownloadFile(Application application) {
        if (k.b(com.huawei.phoneservice.faq.base.util.b.e(application))) {
            return false;
        }
        String strE = com.huawei.phoneservice.faq.base.util.b.e(application);
        return !TextUtils.isEmpty(strE) && d(com.huawei.phoneservice.faq.base.util.b.d(application)) && d(new File(strE));
    }

    @Override // com.huawei.phoneservice.faq.base.util.ISdk
    public void canceledSubmit(Context context) {
        FaqRestClient.initRestClientAnno(context).canceledSubmit(context);
    }

    @Override // com.huawei.phoneservice.faq.base.util.Sdk
    public int apply() {
        synchronized (this) {
            if (this.h == null || this.f21593c == null) {
                return -1;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.h);
            this.g.putAll(this.h);
            concurrentHashMap.remove("accessToken");
            concurrentHashMap.remove(FaqConstants.FAQ_REFRESH);
            concurrentHashMap.remove(FaqConstants.FAQ_LOG_SERVER_SECRET_KEY);
            n.d(this.f21593c, FaqConstants.SDK_SP_FILE_NAME, FaqConstants.SDK_SP_KEY);
            n.c(this.f21593c, FaqConstants.SDK_SP_FILE_NAME, FaqConstants.SDK_SP_KEY, new JSONObject(concurrentHashMap).toString());
            return 0;
        }
    }

    public static Sdk d() {
        return e();
    }

    public static ISdk a() {
        return e();
    }

    private void e(String str) {
        this.i = str;
        SdkAppInfo.initAppInfo(this.f21593c);
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setSerCountry(str);
        grsBaseInfo.setRegCountry(str);
        try {
            e(new GrsClient(this.f21593c, grsBaseInfo), str);
        } catch (Exception e2) {
            this.f21591a = com.huawei.phoneservice.faq.base.b.NO_GRS_ADDRESS;
            onSdkInit(-1, "can not get address from GRS " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        g.a("FaqSdk getServiceByNet", "code:" + str);
        com.huawei.phoneservice.faq.base.entity.e eVar = new com.huawei.phoneservice.faq.base.entity.e();
        eVar.c(str);
        FaqSdkAddressApi.f21555c.b(this.f21593c).d(eVar, new c(FaqSdkServiceUrlResponse.class, null, str));
    }

    private boolean d(File file) {
        boolean zDelete = true;
        if (file == null || !file.exists()) {
            g.a("FILE DELETE", "FILE IS NOT EXISTS" + file);
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            zDelete &= file2.delete();
            if (!zDelete) {
                g.a("FILE DELETE", "FILE CLEAR IS FAILED " + file2);
            }
        }
        return zDelete;
    }

    private void a(String str) {
        ModuleConfigRequest moduleConfigRequest = new ModuleConfigRequest(str, getSdk("language"), r.d(), getSdk("channel"), d().getSdk(FaqConstants.FAQ_SHASN), com.huawei.phoneservice.faq.base.util.c.j(), getSdk("appVersion"), getSdk("model"), com.huawei.phoneservice.faq.base.util.c.c());
        g.a("FaqSdk", moduleConfigRequest.toString());
        FaqSdkAddressApi.f21555c.b(this.f21593c).e(moduleConfigRequest, new d(ModuleConfigResponse.class, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FaqSdkServiceUrlResponse faqSdkServiceUrlResponse, String str) {
        boolean z;
        Iterator<FaqSdkServiceUrlResponse.ServiceUrl> it = faqSdkServiceUrlResponse.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            FaqSdkServiceUrlResponse.ServiceUrl next = it.next();
            if (str.equals(next.a())) {
                r.d(next, this.h);
                Application application = this.f21593c;
                if (application != null) {
                    com.huawei.phoneservice.faq.base.tracker.c.c(application, next.b(), true, false);
                }
                z = !TextUtils.isEmpty("Y".equals(d().getSdk(FaqConstants.FAQ_USE_OLD_DOMAIN)) ? next.c() : next.d());
                break;
            }
        }
        if ("Y".equals(d().getSdk(FaqConstants.FAQ_IS_DEEPLICK))) {
            this.f21591a = com.huawei.phoneservice.faq.base.b.INIT_SUCCESS;
            onSdkInit(0, null);
        } else {
            if (z) {
                a(str);
                return;
            }
            this.f21591a = com.huawei.phoneservice.faq.base.b.NO_ADDRESS;
            onSdkInit(-1, "no address in countryCode:" + str);
            g.a("SDK_ERROR", "no address in countryCode:");
        }
    }

    private void e(GrsClient grsClient, String str) {
        grsClient.ayncGetGrsUrls(FaqConstants.GRS_SERVICE_NAME, new e(grsClient, str));
    }

    private static i e() {
        return a.d;
    }

    class e implements IQueryUrlsCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21596a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GrsClient f21597c;

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlsCallBack
        public void onCallBackSuccess(Map<String, String> map) {
            g.a("FaqSdk", "getGrsUrls success ");
            if (map == null || map.isEmpty()) {
                g.c("FaqSdk", "urlMap is null");
                return;
            }
            String strSynGetGrsUrl = this.f21597c.synGetGrsUrl(FaqConstants.GRS_LOGSERVER_SERVICE_NAME, "ROOT");
            if (!TextUtils.isEmpty(strSynGetGrsUrl)) {
                map.put("ROOT", strSynGetGrsUrl);
            }
            r.c(map, i.this.h);
            try {
                i.this.d(this.f21596a);
            } catch (Exception e) {
                i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_ADDRESS_SERVICE;
                i.this.onSdkInit(-1, "FaqSdk getServiceByNet " + e.getMessage());
            }
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlsCallBack
        public void onCallBackFail(int i) {
            g.a("FaqSdk", "testsynGetGrsUrlsGRSIndependent method failed and the errorCode is" + i);
            g.e("FaqSdk", "IS_CONSUMER");
            i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_GRS_ADDRESS;
            i.this.onSdkInit(-1, "can not get address from GRS. errorCode" + i);
            g.a("FaqSdk", "can not get address from GRS. errorCode" + i);
        }

        e(GrsClient grsClient, String str) {
            this.f21597c = grsClient;
            this.f21596a = str;
        }
    }

    static class a {
        private static final i d = new i(null);
    }

    static class b extends TimerTask {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SdkUpdateListener f21594c;

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f21594c.onSdkUpdate("accessToken", null, null);
            g.a("FaqSdk", "GET TOKEN TIME OUT");
        }

        b(SdkUpdateListener sdkUpdateListener) {
            this.f21594c = sdkUpdateListener;
        }
    }

    class c extends FaqCallback<FaqSdkServiceUrlResponse> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21595b;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FaqSdkServiceUrlResponse faqSdkServiceUrlResponse) {
            if (th != null || faqSdkServiceUrlResponse == null) {
                i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_ADDRESS_SERVICE;
                i.this.onSdkInit(-1, "no address, network err");
                g.a("SDK_ERROR", "no address, network err");
                return;
            }
            if (!com.huawei.phoneservice.faq.base.util.d.c(faqSdkServiceUrlResponse.a())) {
                i.this.b(faqSdkServiceUrlResponse, this.f21595b);
                return;
            }
            i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_ADDRESS;
            i.this.onSdkInit(-1, "no address in countryCode data is null");
            g.a("SDK_ERROR", "no address in countryCode data is null");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class cls, Activity activity, String str) {
            super(cls, activity);
            this.f21595b = str;
        }
    }

    class d extends FaqCallback<ModuleConfigResponse> {
        /* JADX WARN: Code duplicated, block: B:18:0x006d  */
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, ModuleConfigResponse moduleConfigResponse) {
            String linkAddress;
            String openType;
            ModuleConfigUtils.cleanSdkModuleList(i.this.f21593c);
            if (th != null || moduleConfigResponse == null) {
                i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_MODULE_SERVICE;
            } else {
                i.this.f21591a = com.huawei.phoneservice.faq.base.b.INIT_SUCCESS;
                List<ModuleConfigResponse.ModuleListBean> moduleList = moduleConfigResponse.getModuleList();
                if (com.huawei.phoneservice.faq.base.util.d.c(moduleList)) {
                    i.this.f21591a = com.huawei.phoneservice.faq.base.b.NO_MODULE;
                    g.a("FaqSdk", "MODULE LIST IS NULL");
                } else {
                    ModuleConfigUtils.genSdkModuleList(i.this.f21593c, moduleList);
                    Iterator<ModuleConfigResponse.ModuleListBean> it = moduleList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ModuleConfigResponse.ModuleListBean next = it.next();
                            if ("2".equals(next.getModuleCode())) {
                                linkAddress = next.getLinkAddress();
                                openType = next.getOpenType();
                                break;
                            }
                        }
                    }
                    if (i.this.f21593c != null) {
                        n.c(i.this.f21593c, "FAQ_IPCC_FILENAME", "FAQ_IPCC_KEY", linkAddress);
                        n.c(i.this.f21593c, "FAQ_IPCC_FILENAME", "FAQ_IPCC_TYPE", openType);
                    }
                    i.this.onSdkInit(0, null);
                }
            }
            linkAddress = "";
            openType = "";
            if (i.this.f21593c != null) {
                n.c(i.this.f21593c, "FAQ_IPCC_FILENAME", "FAQ_IPCC_KEY", linkAddress);
                n.c(i.this.f21593c, "FAQ_IPCC_FILENAME", "FAQ_IPCC_TYPE", openType);
            }
            i.this.onSdkInit(0, null);
        }

        d(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    /* synthetic */ i(c cVar) {
        this();
    }

    private i() {
        this.f21591a = com.huawei.phoneservice.faq.base.b.INIT_FAIL;
        this.e = com.huawei.phoneservice.faq.base.c.INIT_PROGRESS;
        this.g = new HashMap();
        this.f = new HashMap();
    }
}
