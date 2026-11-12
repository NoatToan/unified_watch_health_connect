package defpackage;

import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import com.huawei.ui.homehealth.view.CloudReconnectFailDialog;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rme extends BaseHandler<CardDeviceFragment> {
    public rme(CardDeviceFragment cardDeviceFragment) {
        super(cardDeviceFragment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.handler.BaseHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void handleMessageWhenReferenceNotNull(CardDeviceFragment cardDeviceFragment, Message message) {
        int i = message.what;
        if (i == 34) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "handleMessageWhenReferenceNotNull battery or remainingTime or place");
            cardDeviceFragment.f.notifyDataSetChanged();
            return;
        }
        if (i == 43) {
            if (cardDeviceFragment.q != null) {
                LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "handleMessageWhenReferenceNotNull fragment.mGetDataService is: ", cardDeviceFragment.q);
                cardDeviceFragment.q.execute(new Runnable() { // from class: rmd
                    @Override // java.lang.Runnable
                    public final void run() {
                        rtk.j();
                    }
                });
                return;
            }
            return;
        }
        if (i != 46) {
            switch (i) {
                case 30:
                    LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "reconnect device timeout: ", Integer.valueOf(message.what));
                    d(cardDeviceFragment, message);
                    break;
                case 31:
                    LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "handleMessageWhenReferenceNotNull device connect time out");
                    removeMessages(31);
                    cardDeviceFragment.f.c(false);
                    cardDeviceFragment.f();
                    if (message.arg1 == 1 && rtk.i()) {
                        d(message, cardDeviceFragment);
                        break;
                    }
                    break;
                case 32:
                    a(cardDeviceFragment, message);
                    break;
                default:
                    e(message, cardDeviceFragment);
                    break;
            }
            return;
        }
        cardDeviceFragment.b(message);
    }

    private void d(Message message, final CardDeviceFragment cardDeviceFragment) {
        if (!(message.obj instanceof dxy)) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "cloudDeviceDialog message.obj instanceof DeviceInfoForWear");
            return;
        }
        final dxy dxyVar = (dxy) message.obj;
        if (message.arg2 == 1) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "cloudDeviceDialog clickFrom = 1");
            rtk.e(cardDeviceFragment.h, dxx.d().e(dxyVar.g()));
            return;
        }
        CloudReconnectFailDialog.Builder builder = new CloudReconnectFailDialog.Builder(cardDeviceFragment.h);
        builder.a(dxyVar.g(), lvi.a(dxyVar.g()).b()).b(new ReconnectCallback() { // from class: rme.2
            @Override // com.huawei.ui.homehealth.device.callback.ReconnectCallback
            public void reconnect() {
                cardDeviceFragment.d(dxyVar.d());
                cardDeviceFragment.f.c(true);
                cardDeviceFragment.f();
                cardDeviceFragment.v.a(cardDeviceFragment, dxyVar, 1);
            }
        });
        CloudReconnectFailDialog cloudReconnectFailDialogE = builder.e();
        cloudReconnectFailDialogE.setCanceledOnTouchOutside(false);
        if (cloudReconnectFailDialogE.isShowing() || cardDeviceFragment.getActivity().isFinishing()) {
            return;
        }
        cloudReconnectFailDialogE.show();
    }

    private void a(CardDeviceFragment cardDeviceFragment, Message message) {
        lyy.b().e();
        String str = (String) message.obj;
        if (!TextUtils.isEmpty(str) && str.equals(cardDeviceFragment.ar)) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "handleMessageWhenReferenceNotNull MSG_DISCONNECTED");
            removeMessages(31);
            cardDeviceFragment.f.c(false);
            cardDeviceFragment.d((String) null);
        }
        cardDeviceFragment.f();
        cardDeviceFragment.a(mgg.b());
        if (cardDeviceFragment.bd != null && (message.obj instanceof String) && cardDeviceFragment.r.equals((String) message.obj)) {
            cardDeviceFragment.bd.e();
        }
        if (rtk.i() && cardDeviceFragment.f.a() == 3) {
            cardDeviceFragment.f.c();
            rtk.e(cardDeviceFragment.h, dxx.d().e(message.arg1));
        }
    }

    private void d(CardDeviceFragment cardDeviceFragment, Message message) {
        String str = (String) message.obj;
        if (!TextUtils.isEmpty(str) && str.equals(cardDeviceFragment.ar)) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "dealWithMsgConnected enter");
            removeMessages(31);
            cardDeviceFragment.f.c(false);
            cardDeviceFragment.d((String) null);
        }
        cardDeviceFragment.f.c(false);
        cardDeviceFragment.f.c();
        cardDeviceFragment.f();
        rtk.c(cardDeviceFragment.q);
        cardDeviceFragment.a(mgg.b());
    }

    private void e(Message message, CardDeviceFragment cardDeviceFragment) {
        int i = message.what;
        if (i == 12) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "DEVICE_GET_CURRENT_INFO_LIST message");
            if (message.obj instanceof List) {
                cardDeviceFragment.aj.clear();
                cardDeviceFragment.aj.addAll((List) message.obj);
                cardDeviceFragment.u = true;
            }
            cardDeviceFragment.l();
            return;
        }
        if (i == 33) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "msg_connect_change state:", Boolean.valueOf(cardDeviceFragment.f.d()), "message: ", Integer.valueOf(message.what));
            if (!(message.obj instanceof String)) {
                LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "!(object instanceof String)");
                return;
            }
            if (!rtk.e((String) message.obj)) {
                LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "isContinueConnecting false");
                return;
            }
            cardDeviceFragment.d((String) message.obj);
            cardDeviceFragment.f.c(true);
            cardDeviceFragment.f();
            cardDeviceFragment.d(message);
            return;
        }
        if (i == 48) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "MSG_EARPHONE_PAIR_CALLBACK message");
            cardDeviceFragment.a();
            return;
        }
        if (i == 35) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "MSG_DEVICE_DELETE message: ", Integer.valueOf(message.what));
            cardDeviceFragment.f();
        } else {
            if (i == 36) {
                removeMessages(31);
                cardDeviceFragment.f.c(false);
                cardDeviceFragment.f();
                rtk.d(cardDeviceFragment.h, message.arg1);
                return;
            }
            f(message, cardDeviceFragment);
        }
    }

    private void f(Message message, CardDeviceFragment cardDeviceFragment) {
        int i = message.what;
        if (i != 37) {
            if (i == 38) {
                c(message, cardDeviceFragment);
                return;
            }
            if (i == 44) {
                cardDeviceFragment.g(cardDeviceFragment);
                return;
            } else if (i == 47) {
                a(message, cardDeviceFragment);
                return;
            } else {
                b(message, cardDeviceFragment);
                return;
            }
        }
        if (!(message.obj instanceof String)) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "handlerDeviceWatchMessage message.obj instanceof String");
            return;
        }
        String str = (String) message.obj;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "handlerDeviceWatchMessage httpUrl is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClass(cardDeviceFragment.h, WebViewActivity.class);
        intent.putExtra("url", str);
        rtk.d(cardDeviceFragment.h, intent, "WebViewActivity");
    }

    private void a(Message message, CardDeviceFragment cardDeviceFragment) {
        if (!(message.obj instanceof dxy)) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "dealOverseaWallet message.obj not instanceof DeviceInfoForWear");
            return;
        }
        dxy dxyVar = (dxy) message.obj;
        int i = message.arg1;
        boolean isSupportWalletApp = WalletAppManager.getInstance().getIsSupportWalletApp(dxyVar.d());
        boolean z = i == 1;
        if (isSupportWalletApp == z) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "dealOverseaWallet oversea wallet not change");
            return;
        }
        WalletAppManager.getInstance().setIsSupportWalletApp(dxyVar.d(), z);
        if (z) {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "dealOverseaWallet show oversea wallet");
            if (cardDeviceFragment.a(3)) {
                return;
            } else {
                cardDeviceFragment.aq.add(rtk.e(3, dxyVar));
            }
        } else {
            LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "dealOverseaWallet hide oversea wallet");
            if (!cardDeviceFragment.a(3)) {
                return;
            }
            Iterator<RecommendedItem> it = cardDeviceFragment.aq.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == 3) {
                    it.remove();
                    break;
                }
            }
        }
        rtk.d(cardDeviceFragment.aq);
        cardDeviceFragment.af = true;
        cardDeviceFragment.h();
    }

    private void c(Message message, CardDeviceFragment cardDeviceFragment) {
        if (!(message.obj instanceof dxy)) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "handlerDeviceWatchMessage message.obj instanceof DeviceInfoForWear");
            return;
        }
        cardDeviceFragment.aq.clear();
        dxy dxyVar = (dxy) message.obj;
        cardDeviceFragment.bg = message.arg1;
        DeviceCapability deviceCapabilityC = rtk.c(dxyVar.d());
        if (deviceCapabilityC == null && dxyVar.b() == 2) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "handlerDeviceWatchMessage deviceCapability is null");
            cardDeviceFragment.af = true;
            cardDeviceFragment.h();
            return;
        }
        if (cardDeviceFragment.bg == 1) {
            if (!Utils.o()) {
                cardDeviceFragment.aq.add(rtk.e(1, dxyVar));
            } else {
                cardDeviceFragment.d(dxyVar);
                if (dxyVar.b() != 2) {
                    return;
                }
            }
        }
        if (deviceCapabilityC == null) {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "deviceCapability is null");
            return;
        }
        cardDeviceFragment.b(dxyVar, deviceCapabilityC);
        rtk.d(cardDeviceFragment.aq);
        cardDeviceFragment.af = true;
        cardDeviceFragment.h();
    }

    private void b(Message message, CardDeviceFragment cardDeviceFragment) {
        int i = message.what;
        if (i == 10) {
            DeviceInfo deviceInfo = message.obj instanceof DeviceInfo ? (DeviceInfo) message.obj : null;
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                return;
            }
            cardDeviceFragment.n();
            return;
        }
        if (i == 11) {
            d(cardDeviceFragment);
            return;
        }
        if (i != 13) {
            if (i == 39) {
                cardDeviceFragment.c(message);
                return;
            } else if (i == 391) {
                cardDeviceFragment.e(message);
                return;
            } else {
                i(message, cardDeviceFragment);
                return;
            }
        }
        if (message.obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo2 = (DeviceInfo) message.obj;
            cardDeviceFragment.d(deviceInfo2.getDeviceIdentify());
            cardDeviceFragment.f.c(true);
            cardDeviceFragment.f();
            cardDeviceFragment.ac = false;
            cardDeviceFragment.y.sendMessageDelayed(rtk.c(0, deviceInfo2.getProductType()), 20000L);
        }
    }

    private void i(Message message, CardDeviceFragment cardDeviceFragment) {
        int i = message.what;
        if (i == 14) {
            if (cardDeviceFragment.v != null) {
                cardDeviceFragment.v.f(cardDeviceFragment, cardDeviceFragment.m);
            }
        } else if (i == 41) {
            cardDeviceFragment.f(message);
        } else if (i == 42) {
            cardDeviceFragment.c();
        } else {
            LogUtil.j("CardDeviceFragment CardDeviceFragmentHandler", "message default");
        }
    }

    private void d(CardDeviceFragment cardDeviceFragment) {
        LogUtil.a("CardDeviceFragment CardDeviceFragmentHandler", "updateLayout isEnableShowUpdate ", Boolean.valueOf(rtk.k()), " isCountCancelTimes ", Boolean.valueOf(rtk.f()));
        if (cardDeviceFragment.j == null || !rtk.k() || !rtk.f()) {
            if (cardDeviceFragment.y != null) {
                cardDeviceFragment.y.removeMessages(14);
                cardDeviceFragment.y.sendEmptyMessage(14);
                return;
            }
            return;
        }
        if (cardDeviceFragment.g != null && cardDeviceFragment.g.getVisibility() == 0) {
            SharedPreferenceManager.a(String.valueOf(10024), "auto_ota_tip_status", true);
        } else {
            cardDeviceFragment.j.setVisibility(0);
        }
    }
}
