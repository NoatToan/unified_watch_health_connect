package com.huawei.ui.homehealth.util;

import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.market.cloud.KeyDataConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.util.KeepLiveUtil;
import com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController;
import defpackage.sho;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class KeepLiveUtil {

    public interface KeepLiveCallback {
        void onResult();
    }

    public static void d(sho shoVar, final List<Integer> list, final KeepLiveCallback keepLiveCallback) {
        d(shoVar, list);
        ObserverManagerUtil.d(new Observer() { // from class: tfe
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                KeepLiveUtil.c(list, keepLiveCallback, str, objArr);
            }
        }, ObserveLabels.OPEN_SDK_CONNECT_SUCCESS);
    }

    public static /* synthetic */ void c(List list, KeepLiveCallback keepLiveCallback, String str, Object[] objArr) {
        if (!ObserveLabels.OPEN_SDK_CONNECT_SUCCESS.equals(str) || list.contains(2)) {
            return;
        }
        ReleaseLogUtil.d("R_KeepLiveUtil", "openSdk connect sucess");
        keepLiveCallback.onResult();
    }

    public static void d(sho shoVar, final List<Integer> list) {
        if (Utils.o()) {
            return;
        }
        if (shoVar == null || list == null) {
            LogUtil.j("KeepLiveUtil", "addKeepLiveTip, cardData == null || tipsList == null");
            return;
        }
        if (list.contains(2) || list.contains(106)) {
            ReleaseLogUtil.d("R_KeepLiveUtil", "addKeepLiveTip has tip");
            return;
        }
        WeakReference weakReference = new WeakReference(shoVar);
        boolean zE = KeyDataConfig.e();
        LogUtil.a("KeepLiveUtil", "isLoad: ", Boolean.valueOf(zE));
        if (zE && NpsUserShowController.getInstance(BaseApplication.getContext()).isShowNps()) {
            sho shoVar2 = (sho) weakReference.get();
            if (shoVar2 != null) {
                shoVar2.d(106);
            }
            KeyDataConfig.e(BaseApplication.getContext(), new KeyDataConfig.KeyDataConfigCallback() { // from class: tff
                @Override // com.huawei.health.market.cloud.KeyDataConfig.KeyDataConfigCallback
                public final void onResult(boolean z) {
                    KeepLiveUtil.a(list, z);
                }
            });
        }
    }

    public static /* synthetic */ void a(List list, boolean z) {
        if (z) {
            return;
        }
        list.remove((Object) 106);
    }
}
