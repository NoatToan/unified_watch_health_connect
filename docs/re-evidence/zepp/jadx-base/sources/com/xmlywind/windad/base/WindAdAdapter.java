package com.xmlywind.windad.base;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.windad.LifecycleListener;
import com.xmlywind.windad.WindAdRequest;

/* JADX INFO: loaded from: classes22.dex */
public abstract class WindAdAdapter implements LifecycleListener {
    public abstract void destroy();

    public abstract int getAdapterVersion();

    public abstract void initWithAdConnector(WindAdBaseConnector windAdBaseConnector);

    public abstract void initializeSdk(Context context, ADStrategy aDStrategy);

    public abstract boolean isInit();

    public abstract boolean isReady(ADStrategy aDStrategy);

    public abstract void loadAd(Activity activity, ViewGroup viewGroup, WindAdRequest windAdRequest, ADStrategy aDStrategy);

    public abstract void presentVideoAd(Activity activity, ViewGroup viewGroup, ADStrategy aDStrategy);
}
