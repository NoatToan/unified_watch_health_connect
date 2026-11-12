package com.huawei.pluginsocialshare.interactors;

import android.content.Context;
import com.huawei.caas.messageservice.HwCaasShareCallBack;
import com.huawei.caas.messageservice.HwCaasShareHandler;
import com.huawei.caas.messageservice.HwCaasShareManager;
import com.huawei.caas.messageservice.HwShareMsgInfo;
import com.huawei.caas.messageservice.HwShareUtils;
import com.huawei.health.socialshare.model.CaasShareCallBack;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes42.dex */
public class HwCaasShareInteractors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f22563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f22564b;
    private HwCaasShareManager d = HwCaasShareManager.getInstance();

    public HwCaasShareInteractors(Context context) {
        this.f22564b = context;
    }

    public void c(CaasShareCallBack caasShareCallBack) {
        c cVar = new c(caasShareCallBack);
        this.f22563a = cVar;
        this.d.init(this.f22564b, cVar);
    }

    public void e(int i, HwShareMsgInfo hwShareMsgInfo) {
        if (this.f22563a.b() != null) {
            this.f22563a.b().sendShareMsgInfo(i, hwShareMsgInfo);
            LogUtil.a("Share_CaaSShareInteractors", "sendShareMsgInfo");
        }
    }

    public void c() {
        HwCaasShareManager hwCaasShareManager = this.d;
        if (hwCaasShareManager != null) {
            hwCaasShareManager.release();
            this.f22564b = null;
            LogUtil.a("Share_CaaSShareInteractors", "release");
        }
    }

    static class c implements HwCaasShareCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HwCaasShareHandler f22565a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CaasShareCallBack f22566c;

        c(CaasShareCallBack caasShareCallBack) {
            this.f22566c = caasShareCallBack;
        }

        @Override // com.huawei.caas.messageservice.HwCaasShareCallBack
        public void initSuccess(HwCaasShareHandler hwCaasShareHandler) {
            if (hwCaasShareHandler == null) {
                LogUtil.e("Share_CaaSShareInteractors", "initSuccess error");
                CaasShareCallBack caasShareCallBack = this.f22566c;
                if (caasShareCallBack != null) {
                    caasShareCallBack.onInitCallback(-1);
                    return;
                }
                return;
            }
            this.f22565a = hwCaasShareHandler;
            CaasShareCallBack caasShareCallBack2 = this.f22566c;
            if (caasShareCallBack2 != null) {
                caasShareCallBack2.onInitCallback(0);
            }
            LogUtil.a("Share_CaaSShareInteractors", "initSuccess");
        }

        @Override // com.huawei.caas.messageservice.HwCaasShareCallBack
        public void initFail(int i) {
            LogUtil.e("Share_CaaSShareInteractors", "initFail retCode: ", Integer.valueOf(i));
            CaasShareCallBack caasShareCallBack = this.f22566c;
            if (caasShareCallBack != null) {
                caasShareCallBack.onInitCallback(i);
            }
        }

        @Override // com.huawei.caas.messageservice.HwCaasShareCallBack
        public void releaseSuccess() {
            LogUtil.a("Share_CaaSShareInteractors", "releaseSuccess");
            this.f22565a = null;
            this.f22566c = null;
        }

        @Override // com.huawei.caas.messageservice.HwCaasShareCallBack
        public void sendResult(HwShareUtils.SendResultEnum sendResultEnum) {
            int i = AnonymousClass2.d[sendResultEnum.ordinal()];
            if (i == 1) {
                LogUtil.a("Share_CaaSShareInteractors", "SEND_SUCCESS");
            } else if (i == 2) {
                LogUtil.j("Share_CaaSShareInteractors", "SEND_FAIL");
            } else if (i == 3) {
                LogUtil.j("Share_CaaSShareInteractors", "SEND_CANCEL");
            } else {
                LogUtil.j("Share_CaaSShareInteractors", "SEND_FAIL with unknown");
            }
            CaasShareCallBack caasShareCallBack = this.f22566c;
            if (caasShareCallBack != null) {
                caasShareCallBack.onSendCallback(sendResultEnum.ordinal());
            }
        }

        public HwCaasShareHandler b() {
            return this.f22565a;
        }
    }

    /* JADX INFO: renamed from: com.huawei.pluginsocialshare.interactors.HwCaasShareInteractors$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HwShareUtils.SendResultEnum.values().length];
            d = iArr;
            try {
                iArr[HwShareUtils.SendResultEnum.SEND_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HwShareUtils.SendResultEnum.SEND_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HwShareUtils.SendResultEnum.SEND_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
