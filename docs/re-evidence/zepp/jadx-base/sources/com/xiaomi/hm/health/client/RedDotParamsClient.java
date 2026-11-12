package com.xiaomi.hm.health.client;

import com.huami.reddot.RedDotConstant;
import com.huami.reddot.network.IRequestParams;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class RedDotParamsClient implements IRequestParams {
    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getMineParams() {
        ArrayList arrayList = new ArrayList();
        if (!Utils.shouldHideDiscovery()) {
            arrayList.add(RedDotConstant.DISCOVERY_TYPE_ICON_MEDAL);
            arrayList.add(RedDotConstant.DISCOVERY_TYPE_ICON_DATA_REPORT);
            arrayList.add(RedDotConstant.DISCOVERY_TYPE_ICON_MESSAGE_CENTER);
        }
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_PEYTO) {
            arrayList.add(RedDotConstant.CHAOHU_WATCH_SKIN);
        } else if (HMDeviceConfig.hasFeatureTempoWatchFace(boundDeviceSource)) {
            arrayList.add(RedDotConstant.TEMPO_WATCH_SKIN);
        }
        return arrayList;
    }

    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getMsgBoxParams() {
        ArrayList arrayList = new ArrayList();
        if (!Utils.shouldHideDiscovery()) {
            arrayList.add(RedDotConstant.DISCOVERY_TYPE_ICON_MESSAGE_CENTER);
        }
        return arrayList;
    }

    @Override // com.huami.reddot.network.IRequestParams
    public List<String> getWatchSkinParams() {
        ArrayList arrayList = new ArrayList();
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (boundDeviceSource == HMDeviceSource.MILI_PEYTO) {
            arrayList.add(RedDotConstant.CHAOHU_WATCH_SKIN);
        } else if (HMDeviceConfig.hasFeatureTempoWatchFace(boundDeviceSource)) {
            arrayList.add(RedDotConstant.TEMPO_WATCH_SKIN);
        }
        return arrayList;
    }
}
