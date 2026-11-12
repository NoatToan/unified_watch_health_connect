package com.ximalaya.ting.android.opensdk.datatrasfer;

import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes22.dex */
public interface IRequestHandler {
    String getAppSercet();

    Request getRequest() throws XimalayaException;
}
