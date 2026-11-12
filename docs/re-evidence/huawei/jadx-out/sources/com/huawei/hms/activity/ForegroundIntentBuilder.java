package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.utils.Util;

/* JADX INFO: loaded from: classes10.dex */
public class ForegroundIntentBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f12687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RequestHeader f12688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12689c;
    private ForegroundInnerHeader d;
    private String e;
    private Context f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.f12687a = activity;
        RequestHeader requestHeader = new RequestHeader();
        this.f12688b = requestHeader;
        requestHeader.setSdkVersion(61300303);
        this.f12689c = "";
        ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
        this.d = foregroundInnerHeader;
        foregroundInnerHeader.setApkVersion(30000000);
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        String appId;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f12687a, ForegroundBusDelegate.class.getName());
        Context context = this.f;
        if (context != null) {
            packageName = context.getPackageName();
            appId = Util.getAppId(this.f);
        } else {
            packageName = this.f12687a.getPackageName();
            appId = Util.getAppId(this.f12687a);
        }
        if (this.f12688b.getAppID() == null) {
            this.f12688b.setAppID(appId + "|");
        } else {
            this.f12688b.setAppID(appId + "|" + this.f12688b.getAppID());
        }
        if (TextUtils.isEmpty(this.f12688b.getTransactionId())) {
            RequestHeader requestHeader = this.f12688b;
            requestHeader.setTransactionId(TransactionIdCreater.getId(requestHeader.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.f12688b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.f12688b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.f12689c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.d.toJson());
        if (!TextUtils.isEmpty(this.e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.f12688b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i) {
        this.f12688b.setApiLevel(i);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.e = this.f12687a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i) {
        this.f12688b.setKitSdkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i) {
        this.d.setApkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.f12689c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.f12688b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.f12688b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.f12688b.setTransactionId(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.d.setResponseCallbackKey(str);
        return this;
    }
}
