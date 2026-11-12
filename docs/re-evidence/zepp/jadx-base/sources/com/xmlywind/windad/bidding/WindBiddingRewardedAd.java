package com.xmlywind.windad.bidding;

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
import com.xmlywind.windad.WindAds;
import com.xmlywind.windad.base.WindAdRequestController;
import com.xmlywind.windad.rewardedVideo.WindRewardAdRequest;
import com.xmlywind.windad.rewardedVideo.WindRewardInfo;
import com.xmlywind.windad.rewardedVideo.WindRewardedVideoAdListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class WindBiddingRewardedAd implements WindAdRequestController.WindAdInitListener, WindAdRequestController.WindAdRequestLoadLister, WindAdRequestController.WindAdRequestShowLister {
    private WindAdRequestController a;
    public AdStatus adOutStatus = AdStatus.AdStatusNone;
    private WindAdRequestController b;
    private WindRewardedVideoAdListener c;
    private String d;
    private Handler e;
    private WindRewardAdRequest f;

    public WindBiddingRewardedAd(Activity activity, WindRewardAdRequest windRewardAdRequest) {
        this.d = "";
        if (activity != null) {
            WindAds.sharedAds().setActivity(activity);
        }
        if (windRewardAdRequest != null && !TextUtils.isEmpty(windRewardAdRequest.getPlacementId())) {
            this.d = windRewardAdRequest.getPlacementId();
        }
        this.f = windRewardAdRequest;
        this.e = WindAds.sharedAds().getHandler();
    }

    private boolean a(WindRewardAdRequest windRewardAdRequest) {
        try {
            WindAdRequestController windAdRequestController = this.a;
            if (windAdRequestController == null) {
                windAdRequestController = new WindAdRequestController(windRewardAdRequest, this, this, this);
                this.a = windAdRequestController;
            } else if (this.adOutStatus == AdStatus.AdStatusPlaying) {
                windAdRequestController = new WindAdRequestController(windRewardAdRequest, this, this, this);
                this.b = windAdRequestController;
            }
            windAdRequestController.loadAd(windRewardAdRequest);
            return true;
        } catch (Throwable th) {
            WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
            PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError.setAdtype(String.valueOf(1));
            pointEntityWindErrorWindError.setPlacement_id(this.d);
            pointEntityWindErrorWindError.commit();
            onVideoAdLoadFail(windAdError, windRewardAdRequest.getPlacementId());
            return false;
        }
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdInitListener
    public void adapterDidInitFailWithStrategy(ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        SigmobLog.i("adapterDidInitFailVideoAdWithStrategy() called with: strategy = [" + aDStrategy.getName() + "], error = [" + windAdAdapterError + "]");
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdInitListener
    public void adapterDidInitSuccessWithStrategy(ADStrategy aDStrategy) {
        SigmobLog.i("adapterDidInitSuccessVideoAdWithStrategy() called with: strategy = [" + aDStrategy.getName() + "]");
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

    public boolean loadAd(String str) {
        WindAdError windAdError;
        String str2;
        try {
            if (WindAds.sharedAds().isInit()) {
                WindRewardAdRequest windRewardAdRequest = this.f;
                if (windRewardAdRequest == null || TextUtils.isEmpty(windRewardAdRequest.getPlacementId())) {
                    windAdError = WindAdError.ERROR_SIGMOB_PLACEMNT_ID_IS_EMPTY;
                    PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "WindVideoAdRequest can't is null");
                    pointEntityWindErrorWindError.setAdtype(String.valueOf(1));
                    pointEntityWindErrorWindError.commit();
                    SigmobLog.e("PlacementId with WindAdRequest can't is null");
                    str2 = this.d;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        this.f.setBidToken(str);
                        return a(this.f);
                    }
                    windAdError = WindAdError.ERROR_SIGMOB_BID_TOKEN_IS_EMPTY;
                    PointEntityWindError pointEntityWindErrorWindError2 = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "bidToken can't is null");
                    pointEntityWindErrorWindError2.setAdtype(String.valueOf(1));
                    pointEntityWindErrorWindError2.commit();
                    SigmobLog.e("BidToken with WindAdRequest can't is null");
                    str2 = this.d;
                }
            } else {
                SigmobLog.e("WindAds not initialize");
                windAdError = WindAdError.ERROR_SIGMOB_NOT_INIT;
                PointEntityWindError pointEntityWindErrorWindError3 = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "WindAds not initialize");
                pointEntityWindErrorWindError3.setAdtype(String.valueOf(1));
                pointEntityWindErrorWindError3.setPlacement_id(this.d);
                pointEntityWindErrorWindError3.commit();
                str2 = this.d;
            }
            onVideoAdLoadFail(windAdError, str2);
        } catch (Throwable th) {
            WindAdError windAdError2 = WindAdError.ERROR_SIGMOB_REQUEST;
            PointEntityWindError pointEntityWindErrorWindError4 = PointEntityWindError.WindError("error", windAdError2.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError4.setAdtype(String.valueOf(1));
            pointEntityWindErrorWindError4.setPlacement_id(this.d);
            pointEntityWindErrorWindError4.commit();
            onVideoAdLoadFail(windAdError2, this.d);
        }
        return false;
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdClicked(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.6
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdClicked |" + str);
                    WindBiddingRewardedAd.this.c.onVideoAdClicked(str);
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
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.7
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdClosed " + windRewardInfo.toString() + AESEncryptionHelper.SEPARATOR + str);
                    WindBiddingRewardedAd.this.c.onVideoAdClosed(windRewardInfo, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadFail(final WindAdError windAdError, final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.8
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdLoadFail " + windAdError.toString() + AESEncryptionHelper.SEPARATOR + str);
                    WindBiddingRewardedAd.this.c.onVideoAdLoadError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadStart(String str) {
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadSuccess(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.1
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdLoadSuccess |" + str);
                    WindBiddingRewardedAd.this.c.onVideoAdLoadSuccess(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayComplete(String str) {
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayEnd(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.5
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayEnd |" + str);
                    WindBiddingRewardedAd.this.c.onVideoAdPlayEnd(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayError(final WindAdError windAdError, final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.9
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayError " + windAdError + AESEncryptionHelper.SEPARATOR + str);
                    WindBiddingRewardedAd.this.c.onVideoAdPlayError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestShowLister
    public void onVideoAdPlayStart(final String str) {
        this.adOutStatus = AdStatus.AdStatusPlaying;
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.4
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdPlayStart |" + str);
                    WindBiddingRewardedAd.this.c.onVideoAdPlayStart(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdPreLoadFail(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.3
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdPreLoadFail  " + str);
                    WindBiddingRewardedAd.this.c.onVideoAdPreLoadFail(str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.base.WindAdRequestController.WindAdRequestLoadLister
    public void onVideoAdPreLoadSuccess(final String str) {
        this.e.post(new Runnable() { // from class: com.xmlywind.windad.bidding.WindBiddingRewardedAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (WindBiddingRewardedAd.this.c != null) {
                    SigmobLog.i("onVideoAdPreLoadSuccess |" + str);
                    WindBiddingRewardedAd.this.c.onVideoAdPreLoadSuccess(str);
                }
            }
        });
    }

    public void setWindRewardedVideoAdListener(WindRewardedVideoAdListener windRewardedVideoAdListener) {
        this.c = windRewardedVideoAdListener;
    }

    public boolean show(Activity activity, HashMap<String, String> map) {
        WindAdError windAdError;
        String str;
        try {
            if (activity == null) {
                SigmobLog.e("activity can't is null");
                windAdError = WindAdError.ERROR_SIGMOB_AD_PLAY;
                PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "activity can't is null");
                pointEntityWindErrorWindError.setAdtype(String.valueOf(1));
                pointEntityWindErrorWindError.setPlacement_id(this.d);
                pointEntityWindErrorWindError.commit();
                str = this.d;
            } else {
                WindAds.sharedAds().setActivity(activity);
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
                    windAdError = WindAdError.ERROR_SIGMOB_NOT_READY;
                    PointEntityWindError pointEntityWindErrorWindError2 = PointEntityWindError.WindError("error", windAdError.getErrorCode(), "can't find  controller object");
                    pointEntityWindErrorWindError2.setAdtype(String.valueOf(1));
                    pointEntityWindErrorWindError2.setPlacement_id(this.d);
                    pointEntityWindErrorWindError2.commit();
                    str = this.d;
                }
            }
            onVideoAdPlayError(windAdError, str);
            return false;
        } catch (Throwable th) {
            PointEntityWindError pointEntityWindErrorWindError3 = PointEntityWindError.WindError("error", WindAdError.ERROR_SIGMOB_REQUEST.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError3.setAdtype(String.valueOf(1));
            pointEntityWindErrorWindError3.setPlacement_id(this.d);
            pointEntityWindErrorWindError3.commit();
            SigmobLog.e("show Ad ", th);
            return true;
        }
    }
}
