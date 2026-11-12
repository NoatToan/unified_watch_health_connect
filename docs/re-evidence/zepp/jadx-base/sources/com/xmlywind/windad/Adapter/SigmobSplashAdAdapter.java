package com.xmlywind.windad.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.a;
import com.xmlywind.sdk.base.models.LoadAdRequest;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmobError;
import com.xmlywind.sdk.splash.b;
import com.xmlywind.sdk.splash.c;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.WindAdRequest;
import com.xmlywind.windad.WindAds;
import com.xmlywind.windad.base.WindAdAdapter;
import com.xmlywind.windad.base.WindAdBaseConnector;
import com.xmlywind.windad.base.WindAdConnector;

/* JADX INFO: loaded from: classes22.dex */
public class SigmobSplashAdAdapter extends WindAdAdapter implements b {
    private WindAdConnector a;
    private c b;
    private int c = 3100;
    private ADStrategy d;

    private WindAdAdapterError a(int i, String str) {
        return new WindAdAdapterError(i, str);
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public void destroy() {
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public int getAdapterVersion() {
        return this.c;
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public void initWithAdConnector(WindAdBaseConnector windAdBaseConnector) {
        this.a = (WindAdConnector) windAdBaseConnector;
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public void initializeSdk(Context context, ADStrategy aDStrategy) {
        this.d = aDStrategy;
        if (!a.a()) {
            a.a(WindAds.sharedAds().getContext());
        }
        SigmobLog.i(getClass().getName() + "initializeSdk Success");
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public boolean isInit() {
        return a.a();
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public boolean isReady(ADStrategy aDStrategy) {
        c cVar = this.b;
        if (cVar != null) {
            return cVar.b();
        }
        return false;
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public void loadAd(Activity activity, ViewGroup viewGroup, WindAdRequest windAdRequest, ADStrategy aDStrategy) {
        WindAdConnector windAdConnector;
        SigmobError sigmobErrorC;
        try {
            this.d = aDStrategy;
            if (activity != null && (sigmobErrorC = a.b().c()) != null) {
                SigmobLog.e("check loadAd error " + sigmobErrorC.toString());
                PointEntitySigmobError.SigmobError(PointCategory.LOAD, sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage()).commit();
                WindAdConnector windAdConnector2 = this.a;
                if (windAdConnector2 != null) {
                    windAdConnector2.adapterDidFailToLoadAd(this, aDStrategy, a(sigmobErrorC.getErrorCode(), sigmobErrorC.getMessage()));
                    return;
                }
                return;
            }
            Object obj = aDStrategy.getOptions().get(Constants.SHOW_DOWNLOAD_DIALOG);
            if (obj == null || !obj.equals("1")) {
                com.xmlywind.sdk.common.a.n().f(false);
            } else {
                com.xmlywind.sdk.common.a.n().f(true);
            }
            SigmobLog.i(getClass().getName() + "loadAd: " + aDStrategy.getPlacement_id());
            c cVar = new c(activity, new LoadAdRequest(aDStrategy.isUseMediation(), aDStrategy.getBidToken(), windAdRequest.getUserId(), aDStrategy.getPlacement_id(), aDStrategy.getAdType(), windAdRequest.getLoadId(), windAdRequest.getOptions()), this);
            this.b = cVar;
            if (cVar.a() || (windAdConnector = this.a) == null) {
                return;
            }
            windAdConnector.adapterDidFailToLoadAd(this, aDStrategy, a(0, "sigmob load adManager is null"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onCreate(Activity activity) {
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onDestroy(Activity activity) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.c(activity);
        }
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onPause(Activity activity) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(activity);
        }
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onResume(Activity activity) {
        c cVar = this.b;
        if (cVar != null) {
            cVar.b(activity);
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdClicked() {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidAdClick(this, this.d);
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdFailToPresent(int i, String str) {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidFailToPlayingAd(this, this.d, a(i, str));
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdLoadFail(int i, String str) {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidFailToLoadAd(this, this.d, a(i, str));
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdLoadSuccess() {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidLoadAdSuccessAd(this, this.d);
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdSkip() {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidSkipAd(this, this.d);
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashAdSuccessPresentScreen() {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidStartPlayingAd(this, this.d);
        }
    }

    @Override // com.xmlywind.sdk.splash.b
    public void onSplashClosed() {
        WindAdConnector windAdConnector = this.a;
        if (windAdConnector != null) {
            windAdConnector.adapterDidCloseAd(this, this.d, true);
        }
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onStart(Activity activity) {
    }

    @Override // com.xmlywind.windad.LifecycleListener
    public void onStop(Activity activity) {
    }

    @Override // com.xmlywind.windad.base.WindAdAdapter
    public void presentVideoAd(Activity activity, ViewGroup viewGroup, ADStrategy aDStrategy) {
        WindAdConnector windAdConnector;
        String str;
        SigmobLog.i(getClass().getName() + " show");
        c cVar = this.b;
        if (cVar == null) {
            windAdConnector = this.a;
            if (windAdConnector == null) {
                return;
            } else {
                str = "mSplashAd is null";
            }
        } else if (cVar.a(viewGroup) || (windAdConnector = this.a) == null) {
            return;
        } else {
            str = "sigmob show adManager is null";
        }
        windAdConnector.adapterDidFailToPlayingAd(this, aDStrategy, a(0, str));
    }
}
