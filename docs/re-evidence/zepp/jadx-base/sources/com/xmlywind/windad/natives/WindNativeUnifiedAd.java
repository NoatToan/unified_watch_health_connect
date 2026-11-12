package com.xmlywind.windad.natives;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.mta.PointEntityWindError;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdError;
import com.xmlywind.windad.WindAds;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class WindNativeUnifiedAd implements WindNativeAdRequestController.WindAdInitListener, WindNativeAdRequestController.WindAdRequestLoadLister {
    private WindNativeAdRequestController a;
    private NativeAdLoadListener b;
    private String c;
    private Handler d;
    private WindNativeAdRequest e;
    private Context f;

    public interface NativeAdLoadListener {
        void onError(WindAdError windAdError, String str);

        void onFeedAdLoad(String str);
    }

    public WindNativeUnifiedAd(Context context, WindNativeAdRequest windNativeAdRequest) {
        this.c = "";
        this.f = context;
        if (windNativeAdRequest != null && !TextUtils.isEmpty(windNativeAdRequest.getPlacementId())) {
            this.c = windNativeAdRequest.getPlacementId();
        }
        this.e = windNativeAdRequest;
        this.d = WindAds.sharedAds().getHandler();
    }

    private boolean a(WindNativeAdRequest windNativeAdRequest) {
        try {
            if (this.a == null) {
                this.a = new WindNativeAdRequestController(this.f, windNativeAdRequest, this, this);
            }
            this.a.loadAd(windNativeAdRequest);
            return true;
        } catch (Throwable th) {
            WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
            PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), th.getMessage());
            pointEntityWindErrorWindError.setAdtype(String.valueOf(5));
            pointEntityWindErrorWindError.setPlacement_id(this.c);
            pointEntityWindErrorWindError.commit();
            onVideoAdLoadFail(windAdError, windNativeAdRequest.getPlacementId());
            return false;
        }
    }

    @Override // com.xmlywind.windad.natives.WindNativeAdRequestController.WindAdInitListener
    public void adapterDidInitFailWithStrategy(ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError) {
        SigmobLog.i("adapterDidInitFailVideoAdWithStrategy() called with: strategy = [" + aDStrategy.getName() + "], error = [" + windAdAdapterError + "]");
    }

    @Override // com.xmlywind.windad.natives.WindNativeAdRequestController.WindAdInitListener
    public void adapterDidInitSuccessWithStrategy(ADStrategy aDStrategy) {
        SigmobLog.i("adapterDidInitSuccessVideoAdWithStrategy() called with: strategy = [" + aDStrategy.getName() + "]");
    }

    public void destroy() {
        WindNativeAdRequestController windNativeAdRequestController = this.a;
        if (windNativeAdRequestController != null) {
            windNativeAdRequestController.destroy();
            this.a = null;
        }
    }

    public List<NativeADData> getNativeADDataList() {
        WindNativeAdRequestController windNativeAdRequestController = this.a;
        if (windNativeAdRequestController != null) {
            return windNativeAdRequestController.getNativeADDataList();
        }
        return null;
    }

    public boolean loadAd(NativeAdLoadListener nativeAdLoadListener) {
        if (nativeAdLoadListener != null) {
            try {
                this.b = nativeAdLoadListener;
            } catch (Throwable th) {
                WindAdError windAdError = WindAdError.ERROR_SIGMOB_REQUEST;
                PointEntityWindError pointEntityWindErrorWindError = PointEntityWindError.WindError("error", windAdError.getErrorCode(), th.getMessage());
                pointEntityWindErrorWindError.setAdtype(String.valueOf(5));
                pointEntityWindErrorWindError.setPlacement_id(this.c);
                pointEntityWindErrorWindError.commit();
                onVideoAdLoadFail(windAdError, this.c);
                return false;
            }
        }
        return a(this.e);
    }

    @Override // com.xmlywind.windad.natives.WindNativeAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadFail(final WindAdError windAdError, final String str) {
        this.d.post(new Runnable() { // from class: com.xmlywind.windad.natives.WindNativeUnifiedAd.2
            @Override // java.lang.Runnable
            public void run() {
                if (WindNativeUnifiedAd.this.b != null) {
                    SigmobLog.i("onVideoAdLoadFail " + windAdError.toString() + AESEncryptionHelper.SEPARATOR + str);
                    WindNativeUnifiedAd.this.b.onError(windAdError, str);
                }
            }
        });
    }

    @Override // com.xmlywind.windad.natives.WindNativeAdRequestController.WindAdRequestLoadLister
    public void onVideoAdLoadSuccess(List<NativeADData> list, final String str) {
        this.d.post(new Runnable() { // from class: com.xmlywind.windad.natives.WindNativeUnifiedAd.1
            @Override // java.lang.Runnable
            public void run() {
                if (WindNativeUnifiedAd.this.b != null) {
                    SigmobLog.i("onVideoAdLoadSuccess |" + str);
                    WindNativeUnifiedAd.this.b.onFeedAdLoad(str);
                }
            }
        });
    }
}
