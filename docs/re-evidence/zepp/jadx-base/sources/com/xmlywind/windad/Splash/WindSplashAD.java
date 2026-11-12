package com.xmlywind.windad.Splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.d.b;
import com.xmlywind.sdk.common.e.n;
import com.xmlywind.sdk.common.e.o;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.models.AdStatus;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityWind;
import com.xmlywind.sdk.common.utils.c;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdError;
import com.xmlywind.windad.WindAdLifecycleManager;
import com.xmlywind.windad.WindAds;
import com.xmlywind.windad.base.WindAdAdapter;
import com.xmlywind.windad.base.WindAdConnector;
import com.xmlywind.windad.common.AdapterClsUtil;
import com.xmlywind.windad.common.PointEntityWindUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes22.dex */
public final class WindSplashAD implements WindAdConnector {
    private WindSplashAdRequest a;
    private WindSplashADListener b;
    private ViewGroup j;
    private Activity k;
    private int l;
    private RelativeLayout o;
    private TextView p;
    private TextView q;
    private ImageView r;
    private int s;
    private boolean t;
    private RelativeLayout x;
    public AdStatus adStatus = AdStatus.AdStatusNone;
    private int c = 4;
    private int d = 0;
    private String e = "";
    private String m = "";
    private String n = "";
    private boolean u = false;
    private Handler v = new Handler(Looper.getMainLooper()) { // from class: com.xmlywind.windad.Splash.WindSplashAD.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            SigmobLog.e("splash load timeout");
            WindSplashAdRequest windSplashAdRequest = WindSplashAD.this.a;
            SigmobError sigmobError = SigmobError.ERROR_SIGMOB_SPLASH_TIMEOUT;
            PointEntityWindUtils.WindError("error", windSplashAdRequest, null, sigmobError.getErrorCode(), sigmobError.getMessage(), null);
            WindSplashAD windSplashAD = WindSplashAD.this;
            windSplashAD.adStatus = AdStatus.AdStatusClose;
            windSplashAD.a(WindAdError.ERROR_SIGMOB_SPLASH_TIMEOUT, windSplashAD.a.getPlacementId());
        }
    };
    private boolean w = true;
    private List<ADStrategy> g = new ArrayList();
    private Map<String, WindAdAdapterError> i = new HashMap();
    private Map<String, WindAdAdapter> f = new HashMap();
    private List<ADStrategy> h = new ArrayList();

    public WindSplashAD(Activity activity, WindSplashAdRequest windSplashAdRequest, WindSplashADListener windSplashADListener) {
        this.l = 5;
        this.t = false;
        this.k = activity;
        this.b = windSplashADListener;
        this.a = windSplashAdRequest;
        this.l = windSplashAdRequest.getFetchDelay();
        this.t = this.a.isDisableAutoHideAd();
    }

    private Drawable a(Context context) {
        return context.getApplicationInfo().loadIcon(context.getPackageManager());
    }

    private WindAdAdapter a(ADStrategy aDStrategy) {
        if (aDStrategy != null) {
            return this.f.get(aDStrategy.getADStrategyID());
        }
        return null;
    }

    private WindAdAdapter a(ADStrategy aDStrategy, String str) {
        WindAdAdapter windAdAdapterA = a(aDStrategy);
        if (windAdAdapterA != null) {
            SigmobLog.d("find already initialize Adapter: " + aDStrategy.getName());
            return windAdAdapterA;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (cls.getSuperclass() == WindAdAdapter.class) {
                WindAdAdapter windAdAdapter = (WindAdAdapter) cls.newInstance();
                windAdAdapter.initWithAdConnector(this);
                if (!windAdAdapter.isInit()) {
                    PointEntityWindUtils.WindTracking(PointCategory.PLATFORM_AGGRE_INIT, this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.4
                        @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
                        public void onAddExtra(Object obj) {
                            if (obj instanceof PointEntityWind) {
                                ((PointEntityWind) obj).setLoad_id(WindSplashAD.this.e);
                            }
                        }
                    });
                }
                aDStrategy.setPersonalizedAdvertisingOn(WindAds.sharedAds().isPersonalizedAdvertisingOn());
                windAdAdapter.initializeSdk(WindAds.sharedAds().getContext(), aDStrategy);
                Map<String, WindAdAdapter> map = this.f;
                if (map != null) {
                    map.put(aDStrategy.getADStrategyID(), windAdAdapter);
                }
                SigmobLog.i("initializeChannelAdapter: " + aDStrategy.getName() + " cls: " + str + "success");
                return windAdAdapter;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        SigmobLog.e("initializeChannelAdapter: " + aDStrategy.getName() + " cls: " + str + " failed!");
        return null;
    }

    private void a(Activity activity) {
        float f;
        SigmobLog.i("initViewGroup:" + activity.getClass().getSuperclass());
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.o = relativeLayout;
        relativeLayout.setVisibility(4);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this.o, new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout2 = new RelativeLayout(activity);
        relativeLayout2.setId(a.r());
        RelativeLayout relativeLayout3 = new RelativeLayout(activity);
        this.x = relativeLayout3;
        relativeLayout3.setId(a.r());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, relativeLayout2.getId());
        relativeLayout2.setBackgroundColor(-1);
        if (TextUtils.isEmpty(this.a.getAppDesc())) {
            this.s = 1;
            f = 60.0f;
        } else {
            f = 80.0f;
        }
        RelativeLayout relativeLayout4 = new RelativeLayout(activity);
        a(relativeLayout4, f);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        a(linearLayout, this.a.getAppTitle());
        int iC = c.c(10.0f, activity);
        if (this.s != 1) {
            a(linearLayout, this.a.getAppDesc(), iC);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = iC;
        layoutParams2.addRule(1, this.r.getId());
        layoutParams2.addRule(15, this.r.getId());
        relativeLayout4.addView(linearLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, c.b(f, activity));
        layoutParams3.addRule(13);
        relativeLayout2.addView(relativeLayout4, layoutParams3);
        this.o.addView(this.x, layoutParams);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, c.b(100.0f, this.k));
        layoutParams4.addRule(12);
        this.o.addView(relativeLayout2, layoutParams4);
    }

    private void a(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this.k);
        this.q = textView;
        textView.setText(str);
        this.q.setId(a.r());
        this.q.setGravity(17);
        this.q.setTextColor(Color.parseColor("#535353"));
        this.q.setTextSize(2, 25.0f);
        this.q.setMaxEms(10);
        this.q.setEllipsize(TextUtils.TruncateAt.END);
        this.q.setSingleLine();
        this.q.setPadding(0, 0, 0, 0);
        this.q.setIncludeFontPadding(false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.addView(this.q, layoutParams);
    }

    private void a(LinearLayout linearLayout, String str, int i) {
        TextView textView = new TextView(this.k);
        this.p = textView;
        textView.setText(str);
        this.p.setGravity(17);
        this.p.setTextColor(Color.parseColor("#aaaaaa"));
        this.p.setTextSize(2, 15.0f);
        this.p.setMaxEms(20);
        this.p.setEllipsize(TextUtils.TruncateAt.END);
        this.p.setSingleLine();
        this.q.setPadding(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i;
        layoutParams.addRule(13);
        linearLayout.addView(this.p, layoutParams);
    }

    private void a(RelativeLayout relativeLayout, float f) {
        ImageView imageView = new ImageView(this.k);
        this.r = imageView;
        imageView.setId(a.r());
        this.r.setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable drawableA = a((Context) this.k);
        if (drawableA != null) {
            this.r.setImageDrawable(drawableA);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.b(f, this.k), c.b(f, this.k));
        layoutParams.addRule(15);
        relativeLayout.addView(this.r, layoutParams);
    }

    private void a(ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        PointEntityWindUtils.WindError("error", this.a, aDStrategy, windAdAdapterError.getErrorCode(), windAdAdapterError.getMessage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindSplashAdRequest windSplashAdRequest) {
        int size = this.c <= 0 ? this.g.size() : Math.min(this.g.size(), this.c);
        SigmobLog.d(String.format(" initializeADStrategyList  length %d, size %d, mMaxConcurrent %d", Integer.valueOf(size), Integer.valueOf(this.g.size()), Integer.valueOf(this.c)));
        this.d = size;
        this.adStatus = AdStatus.AdStatusLoading;
        for (int i = 0; i < size; i++) {
            a(windSplashAdRequest, this.g.get(i));
        }
    }

    private void a(WindSplashAdRequest windSplashAdRequest, int i) {
        String string = UUID.randomUUID().toString();
        this.e = string;
        this.a.setLoadId(string);
        PointEntityWindUtils.WindInit(PointCategory.REQUEST_AGGRE_STRATEGY, this.a, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.5
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    PointEntityWind pointEntityWind = (PointEntityWind) obj;
                    pointEntityWind.setLoad_id(WindSplashAD.this.e);
                    pointEntityWind.setIs_enter_sdk("1");
                }
            }
        });
        o.a(WindAds.sharedAds().getOptions().getUseMediation(), SDKConfig.sharedInstance().getStrategyUrl(), i, windSplashAdRequest.getPlacementId(), windSplashAdRequest.getUserId(), new o.a() { // from class: com.xmlywind.windad.Splash.WindSplashAD.6
            @Override // com.xmlywind.sdk.common.e.o.a
            public void onErrorResponse(String str, int i2, int i3, String str2) {
                SigmobLog.e("onErrorResponse:" + i3 + " msg: " + str2);
                WindAdError windAdError = WindAdError.getWindAdError(i3);
                if (windAdError == null) {
                    windAdError = WindAdError.ERROR_SIGMOB_STRATEGY_EMPTY;
                    windAdError.setMessage("error_code  " + i3 + " msg: " + str2);
                }
                PointEntityWindUtils.WindError("error", WindSplashAD.this.a, null, i3, str2, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.6.2
                    @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
                    public void onAddExtra(Object obj) {
                        if (obj instanceof PointEntityWind) {
                            PointEntityWind pointEntityWind = (PointEntityWind) obj;
                            pointEntityWind.setIs_success("0");
                            pointEntityWind.setIs_out_sdk("0");
                        }
                    }
                });
                WindSplashAD windSplashAD = WindSplashAD.this;
                windSplashAD.a(windAdError, windSplashAD.a.getPlacementId());
            }

            @Override // com.xmlywind.sdk.common.e.o.a
            public void onSuccess(List<ADStrategy> list, final n nVar, String str) {
                WindSplashAD.this.g = list;
                int i2 = nVar.a;
                if (i2 > 0) {
                    WindSplashAD.this.c = i2;
                }
                WindSplashAD.this.d();
                PointEntityWindUtils.WindInit(PointCategory.RESPOND_AGGRE_STRATEGY, WindSplashAD.this.a, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.6.1
                    @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
                    public void onAddExtra(Object obj) {
                        if (obj instanceof PointEntityWind) {
                            PointEntityWind pointEntityWind = (PointEntityWind) obj;
                            n nVar2 = nVar;
                            if (nVar2.e) {
                                pointEntityWind.setAb_test(String.valueOf(nVar2.d));
                            }
                            pointEntityWind.setGroup_id(nVar.c);
                            pointEntityWind.setIs_success("1");
                            pointEntityWind.setVlist_platform(WindSplashAD.this.c());
                            pointEntityWind.setVlist_element(WindSplashAD.this.a());
                            pointEntityWind.setLoad_id(WindSplashAD.this.e);
                        }
                    }
                });
                WindSplashAD windSplashAD = WindSplashAD.this;
                windSplashAD.a(windSplashAD.a);
            }
        });
    }

    private void a(final WindSplashAdRequest windSplashAdRequest, final ADStrategy aDStrategy) {
        WindAdAdapterError windAdAdapterError;
        try {
            SigmobLog.i("adapterInitAndLoad: " + aDStrategy.getName());
            String adapterClsName = AdapterClsUtil.getAdapterClsName(aDStrategy);
            if (TextUtils.isEmpty(adapterClsName)) {
                PointEntityWindUtils.WindError("error", windSplashAdRequest, aDStrategy, WindAdError.ERROR_SIGMOB_NOT_FOUD_ADAPTER.getErrorCode(), aDStrategy.getName() + " can't get class String", null);
                windAdAdapterError = new WindAdAdapterError(0, aDStrategy.getName() + " can't get class String");
            } else {
                final WindAdAdapter windAdAdapterA = a(aDStrategy, adapterClsName);
                if (windAdAdapterA == null) {
                    WindAdError windAdError = WindAdError.ERROR_SIGMOB_NOT_FOUD_ADAPTER;
                    windAdAdapterError = new WindAdAdapterError(windAdError.getErrorCode(), windAdError.getMessage());
                } else {
                    if (windAdAdapterA.getAdapterVersion() >= SDKConfig.getRequireAdapterVersion(aDStrategy.getChannel_id())) {
                        PointEntityWindUtils.WindTracking(PointCategory.LOAD, windSplashAdRequest, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.2
                            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
                            public void onAddExtra(Object obj) {
                                if (obj instanceof PointEntityWind) {
                                    PointEntityWind pointEntityWind = (PointEntityWind) obj;
                                    pointEntityWind.setLoad_id(WindSplashAD.this.e);
                                    pointEntityWind.setLoad_type(WindSplashAD.this.w ? "0" : "1");
                                    pointEntityWind.setIs_out_sdk("1");
                                }
                            }
                        });
                        if (windSplashAdRequest.getOptions() == null) {
                            windSplashAdRequest.setOptions(new HashMap<>());
                        }
                        HashMap map = new HashMap(windSplashAdRequest.getOptions());
                        if (!TextUtils.isEmpty(windSplashAdRequest.getAppTitle())) {
                            map.put(LoadAdRequest.SPLASH_APP_TITLE, windSplashAdRequest.getAppTitle());
                        }
                        if (!TextUtils.isEmpty(windSplashAdRequest.getAppDesc())) {
                            map.put(LoadAdRequest.SPLASH_APP_DESC, windSplashAdRequest.getAppDesc());
                        }
                        if (windSplashAdRequest.isDisableAutoHideAd()) {
                            map.put(LoadAdRequest.SPLASH_DISABLE_AD_HIDE, Boolean.TRUE);
                        }
                        windSplashAdRequest.setOptions(map);
                        if (WindAdLifecycleManager.getInstance() != null) {
                            WindAdLifecycleManager.getInstance().addLifecycleListener(windAdAdapterA);
                        }
                        this.v.post(new Runnable() { // from class: com.xmlywind.windad.Splash.WindSplashAD.3
                            @Override // java.lang.Runnable
                            public void run() {
                                windAdAdapterA.loadAd(WindSplashAD.this.k, WindSplashAD.this.j, windSplashAdRequest, aDStrategy);
                            }
                        });
                        return;
                    }
                    SigmobLog.e(aDStrategy.getName() + "adapter version is error!");
                    WindAdError windAdError2 = WindAdError.ERROR_SIGMOB_AD_ADAPTER_ERROR;
                    windAdAdapterError = new WindAdAdapterError(windAdError2.getErrorCode(), aDStrategy.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + windAdError2.getMessage());
                }
            }
            adapterDidFailToLoadAd(null, aDStrategy, windAdAdapterError);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            adapterDidFailToLoadAd(null, aDStrategy, new WindAdAdapterError(0, aDStrategy.getName() + " catch throwable " + th.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final WindAdError windAdError, final String str) {
        SigmobLog.e("onSplashError: " + windAdError + " :placementId: " + str);
        if (this.u) {
            return;
        }
        this.v.removeMessages(1);
        this.v.post(new Runnable() { // from class: com.xmlywind.windad.Splash.WindSplashAD.9
            @Override // java.lang.Runnable
            public void run() {
                if (WindSplashAD.this.b != null) {
                    WindSplashAD.this.u = true;
                    WindSplashAD.this.b.onSplashAdFailToLoad(windAdError, str);
                }
            }
        });
        h();
    }

    private void b() {
        if (!TextUtils.isEmpty(this.a.getAppTitle())) {
            a(this.k);
            return;
        }
        if (this.j == null) {
            this.j = (ViewGroup) this.k.getWindow().getDecorView();
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.k);
        this.o = relativeLayout;
        relativeLayout.setVisibility(4);
        this.o.setId(a.r());
        this.j.addView(this.o, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        if (this.g.size() == 0) {
            return null;
        }
        if (TextUtils.isEmpty(this.m)) {
            d();
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i = this.c;
            List<ADStrategy> listSubList = (i == 0 || i >= this.g.size()) ? this.g : this.g.subList(0, this.c);
            sb.append("[[");
            sb2.append("[[");
            Iterator<ADStrategy> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                ADStrategy next = it2.next();
                sb.append(next.getName());
                sb2.append(next.getPlacement_id());
                if (it2.hasNext()) {
                    sb.append(",");
                    sb2.append(",");
                }
            }
            sb.append("]");
            sb2.append("]");
            if (listSubList.size() < this.g.size()) {
                for (ADStrategy aDStrategy : this.g.subList(listSubList.size(), this.g.size())) {
                    sb.append(",");
                    sb.append(aDStrategy.getName());
                    sb2.append(",");
                    sb2.append(aDStrategy.getPlacement_id());
                }
            }
            sb.append("]");
            sb2.append("]");
            this.m = sb.toString();
            this.n = sb2.toString();
            SigmobLog.d("updateViolist: " + this.m + "," + this.n);
        } catch (Exception unused) {
            this.m = "";
            this.n = "";
        }
    }

    private void e() {
        final ADStrategy readyStrategy = getReadyStrategy();
        final WindAdAdapter windAdAdapterA = a(readyStrategy);
        if (windAdAdapterA == null) {
            a(WindAdError.ERROR_SIGMOB_NOT_READY, this.a.getPlacementId());
            return;
        }
        if (!TextUtils.isEmpty(this.a.getAppTitle()) || this.j == null) {
            g();
        }
        b();
        RelativeLayout relativeLayout = this.o;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.v.post(new Runnable() { // from class: com.xmlywind.windad.Splash.WindSplashAD.7
            @Override // java.lang.Runnable
            public void run() {
                WindAdAdapter windAdAdapter;
                Activity activity;
                RelativeLayout relativeLayout2;
                if (WindSplashAD.this.x != null) {
                    windAdAdapter = windAdAdapterA;
                    activity = WindSplashAD.this.k;
                    relativeLayout2 = WindSplashAD.this.x;
                } else {
                    windAdAdapter = windAdAdapterA;
                    activity = WindSplashAD.this.k;
                    relativeLayout2 = WindSplashAD.this.o;
                }
                windAdAdapter.presentVideoAd(activity, relativeLayout2, readyStrategy);
            }
        });
        this.d = this.g.size();
        this.adStatus = AdStatus.AdStatusPlaying;
    }

    private String f() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.i.keySet()) {
            HashMap map = new HashMap();
            map.put(str, this.i.get(str).toString());
            arrayList.add(map);
        }
        return b.a(arrayList);
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            Window window = this.k.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.systemUiVisibility = 2050;
            window.setAttributes(attributes);
            window.addFlags(1024);
        }
    }

    private void h() {
        RelativeLayout relativeLayout;
        if (this.t || (relativeLayout = this.o) == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    public String a() {
        if (this.g.size() == 0) {
            return null;
        }
        if (TextUtils.isEmpty(this.n)) {
            d();
        }
        return this.n;
    }

    @Override // com.xmlywind.windad.base.WindAdBaseConnector
    public void adapterDidAdClick(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
        this.b.onSplashAdClicked();
        PointEntityWindUtils.WindTracking("click", this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.10
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    ((PointEntityWind) obj).setLoad_id(WindSplashAD.this.e);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidCloseAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy, boolean z) {
        this.b.onSplashClosed();
        PointEntityWindUtils.WindTracking("close", this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.13
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    ((PointEntityWind) obj).setLoad_id(WindSplashAD.this.e);
                }
            }
        });
        h();
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidFailToLoadAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        WindAdError windAdError;
        SigmobLog.e("adapterDidFailToLoadAd: strategy = [" + aDStrategy.getName() + "], error = [" + windAdAdapterError + "]");
        a(aDStrategy, windAdAdapterError);
        AdStatus adStatus = this.adStatus;
        if (adStatus == AdStatus.AdStatusReady || adStatus == AdStatus.AdStatusClose) {
            SigmobLog.i("splash ad has ready or closed");
            return;
        }
        this.i.put(aDStrategy.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + aDStrategy.getPlacement_id(), windAdAdapterError);
        SigmobLog.i("loadErrorADStrategy: " + this.i.size() + " backupIndex: " + this.d);
        if (this.i.size() < this.g.size()) {
            if (this.d < this.g.size()) {
                ADStrategy aDStrategy2 = this.g.get(this.d);
                this.d++;
                a(this.a, aDStrategy2);
                return;
            }
            return;
        }
        if (aDStrategy.getName().equals("sigmob") && this.g.size() == 1) {
            windAdError = WindAdError.getWindAdError(windAdAdapterError.getErrorCode());
        } else {
            windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
            windAdError.setMessage(f());
        }
        if (windAdError == null) {
            windAdError = WindAdError.RTB_SIG_DSP_NO_ADS_ERROR;
            windAdError.setMessage(f());
        }
        SigmobLog.e("adapterDidFailToLoadAd: " + windAdError);
        a(windAdError, aDStrategy.getPlacement_id());
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidFailToPlayingAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        WindAdError windAdError = WindAdError.ERROR_SIGMOB_AD_PLAY;
        String str = String.format("{error_code: %s, message: %s}", Integer.valueOf(windAdAdapterError.getErrorCode()), windAdAdapterError.getMessage());
        SigmobLog.e("adapterDidFailToPlayingAd: " + str);
        windAdError.setMessage(str);
        a(aDStrategy, windAdAdapterError);
        a(windAdError, aDStrategy.getPlacement_id());
    }

    @Override // com.xmlywind.windad.base.WindAdBaseConnector
    public void adapterDidInitFail(WindAdAdapter windAdAdapter, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
    }

    @Override // com.xmlywind.windad.base.WindAdBaseConnector
    public void adapterDidInitSuccess(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidLoadAdSuccessAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
        String str;
        SigmobLog.i("adapterDidLoadAdSuccessAd:" + aDStrategy.getName());
        PointEntityWindUtils.WindTracking("ready", this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.11
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    ((PointEntityWind) obj).setLoad_id(WindSplashAD.this.e);
                }
            }
        });
        aDStrategy.setReady();
        this.h.add(aDStrategy);
        AdStatus adStatus = this.adStatus;
        AdStatus adStatus2 = AdStatus.AdStatusReady;
        if (adStatus == adStatus2 || adStatus == AdStatus.AdStatusClose) {
            str = "has send notify videoAd load success, don't do again";
        } else {
            if (adStatus == AdStatus.AdStatusLoading) {
                this.adStatus = adStatus2;
                this.v.removeMessages(1);
                WindSplashADListener windSplashADListener = this.b;
                if (windSplashADListener != null) {
                    windSplashADListener.onSplashAdSuccessLoad();
                }
                if (this.w) {
                    e();
                    return;
                }
                return;
            }
            str = "not do videoAd load ad";
        }
        SigmobLog.i(str);
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidPlayEndAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidPreLoadFailAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidPreLoadSuccessAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidRewardAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidSkipAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
        PointEntityWindUtils.WindTracking(PointCategory.SKIP, this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.14
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    ((PointEntityWind) obj).setLoad_id(WindSplashAD.this.e);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdConnector
    public void adapterDidStartPlayingAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy) {
        this.b.onSplashAdSuccessPresent();
        final int iIndexOf = this.g.indexOf(aDStrategy) + 1;
        PointEntityWindUtils.WindTracking("start", this.a, aDStrategy, new PointEntityWindUtils.OnPointEntityExtraInfo() { // from class: com.xmlywind.windad.Splash.WindSplashAD.12
            @Override // com.xmlywind.windad.common.PointEntityWindUtils.OnPointEntityExtraInfo
            public void onAddExtra(Object obj) {
                if (obj instanceof PointEntityWind) {
                    PointEntityWind pointEntityWind = (PointEntityWind) obj;
                    pointEntityWind.setLoad_id(WindSplashAD.this.e);
                    pointEntityWind.setSub_category(String.valueOf(iIndexOf));
                }
            }
        });
    }

    public ADStrategy getReadyStrategy() {
        WindAdAdapter windAdAdapterA;
        for (ADStrategy aDStrategy : this.g) {
            if (this.h.contains(aDStrategy) && !aDStrategy.isExpired() && (windAdAdapterA = a(aDStrategy)) != null && windAdAdapterA.isReady(aDStrategy)) {
                return aDStrategy;
            }
        }
        return null;
    }

    public boolean isReady() {
        return this.adStatus == AdStatus.AdStatusReady && getReadyStrategy() != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r0 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadAdAndShow(ViewGroup viewGroup) {
        WindSplashADListener windSplashADListener;
        WindAdError windAdError;
        WindSplashADListener windSplashADListener2;
        WindAdError windAdError2;
        String placementId;
        if (this.a == null) {
            SigmobLog.e("WindAdRequest is null");
            windSplashADListener2 = this.b;
            if (windSplashADListener2 != null) {
                windAdError2 = WindAdError.ERROR_SIGMOB_REQUEST;
                placementId = null;
                windSplashADListener2.onSplashAdFailToLoad(windAdError2, placementId);
            }
            a.a(this.a.getUserId());
            this.v.sendEmptyMessageDelayed(1, this.l * 1000);
            this.g.clear();
            this.h.clear();
            this.i.clear();
            a(this.a, 2);
            return;
        }
        if (this.k == null) {
            SigmobLog.e("activity is null");
            windSplashADListener2 = this.b;
            if (windSplashADListener2 != null) {
                windAdError2 = WindAdError.ERROR_SIGMOB_REQUEST;
                placementId = this.a.getPlacementId();
            }
            a.a(this.a.getUserId());
            this.v.sendEmptyMessageDelayed(1, this.l * 1000);
            this.g.clear();
            this.h.clear();
            this.i.clear();
            a(this.a, 2);
            return;
        }
        if (!WindAds.sharedAds().isInit()) {
            SigmobLog.e("WindAds not initialize");
            windSplashADListener2 = this.b;
            if (windSplashADListener2 != null) {
                windAdError2 = WindAdError.ERROR_SIGMOB_NOT_INIT;
                placementId = this.a.getPlacementId();
            }
        } else if (a.b()) {
            if (WindAdLifecycleManager.getInstance() == null) {
                WindAdLifecycleManager.initialize(this.k.getApplication());
            }
            if (TextUtils.isEmpty(this.a.getPlacementId())) {
                SigmobLog.e("placementId with WindAdRequest is empty");
                windSplashADListener = this.b;
                if (windSplashADListener != null) {
                    windAdError = WindAdError.ERROR_SIGMOB_PLACEMNT_ID_IS_EMPTY;
                    windSplashADListener.onSplashAdFailToLoad(windAdError, this.a.getPlacementId());
                    return;
                }
            }
            if (viewGroup != null) {
                this.j = viewGroup;
            }
        } else {
            windAdError = WindAdError.ERROR_SIGMOB_GDPR_DENIED;
            SigmobLog.e(windAdError.toString());
            windSplashADListener = this.b;
        }
        a.a(this.a.getUserId());
        this.v.sendEmptyMessageDelayed(1, this.l * 1000);
        this.g.clear();
        this.h.clear();
        this.i.clear();
        a(this.a, 2);
        return;
        windSplashADListener2.onSplashAdFailToLoad(windAdError2, placementId);
    }

    public void loadAdOnly() {
        this.w = false;
        if (isReady()) {
            this.v.post(new Runnable() { // from class: com.xmlywind.windad.Splash.WindSplashAD.8
                @Override // java.lang.Runnable
                public void run() {
                    if (WindSplashAD.this.b != null) {
                        WindSplashAD.this.b.onSplashAdSuccessLoad();
                    }
                }
            });
        } else {
            loadAdAndShow(null);
        }
    }

    public void showAd(ViewGroup viewGroup) {
        if (this.w) {
            return;
        }
        if (this.adStatus != AdStatus.AdStatusReady) {
            a(WindAdError.ERROR_SIGMOB_NOT_READY, this.a.getPlacementId());
            return;
        }
        if (viewGroup != null) {
            this.j = viewGroup;
        }
        e();
    }
}
