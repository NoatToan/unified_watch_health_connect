package com.xmlywind.windad.Drift;

import com.xmlywind.windad.WindAdAdapterError;

/* JADX INFO: loaded from: classes22.dex */
public interface WindDriftAdListener {
    void onDriftAdClosed(String str);

    void onDriftAdError(WindAdAdapterError windAdAdapterError, String str);

    void onDriftAdExposure(String str);

    void onDriftAdLoadSuccess(String str);

    void onDriftAdViewClosed(String str);
}
