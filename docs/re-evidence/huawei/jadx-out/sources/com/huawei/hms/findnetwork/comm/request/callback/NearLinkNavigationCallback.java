package com.huawei.hms.findnetwork.comm.request.callback;

import com.huawei.hms.findnetwork.comm.request.bean.NearLinkNavigationResult;

/* JADX INFO: loaded from: classes33.dex */
public interface NearLinkNavigationCallback {
    void onFail(int i, String str);

    void onRangingResult(int i, NearLinkNavigationResult nearLinkNavigationResult);

    void onSuccess();
}
