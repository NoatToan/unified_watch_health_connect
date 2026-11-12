package com.xmlywind.windad.interstitial;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.models.AdStatus;
import com.xmlywind.sdk.common.mta.PointEntityWindError;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdError;
import com.xmlywind.windad.WindAdLifecycleManager;
import com.xmlywind.windad.WindAds;
import com.xmlywind.windad.base.WindAdRequestController;
import com.xmlywind.windad.rewardedVideo.WindRewardInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class WindInterstitialAd implements WindAdRequestController.WindAdInitListener, WindAdRequestController.WindAdRequestLoadLister, WindAdRequestController.WindAdRequestShowLister {
    private WindAdRequestController a;
    public AdStatus adOutStatus = AdStatus.AdStatusNone;
    private WindAdRequestController b;
    private WindInterstitialAdListener c;
    private String d;
    private Handler e;
    private WindInterstitialAdRequest f;

    public WindInterstitialAd(Activity activity, WindInterstitialAdRequest windInterstitialAdRequest) {
        this.d = "";
        if (activity != null) {
            WindAds.sharedAds().setActivity(activity);
        }
        if (windInterstitialAdRequest != null && !TextUtils.isEmpty(windInterstitialAdRequest.getPlacementId())) {
            this.d = windInterstitialAdRequest.getPlacementId();
        }
        this.f = windInterstitialAdRequest;
        this.e = WindAds.sharedAds().getHandler();
    }

    private boolean a(WindInterstitialAdRequest windInterstitialAdRequest) {
        try {
            WindAdRequestController windAdRequestController = this.a;
            if (windAdRequestController == null) {
                windAdRequestController = new WindAdRequestController(windInterstitialAdRequest, this, this, this);
                this.a = windAdRequestController;
            } else if (this.adOutStatus == AdStatus.AdStatusPlaying) {
                windAdRequestController = new WindAdRequestController(windInterstitialAdRequest, this, this, this);
                this.b = windAdRequestController;
            }
            windAdRequestController.loadAd(windInterstitialAdRequest);
            return true;
        } catch (Throwable th) {
            WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
            PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError.setAdtype(String.valueOf(4));
            pointEntityWindErrorWindError.setPlacement_id(this.d);
            pointEntityWindErrorWindError.commit();
            SigmobLog.e("load Ad error", th);
            onVideoAdLoadFail(windAdError, windInterstitialAdRequest.getPlacementId());
            return false;
        }
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdInitListener
    public void adapterDidInitFailWithStrategy(ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        SigmobLog.i("adapterDidInitFailWithStrategy() called with: strategy = [" + aDStrategy.getName() + "], error = [" + windAdAdapterError + "]");
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdInitListener
    public void adapterDidInitSuccessWithStrategy(ADStrategy aDStrategy) {
        SigmobLog.i("adapterDidInitSuccessWithStrategy() called with: strategy = [" + aDStrategy.getName() + "]");
    }

    public void destroy() {
        WindAdRequestController windAdRequestController = this.a;
        if (windAdRequestController != null) {
            windAdRequestController.destroy();
        }
        if (this.c != null) {
            this.c = null;
        }
    }

    public boolean isReady() {
        WindAdRequestController windAdRequestController = this.a;
        if (windAdRequestController != null) {
            return windAdRequestController.isReady();
        }
        return false;
    }

    public boolean loadAd() {
        try {
            return a(this.f);
        } catch (Throwable th) {
            SigmobLog.e("load Ad error", th);
            WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
            PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError.setAdtype(String.valueOf(4));
            pointEntityWindErrorWindError.setPlacement_id(this.d);
            pointEntityWindErrorWindError.commit();
            onVideoAdLoadFail(windAdError, this.d);
            return false;
        }
    }

    public void onInterstitialAdPlayError(final WindAdError windAdError, final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.10
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onInterstitialAdPlayError " + windAdError + AESEncryptionHelper.SEPARATOR + str);
                    WindInterstitialAd.this.c.onInterstitialAdPlayError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdClicked(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.6
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdClicked |" + str);
                    WindInterstitialAd.this.c.onInterstitialAdClicked(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdClosed(final WindRewardInfo windRewardInfo, final String str) {
        this.adOutStatus = AdStatus.AdStatusClose;
        if (this.b != null) {
            WindAdRequestController windAdRequestController = this.a;
            if (windAdRequestController != null) {
                windAdRequestController.destroy();
            }
            this.a = this.b;
            this.b = null;
        }
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.7
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdClosed " + windRewardInfo.toString() + AESEncryptionHelper.SEPARATOR + str);
                    WindInterstitialAd.this.c.onInterstitialAdClosed(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadFail(final WindAdError windAdError, final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.9
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdLoadFail " + windAdError + AESEncryptionHelper.SEPARATOR + str);
                    WindInterstitialAd.this.c.onInterstitialAdLoadError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadStart(String str) {
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadSuccess(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.1
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdLoadSuccess |" + str);
                    WindInterstitialAd.this.c.onInterstitialAdLoadSuccess(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayComplete(String str) {
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayEnd(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.5
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayEnd |" + str);
                    WindInterstitialAd.this.c.onInterstitialAdPlayEnd(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayError(final WindAdError windAdError, final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.8
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayError " + windAdError + AESEncryptionHelper.SEPARATOR + str);
                    WindInterstitialAd.this.c.onInterstitialAdPlayError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayStart(final String str) {
        this.adOutStatus = AdStatus.AdStatusPlaying;
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.4
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayStart |" + str);
                    WindInterstitialAd.this.c.onInterstitialAdPlayStart(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdPreLoadFail(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdPreLoadFail  " + str);
                    WindInterstitialAd.this.c.onInterstitialAdPreLoadFail(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdPreLoadSuccess(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.interstitial.WindInterstitialAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (WindInterstitialAd.this.c != null) {
                    SigmobLog.i("onVideoAdPreLoadSuccess |" + str);
                    WindInterstitialAd.this.c.onInterstitialAdPreLoadSuccess(str);
                }
            }
        });
    }

    public void setWindInterstitialAdListener(WindInterstitialAdListener windInterstitialAdListener) {
        this.c = windInterstitialAdListener;
    }

    public boolean show(Activity activity, HashMap<String, String> map) {
        WindAdError windAdError;
        String str;
        try {
            if (activity != null) {
                WindAds.sharedAds().setActivity(activity);
                if (WindAdLifecycleManager.getInstance() == null) {
                    WindAdLifecycleManager.initialize(activity.getApplication());
                }
                if (this.adOutStatus == AdStatus.AdStatusPlaying) {
                    windAdError = WindAdError.ERROR_AD_LOAD_FAIL_PLAYING;
                    str = this.d;
                } else {
                    WindAdRequestController windAdRequestController = this.a;
                    if (windAdRequestController != null) {
                        windAdRequestController.showAd(activity, map);
                        return true;
                    }
                    SigmobLog.e("can't find  controller object");
                    WindAdError windAdError2 = WindAdError.ERROR_SIGMOB_NOT_READY;
                    PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError2.getErrorCode(), "can't find  controller object");
                    pointEntityWindErrorWindError.setAdtype(String.valueOf(4));
                    pointEntityWindErrorWindError.setPlacement_id(this.d);
                    pointEntityWindErrorWindError.commit();
                    onInterstitialAdPlayError(windAdError2, this.d);
                }
                return false;
            }
            SigmobLog.e("activity can't is null");
            windAdError = WindAdError.ERROR_SIGMOB_AD_PLAY;
            PointEntityWindError pointEntityWindErrorWindError2 = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "activity can't is null");
            pointEntityWindErrorWindError2.setAdtype(String.valueOf(4));
            pointEntityWindErrorWindError2.setPlacement_id(this.d);
            pointEntityWindErrorWindError2.commit();
            str = this.d;
            onVideoAdPlayError(windAdError, str);
            return false;
        } catch (Throwable th) {
            PointEntityWindError pointEntityWindErrorWindError3 = PointEntityWindError.WindError("error", WindAdError.ERROR_SIGMOB_REQUEST.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError3.setAdtype(String.valueOf(4));
            pointEntityWindErrorWindError3.setPlacement_id(this.d);
            pointEntityWindErrorWindError3.commit();
            SigmobLog.e("show Ad error", th);
        }
    }
}
