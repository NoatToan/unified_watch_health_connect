package com.huawei.hms.findnetwork.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.findnetwork.comm.request.bean.NavigationInfo;
import com.huawei.hms.findnetwork.comm.request.callback.FindNetworkCallback;
import com.huawei.hms.findnetwork.comm.request.result.FindNetworkResult;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;

/* JADX INFO: loaded from: classes33.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f13215a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13216b = new a();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FindNetworkCallback f13217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f13218b;

        public final void a(FindNetworkCallback findNetworkCallback, String str) {
            if (findNetworkCallback == null) {
                HmsFindSDKLog.w("UltrasoundCallbackTask", "callback is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                HmsFindSDKLog.i("UltrasoundCallbackTask", "callback.measureResult bodyStr is empty");
                return;
            }
            NavigationInfo navigationInfo = (NavigationInfo) JsonUtils.json2Object(str, NavigationInfo.class);
            if (navigationInfo == null) {
                HmsFindSDKLog.i("UltrasoundCallbackTask", "json to NavigationInfo error, measureResult is null");
                return;
            }
            FindNetworkResult findNetworkResult = new FindNetworkResult();
            findNetworkResult.setData(navigationInfo);
            findNetworkCallback.onUpdate(findNetworkResult);
            HmsFindSDKLog.i("UltrasoundCallbackTask", "callback.onUpdate() over");
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f13217a, this.f13218b);
        }

        public void a(FindNetworkCallback findNetworkCallback) {
            this.f13217a = findNetworkCallback;
        }

        public void a(String str) {
            this.f13218b = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(FindNetworkCallback findNetworkCallback, int i, String str) {
        if (findNetworkCallback != null) {
            findNetworkCallback.onFail(new FindNetworkResult(i, str, null));
        }
    }

    public void c(final FindNetworkCallback findNetworkCallback, final int i, final String str) {
        this.f13215a.post(new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.U$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(findNetworkCallback, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(FindNetworkCallback findNetworkCallback) {
        FindNetworkResult findNetworkResult = new FindNetworkResult();
        findNetworkResult.setRespCode(0);
        findNetworkResult.setData(null);
        findNetworkCallback.onSuccess(findNetworkResult);
        HmsFindSDKLog.i("UltrasoundCallbackTask", "callback.onSuccess over");
    }

    public void c(final FindNetworkCallback findNetworkCallback) {
        this.f13215a.post(new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.U$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(findNetworkCallback);
            }
        });
    }

    public void a(FindNetworkCallback findNetworkCallback, String str) {
        this.f13216b.a(findNetworkCallback);
        this.f13216b.a(str);
        this.f13215a.post(this.f13216b);
    }
}
