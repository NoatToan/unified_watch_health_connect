package com.xmlywind.windad.base;

import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.windad.WindAdAdapterError;
import com.xmlywind.windad.base.WindAdAdapter;

/* JADX INFO: loaded from: classes22.dex */
public interface WindAdBaseConnector<T extends WindAdAdapter> {
    void adapterDidAdClick(T t, ADStrategy aDStrategy);

    void adapterDidInitFail(T t, ADStrategy aDStrategy, WindAdAdapterError windAdAdapterError);

    void adapterDidInitSuccess(T t, ADStrategy aDStrategy);
}
