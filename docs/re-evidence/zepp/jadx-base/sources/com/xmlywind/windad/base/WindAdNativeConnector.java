package com.xmlywind.windad.base;

import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.base.WindAdAdapter;
import com.xmlywind.windad.natives.NativeADData;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface WindAdNativeConnector<T extends WindAdAdapter> extends WindAdBaseConnector {
    void adapterDidFailToLoadAd(T t, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError);

    void adapterDidFailToPlayingAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError);

    void adapterDidLoadNativeAdSuccessAd(T t, ADStrategy aDStrategy, List<NativeADData> list);

    void adapterDidShowLangPageAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy);

    void adapterDidStartPlayingAd(WindAdAdapter windAdAdapter, ADStrategy aDStrategy);
}
