package com.huawei.ui.homewear21.home.card;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi;
import defpackage.eei;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class WechatDeviceProviderHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26314b;
    private boolean d;
    private final DeviceInfo e;
    private final WeakReference<Handler> i;
    private final WechatDeviceProviderApi j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<WechatDeviceProviderApi.CheckResultListener<Boolean>, CheckResultListener> f26313a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<CheckResultListener> f26315c = new CopyOnWriteArrayList();

    public interface CheckResultListener {
        void onResult(boolean z);
    }

    public WechatDeviceProviderHelper(DeviceInfo deviceInfo, Handler handler) {
        this.e = deviceInfo;
        if (TextUtils.isEmpty(deviceInfo.getHiLinkDeviceId())) {
            eei.e(deviceInfo);
        }
        this.i = new WeakReference<>(handler);
        this.j = (WechatDeviceProviderApi) Services.b("FeatureDataOpen", WechatDeviceProviderApi.class);
        d(new CheckResultListener() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.5
            @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
            public void onResult(boolean z) {
                WechatDeviceProviderHelper.this.d = z;
                WechatDeviceProviderHelper.this.f26314b = true;
                Iterator it = WechatDeviceProviderHelper.this.f26315c.iterator();
                while (it.hasNext()) {
                    ((CheckResultListener) it.next()).onResult(z);
                }
                WechatDeviceProviderHelper.this.f26315c.clear();
                if (z) {
                    WechatDeviceProviderHelper.this.e((CheckResultListener) null);
                }
            }
        });
    }

    private void d(CheckResultListener checkResultListener) {
        WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener2 = new WechatDeviceProviderApi.CheckResultListener<Boolean>() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.3
            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(Boolean bool) {
                LogUtil.a("WechatDeviceProviderHelper", "checkSupportWechatDevice onResult:", bool);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), bool.booleanValue());
            }

            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onError(int i, String str) {
                LogUtil.a("WechatDeviceProviderHelper", "checkIsSupportWechatDevice onError: code:", Integer.valueOf(i), "msg: ", str);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), false);
            }
        };
        this.f26313a.put(checkResultListener2, checkResultListener);
        this.j.checkSupportWechatDevice(this.e, checkResultListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(CheckResultListener checkResultListener) {
        WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener2 = new WechatDeviceProviderApi.CheckResultListener<Boolean>() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.2
            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(Boolean bool) {
                LogUtil.a("WechatDeviceProviderHelper", "checkIsBindWechat onResult:", bool);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), bool.booleanValue());
            }

            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onError(int i, String str) {
                LogUtil.a("WechatDeviceProviderHelper", "checkIsBindWechat onError: code:", Integer.valueOf(i), "msg: ", str);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), true);
            }
        };
        this.f26313a.put(checkResultListener2, checkResultListener);
        this.j.isBindWechat(this.e, checkResultListener2);
    }

    private void c(CheckResultListener checkResultListener) {
        WechatDeviceProviderApi.CheckResultListener<Boolean> checkResultListener2 = new WechatDeviceProviderApi.CheckResultListener<Boolean>() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.1
            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(Boolean bool) {
                LogUtil.a("WechatDeviceProviderHelper", "checkIsBindMaxCount onResult:", bool);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), bool.booleanValue());
            }

            @Override // com.huawei.thirdpartservice.wechatdevice.WechatDeviceProviderApi.CheckResultListener
            public void onError(int i, String str) {
                LogUtil.a("WechatDeviceProviderHelper", "checkIsBindMaxCount onError: code:", Integer.valueOf(i), "msg: ", str);
                WechatDeviceProviderHelper wechatDeviceProviderHelper = WechatDeviceProviderHelper.this;
                wechatDeviceProviderHelper.d((CheckResultListener) wechatDeviceProviderHelper.f26313a.remove(this), true);
            }
        };
        this.f26313a.put(checkResultListener2, checkResultListener);
        this.j.isBindMaxCount(checkResultListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final CheckResultListener checkResultListener, final boolean z) {
        if (checkResultListener == null) {
            LogUtil.a("WechatDeviceProviderHelper", "listener is null");
            return;
        }
        if (Looper.getMainLooper().isCurrentThread()) {
            checkResultListener.onResult(z);
            return;
        }
        Handler handler = this.i.get();
        if (handler == null) {
            LogUtil.a("WechatDeviceProviderHelper", "handler is null");
            e();
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("WechatDeviceProviderHelper", "listener onResult");
                    checkResultListener.onResult(z);
                }
            });
        }
    }

    public void b(CheckResultListener checkResultListener) {
        if (this.f26314b) {
            checkResultListener.onResult(this.d);
        } else {
            this.f26315c.add(checkResultListener);
        }
    }

    public void a(final CheckResultListener checkResultListener) {
        LogUtil.a("WechatDeviceProviderHelper", "enter isNeedShowWechatTip");
        b(new CheckResultListener() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.8
            @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
            public void onResult(boolean z) {
                if (z) {
                    WechatDeviceProviderHelper.this.e(new CheckResultListener() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.8.3
                        @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
                        public void onResult(boolean z2) {
                            LogUtil.a("WechatDeviceProviderHelper", "isNeedShowWechatTip checkIsBindWechat onResult:", Boolean.valueOf(z2));
                            checkResultListener.onResult(!z2);
                        }
                    });
                } else {
                    LogUtil.a("WechatDeviceProviderHelper", "isNeedShowWechatTip checkIsBindWechat isSupportWechatDevice: false");
                    checkResultListener.onResult(false);
                }
            }
        });
    }

    public void c(final Context context) {
        if (context == null) {
            ReleaseLogUtil.e("R_WechatDeviceProviderHelper", "gotoWechat context is null");
        } else {
            e(new CheckResultListener() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.9
                @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
                public void onResult(boolean z) {
                    if (z) {
                        LogUtil.a("WechatDeviceProviderHelper", "gotoWechat jumpToWechatDeviceActivity");
                        WechatDeviceProviderHelper.this.j.jumpToWechatDeviceActivity(context);
                    } else {
                        WechatDeviceProviderHelper.this.b(context);
                    }
                }
            });
        }
    }

    public void b(final Context context) {
        if (context == null) {
            ReleaseLogUtil.e("R_WechatDeviceProviderHelper", "bindWechat context is null");
        } else {
            c(new CheckResultListener() { // from class: com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.7
                @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
                public void onResult(boolean z) {
                    if (z) {
                        LogUtil.a("WechatDeviceProviderHelper", "bindWechat jumpToWechatDeviceActivity");
                        WechatDeviceProviderHelper.this.j.jumpToWechatDeviceActivity(context);
                    } else {
                        LogUtil.a("WechatDeviceProviderHelper", "bindWechat bindWechat");
                        WechatDeviceProviderHelper.this.j.bindWechat(context, WechatDeviceProviderHelper.this.e);
                    }
                }
            });
        }
    }

    public void e() {
        this.f26313a.clear();
        this.f26315c.clear();
        this.j.destroy();
    }
}
